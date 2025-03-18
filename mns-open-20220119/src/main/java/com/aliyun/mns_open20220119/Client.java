// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119;

import com.aliyun.tea.*;
import com.aliyun.mns_open20220119.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mns-open", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>You can call this operation to add one or more rules of access control lists (ACLs) for the endpoint of a type.</p>
     * 
     * @param tmpReq AuthorizeEndpointAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeEndpointAclResponse
     */
    public AuthorizeEndpointAclResponse authorizeEndpointAclWithOptions(AuthorizeEndpointAclRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AuthorizeEndpointAclShrinkRequest request = new AuthorizeEndpointAclShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cidrList)) {
            request.cidrListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cidrList, "CidrList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclStrategy)) {
            query.put("AclStrategy", request.aclStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidrListShrink)) {
            query.put("CidrList", request.cidrListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeEndpointAcl"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeEndpointAclResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AuthorizeEndpointAclResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to add one or more rules of access control lists (ACLs) for the endpoint of a type.</p>
     * 
     * @param request AuthorizeEndpointAclRequest
     * @return AuthorizeEndpointAclResponse
     */
    public AuthorizeEndpointAclResponse authorizeEndpointAcl(AuthorizeEndpointAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeEndpointAclWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建事件规则</p>
     * 
     * @param tmpReq CreateEventRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEventRuleResponse
     */
    public CreateEventRuleResponse createEventRuleWithOptions(CreateEventRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEventRuleShrinkRequest request = new CreateEventRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.endpoints)) {
            request.endpointsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.endpoints, "Endpoints", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventTypes)) {
            request.eventTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventTypes, "EventTypes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.matchRules)) {
            request.matchRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.matchRules, "MatchRules", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointsShrink)) {
            query.put("Endpoints", request.endpointsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTypesShrink)) {
            query.put("EventTypes", request.eventTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchRulesShrink)) {
            query.put("MatchRules", request.matchRulesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            query.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEventRule"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEventRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateEventRuleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建事件规则</p>
     * 
     * @param request CreateEventRuleRequest
     * @return CreateEventRuleResponse
     */
    public CreateEventRuleResponse createEventRule(CreateEventRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEventRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a queue.</p>
     * 
     * @param tmpReq CreateQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQueueResponse
     */
    public CreateQueueResponse createQueueWithOptions(CreateQueueRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateQueueShrinkRequest request = new CreateQueueShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dlqPolicy)) {
            request.dlqPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dlqPolicy, "DlqPolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delaySeconds)) {
            query.put("DelaySeconds", request.delaySeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dlqPolicyShrink)) {
            query.put("DlqPolicy", request.dlqPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableLogging)) {
            query.put("EnableLogging", request.enableLogging);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumMessageSize)) {
            query.put("MaximumMessageSize", request.maximumMessageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageRetentionPeriod)) {
            query.put("MessageRetentionPeriod", request.messageRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pollingWaitSeconds)) {
            query.put("PollingWaitSeconds", request.pollingWaitSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibilityTimeout)) {
            query.put("VisibilityTimeout", request.visibilityTimeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQueue"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQueueResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateQueueResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a queue.</p>
     * 
     * @param request CreateQueueRequest
     * @return CreateQueueResponse
     */
    public CreateQueueResponse createQueue(CreateQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQueueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a topic.</p>
     * 
     * @param request CreateTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTopicResponse
     */
    public CreateTopicResponse createTopicWithOptions(CreateTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableLogging)) {
            body.put("EnableLogging", request.enableLogging);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxMessageSize)) {
            body.put("MaxMessageSize", request.maxMessageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            body.put("TopicName", request.topicName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTopic"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTopicResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTopicResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a topic.</p>
     * 
     * @param request CreateTopicRequest
     * @return CreateTopicResponse
     */
    public CreateTopicResponse createTopic(CreateTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTopicWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除事件规则</p>
     * 
     * @param request DeleteEventRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEventRuleResponse
     */
    public DeleteEventRuleResponse deleteEventRuleWithOptions(DeleteEventRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            query.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEventRule"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteEventRuleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除事件规则</p>
     * 
     * @param request DeleteEventRuleRequest
     * @return DeleteEventRuleResponse
     */
    public DeleteEventRuleResponse deleteEventRule(DeleteEventRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a queue.</p>
     * 
     * @param request DeleteQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQueueResponse
     */
    public DeleteQueueResponse deleteQueueWithOptions(DeleteQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQueue"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQueueResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteQueueResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a queue.</p>
     * 
     * @param request DeleteQueueRequest
     * @return DeleteQueueResponse
     */
    public DeleteQueueResponse deleteQueue(DeleteQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQueueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a topic.</p>
     * 
     * @param request DeleteTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTopicResponse
     */
    public DeleteTopicResponse deleteTopicWithOptions(DeleteTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            query.put("TopicName", request.topicName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTopic"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTopicResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTopicResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a topic.</p>
     * 
     * @param request DeleteTopicRequest
     * @return DeleteTopicResponse
     */
    public DeleteTopicResponse deleteTopic(DeleteTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTopicWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to disenable the endpoint of a type. After the endpoint is disabled, all requests from the endpoint are blocked and an error is returned.</p>
     * 
     * @param request DisableEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableEndpointResponse
     */
    public DisableEndpointResponse disableEndpointWithOptions(DisableEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableEndpoint"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DisableEndpointResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DisableEndpointResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to disenable the endpoint of a type. After the endpoint is disabled, all requests from the endpoint are blocked and an error is returned.</p>
     * 
     * @param request DisableEndpointRequest
     * @return DisableEndpointResponse
     */
    public DisableEndpointResponse disableEndpoint(DisableEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to enable the endpoint of a type. If the endpoint is enabled, requests from the endpoint that are included in the access control lists (ACLs) are not blocked.</p>
     * 
     * @param request EnableEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableEndpointResponse
     */
    public EnableEndpointResponse enableEndpointWithOptions(EnableEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableEndpoint"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new EnableEndpointResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new EnableEndpointResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to enable the endpoint of a type. If the endpoint is enabled, requests from the endpoint that are included in the access control lists (ACLs) are not blocked.</p>
     * 
     * @param request EnableEndpointRequest
     * @return EnableEndpointResponse
     */
    public EnableEndpointResponse enableEndpoint(EnableEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetEndpointAttribute</p>
     * 
     * @param request GetEndpointAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEndpointAttributeResponse
     */
    public GetEndpointAttributeResponse getEndpointAttributeWithOptions(GetEndpointAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEndpointAttribute"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetEndpointAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetEndpointAttributeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>GetEndpointAttribute</p>
     * 
     * @param request GetEndpointAttributeRequest
     * @return GetEndpointAttributeResponse
     */
    public GetEndpointAttributeResponse getEndpointAttribute(GetEndpointAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEndpointAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the attributes of an existing queue.</p>
     * 
     * @param request GetQueueAttributesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueueAttributesResponse
     */
    public GetQueueAttributesResponse getQueueAttributesWithOptions(GetQueueAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueueAttributes"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueueAttributesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetQueueAttributesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the attributes of an existing queue.</p>
     * 
     * @param request GetQueueAttributesRequest
     * @return GetQueueAttributesResponse
     */
    public GetQueueAttributesResponse getQueueAttributes(GetQueueAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueueAttributesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the attributes of a subscription.</p>
     * 
     * @param request GetSubscriptionAttributesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubscriptionAttributesResponse
     */
    public GetSubscriptionAttributesResponse getSubscriptionAttributesWithOptions(GetSubscriptionAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionName)) {
            query.put("SubscriptionName", request.subscriptionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            query.put("TopicName", request.topicName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubscriptionAttributes"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubscriptionAttributesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetSubscriptionAttributesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the attributes of a subscription.</p>
     * 
     * @param request GetSubscriptionAttributesRequest
     * @return GetSubscriptionAttributesResponse
     */
    public GetSubscriptionAttributesResponse getSubscriptionAttributes(GetSubscriptionAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSubscriptionAttributesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the attributes of a topic.</p>
     * 
     * @param request GetTopicAttributesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTopicAttributesResponse
     */
    public GetTopicAttributesResponse getTopicAttributesWithOptions(GetTopicAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            query.put("TopicName", request.topicName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTopicAttributes"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetTopicAttributesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetTopicAttributesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the attributes of a topic.</p>
     * 
     * @param request GetTopicAttributesRequest
     * @return GetTopicAttributesResponse
     */
    public GetTopicAttributesResponse getTopicAttributes(GetTopicAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicAttributesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all queues that belong to an Alibaba Cloud account. The queues are displayed by page.</p>
     * 
     * @param request ListQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQueueResponse
     */
    public ListQueueResponse listQueueWithOptions(ListQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueue"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueueResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListQueueResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries all queues that belong to an Alibaba Cloud account. The queues are displayed by page.</p>
     * 
     * @param request ListQueueRequest
     * @return ListQueueResponse
     */
    public ListQueueResponse listQueue(ListQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQueueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all subscriptions to a topic. The subscriptions are displayed by page.</p>
     * 
     * @param request ListSubscriptionByTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubscriptionByTopicResponse
     */
    public ListSubscriptionByTopicResponse listSubscriptionByTopicWithOptions(ListSubscriptionByTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionName)) {
            query.put("SubscriptionName", request.subscriptionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            query.put("TopicName", request.topicName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubscriptionByTopic"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubscriptionByTopicResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListSubscriptionByTopicResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries all subscriptions to a topic. The subscriptions are displayed by page.</p>
     * 
     * @param request ListSubscriptionByTopicRequest
     * @return ListSubscriptionByTopicResponse
     */
    public ListSubscriptionByTopicResponse listSubscriptionByTopic(ListSubscriptionByTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSubscriptionByTopicWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the topics that belong to an Alibaba Cloud account. The topics are displayed by page.</p>
     * 
     * @param request ListTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTopicResponse
     */
    public ListTopicResponse listTopicWithOptions(ListTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            query.put("TopicName", request.topicName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTopic"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTopicResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTopicResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the topics that belong to an Alibaba Cloud account. The topics are displayed by page.</p>
     * 
     * @param request ListTopicRequest
     * @return ListTopicResponse
     */
    public ListTopicResponse listTopic(ListTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTopicWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to delete one or more rules of access control lists (ACLs) for the endpoint of a type.</p>
     * 
     * @param tmpReq RevokeEndpointAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeEndpointAclResponse
     */
    public RevokeEndpointAclResponse revokeEndpointAclWithOptions(RevokeEndpointAclRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RevokeEndpointAclShrinkRequest request = new RevokeEndpointAclShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cidrList)) {
            request.cidrListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cidrList, "CidrList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclStrategy)) {
            query.put("AclStrategy", request.aclStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidrListShrink)) {
            query.put("CidrList", request.cidrListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeEndpointAcl"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeEndpointAclResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RevokeEndpointAclResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to delete one or more rules of access control lists (ACLs) for the endpoint of a type.</p>
     * 
     * @param request RevokeEndpointAclRequest
     * @return RevokeEndpointAclResponse
     */
    public RevokeEndpointAclResponse revokeEndpointAcl(RevokeEndpointAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeEndpointAclWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a queue.</p>
     * 
     * @param tmpReq SetQueueAttributesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetQueueAttributesResponse
     */
    public SetQueueAttributesResponse setQueueAttributesWithOptions(SetQueueAttributesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetQueueAttributesShrinkRequest request = new SetQueueAttributesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dlqPolicy)) {
            request.dlqPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dlqPolicy, "DlqPolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delaySeconds)) {
            query.put("DelaySeconds", request.delaySeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dlqPolicyShrink)) {
            query.put("DlqPolicy", request.dlqPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableLogging)) {
            query.put("EnableLogging", request.enableLogging);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumMessageSize)) {
            query.put("MaximumMessageSize", request.maximumMessageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageRetentionPeriod)) {
            query.put("MessageRetentionPeriod", request.messageRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pollingWaitSeconds)) {
            query.put("PollingWaitSeconds", request.pollingWaitSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibilityTimeout)) {
            query.put("VisibilityTimeout", request.visibilityTimeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetQueueAttributes"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SetQueueAttributesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SetQueueAttributesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a queue.</p>
     * 
     * @param request SetQueueAttributesRequest
     * @return SetQueueAttributesResponse
     */
    public SetQueueAttributesResponse setQueueAttributes(SetQueueAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setQueueAttributesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the attributes of a subscription.</p>
     * 
     * @param tmpReq SetSubscriptionAttributesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSubscriptionAttributesResponse
     */
    public SetSubscriptionAttributesResponse setSubscriptionAttributesWithOptions(SetSubscriptionAttributesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetSubscriptionAttributesShrinkRequest request = new SetSubscriptionAttributesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dlqPolicy)) {
            request.dlqPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dlqPolicy, "DlqPolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dlqPolicyShrink)) {
            query.put("DlqPolicy", request.dlqPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyStrategy)) {
            query.put("NotifyStrategy", request.notifyStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionName)) {
            query.put("SubscriptionName", request.subscriptionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            query.put("TopicName", request.topicName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSubscriptionAttributes"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SetSubscriptionAttributesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SetSubscriptionAttributesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the attributes of a subscription.</p>
     * 
     * @param request SetSubscriptionAttributesRequest
     * @return SetSubscriptionAttributesResponse
     */
    public SetSubscriptionAttributesResponse setSubscriptionAttributes(SetSubscriptionAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSubscriptionAttributesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the attributes of a topic.</p>
     * 
     * @param request SetTopicAttributesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetTopicAttributesResponse
     */
    public SetTopicAttributesResponse setTopicAttributesWithOptions(SetTopicAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableLogging)) {
            query.put("EnableLogging", request.enableLogging);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxMessageSize)) {
            query.put("MaxMessageSize", request.maxMessageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            query.put("TopicName", request.topicName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetTopicAttributes"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SetTopicAttributesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SetTopicAttributesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the attributes of a topic.</p>
     * 
     * @param request SetTopicAttributesRequest
     * @return SetTopicAttributesResponse
     */
    public SetTopicAttributesResponse setTopicAttributes(SetTopicAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setTopicAttributesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a subscription to a topic.</p>
     * 
     * @param tmpReq SubscribeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubscribeResponse
     */
    public SubscribeResponse subscribeWithOptions(SubscribeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubscribeShrinkRequest request = new SubscribeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dlqPolicy)) {
            request.dlqPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dlqPolicy, "DlqPolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dlqPolicyShrink)) {
            query.put("DlqPolicy", request.dlqPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageTag)) {
            query.put("MessageTag", request.messageTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyContentFormat)) {
            query.put("NotifyContentFormat", request.notifyContentFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyStrategy)) {
            query.put("NotifyStrategy", request.notifyStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushType)) {
            query.put("PushType", request.pushType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionName)) {
            query.put("SubscriptionName", request.subscriptionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            query.put("TopicName", request.topicName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Subscribe"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SubscribeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SubscribeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a subscription to a topic.</p>
     * 
     * @param request SubscribeRequest
     * @return SubscribeResponse
     */
    public SubscribeResponse subscribe(SubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.subscribeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a subscription.</p>
     * 
     * @param request UnsubscribeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnsubscribeResponse
     */
    public UnsubscribeResponse unsubscribeWithOptions(UnsubscribeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionName)) {
            query.put("SubscriptionName", request.subscriptionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            query.put("TopicName", request.topicName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Unsubscribe"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UnsubscribeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UnsubscribeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a subscription.</p>
     * 
     * @param request UnsubscribeRequest
     * @return UnsubscribeResponse
     */
    public UnsubscribeResponse unsubscribe(UnsubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unsubscribeWithOptions(request, runtime);
    }
}
