// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228;

import com.aliyun.tea.*;
import com.aliyun.customerservice20231228.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("customerservice", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>获取我的企业支持计划</p>
     * 
     * @param request ListEnterpriseSupportPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnterpriseSupportPlanResponse
     */
    public ListEnterpriseSupportPlanResponse listEnterpriseSupportPlanWithOptions(ListEnterpriseSupportPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnterpriseSupportPlan"),
            new TeaPair("version", "2023-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/customerWorkbench/pop/api/enterpriseSupport/listEnterpriseSupportPlan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterpriseSupportPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取我的企业支持计划</p>
     * 
     * @param request ListEnterpriseSupportPlanRequest
     * @return ListEnterpriseSupportPlanResponse
     */
    public ListEnterpriseSupportPlanResponse listEnterpriseSupportPlan(ListEnterpriseSupportPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnterpriseSupportPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取我的企业支持计划(下拉)</p>
     * 
     * @param request ListEnterpriseSupportPlanSimpleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnterpriseSupportPlanSimpleResponse
     */
    public ListEnterpriseSupportPlanSimpleResponse listEnterpriseSupportPlanSimpleWithOptions(ListEnterpriseSupportPlanSimpleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnterpriseSupportPlanSimple"),
            new TeaPair("version", "2023-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/customerWorkbench/pop/api/enterpriseSupport/listEnterpriseSupportPlanSimple"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterpriseSupportPlanSimpleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取我的企业支持计划(下拉)</p>
     * 
     * @param request ListEnterpriseSupportPlanSimpleRequest
     * @return ListEnterpriseSupportPlanSimpleResponse
     */
    public ListEnterpriseSupportPlanSimpleResponse listEnterpriseSupportPlanSimple(ListEnterpriseSupportPlanSimpleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnterpriseSupportPlanSimpleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取专家服务列表</p>
     * 
     * @param request ListServiceApplyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceApplyResponse
     */
    public ListServiceApplyResponse listServiceApplyWithOptions(ListServiceApplyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyType)) {
            body.put("applyType", request.applyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("endDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("productCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("startDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceApply"),
            new TeaPair("version", "2023-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/customerWorkbench/pop/api/expert/service/listServiceApply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceApplyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取专家服务列表</p>
     * 
     * @param request ListServiceApplyRequest
     * @return ListServiceApplyResponse
     */
    public ListServiceApplyResponse listServiceApply(ListServiceApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceApplyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过UID分页获取云企任务单</p>
     * 
     * @param request ListYunQiTaskByUidRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListYunQiTaskByUidResponse
     */
    public ListYunQiTaskByUidResponse listYunQiTaskByUidWithOptions(ListYunQiTaskByUidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            body.put("createTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            body.put("createTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freeOrderApplyCodes)) {
            body.put("freeOrderApplyCodes", request.freeOrderApplyCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freeOrderApplyIds)) {
            body.put("freeOrderApplyIds", request.freeOrderApplyIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderIds)) {
            body.put("orderIds", request.orderIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            body.put("statusList", request.statusList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListYunQiTaskByUid"),
            new TeaPair("version", "2023-12-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/customerWorkbench/pop/api/record/listYunQiTaskByUid"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListYunQiTaskByUidResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过UID分页获取云企任务单</p>
     * 
     * @param request ListYunQiTaskByUidRequest
     * @return ListYunQiTaskByUidResponse
     */
    public ListYunQiTaskByUidResponse listYunQiTaskByUid(ListYunQiTaskByUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listYunQiTaskByUidWithOptions(request, headers, runtime);
    }
}
