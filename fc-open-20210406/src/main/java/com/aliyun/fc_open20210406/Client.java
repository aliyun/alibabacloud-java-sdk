// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406;

import com.aliyun.tea.*;
import com.aliyun.fc_open20210406.models.*;
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
            new TeaPair("ap-northeast-1", "account-id.ap-northeast-1.fc.aliyuncs.com"),
            new TeaPair("ap-south-1", "account-id.ap-south-1.fc.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "account-id.ap-southeast-1.fc.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "account-id.ap-southeast-2.fc.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "account-id.ap-southeast-3.fc.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "account-id.ap-southeast-5.fc.aliyuncs.com"),
            new TeaPair("cn-beijing", "account-id.cn-beijing.fc.aliyuncs.com"),
            new TeaPair("cn-chengdu", "account-id.cn-chengdu.fc.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "account-id.cn-hangzhou.fc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "account-id.cn-hangzhou-finance.fc.aliyuncs.com"),
            new TeaPair("cn-hongkong", "account-id.cn-hongkong.fc.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "account-id.cn-huhehaote.fc.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "account-id.cn-north-2-gov-1.fc.aliyuncs.com"),
            new TeaPair("cn-qingdao", "account-id.cn-qingdao.fc.aliyuncs.com"),
            new TeaPair("cn-shanghai", "account-id.cn-shanghai.fc.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "account-id.cn-shenzhen.fc.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "account-id.cn-zhangjiakou.fc.aliyuncs.com"),
            new TeaPair("eu-central-1", "account-id.eu-central-1.fc.aliyuncs.com"),
            new TeaPair("eu-west-1", "account-id.eu-west-1.fc.aliyuncs.com"),
            new TeaPair("us-east-1", "account-id.us-east-1.fc.aliyuncs.com"),
            new TeaPair("us-west-1", "account-id.us-west-1.fc.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("fc-open", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateAliasResponse createAlias(String serviceName, CreateAliasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateAliasHeaders headers = new CreateAliasHeaders();
        return this.createAliasWithOptions(serviceName, request, headers, runtime);
    }

    public CreateAliasResponse createAliasWithOptions(String serviceName, CreateAliasRequest request, CreateAliasHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalVersionWeight)) {
            body.put("additionalVersionWeight", request.additionalVersionWeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            body.put("aliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("versionId", request.versionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlias"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/aliases"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAliasResponse());
    }

    public CreateCustomDomainResponse createCustomDomain(CreateCustomDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateCustomDomainHeaders headers = new CreateCustomDomainHeaders();
        return this.createCustomDomainWithOptions(request, headers, runtime);
    }

    public CreateCustomDomainResponse createCustomDomainWithOptions(CreateCustomDomainRequest request, CreateCustomDomainHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.certConfig))) {
            body.put("certConfig", request.certConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("domainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.routeConfig))) {
            body.put("routeConfig", request.routeConfig);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomDomain"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/custom-domains"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomDomainResponse());
    }

    public CreateFunctionResponse createFunction(String serviceName, CreateFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateFunctionHeaders headers = new CreateFunctionHeaders();
        return this.createFunctionWithOptions(serviceName, request, headers, runtime);
    }

    public CreateFunctionResponse createFunctionWithOptions(String serviceName, CreateFunctionRequest request, CreateFunctionHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caPort)) {
            body.put("caPort", request.caPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.code))) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.customContainerConfig))) {
            body.put("customContainerConfig", request.customContainerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.customDNS))) {
            body.put("customDNS", request.customDNS);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.customRuntimeConfig))) {
            body.put("customRuntimeConfig", request.customRuntimeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentVariables)) {
            body.put("environmentVariables", request.environmentVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            body.put("functionName", request.functionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.handler)) {
            body.put("handler", request.handler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initializationTimeout)) {
            body.put("initializationTimeout", request.initializationTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initializer)) {
            body.put("initializer", request.initializer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceConcurrency)) {
            body.put("instanceConcurrency", request.instanceConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.instanceLifecycleConfig))) {
            body.put("instanceLifecycleConfig", request.instanceLifecycleConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layers)) {
            body.put("layers", request.layers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memorySize)) {
            body.put("memorySize", request.memorySize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtime)) {
            body.put("runtime", request.runtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("timeout", request.timeout);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFunction"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFunctionResponse());
    }

    public CreateLayerVersionResponse createLayerVersion(String layerName, CreateLayerVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateLayerVersionHeaders headers = new CreateLayerVersionHeaders();
        return this.createLayerVersionWithOptions(layerName, request, headers, runtime);
    }

    public CreateLayerVersionResponse createLayerVersionWithOptions(String layerName, CreateLayerVersionRequest request, CreateLayerVersionHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        layerName = com.aliyun.openapiutil.Client.getEncodeParam(layerName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.code))) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compatibleRuntime)) {
            body.put("compatibleRuntime", request.compatibleRuntime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLayerVersion"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/layers/" + layerName + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLayerVersionResponse());
    }

    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateServiceHeaders headers = new CreateServiceHeaders();
        return this.createServiceWithOptions(request, headers, runtime);
    }

    public CreateServiceResponse createServiceWithOptions(CreateServiceRequest request, CreateServiceHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetAccess)) {
            body.put("internetAccess", request.internetAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.logConfig))) {
            body.put("logConfig", request.logConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.nasConfig))) {
            body.put("nasConfig", request.nasConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tracingConfig))) {
            body.put("tracingConfig", request.tracingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.vpcConfig))) {
            body.put("vpcConfig", request.vpcConfig);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateService"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceResponse());
    }

    public CreateTriggerResponse createTrigger(String serviceName, String functionName, CreateTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateTriggerHeaders headers = new CreateTriggerHeaders();
        return this.createTriggerWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public CreateTriggerResponse createTriggerWithOptions(String serviceName, String functionName, CreateTriggerRequest request, CreateTriggerHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invocationRole)) {
            body.put("invocationRole", request.invocationRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            body.put("qualifier", request.qualifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceArn)) {
            body.put("sourceArn", request.sourceArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerConfig)) {
            body.put("triggerConfig", request.triggerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerName)) {
            body.put("triggerName", request.triggerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            body.put("triggerType", request.triggerType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrigger"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/triggers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTriggerResponse());
    }

    public CreateVpcBindingResponse createVpcBinding(String serviceName, CreateVpcBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateVpcBindingHeaders headers = new CreateVpcBindingHeaders();
        return this.createVpcBindingWithOptions(serviceName, request, headers, runtime);
    }

    public CreateVpcBindingResponse createVpcBindingWithOptions(String serviceName, CreateVpcBindingRequest request, CreateVpcBindingHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("vpcId", request.vpcId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcBinding"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/bindings"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcBindingResponse());
    }

    public DeleteAliasResponse deleteAlias(String serviceName, String aliasName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        DeleteAliasHeaders headers = new DeleteAliasHeaders();
        return this.deleteAliasWithOptions(serviceName, aliasName, headers, runtime);
    }

    public DeleteAliasResponse deleteAliasWithOptions(String serviceName, String aliasName, DeleteAliasHeaders headers, RuntimeOptions runtime) throws Exception {
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        aliasName = com.aliyun.openapiutil.Client.getEncodeParam(aliasName);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifMatch)) {
            realHeaders.put("If-Match", com.aliyun.teautil.Common.toJSONString(headers.ifMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlias"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/aliases/" + aliasName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAliasResponse());
    }

    public DeleteCustomDomainResponse deleteCustomDomain(String domainName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        DeleteCustomDomainHeaders headers = new DeleteCustomDomainHeaders();
        return this.deleteCustomDomainWithOptions(domainName, headers, runtime);
    }

    public DeleteCustomDomainResponse deleteCustomDomainWithOptions(String domainName, DeleteCustomDomainHeaders headers, RuntimeOptions runtime) throws Exception {
        domainName = com.aliyun.openapiutil.Client.getEncodeParam(domainName);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomDomain"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/custom-domains/" + domainName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomDomainResponse());
    }

    public DeleteFunctionResponse deleteFunction(String serviceName, String functionName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        DeleteFunctionHeaders headers = new DeleteFunctionHeaders();
        return this.deleteFunctionWithOptions(serviceName, functionName, headers, runtime);
    }

    public DeleteFunctionResponse deleteFunctionWithOptions(String serviceName, String functionName, DeleteFunctionHeaders headers, RuntimeOptions runtime) throws Exception {
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifMatch)) {
            realHeaders.put("If-Match", com.aliyun.teautil.Common.toJSONString(headers.ifMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunction"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionResponse());
    }

    public DeleteFunctionAsyncInvokeConfigResponse deleteFunctionAsyncInvokeConfig(String serviceName, String functionName, DeleteFunctionAsyncInvokeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        DeleteFunctionAsyncInvokeConfigHeaders headers = new DeleteFunctionAsyncInvokeConfigHeaders();
        return this.deleteFunctionAsyncInvokeConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public DeleteFunctionAsyncInvokeConfigResponse deleteFunctionAsyncInvokeConfigWithOptions(String serviceName, String functionName, DeleteFunctionAsyncInvokeConfigRequest request, DeleteFunctionAsyncInvokeConfigHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunctionAsyncInvokeConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/async-invoke-config"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionAsyncInvokeConfigResponse());
    }

    public DeleteFunctionOnDemandConfigResponse deleteFunctionOnDemandConfig(String serviceName, String functionName, DeleteFunctionOnDemandConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        DeleteFunctionOnDemandConfigHeaders headers = new DeleteFunctionOnDemandConfigHeaders();
        return this.deleteFunctionOnDemandConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public DeleteFunctionOnDemandConfigResponse deleteFunctionOnDemandConfigWithOptions(String serviceName, String functionName, DeleteFunctionOnDemandConfigRequest request, DeleteFunctionOnDemandConfigHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifMatch)) {
            realHeaders.put("If-Match", com.aliyun.teautil.Common.toJSONString(headers.ifMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunctionOnDemandConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/on-demand-config"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionOnDemandConfigResponse());
    }

    public DeleteLayerVersionResponse deleteLayerVersion(String layerName, String version) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        DeleteLayerVersionHeaders headers = new DeleteLayerVersionHeaders();
        return this.deleteLayerVersionWithOptions(layerName, version, headers, runtime);
    }

    public DeleteLayerVersionResponse deleteLayerVersionWithOptions(String layerName, String version, DeleteLayerVersionHeaders headers, RuntimeOptions runtime) throws Exception {
        layerName = com.aliyun.openapiutil.Client.getEncodeParam(layerName);
        version = com.aliyun.openapiutil.Client.getEncodeParam(version);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLayerVersion"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/layers/" + layerName + "/versions/" + version + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLayerVersionResponse());
    }

    public DeleteServiceResponse deleteService(String serviceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        DeleteServiceHeaders headers = new DeleteServiceHeaders();
        return this.deleteServiceWithOptions(serviceName, headers, runtime);
    }

    public DeleteServiceResponse deleteServiceWithOptions(String serviceName, DeleteServiceHeaders headers, RuntimeOptions runtime) throws Exception {
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifMatch)) {
            realHeaders.put("If-Match", com.aliyun.teautil.Common.toJSONString(headers.ifMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteService"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceResponse());
    }

    public DeleteServiceVersionResponse deleteServiceVersion(String serviceName, String versionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        DeleteServiceVersionHeaders headers = new DeleteServiceVersionHeaders();
        return this.deleteServiceVersionWithOptions(serviceName, versionId, headers, runtime);
    }

    public DeleteServiceVersionResponse deleteServiceVersionWithOptions(String serviceName, String versionId, DeleteServiceVersionHeaders headers, RuntimeOptions runtime) throws Exception {
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        versionId = com.aliyun.openapiutil.Client.getEncodeParam(versionId);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceVersion"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/versions/" + versionId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceVersionResponse());
    }

    public DeleteTriggerResponse deleteTrigger(String serviceName, String functionName, String triggerName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        DeleteTriggerHeaders headers = new DeleteTriggerHeaders();
        return this.deleteTriggerWithOptions(serviceName, functionName, triggerName, headers, runtime);
    }

    public DeleteTriggerResponse deleteTriggerWithOptions(String serviceName, String functionName, String triggerName, DeleteTriggerHeaders headers, RuntimeOptions runtime) throws Exception {
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        triggerName = com.aliyun.openapiutil.Client.getEncodeParam(triggerName);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifMatch)) {
            realHeaders.put("If-Match", com.aliyun.teautil.Common.toJSONString(headers.ifMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrigger"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/triggers/" + triggerName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTriggerResponse());
    }

    public DeleteVpcBindingResponse deleteVpcBinding(String serviceName, String vpcId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        DeleteVpcBindingHeaders headers = new DeleteVpcBindingHeaders();
        return this.deleteVpcBindingWithOptions(serviceName, vpcId, headers, runtime);
    }

    public DeleteVpcBindingResponse deleteVpcBindingWithOptions(String serviceName, String vpcId, DeleteVpcBindingHeaders headers, RuntimeOptions runtime) throws Exception {
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        vpcId = com.aliyun.openapiutil.Client.getEncodeParam(vpcId);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpcBinding"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/bindings/" + vpcId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpcBindingResponse());
    }

    public DeregisterEventSourceResponse deregisterEventSource(String serviceName, String functionName, String sourceArn, DeregisterEventSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        DeregisterEventSourceHeaders headers = new DeregisterEventSourceHeaders();
        return this.deregisterEventSourceWithOptions(serviceName, functionName, sourceArn, request, headers, runtime);
    }

    public DeregisterEventSourceResponse deregisterEventSourceWithOptions(String serviceName, String functionName, String sourceArn, DeregisterEventSourceRequest request, DeregisterEventSourceHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        sourceArn = com.aliyun.openapiutil.Client.getEncodeParam(sourceArn);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeregisterEventSource"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/event-sources/" + sourceArn + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeregisterEventSourceResponse());
    }

    public GetAccountSettingsResponse getAccountSettings() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetAccountSettingsHeaders headers = new GetAccountSettingsHeaders();
        return this.getAccountSettingsWithOptions(headers, runtime);
    }

    public GetAccountSettingsResponse getAccountSettingsWithOptions(GetAccountSettingsHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccountSettings"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/account-settings"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountSettingsResponse());
    }

    public GetAliasResponse getAlias(String serviceName, String aliasName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetAliasHeaders headers = new GetAliasHeaders();
        return this.getAliasWithOptions(serviceName, aliasName, headers, runtime);
    }

    public GetAliasResponse getAliasWithOptions(String serviceName, String aliasName, GetAliasHeaders headers, RuntimeOptions runtime) throws Exception {
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        aliasName = com.aliyun.openapiutil.Client.getEncodeParam(aliasName);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlias"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/aliases/" + aliasName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAliasResponse());
    }

    public GetCustomDomainResponse getCustomDomain(String domainName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetCustomDomainHeaders headers = new GetCustomDomainHeaders();
        return this.getCustomDomainWithOptions(domainName, headers, runtime);
    }

    public GetCustomDomainResponse getCustomDomainWithOptions(String domainName, GetCustomDomainHeaders headers, RuntimeOptions runtime) throws Exception {
        domainName = com.aliyun.openapiutil.Client.getEncodeParam(domainName);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomDomain"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/custom-domains/" + domainName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomDomainResponse());
    }

    public GetFunctionResponse getFunction(String serviceName, String functionName, GetFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetFunctionHeaders headers = new GetFunctionHeaders();
        return this.getFunctionWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public GetFunctionResponse getFunctionWithOptions(String serviceName, String functionName, GetFunctionRequest request, GetFunctionHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunction"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionResponse());
    }

    public GetFunctionAsyncInvokeConfigResponse getFunctionAsyncInvokeConfig(String serviceName, String functionName, GetFunctionAsyncInvokeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetFunctionAsyncInvokeConfigHeaders headers = new GetFunctionAsyncInvokeConfigHeaders();
        return this.getFunctionAsyncInvokeConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public GetFunctionAsyncInvokeConfigResponse getFunctionAsyncInvokeConfigWithOptions(String serviceName, String functionName, GetFunctionAsyncInvokeConfigRequest request, GetFunctionAsyncInvokeConfigHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionAsyncInvokeConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/async-invoke-config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionAsyncInvokeConfigResponse());
    }

    public GetFunctionCodeResponse getFunctionCode(String serviceName, String functionName, GetFunctionCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetFunctionCodeHeaders headers = new GetFunctionCodeHeaders();
        return this.getFunctionCodeWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public GetFunctionCodeResponse getFunctionCodeWithOptions(String serviceName, String functionName, GetFunctionCodeRequest request, GetFunctionCodeHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionCode"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/code"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionCodeResponse());
    }

    public GetFunctionOnDemandConfigResponse getFunctionOnDemandConfig(String serviceName, String functionName, GetFunctionOnDemandConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetFunctionOnDemandConfigHeaders headers = new GetFunctionOnDemandConfigHeaders();
        return this.getFunctionOnDemandConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public GetFunctionOnDemandConfigResponse getFunctionOnDemandConfigWithOptions(String serviceName, String functionName, GetFunctionOnDemandConfigRequest request, GetFunctionOnDemandConfigHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionOnDemandConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/on-demand-config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionOnDemandConfigResponse());
    }

    public GetLayerVersionResponse getLayerVersion(String layerName, String version) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetLayerVersionHeaders headers = new GetLayerVersionHeaders();
        return this.getLayerVersionWithOptions(layerName, version, headers, runtime);
    }

    public GetLayerVersionResponse getLayerVersionWithOptions(String layerName, String version, GetLayerVersionHeaders headers, RuntimeOptions runtime) throws Exception {
        layerName = com.aliyun.openapiutil.Client.getEncodeParam(layerName);
        version = com.aliyun.openapiutil.Client.getEncodeParam(version);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLayerVersion"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/layers/" + layerName + "/versions/" + version + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLayerVersionResponse());
    }

    public GetLayerVersionByArnResponse getLayerVersionByArn(String arn) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetLayerVersionByArnHeaders headers = new GetLayerVersionByArnHeaders();
        return this.getLayerVersionByArnWithOptions(arn, headers, runtime);
    }

    public GetLayerVersionByArnResponse getLayerVersionByArnWithOptions(String arn, GetLayerVersionByArnHeaders headers, RuntimeOptions runtime) throws Exception {
        arn = com.aliyun.openapiutil.Client.getEncodeParam(arn);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLayerVersionByArn"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/layerarn/" + arn + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLayerVersionByArnResponse());
    }

    public GetProvisionConfigResponse getProvisionConfig(String serviceName, String functionName, GetProvisionConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetProvisionConfigHeaders headers = new GetProvisionConfigHeaders();
        return this.getProvisionConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public GetProvisionConfigResponse getProvisionConfigWithOptions(String serviceName, String functionName, GetProvisionConfigRequest request, GetProvisionConfigHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProvisionConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/provision-config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProvisionConfigResponse());
    }

    public GetResourceTagsResponse getResourceTags(GetResourceTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetResourceTagsHeaders headers = new GetResourceTagsHeaders();
        return this.getResourceTagsWithOptions(request, headers, runtime);
    }

    public GetResourceTagsResponse getResourceTagsWithOptions(GetResourceTagsRequest request, GetResourceTagsHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceArn)) {
            query.put("resourceArn", request.resourceArn);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceTags"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/tag"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceTagsResponse());
    }

    public GetServiceResponse getService(String serviceName, GetServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetServiceHeaders headers = new GetServiceHeaders();
        return this.getServiceWithOptions(serviceName, request, headers, runtime);
    }

    public GetServiceResponse getServiceWithOptions(String serviceName, GetServiceRequest request, GetServiceHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetService"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceResponse());
    }

    public GetStatefulAsyncInvocationResponse getStatefulAsyncInvocation(String serviceName, String functionName, String invocationId, GetStatefulAsyncInvocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetStatefulAsyncInvocationHeaders headers = new GetStatefulAsyncInvocationHeaders();
        return this.getStatefulAsyncInvocationWithOptions(serviceName, functionName, invocationId, request, headers, runtime);
    }

    public GetStatefulAsyncInvocationResponse getStatefulAsyncInvocationWithOptions(String serviceName, String functionName, String invocationId, GetStatefulAsyncInvocationRequest request, GetStatefulAsyncInvocationHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        invocationId = com.aliyun.openapiutil.Client.getEncodeParam(invocationId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStatefulAsyncInvocation"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/stateful-async-invocations/" + invocationId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStatefulAsyncInvocationResponse());
    }

    public GetTriggerResponse getTrigger(String serviceName, String functionName, String triggerName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetTriggerHeaders headers = new GetTriggerHeaders();
        return this.getTriggerWithOptions(serviceName, functionName, triggerName, headers, runtime);
    }

    public GetTriggerResponse getTriggerWithOptions(String serviceName, String functionName, String triggerName, GetTriggerHeaders headers, RuntimeOptions runtime) throws Exception {
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        triggerName = com.aliyun.openapiutil.Client.getEncodeParam(triggerName);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrigger"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/triggers/" + triggerName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTriggerResponse());
    }

    public InvokeFunctionResponse invokeFunction(String serviceName, String functionName, InvokeFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        InvokeFunctionHeaders headers = new InvokeFunctionHeaders();
        return this.invokeFunctionWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public InvokeFunctionResponse invokeFunctionWithOptions(String serviceName, String functionName, InvokeFunctionRequest request, InvokeFunctionHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcStatefulAsyncInvocationId)) {
            realHeaders.put("X-Fc-Stateful-Async-Invocation-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcStatefulAsyncInvocationId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeFunction"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/invocations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "byte")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeFunctionResponse());
    }

    public ListAliasesResponse listAliases(String serviceName, ListAliasesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListAliasesHeaders headers = new ListAliasesHeaders();
        return this.listAliasesWithOptions(serviceName, request, headers, runtime);
    }

    public ListAliasesResponse listAliasesWithOptions(String serviceName, ListAliasesRequest request, ListAliasesHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startKey)) {
            query.put("startKey", request.startKey);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAliases"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/aliases"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAliasesResponse());
    }

    public ListCustomDomainsResponse listCustomDomains(ListCustomDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListCustomDomainsHeaders headers = new ListCustomDomainsHeaders();
        return this.listCustomDomainsWithOptions(request, headers, runtime);
    }

    public ListCustomDomainsResponse listCustomDomainsWithOptions(ListCustomDomainsRequest request, ListCustomDomainsHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startKey)) {
            query.put("startKey", request.startKey);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomDomains"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/custom-domains"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomDomainsResponse());
    }

    public ListEventSourcesResponse listEventSources(String serviceName, String functionName, ListEventSourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListEventSourcesHeaders headers = new ListEventSourcesHeaders();
        return this.listEventSourcesWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public ListEventSourcesResponse listEventSourcesWithOptions(String serviceName, String functionName, ListEventSourcesRequest request, ListEventSourcesHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEventSources"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/event-sources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventSourcesResponse());
    }

    public ListFunctionAsyncInvokeConfigsResponse listFunctionAsyncInvokeConfigs(String serviceName, String functionName, ListFunctionAsyncInvokeConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListFunctionAsyncInvokeConfigsHeaders headers = new ListFunctionAsyncInvokeConfigsHeaders();
        return this.listFunctionAsyncInvokeConfigsWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public ListFunctionAsyncInvokeConfigsResponse listFunctionAsyncInvokeConfigsWithOptions(String serviceName, String functionName, ListFunctionAsyncInvokeConfigsRequest request, ListFunctionAsyncInvokeConfigsHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctionAsyncInvokeConfigs"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/async-invoke-configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionAsyncInvokeConfigsResponse());
    }

    public ListFunctionsResponse listFunctions(String serviceName, ListFunctionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListFunctionsHeaders headers = new ListFunctionsHeaders();
        return this.listFunctionsWithOptions(serviceName, request, headers, runtime);
    }

    public ListFunctionsResponse listFunctionsWithOptions(String serviceName, ListFunctionsRequest request, ListFunctionsHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startKey)) {
            query.put("startKey", request.startKey);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctions"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionsResponse());
    }

    public ListInstancesResponse listInstances(String serviceName, String functionName, ListInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListInstancesHeaders headers = new ListInstancesHeaders();
        return this.listInstancesWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(String serviceName, String functionName, ListInstancesRequest request, ListInstancesHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    public ListLayerVersionsResponse listLayerVersions(String layerName, ListLayerVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListLayerVersionsHeaders headers = new ListLayerVersionsHeaders();
        return this.listLayerVersionsWithOptions(layerName, request, headers, runtime);
    }

    public ListLayerVersionsResponse listLayerVersionsWithOptions(String layerName, ListLayerVersionsRequest request, ListLayerVersionsHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        layerName = com.aliyun.openapiutil.Client.getEncodeParam(layerName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startVersion)) {
            query.put("startVersion", request.startVersion);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLayerVersions"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/layers/" + layerName + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLayerVersionsResponse());
    }

    public ListLayersResponse listLayers(ListLayersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListLayersHeaders headers = new ListLayersHeaders();
        return this.listLayersWithOptions(request, headers, runtime);
    }

    public ListLayersResponse listLayersWithOptions(ListLayersRequest request, ListLayersHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startKey)) {
            query.put("startKey", request.startKey);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLayers"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/layers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLayersResponse());
    }

    public ListOnDemandConfigsResponse listOnDemandConfigs(ListOnDemandConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListOnDemandConfigsHeaders headers = new ListOnDemandConfigsHeaders();
        return this.listOnDemandConfigsWithOptions(request, headers, runtime);
    }

    public ListOnDemandConfigsResponse listOnDemandConfigsWithOptions(ListOnDemandConfigsRequest request, ListOnDemandConfigsHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startKey)) {
            query.put("startKey", request.startKey);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOnDemandConfigs"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/on-demand-configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOnDemandConfigsResponse());
    }

    public ListProvisionConfigsResponse listProvisionConfigs(ListProvisionConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListProvisionConfigsHeaders headers = new ListProvisionConfigsHeaders();
        return this.listProvisionConfigsWithOptions(request, headers, runtime);
    }

    public ListProvisionConfigsResponse listProvisionConfigsWithOptions(ListProvisionConfigsRequest request, ListProvisionConfigsHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProvisionConfigs"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/provision-configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProvisionConfigsResponse());
    }

    public ListReservedCapacitiesResponse listReservedCapacities(ListReservedCapacitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListReservedCapacitiesHeaders headers = new ListReservedCapacitiesHeaders();
        return this.listReservedCapacitiesWithOptions(request, headers, runtime);
    }

    public ListReservedCapacitiesResponse listReservedCapacitiesWithOptions(ListReservedCapacitiesRequest request, ListReservedCapacitiesHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListReservedCapacities"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/reserved-capacities"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListReservedCapacitiesResponse());
    }

    public ListServiceVersionsResponse listServiceVersions(String serviceName, ListServiceVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListServiceVersionsHeaders headers = new ListServiceVersionsHeaders();
        return this.listServiceVersionsWithOptions(serviceName, request, headers, runtime);
    }

    public ListServiceVersionsResponse listServiceVersionsWithOptions(String serviceName, ListServiceVersionsRequest request, ListServiceVersionsHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startKey)) {
            query.put("startKey", request.startKey);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceVersions"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceVersionsResponse());
    }

    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListServicesHeaders headers = new ListServicesHeaders();
        return this.listServicesWithOptions(request, headers, runtime);
    }

    public ListServicesResponse listServicesWithOptions(ListServicesRequest request, ListServicesHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startKey)) {
            query.put("startKey", request.startKey);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServices"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServicesResponse());
    }

    public ListStatefulAsyncInvocationsResponse listStatefulAsyncInvocations(String serviceName, String functionName, ListStatefulAsyncInvocationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListStatefulAsyncInvocationsHeaders headers = new ListStatefulAsyncInvocationsHeaders();
        return this.listStatefulAsyncInvocationsWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public ListStatefulAsyncInvocationsResponse listStatefulAsyncInvocationsWithOptions(String serviceName, String functionName, ListStatefulAsyncInvocationsRequest request, ListStatefulAsyncInvocationsHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includePayload)) {
            query.put("includePayload", request.includePayload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invocationIdPrefix)) {
            query.put("invocationIdPrefix", request.invocationIdPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrderByTime)) {
            query.put("sortOrderByTime", request.sortOrderByTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startedTimeBegin)) {
            query.put("startedTimeBegin", request.startedTimeBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startedTimeEnd)) {
            query.put("startedTimeEnd", request.startedTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStatefulAsyncInvocations"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/stateful-async-invocations"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStatefulAsyncInvocationsResponse());
    }

    public ListTaggedResourcesResponse listTaggedResources(ListTaggedResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListTaggedResourcesHeaders headers = new ListTaggedResourcesHeaders();
        return this.listTaggedResourcesWithOptions(request, headers, runtime);
    }

    public ListTaggedResourcesResponse listTaggedResourcesWithOptions(ListTaggedResourcesRequest request, ListTaggedResourcesHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaggedResources"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaggedResourcesResponse());
    }

    public ListTriggersResponse listTriggers(String serviceName, String functionName, ListTriggersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListTriggersHeaders headers = new ListTriggersHeaders();
        return this.listTriggersWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public ListTriggersResponse listTriggersWithOptions(String serviceName, String functionName, ListTriggersRequest request, ListTriggersHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startKey)) {
            query.put("startKey", request.startKey);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTriggers"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/triggers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTriggersResponse());
    }

    public ListVpcBindingsResponse listVpcBindings(String serviceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListVpcBindingsHeaders headers = new ListVpcBindingsHeaders();
        return this.listVpcBindingsWithOptions(serviceName, headers, runtime);
    }

    public ListVpcBindingsResponse listVpcBindingsWithOptions(String serviceName, ListVpcBindingsHeaders headers, RuntimeOptions runtime) throws Exception {
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcBindings"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/bindings"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcBindingsResponse());
    }

    public PermanentDeleteLayerVersionResponse permanentDeleteLayerVersion(String userID, String layerName, String version) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        PermanentDeleteLayerVersionHeaders headers = new PermanentDeleteLayerVersionHeaders();
        return this.permanentDeleteLayerVersionWithOptions(userID, layerName, version, headers, runtime);
    }

    public PermanentDeleteLayerVersionResponse permanentDeleteLayerVersionWithOptions(String userID, String layerName, String version, PermanentDeleteLayerVersionHeaders headers, RuntimeOptions runtime) throws Exception {
        userID = com.aliyun.openapiutil.Client.getEncodeParam(userID);
        layerName = com.aliyun.openapiutil.Client.getEncodeParam(layerName);
        version = com.aliyun.openapiutil.Client.getEncodeParam(version);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PermanentDeleteLayerVersion"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/adminlayers/" + userID + "/" + layerName + "/versions/" + version + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PermanentDeleteLayerVersionResponse());
    }

    public PublishLayerAsPublicResponse publishLayerAsPublic(String layerName, String version) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        PublishLayerAsPublicHeaders headers = new PublishLayerAsPublicHeaders();
        return this.publishLayerAsPublicWithOptions(layerName, version, headers, runtime);
    }

    public PublishLayerAsPublicResponse publishLayerAsPublicWithOptions(String layerName, String version, PublishLayerAsPublicHeaders headers, RuntimeOptions runtime) throws Exception {
        layerName = com.aliyun.openapiutil.Client.getEncodeParam(layerName);
        version = com.aliyun.openapiutil.Client.getEncodeParam(version);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishLayerAsPublic"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/layers/" + layerName + "/versions/" + version + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishLayerAsPublicResponse());
    }

    public PublishServiceVersionResponse publishServiceVersion(String serviceName, PublishServiceVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        PublishServiceVersionHeaders headers = new PublishServiceVersionHeaders();
        return this.publishServiceVersionWithOptions(serviceName, request, headers, runtime);
    }

    public PublishServiceVersionResponse publishServiceVersionWithOptions(String serviceName, PublishServiceVersionRequest request, PublishServiceVersionHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifMatch)) {
            realHeaders.put("If-Match", com.aliyun.teautil.Common.toJSONString(headers.ifMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishServiceVersion"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishServiceVersionResponse());
    }

    public PutFunctionAsyncInvokeConfigResponse putFunctionAsyncInvokeConfig(String serviceName, String functionName, PutFunctionAsyncInvokeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        PutFunctionAsyncInvokeConfigHeaders headers = new PutFunctionAsyncInvokeConfigHeaders();
        return this.putFunctionAsyncInvokeConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public PutFunctionAsyncInvokeConfigResponse putFunctionAsyncInvokeConfigWithOptions(String serviceName, String functionName, PutFunctionAsyncInvokeConfigRequest request, PutFunctionAsyncInvokeConfigHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.destinationConfig))) {
            body.put("destinationConfig", request.destinationConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAsyncEventAgeInSeconds)) {
            body.put("maxAsyncEventAgeInSeconds", request.maxAsyncEventAgeInSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAsyncRetryAttempts)) {
            body.put("maxAsyncRetryAttempts", request.maxAsyncRetryAttempts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statefulInvocation)) {
            body.put("statefulInvocation", request.statefulInvocation);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutFunctionAsyncInvokeConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/async-invoke-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutFunctionAsyncInvokeConfigResponse());
    }

    public PutFunctionOnDemandConfigResponse putFunctionOnDemandConfig(String serviceName, String functionName, PutFunctionOnDemandConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        PutFunctionOnDemandConfigHeaders headers = new PutFunctionOnDemandConfigHeaders();
        return this.putFunctionOnDemandConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public PutFunctionOnDemandConfigResponse putFunctionOnDemandConfigWithOptions(String serviceName, String functionName, PutFunctionOnDemandConfigRequest request, PutFunctionOnDemandConfigHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maximumInstanceCount)) {
            body.put("maximumInstanceCount", request.maximumInstanceCount);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifMatch)) {
            realHeaders.put("If-Match", com.aliyun.teautil.Common.toJSONString(headers.ifMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutFunctionOnDemandConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/on-demand-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutFunctionOnDemandConfigResponse());
    }

    public PutProvisionConfigResponse putProvisionConfig(String serviceName, String functionName, PutProvisionConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        PutProvisionConfigHeaders headers = new PutProvisionConfigHeaders();
        return this.putProvisionConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public PutProvisionConfigResponse putProvisionConfigWithOptions(String serviceName, String functionName, PutProvisionConfigRequest request, PutProvisionConfigHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scheduledActions)) {
            body.put("scheduledActions", request.scheduledActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            body.put("target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetTrackingPolicies)) {
            body.put("targetTrackingPolicies", request.targetTrackingPolicies);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutProvisionConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/provision-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutProvisionConfigResponse());
    }

    public RegisterEventSourceResponse registerEventSource(String serviceName, String functionName, RegisterEventSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        RegisterEventSourceHeaders headers = new RegisterEventSourceHeaders();
        return this.registerEventSourceWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public RegisterEventSourceResponse registerEventSourceWithOptions(String serviceName, String functionName, RegisterEventSourceRequest request, RegisterEventSourceHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceArn)) {
            body.put("sourceArn", request.sourceArn);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterEventSource"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/event-sources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterEventSourceResponse());
    }

    public StopStatefulAsyncInvocationResponse stopStatefulAsyncInvocation(String serviceName, String functionName, String invocationId, StopStatefulAsyncInvocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        StopStatefulAsyncInvocationHeaders headers = new StopStatefulAsyncInvocationHeaders();
        return this.stopStatefulAsyncInvocationWithOptions(serviceName, functionName, invocationId, request, headers, runtime);
    }

    public StopStatefulAsyncInvocationResponse stopStatefulAsyncInvocationWithOptions(String serviceName, String functionName, String invocationId, StopStatefulAsyncInvocationRequest request, StopStatefulAsyncInvocationHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        invocationId = com.aliyun.openapiutil.Client.getEncodeParam(invocationId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopStatefulAsyncInvocation"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/stateful-async-invocations/" + invocationId + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopStatefulAsyncInvocationResponse());
    }

    public TagResourceResponse tagResource(TagResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        TagResourceHeaders headers = new TagResourceHeaders();
        return this.tagResourceWithOptions(request, headers, runtime);
    }

    public TagResourceResponse tagResourceWithOptions(TagResourceRequest request, TagResourceHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceArn)) {
            body.put("resourceArn", request.resourceArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResource"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/tag"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourceResponse());
    }

    public UntagResourceResponse untagResource(UntagResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        UntagResourceHeaders headers = new UntagResourceHeaders();
        return this.untagResourceWithOptions(request, headers, runtime);
    }

    public UntagResourceResponse untagResourceWithOptions(UntagResourceRequest request, UntagResourceHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            body.put("all", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceArn)) {
            body.put("resourceArn", request.resourceArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            body.put("tagKeys", request.tagKeys);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResource"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/tag"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourceResponse());
    }

    public UpdateAliasResponse updateAlias(String serviceName, String aliasName, UpdateAliasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        UpdateAliasHeaders headers = new UpdateAliasHeaders();
        return this.updateAliasWithOptions(serviceName, aliasName, request, headers, runtime);
    }

    public UpdateAliasResponse updateAliasWithOptions(String serviceName, String aliasName, UpdateAliasRequest request, UpdateAliasHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        aliasName = com.aliyun.openapiutil.Client.getEncodeParam(aliasName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalVersionWeight)) {
            body.put("additionalVersionWeight", request.additionalVersionWeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("versionId", request.versionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifMatch)) {
            realHeaders.put("If-Match", com.aliyun.teautil.Common.toJSONString(headers.ifMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlias"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/aliases/" + aliasName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAliasResponse());
    }

    public UpdateCustomDomainResponse updateCustomDomain(String domainName, UpdateCustomDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        UpdateCustomDomainHeaders headers = new UpdateCustomDomainHeaders();
        return this.updateCustomDomainWithOptions(domainName, request, headers, runtime);
    }

    public UpdateCustomDomainResponse updateCustomDomainWithOptions(String domainName, UpdateCustomDomainRequest request, UpdateCustomDomainHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        domainName = com.aliyun.openapiutil.Client.getEncodeParam(domainName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.certConfig))) {
            body.put("certConfig", request.certConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.routeConfig))) {
            body.put("routeConfig", request.routeConfig);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomDomain"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/custom-domains/" + domainName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomDomainResponse());
    }

    public UpdateFunctionResponse updateFunction(String serviceName, String functionName, UpdateFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        UpdateFunctionHeaders headers = new UpdateFunctionHeaders();
        return this.updateFunctionWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public UpdateFunctionResponse updateFunctionWithOptions(String serviceName, String functionName, UpdateFunctionRequest request, UpdateFunctionHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceConcurrency)) {
            body.put("InstanceConcurrency", request.instanceConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caPort)) {
            body.put("caPort", request.caPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.code))) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.customContainerConfig))) {
            body.put("customContainerConfig", request.customContainerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.customDNS))) {
            body.put("customDNS", request.customDNS);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.customRuntimeConfig))) {
            body.put("customRuntimeConfig", request.customRuntimeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentVariables)) {
            body.put("environmentVariables", request.environmentVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.handler)) {
            body.put("handler", request.handler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initializationTimeout)) {
            body.put("initializationTimeout", request.initializationTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initializer)) {
            body.put("initializer", request.initializer);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.instanceLifecycleConfig))) {
            body.put("instanceLifecycleConfig", request.instanceLifecycleConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layers)) {
            body.put("layers", request.layers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memorySize)) {
            body.put("memorySize", request.memorySize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtime)) {
            body.put("runtime", request.runtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("timeout", request.timeout);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifMatch)) {
            realHeaders.put("If-Match", com.aliyun.teautil.Common.toJSONString(headers.ifMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFunction"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFunctionResponse());
    }

    public UpdateServiceResponse updateService(String serviceName, UpdateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        UpdateServiceHeaders headers = new UpdateServiceHeaders();
        return this.updateServiceWithOptions(serviceName, request, headers, runtime);
    }

    public UpdateServiceResponse updateServiceWithOptions(String serviceName, UpdateServiceRequest request, UpdateServiceHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetAccess)) {
            body.put("internetAccess", request.internetAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.logConfig))) {
            body.put("logConfig", request.logConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.nasConfig))) {
            body.put("nasConfig", request.nasConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tracingConfig))) {
            body.put("tracingConfig", request.tracingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.vpcConfig))) {
            body.put("vpcConfig", request.vpcConfig);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifMatch)) {
            realHeaders.put("If-Match", com.aliyun.teautil.Common.toJSONString(headers.ifMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateService"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceResponse());
    }

    public UpdateTriggerResponse updateTrigger(String serviceName, String functionName, String triggerName, UpdateTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        UpdateTriggerHeaders headers = new UpdateTriggerHeaders();
        return this.updateTriggerWithOptions(serviceName, functionName, triggerName, request, headers, runtime);
    }

    public UpdateTriggerResponse updateTriggerWithOptions(String serviceName, String functionName, String triggerName, UpdateTriggerRequest request, UpdateTriggerHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        triggerName = com.aliyun.openapiutil.Client.getEncodeParam(triggerName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invocationRole)) {
            body.put("invocationRole", request.invocationRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            body.put("qualifier", request.qualifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerConfig)) {
            body.put("triggerConfig", request.triggerConfig);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifMatch)) {
            realHeaders.put("If-Match", com.aliyun.teautil.Common.toJSONString(headers.ifMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("X-Fc-Code-Checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("X-Fc-Invocation-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("X-Fc-Log-Type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTrigger"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/triggers/" + triggerName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTriggerResponse());
    }
}
