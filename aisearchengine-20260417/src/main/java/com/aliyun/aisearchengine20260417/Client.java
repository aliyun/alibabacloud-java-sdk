// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417;

import com.aliyun.tea.*;
import com.aliyun.aisearchengine20260417.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aisearchengine", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>AI搜索</p>
     * 
     * @param request EngineSearchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EngineSearchResponse
     */
    public EngineSearchResponse engineSearchWithOptions(EngineSearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grey)) {
            body.put("grey", request.grey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recall)) {
            body.put("recall", request.recall);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyId)) {
            body.put("strategyId", request.strategyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            body.put("user", request.user);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EngineSearch"),
            new TeaPair("version", "2026-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/platform/app/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EngineSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>AI搜索</p>
     * 
     * @param request EngineSearchRequest
     * @return EngineSearchResponse
     */
    public EngineSearchResponse engineSearch(EngineSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.engineSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集资源 OSS 访问地址</p>
     * 
     * @param request GetDatasetResourceUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatasetResourceUrlResponse
     */
    public GetDatasetResourceUrlResponse getDatasetResourceUrlWithOptions(GetDatasetResourceUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            body.put("datasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryKey)) {
            body.put("primaryKey", request.primaryKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatasetResourceUrl"),
            new TeaPair("version", "2026-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/dataset/open/resources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatasetResourceUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集资源 OSS 访问地址</p>
     * 
     * @param request GetDatasetResourceUrlRequest
     * @return GetDatasetResourceUrlResponse
     */
    public GetDatasetResourceUrlResponse getDatasetResourceUrl(GetDatasetResourceUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatasetResourceUrlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交单条记录导入任务</p>
     * 
     * @param request ImportDatasetDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportDatasetDataResponse
     */
    public ImportDatasetDataResponse importDatasetDataWithOptions(ImportDatasetDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            body.put("datasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.records)) {
            body.put("records", request.records);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportDatasetData"),
            new TeaPair("version", "2026-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/dataset/open/upsert"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportDatasetDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交单条记录导入任务</p>
     * 
     * @param request ImportDatasetDataRequest
     * @return ImportDatasetDataResponse
     */
    public ImportDatasetDataResponse importDatasetData(ImportDatasetDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importDatasetDataWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>AI问答对话</p>
     * 
     * @param request QaChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QaChatResponse
     */
    public QaChatResponse qaChatWithOptions(QaChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            body.put("message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QaChat"),
            new TeaPair("version", "2026-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/platform/app/chat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QaChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>AI问答对话</p>
     * 
     * @param request QaChatRequest
     * @return QaChatResponse
     */
    public QaChatResponse qaChat(QaChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.qaChatWithOptions(request, headers, runtime);
    }
}
