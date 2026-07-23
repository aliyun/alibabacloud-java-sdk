// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401;

import com.aliyun.tea.*;
import com.aliyun.eventbridge20200401.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("us-west-1", "eventbridge-console.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "eventbridge-console.us-east-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "eventbridge-console.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "eventbridge-console.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "eventbridge-console.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "eventbridge-console.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "eventbridge-console.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "eventbridge-console.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "eventbridge-console.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shanghai", "eventbridge-console.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-qingdao", "eventbridge-console.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "eventbridge-console.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-hongkong", "eventbridge-console.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-heyuan", "eventbridge-console.cn-heyuan.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "eventbridge-console.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "eventbridge-console.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "eventbridge-console.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "eventbridge-console.cn-beijing-finance-1.aliyuncs.com"),
            new TeaPair("cn-beijing", "eventbridge-console.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "eventbridge-console.ap-southeast-7.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "eventbridge-console.ap-southeast-6.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "eventbridge-console.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "eventbridge-console.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "eventbridge-console.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "eventbridge-console.ap-northeast-2.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "eventbridge-console.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eventbridge", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Queries data using natural language.</p>
     * 
     * @param request AskLumaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AskLumaResponse
     */
    public AskLumaResponse askLumaWithOptions(AskLumaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            body.put("AgentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRows)) {
            body.put("MaxRows", request.maxRows);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.question)) {
            body.put("Question", request.question);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AskLuma"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AskLumaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries data using natural language.</p>
     * 
     * @param request AskLumaRequest
     * @return AskLumaResponse
     */
    public AskLumaResponse askLuma(AskLumaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.askLumaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Checks for a service-linked role by name.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether a service-linked role is authorized for an account.</p>
     * 
     * @param request CheckServiceLinkedRoleForProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckServiceLinkedRoleForProductResponse
     */
    public CheckServiceLinkedRoleForProductResponse checkServiceLinkedRoleForProductWithOptions(CheckServiceLinkedRoleForProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            query.put("ProductName", request.productName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckServiceLinkedRoleForProduct"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckServiceLinkedRoleForProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Checks for a service-linked role by name.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether a service-linked role is authorized for an account.</p>
     * 
     * @param request CheckServiceLinkedRoleForProductRequest
     * @return CheckServiceLinkedRoleForProductResponse
     */
    public CheckServiceLinkedRoleForProductResponse checkServiceLinkedRoleForProduct(CheckServiceLinkedRoleForProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkServiceLinkedRoleForProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom agent.</p>
     * 
     * @param tmpReq CreateAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentResponse
     */
    public CreateAgentResponse createAgentWithOptions(CreateAgentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAgentShrinkRequest request = new CreateAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.metadata)) {
            request.metadataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.metadata, "Metadata", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadataShrink)) {
            body.put("Metadata", request.metadataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("Prompt", request.prompt);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgent"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom agent.</p>
     * 
     * @param request CreateAgentRequest
     * @return CreateAgentResponse
     */
    public CreateAgentResponse createAgent(CreateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to create an API destination.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an API destination.</p>
     * 
     * @param tmpReq CreateApiDestinationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApiDestinationResponse
     */
    public CreateApiDestinationResponse createApiDestinationWithOptions(CreateApiDestinationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateApiDestinationShrinkRequest request = new CreateApiDestinationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.httpApiParameters)) {
            request.httpApiParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.httpApiParameters, "HttpApiParameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiDestinationName)) {
            query.put("ApiDestinationName", request.apiDestinationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionName)) {
            query.put("ConnectionName", request.connectionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpApiParametersShrink)) {
            query.put("HttpApiParameters", request.httpApiParametersShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApiDestination"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApiDestinationResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to create an API destination.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an API destination.</p>
     * 
     * @param request CreateApiDestinationRequest
     * @return CreateApiDestinationResponse
     */
    public CreateApiDestinationResponse createApiDestination(CreateApiDestinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApiDestinationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a connection configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a connection configuration.</p>
     * 
     * @param tmpReq CreateConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConnectionResponse
     */
    public CreateConnectionResponse createConnectionWithOptions(CreateConnectionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateConnectionShrinkRequest request = new CreateConnectionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.authParameters)) {
            request.authParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.authParameters, "AuthParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.networkParameters)) {
            request.networkParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.networkParameters, "NetworkParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authParametersShrink)) {
            query.put("AuthParameters", request.authParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionName)) {
            query.put("ConnectionName", request.connectionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkParametersShrink)) {
            query.put("NetworkParameters", request.networkParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConnection"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a connection configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a connection configuration.</p>
     * 
     * @param request CreateConnectionRequest
     * @return CreateConnectionResponse
     */
    public CreateConnectionResponse createConnection(CreateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates an event bus.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an event bus.</p>
     * 
     * @param request CreateEventBusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEventBusResponse
     */
    public CreateEventBusResponse createEventBusWithOptions(CreateEventBusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEventBus"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEventBusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates an event bus.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an event bus.</p>
     * 
     * @param request CreateEventBusRequest
     * @return CreateEventBusResponse
     */
    public CreateEventBusResponse createEventBus(CreateEventBusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEventBusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates an external event source.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an external event source.</p>
     * 
     * @param tmpReq CreateEventSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEventSourceResponse
     */
    public CreateEventSourceResponse createEventSourceWithOptions(CreateEventSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEventSourceShrinkRequest request = new CreateEventSourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.externalSourceConfig)) {
            request.externalSourceConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.externalSourceConfig, "ExternalSourceConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceHttpEventParameters)) {
            request.sourceHttpEventParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceHttpEventParameters, "SourceHttpEventParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceKafkaParameters)) {
            request.sourceKafkaParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceKafkaParameters, "SourceKafkaParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceMNSParameters)) {
            request.sourceMNSParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceMNSParameters, "SourceMNSParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceOSSEventParameters)) {
            request.sourceOSSEventParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceOSSEventParameters, "SourceOSSEventParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceRabbitMQParameters)) {
            request.sourceRabbitMQParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceRabbitMQParameters, "SourceRabbitMQParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceRocketMQParameters)) {
            request.sourceRocketMQParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceRocketMQParameters, "SourceRocketMQParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceSLSParameters)) {
            request.sourceSLSParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceSLSParameters, "SourceSLSParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceScheduledEventParameters)) {
            request.sourceScheduledEventParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceScheduledEventParameters, "SourceScheduledEventParameters", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            body.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventSourceName)) {
            body.put("EventSourceName", request.eventSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalSourceConfigShrink)) {
            body.put("ExternalSourceConfig", request.externalSourceConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalSourceType)) {
            body.put("ExternalSourceType", request.externalSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.linkedExternalSource)) {
            body.put("LinkedExternalSource", request.linkedExternalSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceHttpEventParametersShrink)) {
            body.put("SourceHttpEventParameters", request.sourceHttpEventParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceKafkaParametersShrink)) {
            body.put("SourceKafkaParameters", request.sourceKafkaParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceMNSParametersShrink)) {
            body.put("SourceMNSParameters", request.sourceMNSParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOSSEventParametersShrink)) {
            body.put("SourceOSSEventParameters", request.sourceOSSEventParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRabbitMQParametersShrink)) {
            body.put("SourceRabbitMQParameters", request.sourceRabbitMQParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRocketMQParametersShrink)) {
            body.put("SourceRocketMQParameters", request.sourceRocketMQParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceSLSParametersShrink)) {
            body.put("SourceSLSParameters", request.sourceSLSParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceScheduledEventParametersShrink)) {
            body.put("SourceScheduledEventParameters", request.sourceScheduledEventParametersShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEventSource"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEventSourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates an external event source.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an external event source.</p>
     * 
     * @param request CreateEventSourceRequest
     * @return CreateEventSourceResponse
     */
    public CreateEventSourceResponse createEventSource(CreateEventSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEventSourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates an event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an event stream.</p>
     * 
     * @param tmpReq CreateEventStreamingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEventStreamingResponse
     */
    public CreateEventStreamingResponse createEventStreamingWithOptions(CreateEventStreamingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEventStreamingShrinkRequest request = new CreateEventStreamingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.runOptions)) {
            request.runOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.runOptions, "RunOptions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sink)) {
            request.sinkShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sink, "Sink", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.source)) {
            request.sourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.source, "Source", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transforms)) {
            request.transformsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transforms, "Transforms", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventStreamingName)) {
            body.put("EventStreamingName", request.eventStreamingName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterPattern)) {
            body.put("FilterPattern", request.filterPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadata)) {
            body.put("Metadata", request.metadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runOptionsShrink)) {
            body.put("RunOptions", request.runOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sinkShrink)) {
            body.put("Sink", request.sinkShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceShrink)) {
            body.put("Source", request.sourceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transformsShrink)) {
            body.put("Transforms", request.transformsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEventStreaming"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEventStreamingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates an event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an event stream.</p>
     * 
     * @param request CreateEventStreamingRequest
     * @return CreateEventStreamingResponse
     */
    public CreateEventStreamingResponse createEventStreaming(CreateEventStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEventStreamingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Namespace</p>
     * 
     * @param request CreateNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespaceWithOptions(CreateNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalog)) {
            query.put("Catalog", request.catalog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNamespace"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Namespace</p>
     * 
     * @param request CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an event rule.</p>
     * 
     * @param tmpReq CreateRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRuleShrinkRequest request = new CreateRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventTargets)) {
            request.eventTargetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventTargets, "EventTargets", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTargetsShrink)) {
            query.put("EventTargets", request.eventTargetsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterPattern)) {
            query.put("FilterPattern", request.filterPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRule"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an event rule.</p>
     * 
     * @param request CreateRuleRequest
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates the service-linked role (SLR) that is associated with a specified product.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates the service-linked role (SLR) that is associated with a specified product.</p>
     * 
     * @param request CreateServiceLinkedRoleForProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceLinkedRoleForProductResponse
     */
    public CreateServiceLinkedRoleForProductResponse createServiceLinkedRoleForProductWithOptions(CreateServiceLinkedRoleForProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            query.put("ProductName", request.productName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceLinkedRoleForProduct"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceLinkedRoleForProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates the service-linked role (SLR) that is associated with a specified product.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates the service-linked role (SLR) that is associated with a specified product.</p>
     * 
     * @param request CreateServiceLinkedRoleForProductRequest
     * @return CreateServiceLinkedRoleForProductResponse
     */
    public CreateServiceLinkedRoleForProductResponse createServiceLinkedRoleForProduct(CreateServiceLinkedRoleForProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceLinkedRoleForProductWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates an event target under the specified rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a data catalog</p>
     * 
     * @param tmpReq CreateTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTableResponse
     */
    public CreateTableResponse createTableWithOptions(CreateTableRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTableShrinkRequest request = new CreateTableShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columns)) {
            request.columnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columns, "Columns", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.retentionPolicy)) {
            request.retentionPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.retentionPolicy, "RetentionPolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalog)) {
            query.put("Catalog", request.catalog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnsShrink)) {
            query.put("Columns", request.columnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionPolicyShrink)) {
            query.put("RetentionPolicy", request.retentionPolicyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTable"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTableResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates an event target under the specified rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a data catalog</p>
     * 
     * @param request CreateTableRequest
     * @return CreateTableResponse
     */
    public CreateTableResponse createTable(CreateTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom agent.</p>
     * 
     * @param request DeleteAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgentWithOptions(DeleteAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgent"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom agent.</p>
     * 
     * @param request DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgent(DeleteAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete an API destination.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an API destination.</p>
     * 
     * @param request DeleteApiDestinationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApiDestinationResponse
     */
    public DeleteApiDestinationResponse deleteApiDestinationWithOptions(DeleteApiDestinationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiDestinationName)) {
            query.put("ApiDestinationName", request.apiDestinationName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApiDestination"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApiDestinationResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete an API destination.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an API destination.</p>
     * 
     * @param request DeleteApiDestinationRequest
     * @return DeleteApiDestinationResponse
     */
    public DeleteApiDestinationResponse deleteApiDestination(DeleteApiDestinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApiDestinationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete a connection.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a connection.</p>
     * 
     * @param request DeleteConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConnectionResponse
     */
    public DeleteConnectionResponse deleteConnectionWithOptions(DeleteConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionName)) {
            query.put("ConnectionName", request.connectionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConnection"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete a connection.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a connection.</p>
     * 
     * @param request DeleteConnectionRequest
     * @return DeleteConnectionResponse
     */
    public DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data integration job.</p>
     * 
     * @param tmpReq DeleteEventAnalysisJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEventAnalysisJobResponse
     */
    public DeleteEventAnalysisJobResponse deleteEventAnalysisJobWithOptions(DeleteEventAnalysisJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteEventAnalysisJobShrinkRequest request = new DeleteEventAnalysisJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceResource)) {
            request.sourceResourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceResource, "SourceResource", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceResourceShrink)) {
            body.put("SourceResource", request.sourceResourceShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEventAnalysisJob"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventAnalysisJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data integration job.</p>
     * 
     * @param request DeleteEventAnalysisJobRequest
     * @return DeleteEventAnalysisJobResponse
     */
    public DeleteEventAnalysisJobResponse deleteEventAnalysisJob(DeleteEventAnalysisJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventAnalysisJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes an event bus.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an event bus.</p>
     * 
     * @param request DeleteEventBusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEventBusResponse
     */
    public DeleteEventBusResponse deleteEventBusWithOptions(DeleteEventBusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEventBus"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventBusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes an event bus.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an event bus.</p>
     * 
     * @param request DeleteEventBusRequest
     * @return DeleteEventBusResponse
     */
    public DeleteEventBusResponse deleteEventBus(DeleteEventBusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventBusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an EventHouse Runtime.</p>
     * 
     * @param request DeleteEventHouseRuntimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEventHouseRuntimeResponse
     */
    public DeleteEventHouseRuntimeResponse deleteEventHouseRuntimeWithOptions(DeleteEventHouseRuntimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEventHouseRuntime"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventHouseRuntimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an EventHouse Runtime.</p>
     * 
     * @param request DeleteEventHouseRuntimeRequest
     * @return DeleteEventHouseRuntimeResponse
     */
    public DeleteEventHouseRuntimeResponse deleteEventHouseRuntime(DeleteEventHouseRuntimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventHouseRuntimeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes an event source.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an event source.</p>
     * 
     * @param request DeleteEventSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEventSourceResponse
     */
    public DeleteEventSourceResponse deleteEventSourceWithOptions(DeleteEventSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            body.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventSourceName)) {
            body.put("EventSourceName", request.eventSourceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEventSource"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventSourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes an event source.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an event source.</p>
     * 
     * @param request DeleteEventSourceRequest
     * @return DeleteEventSourceResponse
     */
    public DeleteEventSourceResponse deleteEventSource(DeleteEventSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventSourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes an event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an event stream.</p>
     * 
     * @param request DeleteEventStreamingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEventStreamingResponse
     */
    public DeleteEventStreamingResponse deleteEventStreamingWithOptions(DeleteEventStreamingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventStreamingName)) {
            body.put("EventStreamingName", request.eventStreamingName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEventStreaming"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventStreamingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes an event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an event stream.</p>
     * 
     * @param request DeleteEventStreamingRequest
     * @return DeleteEventStreamingResponse
     */
    public DeleteEventStreamingResponse deleteEventStreaming(DeleteEventStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventStreamingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Namespace</p>
     * 
     * @param request DeleteNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNamespaceResponse
     */
    public DeleteNamespaceResponse deleteNamespaceWithOptions(DeleteNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalog)) {
            query.put("Catalog", request.catalog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNamespace"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Namespace</p>
     * 
     * @param request DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    public DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an event rule.</p>
     * 
     * @param request DeleteRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRule"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an event rule.</p>
     * 
     * @param request DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete table</p>
     * 
     * @param request DeleteTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTableResponse
     */
    public DeleteTableResponse deleteTableWithOptions(DeleteTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalog)) {
            query.put("Catalog", request.catalog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTable"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete table</p>
     * 
     * @param request DeleteTableRequest
     * @return DeleteTableResponse
     */
    public DeleteTableResponse deleteTable(DeleteTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTableWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete one or more event targets of an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more event targets of an event rule.</p>
     * 
     * @param tmpReq DeleteTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTargetsResponse
     */
    public DeleteTargetsResponse deleteTargetsWithOptions(DeleteTargetsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteTargetsShrinkRequest request = new DeleteTargetsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.targetIds)) {
            request.targetIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.targetIds, "TargetIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetIdsShrink)) {
            query.put("TargetIds", request.targetIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTargets"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTargetsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete one or more event targets of an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more event targets of an event rule.</p>
     * 
     * @param request DeleteTargetsRequest
     * @return DeleteTargetsResponse
     */
    public DeleteTargetsResponse deleteTargets(DeleteTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTargetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to disable an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an event rule.</p>
     * 
     * @param request DisableRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableRuleResponse
     */
    public DisableRuleResponse disableRuleWithOptions(DisableRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableRule"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to disable an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an event rule.</p>
     * 
     * @param request DisableRuleRequest
     * @return DisableRuleResponse
     */
    public DisableRuleResponse disableRule(DisableRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Discovers information about an event source.</p>
     * 
     * <b>summary</b> : 
     * <p>Discovers the schema and simple data of an event source, such as MySQL.</p>
     * 
     * @param tmpReq DiscoverEventSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DiscoverEventSourceResponse
     */
    public DiscoverEventSourceResponse discoverEventSourceWithOptions(DiscoverEventSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DiscoverEventSourceShrinkRequest request = new DiscoverEventSourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceMySQLParameters)) {
            request.sourceMySQLParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceMySQLParameters, "SourceMySQLParameters", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceMySQLParametersShrink)) {
            body.put("SourceMySQLParameters", request.sourceMySQLParametersShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DiscoverEventSource"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DiscoverEventSourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Discovers information about an event source.</p>
     * 
     * <b>summary</b> : 
     * <p>Discovers the schema and simple data of an event source, such as MySQL.</p>
     * 
     * @param request DiscoverEventSourceRequest
     * @return DiscoverEventSourceResponse
     */
    public DiscoverEventSourceResponse discoverEventSource(DiscoverEventSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.discoverEventSourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to enable an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables an event rule.</p>
     * 
     * @param request EnableRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableRuleResponse
     */
    public EnableRuleResponse enableRuleWithOptions(EnableRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableRule"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to enable an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables an event rule.</p>
     * 
     * @param request EnableRuleRequest
     * @return EnableRuleResponse
     */
    public EnableRuleResponse enableRule(EnableRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries events from the event center.</p>
     * 
     * @param tmpReq EventCenterQueryEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EventCenterQueryEventsResponse
     */
    public EventCenterQueryEventsResponse eventCenterQueryEventsWithOptions(EventCenterQueryEventsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EventCenterQueryEventsShrinkRequest request = new EventCenterQueryEventsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "Body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.busName)) {
            query.put("BusName", request.busName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("Body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EventCenterQueryEvents"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EventCenterQueryEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries events from the event center.</p>
     * 
     * @param request EventCenterQueryEventsRequest
     * @return EventCenterQueryEventsResponse
     */
    public EventCenterQueryEventsResponse eventCenterQueryEvents(EventCenterQueryEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.eventCenterQueryEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves agent metadata.</p>
     * 
     * @param request GetAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgentWithOptions(GetAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgent"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves agent metadata.</p>
     * 
     * @param request GetAgentRequest
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgent(GetAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the information about an API destination.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an API destination.</p>
     * 
     * @param request GetApiDestinationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApiDestinationResponse
     */
    public GetApiDestinationResponse getApiDestinationWithOptions(GetApiDestinationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiDestinationName)) {
            query.put("ApiDestinationName", request.apiDestinationName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApiDestination"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApiDestinationResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the information about an API destination.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an API destination.</p>
     * 
     * @param request GetApiDestinationRequest
     * @return GetApiDestinationResponse
     */
    public GetApiDestinationResponse getApiDestination(GetApiDestinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApiDestinationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get data catalog</p>
     * 
     * @param request GetCatalogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCatalogResponse
     */
    public GetCatalogResponse getCatalogWithOptions(GetCatalogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCatalog"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get data catalog</p>
     * 
     * @param request GetCatalogRequest
     * @return GetCatalogResponse
     */
    public GetCatalogResponse getCatalog(GetCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCatalogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the configuration information of a single connection.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration information of a single connection.</p>
     * 
     * @param request GetConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConnectionResponse
     */
    public GetConnectionResponse getConnectionWithOptions(GetConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionName)) {
            query.put("ConnectionName", request.connectionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConnection"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the configuration information of a single connection.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration information of a single connection.</p>
     * 
     * @param request GetConnectionRequest
     * @return GetConnectionResponse
     */
    public GetConnectionResponse getConnection(GetConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the detailed information about an event bus.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed information about an event bus.</p>
     * 
     * @param request GetEventBusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEventBusResponse
     */
    public GetEventBusResponse getEventBusWithOptions(GetEventBusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEventBus"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEventBusResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the detailed information about an event bus.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed information about an event bus.</p>
     * 
     * @param request GetEventBusRequest
     * @return GetEventBusResponse
     */
    public GetEventBusResponse getEventBus(GetEventBusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEventBusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status and operation progress of an EventHouse Runtime.</p>
     * 
     * @param request GetEventHouseRuntimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEventHouseRuntimeResponse
     */
    public GetEventHouseRuntimeResponse getEventHouseRuntimeWithOptions(GetEventHouseRuntimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEventHouseRuntime"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEventHouseRuntimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status and operation progress of an EventHouse Runtime.</p>
     * 
     * @param request GetEventHouseRuntimeRequest
     * @return GetEventHouseRuntimeResponse
     */
    public GetEventHouseRuntimeResponse getEventHouseRuntime(GetEventHouseRuntimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEventHouseRuntimeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of an event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of an event stream.</p>
     * 
     * @param request GetEventStreamingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEventStreamingResponse
     */
    public GetEventStreamingResponse getEventStreamingWithOptions(GetEventStreamingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventStreamingName)) {
            body.put("EventStreamingName", request.eventStreamingName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEventStreaming"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEventStreamingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of an event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of an event stream.</p>
     * 
     * @param request GetEventStreamingRequest
     * @return GetEventStreamingResponse
     */
    public GetEventStreamingResponse getEventStreaming(GetEventStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEventStreamingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get namespace</p>
     * 
     * @param request GetNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNamespaceResponse
     */
    public GetNamespaceResponse getNamespaceWithOptions(GetNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalog)) {
            query.put("Catalog", request.catalog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNamespace"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get namespace</p>
     * 
     * @param request GetNamespaceRequest
     * @return GetNamespaceResponse
     */
    public GetNamespaceResponse getNamespace(GetNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Gets the details of an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of an event rule.</p>
     * 
     * @param request GetRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRuleResponse
     */
    public GetRuleResponse getRuleWithOptions(GetRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRule"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Gets the details of an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of an event rule.</p>
     * 
     * @param request GetRuleRequest
     * @return GetRuleResponse
     */
    public GetRuleResponse getRule(GetRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Table</p>
     * 
     * @param request GetTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableResponse
     */
    public GetTableResponse getTableWithOptions(GetTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalog)) {
            query.put("Catalog", request.catalog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTable"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Table</p>
     * 
     * @param request GetTableRequest
     * @return GetTableResponse
     */
    public GetTableResponse getTable(GetTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of custom agents.</p>
     * 
     * @param request ListAgentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentsResponse
     */
    public ListAgentsResponse listAgentsWithOptions(ListAgentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.after)) {
            body.put("After", request.after);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgents"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of custom agents.</p>
     * 
     * @param request ListAgentsRequest
     * @return ListAgentsResponse
     */
    public ListAgentsResponse listAgents(ListAgentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query all Alibaba Cloud service event sources.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all Alibaba Cloud service event sources.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAliyunOfficialEventSourcesResponse
     */
    public ListAliyunOfficialEventSourcesResponse listAliyunOfficialEventSourcesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAliyunOfficialEventSources"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAliyunOfficialEventSourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query all Alibaba Cloud service event sources.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all Alibaba Cloud service event sources.</p>
     * @return ListAliyunOfficialEventSourcesResponse
     */
    public ListAliyunOfficialEventSourcesResponse listAliyunOfficialEventSources() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAliyunOfficialEventSourcesWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use this API operation to query a list of API destinations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of API destinations.</p>
     * 
     * @param request ListApiDestinationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApiDestinationsResponse
     */
    public ListApiDestinationsResponse listApiDestinationsWithOptions(ListApiDestinationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiDestinationNamePrefix)) {
            query.put("ApiDestinationNamePrefix", request.apiDestinationNamePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionName)) {
            query.put("ConnectionName", request.connectionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApiDestinations"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApiDestinationsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use this API operation to query a list of API destinations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of API destinations.</p>
     * 
     * @param request ListApiDestinationsRequest
     * @return ListApiDestinationsResponse
     */
    public ListApiDestinationsResponse listApiDestinations(ListApiDestinationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApiDestinationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query data catalog list</p>
     * 
     * @param request ListCatalogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCatalogsResponse
     */
    public ListCatalogsResponse listCatalogsWithOptions(ListCatalogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCatalogs"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCatalogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query data catalog list</p>
     * 
     * @param request ListCatalogsRequest
     * @return ListCatalogsResponse
     */
    public ListCatalogsResponse listCatalogs(ListCatalogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCatalogsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of connection configurations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of connection configurations.</p>
     * 
     * @param request ListConnectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConnectionsResponse
     */
    public ListConnectionsResponse listConnectionsWithOptions(ListConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionNamePrefix)) {
            body.put("ConnectionNamePrefix", request.connectionNamePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConnections"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConnectionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of connection configurations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of connection configurations.</p>
     * 
     * @param request ListConnectionsRequest
     * @return ListConnectionsResponse
     */
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConnectionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query all event buses.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all event buses.</p>
     * 
     * @param request ListEventBusesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEventBusesResponse
     */
    public ListEventBusesResponse listEventBusesWithOptions(ListEventBusesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namePrefix)) {
            query.put("NamePrefix", request.namePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEventBuses"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventBusesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query all event buses.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all event buses.</p>
     * 
     * @param request ListEventBusesRequest
     * @return ListEventBusesResponse
     */
    public ListEventBusesResponse listEventBuses(ListEventBusesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEventBusesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of EventHouse runtimes.</p>
     * 
     * @param request ListEventHouseRuntimesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEventHouseRuntimesResponse
     */
    public ListEventHouseRuntimesResponse listEventHouseRuntimesWithOptions(ListEventHouseRuntimesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEventHouseRuntimes"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventHouseRuntimesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of EventHouse runtimes.</p>
     * 
     * @param request ListEventHouseRuntimesRequest
     * @return ListEventHouseRuntimesResponse
     */
    public ListEventHouseRuntimesResponse listEventHouseRuntimes(ListEventHouseRuntimesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEventHouseRuntimesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries event streams.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries event streams.</p>
     * 
     * @param request ListEventStreamingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEventStreamingsResponse
     */
    public ListEventStreamingsResponse listEventStreamingsWithOptions(ListEventStreamingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namePrefix)) {
            body.put("NamePrefix", request.namePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sinkArn)) {
            body.put("SinkArn", request.sinkArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceArn)) {
            body.put("SourceArn", request.sourceArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEventStreamings"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventStreamingsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries event streams.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries event streams.</p>
     * 
     * @param request ListEventStreamingsRequest
     * @return ListEventStreamingsResponse
     */
    public ListEventStreamingsResponse listEventStreamings(ListEventStreamingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEventStreamingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query namespace list</p>
     * 
     * @param request ListNamespacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNamespacesResponse
     */
    public ListNamespacesResponse listNamespacesWithOptions(ListNamespacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalog)) {
            query.put("Catalog", request.catalog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNamespaces"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNamespacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query namespace list</p>
     * 
     * @param request ListNamespacesRequest
     * @return ListNamespacesResponse
     */
    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNamespacesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query all rules of an event bus.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all rules of an event bus.</p>
     * 
     * @param request ListRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRulesResponse
     */
    public ListRulesResponse listRulesWithOptions(ListRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleNamePrefix)) {
            query.put("RuleNamePrefix", request.ruleNamePrefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRules"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query all rules of an event bus.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all rules of an event bus.</p>
     * 
     * @param request ListRulesRequest
     * @return ListRulesResponse
     */
    public ListRulesResponse listRules(ListRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query table list</p>
     * 
     * @param request ListTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTablesResponse
     */
    public ListTablesResponse listTablesWithOptions(ListTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalog)) {
            query.put("Catalog", request.catalog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTables"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query table list</p>
     * 
     * @param request ListTablesRequest
     * @return ListTablesResponse
     */
    public ListTablesResponse listTables(ListTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTablesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all event targets of an event rule.</p>
     * 
     * @param request ListTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTargetsResponse
     */
    public ListTargetsResponse listTargetsWithOptions(ListTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arn)) {
            query.put("Arn", request.arn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTargets"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTargetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all event targets of an event rule.</p>
     * 
     * @param request ListTargetsRequest
     * @return ListTargetsResponse
     */
    public ListTargetsResponse listTargets(ListTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTargetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries all custom event sources.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation queries all custom event sources.</p>
     * 
     * @param request ListUserDefinedEventSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserDefinedEventSourcesResponse
     */
    public ListUserDefinedEventSourcesResponse listUserDefinedEventSourcesWithOptions(ListUserDefinedEventSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namePrefix)) {
            query.put("NamePrefix", request.namePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserDefinedEventSources"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserDefinedEventSourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries all custom event sources.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation queries all custom event sources.</p>
     * 
     * @param request ListUserDefinedEventSourcesRequest
     * @return ListUserDefinedEventSourcesResponse
     */
    public ListUserDefinedEventSourcesResponse listUserDefinedEventSources(ListUserDefinedEventSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserDefinedEventSourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Pauses a running event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Pauses a running event stream.</p>
     * 
     * @param request PauseEventStreamingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseEventStreamingResponse
     */
    public PauseEventStreamingResponse pauseEventStreamingWithOptions(PauseEventStreamingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventStreamingName)) {
            body.put("EventStreamingName", request.eventStreamingName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PauseEventStreaming"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PauseEventStreamingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Pauses a running event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Pauses a running event stream.</p>
     * 
     * @param request PauseEventStreamingRequest
     * @return PauseEventStreamingResponse
     */
    public PauseEventStreamingResponse pauseEventStreaming(PauseEventStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseEventStreamingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Polls for natural language query results.</p>
     * 
     * @param request PollAskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PollAskResultResponse
     */
    public PollAskResultResponse pollAskResultWithOptions(PollAskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            body.put("AgentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            body.put("MessageId", request.messageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PollAskResult"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PollAskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Polls for natural language query results.</p>
     * 
     * @param request PollAskResultRequest
     * @return PollAskResultResponse
     */
    public PollAskResultResponse pollAskResult(PollAskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pollAskResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates or updates event targets for a specified rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Create or update event targets for the specified rule.</p>
     * 
     * @param tmpReq PutTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutTargetsResponse
     */
    public PutTargetsResponse putTargetsWithOptions(PutTargetsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PutTargetsShrinkRequest request = new PutTargetsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.targets)) {
            request.targetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.targets, "Targets", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetsShrink)) {
            query.put("Targets", request.targetsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutTargets"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutTargetsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates or updates event targets for a specified rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Create or update event targets for the specified rule.</p>
     * 
     * @param request PutTargetsRequest
     * @return PutTargetsResponse
     */
    public PutTargetsResponse putTargets(PutTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putTargetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the history logs of natural language queries.</p>
     * 
     * @param request QueryAskLumaLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAskLumaLogResponse
     */
    public QueryAskLumaLogResponse queryAskLumaLogWithOptions(QueryAskLumaLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.after)) {
            body.put("After", request.after);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            body.put("AgentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAskLumaLog"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAskLumaLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the history logs of natural language queries.</p>
     * 
     * @param request QueryAskLumaLogRequest
     * @return QueryAskLumaLogResponse
     */
    public QueryAskLumaLogResponse queryAskLumaLog(QueryAskLumaLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAskLumaLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the content of an event.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the content of an event.</p>
     * 
     * @param request QueryEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEventResponse
     */
    public QueryEventResponse queryEventWithOptions(QueryEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventSource)) {
            query.put("EventSource", request.eventSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEvent"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEventResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the content of an event.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the content of an event.</p>
     * 
     * @param request QueryEventRequest
     * @return QueryEventResponse
     */
    public QueryEventResponse queryEvent(QueryEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query event store data</p>
     * 
     * @param request QueryEventHouseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEventHouseResponse
     */
    public QueryEventHouseResponse queryEventHouseWithOptions(QueryEventHouseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEventHouse"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEventHouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query event store data</p>
     * 
     * @param request QueryEventHouseRequest
     * @return QueryEventHouseResponse
     */
    public QueryEventHouseResponse queryEventHouse(QueryEventHouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventHouseWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query event traces.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries event traces.</p>
     * 
     * @param request QueryEventTracesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEventTracesResponse
     */
    public QueryEventTracesResponse queryEventTracesWithOptions(QueryEventTracesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEventTraces"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEventTracesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query event traces.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries event traces.</p>
     * 
     * @param request QueryEventTracesRequest
     * @return QueryEventTracesResponse
     */
    public QueryEventTracesResponse queryEventTraces(QueryEventTracesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventTracesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query event traces by event ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries event traces by event ID.</p>
     * 
     * @param request QueryTracedEventByEventIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTracedEventByEventIdResponse
     */
    public QueryTracedEventByEventIdResponse queryTracedEventByEventIdWithOptions(QueryTracedEventByEventIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventSource)) {
            query.put("EventSource", request.eventSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTracedEventByEventId"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTracedEventByEventIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query event traces by event ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries event traces by event ID.</p>
     * 
     * @param request QueryTracedEventByEventIdRequest
     * @return QueryTracedEventByEventIdResponse
     */
    public QueryTracedEventByEventIdResponse queryTracedEventByEventId(QueryTracedEventByEventIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTracedEventByEventIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries for event traces within a specified time range.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation queries <code>event trace</code> data within a <code>time range</code>.</p>
     * 
     * @param request QueryTracedEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTracedEventsResponse
     */
    public QueryTracedEventsResponse queryTracedEventsWithOptions(QueryTracedEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventSource)) {
            query.put("EventSource", request.eventSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchedRule)) {
            query.put("MatchedRule", request.matchedRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            query.put("Subject", request.subject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTracedEvents"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTracedEventsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries for event traces within a specified time range.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation queries <code>event trace</code> data within a <code>time range</code>.</p>
     * 
     * @param request QueryTracedEventsRequest
     * @return QueryTracedEventsResponse
     */
    public QueryTracedEventsResponse queryTracedEvents(QueryTracedEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTracedEventsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Enables a created or disabled event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a created or disabled event stream.</p>
     * 
     * @param request StartEventStreamingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartEventStreamingResponse
     */
    public StartEventStreamingResponse startEventStreamingWithOptions(StartEventStreamingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventStreamingName)) {
            body.put("EventStreamingName", request.eventStreamingName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartEventStreaming"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartEventStreamingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Enables a created or disabled event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a created or disabled event stream.</p>
     * 
     * @param request StartEventStreamingRequest
     * @return StartEventStreamingResponse
     */
    public StartEventStreamingResponse startEventStreaming(StartEventStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startEventStreamingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Use this action to test an event pattern before you apply it to a rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Tests if an event pattern matches a given event.</p>
     * 
     * @param request TestEventPatternRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TestEventPatternResponse
     */
    public TestEventPatternResponse testEventPatternWithOptions(TestEventPatternRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.event)) {
            body.put("Event", request.event);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventPattern)) {
            body.put("EventPattern", request.eventPattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestEventPattern"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestEventPatternResponse());
    }

    /**
     * <b>description</b> :
     * <p>Use this action to test an event pattern before you apply it to a rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Tests if an event pattern matches a given event.</p>
     * 
     * @param request TestEventPatternRequest
     * @return TestEventPatternResponse
     */
    public TestEventPatternResponse testEventPattern(TestEventPatternRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testEventPatternWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Returns a list of all external event sources.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether the event source configuration is active.</p>
     * 
     * @param tmpReq TestEventSourceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TestEventSourceConfigResponse
     */
    public TestEventSourceConfigResponse testEventSourceConfigWithOptions(TestEventSourceConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TestEventSourceConfigShrinkRequest request = new TestEventSourceConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceMySQLParameters)) {
            request.sourceMySQLParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceMySQLParameters, "SourceMySQLParameters", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceMySQLParametersShrink)) {
            body.put("SourceMySQLParameters", request.sourceMySQLParametersShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestEventSourceConfig"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestEventSourceConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Returns a list of all external event sources.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether the event source configuration is active.</p>
     * 
     * @param request TestEventSourceConfigRequest
     * @return TestEventSourceConfigResponse
     */
    public TestEventSourceConfigResponse testEventSourceConfig(TestEventSourceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testEventSourceConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom agent.</p>
     * 
     * @param tmpReq UpdateAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentResponse
     */
    public UpdateAgentResponse updateAgentWithOptions(UpdateAgentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAgentShrinkRequest request = new UpdateAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.metadata)) {
            request.metadataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.metadata, "Metadata", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadataShrink)) {
            body.put("Metadata", request.metadataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("Prompt", request.prompt);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgent"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom agent.</p>
     * 
     * @param request UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    public UpdateAgentResponse updateAgent(UpdateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to update an API destination.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an API destination.</p>
     * 
     * @param tmpReq UpdateApiDestinationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApiDestinationResponse
     */
    public UpdateApiDestinationResponse updateApiDestinationWithOptions(UpdateApiDestinationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateApiDestinationShrinkRequest request = new UpdateApiDestinationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.httpApiParameters)) {
            request.httpApiParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.httpApiParameters, "HttpApiParameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiDestinationName)) {
            query.put("ApiDestinationName", request.apiDestinationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionName)) {
            query.put("ConnectionName", request.connectionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpApiParametersShrink)) {
            query.put("HttpApiParameters", request.httpApiParametersShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApiDestination"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApiDestinationResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to update an API destination.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an API destination.</p>
     * 
     * @param request UpdateApiDestinationRequest
     * @return UpdateApiDestinationResponse
     */
    public UpdateApiDestinationResponse updateApiDestination(UpdateApiDestinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApiDestinationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the connection configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the connection configuration.</p>
     * 
     * @param tmpReq UpdateConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConnectionResponse
     */
    public UpdateConnectionResponse updateConnectionWithOptions(UpdateConnectionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateConnectionShrinkRequest request = new UpdateConnectionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.authParameters)) {
            request.authParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.authParameters, "AuthParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.networkParameters)) {
            request.networkParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.networkParameters, "NetworkParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authParametersShrink)) {
            query.put("AuthParameters", request.authParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionName)) {
            query.put("ConnectionName", request.connectionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkParametersShrink)) {
            query.put("NetworkParameters", request.networkParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConnection"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the connection configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the connection configuration.</p>
     * 
     * @param request UpdateConnectionRequest
     * @return UpdateConnectionResponse
     */
    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update an event bus.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an event bus.</p>
     * 
     * @param request UpdateEventBusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEventBusResponse
     */
    public UpdateEventBusResponse updateEventBusWithOptions(UpdateEventBusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEventBus"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEventBusResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update an event bus.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an event bus.</p>
     * 
     * @param request UpdateEventBusRequest
     * @return UpdateEventBusResponse
     */
    public UpdateEventBusResponse updateEventBus(UpdateEventBusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEventBusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an EventHouse Runtime.</p>
     * 
     * @param request UpdateEventHouseRuntimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEventHouseRuntimeResponse
     */
    public UpdateEventHouseRuntimeResponse updateEventHouseRuntimeWithOptions(UpdateEventHouseRuntimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cu)) {
            query.put("Cu", request.cu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEventHouseRuntime"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEventHouseRuntimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an EventHouse Runtime.</p>
     * 
     * @param request UpdateEventHouseRuntimeRequest
     * @return UpdateEventHouseRuntimeResponse
     */
    public UpdateEventHouseRuntimeResponse updateEventHouseRuntime(UpdateEventHouseRuntimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEventHouseRuntimeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to update an event source.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an event source.</p>
     * 
     * @param tmpReq UpdateEventSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEventSourceResponse
     */
    public UpdateEventSourceResponse updateEventSourceWithOptions(UpdateEventSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateEventSourceShrinkRequest request = new UpdateEventSourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.externalSourceConfig)) {
            request.externalSourceConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.externalSourceConfig, "ExternalSourceConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceHttpEventParameters)) {
            request.sourceHttpEventParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceHttpEventParameters, "SourceHttpEventParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceKafkaParameters)) {
            request.sourceKafkaParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceKafkaParameters, "SourceKafkaParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceMNSParameters)) {
            request.sourceMNSParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceMNSParameters, "SourceMNSParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceOSSEventParameters)) {
            request.sourceOSSEventParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceOSSEventParameters, "SourceOSSEventParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceRabbitMQParameters)) {
            request.sourceRabbitMQParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceRabbitMQParameters, "SourceRabbitMQParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceRocketMQParameters)) {
            request.sourceRocketMQParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceRocketMQParameters, "SourceRocketMQParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceSLSParameters)) {
            request.sourceSLSParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceSLSParameters, "SourceSLSParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceScheduledEventParameters)) {
            request.sourceScheduledEventParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceScheduledEventParameters, "SourceScheduledEventParameters", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            body.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventSourceName)) {
            body.put("EventSourceName", request.eventSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalSourceConfigShrink)) {
            body.put("ExternalSourceConfig", request.externalSourceConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalSourceType)) {
            body.put("ExternalSourceType", request.externalSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.linkedExternalSource)) {
            body.put("LinkedExternalSource", request.linkedExternalSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceHttpEventParametersShrink)) {
            body.put("SourceHttpEventParameters", request.sourceHttpEventParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceKafkaParametersShrink)) {
            body.put("SourceKafkaParameters", request.sourceKafkaParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceMNSParametersShrink)) {
            body.put("SourceMNSParameters", request.sourceMNSParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOSSEventParametersShrink)) {
            body.put("SourceOSSEventParameters", request.sourceOSSEventParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRabbitMQParametersShrink)) {
            body.put("SourceRabbitMQParameters", request.sourceRabbitMQParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRocketMQParametersShrink)) {
            body.put("SourceRocketMQParameters", request.sourceRocketMQParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceSLSParametersShrink)) {
            body.put("SourceSLSParameters", request.sourceSLSParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceScheduledEventParametersShrink)) {
            body.put("SourceScheduledEventParameters", request.sourceScheduledEventParametersShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEventSource"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEventSourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to update an event source.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an event source.</p>
     * 
     * @param request UpdateEventSourceRequest
     * @return UpdateEventSourceResponse
     */
    public UpdateEventSourceResponse updateEventSource(UpdateEventSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEventSourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Modifies the basic information, event source information, event filtering pattern, or event target information of an event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the basic information, event source information, event filtering pattern, or event target information of an event stream.</p>
     * 
     * @param tmpReq UpdateEventStreamingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEventStreamingResponse
     */
    public UpdateEventStreamingResponse updateEventStreamingWithOptions(UpdateEventStreamingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateEventStreamingShrinkRequest request = new UpdateEventStreamingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.runOptions)) {
            request.runOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.runOptions, "RunOptions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sink)) {
            request.sinkShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sink, "Sink", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.source)) {
            request.sourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.source, "Source", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transforms)) {
            request.transformsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transforms, "Transforms", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventStreamingName)) {
            body.put("EventStreamingName", request.eventStreamingName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterPattern)) {
            body.put("FilterPattern", request.filterPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadata)) {
            body.put("Metadata", request.metadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runOptionsShrink)) {
            body.put("RunOptions", request.runOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sinkShrink)) {
            body.put("Sink", request.sinkShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceShrink)) {
            body.put("Source", request.sourceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transformsShrink)) {
            body.put("Transforms", request.transformsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEventStreaming"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEventStreamingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Modifies the basic information, event source information, event filtering pattern, or event target information of an event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the basic information, event source information, event filtering pattern, or event target information of an event stream.</p>
     * 
     * @param request UpdateEventStreamingRequest
     * @return UpdateEventStreamingResponse
     */
    public UpdateEventStreamingResponse updateEventStreaming(UpdateEventStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEventStreamingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the billing method, compute unit (CU) resources, and other configurations of an event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Querying an event stream</p>
     * 
     * @param request UpdateEventStreamingBusinessOptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEventStreamingBusinessOptionResponse
     */
    public UpdateEventStreamingBusinessOptionResponse updateEventStreamingBusinessOptionWithOptions(UpdateEventStreamingBusinessOptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessMode)) {
            body.put("BusinessMode", request.businessMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventStreamingName)) {
            body.put("EventStreamingName", request.eventStreamingName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCapacityUnitCount)) {
            body.put("MaxCapacityUnitCount", request.maxCapacityUnitCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minCapacityUnitCount)) {
            body.put("MinCapacityUnitCount", request.minCapacityUnitCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEventStreamingBusinessOption"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEventStreamingBusinessOptionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the billing method, compute unit (CU) resources, and other configurations of an event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Querying an event stream</p>
     * 
     * @param request UpdateEventStreamingBusinessOptionRequest
     * @return UpdateEventStreamingBusinessOptionResponse
     */
    public UpdateEventStreamingBusinessOptionResponse updateEventStreamingBusinessOption(UpdateEventStreamingBusinessOptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEventStreamingBusinessOptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify namespace</p>
     * 
     * @param request UpdateNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNamespaceResponse
     */
    public UpdateNamespaceResponse updateNamespaceWithOptions(UpdateNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalog)) {
            query.put("Catalog", request.catalog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNamespace"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify namespace</p>
     * 
     * @param request UpdateNamespaceRequest
     * @return UpdateNamespaceResponse
     */
    public UpdateNamespaceResponse updateNamespace(UpdateNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to update the configurations of an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configurations of an event rule.</p>
     * 
     * @param request UpdateRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRuleResponse
     */
    public UpdateRuleResponse updateRuleWithOptions(UpdateRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBusName)) {
            query.put("EventBusName", request.eventBusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterPattern)) {
            query.put("FilterPattern", request.filterPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRule"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to update the configurations of an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configurations of an event rule.</p>
     * 
     * @param request UpdateRuleRequest
     * @return UpdateRuleResponse
     */
    public UpdateRuleResponse updateRule(UpdateRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Update table</p>
     * 
     * @param tmpReq UpdateTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTableResponse
     */
    public UpdateTableResponse updateTableWithOptions(UpdateTableRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTableShrinkRequest request = new UpdateTableShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addColumn)) {
            request.addColumnShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addColumn, "AddColumn", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deleteColumn)) {
            request.deleteColumnShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deleteColumn, "DeleteColumn", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.renameColumn)) {
            request.renameColumnShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.renameColumn, "RenameColumn", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateColumnComment)) {
            request.updateColumnCommentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateColumnComment, "UpdateColumnComment", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateColumnType)) {
            request.updateColumnTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateColumnType, "UpdateColumnType", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateRetentionPolicy)) {
            request.updateRetentionPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateRetentionPolicy, "UpdateRetentionPolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addColumnShrink)) {
            query.put("AddColumn", request.addColumnShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalog)) {
            query.put("Catalog", request.catalog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteColumnShrink)) {
            query.put("DeleteColumn", request.deleteColumnShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renameColumnShrink)) {
            query.put("RenameColumn", request.renameColumnShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateColumnCommentShrink)) {
            query.put("UpdateColumnComment", request.updateColumnCommentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateColumnTypeShrink)) {
            query.put("UpdateColumnType", request.updateColumnTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateComment)) {
            query.put("UpdateComment", request.updateComment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateRetentionPolicyShrink)) {
            query.put("UpdateRetentionPolicy", request.updateRetentionPolicyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTable"),
            new TeaPair("version", "2020-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of an event rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Update table</p>
     * 
     * @param request UpdateTableRequest
     * @return UpdateTableResponse
     */
    public UpdateTableResponse updateTable(UpdateTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableWithOptions(request, runtime);
    }
}
