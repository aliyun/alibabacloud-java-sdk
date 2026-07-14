// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.dianjin20240628.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "dianjin.cn-beijing.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dianjin", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
                String tmp = com.aliyun.teautil.Common.assertAsString(form.get("host"));
                String host = "" + bucketName + "." + tmp + "";
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
     * <p>申请取数</p>
     * 
     * @param request CommercializeFetchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CommercializeFetchResponse
     */
    public CommercializeFetchResponse commercializeFetchWithOptions(String workspaceId, String cjfCode, String zjfCode, CommercializeFetchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("channelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            body.put("encryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            body.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretKey)) {
            body.put("secretKey", request.secretKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sign)) {
            body.put("sign", request.sign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signType)) {
            body.put("signType", request.signType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommercializeFetch"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/spi/path/" + com.aliyun.openapiutil.Client.getEncodeParam(cjfCode) + "/api/support/" + com.aliyun.openapiutil.Client.getEncodeParam(zjfCode) + "/firefly/commercializeFetch"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommercializeFetchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申请取数</p>
     * 
     * @param request CommercializeFetchRequest
     * @return CommercializeFetchResponse
     */
    public CommercializeFetchResponse commercializeFetch(String workspaceId, String cjfCode, String zjfCode, CommercializeFetchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.commercializeFetchWithOptions(workspaceId, cjfCode, zjfCode, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you use this operation, review the billing methods and pricing for Alibaba Cloud Tongyi Dianjin.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.
     * Obtain your <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace ID</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a task to summarize documents by year.</p>
     * 
     * @param request CreateAnnualDocSummaryTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAnnualDocSummaryTaskResponse
     */
    public CreateAnnualDocSummaryTaskResponse createAnnualDocSummaryTaskWithOptions(String workspaceId, CreateAnnualDocSummaryTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anaYears)) {
            body.put("anaYears", request.anaYears);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docInfos)) {
            body.put("docInfos", request.docInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTable)) {
            body.put("enableTable", request.enableTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instruction)) {
            body.put("instruction", request.instruction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAnnualDocSummaryTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/summary/doc/annual"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAnnualDocSummaryTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you use this operation, review the billing methods and pricing for Alibaba Cloud Tongyi Dianjin.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.
     * Obtain your <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace ID</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a task to summarize documents by year.</p>
     * 
     * @param request CreateAnnualDocSummaryTaskRequest
     * @return CreateAnnualDocSummaryTaskResponse
     */
    public CreateAnnualDocSummaryTaskResponse createAnnualDocSummaryTask(String workspaceId, CreateAnnualDocSummaryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAnnualDocSummaryTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an outbound call session.</p>
     * 
     * @param request CreateDialogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDialogResponse
     */
    public CreateDialogResponse createDialogWithOptions(String workspaceId, CreateDialogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableLibrary)) {
            body.put("enableLibrary", request.enableLibrary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaData)) {
            body.put("metaData", request.metaData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playCode)) {
            body.put("playCode", request.playCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qaLibraryList)) {
            body.put("qaLibraryList", request.qaLibraryList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selfDirected)) {
            body.put("selfDirected", request.selfDirected);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDialog"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/virtualHuman/dialog/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDialogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an outbound call session.</p>
     * 
     * @param request CreateDialogRequest
     * @return CreateDialogResponse
     */
    public CreateDialogResponse createDialog(String workspaceId, CreateDialogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDialogWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, review the billing methods and pricing for DianJin.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and DianJin.
     * Obtain a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get a workspace ID</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a session analysis task. After the task is created, use the session ID with GetDialogAnalysisResult to retrieve the results.</p>
     * 
     * @param request CreateDialogAnalysisTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDialogAnalysisTaskResponse
     */
    public CreateDialogAnalysisTaskResponse createDialogAnalysisTaskWithOptions(String workspaceId, CreateDialogAnalysisTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisNodes)) {
            body.put("analysisNodes", request.analysisNodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationList)) {
            body.put("conversationList", request.conversationList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaData)) {
            body.put("metaData", request.metaData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playCode)) {
            body.put("playCode", request.playCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDialogAnalysisTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/virtualHuman/dialog/analysis/submit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDialogAnalysisTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, review the billing methods and pricing for DianJin.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and DianJin.
     * Obtain a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get a workspace ID</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a session analysis task. After the task is created, use the session ID with GetDialogAnalysisResult to retrieve the results.</p>
     * 
     * @param request CreateDialogAnalysisTaskRequest
     * @return CreateDialogAnalysisTaskResponse
     */
    public CreateDialogAnalysisTaskResponse createDialogAnalysisTask(String workspaceId, CreateDialogAnalysisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDialogAnalysisTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, review the billing methods and pricing for Alibaba Cloud Tongyi Dianjin.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.
     * You have obtained a <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a multi-document summary task.</p>
     * 
     * @param request CreateDocsSummaryTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDocsSummaryTaskResponse
     */
    public CreateDocsSummaryTaskResponse createDocsSummaryTaskWithOptions(String workspaceId, CreateDocsSummaryTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docInfos)) {
            body.put("docInfos", request.docInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTable)) {
            body.put("enableTable", request.enableTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instruction)) {
            body.put("instruction", request.instruction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDocsSummaryTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/summary/docs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDocsSummaryTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, review the billing methods and pricing for Alibaba Cloud Tongyi Dianjin.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.
     * You have obtained a <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a multi-document summary task.</p>
     * 
     * @param request CreateDocsSummaryTaskRequest
     * @return CreateDocsSummaryTaskResponse
     */
    public CreateDocsSummaryTaskResponse createDocsSummaryTask(String workspaceId, CreateDocsSummaryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDocsSummaryTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before using this API, review the pricing and billing methods for Alibaba Cloud Gold products.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>Enable Alibaba Cloud Model Studio and Alibaba Cloud Gold services.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a financial report summary.</p>
     * 
     * @param request CreateFinReportSummaryTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFinReportSummaryTaskResponse
     */
    public CreateFinReportSummaryTaskResponse createFinReportSummaryTaskWithOptions(String workspaceId, CreateFinReportSummaryTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docId)) {
            body.put("docId", request.docId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTable)) {
            body.put("enableTable", request.enableTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPage)) {
            body.put("endPage", request.endPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instruction)) {
            body.put("instruction", request.instruction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startPage)) {
            body.put("startPage", request.startPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("taskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFinReportSummaryTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/summary"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFinReportSummaryTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before using this API, review the pricing and billing methods for Alibaba Cloud Gold products.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>Enable Alibaba Cloud Model Studio and Alibaba Cloud Gold services.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a financial report summary.</p>
     * 
     * @param request CreateFinReportSummaryTaskRequest
     * @return CreateFinReportSummaryTaskResponse
     */
    public CreateFinReportSummaryTaskResponse createFinReportSummaryTask(String workspaceId, CreateFinReportSummaryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFinReportSummaryTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建图片检测任务</p>
     * 
     * @param request CreateImageDetectionTaskRequest
     * @param headers CreateImageDetectionTaskHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageDetectionTaskResponse
     */
    public CreateImageDetectionTaskResponse createImageDetectionTaskWithOptions(String workspaceId, CreateImageDetectionTaskRequest request, CreateImageDetectionTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileInfo)) {
            body.put("fileInfo", request.fileInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xLoadTest)) {
            realHeaders.put("X-Load-Test", com.aliyun.teautil.Common.toJSONString(headers.xLoadTest));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageDetectionTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/imageDetect/task/submit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageDetectionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建图片检测任务</p>
     * 
     * @param request CreateImageDetectionTaskRequest
     * @return CreateImageDetectionTaskResponse
     */
    public CreateImageDetectionTaskResponse createImageDetectionTask(String workspaceId, CreateImageDetectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateImageDetectionTaskHeaders headers = new CreateImageDetectionTaskHeaders();
        return this.createImageDetectionTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>Obtain the workspace ID: Retrieve the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a document library. A document library isolates document and index data. If your use case requires frequent natural language search by category, create multiple libraries to isolate different data types. You can customize vector and text indexes by format.</p>
     * 
     * @param request CreateLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLibraryResponse
     */
    public CreateLibraryResponse createLibraryWithOptions(String workspaceId, CreateLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexSetting)) {
            body.put("indexSetting", request.indexSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryName)) {
            body.put("libraryName", request.libraryName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLibrary"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLibraryResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>Obtain the workspace ID: Retrieve the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a document library. A document library isolates document and index data. If your use case requires frequent natural language search by category, create multiple libraries to isolate different data types. You can customize vector and text indexes by format.</p>
     * 
     * @param request CreateLibraryRequest
     * @return CreateLibraryResponse
     */
    public CreateLibraryResponse createLibrary(String workspaceId, CreateLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLibraryWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you use this operation, review the billing methods and pricing for Alibaba Cloud Tongyi Dianjin.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>You have obtained a workspace ID. To obtain your <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace ID</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a PDF document translation task. Submit the task to start asynchronous translation.</p>
     * 
     * @param request CreatePdfTranslateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePdfTranslateTaskResponse
     */
    public CreatePdfTranslateTaskResponse createPdfTranslateTaskWithOptions(String workspaceId, CreatePdfTranslateTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docId)) {
            body.put("docId", request.docId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledge)) {
            body.put("knowledge", request.knowledge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translateTo)) {
            body.put("translateTo", request.translateTo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePdfTranslateTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/pdfTranslate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePdfTranslateTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you use this operation, review the billing methods and pricing for Alibaba Cloud Tongyi Dianjin.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>You have obtained a workspace ID. To obtain your <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace ID</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a PDF document translation task. Submit the task to start asynchronous translation.</p>
     * 
     * @param request CreatePdfTranslateTaskRequest
     * @return CreatePdfTranslateTaskResponse
     */
    public CreatePdfTranslateTaskResponse createPdfTranslateTask(String workspaceId, CreatePdfTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPdfTranslateTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before using this API, review the billing methods and pricing for Tongyi Dianjin.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>Activate Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>Obtain a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get a workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates document chunks based on your business scenarios.</p>
     * 
     * @param request CreatePredefinedDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePredefinedDocumentResponse
     */
    public CreatePredefinedDocumentResponse createPredefinedDocumentWithOptions(String workspaceId, CreatePredefinedDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chunks)) {
            body.put("chunks", request.chunks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadata)) {
            body.put("metadata", request.metadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePredefinedDocument"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/createPredefinedDocument"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePredefinedDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before using this API, review the billing methods and pricing for Tongyi Dianjin.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>Activate Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>Obtain a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get a workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates document chunks based on your business scenarios.</p>
     * 
     * @param request CreatePredefinedDocumentRequest
     * @return CreatePredefinedDocumentResponse
     */
    public CreatePredefinedDocumentResponse createPredefinedDocument(String workspaceId, CreatePredefinedDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPredefinedDocumentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before using this API, review the pricing and billing methods for the Tongyi Dianjin product.
     * Prerequisites
     * Activate Alibaba Cloud Model Studio and Tongyi Dianjin services.
     * Obtain the workspaceId: Retrieve the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a quality check task.</p>
     * 
     * @param request CreateQualityCheckTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQualityCheckTaskResponse
     */
    public CreateQualityCheckTaskResponse createQualityCheckTaskWithOptions(String workspaceId, CreateQualityCheckTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationList)) {
            body.put("conversationList", request.conversationList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtService)) {
            body.put("gmtService", request.gmtService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaData)) {
            body.put("metaData", request.metaData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualityGroup)) {
            body.put("qualityGroup", request.qualityGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            body.put("sceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQualityCheckTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/qualitycheck/task/submit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQualityCheckTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before using this API, review the pricing and billing methods for the Tongyi Dianjin product.
     * Prerequisites
     * Activate Alibaba Cloud Model Studio and Tongyi Dianjin services.
     * Obtain the workspaceId: Retrieve the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a quality check task.</p>
     * 
     * @param request CreateQualityCheckTaskRequest
     * @return CreateQualityCheckTaskResponse
     */
    public CreateQualityCheckTaskResponse createQualityCheckTask(String workspaceId, CreateQualityCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createQualityCheckTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建视频生成任务</p>
     * 
     * @param request CreateVideoCreationTaskRequest
     * @param headers CreateVideoCreationTaskHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVideoCreationTaskResponse
     */
    public CreateVideoCreationTaskResponse createVideoCreationTaskWithOptions(String workspaceId, CreateVideoCreationTaskRequest request, CreateVideoCreationTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creationInstruction)) {
            body.put("creationInstruction", request.creationInstruction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileInfo)) {
            body.put("fileInfo", request.fileInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageDetectionTaskId)) {
            body.put("imageDetectionTaskId", request.imageDetectionTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xLoadTest)) {
            realHeaders.put("X-Load-Test", com.aliyun.teautil.Common.toJSONString(headers.xLoadTest));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVideoCreationTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/videoCreation/task/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVideoCreationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建视频生成任务</p>
     * 
     * @param request CreateVideoCreationTaskRequest
     * @return CreateVideoCreationTaskResponse
     */
    public CreateVideoCreationTaskResponse createVideoCreationTask(String workspaceId, CreateVideoCreationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateVideoCreationTaskHeaders headers = new CreateVideoCreationTaskHeaders();
        return this.createVideoCreationTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>A callback event that indicates the completion of a Dashscope asynchronous task.</p>
     * 
     * @param request DashscopeAsyncTaskFinishEventRequest
     * @param headers DashscopeAsyncTaskFinishEventHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DashscopeAsyncTaskFinishEventResponse
     */
    public DashscopeAsyncTaskFinishEventResponse dashscopeAsyncTaskFinishEventWithOptions(String workspaceId, DashscopeAsyncTaskFinishEventRequest request, DashscopeAsyncTaskFinishEventHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xLoadTest)) {
            realHeaders.put("X-Load-Test", com.aliyun.teautil.Common.toJSONString(headers.xLoadTest));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DashscopeAsyncTaskFinishEvent"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/event/dashscopeAsyncTaskFinish"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DashscopeAsyncTaskFinishEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>A callback event that indicates the completion of a Dashscope asynchronous task.</p>
     * 
     * @param request DashscopeAsyncTaskFinishEventRequest
     * @return DashscopeAsyncTaskFinishEventResponse
     */
    public DashscopeAsyncTaskFinishEventResponse dashscopeAsyncTaskFinishEvent(String workspaceId, DashscopeAsyncTaskFinishEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DashscopeAsyncTaskFinishEventHeaders headers = new DashscopeAsyncTaskFinishEventHeaders();
        return this.dashscopeAsyncTaskFinishEventWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin services.</li>
     * <li>Obtain your workspace ID: retrieve your <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a document. After deletion, you cannot view the original document or recall it.</p>
     * 
     * @param request DeleteDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDocumentResponse
     */
    public DeleteDocumentResponse deleteDocumentWithOptions(String workspaceId, DeleteDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docIds)) {
            body.put("docIds", request.docIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDocument"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin services.</li>
     * <li>Obtain your workspace ID: retrieve your <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a document. After deletion, you cannot view the original document or recall it.</p>
     * 
     * @param request DeleteDocumentRequest
     * @return DeleteDocumentResponse
     */
    public DeleteDocumentResponse deleteDocument(String workspaceId, DeleteDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDocumentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>Activate Alibaba Cloud Model Studio and Tongyi Dianjin services.</li>
     * <li>Obtain your workspaceId. For more information, refer to the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Delete a document library. ⚠️ This operation deletes the library and all its associated documents.</p>
     * 
     * @param request DeleteLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLibraryResponse
     */
    public DeleteLibraryResponse deleteLibraryWithOptions(String workspaceId, DeleteLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            query.put("libraryId", request.libraryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLibrary"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLibraryResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>Activate Alibaba Cloud Model Studio and Tongyi Dianjin services.</li>
     * <li>Obtain your workspaceId. For more information, refer to the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Delete a document library. ⚠️ This operation deletes the library and all its associated documents.</p>
     * 
     * @param request DeleteLibraryRequest
     * @return DeleteLibraryResponse
     */
    public DeleteLibraryResponse deleteLibrary(String workspaceId, DeleteLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLibraryWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This API uses the WebSocket protocol to perform real-time conversational transcription, intent recognition, and speech synthesis. It supports various audio formats for both input and output to ensure real-time performance and high compatibility.</p>
     * 
     * @param request EndToEndRealTimeDialogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EndToEndRealTimeDialogResponse
     */
    public EndToEndRealTimeDialogResponse endToEndRealTimeDialogWithOptions(String workspaceId, EndToEndRealTimeDialogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asrModelId)) {
            query.put("asrModelId", request.asrModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputFormat)) {
            query.put("inputFormat", request.inputFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputFormat)) {
            query.put("outputFormat", request.outputFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pitchRate)) {
            query.put("pitchRate", request.pitchRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleRate)) {
            query.put("sampleRate", request.sampleRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechRate)) {
            query.put("speechRate", request.speechRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsModelId)) {
            query.put("ttsModelId", request.ttsModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceCode)) {
            query.put("voiceCode", request.voiceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EndToEndRealTimeDialog"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/ws/realtime/dialog"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EndToEndRealTimeDialogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This API uses the WebSocket protocol to perform real-time conversational transcription, intent recognition, and speech synthesis. It supports various audio formats for both input and output to ensure real-time performance and high compatibility.</p>
     * 
     * @param request EndToEndRealTimeDialogRequest
     * @return EndToEndRealTimeDialogResponse
     */
    public EndToEndRealTimeDialogResponse endToEndRealTimeDialog(String workspaceId, EndToEndRealTimeDialogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.endToEndRealTimeDialogWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Terminate the job.</p>
     * 
     * @param request EvictTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EvictTaskResponse
     */
    public EvictTaskResponse evictTaskWithOptions(String workspaceId, EvictTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "EvictTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/evict"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EvictTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Terminate the job.</p>
     * 
     * @param request EvictTaskRequest
     * @return EvictTaskResponse
     */
    public EvictTaskResponse evictTask(String workspaceId, EvictTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.evictTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>兑换权益</p>
     * 
     * @param request ExchangeEntitlementRequest
     * @param headers ExchangeEntitlementHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExchangeEntitlementResponse
     */
    public ExchangeEntitlementResponse exchangeEntitlementWithOptions(String workspaceId, String tenantId, ExchangeEntitlementRequest request, ExchangeEntitlementHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalUserId)) {
            body.put("externalUserId", request.externalUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyHash)) {
            body.put("keyHash", request.keyHash);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("templateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("userName", request.userName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xLoadTest)) {
            realHeaders.put("X-Load-Test", com.aliyun.teautil.Common.toJSONString(headers.xLoadTest));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExchangeEntitlement"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(tenantId) + "/redeem"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExchangeEntitlementResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>兑换权益</p>
     * 
     * @param request ExchangeEntitlementRequest
     * @return ExchangeEntitlementResponse
     */
    public ExchangeEntitlementResponse exchangeEntitlement(String workspaceId, String tenantId, ExchangeEntitlementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExchangeEntitlementHeaders headers = new ExchangeEntitlementHeaders();
        return this.exchangeEntitlementWithOptions(workspaceId, tenantId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, make sure you understand the billing methods and pricing of the Tongyi Dianjin product.
     * Prerequisites
     * Activate Alibaba Cloud Model Studio and the Tongyi Dianjin service.
     * Obtain a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get a workspace ID</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Parses question and answer (Q&amp;A) pairs from a document. You can use the UpdateQaLibrary API to update the Q&amp;A pairs.</p>
     * 
     * @param request GenDocQaResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenDocQaResultResponse
     */
    public GenDocQaResultResponse genDocQaResultWithOptions(String workspaceId, GenDocQaResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docId)) {
            body.put("docId", request.docId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenDocQaResult"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/virtualHuman/qa/parse"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenDocQaResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, make sure you understand the billing methods and pricing of the Tongyi Dianjin product.
     * Prerequisites
     * Activate Alibaba Cloud Model Studio and the Tongyi Dianjin service.
     * Obtain a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get a workspace ID</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Parses question and answer (Q&amp;A) pairs from a document. You can use the UpdateQaLibrary API to update the Q&amp;A pairs.</p>
     * 
     * @param request GenDocQaResultRequest
     * @return GenDocQaResultResponse
     */
    public GenDocQaResultResponse genDocQaResult(String workspaceId, GenDocQaResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.genDocQaResultWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Gold services.</li>
     * <li>You can obtain the workspace ID. For details, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%E3%80%9DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve app configuration.</p>
     * 
     * @param request GetAppConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppConfigResponse
     */
    public GetAppConfigResponse getAppConfigWithOptions(String workspaceId, GetAppConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppConfig"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/app/config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Gold services.</li>
     * <li>You can obtain the workspace ID. For details, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%E3%80%9DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve app configuration.</p>
     * 
     * @param request GetAppConfigRequest
     * @return GetAppConfigResponse
     */
    public GetAppConfigResponse getAppConfig(String workspaceId, GetAppConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppConfigWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the Q&amp;A results generated by the SubmitChatQuestion API.</p>
     * 
     * @param request GetChatQuestionRespRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatQuestionRespResponse
     */
    public GetChatQuestionRespResponse getChatQuestionRespWithOptions(String workspaceId, GetChatQuestionRespRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            body.put("batchId", request.batchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatQuestionResp"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/virtualHuman/chat/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatQuestionRespResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the Q&amp;A results generated by the SubmitChatQuestion API.</p>
     * 
     * @param request GetChatQuestionRespRequest
     * @return GetChatQuestionRespResponse
     */
    public GetChatQuestionRespResponse getChatQuestionResp(String workspaceId, GetChatQuestionRespRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getChatQuestionRespWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve session analysis results. You can retrieve results in batches by specifying a list of session IDs or a time range.</p>
     * 
     * @param request GetDialogAnalysisResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDialogAnalysisResultResponse
     */
    public GetDialogAnalysisResultResponse getDialogAnalysisResultWithOptions(String workspaceId, GetDialogAnalysisResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            body.put("asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionIds)) {
            body.put("sessionIds", request.sessionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useUrl)) {
            body.put("useUrl", request.useUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDialogAnalysisResult"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/virtualHuman/dialog/analysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDialogAnalysisResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve session analysis results. You can retrieve results in batches by specifying a list of session IDs or a time range.</p>
     * 
     * @param request GetDialogAnalysisResultRequest
     * @return GetDialogAnalysisResultResponse
     */
    public GetDialogAnalysisResultResponse getDialogAnalysisResult(String workspaceId, GetDialogAnalysisResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDialogAnalysisResultWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve session details.</p>
     * 
     * @param request GetDialogDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDialogDetailResponse
     */
    public GetDialogDetailResponse getDialogDetailWithOptions(String workspaceId, GetDialogDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDialogDetail"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/virtualHuman/dialog/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDialogDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve session details.</p>
     * 
     * @param request GetDialogDetailRequest
     * @return GetDialogDetailResponse
     */
    public GetDialogDetailResponse getDialogDetail(String workspaceId, GetDialogDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDialogDetailWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API retrieves conversation records between customers and service agents, along with intent analysis results generated by the model.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves records of real-time conversations and the results of intent analysis.</p>
     * 
     * @param request GetDialogLogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDialogLogResponse
     */
    public GetDialogLogResponse getDialogLogWithOptions(String workspaceId, GetDialogLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDialogLog"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/dialog/log"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDialogLogResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API retrieves conversation records between customers and service agents, along with intent analysis results generated by the model.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves records of real-time conversations and the results of intent analysis.</p>
     * 
     * @param request GetDialogLogRequest
     * @return GetDialogLogResponse
     */
    public GetDialogLogResponse getDialogLog(String workspaceId, GetDialogLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDialogLogWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>Activate Alibaba Cloud Model Studio and Tongyi Gold Service.</li>
     * <li>Obtain the workspaceId and the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%B3">workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve a list of document chunks. You can filter them by query conditions.</p>
     * 
     * @param request GetDocumentChunkListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentChunkListResponse
     */
    public GetDocumentChunkListResponse getDocumentChunkListWithOptions(String workspaceId, GetDocumentChunkListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chunkIdList)) {
            body.put("chunkIdList", request.chunkIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docId)) {
            body.put("docId", request.docId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchQuery)) {
            body.put("searchQuery", request.searchQuery);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentChunkList"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/getDocumentChunk"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentChunkListResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>Activate Alibaba Cloud Model Studio and Tongyi Gold Service.</li>
     * <li>Obtain the workspaceId and the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%B3">workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve a list of document chunks. You can filter them by query conditions.</p>
     * 
     * @param request GetDocumentChunkListRequest
     * @return GetDocumentChunkListResponse
     */
    public GetDocumentChunkListResponse getDocumentChunkList(String workspaceId, GetDocumentChunkListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocumentChunkListWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and the Tongyi Gold Point service.</li>
     * <li>You have obtained a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get a workspace ID</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of documents from a document library. This operation supports paged queries and filtering by document status.</p>
     * 
     * @param request GetDocumentListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentListResponse
     */
    public GetDocumentListResponse getDocumentListWithOptions(String workspaceId, GetDocumentListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            query.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentList"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/listDocument"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentListResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and the Tongyi Gold Point service.</li>
     * <li>You have obtained a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get a workspace ID</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of documents from a document library. This operation supports paged queries and filtering by document status.</p>
     * 
     * @param request GetDocumentListRequest
     * @return GetDocumentListResponse
     */
    public GetDocumentListResponse getDocumentList(String workspaceId, GetDocumentListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocumentListWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get the workspace ID</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve a download URL for a document. The URL expires after 1 hour.</p>
     * 
     * @param request GetDocumentUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentUrlResponse
     */
    public GetDocumentUrlResponse getDocumentUrlWithOptions(String workspaceId, GetDocumentUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentId)) {
            query.put("documentId", request.documentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentUrl"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/url"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get the workspace ID</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve a download URL for a document. The URL expires after 1 hour.</p>
     * 
     * @param request GetDocumentUrlRequest
     * @return GetDocumentUrlResponse
     */
    public GetDocumentUrlResponse getDocumentUrl(String workspaceId, GetDocumentUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocumentUrlWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.
     * To obtain the workspace ID, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">the document about obtaining the workspace ID</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation retrieves a list of documents. You can filter documents by metadata or use paging.</p>
     * 
     * @param request GetFilterDocumentListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFilterDocumentListResponse
     */
    public GetFilterDocumentListResponse getFilterDocumentListWithOptions(String workspaceId, GetFilterDocumentListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.and)) {
            body.put("and", request.and);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docIdList)) {
            body.put("docIdList", request.docIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.or)) {
            body.put("or", request.or);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFilterDocumentList"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/filterDocument"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFilterDocumentListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.
     * To obtain the workspace ID, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">the document about obtaining the workspace ID</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation retrieves a list of documents. You can filter documents by metadata or use paging.</p>
     * 
     * @param request GetFilterDocumentListRequest
     * @return GetFilterDocumentListResponse
     */
    public GetFilterDocumentListResponse getFilterDocumentList(String workspaceId, GetFilterDocumentListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFilterDocumentListWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve conversation history records by business type.</p>
     * 
     * @param request GetHistoryListByBizTypeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHistoryListByBizTypeResponse
     */
    public GetHistoryListByBizTypeResponse getHistoryListByBizTypeWithOptions(String workspaceId, GetHistoryListByBizTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("bizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("bizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHistoryListByBizType"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/history/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHistoryListByBizTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve conversation history records by business type.</p>
     * 
     * @param request GetHistoryListByBizTypeRequest
     * @return GetHistoryListByBizTypeResponse
     */
    public GetHistoryListByBizTypeResponse getHistoryListByBizType(String workspaceId, GetHistoryListByBizTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHistoryListByBizTypeWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取检测结果</p>
     * 
     * @param request GetImageDetectionTaskResultRequest
     * @param headers GetImageDetectionTaskResultHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageDetectionTaskResultResponse
     */
    public GetImageDetectionTaskResultResponse getImageDetectionTaskResultWithOptions(String workspaceId, GetImageDetectionTaskResultRequest request, GetImageDetectionTaskResultHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xLoadTest)) {
            realHeaders.put("X-Load-Test", com.aliyun.teautil.Common.toJSONString(headers.xLoadTest));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageDetectionTaskResult"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/imageDetect/task/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageDetectionTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取检测结果</p>
     * 
     * @param request GetImageDetectionTaskResultRequest
     * @return GetImageDetectionTaskResultResponse
     */
    public GetImageDetectionTaskResultResponse getImageDetectionTaskResult(String workspaceId, GetImageDetectionTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetImageDetectionTaskResultHeaders headers = new GetImageDetectionTaskResultHeaders();
        return this.getImageDetectionTaskResultWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>Activate the Alibaba Cloud Model Studio and Tongyi Dianjin services.</li>
     * <li>Obtain a <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the detailed configuration of a document library, including its name, description, and index settings.</p>
     * 
     * @param request GetLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLibraryResponse
     */
    public GetLibraryResponse getLibraryWithOptions(String workspaceId, GetLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            query.put("libraryId", request.libraryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibrary"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/get"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibraryResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>Activate the Alibaba Cloud Model Studio and Tongyi Dianjin services.</li>
     * <li>Obtain a <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the detailed configuration of a document library, including its name, description, and index settings.</p>
     * 
     * @param request GetLibraryRequest
     * @return GetLibraryResponse
     */
    public GetLibraryResponse getLibrary(String workspaceId, GetLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibraryWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Prerequisites</p>
     * <ul>
     * <li>You must activate Alibaba Cloud Model Studio and Tongyi Dianjin services.</li>
     * <li>Obtain the workspaceId. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the document library list. The list includes document names, descriptions, and unique identifiers.</p>
     * 
     * @param request GetLibraryListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLibraryListResponse
     */
    public GetLibraryListResponse getLibraryListWithOptions(String workspaceId, GetLibraryListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibraryList"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibraryListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Prerequisites</p>
     * <ul>
     * <li>You must activate Alibaba Cloud Model Studio and Tongyi Dianjin services.</li>
     * <li>Obtain the workspaceId. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the document library list. The list includes document names, descriptions, and unique identifiers.</p>
     * 
     * @param request GetLibraryListRequest
     * @return GetLibraryListResponse
     */
    public GetLibraryListResponse getLibraryList(String workspaceId, GetLibraryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibraryListWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Gold services.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">the workspace identity document</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve document parsing results. You can query the document\&quot;s parsing status and obtain the parsing results.</p>
     * 
     * @param request GetParseResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetParseResultResponse
     */
    public GetParseResultResponse getParseResultWithOptions(String workspaceId, GetParseResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docId)) {
            body.put("docId", request.docId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useUrlResult)) {
            body.put("useUrlResult", request.useUrlResult);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetParseResult"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/getParseResult"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetParseResultResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Gold services.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">the workspace identity document</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve document parsing results. You can query the document\&quot;s parsing status and obtain the parsing results.</p>
     * 
     * @param request GetParseResultRequest
     * @return GetParseResultResponse
     */
    public GetParseResultResponse getParseResult(String workspaceId, GetParseResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getParseResultWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve quality check results.</p>
     * 
     * @param request GetQualityCheckTaskResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityCheckTaskResultResponse
     */
    public GetQualityCheckTaskResultResponse getQualityCheckTaskResultWithOptions(String workspaceId, GetQualityCheckTaskResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetQualityCheckTaskResult"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/qualitycheck/task/query"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityCheckTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve quality check results.</p>
     * 
     * @param request GetQualityCheckTaskResultRequest
     * @return GetQualityCheckTaskResultResponse
     */
    public GetQualityCheckTaskResultResponse getQualityCheckTaskResult(String workspaceId, GetQualityCheckTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQualityCheckTaskResultWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取报告结果</p>
     * 
     * @param request GetReportResponseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetReportResponseResponse
     */
    public GetReportResponseResponse getReportResponseWithOptions(String workspaceId, String sceneCode, String fundProduct, String outRequestNo, GetReportResponseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReportResponse"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/firefly/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneCode) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(fundProduct) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(outRequestNo) + "/report"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReportResponseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取报告结果</p>
     * 
     * @param request GetReportResponseRequest
     * @return GetReportResponseResponse
     */
    public GetReportResponseResponse getReportResponse(String workspaceId, String sceneCode, String fundProduct, String outRequestNo, GetReportResponseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getReportResponseWithOptions(workspaceId, sceneCode, fundProduct, outRequestNo, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务状态</p>
     * 
     * @param request GetReportTaskStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetReportTaskStatusResponse
     */
    public GetReportTaskStatusResponse getReportTaskStatusWithOptions(String workspaceId, String sceneCode, String fundProduct, String outRequestNo, GetReportTaskStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReportTaskStatus"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/firefly/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneCode) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(fundProduct) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(outRequestNo) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReportTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务状态</p>
     * 
     * @param request GetReportTaskStatusRequest
     * @return GetReportTaskStatusResponse
     */
    public GetReportTaskStatusResponse getReportTaskStatus(String workspaceId, String sceneCode, String fundProduct, String outRequestNo, GetReportTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getReportTaskStatusWithOptions(workspaceId, sceneCode, fundProduct, outRequestNo, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the result of a financial report summary task.</p>
     * 
     * @param request GetSummaryTaskResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSummaryTaskResultResponse
     */
    public GetSummaryTaskResultResponse getSummaryTaskResultWithOptions(String workspaceId, GetSummaryTaskResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetSummaryTaskResult"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/summary/result"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSummaryTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the result of a financial report summary task.</p>
     * 
     * @param request GetSummaryTaskResultRequest
     * @return GetSummaryTaskResultResponse
     */
    public GetSummaryTaskResultResponse getSummaryTaskResult(String workspaceId, GetSummaryTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSummaryTaskResultWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the result of an asynchronous task.</p>
     * 
     * @param request GetTaskResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResultResponse
     */
    public GetTaskResultResponse getTaskResultWithOptions(String workspaceId, GetTaskResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetTaskResult"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/result"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the result of an asynchronous task.</p>
     * 
     * @param request GetTaskResultRequest
     * @return GetTaskResultResponse
     */
    public GetTaskResultResponse getTaskResult(String workspaceId, GetTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskResultWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the status of a task.</p>
     * 
     * @param request GetTaskStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskStatusResponse
     */
    public GetTaskStatusResponse getTaskStatusWithOptions(String workspaceId, GetTaskStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetTaskStatus"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the status of a task.</p>
     * 
     * @param request GetTaskStatusRequest
     * @return GetTaskStatusResponse
     */
    public GetTaskStatusResponse getTaskStatus(String workspaceId, GetTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskStatusWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用量明细</p>
     * 
     * @param request GetUsageRequest
     * @param headers GetUsageHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUsageResponse
     */
    public GetUsageResponse getUsageWithOptions(String workspaceId, String tenantId, GetUsageRequest request, GetUsageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalUserId)) {
            query.put("externalUserId", request.externalUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redemptionOrderNo)) {
            query.put("redemptionOrderNo", request.redemptionOrderNo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xLoadTest)) {
            realHeaders.put("X-Load-Test", com.aliyun.teautil.Common.toJSONString(headers.xLoadTest));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUsage"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(tenantId) + "/usage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用量明细</p>
     * 
     * @param request GetUsageRequest
     * @return GetUsageResponse
     */
    public GetUsageResponse getUsage(String workspaceId, String tenantId, GetUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUsageHeaders headers = new GetUsageHeaders();
        return this.getUsageWithOptions(workspaceId, tenantId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取视频生成任务结果</p>
     * 
     * @param request GetVideoCreationTaskResultRequest
     * @param headers GetVideoCreationTaskResultHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoCreationTaskResultResponse
     */
    public GetVideoCreationTaskResultResponse getVideoCreationTaskResultWithOptions(String workspaceId, GetVideoCreationTaskResultRequest request, GetVideoCreationTaskResultHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xLoadTest)) {
            realHeaders.put("X-Load-Test", com.aliyun.teautil.Common.toJSONString(headers.xLoadTest));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoCreationTaskResult"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/videoCreation/task/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoCreationTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取视频生成任务结果</p>
     * 
     * @param request GetVideoCreationTaskResultRequest
     * @return GetVideoCreationTaskResultResponse
     */
    public GetVideoCreationTaskResultResponse getVideoCreationTaskResult(String workspaceId, GetVideoCreationTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetVideoCreationTaskResultHeaders headers = new GetVideoCreationTaskResultHeaders();
        return this.getVideoCreationTaskResultWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin services.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get the workspace ID</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call a plugin and retrieve its response.</p>
     * 
     * @param request InvokePluginRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvokePluginResponse
     */
    public InvokePluginResponse invokePluginWithOptions(String workspaceId, InvokePluginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            body.put("pluginId", request.pluginId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokePlugin"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/plugin/invoke"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokePluginResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin services.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get the workspace ID</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call a plugin and retrieve its response.</p>
     * 
     * @param request InvokePluginRequest
     * @return InvokePluginResponse
     */
    public InvokePluginResponse invokePlugin(String workspaceId, InvokePluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.invokePluginWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You must activate Alibaba Cloud Model Studio and Tongyi Gold services.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Preview documents. Retrieve document download links, types, and titles. Use this operation to preview documents.</p>
     * 
     * @param request PreviewDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreviewDocumentResponse
     */
    public PreviewDocumentResponse previewDocumentWithOptions(String workspaceId, PreviewDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentId)) {
            query.put("documentId", request.documentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewDocument"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/preview"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You must activate Alibaba Cloud Model Studio and Tongyi Gold services.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Preview documents. Retrieve document download links, types, and titles. Use this operation to preview documents.</p>
     * 
     * @param request PreviewDocumentRequest
     * @return PreviewDocumentResponse
     */
    public PreviewDocumentResponse previewDocument(String workspaceId, PreviewDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewDocumentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询兑换记录</p>
     * 
     * @param request QueryApiKeysRequest
     * @param headers QueryApiKeysHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryApiKeysResponse
     */
    public QueryApiKeysResponse queryApiKeysWithOptions(String workspaceId, String tenantId, QueryApiKeysRequest request, QueryApiKeysHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalUserId)) {
            query.put("externalUserId", request.externalUserId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xLoadTest)) {
            realHeaders.put("X-Load-Test", com.aliyun.teautil.Common.toJSONString(headers.xLoadTest));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryApiKeys"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(tenantId) + "/apikeys"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryApiKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询兑换记录</p>
     * 
     * @param request QueryApiKeysRequest
     * @return QueryApiKeysResponse
     */
    public QueryApiKeysResponse queryApiKeys(String workspaceId, String tenantId, QueryApiKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryApiKeysHeaders headers = new QueryApiKeysHeaders();
        return this.queryApiKeysWithOptions(workspaceId, tenantId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询兑换记录</p>
     * 
     * @param request QueryRedemptionRecordsRequest
     * @param headers QueryRedemptionRecordsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRedemptionRecordsResponse
     */
    public QueryRedemptionRecordsResponse queryRedemptionRecordsWithOptions(String workspaceId, String tenantId, QueryRedemptionRecordsRequest request, QueryRedemptionRecordsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalUserId)) {
            query.put("externalUserId", request.externalUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redemptionOrderNo)) {
            query.put("redemptionOrderNo", request.redemptionOrderNo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xLoadTest)) {
            realHeaders.put("X-Load-Test", com.aliyun.teautil.Common.toJSONString(headers.xLoadTest));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRedemptionRecords"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/v1/tenants/" + com.aliyun.openapiutil.Client.getEncodeParam(tenantId) + "/redemption-records"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRedemptionRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询兑换记录</p>
     * 
     * @param request QueryRedemptionRecordsRequest
     * @return QueryRedemptionRecordsResponse
     */
    public QueryRedemptionRecordsResponse queryRedemptionRecords(String workspaceId, String tenantId, QueryRedemptionRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryRedemptionRecordsHeaders headers = new QueryRedemptionRecordsHeaders();
        return this.queryRedemptionRecordsWithOptions(workspaceId, tenantId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you use this operation, review the billing method and pricing for Tongyi Dianjin.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>You have obtained a workspace ID: Retrieve the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reindexing reprocesses the specified document by parsing it, splitting it into chunks, and building a new index.</p>
     * 
     * @param request ReIndexRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReIndexResponse
     */
    public ReIndexResponse reIndexWithOptions(String workspaceId, ReIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentId)) {
            query.put("documentId", request.documentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReIndex"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/reIndex"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReIndexResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you use this operation, review the billing method and pricing for Tongyi Dianjin.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>You have obtained a workspace ID: Retrieve the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reindexing reprocesses the specified document by parsing it, splitting it into chunks, and building a new index.</p>
     * 
     * @param request ReIndexRequest
     * @return ReIndexResponse
     */
    public ReIndexResponse reIndex(String workspaceId, ReIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reIndexWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before using this API, make sure you understand the billing methods and pricing of the Tongyi Gold service.
     * Prerequisites
     * Alibaba Cloud Model Studio and the Tongyi Gold service are activated.
     * Obtain a workspaceId. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get an app ID and workspace</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a real-time session. After you create a session by calling the CreateDialog API, use this API to conduct the real-time interaction.</p>
     * 
     * @param request RealTimeDialogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RealTimeDialogResponse
     */
    public RealTimeDialogResponse realTimeDialogWithOptions(String workspaceId, RealTimeDialogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysis)) {
            body.put("analysis", request.analysis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("bizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationModel)) {
            body.put("conversationModel", request.conversationModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogMemoryTurns)) {
            body.put("dialogMemoryTurns", request.dialogMemoryTurns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaData)) {
            body.put("metaData", request.metaData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opType)) {
            body.put("opType", request.opType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recommend)) {
            body.put("recommend", request.recommend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptContentPlayed)) {
            body.put("scriptContentPlayed", request.scriptContentPlayed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVad)) {
            body.put("userVad", request.userVad);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RealTimeDialog"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/realtime/dialog/chat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RealTimeDialogResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before using this API, make sure you understand the billing methods and pricing of the Tongyi Gold service.
     * Prerequisites
     * Alibaba Cloud Model Studio and the Tongyi Gold service are activated.
     * Obtain a workspaceId. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get an app ID and workspace</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a real-time session. After you create a session by calling the CreateDialog API, use this API to conduct the real-time interaction.</p>
     * 
     * @param request RealTimeDialogRequest
     * @return RealTimeDialogResponse
     */
    public RealTimeDialogResponse realTimeDialog(String workspaceId, RealTimeDialogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.realTimeDialogWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, make sure that you understand the billing methods and <a href="https://help.aliyun.com/zh/model-studio/tongyi-dianjin-overview?spm=a2c4g.11186623.help-menu-2400256.d_1_6_6_0.15e77499sSMTGb">pricing</a> of Alibaba Cloud Model Studio DianJin.
     * Prerequisites
     * Activate the Alibaba Cloud Model Studio and Model Studio DianJin services.
     * Obtain the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a> to use as your workspaceId.</p>
     * 
     * <b>summary</b> : 
     * <p>Provides real-time dialog assistance after a session is created using CreateDialog. Note: This operation returns multiple intents, tags, and SOP flows. Unlike real-time sessions, it does not support streaming responses.</p>
     * 
     * @param request RealtimeDialogAssistRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RealtimeDialogAssistResponse
     */
    public RealtimeDialogAssistResponse realtimeDialogAssistWithOptions(String workspaceId, RealtimeDialogAssistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysis)) {
            body.put("analysis", request.analysis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("bizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationModel)) {
            body.put("conversationModel", request.conversationModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogMemoryTurns)) {
            body.put("dialogMemoryTurns", request.dialogMemoryTurns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hangUpDialog)) {
            body.put("hangUpDialog", request.hangUpDialog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaData)) {
            body.put("metaData", request.metaData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptContentPlayed)) {
            body.put("scriptContentPlayed", request.scriptContentPlayed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVad)) {
            body.put("userVad", request.userVad);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RealtimeDialogAssist"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/realtime/dialog/assist"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RealtimeDialogAssistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, make sure that you understand the billing methods and <a href="https://help.aliyun.com/zh/model-studio/tongyi-dianjin-overview?spm=a2c4g.11186623.help-menu-2400256.d_1_6_6_0.15e77499sSMTGb">pricing</a> of Alibaba Cloud Model Studio DianJin.
     * Prerequisites
     * Activate the Alibaba Cloud Model Studio and Model Studio DianJin services.
     * Obtain the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a> to use as your workspaceId.</p>
     * 
     * <b>summary</b> : 
     * <p>Provides real-time dialog assistance after a session is created using CreateDialog. Note: This operation returns multiple intents, tags, and SOP flows. Unlike real-time sessions, it does not support streaming responses.</p>
     * 
     * @param request RealtimeDialogAssistRequest
     * @return RealtimeDialogAssistResponse
     */
    public RealtimeDialogAssistResponse realtimeDialogAssist(String workspaceId, RealtimeDialogAssistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.realtimeDialogAssistWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, review the billing methods and pricing for the Dianjin service.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and the Dianjin service.
     * You have obtained a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get an app ID and workspace</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Rebuilds an existing task. You cannot rebuild tasks that are queued or currently executing.</p>
     * 
     * @param request RebuildTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebuildTaskResponse
     */
    public RebuildTaskResponse rebuildTaskWithOptions(String workspaceId, RebuildTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskIds)) {
            body.put("taskIds", request.taskIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebuildTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/rebuild"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebuildTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, review the billing methods and pricing for the Dianjin service.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and the Dianjin service.
     * You have obtained a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get an app ID and workspace</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Rebuilds an existing task. You cannot rebuild tasks that are queued or currently executing.</p>
     * 
     * @param request RebuildTaskRequest
     * @return RebuildTaskResponse
     */
    public RebuildTaskResponse rebuildTask(String workspaceId, RebuildTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rebuildTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>Activate the Alibaba Cloud Model Studio service and the Tongyi Dianjin service.</li>
     * <li>Obtain the workspace ID. Obtain the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%93%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can retrieve document chunks from a document library using text. You can specify the number of chunks to retrieve, filter them by metadata conditions, and choose whether to complete the document chunks.</p>
     * 
     * @param request RecallDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecallDocumentResponse
     */
    public RecallDocumentResponse recallDocumentWithOptions(String workspaceId, RecallDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            body.put("filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rearrangement)) {
            body.put("rearrangement", request.rearrangement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topK)) {
            body.put("topK", request.topK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecallDocument"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/recallDocument"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecallDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>Activate the Alibaba Cloud Model Studio service and the Tongyi Dianjin service.</li>
     * <li>Obtain the workspace ID. Obtain the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%93%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can retrieve document chunks from a document library using text. You can specify the number of chunks to retrieve, filter them by metadata conditions, and choose whether to complete the document chunks.</p>
     * 
     * @param request RecallDocumentRequest
     * @return RecallDocumentResponse
     */
    public RecallDocumentResponse recallDocument(String workspaceId, RecallDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recallDocumentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you use this operation, review the billing methods and pricing of Alibaba Cloud Tongyi Dianjin.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>You have obtained a <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace ID</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects intents. This operation supports global and hierarchical intent detection, attitude detection, and enterprise detection.</p>
     * 
     * @param request RecognizeIntentionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeIntentionResponse
     */
    public RecognizeIntentionResponse recognizeIntentionWithOptions(String workspaceId, RecognizeIntentionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysis)) {
            body.put("analysis", request.analysis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("bizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversation)) {
            body.put("conversation", request.conversation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalIntentionList)) {
            body.put("globalIntentionList", request.globalIntentionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hierarchicalIntentionList)) {
            body.put("hierarchicalIntentionList", request.hierarchicalIntentionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionDomainCode)) {
            body.put("intentionDomainCode", request.intentionDomainCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionList)) {
            body.put("intentionList", request.intentionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opType)) {
            body.put("opType", request.opType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recommend)) {
            body.put("recommend", request.recommend);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeIntention"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/recog/intent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeIntentionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you use this operation, review the billing methods and pricing of Alibaba Cloud Tongyi Dianjin.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>You have obtained a <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace ID</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects intents. This operation supports global and hierarchical intent detection, attitude detection, and enterprise detection.</p>
     * 
     * @param request RecognizeIntentionRequest
     * @return RecognizeIntentionResponse
     */
    public RecognizeIntentionResponse recognizeIntention(String workspaceId, RecognizeIntentionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recognizeIntentionWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重试任务</p>
     * 
     * @param request RetryReportTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryReportTaskResponse
     */
    public RetryReportTaskResponse retryReportTaskWithOptions(String workspaceId, String sceneCode, String fundProduct, String outRequestNo, RetryReportTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryReportTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/firefly/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneCode) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(fundProduct) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(outRequestNo) + "/retry"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryReportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重试任务</p>
     * 
     * @param request RetryReportTaskRequest
     * @return RetryReportTaskResponse
     */
    public RetryReportTaskResponse retryReportTask(String workspaceId, String sceneCode, String fundProduct, String outRequestNo, RetryReportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryReportTaskWithOptions(workspaceId, sceneCode, fundProduct, outRequestNo, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, review the billing model and pricing for Tongyi Dianjin.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.
     * Obtain a workspace ID: <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Obtain your workspace ID</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Run an agent. This API supports both streaming and non-streaming responses.</p>
     * 
     * @param request RunAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunAgentResponse
     */
    public RunAgentResponse runAgentWithOptions(String workspaceId, RunAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.botId)) {
            body.put("botId", request.botId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threadId)) {
            body.put("threadId", request.threadId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useDraft)) {
            body.put("useDraft", request.useDraft);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userContent)) {
            body.put("userContent", request.userContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInputs)) {
            body.put("userInputs", request.userInputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("versionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunAgent"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/bot/thread/run"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, review the billing model and pricing for Tongyi Dianjin.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.
     * Obtain a workspace ID: <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Obtain your workspace ID</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Run an agent. This API supports both streaming and non-streaming responses.</p>
     * 
     * @param request RunAgentRequest
     * @return RunAgentResponse
     */
    public RunAgentResponse runAgent(String workspaceId, RunAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runAgentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, review the billing method and pricing for Alibaba Cloud Tongyi Dianjin.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>Activate Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>Obtain your workspace ID: retrieve your <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates chat responses. You can select a model for the conversation and choose streaming or non-streaming output.</p>
     * 
     * @param request RunChatResultGenerationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunChatResultGenerationResponse
     */
    public RunChatResultGenerationResponse runChatResultGenerationWithOptions(String workspaceId, RunChatResultGenerationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inferenceParameters)) {
            body.put("inferenceParameters", request.inferenceParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("messages", request.messages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tools)) {
            body.put("tools", request.tools);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunChatResultGeneration"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/run/chat/generation"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunChatResultGenerationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, review the billing method and pricing for Alibaba Cloud Tongyi Dianjin.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>Activate Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>Obtain your workspace ID: retrieve your <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates chat responses. You can select a model for the conversation and choose streaming or non-streaming output.</p>
     * 
     * @param request RunChatResultGenerationRequest
     * @return RunChatResultGenerationResponse
     */
    public RunChatResultGenerationResponse runChatResultGeneration(String workspaceId, RunChatResultGenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runChatResultGenerationWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, make sure that you understand the billing methods and pricing for Tongyi Gold.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Gold.
     * You must have a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves session analysis results through a streaming API.</p>
     * 
     * @param request RunDialogAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunDialogAnalysisResponse
     */
    public RunDialogAnalysisResponse runDialogAnalysisWithOptions(String workspaceId, RunDialogAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunDialogAnalysis"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/virtualHuman/dialog/stream/analysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunDialogAnalysisResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, make sure that you understand the billing methods and pricing for Tongyi Gold.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Gold.
     * You must have a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves session analysis results through a streaming API.</p>
     * 
     * @param request RunDialogAnalysisRequest
     * @return RunDialogAnalysisResponse
     */
    public RunDialogAnalysisResponse runDialogAnalysis(String workspaceId, RunDialogAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runDialogAnalysisWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a chat response from a document library. You can ask questions in natural language, and the system retrieves relevant information to provide a summarized answer.</p>
     * 
     * @param request RunLibraryChatGenerationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunLibraryChatGenerationResponse
     */
    public RunLibraryChatGenerationResponse runLibraryChatGenerationWithOptions(String workspaceId, RunLibraryChatGenerationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docIdList)) {
            body.put("docIdList", request.docIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableFollowUp)) {
            body.put("enableFollowUp", request.enableFollowUp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableMultiQuery)) {
            body.put("enableMultiQuery", request.enableMultiQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableOpenQa)) {
            body.put("enableOpenQa", request.enableOpenQa);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.followUpLlm)) {
            body.put("followUpLlm", request.followUpLlm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.llmType)) {
            body.put("llmType", request.llmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiQueryLlm)) {
            body.put("multiQueryLlm", request.multiQueryLlm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCriteria)) {
            body.put("queryCriteria", request.queryCriteria);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankType)) {
            body.put("rerankType", request.rerankType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subQueryList)) {
            body.put("subQueryList", request.subQueryList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textSearchParameter)) {
            body.put("textSearchParameter", request.textSearchParameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topK)) {
            body.put("topK", request.topK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vectorSearchParameter)) {
            body.put("vectorSearchParameter", request.vectorSearchParameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withDocumentReference)) {
            body.put("withDocumentReference", request.withDocumentReference);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunLibraryChatGeneration"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/run/library/chat/generation"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunLibraryChatGenerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a chat response from a document library. You can ask questions in natural language, and the system retrieves relevant information to provide a summarized answer.</p>
     * 
     * @param request RunLibraryChatGenerationRequest
     * @return RunLibraryChatGenerationResponse
     */
    public RunLibraryChatGenerationResponse runLibraryChatGeneration(String workspaceId, RunLibraryChatGenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runLibraryChatGenerationWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Review the pricing and billing details for the Tongyi Dianjin product before you use this API.
     * Prerequisites
     * Activate Alibaba Cloud Model Studio and Tongyi Dianjin.
     * Obtain the \<code>workspaceId\\</code>: Retrieve the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submit a list of questions and retrieve results by calling the <code>GetChatQuestionResp</code> API.</p>
     * 
     * @param request SubmitChatQuestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitChatQuestionResponse
     */
    public SubmitChatQuestionResponse submitChatQuestionWithOptions(String workspaceId, SubmitChatQuestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gmtService)) {
            body.put("gmtService", request.gmtService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveScriptContent)) {
            body.put("liveScriptContent", request.liveScriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openSmallTalk)) {
            body.put("openSmallTalk", request.openSmallTalk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.questionList)) {
            body.put("questionList", request.questionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitChatQuestion"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/virtualHuman/chat/submit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitChatQuestionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Review the pricing and billing details for the Tongyi Dianjin product before you use this API.
     * Prerequisites
     * Activate Alibaba Cloud Model Studio and Tongyi Dianjin.
     * Obtain the \<code>workspaceId\\</code>: Retrieve the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submit a list of questions and retrieve results by calling the <code>GetChatQuestionResp</code> API.</p>
     * 
     * @param request SubmitChatQuestionRequest
     * @return SubmitChatQuestionResponse
     */
    public SubmitChatQuestionResponse submitChatQuestion(String workspaceId, SubmitChatQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitChatQuestionWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>Activate the Alibaba Cloud Model Studio service and the Tongyi Gold service.</li>
     * <li>Obtain your workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the title, metadata, and other information of a document.</p>
     * 
     * @param request UpdateDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDocumentResponse
     */
    public UpdateDocumentResponse updateDocumentWithOptions(String workspaceId, UpdateDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docId)) {
            body.put("docId", request.docId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.meta)) {
            body.put("meta", request.meta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDocument"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/updateDocument"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>Activate the Alibaba Cloud Model Studio service and the Tongyi Gold service.</li>
     * <li>Obtain your workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the title, metadata, and other information of a document.</p>
     * 
     * @param request UpdateDocumentRequest
     * @return UpdateDocumentResponse
     */
    public UpdateDocumentResponse updateDocument(String workspaceId, UpdateDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDocumentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before using this API, ensure you understand the billing methods and pricing of the Tongyi Gold product.
     * Prerequisites
     * You must activate Alibaba Cloud Model Studio and Tongyi Gold services.
     * Obtain the workspaceId. For more information, see the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Update the text content of a document chunk in a document.</p>
     * 
     * @param request UpdateDocumentChunkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDocumentChunkResponse
     */
    public UpdateDocumentChunkResponse updateDocumentChunkWithOptions(String workspaceId, UpdateDocumentChunkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chunks)) {
            body.put("chunks", request.chunks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDocumentChunk"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/updateDocumentChunk"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDocumentChunkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before using this API, ensure you understand the billing methods and pricing of the Tongyi Gold product.
     * Prerequisites
     * You must activate Alibaba Cloud Model Studio and Tongyi Gold services.
     * Obtain the workspaceId. For more information, see the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Update the text content of a document chunk in a document.</p>
     * 
     * @param request UpdateDocumentChunkRequest
     * @return UpdateDocumentChunkResponse
     */
    public UpdateDocumentChunkResponse updateDocumentChunk(String workspaceId, UpdateDocumentChunkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDocumentChunkWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get the workspace ID</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a document library. You can update the library name, description, and index configuration.</p>
     * 
     * @param request UpdateLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLibraryResponse
     */
    public UpdateLibraryResponse updateLibraryWithOptions(String workspaceId, UpdateLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexSetting)) {
            body.put("indexSetting", request.indexSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryName)) {
            body.put("libraryName", request.libraryName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLibrary"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/update"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLibraryResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get the workspace ID</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a document library. You can update the library name, description, and index configuration.</p>
     * 
     * @param request UpdateLibraryRequest
     * @return UpdateLibraryResponse
     */
    public UpdateLibraryResponse updateLibrary(String workspaceId, UpdateLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLibraryWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a Q&amp;A library. After the update, use the GenDocQaResult API to parse the Q&amp;A pairs.</p>
     * 
     * @param request UpdateQaLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQaLibraryResponse
     */
    public UpdateQaLibraryResponse updateQaLibraryWithOptions(String workspaceId, UpdateQaLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parseQaResults)) {
            body.put("parseQaResults", request.parseQaResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qaLibraryId)) {
            body.put("qaLibraryId", request.qaLibraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQaLibrary"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/virtualHuman/qa/upload"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQaLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a Q&amp;A library. After the update, use the GenDocQaResult API to parse the Q&amp;A pairs.</p>
     * 
     * @param request UpdateQaLibraryRequest
     * @return UpdateQaLibraryResponse
     */
    public UpdateQaLibraryResponse updateQaLibrary(String workspaceId, UpdateQaLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateQaLibraryWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you use this operation, review the Tongyi Dianjin pricing details.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>You have obtained a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get the workspace ID</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upload a document to a document library. The system parses the document, splits it into chunks, and builds an index.</p>
     * 
     * @param request UploadDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadDocumentResponse
     */
    public UploadDocumentResponse uploadDocumentWithOptions(String workspaceId, UploadDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadDocument"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/upload"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you use this operation, review the Tongyi Dianjin pricing details.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>You have obtained a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get the workspace ID</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upload a document to a document library. The system parses the document, splits it into chunks, and builds an index.</p>
     * 
     * @param request UploadDocumentRequest
     * @return UploadDocumentResponse
     */
    public UploadDocumentResponse uploadDocument(String workspaceId, UploadDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadDocumentWithOptions(workspaceId, request, headers, runtime);
    }

    public UploadDocumentResponse uploadDocumentAdvance(String workspaceId, UploadDocumentAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("Product", "DianJin"),
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
        UploadDocumentRequest uploadDocumentReq = new UploadDocumentRequest();
        com.aliyun.openapiutil.Client.convert(request, uploadDocumentReq);
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
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            uploadDocumentReq.fileUrl = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        UploadDocumentResponse uploadDocumentResp = this.uploadDocumentWithOptions(workspaceId, uploadDocumentReq, headers, runtime);
        return uploadDocumentResp;
    }
}
