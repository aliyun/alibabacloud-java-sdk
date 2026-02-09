// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20260101;

import com.aliyun.tea.*;
import com.aliyun.intelligentcreation20260101.models.*;

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
     * <p>检查Turing任务</p>
     * 
     * @param request CheckTuringTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckTuringTaskResponse
     */
    public CheckTuringTaskResponse checkTuringTaskWithOptions(CheckTuringTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CheckTuringTask"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/aigc-turing/openService/v1/task/checkTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckTuringTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查Turing任务</p>
     * 
     * @param request CheckTuringTaskRequest
     * @return CheckTuringTaskResponse
     */
    public CheckTuringTaskResponse checkTuringTask(CheckTuringTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkTuringTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>任务提交接口</p>
     * 
     * @param request SubmitTuringTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitTuringTaskResponse
     */
    public SubmitTuringTaskResponse submitTuringTaskWithOptions(SubmitTuringTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentKey)) {
            body.put("idempotentKey", request.idempotentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imgUrl)) {
            body.put("imgUrl", request.imgUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolution)) {
            body.put("resolution", request.resolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("taskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitTuringTask"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/aigc-turing/openService/v1/task/submitTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitTuringTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>任务提交接口</p>
     * 
     * @param request SubmitTuringTaskRequest
     * @return SubmitTuringTaskResponse
     */
    public SubmitTuringTaskResponse submitTuringTask(SubmitTuringTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitTuringTaskWithOptions(request, headers, runtime);
    }
}
