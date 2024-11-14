// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20241107;

import com.aliyun.tea.*;
import com.aliyun.intelligentcreation20241107.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("intelligentcreation", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建模型标注任务</p>
     * 
     * @param request CreateLabelTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLabelTaskResponse
     */
    public CreateLabelTaskResponse createLabelTaskWithOptions(CreateLabelTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            body.put("idempotentId", request.idempotentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelTemplateId)) {
            body.put("labelTemplateId", request.labelTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLabelTask"),
            new TeaPair("version", "2024-11-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aitag/createLabelTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLabelTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建模型标注任务</p>
     * 
     * @param request CreateLabelTaskRequest
     * @return CreateLabelTaskResponse
     */
    public CreateLabelTaskResponse createLabelTask(CreateLabelTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLabelTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询模型标注任务结果</p>
     * 
     * @param request GetLabelTaskResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLabelTaskResultResponse
     */
    public GetLabelTaskResultResponse getLabelTaskResultWithOptions(GetLabelTaskResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetLabelTaskResult"),
            new TeaPair("version", "2024-11-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aitag/getLabelTask"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLabelTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询模型标注任务结果</p>
     * 
     * @param request GetLabelTaskResultRequest
     * @return GetLabelTaskResultResponse
     */
    public GetLabelTaskResultResponse getLabelTaskResult(GetLabelTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLabelTaskResultWithOptions(request, headers, runtime);
    }
}
