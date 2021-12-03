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
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAliasWithOptions(serviceName, request, headers, runtime);
    }

    public CreateAliasResponse createAliasWithOptions(String serviceName, CreateAliasRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateAlias", "2021-04-06", "HTTPS", "POST", "AK", "/2021-04-06/services/" + serviceName + "/aliases", "json", req, runtime), new CreateAliasResponse());
    }

    public CreateCustomDomainResponse createCustomDomain(CreateCustomDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCustomDomainWithOptions(request, headers, runtime);
    }

    public CreateCustomDomainResponse createCustomDomainWithOptions(CreateCustomDomainRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateCustomDomain", "2021-04-06", "HTTPS", "POST", "AK", "/2021-04-06/custom-domains", "json", req, runtime), new CreateCustomDomainResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcCodeChecksum)) {
            realHeaders.put("x-fc-code-checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateFunction", "2021-04-06", "HTTPS", "POST", "AK", "/2021-04-06/services/" + serviceName + "/functions", "json", req, runtime), new CreateFunctionResponse());
    }

    public CreateLayerVersionResponse createLayerVersion(String layerName, CreateLayerVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLayerVersionWithOptions(layerName, request, headers, runtime);
    }

    public CreateLayerVersionResponse createLayerVersionWithOptions(String layerName, CreateLayerVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateLayerVersion", "2021-04-06", "HTTPS", "POST", "AK", "/2021-04-06/layers/" + layerName + "/versions", "json", req, runtime), new CreateLayerVersionResponse());
    }

    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceWithOptions(request, headers, runtime);
    }

    public CreateServiceResponse createServiceWithOptions(CreateServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateService", "2021-04-06", "HTTPS", "POST", "AK", "/2021-04-06/services", "json", req, runtime), new CreateServiceResponse());
    }

    public CreateTriggerResponse createTrigger(String serviceName, String functionName, CreateTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTriggerWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public CreateTriggerResponse createTriggerWithOptions(String serviceName, String functionName, CreateTriggerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateTrigger", "2021-04-06", "HTTPS", "POST", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/triggers", "json", req, runtime), new CreateTriggerResponse());
    }

    public CreateVpcBindingResponse createVpcBinding(String serviceName, CreateVpcBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVpcBindingWithOptions(serviceName, request, headers, runtime);
    }

    public CreateVpcBindingResponse createVpcBindingWithOptions(String serviceName, CreateVpcBindingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("vpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateVpcBinding", "2021-04-06", "HTTPS", "POST", "AK", "/2021-04-06/services/" + serviceName + "/bindings", "none", req, runtime), new CreateVpcBindingResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteAlias", "2021-04-06", "HTTPS", "DELETE", "AK", "/2021-04-06/services/" + serviceName + "/aliases/" + aliasName + "", "none", req, runtime), new DeleteAliasResponse());
    }

    public DeleteCustomDomainResponse deleteCustomDomain(String domainName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCustomDomainWithOptions(domainName, headers, runtime);
    }

    public DeleteCustomDomainResponse deleteCustomDomainWithOptions(String domainName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        domainName = com.aliyun.openapiutil.Client.getEncodeParam(domainName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteCustomDomain", "2021-04-06", "HTTPS", "DELETE", "AK", "/2021-04-06/custom-domains/" + domainName + "", "none", req, runtime), new DeleteCustomDomainResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteFunction", "2021-04-06", "HTTPS", "DELETE", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "", "none", req, runtime), new DeleteFunctionResponse());
    }

    public DeleteFunctionAsyncInvokeConfigResponse deleteFunctionAsyncInvokeConfig(String serviceName, String functionName, DeleteFunctionAsyncInvokeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFunctionAsyncInvokeConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public DeleteFunctionAsyncInvokeConfigResponse deleteFunctionAsyncInvokeConfigWithOptions(String serviceName, String functionName, DeleteFunctionAsyncInvokeConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteFunctionAsyncInvokeConfig", "2021-04-06", "HTTPS", "DELETE", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/async-invoke-config", "none", req, runtime), new DeleteFunctionAsyncInvokeConfigResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteFunctionOnDemandConfig", "2021-04-06", "HTTPS", "DELETE", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/on-demand-config", "none", req, runtime), new DeleteFunctionOnDemandConfigResponse());
    }

    public DeleteLayerVersionResponse deleteLayerVersion(String layerName, String version) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLayerVersionWithOptions(layerName, version, headers, runtime);
    }

    public DeleteLayerVersionResponse deleteLayerVersionWithOptions(String layerName, String version, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        layerName = com.aliyun.openapiutil.Client.getEncodeParam(layerName);
        version = com.aliyun.openapiutil.Client.getEncodeParam(version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteLayerVersion", "2021-04-06", "HTTPS", "DELETE", "AK", "/2021-04-06/layers/" + layerName + "/versions/" + version + "", "none", req, runtime), new DeleteLayerVersionResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteService", "2021-04-06", "HTTPS", "DELETE", "AK", "/2021-04-06/services/" + serviceName + "", "none", req, runtime), new DeleteServiceResponse());
    }

    public DeleteServiceVersionResponse deleteServiceVersion(String serviceName, String versionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceVersionWithOptions(serviceName, versionId, headers, runtime);
    }

    public DeleteServiceVersionResponse deleteServiceVersionWithOptions(String serviceName, String versionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        versionId = com.aliyun.openapiutil.Client.getEncodeParam(versionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteServiceVersion", "2021-04-06", "HTTPS", "DELETE", "AK", "/2021-04-06/services/" + serviceName + "/versions/" + versionId + "", "none", req, runtime), new DeleteServiceVersionResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteTrigger", "2021-04-06", "HTTPS", "DELETE", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/triggers/" + triggerName + "", "none", req, runtime), new DeleteTriggerResponse());
    }

    public DeleteVpcBindingResponse deleteVpcBinding(String serviceName, String vpcId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVpcBindingWithOptions(serviceName, vpcId, headers, runtime);
    }

    public DeleteVpcBindingResponse deleteVpcBindingWithOptions(String serviceName, String vpcId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        vpcId = com.aliyun.openapiutil.Client.getEncodeParam(vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteVpcBinding", "2021-04-06", "HTTPS", "DELETE", "AK", "/2021-04-06/services/" + serviceName + "/bindings/" + vpcId + "", "none", req, runtime), new DeleteVpcBindingResponse());
    }

    public DeregisterEventSourceResponse deregisterEventSource(String serviceName, String functionName, String sourceArn, DeregisterEventSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deregisterEventSourceWithOptions(serviceName, functionName, sourceArn, request, headers, runtime);
    }

    public DeregisterEventSourceResponse deregisterEventSourceWithOptions(String serviceName, String functionName, String sourceArn, DeregisterEventSourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        sourceArn = com.aliyun.openapiutil.Client.getEncodeParam(sourceArn);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeregisterEventSource", "2021-04-06", "HTTPS", "DELETE", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/event-sources/" + sourceArn + "", "none", req, runtime), new DeregisterEventSourceResponse());
    }

    public GetAccountSettingsResponse getAccountSettings() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAccountSettingsWithOptions(headers, runtime);
    }

    public GetAccountSettingsResponse getAccountSettingsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetAccountSettings", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/account-settings", "json", req, runtime), new GetAccountSettingsResponse());
    }

    public GetAliasResponse getAlias(String serviceName, String aliasName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAliasWithOptions(serviceName, aliasName, headers, runtime);
    }

    public GetAliasResponse getAliasWithOptions(String serviceName, String aliasName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        aliasName = com.aliyun.openapiutil.Client.getEncodeParam(aliasName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetAlias", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/aliases/" + aliasName + "", "json", req, runtime), new GetAliasResponse());
    }

    public GetCustomDomainResponse getCustomDomain(String domainName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCustomDomainWithOptions(domainName, headers, runtime);
    }

    public GetCustomDomainResponse getCustomDomainWithOptions(String domainName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        domainName = com.aliyun.openapiutil.Client.getEncodeParam(domainName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetCustomDomain", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/custom-domains/" + domainName + "", "json", req, runtime), new GetCustomDomainResponse());
    }

    public GetFunctionResponse getFunction(String serviceName, String functionName, GetFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public GetFunctionResponse getFunctionWithOptions(String serviceName, String functionName, GetFunctionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetFunction", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "", "json", req, runtime), new GetFunctionResponse());
    }

    public GetFunctionAsyncInvokeConfigResponse getFunctionAsyncInvokeConfig(String serviceName, String functionName, GetFunctionAsyncInvokeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionAsyncInvokeConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public GetFunctionAsyncInvokeConfigResponse getFunctionAsyncInvokeConfigWithOptions(String serviceName, String functionName, GetFunctionAsyncInvokeConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetFunctionAsyncInvokeConfig", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/async-invoke-config", "json", req, runtime), new GetFunctionAsyncInvokeConfigResponse());
    }

    public GetFunctionCodeResponse getFunctionCode(String serviceName, String functionName, GetFunctionCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionCodeWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public GetFunctionCodeResponse getFunctionCodeWithOptions(String serviceName, String functionName, GetFunctionCodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetFunctionCode", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/code", "json", req, runtime), new GetFunctionCodeResponse());
    }

    public GetFunctionOnDemandConfigResponse getFunctionOnDemandConfig(String serviceName, String functionName, GetFunctionOnDemandConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionOnDemandConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public GetFunctionOnDemandConfigResponse getFunctionOnDemandConfigWithOptions(String serviceName, String functionName, GetFunctionOnDemandConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetFunctionOnDemandConfig", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/on-demand-config", "json", req, runtime), new GetFunctionOnDemandConfigResponse());
    }

    public GetLayerVersionResponse getLayerVersion(String layerName, String version) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLayerVersionWithOptions(layerName, version, headers, runtime);
    }

    public GetLayerVersionResponse getLayerVersionWithOptions(String layerName, String version, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        layerName = com.aliyun.openapiutil.Client.getEncodeParam(layerName);
        version = com.aliyun.openapiutil.Client.getEncodeParam(version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetLayerVersion", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/layers/" + layerName + "/versions/" + version + "", "json", req, runtime), new GetLayerVersionResponse());
    }

    public GetLayerVersionByArnResponse getLayerVersionByArn(String arn) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLayerVersionByArnWithOptions(arn, headers, runtime);
    }

    public GetLayerVersionByArnResponse getLayerVersionByArnWithOptions(String arn, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        arn = com.aliyun.openapiutil.Client.getEncodeParam(arn);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetLayerVersionByArn", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/layerarn/" + arn + "", "json", req, runtime), new GetLayerVersionByArnResponse());
    }

    public GetProvisionConfigResponse getProvisionConfig(String serviceName, String functionName, GetProvisionConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProvisionConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public GetProvisionConfigResponse getProvisionConfigWithOptions(String serviceName, String functionName, GetProvisionConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetProvisionConfig", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/provision-config", "json", req, runtime), new GetProvisionConfigResponse());
    }

    public GetResourceTagsResponse getResourceTags(GetResourceTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceTagsWithOptions(request, headers, runtime);
    }

    public GetResourceTagsResponse getResourceTagsWithOptions(GetResourceTagsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceArn)) {
            query.put("resourceArn", request.resourceArn);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetResourceTags", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/tag", "json", req, runtime), new GetResourceTagsResponse());
    }

    public GetServiceResponse getService(String serviceName, GetServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceWithOptions(serviceName, request, headers, runtime);
    }

    public GetServiceResponse getServiceWithOptions(String serviceName, GetServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetService", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "", "json", req, runtime), new GetServiceResponse());
    }

    public GetStatefulAsyncInvocationResponse getStatefulAsyncInvocation(String serviceName, String functionName, String invocationId, GetStatefulAsyncInvocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStatefulAsyncInvocationWithOptions(serviceName, functionName, invocationId, request, headers, runtime);
    }

    public GetStatefulAsyncInvocationResponse getStatefulAsyncInvocationWithOptions(String serviceName, String functionName, String invocationId, GetStatefulAsyncInvocationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        invocationId = com.aliyun.openapiutil.Client.getEncodeParam(invocationId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetStatefulAsyncInvocation", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/stateful-async-invocations/" + invocationId + "", "json", req, runtime), new GetStatefulAsyncInvocationResponse());
    }

    public GetTriggerResponse getTrigger(String serviceName, String functionName, String triggerName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTriggerWithOptions(serviceName, functionName, triggerName, headers, runtime);
    }

    public GetTriggerResponse getTriggerWithOptions(String serviceName, String functionName, String triggerName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        triggerName = com.aliyun.openapiutil.Client.getEncodeParam(triggerName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetTrigger", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/triggers/" + triggerName + "", "json", req, runtime), new GetTriggerResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("x-fc-invocation-type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("x-fc-log-type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcStatefulAsyncInvocationId)) {
            realHeaders.put("x-fc-stateful-async-invocation-id", com.aliyun.teautil.Common.toJSONString(headers.xFcStatefulAsyncInvocationId));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        return TeaModel.toModel(this.doROARequest("InvokeFunction", "2021-04-06", "HTTPS", "POST", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/invocations", "byte", req, runtime), new InvokeFunctionResponse());
    }

    public ListAliasesResponse listAliases(String serviceName, ListAliasesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAliasesWithOptions(serviceName, request, headers, runtime);
    }

    public ListAliasesResponse listAliasesWithOptions(String serviceName, ListAliasesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListAliases", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/aliases", "json", req, runtime), new ListAliasesResponse());
    }

    public ListCustomDomainsResponse listCustomDomains(ListCustomDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCustomDomainsWithOptions(request, headers, runtime);
    }

    public ListCustomDomainsResponse listCustomDomainsWithOptions(ListCustomDomainsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListCustomDomains", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/custom-domains", "json", req, runtime), new ListCustomDomainsResponse());
    }

    public ListEventSourcesResponse listEventSources(String serviceName, String functionName, ListEventSourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEventSourcesWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public ListEventSourcesResponse listEventSourcesWithOptions(String serviceName, String functionName, ListEventSourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListEventSources", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/event-sources", "json", req, runtime), new ListEventSourcesResponse());
    }

    public ListFunctionAsyncInvokeConfigsResponse listFunctionAsyncInvokeConfigs(String serviceName, String functionName, ListFunctionAsyncInvokeConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionAsyncInvokeConfigsWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public ListFunctionAsyncInvokeConfigsResponse listFunctionAsyncInvokeConfigsWithOptions(String serviceName, String functionName, ListFunctionAsyncInvokeConfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListFunctionAsyncInvokeConfigs", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/async-invoke-configs", "json", req, runtime), new ListFunctionAsyncInvokeConfigsResponse());
    }

    public ListFunctionsResponse listFunctions(String serviceName, ListFunctionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionsWithOptions(serviceName, request, headers, runtime);
    }

    public ListFunctionsResponse listFunctionsWithOptions(String serviceName, ListFunctionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListFunctions", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/functions", "json", req, runtime), new ListFunctionsResponse());
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
        return TeaModel.toModel(this.doROARequest("ListInstances", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/instances", "json", req, runtime), new ListInstancesResponse());
    }

    public ListLayerVersionsResponse listLayerVersions(String layerName, ListLayerVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLayerVersionsWithOptions(layerName, request, headers, runtime);
    }

    public ListLayerVersionsResponse listLayerVersionsWithOptions(String layerName, ListLayerVersionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        layerName = com.aliyun.openapiutil.Client.getEncodeParam(layerName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startVersion)) {
            query.put("startVersion", request.startVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListLayerVersions", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/layers/" + layerName + "/versions", "json", req, runtime), new ListLayerVersionsResponse());
    }

    public ListLayersResponse listLayers(ListLayersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLayersWithOptions(request, headers, runtime);
    }

    public ListLayersResponse listLayersWithOptions(ListLayersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListLayers", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/layers", "json", req, runtime), new ListLayersResponse());
    }

    public ListOnDemandConfigsResponse listOnDemandConfigs(ListOnDemandConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOnDemandConfigsWithOptions(request, headers, runtime);
    }

    public ListOnDemandConfigsResponse listOnDemandConfigsWithOptions(ListOnDemandConfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListOnDemandConfigs", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/on-demand-configs", "json", req, runtime), new ListOnDemandConfigsResponse());
    }

    public ListProvisionConfigsResponse listProvisionConfigs(ListProvisionConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProvisionConfigsWithOptions(request, headers, runtime);
    }

    public ListProvisionConfigsResponse listProvisionConfigsWithOptions(ListProvisionConfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListProvisionConfigs", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/provision-configs", "json", req, runtime), new ListProvisionConfigsResponse());
    }

    public ListReservedCapacitiesResponse listReservedCapacities(ListReservedCapacitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listReservedCapacitiesWithOptions(request, headers, runtime);
    }

    public ListReservedCapacitiesResponse listReservedCapacitiesWithOptions(ListReservedCapacitiesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListReservedCapacities", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/reserved-capacities", "json", req, runtime), new ListReservedCapacitiesResponse());
    }

    public ListServiceVersionsResponse listServiceVersions(String serviceName, ListServiceVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceVersionsWithOptions(serviceName, request, headers, runtime);
    }

    public ListServiceVersionsResponse listServiceVersionsWithOptions(String serviceName, ListServiceVersionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListServiceVersions", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/versions", "json", req, runtime), new ListServiceVersionsResponse());
    }

    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServicesWithOptions(request, headers, runtime);
    }

    public ListServicesResponse listServicesWithOptions(ListServicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListServices", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services", "json", req, runtime), new ListServicesResponse());
    }

    public ListStatefulAsyncInvocationsResponse listStatefulAsyncInvocations(String serviceName, String functionName, ListStatefulAsyncInvocationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStatefulAsyncInvocationsWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public ListStatefulAsyncInvocationsResponse listStatefulAsyncInvocationsWithOptions(String serviceName, String functionName, ListStatefulAsyncInvocationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListStatefulAsyncInvocations", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/stateful-async-invocations", "json", req, runtime), new ListStatefulAsyncInvocationsResponse());
    }

    public ListTaggedResourcesResponse listTaggedResources(ListTaggedResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTaggedResourcesWithOptions(request, headers, runtime);
    }

    public ListTaggedResourcesResponse listTaggedResourcesWithOptions(ListTaggedResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListTaggedResources", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/tags", "json", req, runtime), new ListTaggedResourcesResponse());
    }

    public ListTriggersResponse listTriggers(String serviceName, String functionName, ListTriggersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTriggersWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public ListTriggersResponse listTriggersWithOptions(String serviceName, String functionName, ListTriggersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListTriggers", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/triggers", "json", req, runtime), new ListTriggersResponse());
    }

    public ListVpcBindingsResponse listVpcBindings(String serviceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVpcBindingsWithOptions(serviceName, headers, runtime);
    }

    public ListVpcBindingsResponse listVpcBindingsWithOptions(String serviceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListVpcBindings", "2021-04-06", "HTTPS", "GET", "AK", "/2021-04-06/services/" + serviceName + "/bindings", "json", req, runtime), new ListVpcBindingsResponse());
    }

    public PermanentDeleteLayerVersionResponse permanentDeleteLayerVersion(String userID, String layerName, String version) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.permanentDeleteLayerVersionWithOptions(userID, layerName, version, headers, runtime);
    }

    public PermanentDeleteLayerVersionResponse permanentDeleteLayerVersionWithOptions(String userID, String layerName, String version, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        userID = com.aliyun.openapiutil.Client.getEncodeParam(userID);
        layerName = com.aliyun.openapiutil.Client.getEncodeParam(layerName);
        version = com.aliyun.openapiutil.Client.getEncodeParam(version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("PermanentDeleteLayerVersion", "2021-04-06", "HTTPS", "DELETE", "AK", "/2021-04-06/adminlayers/" + userID + "/" + layerName + "/versions/" + version + "", "none", req, runtime), new PermanentDeleteLayerVersionResponse());
    }

    public PublishLayerAsPublicResponse publishLayerAsPublic(String layerName, String version) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishLayerAsPublicWithOptions(layerName, version, headers, runtime);
    }

    public PublishLayerAsPublicResponse publishLayerAsPublicWithOptions(String layerName, String version, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        layerName = com.aliyun.openapiutil.Client.getEncodeParam(layerName);
        version = com.aliyun.openapiutil.Client.getEncodeParam(version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("PublishLayerAsPublic", "2021-04-06", "HTTPS", "POST", "AK", "/2021-04-06/layers/" + layerName + "/versions/" + version + "", "none", req, runtime), new PublishLayerAsPublicResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("PublishServiceVersion", "2021-04-06", "HTTPS", "POST", "AK", "/2021-04-06/services/" + serviceName + "/versions", "json", req, runtime), new PublishServiceVersionResponse());
    }

    public PutFunctionAsyncInvokeConfigResponse putFunctionAsyncInvokeConfig(String serviceName, String functionName, PutFunctionAsyncInvokeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putFunctionAsyncInvokeConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public PutFunctionAsyncInvokeConfigResponse putFunctionAsyncInvokeConfigWithOptions(String serviceName, String functionName, PutFunctionAsyncInvokeConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("PutFunctionAsyncInvokeConfig", "2021-04-06", "HTTPS", "PUT", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/async-invoke-config", "json", req, runtime), new PutFunctionAsyncInvokeConfigResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("PutFunctionOnDemandConfig", "2021-04-06", "HTTPS", "PUT", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/on-demand-config", "json", req, runtime), new PutFunctionOnDemandConfigResponse());
    }

    public PutProvisionConfigResponse putProvisionConfig(String serviceName, String functionName, PutProvisionConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putProvisionConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public PutProvisionConfigResponse putProvisionConfigWithOptions(String serviceName, String functionName, PutProvisionConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("PutProvisionConfig", "2021-04-06", "HTTPS", "PUT", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/provision-config", "json", req, runtime), new PutProvisionConfigResponse());
    }

    public RegisterEventSourceResponse registerEventSource(String serviceName, String functionName, RegisterEventSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerEventSourceWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public RegisterEventSourceResponse registerEventSourceWithOptions(String serviceName, String functionName, RegisterEventSourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("RegisterEventSource", "2021-04-06", "HTTPS", "POST", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/event-sources", "json", req, runtime), new RegisterEventSourceResponse());
    }

    public StopStatefulAsyncInvocationResponse stopStatefulAsyncInvocation(String serviceName, String functionName, String invocationId, StopStatefulAsyncInvocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopStatefulAsyncInvocationWithOptions(serviceName, functionName, invocationId, request, headers, runtime);
    }

    public StopStatefulAsyncInvocationResponse stopStatefulAsyncInvocationWithOptions(String serviceName, String functionName, String invocationId, StopStatefulAsyncInvocationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        serviceName = com.aliyun.openapiutil.Client.getEncodeParam(serviceName);
        functionName = com.aliyun.openapiutil.Client.getEncodeParam(functionName);
        invocationId = com.aliyun.openapiutil.Client.getEncodeParam(invocationId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("StopStatefulAsyncInvocation", "2021-04-06", "HTTPS", "PUT", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/stateful-async-invocations/" + invocationId + "", "none", req, runtime), new StopStatefulAsyncInvocationResponse());
    }

    public TagResourceResponse tagResource(TagResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourceWithOptions(request, headers, runtime);
    }

    public TagResourceResponse tagResourceWithOptions(TagResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceArn)) {
            body.put("resourceArn", request.resourceArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("TagResource", "2021-04-06", "HTTPS", "POST", "AK", "/2021-04-06/tag", "none", req, runtime), new TagResourceResponse());
    }

    public UntagResourceResponse untagResource(UntagResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourceWithOptions(request, headers, runtime);
    }

    public UntagResourceResponse untagResourceWithOptions(UntagResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UntagResource", "2021-04-06", "HTTPS", "DELETE", "AK", "/2021-04-06/tag", "none", req, runtime), new UntagResourceResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateAlias", "2021-04-06", "HTTPS", "PUT", "AK", "/2021-04-06/services/" + serviceName + "/aliases/" + aliasName + "", "json", req, runtime), new UpdateAliasResponse());
    }

    public UpdateCustomDomainResponse updateCustomDomain(String domainName, UpdateCustomDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCustomDomainWithOptions(domainName, request, headers, runtime);
    }

    public UpdateCustomDomainResponse updateCustomDomainWithOptions(String domainName, UpdateCustomDomainRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateCustomDomain", "2021-04-06", "HTTPS", "PUT", "AK", "/2021-04-06/custom-domains/" + domainName + "", "json", req, runtime), new UpdateCustomDomainResponse());
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
            realHeaders.put("x-fc-code-checksum", com.aliyun.teautil.Common.toJSONString(headers.xFcCodeChecksum));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateFunction", "2021-04-06", "HTTPS", "PUT", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "", "json", req, runtime), new UpdateFunctionResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateService", "2021-04-06", "HTTPS", "PUT", "AK", "/2021-04-06/services/" + serviceName + "", "json", req, runtime), new UpdateServiceResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateTrigger", "2021-04-06", "HTTPS", "PUT", "AK", "/2021-04-06/services/" + serviceName + "/functions/" + functionName + "/triggers/" + triggerName + "", "json", req, runtime), new UpdateTriggerResponse());
    }
}
