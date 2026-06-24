// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212;

import com.aliyun.tea.*;
import com.aliyun.amqp_open20191212.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("us-west-1", "amqp-open.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "amqp-open.us-east-1.aliyuncs.com"),
            new TeaPair("me-central-1", "amqp-open.me-central-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "amqp-open.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-jva", "amqp-open.cn-zhengzhou-jva.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "amqp-open.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "amqp-open.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "amqp-open.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "amqp-open.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shanghai", "amqp-open.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-qingdao", "amqp-open.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "amqp-open.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-hongkong", "amqp-open.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "amqp-open.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "amqp-open.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "amqp-open.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "amqp-open.cn-beijing-finance-1.aliyuncs.com"),
            new TeaPair("cn-beijing", "amqp-open.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "amqp-open.ap-southeast-7.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "amqp-open.ap-southeast-6.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "amqp-open.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "amqp-open.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "amqp-open.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "amqp-open.ap-northeast-1.aliyuncs.com")
        );
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
     * <p>Adds an entry to the whitelist of an instance.</p>
     * 
     * @param tmpReq AddInstanceWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddInstanceWhiteListResponse
     */
    public AddInstanceWhiteListResponse addInstanceWhiteListWithOptions(AddInstanceWhiteListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddInstanceWhiteListShrinkRequest request = new AddInstanceWhiteListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.whiteListItem)) {
            request.whiteListItemShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.whiteListItem, "WhiteListItem", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteListItemShrink)) {
            query.put("WhiteListItem", request.whiteListItemShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteListType)) {
            query.put("WhiteListType", request.whiteListType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddInstanceWhiteList"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddInstanceWhiteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an entry to the whitelist of an instance.</p>
     * 
     * @param request AddInstanceWhiteListRequest
     * @return AddInstanceWhiteListResponse
     */
    public AddInstanceWhiteListResponse addInstanceWhiteList(AddInstanceWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addInstanceWhiteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>When an open-source client accesses an ApsaraMQ for RabbitMQ server, it must provide a username and password for authentication. ApsaraMQ for RabbitMQ lets you generate a username and password from an AccessKey ID and AccessKey secret provided by Resource Access Management (RAM).</p>
     * 
     * @param request CreateAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

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
     * <p>When an open-source client accesses an ApsaraMQ for RabbitMQ server, it must provide a username and password for authentication. ApsaraMQ for RabbitMQ lets you generate a username and password from an AccessKey ID and AccessKey secret provided by Resource Access Management (RAM).</p>
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
     * <p>A producer sends a message to an exchange, which then routes the message to a specified queue or another exchange based on the binding and routing rules.</p>
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
     * <p>A producer sends a message to an exchange, which then routes the message to a specified queue or another exchange based on the binding and routing rules.</p>
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
     * <p>A producer sends a message to an exchange. The exchange then routes the message to one or more queues based on the routing key and the binding key, or discards the message.</p>
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
     * <p>A producer sends a message to an exchange. The exchange then routes the message to one or more queues based on the routing key and the binding key, or discards the message.</p>
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
     * <p>Creates an ApsaraMQ for RabbitMQ instance.</p>
     * 
     * @param tmpReq CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateInstanceShrinkRequest request = new CreateInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vswitchIds)) {
            request.vswitchIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vswitchIds, "VswitchIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authModel)) {
            query.put("AuthModel", request.authModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewPeriod)) {
            query.put("AutoRenewPeriod", request.autoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptedInstance)) {
            query.put("EncryptedInstance", request.encryptedInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            query.put("KmsKeyId", request.kmsKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerMode)) {
            query.put("ListenerMode", request.listenerMode);
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

        if (!com.aliyun.teautil.Common.isUnset(request.provisionedCapacity)) {
            query.put("ProvisionedCapacity", request.provisionedCapacity);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessChargeType)) {
            query.put("ServerlessChargeType", request.serverlessChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessSwitch)) {
            query.put("ServerlessSwitch", request.serverlessSwitch);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracingStorageTime)) {
            query.put("TracingStorageTime", request.tracingStorageTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchIdsShrink)) {
            query.put("VswitchIds", request.vswitchIdsShrink);
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
     * <p>Creates an ApsaraMQ for RabbitMQ instance.</p>
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
     * <p>Creates an open-source username and password.</p>
     * 
     * @param request CreateOpenSourceAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOpenSourceAccountResponse
     */
    public CreateOpenSourceAccountResponse createOpenSourceAccountWithOptions(CreateOpenSourceAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOpenSourceAccount"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOpenSourceAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an open-source username and password.</p>
     * 
     * @param request CreateOpenSourceAccountRequest
     * @return CreateOpenSourceAccountResponse
     */
    public CreateOpenSourceAccountResponse createOpenSourceAccount(CreateOpenSourceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOpenSourceAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an open source permission.</p>
     * 
     * @param request CreateOpenSourcePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOpenSourcePermissionResponse
     */
    public CreateOpenSourcePermissionResponse createOpenSourcePermissionWithOptions(CreateOpenSourcePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configure)) {
            query.put("Configure", request.configure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.read)) {
            query.put("Read", request.read);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhost)) {
            query.put("Vhost", request.vhost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.write)) {
            query.put("Write", request.write);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOpenSourcePermission"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOpenSourcePermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an open source permission.</p>
     * 
     * @param request CreateOpenSourcePermissionRequest
     * @return CreateOpenSourcePermissionResponse
     */
    public CreateOpenSourcePermissionResponse createOpenSourcePermission(CreateOpenSourcePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOpenSourcePermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>A queue is a buffer that stores messages. In ApsaraMQ for RabbitMQ, messages are sent to a specified exchange and then routed to a bound queue.</p>
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
     * <p>A queue is a buffer that stores messages. In ApsaraMQ for RabbitMQ, messages are sent to a specified exchange and then routed to a bound queue.</p>
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
     * <p>Deletes a static username and password.</p>
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
     * <p>Deletes a static username and password.</p>
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
     * <p>The DeleteBinding operation detaches a source exchange from a target queue or another exchange.</p>
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
     * <p>The DeleteBinding operation detaches a source exchange from a target queue or another exchange.</p>
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
     * <h2>Usage notes</h2>
     * <ul>
     * <li>You cannot delete exchanges with the type <strong>headers</strong>.</li>
     * <li>You cannot delete the three built-in exchanges in a vhost: amq.direct, amq.topic, or amq.fanout.</li>
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
     * <h2>Usage notes</h2>
     * <ul>
     * <li>You cannot delete exchanges with the type <strong>headers</strong>.</li>
     * <li>You cannot delete the three built-in exchanges in a vhost: amq.direct, amq.topic, or amq.fanout.</li>
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
     * <p>Deletes the username and password of an open-source user.</p>
     * 
     * @param request DeleteOpenSourceAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOpenSourceAccountResponse
     */
    public DeleteOpenSourceAccountResponse deleteOpenSourceAccountWithOptions(DeleteOpenSourceAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOpenSourceAccount"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOpenSourceAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the username and password of an open-source user.</p>
     * 
     * @param request DeleteOpenSourceAccountRequest
     * @return DeleteOpenSourceAccountResponse
     */
    public DeleteOpenSourceAccountResponse deleteOpenSourceAccount(DeleteOpenSourceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOpenSourceAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an open source permission.</p>
     * 
     * @param request DeleteOpenSourcePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOpenSourcePermissionResponse
     */
    public DeleteOpenSourcePermissionResponse deleteOpenSourcePermissionWithOptions(DeleteOpenSourcePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhost)) {
            query.put("Vhost", request.vhost);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOpenSourcePermission"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOpenSourcePermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an open source permission.</p>
     * 
     * @param request DeleteOpenSourcePermissionRequest
     * @return DeleteOpenSourcePermissionResponse
     */
    public DeleteOpenSourcePermissionResponse deleteOpenSourcePermission(DeleteOpenSourcePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOpenSourcePermissionWithOptions(request, runtime);
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
     * <p>Before you delete a vhost, you must delete all exchanges and queues in it.</p>
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
     * <p>Before you delete a vhost, you must delete all exchanges and queues in it.</p>
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
     * <p>Retrieves the details of an ApsaraMQ for RabbitMQ instance.</p>
     * 
     * @param request GetInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an ApsaraMQ for RabbitMQ instance.</p>
     * 
     * @param request GetInstanceRequest
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the current and maximum numbers of vhosts, exchanges, and queues for a specified ApsaraMQ for RabbitMQ instance.</p>
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
     * <p>Queries the current and maximum numbers of vhosts, exchanges, and queues for a specified ApsaraMQ for RabbitMQ instance.</p>
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
     * <p>Lists the usernames and passwords for a specified ApsaraMQ for RabbitMQ instance.</p>
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
     * <p>Lists the usernames and passwords for a specified ApsaraMQ for RabbitMQ instance.</p>
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
     * <p>Queries all bindings that are created in a vhost of a specified ApsaraMQ for RabbitMQ instance.</p>
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
     * <p>Queries all bindings that are created in a vhost of a specified ApsaraMQ for RabbitMQ instance.</p>
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
     * <p>Queries the exchanges or queues that are bound to a specified exchange.</p>
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
     * <p>Queries the exchanges or queues that are bound to a specified exchange.</p>
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
     * <p>Queries the queues or other exchanges that are bound to a specified exchange.</p>
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
     * <p>Queries the queues or other exchanges that are bound to a specified exchange.</p>
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
     * <p>Lists all exchanges in a specified vhost of an instance.</p>
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
     * <p>Lists all exchanges in a specified vhost of an instance.</p>
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
     * <p>Queries the IP or VPC whitelist for an instance.</p>
     * 
     * @param request ListInstanceWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceWhiteListResponse
     */
    public ListInstanceWhiteListResponse listInstanceWhiteListWithOptions(ListInstanceWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteListType)) {
            query.put("whiteListType", request.whiteListType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceWhiteList"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceWhiteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IP or VPC whitelist for an instance.</p>
     * 
     * @param request ListInstanceWhiteListRequest
     * @return ListInstanceWhiteListResponse
     */
    public ListInstanceWhiteListResponse listInstanceWhiteList(ListInstanceWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceWhiteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of ApsaraMQ for RabbitMQ instances in a specified region and returns basic information about each instance, such as its endpoints and specification limits.</p>
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
     * <p>Queries a list of ApsaraMQ for RabbitMQ instances in a specified region and returns basic information about each instance, such as its endpoints and specification limits.</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enumerates open-source usernames and passwords.</p>
     * 
     * @param request ListOpenSourceAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOpenSourceAccountsResponse
     */
    public ListOpenSourceAccountsResponse listOpenSourceAccountsWithOptions(ListOpenSourceAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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
            new TeaPair("action", "ListOpenSourceAccounts"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOpenSourceAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enumerates open-source usernames and passwords.</p>
     * 
     * @param request ListOpenSourceAccountsRequest
     * @return ListOpenSourceAccountsResponse
     */
    public ListOpenSourceAccountsResponse listOpenSourceAccounts(ListOpenSourceAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOpenSourceAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists open source permissions.</p>
     * 
     * @param request ListOpenSourcePermissionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOpenSourcePermissionsResponse
     */
    public ListOpenSourcePermissionsResponse listOpenSourcePermissionsWithOptions(ListOpenSourcePermissionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOpenSourcePermissions"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOpenSourcePermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists open source permissions.</p>
     * 
     * @param request ListOpenSourcePermissionsRequest
     * @return ListOpenSourcePermissionsResponse
     */
    public ListOpenSourcePermissionsResponse listOpenSourcePermissions(ListOpenSourcePermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOpenSourcePermissionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>ApsaraMQ for RabbitMQ lets you query only online consumer clients. You cannot query offline consumer clients.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the online consumer clients of a specified queue.</p>
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
     * <p>ApsaraMQ for RabbitMQ lets you query only online consumer clients. You cannot query offline consumer clients.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the online consumer clients of a specified queue.</p>
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
     * <p>Queries the exchanges that are bound to a specified queue.</p>
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
     * <p>Queries the exchanges that are bound to a specified queue.</p>
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
     * <p>Queries information about all queues in a vhost on a specified ApsaraMQ for RabbitMQ instance.</p>
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
     * <p>Queries information about all queues in a vhost on a specified ApsaraMQ for RabbitMQ instance.</p>
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
     * <p>Lists all vhosts in a specified ApsaraMQ for RabbitMQ instance.</p>
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
     * <p>Lists all vhosts in a specified ApsaraMQ for RabbitMQ instance.</p>
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
     * <p>Removes an IP address or a VPC from an instance\&quot;s whitelist.</p>
     * 
     * @param request RemoveInstanceWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveInstanceWhiteListResponse
     */
    public RemoveInstanceWhiteListResponse removeInstanceWhiteListWithOptions(RemoveInstanceWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteListItemId)) {
            query.put("whiteListItemId", request.whiteListItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteListType)) {
            query.put("whiteListType", request.whiteListType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveInstanceWhiteList"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveInstanceWhiteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes an IP address or a VPC from an instance\&quot;s whitelist.</p>
     * 
     * @param request RemoveInstanceWhiteListRequest
     * @return RemoveInstanceWhiteListResponse
     */
    public RemoveInstanceWhiteListResponse removeInstanceWhiteList(RemoveInstanceWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeInstanceWhiteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades or downgrades the specifications of an ApsaraMQ for RabbitMQ instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptedInstance)) {
            query.put("EncryptedInstance", request.encryptedInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            query.put("KmsKeyId", request.kmsKeyId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.provisionedCapacity)) {
            query.put("ProvisionedCapacity", request.provisionedCapacity);
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
     * <p>Upgrades or downgrades the specifications of an ApsaraMQ for RabbitMQ instance.</p>
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
     * <p>An ApsaraMQ for RabbitMQ instance is named after its instance ID by default. You can change the name for easier identification.</p>
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
     * <p>An ApsaraMQ for RabbitMQ instance is named after its instance ID by default. You can change the name for easier identification.</p>
     * 
     * @param request UpdateInstanceNameRequest
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update serverless switch</p>
     * 
     * @param request UpdateInstanceServerlessSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceServerlessSwitchResponse
     */
    public UpdateInstanceServerlessSwitchResponse updateInstanceServerlessSwitchWithOptions(UpdateInstanceServerlessSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessSwitch)) {
            query.put("ServerlessSwitch", request.serverlessSwitch);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceServerlessSwitch"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceServerlessSwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update serverless switch</p>
     * 
     * @param request UpdateInstanceServerlessSwitchRequest
     * @return UpdateInstanceServerlessSwitchResponse
     */
    public UpdateInstanceServerlessSwitchResponse updateInstanceServerlessSwitch(UpdateInstanceServerlessSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceServerlessSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the username and password for open-source access.</p>
     * 
     * @param request UpdateOpenSourceAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOpenSourceAccountResponse
     */
    public UpdateOpenSourceAccountResponse updateOpenSourceAccountWithOptions(UpdateOpenSourceAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOpenSourceAccount"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOpenSourceAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the username and password for open-source access.</p>
     * 
     * @param request UpdateOpenSourceAccountRequest
     * @return UpdateOpenSourceAccountResponse
     */
    public UpdateOpenSourceAccountResponse updateOpenSourceAccount(UpdateOpenSourceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOpenSourceAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates open source permissions.</p>
     * 
     * @param request UpdateOpenSourcePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOpenSourcePermissionResponse
     */
    public UpdateOpenSourcePermissionResponse updateOpenSourcePermissionWithOptions(UpdateOpenSourcePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configure)) {
            query.put("Configure", request.configure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.read)) {
            query.put("Read", request.read);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhost)) {
            query.put("Vhost", request.vhost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.write)) {
            query.put("Write", request.write);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOpenSourcePermission"),
            new TeaPair("version", "2019-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOpenSourcePermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates open source permissions.</p>
     * 
     * @param request UpdateOpenSourcePermissionRequest
     * @return UpdateOpenSourcePermissionResponse
     */
    public UpdateOpenSourcePermissionResponse updateOpenSourcePermission(UpdateOpenSourcePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOpenSourcePermissionWithOptions(request, runtime);
    }
}
