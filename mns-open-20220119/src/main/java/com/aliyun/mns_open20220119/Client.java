// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119;

import com.aliyun.tea.*;
import com.aliyun.mns_open20220119.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("us-west-1", "mns-open.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "mns-open.us-east-1.aliyuncs.com"),
            new TeaPair("me-east-1", "mns-open.me-east-1.aliyuncs.com"),
            new TeaPair("me-central-1", "mns-open.me-central-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "mns-open.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "mns-open.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-jva", "mns-open.cn-zhengzhou-jva.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "mns-open.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "mns-open.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "mns-open.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "mns-open.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "mns-open.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shanghai", "mns-open.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-qingdao", "mns-open.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "mns-open.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-hongkong", "mns-open.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-heyuan-acdr-1", "mns-open.cn-heyuan-acdr-1.aliyuncs.com"),
            new TeaPair("cn-heyuan", "mns-open.cn-heyuan.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "mns-open.cn-hangzhou-finance.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "mns-open.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "mns-open.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "mns-open.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-beijing", "mns-open.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "mns-open.ap-southeast-7.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "mns-open.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "mns-open.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "mns-open.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "mns-open.ap-northeast-2.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "mns-open.ap-northeast-1.aliyuncs.com")
        );
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
     * <p>AuthorizeEndpointAcl</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeEndpointAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>AuthorizeEndpointAcl</p>
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
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.endpoint)) {
            request.endpointShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.endpoint, "Endpoint", "json");
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryMode)) {
            query.put("DeliveryMode", request.deliveryMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointShrink)) {
            query.put("Endpoint", request.endpointShrink);
        }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEventRuleResponse());
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
     * <p>CreateQueue</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantRateLimitPolicy)) {
            request.tenantRateLimitPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantRateLimitPolicy, "TenantRateLimitPolicy", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableSSE)) {
            query.put("EnableSSE", request.enableSSE);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            query.put("KmsKeyId", request.kmsKeyId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.queueType)) {
            query.put("QueueType", request.queueType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sseAlgorithm)) {
            query.put("SseAlgorithm", request.sseAlgorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sseType)) {
            query.put("SseType", request.sseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantRateLimitPolicyShrink)) {
            query.put("TenantRateLimitPolicy", request.tenantRateLimitPolicyShrink);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQueueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateQueue</p>
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
     * <p>CreateTopic</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.topicType)) {
            query.put("TopicType", request.topicType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableLogging)) {
            body.put("EnableLogging", request.enableLogging);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSSE)) {
            body.put("EnableSSE", request.enableSSE);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            body.put("KmsKeyId", request.kmsKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxMessageSize)) {
            body.put("MaxMessageSize", request.maxMessageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sseAlgorithm)) {
            body.put("SseAlgorithm", request.sseAlgorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sseType)) {
            body.put("SseType", request.sseType);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTopicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateTopic</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventRuleResponse());
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
     * <p>DeleteQueue</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQueueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteQueue</p>
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
     * <p>删除订阅主题</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTopicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除订阅主题</p>
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
     * <p>DisableEndpoint</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DisableEndpoint</p>
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
     * <p>EnableEndpoint</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>EnableEndpoint</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEndpointAttributeResponse());
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
     * <p>获取事件通知规则</p>
     * 
     * @param request GetEventRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEventRuleResponse
     */
    public GetEventRuleResponse getEventRuleWithOptions(GetEventRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetEventRule"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEventRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取事件通知规则</p>
     * 
     * @param request GetEventRuleRequest
     * @return GetEventRuleResponse
     */
    public GetEventRuleResponse getEventRule(GetEventRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEventRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetQueueAttributes</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueueAttributesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetQueueAttributes</p>
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
     * <p>GetSubscription</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubscriptionAttributesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetSubscription</p>
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
     * <p>查询主题</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTopicAttributesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询主题</p>
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
     * <p>查询事件通知列表</p>
     * 
     * @param tmpReq ListEventRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEventRulesResponse
     */
    public ListEventRulesResponse listEventRulesWithOptions(ListEventRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListEventRulesShrinkRequest request = new ListEventRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subscription)) {
            request.subscriptionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subscription, "Subscription", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            query.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionShrink)) {
            query.put("Subscription", request.subscriptionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            query.put("TopicName", request.topicName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEventRules"),
            new TeaPair("version", "2022-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件通知列表</p>
     * 
     * @param request ListEventRulesRequest
     * @return ListEventRulesResponse
     */
    public ListEventRulesResponse listEventRules(ListEventRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEventRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListQueue</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.queueType)) {
            query.put("QueueType", request.queueType);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListQueue</p>
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
     * <p>ListSubscription</p>
     * 
     * @param request ListSubscriptionByTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubscriptionByTopicResponse
     */
    public ListSubscriptionByTopicResponse listSubscriptionByTopicWithOptions(ListSubscriptionByTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointValue)) {
            query.put("EndpointValue", request.endpointValue);
        }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubscriptionByTopicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListSubscription</p>
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
     * <p>ListTopic</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.topicType)) {
            query.put("TopicType", request.topicType);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTopicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListTopic</p>
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
     * <p>RevokeEndpointAcl</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeEndpointAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>RevokeEndpointAcl</p>
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
     * <p>SetQueueAttributes</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantRateLimitPolicy)) {
            request.tenantRateLimitPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantRateLimitPolicy, "TenantRateLimitPolicy", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableSSE)) {
            query.put("EnableSSE", request.enableSSE);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            query.put("KmsKeyId", request.kmsKeyId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sseAlgorithm)) {
            query.put("SseAlgorithm", request.sseAlgorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sseType)) {
            query.put("SseType", request.sseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantRateLimitPolicyShrink)) {
            query.put("TenantRateLimitPolicy", request.tenantRateLimitPolicyShrink);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetQueueAttributesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>SetQueueAttributes</p>
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
     * <p>ModifySubscription</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantRateLimitPolicy)) {
            request.tenantRateLimitPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantRateLimitPolicy, "TenantRateLimitPolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dlqPolicyShrink)) {
            query.put("DlqPolicy", request.dlqPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyStrategy)) {
            query.put("NotifyStrategy", request.notifyStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsRoleArn)) {
            query.put("StsRoleArn", request.stsRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionName)) {
            query.put("SubscriptionName", request.subscriptionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantRateLimitPolicyShrink)) {
            query.put("TenantRateLimitPolicy", request.tenantRateLimitPolicyShrink);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSubscriptionAttributesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifySubscription</p>
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
     * <p>编辑订阅主题</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableSSE)) {
            query.put("EnableSSE", request.enableSSE);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            query.put("KmsKeyId", request.kmsKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxMessageSize)) {
            query.put("MaxMessageSize", request.maxMessageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sseAlgorithm)) {
            query.put("SseAlgorithm", request.sseAlgorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sseType)) {
            query.put("SseType", request.sseType);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetTopicAttributesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑订阅主题</p>
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
     * <p>CreateSubscription</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dmAttributes)) {
            request.dmAttributesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dmAttributes, "DmAttributes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dysmsAttributes)) {
            request.dysmsAttributesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dysmsAttributes, "DysmsAttributes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.kafkaAttributes)) {
            request.kafkaAttributesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.kafkaAttributes, "KafkaAttributes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantRateLimitPolicy)) {
            request.tenantRateLimitPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantRateLimitPolicy, "TenantRateLimitPolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dlqPolicyShrink)) {
            query.put("DlqPolicy", request.dlqPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dmAttributesShrink)) {
            query.put("DmAttributes", request.dmAttributesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dysmsAttributesShrink)) {
            query.put("DysmsAttributes", request.dysmsAttributesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaAttributesShrink)) {
            query.put("KafkaAttributes", request.kafkaAttributesShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.stsRoleArn)) {
            query.put("StsRoleArn", request.stsRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionName)) {
            query.put("SubscriptionName", request.subscriptionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantRateLimitPolicyShrink)) {
            query.put("TenantRateLimitPolicy", request.tenantRateLimitPolicyShrink);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubscribeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateSubscription</p>
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
     * <p>DeleteSubscription</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnsubscribeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteSubscription</p>
     * 
     * @param request UnsubscribeRequest
     * @return UnsubscribeResponse
     */
    public UnsubscribeResponse unsubscribe(UnsubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unsubscribeWithOptions(request, runtime);
    }
}
