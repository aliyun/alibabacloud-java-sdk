// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.energyexpertexternal20220923.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("energyexpertexternal", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>添加AISearch项目中的结构化元素</p>
     * 
     * @param request AISearchResourceAddRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AISearchResourceAddResponse
     */
    public AISearchResourceAddResponse aISearchResourceAddWithOptions(AISearchResourceAddRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AISearchResourceAdd"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiSearch/resource/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AISearchResourceAddResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加AISearch项目中的结构化元素</p>
     * 
     * @param request AISearchResourceAddRequest
     * @return AISearchResourceAddResponse
     */
    public AISearchResourceAddResponse aISearchResourceAdd(AISearchResourceAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aISearchResourceAddWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除AISearch项目中的结构化元素</p>
     * 
     * @param request AISearchResourceDeleteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AISearchResourceDeleteResponse
     */
    public AISearchResourceDeleteResponse aISearchResourceDeleteWithOptions(AISearchResourceDeleteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AISearchResourceDelete"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiSearch/resource/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AISearchResourceDeleteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除AISearch项目中的结构化元素</p>
     * 
     * @param request AISearchResourceDeleteRequest
     * @return AISearchResourceDeleteResponse
     */
    public AISearchResourceDeleteResponse aISearchResourceDelete(AISearchResourceDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aISearchResourceDeleteWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查找AISearch资源</p>
     * 
     * @param tmpReq AISearchResourceGetListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AISearchResourceGetListResponse
     */
    public AISearchResourceGetListResponse aISearchResourceGetListWithOptions(AISearchResourceGetListRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AISearchResourceGetListShrinkRequest request = new AISearchResourceGetListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIds)) {
            request.resourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIds, "resourceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsShrink)) {
            query.put("resourceIds", request.resourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AISearchResourceGetList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiSearch/resource/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AISearchResourceGetListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查找AISearch资源</p>
     * 
     * @param request AISearchResourceGetListRequest
     * @return AISearchResourceGetListResponse
     */
    public AISearchResourceGetListResponse aISearchResourceGetList(AISearchResourceGetListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aISearchResourceGetListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改AISearch项目中的结构化元素</p>
     * 
     * @param request AISearchResourceUpdateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AISearchResourceUpdateResponse
     */
    public AISearchResourceUpdateResponse aISearchResourceUpdateWithOptions(AISearchResourceUpdateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AISearchResourceUpdate"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiSearch/resource/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AISearchResourceUpdateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改AISearch项目中的结构化元素</p>
     * 
     * @param request AISearchResourceUpdateRequest
     * @return AISearchResourceUpdateResponse
     */
    public AISearchResourceUpdateResponse aISearchResourceUpdate(AISearchResourceUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aISearchResourceUpdateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>aisearch问答接口</p>
     * 
     * @param request AISearchStreamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AISearchStreamResponse
     */
    public AISearchStreamResponse aISearchStreamWithOptions(AISearchStreamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            body.put("message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.question)) {
            body.put("question", request.question);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypeNeeded)) {
            body.put("resourceTypeNeeded", request.resourceTypeNeeded);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AISearchStream"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiSearch/searchStream"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AISearchStreamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>aisearch问答接口</p>
     * 
     * @param request AISearchStreamRequest
     * @return AISearchStreamResponse
     */
    public AISearchStreamResponse aISearchStream(AISearchStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aISearchStreamWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建文件夹</p>
     * 
     * @param request AddFolderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFolderResponse
     */
    public AddFolderResponse addFolderWithOptions(AddFolderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderName)) {
            body.put("folderName", request.folderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFolderId)) {
            body.put("parentFolderId", request.parentFolderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFolder"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aidoc/folder/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFolderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建文件夹</p>
     * 
     * @param request AddFolderRequest
     * @return AddFolderResponse
     */
    public AddFolderResponse addFolder(AddFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addFolderWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You need to upload a document URL to obtain the real-time parsing result of the Qwen VL model.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the real-time parsing result of the Qwen VL model.</p>
     * 
     * @param request AnalyzeVlRealtimeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AnalyzeVlRealtimeResponse
     */
    public AnalyzeVlRealtimeResponse analyzeVlRealtimeWithOptions(AnalyzeVlRealtimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AnalyzeVlRealtime"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aidoc/document/analyzeVlRealtime"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AnalyzeVlRealtimeResponse());
    }

    /**
     * <b>description</b> :
     * <p>You need to upload a document URL to obtain the real-time parsing result of the Qwen VL model.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the real-time parsing result of the Qwen VL model.</p>
     * 
     * @param request AnalyzeVlRealtimeRequest
     * @return AnalyzeVlRealtimeResponse
     */
    public AnalyzeVlRealtimeResponse analyzeVlRealtime(AnalyzeVlRealtimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.analyzeVlRealtimeWithOptions(request, headers, runtime);
    }

    public AnalyzeVlRealtimeResponse analyzeVlRealtimeAdvance(AnalyzeVlRealtimeAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "energyExpertExternal"),
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
        AnalyzeVlRealtimeRequest analyzeVlRealtimeReq = new AnalyzeVlRealtimeRequest();
        com.aliyun.openapiutil.Client.convert(request, analyzeVlRealtimeReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrlObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.fileUrlObject),
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
            analyzeVlRealtimeReq.fileUrl = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        AnalyzeVlRealtimeResponse analyzeVlRealtimeResp = this.analyzeVlRealtimeWithOptions(analyzeVlRealtimeReq, headers, runtime);
        return analyzeVlRealtimeResp;
    }

    /**
     * <b>summary</b> : 
     * <p>策略执行状态反馈</p>
     * 
     * @param request BatchSaveInstructionStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchSaveInstructionStatusResponse
     */
    public BatchSaveInstructionStatusResponse batchSaveInstructionStatusWithOptions(BatchSaveInstructionStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            body.put("factoryId", request.factoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pKey)) {
            body.put("pKey", request.pKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            body.put("statusList", request.statusList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSaveInstructionStatus"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/hvac/batchSaveInstructionStatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSaveInstructionStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>策略执行状态反馈</p>
     * 
     * @param request BatchSaveInstructionStatusRequest
     * @return BatchSaveInstructionStatusResponse
     */
    public BatchSaveInstructionStatusResponse batchSaveInstructionStatus(BatchSaveInstructionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchSaveInstructionStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量设置空调站点运行计划</p>
     * 
     * @param request BatchUpdateSystemRunningPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUpdateSystemRunningPlanResponse
     */
    public BatchUpdateSystemRunningPlanResponse batchUpdateSystemRunningPlanWithOptions(BatchUpdateSystemRunningPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.controlType)) {
            body.put("controlType", request.controlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateType)) {
            body.put("dateType", request.dateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.earliestStartupTime)) {
            body.put("earliestStartupTime", request.earliestStartupTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            body.put("factoryId", request.factoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latestShutdownTime)) {
            body.put("latestShutdownTime", request.latestShutdownTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCarbonDioxide)) {
            body.put("maxCarbonDioxide", request.maxCarbonDioxide);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxTem)) {
            body.put("maxTem", request.maxTem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minTem)) {
            body.put("minTem", request.minTem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seasonMode)) {
            body.put("seasonMode", request.seasonMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemId)) {
            body.put("systemId", request.systemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingEndTime)) {
            body.put("workingEndTime", request.workingEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingStartTime)) {
            body.put("workingStartTime", request.workingStartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateSystemRunningPlan"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/hvac/batchUpdateSystemRunningPlan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateSystemRunningPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量设置空调站点运行计划</p>
     * 
     * @param request BatchUpdateSystemRunningPlanRequest
     * @return BatchUpdateSystemRunningPlanResponse
     */
    public BatchUpdateSystemRunningPlanResponse batchUpdateSystemRunningPlan(BatchUpdateSystemRunningPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchUpdateSystemRunningPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The interface provides Q&amp;A services within the scope of the selected directory in the session.</li>
     * <li>The sessionId information is obtained through GetChatSessionList.</li>
     * <li>You can also create a new session via the CreateChatSession interface.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Knowledge Base Q\&amp;A</p>
     * 
     * @param request ChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatResponse
     */
    public ChatResponse chatWithOptions(ChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentIds)) {
            body.put("documentIds", request.documentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.question)) {
            body.put("question", request.question);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Chat"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/chat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The interface provides Q&amp;A services within the scope of the selected directory in the session.</li>
     * <li>The sessionId information is obtained through GetChatSessionList.</li>
     * <li>You can also create a new session via the CreateChatSession interface.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Knowledge Base Q\&amp;A</p>
     * 
     * @param request ChatRequest
     * @return ChatResponse
     */
    public ChatResponse chat(ChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.chatWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The interface provides Q&amp;A services within the scope of the selected directory in the session.</li>
     * <li>The sessionId information is obtained through GetChatSessionList.</li>
     * <li>You can also create a new session via the CreateChatSession interface.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Knowledge Base Q\&amp;A</p>
     * 
     * @param request ChatStreamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatStreamResponse
     */
    public ChatStreamResponse chatStreamWithOptions(ChatStreamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentIds)) {
            body.put("documentIds", request.documentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.question)) {
            body.put("question", request.question);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatStream"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/chat/stream"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatStreamResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The interface provides Q&amp;A services within the scope of the selected directory in the session.</li>
     * <li>The sessionId information is obtained through GetChatSessionList.</li>
     * <li>You can also create a new session via the CreateChatSession interface.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Knowledge Base Q\&amp;A</p>
     * 
     * @param request ChatStreamRequest
     * @return ChatStreamResponse
     */
    public ChatStreamResponse chatStream(ChatStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.chatStreamWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Q\&amp;A Window</p>
     * 
     * @param request CreateChatSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChatSessionResponse
     */
    public CreateChatSessionResponse createChatSessionWithOptions(CreateChatSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChatSession"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/chat/session/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChatSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Q\&amp;A Window</p>
     * 
     * @param request CreateChatSessionRequest
     * @return CreateChatSessionResponse
     */
    public CreateChatSessionResponse createChatSession(CreateChatSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChatSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除解析过的文件</p>
     * 
     * @param request DeleteDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDocumentResponse
     */
    public DeleteDocumentResponse deleteDocumentWithOptions(DeleteDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDocument"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aidoc/document/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除解析过的文件</p>
     * 
     * @param request DeleteDocumentRequest
     * @return DeleteDocumentResponse
     */
    public DeleteDocumentResponse deleteDocument(DeleteDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDocumentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除文件夹</p>
     * 
     * @param request DeleteFolderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFolderResponse
     */
    public DeleteFolderResponse deleteFolderWithOptions(DeleteFolderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("folderId", request.folderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFolder"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aidoc/folder/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFolderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除文件夹</p>
     * 
     * @param request DeleteFolderRequest
     * @return DeleteFolderResponse
     */
    public DeleteFolderResponse deleteFolder(DeleteFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFolderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档detail</p>
     * 
     * @param request DetailDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetailDocumentResponse
     */
    public DetailDocumentResponse detailDocumentWithOptions(DetailDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetailDocument"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aidoc/document/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetailDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档detail</p>
     * 
     * @param request DetailDocumentRequest
     * @return DetailDocumentResponse
     */
    public DetailDocumentResponse detailDocument(DetailDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailDocumentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑禁用设备</p>
     * 
     * @param request EditProhibitedDevicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditProhibitedDevicesResponse
     */
    public EditProhibitedDevicesResponse editProhibitedDevicesWithOptions(EditProhibitedDevicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            body.put("factoryId", request.factoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hvacDeviceConfigVOList)) {
            body.put("hvacDeviceConfigVOList", request.hvacDeviceConfigVOList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemId)) {
            body.put("systemId", request.systemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditProhibitedDevices"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/hvac/editProhibitedDevices"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditProhibitedDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑禁用设备</p>
     * 
     * @param request EditProhibitedDevicesRequest
     * @return EditProhibitedDevicesResponse
     */
    public EditProhibitedDevicesResponse editProhibitedDevices(EditProhibitedDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.editProhibitedDevicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑不利区设备</p>
     * 
     * @param request EditUnfavorableAreaDevicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditUnfavorableAreaDevicesResponse
     */
    public EditUnfavorableAreaDevicesResponse editUnfavorableAreaDevicesWithOptions(EditUnfavorableAreaDevicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            body.put("factoryId", request.factoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hvacDeviceConfigVOList)) {
            body.put("hvacDeviceConfigVOList", request.hvacDeviceConfigVOList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemId)) {
            body.put("systemId", request.systemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditUnfavorableAreaDevices"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/hvac/editUnfavorableAreaDevices"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditUnfavorableAreaDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑不利区设备</p>
     * 
     * @param request EditUnfavorableAreaDevicesRequest
     * @return EditUnfavorableAreaDevicesResponse
     */
    public EditUnfavorableAreaDevicesResponse editUnfavorableAreaDevices(EditUnfavorableAreaDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.editUnfavorableAreaDevicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Given a product ID, this API initiates a task to calculate the carbon footprint result for the corresponding product. The task\&quot;s status can be checked using the <code>IsCompleted</code> API. Following the generation of results, other result inquiry APIs can be accessed for display content.</p>
     * 
     * <b>summary</b> : 
     * <p>Generate a report of the specified carbon footprint.</p>
     * 
     * @param request GenerateResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateResultResponse
     */
    public GenerateResultResponse generateResultWithOptions(GenerateResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateResult"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/generate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Given a product ID, this API initiates a task to calculate the carbon footprint result for the corresponding product. The task\&quot;s status can be checked using the <code>IsCompleted</code> API. Following the generation of results, other result inquiry APIs can be accessed for display content.</p>
     * 
     * <b>summary</b> : 
     * <p>Generate a report of the specified carbon footprint.</p>
     * 
     * @param request GenerateResultRequest
     * @return GenerateResultResponse
     */
    public GenerateResultResponse generateResult(GenerateResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain electrical constitute analysis data.</p>
     * 
     * @param request GetAreaElecConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAreaElecConstituteResponse
     */
    public GetAreaElecConstituteResponse getAreaElecConstituteWithOptions(GetAreaElecConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAreaElecConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/elec/area"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAreaElecConstituteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain electrical constitute analysis data.</p>
     * 
     * @param request GetAreaElecConstituteRequest
     * @return GetAreaElecConstituteResponse
     */
    public GetAreaElecConstituteResponse getAreaElecConstitute(GetAreaElecConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAreaElecConstituteWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get trends in carbon emissions.</p>
     * 
     * @param request GetCarbonEmissionTrendRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCarbonEmissionTrendResponse
     */
    public GetCarbonEmissionTrendResponse getCarbonEmissionTrendWithOptions(GetCarbonEmissionTrendRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            body.put("moduleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            body.put("moduleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trendType)) {
            body.put("trendType", request.trendType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yearList)) {
            body.put("yearList", request.yearList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCarbonEmissionTrend"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/trend"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCarbonEmissionTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get trends in carbon emissions.</p>
     * 
     * @param request GetCarbonEmissionTrendRequest
     * @return GetCarbonEmissionTrendResponse
     */
    public GetCarbonEmissionTrendResponse getCarbonEmissionTrend(GetCarbonEmissionTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCarbonEmissionTrendWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Q\&amp;A folder List</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatFolderListResponse
     */
    public GetChatFolderListResponse getChatFolderListWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatFolderList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/chat/folder/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatFolderListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Q\&amp;A folder List</p>
     * @return GetChatFolderListResponse
     */
    public GetChatFolderListResponse getChatFolderList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getChatFolderListWithOptions(headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API retrieves the list of historical documents within a session by passing in the session ID.</li>
     * <li>The sessionId information is obtained through GetChatSessionList.</li>
     * <li>A new session can also be created using the CreateChatSession interface.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the historical documents of a session</p>
     * 
     * @param request GetChatListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatListResponse
     */
    public GetChatListResponse getChatListWithOptions(GetChatListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/chat/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API retrieves the list of historical documents within a session by passing in the session ID.</li>
     * <li>The sessionId information is obtained through GetChatSessionList.</li>
     * <li>A new session can also be created using the CreateChatSession interface.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the historical documents of a session</p>
     * 
     * @param request GetChatListRequest
     * @return GetChatListResponse
     */
    public GetChatListResponse getChatList(GetChatListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getChatListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Q\&amp;A Session List</p>
     * 
     * @param request GetChatSessionListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatSessionListResponse
     */
    public GetChatSessionListResponse getChatSessionListWithOptions(GetChatSessionListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatSessionList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/chat/session/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatSessionListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Q\&amp;A Session List</p>
     * 
     * @param request GetChatSessionListRequest
     * @return GetChatSessionListResponse
     */
    public GetChatSessionListResponse getChatSessionList(GetChatSessionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getChatSessionListWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>obtain data item detail list under the current enterprise.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This interface is used to obtain the details category of a data item.</p>
     * 
     * @param request GetDataItemListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataItemListResponse
     */
    public GetDataItemListResponse getDataItemListWithOptions(GetDataItemListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataItemList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/data/item/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataItemListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>obtain data item detail list under the current enterprise.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This interface is used to obtain the details category of a data item.</p>
     * 
     * @param request GetDataItemListRequest
     * @return GetDataItemListResponse
     */
    public GetDataItemListResponse getDataItemList(GetDataItemListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataItemListWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API returns the data quality evaluation results based on the user-provided product ID. It\&quot;s useful for understanding the data quality of the carbon emission factors for each inventory of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the data quality evaluation results DQR and DQI.</p>
     * 
     * @param request GetDataQualityAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataQualityAnalysisResponse
     */
    public GetDataQualityAnalysisResponse getDataQualityAnalysisWithOptions(GetDataQualityAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityEvaluationType)) {
            body.put("dataQualityEvaluationType", request.dataQualityEvaluationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataQualityAnalysis"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/data/quality/analysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataQualityAnalysisResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API returns the data quality evaluation results based on the user-provided product ID. It\&quot;s useful for understanding the data quality of the carbon emission factors for each inventory of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the data quality evaluation results DQR and DQI.</p>
     * 
     * @param request GetDataQualityAnalysisRequest
     * @return GetDataQualityAnalysisResponse
     */
    public GetDataQualityAnalysisResponse getDataQualityAnalysis(GetDataQualityAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataQualityAnalysisWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the parameters of a data collection device based on the device ID. If the verification is passed, the device parameters are returned. If the verification fails, a null value is returned.</p>
     * <ul>
     * <li>You can query the parameters of a single device by day. If data of the device does not exist, a null value is returned.</li>
     * </ul>
     * <ul>
     * <li>By current, endpoint only supports Hangzhou: <code>energyexpertexternal.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>To use this API, you need to be added to the whitelist. Please contact us through  &lt;props=&quot;china&quot;&gt;<a href="https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89">official website</a> 
     * &lt;props=&quot;intl&quot;&gt;<a href="https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en">official website</a> to apply for whitelist activation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a device at a site that is activated by using an Alibaba Cloud account.</p>
     * 
     * @param request GetDeviceInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceInfoResponse
     */
    public GetDeviceInfoResponse getDeviceInfoWithOptions(GetDeviceInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("deviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ds)) {
            query.put("ds", request.ds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            query.put("factoryId", request.factoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceInfo"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/external/getDeviceInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the parameters of a data collection device based on the device ID. If the verification is passed, the device parameters are returned. If the verification fails, a null value is returned.</p>
     * <ul>
     * <li>You can query the parameters of a single device by day. If data of the device does not exist, a null value is returned.</li>
     * </ul>
     * <ul>
     * <li>By current, endpoint only supports Hangzhou: <code>energyexpertexternal.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>To use this API, you need to be added to the whitelist. Please contact us through  &lt;props=&quot;china&quot;&gt;<a href="https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89">official website</a> 
     * &lt;props=&quot;intl&quot;&gt;<a href="https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en">official website</a> to apply for whitelist activation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a device at a site that is activated by using an Alibaba Cloud account.</p>
     * 
     * @param request GetDeviceInfoRequest
     * @return GetDeviceInfoResponse
     */
    public GetDeviceInfoResponse getDeviceInfo(GetDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeviceInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can query the information about data collection devices of a site based on the ID of the site. If the verification is passed, the information about the devices of the site is returned. If the verification fails, a null value is returned.</p>
     * <ul>
     * <li>Virtual meters at the site are not returned.</li>
     * </ul>
     * <ul>
     * <li>By current, endpoint only supports Hangzhou: <code>energyexpertexternal.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>To use this API, you need to be added to the whitelist. Please contact us through  &lt;props=&quot;china&quot;&gt;<a href="https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89">official website</a> 
     * &lt;props=&quot;intl&quot;&gt;<a href="https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en">official website</a> to apply for whitelist activation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the devices of a site that is activated by using an Alibaba Cloud account.</p>
     * 
     * @param request GetDeviceListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceListResponse
     */
    public GetDeviceListResponse getDeviceListWithOptions(GetDeviceListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            query.put("factoryId", request.factoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/external/getDeviceList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceListResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can query the information about data collection devices of a site based on the ID of the site. If the verification is passed, the information about the devices of the site is returned. If the verification fails, a null value is returned.</p>
     * <ul>
     * <li>Virtual meters at the site are not returned.</li>
     * </ul>
     * <ul>
     * <li>By current, endpoint only supports Hangzhou: <code>energyexpertexternal.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>To use this API, you need to be added to the whitelist. Please contact us through  &lt;props=&quot;china&quot;&gt;<a href="https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89">official website</a> 
     * &lt;props=&quot;intl&quot;&gt;<a href="https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en">official website</a> to apply for whitelist activation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the devices of a site that is activated by using an Alibaba Cloud account.</p>
     * 
     * @param request GetDeviceListRequest
     * @return GetDeviceListResponse
     */
    public GetDeviceListResponse getDeviceList(GetDeviceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeviceListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>For Querying Information Extraction Result.
     * The input parameter taskId is obtained from the taskId returned by the interfaces SubmitDocExtractionTaskAdvance or SubmitDocExtractionTask.
     * The query results can reflect one of three statuses: processing, successfully completed, or failed.</p>
     * 
     * @param request GetDocExtractionResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocExtractionResultResponse
     */
    public GetDocExtractionResultResponse getDocExtractionResultWithOptions(GetDocExtractionResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocExtractionResult"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/getDocExtractionResult"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocExtractionResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>For Querying Information Extraction Result.
     * The input parameter taskId is obtained from the taskId returned by the interfaces SubmitDocExtractionTaskAdvance or SubmitDocExtractionTask.
     * The query results can reflect one of three statuses: processing, successfully completed, or failed.</p>
     * 
     * @param request GetDocExtractionResultRequest
     * @return GetDocExtractionResultResponse
     */
    public GetDocExtractionResultResponse getDocExtractionResult(GetDocExtractionResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocExtractionResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>For Querying Document Parsing Results.
     * The input parameter taskId is obtained from the taskId returned by the interfaces SubmitDocParsingTaskAdvance or SubmitDocParsingTask.
     * The query results can be one of three statuses: processing, successful, or failed.</p>
     * 
     * @param request GetDocParsingResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocParsingResultResponse
     */
    public GetDocParsingResultResponse getDocParsingResultWithOptions(GetDocParsingResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.returnFormat)) {
            body.put("returnFormat", request.returnFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocParsingResult"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/getDocParsingResult"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocParsingResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>For Querying Document Parsing Results.
     * The input parameter taskId is obtained from the taskId returned by the interfaces SubmitDocParsingTaskAdvance or SubmitDocParsingTask.
     * The query results can be one of three statuses: processing, successful, or failed.</p>
     * 
     * @param request GetDocParsingResultRequest
     * @return GetDocParsingResultResponse
     */
    public GetDocParsingResultResponse getDocParsingResult(GetDocParsingResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocParsingResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>null null</p>
     * 
     * @param request GetDocumentAnalyzeResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentAnalyzeResultResponse
     */
    public GetDocumentAnalyzeResultResponse getDocumentAnalyzeResultWithOptions(GetDocumentAnalyzeResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("jobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentAnalyzeResult"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aidoc/document/getDocumentAnalyzeResult"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentAnalyzeResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>null null</p>
     * 
     * @param request GetDocumentAnalyzeResultRequest
     * @return GetDocumentAnalyzeResultResponse
     */
    public GetDocumentAnalyzeResultResponse getDocumentAnalyzeResult(GetDocumentAnalyzeResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocumentAnalyzeResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain power composition analysis data.</p>
     * 
     * @param request GetElecConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetElecConstituteResponse
     */
    public GetElecConstituteResponse getElecConstituteWithOptions(GetElecConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetElecConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/elec/constitute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetElecConstituteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain power composition analysis data.</p>
     * 
     * @param request GetElecConstituteRequest
     * @return GetElecConstituteResponse
     */
    public GetElecConstituteResponse getElecConstitute(GetElecConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getElecConstituteWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain power trend analysis data.</p>
     * 
     * @param request GetElecTrendRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetElecTrendResponse
     */
    public GetElecTrendResponse getElecTrendWithOptions(GetElecTrendRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yearList)) {
            body.put("yearList", request.yearList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetElecTrend"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/elec/trend"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetElecTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain power trend analysis data.</p>
     * 
     * @param request GetElecTrendRequest
     * @return GetElecTrendResponse
     */
    public GetElecTrendResponse getElecTrend(GetElecTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getElecTrendWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the emission source composition.</p>
     * 
     * @param request GetEmissionSourceConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEmissionSourceConstituteResponse
     */
    public GetEmissionSourceConstituteResponse getEmissionSourceConstituteWithOptions(GetEmissionSourceConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            body.put("moduleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            body.put("moduleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEmissionSourceConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/constitute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEmissionSourceConstituteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the emission source composition.</p>
     * 
     * @param request GetEmissionSourceConstituteRequest
     * @return GetEmissionSourceConstituteResponse
     */
    public GetEmissionSourceConstituteResponse getEmissionSourceConstitute(GetEmissionSourceConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmissionSourceConstituteWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get a summary of carbon emissions.</p>
     * 
     * @param request GetEmissionSummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEmissionSummaryResponse
     */
    public GetEmissionSummaryResponse getEmissionSummaryWithOptions(GetEmissionSummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            body.put("moduleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            body.put("moduleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEmissionSummary"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/summary"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEmissionSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get a summary of carbon emissions.</p>
     * 
     * @param request GetEmissionSummaryRequest
     * @return GetEmissionSummaryResponse
     */
    public GetEmissionSummaryResponse getEmissionSummary(GetEmissionSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmissionSummaryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API returns the emission amounts for various environmental impact categories at different levels for the given product ID. It helps understand the emission quantities for different environmental impact categories and inventories of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>Gets the result details of the environmental impact category.</p>
     * 
     * @param request GetEpdInventoryConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEpdInventoryConstituteResponse
     */
    public GetEpdInventoryConstituteResponse getEpdInventoryConstituteWithOptions(GetEpdInventoryConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEpdInventoryConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/epd/inventory/constitute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEpdInventoryConstituteResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API returns the emission amounts for various environmental impact categories at different levels for the given product ID. It helps understand the emission quantities for different environmental impact categories and inventories of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>Gets the result details of the environmental impact category.</p>
     * 
     * @param request GetEpdInventoryConstituteRequest
     * @return GetEpdInventoryConstituteResponse
     */
    public GetEpdInventoryConstituteResponse getEpdInventoryConstitute(GetEpdInventoryConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEpdInventoryConstituteWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API takes a product ID from the user and returns the summary of environmental impact generated for the product. This info helps understand the overall emissions for different environmental impact categories of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the total amount of emissions for various environmental impacts.</p>
     * 
     * @param request GetEpdSummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEpdSummaryResponse
     */
    public GetEpdSummaryResponse getEpdSummaryWithOptions(GetEpdSummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEpdSummary"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/epd/summary"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEpdSummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API takes a product ID from the user and returns the summary of environmental impact generated for the product. This info helps understand the overall emissions for different environmental impact categories of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the total amount of emissions for various environmental impacts.</p>
     * 
     * @param request GetEpdSummaryRequest
     * @return GetEpdSummaryResponse
     */
    public GetEpdSummaryResponse getEpdSummary(GetEpdSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEpdSummaryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>With user-specified parameters such as enterprise code, current page, and page size, this API returns a list of matching product carbon footprints (or supply chain carbon footprints), including product names and product IDs. The product ID can be used as input parameters in other APIs to get the corresponding product\&quot;s detailed information.</p>
     * 
     * <b>summary</b> : 
     * <p>Get the list of product carbon footprints.</p>
     * 
     * @param request GetFootprintListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFootprintListResponse
     */
    public GetFootprintListResponse getFootprintListWithOptions(GetFootprintListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFootprintList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/product/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFootprintListResponse());
    }

    /**
     * <b>description</b> :
     * <p>With user-specified parameters such as enterprise code, current page, and page size, this API returns a list of matching product carbon footprints (or supply chain carbon footprints), including product names and product IDs. The product ID can be used as input parameters in other APIs to get the corresponding product\&quot;s detailed information.</p>
     * 
     * <b>summary</b> : 
     * <p>Get the list of product carbon footprints.</p>
     * 
     * @param request GetFootprintListRequest
     * @return GetFootprintListResponse
     */
    public GetFootprintListResponse getFootprintList(GetFootprintListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFootprintListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain gas composition analysis.</p>
     * 
     * @param request GetGasConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGasConstituteResponse
     */
    public GetGasConstituteResponse getGasConstituteWithOptions(GetGasConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            body.put("moduleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            body.put("moduleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGasConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/gas/constitute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGasConstituteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain gas composition analysis.</p>
     * 
     * @param request GetGasConstituteRequest
     * @return GetGasConstituteResponse
     */
    public GetGasConstituteResponse getGasConstitute(GetGasConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGasConstituteWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This interface returns a list of proactive carbon reduction information given product ID. It\&quot;s used to understand the carbon reduction efforts at various levels of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>obtain the active carbon reduction ranking list.</p>
     * 
     * @param request GetGwpBenchmarkListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGwpBenchmarkListResponse
     */
    public GetGwpBenchmarkListResponse getGwpBenchmarkListWithOptions(GetGwpBenchmarkListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGwpBenchmarkList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/gwp/benchmark/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGwpBenchmarkListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This interface returns a list of proactive carbon reduction information given product ID. It\&quot;s used to understand the carbon reduction efforts at various levels of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>obtain the active carbon reduction ranking list.</p>
     * 
     * @param request GetGwpBenchmarkListRequest
     * @return GetGwpBenchmarkListResponse
     */
    public GetGwpBenchmarkListResponse getGwpBenchmarkList(GetGwpBenchmarkListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGwpBenchmarkListWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The API takes a product ID and returns data on the carbon emissions reduction along with a list of the top four contributors to carbon reduction. This info helps understand the total carbon reduction of the product and its main sources.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is to obtain the total amount of active carbon reduction.</p>
     * 
     * @param request GetGwpBenchmarkSummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGwpBenchmarkSummaryResponse
     */
    public GetGwpBenchmarkSummaryResponse getGwpBenchmarkSummaryWithOptions(GetGwpBenchmarkSummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGwpBenchmarkSummary"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/gwp/benchmark/summary"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGwpBenchmarkSummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>The API takes a product ID and returns data on the carbon emissions reduction along with a list of the top four contributors to carbon reduction. This info helps understand the total carbon reduction of the product and its main sources.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is to obtain the total amount of active carbon reduction.</p>
     * 
     * @param request GetGwpBenchmarkSummaryRequest
     * @return GetGwpBenchmarkSummaryResponse
     */
    public GetGwpBenchmarkSummaryResponse getGwpBenchmarkSummary(GetGwpBenchmarkSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGwpBenchmarkSummaryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Used to obtain the carbon emission composition analysis of a specified product. Carbon emission composition analysis includes two analysis dimensions: inventory and type. In the rendering effect, including a hierarchical list and pie chart.</p>
     * 
     * <b>summary</b> : 
     * <p>Used to obtain the carbon emission composition analysis of a specified product. Carbon emission composition analysis includes two analysis dimensions: inventory and type. In the rendering effect, including a hierarchical list and pie chart.</p>
     * 
     * @param request GetGwpInventoryConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGwpInventoryConstituteResponse
     */
    public GetGwpInventoryConstituteResponse getGwpInventoryConstituteWithOptions(GetGwpInventoryConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGwpInventoryConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/gwp/inventory/constitute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGwpInventoryConstituteResponse());
    }

    /**
     * <b>description</b> :
     * <p>Used to obtain the carbon emission composition analysis of a specified product. Carbon emission composition analysis includes two analysis dimensions: inventory and type. In the rendering effect, including a hierarchical list and pie chart.</p>
     * 
     * <b>summary</b> : 
     * <p>Used to obtain the carbon emission composition analysis of a specified product. Carbon emission composition analysis includes two analysis dimensions: inventory and type. In the rendering effect, including a hierarchical list and pie chart.</p>
     * 
     * @param request GetGwpInventoryConstituteRequest
     * @return GetGwpInventoryConstituteResponse
     */
    public GetGwpInventoryConstituteResponse getGwpInventoryConstitute(GetGwpInventoryConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGwpInventoryConstituteWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Returns the total carbon footprint data for the user-specified product ID, along with details on the top four contributors to the carbon footprint, helping to understand the overall carbon footprint and its main components.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to obtain the total carbon footprint of a product and the top four types of carbon footprint contribution.</p>
     * 
     * @param request GetGwpInventorySummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGwpInventorySummaryResponse
     */
    public GetGwpInventorySummaryResponse getGwpInventorySummaryWithOptions(GetGwpInventorySummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGwpInventorySummary"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/gwp/inventory/summary"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGwpInventorySummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Returns the total carbon footprint data for the user-specified product ID, along with details on the top four contributors to the carbon footprint, helping to understand the overall carbon footprint and its main components.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to obtain the total carbon footprint of a product and the top four types of carbon footprint contribution.</p>
     * 
     * @param request GetGwpInventorySummaryRequest
     * @return GetGwpInventorySummaryResponse
     */
    public GetGwpInventorySummaryResponse getGwpInventorySummary(GetGwpInventorySummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGwpInventorySummaryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This interface retrieves a descending order list of emissions for a specified product ID, environmental impact method, group level, and calculation method. It\&quot;s used to understand various environmental impact emission scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Get the list of emissions in descending order under the specified environmental impact (methodType), specified aggregate level (group), and specified calculation mode (emissionType).</p>
     * 
     * @param request GetInventoryListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInventoryListResponse
     */
    public GetInventoryListResponse getInventoryListWithOptions(GetInventoryListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emissionType)) {
            body.put("emissionType", request.emissionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            body.put("group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodType)) {
            body.put("methodType", request.methodType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInventoryList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/inventory/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInventoryListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This interface retrieves a descending order list of emissions for a specified product ID, environmental impact method, group level, and calculation method. It\&quot;s used to understand various environmental impact emission scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Get the list of emissions in descending order under the specified environmental impact (methodType), specified aggregate level (group), and specified calculation mode (emissionType).</p>
     * 
     * @param request GetInventoryListRequest
     * @return GetInventoryListResponse
     */
    public GetInventoryListResponse getInventoryList(GetInventoryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInventoryListWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If an activated site exists, the information about the site and the organization to which the site belongs is returned. If no activated site exists, null is returned.</p>
     * <ul>
     * <li>By current, endpoint only supports Hangzhou: <code>energyexpertexternal.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>To use this API, you need to be added to the whitelist. Please contact us through  &lt;props=&quot;china&quot;&gt;<a href="https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89">official website</a> 
     * &lt;props=&quot;intl&quot;&gt;<a href="https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en">official website</a> to apply for whitelist activation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the organizations and sites that are activated by using an Alibaba Cloud account. You cannot call this operation to query the organizations or sites that have not been activated in the console.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrgAndFactoryResponse
     */
    public GetOrgAndFactoryResponse getOrgAndFactoryWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrgAndFactory"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/external/getOrgAndFactory"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrgAndFactoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If an activated site exists, the information about the site and the organization to which the site belongs is returned. If no activated site exists, null is returned.</p>
     * <ul>
     * <li>By current, endpoint only supports Hangzhou: <code>energyexpertexternal.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>To use this API, you need to be added to the whitelist. Please contact us through  &lt;props=&quot;china&quot;&gt;<a href="https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89">official website</a> 
     * &lt;props=&quot;intl&quot;&gt;<a href="https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en">official website</a> to apply for whitelist activation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the organizations and sites that are activated by using an Alibaba Cloud account. You cannot call this operation to query the organizations or sites that have not been activated in the console.</p>
     * @return GetOrgAndFactoryResponse
     */
    public GetOrgAndFactoryResponse getOrgAndFactory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrgAndFactoryWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain carbon inventory organization analysis data.</p>
     * 
     * @param request GetOrgConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrgConstituteResponse
     */
    public GetOrgConstituteResponse getOrgConstituteWithOptions(GetOrgConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            body.put("moduleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            body.put("moduleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrgConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/org"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrgConstituteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain carbon inventory organization analysis data.</p>
     * 
     * @param request GetOrgConstituteRequest
     * @return GetOrgConstituteResponse
     */
    public GetOrgConstituteResponse getOrgConstitute(GetOrgConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrgConstituteWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>With the user-specified product ID, this interface retrieves detailed information and download links for previously generated PCR reports. To use it, two conditions must be met: 1) the result has already been generated; 2) the PCR report has been created.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the oss address of the Product Carbon footprint Report.</p>
     * 
     * @param request GetPcrInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPcrInfoResponse
     */
    public GetPcrInfoResponse getPcrInfoWithOptions(GetPcrInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPcrInfo"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/pcr/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPcrInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>With the user-specified product ID, this interface retrieves detailed information and download links for previously generated PCR reports. To use it, two conditions must be met: 1) the result has already been generated; 2) the PCR report has been created.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the oss address of the Product Carbon footprint Report.</p>
     * 
     * @param request GetPcrInfoRequest
     * @return GetPcrInfoResponse
     */
    public GetPcrInfoResponse getPcrInfo(GetPcrInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPcrInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API returns carbon reduction proposals based on the product ID. It\&quot;s useful for understanding optimization tips to reduce the carbon emissions associated with a product.</p>
     * 
     * <b>summary</b> : 
     * <p>Get carbon reduction recommendations.</p>
     * 
     * @param request GetReductionProposalRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetReductionProposalResponse
     */
    public GetReductionProposalResponse getReductionProposalWithOptions(GetReductionProposalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityEvaluationType)) {
            body.put("dataQualityEvaluationType", request.dataQualityEvaluationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReductionProposal"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/reduction/proposal"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReductionProposalResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API returns carbon reduction proposals based on the product ID. It\&quot;s useful for understanding optimization tips to reduce the carbon emissions associated with a product.</p>
     * 
     * <b>summary</b> : 
     * <p>Get carbon reduction recommendations.</p>
     * 
     * @param request GetReductionProposalRequest
     * @return GetReductionProposalResponse
     */
    public GetReductionProposalResponse getReductionProposal(GetReductionProposalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getReductionProposalWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>For Querying Qwen-VL Model Information Extraction Results.
     * The input parameter taskId is obtained from the taskId returned by the interfaces SubmitVLExtractionTask or SubmitVLExtractionTaskAdvance.
     * The query results can be in one of three statuses: processing, successfully completed, or failed.</p>
     * 
     * @param request GetVLExtractionResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVLExtractionResultResponse
     */
    public GetVLExtractionResultResponse getVLExtractionResultWithOptions(GetVLExtractionResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVLExtractionResult"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/getVLExtractionResult"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVLExtractionResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>For Querying Qwen-VL Model Information Extraction Results.
     * The input parameter taskId is obtained from the taskId returned by the interfaces SubmitVLExtractionTask or SubmitVLExtractionTaskAdvance.
     * The query results can be in one of three statuses: processing, successfully completed, or failed.</p>
     * 
     * @param request GetVLExtractionResultRequest
     * @return GetVLExtractionResultResponse
     */
    public GetVLExtractionResultResponse getVLExtractionResult(GetVLExtractionResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVLExtractionResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API checks the completion status of generating a report. It should be used before calling other result APIs, as they will only display content once the report generation is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Check if the result generation is complete.</p>
     * 
     * @param request IsCompletedRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return IsCompletedResponse
     */
    public IsCompletedResponse isCompletedWithOptions(IsCompletedRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IsCompleted"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/completed"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IsCompletedResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API checks the completion status of generating a report. It should be used before calling other result APIs, as they will only display content once the report generation is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Check if the result generation is complete.</p>
     * 
     * @param request IsCompletedRequest
     * @return IsCompletedResponse
     */
    public IsCompletedResponse isCompleted(IsCompletedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.isCompletedWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to push device measuring point data, such as power meter voltage and other data.</p>
     * 
     * @param request PushDeviceDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushDeviceDataResponse
     */
    public PushDeviceDataResponse pushDeviceDataWithOptions(PushDeviceDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("deviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devices)) {
            body.put("devices", request.devices);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushDeviceData"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/data/increment/push"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushDeviceDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to push device measuring point data, such as power meter voltage and other data.</p>
     * 
     * @param request PushDeviceDataRequest
     * @return PushDeviceDataResponse
     */
    public PushDeviceDataResponse pushDeviceData(PushDeviceDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushDeviceDataWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This interface is used for individual data item data.</li>
     * <li>Data items can link data to services such as carbon footprints and carbon inventories.</li>
     * <li>Depending on the platform configuration, active data on a yearly and monthly basis is supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This interface is used to push data items.</p>
     * 
     * @param request PushItemDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushItemDataResponse
     */
    public PushItemDataResponse pushItemDataWithOptions(PushItemDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            body.put("items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushItemData"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/data/item/push"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushItemDataResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This interface is used for individual data item data.</li>
     * <li>Data items can link data to services such as carbon footprints and carbon inventories.</li>
     * <li>Depending on the platform configuration, active data on a yearly and monthly basis is supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This interface is used to push data items.</p>
     * 
     * @param request PushItemDataRequest
     * @return PushItemDataResponse
     */
    public PushItemDataResponse pushItemData(PushItemDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushItemDataWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After uploading the data items, you need to call this interface to recalculate the carbon inventory data.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Recalculate carbon emissions.</p>
     * 
     * @param request RecalculateCarbonEmissionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecalculateCarbonEmissionResponse
     */
    public RecalculateCarbonEmissionResponse recalculateCarbonEmissionWithOptions(RecalculateCarbonEmissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecalculateCarbonEmission"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/data/item/recalculate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecalculateCarbonEmissionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After uploading the data items, you need to call this interface to recalculate the carbon inventory data.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Recalculate carbon emissions.</p>
     * 
     * @param request RecalculateCarbonEmissionRequest
     * @return RecalculateCarbonEmissionResponse
     */
    public RecalculateCarbonEmissionResponse recalculateCarbonEmission(RecalculateCarbonEmissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recalculateCarbonEmissionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>支持多文件夹ID或文件ID检索的RAG结果获取接口，供客户端自行加工结果并嵌入业务逻辑。</p>
     * 
     * @param request RetrieveRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetrieveResponse
     */
    public RetrieveResponse retrieveWithOptions(RetrieveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentIds)) {
            body.put("documentIds", request.documentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderIds)) {
            body.put("folderIds", request.folderIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preRetrieveTopK)) {
            body.put("preRetrieveTopK", request.preRetrieveTopK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankerThreshold)) {
            body.put("rerankerThreshold", request.rerankerThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topK)) {
            body.put("topK", request.topK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useReranker)) {
            body.put("useReranker", request.useReranker);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Retrieve"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/knowledgebase/retrieve"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetrieveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>支持多文件夹ID或文件ID检索的RAG结果获取接口，供客户端自行加工结果并嵌入业务逻辑。</p>
     * 
     * @param request RetrieveRequest
     * @return RetrieveResponse
     */
    public RetrieveResponse retrieve(RetrieveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retrieveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>null null</p>
     * 
     * @param request SendDocumentAskQuestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendDocumentAskQuestionResponse
     */
    public SendDocumentAskQuestionResponse sendDocumentAskQuestionWithOptions(SendDocumentAskQuestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendDocumentAskQuestion"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aidoc/document/sendDocumentAskQuestion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendDocumentAskQuestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>null null</p>
     * 
     * @param request SendDocumentAskQuestionRequest
     * @return SendDocumentAskQuestionResponse
     */
    public SendDocumentAskQuestionResponse sendDocumentAskQuestion(SendDocumentAskQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendDocumentAskQuestionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置运行计划</p>
     * 
     * @param request SetRunningPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetRunningPlanResponse
     */
    public SetRunningPlanResponse setRunningPlanWithOptions(SetRunningPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.controlType)) {
            body.put("controlType", request.controlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateType)) {
            body.put("dateType", request.dateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.earliestStartupTime)) {
            body.put("earliestStartupTime", request.earliestStartupTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            body.put("factoryId", request.factoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latestShutdownTime)) {
            body.put("latestShutdownTime", request.latestShutdownTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCarbonDioxide)) {
            body.put("maxCarbonDioxide", request.maxCarbonDioxide);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxTem)) {
            body.put("maxTem", request.maxTem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minTem)) {
            body.put("minTem", request.minTem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pKey)) {
            body.put("pKey", request.pKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seasonMode)) {
            body.put("seasonMode", request.seasonMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisticsTime)) {
            body.put("statisticsTime", request.statisticsTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemId)) {
            body.put("systemId", request.systemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingEndTime)) {
            body.put("workingEndTime", request.workingEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingStartTime)) {
            body.put("workingStartTime", request.workingStartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetRunningPlan"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/hvac/setRunningPlan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetRunningPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置运行计划</p>
     * 
     * @param request SetRunningPlanRequest
     * @return SetRunningPlanResponse
     */
    public SetRunningPlanResponse setRunningPlan(SetRunningPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setRunningPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Extracts key information from documents using user-defined Key-Value or prompt templates. A taskId is returned upon successful execution for retrieving extraction results via GetDocExtractionResult.
     * Supports:
     * URL Upload: SubmitDocExtractionTask
     * Local File Upload: SubmitDocExtractionTask</p>
     * 
     * @param request SubmitDocExtractionTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDocExtractionTaskResponse
     */
    public SubmitDocExtractionTaskResponse submitDocExtractionTaskWithOptions(SubmitDocExtractionTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extractType)) {
            query.put("extractType", request.extractType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDocExtractionTask"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/submitDocExtractionTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDocExtractionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Extracts key information from documents using user-defined Key-Value or prompt templates. A taskId is returned upon successful execution for retrieving extraction results via GetDocExtractionResult.
     * Supports:
     * URL Upload: SubmitDocExtractionTask
     * Local File Upload: SubmitDocExtractionTask</p>
     * 
     * @param request SubmitDocExtractionTaskRequest
     * @return SubmitDocExtractionTaskResponse
     */
    public SubmitDocExtractionTaskResponse submitDocExtractionTask(SubmitDocExtractionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDocExtractionTaskWithOptions(request, headers, runtime);
    }

    public SubmitDocExtractionTaskResponse submitDocExtractionTaskAdvance(SubmitDocExtractionTaskAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "energyExpertExternal"),
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
        SubmitDocExtractionTaskRequest submitDocExtractionTaskReq = new SubmitDocExtractionTaskRequest();
        com.aliyun.openapiutil.Client.convert(request, submitDocExtractionTaskReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrlObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.fileUrlObject),
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
            submitDocExtractionTaskReq.fileUrl = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        SubmitDocExtractionTaskResponse submitDocExtractionTaskResp = this.submitDocExtractionTaskWithOptions(submitDocExtractionTaskReq, headers, runtime);
        return submitDocExtractionTaskResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Parses text, tables, images, and more from documents. After execution, a taskId is returned for retrieving document parsing results via GetDocParsingResult.
     * Supports:
     * URL Upload: SubmitDocParsingTask
     * Local File Upload: SubmitDocParsingTaskAdvance</p>
     * 
     * @param request SubmitDocParsingTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDocParsingTaskResponse
     */
    public SubmitDocParsingTaskResponse submitDocParsingTaskWithOptions(SubmitDocParsingTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needAnalyzeImg)) {
            query.put("needAnalyzeImg", request.needAnalyzeImg);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDocParsingTask"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/submitDocParsingTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDocParsingTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Parses text, tables, images, and more from documents. After execution, a taskId is returned for retrieving document parsing results via GetDocParsingResult.
     * Supports:
     * URL Upload: SubmitDocParsingTask
     * Local File Upload: SubmitDocParsingTaskAdvance</p>
     * 
     * @param request SubmitDocParsingTaskRequest
     * @return SubmitDocParsingTaskResponse
     */
    public SubmitDocParsingTaskResponse submitDocParsingTask(SubmitDocParsingTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDocParsingTaskWithOptions(request, headers, runtime);
    }

    public SubmitDocParsingTaskResponse submitDocParsingTaskAdvance(SubmitDocParsingTaskAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "energyExpertExternal"),
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
        SubmitDocParsingTaskRequest submitDocParsingTaskReq = new SubmitDocParsingTaskRequest();
        com.aliyun.openapiutil.Client.convert(request, submitDocParsingTaskReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrlObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.fileUrlObject),
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
            submitDocParsingTaskReq.fileUrl = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        SubmitDocParsingTaskResponse submitDocParsingTaskResp = this.submitDocParsingTaskWithOptions(submitDocParsingTaskReq, headers, runtime);
        return submitDocParsingTaskResp;
    }

    /**
     * <b>summary</b> : 
     * <p>The document parsing operation is used to extract the key content of a document and extract the key-value information from the document based on the preset key-value template. The document parsing operation is an asynchronous operation. You need to call the asynchronous submission service for document parsing and then call the GetDocumentAnalyzeResult operation to perform result polling. The asynchronous submission service supports two methods: local files and URL files. Call the SubmitDocumentAnalyzeJob operation to upload URL files. Call the SubmitDocumentAnalyzeJobAdvance operation to upload local files.</p>
     * 
     * @param request SubmitDocumentAnalyzeJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDocumentAnalyzeJobResponse
     */
    public SubmitDocumentAnalyzeJobResponse submitDocumentAnalyzeJobWithOptions(SubmitDocumentAnalyzeJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisType)) {
            query.put("analysisType", request.analysisType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDocumentAnalyzeJob"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aidoc/document/submitDocumentAnalyzeJob"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDocumentAnalyzeJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The document parsing operation is used to extract the key content of a document and extract the key-value information from the document based on the preset key-value template. The document parsing operation is an asynchronous operation. You need to call the asynchronous submission service for document parsing and then call the GetDocumentAnalyzeResult operation to perform result polling. The asynchronous submission service supports two methods: local files and URL files. Call the SubmitDocumentAnalyzeJob operation to upload URL files. Call the SubmitDocumentAnalyzeJobAdvance operation to upload local files.</p>
     * 
     * @param request SubmitDocumentAnalyzeJobRequest
     * @return SubmitDocumentAnalyzeJobResponse
     */
    public SubmitDocumentAnalyzeJobResponse submitDocumentAnalyzeJob(SubmitDocumentAnalyzeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDocumentAnalyzeJobWithOptions(request, headers, runtime);
    }

    public SubmitDocumentAnalyzeJobResponse submitDocumentAnalyzeJobAdvance(SubmitDocumentAnalyzeJobAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "energyExpertExternal"),
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
        SubmitDocumentAnalyzeJobRequest submitDocumentAnalyzeJobReq = new SubmitDocumentAnalyzeJobRequest();
        com.aliyun.openapiutil.Client.convert(request, submitDocumentAnalyzeJobReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrlObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.fileUrlObject),
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
            submitDocumentAnalyzeJobReq.fileUrl = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        SubmitDocumentAnalyzeJobResponse submitDocumentAnalyzeJobResp = this.submitDocumentAnalyzeJobWithOptions(submitDocumentAnalyzeJobReq, headers, runtime);
        return submitDocumentAnalyzeJobResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Extracts key information from documents using KV templates or prompts with the Qwen-VL model, ideal for image extraction. 
     * Supports:
     * URL Upload: SubmitVLExtractionTask.
     * Local File Upload: SubmitVLExtractionTaskAdvance</p>
     * 
     * @param request SubmitVLExtractionTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitVLExtractionTaskResponse
     */
    public SubmitVLExtractionTaskResponse submitVLExtractionTaskWithOptions(SubmitVLExtractionTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitVLExtractionTask"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/submitVLExtractionTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitVLExtractionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Extracts key information from documents using KV templates or prompts with the Qwen-VL model, ideal for image extraction. 
     * Supports:
     * URL Upload: SubmitVLExtractionTask.
     * Local File Upload: SubmitVLExtractionTaskAdvance</p>
     * 
     * @param request SubmitVLExtractionTaskRequest
     * @return SubmitVLExtractionTaskResponse
     */
    public SubmitVLExtractionTaskResponse submitVLExtractionTask(SubmitVLExtractionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitVLExtractionTaskWithOptions(request, headers, runtime);
    }

    public SubmitVLExtractionTaskResponse submitVLExtractionTaskAdvance(SubmitVLExtractionTaskAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "energyExpertExternal"),
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
        SubmitVLExtractionTaskRequest submitVLExtractionTaskReq = new SubmitVLExtractionTaskRequest();
        com.aliyun.openapiutil.Client.convert(request, submitVLExtractionTaskReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrlObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.fileUrlObject),
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
            submitVLExtractionTaskReq.fileUrl = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        SubmitVLExtractionTaskResponse submitVLExtractionTaskResp = this.submitVLExtractionTaskWithOptions(submitVLExtractionTaskReq, headers, runtime);
        return submitVLExtractionTaskResp;
    }
}
