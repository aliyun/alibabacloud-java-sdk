// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212;

import com.aliyun.tea.*;
import com.aliyun.cloud_siem20241212.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "cloud-siem";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloud-siem", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <p>Cancels a specified conversation turn of the security operations agent. Before calling this operation, call CreateCopilotConversation to create a conversation and obtain the ConversationId, and then call CreateCopilotChat to initiate a streaming conversation and obtain the TurnId from the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a specified conversation turn of the security operations agent and returns the status of the turn after the cancellation request is processed.</p>
     * 
     * @param request CancelCopilotTurnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelCopilotTurnResponse
     */
    public CancelCopilotTurnResponse cancelCopilotTurnWithOptions(CancelCopilotTurnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            body.put("TraceId", request.traceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.turnId)) {
            body.put("TurnId", request.turnId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelCopilotTurn"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelCopilotTurnResponse());
    }

    /**
     * <b>description</b> :
     * <p>Cancels a specified conversation turn of the security operations agent. Before calling this operation, call CreateCopilotConversation to create a conversation and obtain the ConversationId, and then call CreateCopilotChat to initiate a streaming conversation and obtain the TurnId from the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a specified conversation turn of the security operations agent and returns the status of the turn after the cancellation request is processed.</p>
     * 
     * @param request CancelCopilotTurnRequest
     * @return CancelCopilotTurnResponse
     */
    public CancelCopilotTurnResponse cancelCopilotTurn(CancelCopilotTurnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelCopilotTurnWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Checks the execution status of a specified upgrade item. When you call this operation, you must specify the upgrade item ID (UpgradeItemId). The response includes the checkpoint status (CheckStatus) and check result (CheckResult) of the upgrade item.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks version upgrade items.</p>
     * 
     * @param request CheckUpgradeItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckUpgradeItemResponse
     */
    public CheckUpgradeItemResponse checkUpgradeItemWithOptions(CheckUpgradeItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeItemId)) {
            body.put("UpgradeItemId", request.upgradeItemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckUpgradeItem"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUpgradeItemResponse());
    }

    /**
     * <b>description</b> :
     * <p>Checks the execution status of a specified upgrade item. When you call this operation, you must specify the upgrade item ID (UpgradeItemId). The response includes the checkpoint status (CheckStatus) and check result (CheckResult) of the upgrade item.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks version upgrade items.</p>
     * 
     * @param request CheckUpgradeItemRequest
     * @return CheckUpgradeItemResponse
     */
    public CheckUpgradeItemResponse checkUpgradeItem(CheckUpgradeItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkUpgradeItemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a highly complex JSON configuration. Therefore, we provide a utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates the automatic disposition configuration for users.</p>
     * 
     * @param request CreateAutoDisposeConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAutoDisposeConfigResponse
     */
    public CreateAutoDisposeConfigResponse createAutoDisposeConfigWithOptions(CreateAutoDisposeConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoDecisionStatus)) {
            body.put("AutoDecisionStatus", request.autoDecisionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoDisposeConfig"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutoDisposeConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a highly complex JSON configuration. Therefore, we provide a utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates the automatic disposition configuration for users.</p>
     * 
     * @param request CreateAutoDisposeConfigRequest
     * @return CreateAutoDisposeConfigResponse
     */
    public CreateAutoDisposeConfigResponse createAutoDisposeConfig(CreateAutoDisposeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAutoDisposeConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Sends a message to a security operations agent conversation and returns the results as a Server-Sent Events (SSE) event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a message to the security operations agent and returns an event stream through Server-Sent Events (SSE). A conversation can be implicitly created in the same request during the first turn.</p>
     * 
     * @param tmpReq CreateCopilotChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCopilotChatResponse
     */
    public CreateCopilotChatResponse createCopilotChatWithOptions(CreateCopilotChatRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCopilotChatShrinkRequest request = new CreateCopilotChatShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createConversation)) {
            request.createConversationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createConversation, "CreateConversation", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.messages)) {
            request.messagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.messages, "Messages", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientConversationId)) {
            body.put("ClientConversationId", request.clientConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientMessageId)) {
            body.put("ClientMessageId", request.clientMessageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createConversationShrink)) {
            body.put("CreateConversation", request.createConversationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messagesShrink)) {
            body.put("Messages", request.messagesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planMode)) {
            body.put("PlanMode", request.planMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replaceTurnId)) {
            body.put("ReplaceTurnId", request.replaceTurnId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeTarget)) {
            body.put("RouteTarget", request.routeTarget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("Stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thinkingMode)) {
            body.put("ThinkingMode", request.thinkingMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            body.put("TraceId", request.traceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCopilotChat"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCopilotChatResponse());
    }

    /**
     * <b>description</b> :
     * <p>Sends a message to a security operations agent conversation and returns the results as a Server-Sent Events (SSE) event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a message to the security operations agent and returns an event stream through Server-Sent Events (SSE). A conversation can be implicitly created in the same request during the first turn.</p>
     * 
     * @param request CreateCopilotChatRequest
     * @return CreateCopilotChatResponse
     */
    public CreateCopilotChatResponse createCopilotChat(CreateCopilotChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCopilotChatWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a security operations agent session.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a security operations agent session that belongs to the current tenant and owner, and returns the session ID, status, and session configuration.</p>
     * 
     * @param request CreateCopilotConversationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCopilotConversationResponse
     */
    public CreateCopilotConversationResponse createCopilotConversationWithOptions(CreateCopilotConversationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planMode)) {
            body.put("PlanMode", request.planMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thinkingMode)) {
            body.put("ThinkingMode", request.thinkingMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            body.put("TraceId", request.traceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCopilotConversation"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCopilotConversationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a security operations agent session.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a security operations agent session that belongs to the current tenant and owner, and returns the session ID, status, and session configuration.</p>
     * 
     * @param request CreateCopilotConversationRequest
     * @return CreateCopilotConversationResponse
     */
    public CreateCopilotConversationResponse createCopilotConversation(CreateCopilotConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCopilotConversationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据源</p>
     * 
     * @param request CreateDataIngestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataIngestionResponse
     */
    public CreateDataIngestionResponse createDataIngestionWithOptions(CreateDataIngestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.capacityCount)) {
            body.put("CapacityCount", request.capacityCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionMode)) {
            body.put("DataIngestionMode", request.dataIngestionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionStateCode)) {
            body.put("DataIngestionStateCode", request.dataIngestionStateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionType)) {
            body.put("DataIngestionType", request.dataIngestionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceEditable)) {
            body.put("DataSourceEditable", request.dataSourceEditable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleEditable)) {
            body.put("NormalizationRuleEditable", request.normalizationRuleEditable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanDataSourceId)) {
            body.put("ScanDataSourceId", request.scanDataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamJobId)) {
            body.put("StreamJobId", request.streamJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateTime)) {
            body.put("UpdateTime", request.updateTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataIngestion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据源</p>
     * 
     * @param request CreateDataIngestionRequest
     * @return CreateDataIngestionResponse
     */
    public CreateDataIngestionResponse createDataIngestion(CreateDataIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataIngestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集</p>
     * 
     * @param request CreateDataSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataSetResponse
     */
    public CreateDataSetResponse createDataSetWithOptions(CreateDataSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDescription)) {
            body.put("DataSetDescription", request.dataSetDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetFieldKeyName)) {
            body.put("DataSetFieldKeyName", request.dataSetFieldKeyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetFileName)) {
            body.put("DataSetFileName", request.dataSetFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetName)) {
            body.put("DataSetName", request.dataSetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetStatus)) {
            body.put("DataSetStatus", request.dataSetStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetType)) {
            body.put("DataSetType", request.dataSetType);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipWhitelistRecognizers)) {
            bodyFlat.put("IpWhitelistRecognizers", request.ipWhitelistRecognizers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSet"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集</p>
     * 
     * @param request CreateDataSetRequest
     * @return CreateDataSetResponse
     */
    public CreateDataSetResponse createDataSet(CreateDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataSetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter involves very complex JSON Configurations. We provide a supporting tool class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data source.</p>
     * 
     * @param tmpReq CreateDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSourceWithOptions(CreateDataSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataSourceShrinkRequest request = new CreateDataSourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSourceIds)) {
            request.dataSourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSourceIds, "DataSourceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSourceReferences)) {
            request.dataSourceReferencesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSourceReferences, "DataSourceReferences", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceFrom)) {
            body.put("DataSourceFrom", request.dataSourceFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceIdsShrink)) {
            body.put("DataSourceIds", request.dataSourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            body.put("DataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceRecognizeEnabled)) {
            body.put("DataSourceRecognizeEnabled", request.dataSourceRecognizeEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceRecognizer)) {
            body.put("DataSourceRecognizer", request.dataSourceRecognizer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceReferencesShrink)) {
            body.put("DataSourceReferences", request.dataSourceReferencesShrink);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceStores)) {
            bodyFlat.put("DataSourceStores", request.dataSourceStores);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceTemplateId)) {
            body.put("DataSourceTemplateId", request.dataSourceTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSource"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter involves very complex JSON Configurations. We provide a supporting tool class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data source.</p>
     * 
     * @param request CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a detection rule.</p>
     * 
     * @param request CreateDetectionRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDetectionRuleResponse
     */
    public CreateDetectionRuleResponse createDetectionRuleWithOptions(CreateDetectionRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertAttCk)) {
            body.put("AlertAttCk", request.alertAttCk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertAttCkMapping)) {
            body.put("AlertAttCkMapping", request.alertAttCkMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertDescription)) {
            body.put("AlertDescription", request.alertDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertLevel)) {
            body.put("AlertLevel", request.alertLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertLevelMapping)) {
            body.put("AlertLevelMapping", request.alertLevelMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertName)) {
            body.put("AlertName", request.alertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertSchemaId)) {
            body.put("AlertSchemaId", request.alertSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertTacticId)) {
            body.put("AlertTacticId", request.alertTacticId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertThresholdCount)) {
            body.put("AlertThresholdCount", request.alertThresholdCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertThresholdGroup)) {
            body.put("AlertThresholdGroup", request.alertThresholdGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertThresholdPeriod)) {
            body.put("AlertThresholdPeriod", request.alertThresholdPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            body.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertTypeMapping)) {
            body.put("AlertTypeMapping", request.alertTypeMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionExpressionContent)) {
            body.put("DetectionExpressionContent", request.detectionExpressionContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionExpressionType)) {
            body.put("DetectionExpressionType", request.detectionExpressionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleDescription)) {
            body.put("DetectionRuleDescription", request.detectionRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleName)) {
            body.put("DetectionRuleName", request.detectionRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleStatus)) {
            body.put("DetectionRuleStatus", request.detectionRuleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleTemplateId)) {
            body.put("DetectionRuleTemplateId", request.detectionRuleTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleTemplateVersion)) {
            body.put("DetectionRuleTemplateVersion", request.detectionRuleTemplateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleType)) {
            body.put("DetectionRuleType", request.detectionRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRules)) {
            body.put("DetectionRules", request.detectionRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityMappings)) {
            body.put("EntityMappings", request.entityMappings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentAggregationExpression)) {
            body.put("IncidentAggregationExpression", request.incidentAggregationExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentAggregationType)) {
            body.put("IncidentAggregationType", request.incidentAggregationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logCategoryId)) {
            body.put("LogCategoryId", request.logCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSchemaId)) {
            body.put("LogSchemaId", request.logSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookParameters)) {
            body.put("PlaybookParameters", request.playbookParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleBeginTime)) {
            body.put("ScheduleBeginTime", request.scheduleBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleExpression)) {
            body.put("ScheduleExpression", request.scheduleExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleMaxRetries)) {
            body.put("ScheduleMaxRetries", request.scheduleMaxRetries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleMaxTimeout)) {
            body.put("ScheduleMaxTimeout", request.scheduleMaxTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleWindow)) {
            body.put("ScheduleWindow", request.scheduleWindow);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDetectionRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDetectionRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a detection rule.</p>
     * 
     * @param request CreateDetectionRuleRequest
     * @return CreateDetectionRuleResponse
     */
    public CreateDetectionRuleResponse createDetectionRule(CreateDetectionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDetectionRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an export task.</p>
     * 
     * @param request CreateExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExportTaskResponse
     */
    public CreateExportTaskResponse createExportTaskWithOptions(CreateExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exportTaskParameter)) {
            body.put("ExportTaskParameter", request.exportTaskParameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportTaskType)) {
            body.put("ExportTaskType", request.exportTaskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExportTask"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an export task.</p>
     * 
     * @param request CreateExportTaskRequest
     * @return CreateExportTaskResponse
     */
    public CreateExportTaskResponse createExportTask(CreateExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExportTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a highly complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates restricted user-side storage.</p>
     * 
     * @param request CreateLogStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLogStoreResponse
     */
    public CreateLogStoreResponse createLogStoreWithOptions(CreateLogStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLogStore"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLogStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a highly complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates restricted user-side storage.</p>
     * 
     * @param request CreateLogStoreRequest
     * @return CreateLogStoreResponse
     */
    public CreateLogStoreResponse createLogStore(CreateLogStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLogStoreWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig is a complex JSON configuration. A supporting utility class is provided to assist with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a normalization rule.</p>
     * 
     * @param tmpReq CreateNormalizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNormalizationRuleResponse
     */
    public CreateNormalizationRuleResponse createNormalizationRuleWithOptions(CreateNormalizationRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateNormalizationRuleShrinkRequest request = new CreateNormalizationRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.normalizationRuleIds)) {
            request.normalizationRuleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.normalizationRuleIds, "NormalizationRuleIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extendContentPacked)) {
            body.put("ExtendContentPacked", request.extendContentPacked);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendFieldStoreMode)) {
            body.put("ExtendFieldStoreMode", request.extendFieldStoreMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationCategoryId)) {
            body.put("NormalizationCategoryId", request.normalizationCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleDescription)) {
            body.put("NormalizationRuleDescription", request.normalizationRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleExpression)) {
            body.put("NormalizationRuleExpression", request.normalizationRuleExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleFormat)) {
            body.put("NormalizationRuleFormat", request.normalizationRuleFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleIdsShrink)) {
            body.put("NormalizationRuleIds", request.normalizationRuleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleMode)) {
            body.put("NormalizationRuleMode", request.normalizationRuleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleName)) {
            body.put("NormalizationRuleName", request.normalizationRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleType)) {
            body.put("NormalizationRuleType", request.normalizationRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleVersion)) {
            body.put("NormalizationRuleVersion", request.normalizationRuleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSecurityDomainId)) {
            body.put("NormalizationSecurityDomainId", request.normalizationSecurityDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorId)) {
            body.put("VendorId", request.vendorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNormalizationRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNormalizationRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig is a complex JSON configuration. A supporting utility class is provided to assist with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a normalization rule.</p>
     * 
     * @param request CreateNormalizationRuleRequest
     * @return CreateNormalizationRuleResponse
     */
    public CreateNormalizationRuleResponse createNormalizationRule(CreateNormalizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNormalizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a supporting utility class to help with specific configuration examples. For more information, refer to the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data source.</p>
     * 
     * @param request CreateNormalizationSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNormalizationSchemaResponse
     */
    public CreateNormalizationSchemaResponse createNormalizationSchemaWithOptions(CreateNormalizationSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationCategoryId)) {
            body.put("NormalizationCategoryId", request.normalizationCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationFieldSource)) {
            body.put("NormalizationFieldSource", request.normalizationFieldSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationFields)) {
            body.put("NormalizationFields", request.normalizationFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaDescription)) {
            body.put("NormalizationSchemaDescription", request.normalizationSchemaDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaName)) {
            body.put("NormalizationSchemaName", request.normalizationSchemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaType)) {
            body.put("NormalizationSchemaType", request.normalizationSchemaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSecurityDomainId)) {
            body.put("NormalizationSecurityDomainId", request.normalizationSecurityDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLogStore)) {
            body.put("TargetLogStore", request.targetLogStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorId)) {
            body.put("VendorId", request.vendorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNormalizationSchema"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNormalizationSchemaResponse());
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a supporting utility class to help with specific configuration examples. For more information, refer to the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data source.</p>
     * 
     * @param request CreateNormalizationSchemaRequest
     * @return CreateNormalizationSchemaResponse
     */
    public CreateNormalizationSchemaResponse createNormalizationSchema(CreateNormalizationSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNormalizationSchemaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建产品</p>
     * 
     * @param request CreateProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProductResponse
     */
    public CreateProductResponse createProductWithOptions(CreateProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorName)) {
            body.put("VendorName", request.vendorName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProduct"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建产品</p>
     * 
     * @param request CreateProductRequest
     * @return CreateProductResponse
     */
    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProductWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter involves complex JSON configurations. A supporting utility class is provided to assist with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an automated response rule.</p>
     * 
     * @param request CreateResponseRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResponseRuleResponse
     */
    public CreateResponseRuleResponse createResponseRuleWithOptions(CreateResponseRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseActionConfig)) {
            body.put("ResponseActionConfig", request.responseActionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseActionType)) {
            body.put("ResponseActionType", request.responseActionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseExecutionCondition)) {
            body.put("ResponseExecutionCondition", request.responseExecutionCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRuleName)) {
            body.put("ResponseRuleName", request.responseRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRulePriority)) {
            body.put("ResponseRulePriority", request.responseRulePriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRuleRemark)) {
            body.put("ResponseRuleRemark", request.responseRuleRemark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseTriggerType)) {
            body.put("ResponseTriggerType", request.responseTriggerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResponseRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResponseRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter involves complex JSON configurations. A supporting utility class is provided to assist with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an automated response rule.</p>
     * 
     * @param request CreateResponseRuleRequest
     * @return CreateResponseRuleResponse
     */
    public CreateResponseRuleResponse createResponseRule(CreateResponseRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResponseRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建厂商</p>
     * 
     * @param request CreateVendorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVendorResponse
     */
    public CreateVendorResponse createVendorWithOptions(CreateVendorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorName)) {
            body.put("VendorName", request.vendorName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVendor"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVendorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建厂商</p>
     * 
     * @param request CreateVendorRequest
     * @return CreateVendorResponse
     */
    public CreateVendorResponse createVendor(CreateVendorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVendorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据接入</p>
     * 
     * @param request DeleteDataIngestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataIngestionResponse
     */
    public DeleteDataIngestionResponse deleteDataIngestionWithOptions(DeleteDataIngestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionId)) {
            body.put("DataIngestionId", request.dataIngestionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataIngestion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据接入</p>
     * 
     * @param request DeleteDataIngestionRequest
     * @return DeleteDataIngestionResponse
     */
    public DeleteDataIngestionResponse deleteDataIngestion(DeleteDataIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataIngestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据集</p>
     * 
     * @param request DeleteDataSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSetResponse
     */
    public DeleteDataSetResponse deleteDataSetWithOptions(DeleteDataSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("DataSetId", request.dataSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSet"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据集</p>
     * 
     * @param request DeleteDataSetRequest
     * @return DeleteDataSetResponse
     */
    public DeleteDataSetResponse deleteDataSet(DeleteDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes dataset records.</p>
     * 
     * @param request DeleteDataSetRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSetRecordResponse
     */
    public DeleteDataSetRecordResponse deleteDataSetRecordWithOptions(DeleteDataSetRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("DataSetId", request.dataSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetRecordIds)) {
            body.put("DataSetRecordIds", request.dataSetRecordIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSetRecord"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSetRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes dataset records.</p>
     * 
     * @param request DeleteDataSetRecordRequest
     * @return DeleteDataSetRecordResponse
     */
    public DeleteDataSetRecordResponse deleteDataSetRecord(DeleteDataSetRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSetRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据源</p>
     * 
     * @param request DeleteDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSourceWithOptions(DeleteDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSource"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据源</p>
     * 
     * @param request DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除检测规则</p>
     * 
     * @param request DeleteDetectionRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDetectionRuleResponse
     */
    public DeleteDetectionRuleResponse deleteDetectionRuleWithOptions(DeleteDetectionRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleId)) {
            body.put("DetectionRuleId", request.detectionRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDetectionRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDetectionRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除检测规则</p>
     * 
     * @param request DeleteDetectionRuleRequest
     * @return DeleteDetectionRuleResponse
     */
    public DeleteDetectionRuleResponse deleteDetectionRule(DeleteDetectionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDetectionRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON Configurations. We provide a utility class as a supporting tool to help with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Logstore.</p>
     * 
     * @param request DeleteLogStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLogStoreResponse
     */
    public DeleteLogStoreResponse deleteLogStoreWithOptions(DeleteLogStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLogStore"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLogStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON Configurations. We provide a utility class as a supporting tool to help with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Logstore.</p>
     * 
     * @param request DeleteLogStoreRequest
     * @return DeleteLogStoreResponse
     */
    public DeleteLogStoreResponse deleteLogStore(DeleteLogStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLogStoreWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除标准化规则</p>
     * 
     * @param request DeleteNormalizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNormalizationRuleResponse
     */
    public DeleteNormalizationRuleResponse deleteNormalizationRuleWithOptions(DeleteNormalizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNormalizationRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNormalizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除标准化规则</p>
     * 
     * @param request DeleteNormalizationRuleRequest
     * @return DeleteNormalizationRuleResponse
     */
    public DeleteNormalizationRuleResponse deleteNormalizationRule(DeleteNormalizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNormalizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除标准化规则版本</p>
     * 
     * @param request DeleteNormalizationRuleVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNormalizationRuleVersionResponse
     */
    public DeleteNormalizationRuleVersionResponse deleteNormalizationRuleVersionWithOptions(DeleteNormalizationRuleVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleVersion)) {
            body.put("NormalizationRuleVersion", request.normalizationRuleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNormalizationRuleVersion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNormalizationRuleVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除标准化规则版本</p>
     * 
     * @param request DeleteNormalizationRuleVersionRequest
     * @return DeleteNormalizationRuleVersionResponse
     */
    public DeleteNormalizationRuleVersionResponse deleteNormalizationRuleVersion(DeleteNormalizationRuleVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNormalizationRuleVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. A utility class is provided to help you configure it. For specific configuration examples, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a normalization schema.</p>
     * 
     * @param request DeleteNormalizationSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNormalizationSchemaResponse
     */
    public DeleteNormalizationSchemaResponse deleteNormalizationSchemaWithOptions(DeleteNormalizationSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaType)) {
            body.put("NormalizationSchemaType", request.normalizationSchemaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNormalizationSchema"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNormalizationSchemaResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. A utility class is provided to help you configure it. For specific configuration examples, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a normalization schema.</p>
     * 
     * @param request DeleteNormalizationSchemaRequest
     * @return DeleteNormalizationSchemaResponse
     */
    public DeleteNormalizationSchemaResponse deleteNormalizationSchema(DeleteNormalizationSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNormalizationSchemaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除产品</p>
     * 
     * @param request DeleteProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProductWithOptions(DeleteProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProduct"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除产品</p>
     * 
     * @param request DeleteProductRequest
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProduct(DeleteProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProductWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notification delivery is subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time frame.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an automated response rule.</p>
     * 
     * @param request DeleteResponseRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResponseRuleResponse
     */
    public DeleteResponseRuleResponse deleteResponseRuleWithOptions(DeleteResponseRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRuleId)) {
            body.put("ResponseRuleId", request.responseRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResponseRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResponseRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notification delivery is subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time frame.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an automated response rule.</p>
     * 
     * @param request DeleteResponseRuleRequest
     * @return DeleteResponseRuleResponse
     */
    public DeleteResponseRuleResponse deleteResponseRule(DeleteResponseRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteResponseRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除厂商</p>
     * 
     * @param request DeleteVendorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVendorResponse
     */
    public DeleteVendorResponse deleteVendorWithOptions(DeleteVendorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorId)) {
            body.put("VendorId", request.vendorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorName)) {
            body.put("VendorName", request.vendorName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVendor"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVendorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除厂商</p>
     * 
     * @param request DeleteVendorRequest
     * @return DeleteVendorResponse
     */
    public DeleteVendorResponse deleteVendor(DeleteVendorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVendorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止数据接入</p>
     * 
     * @param request DisableDataIngestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableDataIngestionResponse
     */
    public DisableDataIngestionResponse disableDataIngestionWithOptions(DisableDataIngestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionId)) {
            body.put("DataIngestionId", request.dataIngestionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDataIngestion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDataIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止数据接入</p>
     * 
     * @param request DisableDataIngestionRequest
     * @return DisableDataIngestionResponse
     */
    public DisableDataIngestionResponse disableDataIngestion(DisableDataIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableDataIngestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动数据接入</p>
     * 
     * @param request EnableDataIngestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableDataIngestionResponse
     */
    public EnableDataIngestionResponse enableDataIngestionWithOptions(EnableDataIngestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionId)) {
            body.put("DataIngestionId", request.dataIngestionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDataIngestion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDataIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动数据接入</p>
     * 
     * @param request EnableDataIngestionRequest
     * @return EnableDataIngestionResponse
     */
    public EnableDataIngestionResponse enableDataIngestion(EnableDataIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableDataIngestionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a highly complex JSON configuration. A supporting utility class is provided to help with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Manually handles alerts in batches.</p>
     * 
     * @param request ExecuteAutoDisposeRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteAutoDisposeRecordsResponse
     */
    public ExecuteAutoDisposeRecordsResponse executeAutoDisposeRecordsWithOptions(ExecuteAutoDisposeRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.selectedEntityList)) {
            bodyFlat.put("SelectedEntityList", request.selectedEntityList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unSelectedEntityList)) {
            bodyFlat.put("UnSelectedEntityList", request.unSelectedEntityList);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteAutoDisposeRecords"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteAutoDisposeRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a highly complex JSON configuration. A supporting utility class is provided to help with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Manually handles alerts in batches.</p>
     * 
     * @param request ExecuteAutoDisposeRecordsRequest
     * @return ExecuteAutoDisposeRecordsResponse
     */
    public ExecuteAutoDisposeRecordsResponse executeAutoDisposeRecords(ExecuteAutoDisposeRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeAutoDisposeRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes a data query.</p>
     * 
     * @param request ExecuteLogQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteLogQueryResponse
     */
    public ExecuteLogQueryResponse executeLogQueryWithOptions(ExecuteLogQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendContentPacked)) {
            body.put("ExtendContentPacked", request.extendContentPacked);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logCondition)) {
            body.put("LogCondition", request.logCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logQuery)) {
            body.put("LogQuery", request.logQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteLogQuery"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteLogQueryResponse());
    }

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes a data query.</p>
     * 
     * @param request ExecuteLogQueryRequest
     * @return ExecuteLogQueryResponse
     */
    public ExecuteLogQueryResponse executeLogQuery(ExecuteLogQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeLogQueryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig input parameter is a complex JSON configuration string. We provide a utility class to help with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * <h3>Before you begin</h3>
     * <ol>
     * <li>Before calling this operation, ensure that a pending upgrade order exists (created through the Alibaba Cloud Management Console or a business flow).</li>
     * <li>Call ListUpgradeItems to view the items that can be upgraded, and call CheckUpgradeItem to perform a dry run.</li>
     * <li>If no items can be upgraded, the API returns an error.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Performs a version upgrade.</p>
     * 
     * @param request ExecuteUpgradeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteUpgradeResponse
     */
    public ExecuteUpgradeResponse executeUpgradeWithOptions(ExecuteUpgradeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteUpgrade"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteUpgradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig input parameter is a complex JSON configuration string. We provide a utility class to help with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * <h3>Before you begin</h3>
     * <ol>
     * <li>Before calling this operation, ensure that a pending upgrade order exists (created through the Alibaba Cloud Management Console or a business flow).</li>
     * <li>Call ListUpgradeItems to view the items that can be upgraded, and call CheckUpgradeItem to perform a dry run.</li>
     * <li>If no items can be upgraded, the API returns an error.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Performs a version upgrade.</p>
     * 
     * @param request ExecuteUpgradeRequest
     * @return ExecuteUpgradeResponse
     */
    public ExecuteUpgradeResponse executeUpgrade(ExecuteUpgradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeUpgradeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a highly complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of an alert.</p>
     * 
     * @param request GetAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlertResponse
     */
    public GetAlertResponse getAlertWithOptions(GetAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertUuid)) {
            body.put("AlertUuid", request.alertUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlert"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlertResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a highly complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of an alert.</p>
     * 
     * @param request GetAlertRequest
     * @return GetAlertResponse
     */
    public GetAlertResponse getAlert(GetAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAlertWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig is a highly complex JSON configuration. To simplify this, we provide a utility class for specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the automatic disposal configuration for users.</p>
     * 
     * @param request GetAutoDisposeConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutoDisposeConfigResponse
     */
    public GetAutoDisposeConfigResponse getAutoDisposeConfigWithOptions(GetAutoDisposeConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoDisposeConfig"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoDisposeConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig is a highly complex JSON configuration. To simplify this, we provide a utility class for specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the automatic disposal configuration for users.</p>
     * 
     * @param request GetAutoDisposeConfigRequest
     * @return GetAutoDisposeConfigResponse
     */
    public GetAutoDisposeConfigResponse getAutoDisposeConfig(GetAutoDisposeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoDisposeConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries a specified security operations agent session.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the metadata, status, configuration, and historical summary of a specified security operations agent session.</p>
     * 
     * @param request GetCopilotConversationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCopilotConversationResponse
     */
    public GetCopilotConversationResponse getCopilotConversationWithOptions(GetCopilotConversationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            body.put("TraceId", request.traceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCopilotConversation"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCopilotConversationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries a specified security operations agent session.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the metadata, status, configuration, and historical summary of a specified security operations agent session.</p>
     * 
     * @param request GetCopilotConversationRequest
     * @return GetCopilotConversationResponse
     */
    public GetCopilotConversationResponse getCopilotConversation(GetCopilotConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCopilotConversationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries a specified Security Operations agent conversation turn. Before calling this operation, call CreateCopilotConversation to create a session and obtain the ConversationId, and then call CreateCopilotChat to initiate a conversation and obtain the TurnId.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the conversation turn status of the Security Operations agent.</p>
     * 
     * @param request GetCopilotTurnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCopilotTurnResponse
     */
    public GetCopilotTurnResponse getCopilotTurnWithOptions(GetCopilotTurnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            body.put("TraceId", request.traceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.turnId)) {
            body.put("TurnId", request.turnId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCopilotTurn"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCopilotTurnResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries a specified Security Operations agent conversation turn. Before calling this operation, call CreateCopilotConversation to create a session and obtain the ConversationId, and then call CreateCopilotChat to initiate a conversation and obtain the TurnId.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the conversation turn status of the Security Operations agent.</p>
     * 
     * @param request GetCopilotTurnRequest
     * @return GetCopilotTurnResponse
     */
    public GetCopilotTurnResponse getCopilotTurn(GetCopilotTurnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCopilotTurnWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the security operations agent conversation turn based on the client message ID. Before calling this operation, call CreateCopilotConversation to create a conversation and then call CreateCopilotChat to initiate a conversation. The ClientMessageId is specified by the client when initiating the conversation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the security operations agent conversation turn based on the conversation ID and client message ID.</p>
     * 
     * @param request GetCopilotTurnByClientMessageIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCopilotTurnByClientMessageIdResponse
     */
    public GetCopilotTurnByClientMessageIdResponse getCopilotTurnByClientMessageIdWithOptions(GetCopilotTurnByClientMessageIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientMessageId)) {
            body.put("ClientMessageId", request.clientMessageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            body.put("TraceId", request.traceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCopilotTurnByClientMessageId"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCopilotTurnByClientMessageIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the security operations agent conversation turn based on the client message ID. Before calling this operation, call CreateCopilotConversation to create a conversation and then call CreateCopilotChat to initiate a conversation. The ClientMessageId is specified by the client when initiating the conversation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the security operations agent conversation turn based on the conversation ID and client message ID.</p>
     * 
     * @param request GetCopilotTurnByClientMessageIdRequest
     * @return GetCopilotTurnByClientMessageIdResponse
     */
    public GetCopilotTurnByClientMessageIdResponse getCopilotTurnByClientMessageId(GetCopilotTurnByClientMessageIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCopilotTurnByClientMessageIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration string. We provide a utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the data batch ingestion configuration.</p>
     * 
     * @param request GetDataBatchIngestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataBatchIngestionResponse
     */
    public GetDataBatchIngestionResponse getDataBatchIngestionWithOptions(GetDataBatchIngestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataBatchIngestion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataBatchIngestionResponse());
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration string. We provide a utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the data batch ingestion configuration.</p>
     * 
     * @param request GetDataBatchIngestionRequest
     * @return GetDataBatchIngestionResponse
     */
    public GetDataBatchIngestionResponse getDataBatchIngestion(GetDataBatchIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataBatchIngestionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the log storage region, project, capacity, Logstore, and multi-account delivery settings of the current account. Before updating the multi-account configuration, retrieve Data.DeliverySettings.ConfigurationVersion and TargetProject, and pass them to the write API unchanged. Capacity is measured in GB, and TTL is measured in days. Account UIDs in DeliverySettings are strings. If reading optional delivery settings fails, the cause is returned in DeliverySettingsError, and other storage information is still returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of user logs in log management.</p>
     * 
     * @param request GetDataStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataStorageResponse
     */
    public GetDataStorageResponse getDataStorageWithOptions(GetDataStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withAutoKeyDetect)) {
            body.put("WithAutoKeyDetect", request.withAutoKeyDetect);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataStorage"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataStorageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the log storage region, project, capacity, Logstore, and multi-account delivery settings of the current account. Before updating the multi-account configuration, retrieve Data.DeliverySettings.ConfigurationVersion and TargetProject, and pass them to the write API unchanged. Capacity is measured in GB, and TTL is measured in days. Account UIDs in DeliverySettings are strings. If reading optional delivery settings fails, the cause is returned in DeliverySettingsError, and other storage information is still returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of user logs in log management.</p>
     * 
     * @param request GetDataStorageRequest
     * @return GetDataStorageResponse
     */
    public GetDataStorageResponse getDataStorage(GetDataStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataStorageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the count of detection rules.</p>
     * 
     * @param request GetDetectionStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDetectionStatisticResponse
     */
    public GetDetectionStatisticResponse getDetectionStatisticWithOptions(GetDetectionStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDetectionStatistic"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDetectionStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the count of detection rules.</p>
     * 
     * @param request GetDetectionStatisticRequest
     * @return GetDetectionStatisticResponse
     */
    public GetDetectionStatisticResponse getDetectionStatistic(GetDetectionStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDetectionStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the progress of an export task.</p>
     * 
     * @param request GetExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExportTaskResponse
     */
    public GetExportTaskResponse getExportTaskWithOptions(GetExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exportId)) {
            body.put("ExportId", request.exportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExportTask"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the progress of an export task.</p>
     * 
     * @param request GetExportTaskRequest
     * @return GetExportTaskResponse
     */
    public GetExportTaskResponse getExportTask(GetExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExportTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. We provide a supporting utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of an event.</p>
     * 
     * @param request GetIncidentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIncidentResponse
     */
    public GetIncidentResponse getIncidentWithOptions(GetIncidentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIncident"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIncidentResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. We provide a supporting utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of an event.</p>
     * 
     * @param request GetIncidentRequest
     * @return GetIncidentResponse
     */
    public GetIncidentResponse getIncident(GetIncidentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIncidentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the generated AI investigation results for a specified event. You can first call ListIncidentInvestigations to obtain the report ID or display ID, and then call this operation to query the details.
     * The query priority is as follows:</p>
     * <ol>
     * <li>If IncidentInvestigationId is specified, the query is performed by report ID.</li>
     * <li>If the report ID is not specified but IncidentInvestigationDisplayId is specified, the query is performed by display ID.</li>
     * <li>If neither identifier is specified, the most recent successfully completed investigation result for the event corresponding to IncidentUuid is returned, sorted in descending order by investigation end time.
     * If no matching investigation record is found, IncidentInvestigation is empty.
     * IncidentInvestigationStatus indicates the judgment category in the report. Both IncidentInvestigationReport and IncidentInvestigationOutput are JSON-formatted strings. You must parse them in JSON format before using their fields. Internal fields may change with report versions, and callers must be compatible with missing fields. The examples show only part of the report content.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the AI investigation details of a specified event, including the report identifiers, investigation time, judgment category, summary, conclusion, and report content.</p>
     * 
     * @param request GetIncidentInvestigationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIncidentInvestigationResponse
     */
    public GetIncidentInvestigationResponse getIncidentInvestigationWithOptions(GetIncidentInvestigationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.incidentInvestigationDisplayId)) {
            body.put("IncidentInvestigationDisplayId", request.incidentInvestigationDisplayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentInvestigationId)) {
            body.put("IncidentInvestigationId", request.incidentInvestigationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIncidentInvestigation"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIncidentInvestigationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the generated AI investigation results for a specified event. You can first call ListIncidentInvestigations to obtain the report ID or display ID, and then call this operation to query the details.
     * The query priority is as follows:</p>
     * <ol>
     * <li>If IncidentInvestigationId is specified, the query is performed by report ID.</li>
     * <li>If the report ID is not specified but IncidentInvestigationDisplayId is specified, the query is performed by display ID.</li>
     * <li>If neither identifier is specified, the most recent successfully completed investigation result for the event corresponding to IncidentUuid is returned, sorted in descending order by investigation end time.
     * If no matching investigation record is found, IncidentInvestigation is empty.
     * IncidentInvestigationStatus indicates the judgment category in the report. Both IncidentInvestigationReport and IncidentInvestigationOutput are JSON-formatted strings. You must parse them in JSON format before using their fields. Internal fields may change with report versions, and callers must be compatible with missing fields. The examples show only part of the report content.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the AI investigation details of a specified event, including the report identifiers, investigation time, judgment category, summary, conclusion, and report content.</p>
     * 
     * @param request GetIncidentInvestigationRequest
     * @return GetIncidentInvestigationResponse
     */
    public GetIncidentInvestigationResponse getIncidentInvestigation(GetIncidentInvestigationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIncidentInvestigationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration string. A utility class is provided to help with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves log credentials.</p>
     * 
     * @param request GetLogTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLogTicketResponse
     */
    public GetLogTicketResponse getLogTicketWithOptions(GetLogTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLogTicket"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLogTicketResponse());
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration string. A utility class is provided to help with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves log credentials.</p>
     * 
     * @param request GetLogTicketRequest
     * @return GetLogTicketResponse
     */
    public GetLogTicketResponse getLogTicket(GetLogTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLogTicketWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig involves highly complex JSON configurations. To help you configure it, we provide a utility class with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves normalization rule information.</p>
     * 
     * @param request GetNormalizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNormalizationRuleResponse
     */
    public GetNormalizationRuleResponse getNormalizationRuleWithOptions(GetNormalizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSecurityDomainId)) {
            body.put("NormalizationSecurityDomainId", request.normalizationSecurityDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNormalizationRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNormalizationRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig involves highly complex JSON configurations. To help you configure it, we provide a utility class with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves normalization rule information.</p>
     * 
     * @param request GetNormalizationRuleRequest
     * @return GetNormalizationRuleResponse
     */
    public GetNormalizationRuleResponse getNormalizationRule(GetNormalizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNormalizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化规则指定版本信息</p>
     * 
     * @param request GetNormalizationRuleVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNormalizationRuleVersionResponse
     */
    public GetNormalizationRuleVersionResponse getNormalizationRuleVersionWithOptions(GetNormalizationRuleVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleVersion)) {
            body.put("NormalizationRuleVersion", request.normalizationRuleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNormalizationRuleVersion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNormalizationRuleVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化规则指定版本信息</p>
     * 
     * @param request GetNormalizationRuleVersionRequest
     * @return GetNormalizationRuleVersionResponse
     */
    public GetNormalizationRuleVersionResponse getNormalizationRuleVersion(GetNormalizationRuleVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNormalizationRuleVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. We provide a utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the normalized schema.</p>
     * 
     * @param request GetNormalizationSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNormalizationSchemaResponse
     */
    public GetNormalizationSchemaResponse getNormalizationSchemaWithOptions(GetNormalizationSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaType)) {
            body.put("NormalizationSchemaType", request.normalizationSchemaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNormalizationSchema"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNormalizationSchemaResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. We provide a utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the normalized schema.</p>
     * 
     * @param request GetNormalizationSchemaRequest
     * @return GetNormalizationSchemaResponse
     */
    public GetNormalizationSchemaResponse getNormalizationSchema(GetNormalizationSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNormalizationSchemaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the count of automated response rules.</p>
     * 
     * @param request GetResponseRuleStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResponseRuleStatisticResponse
     */
    public GetResponseRuleStatisticResponse getResponseRuleStatisticWithOptions(GetResponseRuleStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResponseRuleStatistic"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResponseRuleStatisticResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the count of automated response rules.</p>
     * 
     * @param request GetResponseRuleStatisticRequest
     * @return GetResponseRuleStatisticResponse
     */
    public GetResponseRuleStatisticResponse getResponseRuleStatistic(GetResponseRuleStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResponseRuleStatisticWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves user information.</p>
     * 
     * @param request GetUserConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserConfigResponse
     */
    public GetUserConfigResponse getUserConfigWithOptions(GetUserConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserConfig"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves user information.</p>
     * 
     * @param request GetUserConfigRequest
     * @return GetUserConfigResponse
     */
    public GetUserConfigResponse getUserConfig(GetUserConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a highly complex JSON configuration. To simplify this, we provide a utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of alert groups.</p>
     * 
     * @param request ListAlertAggregationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertAggregationsResponse
     */
    public ListAlertAggregationsResponse listAlertAggregationsWithOptions(ListAlertAggregationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregationType)) {
            body.put("AggregationType", request.aggregationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCondition)) {
            body.put("QueryCondition", request.queryCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryViewId)) {
            body.put("QueryViewId", request.queryViewId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlertAggregations"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertAggregationsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a highly complex JSON configuration. To simplify this, we provide a utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of alert groups.</p>
     * 
     * @param request ListAlertAggregationsRequest
     * @return ListAlertAggregationsResponse
     */
    public ListAlertAggregationsResponse listAlertAggregations(ListAlertAggregationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlertAggregationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON Configurations. We provide a utility class with configuration examples to help you get started. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * <h3>Before you begin</h3>
     * <p>Before invoking this operation, ensure that Cloud SIEM storage resources (the alert-record Logstore in the Simple Log Service project) are activated. Invoke GetDataStorage to check the storage status. If storage is not activated, purchase SIEM storage first. Otherwise, the invocation will fail.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of alerts.</p>
     * 
     * @param request ListAlertsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertsResponse
     */
    public ListAlertsResponse listAlertsWithOptions(ListAlertsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertLevel)) {
            body.put("AlertLevel", request.alertLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertUuid)) {
            body.put("AlertUuid", request.alertUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            body.put("OrderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderFieldName)) {
            body.put("OrderFieldName", request.orderFieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCondition)) {
            body.put("QueryCondition", request.queryCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryViewId)) {
            body.put("QueryViewId", request.queryViewId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlerts"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON Configurations. We provide a utility class with configuration examples to help you get started. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * <h3>Before you begin</h3>
     * <p>Before invoking this operation, ensure that Cloud SIEM storage resources (the alert-record Logstore in the Simple Log Service project) are activated. Invoke GetDataStorage to check the storage status. If storage is not activated, purchase SIEM storage first. Otherwise, the invocation will fail.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of alerts.</p>
     * 
     * @param request ListAlertsRequest
     * @return ListAlertsResponse
     */
    public ListAlertsResponse listAlerts(ListAlertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlertsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of AI decision-making entities.</p>
     * 
     * @param tmpReq ListAutoDisposeEntitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAutoDisposeEntitiesResponse
     */
    public ListAutoDisposeEntitiesResponse listAutoDisposeEntitiesWithOptions(ListAutoDisposeEntitiesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAutoDisposeEntitiesShrinkRequest request = new ListAutoDisposeEntitiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.autoDisposeRecordIds)) {
            request.autoDisposeRecordIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.autoDisposeRecordIds, "AutoDisposeRecordIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoDisposeRecordIdsShrink)) {
            body.put("AutoDisposeRecordIds", request.autoDisposeRecordIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAutoDisposeEntities"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoDisposeEntitiesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of AI decision-making entities.</p>
     * 
     * @param request ListAutoDisposeEntitiesRequest
     * @return ListAutoDisposeEntitiesResponse
     */
    public ListAutoDisposeEntitiesResponse listAutoDisposeEntities(ListAutoDisposeEntitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAutoDisposeEntitiesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of messages in a specified security operations agent session.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query on the persisted visible messages in a specified security operations agent session, and allows you to control the sorting direction.</p>
     * 
     * @param request ListCopilotMessagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCopilotMessagesResponse
     */
    public ListCopilotMessagesResponse listCopilotMessagesWithOptions(ListCopilotMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ascending)) {
            body.put("Ascending", request.ascending);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            body.put("TraceId", request.traceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCopilotMessages"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCopilotMessagesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of messages in a specified security operations agent session.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query on the persisted visible messages in a specified security operations agent session, and allows you to control the sorting direction.</p>
     * 
     * @param request ListCopilotMessagesRequest
     * @return ListCopilotMessagesResponse
     */
    public ListCopilotMessagesResponse listCopilotMessages(ListCopilotMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCopilotMessagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a paging query to retrieve data connectors.</p>
     * 
     * @param tmpReq ListDataConnectorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataConnectorsResponse
     */
    public ListDataConnectorsResponse listDataConnectorsWithOptions(ListDataConnectorsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataConnectorsShrinkRequest request = new ListDataConnectorsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataConnectorIds)) {
            request.dataConnectorIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataConnectorIds, "DataConnectorIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataConnectorIdsShrink)) {
            body.put("DataConnectorIds", request.dataConnectorIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataConnectorName)) {
            body.put("DataConnectorName", request.dataConnectorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataConnectorStatus)) {
            body.put("DataConnectorStatus", request.dataConnectorStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataConnectorType)) {
            body.put("DataConnectorType", request.dataConnectorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destDataSourceId)) {
            body.put("DestDataSourceId", request.destDataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            body.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsIngestionJobName)) {
            body.put("SlsIngestionJobName", request.slsIngestionJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDataType)) {
            body.put("SrcDataType", request.srcDataType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataConnectors"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataConnectorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a paging query to retrieve data connectors.</p>
     * 
     * @param request ListDataConnectorsRequest
     * @return ListDataConnectorsResponse
     */
    public ListDataConnectorsResponse listDataConnectors(ListDataConnectorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataConnectorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入模板</p>
     * 
     * @param request ListDataIngestionTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataIngestionTemplatesResponse
     */
    public ListDataIngestionTemplatesResponse listDataIngestionTemplatesWithOptions(ListDataIngestionTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionTemplateStatus)) {
            body.put("DataIngestionTemplateStatus", request.dataIngestionTemplateStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceTemplateIds)) {
            body.put("DataSourceTemplateIds", request.dataSourceTemplateIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataIngestionTemplates"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataIngestionTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入模板</p>
     * 
     * @param request ListDataIngestionTemplatesRequest
     * @return ListDataIngestionTemplatesResponse
     */
    public ListDataIngestionTemplatesResponse listDataIngestionTemplates(ListDataIngestionTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataIngestionTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of data ingestion policies.</p>
     * 
     * @param tmpReq ListDataIngestionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataIngestionsResponse
     */
    public ListDataIngestionsResponse listDataIngestionsWithOptions(ListDataIngestionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataIngestionsShrinkRequest request = new ListDataIngestionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataIngestionIds)) {
            request.dataIngestionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataIngestionIds, "DataIngestionIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataIngestionTemplateIds)) {
            request.dataIngestionTemplateIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataIngestionTemplateIds, "DataIngestionTemplateIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.normalizationSchemaIds)) {
            request.normalizationSchemaIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.normalizationSchemaIds, "NormalizationSchemaIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionIdsShrink)) {
            body.put("DataIngestionIds", request.dataIngestionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionStatus)) {
            body.put("DataIngestionStatus", request.dataIngestionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionTemplateIdsShrink)) {
            body.put("DataIngestionTemplateIds", request.dataIngestionTemplateIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaIdsShrink)) {
            body.put("NormalizationSchemaIds", request.normalizationSchemaIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataIngestions"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataIngestionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of data ingestion policies.</p>
     * 
     * @param request ListDataIngestionsRequest
     * @return ListDataIngestionsResponse
     */
    public ListDataIngestionsResponse listDataIngestions(ListDataIngestionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataIngestionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of dataset records.</p>
     * 
     * @param request ListDataSetRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSetRecordsResponse
     */
    public ListDataSetRecordsResponse listDataSetRecordsWithOptions(ListDataSetRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("DataSetId", request.dataSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSetRecords"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSetRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of dataset records.</p>
     * 
     * @param request ListDataSetRecordsRequest
     * @return ListDataSetRecordsResponse
     */
    public ListDataSetRecordsResponse listDataSetRecords(ListDataSetRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSetRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集列表</p>
     * 
     * @param tmpReq ListDataSetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSetsResponse
     */
    public ListDataSetsResponse listDataSetsWithOptions(ListDataSetsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataSetsShrinkRequest request = new ListDataSetsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSetIds)) {
            request.dataSetIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSetIds, "DataSetIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("DataSetId", request.dataSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetIdsShrink)) {
            body.put("DataSetIds", request.dataSetIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetName)) {
            body.put("DataSetName", request.dataSetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetStatus)) {
            body.put("DataSetStatus", request.dataSetStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetType)) {
            body.put("DataSetType", request.dataSetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            body.put("OrderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderFieldName)) {
            body.put("OrderFieldName", request.orderFieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSets"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集列表</p>
     * 
     * @param request ListDataSetsRequest
     * @return ListDataSetsResponse
     */
    public ListDataSetsResponse listDataSets(ListDataSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据源模板</p>
     * 
     * @param tmpReq ListDataSourceTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourceTemplatesResponse
     */
    public ListDataSourceTemplatesResponse listDataSourceTemplatesWithOptions(ListDataSourceTemplatesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataSourceTemplatesShrinkRequest request = new ListDataSourceTemplatesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSourceTemplateIds)) {
            request.dataSourceTemplateIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSourceTemplateIds, "DataSourceTemplateIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceTemplateIdsShrink)) {
            body.put("DataSourceTemplateIds", request.dataSourceTemplateIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSourceTemplates"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据源模板</p>
     * 
     * @param request ListDataSourceTemplatesRequest
     * @return ListDataSourceTemplatesResponse
     */
    public ListDataSourceTemplatesResponse listDataSourceTemplates(ListDataSourceTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSourceTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notification delivery is subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time frame.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of data sources.</p>
     * 
     * @param tmpReq ListDataSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourcesResponse
     */
    public ListDataSourcesResponse listDataSourcesWithOptions(ListDataSourcesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataSourcesShrinkRequest request = new ListDataSourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSourceIds)) {
            request.dataSourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSourceIds, "DataSourceIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSourceTemplateIds)) {
            request.dataSourceTemplateIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSourceTemplateIds, "DataSourceTemplateIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.logUserIds)) {
            request.logUserIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.logUserIds, "LogUserIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceFrom)) {
            body.put("DataSourceFrom", request.dataSourceFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceIdsShrink)) {
            body.put("DataSourceIds", request.dataSourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            body.put("DataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceStatus)) {
            body.put("DataSourceStatus", request.dataSourceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceStoreStatus)) {
            body.put("DataSourceStoreStatus", request.dataSourceStoreStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceTemplateIdsShrink)) {
            body.put("DataSourceTemplateIds", request.dataSourceTemplateIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserIdsShrink)) {
            body.put("LogUserIds", request.logUserIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSources"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notification delivery is subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time frame.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of data sources.</p>
     * 
     * @param request ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    public ListDataSourcesResponse listDataSources(ListDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent at other times.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of detection rules.</p>
     * 
     * @param tmpReq ListDetectionRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDetectionRulesResponse
     */
    public ListDetectionRulesResponse listDetectionRulesWithOptions(ListDetectionRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDetectionRulesShrinkRequest request = new ListDetectionRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.detectionRuleIds)) {
            request.detectionRuleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.detectionRuleIds, "DetectionRuleIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.logSchemaIds)) {
            request.logSchemaIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.logSchemaIds, "LogSchemaIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertAttCk)) {
            body.put("AlertAttCk", request.alertAttCk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertLevel)) {
            body.put("AlertLevel", request.alertLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertTacticId)) {
            body.put("AlertTacticId", request.alertTacticId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            body.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionExpressionType)) {
            body.put("DetectionExpressionType", request.detectionExpressionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleId)) {
            body.put("DetectionRuleId", request.detectionRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleIdsShrink)) {
            body.put("DetectionRuleIds", request.detectionRuleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleName)) {
            body.put("DetectionRuleName", request.detectionRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleStatus)) {
            body.put("DetectionRuleStatus", request.detectionRuleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleType)) {
            body.put("DetectionRuleType", request.detectionRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentAggregationType)) {
            body.put("IncidentAggregationType", request.incidentAggregationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logCategoryId)) {
            body.put("LogCategoryId", request.logCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSchemaId)) {
            body.put("LogSchemaId", request.logSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSchemaIdsShrink)) {
            body.put("LogSchemaIds", request.logSchemaIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            body.put("OrderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderFieldName)) {
            body.put("OrderFieldName", request.orderFieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDetectionRules"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDetectionRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent at other times.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of detection rules.</p>
     * 
     * @param request ListDetectionRulesRequest
     * @return ListDetectionRulesResponse
     */
    public ListDetectionRulesResponse listDetectionRules(ListDetectionRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDetectionRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notification delivery is subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time frame.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of incidents.</p>
     * 
     * @param tmpReq ListIncidentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIncidentsResponse
     */
    public ListIncidentsResponse listIncidentsWithOptions(ListIncidentsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListIncidentsShrinkRequest request = new ListIncidentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.incidentUuids)) {
            request.incidentUuidsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.incidentUuids, "IncidentUuids", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.incidentName)) {
            query.put("IncidentName", request.incidentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuidsShrink)) {
            query.put("IncidentUuids", request.incidentUuidsShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertUuid)) {
            body.put("AlertUuid", request.alertUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleIds)) {
            body.put("DetectionRuleIds", request.detectionRuleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentStatus)) {
            body.put("IncidentStatus", request.incidentStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentStatusList)) {
            body.put("IncidentStatusList", request.incidentStatusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentTags)) {
            body.put("IncidentTags", request.incidentTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            body.put("OrderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderFieldName)) {
            body.put("OrderFieldName", request.orderFieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owners)) {
            body.put("Owners", request.owners);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relateAssetId)) {
            body.put("RelateAssetId", request.relateAssetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relateEntityId)) {
            body.put("RelateEntityId", request.relateEntityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threatLevel)) {
            body.put("ThreatLevel", request.threatLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIncidents"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIncidentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notification delivery is subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time frame.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of incidents.</p>
     * 
     * @param request ListIncidentsRequest
     * @return ListIncidentsResponse
     */
    public ListIncidentsResponse listIncidents(ListIncidentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIncidentsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of log projects associated with threat detection and response.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of log projects.</p>
     * 
     * @param request ListLogProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogProjectsResponse
     */
    public ListLogProjectsResponse listLogProjectsWithOptions(ListLogProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogProjects"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogProjectsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of log projects associated with threat detection and response.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of log projects.</p>
     * 
     * @param request ListLogProjectsRequest
     * @return ListLogProjectsResponse
     */
    public ListLogProjectsResponse listLogProjects(ListLogProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLogProjectsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig involves complex JSON configurations. We provide a supporting utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves all regions.</p>
     * 
     * @param request ListLogRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogRegionsResponse
     */
    public ListLogRegionsResponse listLogRegionsWithOptions(ListLogRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogRegions"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogRegionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig involves complex JSON configurations. We provide a supporting utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves all regions.</p>
     * 
     * @param request ListLogRegionsRequest
     * @return ListLogRegionsResponse
     */
    public ListLogRegionsResponse listLogRegions(ListLogRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLogRegionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Sending notifications is subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00, and no notifications are sent at other times.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of log stores.</p>
     * 
     * @param request ListLogStoresRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogStoresResponse
     */
    public ListLogStoresResponse listLogStoresWithOptions(ListLogStoresRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogStores"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogStoresResponse());
    }

    /**
     * <b>description</b> :
     * <p>Sending notifications is subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00, and no notifications are sent at other times.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of log stores.</p>
     * 
     * @param request ListLogStoresRequest
     * @return ListLogStoresResponse
     */
    public ListLogStoresResponse listLogStores(ListLogStoresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLogStoresWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time window.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of standardized categories.</p>
     * 
     * @param request ListNormalizationCategoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNormalizationCategoriesResponse
     */
    public ListNormalizationCategoriesResponse listNormalizationCategoriesWithOptions(ListNormalizationCategoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationCategoryType)) {
            body.put("NormalizationCategoryType", request.normalizationCategoryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNormalizationCategories"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNormalizationCategoriesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time window.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of standardized categories.</p>
     * 
     * @param request ListNormalizationCategoriesRequest
     * @return ListNormalizationCategoriesResponse
     */
    public ListNormalizationCategoriesResponse listNormalizationCategories(ListNormalizationCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNormalizationCategoriesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided for configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of normalization fields.</p>
     * 
     * @param request ListNormalizationFieldsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNormalizationFieldsResponse
     */
    public ListNormalizationFieldsResponse listNormalizationFieldsWithOptions(ListNormalizationFieldsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationFieldSource)) {
            body.put("NormalizationFieldSource", request.normalizationFieldSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaType)) {
            body.put("NormalizationSchemaType", request.normalizationSchemaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNormalizationFields"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNormalizationFieldsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided for configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of normalization fields.</p>
     * 
     * @param request ListNormalizationFieldsRequest
     * @return ListNormalizationFieldsResponse
     */
    public ListNormalizationFieldsResponse listNormalizationFields(ListNormalizationFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNormalizationFieldsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of security capabilities associated with normalization rules.</p>
     * 
     * @param tmpReq ListNormalizationRuleCapacitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNormalizationRuleCapacitiesResponse
     */
    public ListNormalizationRuleCapacitiesResponse listNormalizationRuleCapacitiesWithOptions(ListNormalizationRuleCapacitiesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNormalizationRuleCapacitiesShrinkRequest request = new ListNormalizationRuleCapacitiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.normalizationRuleIds)) {
            request.normalizationRuleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.normalizationRuleIds, "NormalizationRuleIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleIdsShrink)) {
            body.put("NormalizationRuleIds", request.normalizationRuleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNormalizationRuleCapacities"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNormalizationRuleCapacitiesResponse());
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of security capabilities associated with normalization rules.</p>
     * 
     * @param request ListNormalizationRuleCapacitiesRequest
     * @return ListNormalizationRuleCapacitiesResponse
     */
    public ListNormalizationRuleCapacitiesResponse listNormalizationRuleCapacities(ListNormalizationRuleCapacitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNormalizationRuleCapacitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化规则版本列表</p>
     * 
     * @param request ListNormalizationRuleVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNormalizationRuleVersionsResponse
     */
    public ListNormalizationRuleVersionsResponse listNormalizationRuleVersionsWithOptions(ListNormalizationRuleVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNormalizationRuleVersions"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNormalizationRuleVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准化规则版本列表</p>
     * 
     * @param request ListNormalizationRuleVersionsRequest
     * @return ListNormalizationRuleVersionsResponse
     */
    public ListNormalizationRuleVersionsResponse listNormalizationRuleVersions(ListNormalizationRuleVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNormalizationRuleVersionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time window.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of normalization rules.</p>
     * 
     * @param tmpReq ListNormalizationRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNormalizationRulesResponse
     */
    public ListNormalizationRulesResponse listNormalizationRulesWithOptions(ListNormalizationRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNormalizationRulesShrinkRequest request = new ListNormalizationRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.normalizationRuleIds)) {
            request.normalizationRuleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.normalizationRuleIds, "NormalizationRuleIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationCategoryId)) {
            body.put("NormalizationCategoryId", request.normalizationCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleIdsShrink)) {
            body.put("NormalizationRuleIds", request.normalizationRuleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleName)) {
            body.put("NormalizationRuleName", request.normalizationRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleType)) {
            body.put("NormalizationRuleType", request.normalizationRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSecurityDomainId)) {
            body.put("NormalizationSecurityDomainId", request.normalizationSecurityDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            body.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorId)) {
            body.put("VendorId", request.vendorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNormalizationRules"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNormalizationRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time window.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of normalization rules.</p>
     * 
     * @param request ListNormalizationRulesRequest
     * @return ListNormalizationRulesResponse
     */
    public ListNormalizationRulesResponse listNormalizationRules(ListNormalizationRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNormalizationRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig is a complex JSON configuration. To help with specific configuration examples, we provide a utility class. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of normalization schemas.</p>
     * 
     * @param request ListNormalizationSchemasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNormalizationSchemasResponse
     */
    public ListNormalizationSchemasResponse listNormalizationSchemasWithOptions(ListNormalizationSchemasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationCategoryId)) {
            body.put("NormalizationCategoryId", request.normalizationCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationFieldSource)) {
            body.put("NormalizationFieldSource", request.normalizationFieldSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaType)) {
            body.put("NormalizationSchemaType", request.normalizationSchemaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSecurityDomainId)) {
            body.put("NormalizationSecurityDomainId", request.normalizationSecurityDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNormalizationSchemas"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNormalizationSchemasResponse());
    }

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig is a complex JSON configuration. To help with specific configuration examples, we provide a utility class. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of normalization schemas.</p>
     * 
     * @param request ListNormalizationSchemasRequest
     * @return ListNormalizationSchemasResponse
     */
    public ListNormalizationSchemasResponse listNormalizationSchemas(ListNormalizationSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNormalizationSchemasWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class and configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of security domains.</p>
     * 
     * @param request ListNormalizationSecurityDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNormalizationSecurityDomainsResponse
     */
    public ListNormalizationSecurityDomainsResponse listNormalizationSecurityDomainsWithOptions(ListNormalizationSecurityDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNormalizationSecurityDomains"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNormalizationSecurityDomainsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class and configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of security domains.</p>
     * 
     * @param request ListNormalizationSecurityDomainsRequest
     * @return ListNormalizationSecurityDomainsResponse
     */
    public ListNormalizationSecurityDomainsResponse listNormalizationSecurityDomains(ListNormalizationSecurityDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNormalizationSecurityDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取产品列表</p>
     * 
     * @param tmpReq ListProductsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductsResponse
     */
    public ListProductsResponse listProductsWithOptions(ListProductsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProductsShrinkRequest request = new ListProductsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.productIds)) {
            request.productIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.productIds, "ProductIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productIdsShrink)) {
            body.put("ProductIds", request.productIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorId)) {
            body.put("VendorId", request.vendorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProducts"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取产品列表</p>
     * 
     * @param request ListProductsRequest
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of query views.</p>
     * 
     * @param request ListQueryViewsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQueryViewsResponse
     */
    public ListQueryViewsResponse listQueryViewsWithOptions(ListQueryViewsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryViewScene)) {
            body.put("QueryViewScene", request.queryViewScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryViewType)) {
            body.put("QueryViewType", request.queryViewType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueryViews"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueryViewsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of query views.</p>
     * 
     * @param request ListQueryViewsRequest
     * @return ListQueryViewsResponse
     */
    public ListQueryViewsResponse listQueryViews(ListQueryViewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQueryViewsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the field list of automated response rules.</p>
     * 
     * @param request ListResponseRuleFieldsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResponseRuleFieldsResponse
     */
    public ListResponseRuleFieldsResponse listResponseRuleFieldsWithOptions(ListResponseRuleFieldsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResponseRuleFields"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResponseRuleFieldsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the field list of automated response rules.</p>
     * 
     * @param request ListResponseRuleFieldsRequest
     * @return ListResponseRuleFieldsResponse
     */
    public ListResponseRuleFieldsResponse listResponseRuleFields(ListResponseRuleFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResponseRuleFieldsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notification sending is limited by frequency and time. Each user can receive a maximum of two notifications per day between 08:00 and 20:00, and no notifications are sent at other times.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries automatic response rules by page.</p>
     * 
     * @param request ListResponseRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResponseRulesResponse
     */
    public ListResponseRulesResponse listResponseRulesWithOptions(ListResponseRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseActionType)) {
            body.put("ResponseActionType", request.responseActionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRuleName)) {
            body.put("ResponseRuleName", request.responseRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRuleStatus)) {
            body.put("ResponseRuleStatus", request.responseRuleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRuleType)) {
            body.put("ResponseRuleType", request.responseRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseTriggerType)) {
            body.put("ResponseTriggerType", request.responseTriggerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResponseRules"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResponseRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notification sending is limited by frequency and time. Each user can receive a maximum of two notifications per day between 08:00 and 20:00, and no notifications are sent at other times.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries automatic response rules by page.</p>
     * 
     * @param request ListResponseRulesRequest
     * @return ListResponseRulesResponse
     */
    public ListResponseRulesResponse listResponseRules(ListResponseRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResponseRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON Configurations string. We provide a utility class with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of tags.</p>
     * 
     * @param request ListTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagsResponse
     */
    public ListTagsResponse listTagsWithOptions(ListTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetRelation)) {
            body.put("TargetRelation", request.targetRelation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            body.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUuid)) {
            body.put("TargetUuid", request.targetUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTags"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON Configurations string. We provide a utility class with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of tags.</p>
     * 
     * @param request ListTagsRequest
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of traffic statistics.</p>
     * 
     * @param tmpReq ListTrafficStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrafficStatisticsResponse
     */
    public ListTrafficStatisticsResponse listTrafficStatisticsWithOptions(ListTrafficStatisticsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTrafficStatisticsShrinkRequest request = new ListTrafficStatisticsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.logUserIds)) {
            request.logUserIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.logUserIds, "LogUserIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserIdsShrink)) {
            body.put("LogUserIds", request.logUserIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionTag)) {
            body.put("RegionTag", request.regionTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficStatisticPeriod)) {
            body.put("TrafficStatisticPeriod", request.trafficStatisticPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficStatisticPeriodType)) {
            body.put("TrafficStatisticPeriodType", request.trafficStatisticPeriodType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficStatisticType)) {
            body.put("TrafficStatisticType", request.trafficStatisticType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficType)) {
            body.put("TrafficType", request.trafficType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrafficStatistics"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrafficStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of traffic statistics.</p>
     * 
     * @param request ListTrafficStatisticsRequest
     * @return ListTrafficStatisticsResponse
     */
    public ListTrafficStatisticsResponse listTrafficStatistics(ListTrafficStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTrafficStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig input parameter is a complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of upgrade items.</p>
     * 
     * @param request ListUpgradeItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUpgradeItemsResponse
     */
    public ListUpgradeItemsResponse listUpgradeItemsWithOptions(ListUpgradeItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUpgradeItems"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUpgradeItemsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig input parameter is a complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of upgrade items.</p>
     * 
     * @param request ListUpgradeItemsRequest
     * @return ListUpgradeItemsResponse
     */
    public ListUpgradeItemsResponse listUpgradeItems(ListUpgradeItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUpgradeItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取厂商列表</p>
     * 
     * @param tmpReq ListVendorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVendorsResponse
     */
    public ListVendorsResponse listVendorsWithOptions(ListVendorsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListVendorsShrinkRequest request = new ListVendorsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vendorIds)) {
            request.vendorIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vendorIds, "VendorIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorIdsShrink)) {
            body.put("VendorIds", request.vendorIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorName)) {
            body.put("VendorName", request.vendorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorType)) {
            body.put("VendorType", request.vendorType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVendors"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVendorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取厂商列表</p>
     * 
     * @param request ListVendorsRequest
     * @return ListVendorsResponse
     */
    public ListVendorsResponse listVendors(ListVendorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVendorsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time window.</p>
     * 
     * <b>summary</b> : 
     * <p>Refreshes a data source.</p>
     * 
     * @param request RefreshDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshDataSourceResponse
     */
    public RefreshDataSourceResponse refreshDataSourceWithOptions(RefreshDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshDataSource"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshDataSourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time window.</p>
     * 
     * <b>summary</b> : 
     * <p>Refreshes a data source.</p>
     * 
     * @param request RefreshDataSourceRequest
     * @return RefreshDataSourceResponse
     */
    public RefreshDataSourceResponse refreshDataSource(RefreshDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the log storage for a user.</p>
     * 
     * @param request ResetDataStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetDataStorageResponse
     */
    public ResetDataStorageResponse resetDataStorageWithOptions(ResetDataStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetDataStorage"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetDataStorageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the log storage for a user.</p>
     * 
     * @param request ResetDataStorageRequest
     * @return ResetDataStorageResponse
     */
    public ResetDataStorageResponse resetDataStorage(ResetDataStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetDataStorageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Resumes the event stream for a security operations agent conversation turn from a specified cursor.</p>
     * 
     * <b>summary</b> : 
     * <p>Resumes the Server-Sent Events (SSE) event stream for a specified security operations agent turn incrementally based on the run cursor.</p>
     * 
     * @param tmpReq ResumeCopilotTurnStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeCopilotTurnStreamResponse
     */
    public ResumeCopilotTurnStreamResponse resumeCopilotTurnStreamWithOptions(ResumeCopilotTurnStreamRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ResumeCopilotTurnStreamShrinkRequest request = new ResumeCopilotTurnStreamShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cursorByRun)) {
            request.cursorByRunShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cursorByRun, "CursorByRun", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cursorByRunShrink)) {
            body.put("CursorByRun", request.cursorByRunShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            body.put("TraceId", request.traceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.turnId)) {
            body.put("TurnId", request.turnId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeCopilotTurnStream"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeCopilotTurnStreamResponse());
    }

    /**
     * <b>description</b> :
     * <p>Resumes the event stream for a security operations agent conversation turn from a specified cursor.</p>
     * 
     * <b>summary</b> : 
     * <p>Resumes the Server-Sent Events (SSE) event stream for a specified security operations agent turn incrementally based on the run cursor.</p>
     * 
     * @param request ResumeCopilotTurnStreamRequest
     * @return ResumeCopilotTurnStreamResponse
     */
    public ResumeCopilotTurnStreamResponse resumeCopilotTurnStream(ResumeCopilotTurnStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeCopilotTurnStreamWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent at other times.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the default version of a normalization rule.</p>
     * 
     * @param request SetDefaultNormalizationRuleVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDefaultNormalizationRuleVersionResponse
     */
    public SetDefaultNormalizationRuleVersionResponse setDefaultNormalizationRuleVersionWithOptions(SetDefaultNormalizationRuleVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleVersion)) {
            body.put("NormalizationRuleVersion", request.normalizationRuleVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDefaultNormalizationRuleVersion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDefaultNormalizationRuleVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent at other times.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the default version of a normalization rule.</p>
     * 
     * @param request SetDefaultNormalizationRuleVersionRequest
     * @return SetDefaultNormalizationRuleVersionResponse
     */
    public SetDefaultNormalizationRuleVersionResponse setDefaultNormalizationRuleVersion(SetDefaultNormalizationRuleVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultNormalizationRuleVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notification delivery is subject to frequency and time limits. Each user can receive up to two notifications per day between 08:00 and 20:00, and no notifications are sent outside this time frame.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an alert.</p>
     * 
     * @param request UpdateAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAlertResponse
     */
    public UpdateAlertResponse updateAlertWithOptions(UpdateAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertStatus)) {
            body.put("AlertStatus", request.alertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertUuid)) {
            body.put("AlertUuid", request.alertUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlert"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAlertResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notification delivery is subject to frequency and time limits. Each user can receive up to two notifications per day between 08:00 and 20:00, and no notifications are sent outside this time frame.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an alert.</p>
     * 
     * @param request UpdateAlertRequest
     * @return UpdateAlertResponse
     */
    public UpdateAlertResponse updateAlert(UpdateAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAlertWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The <code>JsonConfig</code> parameter is a complex JSON configuration. See the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a> for helper utility classes and configuration examples.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the auto-dispose configuration.</p>
     * 
     * @param request UpdateAutoDisposeConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAutoDisposeConfigResponse
     */
    public UpdateAutoDisposeConfigResponse updateAutoDisposeConfigWithOptions(UpdateAutoDisposeConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoDecisionStatus)) {
            body.put("AutoDecisionStatus", request.autoDecisionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoDisposeConfig"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutoDisposeConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>The <code>JsonConfig</code> parameter is a complex JSON configuration. See the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a> for helper utility classes and configuration examples.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the auto-dispose configuration.</p>
     * 
     * @param request UpdateAutoDisposeConfigRequest
     * @return UpdateAutoDisposeConfigResponse
     */
    public UpdateAutoDisposeConfigResponse updateAutoDisposeConfig(UpdateAutoDisposeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAutoDisposeConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The AutoDecisionEntityList parameter is a JSON-formatted string. A helper class is available to simplify its creation. For an example, see the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an automatic alert analysis record.</p>
     * 
     * @param request UpdateAutoDisposeRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAutoDisposeRecordResponse
     */
    public UpdateAutoDisposeRecordResponse updateAutoDisposeRecordWithOptions(UpdateAutoDisposeRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoDecisionConclusion)) {
            body.put("AutoDecisionConclusion", request.autoDecisionConclusion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDecisionEntityList)) {
            body.put("AutoDecisionEntityList", request.autoDecisionEntityList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDecisionResult)) {
            body.put("AutoDecisionResult", request.autoDecisionResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDisposeRecordId)) {
            body.put("AutoDisposeRecordId", request.autoDisposeRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoDisposeRecord"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutoDisposeRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>The AutoDecisionEntityList parameter is a JSON-formatted string. A helper class is available to simplify its creation. For an example, see the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an automatic alert analysis record.</p>
     * 
     * @param request UpdateAutoDisposeRecordRequest
     * @return UpdateAutoDisposeRecordResponse
     */
    public UpdateAutoDisposeRecordResponse updateAutoDisposeRecord(UpdateAutoDisposeRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAutoDisposeRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. A supporting tool class that contains configuration examples is provided to help you. For more information, see the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a batch data ingestion task.</p>
     * 
     * @param tmpReq UpdateDataBatchIngestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataBatchIngestionResponse
     */
    public UpdateDataBatchIngestionResponse updateDataBatchIngestionWithOptions(UpdateDataBatchIngestionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataBatchIngestionShrinkRequest request = new UpdateDataBatchIngestionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataIngestionIds)) {
            request.dataIngestionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataIngestionIds, "DataIngestionIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.logUserIds)) {
            request.logUserIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.logUserIds, "LogUserIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoScanNew)) {
            body.put("AutoScanNew", request.autoScanNew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataBatchIngestionMode)) {
            body.put("DataBatchIngestionMode", request.dataBatchIngestionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionIdsShrink)) {
            body.put("DataIngestionIds", request.dataIngestionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceRecognizeEnabled)) {
            body.put("DataSourceRecognizeEnabled", request.dataSourceRecognizeEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserIdsShrink)) {
            body.put("LogUserIds", request.logUserIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataBatchIngestion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataBatchIngestionResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. A supporting tool class that contains configuration examples is provided to help you. For more information, see the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a batch data ingestion task.</p>
     * 
     * @param request UpdateDataBatchIngestionRequest
     * @return UpdateDataBatchIngestionResponse
     */
    public UpdateDataBatchIngestionResponse updateDataBatchIngestion(UpdateDataBatchIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataBatchIngestionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00 (UTC+8). No notifications are sent outside this time range.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a collector.</p>
     * 
     * @param request UpdateDataConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataConnectorResponse
     */
    public UpdateDataConnectorResponse updateDataConnectorWithOptions(UpdateDataConnectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authConfigId)) {
            body.put("AuthConfigId", request.authConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authConfigProduct)) {
            body.put("AuthConfigProduct", request.authConfigProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authConfigVendor)) {
            body.put("AuthConfigVendor", request.authConfigVendor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataConnectorConfig)) {
            body.put("DataConnectorConfig", request.dataConnectorConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataConnectorId)) {
            body.put("DataConnectorId", request.dataConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataConnectorStatus)) {
            body.put("DataConnectorStatus", request.dataConnectorStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataConnector"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataConnectorResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00 (UTC+8). No notifications are sent outside this time range.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a collector.</p>
     * 
     * @param request UpdateDataConnectorRequest
     * @return UpdateDataConnectorResponse
     */
    public UpdateDataConnectorResponse updateDataConnector(UpdateDataConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据接入信息</p>
     * 
     * @param request UpdateDataIngestionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataIngestionResponse
     */
    public UpdateDataIngestionResponse updateDataIngestionWithOptions(UpdateDataIngestionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionId)) {
            body.put("DataIngestionId", request.dataIngestionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionMode)) {
            body.put("DataIngestionMode", request.dataIngestionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataIngestion"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据接入信息</p>
     * 
     * @param request UpdateDataIngestionRequest
     * @return UpdateDataIngestionResponse
     */
    public UpdateDataIngestionResponse updateDataIngestion(UpdateDataIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataIngestionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新接入模板</p>
     * 
     * @param request UpdateDataIngestionTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataIngestionTemplateResponse
     */
    public UpdateDataIngestionTemplateResponse updateDataIngestionTemplateWithOptions(UpdateDataIngestionTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionStatus)) {
            body.put("DataIngestionStatus", request.dataIngestionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionTemplateId)) {
            body.put("DataIngestionTemplateId", request.dataIngestionTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIngestionTemplateName)) {
            body.put("DataIngestionTemplateName", request.dataIngestionTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataIngestionTemplate"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataIngestionTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新接入模板</p>
     * 
     * @param request UpdateDataIngestionTemplateRequest
     * @return UpdateDataIngestionTemplateResponse
     */
    public UpdateDataIngestionTemplateResponse updateDataIngestionTemplate(UpdateDataIngestionTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataIngestionTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据集</p>
     * 
     * @param request UpdateDataSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataSetResponse
     */
    public UpdateDataSetResponse updateDataSetWithOptions(UpdateDataSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetDescription)) {
            body.put("DataSetDescription", request.dataSetDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetFileName)) {
            body.put("DataSetFileName", request.dataSetFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("DataSetId", request.dataSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetName)) {
            body.put("DataSetName", request.dataSetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetStatus)) {
            body.put("DataSetStatus", request.dataSetStatus);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipWhitelistRecognizers)) {
            bodyFlat.put("IpWhitelistRecognizers", request.ipWhitelistRecognizers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSet"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据集</p>
     * 
     * @param request UpdateDataSetRequest
     * @return UpdateDataSetResponse
     */
    public UpdateDataSetResponse updateDataSet(UpdateDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time limits. Each user can receive up to two notifications per day between 08:00 and 20:00, and no notifications are sent outside this period.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates dataset records.</p>
     * 
     * @param request UpdateDataSetRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataSetRecordResponse
     */
    public UpdateDataSetRecordResponse updateDataSetRecordWithOptions(UpdateDataSetRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetFileName)) {
            body.put("DataSetFileName", request.dataSetFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            body.put("DataSetId", request.dataSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetRecords)) {
            body.put("DataSetRecords", request.dataSetRecords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSetRecord"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSetRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time limits. Each user can receive up to two notifications per day between 08:00 and 20:00, and no notifications are sent outside this period.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates dataset records.</p>
     * 
     * @param request UpdateDataSetRecordRequest
     * @return UpdateDataSetRecordResponse
     */
    public UpdateDataSetRecordResponse updateDataSetRecord(UpdateDataSetRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSetRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据源</p>
     * 
     * @param request UpdateDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataSourceResponse
     */
    public UpdateDataSourceResponse updateDataSourceWithOptions(UpdateDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceFrom)) {
            body.put("DataSourceFrom", request.dataSourceFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            body.put("DataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceRecognizeEnabled)) {
            body.put("DataSourceRecognizeEnabled", request.dataSourceRecognizeEnabled);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceStores)) {
            bodyFlat.put("DataSourceStores", request.dataSourceStores);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSource"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据源</p>
     * 
     * @param request UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     */
    public UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改数据源模板</p>
     * 
     * @param tmpReq UpdateDataSourceTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataSourceTemplateResponse
     */
    public UpdateDataSourceTemplateResponse updateDataSourceTemplateWithOptions(UpdateDataSourceTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataSourceTemplateShrinkRequest request = new UpdateDataSourceTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.logUserIds)) {
            request.logUserIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.logUserIds, "LogUserIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceRecognizeEnabled)) {
            query.put("DataSourceRecognizeEnabled", request.dataSourceRecognizeEnabled);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoScanNew)) {
            body.put("AutoScanNew", request.autoScanNew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceTemplateId)) {
            body.put("DataSourceTemplateId", request.dataSourceTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceTemplateName)) {
            body.put("DataSourceTemplateName", request.dataSourceTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectPattern)) {
            body.put("LogProjectPattern", request.logProjectPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionIds)) {
            body.put("LogRegionIds", request.logRegionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStorePattern)) {
            body.put("LogStorePattern", request.logStorePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserIdsShrink)) {
            body.put("LogUserIds", request.logUserIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSourceTemplate"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSourceTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改数据源模板</p>
     * 
     * @param request UpdateDataSourceTemplateRequest
     * @return UpdateDataSourceTemplateResponse
     */
    public UpdateDataSourceTemplateResponse updateDataSourceTemplate(UpdateDataSourceTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSourceTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the log storage region or the global switch for multi-account centralized delivery. Submit these two operations separately. Before modifying the global switch, call GetDataStorage and use the returned ConfigurationVersion and TargetProject values. Do not copy the fixed version and account from the examples. The current V2 version does not support the legacy DeliveryStatus global switch. After the update, call GetDataStorage again to obtain the latest configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the log storage region in log management.</p>
     * 
     * @param request UpdateDataStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataStorageResponse
     */
    public UpdateDataStorageResponse updateDataStorageWithOptions(UpdateDataStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configurationVersion)) {
            body.put("ConfigurationVersion", request.configurationVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataStorageRegionId)) {
            body.put("DataStorageRegionId", request.dataStorageRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryStatus)) {
            body.put("DeliveryStatus", request.deliveryStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiAccountDeliveryEnabled)) {
            body.put("MultiAccountDeliveryEnabled", request.multiAccountDeliveryEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetProject)) {
            body.put("TargetProject", request.targetProject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataStorage"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataStorageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the log storage region or the global switch for multi-account centralized delivery. Submit these two operations separately. Before modifying the global switch, call GetDataStorage and use the returned ConfigurationVersion and TargetProject values. Do not copy the fixed version and account from the examples. The current V2 version does not support the legacy DeliveryStatus global switch. After the update, call GetDataStorage again to obtain the latest configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the log storage region in log management.</p>
     * 
     * @param request UpdateDataStorageRequest
     * @return UpdateDataStorageResponse
     */
    public UpdateDataStorageResponse updateDataStorage(UpdateDataStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataStorageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the Cloud Security Center (Cloud SIEM) data storage service is activated for your account and the data storage order has not expired. You can call the GetDataStorage operation to check the status of the data storage order.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the log delivery status.</p>
     * 
     * @param tmpReq UpdateDataStorageDeliveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataStorageDeliveryResponse
     */
    public UpdateDataStorageDeliveryResponse updateDataStorageDeliveryWithOptions(UpdateDataStorageDeliveryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataStorageDeliveryShrinkRequest request = new UpdateDataStorageDeliveryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.selectedAccountIds)) {
            request.selectedAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.selectedAccountIds, "SelectedAccountIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoIncludeNewAccounts)) {
            body.put("AutoIncludeNewAccounts", request.autoIncludeNewAccounts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationVersion)) {
            body.put("ConfigurationVersion", request.configurationVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logCode)) {
            body.put("LogCode", request.logCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logDeliveryStatus)) {
            body.put("LogDeliveryStatus", request.logDeliveryStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectedAccountIdsShrink)) {
            body.put("SelectedAccountIds", request.selectedAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            body.put("SubUserId", request.subUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetProject)) {
            body.put("TargetProject", request.targetProject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataStorageDelivery"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataStorageDeliveryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the Cloud Security Center (Cloud SIEM) data storage service is activated for your account and the data storage order has not expired. You can call the GetDataStorage operation to check the status of the data storage order.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the log delivery status.</p>
     * 
     * @param request UpdateDataStorageDeliveryRequest
     * @return UpdateDataStorageDeliveryResponse
     */
    public UpdateDataStorageDeliveryResponse updateDataStorageDelivery(UpdateDataStorageDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataStorageDeliveryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the storage duration of logs.</p>
     * 
     * @param request UpdateDataStorageTtlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataStorageTtlResponse
     */
    public UpdateDataStorageTtlResponse updateDataStorageTtlWithOptions(UpdateDataStorageTtlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreColdTtl)) {
            body.put("LogStoreColdTtl", request.logStoreColdTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreHotTtl)) {
            body.put("LogStoreHotTtl", request.logStoreHotTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreTtl)) {
            body.put("LogStoreTtl", request.logStoreTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataStorageTtl"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataStorageTtlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the storage duration of logs.</p>
     * 
     * @param request UpdateDataStorageTtlRequest
     * @return UpdateDataStorageTtlResponse
     */
    public UpdateDataStorageTtlResponse updateDataStorageTtl(UpdateDataStorageTtlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataStorageTtlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. For more information, refer to the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a detection rule.</p>
     * 
     * @param request UpdateDetectionRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDetectionRuleResponse
     */
    public UpdateDetectionRuleResponse updateDetectionRuleWithOptions(UpdateDetectionRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertAttCk)) {
            body.put("AlertAttCk", request.alertAttCk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertAttCkMapping)) {
            body.put("AlertAttCkMapping", request.alertAttCkMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertDescription)) {
            body.put("AlertDescription", request.alertDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertLevel)) {
            body.put("AlertLevel", request.alertLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertLevelMapping)) {
            body.put("AlertLevelMapping", request.alertLevelMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertName)) {
            body.put("AlertName", request.alertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertSchemaId)) {
            body.put("AlertSchemaId", request.alertSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertTacticId)) {
            body.put("AlertTacticId", request.alertTacticId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertThresholdCount)) {
            body.put("AlertThresholdCount", request.alertThresholdCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertThresholdGroup)) {
            body.put("AlertThresholdGroup", request.alertThresholdGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertThresholdPeriod)) {
            body.put("AlertThresholdPeriod", request.alertThresholdPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            body.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertTypeMapping)) {
            body.put("AlertTypeMapping", request.alertTypeMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionExpressionContent)) {
            body.put("DetectionExpressionContent", request.detectionExpressionContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionExpressionType)) {
            body.put("DetectionExpressionType", request.detectionExpressionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleDescription)) {
            body.put("DetectionRuleDescription", request.detectionRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleId)) {
            body.put("DetectionRuleId", request.detectionRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleName)) {
            body.put("DetectionRuleName", request.detectionRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleStatus)) {
            body.put("DetectionRuleStatus", request.detectionRuleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleType)) {
            body.put("DetectionRuleType", request.detectionRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityMappings)) {
            body.put("EntityMappings", request.entityMappings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentAggregationExpression)) {
            body.put("IncidentAggregationExpression", request.incidentAggregationExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentAggregationType)) {
            body.put("IncidentAggregationType", request.incidentAggregationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logCategoryId)) {
            body.put("LogCategoryId", request.logCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSchemaId)) {
            body.put("LogSchemaId", request.logSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookParameters)) {
            body.put("PlaybookParameters", request.playbookParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleBeginTime)) {
            body.put("ScheduleBeginTime", request.scheduleBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleExpression)) {
            body.put("ScheduleExpression", request.scheduleExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleMaxRetries)) {
            body.put("ScheduleMaxRetries", request.scheduleMaxRetries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleMaxTimeout)) {
            body.put("ScheduleMaxTimeout", request.scheduleMaxTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleWindow)) {
            body.put("ScheduleWindow", request.scheduleWindow);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDetectionRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDetectionRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. For more information, refer to the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a detection rule.</p>
     * 
     * @param request UpdateDetectionRuleRequest
     * @return UpdateDetectionRuleResponse
     */
    public UpdateDetectionRuleResponse updateDetectionRule(UpdateDetectionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDetectionRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter contains complex JSON configurations. We provide a utility class to help with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a normalization rule.</p>
     * 
     * @param tmpReq UpdateNormalizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNormalizationRuleResponse
     */
    public UpdateNormalizationRuleResponse updateNormalizationRuleWithOptions(UpdateNormalizationRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateNormalizationRuleShrinkRequest request = new UpdateNormalizationRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.normalizationRuleIds)) {
            request.normalizationRuleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.normalizationRuleIds, "NormalizationRuleIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extendContentPacked)) {
            body.put("ExtendContentPacked", request.extendContentPacked);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendFieldStoreMode)) {
            body.put("ExtendFieldStoreMode", request.extendFieldStoreMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationCategoryId)) {
            body.put("NormalizationCategoryId", request.normalizationCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleDescription)) {
            body.put("NormalizationRuleDescription", request.normalizationRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleExpression)) {
            body.put("NormalizationRuleExpression", request.normalizationRuleExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleFormat)) {
            body.put("NormalizationRuleFormat", request.normalizationRuleFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleId)) {
            body.put("NormalizationRuleId", request.normalizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleIdsShrink)) {
            body.put("NormalizationRuleIds", request.normalizationRuleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleMode)) {
            body.put("NormalizationRuleMode", request.normalizationRuleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleName)) {
            body.put("NormalizationRuleName", request.normalizationRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleType)) {
            body.put("NormalizationRuleType", request.normalizationRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSecurityDomainId)) {
            body.put("NormalizationSecurityDomainId", request.normalizationSecurityDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorId)) {
            body.put("VendorId", request.vendorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNormalizationRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNormalizationRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter contains complex JSON configurations. We provide a utility class to help with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a normalization rule.</p>
     * 
     * @param request UpdateNormalizationRuleRequest
     * @return UpdateNormalizationRuleResponse
     */
    public UpdateNormalizationRuleResponse updateNormalizationRule(UpdateNormalizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNormalizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a normalization schema.</p>
     * 
     * @param request UpdateNormalizationSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNormalizationSchemaResponse
     */
    public UpdateNormalizationSchemaResponse updateNormalizationSchemaWithOptions(UpdateNormalizationSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationFields)) {
            body.put("NormalizationFields", request.normalizationFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaDescription)) {
            body.put("NormalizationSchemaDescription", request.normalizationSchemaDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaName)) {
            body.put("NormalizationSchemaName", request.normalizationSchemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaType)) {
            body.put("NormalizationSchemaType", request.normalizationSchemaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNormalizationSchema"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNormalizationSchemaResponse());
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a normalization schema.</p>
     * 
     * @param request UpdateNormalizationSchemaRequest
     * @return UpdateNormalizationSchemaResponse
     */
    public UpdateNormalizationSchemaResponse updateNormalizationSchema(UpdateNormalizationSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNormalizationSchemaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新产品品</p>
     * 
     * @param request UpdateProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProductResponse
     */
    public UpdateProductResponse updateProductWithOptions(UpdateProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorName)) {
            body.put("VendorName", request.vendorName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProduct"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新产品品</p>
     * 
     * @param request UpdateProductRequest
     * @return UpdateProductResponse
     */
    public UpdateProductResponse updateProduct(UpdateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProductWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. We provide a utility class to help you with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an automated response rule.</p>
     * 
     * @param request UpdateResponseRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResponseRuleResponse
     */
    public UpdateResponseRuleResponse updateResponseRuleWithOptions(UpdateResponseRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseActionConfig)) {
            body.put("ResponseActionConfig", request.responseActionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseActionType)) {
            body.put("ResponseActionType", request.responseActionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseExecutionCondition)) {
            body.put("ResponseExecutionCondition", request.responseExecutionCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRuleId)) {
            body.put("ResponseRuleId", request.responseRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRuleName)) {
            body.put("ResponseRuleName", request.responseRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRulePriority)) {
            body.put("ResponseRulePriority", request.responseRulePriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRuleRemark)) {
            body.put("ResponseRuleRemark", request.responseRuleRemark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRuleStatus)) {
            body.put("ResponseRuleStatus", request.responseRuleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseTriggerType)) {
            body.put("ResponseTriggerType", request.responseTriggerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResponseRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResponseRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. We provide a utility class to help you with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an automated response rule.</p>
     * 
     * @param request UpdateResponseRuleRequest
     * @return UpdateResponseRuleResponse
     */
    public UpdateResponseRuleResponse updateResponseRule(UpdateResponseRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResponseRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新厂商</p>
     * 
     * @param request UpdateVendorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVendorResponse
     */
    public UpdateVendorResponse updateVendorWithOptions(UpdateVendorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorId)) {
            body.put("VendorId", request.vendorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorName)) {
            body.put("VendorName", request.vendorName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVendor"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVendorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新厂商</p>
     * 
     * @param request UpdateVendorRequest
     * @return UpdateVendorResponse
     */
    public UpdateVendorResponse updateVendor(UpdateVendorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVendorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. To simplify this, we provide a utility class to assist with specific configuration examples. For more information, refer to the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Validates the log storage.</p>
     * 
     * @param request ValidateLogStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateLogStoreResponse
     */
    public ValidateLogStoreResponse validateLogStoreWithOptions(ValidateLogStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProjectName)) {
            body.put("LogProjectName", request.logProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            body.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateLogStore"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateLogStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. To simplify this, we provide a utility class to assist with specific configuration examples. For more information, refer to the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Validates the log storage.</p>
     * 
     * @param request ValidateLogStoreRequest
     * @return ValidateLogStoreResponse
     */
    public ValidateLogStoreResponse validateLogStore(ValidateLogStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateLogStoreWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class to assist with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Validates normalization rules.</p>
     * 
     * @param request ValidateNormalizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateNormalizationRuleResponse
     */
    public ValidateNormalizationRuleResponse validateNormalizationRuleWithOptions(ValidateNormalizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendFieldStoreMode)) {
            body.put("ExtendFieldStoreMode", request.extendFieldStoreMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSample)) {
            body.put("LogSample", request.logSample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationCategoryId)) {
            body.put("NormalizationCategoryId", request.normalizationCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleExpression)) {
            body.put("NormalizationRuleExpression", request.normalizationRuleExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationRuleMode)) {
            body.put("NormalizationRuleMode", request.normalizationRuleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.normalizationSchemaId)) {
            body.put("NormalizationSchemaId", request.normalizationSchemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorId)) {
            body.put("VendorId", request.vendorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateNormalizationRule"),
            new TeaPair("version", "2024-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateNormalizationRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class to assist with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Validates normalization rules.</p>
     * 
     * @param request ValidateNormalizationRuleRequest
     * @return ValidateNormalizationRuleResponse
     */
    public ValidateNormalizationRuleResponse validateNormalizationRule(ValidateNormalizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateNormalizationRuleWithOptions(request, runtime);
    }
}
