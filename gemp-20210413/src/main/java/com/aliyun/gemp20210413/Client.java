// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413;

import com.aliyun.tea.*;
import com.aliyun.gemp20210413.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("gemp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>添加故障协同组</p>
     * 
     * @param request AddProblemServiceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddProblemServiceGroupResponse
     */
    public AddProblemServiceGroupResponse addProblemServiceGroupWithOptions(AddProblemServiceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupIds)) {
            body.put("serviceGroupIds", request.serviceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddProblemServiceGroup"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/addServiceGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddProblemServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加故障协同组</p>
     * 
     * @param request AddProblemServiceGroupRequest
     * @return AddProblemServiceGroupResponse
     */
    public AddProblemServiceGroupResponse addProblemServiceGroup(AddProblemServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addProblemServiceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>计费展示</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BillingStatisticsResponse
     */
    public BillingStatisticsResponse billingStatisticsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BillingStatistics"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/charging/details"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BillingStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>计费展示</p>
     * @return BillingStatisticsResponse
     */
    public BillingStatisticsResponse billingStatistics() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.billingStatisticsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>故障取消</p>
     * 
     * @param request CancelProblemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelProblemResponse
     */
    public CancelProblemResponse cancelProblemWithOptions(CancelProblemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cancelReason)) {
            body.put("cancelReason", request.cancelReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cancelReasonDescription)) {
            body.put("cancelReasonDescription", request.cancelReasonDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemNotifyType)) {
            body.put("problemNotifyType", request.problemNotifyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelProblem"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/cancel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelProblemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>故障取消</p>
     * 
     * @param request CancelProblemRequest
     * @return CancelProblemResponse
     */
    public CancelProblemResponse cancelProblem(CancelProblemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelProblemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验webhook地址</p>
     * 
     * @param request CheckWebhookRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckWebhookResponse
     */
    public CheckWebhookResponse checkWebhookWithOptions(CheckWebhookRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhook)) {
            body.put("webhook", request.webhook);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookType)) {
            body.put("webhookType", request.webhookType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckWebhook"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/check/webhook"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckWebhookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验webhook地址</p>
     * 
     * @param request CheckWebhookRequest
     * @return CheckWebhookResponse
     */
    public CheckWebhookResponse checkWebhook(CheckWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkWebhookWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>确认集成配置</p>
     * 
     * @param request ConfirmIntegrationConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfirmIntegrationConfigResponse
     */
    public ConfirmIntegrationConfigResponse confirmIntegrationConfigWithOptions(ConfirmIntegrationConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationConfigId)) {
            body.put("integrationConfigId", request.integrationConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmIntegrationConfig"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integrationConfig/confirm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmIntegrationConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>确认集成配置</p>
     * 
     * @param request ConfirmIntegrationConfigRequest
     * @return ConfirmIntegrationConfigResponse
     */
    public ConfirmIntegrationConfigResponse confirmIntegrationConfig(ConfirmIntegrationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmIntegrationConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建升级计划</p>
     * 
     * @param request CreateEscalationPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEscalationPlanResponse
     */
    public CreateEscalationPlanResponse createEscalationPlanWithOptions(CreateEscalationPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanDescription)) {
            body.put("escalationPlanDescription", request.escalationPlanDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanName)) {
            body.put("escalationPlanName", request.escalationPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanRules)) {
            body.put("escalationPlanRules", request.escalationPlanRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanScopeObjects)) {
            body.put("escalationPlanScopeObjects", request.escalationPlanScopeObjects);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isGlobal)) {
            body.put("isGlobal", request.isGlobal);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEscalationPlan"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/escalationPlan/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEscalationPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建升级计划</p>
     * 
     * @param request CreateEscalationPlanRequest
     * @return CreateEscalationPlanResponse
     */
    public CreateEscalationPlanResponse createEscalationPlan(CreateEscalationPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEscalationPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>手动创建事件</p>
     * 
     * @param request CreateIncidentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIncidentResponse
     */
    public CreateIncidentResponse createIncidentWithOptions(CreateIncidentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assignUserId)) {
            body.put("assignUserId", request.assignUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channels)) {
            body.put("channels", request.channels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effect)) {
            body.put("effect", request.effect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentDescription)) {
            body.put("incidentDescription", request.incidentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentLevel)) {
            body.put("incidentLevel", request.incidentLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentTitle)) {
            body.put("incidentTitle", request.incidentTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedServiceId)) {
            body.put("relatedServiceId", request.relatedServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIncident"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/manualSave"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIncidentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>手动创建事件</p>
     * 
     * @param request CreateIncidentRequest
     * @return CreateIncidentResponse
     */
    public CreateIncidentResponse createIncident(CreateIncidentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIncidentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增事件小计</p>
     * 
     * @param request CreateIncidentSubtotalRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIncidentSubtotalResponse
     */
    public CreateIncidentSubtotalResponse createIncidentSubtotalWithOptions(CreateIncidentSubtotalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentId)) {
            body.put("incidentId", request.incidentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIncidentSubtotal"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/save/subtotal"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIncidentSubtotalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增事件小计</p>
     * 
     * @param request CreateIncidentSubtotalRequest
     * @return CreateIncidentSubtotalResponse
     */
    public CreateIncidentSubtotalResponse createIncidentSubtotal(CreateIncidentSubtotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIncidentSubtotalWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建集成配置</p>
     * 
     * @param request CreateIntegrationConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIntegrationConfigResponse
     */
    public CreateIntegrationConfigResponse createIntegrationConfigWithOptions(CreateIntegrationConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorSourceId)) {
            body.put("monitorSourceId", request.monitorSourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIntegrationConfig"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integrationConfig/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIntegrationConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建集成配置</p>
     * 
     * @param request CreateIntegrationConfigRequest
     * @return CreateIntegrationConfigResponse
     */
    public CreateIntegrationConfigResponse createIntegrationConfig(CreateIntegrationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIntegrationConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>故障升级</p>
     * 
     * @param request CreateProblemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProblemResponse
     */
    public CreateProblemResponse createProblemWithOptions(CreateProblemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.affectServiceIds)) {
            body.put("affectServiceIds", request.affectServiceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discoverTime)) {
            body.put("discoverTime", request.discoverTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentId)) {
            body.put("incidentId", request.incidentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainHandlerId)) {
            body.put("mainHandlerId", request.mainHandlerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preliminaryReason)) {
            body.put("preliminaryReason", request.preliminaryReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemLevel)) {
            body.put("problemLevel", request.problemLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemName)) {
            body.put("problemName", request.problemName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemNotifyType)) {
            body.put("problemNotifyType", request.problemNotifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemStatus)) {
            body.put("problemStatus", request.problemStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.progressSummary)) {
            body.put("progressSummary", request.progressSummary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.progressSummaryRichTextId)) {
            body.put("progressSummaryRichTextId", request.progressSummaryRichTextId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryTime)) {
            body.put("recoveryTime", request.recoveryTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedServiceId)) {
            body.put("relatedServiceId", request.relatedServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupIds)) {
            body.put("serviceGroupIds", request.serviceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProblem"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/upgrade"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProblemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>故障升级</p>
     * 
     * @param request CreateProblemRequest
     * @return CreateProblemResponse
     */
    public CreateProblemResponse createProblem(CreateProblemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProblemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建影响服务</p>
     * 
     * @param request CreateProblemEffectionServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProblemEffectionServiceResponse
     */
    public CreateProblemEffectionServiceResponse createProblemEffectionServiceWithOptions(CreateProblemEffectionServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pictureUrl)) {
            body.put("pictureUrl", request.pictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProblemEffectionService"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/process/effectionService/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProblemEffectionServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建影响服务</p>
     * 
     * @param request CreateProblemEffectionServiceRequest
     * @return CreateProblemEffectionServiceResponse
     */
    public CreateProblemEffectionServiceResponse createProblemEffectionService(CreateProblemEffectionServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProblemEffectionServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>改进措施新增</p>
     * 
     * @param request CreateProblemMeasureRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProblemMeasureResponse
     */
    public CreateProblemMeasureResponse createProblemMeasureWithOptions(CreateProblemMeasureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkStandard)) {
            body.put("checkStandard", request.checkStandard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkUserId)) {
            body.put("checkUserId", request.checkUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directorId)) {
            body.put("directorId", request.directorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planFinishTime)) {
            body.put("planFinishTime", request.planFinishTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stalkerId)) {
            body.put("stalkerId", request.stalkerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProblemMeasure"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/improvement/measure/save"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProblemMeasureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>改进措施新增</p>
     * 
     * @param request CreateProblemMeasureRequest
     * @return CreateProblemMeasureResponse
     */
    public CreateProblemMeasureResponse createProblemMeasure(CreateProblemMeasureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProblemMeasureWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>故障新增备注小计</p>
     * 
     * @param request CreateProblemSubtotalRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProblemSubtotalResponse
     */
    public CreateProblemSubtotalResponse createProblemSubtotalWithOptions(CreateProblemSubtotalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProblemSubtotal"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/save/subtotal"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProblemSubtotalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>故障新增备注小计</p>
     * 
     * @param request CreateProblemSubtotalRequest
     * @return CreateProblemSubtotalResponse
     */
    public CreateProblemSubtotalResponse createProblemSubtotal(CreateProblemSubtotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProblemSubtotalWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建故障时间线节点</p>
     * 
     * @param request CreateProblemTimelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProblemTimelineResponse
     */
    public CreateProblemTimelineResponse createProblemTimelineWithOptions(CreateProblemTimelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyNode)) {
            body.put("keyNode", request.keyNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            body.put("time", request.time);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProblemTimeline"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/process/timeline/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProblemTimelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建故障时间线节点</p>
     * 
     * @param request CreateProblemTimelineRequest
     * @return CreateProblemTimelineResponse
     */
    public CreateProblemTimelineResponse createProblemTimeline(CreateProblemTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProblemTimelineWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建故障时间线节点</p>
     * 
     * @param request CreateProblemTimelinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProblemTimelinesResponse
     */
    public CreateProblemTimelinesResponse createProblemTimelinesWithOptions(CreateProblemTimelinesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timelineNodes)) {
            body.put("timelineNodes", request.timelineNodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProblemTimelines"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/process/timeline/batchCreate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProblemTimelinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建故障时间线节点</p>
     * 
     * @param request CreateProblemTimelinesRequest
     * @return CreateProblemTimelinesResponse
     */
    public CreateProblemTimelinesResponse createProblemTimelines(CreateProblemTimelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProblemTimelinesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建富文本</p>
     * 
     * @param request CreateRichTextRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRichTextResponse
     */
    public CreateRichTextResponse createRichTextWithOptions(CreateRichTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.richText)) {
            body.put("richText", request.richText);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRichText"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/rich/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRichTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建富文本</p>
     * 
     * @param request CreateRichTextRequest
     * @return CreateRichTextResponse
     */
    public CreateRichTextResponse createRichText(CreateRichTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRichTextWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建流转规则</p>
     * 
     * @param request CreateRouteRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRouteRuleResponse
     */
    public CreateRouteRuleResponse createRouteRuleWithOptions(CreateRouteRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assignObjectId)) {
            body.put("assignObjectId", request.assignObjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assignObjectType)) {
            body.put("assignObjectType", request.assignObjectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childRuleRelation)) {
            body.put("childRuleRelation", request.childRuleRelation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.convergenceFields)) {
            body.put("convergenceFields", request.convergenceFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.convergenceType)) {
            body.put("convergenceType", request.convergenceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverageProblemLevels)) {
            body.put("coverageProblemLevels", request.coverageProblemLevels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effection)) {
            body.put("effection", request.effection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            body.put("enableStatus", request.enableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentLevel)) {
            body.put("incidentLevel", request.incidentLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchCount)) {
            body.put("matchCount", request.matchCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyChannels)) {
            body.put("notifyChannels", request.notifyChannels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemEffectionServices)) {
            body.put("problemEffectionServices", request.problemEffectionServices);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemLevelGroup)) {
            body.put("problemLevelGroup", request.problemLevelGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedServiceId)) {
            body.put("relatedServiceId", request.relatedServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeChildRules)) {
            body.put("routeChildRules", request.routeChildRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeType)) {
            body.put("routeType", request.routeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("ruleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeWindow)) {
            body.put("timeWindow", request.timeWindow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeWindowUnit)) {
            body.put("timeWindowUnit", request.timeWindowUnit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRouteRule"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/routeRule/save"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRouteRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建流转规则</p>
     * 
     * @param request CreateRouteRuleRequest
     * @return CreateRouteRuleResponse
     */
    public CreateRouteRuleResponse createRouteRule(CreateRouteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRouteRuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务</p>
     * 
     * @param request CreateServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createServiceWithOptions(CreateServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanId)) {
            body.put("escalationPlanId", request.escalationPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDescription)) {
            body.put("serviceDescription", request.serviceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupIdList)) {
            body.put("serviceGroupIdList", request.serviceGroupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("serviceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateService"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/save"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务</p>
     * 
     * @param request CreateServiceRequest
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务组</p>
     * 
     * @param request CreateServiceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceGroupResponse
     */
    public CreateServiceGroupResponse createServiceGroupWithOptions(CreateServiceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableWebhook)) {
            body.put("enableWebhook", request.enableWebhook);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorSourceTemplates)) {
            body.put("monitorSourceTemplates", request.monitorSourceTemplates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupDescription)) {
            body.put("serviceGroupDescription", request.serviceGroupDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupName)) {
            body.put("serviceGroupName", request.serviceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("userIds", request.userIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookLink)) {
            body.put("webhookLink", request.webhookLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookType)) {
            body.put("webhookType", request.webhookType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceGroup"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/insert"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务组</p>
     * 
     * @param request CreateServiceGroupRequest
     * @return CreateServiceGroupResponse
     */
    public CreateServiceGroupResponse createServiceGroup(CreateServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增服务组排班</p>
     * 
     * @param request CreateServiceGroupSchedulingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceGroupSchedulingResponse
     */
    public CreateServiceGroupSchedulingResponse createServiceGroupSchedulingWithOptions(CreateServiceGroupSchedulingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fastScheduling)) {
            body.put("fastScheduling", request.fastScheduling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fineScheduling)) {
            body.put("fineScheduling", request.fineScheduling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulingWay)) {
            body.put("schedulingWay", request.schedulingWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceGroupScheduling"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/scheduling/save"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceGroupSchedulingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增服务组排班</p>
     * 
     * @param request CreateServiceGroupSchedulingRequest
     * @return CreateServiceGroupSchedulingResponse
     */
    public CreateServiceGroupSchedulingResponse createServiceGroupScheduling(CreateServiceGroupSchedulingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceGroupSchedulingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建通知订阅</p>
     * 
     * @param request CreateSubscriptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSubscriptionResponse
     */
    public CreateSubscriptionResponse createSubscriptionWithOptions(CreateSubscriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredType)) {
            body.put("expiredType", request.expiredType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyObjectList)) {
            body.put("notifyObjectList", request.notifyObjectList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyObjectType)) {
            body.put("notifyObjectType", request.notifyObjectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyStrategyList)) {
            body.put("notifyStrategyList", request.notifyStrategyList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeObjectList)) {
            body.put("scopeObjectList", request.scopeObjectList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionTitle)) {
            body.put("subscriptionTitle", request.subscriptionTitle);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubscription"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/notify/subscription/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建通知订阅</p>
     * 
     * @param request CreateSubscriptionRequest
     * @return CreateSubscriptionResponse
     */
    public CreateSubscriptionResponse createSubscription(CreateSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSubscriptionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>云钉协同创建移动应用</p>
     * 
     * @param request CreateTenantApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTenantApplicationResponse
     */
    public CreateTenantApplicationResponse createTenantApplicationWithOptions(CreateTenantApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTenantApplication"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/mobileApp/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTenantApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>云钉协同创建移动应用</p>
     * 
     * @param request CreateTenantApplicationRequest
     * @return CreateTenantApplicationResponse
     */
    public CreateTenantApplicationResponse createTenantApplication(CreateTenantApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTenantApplicationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建用户</p>
     * 
     * @param request CreateUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(CreateUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramId)) {
            body.put("ramId", request.ramId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleIdList)) {
            body.put("roleIdList", request.roleIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建用户</p>
     * 
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除升级计划</p>
     * 
     * @param request DeleteEscalationPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEscalationPlanResponse
     */
    public DeleteEscalationPlanResponse deleteEscalationPlanWithOptions(DeleteEscalationPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanId)) {
            body.put("escalationPlanId", request.escalationPlanId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEscalationPlan"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/escalationPlan/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEscalationPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除升级计划</p>
     * 
     * @param request DeleteEscalationPlanRequest
     * @return DeleteEscalationPlanResponse
     */
    public DeleteEscalationPlanResponse deleteEscalationPlan(DeleteEscalationPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEscalationPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>事件删除</p>
     * 
     * @param request DeleteIncidentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIncidentResponse
     */
    public DeleteIncidentResponse deleteIncidentWithOptions(DeleteIncidentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentId)) {
            body.put("incidentId", request.incidentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIncident"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIncidentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>事件删除</p>
     * 
     * @param request DeleteIncidentRequest
     * @return DeleteIncidentResponse
     */
    public DeleteIncidentResponse deleteIncident(DeleteIncidentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIncidentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除集成配置</p>
     * 
     * @param request DeleteIntegrationConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIntegrationConfigResponse
     */
    public DeleteIntegrationConfigResponse deleteIntegrationConfigWithOptions(DeleteIntegrationConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationConfigId)) {
            body.put("integrationConfigId", request.integrationConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIntegrationConfig"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integrationConfig/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIntegrationConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除集成配置</p>
     * 
     * @param request DeleteIntegrationConfigRequest
     * @return DeleteIntegrationConfigResponse
     */
    public DeleteIntegrationConfigResponse deleteIntegrationConfig(DeleteIntegrationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIntegrationConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>故障刪除</p>
     * 
     * @param request DeleteProblemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProblemResponse
     */
    public DeleteProblemResponse deleteProblemWithOptions(DeleteProblemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProblem"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProblemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>故障刪除</p>
     * 
     * @param request DeleteProblemRequest
     * @return DeleteProblemResponse
     */
    public DeleteProblemResponse deleteProblem(DeleteProblemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProblemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除故障影响服务</p>
     * 
     * @param request DeleteProblemEffectionServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProblemEffectionServiceResponse
     */
    public DeleteProblemEffectionServiceResponse deleteProblemEffectionServiceWithOptions(DeleteProblemEffectionServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectionServiceId)) {
            body.put("effectionServiceId", request.effectionServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProblemEffectionService"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/process/effectionService/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProblemEffectionServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除故障影响服务</p>
     * 
     * @param request DeleteProblemEffectionServiceRequest
     * @return DeleteProblemEffectionServiceResponse
     */
    public DeleteProblemEffectionServiceResponse deleteProblemEffectionService(DeleteProblemEffectionServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProblemEffectionServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>改进措施删除</p>
     * 
     * @param request DeleteProblemMeasureRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProblemMeasureResponse
     */
    public DeleteProblemMeasureResponse deleteProblemMeasureWithOptions(DeleteProblemMeasureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.measureId)) {
            body.put("measureId", request.measureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProblemMeasure"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/improvement/measure/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProblemMeasureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>改进措施删除</p>
     * 
     * @param request DeleteProblemMeasureRequest
     * @return DeleteProblemMeasureResponse
     */
    public DeleteProblemMeasureResponse deleteProblemMeasure(DeleteProblemMeasureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProblemMeasureWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除影响服务</p>
     * 
     * @param request DeleteProblemTimelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProblemTimelineResponse
     */
    public DeleteProblemTimelineResponse deleteProblemTimelineWithOptions(DeleteProblemTimelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemTimelineId)) {
            body.put("problemTimelineId", request.problemTimelineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProblemTimeline"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/process/timeline/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProblemTimelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除影响服务</p>
     * 
     * @param request DeleteProblemTimelineRequest
     * @return DeleteProblemTimelineResponse
     */
    public DeleteProblemTimelineResponse deleteProblemTimeline(DeleteProblemTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProblemTimelineWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除流转规则</p>
     * 
     * @param request DeleteRouteRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRouteRuleResponse
     */
    public DeleteRouteRuleResponse deleteRouteRuleWithOptions(DeleteRouteRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeRuleId)) {
            body.put("routeRuleId", request.routeRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRouteRule"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/routeRule/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRouteRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除流转规则</p>
     * 
     * @param request DeleteRouteRuleRequest
     * @return DeleteRouteRuleResponse
     */
    public DeleteRouteRuleResponse deleteRouteRule(DeleteRouteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRouteRuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务</p>
     * 
     * @param request DeleteServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteServiceWithOptions(DeleteServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("serviceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteService"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务</p>
     * 
     * @param request DeleteServiceRequest
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteService(DeleteServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务组</p>
     * 
     * @param request DeleteServiceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceGroupResponse
     */
    public DeleteServiceGroupResponse deleteServiceGroupWithOptions(DeleteServiceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceGroup"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务组</p>
     * 
     * @param request DeleteServiceGroupRequest
     * @return DeleteServiceGroupResponse
     */
    public DeleteServiceGroupResponse deleteServiceGroup(DeleteServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除排班</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceGroupSchedulingResponse
     */
    public DeleteServiceGroupSchedulingResponse deleteServiceGroupSchedulingWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceGroupScheduling"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/scheduling/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceGroupSchedulingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除排班</p>
     * @return DeleteServiceGroupSchedulingResponse
     */
    public DeleteServiceGroupSchedulingResponse deleteServiceGroupScheduling() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceGroupSchedulingWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务组成员</p>
     * 
     * @param request DeleteServiceGroupUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceGroupUserResponse
     */
    public DeleteServiceGroupUserResponse deleteServiceGroupUserWithOptions(DeleteServiceGroupUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newUserId)) {
            body.put("newUserId", request.newUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldUserId)) {
            body.put("oldUserId", request.oldUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeUser)) {
            body.put("removeUser", request.removeUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceGroupUser"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/deleteServiceGroupUser"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceGroupUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务组成员</p>
     * 
     * @param request DeleteServiceGroupUserRequest
     * @return DeleteServiceGroupUserResponse
     */
    public DeleteServiceGroupUserResponse deleteServiceGroupUser(DeleteServiceGroupUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceGroupUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除通知订阅</p>
     * 
     * @param request DeleteSubscriptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSubscriptionResponse
     */
    public DeleteSubscriptionResponse deleteSubscriptionWithOptions(DeleteSubscriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionId)) {
            body.put("subscriptionId", request.subscriptionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSubscription"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/notify/subscription/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除通知订阅</p>
     * 
     * @param request DeleteSubscriptionRequest
     * @return DeleteSubscriptionResponse
     */
    public DeleteSubscriptionResponse deleteSubscription(DeleteSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSubscriptionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户</p>
     * 
     * @param request DeleteUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户</p>
     * 
     * @param request DeleteUserRequest
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>转交事件</p>
     * 
     * @param request DeliverIncidentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeliverIncidentResponse
     */
    public DeliverIncidentResponse deliverIncidentWithOptions(DeliverIncidentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assignUserId)) {
            body.put("assignUserId", request.assignUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentId)) {
            body.put("incidentId", request.incidentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeliverIncident"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/deliver"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeliverIncidentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>转交事件</p>
     * 
     * @param request DeliverIncidentRequest
     * @return DeliverIncidentResponse
     */
    public DeliverIncidentResponse deliverIncident(DeliverIncidentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deliverIncidentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>禁用升级计划</p>
     * 
     * @param request DisableEscalationPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableEscalationPlanResponse
     */
    public DisableEscalationPlanResponse disableEscalationPlanWithOptions(DisableEscalationPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanId)) {
            body.put("escalationPlanId", request.escalationPlanId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableEscalationPlan"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/escalationPlan/disable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableEscalationPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>禁用升级计划</p>
     * 
     * @param request DisableEscalationPlanRequest
     * @return DisableEscalationPlanResponse
     */
    public DisableEscalationPlanResponse disableEscalationPlan(DisableEscalationPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableEscalationPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>禁用集成配置</p>
     * 
     * @param request DisableIntegrationConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableIntegrationConfigResponse
     */
    public DisableIntegrationConfigResponse disableIntegrationConfigWithOptions(DisableIntegrationConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationConfigId)) {
            body.put("integrationConfigId", request.integrationConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableIntegrationConfig"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integrationConfig/disable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableIntegrationConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>禁用集成配置</p>
     * 
     * @param request DisableIntegrationConfigRequest
     * @return DisableIntegrationConfigResponse
     */
    public DisableIntegrationConfigResponse disableIntegrationConfig(DisableIntegrationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableIntegrationConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>禁用规则</p>
     * 
     * @param request DisableRouteRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableRouteRuleResponse
     */
    public DisableRouteRuleResponse disableRouteRuleWithOptions(DisableRouteRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeRuleId)) {
            body.put("routeRuleId", request.routeRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableRouteRule"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/routeRule/disable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableRouteRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>禁用规则</p>
     * 
     * @param request DisableRouteRuleRequest
     * @return DisableRouteRuleResponse
     */
    public DisableRouteRuleResponse disableRouteRule(DisableRouteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableRouteRuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>禁用服务组的webhook</p>
     * 
     * @param request DisableServiceGroupWebhookRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableServiceGroupWebhookResponse
     */
    public DisableServiceGroupWebhookResponse disableServiceGroupWebhookWithOptions(DisableServiceGroupWebhookRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableServiceGroupWebhook"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/disableWebhook"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableServiceGroupWebhookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>禁用服务组的webhook</p>
     * 
     * @param request DisableServiceGroupWebhookRequest
     * @return DisableServiceGroupWebhookResponse
     */
    public DisableServiceGroupWebhookResponse disableServiceGroupWebhook(DisableServiceGroupWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableServiceGroupWebhookWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>禁用集成配置</p>
     * 
     * @param request DisableSubscriptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSubscriptionResponse
     */
    public DisableSubscriptionResponse disableSubscriptionWithOptions(DisableSubscriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionId)) {
            body.put("subscriptionId", request.subscriptionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSubscription"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/notify/subscription/doDisable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>禁用集成配置</p>
     * 
     * @param request DisableSubscriptionRequest
     * @return DisableSubscriptionResponse
     */
    public DisableSubscriptionResponse disableSubscription(DisableSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSubscriptionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用升级计划</p>
     * 
     * @param request EnableEscalationPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableEscalationPlanResponse
     */
    public EnableEscalationPlanResponse enableEscalationPlanWithOptions(EnableEscalationPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanId)) {
            body.put("escalationPlanId", request.escalationPlanId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableEscalationPlan"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/escalationPlan/enable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableEscalationPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启用升级计划</p>
     * 
     * @param request EnableEscalationPlanRequest
     * @return EnableEscalationPlanResponse
     */
    public EnableEscalationPlanResponse enableEscalationPlan(EnableEscalationPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableEscalationPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用集成配置</p>
     * 
     * @param request EnableIntegrationConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableIntegrationConfigResponse
     */
    public EnableIntegrationConfigResponse enableIntegrationConfigWithOptions(EnableIntegrationConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationConfigId)) {
            body.put("integrationConfigId", request.integrationConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableIntegrationConfig"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integrationConfig/enable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableIntegrationConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启用集成配置</p>
     * 
     * @param request EnableIntegrationConfigRequest
     * @return EnableIntegrationConfigResponse
     */
    public EnableIntegrationConfigResponse enableIntegrationConfig(EnableIntegrationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableIntegrationConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用规则</p>
     * 
     * @param request EnableRouteRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableRouteRuleResponse
     */
    public EnableRouteRuleResponse enableRouteRuleWithOptions(EnableRouteRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeRuleId)) {
            body.put("routeRuleId", request.routeRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableRouteRule"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/routeRule/enable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableRouteRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启用规则</p>
     * 
     * @param request EnableRouteRuleRequest
     * @return EnableRouteRuleResponse
     */
    public EnableRouteRuleResponse enableRouteRule(EnableRouteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableRouteRuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用服务组的webhook</p>
     * 
     * @param request EnableServiceGroupWebhookRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableServiceGroupWebhookResponse
     */
    public EnableServiceGroupWebhookResponse enableServiceGroupWebhookWithOptions(EnableServiceGroupWebhookRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableServiceGroupWebhook"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/enableWebhook"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableServiceGroupWebhookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启用服务组的webhook</p>
     * 
     * @param request EnableServiceGroupWebhookRequest
     * @return EnableServiceGroupWebhookResponse
     */
    public EnableServiceGroupWebhookResponse enableServiceGroupWebhook(EnableServiceGroupWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableServiceGroupWebhookWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用通知订阅</p>
     * 
     * @param request EnableSubscriptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSubscriptionResponse
     */
    public EnableSubscriptionResponse enableSubscriptionWithOptions(EnableSubscriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionId)) {
            body.put("subscriptionId", request.subscriptionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSubscription"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/notify/subscription/enable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启用通知订阅</p>
     * 
     * @param request EnableSubscriptionRequest
     * @return EnableSubscriptionResponse
     */
    public EnableSubscriptionResponse enableSubscription(EnableSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSubscriptionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>完结事件</p>
     * 
     * @param request FinishIncidentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FinishIncidentResponse
     */
    public FinishIncidentResponse finishIncidentWithOptions(FinishIncidentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentFinishReason)) {
            body.put("incidentFinishReason", request.incidentFinishReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentFinishReasonDescription)) {
            body.put("incidentFinishReasonDescription", request.incidentFinishReasonDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentFinishSolution)) {
            body.put("incidentFinishSolution", request.incidentFinishSolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentFinishSolutionDescription)) {
            body.put("incidentFinishSolutionDescription", request.incidentFinishSolutionDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentIds)) {
            body.put("incidentIds", request.incidentIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FinishIncident"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/finish"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FinishIncidentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>完结事件</p>
     * 
     * @param request FinishIncidentRequest
     * @return FinishIncidentResponse
     */
    public FinishIncidentResponse finishIncident(FinishIncidentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishIncidentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>故障完结</p>
     * 
     * @param request FinishProblemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FinishProblemResponse
     */
    public FinishProblemResponse finishProblemWithOptions(FinishProblemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FinishProblem"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/finish"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FinishProblemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>故障完结</p>
     * 
     * @param request FinishProblemRequest
     * @return FinishProblemResponse
     */
    public FinishProblemResponse finishProblem(FinishProblemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishProblemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片连接获取</p>
     * 
     * @param request GeneratePictureLinkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GeneratePictureLinkResponse
     */
    public GeneratePictureLinkResponse generatePictureLinkWithOptions(GeneratePictureLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keys)) {
            body.put("keys", request.keys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GeneratePictureLink"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/rich/oss/getPictureLink"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GeneratePictureLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片连接获取</p>
     * 
     * @param request GeneratePictureLinkRequest
     * @return GeneratePictureLinkResponse
     */
    public GeneratePictureLinkResponse generatePictureLink(GeneratePictureLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generatePictureLinkWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片批量上传</p>
     * 
     * @param request GeneratePictureUploadSignRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GeneratePictureUploadSignResponse
     */
    public GeneratePictureUploadSignResponse generatePictureUploadSignWithOptions(GeneratePictureUploadSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.files)) {
            body.put("files", request.files);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instanceType", request.instanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GeneratePictureUploadSign"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/rich/oss/generatePostPolicy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GeneratePictureUploadSignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片批量上传</p>
     * 
     * @param request GeneratePictureUploadSignRequest
     * @return GeneratePictureUploadSignResponse
     */
    public GeneratePictureUploadSignResponse generatePictureUploadSign(GeneratePictureUploadSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generatePictureUploadSignWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取图片下载url</p>
     * 
     * @param request GenerateProblemPictureLinkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateProblemPictureLinkResponse
     */
    public GenerateProblemPictureLinkResponse generateProblemPictureLinkWithOptions(GenerateProblemPictureLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keys)) {
            body.put("keys", request.keys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateProblemPictureLink"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/process/oss/getPresignedLink"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateProblemPictureLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取图片下载url</p>
     * 
     * @param request GenerateProblemPictureLinkRequest
     * @return GenerateProblemPictureLinkResponse
     */
    public GenerateProblemPictureLinkResponse generateProblemPictureLink(GenerateProblemPictureLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateProblemPictureLinkWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片上传验签</p>
     * 
     * @param request GenerateProblemPictureUploadSignRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateProblemPictureUploadSignResponse
     */
    public GenerateProblemPictureUploadSignResponse generateProblemPictureUploadSignWithOptions(GenerateProblemPictureUploadSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSize)) {
            body.put("fileSize", request.fileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("fileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateProblemPictureUploadSign"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/process/oss/generatePostPolicy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateProblemPictureUploadSignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片上传验签</p>
     * 
     * @param request GenerateProblemPictureUploadSignRequest
     * @return GenerateProblemPictureUploadSignResponse
     */
    public GenerateProblemPictureUploadSignResponse generateProblemPictureUploadSign(GenerateProblemPictureUploadSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateProblemPictureUploadSignWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>升级计划详情</p>
     * 
     * @param request GetEscalationPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEscalationPlanResponse
     */
    public GetEscalationPlanResponse getEscalationPlanWithOptions(GetEscalationPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanId)) {
            body.put("escalationPlanId", request.escalationPlanId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEscalationPlan"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/escalationPlan/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEscalationPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>升级计划详情</p>
     * 
     * @param request GetEscalationPlanRequest
     * @return GetEscalationPlanResponse
     */
    public GetEscalationPlanResponse getEscalationPlan(GetEscalationPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEscalationPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询最近一次告警</p>
     * 
     * @param request GetEventRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEventResponse
     */
    public GetEventResponse getEventWithOptions(GetEventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.monitorSourceId)) {
            body.put("monitorSourceId", request.monitorSourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEvent"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/events/getLastTimeEvent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询最近一次告警</p>
     * 
     * @param request GetEventRequest
     * @return GetEventResponse
     */
    public GetEventResponse getEvent(GetEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEventWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询首页引导信息</p>
     * 
     * @param request GetHomePageGuidanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHomePageGuidanceResponse
     */
    public GetHomePageGuidanceResponse getHomePageGuidanceWithOptions(GetHomePageGuidanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHomePageGuidance"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/guidance/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHomePageGuidanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询首页引导信息</p>
     * 
     * @param request GetHomePageGuidanceRequest
     * @return GetHomePageGuidanceResponse
     */
    public GetHomePageGuidanceResponse getHomePageGuidance(GetHomePageGuidanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHomePageGuidanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>事件详情</p>
     * 
     * @param request GetIncidentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIncidentResponse
     */
    public GetIncidentResponse getIncidentWithOptions(GetIncidentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentId)) {
            body.put("incidentId", request.incidentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIncident"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIncidentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>事件详情</p>
     * 
     * @param request GetIncidentRequest
     * @return GetIncidentResponse
     */
    public GetIncidentResponse getIncident(GetIncidentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIncidentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据事件ID批量查询事件详情</p>
     * 
     * @param request GetIncidentListByIdListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIncidentListByIdListResponse
     */
    public GetIncidentListByIdListResponse getIncidentListByIdListWithOptions(GetIncidentListByIdListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentIdList)) {
            body.put("incidentIdList", request.incidentIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIncidentListByIdList"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/getIncidentListByIdList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIncidentListByIdListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据事件ID批量查询事件详情</p>
     * 
     * @param request GetIncidentListByIdListRequest
     * @return GetIncidentListByIdListResponse
     */
    public GetIncidentListByIdListResponse getIncidentListByIdList(GetIncidentListByIdListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIncidentListByIdListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>事件统计</p>
     * 
     * @param request GetIncidentStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIncidentStatisticsResponse
     */
    public GetIncidentStatisticsResponse getIncidentStatisticsWithOptions(GetIncidentStatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIncidentStatistics"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/count"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIncidentStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>事件统计</p>
     * 
     * @param request GetIncidentStatisticsRequest
     * @return GetIncidentStatisticsResponse
     */
    public GetIncidentStatisticsResponse getIncidentStatistics(GetIncidentStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIncidentStatisticsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件对应的小计数量</p>
     * 
     * @param request GetIncidentSubtotalCountRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIncidentSubtotalCountResponse
     */
    public GetIncidentSubtotalCountResponse getIncidentSubtotalCountWithOptions(GetIncidentSubtotalCountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentIds)) {
            body.put("incidentIds", request.incidentIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIncidentSubtotalCount"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/subtotal/count"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIncidentSubtotalCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件对应的小计数量</p>
     * 
     * @param request GetIncidentSubtotalCountRequest
     * @return GetIncidentSubtotalCountResponse
     */
    public GetIncidentSubtotalCountResponse getIncidentSubtotalCount(GetIncidentSubtotalCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIncidentSubtotalCountWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取集成配置详情</p>
     * 
     * @param request GetIntegrationConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIntegrationConfigResponse
     */
    public GetIntegrationConfigResponse getIntegrationConfigWithOptions(GetIntegrationConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationConfigId)) {
            body.put("integrationConfigId", request.integrationConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIntegrationConfig"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integrationConfig/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIntegrationConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取集成配置详情</p>
     * 
     * @param request GetIntegrationConfigRequest
     * @return GetIntegrationConfigResponse
     */
    public GetIntegrationConfigResponse getIntegrationConfig(GetIntegrationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIntegrationConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询故障详情</p>
     * 
     * @param request GetProblemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProblemResponse
     */
    public GetProblemResponse getProblemWithOptions(GetProblemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProblem"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProblemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询故障详情</p>
     * 
     * @param request GetProblemRequest
     * @return GetProblemResponse
     */
    public GetProblemResponse getProblem(GetProblemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProblemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询故障影响服务</p>
     * 
     * @param request GetProblemEffectionServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProblemEffectionServiceResponse
     */
    public GetProblemEffectionServiceResponse getProblemEffectionServiceWithOptions(GetProblemEffectionServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectionServiceId)) {
            body.put("effectionServiceId", request.effectionServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProblemEffectionService"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/process/effectionService/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProblemEffectionServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询故障影响服务</p>
     * 
     * @param request GetProblemEffectionServiceRequest
     * @return GetProblemEffectionServiceResponse
     */
    public GetProblemEffectionServiceResponse getProblemEffectionService(GetProblemEffectionServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProblemEffectionServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>改进分析详情</p>
     * 
     * @param request GetProblemImprovementRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProblemImprovementResponse
     */
    public GetProblemImprovementResponse getProblemImprovementWithOptions(GetProblemImprovementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProblemImprovement"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/improvement/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProblemImprovementResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>改进分析详情</p>
     * 
     * @param request GetProblemImprovementRequest
     * @return GetProblemImprovementResponse
     */
    public GetProblemImprovementResponse getProblemImprovement(GetProblemImprovementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProblemImprovementWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通告预览</p>
     * 
     * @param request GetProblemPreviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProblemPreviewResponse
     */
    public GetProblemPreviewResponse getProblemPreviewWithOptions(GetProblemPreviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectServiceIds)) {
            body.put("effectServiceIds", request.effectServiceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentId)) {
            body.put("incidentId", request.incidentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemLevel)) {
            body.put("problemLevel", request.problemLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemNotifyType)) {
            body.put("problemNotifyType", request.problemNotifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedServiceId)) {
            body.put("relatedServiceId", request.relatedServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupIds)) {
            body.put("serviceGroupIds", request.serviceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProblemPreview"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/preview"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProblemPreviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通告预览</p>
     * 
     * @param request GetProblemPreviewRequest
     * @return GetProblemPreviewResponse
     */
    public GetProblemPreviewResponse getProblemPreview(GetProblemPreviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProblemPreviewWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>概览数据统计</p>
     * 
     * @param request GetResourceStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceStatisticsResponse
     */
    public GetResourceStatisticsResponse getResourceStatisticsWithOptions(GetResourceStatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceStatistics"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/config/resource/count"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>概览数据统计</p>
     * 
     * @param request GetResourceStatisticsRequest
     * @return GetResourceStatisticsResponse
     */
    public GetResourceStatisticsResponse getResourceStatistics(GetResourceStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceStatisticsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询富文本</p>
     * 
     * @param request GetRichTextRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRichTextResponse
     */
    public GetRichTextResponse getRichTextWithOptions(GetRichTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.richTextId)) {
            body.put("richTextId", request.richTextId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRichText"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/rich/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRichTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询富文本</p>
     * 
     * @param request GetRichTextRequest
     * @return GetRichTextResponse
     */
    public GetRichTextResponse getRichText(GetRichTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRichTextWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询流转规则详情</p>
     * 
     * @param request GetRouteRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRouteRuleResponse
     */
    public GetRouteRuleResponse getRouteRuleWithOptions(GetRouteRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeRuleId)) {
            body.put("routeRuleId", request.routeRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRouteRule"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/routeRule/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRouteRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询流转规则详情</p>
     * 
     * @param request GetRouteRuleRequest
     * @return GetRouteRuleResponse
     */
    public GetRouteRuleResponse getRouteRule(GetRouteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRouteRuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>服务详情</p>
     * 
     * @param request GetServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceResponse
     */
    public GetServiceResponse getServiceWithOptions(GetServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("serviceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetService"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>服务详情</p>
     * 
     * @param request GetServiceRequest
     * @return GetServiceResponse
     */
    public GetServiceResponse getService(GetServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务组详情</p>
     * 
     * @param request GetServiceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceGroupResponse
     */
    public GetServiceGroupResponse getServiceGroupWithOptions(GetServiceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceGroup"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务组详情</p>
     * 
     * @param request GetServiceGroupRequest
     * @return GetServiceGroupResponse
     */
    public GetServiceGroupResponse getServiceGroup(GetServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户某个服务组的排班</p>
     * 
     * @param request GetServiceGroupPersonSchedulingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceGroupPersonSchedulingResponse
     */
    public GetServiceGroupPersonSchedulingResponse getServiceGroupPersonSchedulingWithOptions(GetServiceGroupPersonSchedulingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceGroupPersonScheduling"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/scheduling/user/getScheduling"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceGroupPersonSchedulingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户某个服务组的排班</p>
     * 
     * @param request GetServiceGroupPersonSchedulingRequest
     * @return GetServiceGroupPersonSchedulingResponse
     */
    public GetServiceGroupPersonSchedulingResponse getServiceGroupPersonScheduling(GetServiceGroupPersonSchedulingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceGroupPersonSchedulingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务组排班详情</p>
     * 
     * @param request GetServiceGroupSchedulingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceGroupSchedulingResponse
     */
    public GetServiceGroupSchedulingResponse getServiceGroupSchedulingWithOptions(GetServiceGroupSchedulingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceGroupScheduling"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/scheduling/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceGroupSchedulingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务组排班详情</p>
     * 
     * @param request GetServiceGroupSchedulingRequest
     * @return GetServiceGroupSchedulingResponse
     */
    public GetServiceGroupSchedulingResponse getServiceGroupScheduling(GetServiceGroupSchedulingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceGroupSchedulingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预览服务组排班</p>
     * 
     * @param request GetServiceGroupSchedulingPreviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceGroupSchedulingPreviewResponse
     */
    public GetServiceGroupSchedulingPreviewResponse getServiceGroupSchedulingPreviewWithOptions(GetServiceGroupSchedulingPreviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fastScheduling)) {
            body.put("fastScheduling", request.fastScheduling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fineScheduling)) {
            body.put("fineScheduling", request.fineScheduling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulingWay)) {
            body.put("schedulingWay", request.schedulingWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceGroupSchedulingPreview"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/scheduling/preview"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceGroupSchedulingPreviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预览服务组排班</p>
     * 
     * @param request GetServiceGroupSchedulingPreviewRequest
     * @return GetServiceGroupSchedulingPreviewResponse
     */
    public GetServiceGroupSchedulingPreviewResponse getServiceGroupSchedulingPreview(GetServiceGroupSchedulingPreviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceGroupSchedulingPreviewWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定人员的服务组排班</p>
     * 
     * @param request GetServiceGroupSpecialPersonSchedulingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceGroupSpecialPersonSchedulingResponse
     */
    public GetServiceGroupSpecialPersonSchedulingResponse getServiceGroupSpecialPersonSchedulingWithOptions(GetServiceGroupSpecialPersonSchedulingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceGroupSpecialPersonScheduling"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/scheduling/getUserScheduling"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceGroupSpecialPersonSchedulingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定人员的服务组排班</p>
     * 
     * @param request GetServiceGroupSpecialPersonSchedulingRequest
     * @return GetServiceGroupSpecialPersonSchedulingResponse
     */
    public GetServiceGroupSpecialPersonSchedulingResponse getServiceGroupSpecialPersonScheduling(GetServiceGroupSpecialPersonSchedulingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceGroupSpecialPersonSchedulingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>相似事件统计信息</p>
     * 
     * @param request GetSimilarIncidentStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSimilarIncidentStatisticsResponse
     */
    public GetSimilarIncidentStatisticsResponse getSimilarIncidentStatisticsWithOptions(GetSimilarIncidentStatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTime)) {
            body.put("createTime", request.createTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.events)) {
            body.put("events", request.events);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentId)) {
            body.put("incidentId", request.incidentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentTitle)) {
            body.put("incidentTitle", request.incidentTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedServiceId)) {
            body.put("relatedServiceId", request.relatedServiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSimilarIncidentStatistics"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/similarIncident/statistics"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSimilarIncidentStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>相似事件统计信息</p>
     * 
     * @param request GetSimilarIncidentStatisticsRequest
     * @return GetSimilarIncidentStatisticsResponse
     */
    public GetSimilarIncidentStatisticsResponse getSimilarIncidentStatistics(GetSimilarIncidentStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSimilarIncidentStatisticsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通知订阅详情</p>
     * 
     * @param request GetSubscriptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubscriptionResponse
     */
    public GetSubscriptionResponse getSubscriptionWithOptions(GetSubscriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notFilterScopeObjectDeleted)) {
            body.put("notFilterScopeObjectDeleted", request.notFilterScopeObjectDeleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionId)) {
            body.put("subscriptionId", request.subscriptionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubscription"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/notify/subscription/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通知订阅详情</p>
     * 
     * @param request GetSubscriptionRequest
     * @return GetSubscriptionResponse
     */
    public GetSubscriptionResponse getSubscription(GetSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSubscriptionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>云钉协同移动应用详情</p>
     * 
     * @param request GetTenantApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTenantApplicationResponse
     */
    public GetTenantApplicationResponse getTenantApplicationWithOptions(GetTenantApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTenantApplication"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/mobileApp/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTenantApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>云钉协同移动应用详情</p>
     * 
     * @param request GetTenantApplicationRequest
     * @return GetTenantApplicationResponse
     */
    public GetTenantApplicationResponse getTenantApplication(GetTenantApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTenantApplicationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询租户开通运维事件中心的状态</p>
     * 
     * @param request GetTenantStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTenantStatusResponse
     */
    public GetTenantStatusResponse getTenantStatusWithOptions(GetTenantStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantRamId)) {
            body.put("tenantRamId", request.tenantRamId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTenantStatus"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tenant/getTenantStatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTenantStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询租户开通运维事件中心的状态</p>
     * 
     * @param request GetTenantStatusRequest
     * @return GetTenantStatusResponse
     */
    public GetTenantStatusResponse getTenantStatus(GetTenantStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTenantStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户详情</p>
     * 
     * @param request GetUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(GetUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/getUser"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户详情</p>
     * 
     * @param request GetUserRequest
     * @return GetUserResponse
     */
    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户新手引导状态</p>
     * 
     * @param request GetUserGuideStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserGuideStatusResponse
     */
    public GetUserGuideStatusResponse getUserGuideStatusWithOptions(GetUserGuideStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserGuideStatus"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/guide/status"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserGuideStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户新手引导状态</p>
     * 
     * @param request GetUserGuideStatusRequest
     * @return GetUserGuideStatusResponse
     */
    public GetUserGuideStatusResponse getUserGuideStatus(GetUserGuideStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserGuideStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>报警列表查询</p>
     * 
     * @param request ListAlertsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertsResponse
     */
    public ListAlertsResponse listAlertsWithOptions(ListAlertsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertLevel)) {
            body.put("alertLevel", request.alertLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertName)) {
            body.put("alertName", request.alertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertSourceName)) {
            body.put("alertSourceName", request.alertSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorSourceId)) {
            body.put("monitorSourceId", request.monitorSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedServiceId)) {
            body.put("relatedServiceId", request.relatedServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("ruleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlerts"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/alerts/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>报警列表查询</p>
     * 
     * @param request ListAlertsRequest
     * @return ListAlertsResponse
     */
    public ListAlertsResponse listAlerts(ListAlertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlertsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>监控关联规则列表</p>
     * 
     * @param request ListByMonitorSourceIdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListByMonitorSourceIdResponse
     */
    public ListByMonitorSourceIdResponse listByMonitorSourceIdWithOptions(ListByMonitorSourceIdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.monitorSourceId)) {
            body.put("monitorSourceId", request.monitorSourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListByMonitorSourceId"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/routeRule/listByMonitorSourceId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListByMonitorSourceIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>监控关联规则列表</p>
     * 
     * @param request ListByMonitorSourceIdRequest
     * @return ListByMonitorSourceIdResponse
     */
    public ListByMonitorSourceIdResponse listByMonitorSourceId(ListByMonitorSourceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listByMonitorSourceIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>统计图表数据-个人</p>
     * 
     * @param request ListChartDataForServiceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChartDataForServiceGroupResponse
     */
    public ListChartDataForServiceGroupResponse listChartDataForServiceGroupWithOptions(ListChartDataForServiceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChartDataForServiceGroup"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/statistics/chartDataForServiceGroup/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChartDataForServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>统计图表数据-个人</p>
     * 
     * @param request ListChartDataForServiceGroupRequest
     * @return ListChartDataForServiceGroupResponse
     */
    public ListChartDataForServiceGroupResponse listChartDataForServiceGroup(ListChartDataForServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChartDataForServiceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>统计图表数据-个人</p>
     * 
     * @param request ListChartDataForUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChartDataForUserResponse
     */
    public ListChartDataForUserResponse listChartDataForUserWithOptions(ListChartDataForUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChartDataForUser"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/statistics/chartDataForUser/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChartDataForUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>统计图表数据-个人</p>
     * 
     * @param request ListChartDataForUserRequest
     * @return ListChartDataForUserResponse
     */
    public ListChartDataForUserResponse listChartDataForUser(ListChartDataForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChartDataForUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>全局码表配置</p>
     * 
     * @param request ListConfigsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConfigsResponse
     */
    public ListConfigsResponse listConfigsWithOptions(ListConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigs"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/config/all"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>全局码表配置</p>
     * 
     * @param request ListConfigsRequest
     * @return ListConfigsResponse
     */
    public ListConfigsResponse listConfigs(ListConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConfigsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务组事件统计报表</p>
     * 
     * @param request ListDataReportForServiceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataReportForServiceGroupResponse
     */
    public ListDataReportForServiceGroupResponse listDataReportForServiceGroupWithOptions(ListDataReportForServiceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupName)) {
            body.put("serviceGroupName", request.serviceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataReportForServiceGroup"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/statistics/listDataReportForServiceGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataReportForServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务组事件统计报表</p>
     * 
     * @param request ListDataReportForServiceGroupRequest
     * @return ListDataReportForServiceGroupResponse
     */
    public ListDataReportForServiceGroupResponse listDataReportForServiceGroup(ListDataReportForServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataReportForServiceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户事件统计报表</p>
     * 
     * @param request ListDataReportForUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataReportForUserResponse
     */
    public ListDataReportForUserResponse listDataReportForUserWithOptions(ListDataReportForUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataReportForUser"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/statistics/listDataReportForUser"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataReportForUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户事件统计报表</p>
     * 
     * @param request ListDataReportForUserRequest
     * @return ListDataReportForUserResponse
     */
    public ListDataReportForUserResponse listDataReportForUser(ListDataReportForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataReportForUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>字典列表</p>
     * 
     * @param request ListDictionariesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDictionariesResponse
     */
    public ListDictionariesResponse listDictionariesWithOptions(ListDictionariesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDictionaries"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dict/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDictionariesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>字典列表</p>
     * 
     * @param request ListDictionariesRequest
     * @return ListDictionariesResponse
     */
    public ListDictionariesResponse listDictionaries(ListDictionariesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDictionariesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取已选中的服务对象</p>
     * 
     * @param request ListEscalationPlanServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEscalationPlanServicesResponse
     */
    public ListEscalationPlanServicesResponse listEscalationPlanServicesWithOptions(ListEscalationPlanServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEscalationPlanServices"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/escalationPlan/services"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEscalationPlanServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取已选中的服务对象</p>
     * 
     * @param request ListEscalationPlanServicesRequest
     * @return ListEscalationPlanServicesResponse
     */
    public ListEscalationPlanServicesResponse listEscalationPlanServices(ListEscalationPlanServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEscalationPlanServicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>升级计划列表添加服务删除字段</p>
     * 
     * @param request ListEscalationPlansRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEscalationPlansResponse
     */
    public ListEscalationPlansResponse listEscalationPlansWithOptions(ListEscalationPlansRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanName)) {
            body.put("escalationPlanName", request.escalationPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isGlobal)) {
            body.put("isGlobal", request.isGlobal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEscalationPlans"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/escalationPlan/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEscalationPlansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>升级计划列表添加服务删除字段</p>
     * 
     * @param request ListEscalationPlansRequest
     * @return ListEscalationPlansResponse
     */
    public ListEscalationPlansResponse listEscalationPlans(ListEscalationPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEscalationPlansWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据推送对象查询升级策略</p>
     * 
     * @param request ListEscalationPlansByNoticeObjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEscalationPlansByNoticeObjectResponse
     */
    public ListEscalationPlansByNoticeObjectResponse listEscalationPlansByNoticeObjectWithOptions(ListEscalationPlansByNoticeObjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.noticeObjectId)) {
            body.put("noticeObjectId", request.noticeObjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeObjectType)) {
            body.put("noticeObjectType", request.noticeObjectType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEscalationPlansByNoticeObject"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/escalationPlan/listByNoticeObject"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEscalationPlansByNoticeObjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据推送对象查询升级策略</p>
     * 
     * @param request ListEscalationPlansByNoticeObjectRequest
     * @return ListEscalationPlansByNoticeObjectResponse
     */
    public ListEscalationPlansByNoticeObjectResponse listEscalationPlansByNoticeObject(ListEscalationPlansByNoticeObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEscalationPlansByNoticeObjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>事件详情升级策略</p>
     * 
     * @param request ListIncidentDetailEscalationPlansRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIncidentDetailEscalationPlansResponse
     */
    public ListIncidentDetailEscalationPlansResponse listIncidentDetailEscalationPlansWithOptions(ListIncidentDetailEscalationPlansRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentId)) {
            body.put("incidentId", request.incidentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIncidentDetailEscalationPlans"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/detail/escalation"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIncidentDetailEscalationPlansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>事件详情升级策略</p>
     * 
     * @param request ListIncidentDetailEscalationPlansRequest
     * @return ListIncidentDetailEscalationPlansResponse
     */
    public ListIncidentDetailEscalationPlansResponse listIncidentDetailEscalationPlans(ListIncidentDetailEscalationPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIncidentDetailEscalationPlansWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件详情动态</p>
     * 
     * @param request ListIncidentDetailTimelinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIncidentDetailTimelinesResponse
     */
    public ListIncidentDetailTimelinesResponse listIncidentDetailTimelinesWithOptions(ListIncidentDetailTimelinesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idSort)) {
            body.put("idSort", request.idSort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentId)) {
            body.put("incidentId", request.incidentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIncidentDetailTimelines"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/detail/timeline"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIncidentDetailTimelinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件详情动态</p>
     * 
     * @param request ListIncidentDetailTimelinesRequest
     * @return ListIncidentDetailTimelinesResponse
     */
    public ListIncidentDetailTimelinesResponse listIncidentDetailTimelines(ListIncidentDetailTimelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIncidentDetailTimelinesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件小计</p>
     * 
     * @param request ListIncidentSubtotalsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIncidentSubtotalsResponse
     */
    public ListIncidentSubtotalsResponse listIncidentSubtotalsWithOptions(ListIncidentSubtotalsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentId)) {
            body.put("incidentId", request.incidentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIncidentSubtotals"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/list/subtotal"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIncidentSubtotalsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件小计</p>
     * 
     * @param request ListIncidentSubtotalsRequest
     * @return ListIncidentSubtotalsResponse
     */
    public ListIncidentSubtotalsResponse listIncidentSubtotals(ListIncidentSubtotalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIncidentSubtotalsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>事件动态</p>
     * 
     * @param request ListIncidentTimelinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIncidentTimelinesResponse
     */
    public ListIncidentTimelinesResponse listIncidentTimelinesWithOptions(ListIncidentTimelinesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIncidentTimelines"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/timeline"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIncidentTimelinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>事件动态</p>
     * 
     * @param request ListIncidentTimelinesRequest
     * @return ListIncidentTimelinesResponse
     */
    public ListIncidentTimelinesResponse listIncidentTimelines(ListIncidentTimelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIncidentTimelinesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取事件列表</p>
     * 
     * @param request ListIncidentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIncidentsResponse
     */
    public ListIncidentsResponse listIncidentsWithOptions(ListIncidentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createEndTime)) {
            body.put("createEndTime", request.createEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createStartTime)) {
            body.put("createStartTime", request.createStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effect)) {
            body.put("effect", request.effect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentLevel)) {
            body.put("incidentLevel", request.incidentLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentStatus)) {
            body.put("incidentStatus", request.incidentStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.me)) {
            body.put("me", request.me);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationServiceId)) {
            body.put("relationServiceId", request.relationServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("ruleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIncidents"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIncidentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取事件列表</p>
     * 
     * @param request ListIncidentsRequest
     * @return ListIncidentsResponse
     */
    public ListIncidentsResponse listIncidents(ListIncidentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIncidentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取集成配置动态</p>
     * 
     * @param request ListIntegrationConfigTimelinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntegrationConfigTimelinesResponse
     */
    public ListIntegrationConfigTimelinesResponse listIntegrationConfigTimelinesWithOptions(ListIntegrationConfigTimelinesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationConfigId)) {
            body.put("integrationConfigId", request.integrationConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntegrationConfigTimelines"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integrationConfig/timeline"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntegrationConfigTimelinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取集成配置动态</p>
     * 
     * @param request ListIntegrationConfigTimelinesRequest
     * @return ListIntegrationConfigTimelinesResponse
     */
    public ListIntegrationConfigTimelinesResponse listIntegrationConfigTimelines(ListIntegrationConfigTimelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIntegrationConfigTimelinesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取集成配置列表</p>
     * 
     * @param request ListIntegrationConfigsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntegrationConfigsResponse
     */
    public ListIntegrationConfigsResponse listIntegrationConfigsWithOptions(ListIntegrationConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorSourceName)) {
            body.put("monitorSourceName", request.monitorSourceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntegrationConfigs"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integrationConfig/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntegrationConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取集成配置列表</p>
     * 
     * @param request ListIntegrationConfigsRequest
     * @return ListIntegrationConfigsResponse
     */
    public ListIntegrationConfigsResponse listIntegrationConfigs(ListIntegrationConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIntegrationConfigsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListMonitorSources</p>
     * 
     * @param request ListMonitorSourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMonitorSourcesResponse
     */
    public ListMonitorSourcesResponse listMonitorSourcesWithOptions(ListMonitorSourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMonitorSources"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/monitorSource/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMonitorSourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListMonitorSources</p>
     * 
     * @param request ListMonitorSourcesRequest
     * @return ListMonitorSourcesResponse
     */
    public ListMonitorSourcesResponse listMonitorSources(ListMonitorSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMonitorSourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>故障详情动态</p>
     * 
     * @param request ListProblemDetailOperationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProblemDetailOperationsResponse
     */
    public ListProblemDetailOperationsResponse listProblemDetailOperationsWithOptions(ListProblemDetailOperationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeSort)) {
            body.put("createTimeSort", request.createTimeSort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProblemDetailOperations"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/detail/operations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProblemDetailOperationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>故障详情动态</p>
     * 
     * @param request ListProblemDetailOperationsRequest
     * @return ListProblemDetailOperationsResponse
     */
    public ListProblemDetailOperationsResponse listProblemDetailOperations(ListProblemDetailOperationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProblemDetailOperationsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询故障7天内动态</p>
     * 
     * @param request ListProblemOperationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProblemOperationsResponse
     */
    public ListProblemOperationsResponse listProblemOperationsWithOptions(ListProblemOperationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProblemOperations"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/operations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProblemOperationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询故障7天内动态</p>
     * 
     * @param request ListProblemOperationsRequest
     * @return ListProblemOperationsResponse
     */
    public ListProblemOperationsResponse listProblemOperations(ListProblemOperationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProblemOperationsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询故障小计</p>
     * 
     * @param request ListProblemSubtotalsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProblemSubtotalsResponse
     */
    public ListProblemSubtotalsResponse listProblemSubtotalsWithOptions(ListProblemSubtotalsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProblemSubtotals"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/list/subtotal"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProblemSubtotalsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询故障小计</p>
     * 
     * @param request ListProblemSubtotalsRequest
     * @return ListProblemSubtotalsResponse
     */
    public ListProblemSubtotalsResponse listProblemSubtotals(ListProblemSubtotalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProblemSubtotalsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询故障操作时间线列表</p>
     * 
     * @param request ListProblemTimeLinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProblemTimeLinesResponse
     */
    public ListProblemTimeLinesResponse listProblemTimeLinesWithOptions(ListProblemTimeLinesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProblemTimeLines"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/detail/timeLines"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProblemTimeLinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询故障操作时间线列表</p>
     * 
     * @param request ListProblemTimeLinesRequest
     * @return ListProblemTimeLinesResponse
     */
    public ListProblemTimeLinesResponse listProblemTimeLines(ListProblemTimeLinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProblemTimeLinesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>故障列表查询接口</p>
     * 
     * @param request ListProblemsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProblemsResponse
     */
    public ListProblemsResponse listProblemsWithOptions(ListProblemsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.affectServiceId)) {
            body.put("affectServiceId", request.affectServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discoveryEndTime)) {
            body.put("discoveryEndTime", request.discoveryEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discoveryStartTime)) {
            body.put("discoveryStartTime", request.discoveryStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainHandlerId)) {
            body.put("mainHandlerId", request.mainHandlerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemLevel)) {
            body.put("problemLevel", request.problemLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemStatus)) {
            body.put("problemStatus", request.problemStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            body.put("queryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeaterId)) {
            body.put("repeaterId", request.repeaterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreEndTime)) {
            body.put("restoreEndTime", request.restoreEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreStartTime)) {
            body.put("restoreStartTime", request.restoreStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProblems"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/listProblems"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProblemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>故障列表查询接口</p>
     * 
     * @param request ListProblemsRequest
     * @return ListProblemsResponse
     */
    public ListProblemsResponse listProblems(ListProblemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProblemsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询流转规则列表</p>
     * 
     * @param request ListRouteRulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRouteRulesResponse
     */
    public ListRouteRulesResponse listRouteRulesWithOptions(ListRouteRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notFilterRouteRuleDeleted)) {
            body.put("notFilterRouteRuleDeleted", request.notFilterRouteRuleDeleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeType)) {
            body.put("routeType", request.routeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("ruleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("serviceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRouteRules"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/routeRule/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRouteRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询流转规则列表</p>
     * 
     * @param request ListRouteRulesRequest
     * @return ListRouteRulesResponse
     */
    public ListRouteRulesResponse listRouteRules(ListRouteRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRouteRulesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定分配对象的流转规则</p>
     * 
     * @param request ListRouteRulesByAssignWhoIdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRouteRulesByAssignWhoIdResponse
     */
    public ListRouteRulesByAssignWhoIdResponse listRouteRulesByAssignWhoIdWithOptions(ListRouteRulesByAssignWhoIdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assignWhoId)) {
            body.put("assignWhoId", request.assignWhoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assignWhoType)) {
            body.put("assignWhoType", request.assignWhoType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRouteRulesByAssignWhoId"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/routeRule/listByAssignWhoId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRouteRulesByAssignWhoIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定分配对象的流转规则</p>
     * 
     * @param request ListRouteRulesByAssignWhoIdRequest
     * @return ListRouteRulesByAssignWhoIdResponse
     */
    public ListRouteRulesByAssignWhoIdResponse listRouteRulesByAssignWhoId(ListRouteRulesByAssignWhoIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRouteRulesByAssignWhoIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据服务id查询流转规则</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRouteRulesByServiceResponse
     */
    public ListRouteRulesByServiceResponse listRouteRulesByServiceWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRouteRulesByService"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/routeRule/listByService"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRouteRulesByServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据服务id查询流转规则</p>
     * @return ListRouteRulesByServiceResponse
     */
    public ListRouteRulesByServiceResponse listRouteRulesByService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRouteRulesByServiceWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务组监控源模版列表</p>
     * 
     * @param request ListServiceGroupMonitorSourceTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceGroupMonitorSourceTemplatesResponse
     */
    public ListServiceGroupMonitorSourceTemplatesResponse listServiceGroupMonitorSourceTemplatesWithOptions(ListServiceGroupMonitorSourceTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceGroupMonitorSourceTemplates"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/listServiceGroupMonitorSourceTemplates"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceGroupMonitorSourceTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务组监控源模版列表</p>
     * 
     * @param request ListServiceGroupMonitorSourceTemplatesRequest
     * @return ListServiceGroupMonitorSourceTemplatesResponse
     */
    public ListServiceGroupMonitorSourceTemplatesResponse listServiceGroupMonitorSourceTemplates(ListServiceGroupMonitorSourceTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceGroupMonitorSourceTemplatesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务组列表</p>
     * 
     * @param request ListServiceGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceGroupsResponse
     */
    public ListServiceGroupsResponse listServiceGroupsWithOptions(ListServiceGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isScheduled)) {
            body.put("isScheduled", request.isScheduled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByScheduleStatus)) {
            body.put("orderByScheduleStatus", request.orderByScheduleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryName)) {
            body.put("queryName", request.queryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            body.put("queryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceGroups"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务组列表</p>
     * 
     * @param request ListServiceGroupsRequest
     * @return ListServiceGroupsResponse
     */
    public ListServiceGroupsResponse listServiceGroups(ListServiceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据成员id查服务组</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceGroupsByUserIdResponse
     */
    public ListServiceGroupsByUserIdResponse listServiceGroupsByUserIdWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceGroupsByUserId"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/listByUserId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceGroupsByUserIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据成员id查服务组</p>
     * @return ListServiceGroupsByUserIdResponse
     */
    public ListServiceGroupsByUserIdResponse listServiceGroupsByUserId() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceGroupsByUserIdWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务组列表</p>
     * 
     * @param request ListServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServicesResponse
     */
    public ListServicesResponse listServicesWithOptions(ListServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("serviceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServices"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务组列表</p>
     * 
     * @param request ListServicesRequest
     * @return ListServicesResponse
     */
    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>原始告警列表查询</p>
     * 
     * @param request ListSourceEventsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSourceEventsResponse
     */
    public ListSourceEventsResponse listSourceEventsWithOptions(ListSourceEventsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startRowKey)) {
            body.put("startRowKey", request.startRowKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopRowKey)) {
            body.put("stopRowKey", request.stopRowKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSourceEvents"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/events/listOriginalEvent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSourceEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>原始告警列表查询</p>
     * 
     * @param request ListSourceEventsRequest
     * @return ListSourceEventsResponse
     */
    public ListSourceEventsResponse listSourceEvents(ListSourceEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSourceEventsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询监控员最近10次告警</p>
     * 
     * @param request ListSourceEventsForMonitorSourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSourceEventsForMonitorSourceResponse
     */
    public ListSourceEventsForMonitorSourceResponse listSourceEventsForMonitorSourceWithOptions(ListSourceEventsForMonitorSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.monitorSourceId)) {
            body.put("monitorSourceId", request.monitorSourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSourceEventsForMonitorSource"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/events/queryLastestEvents"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSourceEventsForMonitorSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询监控员最近10次告警</p>
     * 
     * @param request ListSourceEventsForMonitorSourceRequest
     * @return ListSourceEventsForMonitorSourceResponse
     */
    public ListSourceEventsForMonitorSourceResponse listSourceEventsForMonitorSource(ListSourceEventsForMonitorSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSourceEventsForMonitorSourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>订阅通知服务组查询</p>
     * 
     * @param request ListSubscriptionServiceGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubscriptionServiceGroupsResponse
     */
    public ListSubscriptionServiceGroupsResponse listSubscriptionServiceGroupsWithOptions(ListSubscriptionServiceGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceIds)) {
            body.put("serviceIds", request.serviceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubscriptionServiceGroups"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/serviceGroup/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubscriptionServiceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>订阅通知服务组查询</p>
     * 
     * @param request ListSubscriptionServiceGroupsRequest
     * @return ListSubscriptionServiceGroupsResponse
     */
    public ListSubscriptionServiceGroupsResponse listSubscriptionServiceGroups(ListSubscriptionServiceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSubscriptionServiceGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通知订阅列表</p>
     * 
     * @param request ListSubscriptionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubscriptionsResponse
     */
    public ListSubscriptionsResponse listSubscriptionsWithOptions(ListSubscriptionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notFilterScopeObjectDeleted)) {
            body.put("notFilterScopeObjectDeleted", request.notFilterScopeObjectDeleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyObject)) {
            body.put("notifyObject", request.notifyObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyObjectType)) {
            body.put("notifyObjectType", request.notifyObjectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeObject)) {
            body.put("scopeObject", request.scopeObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionTitle)) {
            body.put("subscriptionTitle", request.subscriptionTitle);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubscriptions"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/notify/subscription/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubscriptionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通知订阅列表</p>
     * 
     * @param request ListSubscriptionsRequest
     * @return ListSubscriptionsResponse
     */
    public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSubscriptionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询原始告警趋势</p>
     * 
     * @param request ListTrendForSourceEventRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrendForSourceEventResponse
     */
    public ListTrendForSourceEventResponse listTrendForSourceEventWithOptions(ListTrendForSourceEventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeUnit)) {
            body.put("timeUnit", request.timeUnit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrendForSourceEvent"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/events/querySourceEventTrend"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrendForSourceEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询原始告警趋势</p>
     * 
     * @param request ListTrendForSourceEventRequest
     * @return ListTrendForSourceEventResponse
     */
    public ListTrendForSourceEventResponse listTrendForSourceEvent(ListTrendForSourceEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTrendForSourceEventWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>用户预览</p>
     * 
     * @param request ListUserSerivceGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserSerivceGroupsResponse
     */
    public ListUserSerivceGroupsResponse listUserSerivceGroupsWithOptions(ListUserSerivceGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserSerivceGroups"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/preview/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserSerivceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>用户预览</p>
     * 
     * @param request ListUserSerivceGroupsRequest
     * @return ListUserSerivceGroupsResponse
     */
    public ListUserSerivceGroupsResponse listUserSerivceGroups(ListUserSerivceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserSerivceGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>人员列表</p>
     * 
     * @param request ListUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramId)) {
            body.put("ramId", request.ramId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synergyChannel)) {
            body.put("synergyChannel", request.synergyChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>人员列表</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUsersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>监控数据接入API</p>
     * 
     * @param request PushMonitorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushMonitorResponse
     */
    public PushMonitorResponse pushMonitorWithOptions(String apiKey, PushMonitorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushMonitor"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/monitor/push/" + com.aliyun.openapiutil.Client.getEncodeParam(apiKey) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>监控数据接入API</p>
     * 
     * @param request PushMonitorRequest
     * @return PushMonitorResponse
     */
    public PushMonitorResponse pushMonitor(String apiKey, PushMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushMonitorWithOptions(apiKey, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>故障恢复</p>
     * 
     * @param request RecoverProblemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecoverProblemResponse
     */
    public RecoverProblemResponse recoverProblemWithOptions(RecoverProblemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemNotifyType)) {
            body.put("problemNotifyType", request.problemNotifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryTime)) {
            body.put("recoveryTime", request.recoveryTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecoverProblem"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/recovery"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecoverProblemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>故障恢复</p>
     * 
     * @param request RecoverProblemRequest
     * @return RecoverProblemResponse
     */
    public RecoverProblemResponse recoverProblem(RecoverProblemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recoverProblemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>刷新集成配置key</p>
     * 
     * @param request RefreshIntegrationConfigKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshIntegrationConfigKeyResponse
     */
    public RefreshIntegrationConfigKeyResponse refreshIntegrationConfigKeyWithOptions(RefreshIntegrationConfigKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationConfigId)) {
            body.put("integrationConfigId", request.integrationConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshIntegrationConfigKey"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integrationConfig/refreshKey"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshIntegrationConfigKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>刷新集成配置key</p>
     * 
     * @param request RefreshIntegrationConfigKeyRequest
     * @return RefreshIntegrationConfigKeyResponse
     */
    public RefreshIntegrationConfigKeyResponse refreshIntegrationConfigKey(RefreshIntegrationConfigKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refreshIntegrationConfigKeyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解除集成配置</p>
     * 
     * @param request RemoveIntegrationConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveIntegrationConfigResponse
     */
    public RemoveIntegrationConfigResponse removeIntegrationConfigWithOptions(RemoveIntegrationConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationConfigId)) {
            body.put("integrationConfigId", request.integrationConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveIntegrationConfig"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integrationConfig/remove"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveIntegrationConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解除集成配置</p>
     * 
     * @param request RemoveIntegrationConfigRequest
     * @return RemoveIntegrationConfigResponse
     */
    public RemoveIntegrationConfigResponse removeIntegrationConfig(RemoveIntegrationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeIntegrationConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除故障协同组</p>
     * 
     * @param request RemoveProblemServiceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveProblemServiceGroupResponse
     */
    public RemoveProblemServiceGroupResponse removeProblemServiceGroupWithOptions(RemoveProblemServiceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupIds)) {
            body.put("serviceGroupIds", request.serviceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveProblemServiceGroup"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/removeServiceGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveProblemServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除故障协同组</p>
     * 
     * @param request RemoveProblemServiceGroupRequest
     * @return RemoveProblemServiceGroupResponse
     */
    public RemoveProblemServiceGroupResponse removeProblemServiceGroup(RemoveProblemServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeProblemServiceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>故障复盘</p>
     * 
     * @param request ReplayProblemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReplayProblemResponse
     */
    public ReplayProblemResponse replayProblemWithOptions(ReplayProblemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replayDutyUserId)) {
            body.put("replayDutyUserId", request.replayDutyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplayProblem"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/replay"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplayProblemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>故障复盘</p>
     * 
     * @param request ReplayProblemRequest
     * @return ReplayProblemResponse
     */
    public ReplayProblemResponse replayProblem(ReplayProblemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replayProblemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>事件响应</p>
     * 
     * @param request RespondIncidentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RespondIncidentResponse
     */
    public RespondIncidentResponse respondIncidentWithOptions(RespondIncidentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentIds)) {
            body.put("incidentIds", request.incidentIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RespondIncident"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/response"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RespondIncidentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>事件响应</p>
     * 
     * @param request RespondIncidentRequest
     * @return RespondIncidentResponse
     */
    public RespondIncidentResponse respondIncident(RespondIncidentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.respondIncidentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>故障撤销恢复</p>
     * 
     * @param request RevokeProblemRecoveryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeProblemRecoveryResponse
     */
    public RevokeProblemRecoveryResponse revokeProblemRecoveryWithOptions(RevokeProblemRecoveryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemNotifyType)) {
            body.put("problemNotifyType", request.problemNotifyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeProblemRecovery"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/revoke"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeProblemRecoveryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>故障撤销恢复</p>
     * 
     * @param request RevokeProblemRecoveryRequest
     * @return RevokeProblemRecoveryResponse
     */
    public RevokeProblemRecoveryResponse revokeProblemRecovery(RevokeProblemRecoveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeProblemRecoveryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑用户</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindUserResponse
     */
    public UnbindUserResponse unbindUserWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindUser"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/unbind"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑用户</p>
     * @return UnbindUserResponse
     */
    public UnbindUserResponse unbindUser() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindUserWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新升级计划</p>
     * 
     * @param request UpdateEscalationPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEscalationPlanResponse
     */
    public UpdateEscalationPlanResponse updateEscalationPlanWithOptions(UpdateEscalationPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanDescription)) {
            body.put("escalationPlanDescription", request.escalationPlanDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanId)) {
            body.put("escalationPlanId", request.escalationPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanName)) {
            body.put("escalationPlanName", request.escalationPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanRules)) {
            body.put("escalationPlanRules", request.escalationPlanRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanScopeObjects)) {
            body.put("escalationPlanScopeObjects", request.escalationPlanScopeObjects);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isGlobal)) {
            body.put("isGlobal", request.isGlobal);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEscalationPlan"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/escalationPlan/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEscalationPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新升级计划</p>
     * 
     * @param request UpdateEscalationPlanRequest
     * @return UpdateEscalationPlanResponse
     */
    public UpdateEscalationPlanResponse updateEscalationPlan(UpdateEscalationPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEscalationPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新事件详情</p>
     * 
     * @param request UpdateIncidentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIncidentResponse
     */
    public UpdateIncidentResponse updateIncidentWithOptions(UpdateIncidentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effect)) {
            body.put("effect", request.effect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentId)) {
            body.put("incidentId", request.incidentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentLevel)) {
            body.put("incidentLevel", request.incidentLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentTitle)) {
            body.put("incidentTitle", request.incidentTitle);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIncident"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/incident/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIncidentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新事件详情</p>
     * 
     * @param request UpdateIncidentRequest
     * @return UpdateIncidentResponse
     */
    public UpdateIncidentResponse updateIncident(UpdateIncidentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIncidentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新集成配置</p>
     * 
     * @param request UpdateIntegrationConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIntegrationConfigResponse
     */
    public UpdateIntegrationConfigResponse updateIntegrationConfigWithOptions(UpdateIntegrationConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            body.put("accessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationConfigId)) {
            body.put("integrationConfigId", request.integrationConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIntegrationConfig"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integrationConfig/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIntegrationConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新集成配置</p>
     * 
     * @param request UpdateIntegrationConfigRequest
     * @return UpdateIntegrationConfigResponse
     */
    public UpdateIntegrationConfigResponse updateIntegrationConfig(UpdateIntegrationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIntegrationConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新故障</p>
     * 
     * @param request UpdateProblemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProblemResponse
     */
    public UpdateProblemResponse updateProblemWithOptions(UpdateProblemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.feedback)) {
            body.put("feedback", request.feedback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainHandlerId)) {
            body.put("mainHandlerId", request.mainHandlerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preliminaryReason)) {
            body.put("preliminaryReason", request.preliminaryReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemName)) {
            body.put("problemName", request.problemName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.progressSummary)) {
            body.put("progressSummary", request.progressSummary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.progressSummaryRichTextId)) {
            body.put("progressSummaryRichTextId", request.progressSummaryRichTextId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedServiceId)) {
            body.put("relatedServiceId", request.relatedServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupIds)) {
            body.put("serviceGroupIds", request.serviceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProblem"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProblemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新故障</p>
     * 
     * @param request UpdateProblemRequest
     * @return UpdateProblemResponse
     */
    public UpdateProblemResponse updateProblem(UpdateProblemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProblemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新故障影响服务</p>
     * 
     * @param request UpdateProblemEffectionServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProblemEffectionServiceResponse
     */
    public UpdateProblemEffectionServiceResponse updateProblemEffectionServiceWithOptions(UpdateProblemEffectionServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectionServiceId)) {
            body.put("effectionServiceId", request.effectionServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picUrl)) {
            body.put("picUrl", request.picUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProblemEffectionService"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/process/effectionService/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProblemEffectionServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新故障影响服务</p>
     * 
     * @param request UpdateProblemEffectionServiceRequest
     * @return UpdateProblemEffectionServiceResponse
     */
    public UpdateProblemEffectionServiceResponse updateProblemEffectionService(UpdateProblemEffectionServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProblemEffectionServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>改进分析更新</p>
     * 
     * @param request UpdateProblemImprovementRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProblemImprovementResponse
     */
    public UpdateProblemImprovementResponse updateProblemImprovementWithOptions(UpdateProblemImprovementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customProblemReason)) {
            body.put("customProblemReason", request.customProblemReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discoverSource)) {
            body.put("discoverSource", request.discoverSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dutyDepartmentId)) {
            body.put("dutyDepartmentId", request.dutyDepartmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dutyDepartmentName)) {
            body.put("dutyDepartmentName", request.dutyDepartmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dutyUserId)) {
            body.put("dutyUserId", request.dutyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.injectionMode)) {
            body.put("injectionMode", request.injectionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorSourceName)) {
            body.put("monitorSourceName", request.monitorSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemReason)) {
            body.put("problemReason", request.problemReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recentActivity)) {
            body.put("recentActivity", request.recentActivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryMode)) {
            body.put("recoveryMode", request.recoveryMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationChanges)) {
            body.put("relationChanges", request.relationChanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replayDutyUserId)) {
            body.put("replayDutyUserId", request.replayDutyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userReport)) {
            body.put("userReport", request.userReport);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProblemImprovement"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/improvement/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProblemImprovementResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>改进分析更新</p>
     * 
     * @param request UpdateProblemImprovementRequest
     * @return UpdateProblemImprovementResponse
     */
    public UpdateProblemImprovementResponse updateProblemImprovement(UpdateProblemImprovementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProblemImprovementWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>改进措施更新</p>
     * 
     * @param request UpdateProblemMeasureRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProblemMeasureResponse
     */
    public UpdateProblemMeasureResponse updateProblemMeasureWithOptions(UpdateProblemMeasureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkStandard)) {
            body.put("checkStandard", request.checkStandard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkUserId)) {
            body.put("checkUserId", request.checkUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directorId)) {
            body.put("directorId", request.directorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.measureId)) {
            body.put("measureId", request.measureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planFinishTime)) {
            body.put("planFinishTime", request.planFinishTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stalkerId)) {
            body.put("stalkerId", request.stalkerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProblemMeasure"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/improvement/measure/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProblemMeasureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>改进措施更新</p>
     * 
     * @param request UpdateProblemMeasureRequest
     * @return UpdateProblemMeasureResponse
     */
    public UpdateProblemMeasureResponse updateProblemMeasure(UpdateProblemMeasureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProblemMeasureWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新故障通知</p>
     * 
     * @param request UpdateProblemNoticeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProblemNoticeResponse
     */
    public UpdateProblemNoticeResponse updateProblemNoticeWithOptions(UpdateProblemNoticeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemNotifyType)) {
            body.put("problemNotifyType", request.problemNotifyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProblemNotice"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/notify"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProblemNoticeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新故障通知</p>
     * 
     * @param request UpdateProblemNoticeRequest
     * @return UpdateProblemNoticeResponse
     */
    public UpdateProblemNoticeResponse updateProblemNotice(UpdateProblemNoticeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProblemNoticeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新故障时间线节点</p>
     * 
     * @param request UpdateProblemTimelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProblemTimelineResponse
     */
    public UpdateProblemTimelineResponse updateProblemTimelineWithOptions(UpdateProblemTimelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyNode)) {
            body.put("keyNode", request.keyNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemTimelineId)) {
            body.put("problemTimelineId", request.problemTimelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            body.put("time", request.time);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProblemTimeline"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/problem/process/timeline/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProblemTimelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新故障时间线节点</p>
     * 
     * @param request UpdateProblemTimelineRequest
     * @return UpdateProblemTimelineResponse
     */
    public UpdateProblemTimelineResponse updateProblemTimeline(UpdateProblemTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProblemTimelineWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新富文本</p>
     * 
     * @param request UpdateRichTextRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRichTextResponse
     */
    public UpdateRichTextResponse updateRichTextWithOptions(UpdateRichTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.richText)) {
            body.put("richText", request.richText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.richTextId)) {
            body.put("richTextId", request.richTextId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRichText"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/rich/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRichTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新富文本</p>
     * 
     * @param request UpdateRichTextRequest
     * @return UpdateRichTextResponse
     */
    public UpdateRichTextResponse updateRichText(UpdateRichTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRichTextWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新流转规则</p>
     * 
     * @param request UpdateRouteRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRouteRuleResponse
     */
    public UpdateRouteRuleResponse updateRouteRuleWithOptions(UpdateRouteRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assignObjectId)) {
            body.put("assignObjectId", request.assignObjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assignObjectType)) {
            body.put("assignObjectType", request.assignObjectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childRuleRelation)) {
            body.put("childRuleRelation", request.childRuleRelation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.convergenceFields)) {
            body.put("convergenceFields", request.convergenceFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.convergenceType)) {
            body.put("convergenceType", request.convergenceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverageProblemLevels)) {
            body.put("coverageProblemLevels", request.coverageProblemLevels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effection)) {
            body.put("effection", request.effection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentLevel)) {
            body.put("incidentLevel", request.incidentLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchCount)) {
            body.put("matchCount", request.matchCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyChannels)) {
            body.put("notifyChannels", request.notifyChannels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemEffectionServices)) {
            body.put("problemEffectionServices", request.problemEffectionServices);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemLevelGroup)) {
            body.put("problemLevelGroup", request.problemLevelGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedServiceId)) {
            body.put("relatedServiceId", request.relatedServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeChildRules)) {
            body.put("routeChildRules", request.routeChildRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeRuleId)) {
            body.put("routeRuleId", request.routeRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeType)) {
            body.put("routeType", request.routeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("ruleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeWindow)) {
            body.put("timeWindow", request.timeWindow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeWindowUnit)) {
            body.put("timeWindowUnit", request.timeWindowUnit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRouteRule"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/routeRule/edit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRouteRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新流转规则</p>
     * 
     * @param request UpdateRouteRuleRequest
     * @return UpdateRouteRuleResponse
     */
    public UpdateRouteRuleResponse updateRouteRule(UpdateRouteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRouteRuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务</p>
     * 
     * @param request UpdateServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateServiceWithOptions(UpdateServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanId)) {
            body.put("escalationPlanId", request.escalationPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDescription)) {
            body.put("serviceDescription", request.serviceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupIdList)) {
            body.put("serviceGroupIdList", request.serviceGroupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("serviceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateService"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务</p>
     * 
     * @param request UpdateServiceRequest
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateService(UpdateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务组</p>
     * 
     * @param request UpdateServiceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceGroupResponse
     */
    public UpdateServiceGroupResponse updateServiceGroupWithOptions(UpdateServiceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableWebhook)) {
            body.put("enableWebhook", request.enableWebhook);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorSourceTemplates)) {
            body.put("monitorSourceTemplates", request.monitorSourceTemplates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupDescription)) {
            body.put("serviceGroupDescription", request.serviceGroupDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupName)) {
            body.put("serviceGroupName", request.serviceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("userIds", request.userIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookLink)) {
            body.put("webhookLink", request.webhookLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookType)) {
            body.put("webhookType", request.webhookType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceGroup"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/modify"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务组</p>
     * 
     * @param request UpdateServiceGroupRequest
     * @return UpdateServiceGroupResponse
     */
    public UpdateServiceGroupResponse updateServiceGroup(UpdateServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改服务组排班</p>
     * 
     * @param request UpdateServiceGroupSchedulingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceGroupSchedulingResponse
     */
    public UpdateServiceGroupSchedulingResponse updateServiceGroupSchedulingWithOptions(UpdateServiceGroupSchedulingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fastScheduling)) {
            body.put("fastScheduling", request.fastScheduling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fineScheduling)) {
            body.put("fineScheduling", request.fineScheduling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulingWay)) {
            body.put("schedulingWay", request.schedulingWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceGroupScheduling"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/scheduling/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceGroupSchedulingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改服务组排班</p>
     * 
     * @param request UpdateServiceGroupSchedulingRequest
     * @return UpdateServiceGroupSchedulingResponse
     */
    public UpdateServiceGroupSchedulingResponse updateServiceGroupScheduling(UpdateServiceGroupSchedulingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceGroupSchedulingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改指定日期的服务组排班</p>
     * 
     * @param request UpdateServiceGroupSpecialDaySchedulingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceGroupSpecialDaySchedulingResponse
     */
    public UpdateServiceGroupSpecialDaySchedulingResponse updateServiceGroupSpecialDaySchedulingWithOptions(UpdateServiceGroupSpecialDaySchedulingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulingDate)) {
            body.put("schedulingDate", request.schedulingDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulingSpecialDays)) {
            body.put("schedulingSpecialDays", request.schedulingSpecialDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceGroupSpecialDayScheduling"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/services/group/scheduling/updateSpecialDayScheduling"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceGroupSpecialDaySchedulingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改指定日期的服务组排班</p>
     * 
     * @param request UpdateServiceGroupSpecialDaySchedulingRequest
     * @return UpdateServiceGroupSpecialDaySchedulingResponse
     */
    public UpdateServiceGroupSpecialDaySchedulingResponse updateServiceGroupSpecialDayScheduling(UpdateServiceGroupSpecialDaySchedulingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceGroupSpecialDaySchedulingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新通知订阅</p>
     * 
     * @param request UpdateSubscriptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSubscriptionResponse
     */
    public UpdateSubscriptionResponse updateSubscriptionWithOptions(UpdateSubscriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredType)) {
            body.put("expiredType", request.expiredType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyObjectList)) {
            body.put("notifyObjectList", request.notifyObjectList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyObjectType)) {
            body.put("notifyObjectType", request.notifyObjectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyStrategyList)) {
            body.put("notifyStrategyList", request.notifyStrategyList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeObjectList)) {
            body.put("scopeObjectList", request.scopeObjectList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionId)) {
            body.put("subscriptionId", request.subscriptionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionTitle)) {
            body.put("subscriptionTitle", request.subscriptionTitle);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSubscription"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/notify/subscription/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新通知订阅</p>
     * 
     * @param request UpdateSubscriptionRequest
     * @return UpdateSubscriptionResponse
     */
    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSubscriptionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新用户</p>
     * 
     * @param request UpdateUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramId)) {
            body.put("ramId", request.ramId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleIdList)) {
            body.put("roleIdList", request.roleIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新用户</p>
     * 
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新用户新手引导状态</p>
     * 
     * @param request UpdateUserGuideStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserGuideStatusResponse
     */
    public UpdateUserGuideStatusResponse updateUserGuideStatusWithOptions(UpdateUserGuideStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.guideAction)) {
            body.put("guideAction", request.guideAction);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserGuideStatus"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/update/guide/status"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserGuideStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新用户新手引导状态</p>
     * 
     * @param request UpdateUserGuideStatusRequest
     * @return UpdateUserGuideStatusResponse
     */
    public UpdateUserGuideStatusResponse updateUserGuideStatus(UpdateUserGuideStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUserGuideStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>验证流转规则</p>
     * 
     * @param request VerifyRouteRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyRouteRuleResponse
     */
    public VerifyRouteRuleResponse verifyRouteRuleWithOptions(VerifyRouteRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.routeRuleId)) {
            body.put("routeRuleId", request.routeRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testSourceEvents)) {
            body.put("testSourceEvents", request.testSourceEvents);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyRouteRule"),
            new TeaPair("version", "2021-04-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/routeRule/verify"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyRouteRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>验证流转规则</p>
     * 
     * @param request VerifyRouteRuleRequest
     * @return VerifyRouteRuleResponse
     */
    public VerifyRouteRuleResponse verifyRouteRule(VerifyRouteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyRouteRuleWithOptions(request, headers, runtime);
    }
}
