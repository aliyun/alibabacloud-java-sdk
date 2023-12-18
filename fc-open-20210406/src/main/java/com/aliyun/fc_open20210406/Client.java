// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406;

import com.aliyun.tea.*;
import com.aliyun.fc_open20210406.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    public ClaimGPUInstanceResponse claimGPUInstanceWithOptions(ClaimGPUInstanceRequest request, ClaimGPUInstanceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskPerformanceLevel)) {
            body.put("diskPerformanceLevel", request.diskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSizeGigabytes)) {
            body.put("diskSizeGigabytes", request.diskSizeGigabytes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("imageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetBandwidthOut)) {
            body.put("internetBandwidthOut", request.internetBandwidthOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sgId)) {
            body.put("sgId", request.sgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidrIp)) {
            body.put("sourceCidrIp", request.sourceCidrIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tcpPortRange)) {
            body.put("tcpPortRange", request.tcpPortRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udpPortRange)) {
            body.put("udpPortRange", request.udpPortRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("vpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswId)) {
            body.put("vswId", request.vswId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClaimGPUInstance"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/gpuInstances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClaimGPUInstanceResponse());
    }

    public ClaimGPUInstanceResponse claimGPUInstance(ClaimGPUInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ClaimGPUInstanceHeaders headers = new ClaimGPUInstanceHeaders();
        return this.claimGPUInstanceWithOptions(request, headers, runtime);
    }

    public CreateAliasResponse createAliasWithOptions(String serviceName, CreateAliasRequest request, CreateAliasHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resolvePolicy)) {
            body.put("resolvePolicy", request.resolvePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routePolicy)) {
            body.put("routePolicy", request.routePolicy);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlias"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/aliases"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAliasResponse());
    }

    public CreateAliasResponse createAlias(String serviceName, CreateAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateAliasHeaders headers = new CreateAliasHeaders();
        return this.createAliasWithOptions(serviceName, request, headers, runtime);
    }

    public CreateCustomDomainResponse createCustomDomainWithOptions(CreateCustomDomainRequest request, CreateCustomDomainHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certConfig)) {
            body.put("certConfig", request.certConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("domainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeConfig)) {
            body.put("routeConfig", request.routeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsConfig)) {
            body.put("tlsConfig", request.tlsConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wafConfig)) {
            body.put("wafConfig", request.wafConfig);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public CreateCustomDomainResponse createCustomDomain(CreateCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateCustomDomainHeaders headers = new CreateCustomDomainHeaders();
        return this.createCustomDomainWithOptions(request, headers, runtime);
    }

    public CreateFunctionResponse createFunctionWithOptions(String serviceName, CreateFunctionRequest request, CreateFunctionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caPort)) {
            body.put("caPort", request.caPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customContainerConfig)) {
            body.put("customContainerConfig", request.customContainerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customDNS)) {
            body.put("customDNS", request.customDNS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customHealthCheckConfig)) {
            body.put("customHealthCheckConfig", request.customHealthCheckConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customRuntimeConfig)) {
            body.put("customRuntimeConfig", request.customRuntimeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            body.put("diskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentVariables)) {
            body.put("environmentVariables", request.environmentVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            body.put("functionName", request.functionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuMemorySize)) {
            body.put("gpuMemorySize", request.gpuMemorySize);
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

        if (!com.aliyun.teautil.Common.isUnset(request.instanceLifecycleConfig)) {
            body.put("instanceLifecycleConfig", request.instanceLifecycleConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSoftConcurrency)) {
            body.put("instanceSoftConcurrency", request.instanceSoftConcurrency);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFunction"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFunctionResponse());
    }

    public CreateFunctionResponse createFunction(String serviceName, CreateFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateFunctionHeaders headers = new CreateFunctionHeaders();
        return this.createFunctionWithOptions(serviceName, request, headers, runtime);
    }

    public CreateLayerVersionResponse createLayerVersionWithOptions(String layerName, CreateLayerVersionRequest request, CreateLayerVersionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLayerVersion"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/layers/" + com.aliyun.openapiutil.Client.getEncodeParam(layerName) + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLayerVersionResponse());
    }

    public CreateLayerVersionResponse createLayerVersion(String layerName, CreateLayerVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateLayerVersionHeaders headers = new CreateLayerVersionHeaders();
        return this.createLayerVersionWithOptions(layerName, request, headers, runtime);
    }

    public CreateServiceResponse createServiceWithOptions(CreateServiceRequest request, CreateServiceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetAccess)) {
            body.put("internetAccess", request.internetAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logConfig)) {
            body.put("logConfig", request.logConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nasConfig)) {
            body.put("nasConfig", request.nasConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossMountConfig)) {
            body.put("ossMountConfig", request.ossMountConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracingConfig)) {
            body.put("tracingConfig", request.tracingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcConfig)) {
            body.put("vpcConfig", request.vpcConfig);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateServiceHeaders headers = new CreateServiceHeaders();
        return this.createServiceWithOptions(request, headers, runtime);
    }

    public CreateTriggerResponse createTriggerWithOptions(String serviceName, String functionName, CreateTriggerRequest request, CreateTriggerHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrigger"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/triggers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTriggerResponse());
    }

    public CreateTriggerResponse createTrigger(String serviceName, String functionName, CreateTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateTriggerHeaders headers = new CreateTriggerHeaders();
        return this.createTriggerWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public CreateVpcBindingResponse createVpcBindingWithOptions(String serviceName, CreateVpcBindingRequest request, CreateVpcBindingHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcBinding"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/bindings"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcBindingResponse());
    }

    public CreateVpcBindingResponse createVpcBinding(String serviceName, CreateVpcBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateVpcBindingHeaders headers = new CreateVpcBindingHeaders();
        return this.createVpcBindingWithOptions(serviceName, request, headers, runtime);
    }

    public DeleteAliasResponse deleteAliasWithOptions(String serviceName, String aliasName, DeleteAliasHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlias"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/aliases/" + com.aliyun.openapiutil.Client.getEncodeParam(aliasName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAliasResponse());
    }

    public DeleteAliasResponse deleteAlias(String serviceName, String aliasName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteAliasHeaders headers = new DeleteAliasHeaders();
        return this.deleteAliasWithOptions(serviceName, aliasName, headers, runtime);
    }

    public DeleteCustomDomainResponse deleteCustomDomainWithOptions(String domainName, DeleteCustomDomainHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomDomain"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/custom-domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomDomainResponse());
    }

    public DeleteCustomDomainResponse deleteCustomDomain(String domainName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteCustomDomainHeaders headers = new DeleteCustomDomainHeaders();
        return this.deleteCustomDomainWithOptions(domainName, headers, runtime);
    }

    public DeleteFunctionResponse deleteFunctionWithOptions(String serviceName, String functionName, DeleteFunctionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunction"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionResponse());
    }

    public DeleteFunctionResponse deleteFunction(String serviceName, String functionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteFunctionHeaders headers = new DeleteFunctionHeaders();
        return this.deleteFunctionWithOptions(serviceName, functionName, headers, runtime);
    }

    public DeleteFunctionAsyncInvokeConfigResponse deleteFunctionAsyncInvokeConfigWithOptions(String serviceName, String functionName, DeleteFunctionAsyncInvokeConfigRequest request, DeleteFunctionAsyncInvokeConfigHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunctionAsyncInvokeConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/async-invoke-config"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionAsyncInvokeConfigResponse());
    }

    public DeleteFunctionAsyncInvokeConfigResponse deleteFunctionAsyncInvokeConfig(String serviceName, String functionName, DeleteFunctionAsyncInvokeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteFunctionAsyncInvokeConfigHeaders headers = new DeleteFunctionAsyncInvokeConfigHeaders();
        return this.deleteFunctionAsyncInvokeConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public DeleteFunctionOnDemandConfigResponse deleteFunctionOnDemandConfigWithOptions(String serviceName, String functionName, DeleteFunctionOnDemandConfigRequest request, DeleteFunctionOnDemandConfigHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunctionOnDemandConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/on-demand-config"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionOnDemandConfigResponse());
    }

    public DeleteFunctionOnDemandConfigResponse deleteFunctionOnDemandConfig(String serviceName, String functionName, DeleteFunctionOnDemandConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteFunctionOnDemandConfigHeaders headers = new DeleteFunctionOnDemandConfigHeaders();
        return this.deleteFunctionOnDemandConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public DeleteLayerVersionResponse deleteLayerVersionWithOptions(String layerName, String version, DeleteLayerVersionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLayerVersion"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/layers/" + com.aliyun.openapiutil.Client.getEncodeParam(layerName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLayerVersionResponse());
    }

    public DeleteLayerVersionResponse deleteLayerVersion(String layerName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteLayerVersionHeaders headers = new DeleteLayerVersionHeaders();
        return this.deleteLayerVersionWithOptions(layerName, version, headers, runtime);
    }

    public DeleteServiceResponse deleteServiceWithOptions(String serviceName, DeleteServiceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteService"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceResponse());
    }

    public DeleteServiceResponse deleteService(String serviceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteServiceHeaders headers = new DeleteServiceHeaders();
        return this.deleteServiceWithOptions(serviceName, headers, runtime);
    }

    public DeleteServiceVersionResponse deleteServiceVersionWithOptions(String serviceName, String versionId, DeleteServiceVersionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceVersion"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(versionId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceVersionResponse());
    }

    public DeleteServiceVersionResponse deleteServiceVersion(String serviceName, String versionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteServiceVersionHeaders headers = new DeleteServiceVersionHeaders();
        return this.deleteServiceVersionWithOptions(serviceName, versionId, headers, runtime);
    }

    public DeleteTriggerResponse deleteTriggerWithOptions(String serviceName, String functionName, String triggerName, DeleteTriggerHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrigger"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/triggers/" + com.aliyun.openapiutil.Client.getEncodeParam(triggerName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTriggerResponse());
    }

    public DeleteTriggerResponse deleteTrigger(String serviceName, String functionName, String triggerName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteTriggerHeaders headers = new DeleteTriggerHeaders();
        return this.deleteTriggerWithOptions(serviceName, functionName, triggerName, headers, runtime);
    }

    public DeleteVpcBindingResponse deleteVpcBindingWithOptions(String serviceName, String vpcId, DeleteVpcBindingHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpcBinding"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/bindings/" + com.aliyun.openapiutil.Client.getEncodeParam(vpcId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpcBindingResponse());
    }

    public DeleteVpcBindingResponse deleteVpcBinding(String serviceName, String vpcId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteVpcBindingHeaders headers = new DeleteVpcBindingHeaders();
        return this.deleteVpcBindingWithOptions(serviceName, vpcId, headers, runtime);
    }

    public DeregisterEventSourceResponse deregisterEventSourceWithOptions(String serviceName, String functionName, String sourceArn, DeregisterEventSourceRequest request, DeregisterEventSourceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeregisterEventSource"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/event-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceArn) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeregisterEventSourceResponse());
    }

    public DeregisterEventSourceResponse deregisterEventSource(String serviceName, String functionName, String sourceArn, DeregisterEventSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeregisterEventSourceHeaders headers = new DeregisterEventSourceHeaders();
        return this.deregisterEventSourceWithOptions(serviceName, functionName, sourceArn, request, headers, runtime);
    }

    public GetAccountSettingsResponse getAccountSettingsWithOptions(GetAccountSettingsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public GetAccountSettingsResponse getAccountSettings() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetAccountSettingsHeaders headers = new GetAccountSettingsHeaders();
        return this.getAccountSettingsWithOptions(headers, runtime);
    }

    public GetAliasResponse getAliasWithOptions(String serviceName, String aliasName, GetAliasHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlias"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/aliases/" + com.aliyun.openapiutil.Client.getEncodeParam(aliasName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAliasResponse());
    }

    public GetAliasResponse getAlias(String serviceName, String aliasName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetAliasHeaders headers = new GetAliasHeaders();
        return this.getAliasWithOptions(serviceName, aliasName, headers, runtime);
    }

    public GetCustomDomainResponse getCustomDomainWithOptions(String domainName, GetCustomDomainHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomDomain"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/custom-domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomDomainResponse());
    }

    public GetCustomDomainResponse getCustomDomain(String domainName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetCustomDomainHeaders headers = new GetCustomDomainHeaders();
        return this.getCustomDomainWithOptions(domainName, headers, runtime);
    }

    public GetFunctionResponse getFunctionWithOptions(String serviceName, String functionName, GetFunctionRequest request, GetFunctionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunction"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionResponse());
    }

    public GetFunctionResponse getFunction(String serviceName, String functionName, GetFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFunctionHeaders headers = new GetFunctionHeaders();
        return this.getFunctionWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
      * StatefulAsyncInvocation indicates whether the asynchronous task feature is enabled. If the value of StatefulAsyncInvocation is true, the asynchronous task feature is enabled. All asynchronous invocations change to asynchronous task mode.
      *
      * @param request GetFunctionAsyncInvokeConfigRequest
      * @param headers GetFunctionAsyncInvokeConfigHeaders
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetFunctionAsyncInvokeConfigResponse
     */
    public GetFunctionAsyncInvokeConfigResponse getFunctionAsyncInvokeConfigWithOptions(String serviceName, String functionName, GetFunctionAsyncInvokeConfigRequest request, GetFunctionAsyncInvokeConfigHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionAsyncInvokeConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/async-invoke-config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionAsyncInvokeConfigResponse());
    }

    /**
      * StatefulAsyncInvocation indicates whether the asynchronous task feature is enabled. If the value of StatefulAsyncInvocation is true, the asynchronous task feature is enabled. All asynchronous invocations change to asynchronous task mode.
      *
      * @param request GetFunctionAsyncInvokeConfigRequest
      * @return GetFunctionAsyncInvokeConfigResponse
     */
    public GetFunctionAsyncInvokeConfigResponse getFunctionAsyncInvokeConfig(String serviceName, String functionName, GetFunctionAsyncInvokeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFunctionAsyncInvokeConfigHeaders headers = new GetFunctionAsyncInvokeConfigHeaders();
        return this.getFunctionAsyncInvokeConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public GetFunctionCodeResponse getFunctionCodeWithOptions(String serviceName, String functionName, GetFunctionCodeRequest request, GetFunctionCodeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionCode"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/code"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionCodeResponse());
    }

    public GetFunctionCodeResponse getFunctionCode(String serviceName, String functionName, GetFunctionCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFunctionCodeHeaders headers = new GetFunctionCodeHeaders();
        return this.getFunctionCodeWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public GetFunctionOnDemandConfigResponse getFunctionOnDemandConfigWithOptions(String serviceName, String functionName, GetFunctionOnDemandConfigRequest request, GetFunctionOnDemandConfigHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionOnDemandConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/on-demand-config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionOnDemandConfigResponse());
    }

    public GetFunctionOnDemandConfigResponse getFunctionOnDemandConfig(String serviceName, String functionName, GetFunctionOnDemandConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFunctionOnDemandConfigHeaders headers = new GetFunctionOnDemandConfigHeaders();
        return this.getFunctionOnDemandConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public GetLayerVersionResponse getLayerVersionWithOptions(String layerName, String version, GetLayerVersionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLayerVersion"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/layers/" + com.aliyun.openapiutil.Client.getEncodeParam(layerName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLayerVersionResponse());
    }

    public GetLayerVersionResponse getLayerVersion(String layerName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetLayerVersionHeaders headers = new GetLayerVersionHeaders();
        return this.getLayerVersionWithOptions(layerName, version, headers, runtime);
    }

    public GetProvisionConfigResponse getProvisionConfigWithOptions(String serviceName, String functionName, GetProvisionConfigRequest request, GetProvisionConfigHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProvisionConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/provision-config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProvisionConfigResponse());
    }

    public GetProvisionConfigResponse getProvisionConfig(String serviceName, String functionName, GetProvisionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetProvisionConfigHeaders headers = new GetProvisionConfigHeaders();
        return this.getProvisionConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public GetResourceTagsResponse getResourceTagsWithOptions(GetResourceTagsRequest request, GetResourceTagsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public GetResourceTagsResponse getResourceTags(GetResourceTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetResourceTagsHeaders headers = new GetResourceTagsHeaders();
        return this.getResourceTagsWithOptions(request, headers, runtime);
    }

    public GetServiceResponse getServiceWithOptions(String serviceName, GetServiceRequest request, GetServiceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetService"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceResponse());
    }

    public GetServiceResponse getService(String serviceName, GetServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetServiceHeaders headers = new GetServiceHeaders();
        return this.getServiceWithOptions(serviceName, request, headers, runtime);
    }

    /**
      * The version or alias of the service to which the asynchronous task belongs.
      *
      * @param request GetStatefulAsyncInvocationRequest
      * @param headers GetStatefulAsyncInvocationHeaders
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetStatefulAsyncInvocationResponse
     */
    public GetStatefulAsyncInvocationResponse getStatefulAsyncInvocationWithOptions(String serviceName, String functionName, String invocationId, GetStatefulAsyncInvocationRequest request, GetStatefulAsyncInvocationHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStatefulAsyncInvocation"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/stateful-async-invocations/" + com.aliyun.openapiutil.Client.getEncodeParam(invocationId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStatefulAsyncInvocationResponse());
    }

    /**
      * The version or alias of the service to which the asynchronous task belongs.
      *
      * @param request GetStatefulAsyncInvocationRequest
      * @return GetStatefulAsyncInvocationResponse
     */
    public GetStatefulAsyncInvocationResponse getStatefulAsyncInvocation(String serviceName, String functionName, String invocationId, GetStatefulAsyncInvocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetStatefulAsyncInvocationHeaders headers = new GetStatefulAsyncInvocationHeaders();
        return this.getStatefulAsyncInvocationWithOptions(serviceName, functionName, invocationId, request, headers, runtime);
    }

    public GetTriggerResponse getTriggerWithOptions(String serviceName, String functionName, String triggerName, GetTriggerHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrigger"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/triggers/" + com.aliyun.openapiutil.Client.getEncodeParam(triggerName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTriggerResponse());
    }

    public GetTriggerResponse getTrigger(String serviceName, String functionName, String triggerName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetTriggerHeaders headers = new GetTriggerHeaders();
        return this.getTriggerWithOptions(serviceName, functionName, triggerName, headers, runtime);
    }

    public InvokeFunctionResponse invokeFunctionWithOptions(String serviceName, String functionName, InvokeFunctionRequest request, InvokeFunctionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        byte[] body = null;
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body = request.body;
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcStatefulAsyncInvocationEnable)) {
            realHeaders.put("X-Fc-Stateful-Async-Invocation-Enable", com.aliyun.teautil.Common.toJSONString(headers.xFcStatefulAsyncInvocationEnable));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcStatefulAsyncInvocationId)) {
            realHeaders.put("X-Fc-Stateful-Async-Invocation-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcStatefulAsyncInvocationId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeFunction"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/invocations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "byte"),
            new TeaPair("bodyType", "byte")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeFunctionResponse());
    }

    public InvokeFunctionResponse invokeFunction(String serviceName, String functionName, InvokeFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvokeFunctionHeaders headers = new InvokeFunctionHeaders();
        return this.invokeFunctionWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public ListAliasesResponse listAliasesWithOptions(String serviceName, ListAliasesRequest request, ListAliasesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAliases"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/aliases"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAliasesResponse());
    }

    public ListAliasesResponse listAliases(String serviceName, ListAliasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListAliasesHeaders headers = new ListAliasesHeaders();
        return this.listAliasesWithOptions(serviceName, request, headers, runtime);
    }

    public ListCustomDomainsResponse listCustomDomainsWithOptions(ListCustomDomainsRequest request, ListCustomDomainsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public ListCustomDomainsResponse listCustomDomains(ListCustomDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListCustomDomainsHeaders headers = new ListCustomDomainsHeaders();
        return this.listCustomDomainsWithOptions(request, headers, runtime);
    }

    public ListEventSourcesResponse listEventSourcesWithOptions(String serviceName, String functionName, ListEventSourcesRequest request, ListEventSourcesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEventSources"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/event-sources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventSourcesResponse());
    }

    public ListEventSourcesResponse listEventSources(String serviceName, String functionName, ListEventSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListEventSourcesHeaders headers = new ListEventSourcesHeaders();
        return this.listEventSourcesWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
      * StatefulAsyncInvocation indicates whether the asynchronous task feature is enabled. If StatefulAsyncInvocation is set to true, the asynchronous task is enabled. All asynchronous invocations to the function corresponding to this configuration change to asynchronous task mode.
      *
      * @param request ListFunctionAsyncInvokeConfigsRequest
      * @param headers ListFunctionAsyncInvokeConfigsHeaders
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListFunctionAsyncInvokeConfigsResponse
     */
    public ListFunctionAsyncInvokeConfigsResponse listFunctionAsyncInvokeConfigsWithOptions(String serviceName, String functionName, ListFunctionAsyncInvokeConfigsRequest request, ListFunctionAsyncInvokeConfigsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctionAsyncInvokeConfigs"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/async-invoke-configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionAsyncInvokeConfigsResponse());
    }

    /**
      * StatefulAsyncInvocation indicates whether the asynchronous task feature is enabled. If StatefulAsyncInvocation is set to true, the asynchronous task is enabled. All asynchronous invocations to the function corresponding to this configuration change to asynchronous task mode.
      *
      * @param request ListFunctionAsyncInvokeConfigsRequest
      * @return ListFunctionAsyncInvokeConfigsResponse
     */
    public ListFunctionAsyncInvokeConfigsResponse listFunctionAsyncInvokeConfigs(String serviceName, String functionName, ListFunctionAsyncInvokeConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListFunctionAsyncInvokeConfigsHeaders headers = new ListFunctionAsyncInvokeConfigsHeaders();
        return this.listFunctionAsyncInvokeConfigsWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public ListFunctionsResponse listFunctionsWithOptions(String serviceName, ListFunctionsRequest request, ListFunctionsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctions"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionsResponse());
    }

    public ListFunctionsResponse listFunctions(String serviceName, ListFunctionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListFunctionsHeaders headers = new ListFunctionsHeaders();
        return this.listFunctionsWithOptions(serviceName, request, headers, runtime);
    }

    /**
      * The ListInstances operation allows you to query the available instances of a function.
      * Available instances are instances that are processing requests or can be scheduled to process requests. Available instances queried by the ListInstances operation are the same as those that can be used when you call the InvokeFunction operation with the same values specified for the `serviceName`, `functionName`, and `qualifier` parameters.
      *
      * @param request ListInstancesRequest
      * @param headers ListInstancesHeaders
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(String serviceName, String functionName, ListInstancesRequest request, ListInstancesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("instanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
      * The ListInstances operation allows you to query the available instances of a function.
      * Available instances are instances that are processing requests or can be scheduled to process requests. Available instances queried by the ListInstances operation are the same as those that can be used when you call the InvokeFunction operation with the same values specified for the `serviceName`, `functionName`, and `qualifier` parameters.
      *
      * @param request ListInstancesRequest
      * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(String serviceName, String functionName, ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListInstancesHeaders headers = new ListInstancesHeaders();
        return this.listInstancesWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public ListLayerVersionsResponse listLayerVersionsWithOptions(String layerName, ListLayerVersionsRequest request, ListLayerVersionsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLayerVersions"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/layers/" + com.aliyun.openapiutil.Client.getEncodeParam(layerName) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLayerVersionsResponse());
    }

    public ListLayerVersionsResponse listLayerVersions(String layerName, ListLayerVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListLayerVersionsHeaders headers = new ListLayerVersionsHeaders();
        return this.listLayerVersionsWithOptions(layerName, request, headers, runtime);
    }

    public ListLayersResponse listLayersWithOptions(ListLayersRequest request, ListLayersHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.official)) {
            query.put("official", request.official);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request._public)) {
            query.put("public", request._public);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public ListLayersResponse listLayers(ListLayersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListLayersHeaders headers = new ListLayersHeaders();
        return this.listLayersWithOptions(request, headers, runtime);
    }

    public ListOnDemandConfigsResponse listOnDemandConfigsWithOptions(ListOnDemandConfigsRequest request, ListOnDemandConfigsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public ListOnDemandConfigsResponse listOnDemandConfigs(ListOnDemandConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListOnDemandConfigsHeaders headers = new ListOnDemandConfigsHeaders();
        return this.listOnDemandConfigsWithOptions(request, headers, runtime);
    }

    public ListProvisionConfigsResponse listProvisionConfigsWithOptions(ListProvisionConfigsRequest request, ListProvisionConfigsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public ListProvisionConfigsResponse listProvisionConfigs(ListProvisionConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListProvisionConfigsHeaders headers = new ListProvisionConfigsHeaders();
        return this.listProvisionConfigsWithOptions(request, headers, runtime);
    }

    public ListReservedCapacitiesResponse listReservedCapacitiesWithOptions(ListReservedCapacitiesRequest request, ListReservedCapacitiesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public ListReservedCapacitiesResponse listReservedCapacities(ListReservedCapacitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListReservedCapacitiesHeaders headers = new ListReservedCapacitiesHeaders();
        return this.listReservedCapacitiesWithOptions(request, headers, runtime);
    }

    public ListServiceVersionsResponse listServiceVersionsWithOptions(String serviceName, ListServiceVersionsRequest request, ListServiceVersionsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceVersions"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceVersionsResponse());
    }

    public ListServiceVersionsResponse listServiceVersions(String serviceName, ListServiceVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListServiceVersionsHeaders headers = new ListServiceVersionsHeaders();
        return this.listServiceVersionsWithOptions(serviceName, request, headers, runtime);
    }

    public ListServicesResponse listServicesWithOptions(ListServicesRequest request, ListServicesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListServicesHeaders headers = new ListServicesHeaders();
        return this.listServicesWithOptions(request, headers, runtime);
    }

    /**
      * The metadata of the service and function to which the asynchronous task belongs.
      *
      * @param request ListStatefulAsyncInvocationFunctionsRequest
      * @param headers ListStatefulAsyncInvocationFunctionsHeaders
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListStatefulAsyncInvocationFunctionsResponse
     */
    public ListStatefulAsyncInvocationFunctionsResponse listStatefulAsyncInvocationFunctionsWithOptions(ListStatefulAsyncInvocationFunctionsRequest request, ListStatefulAsyncInvocationFunctionsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStatefulAsyncInvocationFunctions"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/stateful-async-invocation-functions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStatefulAsyncInvocationFunctionsResponse());
    }

    /**
      * The metadata of the service and function to which the asynchronous task belongs.
      *
      * @param request ListStatefulAsyncInvocationFunctionsRequest
      * @return ListStatefulAsyncInvocationFunctionsResponse
     */
    public ListStatefulAsyncInvocationFunctionsResponse listStatefulAsyncInvocationFunctions(ListStatefulAsyncInvocationFunctionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListStatefulAsyncInvocationFunctionsHeaders headers = new ListStatefulAsyncInvocationFunctionsHeaders();
        return this.listStatefulAsyncInvocationFunctionsWithOptions(request, headers, runtime);
    }

    /**
      * The name of the service to which the asynchronous task belongs.
      *
      * @param request ListStatefulAsyncInvocationsRequest
      * @param headers ListStatefulAsyncInvocationsHeaders
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListStatefulAsyncInvocationsResponse
     */
    public ListStatefulAsyncInvocationsResponse listStatefulAsyncInvocationsWithOptions(String serviceName, String functionName, ListStatefulAsyncInvocationsRequest request, ListStatefulAsyncInvocationsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStatefulAsyncInvocations"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/stateful-async-invocations"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStatefulAsyncInvocationsResponse());
    }

    /**
      * The name of the service to which the asynchronous task belongs.
      *
      * @param request ListStatefulAsyncInvocationsRequest
      * @return ListStatefulAsyncInvocationsResponse
     */
    public ListStatefulAsyncInvocationsResponse listStatefulAsyncInvocations(String serviceName, String functionName, ListStatefulAsyncInvocationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListStatefulAsyncInvocationsHeaders headers = new ListStatefulAsyncInvocationsHeaders();
        return this.listStatefulAsyncInvocationsWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public ListTaggedResourcesResponse listTaggedResourcesWithOptions(ListTaggedResourcesRequest request, ListTaggedResourcesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public ListTaggedResourcesResponse listTaggedResources(ListTaggedResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListTaggedResourcesHeaders headers = new ListTaggedResourcesHeaders();
        return this.listTaggedResourcesWithOptions(request, headers, runtime);
    }

    public ListTriggersResponse listTriggersWithOptions(String serviceName, String functionName, ListTriggersRequest request, ListTriggersHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTriggers"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/triggers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTriggersResponse());
    }

    public ListTriggersResponse listTriggers(String serviceName, String functionName, ListTriggersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListTriggersHeaders headers = new ListTriggersHeaders();
        return this.listTriggersWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public ListVpcBindingsResponse listVpcBindingsWithOptions(String serviceName, ListVpcBindingsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcBindings"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/bindings"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcBindingsResponse());
    }

    public ListVpcBindingsResponse listVpcBindings(String serviceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListVpcBindingsHeaders headers = new ListVpcBindingsHeaders();
        return this.listVpcBindingsWithOptions(serviceName, headers, runtime);
    }

    public PublishServiceVersionResponse publishServiceVersionWithOptions(String serviceName, PublishServiceVersionRequest request, PublishServiceVersionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishServiceVersion"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishServiceVersionResponse());
    }

    public PublishServiceVersionResponse publishServiceVersion(String serviceName, PublishServiceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PublishServiceVersionHeaders headers = new PublishServiceVersionHeaders();
        return this.publishServiceVersionWithOptions(serviceName, request, headers, runtime);
    }

    /**
      * The maximum validity period of messages.
      *
      * @param request PutFunctionAsyncInvokeConfigRequest
      * @param headers PutFunctionAsyncInvokeConfigHeaders
      * @param runtime runtime options for this request RuntimeOptions
      * @return PutFunctionAsyncInvokeConfigResponse
     */
    public PutFunctionAsyncInvokeConfigResponse putFunctionAsyncInvokeConfigWithOptions(String serviceName, String functionName, PutFunctionAsyncInvokeConfigRequest request, PutFunctionAsyncInvokeConfigHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationConfig)) {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutFunctionAsyncInvokeConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/async-invoke-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutFunctionAsyncInvokeConfigResponse());
    }

    /**
      * The maximum validity period of messages.
      *
      * @param request PutFunctionAsyncInvokeConfigRequest
      * @return PutFunctionAsyncInvokeConfigResponse
     */
    public PutFunctionAsyncInvokeConfigResponse putFunctionAsyncInvokeConfig(String serviceName, String functionName, PutFunctionAsyncInvokeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PutFunctionAsyncInvokeConfigHeaders headers = new PutFunctionAsyncInvokeConfigHeaders();
        return this.putFunctionAsyncInvokeConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public PutFunctionOnDemandConfigResponse putFunctionOnDemandConfigWithOptions(String serviceName, String functionName, PutFunctionOnDemandConfigRequest request, PutFunctionOnDemandConfigHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutFunctionOnDemandConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/on-demand-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutFunctionOnDemandConfigResponse());
    }

    public PutFunctionOnDemandConfigResponse putFunctionOnDemandConfig(String serviceName, String functionName, PutFunctionOnDemandConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PutFunctionOnDemandConfigHeaders headers = new PutFunctionOnDemandConfigHeaders();
        return this.putFunctionOnDemandConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public PutLayerACLResponse putLayerACLWithOptions(String layerName, PutLayerACLRequest request, PutLayerACLHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request._public)) {
            query.put("public", request._public);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutLayerACL"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/layers/" + com.aliyun.openapiutil.Client.getEncodeParam(layerName) + "/acl"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutLayerACLResponse());
    }

    public PutLayerACLResponse putLayerACL(String layerName, PutLayerACLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PutLayerACLHeaders headers = new PutLayerACLHeaders();
        return this.putLayerACLWithOptions(layerName, request, headers, runtime);
    }

    public PutProvisionConfigResponse putProvisionConfigWithOptions(String serviceName, String functionName, PutProvisionConfigRequest request, PutProvisionConfigHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alwaysAllocateCPU)) {
            body.put("alwaysAllocateCPU", request.alwaysAllocateCPU);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutProvisionConfig"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/provision-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutProvisionConfigResponse());
    }

    public PutProvisionConfigResponse putProvisionConfig(String serviceName, String functionName, PutProvisionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PutProvisionConfigHeaders headers = new PutProvisionConfigHeaders();
        return this.putProvisionConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public RegisterEventSourceResponse registerEventSourceWithOptions(String serviceName, String functionName, RegisterEventSourceRequest request, RegisterEventSourceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterEventSource"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/event-sources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterEventSourceResponse());
    }

    public RegisterEventSourceResponse registerEventSource(String serviceName, String functionName, RegisterEventSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RegisterEventSourceHeaders headers = new RegisterEventSourceHeaders();
        return this.registerEventSourceWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public ReleaseGPUInstanceResponse releaseGPUInstanceWithOptions(String instanceId, ReleaseGPUInstanceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseGPUInstance"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/gpuInstances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseGPUInstanceResponse());
    }

    public ReleaseGPUInstanceResponse releaseGPUInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ReleaseGPUInstanceHeaders headers = new ReleaseGPUInstanceHeaders();
        return this.releaseGPUInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
      * StatefulAsyncInvocation: asynchronous task. Asynchronous tasks allow you to manage the states on the basis of common asynchronous invocations, which is more suitable for task scenarios.
      *
      * @param request StopStatefulAsyncInvocationRequest
      * @param headers StopStatefulAsyncInvocationHeaders
      * @param runtime runtime options for this request RuntimeOptions
      * @return StopStatefulAsyncInvocationResponse
     */
    public StopStatefulAsyncInvocationResponse stopStatefulAsyncInvocationWithOptions(String serviceName, String functionName, String invocationId, StopStatefulAsyncInvocationRequest request, StopStatefulAsyncInvocationHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopStatefulAsyncInvocation"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/stateful-async-invocations/" + com.aliyun.openapiutil.Client.getEncodeParam(invocationId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopStatefulAsyncInvocationResponse());
    }

    /**
      * StatefulAsyncInvocation: asynchronous task. Asynchronous tasks allow you to manage the states on the basis of common asynchronous invocations, which is more suitable for task scenarios.
      *
      * @param request StopStatefulAsyncInvocationRequest
      * @return StopStatefulAsyncInvocationResponse
     */
    public StopStatefulAsyncInvocationResponse stopStatefulAsyncInvocation(String serviceName, String functionName, String invocationId, StopStatefulAsyncInvocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StopStatefulAsyncInvocationHeaders headers = new StopStatefulAsyncInvocationHeaders();
        return this.stopStatefulAsyncInvocationWithOptions(serviceName, functionName, invocationId, request, headers, runtime);
    }

    public TagResourceResponse tagResourceWithOptions(TagResourceRequest request, TagResourceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public TagResourceResponse tagResource(TagResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TagResourceHeaders headers = new TagResourceHeaders();
        return this.tagResourceWithOptions(request, headers, runtime);
    }

    public UntagResourceResponse untagResourceWithOptions(UntagResourceRequest request, UntagResourceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResource"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/tag"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourceResponse());
    }

    public UntagResourceResponse untagResource(UntagResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UntagResourceHeaders headers = new UntagResourceHeaders();
        return this.untagResourceWithOptions(request, headers, runtime);
    }

    public UpdateAliasResponse updateAliasWithOptions(String serviceName, String aliasName, UpdateAliasRequest request, UpdateAliasHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalVersionWeight)) {
            body.put("additionalVersionWeight", request.additionalVersionWeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolvePolicy)) {
            body.put("resolvePolicy", request.resolvePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routePolicy)) {
            body.put("routePolicy", request.routePolicy);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlias"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/aliases/" + com.aliyun.openapiutil.Client.getEncodeParam(aliasName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAliasResponse());
    }

    public UpdateAliasResponse updateAlias(String serviceName, String aliasName, UpdateAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateAliasHeaders headers = new UpdateAliasHeaders();
        return this.updateAliasWithOptions(serviceName, aliasName, request, headers, runtime);
    }

    public UpdateCustomDomainResponse updateCustomDomainWithOptions(String domainName, UpdateCustomDomainRequest request, UpdateCustomDomainHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certConfig)) {
            body.put("certConfig", request.certConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeConfig)) {
            body.put("routeConfig", request.routeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsConfig)) {
            body.put("tlsConfig", request.tlsConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wafConfig)) {
            body.put("wafConfig", request.wafConfig);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcAccountId)) {
            realHeaders.put("X-Fc-Account-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcAccountId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomDomain"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/custom-domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomDomainResponse());
    }

    public UpdateCustomDomainResponse updateCustomDomain(String domainName, UpdateCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateCustomDomainHeaders headers = new UpdateCustomDomainHeaders();
        return this.updateCustomDomainWithOptions(domainName, request, headers, runtime);
    }

    public UpdateFunctionResponse updateFunctionWithOptions(String serviceName, String functionName, UpdateFunctionRequest request, UpdateFunctionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceConcurrency)) {
            body.put("InstanceConcurrency", request.instanceConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caPort)) {
            body.put("caPort", request.caPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customContainerConfig)) {
            body.put("customContainerConfig", request.customContainerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customDNS)) {
            body.put("customDNS", request.customDNS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customHealthCheckConfig)) {
            body.put("customHealthCheckConfig", request.customHealthCheckConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customRuntimeConfig)) {
            body.put("customRuntimeConfig", request.customRuntimeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            body.put("diskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentVariables)) {
            body.put("environmentVariables", request.environmentVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuMemorySize)) {
            body.put("gpuMemorySize", request.gpuMemorySize);
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

        if (!com.aliyun.teautil.Common.isUnset(request.instanceLifecycleConfig)) {
            body.put("instanceLifecycleConfig", request.instanceLifecycleConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSoftConcurrency)) {
            body.put("instanceSoftConcurrency", request.instanceSoftConcurrency);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFunction"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFunctionResponse());
    }

    public UpdateFunctionResponse updateFunction(String serviceName, String functionName, UpdateFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateFunctionHeaders headers = new UpdateFunctionHeaders();
        return this.updateFunctionWithOptions(serviceName, functionName, request, headers, runtime);
    }

    public UpdateServiceResponse updateServiceWithOptions(String serviceName, UpdateServiceRequest request, UpdateServiceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetAccess)) {
            body.put("internetAccess", request.internetAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logConfig)) {
            body.put("logConfig", request.logConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nasConfig)) {
            body.put("nasConfig", request.nasConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossMountConfig)) {
            body.put("ossMountConfig", request.ossMountConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracingConfig)) {
            body.put("tracingConfig", request.tracingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcConfig)) {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateService"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceResponse());
    }

    public UpdateServiceResponse updateService(String serviceName, UpdateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateServiceHeaders headers = new UpdateServiceHeaders();
        return this.updateServiceWithOptions(serviceName, request, headers, runtime);
    }

    public UpdateTriggerResponse updateTriggerWithOptions(String serviceName, String functionName, String triggerName, UpdateTriggerRequest request, UpdateTriggerHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcDate)) {
            realHeaders.put("X-Fc-Date", com.aliyun.teautil.Common.toJSONString(headers.xFcDate));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcTraceId)) {
            realHeaders.put("X-Fc-Trace-Id", com.aliyun.teautil.Common.toJSONString(headers.xFcTraceId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTrigger"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceName) + "/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/triggers/" + com.aliyun.openapiutil.Client.getEncodeParam(triggerName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTriggerResponse());
    }

    public UpdateTriggerResponse updateTrigger(String serviceName, String functionName, String triggerName, UpdateTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTriggerHeaders headers = new UpdateTriggerHeaders();
        return this.updateTriggerWithOptions(serviceName, functionName, triggerName, request, headers, runtime);
    }

    public okhttp3.Response InvokeHTTPTrigger(String url, String method, byte[] body, okhttp3.Headers headers) throws Exception {
        com.aliyun.credentials.Client cred = _credential;
        com.aliyun.gateway.fc.util.Client utilClient = new com.aliyun.gateway.fc.util.Client(cred);
        return utilClient.InvokeHTTPTrigger(url, method, body, headers);
    }

    public okhttp3.Response InvokeAnonymousHTTPTrigger(String url, String method, byte[] body, okhttp3.Headers headers) throws Exception {
        com.aliyun.credentials.Client cred = _credential;
        com.aliyun.gateway.fc.util.Client utilClient = new com.aliyun.gateway.fc.util.Client(cred);
        return utilClient.InvokeAnonymousHTTPTrigger(url, method, body, headers);
    }

    public okhttp3.Response SendHTTPRequestWithAuthorization(okhttp3.Request req) throws Exception {
        com.aliyun.credentials.Client cred = _credential;
        com.aliyun.gateway.fc.util.Client utilClient = new com.aliyun.gateway.fc.util.Client(cred);
        return utilClient.SendHTTPRequestWithAuthorization(req);
    }

    public okhttp3.Response SendHTTPRequest(okhttp3.Request req) throws Exception {
        com.aliyun.credentials.Client cred = _credential;
        com.aliyun.gateway.fc.util.Client utilClient = new com.aliyun.gateway.fc.util.Client(cred);
        return utilClient.SendHTTPRequest(req);
    }

    public okhttp3.Request SignRequest(okhttp3.Request req) throws Exception {
        com.aliyun.credentials.Client cred = _credential;
        com.aliyun.gateway.fc.util.Client utilClient = new com.aliyun.gateway.fc.util.Client(cred);
        return utilClient.SignRequest(req);
    }

    public okhttp3.Request SignRequestWithContentMD5(okhttp3.Request req, String contentMD5) throws Exception {
        com.aliyun.credentials.Client cred = _credential;
        com.aliyun.gateway.fc.util.Client utilClient = new com.aliyun.gateway.fc.util.Client(cred);
        return utilClient.SignRequestWithContentMD5(req, contentMD5);
    }

    public okhttp3.Request BuildHTTPRequest(String url, String method, byte[] body, okhttp3.Headers headers) throws Exception {
        com.aliyun.credentials.Client cred = _credential;
        com.aliyun.gateway.fc.util.Client utilClient = new com.aliyun.gateway.fc.util.Client(cred);
        return utilClient.BuildHTTPRequest(url, method, body, headers);
    }
}
