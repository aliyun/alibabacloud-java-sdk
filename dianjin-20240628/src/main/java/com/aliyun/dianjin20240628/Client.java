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
        this._endpointRule = "";
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
     * <p>创建按年文档总结任务</p>
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
     * <b>summary</b> : 
     * <p>创建按年文档总结任务</p>
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
     * <p>创建外呼会话</p>
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
     * <p>创建外呼会话</p>
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
     * <b>summary</b> : 
     * <p>创建会话分析任务</p>
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
     * <b>summary</b> : 
     * <p>创建会话分析任务</p>
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
     * <b>summary</b> : 
     * <p>创建财报总结任务</p>
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
     * <b>summary</b> : 
     * <p>创建财报总结任务</p>
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
     * <b>summary</b> : 
     * <p>创建财报总结任务</p>
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
     * <b>summary</b> : 
     * <p>创建财报总结任务</p>
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
     * <p>创建文档库</p>
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
     * <b>summary</b> : 
     * <p>创建文档库</p>
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
     * <b>summary</b> : 
     * <p>创建PDF翻译任务</p>
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
     * <b>summary</b> : 
     * <p>创建PDF翻译任务</p>
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
     * <b>summary</b> : 
     * <p>创建预定义文档</p>
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
     * <b>summary</b> : 
     * <p>创建预定义文档</p>
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
     * <b>summary</b> : 
     * <p>创建财报总结的任务</p>
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
     * <b>summary</b> : 
     * <p>创建财报总结的任务</p>
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
     * <p>删除文档</p>
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
     * <b>summary</b> : 
     * <p>删除文档</p>
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
     * <b>summary</b> : 
     * <p>删除文档库</p>
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
     * <b>summary</b> : 
     * <p>删除文档库</p>
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
     * <p>端到端实时对话</p>
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
     * <p>端到端实时对话</p>
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
     * <p>中断任务</p>
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
     * <p>中断任务</p>
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
     * <p>根据文档解析问答QA</p>
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
     * <b>summary</b> : 
     * <p>根据文档解析问答QA</p>
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
     * <b>summary</b> : 
     * <p>获取app配置</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppConfigResponse
     */
    public GetAppConfigResponse getAppConfigWithOptions(String workspaceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <b>summary</b> : 
     * <p>获取app配置</p>
     * @return GetAppConfigResponse
     */
    public GetAppConfigResponse getAppConfig(String workspaceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppConfigWithOptions(workspaceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取问答结果</p>
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
     * <p>获取问答结果</p>
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
     * <p>获取外呼会话分析结果</p>
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
     * <p>获取外呼会话分析结果</p>
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
     * <p>获取异步任务的结果</p>
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
     * <p>获取异步任务的结果</p>
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
     * <b>summary</b> : 
     * <p>查询会话日志</p>
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
     * <b>summary</b> : 
     * <p>查询会话日志</p>
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
     * <b>summary</b> : 
     * <p>获取文档的chunk列表</p>
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
     * <b>summary</b> : 
     * <p>获取文档的chunk列表</p>
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
     * <b>summary</b> : 
     * <p>分页查询文档库的文档列表</p>
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
     * <b>summary</b> : 
     * <p>分页查询文档库的文档列表</p>
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
     * <b>summary</b> : 
     * <p>获取文档URL</p>
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
     * <b>summary</b> : 
     * <p>获取文档URL</p>
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
     * <b>summary</b> : 
     * <p>带条件的分页查询文档库的文档列表</p>
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
     * <b>summary</b> : 
     * <p>带条件的分页查询文档库的文档列表</p>
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
     * <p>分页查询文档库列表</p>
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
     * <p>分页查询文档库列表</p>
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
     * <p>获取文档库配置详情</p>
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
     * <b>summary</b> : 
     * <p>获取文档库配置详情</p>
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
     * <b>summary</b> : 
     * <p>分页查询文档库列表</p>
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
     * <b>summary</b> : 
     * <p>分页查询文档库列表</p>
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
     * <b>summary</b> : 
     * <p>获取解析结果</p>
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
     * <b>summary</b> : 
     * <p>获取解析结果</p>
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
     * <p>获取异步任务的结果</p>
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
     * <p>获取异步任务的结果</p>
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
     * <p>获取财报总结任务结果</p>
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
     * <p>获取财报总结任务结果</p>
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
     * <p>获取异步任务结果</p>
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
     * <p>获取异步任务结果</p>
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
     * <p>获取财报总结任务结果</p>
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
     * <p>获取财报总结任务结果</p>
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
     * <p>插件调试接口</p>
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
     * <b>summary</b> : 
     * <p>插件调试接口</p>
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
     * <b>summary</b> : 
     * <p>获取文档预览</p>
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
     * <b>summary</b> : 
     * <p>获取文档预览</p>
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
     * <p>重新索引</p>
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
     * <b>summary</b> : 
     * <p>重新索引</p>
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
     * <b>summary</b> : 
     * <p>实时对话</p>
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
     * <b>summary</b> : 
     * <p>实时对话</p>
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
     * <b>summary</b> : 
     * <p>实时会话辅助</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
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
     * <b>summary</b> : 
     * <p>实时会话辅助</p>
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
     * <b>summary</b> : 
     * <p>重建任务</p>
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
     * <b>summary</b> : 
     * <p>重建任务</p>
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
     * <b>summary</b> : 
     * <p>文档召回。</p>
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
     * <b>summary</b> : 
     * <p>文档召回。</p>
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
     * <b>summary</b> : 
     * <p>意图识别</p>
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
     * <b>summary</b> : 
     * <p>意图识别</p>
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
     * <p>运行智能体</p>
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
     * <b>summary</b> : 
     * <p>运行智能体</p>
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
     * <b>summary</b> : 
     * <p>获取生成式对话结果</p>
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
     * <b>summary</b> : 
     * <p>获取生成式对话结果</p>
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
     * <b>summary</b> : 
     * <p>流式获取外呼会话分析结果</p>
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
     * <b>summary</b> : 
     * <p>流式获取外呼会话分析结果</p>
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
     * <p>获取生成式对话结果</p>
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
     * <p>获取生成式对话结果</p>
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
     * <b>summary</b> : 
     * <p>提交问题列表</p>
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
     * <b>summary</b> : 
     * <p>提交问题列表</p>
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
     * <b>summary</b> : 
     * <p>更新文档</p>
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
     * <b>summary</b> : 
     * <p>更新文档</p>
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
     * <b>summary</b> : 
     * <p>更新文档的chunk</p>
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
     * <b>summary</b> : 
     * <p>更新文档的chunk</p>
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
     * <b>summary</b> : 
     * <p>更新文档库配置</p>
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
     * <b>summary</b> : 
     * <p>更新文档库配置</p>
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
     * <p>更新QA问答库</p>
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
     * <p>更新QA问答库</p>
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
     * <b>summary</b> : 
     * <p>上传文档到文档库</p>
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
     * <b>summary</b> : 
     * <p>上传文档到文档库</p>
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
                new TeaPair("host", "" + authResponseBody.get("Bucket") + "." + com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType) + ""),
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
