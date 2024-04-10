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

    public CreateQueueResponse createQueueWithOptions(CreateQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delaySeconds)) {
            query.put("DelaySeconds", request.delaySeconds);
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

    public CreateQueueResponse createQueue(CreateQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQueueWithOptions(request, runtime);
    }

    public CreateTopicResponse createTopicWithOptions(CreateTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

    public CreateTopicResponse createTopic(CreateTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTopicWithOptions(request, runtime);
    }

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

    public DeleteQueueResponse deleteQueue(DeleteQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQueueWithOptions(request, runtime);
    }

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

    public DeleteTopicResponse deleteTopic(DeleteTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTopicWithOptions(request, runtime);
    }

    public GetQueueAttributesResponse getQueueAttributesWithOptions(GetQueueAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
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

    public GetQueueAttributesResponse getQueueAttributes(GetQueueAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueueAttributesWithOptions(request, runtime);
    }

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

    public GetSubscriptionAttributesResponse getSubscriptionAttributes(GetSubscriptionAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSubscriptionAttributesWithOptions(request, runtime);
    }

    public GetTopicAttributesResponse getTopicAttributesWithOptions(GetTopicAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

    public GetTopicAttributesResponse getTopicAttributes(GetTopicAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicAttributesWithOptions(request, runtime);
    }

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

    public ListQueueResponse listQueue(ListQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQueueWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubscriptionByTopicResponse());
    }

    public ListSubscriptionByTopicResponse listSubscriptionByTopic(ListSubscriptionByTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSubscriptionByTopicWithOptions(request, runtime);
    }

    public ListTopicResponse listTopicWithOptions(ListTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTopicResponse());
    }

    public ListTopicResponse listTopic(ListTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTopicWithOptions(request, runtime);
    }

    public SetQueueAttributesResponse setQueueAttributesWithOptions(SetQueueAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delaySeconds)) {
            query.put("DelaySeconds", request.delaySeconds);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetQueueAttributesResponse());
    }

    public SetQueueAttributesResponse setQueueAttributes(SetQueueAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setQueueAttributesWithOptions(request, runtime);
    }

    public SetSubscriptionAttributesResponse setSubscriptionAttributesWithOptions(SetSubscriptionAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSubscriptionAttributesResponse());
    }

    public SetSubscriptionAttributesResponse setSubscriptionAttributes(SetSubscriptionAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSubscriptionAttributesWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetTopicAttributesResponse());
    }

    public SetTopicAttributesResponse setTopicAttributes(SetTopicAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setTopicAttributesWithOptions(request, runtime);
    }

    public SubscribeResponse subscribeWithOptions(SubscribeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubscribeResponse());
    }

    public SubscribeResponse subscribe(SubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.subscribeWithOptions(request, runtime);
    }

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

    public UnsubscribeResponse unsubscribe(UnsubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unsubscribeWithOptions(request, runtime);
    }
}
