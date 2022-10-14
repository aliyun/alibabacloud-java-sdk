// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.autodriveclouddata20220830;

import com.aliyun.tea.*;
import com.aliyun.autodriveclouddata20220830.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("autodriveclouddata", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public OpenapiSaveTaskStatusResponse openapiSaveTaskStatus(OpenapiSaveTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openapiSaveTaskStatusWithOptions(request, headers, runtime);
    }

    public OpenapiSaveTaskStatusResponse openapiSaveTaskStatusWithOptions(OpenapiSaveTaskStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "OpenapiSaveTaskStatus"),
            new TeaPair("version", "2022-08-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/autoDrive/openapi/saveTaskStatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenapiSaveTaskStatusResponse());
    }

    public OpenapiSemantemeSearchResponse openapiSemantemeSearch(OpenapiSemantemeSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openapiSemantemeSearchWithOptions(request, headers, runtime);
    }

    public OpenapiSemantemeSearchResponse openapiSemantemeSearchWithOptions(OpenapiSemantemeSearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.semanteme)) {
            body.put("semanteme", request.semanteme);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("tenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topN)) {
            body.put("topN", request.topN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceCode)) {
            body.put("workspaceCode", request.workspaceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenapiSemantemeSearch"),
            new TeaPair("version", "2022-08-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/autoDrive/openapi/semantemeSearch"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenapiSemantemeSearchResponse());
    }

    public OpenapiSemantemeSearchSaveResponse openapiSemantemeSearchSave(OpenapiSemantemeSearchSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openapiSemantemeSearchSaveWithOptions(request, headers, runtime);
    }

    public OpenapiSemantemeSearchSaveResponse openapiSemantemeSearchSaveWithOptions(OpenapiSemantemeSearchSaveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.semanteme)) {
            body.put("semanteme", request.semanteme);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.sourceOss))) {
            body.put("sourceOss", request.sourceOss);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("tenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topN)) {
            body.put("topN", request.topN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceCode)) {
            body.put("workspaceCode", request.workspaceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenapiSemantemeSearchSave"),
            new TeaPair("version", "2022-08-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/autoDrive/openapi/semantemeSearchSave"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenapiSemantemeSearchSaveResponse());
    }
}
