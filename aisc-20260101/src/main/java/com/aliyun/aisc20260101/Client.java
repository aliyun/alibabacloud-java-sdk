// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101;

import com.aliyun.tea.*;
import com.aliyun.aisc20260101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-zhangjiakou", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-qingdao", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-nanjing", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-beijing", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-heyuan-acdr-1", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "aisc.cn-shanghai.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aisc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Initiates batch detection for user-defined skills.</p>
     * 
     * @param request CreateSkillFileCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSkillFileCheckResponse
     */
    public CreateSkillFileCheckResponse createSkillFileCheckWithOptions(CreateSkillFileCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.files)) {
            query.put("Files", request.files);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSkillFileCheck"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSkillFileCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Initiates batch detection for user-defined skills.</p>
     * 
     * @param request CreateSkillFileCheckRequest
     * @return CreateSkillFileCheckResponse
     */
    public CreateSkillFileCheckResponse createSkillFileCheck(CreateSkillFileCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSkillFileCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of agent risk events.</p>
     * 
     * @param request ListAIAgentEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAIAgentEventResponse
     */
    public ListAIAgentEventResponse listAIAgentEventWithOptions(ListAIAgentEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetName)) {
            query.put("AssetName", request.assetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetType)) {
            query.put("AssetType", request.assetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infraInstanceId)) {
            query.put("InfraInstanceId", request.infraInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infraName)) {
            query.put("InfraName", request.infraName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infraRegionId)) {
            query.put("InfraRegionId", request.infraRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskName)) {
            query.put("RiskName", request.riskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            query.put("StatusList", request.statusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            query.put("Vendor", request.vendor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAIAgentEvent"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAIAgentEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of agent risk events.</p>
     * 
     * @param request ListAIAgentEventRequest
     * @return ListAIAgentEventResponse
     */
    public ListAIAgentEventResponse listAIAgentEvent(ListAIAgentEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIAgentEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get subtask information.</p>
     * 
     * @param request ListSubTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubTasksResponse
     */
    public ListSubTasksResponse listSubTasksWithOptions(ListSubTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootTaskId)) {
            query.put("RootTaskId", request.rootTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubTasks"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get subtask information.</p>
     * 
     * @param request ListSubTasksRequest
     * @return ListSubTasksResponse
     */
    public ListSubTasksResponse listSubTasks(ListSubTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSubTasksWithOptions(request, runtime);
    }
}
