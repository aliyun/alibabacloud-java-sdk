// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828;

import com.aliyun.tea.*;
import com.aliyun.eflo_cnp20230828.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eflo-cnp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>资源转组</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>资源转组</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Experiment Plan</p>
     * 
     * @param tmpReq CreateExperimentPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExperimentPlanResponse
     */
    public CreateExperimentPlanResponse createExperimentPlanWithOptions(CreateExperimentPlanRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateExperimentPlanShrinkRequest request = new CreateExperimentPlanShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.externalParams)) {
            request.externalParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.externalParams, "ExternalParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalParamsShrink)) {
            query.put("ExternalParams", request.externalParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExperimentPlan"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExperimentPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Experiment Plan</p>
     * 
     * @param request CreateExperimentPlanRequest
     * @return CreateExperimentPlanResponse
     */
    public CreateExperimentPlanResponse createExperimentPlan(CreateExperimentPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExperimentPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建/更新测试计划模板</p>
     * 
     * @param tmpReq CreateExperimentPlanTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExperimentPlanTemplateResponse
     */
    public CreateExperimentPlanTemplateResponse createExperimentPlanTemplateWithOptions(CreateExperimentPlanTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateExperimentPlanTemplateShrinkRequest request = new CreateExperimentPlanTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.templatePipeline)) {
            request.templatePipelineShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.templatePipeline, "TemplatePipeline", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privacyLevel)) {
            query.put("PrivacyLevel", request.privacyLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateDescription)) {
            query.put("TemplateDescription", request.templateDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templatePipelineShrink)) {
            body.put("TemplatePipeline", request.templatePipelineShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExperimentPlanTemplate"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExperimentPlanTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建/更新测试计划模板</p>
     * 
     * @param request CreateExperimentPlanTemplateRequest
     * @return CreateExperimentPlanTemplateResponse
     */
    public CreateExperimentPlanTemplateResponse createExperimentPlanTemplate(CreateExperimentPlanTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExperimentPlanTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Evaluation Resource</p>
     * 
     * @param tmpReq CreateResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResourceWithOptions(CreateResourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateResourceShrinkRequest request = new CreateResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.machineTypes)) {
            request.machineTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.machineTypes, "MachineTypes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userAccessParam)) {
            request.userAccessParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userAccessParam, "UserAccessParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterDesc)) {
            query.put("ClusterDesc", request.clusterDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.machineTypesShrink)) {
            body.put("MachineTypes", request.machineTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessParamShrink)) {
            body.put("UserAccessParam", request.userAccessParamShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResource"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Evaluation Resource</p>
     * 
     * @param request CreateResourceRequest
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResource(CreateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除实验</p>
     * 
     * @param request DeleteExperimentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExperimentResponse
     */
    public DeleteExperimentResponse deleteExperimentWithOptions(DeleteExperimentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            query.put("ExperimentId", request.experimentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExperiment"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除实验</p>
     * 
     * @param request DeleteExperimentRequest
     * @return DeleteExperimentResponse
     */
    public DeleteExperimentResponse deleteExperiment(DeleteExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExperimentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除测试计划模板</p>
     * 
     * @param request DeleteExperimentPlanTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExperimentPlanTemplateResponse
     */
    public DeleteExperimentPlanTemplateResponse deleteExperimentPlanTemplateWithOptions(DeleteExperimentPlanTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExperimentPlanTemplate"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExperimentPlanTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除测试计划模板</p>
     * 
     * @param request DeleteExperimentPlanTemplateRequest
     * @return DeleteExperimentPlanTemplateResponse
     */
    public DeleteExperimentPlanTemplateResponse deleteExperimentPlanTemplate(DeleteExperimentPlanTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExperimentPlanTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验详情</p>
     * 
     * @param request GetExperimentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperimentResponse
     */
    public GetExperimentResponse getExperimentWithOptions(GetExperimentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            query.put("ExperimentId", request.experimentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperiment"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验详情</p>
     * 
     * @param request GetExperimentRequest
     * @return GetExperimentResponse
     */
    public GetExperimentResponse getExperiment(GetExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExperimentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Experiment Plan Details</p>
     * 
     * @param request GetExperimentPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperimentPlanResponse
     */
    public GetExperimentPlanResponse getExperimentPlanWithOptions(GetExperimentPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentPlan"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Experiment Plan Details</p>
     * 
     * @param request GetExperimentPlanRequest
     * @return GetExperimentPlanResponse
     */
    public GetExperimentPlanResponse getExperimentPlan(GetExperimentPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExperimentPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验结果数据</p>
     * 
     * @param request GetExperimentResultDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperimentResultDataResponse
     */
    public GetExperimentResultDataResponse getExperimentResultDataWithOptions(GetExperimentResultDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            query.put("ExperimentId", request.experimentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostname)) {
            query.put("Hostname", request.hostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadType)) {
            query.put("WorkloadType", request.workloadType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentResultData"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentResultDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验结果数据</p>
     * 
     * @param request GetExperimentResultDataRequest
     * @return GetExperimentResultDataResponse
     */
    public GetExperimentResultDataResponse getExperimentResultData(GetExperimentResultDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExperimentResultDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Resource Information</p>
     * 
     * @param request GetResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceResponse
     */
    public GetResourceResponse getResourceWithOptions(GetResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResource"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Resource Information</p>
     * 
     * @param request GetResourceRequest
     * @return GetResourceResponse
     */
    public GetResourceResponse getResource(GetResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询测试计划模板资源预测结果</p>
     * 
     * @param request GetResourcePredictResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourcePredictResultResponse
     */
    public GetResourcePredictResultResponse getResourcePredictResultWithOptions(GetResourcePredictResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourcePredictResult"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourcePredictResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询测试计划模板资源预测结果</p>
     * 
     * @param request GetResourcePredictResultRequest
     * @return GetResourcePredictResultResponse
     */
    public GetResourcePredictResultResponse getResourcePredictResult(GetResourcePredictResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourcePredictResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过id获取负载信息</p>
     * 
     * @param request GetWorkloadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkloadResponse
     */
    public GetWorkloadResponse getWorkloadWithOptions(GetWorkloadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workloadId)) {
            query.put("WorkloadId", request.workloadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkload"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkloadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过id获取负载信息</p>
     * 
     * @param request GetWorkloadRequest
     * @return GetWorkloadResponse
     */
    public GetWorkloadResponse getWorkload(GetWorkloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkloadWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Test Plan Template List</p>
     * 
     * @param request ListExperimentPlanTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExperimentPlanTemplatesResponse
     */
    public ListExperimentPlanTemplatesResponse listExperimentPlanTemplatesWithOptions(ListExperimentPlanTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privacyLevel)) {
            query.put("PrivacyLevel", request.privacyLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExperimentPlanTemplates"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExperimentPlanTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Test Plan Template List</p>
     * 
     * @param request ListExperimentPlanTemplatesRequest
     * @return ListExperimentPlanTemplatesResponse
     */
    public ListExperimentPlanTemplatesResponse listExperimentPlanTemplates(ListExperimentPlanTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExperimentPlanTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Experiment Plan List</p>
     * 
     * @param tmpReq ListExperimentPlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExperimentPlansResponse
     */
    public ListExperimentPlansResponse listExperimentPlansWithOptions(ListExperimentPlansRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListExperimentPlansShrinkRequest request = new ListExperimentPlansShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planTaskStatus)) {
            request.planTaskStatusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planTaskStatus, "PlanTaskStatus", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceName)) {
            request.resourceNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceName, "ResourceName", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creatTimeOrder)) {
            query.put("CreatTimeOrder", request.creatTimeOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeOrder)) {
            query.put("EndTimeOrder", request.endTimeOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeOrder)) {
            query.put("StartTimeOrder", request.startTimeOrder);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planTaskStatusShrink)) {
            body.put("PlanTaskStatus", request.planTaskStatusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceNameShrink)) {
            body.put("ResourceName", request.resourceNameShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExperimentPlans"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExperimentPlansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Experiment Plan List</p>
     * 
     * @param request ListExperimentPlansRequest
     * @return ListExperimentPlansResponse
     */
    public ListExperimentPlansResponse listExperimentPlans(ListExperimentPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExperimentPlansWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the experiment list based on the plan ID</p>
     * 
     * @param request ListExperimentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExperimentsResponse
     */
    public ListExperimentsResponse listExperimentsWithOptions(ListExperimentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExperiments"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExperimentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the experiment list based on the plan ID</p>
     * 
     * @param request ListExperimentsRequest
     * @return ListExperimentsResponse
     */
    public ListExperimentsResponse listExperiments(ListExperimentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExperimentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取负载列表</p>
     * 
     * @param request ListWorkloadsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkloadsResponse
     */
    public ListWorkloadsResponse listWorkloadsWithOptions(ListWorkloadsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkloads"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkloadsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取负载列表</p>
     * 
     * @param request ListWorkloadsRequest
     * @return ListWorkloadsResponse
     */
    public ListWorkloadsResponse listWorkloads(ListWorkloadsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkloadsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止实验</p>
     * 
     * @param request StopExperimentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopExperimentResponse
     */
    public StopExperimentResponse stopExperimentWithOptions(StopExperimentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            query.put("ExperimentId", request.experimentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopExperiment"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止实验</p>
     * 
     * @param request StopExperimentRequest
     * @return StopExperimentResponse
     */
    public StopExperimentResponse stopExperiment(StopExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopExperimentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resource Connectivity Test</p>
     * 
     * @param tmpReq ValidateResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateResourceResponse
     */
    public ValidateResourceResponse validateResourceWithOptions(ValidateResourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ValidateResourceShrinkRequest request = new ValidateResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userAccessParam)) {
            request.userAccessParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userAccessParam, "UserAccessParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userAccessParamShrink)) {
            body.put("UserAccessParam", request.userAccessParamShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateResource"),
            new TeaPair("version", "2023-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resource Connectivity Test</p>
     * 
     * @param request ValidateResourceRequest
     * @return ValidateResourceResponse
     */
    public ValidateResourceResponse validateResource(ValidateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateResourceWithOptions(request, runtime);
    }
}
