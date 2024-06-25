// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516;

import com.aliyun.tea.*;
import com.aliyun.aiccs20230516.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aiccs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>添加黑名单接口</p>
     * 
     * @param tmpReq AddBlacklistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddBlacklistResponse
     */
    public AddBlacklistResponse addBlacklistWithOptions(AddBlacklistRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddBlacklistShrinkRequest request = new AddBlacklistShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.numbers)) {
            request.numbersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.numbers, "Numbers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expiredDay)) {
            query.put("ExpiredDay", request.expiredDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numbersShrink)) {
            query.put("Numbers", request.numbersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddBlacklist"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddBlacklistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加黑名单接口</p>
     * 
     * @param request AddBlacklistRequest
     * @return AddBlacklistResponse
     */
    public AddBlacklistResponse addBlacklist(AddBlacklistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBlacklistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务接口</p>
     * 
     * @param tmpReq AddTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTaskResponse
     */
    public AddTaskResponse addTaskWithOptions(AddTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddTaskShrinkRequest request = new AddTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.callTimeList)) {
            request.callTimeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.callTimeList, "CallTimeList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.repeatReason)) {
            request.repeatReasonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.repeatReason, "RepeatReason", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.repeatTimes)) {
            request.repeatTimesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.repeatTimes, "RepeatTimes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sendSmsPlan)) {
            request.sendSmsPlanShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sendSmsPlan, "SendSmsPlan", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callTimeListShrink)) {
            query.put("CallTimeList", request.callTimeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            query.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrency)) {
            query.put("MaxConcurrency", request.maxConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playSleepVal)) {
            query.put("PlaySleepVal", request.playSleepVal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playTimes)) {
            query.put("PlayTimes", request.playTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallType)) {
            query.put("RecallType", request.recallType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordPath)) {
            query.put("RecordPath", request.recordPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatCount)) {
            query.put("RepeatCount", request.repeatCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatInterval)) {
            query.put("RepeatInterval", request.repeatInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatReasonShrink)) {
            query.put("RepeatReason", request.repeatReasonShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatTimesShrink)) {
            query.put("RepeatTimes", request.repeatTimesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendSmsPlanShrink)) {
            query.put("SendSmsPlan", request.sendSmsPlanShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTask"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务接口</p>
     * 
     * @param request AddTaskRequest
     * @return AddTaskResponse
     */
    public AddTaskResponse addTask(AddTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>坐席取消号码外呼</p>
     * 
     * @param tmpReq AgentCancelCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AgentCancelCallResponse
     */
    public AgentCancelCallResponse agentCancelCallWithOptions(AgentCancelCallRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AgentCancelCallShrinkRequest request = new AgentCancelCallShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.numbers)) {
            request.numbersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.numbers, "Numbers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentTag)) {
            query.put("AgentTag", request.agentTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numbersShrink)) {
            query.put("Numbers", request.numbersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AgentCancelCall"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AgentCancelCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>坐席取消号码外呼</p>
     * 
     * @param request AgentCancelCallRequest
     * @return AgentCancelCallResponse
     */
    public AgentCancelCallResponse agentCancelCall(AgentCancelCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.agentCancelCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>坐席任务恢复号码</p>
     * 
     * @param tmpReq AgentRecoverCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AgentRecoverCallResponse
     */
    public AgentRecoverCallResponse agentRecoverCallWithOptions(AgentRecoverCallRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AgentRecoverCallShrinkRequest request = new AgentRecoverCallShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.numbers)) {
            request.numbersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.numbers, "Numbers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentTag)) {
            query.put("AgentTag", request.agentTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginImportTime)) {
            query.put("BeginImportTime", request.beginImportTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endImportTime)) {
            query.put("EndImportTime", request.endImportTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numbersShrink)) {
            query.put("Numbers", request.numbersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AgentRecoverCall"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AgentRecoverCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>坐席任务恢复号码</p>
     * 
     * @param request AgentRecoverCallRequest
     * @return AgentRecoverCallResponse
     */
    public AgentRecoverCallResponse agentRecoverCall(AgentRecoverCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.agentRecoverCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>AI批量任务查询号码状态接口</p>
     * 
     * @param tmpReq DetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetailsResponse
     */
    public DetailsResponse detailsWithOptions(DetailsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetailsShrinkRequest request = new DetailsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.numbers)) {
            request.numbersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.numbers, "Numbers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            query.put("BatchId", request.batchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberStatus)) {
            query.put("NumberStatus", request.numberStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numbersShrink)) {
            query.put("Numbers", request.numbersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Details"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>AI批量任务查询号码状态接口</p>
     * 
     * @param request DetailsRequest
     * @return DetailsResponse
     */
    public DetailsResponse details(DetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑任务接口</p>
     * 
     * @param tmpReq EditTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditTaskResponse
     */
    public EditTaskResponse editTaskWithOptions(EditTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EditTaskShrinkRequest request = new EditTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.callTimeList)) {
            request.callTimeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.callTimeList, "CallTimeList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.repeatReason)) {
            request.repeatReasonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.repeatReason, "RepeatReason", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.repeatTimes)) {
            request.repeatTimesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.repeatTimes, "RepeatTimes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sendSmsPlan)) {
            request.sendSmsPlanShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sendSmsPlan, "SendSmsPlan", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callTimeListShrink)) {
            query.put("CallTimeList", request.callTimeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            query.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrency)) {
            query.put("MaxConcurrency", request.maxConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playSleepVal)) {
            query.put("PlaySleepVal", request.playSleepVal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playTimes)) {
            query.put("PlayTimes", request.playTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallType)) {
            query.put("RecallType", request.recallType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordPath)) {
            query.put("RecordPath", request.recordPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatCount)) {
            query.put("RepeatCount", request.repeatCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatInterval)) {
            query.put("RepeatInterval", request.repeatInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatReasonShrink)) {
            query.put("RepeatReason", request.repeatReasonShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatTimesShrink)) {
            query.put("RepeatTimes", request.repeatTimesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendSmsPlanShrink)) {
            query.put("SendSmsPlan", request.sendSmsPlanShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditTask"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑任务接口</p>
     * 
     * @param request EditTaskRequest
     * @return EditTaskResponse
     */
    public EditTaskResponse editTask(EditTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导入号码</p>
     * 
     * @param tmpReq ImportNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportNumberResponse
     */
    public ImportNumberResponse importNumberWithOptions(ImportNumberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportNumberShrinkRequest request = new ImportNumberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customers)) {
            request.customersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customers, "Customers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customersShrink)) {
            query.put("Customers", request.customersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failReturn)) {
            query.put("FailReturn", request.failReturn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportNumber"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导入号码</p>
     * 
     * @param request ImportNumberRequest
     * @return ImportNumberResponse
     */
    public ImportNumberResponse importNumber(ImportNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询企业黑名单</p>
     * 
     * @param tmpReq PageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PageResponse
     */
    public PageResponse pageWithOptions(PageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PageShrinkRequest request = new PageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.numbers)) {
            request.numbersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.numbers, "Numbers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.numbersShrink)) {
            query.put("Numbers", request.numbersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Page"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询企业黑名单</p>
     * 
     * @param request PageRequest
     * @return PageResponse
     */
    public PageResponse page(PageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>短信模板创建</p>
     * 
     * @param request SmsTemplateCreateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SmsTemplateCreateResponse
     */
    public SmsTemplateCreateResponse smsTemplateCreateWithOptions(SmsTemplateCreateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sign)) {
            query.put("Sign", request.sign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsType)) {
            query.put("SmsType", request.smsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SmsTemplateCreate"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SmsTemplateCreateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>短信模板创建</p>
     * 
     * @param request SmsTemplateCreateRequest
     * @return SmsTemplateCreateResponse
     */
    public SmsTemplateCreateResponse smsTemplateCreate(SmsTemplateCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.smsTemplateCreateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>短信模板列表查询</p>
     * 
     * @param request SmsTemplatePageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SmsTemplatePageListResponse
     */
    public SmsTemplatePageListResponse smsTemplatePageListWithOptions(SmsTemplatePageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sign)) {
            query.put("Sign", request.sign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsType)) {
            query.put("SmsType", request.smsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SmsTemplatePageList"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SmsTemplatePageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>短信模板列表查询</p>
     * 
     * @param request SmsTemplatePageListRequest
     * @return SmsTemplatePageListResponse
     */
    public SmsTemplatePageListResponse smsTemplatePageList(SmsTemplatePageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.smsTemplatePageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询聊天记录接口</p>
     * 
     * @param request TaskCallChatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TaskCallChatsResponse
     */
    public TaskCallChatsResponse taskCallChatsWithOptions(TaskCallChatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentTag)) {
            query.put("AgentTag", request.agentTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaskCallChats"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaskCallChatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询聊天记录接口</p>
     * 
     * @param request TaskCallChatsRequest
     * @return TaskCallChatsResponse
     */
    public TaskCallChatsResponse taskCallChats(TaskCallChatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taskCallChatsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务外呼情况接口</p>
     * 
     * @param request TaskCallInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TaskCallInfoResponse
     */
    public TaskCallInfoResponse taskCallInfoWithOptions(TaskCallInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaskCallInfo"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaskCallInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务外呼情况接口</p>
     * 
     * @param request TaskCallInfoRequest
     * @return TaskCallInfoResponse
     */
    public TaskCallInfoResponse taskCallInfo(TaskCallInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taskCallInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>AI批量任务查询外呼记录接口</p>
     * 
     * @param tmpReq TaskCallListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TaskCallListResponse
     */
    public TaskCallListResponse taskCallListWithOptions(TaskCallListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TaskCallListShrinkRequest request = new TaskCallListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.intentTags)) {
            request.intentTagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.intentTags, "IntentTags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.numbers)) {
            request.numbersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.numbers, "Numbers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            query.put("BatchId", request.batchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callDate)) {
            query.put("CallDate", request.callDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endCallDate)) {
            query.put("EndCallDate", request.endCallDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentTagsShrink)) {
            query.put("IntentTags", request.intentTagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numbersShrink)) {
            query.put("Numbers", request.numbersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaskCallList"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaskCallListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>AI批量任务查询外呼记录接口</p>
     * 
     * @param request TaskCallListRequest
     * @return TaskCallListResponse
     */
    public TaskCallListResponse taskCallList(TaskCallListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taskCallListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量任务取消号码外呼</p>
     * 
     * @param tmpReq TaskCancelCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TaskCancelCallResponse
     */
    public TaskCancelCallResponse taskCancelCallWithOptions(TaskCancelCallRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TaskCancelCallShrinkRequest request = new TaskCancelCallShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.numbers)) {
            request.numbersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.numbers, "Numbers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.numbersShrink)) {
            query.put("Numbers", request.numbersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaskCancelCall"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaskCancelCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量任务取消号码外呼</p>
     * 
     * @param request TaskCancelCallRequest
     * @return TaskCancelCallResponse
     */
    public TaskCancelCallResponse taskCancelCall(TaskCancelCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taskCancelCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务列表接口</p>
     * 
     * @param request TaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TaskListResponse
     */
    public TaskListResponse taskListWithOptions(TaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTime)) {
            query.put("CreateTime", request.createTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastCallTime)) {
            query.put("LastCallTime", request.lastCallTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaskList"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务列表接口</p>
     * 
     * @param request TaskListRequest
     * @return TaskListResponse
     */
    public TaskListResponse taskList(TaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量任务恢复号码</p>
     * 
     * @param tmpReq TaskRecoverCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TaskRecoverCallResponse
     */
    public TaskRecoverCallResponse taskRecoverCallWithOptions(TaskRecoverCallRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TaskRecoverCallShrinkRequest request = new TaskRecoverCallShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.numbers)) {
            request.numbersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.numbers, "Numbers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginImportTime)) {
            query.put("BeginImportTime", request.beginImportTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endImportTime)) {
            query.put("EndImportTime", request.endImportTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numbersShrink)) {
            query.put("Numbers", request.numbersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaskRecoverCall"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaskRecoverCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量任务恢复号码</p>
     * 
     * @param request TaskRecoverCallRequest
     * @return TaskRecoverCallResponse
     */
    public TaskRecoverCallResponse taskRecoverCall(TaskRecoverCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taskRecoverCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>话术模板列表查询接口</p>
     * 
     * @param request TemplateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TemplateListResponse
     */
    public TemplateListResponse templateListWithOptions(TemplateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TemplateList"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TemplateListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>话术模板列表查询接口</p>
     * 
     * @param request TemplateListRequest
     * @return TemplateListResponse
     */
    public TemplateListResponse templateList(TemplateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.templateListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改坐席状态</p>
     * 
     * @param request UpdateAgentStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentStatusResponse
     */
    public UpdateAgentStatusResponse updateAgentStatusWithOptions(UpdateAgentStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentStatus)) {
            query.put("AgentStatus", request.agentStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentTag)) {
            query.put("AgentTag", request.agentTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgentStatus"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改坐席状态</p>
     * 
     * @param request UpdateAgentStatusRequest
     * @return UpdateAgentStatusResponse
     */
    public UpdateAgentStatusResponse updateAgentStatus(UpdateAgentStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAgentStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新当天导入的号码</p>
     * 
     * @param tmpReq UpdateTaskCustomerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskCustomerResponse
     */
    public UpdateTaskCustomerResponse updateTaskCustomerWithOptions(UpdateTaskCustomerRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTaskCustomerShrinkRequest request = new UpdateTaskCustomerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customers)) {
            request.customersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customers, "Customers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customersShrink)) {
            query.put("Customers", request.customersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskCustomer"),
            new TeaPair("version", "2023-05-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskCustomerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新当天导入的号码</p>
     * 
     * @param request UpdateTaskCustomerRequest
     * @return UpdateTaskCustomerResponse
     */
    public UpdateTaskCustomerResponse updateTaskCustomer(UpdateTaskCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskCustomerWithOptions(request, runtime);
    }
}
