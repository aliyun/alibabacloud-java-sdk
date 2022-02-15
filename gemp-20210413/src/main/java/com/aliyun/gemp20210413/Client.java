// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413;

import com.aliyun.tea.*;
import com.aliyun.gemp20210413.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
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

    public AddProblemServiceGroupResponse addProblemServiceGroup(AddProblemServiceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addProblemServiceGroupWithOptions(request, headers, runtime);
    }

    public AddProblemServiceGroupResponse addProblemServiceGroupWithOptions(AddProblemServiceGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupIds)) {
            body.put("serviceGroupIds", request.serviceGroupIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CancelProblemResponse cancelProblem(CancelProblemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelProblemWithOptions(request, headers, runtime);
    }

    public CancelProblemResponse cancelProblemWithOptions(CancelProblemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CheckWebhookResponse checkWebhook(CheckWebhookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkWebhookWithOptions(request, headers, runtime);
    }

    public CheckWebhookResponse checkWebhookWithOptions(CheckWebhookRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ConfirmIntegrationConfigResponse confirmIntegrationConfig(ConfirmIntegrationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmIntegrationConfigWithOptions(request, headers, runtime);
    }

    public ConfirmIntegrationConfigResponse confirmIntegrationConfigWithOptions(ConfirmIntegrationConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationConfigId)) {
            body.put("integrationConfigId", request.integrationConfigId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateEscalationPlanResponse createEscalationPlan(CreateEscalationPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEscalationPlanWithOptions(request, headers, runtime);
    }

    public CreateEscalationPlanResponse createEscalationPlanWithOptions(CreateEscalationPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateIncidentResponse createIncident(CreateIncidentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIncidentWithOptions(request, headers, runtime);
    }

    public CreateIncidentResponse createIncidentWithOptions(CreateIncidentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateIncidentSubtotalResponse createIncidentSubtotal(CreateIncidentSubtotalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIncidentSubtotalWithOptions(request, headers, runtime);
    }

    public CreateIncidentSubtotalResponse createIncidentSubtotalWithOptions(CreateIncidentSubtotalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateIntegrationConfigResponse createIntegrationConfig(CreateIntegrationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIntegrationConfigWithOptions(request, headers, runtime);
    }

    public CreateIntegrationConfigResponse createIntegrationConfigWithOptions(CreateIntegrationConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorSourceId)) {
            body.put("monitorSourceId", request.monitorSourceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateProblemResponse createProblem(CreateProblemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProblemWithOptions(request, headers, runtime);
    }

    public CreateProblemResponse createProblemWithOptions(CreateProblemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateProblemEffectionServiceResponse createProblemEffectionService(CreateProblemEffectionServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProblemEffectionServiceWithOptions(request, headers, runtime);
    }

    public CreateProblemEffectionServiceResponse createProblemEffectionServiceWithOptions(CreateProblemEffectionServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateProblemMeasureResponse createProblemMeasure(CreateProblemMeasureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProblemMeasureWithOptions(request, headers, runtime);
    }

    public CreateProblemMeasureResponse createProblemMeasureWithOptions(CreateProblemMeasureRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateProblemSubtotalResponse createProblemSubtotal(CreateProblemSubtotalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProblemSubtotalWithOptions(request, headers, runtime);
    }

    public CreateProblemSubtotalResponse createProblemSubtotalWithOptions(CreateProblemSubtotalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateProblemTimelineResponse createProblemTimeline(CreateProblemTimelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProblemTimelineWithOptions(request, headers, runtime);
    }

    public CreateProblemTimelineResponse createProblemTimelineWithOptions(CreateProblemTimelineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateProblemTimelinesResponse createProblemTimelines(CreateProblemTimelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProblemTimelinesWithOptions(request, headers, runtime);
    }

    public CreateProblemTimelinesResponse createProblemTimelinesWithOptions(CreateProblemTimelinesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateRichTextResponse createRichText(CreateRichTextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRichTextWithOptions(request, headers, runtime);
    }

    public CreateRichTextResponse createRichTextWithOptions(CreateRichTextRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateRouteRuleResponse createRouteRule(CreateRouteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRouteRuleWithOptions(request, headers, runtime);
    }

    public CreateRouteRuleResponse createRouteRuleWithOptions(CreateRouteRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceWithOptions(request, headers, runtime);
    }

    public CreateServiceResponse createServiceWithOptions(CreateServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDescription)) {
            body.put("serviceDescription", request.serviceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("serviceName", request.serviceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateServiceGroupResponse createServiceGroup(CreateServiceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceGroupWithOptions(request, headers, runtime);
    }

    public CreateServiceGroupResponse createServiceGroupWithOptions(CreateServiceGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateServiceGroupSchedulingResponse createServiceGroupScheduling(CreateServiceGroupSchedulingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceGroupSchedulingWithOptions(request, headers, runtime);
    }

    public CreateServiceGroupSchedulingResponse createServiceGroupSchedulingWithOptions(CreateServiceGroupSchedulingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.fastScheduling))) {
            body.put("fastScheduling", request.fastScheduling);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.fineScheduling))) {
            body.put("fineScheduling", request.fineScheduling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulingWay)) {
            body.put("schedulingWay", request.schedulingWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateSubscriptionResponse createSubscription(CreateSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSubscriptionWithOptions(request, headers, runtime);
    }

    public CreateSubscriptionResponse createSubscriptionWithOptions(CreateSubscriptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateTenantApplicationResponse createTenantApplication(CreateTenantApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTenantApplicationWithOptions(request, headers, runtime);
    }

    public CreateTenantApplicationResponse createTenantApplicationWithOptions(CreateTenantApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserWithOptions(request, headers, runtime);
    }

    public CreateUserResponse createUserWithOptions(CreateUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("username", request.username);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteEscalationPlanResponse deleteEscalationPlan(DeleteEscalationPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEscalationPlanWithOptions(request, headers, runtime);
    }

    public DeleteEscalationPlanResponse deleteEscalationPlanWithOptions(DeleteEscalationPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanId)) {
            body.put("escalationPlanId", request.escalationPlanId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteIncidentResponse deleteIncident(DeleteIncidentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIncidentWithOptions(request, headers, runtime);
    }

    public DeleteIncidentResponse deleteIncidentWithOptions(DeleteIncidentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentId)) {
            body.put("incidentId", request.incidentId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteIntegrationConfigResponse deleteIntegrationConfig(DeleteIntegrationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIntegrationConfigWithOptions(request, headers, runtime);
    }

    public DeleteIntegrationConfigResponse deleteIntegrationConfigWithOptions(DeleteIntegrationConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationConfigId)) {
            body.put("integrationConfigId", request.integrationConfigId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteProblemResponse deleteProblem(DeleteProblemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProblemWithOptions(request, headers, runtime);
    }

    public DeleteProblemResponse deleteProblemWithOptions(DeleteProblemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteProblemEffectionServiceResponse deleteProblemEffectionService(DeleteProblemEffectionServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProblemEffectionServiceWithOptions(request, headers, runtime);
    }

    public DeleteProblemEffectionServiceResponse deleteProblemEffectionServiceWithOptions(DeleteProblemEffectionServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteProblemMeasureResponse deleteProblemMeasure(DeleteProblemMeasureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProblemMeasureWithOptions(request, headers, runtime);
    }

    public DeleteProblemMeasureResponse deleteProblemMeasureWithOptions(DeleteProblemMeasureRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteProblemTimelineResponse deleteProblemTimeline(DeleteProblemTimelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProblemTimelineWithOptions(request, headers, runtime);
    }

    public DeleteProblemTimelineResponse deleteProblemTimelineWithOptions(DeleteProblemTimelineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteRouteRuleResponse deleteRouteRule(DeleteRouteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRouteRuleWithOptions(request, headers, runtime);
    }

    public DeleteRouteRuleResponse deleteRouteRuleWithOptions(DeleteRouteRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeRuleId)) {
            body.put("routeRuleId", request.routeRuleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteServiceResponse deleteService(DeleteServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceWithOptions(request, headers, runtime);
    }

    public DeleteServiceResponse deleteServiceWithOptions(DeleteServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("serviceId", request.serviceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteServiceGroupResponse deleteServiceGroup(DeleteServiceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceGroupWithOptions(request, headers, runtime);
    }

    public DeleteServiceGroupResponse deleteServiceGroupWithOptions(DeleteServiceGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteServiceGroupUserResponse deleteServiceGroupUser(DeleteServiceGroupUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceGroupUserWithOptions(request, headers, runtime);
    }

    public DeleteServiceGroupUserResponse deleteServiceGroupUserWithOptions(DeleteServiceGroupUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteSubscriptionResponse deleteSubscription(DeleteSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSubscriptionWithOptions(request, headers, runtime);
    }

    public DeleteSubscriptionResponse deleteSubscriptionWithOptions(DeleteSubscriptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionId)) {
            body.put("subscriptionId", request.subscriptionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUserWithOptions(request, headers, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeliverIncidentResponse deliverIncident(DeliverIncidentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deliverIncidentWithOptions(request, headers, runtime);
    }

    public DeliverIncidentResponse deliverIncidentWithOptions(DeliverIncidentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DisableEscalationPlanResponse disableEscalationPlan(DisableEscalationPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableEscalationPlanWithOptions(request, headers, runtime);
    }

    public DisableEscalationPlanResponse disableEscalationPlanWithOptions(DisableEscalationPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanId)) {
            body.put("escalationPlanId", request.escalationPlanId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DisableIntegrationConfigResponse disableIntegrationConfig(DisableIntegrationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableIntegrationConfigWithOptions(request, headers, runtime);
    }

    public DisableIntegrationConfigResponse disableIntegrationConfigWithOptions(DisableIntegrationConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationConfigId)) {
            body.put("integrationConfigId", request.integrationConfigId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DisableRouteRuleResponse disableRouteRule(DisableRouteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableRouteRuleWithOptions(request, headers, runtime);
    }

    public DisableRouteRuleResponse disableRouteRuleWithOptions(DisableRouteRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeRuleId)) {
            body.put("routeRuleId", request.routeRuleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DisableServiceGroupWebhookResponse disableServiceGroupWebhook(DisableServiceGroupWebhookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableServiceGroupWebhookWithOptions(request, headers, runtime);
    }

    public DisableServiceGroupWebhookResponse disableServiceGroupWebhookWithOptions(DisableServiceGroupWebhookRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DisableSubscriptionResponse disableSubscription(DisableSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSubscriptionWithOptions(request, headers, runtime);
    }

    public DisableSubscriptionResponse disableSubscriptionWithOptions(DisableSubscriptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionId)) {
            body.put("subscriptionId", request.subscriptionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public EnableEscalationPlanResponse enableEscalationPlan(EnableEscalationPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableEscalationPlanWithOptions(request, headers, runtime);
    }

    public EnableEscalationPlanResponse enableEscalationPlanWithOptions(EnableEscalationPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanId)) {
            body.put("escalationPlanId", request.escalationPlanId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public EnableIntegrationConfigResponse enableIntegrationConfig(EnableIntegrationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableIntegrationConfigWithOptions(request, headers, runtime);
    }

    public EnableIntegrationConfigResponse enableIntegrationConfigWithOptions(EnableIntegrationConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationConfigId)) {
            body.put("integrationConfigId", request.integrationConfigId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public EnableRouteRuleResponse enableRouteRule(EnableRouteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableRouteRuleWithOptions(request, headers, runtime);
    }

    public EnableRouteRuleResponse enableRouteRuleWithOptions(EnableRouteRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeRuleId)) {
            body.put("routeRuleId", request.routeRuleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public EnableServiceGroupWebhookResponse enableServiceGroupWebhook(EnableServiceGroupWebhookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableServiceGroupWebhookWithOptions(request, headers, runtime);
    }

    public EnableServiceGroupWebhookResponse enableServiceGroupWebhookWithOptions(EnableServiceGroupWebhookRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public EnableSubscriptionResponse enableSubscription(EnableSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSubscriptionWithOptions(request, headers, runtime);
    }

    public EnableSubscriptionResponse enableSubscriptionWithOptions(EnableSubscriptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionId)) {
            body.put("subscriptionId", request.subscriptionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public FinishIncidentResponse finishIncident(FinishIncidentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishIncidentWithOptions(request, headers, runtime);
    }

    public FinishIncidentResponse finishIncidentWithOptions(FinishIncidentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public FinishProblemResponse finishProblem(FinishProblemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishProblemWithOptions(request, headers, runtime);
    }

    public FinishProblemResponse finishProblemWithOptions(FinishProblemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GeneratePictureLinkResponse generatePictureLink(GeneratePictureLinkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generatePictureLinkWithOptions(request, headers, runtime);
    }

    public GeneratePictureLinkResponse generatePictureLinkWithOptions(GeneratePictureLinkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keys)) {
            body.put("keys", request.keys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GeneratePictureUploadSignResponse generatePictureUploadSign(GeneratePictureUploadSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generatePictureUploadSignWithOptions(request, headers, runtime);
    }

    public GeneratePictureUploadSignResponse generatePictureUploadSignWithOptions(GeneratePictureUploadSignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GenerateProblemPictureLinkResponse generateProblemPictureLink(GenerateProblemPictureLinkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateProblemPictureLinkWithOptions(request, headers, runtime);
    }

    public GenerateProblemPictureLinkResponse generateProblemPictureLinkWithOptions(GenerateProblemPictureLinkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keys)) {
            body.put("keys", request.keys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GenerateProblemPictureUploadSignResponse generateProblemPictureUploadSign(GenerateProblemPictureUploadSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateProblemPictureUploadSignWithOptions(request, headers, runtime);
    }

    public GenerateProblemPictureUploadSignResponse generateProblemPictureUploadSignWithOptions(GenerateProblemPictureUploadSignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetEscalationPlanResponse getEscalationPlan(GetEscalationPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEscalationPlanWithOptions(request, headers, runtime);
    }

    public GetEscalationPlanResponse getEscalationPlanWithOptions(GetEscalationPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanId)) {
            body.put("escalationPlanId", request.escalationPlanId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetEventResponse getEvent(GetEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEventWithOptions(request, headers, runtime);
    }

    public GetEventResponse getEventWithOptions(GetEventRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.monitorSourceId)) {
            body.put("monitorSourceId", request.monitorSourceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetHomePageGuidanceResponse getHomePageGuidance(GetHomePageGuidanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHomePageGuidanceWithOptions(request, headers, runtime);
    }

    public GetHomePageGuidanceResponse getHomePageGuidanceWithOptions(GetHomePageGuidanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetIncidentResponse getIncident(GetIncidentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIncidentWithOptions(request, headers, runtime);
    }

    public GetIncidentResponse getIncidentWithOptions(GetIncidentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentId)) {
            body.put("incidentId", request.incidentId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetIncidentStatisticsResponse getIncidentStatistics(GetIncidentStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIncidentStatisticsWithOptions(request, headers, runtime);
    }

    public GetIncidentStatisticsResponse getIncidentStatisticsWithOptions(GetIncidentStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetIncidentSubtotalCountResponse getIncidentSubtotalCount(GetIncidentSubtotalCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIncidentSubtotalCountWithOptions(request, headers, runtime);
    }

    public GetIncidentSubtotalCountResponse getIncidentSubtotalCountWithOptions(GetIncidentSubtotalCountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentIds)) {
            body.put("incidentIds", request.incidentIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetIntegrationConfigResponse getIntegrationConfig(GetIntegrationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIntegrationConfigWithOptions(request, headers, runtime);
    }

    public GetIntegrationConfigResponse getIntegrationConfigWithOptions(GetIntegrationConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationConfigId)) {
            body.put("integrationConfigId", request.integrationConfigId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetProblemResponse getProblem(GetProblemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProblemWithOptions(request, headers, runtime);
    }

    public GetProblemResponse getProblemWithOptions(GetProblemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetProblemEffectionServiceResponse getProblemEffectionService(GetProblemEffectionServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProblemEffectionServiceWithOptions(request, headers, runtime);
    }

    public GetProblemEffectionServiceResponse getProblemEffectionServiceWithOptions(GetProblemEffectionServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetProblemImprovementResponse getProblemImprovement(GetProblemImprovementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProblemImprovementWithOptions(request, headers, runtime);
    }

    public GetProblemImprovementResponse getProblemImprovementWithOptions(GetProblemImprovementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetProblemPreviewResponse getProblemPreview(GetProblemPreviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProblemPreviewWithOptions(request, headers, runtime);
    }

    public GetProblemPreviewResponse getProblemPreviewWithOptions(GetProblemPreviewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetResourceStatisticsResponse getResourceStatistics(GetResourceStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceStatisticsWithOptions(request, headers, runtime);
    }

    public GetResourceStatisticsResponse getResourceStatisticsWithOptions(GetResourceStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRichTextResponse getRichText(GetRichTextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRichTextWithOptions(request, headers, runtime);
    }

    public GetRichTextResponse getRichTextWithOptions(GetRichTextRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRouteRuleResponse getRouteRule(GetRouteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRouteRuleWithOptions(request, headers, runtime);
    }

    public GetRouteRuleResponse getRouteRuleWithOptions(GetRouteRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeRuleId)) {
            body.put("routeRuleId", request.routeRuleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetServiceResponse getService(GetServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceWithOptions(request, headers, runtime);
    }

    public GetServiceResponse getServiceWithOptions(GetServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("serviceId", request.serviceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetServiceGroupResponse getServiceGroup(GetServiceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceGroupWithOptions(request, headers, runtime);
    }

    public GetServiceGroupResponse getServiceGroupWithOptions(GetServiceGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetServiceGroupPersonSchedulingResponse getServiceGroupPersonScheduling(GetServiceGroupPersonSchedulingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceGroupPersonSchedulingWithOptions(request, headers, runtime);
    }

    public GetServiceGroupPersonSchedulingResponse getServiceGroupPersonSchedulingWithOptions(GetServiceGroupPersonSchedulingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetServiceGroupSchedulingResponse getServiceGroupScheduling(GetServiceGroupSchedulingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceGroupSchedulingWithOptions(request, headers, runtime);
    }

    public GetServiceGroupSchedulingResponse getServiceGroupSchedulingWithOptions(GetServiceGroupSchedulingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetServiceGroupSchedulingPreviewResponse getServiceGroupSchedulingPreview(GetServiceGroupSchedulingPreviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceGroupSchedulingPreviewWithOptions(request, headers, runtime);
    }

    public GetServiceGroupSchedulingPreviewResponse getServiceGroupSchedulingPreviewWithOptions(GetServiceGroupSchedulingPreviewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.fastScheduling))) {
            body.put("fastScheduling", request.fastScheduling);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.fineScheduling))) {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetServiceGroupSpecialPersonSchedulingResponse getServiceGroupSpecialPersonScheduling(GetServiceGroupSpecialPersonSchedulingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceGroupSpecialPersonSchedulingWithOptions(request, headers, runtime);
    }

    public GetServiceGroupSpecialPersonSchedulingResponse getServiceGroupSpecialPersonSchedulingWithOptions(GetServiceGroupSpecialPersonSchedulingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetSimilarIncidentStatisticsResponse getSimilarIncidentStatistics(GetSimilarIncidentStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSimilarIncidentStatisticsWithOptions(request, headers, runtime);
    }

    public GetSimilarIncidentStatisticsResponse getSimilarIncidentStatisticsWithOptions(GetSimilarIncidentStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetSubscriptionResponse getSubscription(GetSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSubscriptionWithOptions(request, headers, runtime);
    }

    public GetSubscriptionResponse getSubscriptionWithOptions(GetSubscriptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionId)) {
            body.put("subscriptionId", request.subscriptionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetTenantApplicationResponse getTenantApplication(GetTenantApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTenantApplicationWithOptions(request, headers, runtime);
    }

    public GetTenantApplicationResponse getTenantApplicationWithOptions(GetTenantApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserWithOptions(request, headers, runtime);
    }

    public GetUserResponse getUserWithOptions(GetUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetUserGuideStatusResponse getUserGuideStatus(GetUserGuideStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserGuideStatusWithOptions(request, headers, runtime);
    }

    public GetUserGuideStatusResponse getUserGuideStatusWithOptions(GetUserGuideStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListAlertsResponse listAlerts(ListAlertsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlertsWithOptions(request, headers, runtime);
    }

    public ListAlertsResponse listAlertsWithOptions(ListAlertsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListChartDataForServiceGroupResponse listChartDataForServiceGroup(ListChartDataForServiceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChartDataForServiceGroupWithOptions(request, headers, runtime);
    }

    public ListChartDataForServiceGroupResponse listChartDataForServiceGroupWithOptions(ListChartDataForServiceGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListChartDataForUserResponse listChartDataForUser(ListChartDataForUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChartDataForUserWithOptions(request, headers, runtime);
    }

    public ListChartDataForUserResponse listChartDataForUserWithOptions(ListChartDataForUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListConfigsResponse listConfigs(ListConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConfigsWithOptions(request, headers, runtime);
    }

    public ListConfigsResponse listConfigsWithOptions(ListConfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListDataReportForServiceGroupResponse listDataReportForServiceGroup(ListDataReportForServiceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataReportForServiceGroupWithOptions(request, headers, runtime);
    }

    public ListDataReportForServiceGroupResponse listDataReportForServiceGroupWithOptions(ListDataReportForServiceGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListDataReportForUserResponse listDataReportForUser(ListDataReportForUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataReportForUserWithOptions(request, headers, runtime);
    }

    public ListDataReportForUserResponse listDataReportForUserWithOptions(ListDataReportForUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListDictionariesResponse listDictionaries(ListDictionariesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDictionariesWithOptions(request, headers, runtime);
    }

    public ListDictionariesResponse listDictionariesWithOptions(ListDictionariesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListEscalationPlanServicesResponse listEscalationPlanServices(ListEscalationPlanServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEscalationPlanServicesWithOptions(request, headers, runtime);
    }

    public ListEscalationPlanServicesResponse listEscalationPlanServicesWithOptions(ListEscalationPlanServicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListEscalationPlansResponse listEscalationPlans(ListEscalationPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEscalationPlansWithOptions(request, headers, runtime);
    }

    public ListEscalationPlansResponse listEscalationPlansWithOptions(ListEscalationPlansRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalationPlanName)) {
            body.put("escalationPlanName", request.escalationPlanName);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListIncidentDetailEscalationPlansResponse listIncidentDetailEscalationPlans(ListIncidentDetailEscalationPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIncidentDetailEscalationPlansWithOptions(request, headers, runtime);
    }

    public ListIncidentDetailEscalationPlansResponse listIncidentDetailEscalationPlansWithOptions(ListIncidentDetailEscalationPlansRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentId)) {
            body.put("incidentId", request.incidentId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListIncidentDetailTimelinesResponse listIncidentDetailTimelines(ListIncidentDetailTimelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIncidentDetailTimelinesWithOptions(request, headers, runtime);
    }

    public ListIncidentDetailTimelinesResponse listIncidentDetailTimelinesWithOptions(ListIncidentDetailTimelinesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListIncidentSubtotalsResponse listIncidentSubtotals(ListIncidentSubtotalsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIncidentSubtotalsWithOptions(request, headers, runtime);
    }

    public ListIncidentSubtotalsResponse listIncidentSubtotalsWithOptions(ListIncidentSubtotalsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentId)) {
            body.put("incidentId", request.incidentId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListIncidentTimelinesResponse listIncidentTimelines(ListIncidentTimelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIncidentTimelinesWithOptions(request, headers, runtime);
    }

    public ListIncidentTimelinesResponse listIncidentTimelinesWithOptions(ListIncidentTimelinesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListIncidentsResponse listIncidents(ListIncidentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIncidentsWithOptions(request, headers, runtime);
    }

    public ListIncidentsResponse listIncidentsWithOptions(ListIncidentsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListIntegrationConfigTimelinesResponse listIntegrationConfigTimelines(ListIntegrationConfigTimelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIntegrationConfigTimelinesWithOptions(request, headers, runtime);
    }

    public ListIntegrationConfigTimelinesResponse listIntegrationConfigTimelinesWithOptions(ListIntegrationConfigTimelinesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListIntegrationConfigsResponse listIntegrationConfigs(ListIntegrationConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIntegrationConfigsWithOptions(request, headers, runtime);
    }

    public ListIntegrationConfigsResponse listIntegrationConfigsWithOptions(ListIntegrationConfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorSourceName)) {
            body.put("monitorSourceName", request.monitorSourceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListMonitorSourcesResponse listMonitorSources(ListMonitorSourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMonitorSourcesWithOptions(request, headers, runtime);
    }

    public ListMonitorSourcesResponse listMonitorSourcesWithOptions(ListMonitorSourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListProblemDetailOperationsResponse listProblemDetailOperations(ListProblemDetailOperationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProblemDetailOperationsWithOptions(request, headers, runtime);
    }

    public ListProblemDetailOperationsResponse listProblemDetailOperationsWithOptions(ListProblemDetailOperationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListProblemOperationsResponse listProblemOperations(ListProblemOperationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProblemOperationsWithOptions(request, headers, runtime);
    }

    public ListProblemOperationsResponse listProblemOperationsWithOptions(ListProblemOperationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListProblemSubtotalsResponse listProblemSubtotals(ListProblemSubtotalsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProblemSubtotalsWithOptions(request, headers, runtime);
    }

    public ListProblemSubtotalsResponse listProblemSubtotalsWithOptions(ListProblemSubtotalsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListProblemTimeLinesResponse listProblemTimeLines(ListProblemTimeLinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProblemTimeLinesWithOptions(request, headers, runtime);
    }

    public ListProblemTimeLinesResponse listProblemTimeLinesWithOptions(ListProblemTimeLinesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListProblemsResponse listProblems(ListProblemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProblemsWithOptions(request, headers, runtime);
    }

    public ListProblemsResponse listProblemsWithOptions(ListProblemsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListRouteRulesResponse listRouteRules(ListRouteRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRouteRulesWithOptions(request, headers, runtime);
    }

    public ListRouteRulesResponse listRouteRulesWithOptions(ListRouteRulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeType)) {
            body.put("routeType", request.routeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("ruleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("serviceName", request.serviceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListServiceGroupMonitorSourceTemplatesResponse listServiceGroupMonitorSourceTemplates(ListServiceGroupMonitorSourceTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceGroupMonitorSourceTemplatesWithOptions(request, headers, runtime);
    }

    public ListServiceGroupMonitorSourceTemplatesResponse listServiceGroupMonitorSourceTemplatesWithOptions(ListServiceGroupMonitorSourceTemplatesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListServiceGroupsResponse listServiceGroups(ListServiceGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceGroupsWithOptions(request, headers, runtime);
    }

    public ListServiceGroupsResponse listServiceGroupsWithOptions(ListServiceGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServicesWithOptions(request, headers, runtime);
    }

    public ListServicesResponse listServicesWithOptions(ListServicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListSourceEventsResponse listSourceEvents(ListSourceEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSourceEventsWithOptions(request, headers, runtime);
    }

    public ListSourceEventsResponse listSourceEventsWithOptions(ListSourceEventsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListSourceEventsForMonitorSourceResponse listSourceEventsForMonitorSource(ListSourceEventsForMonitorSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSourceEventsForMonitorSourceWithOptions(request, headers, runtime);
    }

    public ListSourceEventsForMonitorSourceResponse listSourceEventsForMonitorSourceWithOptions(ListSourceEventsForMonitorSourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.monitorSourceId)) {
            body.put("monitorSourceId", request.monitorSourceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListSubscriptionServiceGroupsResponse listSubscriptionServiceGroups(ListSubscriptionServiceGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSubscriptionServiceGroupsWithOptions(request, headers, runtime);
    }

    public ListSubscriptionServiceGroupsResponse listSubscriptionServiceGroupsWithOptions(ListSubscriptionServiceGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceIds)) {
            body.put("serviceIds", request.serviceIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSubscriptionsWithOptions(request, headers, runtime);
    }

    public ListSubscriptionsResponse listSubscriptionsWithOptions(ListSubscriptionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListTrendForSourceEventResponse listTrendForSourceEvent(ListTrendForSourceEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTrendForSourceEventWithOptions(request, headers, runtime);
    }

    public ListTrendForSourceEventResponse listTrendForSourceEventWithOptions(ListTrendForSourceEventRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListUserSerivceGroupsResponse listUserSerivceGroups(ListUserSerivceGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserSerivceGroupsWithOptions(request, headers, runtime);
    }

    public ListUserSerivceGroupsResponse listUserSerivceGroupsWithOptions(ListUserSerivceGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUsersWithOptions(request, headers, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RecoverProblemResponse recoverProblem(RecoverProblemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recoverProblemWithOptions(request, headers, runtime);
    }

    public RecoverProblemResponse recoverProblemWithOptions(RecoverProblemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RefreshIntegrationConfigKeyResponse refreshIntegrationConfigKey(RefreshIntegrationConfigKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refreshIntegrationConfigKeyWithOptions(request, headers, runtime);
    }

    public RefreshIntegrationConfigKeyResponse refreshIntegrationConfigKeyWithOptions(RefreshIntegrationConfigKeyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationConfigId)) {
            body.put("integrationConfigId", request.integrationConfigId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RemoveProblemServiceGroupResponse removeProblemServiceGroup(RemoveProblemServiceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeProblemServiceGroupWithOptions(request, headers, runtime);
    }

    public RemoveProblemServiceGroupResponse removeProblemServiceGroupWithOptions(RemoveProblemServiceGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.problemId)) {
            body.put("problemId", request.problemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupIds)) {
            body.put("serviceGroupIds", request.serviceGroupIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ReplayProblemResponse replayProblem(ReplayProblemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replayProblemWithOptions(request, headers, runtime);
    }

    public ReplayProblemResponse replayProblemWithOptions(ReplayProblemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RespondIncidentResponse respondIncident(RespondIncidentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.respondIncidentWithOptions(request, headers, runtime);
    }

    public RespondIncidentResponse respondIncidentWithOptions(RespondIncidentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentIds)) {
            body.put("incidentIds", request.incidentIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RevokeProblemRecoveryResponse revokeProblemRecovery(RevokeProblemRecoveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeProblemRecoveryWithOptions(request, headers, runtime);
    }

    public RevokeProblemRecoveryResponse revokeProblemRecoveryWithOptions(RevokeProblemRecoveryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateEscalationPlanResponse updateEscalationPlan(UpdateEscalationPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEscalationPlanWithOptions(request, headers, runtime);
    }

    public UpdateEscalationPlanResponse updateEscalationPlanWithOptions(UpdateEscalationPlanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateIncidentResponse updateIncident(UpdateIncidentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIncidentWithOptions(request, headers, runtime);
    }

    public UpdateIncidentResponse updateIncidentWithOptions(UpdateIncidentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateIntegrationConfigResponse updateIntegrationConfig(UpdateIntegrationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIntegrationConfigWithOptions(request, headers, runtime);
    }

    public UpdateIntegrationConfigResponse updateIntegrationConfigWithOptions(UpdateIntegrationConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateProblemResponse updateProblem(UpdateProblemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProblemWithOptions(request, headers, runtime);
    }

    public UpdateProblemResponse updateProblemWithOptions(UpdateProblemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateProblemEffectionServiceResponse updateProblemEffectionService(UpdateProblemEffectionServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProblemEffectionServiceWithOptions(request, headers, runtime);
    }

    public UpdateProblemEffectionServiceResponse updateProblemEffectionServiceWithOptions(UpdateProblemEffectionServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateProblemImprovementResponse updateProblemImprovement(UpdateProblemImprovementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProblemImprovementWithOptions(request, headers, runtime);
    }

    public UpdateProblemImprovementResponse updateProblemImprovementWithOptions(UpdateProblemImprovementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateProblemMeasureResponse updateProblemMeasure(UpdateProblemMeasureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProblemMeasureWithOptions(request, headers, runtime);
    }

    public UpdateProblemMeasureResponse updateProblemMeasureWithOptions(UpdateProblemMeasureRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateProblemNoticeResponse updateProblemNotice(UpdateProblemNoticeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProblemNoticeWithOptions(request, headers, runtime);
    }

    public UpdateProblemNoticeResponse updateProblemNoticeWithOptions(UpdateProblemNoticeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateProblemTimelineResponse updateProblemTimeline(UpdateProblemTimelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProblemTimelineWithOptions(request, headers, runtime);
    }

    public UpdateProblemTimelineResponse updateProblemTimelineWithOptions(UpdateProblemTimelineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateRichTextResponse updateRichText(UpdateRichTextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRichTextWithOptions(request, headers, runtime);
    }

    public UpdateRichTextResponse updateRichTextWithOptions(UpdateRichTextRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateRouteRuleResponse updateRouteRule(UpdateRouteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRouteRuleWithOptions(request, headers, runtime);
    }

    public UpdateRouteRuleResponse updateRouteRuleWithOptions(UpdateRouteRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateServiceResponse updateService(UpdateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceWithOptions(request, headers, runtime);
    }

    public UpdateServiceResponse updateServiceWithOptions(UpdateServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDescription)) {
            body.put("serviceDescription", request.serviceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("serviceName", request.serviceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateServiceGroupResponse updateServiceGroup(UpdateServiceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceGroupWithOptions(request, headers, runtime);
    }

    public UpdateServiceGroupResponse updateServiceGroupWithOptions(UpdateServiceGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateServiceGroupSchedulingResponse updateServiceGroupScheduling(UpdateServiceGroupSchedulingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceGroupSchedulingWithOptions(request, headers, runtime);
    }

    public UpdateServiceGroupSchedulingResponse updateServiceGroupSchedulingWithOptions(UpdateServiceGroupSchedulingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.fastScheduling))) {
            body.put("fastScheduling", request.fastScheduling);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.fineScheduling))) {
            body.put("fineScheduling", request.fineScheduling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulingWay)) {
            body.put("schedulingWay", request.schedulingWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            body.put("serviceGroupId", request.serviceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateServiceGroupSpecialDaySchedulingResponse updateServiceGroupSpecialDayScheduling(UpdateServiceGroupSpecialDaySchedulingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceGroupSpecialDaySchedulingWithOptions(request, headers, runtime);
    }

    public UpdateServiceGroupSpecialDaySchedulingResponse updateServiceGroupSpecialDaySchedulingWithOptions(UpdateServiceGroupSpecialDaySchedulingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSubscriptionWithOptions(request, headers, runtime);
    }

    public UpdateSubscriptionResponse updateSubscriptionWithOptions(UpdateSubscriptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUserWithOptions(request, headers, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("username", request.username);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateUserGuideStatusResponse updateUserGuideStatus(UpdateUserGuideStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUserGuideStatusWithOptions(request, headers, runtime);
    }

    public UpdateUserGuideStatusResponse updateUserGuideStatusWithOptions(UpdateUserGuideStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.guideAction)) {
            body.put("guideAction", request.guideAction);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public VerifyRouteRuleResponse verifyRouteRule(VerifyRouteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyRouteRuleWithOptions(request, headers, runtime);
    }

    public VerifyRouteRuleResponse verifyRouteRuleWithOptions(VerifyRouteRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.routeRuleId)) {
            body.put("routeRuleId", request.routeRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testSourceEvents)) {
            body.put("testSourceEvents", request.testSourceEvents);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
}
