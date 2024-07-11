// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212;

import com.aliyun.tea.*;
import com.aliyun.amqp_open20191212.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("amqp-open", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Creates a pair of static username and password. If you access an ApsaraMQ for RabbitMQ broker from an open source RabbitMQ client, you must use a pair of username and password for authentication. You can access the ApsaraMQ for RabbitMQ broker only after the authentication is passed. ApsaraMQ for RabbitMQ allows you to generate usernames and passwords by using AccessKey pairs provided by Alibaba Cloud Resource Access Management (RAM).</p>
     * 
     * @param request CreateAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountAccessKey)) {
            query.put("accountAccessKey", request.accountAccessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimestamp)) {
            query.put("createTimestamp", request.createTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretSign)) {
            query.put("secretSign", request.secretSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("userName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccount"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a pair of static username and password. If you access an ApsaraMQ for RabbitMQ broker from an open source RabbitMQ client, you must use a pair of username and password for authentication. You can access the ApsaraMQ for RabbitMQ broker only after the authentication is passed. ApsaraMQ for RabbitMQ allows you to generate usernames and passwords by using AccessKey pairs provided by Alibaba Cloud Resource Access Management (RAM).</p>
     * 
     * @param request CreateAccountRequest
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a binding. In ApsaraMQ for RabbitMQ, after a producer sends a message to an exchange, the exchange routes the message to a queue or another exchange based on the binding relationship and the routing rule.</p>
     * 
     * @param request CreateBindingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBindingResponse
     */
    public CreateBindingResponse createBindingWithOptions(CreateBindingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.argument)) {
            body.put("Argument", request.argument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindingKey)) {
            body.put("BindingKey", request.bindingKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindingType)) {
            body.put("BindingType", request.bindingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationName)) {
            body.put("DestinationName", request.destinationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceExchange)) {
            body.put("SourceExchange", request.sourceExchange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualHost)) {
            body.put("VirtualHost", request.virtualHost);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBinding"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBindingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a binding. In ApsaraMQ for RabbitMQ, after a producer sends a message to an exchange, the exchange routes the message to a queue or another exchange based on the binding relationship and the routing rule.</p>
     * 
     * @param request CreateBindingRequest
     * @return CreateBindingResponse
     */
    public CreateBindingResponse createBinding(CreateBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBindingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an exchange. In ApsaraMQ for RabbitMQ, an exchange is used to route a message that is received from a producer to one or more queues or to discard the message. An exchange routes a message to queues by using the routing key and binding keys.</p>
     * 
     * @param request CreateExchangeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExchangeResponse
     */
    public CreateExchangeResponse createExchangeWithOptions(CreateExchangeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alternateExchange)) {
            body.put("AlternateExchange", request.alternateExchange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDeleteState)) {
            body.put("AutoDeleteState", request.autoDeleteState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exchangeName)) {
            body.put("ExchangeName", request.exchangeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exchangeType)) {
            body.put("ExchangeType", request.exchangeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internal)) {
            body.put("Internal", request.internal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualHost)) {
            body.put("VirtualHost", request.virtualHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XDelayedType)) {
            body.put("XDelayedType", request.XDelayedType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExchange"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExchangeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an exchange. In ApsaraMQ for RabbitMQ, an exchange is used to route a message that is received from a producer to one or more queues or to discard the message. An exchange routes a message to queues by using the routing key and binding keys.</p>
     * 
     * @param request CreateExchangeRequest
     * @return CreateExchangeResponse
     */
    public CreateExchangeResponse createExchange(CreateExchangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExchangeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例-基于 openAPI 构建南天门购买工单信息数据</p>
     * 
     * @param request CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewPeriod)) {
            query.put("AutoRenewPeriod", request.autoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConnections)) {
            query.put("MaxConnections", request.maxConnections);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxEipTps)) {
            query.put("MaxEipTps", request.maxEipTps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPrivateTps)) {
            query.put("MaxPrivateTps", request.maxPrivateTps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodCycle)) {
            query.put("PeriodCycle", request.periodCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueCapacity)) {
            query.put("QueueCapacity", request.queueCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewStatus)) {
            query.put("RenewStatus", request.renewStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewalDurationUnit)) {
            query.put("RenewalDurationUnit", request.renewalDurationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessChargeType)) {
            query.put("ServerlessChargeType", request.serverlessChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSize)) {
            query.put("StorageSize", request.storageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportEip)) {
            query.put("SupportEip", request.supportEip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportTracing)) {
            query.put("SupportTracing", request.supportTracing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracingStorageTime)) {
            query.put("TracingStorageTime", request.tracingStorageTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例-基于 openAPI 构建南天门购买工单信息数据</p>
     * 
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a queue. In ApsaraMQ for RabbitMQ, a queue is a message queue. All messages in ApsaraMQ for RabbitMQ are sent to a specific exchange and then routed to a bound queue by the exchange.</p>
     * 
     * @param request CreateQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQueueResponse
     */
    public CreateQueueResponse createQueueWithOptions(CreateQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoDeleteState)) {
            body.put("AutoDeleteState", request.autoDeleteState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoExpireState)) {
            body.put("AutoExpireState", request.autoExpireState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deadLetterExchange)) {
            body.put("DeadLetterExchange", request.deadLetterExchange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deadLetterRoutingKey)) {
            body.put("DeadLetterRoutingKey", request.deadLetterRoutingKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exclusiveState)) {
            body.put("ExclusiveState", request.exclusiveState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxLength)) {
            body.put("MaxLength", request.maxLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumPriority)) {
            body.put("MaximumPriority", request.maximumPriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageTTL)) {
            body.put("MessageTTL", request.messageTTL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            body.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualHost)) {
            body.put("VirtualHost", request.virtualHost);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQueue"),
            new TeaPair("version", "2019-12-12"),
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
     * <p>Creates a queue. In ApsaraMQ for RabbitMQ, a queue is a message queue. All messages in ApsaraMQ for RabbitMQ are sent to a specific exchange and then routed to a bound queue by the exchange.</p>
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
     * <p>Creates a vhost. A vhost is used to logically isolate resources. Each vhost manages its own exchanges, queues, and bindings. Applications can run on independent vhosts in a secure manner. This way, the business of an application is not affected by other applications. Before you connect producers and consumers to an ApsaraMQ for RabbitMQ instance, you must specify vhosts for the producers and consumers.</p>
     * 
     * @param request CreateVirtualHostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVirtualHostResponse
     */
    public CreateVirtualHostResponse createVirtualHostWithOptions(CreateVirtualHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualHost)) {
            body.put("VirtualHost", request.virtualHost);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVirtualHost"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVirtualHostResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a vhost. A vhost is used to logically isolate resources. Each vhost manages its own exchanges, queues, and bindings. Applications can run on independent vhosts in a secure manner. This way, the business of an application is not affected by other applications. Before you connect producers and consumers to an ApsaraMQ for RabbitMQ instance, you must specify vhosts for the producers and consumers.</p>
     * 
     * @param request CreateVirtualHostRequest
     * @return CreateVirtualHostResponse
     */
    public CreateVirtualHostResponse createVirtualHost(CreateVirtualHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVirtualHostWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a pair of username and password.</p>
     * 
     * @param request DeleteAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimestamp)) {
            query.put("CreateTimestamp", request.createTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccount"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a pair of username and password.</p>
     * 
     * @param request DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a binding to unbind a queue or an exchange from a source exchange.</p>
     * 
     * @param request DeleteBindingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBindingResponse
     */
    public DeleteBindingResponse deleteBindingWithOptions(DeleteBindingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindingKey)) {
            body.put("BindingKey", request.bindingKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindingType)) {
            body.put("BindingType", request.bindingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationName)) {
            body.put("DestinationName", request.destinationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceExchange)) {
            body.put("SourceExchange", request.sourceExchange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualHost)) {
            body.put("VirtualHost", request.virtualHost);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBinding"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBindingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a binding to unbind a queue or an exchange from a source exchange.</p>
     * 
     * @param request DeleteBindingRequest
     * @return DeleteBindingResponse
     */
    public DeleteBindingResponse deleteBinding(DeleteBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBindingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>You cannot delete exchanges of the <strong>headers</strong> and <strong>x-jms-topic</strong> types.</li>
     * <li>You cannot delete built-in exchanges in a vhost. These exchanges are amq.direct, amq.topic, and amq.fanout.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an exchange.</p>
     * 
     * @param request DeleteExchangeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExchangeResponse
     */
    public DeleteExchangeResponse deleteExchangeWithOptions(DeleteExchangeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exchangeName)) {
            body.put("ExchangeName", request.exchangeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualHost)) {
            body.put("VirtualHost", request.virtualHost);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExchange"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExchangeResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>You cannot delete exchanges of the <strong>headers</strong> and <strong>x-jms-topic</strong> types.</li>
     * <li>You cannot delete built-in exchanges in a vhost. These exchanges are amq.direct, amq.topic, and amq.fanout.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an exchange.</p>
     * 
     * @param request DeleteExchangeRequest
     * @return DeleteExchangeResponse
     */
    public DeleteExchangeResponse deleteExchange(DeleteExchangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExchangeWithOptions(request, runtime);
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
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            body.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualHost)) {
            body.put("VirtualHost", request.virtualHost);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQueue"),
            new TeaPair("version", "2019-12-12"),
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
     * <b>description</b> :
     * <p>Before you delete a vhost, make sure that all exchanges and queues in the vhost are deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a virtual host (vhost).</p>
     * 
     * @param request DeleteVirtualHostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVirtualHostResponse
     */
    public DeleteVirtualHostResponse deleteVirtualHostWithOptions(DeleteVirtualHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualHost)) {
            body.put("VirtualHost", request.virtualHost);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVirtualHost"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVirtualHostResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a vhost, make sure that all exchanges and queues in the vhost are deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a virtual host (vhost).</p>
     * 
     * @param request DeleteVirtualHostRequest
     * @return DeleteVirtualHostResponse
     */
    public DeleteVirtualHostResponse deleteVirtualHost(DeleteVirtualHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVirtualHostWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the maximum number of vhosts, exchanges, and queues that you can create and the number of created vhosts, exchanges, and queues on an ApsaraMQ for RabbitMQ instance.</p>
     * 
     * @param request GetMetadataAmountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetadataAmountResponse
     */
    public GetMetadataAmountResponse getMetadataAmountWithOptions(GetMetadataAmountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetadataAmount"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetadataAmountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the maximum number of vhosts, exchanges, and queues that you can create and the number of created vhosts, exchanges, and queues on an ApsaraMQ for RabbitMQ instance.</p>
     * 
     * @param request GetMetadataAmountRequest
     * @return GetMetadataAmountResponse
     */
    public GetMetadataAmountResponse getMetadataAmount(GetMetadataAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetadataAmountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the static username and password of an ApsaraMQ for RabbitMQ.</p>
     * 
     * @param request ListAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccountsResponse
     */
    public ListAccountsResponse listAccountsWithOptions(ListAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccounts"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the static username and password of an ApsaraMQ for RabbitMQ.</p>
     * 
     * @param request ListAccountsRequest
     * @return ListAccountsResponse
     */
    public ListAccountsResponse listAccounts(ListAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all bindings of a virtual host (vhost) on an ApsaraMQ for RabbitMQ instance.</p>
     * 
     * @param request ListBindingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBindingsResponse
     */
    public ListBindingsResponse listBindingsWithOptions(ListBindingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBindings"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBindingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all bindings of a virtual host (vhost) on an ApsaraMQ for RabbitMQ instance.</p>
     * 
     * @param request ListBindingsRequest
     * @return ListBindingsResponse
     */
    public ListBindingsResponse listBindings(ListBindingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBindingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all exchanges or queues to which an exchange is bound.</p>
     * 
     * @param request ListDownStreamBindingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDownStreamBindingsResponse
     */
    public ListDownStreamBindingsResponse listDownStreamBindingsWithOptions(ListDownStreamBindingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDownStreamBindings"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDownStreamBindingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all exchanges or queues to which an exchange is bound.</p>
     * 
     * @param request ListDownStreamBindingsRequest
     * @return ListDownStreamBindingsResponse
     */
    public ListDownStreamBindingsResponse listDownStreamBindings(ListDownStreamBindingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDownStreamBindingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all queues or exchanges that are bound to an exchange.</p>
     * 
     * @param request ListExchangeUpStreamBindingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExchangeUpStreamBindingsResponse
     */
    public ListExchangeUpStreamBindingsResponse listExchangeUpStreamBindingsWithOptions(ListExchangeUpStreamBindingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExchangeUpStreamBindings"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExchangeUpStreamBindingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all queues or exchanges that are bound to an exchange.</p>
     * 
     * @param request ListExchangeUpStreamBindingsRequest
     * @return ListExchangeUpStreamBindingsResponse
     */
    public ListExchangeUpStreamBindingsResponse listExchangeUpStreamBindings(ListExchangeUpStreamBindingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExchangeUpStreamBindingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all exchanges that are created in a virtual host (vhost).</p>
     * 
     * @param request ListExchangesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExchangesResponse
     */
    public ListExchangesResponse listExchangesWithOptions(ListExchangesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExchanges"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExchangesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all exchanges that are created in a virtual host (vhost).</p>
     * 
     * @param request ListExchangesRequest
     * @return ListExchangesResponse
     */
    public ListExchangesResponse listExchanges(ListExchangesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExchangesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all AparaMQ for RabbitMQ instances in a region. The returned data includes the basic information, endpoint, and specification limits of each instance.</p>
     * 
     * @param request ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all AparaMQ for RabbitMQ instances in a region. The returned data includes the basic information, endpoint, and specification limits of each instance.</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>ApsaraMQ for RabbitMQ allows you to query only online consumers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the online consumers of a queue.</p>
     * 
     * @param request ListQueueConsumersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQueueConsumersResponse
     */
    public ListQueueConsumersResponse listQueueConsumersWithOptions(ListQueueConsumersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueueConsumers"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueueConsumersResponse());
    }

    /**
     * <b>description</b> :
     * <p>ApsaraMQ for RabbitMQ allows you to query only online consumers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the online consumers of a queue.</p>
     * 
     * @param request ListQueueConsumersRequest
     * @return ListQueueConsumersResponse
     */
    public ListQueueConsumersResponse listQueueConsumers(ListQueueConsumersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQueueConsumersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the exchanges that are bound to a queue.</p>
     * 
     * @param request ListQueueUpStreamBindingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQueueUpStreamBindingsResponse
     */
    public ListQueueUpStreamBindingsResponse listQueueUpStreamBindingsWithOptions(ListQueueUpStreamBindingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueueUpStreamBindings"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueueUpStreamBindingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the exchanges that are bound to a queue.</p>
     * 
     * @param request ListQueueUpStreamBindingsRequest
     * @return ListQueueUpStreamBindingsResponse
     */
    public ListQueueUpStreamBindingsResponse listQueueUpStreamBindings(ListQueueUpStreamBindingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQueueUpStreamBindingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all queues in a vhost of an ApsaraMQ for RabbitMQ instance.</p>
     * 
     * @param request ListQueuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQueuesResponse
     */
    public ListQueuesResponse listQueuesWithOptions(ListQueuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueues"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueuesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all queues in a vhost of an ApsaraMQ for RabbitMQ instance.</p>
     * 
     * @param request ListQueuesRequest
     * @return ListQueuesResponse
     */
    public ListQueuesResponse listQueues(ListQueuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQueuesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all virtual hosts (vhosts) on an ApsaraMQ for RabbitMQ instance.</p>
     * 
     * @param request ListVirtualHostsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVirtualHostsResponse
     */
    public ListVirtualHostsResponse listVirtualHostsWithOptions(ListVirtualHostsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVirtualHosts"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVirtualHostsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all virtual hosts (vhosts) on an ApsaraMQ for RabbitMQ instance.</p>
     * 
     * @param request ListVirtualHostsRequest
     * @return ListVirtualHostsResponse
     */
    public ListVirtualHostsResponse listVirtualHosts(ListVirtualHostsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVirtualHostsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变更实例，升降配</p>
     * 
     * @param request UpdateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConnections)) {
            query.put("MaxConnections", request.maxConnections);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxEipTps)) {
            query.put("MaxEipTps", request.maxEipTps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPrivateTps)) {
            query.put("MaxPrivateTps", request.maxPrivateTps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            query.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueCapacity)) {
            query.put("QueueCapacity", request.queueCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessChargeType)) {
            query.put("ServerlessChargeType", request.serverlessChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSize)) {
            query.put("StorageSize", request.storageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportEip)) {
            query.put("SupportEip", request.supportEip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportTracing)) {
            query.put("SupportTracing", request.supportTracing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracingStorageTime)) {
            query.put("TracingStorageTime", request.tracingStorageTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变更实例，升降配</p>
     * 
     * @param request UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the name of an ApsaraMQ for RabbitMQ instance. After an ApsaraMQ for RabbitMQ instance is created, the ID of the instance is used as its name by default. You can specify a custom name for an instance to facilitate instance identification.</p>
     * 
     * @param request UpdateInstanceNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceNameWithOptions(UpdateInstanceNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceName"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the name of an ApsaraMQ for RabbitMQ instance. After an ApsaraMQ for RabbitMQ instance is created, the ID of the instance is used as its name by default. You can specify a custom name for an instance to facilitate instance identification.</p>
     * 
     * @param request UpdateInstanceNameRequest
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceNameWithOptions(request, runtime);
    }
}
