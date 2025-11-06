// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901;

import com.aliyun.tea.*;
import com.aliyun.amqp20190901.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("amqp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>路由绑定</p>
     * 
     * @param request BindRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindResponse
     */
    public BindResponse bindWithOptions(BindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.argument)) {
            query.put("Argument", request.argument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindingKey)) {
            query.put("BindingKey", request.bindingKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindingType)) {
            query.put("BindingType", request.bindingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstName)) {
            query.put("DstName", request.dstName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcName)) {
            query.put("SrcName", request.srcName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Bind"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>路由绑定</p>
     * 
     * @param request BindRequest
     * @return BindResponse
     */
    public BindResponse bind(BindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户配置</p>
     * 
     * @param request CancelUserSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelUserSettingResponse
     */
    public CancelUserSettingResponse cancelUserSettingWithOptions(CancelUserSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelUserSetting"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelUserSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户配置</p>
     * 
     * @param request CancelUserSettingRequest
     * @return CancelUserSettingResponse
     */
    public CancelUserSettingResponse cancelUserSetting(CancelUserSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelUserSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增用户配置</p>
     * 
     * @param request ConfigureUserSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureUserSettingResponse
     */
    public ConfigureUserSettingResponse configureUserSettingWithOptions(ConfigureUserSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            query.put("Logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.putType)) {
            query.put("PutType", request.putType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureUserSetting"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureUserSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增用户配置</p>
     * 
     * @param request ConfigureUserSettingRequest
     * @return ConfigureUserSettingResponse
     */
    public ConfigureUserSettingResponse configureUserSetting(ConfigureUserSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureUserSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>清除售后视角状态</p>
     * 
     * @param request ConsoleClearPretendStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConsoleClearPretendStatusResponse
     */
    public ConsoleClearPretendStatusResponse consoleClearPretendStatusWithOptions(ConsoleClearPretendStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConsoleClearPretendStatus"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConsoleClearPretendStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>清除售后视角状态</p>
     * 
     * @param request ConsoleClearPretendStatusRequest
     * @return ConsoleClearPretendStatusResponse
     */
    public ConsoleClearPretendStatusResponse consoleClearPretendStatus(ConsoleClearPretendStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.consoleClearPretendStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存售后视角状态</p>
     * 
     * @param request ConsoleSavePretendStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConsoleSavePretendStatusResponse
     */
    public ConsoleSavePretendStatusResponse consoleSavePretendStatusWithOptions(ConsoleSavePretendStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConsoleSavePretendStatus"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConsoleSavePretendStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存售后视角状态</p>
     * 
     * @param request ConsoleSavePretendStatusRequest
     * @return ConsoleSavePretendStatusResponse
     */
    public ConsoleSavePretendStatusResponse consoleSavePretendStatus(ConsoleSavePretendStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.consoleSavePretendStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建云监控相关角色</p>
     * 
     * @param request CreateCloudMonitorSLRRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudMonitorSLRResponse
     */
    public CreateCloudMonitorSLRResponse createCloudMonitorSLRWithOptions(CreateCloudMonitorSLRRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudMonitorSLR"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudMonitorSLRResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建云监控相关角色</p>
     * 
     * @param request CreateCloudMonitorSLRRequest
     * @return CreateCloudMonitorSLRResponse
     */
    public CreateCloudMonitorSLRResponse createCloudMonitorSLR(CreateCloudMonitorSLRRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudMonitorSLRWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Exchange</p>
     * 
     * @param request CreateExchangeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExchangeResponse
     */
    public CreateExchangeResponse createExchangeWithOptions(CreateExchangeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alternateExchange)) {
            query.put("AlternateExchange", request.alternateExchange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDelete)) {
            query.put("AutoDelete", request.autoDelete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exchangeName)) {
            query.put("ExchangeName", request.exchangeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exchangeType)) {
            query.put("ExchangeType", request.exchangeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internal)) {
            query.put("Internal", request.internal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XDelayedType)) {
            query.put("XDelayedType", request.XDelayedType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XHashHeader)) {
            query.put("XHashHeader", request.XHashHeader);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExchange"),
            new TeaPair("version", "2019-09-01"),
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
     * <p>创建Exchange</p>
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
     * <p>创建日志相关角色</p>
     * 
     * @param request CreateLogDeliverySLRRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLogDeliverySLRResponse
     */
    public CreateLogDeliverySLRResponse createLogDeliverySLRWithOptions(CreateLogDeliverySLRRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLogDeliverySLR"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLogDeliverySLRResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建日志相关角色</p>
     * 
     * @param request CreateLogDeliverySLRRequest
     * @return CreateLogDeliverySLRResponse
     */
    public CreateLogDeliverySLRResponse createLogDeliverySLR(CreateLogDeliverySLRRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLogDeliverySLRWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建队列</p>
     * 
     * @param request CreateQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQueueResponse
     */
    public CreateQueueResponse createQueueWithOptions(CreateQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoDelete)) {
            query.put("AutoDelete", request.autoDelete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoExpire)) {
            query.put("AutoExpire", request.autoExpire);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deadLetterExchange)) {
            query.put("DeadLetterExchange", request.deadLetterExchange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deadLetterRoutingKey)) {
            query.put("DeadLetterRoutingKey", request.deadLetterRoutingKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exclusive)) {
            query.put("Exclusive", request.exclusive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxLength)) {
            query.put("MaxLength", request.maxLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximunPrioty)) {
            query.put("MaximunPrioty", request.maximunPrioty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageTTL)) {
            query.put("MessageTTL", request.messageTTL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ordered)) {
            query.put("Ordered", request.ordered);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryInherit)) {
            query.put("RetryInherit", request.retryInherit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryInterval)) {
            query.put("RetryInterval", request.retryInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryTimes)) {
            query.put("RetryTimes", request.retryTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.singleActiveConsumer)) {
            query.put("SingleActiveConsumer", request.singleActiveConsumer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQueue"),
            new TeaPair("version", "2019-09-01"),
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
     * <p>创建队列</p>
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
     * <p>创建Vhost</p>
     * 
     * @param request CreateVhostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVhostResponse
     */
    public CreateVhostResponse createVhostWithOptions(CreateVhostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVhost"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVhostResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Vhost</p>
     * 
     * @param request CreateVhostRequest
     * @return CreateVhostResponse
     */
    public CreateVhostResponse createVhost(CreateVhostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVhostWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>prometheus Dashboard 检查相关服务开通状态</p>
     * 
     * @param request DashboardCheckServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DashboardCheckServiceStatusResponse
     */
    public DashboardCheckServiceStatusResponse dashboardCheckServiceStatusWithOptions(DashboardCheckServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DashboardCheckServiceStatus"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DashboardCheckServiceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>prometheus Dashboard 检查相关服务开通状态</p>
     * 
     * @param request DashboardCheckServiceStatusRequest
     * @return DashboardCheckServiceStatusResponse
     */
    public DashboardCheckServiceStatusResponse dashboardCheckServiceStatus(DashboardCheckServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dashboardCheckServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取 arms grafana 大盘 http url</p>
     * 
     * @param request DashboardListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DashboardListResponse
     */
    public DashboardListResponse dashboardListWithOptions(DashboardListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dashboardName)) {
            query.put("DashboardName", request.dashboardName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DashboardList"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DashboardListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取 arms grafana 大盘 http url</p>
     * 
     * @param request DashboardListRequest
     * @return DashboardListResponse
     */
    public DashboardListResponse dashboardList(DashboardListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dashboardListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Exchange</p>
     * 
     * @param tmpReq DeleteExchangeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExchangeResponse
     */
    public DeleteExchangeResponse deleteExchangeWithOptions(DeleteExchangeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteExchangeShrinkRequest request = new DeleteExchangeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.exchangeNames)) {
            request.exchangeNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.exchangeNames, "ExchangeNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collina)) {
            query.put("Collina", request.collina);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exchangeName)) {
            query.put("ExchangeName", request.exchangeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exchangeNamesShrink)) {
            query.put("ExchangeNames", request.exchangeNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umidToken)) {
            query.put("UmidToken", request.umidToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExchange"),
            new TeaPair("version", "2019-09-01"),
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
     * <b>summary</b> : 
     * <p>删除Exchange</p>
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
     * <p>删除实例</p>
     * 
     * @param request DeleteInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除实例</p>
     * 
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除队列</p>
     * 
     * @param tmpReq DeleteQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQueueResponse
     */
    public DeleteQueueResponse deleteQueueWithOptions(DeleteQueueRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteQueueShrinkRequest request = new DeleteQueueShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queueNames)) {
            request.queueNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queueNames, "QueueNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collina)) {
            query.put("Collina", request.collina);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueNamesShrink)) {
            query.put("QueueNames", request.queueNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umidToken)) {
            query.put("UmidToken", request.umidToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQueue"),
            new TeaPair("version", "2019-09-01"),
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
     * <p>删除队列</p>
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
     * <p>删除静态账户</p>
     * 
     * @param request DeleteStaticAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStaticAccountResponse
     */
    public DeleteStaticAccountResponse deleteStaticAccountWithOptions(DeleteStaticAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStamp)) {
            query.put("CreateTimeStamp", request.createTimeStamp);
        }

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
            new TeaPair("action", "DeleteStaticAccount"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStaticAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除静态账户</p>
     * 
     * @param request DeleteStaticAccountRequest
     * @return DeleteStaticAccountResponse
     */
    public DeleteStaticAccountResponse deleteStaticAccount(DeleteStaticAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStaticAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Vhost</p>
     * 
     * @param tmpReq DeleteVhostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVhostResponse
     */
    public DeleteVhostResponse deleteVhostWithOptions(DeleteVhostRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteVhostShrinkRequest request = new DeleteVhostShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vhostNames)) {
            request.vhostNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vhostNames, "VhostNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostNamesShrink)) {
            query.put("VhostNames", request.vhostNamesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVhost"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVhostResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Vhost</p>
     * 
     * @param request DeleteVhostRequest
     * @return DeleteVhostResponse
     */
    public DeleteVhostResponse deleteVhost(DeleteVhostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVhostWithOptions(request, runtime);
    }

    /**
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出元数据</p>
     * 
     * @param request ExportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportResponse
     */
    public ExportResponse exportWithOptions(ExportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportType)) {
            query.put("ExportType", request.exportType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Export"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导出元数据</p>
     * 
     * @param request ExportRequest
     * @return ExportResponse
     */
    public ExportResponse export(ExportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新静态账户</p>
     * 
     * @param request FetchStaticAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FetchStaticAccountResponse
     */
    public FetchStaticAccountResponse fetchStaticAccountWithOptions(FetchStaticAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountAccessKey)) {
            query.put("AccountAccessKey", request.accountAccessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStamp)) {
            query.put("CreateTimeStamp", request.createTimeStamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SKey)) {
            query.put("SKey", request.SKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretSign)) {
            query.put("SecretSign", request.secretSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FetchStaticAccount"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FetchStaticAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新静态账户</p>
     * 
     * @param request FetchStaticAccountRequest
     * @return FetchStaticAccountResponse
     */
    public FetchStaticAccountResponse fetchStaticAccount(FetchStaticAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fetchStaticAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据耗时查询ack信息</p>
     * 
     * @param request GetAckInfoByIntervalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAckInfoByIntervalResponse
     */
    public GetAckInfoByIntervalResponse getAckInfoByIntervalWithOptions(GetAckInfoByIntervalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intervalSec)) {
            query.put("IntervalSec", request.intervalSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAckInfoByInterval"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAckInfoByIntervalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据耗时查询ack信息</p>
     * 
     * @param request GetAckInfoByIntervalRequest
     * @return GetAckInfoByIntervalResponse
     */
    public GetAckInfoByIntervalResponse getAckInfoByInterval(GetAckInfoByIntervalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAckInfoByIntervalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个PushMessage（PullMessage）对应的Ack行为</p>
     * 
     * @param request GetAckInfoOfMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAckInfoOfMessageResponse
     */
    public GetAckInfoOfMessageResponse getAckInfoOfMessageWithOptions(GetAckInfoOfMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumeStatus)) {
            query.put("ConsumeStatus", request.consumeStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryTag)) {
            query.put("DeliveryTag", request.deliveryTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            query.put("MsgId", request.msgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStamp)) {
            query.put("TimeStamp", request.timeStamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAckInfoOfMessage"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAckInfoOfMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个PushMessage（PullMessage）对应的Ack行为</p>
     * 
     * @param request GetAckInfoOfMessageRequest
     * @return GetAckInfoOfMessageResponse
     */
    public GetAckInfoOfMessageResponse getAckInfoOfMessage(GetAckInfoOfMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAckInfoOfMessageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取绑定数量</p>
     * 
     * @param request GetBindingCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBindingCountResponse
     */
    public GetBindingCountResponse getBindingCountWithOptions(GetBindingCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindingType)) {
            query.put("BindingType", request.bindingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstream)) {
            query.put("Upstream", request.upstream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBindingCount"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBindingCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取绑定数量</p>
     * 
     * @param request GetBindingCountRequest
     * @return GetBindingCountResponse
     */
    public GetBindingCountResponse getBindingCount(GetBindingCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBindingCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取绑定错误</p>
     * 
     * @param request GetBindingErrorByTaskIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBindingErrorByTaskIdResponse
     */
    public GetBindingErrorByTaskIdResponse getBindingErrorByTaskIdWithOptions(GetBindingErrorByTaskIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBindingErrorByTaskId"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBindingErrorByTaskIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取绑定错误</p>
     * 
     * @param request GetBindingErrorByTaskIdRequest
     * @return GetBindingErrorByTaskIdResponse
     */
    public GetBindingErrorByTaskIdResponse getBindingErrorByTaskId(GetBindingErrorByTaskIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBindingErrorByTaskIdWithOptions(request, runtime);
    }

    /**
     * @param request GetCommonBuyUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCommonBuyUrlResponse
     */
    public GetCommonBuyUrlResponse getCommonBuyUrlWithOptions(GetCommonBuyUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("ActionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCommonBuyUrl"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCommonBuyUrlResponse());
    }

    /**
     * @param request GetCommonBuyUrlRequest
     * @return GetCommonBuyUrlResponse
     */
    public GetCommonBuyUrlResponse getCommonBuyUrl(GetCommonBuyUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCommonBuyUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过rocketMqMsgId查询消息消费轨迹</p>
     * 
     * @param request GetConsumeTraceByQueueAndRocketMqMsgIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConsumeTraceByQueueAndRocketMqMsgIdResponse
     */
    public GetConsumeTraceByQueueAndRocketMqMsgIdResponse getConsumeTraceByQueueAndRocketMqMsgIdWithOptions(GetConsumeTraceByQueueAndRocketMqMsgIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            query.put("MsgId", request.msgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConsumeTraceByQueueAndRocketMqMsgId"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConsumeTraceByQueueAndRocketMqMsgIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过rocketMqMsgId查询消息消费轨迹</p>
     * 
     * @param request GetConsumeTraceByQueueAndRocketMqMsgIdRequest
     * @return GetConsumeTraceByQueueAndRocketMqMsgIdResponse
     */
    public GetConsumeTraceByQueueAndRocketMqMsgIdResponse getConsumeTraceByQueueAndRocketMqMsgId(GetConsumeTraceByQueueAndRocketMqMsgIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConsumeTraceByQueueAndRocketMqMsgIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Exchange错误</p>
     * 
     * @param request GetExchangeErrorByTaskIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExchangeErrorByTaskIdResponse
     */
    public GetExchangeErrorByTaskIdResponse getExchangeErrorByTaskIdWithOptions(GetExchangeErrorByTaskIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExchangeErrorByTaskId"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExchangeErrorByTaskIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Exchange错误</p>
     * 
     * @param request GetExchangeErrorByTaskIdRequest
     * @return GetExchangeErrorByTaskIdResponse
     */
    public GetExchangeErrorByTaskIdResponse getExchangeErrorByTaskId(GetExchangeErrorByTaskIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExchangeErrorByTaskIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Exchange Rate</p>
     * 
     * @param tmpReq GetExchangeRateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExchangeRateResponse
     */
    public GetExchangeRateResponse getExchangeRateWithOptions(GetExchangeRateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetExchangeRateShrinkRequest request = new GetExchangeRateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.exchangeNames)) {
            request.exchangeNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.exchangeNames, "ExchangeNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exchangeNamesShrink)) {
            query.put("ExchangeNames", request.exchangeNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExchangeRate"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExchangeRateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Exchange Rate</p>
     * 
     * @param request GetExchangeRateRequest
     * @return GetExchangeRateResponse
     */
    public GetExchangeRateResponse getExchangeRate(GetExchangeRateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExchangeRateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过queueName查询一段时间内的消息id列表</p>
     * 
     * @param request GetMsgIdListByQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMsgIdListByQueueResponse
     */
    public GetMsgIdListByQueueResponse getMsgIdListByQueueWithOptions(GetMsgIdListByQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMsgIdListByQueue"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMsgIdListByQueueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过queueName查询一段时间内的消息id列表</p>
     * 
     * @param request GetMsgIdListByQueueRequest
     * @return GetMsgIdListByQueueResponse
     */
    public GetMsgIdListByQueueResponse getMsgIdListByQueue(GetMsgIdListByQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMsgIdListByQueueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetQueueConsumers</p>
     * 
     * @param request GetQueueConsumersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueueConsumersResponse
     */
    public GetQueueConsumersResponse getQueueConsumersWithOptions(GetQueueConsumersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueueConsumers"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueueConsumersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetQueueConsumers</p>
     * 
     * @param request GetQueueConsumersRequest
     * @return GetQueueConsumersResponse
     */
    public GetQueueConsumersResponse getQueueConsumers(GetQueueConsumersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueueConsumersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取队列错误</p>
     * 
     * @param request GetQueueErrorByTaskIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueueErrorByTaskIdResponse
     */
    public GetQueueErrorByTaskIdResponse getQueueErrorByTaskIdWithOptions(GetQueueErrorByTaskIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueueErrorByTaskId"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueueErrorByTaskIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取队列错误</p>
     * 
     * @param request GetQueueErrorByTaskIdRequest
     * @return GetQueueErrorByTaskIdResponse
     */
    public GetQueueErrorByTaskIdResponse getQueueErrorByTaskId(GetQueueErrorByTaskIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueueErrorByTaskIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Queue Rate</p>
     * 
     * @param tmpReq GetQueueRateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueueRateResponse
     */
    public GetQueueRateResponse getQueueRateWithOptions(GetQueueRateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetQueueRateShrinkRequest request = new GetQueueRateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queueNames)) {
            request.queueNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queueNames, "QueueNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueNamesShrink)) {
            query.put("QueueNames", request.queueNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueueRate"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueueRateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Queue Rate</p>
     * 
     * @param request GetQueueRateRequest
     * @return GetQueueRateResponse
     */
    public GetQueueRateResponse getQueueRate(GetQueueRateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueueRateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据connectionId,channelId,deliveryTag查询SendMessage</p>
     * 
     * @param request GetSendTraceByConnectionAndChannelAndDeliveryTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSendTraceByConnectionAndChannelAndDeliveryTagResponse
     */
    public GetSendTraceByConnectionAndChannelAndDeliveryTagResponse getSendTraceByConnectionAndChannelAndDeliveryTagWithOptions(GetSendTraceByConnectionAndChannelAndDeliveryTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            query.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryTag)) {
            query.put("DeliveryTag", request.deliveryTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSendTraceByConnectionAndChannelAndDeliveryTag"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSendTraceByConnectionAndChannelAndDeliveryTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据connectionId,channelId,deliveryTag查询SendMessage</p>
     * 
     * @param request GetSendTraceByConnectionAndChannelAndDeliveryTagRequest
     * @return GetSendTraceByConnectionAndChannelAndDeliveryTagResponse
     */
    public GetSendTraceByConnectionAndChannelAndDeliveryTagResponse getSendTraceByConnectionAndChannelAndDeliveryTag(GetSendTraceByConnectionAndChannelAndDeliveryTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSendTraceByConnectionAndChannelAndDeliveryTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过用户msgId查询消息发送轨迹</p>
     * 
     * @param request GetSendTraceByMsgIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSendTraceByMsgIdResponse
     */
    public GetSendTraceByMsgIdResponse getSendTraceByMsgIdWithOptions(GetSendTraceByMsgIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            query.put("MsgId", request.msgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSendTraceByMsgId"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSendTraceByMsgIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过用户msgId查询消息发送轨迹</p>
     * 
     * @param request GetSendTraceByMsgIdRequest
     * @return GetSendTraceByMsgIdResponse
     */
    public GetSendTraceByMsgIdResponse getSendTraceByMsgId(GetSendTraceByMsgIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSendTraceByMsgIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据queue 查询SendMessage</p>
     * 
     * @param request GetSendTraceByQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSendTraceByQueueResponse
     */
    public GetSendTraceByQueueResponse getSendTraceByQueueWithOptions(GetSendTraceByQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSendTraceByQueue"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSendTraceByQueueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据queue 查询SendMessage</p>
     * 
     * @param request GetSendTraceByQueueRequest
     * @return GetSendTraceByQueueResponse
     */
    public GetSendTraceByQueueResponse getSendTraceByQueue(GetSendTraceByQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSendTraceByQueueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetStatisticsByVhost</p>
     * 
     * @param request GetStatisticsByVhostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStatisticsByVhostResponse
     */
    public GetStatisticsByVhostResponse getStatisticsByVhostWithOptions(GetStatisticsByVhostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStatisticsByVhost"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStatisticsByVhostResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetStatisticsByVhost</p>
     * 
     * @param request GetStatisticsByVhostRequest
     * @return GetStatisticsByVhostResponse
     */
    public GetStatisticsByVhostResponse getStatisticsByVhost(GetStatisticsByVhostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStatisticsByVhostWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务</p>
     * 
     * @param request GetTaskByUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskByUidResponse
     */
    public GetTaskByUidResponse getTaskByUidWithOptions(GetTaskByUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskByUid"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskByUidResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务</p>
     * 
     * @param request GetTaskByUidRequest
     * @return GetTaskByUidResponse
     */
    public GetTaskByUidResponse getTaskByUid(GetTaskByUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskByUidWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询一段时间内某个实例或是vhost或是queue的tps</p>
     * 
     * @param request GetTpsByTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTpsByTimeResponse
     */
    public GetTpsByTimeResponse getTpsByTimeWithOptions(GetTpsByTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.api)) {
            query.put("Api", request.api);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTpsByTime"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTpsByTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询一段时间内某个实例或是vhost或是queue的tps</p>
     * 
     * @param request GetTpsByTimeRequest
     * @return GetTpsByTimeResponse
     */
    public GetTpsByTimeResponse getTpsByTime(GetTpsByTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTpsByTimeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户配置</p>
     * 
     * @param request GetUserSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserSettingResponse
     */
    public GetUserSettingResponse getUserSettingWithOptions(GetUserSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserSetting"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户配置</p>
     * 
     * @param request GetUserSettingRequest
     * @return GetUserSettingResponse
     */
    public GetUserSettingResponse getUserSetting(GetUserSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Vhost错误</p>
     * 
     * @param request GetVhostErrorByTaskIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVhostErrorByTaskIdResponse
     */
    public GetVhostErrorByTaskIdResponse getVhostErrorByTaskIdWithOptions(GetVhostErrorByTaskIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVhostErrorByTaskId"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVhostErrorByTaskIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Vhost错误</p>
     * 
     * @param request GetVhostErrorByTaskIdRequest
     * @return GetVhostErrorByTaskIdResponse
     */
    public GetVhostErrorByTaskIdResponse getVhostErrorByTaskId(GetVhostErrorByTaskIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVhostErrorByTaskIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Vhost Rate</p>
     * 
     * @param tmpReq GetVhostRateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVhostRateResponse
     */
    public GetVhostRateResponse getVhostRateWithOptions(GetVhostRateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetVhostRateShrinkRequest request = new GetVhostRateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vhostNames)) {
            request.vhostNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vhostNames, "VhostNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostNamesShrink)) {
            query.put("VhostNames", request.vhostNamesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVhostRate"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVhostRateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Vhost Rate</p>
     * 
     * @param request GetVhostRateRequest
     * @return GetVhostRateResponse
     */
    public GetVhostRateResponse getVhostRate(GetVhostRateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVhostRateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>异步导入元数据</p>
     * 
     * @param request ImportDefinitionAsynchronousRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportDefinitionAsynchronousResponse
     */
    public ImportDefinitionAsynchronousResponse importDefinitionAsynchronousWithOptions(ImportDefinitionAsynchronousRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importType)) {
            query.put("ImportType", request.importType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossUrl)) {
            query.put("OssUrl", request.ossUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportDefinitionAsynchronous"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportDefinitionAsynchronousResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>异步导入元数据</p>
     * 
     * @param request ImportDefinitionAsynchronousRequest
     * @return ImportDefinitionAsynchronousResponse
     */
    public ImportDefinitionAsynchronousResponse importDefinitionAsynchronous(ImportDefinitionAsynchronousRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importDefinitionAsynchronousWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例列表</p>
     * 
     * @param request InstancePreivewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstancePreivewResponse
     */
    public InstancePreivewResponse instancePreivewWithOptions(InstancePreivewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstancePreivew"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstancePreivewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例列表</p>
     * 
     * @param request InstancePreivewRequest
     * @return InstancePreivewResponse
     */
    public InstancePreivewResponse instancePreivew(InstancePreivewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.instancePreivewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Exchange列表</p>
     * 
     * @param request ListExchangeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExchangeResponse
     */
    public ListExchangeResponse listExchangeWithOptions(ListExchangeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exchangeNamePrefix)) {
            query.put("ExchangeNamePrefix", request.exchangeNamePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExchange"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExchangeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Exchange列表</p>
     * 
     * @param request ListExchangeRequest
     * @return ListExchangeResponse
     */
    public ListExchangeResponse listExchange(ListExchangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExchangeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Exchange下游列表</p>
     * 
     * @param request ListExchangeDownstreamBindingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExchangeDownstreamBindingsResponse
     */
    public ListExchangeDownstreamBindingsResponse listExchangeDownstreamBindingsWithOptions(ListExchangeDownstreamBindingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exchangeName)) {
            query.put("ExchangeName", request.exchangeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExchangeDownstreamBindings"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExchangeDownstreamBindingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Exchange下游列表</p>
     * 
     * @param request ListExchangeDownstreamBindingsRequest
     * @return ListExchangeDownstreamBindingsResponse
     */
    public ListExchangeDownstreamBindingsResponse listExchangeDownstreamBindings(ListExchangeDownstreamBindingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExchangeDownstreamBindingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Exchange上游绑定列表</p>
     * 
     * @param request ListExchangeUpstreamBindingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExchangeUpstreamBindingsResponse
     */
    public ListExchangeUpstreamBindingsResponse listExchangeUpstreamBindingsWithOptions(ListExchangeUpstreamBindingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exchangeName)) {
            query.put("ExchangeName", request.exchangeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExchangeUpstreamBindings"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExchangeUpstreamBindingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Exchange上游绑定列表</p>
     * 
     * @param request ListExchangeUpstreamBindingsRequest
     * @return ListExchangeUpstreamBindingsResponse
     */
    public ListExchangeUpstreamBindingsResponse listExchangeUpstreamBindings(ListExchangeUpstreamBindingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExchangeUpstreamBindingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例列表</p>
     * 
     * @param request ListInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstanceWithOptions(ListInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstance"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例列表</p>
     * 
     * @param request ListInstanceRequest
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstance(ListInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例告警</p>
     * 
     * @param request ListInstanceAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceAlarmResponse
     */
    public ListInstanceAlarmResponse listInstanceAlarmWithOptions(ListInstanceAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceAlarm"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceAlarmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例告警</p>
     * 
     * @param request ListInstanceAlarmRequest
     * @return ListInstanceAlarmResponse
     */
    public ListInstanceAlarmResponse listInstanceAlarm(ListInstanceAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceAlarmWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志Logstore</p>
     * 
     * @param request ListLogstoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogstoreResponse
     */
    public ListLogstoreResponse listLogstoreWithOptions(ListLogstoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogstore"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogstoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志Logstore</p>
     * 
     * @param request ListLogstoreRequest
     * @return ListLogstoreResponse
     */
    public ListLogstoreResponse listLogstore(ListLogstoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLogstoreWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志Project</p>
     * 
     * @param request ListProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectResponse
     */
    public ListProjectResponse listProjectWithOptions(ListProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProject"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志Project</p>
     * 
     * @param request ListProjectRequest
     * @return ListProjectResponse
     */
    public ListProjectResponse listProject(ListProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取队列列表</p>
     * 
     * @param request ListQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQueueResponse
     */
    public ListQueueResponse listQueueWithOptions(ListQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueNamePrefix)) {
            query.put("QueueNamePrefix", request.queueNamePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueue"),
            new TeaPair("version", "2019-09-01"),
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
     * <p>获取队列列表</p>
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
     * <p>获取队列上游绑定列表</p>
     * 
     * @param request ListQueueUpstreamBindingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQueueUpstreamBindingsResponse
     */
    public ListQueueUpstreamBindingsResponse listQueueUpstreamBindingsWithOptions(ListQueueUpstreamBindingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueueUpstreamBindings"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueueUpstreamBindingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取队列上游绑定列表</p>
     * 
     * @param request ListQueueUpstreamBindingsRequest
     * @return ListQueueUpstreamBindingsResponse
     */
    public ListQueueUpstreamBindingsResponse listQueueUpstreamBindings(ListQueueUpstreamBindingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQueueUpstreamBindingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取静态账户列表</p>
     * 
     * @param request ListStaticAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStaticAccountsResponse
     */
    public ListStaticAccountsResponse listStaticAccountsWithOptions(ListStaticAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStaticAccounts"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStaticAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取静态账户列表</p>
     * 
     * @param request ListStaticAccountsRequest
     * @return ListStaticAccountsResponse
     */
    public ListStaticAccountsResponse listStaticAccounts(ListStaticAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStaticAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Vhost列表</p>
     * 
     * @param request ListVhostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVhostResponse
     */
    public ListVhostResponse listVhostWithOptions(ListVhostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostNamePrefix)) {
            query.put("VhostNamePrefix", request.vhostNamePrefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVhost"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVhostResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Vhost列表</p>
     * 
     * @param request ListVhostRequest
     * @return ListVhostResponse
     */
    public ListVhostResponse listVhost(ListVhostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVhostWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取元数据</p>
     * 
     * @param request MetadataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MetadataResponse
     */
    public MetadataResponse metadataWithOptions(MetadataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Metadata"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MetadataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取元数据</p>
     * 
     * @param request MetadataRequest
     * @return MetadataResponse
     */
    public MetadataResponse metadata(MetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.metadataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>清空队列</p>
     * 
     * @param tmpReq PurgeQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PurgeQueueResponse
     */
    public PurgeQueueResponse purgeQueueWithOptions(PurgeQueueRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PurgeQueueShrinkRequest request = new PurgeQueueShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queueNames)) {
            request.queueNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queueNames, "QueueNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collina)) {
            query.put("Collina", request.collina);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueNamesShrink)) {
            query.put("QueueNames", request.queueNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umidToken)) {
            query.put("UmidToken", request.umidToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PurgeQueue"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PurgeQueueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>清空队列</p>
     * 
     * @param request PurgeQueueRequest
     * @return PurgeQueueResponse
     */
    public PurgeQueueResponse purgeQueue(PurgeQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.purgeQueueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据Message Id查询消息</p>
     * 
     * @param request QueryMessageByMessageIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMessageByMessageIdResponse
     */
    public QueryMessageByMessageIdResponse queryMessageByMessageIdWithOptions(QueryMessageByMessageIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMessageByMessageId"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMessageByMessageIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据Message Id查询消息</p>
     * 
     * @param request QueryMessageByMessageIdRequest
     * @return QueryMessageByMessageIdResponse
     */
    public QueryMessageByMessageIdResponse queryMessageByMessageId(QueryMessageByMessageIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMessageByMessageIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据队列查询消息</p>
     * 
     * @param request QueryMessageByQueueNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMessageByQueueNameResponse
     */
    public QueryMessageByQueueNameResponse queryMessageByQueueNameWithOptions(QueryMessageByQueueNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMessageByQueueName"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMessageByQueueNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据队列查询消息</p>
     * 
     * @param request QueryMessageByQueueNameRequest
     * @return QueryMessageByQueueNameResponse
     */
    public QueryMessageByQueueNameResponse queryMessageByQueueName(QueryMessageByQueueNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMessageByQueueNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实例释放</p>
     * 
     * @param request ReleaseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseInstance"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实例释放</p>
     * 
     * @param request ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送消息</p>
     * 
     * @param request SendMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendMessageResponse
     */
    public SendMessageResponse sendMessageWithOptions(SendMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            query.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exchangeName)) {
            query.put("ExchangeName", request.exchangeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.props)) {
            query.put("Props", request.props);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routingKey)) {
            query.put("RoutingKey", request.routingKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendMessage"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送消息</p>
     * 
     * @param request SendMessageRequest
     * @return SendMessageResponse
     */
    public SendMessageResponse sendMessage(SendMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendMessageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送消息</p>
     * 
     * @param request SendMessageCopyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendMessageCopyResponse
     */
    public SendMessageCopyResponse sendMessageCopyWithOptions(SendMessageCopyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processToken)) {
            query.put("ProcessToken", request.processToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendMessageCopy"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendMessageCopyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送消息</p>
     * 
     * @param request SendMessageCopyRequest
     * @return SendMessageCopyResponse
     */
    public SendMessageCopyResponse sendMessageCopy(SendMessageCopyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendMessageCopyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消绑定</p>
     * 
     * @param request UnbindRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindResponse
     */
    public UnbindResponse unbindWithOptions(UnbindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindingKey)) {
            query.put("BindingKey", request.bindingKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindingType)) {
            query.put("BindingType", request.bindingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstName)) {
            query.put("DstName", request.dstName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcName)) {
            query.put("SrcName", request.srcName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhostName)) {
            query.put("VhostName", request.vhostName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Unbind"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消绑定</p>
     * 
     * @param request UnbindRequest
     * @return UnbindResponse
     */
    public UnbindResponse unbind(UnbindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例</p>
     * 
     * @param request UpdateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

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
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2019-09-01"),
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
     * <p>更新实例</p>
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
     * <p>修改实例的重试策略</p>
     * 
     * @param request UpdateInstanceRetryStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceRetryStrategyResponse
     */
    public UpdateInstanceRetryStrategyResponse updateInstanceRetryStrategyWithOptions(UpdateInstanceRetryStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryInterval)) {
            query.put("RetryInterval", request.retryInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryTimes)) {
            query.put("RetryTimes", request.retryTimes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceRetryStrategy"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceRetryStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改实例的重试策略</p>
     * 
     * @param request UpdateInstanceRetryStrategyRequest
     * @return UpdateInstanceRetryStrategyResponse
     */
    public UpdateInstanceRetryStrategyResponse updateInstanceRetryStrategy(UpdateInstanceRetryStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceRetryStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新serverless开关</p>
     * 
     * @param request UpdateServerlessSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServerlessSwitchResponse
     */
    public UpdateServerlessSwitchResponse updateServerlessSwitchWithOptions(UpdateServerlessSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
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
            new TeaPair("action", "UpdateServerlessSwitch"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServerlessSwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新serverless开关</p>
     * 
     * @param request UpdateServerlessSwitchRequest
     * @return UpdateServerlessSwitchResponse
     */
    public UpdateServerlessSwitchResponse updateServerlessSwitch(UpdateServerlessSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServerlessSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>升级实例配额</p>
     * 
     * @param request UpgradeLimitsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeLimitsResponse
     */
    public UpgradeLimitsResponse upgradeLimitsWithOptions(UpgradeLimitsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleSessionId)) {
            query.put("ConsoleSessionId", request.consoleSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeLimits"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeLimitsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>升级实例配额</p>
     * 
     * @param request UpgradeLimitsRequest
     * @return UpgradeLimitsResponse
     */
    public UpgradeLimitsResponse upgradeLimits(UpgradeLimitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeLimitsWithOptions(request, runtime);
    }
}
