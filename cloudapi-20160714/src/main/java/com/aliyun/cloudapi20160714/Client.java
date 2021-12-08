// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714;

import com.aliyun.tea.*;
import com.aliyun.cloudapi20160714.models.*;
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
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "apigateway.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-beijing", "apigateway.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-chengdu", "apigateway.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "apigateway.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "apigateway.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "apigateway.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "apigateway.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "apigateway.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-hongkong", "apigateway.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "apigateway.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "apigateway.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "apigateway.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "apigateway.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "apigateway.ap-northeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "apigateway.eu-west-1.aliyuncs.com"),
            new TeaPair("us-west-1", "apigateway.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "apigateway.us-east-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "apigateway.eu-central-1.aliyuncs.com"),
            new TeaPair("me-east-1", "apigateway.me-east-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "apigateway.ap-south-1.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "apigateway.cn-north-2-gov-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "apigateway.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AbolishApiResponse abolishApiWithOptions(AbolishApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbolishApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbolishApiResponse());
    }

    public AbolishApiResponse abolishApi(AbolishApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.abolishApiWithOptions(request, runtime);
    }

    public AddIpControlPolicyItemResponse addIpControlPolicyItemWithOptions(AddIpControlPolicyItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("CidrIp", request.cidrIp);
        query.put("IpControlId", request.ipControlId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddIpControlPolicyItem"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddIpControlPolicyItemResponse());
    }

    public AddIpControlPolicyItemResponse addIpControlPolicyItem(AddIpControlPolicyItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addIpControlPolicyItemWithOptions(request, runtime);
    }

    public AddTrafficSpecialControlResponse addTrafficSpecialControlWithOptions(AddTrafficSpecialControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        query.put("SpecialKey", request.specialKey);
        query.put("SpecialType", request.specialType);
        query.put("TrafficControlId", request.trafficControlId);
        query.put("TrafficValue", request.trafficValue);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTrafficSpecialControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTrafficSpecialControlResponse());
    }

    public AddTrafficSpecialControlResponse addTrafficSpecialControl(AddTrafficSpecialControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTrafficSpecialControlWithOptions(request, runtime);
    }

    public AttachPluginResponse attachPluginWithOptions(AttachPluginRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("ApiIds", request.apiIds);
        query.put("GroupId", request.groupId);
        query.put("PluginId", request.pluginId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachPlugin"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachPluginResponse());
    }

    public AttachPluginResponse attachPlugin(AttachPluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachPluginWithOptions(request, runtime);
    }

    public BatchAbolishApisResponse batchAbolishApisWithOptions(BatchAbolishApisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Api", request.api);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAbolishApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAbolishApisResponse());
    }

    public BatchAbolishApisResponse batchAbolishApis(BatchAbolishApisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAbolishApisWithOptions(request, runtime);
    }

    public BatchDeployApisResponse batchDeployApisWithOptions(BatchDeployApisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Api", request.api);
        query.put("Description", request.description);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeployApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeployApisResponse());
    }

    public BatchDeployApisResponse batchDeployApis(BatchDeployApisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeployApisWithOptions(request, runtime);
    }

    public CreateApiResponse createApiWithOptions(CreateApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AllowSignatureMethod", request.allowSignatureMethod);
        query.put("ApiName", request.apiName);
        query.put("AppCodeAuthType", request.appCodeAuthType);
        query.put("AuthType", request.authType);
        query.put("ConstantParameters", request.constantParameters);
        query.put("Description", request.description);
        query.put("DisableInternet", request.disableInternet);
        query.put("ErrorCodeSamples", request.errorCodeSamples);
        query.put("FailResultSample", request.failResultSample);
        query.put("ForceNonceCheck", request.forceNonceCheck);
        query.put("GroupId", request.groupId);
        query.put("OpenIdConnectConfig", request.openIdConnectConfig);
        query.put("RequestConfig", request.requestConfig);
        query.put("RequestParameters", request.requestParameters);
        query.put("ResultBodyModel", request.resultBodyModel);
        query.put("ResultDescriptions", request.resultDescriptions);
        query.put("ResultSample", request.resultSample);
        query.put("ResultType", request.resultType);
        query.put("SecurityToken", request.securityToken);
        query.put("ServiceConfig", request.serviceConfig);
        query.put("ServiceParameters", request.serviceParameters);
        query.put("ServiceParametersMap", request.serviceParametersMap);
        query.put("SystemParameters", request.systemParameters);
        query.put("Visibility", request.visibility);
        query.put("WebSocketApiType", request.webSocketApiType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApiResponse());
    }

    public CreateApiResponse createApi(CreateApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createApiWithOptions(request, runtime);
    }

    public CreateApiGroupResponse createApiGroupWithOptions(CreateApiGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BasePath", request.basePath);
        query.put("Description", request.description);
        query.put("GroupName", request.groupName);
        query.put("InstanceId", request.instanceId);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApiGroup"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApiGroupResponse());
    }

    public CreateApiGroupResponse createApiGroup(CreateApiGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createApiGroupWithOptions(request, runtime);
    }

    public CreateApiStageVariableResponse createApiStageVariableWithOptions(CreateApiStageVariableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageId", request.stageId);
        query.put("StageRouteModel", request.stageRouteModel);
        query.put("SupportRoute", request.supportRoute);
        query.put("VariableName", request.variableName);
        query.put("VariableValue", request.variableValue);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApiStageVariable"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApiStageVariableResponse());
    }

    public CreateApiStageVariableResponse createApiStageVariable(CreateApiStageVariableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createApiStageVariableWithOptions(request, runtime);
    }

    public CreateAppResponse createAppWithOptions(CreateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Description", request.description);
        query.put("SecurityToken", request.securityToken);
        query.put("Source", request.source);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApp"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AutoPay", request.autoPay);
        query.put("ChargeType", request.chargeType);
        query.put("Duration", request.duration);
        query.put("HttpsPolicy", request.httpsPolicy);
        query.put("InstanceName", request.instanceName);
        query.put("InstanceSpec", request.instanceSpec);
        query.put("PricingCycle", request.pricingCycle);
        query.put("Token", request.token);
        query.put("ZoneId", request.zoneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public CreateIntranetDomainResponse createIntranetDomainWithOptions(CreateIntranetDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIntranetDomain"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIntranetDomainResponse());
    }

    public CreateIntranetDomainResponse createIntranetDomain(CreateIntranetDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIntranetDomainWithOptions(request, runtime);
    }

    public CreateIpControlResponse createIpControlWithOptions(CreateIpControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("IpControlName", request.ipControlName);
        query.put("IpControlPolicys", request.ipControlPolicys);
        query.put("IpControlType", request.ipControlType);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIpControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIpControlResponse());
    }

    public CreateIpControlResponse createIpControl(CreateIpControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIpControlWithOptions(request, runtime);
    }

    public CreateLogConfigResponse createLogConfigWithOptions(CreateLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("LogType", request.logType);
        query.put("SecurityToken", request.securityToken);
        query.put("SlsLogStore", request.slsLogStore);
        query.put("SlsProject", request.slsProject);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLogConfig"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLogConfigResponse());
    }

    public CreateLogConfigResponse createLogConfig(CreateLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLogConfigWithOptions(request, runtime);
    }

    public CreateModelResponse createModelWithOptions(CreateModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("GroupId", request.groupId);
        query.put("ModelName", request.modelName);
        query.put("Schema", request.schema);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModel"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelResponse());
    }

    public CreateModelResponse createModel(CreateModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createModelWithOptions(request, runtime);
    }

    public CreateMonitorGroupResponse createMonitorGroupWithOptions(CreateMonitorGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Auth", request.auth);
        query.put("GroupId", request.groupId);
        query.put("RawMonitorGroupId", request.rawMonitorGroupId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorGroup"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorGroupResponse());
    }

    public CreateMonitorGroupResponse createMonitorGroup(CreateMonitorGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMonitorGroupWithOptions(request, runtime);
    }

    public CreatePluginResponse createPluginWithOptions(CreatePluginRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("PluginData", request.pluginData);
        query.put("PluginName", request.pluginName);
        query.put("PluginType", request.pluginType);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePlugin"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePluginResponse());
    }

    public CreatePluginResponse createPlugin(CreatePluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPluginWithOptions(request, runtime);
    }

    public CreateSignatureResponse createSignatureWithOptions(CreateSignatureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        query.put("SignatureKey", request.signatureKey);
        query.put("SignatureName", request.signatureName);
        query.put("SignatureSecret", request.signatureSecret);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSignature"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSignatureResponse());
    }

    public CreateSignatureResponse createSignature(CreateSignatureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSignatureWithOptions(request, runtime);
    }

    public CreateTrafficControlResponse createTrafficControlWithOptions(CreateTrafficControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiDefault", request.apiDefault);
        query.put("AppDefault", request.appDefault);
        query.put("Description", request.description);
        query.put("SecurityToken", request.securityToken);
        query.put("TrafficControlName", request.trafficControlName);
        query.put("TrafficControlUnit", request.trafficControlUnit);
        query.put("UserDefault", request.userDefault);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrafficControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrafficControlResponse());
    }

    public CreateTrafficControlResponse createTrafficControl(CreateTrafficControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTrafficControlWithOptions(request, runtime);
    }

    public DeleteAllTrafficSpecialControlResponse deleteAllTrafficSpecialControlWithOptions(DeleteAllTrafficSpecialControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        query.put("TrafficControlId", request.trafficControlId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAllTrafficSpecialControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAllTrafficSpecialControlResponse());
    }

    public DeleteAllTrafficSpecialControlResponse deleteAllTrafficSpecialControl(DeleteAllTrafficSpecialControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAllTrafficSpecialControlWithOptions(request, runtime);
    }

    public DeleteApiResponse deleteApiWithOptions(DeleteApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApiResponse());
    }

    public DeleteApiResponse deleteApi(DeleteApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteApiWithOptions(request, runtime);
    }

    public DeleteApiGroupResponse deleteApiGroupWithOptions(DeleteApiGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApiGroup"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApiGroupResponse());
    }

    public DeleteApiGroupResponse deleteApiGroup(DeleteApiGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteApiGroupWithOptions(request, runtime);
    }

    public DeleteApiStageVariableResponse deleteApiStageVariableWithOptions(DeleteApiStageVariableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageId", request.stageId);
        query.put("VariableName", request.variableName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApiStageVariable"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApiStageVariableResponse());
    }

    public DeleteApiStageVariableResponse deleteApiStageVariable(DeleteApiStageVariableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteApiStageVariableWithOptions(request, runtime);
    }

    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApp"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppResponse());
    }

    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomain"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainResponse());
    }

    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    public DeleteDomainCertificateResponse deleteDomainCertificateWithOptions(DeleteDomainCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CertificateId", request.certificateId);
        query.put("DomainName", request.domainName);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomainCertificate"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainCertificateResponse());
    }

    public DeleteDomainCertificateResponse deleteDomainCertificate(DeleteDomainCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainCertificateWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public DeleteIpControlResponse deleteIpControlWithOptions(DeleteIpControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IpControlId", request.ipControlId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIpControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIpControlResponse());
    }

    public DeleteIpControlResponse deleteIpControl(DeleteIpControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIpControlWithOptions(request, runtime);
    }

    public DeleteLogConfigResponse deleteLogConfigWithOptions(DeleteLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("LogType", request.logType);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLogConfig"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLogConfigResponse());
    }

    public DeleteLogConfigResponse deleteLogConfig(DeleteLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLogConfigWithOptions(request, runtime);
    }

    public DeleteModelResponse deleteModelWithOptions(DeleteModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupId", request.groupId);
        query.put("ModelName", request.modelName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModel"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelResponse());
    }

    public DeleteModelResponse deleteModel(DeleteModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteModelWithOptions(request, runtime);
    }

    public DeletePluginResponse deletePluginWithOptions(DeletePluginRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PluginId", request.pluginId);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePlugin"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePluginResponse());
    }

    public DeletePluginResponse deletePlugin(DeletePluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePluginWithOptions(request, runtime);
    }

    public DeleteSignatureResponse deleteSignatureWithOptions(DeleteSignatureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        query.put("SignatureId", request.signatureId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSignature"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSignatureResponse());
    }

    public DeleteSignatureResponse deleteSignature(DeleteSignatureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSignatureWithOptions(request, runtime);
    }

    public DeleteTrafficControlResponse deleteTrafficControlWithOptions(DeleteTrafficControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        query.put("TrafficControlId", request.trafficControlId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrafficControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrafficControlResponse());
    }

    public DeleteTrafficControlResponse deleteTrafficControl(DeleteTrafficControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTrafficControlWithOptions(request, runtime);
    }

    public DeleteTrafficSpecialControlResponse deleteTrafficSpecialControlWithOptions(DeleteTrafficSpecialControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        query.put("SpecialKey", request.specialKey);
        query.put("SpecialType", request.specialType);
        query.put("TrafficControlId", request.trafficControlId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrafficSpecialControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrafficSpecialControlResponse());
    }

    public DeleteTrafficSpecialControlResponse deleteTrafficSpecialControl(DeleteTrafficSpecialControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTrafficSpecialControlWithOptions(request, runtime);
    }

    public DeployApiResponse deployApiWithOptions(DeployApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("Description", request.description);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployApiResponse());
    }

    public DeployApiResponse deployApi(DeployApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deployApiWithOptions(request, runtime);
    }

    public DescribeAbolishApiTaskResponse describeAbolishApiTaskWithOptions(DescribeAbolishApiTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OperationUid", request.operationUid);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAbolishApiTask"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAbolishApiTaskResponse());
    }

    public DescribeAbolishApiTaskResponse describeAbolishApiTask(DescribeAbolishApiTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAbolishApiTaskWithOptions(request, runtime);
    }

    public DescribeApiResponse describeApiWithOptions(DescribeApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiResponse());
    }

    public DescribeApiResponse describeApi(DescribeApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApiWithOptions(request, runtime);
    }

    public DescribeApiDocResponse describeApiDocWithOptions(DescribeApiDocRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiDoc"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiDocResponse());
    }

    public DescribeApiDocResponse describeApiDoc(DescribeApiDocRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApiDocWithOptions(request, runtime);
    }

    public DescribeApiGroupResponse describeApiGroupWithOptions(DescribeApiGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiGroup"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiGroupResponse());
    }

    public DescribeApiGroupResponse describeApiGroup(DescribeApiGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApiGroupWithOptions(request, runtime);
    }

    public DescribeApiGroupVpcWhitelistResponse describeApiGroupVpcWhitelistWithOptions(DescribeApiGroupVpcWhitelistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiGroupVpcWhitelist"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiGroupVpcWhitelistResponse());
    }

    public DescribeApiGroupVpcWhitelistResponse describeApiGroupVpcWhitelist(DescribeApiGroupVpcWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApiGroupVpcWhitelistWithOptions(request, runtime);
    }

    public DescribeApiGroupsResponse describeApiGroupsWithOptions(DescribeApiGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EnableTagAuth", request.enableTagAuth);
        query.put("GroupId", request.groupId);
        query.put("GroupName", request.groupName);
        query.put("InstanceId", request.instanceId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("Sort", request.sort);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiGroups"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiGroupsResponse());
    }

    public DescribeApiGroupsResponse describeApiGroups(DescribeApiGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApiGroupsWithOptions(request, runtime);
    }

    public DescribeApiHistoriesResponse describeApiHistoriesWithOptions(DescribeApiHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("ApiName", request.apiName);
        query.put("GroupId", request.groupId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiHistories"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiHistoriesResponse());
    }

    public DescribeApiHistoriesResponse describeApiHistories(DescribeApiHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApiHistoriesWithOptions(request, runtime);
    }

    public DescribeApiHistoryResponse describeApiHistoryWithOptions(DescribeApiHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("GroupId", request.groupId);
        query.put("HistoryVersion", request.historyVersion);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiHistory"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiHistoryResponse());
    }

    public DescribeApiHistoryResponse describeApiHistory(DescribeApiHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApiHistoryWithOptions(request, runtime);
    }

    public DescribeApiIpControlsResponse describeApiIpControlsWithOptions(DescribeApiIpControlsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiIds", request.apiIds);
        query.put("GroupId", request.groupId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiIpControls"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiIpControlsResponse());
    }

    public DescribeApiIpControlsResponse describeApiIpControls(DescribeApiIpControlsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApiIpControlsWithOptions(request, runtime);
    }

    public DescribeApiLatencyDataResponse describeApiLatencyDataWithOptions(DescribeApiLatencyDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("EndTime", request.endTime);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiLatencyData"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiLatencyDataResponse());
    }

    public DescribeApiLatencyDataResponse describeApiLatencyData(DescribeApiLatencyDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApiLatencyDataWithOptions(request, runtime);
    }

    public DescribeApiMarketAttributesResponse describeApiMarketAttributesWithOptions(DescribeApiMarketAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiMarketAttributes"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiMarketAttributesResponse());
    }

    public DescribeApiMarketAttributesResponse describeApiMarketAttributes(DescribeApiMarketAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApiMarketAttributesWithOptions(request, runtime);
    }

    public DescribeApiQpsDataResponse describeApiQpsDataWithOptions(DescribeApiQpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("EndTime", request.endTime);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiQpsData"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiQpsDataResponse());
    }

    public DescribeApiQpsDataResponse describeApiQpsData(DescribeApiQpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApiQpsDataWithOptions(request, runtime);
    }

    public DescribeApiSignaturesResponse describeApiSignaturesWithOptions(DescribeApiSignaturesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiIds", request.apiIds);
        query.put("GroupId", request.groupId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiSignatures"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiSignaturesResponse());
    }

    public DescribeApiSignaturesResponse describeApiSignatures(DescribeApiSignaturesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApiSignaturesWithOptions(request, runtime);
    }

    public DescribeApiTrafficControlsResponse describeApiTrafficControlsWithOptions(DescribeApiTrafficControlsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiIds", request.apiIds);
        query.put("GroupId", request.groupId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiTrafficControls"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiTrafficControlsResponse());
    }

    public DescribeApiTrafficControlsResponse describeApiTrafficControls(DescribeApiTrafficControlsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApiTrafficControlsWithOptions(request, runtime);
    }

    public DescribeApiTrafficDataResponse describeApiTrafficDataWithOptions(DescribeApiTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("EndTime", request.endTime);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiTrafficData"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiTrafficDataResponse());
    }

    public DescribeApiTrafficDataResponse describeApiTrafficData(DescribeApiTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApiTrafficDataWithOptions(request, runtime);
    }

    public DescribeApisResponse describeApisWithOptions(DescribeApisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("ApiName", request.apiName);
        query.put("CatalogId", request.catalogId);
        query.put("EnableTagAuth", request.enableTagAuth);
        query.put("GroupId", request.groupId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        query.put("Visibility", request.visibility);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisResponse());
    }

    public DescribeApisResponse describeApis(DescribeApisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApisWithOptions(request, runtime);
    }

    public DescribeApisByAppResponse describeApisByAppWithOptions(DescribeApisByAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiName", request.apiName);
        query.put("ApiUid", request.apiUid);
        query.put("AppId", request.appId);
        query.put("Method", request.method);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Path", request.path);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisByApp"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisByAppResponse());
    }

    public DescribeApisByAppResponse describeApisByApp(DescribeApisByAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApisByAppWithOptions(request, runtime);
    }

    public DescribeApisByIpControlResponse describeApisByIpControlWithOptions(DescribeApisByIpControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IpControlId", request.ipControlId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisByIpControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisByIpControlResponse());
    }

    public DescribeApisByIpControlResponse describeApisByIpControl(DescribeApisByIpControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApisByIpControlWithOptions(request, runtime);
    }

    public DescribeApisBySignatureResponse describeApisBySignatureWithOptions(DescribeApisBySignatureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("SignatureId", request.signatureId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisBySignature"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisBySignatureResponse());
    }

    public DescribeApisBySignatureResponse describeApisBySignature(DescribeApisBySignatureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApisBySignatureWithOptions(request, runtime);
    }

    public DescribeApisByTrafficControlResponse describeApisByTrafficControlWithOptions(DescribeApisByTrafficControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("TrafficControlId", request.trafficControlId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisByTrafficControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisByTrafficControlResponse());
    }

    public DescribeApisByTrafficControlResponse describeApisByTrafficControl(DescribeApisByTrafficControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApisByTrafficControlWithOptions(request, runtime);
    }

    public DescribeAppResponse describeAppWithOptions(DescribeAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApp"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppResponse());
    }

    public DescribeAppResponse describeApp(DescribeAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppWithOptions(request, runtime);
    }

    public DescribeAppAttributesResponse describeAppAttributesWithOptions(DescribeAppAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppId", request.appId);
        query.put("AppKey", request.appKey);
        query.put("AppName", request.appName);
        query.put("EnableTagAuth", request.enableTagAuth);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("Sort", request.sort);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppAttributes"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppAttributesResponse());
    }

    public DescribeAppAttributesResponse describeAppAttributes(DescribeAppAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppAttributesWithOptions(request, runtime);
    }

    public DescribeAppSecurityResponse describeAppSecurityWithOptions(DescribeAppSecurityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppSecurity"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppSecurityResponse());
    }

    public DescribeAppSecurityResponse describeAppSecurity(DescribeAppSecurityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppSecurityWithOptions(request, runtime);
    }

    public DescribeAppsResponse describeAppsWithOptions(DescribeAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("AppOwner", request.appOwner);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApps"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppsResponse());
    }

    public DescribeAppsResponse describeApps(DescribeAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppsWithOptions(request, runtime);
    }

    public DescribeAuthorizedApisResponse describeAuthorizedApisWithOptions(DescribeAuthorizedApisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuthorizedApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuthorizedApisResponse());
    }

    public DescribeAuthorizedApisResponse describeAuthorizedApis(DescribeAuthorizedApisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAuthorizedApisWithOptions(request, runtime);
    }

    public DescribeAuthorizedAppsResponse describeAuthorizedAppsWithOptions(DescribeAuthorizedAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("AppId", request.appId);
        query.put("AppName", request.appName);
        query.put("AppOwnerId", request.appOwnerId);
        query.put("GroupId", request.groupId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuthorizedApps"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuthorizedAppsResponse());
    }

    public DescribeAuthorizedAppsResponse describeAuthorizedApps(DescribeAuthorizedAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAuthorizedAppsWithOptions(request, runtime);
    }

    public DescribeDeployApiTaskResponse describeDeployApiTaskWithOptions(DescribeDeployApiTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OperationUid", request.operationUid);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeployApiTask"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeployApiTaskResponse());
    }

    public DescribeDeployApiTaskResponse describeDeployApiTask(DescribeDeployApiTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeployApiTaskWithOptions(request, runtime);
    }

    public DescribeDeployedApiResponse describeDeployedApiWithOptions(DescribeDeployedApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeployedApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeployedApiResponse());
    }

    public DescribeDeployedApiResponse describeDeployedApi(DescribeDeployedApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeployedApiWithOptions(request, runtime);
    }

    public DescribeDeployedApisResponse describeDeployedApisWithOptions(DescribeDeployedApisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("ApiName", request.apiName);
        query.put("EnableTagAuth", request.enableTagAuth);
        query.put("GroupId", request.groupId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeployedApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeployedApisResponse());
    }

    public DescribeDeployedApisResponse describeDeployedApis(DescribeDeployedApisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeployedApisWithOptions(request, runtime);
    }

    public DescribeDomainResponse describeDomainWithOptions(DescribeDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomain"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainResponse());
    }

    public DescribeDomainResponse describeDomain(DescribeDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainWithOptions(request, runtime);
    }

    public DescribeHistoryApisResponse describeHistoryApisWithOptions(DescribeHistoryApisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("ApiName", request.apiName);
        query.put("GroupId", request.groupId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHistoryApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHistoryApisResponse());
    }

    public DescribeHistoryApisResponse describeHistoryApis(DescribeHistoryApisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHistoryApisWithOptions(request, runtime);
    }

    public DescribeIpControlPolicyItemsResponse describeIpControlPolicyItemsWithOptions(DescribeIpControlPolicyItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IpControlId", request.ipControlId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("PolicyItemId", request.policyItemId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIpControlPolicyItems"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIpControlPolicyItemsResponse());
    }

    public DescribeIpControlPolicyItemsResponse describeIpControlPolicyItems(DescribeIpControlPolicyItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpControlPolicyItemsWithOptions(request, runtime);
    }

    public DescribeIpControlsResponse describeIpControlsWithOptions(DescribeIpControlsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IpControlId", request.ipControlId);
        query.put("IpControlName", request.ipControlName);
        query.put("IpControlType", request.ipControlType);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIpControls"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIpControlsResponse());
    }

    public DescribeIpControlsResponse describeIpControls(DescribeIpControlsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpControlsWithOptions(request, runtime);
    }

    public DescribeLogConfigResponse describeLogConfigWithOptions(DescribeLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("LogType", request.logType);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogConfig"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogConfigResponse());
    }

    public DescribeLogConfigResponse describeLogConfig(DescribeLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLogConfigWithOptions(request, runtime);
    }

    public DescribeMarketRemainsQuotaResponse describeMarketRemainsQuotaWithOptions(DescribeMarketRemainsQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMarketRemainsQuota"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMarketRemainsQuotaResponse());
    }

    public DescribeMarketRemainsQuotaResponse describeMarketRemainsQuota(DescribeMarketRemainsQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMarketRemainsQuotaWithOptions(request, runtime);
    }

    public DescribeModelsResponse describeModelsWithOptions(DescribeModelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupId", request.groupId);
        query.put("ModelId", request.modelId);
        query.put("ModelName", request.modelName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeModels"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeModelsResponse());
    }

    public DescribeModelsResponse describeModels(DescribeModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeModelsWithOptions(request, runtime);
    }

    public DescribePluginSchemasResponse describePluginSchemasWithOptions(DescribePluginSchemasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Language", request.language);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePluginSchemas"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePluginSchemasResponse());
    }

    public DescribePluginSchemasResponse describePluginSchemas(DescribePluginSchemasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePluginSchemasWithOptions(request, runtime);
    }

    public DescribePluginTemplatesResponse describePluginTemplatesWithOptions(DescribePluginTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Language", request.language);
        query.put("PluginName", request.pluginName);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePluginTemplates"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePluginTemplatesResponse());
    }

    public DescribePluginTemplatesResponse describePluginTemplates(DescribePluginTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePluginTemplatesWithOptions(request, runtime);
    }

    public DescribePluginsResponse describePluginsWithOptions(DescribePluginsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("PluginId", request.pluginId);
        query.put("PluginName", request.pluginName);
        query.put("PluginType", request.pluginType);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePlugins"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePluginsResponse());
    }

    public DescribePluginsResponse describePlugins(DescribePluginsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePluginsWithOptions(request, runtime);
    }

    public DescribePluginsByApiResponse describePluginsByApiWithOptions(DescribePluginsByApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePluginsByApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePluginsByApiResponse());
    }

    public DescribePluginsByApiResponse describePluginsByApi(DescribePluginsByApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePluginsByApiWithOptions(request, runtime);
    }

    public DescribePurchasedApiGroupResponse describePurchasedApiGroupWithOptions(DescribePurchasedApiGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePurchasedApiGroup"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePurchasedApiGroupResponse());
    }

    public DescribePurchasedApiGroupResponse describePurchasedApiGroup(DescribePurchasedApiGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePurchasedApiGroupWithOptions(request, runtime);
    }

    public DescribePurchasedApiGroupsResponse describePurchasedApiGroupsWithOptions(DescribePurchasedApiGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePurchasedApiGroups"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePurchasedApiGroupsResponse());
    }

    public DescribePurchasedApiGroupsResponse describePurchasedApiGroups(DescribePurchasedApiGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePurchasedApiGroupsWithOptions(request, runtime);
    }

    public DescribePurchasedApisResponse describePurchasedApisWithOptions(DescribePurchasedApisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("ApiName", request.apiName);
        query.put("GroupId", request.groupId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        query.put("Visibility", request.visibility);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePurchasedApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePurchasedApisResponse());
    }

    public DescribePurchasedApisResponse describePurchasedApis(DescribePurchasedApisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePurchasedApisWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Language", request.language);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeSignaturesResponse describeSignaturesWithOptions(DescribeSignaturesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("SignatureId", request.signatureId);
        query.put("SignatureName", request.signatureName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSignatures"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSignaturesResponse());
    }

    public DescribeSignaturesResponse describeSignatures(DescribeSignaturesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSignaturesWithOptions(request, runtime);
    }

    public DescribeSignaturesByApiResponse describeSignaturesByApiWithOptions(DescribeSignaturesByApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSignaturesByApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSignaturesByApiResponse());
    }

    public DescribeSignaturesByApiResponse describeSignaturesByApi(DescribeSignaturesByApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSignaturesByApiWithOptions(request, runtime);
    }

    public DescribeSystemParametersResponse describeSystemParametersWithOptions(DescribeSystemParametersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSystemParameters"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSystemParametersResponse());
    }

    public DescribeSystemParametersResponse describeSystemParameters(DescribeSystemParametersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSystemParametersWithOptions(request, runtime);
    }

    public DescribeTrafficControlsResponse describeTrafficControlsWithOptions(DescribeTrafficControlsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("GroupId", request.groupId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        query.put("TrafficControlId", request.trafficControlId);
        query.put("TrafficControlName", request.trafficControlName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrafficControls"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTrafficControlsResponse());
    }

    public DescribeTrafficControlsResponse describeTrafficControls(DescribeTrafficControlsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTrafficControlsWithOptions(request, runtime);
    }

    public DescribeTrafficControlsByApiResponse describeTrafficControlsByApiWithOptions(DescribeTrafficControlsByApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrafficControlsByApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTrafficControlsByApiResponse());
    }

    public DescribeTrafficControlsByApiResponse describeTrafficControlsByApi(DescribeTrafficControlsByApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTrafficControlsByApiWithOptions(request, runtime);
    }

    public DescribeUpdateVpcInfoTaskResponse describeUpdateVpcInfoTaskWithOptions(DescribeUpdateVpcInfoTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OperationUid", request.operationUid);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUpdateVpcInfoTask"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUpdateVpcInfoTaskResponse());
    }

    public DescribeUpdateVpcInfoTaskResponse describeUpdateVpcInfoTask(DescribeUpdateVpcInfoTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUpdateVpcInfoTaskWithOptions(request, runtime);
    }

    public DescribeVpcAccessesResponse describeVpcAccessesWithOptions(DescribeVpcAccessesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Name", request.name);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("VpcAccessId", request.vpcAccessId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcAccesses"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcAccessesResponse());
    }

    public DescribeVpcAccessesResponse describeVpcAccesses(DescribeVpcAccessesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcAccessesWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Language", request.language);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public DryRunSwaggerResponse dryRunSwaggerWithOptions(DryRunSwaggerRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DryRunSwaggerShrinkRequest request = new DryRunSwaggerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.globalCondition)) {
            request.globalConditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.globalCondition, "GlobalCondition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DataFormat", request.dataFormat);
        query.put("GlobalCondition", request.globalConditionShrink);
        query.put("GroupId", request.groupId);
        query.put("Overwrite", request.overwrite);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DryRunSwagger"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DryRunSwaggerResponse());
    }

    public DryRunSwaggerResponse dryRunSwagger(DryRunSwaggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dryRunSwaggerWithOptions(request, runtime);
    }

    public ImportSwaggerResponse importSwaggerWithOptions(ImportSwaggerRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportSwaggerShrinkRequest request = new ImportSwaggerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.globalCondition)) {
            request.globalConditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.globalCondition, "GlobalCondition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DataFormat", request.dataFormat);
        query.put("DryRun", request.dryRun);
        query.put("GlobalCondition", request.globalConditionShrink);
        query.put("GroupId", request.groupId);
        query.put("Overwrite", request.overwrite);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportSwagger"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportSwaggerResponse());
    }

    public ImportSwaggerResponse importSwagger(ImportSwaggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importSwaggerWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NextToken", request.nextToken);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifyApiResponse modifyApiWithOptions(ModifyApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AllowSignatureMethod", request.allowSignatureMethod);
        query.put("ApiId", request.apiId);
        query.put("ApiName", request.apiName);
        query.put("AppCodeAuthType", request.appCodeAuthType);
        query.put("AuthType", request.authType);
        query.put("ConstantParameters", request.constantParameters);
        query.put("Description", request.description);
        query.put("DisableInternet", request.disableInternet);
        query.put("ErrorCodeSamples", request.errorCodeSamples);
        query.put("FailResultSample", request.failResultSample);
        query.put("ForceNonceCheck", request.forceNonceCheck);
        query.put("GroupId", request.groupId);
        query.put("OpenIdConnectConfig", request.openIdConnectConfig);
        query.put("RequestConfig", request.requestConfig);
        query.put("RequestParameters", request.requestParameters);
        query.put("ResultBodyModel", request.resultBodyModel);
        query.put("ResultDescriptions", request.resultDescriptions);
        query.put("ResultSample", request.resultSample);
        query.put("ResultType", request.resultType);
        query.put("SecurityToken", request.securityToken);
        query.put("ServiceConfig", request.serviceConfig);
        query.put("ServiceParameters", request.serviceParameters);
        query.put("ServiceParametersMap", request.serviceParametersMap);
        query.put("SystemParameters", request.systemParameters);
        query.put("Visibility", request.visibility);
        query.put("WebSocketApiType", request.webSocketApiType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApiResponse());
    }

    public ModifyApiResponse modifyApi(ModifyApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyApiWithOptions(request, runtime);
    }

    public ModifyApiGroupResponse modifyApiGroupWithOptions(ModifyApiGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BasePath", request.basePath);
        query.put("CompatibleFlags", request.compatibleFlags);
        query.put("CustomTraceConfig", request.customTraceConfig);
        query.put("CustomerConfigs", request.customerConfigs);
        query.put("DefaultDomain", request.defaultDomain);
        query.put("Description", request.description);
        query.put("GroupId", request.groupId);
        query.put("GroupName", request.groupName);
        query.put("PassthroughHeaders", request.passthroughHeaders);
        query.put("RpcPattern", request.rpcPattern);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        query.put("UserLogConfig", request.userLogConfig);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApiGroup"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApiGroupResponse());
    }

    public ModifyApiGroupResponse modifyApiGroup(ModifyApiGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyApiGroupWithOptions(request, runtime);
    }

    public ModifyApiGroupVpcWhitelistResponse modifyApiGroupVpcWhitelistWithOptions(ModifyApiGroupVpcWhitelistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("VpcIds", request.vpcIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApiGroupVpcWhitelist"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApiGroupVpcWhitelistResponse());
    }

    public ModifyApiGroupVpcWhitelistResponse modifyApiGroupVpcWhitelist(ModifyApiGroupVpcWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyApiGroupVpcWhitelistWithOptions(request, runtime);
    }

    public ModifyAppResponse modifyAppWithOptions(ModifyAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("AppName", request.appName);
        query.put("Description", request.description);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApp"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppResponse());
    }

    public ModifyAppResponse modifyApp(ModifyAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAppWithOptions(request, runtime);
    }

    public ModifyInstanceSpecResponse modifyInstanceSpecWithOptions(ModifyInstanceSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AutoPay", request.autoPay);
        query.put("InstanceId", request.instanceId);
        query.put("InstanceSpec", request.instanceSpec);
        query.put("Token", request.token);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceSpec"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceSpecResponse());
    }

    public ModifyInstanceSpecResponse modifyInstanceSpec(ModifyInstanceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceSpecWithOptions(request, runtime);
    }

    public ModifyIpControlResponse modifyIpControlWithOptions(ModifyIpControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("IpControlId", request.ipControlId);
        query.put("IpControlName", request.ipControlName);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyIpControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyIpControlResponse());
    }

    public ModifyIpControlResponse modifyIpControl(ModifyIpControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIpControlWithOptions(request, runtime);
    }

    public ModifyIpControlPolicyItemResponse modifyIpControlPolicyItemWithOptions(ModifyIpControlPolicyItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("CidrIp", request.cidrIp);
        query.put("IpControlId", request.ipControlId);
        query.put("PolicyItemId", request.policyItemId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyIpControlPolicyItem"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyIpControlPolicyItemResponse());
    }

    public ModifyIpControlPolicyItemResponse modifyIpControlPolicyItem(ModifyIpControlPolicyItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIpControlPolicyItemWithOptions(request, runtime);
    }

    public ModifyLogConfigResponse modifyLogConfigWithOptions(ModifyLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("LogType", request.logType);
        query.put("SecurityToken", request.securityToken);
        query.put("SlsLogStore", request.slsLogStore);
        query.put("SlsProject", request.slsProject);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLogConfig"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLogConfigResponse());
    }

    public ModifyLogConfigResponse modifyLogConfig(ModifyLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLogConfigWithOptions(request, runtime);
    }

    public ModifyModelResponse modifyModelWithOptions(ModifyModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("GroupId", request.groupId);
        query.put("ModelName", request.modelName);
        query.put("NewModelName", request.newModelName);
        query.put("Schema", request.schema);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyModel"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyModelResponse());
    }

    public ModifyModelResponse modifyModel(ModifyModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyModelWithOptions(request, runtime);
    }

    public ModifyPluginResponse modifyPluginWithOptions(ModifyPluginRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("PluginData", request.pluginData);
        query.put("PluginId", request.pluginId);
        query.put("PluginName", request.pluginName);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPlugin"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPluginResponse());
    }

    public ModifyPluginResponse modifyPlugin(ModifyPluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPluginWithOptions(request, runtime);
    }

    public ModifySignatureResponse modifySignatureWithOptions(ModifySignatureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        query.put("SignatureId", request.signatureId);
        query.put("SignatureKey", request.signatureKey);
        query.put("SignatureName", request.signatureName);
        query.put("SignatureSecret", request.signatureSecret);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySignature"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySignatureResponse());
    }

    public ModifySignatureResponse modifySignature(ModifySignatureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySignatureWithOptions(request, runtime);
    }

    public ModifyTrafficControlResponse modifyTrafficControlWithOptions(ModifyTrafficControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiDefault", request.apiDefault);
        query.put("AppDefault", request.appDefault);
        query.put("Description", request.description);
        query.put("SecurityToken", request.securityToken);
        query.put("TrafficControlId", request.trafficControlId);
        query.put("TrafficControlName", request.trafficControlName);
        query.put("TrafficControlUnit", request.trafficControlUnit);
        query.put("UserDefault", request.userDefault);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTrafficControl"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTrafficControlResponse());
    }

    public ModifyTrafficControlResponse modifyTrafficControl(ModifyTrafficControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyTrafficControlWithOptions(request, runtime);
    }

    public OpenApiGatewayServiceResponse openApiGatewayServiceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenApiGatewayService"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenApiGatewayServiceResponse());
    }

    public OpenApiGatewayServiceResponse openApiGatewayService() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openApiGatewayServiceWithOptions(runtime);
    }

    public ReactivateDomainResponse reactivateDomainWithOptions(ReactivateDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReactivateDomain"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReactivateDomainResponse());
    }

    public ReactivateDomainResponse reactivateDomain(ReactivateDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reactivateDomainWithOptions(request, runtime);
    }

    public RemoveApisAuthoritiesResponse removeApisAuthoritiesWithOptions(RemoveApisAuthoritiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiIds", request.apiIds);
        query.put("AppId", request.appId);
        query.put("Description", request.description);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveApisAuthorities"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveApisAuthoritiesResponse());
    }

    public RemoveApisAuthoritiesResponse removeApisAuthorities(RemoveApisAuthoritiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeApisAuthoritiesWithOptions(request, runtime);
    }

    public RemoveAppsAuthoritiesResponse removeAppsAuthoritiesWithOptions(RemoveAppsAuthoritiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("AppIds", request.appIds);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveAppsAuthorities"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAppsAuthoritiesResponse());
    }

    public RemoveAppsAuthoritiesResponse removeAppsAuthorities(RemoveAppsAuthoritiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeAppsAuthoritiesWithOptions(request, runtime);
    }

    public RemoveIpControlApisResponse removeIpControlApisWithOptions(RemoveIpControlApisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiIds", request.apiIds);
        query.put("GroupId", request.groupId);
        query.put("IpControlId", request.ipControlId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveIpControlApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveIpControlApisResponse());
    }

    public RemoveIpControlApisResponse removeIpControlApis(RemoveIpControlApisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeIpControlApisWithOptions(request, runtime);
    }

    public RemoveIpControlPolicyItemResponse removeIpControlPolicyItemWithOptions(RemoveIpControlPolicyItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IpControlId", request.ipControlId);
        query.put("PolicyItemIds", request.policyItemIds);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveIpControlPolicyItem"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveIpControlPolicyItemResponse());
    }

    public RemoveIpControlPolicyItemResponse removeIpControlPolicyItem(RemoveIpControlPolicyItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeIpControlPolicyItemWithOptions(request, runtime);
    }

    public RemoveSignatureApisResponse removeSignatureApisWithOptions(RemoveSignatureApisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiIds", request.apiIds);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("SignatureId", request.signatureId);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSignatureApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSignatureApisResponse());
    }

    public RemoveSignatureApisResponse removeSignatureApis(RemoveSignatureApisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeSignatureApisWithOptions(request, runtime);
    }

    public RemoveTrafficControlApisResponse removeTrafficControlApisWithOptions(RemoveTrafficControlApisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiIds", request.apiIds);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        query.put("TrafficControlId", request.trafficControlId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTrafficControlApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTrafficControlApisResponse());
    }

    public RemoveTrafficControlApisResponse removeTrafficControlApis(RemoveTrafficControlApisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeTrafficControlApisWithOptions(request, runtime);
    }

    public RemoveVpcAccessResponse removeVpcAccessWithOptions(RemoveVpcAccessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("NeedBatchWork", request.needBatchWork);
        query.put("Port", request.port);
        query.put("SecurityToken", request.securityToken);
        query.put("VpcId", request.vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveVpcAccess"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveVpcAccessResponse());
    }

    public RemoveVpcAccessResponse removeVpcAccess(RemoveVpcAccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeVpcAccessWithOptions(request, runtime);
    }

    public RemoveVpcAccessAndAbolishApisResponse removeVpcAccessAndAbolishApisWithOptions(RemoveVpcAccessAndAbolishApisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("NeedBatchWork", request.needBatchWork);
        query.put("Port", request.port);
        query.put("SecurityToken", request.securityToken);
        query.put("VpcId", request.vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveVpcAccessAndAbolishApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveVpcAccessAndAbolishApisResponse());
    }

    public RemoveVpcAccessAndAbolishApisResponse removeVpcAccessAndAbolishApis(RemoveVpcAccessAndAbolishApisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeVpcAccessAndAbolishApisWithOptions(request, runtime);
    }

    public ResetAppCodeResponse resetAppCodeWithOptions(ResetAppCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAppCode"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAppCodeResponse());
    }

    public ResetAppCodeResponse resetAppCode(ResetAppCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAppCodeWithOptions(request, runtime);
    }

    public ResetAppSecretResponse resetAppSecretWithOptions(ResetAppSecretRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppKey", request.appKey);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAppSecret"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAppSecretResponse());
    }

    public ResetAppSecretResponse resetAppSecret(ResetAppSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAppSecretWithOptions(request, runtime);
    }

    public SdkGenerateByAppResponse sdkGenerateByAppWithOptions(SdkGenerateByAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("Language", request.language);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SdkGenerateByApp"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SdkGenerateByAppResponse());
    }

    public SdkGenerateByAppResponse sdkGenerateByApp(SdkGenerateByAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sdkGenerateByAppWithOptions(request, runtime);
    }

    public SdkGenerateByGroupResponse sdkGenerateByGroupWithOptions(SdkGenerateByGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupId", request.groupId);
        query.put("Language", request.language);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SdkGenerateByGroup"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SdkGenerateByGroupResponse());
    }

    public SdkGenerateByGroupResponse sdkGenerateByGroup(SdkGenerateByGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sdkGenerateByGroupWithOptions(request, runtime);
    }

    public SetApisAuthoritiesResponse setApisAuthoritiesWithOptions(SetApisAuthoritiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiIds", request.apiIds);
        query.put("AppId", request.appId);
        query.put("AuthValidTime", request.authValidTime);
        query.put("Description", request.description);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetApisAuthorities"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetApisAuthoritiesResponse());
    }

    public SetApisAuthoritiesResponse setApisAuthorities(SetApisAuthoritiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setApisAuthoritiesWithOptions(request, runtime);
    }

    public SetAppsAuthoritiesResponse setAppsAuthoritiesWithOptions(SetAppsAuthoritiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("AppIds", request.appIds);
        query.put("AuthValidTime", request.authValidTime);
        query.put("Description", request.description);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAppsAuthorities"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAppsAuthoritiesResponse());
    }

    public SetAppsAuthoritiesResponse setAppsAuthorities(SetAppsAuthoritiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAppsAuthoritiesWithOptions(request, runtime);
    }

    public SetDomainResponse setDomainWithOptions(SetDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BindStageName", request.bindStageName);
        query.put("CustomDomainType", request.customDomainType);
        query.put("DomainName", request.domainName);
        query.put("GroupId", request.groupId);
        query.put("IsForce", request.isForce);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDomain"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDomainResponse());
    }

    public SetDomainResponse setDomain(SetDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDomainWithOptions(request, runtime);
    }

    public SetDomainCertificateResponse setDomainCertificateWithOptions(SetDomainCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CaCertificateBody", request.caCertificateBody);
        query.put("CertificateBody", request.certificateBody);
        query.put("CertificateName", request.certificateName);
        query.put("CertificatePrivateKey", request.certificatePrivateKey);
        query.put("DomainName", request.domainName);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDomainCertificate"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDomainCertificateResponse());
    }

    public SetDomainCertificateResponse setDomainCertificate(SetDomainCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDomainCertificateWithOptions(request, runtime);
    }

    public SetDomainWebSocketStatusResponse setDomainWebSocketStatusWithOptions(SetDomainWebSocketStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ActionValue", request.actionValue);
        query.put("DomainName", request.domainName);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDomainWebSocketStatus"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDomainWebSocketStatusResponse());
    }

    public SetDomainWebSocketStatusResponse setDomainWebSocketStatus(SetDomainWebSocketStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDomainWebSocketStatusWithOptions(request, runtime);
    }

    public SetIpControlApisResponse setIpControlApisWithOptions(SetIpControlApisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiIds", request.apiIds);
        query.put("GroupId", request.groupId);
        query.put("IpControlId", request.ipControlId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetIpControlApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetIpControlApisResponse());
    }

    public SetIpControlApisResponse setIpControlApis(SetIpControlApisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setIpControlApisWithOptions(request, runtime);
    }

    public SetSignatureApisResponse setSignatureApisWithOptions(SetSignatureApisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiIds", request.apiIds);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("SignatureId", request.signatureId);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSignatureApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSignatureApisResponse());
    }

    public SetSignatureApisResponse setSignatureApis(SetSignatureApisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setSignatureApisWithOptions(request, runtime);
    }

    public SetTrafficControlApisResponse setTrafficControlApisWithOptions(SetTrafficControlApisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiIds", request.apiIds);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        query.put("TrafficControlId", request.trafficControlId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetTrafficControlApis"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetTrafficControlApisResponse());
    }

    public SetTrafficControlApisResponse setTrafficControlApis(SetTrafficControlApisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setTrafficControlApisWithOptions(request, runtime);
    }

    public SetVpcAccessResponse setVpcAccessWithOptions(SetVpcAccessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("InstanceId", request.instanceId);
        query.put("Name", request.name);
        query.put("Port", request.port);
        query.put("SecurityToken", request.securityToken);
        query.put("VpcId", request.vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetVpcAccess"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetVpcAccessResponse());
    }

    public SetVpcAccessResponse setVpcAccess(SetVpcAccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setVpcAccessWithOptions(request, runtime);
    }

    public SetWildcardDomainPatternsResponse setWildcardDomainPatternsWithOptions(SetWildcardDomainPatternsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DomainName", request.domainName);
        query.put("GroupId", request.groupId);
        query.put("SecurityToken", request.securityToken);
        query.put("WildcardDomainPatterns", request.wildcardDomainPatterns);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetWildcardDomainPatterns"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetWildcardDomainPatternsResponse());
    }

    public SetWildcardDomainPatternsResponse setWildcardDomainPatterns(SetWildcardDomainPatternsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setWildcardDomainPatternsWithOptions(request, runtime);
    }

    public SwitchApiResponse switchApiWithOptions(SwitchApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiId", request.apiId);
        query.put("Description", request.description);
        query.put("GroupId", request.groupId);
        query.put("HistoryVersion", request.historyVersion);
        query.put("SecurityToken", request.securityToken);
        query.put("StageName", request.stageName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchApi"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchApiResponse());
    }

    public SwitchApiResponse switchApi(SwitchApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchApiWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("All", request.all);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("SecurityToken", request.securityToken);
        query.put("TagKey", request.tagKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2016-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
