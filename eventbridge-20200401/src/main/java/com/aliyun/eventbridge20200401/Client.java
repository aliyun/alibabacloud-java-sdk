// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401;

import com.aliyun.tea.*;
import com.aliyun.eventbridge20200401.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
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
      * You can call this API operation to create an API destination.
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
      * You can call this API operation to create an API destination.
      *
      * @param request CreateApiDestinationRequest
      * @return CreateApiDestinationResponse
     */
    public CreateApiDestinationResponse createApiDestination(CreateApiDestinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApiDestinationWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to create a connection.
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
      * You can call this API operation to create a connection.
      *
      * @param request CreateConnectionRequest
      * @return CreateConnectionResponse
     */
    public CreateConnectionResponse createConnection(CreateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConnectionWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to create an event bus.
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
      * You can call this API operation to create an event bus.
      *
      * @param request CreateEventBusRequest
      * @return CreateEventBusResponse
     */
    public CreateEventBusResponse createEventBus(CreateEventBusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEventBusWithOptions(request, runtime);
    }

    /**
      * You can call this operation to create an event source.
      *
      * @param tmpReq CreateEventSourceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateEventSourceResponse
     */
    public CreateEventSourceResponse createEventSourceWithOptions(CreateEventSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEventSourceShrinkRequest request = new CreateEventSourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceHttpEventParameters)) {
            request.sourceHttpEventParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceHttpEventParameters, "SourceHttpEventParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceKafkaParameters)) {
            request.sourceKafkaParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceKafkaParameters, "SourceKafkaParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceMNSParameters)) {
            request.sourceMNSParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceMNSParameters, "SourceMNSParameters", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.sourceHttpEventParametersShrink)) {
            body.put("SourceHttpEventParameters", request.sourceHttpEventParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceKafkaParametersShrink)) {
            body.put("SourceKafkaParameters", request.sourceKafkaParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceMNSParametersShrink)) {
            body.put("SourceMNSParameters", request.sourceMNSParametersShrink);
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
      * You can call this operation to create an event source.
      *
      * @param request CreateEventSourceRequest
      * @return CreateEventSourceResponse
     */
    public CreateEventSourceResponse createEventSource(CreateEventSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEventSourceWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to create an event stream.
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
      * You can call this API operation to create an event stream.
      *
      * @param request CreateEventStreamingRequest
      * @return CreateEventStreamingResponse
     */
    public CreateEventStreamingResponse createEventStreaming(CreateEventStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEventStreamingWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to create an event rule.
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
      * You can call this API operation to create an event rule.
      *
      * @param request CreateRuleRequest
      * @return CreateRuleResponse
     */
    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to create a service-linked role for your cloud service.
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
      * You can call this API operation to create a service-linked role for your cloud service.
      *
      * @param request CreateServiceLinkedRoleForProductRequest
      * @return CreateServiceLinkedRoleForProductResponse
     */
    public CreateServiceLinkedRoleForProductResponse createServiceLinkedRoleForProduct(CreateServiceLinkedRoleForProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceLinkedRoleForProductWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to delete an API destination.
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
      * You can call this API operation to delete an API destination.
      *
      * @param request DeleteApiDestinationRequest
      * @return DeleteApiDestinationResponse
     */
    public DeleteApiDestinationResponse deleteApiDestination(DeleteApiDestinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApiDestinationWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to delete a connection.
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
      * You can call this API operation to delete a connection.
      *
      * @param request DeleteConnectionRequest
      * @return DeleteConnectionResponse
     */
    public DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConnectionWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to delete an event bus.
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
      * You can call this API operation to delete an event bus.
      *
      * @param request DeleteEventBusRequest
      * @return DeleteEventBusResponse
     */
    public DeleteEventBusResponse deleteEventBus(DeleteEventBusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventBusWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to delete an event source.
      *
      * @param request DeleteEventSourceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteEventSourceResponse
     */
    public DeleteEventSourceResponse deleteEventSourceWithOptions(DeleteEventSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
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
      * You can call this API operation to delete an event source.
      *
      * @param request DeleteEventSourceRequest
      * @return DeleteEventSourceResponse
     */
    public DeleteEventSourceResponse deleteEventSource(DeleteEventSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventSourceWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to delete an event stream.
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
      * You can call this API operation to delete an event stream.
      *
      * @param request DeleteEventStreamingRequest
      * @return DeleteEventStreamingResponse
     */
    public DeleteEventStreamingResponse deleteEventStreaming(DeleteEventStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventStreamingWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to delete an event rule.
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
      * You can call this API operation to delete an event rule.
      *
      * @param request DeleteRuleRequest
      * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to delete one or more event targets of an event rule.
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
      * You can call this API operation to delete one or more event targets of an event rule.
      *
      * @param request DeleteTargetsRequest
      * @return DeleteTargetsResponse
     */
    public DeleteTargetsResponse deleteTargets(DeleteTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTargetsWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to disable an event rule.
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
      * You can call this API operation to disable an event rule.
      *
      * @param request DisableRuleRequest
      * @return DisableRuleResponse
     */
    public DisableRuleResponse disableRule(DisableRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableRuleWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to enable an event rule.
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
      * You can call this API operation to enable an event rule.
      *
      * @param request EnableRuleRequest
      * @return EnableRuleResponse
     */
    public EnableRuleResponse enableRule(EnableRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableRuleWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to query the information about an API destination.
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
      * You can call this API operation to query the information about an API destination.
      *
      * @param request GetApiDestinationRequest
      * @return GetApiDestinationResponse
     */
    public GetApiDestinationResponse getApiDestination(GetApiDestinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApiDestinationWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to query the configurations of a connection.
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
      * You can call this API operation to query the configurations of a connection.
      *
      * @param request GetConnectionRequest
      * @return GetConnectionResponse
     */
    public GetConnectionResponse getConnection(GetConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConnectionWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to query the detailed information about an event bus.
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
      * You can call this API operation to query the detailed information about an event bus.
      *
      * @param request GetEventBusRequest
      * @return GetEventBusResponse
     */
    public GetEventBusResponse getEventBus(GetEventBusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEventBusWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to query the details of an event stream.
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
      * You can call this API operation to query the details of an event stream.
      *
      * @param request GetEventStreamingRequest
      * @return GetEventStreamingResponse
     */
    public GetEventStreamingResponse getEventStreaming(GetEventStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEventStreamingWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to query the details of an event rule.
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
      * You can call this API operation to query the details of an event rule.
      *
      * @param request GetRuleRequest
      * @return GetRuleResponse
     */
    public GetRuleResponse getRule(GetRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuleWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to query all Alibaba Cloud service event sources.
      *
      * @param request ListAliyunOfficialEventSourcesRequest
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
      * You can call this API operation to query all Alibaba Cloud service event sources.
      *
      * @return ListAliyunOfficialEventSourcesResponse
     */
    public ListAliyunOfficialEventSourcesResponse listAliyunOfficialEventSources() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAliyunOfficialEventSourcesWithOptions(runtime);
    }

    /**
      * You can use this API operation to query a list of API destinations.
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
      * You can use this API operation to query a list of API destinations.
      *
      * @param request ListApiDestinationsRequest
      * @return ListApiDestinationsResponse
     */
    public ListApiDestinationsResponse listApiDestinations(ListApiDestinationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApiDestinationsWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to query connections.
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
      * You can call this API operation to query connections.
      *
      * @param request ListConnectionsRequest
      * @return ListConnectionsResponse
     */
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConnectionsWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to query all event buses.
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
      * You can call this API operation to query all event buses.
      *
      * @param request ListEventBusesRequest
      * @return ListEventBusesResponse
     */
    public ListEventBusesResponse listEventBuses(ListEventBusesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEventBusesWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to query event streams.
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
      * You can call this API operation to query event streams.
      *
      * @param request ListEventStreamingsRequest
      * @return ListEventStreamingsResponse
     */
    public ListEventStreamingsResponse listEventStreamings(ListEventStreamingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEventStreamingsWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to query all rules of an event bus.
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
      * You can call this API operation to query all rules of an event bus.
      *
      * @param request ListRulesRequest
      * @return ListRulesResponse
     */
    public ListRulesResponse listRules(ListRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRulesWithOptions(request, runtime);
    }

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

    public ListTargetsResponse listTargets(ListTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTargetsWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to query custom event sources.
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
      * You can call this API operation to query custom event sources.
      *
      * @param request ListUserDefinedEventSourcesRequest
      * @return ListUserDefinedEventSourcesResponse
     */
    public ListUserDefinedEventSourcesResponse listUserDefinedEventSources(ListUserDefinedEventSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserDefinedEventSourcesWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to stop an event stream that is running.
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
      * You can call this API operation to stop an event stream that is running.
      *
      * @param request PauseEventStreamingRequest
      * @return PauseEventStreamingResponse
     */
    public PauseEventStreamingResponse pauseEventStreaming(PauseEventStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseEventStreamingWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to create or update event targets under a rule.
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
      * You can call this API operation to create or update event targets under a rule.
      *
      * @param request PutTargetsRequest
      * @return PutTargetsResponse
     */
    public PutTargetsResponse putTargets(PutTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putTargetsWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to query the content of an event.
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
      * You can call this API operation to query the content of an event.
      *
      * @param request QueryEventRequest
      * @return QueryEventResponse
     */
    public QueryEventResponse queryEvent(QueryEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to query event traces.
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
      * You can call this API operation to query event traces.
      *
      * @param request QueryEventTracesRequest
      * @return QueryEventTracesResponse
     */
    public QueryEventTracesResponse queryEventTraces(QueryEventTracesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventTracesWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to query event traces by event ID.
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
      * You can call this API operation to query event traces by event ID.
      *
      * @param request QueryTracedEventByEventIdRequest
      * @return QueryTracedEventByEventIdResponse
     */
    public QueryTracedEventByEventIdResponse queryTracedEventByEventId(QueryTracedEventByEventIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTracedEventByEventIdWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to query event traces by time range.
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
      * You can call this API operation to query event traces by time range.
      *
      * @param request QueryTracedEventsRequest
      * @return QueryTracedEventsResponse
     */
    public QueryTracedEventsResponse queryTracedEvents(QueryTracedEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTracedEventsWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to enable a created or deactivated event stream.
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
      * You can call this API operation to enable a created or deactivated event stream.
      *
      * @param request StartEventStreamingRequest
      * @return StartEventStreamingResponse
     */
    public StartEventStreamingResponse startEventStreaming(StartEventStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startEventStreamingWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to check whether the event pattern matches the provided JSON format.
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
      * You can call this API operation to check whether the event pattern matches the provided JSON format.
      *
      * @param request TestEventPatternRequest
      * @return TestEventPatternResponse
     */
    public TestEventPatternResponse testEventPattern(TestEventPatternRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testEventPatternWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to update an API destination.
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
      * You can call this API operation to update an API destination.
      *
      * @param request UpdateApiDestinationRequest
      * @return UpdateApiDestinationResponse
     */
    public UpdateApiDestinationResponse updateApiDestination(UpdateApiDestinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApiDestinationWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to update a connection.
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
      * You can call this API operation to update a connection.
      *
      * @param request UpdateConnectionRequest
      * @return UpdateConnectionResponse
     */
    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConnectionWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to modify an event bus.
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
      * You can call this API operation to modify an event bus.
      *
      * @param request UpdateEventBusRequest
      * @return UpdateEventBusResponse
     */
    public UpdateEventBusResponse updateEventBus(UpdateEventBusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEventBusWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to update an event source.
      *
      * @param tmpReq UpdateEventSourceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateEventSourceResponse
     */
    public UpdateEventSourceResponse updateEventSourceWithOptions(UpdateEventSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateEventSourceShrinkRequest request = new UpdateEventSourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceHttpEventParameters)) {
            request.sourceHttpEventParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceHttpEventParameters, "SourceHttpEventParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceKafkaParameters)) {
            request.sourceKafkaParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceKafkaParameters, "SourceKafkaParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceMNSParameters)) {
            request.sourceMNSParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceMNSParameters, "SourceMNSParameters", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.sourceHttpEventParametersShrink)) {
            body.put("SourceHttpEventParameters", request.sourceHttpEventParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceKafkaParametersShrink)) {
            body.put("SourceKafkaParameters", request.sourceKafkaParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceMNSParametersShrink)) {
            body.put("SourceMNSParameters", request.sourceMNSParametersShrink);
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
      * You can call this API operation to update an event source.
      *
      * @param request UpdateEventSourceRequest
      * @return UpdateEventSourceResponse
     */
    public UpdateEventSourceResponse updateEventSource(UpdateEventSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEventSourceWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to modify the information about an event stream, such as the basic information and the information about the event source, event filtering rule, and event target.
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
      * You can call this API operation to modify the information about an event stream, such as the basic information and the information about the event source, event filtering rule, and event target.
      *
      * @param request UpdateEventStreamingRequest
      * @return UpdateEventStreamingResponse
     */
    public UpdateEventStreamingResponse updateEventStreaming(UpdateEventStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEventStreamingWithOptions(request, runtime);
    }

    /**
      * You can call this API operation to update the configurations of an event rule.
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
      * You can call this API operation to update the configurations of an event rule.
      *
      * @param request UpdateRuleRequest
      * @return UpdateRuleResponse
     */
    public UpdateRuleResponse updateRule(UpdateRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRuleWithOptions(request, runtime);
    }
}
