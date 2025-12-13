// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.farui20240628.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("farui", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }

    public java.util.Map<String, ?> _postOSSObject(String bucketName, java.util.Map<String, ?> data, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("key", com.aliyun.teautil.Common.defaultString(runtime.key, _key)),
            new TeaPair("cert", com.aliyun.teautil.Common.defaultString(runtime.cert, _cert)),
            new TeaPair("ca", com.aliyun.teautil.Common.defaultString(runtime.ca, _ca)),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("socks5Proxy", com.aliyun.teautil.Common.defaultString(runtime.socks5Proxy, _socks5Proxy)),
            new TeaPair("socks5NetWork", com.aliyun.teautil.Common.defaultString(runtime.socks5NetWork, _socks5NetWork)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("retry", TeaConverter.buildMap(
                new TeaPair("retryable", runtime.autoretry),
                new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3))
            )),
            new TeaPair("backoff", TeaConverter.buildMap(
                new TeaPair("policy", com.aliyun.teautil.Common.defaultString(runtime.backoffPolicy, "no")),
                new TeaPair("period", com.aliyun.teautil.Common.defaultNumber(runtime.backoffPeriod, 1))
            )),
            new TeaPair("ignoreSSL", com.aliyun.teaopenapi.Client.defaultAny(runtime.ignoreSSL, false)),
            new TeaPair("tlsMinVersion", _tlsMinVersion)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                java.util.Map<String, Object> form = com.aliyun.teautil.Common.assertAsMap(data);
                String boundary = com.aliyun.fileform.Client.getBoundary();
                String host = com.aliyun.teautil.Common.assertAsString(form.get("host"));
                request_.protocol = "HTTPS";
                request_.method = "POST";
                request_.pathname = "/";
                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", host),
                    new TeaPair("date", com.aliyun.teautil.Common.getDateUTCString()),
                    new TeaPair("user-agent", com.aliyun.teautil.Common.getUserAgent(""))
                );
                request_.headers.put("content-type", "multipart/form-data; boundary=" + boundary + "");
                request_.body = com.aliyun.fileform.Client.toFileForm(form, boundary);
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

                java.util.Map<String, Object> respMap = null;
                String bodyStr = com.aliyun.teautil.Common.readAsString(response_.body);
                if (com.aliyun.teautil.Common.is4xx(response_.statusCode) || com.aliyun.teautil.Common.is5xx(response_.statusCode)) {
                    respMap = com.aliyun.teaxml.Client.parseXml(bodyStr, null);
                    java.util.Map<String, Object> err = com.aliyun.teautil.Common.assertAsMap(respMap.get("Error"));
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("code", err.get("Code")),
                        new TeaPair("message", err.get("Message")),
                        new TeaPair("data", TeaConverter.buildMap(
                            new TeaPair("httpCode", response_.statusCode),
                            new TeaPair("requestId", err.get("RequestId")),
                            new TeaPair("hostId", err.get("HostId"))
                        ))
                    ));
                }

                respMap = com.aliyun.teaxml.Client.parseXml(bodyStr, null);
                return TeaConverter.merge(Object.class,
                    respMap
                );
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }
        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    public void addRuntimeOptionsInterceptor(RuntimeOptionsInterceptor interceptor) {
        interceptorChain.addRuntimeOptionsInterceptor(interceptor);
    }

    public void addRequestInterceptor(RequestInterceptor interceptor) {
        interceptorChain.addRequestInterceptor(interceptor);
    }

    public void addResponseInterceptor(ResponseInterceptor interceptor) {
        interceptorChain.addResponseInterceptor(interceptor);
    }

    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
     * <b>summary</b> : 
     * <p>上传合同文件</p>
     * 
     * @param request CreateTextFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTextFileResponse
     */
    public CreateTextFileResponse createTextFileWithOptions(String WorkspaceId, CreateTextFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractId)) {
            body.put("ContractId", request.contractId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTime)) {
            body.put("CreateTime", request.createTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textFileName)) {
            body.put("TextFileName", request.textFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textFileUrl)) {
            body.put("TextFileUrl", request.textFileUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTextFile"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/data/textFile"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTextFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上传合同文件</p>
     * 
     * @param request CreateTextFileRequest
     * @return CreateTextFileResponse
     */
    public CreateTextFileResponse createTextFile(String WorkspaceId, CreateTextFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTextFileWithOptions(WorkspaceId, request, headers, runtime);
    }

    public CreateTextFileResponse createTextFileAdvance(String WorkspaceId, CreateTextFileAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        com.aliyun.credentials.models.CredentialModel credentialModel = null;
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "InvalidCredentials"),
                new TeaPair("message", "Please set up the credentials correctly. If you are setting them through environment variables, please ensure that ALIBABA_CLOUD_ACCESS_KEY_ID and ALIBABA_CLOUD_ACCESS_KEY_SECRET are set correctly. See https://help.aliyun.com/zh/sdk/developer-reference/configure-the-alibaba-cloud-accesskey-environment-variable-on-linux-macos-and-windows-systems for more details.")
            ));
        }

        credentialModel = _credential.getCredential();
        String accessKeyId = credentialModel.accessKeyId;
        String accessKeySecret = credentialModel.accessKeySecret;
        String securityToken = credentialModel.securityToken;
        String credentialType = credentialModel.type;
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.teaopenapi.Client authClient = new com.aliyun.teaopenapi.Client(authConfig);
        java.util.Map<String, String> authRequest = TeaConverter.buildMap(
            new TeaPair("Product", "FaRui"),
            new TeaPair("RegionId", _regionId)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest authReq = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(authRequest))
        ));
        com.aliyun.teaopenapi.models.Params authParams = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeFileUpload"),
            new TeaPair("version", "2019-12-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        java.util.Map<String, Object> authResponse = new java.util.HashMap<>();
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        java.util.Map<String, Object> ossHeader = new java.util.HashMap<>();
        java.util.Map<String, Object> tmpBody = new java.util.HashMap<>();
        Boolean useAccelerate = false;
        java.util.Map<String, String> authResponseBody = new java.util.HashMap<>();
        CreateTextFileRequest createTextFileReq = new CreateTextFileRequest();
        com.aliyun.openapiutil.Client.convert(request, createTextFileReq);
        if (!com.aliyun.teautil.Common.isUnset(request.textFileUrlObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.textFileUrlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", "" + authResponseBody.get("Bucket") + "." + com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType) + ""),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            createTextFileReq.textFileUrl = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        CreateTextFileResponse createTextFileResp = this.createTextFileWithOptions(WorkspaceId, createTextFileReq, headers, runtime);
        return createTextFileResp;
    }

    /**
     * <b>summary</b> : 
     * <p>合同抽取</p>
     * 
     * @param tmpReq RunContractExtractRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunContractExtractResponse
     */
    public RunContractExtractResponse runContractExtractWithOptions(String workspaceId, RunContractExtractRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunContractExtractShrinkRequest request = new RunContractExtractShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fieldsToExtract)) {
            request.fieldsToExtractShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fieldsToExtract, "fieldsToExtract", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldsToExtractShrink)) {
            body.put("fieldsToExtract", request.fieldsToExtractShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileOssUrl)) {
            body.put("fileOssUrl", request.fileOssUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunContractExtract"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/pop/contract/extraction"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunContractExtractResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合同抽取</p>
     * 
     * @param request RunContractExtractRequest
     * @return RunContractExtractResponse
     */
    public RunContractExtractResponse runContractExtract(String workspaceId, RunContractExtractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runContractExtractWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成合同审查结果</p>
     * 
     * @param tmpReq RunContractResultGenerationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunContractResultGenerationResponse
     */
    public RunContractResultGenerationResponse runContractResultGenerationWithOptions(String workspaceId, RunContractResultGenerationRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunContractResultGenerationShrinkRequest request = new RunContractResultGenerationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assistant)) {
            request.assistantShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assistant, "assistant", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assistantShrink)) {
            body.put("assistant", request.assistantShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunContractResultGeneration"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/farui/contract/result/genarate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunContractResultGenerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成合同审查结果</p>
     * 
     * @param request RunContractResultGenerationRequest
     * @return RunContractResultGenerationResponse
     */
    public RunContractResultGenerationResponse runContractResultGeneration(String workspaceId, RunContractResultGenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runContractResultGenerationWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成合同审查规则</p>
     * 
     * @param tmpReq RunContractRuleGenerationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunContractRuleGenerationResponse
     */
    public RunContractRuleGenerationResponse runContractRuleGenerationWithOptions(String workspaceId, RunContractRuleGenerationRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunContractRuleGenerationShrinkRequest request = new RunContractRuleGenerationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assistant)) {
            request.assistantShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assistant, "assistant", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assistantShrink)) {
            body.put("assistant", request.assistantShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunContractRuleGeneration"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/farui/contract/rule/genarate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunContractRuleGenerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成合同审查规则</p>
     * 
     * @param request RunContractRuleGenerationRequest
     * @return RunContractRuleGenerationResponse
     */
    public RunContractRuleGenerationResponse runContractRuleGeneration(String workspaceId, RunContractRuleGenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runContractRuleGenerationWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>法律咨询</p>
     * 
     * @param tmpReq RunLegalAdviceConsultationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunLegalAdviceConsultationResponse
     */
    public RunLegalAdviceConsultationResponse runLegalAdviceConsultationWithOptions(String workspaceId, RunLegalAdviceConsultationRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunLegalAdviceConsultationShrinkRequest request = new RunLegalAdviceConsultationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assistant)) {
            request.assistantShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assistant, "assistant", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "extra", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.thread)) {
            request.threadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.thread, "thread", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assistantShrink)) {
            body.put("assistant", request.assistantShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            body.put("extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threadShrink)) {
            body.put("thread", request.threadShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunLegalAdviceConsultation"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/farui/legalAdvice/consult"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunLegalAdviceConsultationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>法律咨询</p>
     * 
     * @param request RunLegalAdviceConsultationRequest
     * @return RunLegalAdviceConsultationResponse
     */
    public RunLegalAdviceConsultationResponse runLegalAdviceConsultation(String workspaceId, RunLegalAdviceConsultationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runLegalAdviceConsultationWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>案例检索</p>
     * 
     * @param tmpReq RunSearchCaseFullTextRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunSearchCaseFullTextResponse
     */
    public RunSearchCaseFullTextResponse runSearchCaseFullTextWithOptions(String workspaceId, RunSearchCaseFullTextRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunSearchCaseFullTextShrinkRequest request = new RunSearchCaseFullTextShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterCondition)) {
            request.filterConditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterCondition, "filterCondition", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pageParam)) {
            request.pageParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pageParam, "pageParam", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryKeywords)) {
            request.queryKeywordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryKeywords, "queryKeywords", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sortKeyAndDirection)) {
            request.sortKeyAndDirectionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sortKeyAndDirection, "sortKeyAndDirection", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.thread)) {
            request.threadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.thread, "thread", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterConditionShrink)) {
            body.put("filterCondition", request.filterConditionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageParamShrink)) {
            body.put("pageParam", request.pageParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryKeywordsShrink)) {
            body.put("queryKeywords", request.queryKeywordsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referLevel)) {
            body.put("referLevel", request.referLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortKeyAndDirectionShrink)) {
            body.put("sortKeyAndDirection", request.sortKeyAndDirectionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threadShrink)) {
            body.put("thread", request.threadShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunSearchCaseFullText"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/farui/search/case/fulltext"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunSearchCaseFullTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>案例检索</p>
     * 
     * @param request RunSearchCaseFullTextRequest
     * @return RunSearchCaseFullTextResponse
     */
    public RunSearchCaseFullTextResponse runSearchCaseFullText(String workspaceId, RunSearchCaseFullTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runSearchCaseFullTextWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>法规搜索</p>
     * 
     * @param tmpReq RunSearchLawQueryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunSearchLawQueryResponse
     */
    public RunSearchLawQueryResponse runSearchLawQueryWithOptions(String workspaceId, RunSearchLawQueryRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunSearchLawQueryShrinkRequest request = new RunSearchLawQueryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterCondition)) {
            request.filterConditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterCondition, "filterCondition", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pageParam)) {
            request.pageParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pageParam, "pageParam", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryKeywords)) {
            request.queryKeywordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryKeywords, "queryKeywords", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.thread)) {
            request.threadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.thread, "thread", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterConditionShrink)) {
            body.put("filterCondition", request.filterConditionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageParamShrink)) {
            body.put("pageParam", request.pageParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryKeywordsShrink)) {
            body.put("queryKeywords", request.queryKeywordsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threadShrink)) {
            body.put("thread", request.threadShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunSearchLawQuery"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/farui/search/law/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunSearchLawQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>法规搜索</p>
     * 
     * @param request RunSearchLawQueryRequest
     * @return RunSearchLawQueryResponse
     */
    public RunSearchLawQueryResponse runSearchLawQuery(String workspaceId, RunSearchLawQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runSearchLawQueryWithOptions(workspaceId, request, headers, runtime);
    }
}
