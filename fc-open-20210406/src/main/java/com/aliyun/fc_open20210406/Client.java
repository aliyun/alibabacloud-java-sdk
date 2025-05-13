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

    /**
     * <b>summary</b> : 
     * <p>Creates an alias.</p>
     * 
     * @param request CreateAliasRequest
     * @param headers CreateAliasHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAliasResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Creates an alias.</p>
     * 
     * @param request CreateAliasRequest
     * @return CreateAliasResponse
     */
    public CreateAliasResponse createAlias(String serviceName, CreateAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateAliasHeaders headers = new CreateAliasHeaders();
        return this.createAliasWithOptions(serviceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a custom domain name.</p>
     * 
     * @param request CreateCustomDomainRequest
     * @param headers CreateCustomDomainHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomDomainResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Adds a custom domain name.</p>
     * 
     * @param request CreateCustomDomainRequest
     * @return CreateCustomDomainResponse
     */
    public CreateCustomDomainResponse createCustomDomain(CreateCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateCustomDomainHeaders headers = new CreateCustomDomainHeaders();
        return this.createCustomDomainWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a function.</p>
     * 
     * @param request CreateFunctionRequest
     * @param headers CreateFunctionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFunctionResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Creates a function.</p>
     * 
     * @param request CreateFunctionRequest
     * @return CreateFunctionResponse
     */
    public CreateFunctionResponse createFunction(String serviceName, CreateFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateFunctionHeaders headers = new CreateFunctionHeaders();
        return this.createFunctionWithOptions(serviceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a layer version.</p>
     * 
     * @param request CreateLayerVersionRequest
     * @param headers CreateLayerVersionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLayerVersionResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Releases a layer version.</p>
     * 
     * @param request CreateLayerVersionRequest
     * @return CreateLayerVersionResponse
     */
    public CreateLayerVersionResponse createLayerVersion(String layerName, CreateLayerVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateLayerVersionHeaders headers = new CreateLayerVersionHeaders();
        return this.createLayerVersionWithOptions(layerName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a service.</p>
     * 
     * @param request CreateServiceRequest
     * @param headers CreateServiceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Create a service.</p>
     * 
     * @param request CreateServiceRequest
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateServiceHeaders headers = new CreateServiceHeaders();
        return this.createServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>A trigger is created.</p>
     * 
     * @param request CreateTriggerRequest
     * @param headers CreateTriggerHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTriggerResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>A trigger is created.</p>
     * 
     * @param request CreateTriggerRequest
     * @return CreateTriggerResponse
     */
    public CreateTriggerResponse createTrigger(String serviceName, String functionName, CreateTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateTriggerHeaders headers = new CreateTriggerHeaders();
        return this.createTriggerWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a VPC connection.</p>
     * 
     * @param request CreateVpcBindingRequest
     * @param headers CreateVpcBindingHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVpcBindingResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Creates a VPC connection.</p>
     * 
     * @param request CreateVpcBindingRequest
     * @return CreateVpcBindingResponse
     */
    public CreateVpcBindingResponse createVpcBinding(String serviceName, CreateVpcBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateVpcBindingHeaders headers = new CreateVpcBindingHeaders();
        return this.createVpcBindingWithOptions(serviceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alias.</p>
     * 
     * @param headers DeleteAliasHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAliasResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes an alias.</p>
     * @return DeleteAliasResponse
     */
    public DeleteAliasResponse deleteAlias(String serviceName, String aliasName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteAliasHeaders headers = new DeleteAliasHeaders();
        return this.deleteAliasWithOptions(serviceName, aliasName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom domain name.</p>
     * 
     * @param headers DeleteCustomDomainHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomDomainResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom domain name.</p>
     * @return DeleteCustomDomainResponse
     */
    public DeleteCustomDomainResponse deleteCustomDomain(String domainName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteCustomDomainHeaders headers = new DeleteCustomDomainHeaders();
        return this.deleteCustomDomainWithOptions(domainName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a function. Before you delete a function, you must delete triggers of the function.</p>
     * 
     * @param headers DeleteFunctionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFunctionResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a function. Before you delete a function, you must delete triggers of the function.</p>
     * @return DeleteFunctionResponse
     */
    public DeleteFunctionResponse deleteFunction(String serviceName, String functionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteFunctionHeaders headers = new DeleteFunctionHeaders();
        return this.deleteFunctionWithOptions(serviceName, functionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an asynchronous invocation configuration.</p>
     * 
     * @param request DeleteFunctionAsyncInvokeConfigRequest
     * @param headers DeleteFunctionAsyncInvokeConfigHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFunctionAsyncInvokeConfigResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes an asynchronous invocation configuration.</p>
     * 
     * @param request DeleteFunctionAsyncInvokeConfigRequest
     * @return DeleteFunctionAsyncInvokeConfigResponse
     */
    public DeleteFunctionAsyncInvokeConfigResponse deleteFunctionAsyncInvokeConfig(String serviceName, String functionName, DeleteFunctionAsyncInvokeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteFunctionAsyncInvokeConfigHeaders headers = new DeleteFunctionAsyncInvokeConfigHeaders();
        return this.deleteFunctionAsyncInvokeConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a concurrency configuration of a function.</p>
     * 
     * @param request DeleteFunctionOnDemandConfigRequest
     * @param headers DeleteFunctionOnDemandConfigHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFunctionOnDemandConfigResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a concurrency configuration of a function.</p>
     * 
     * @param request DeleteFunctionOnDemandConfigRequest
     * @return DeleteFunctionOnDemandConfigResponse
     */
    public DeleteFunctionOnDemandConfigResponse deleteFunctionOnDemandConfig(String serviceName, String functionName, DeleteFunctionOnDemandConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteFunctionOnDemandConfigHeaders headers = new DeleteFunctionOnDemandConfigHeaders();
        return this.deleteFunctionOnDemandConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a layer version.</p>
     * 
     * @param headers DeleteLayerVersionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLayerVersionResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a layer version.</p>
     * @return DeleteLayerVersionResponse
     */
    public DeleteLayerVersionResponse deleteLayerVersion(String layerName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteLayerVersionHeaders headers = new DeleteLayerVersionHeaders();
        return this.deleteLayerVersionWithOptions(layerName, version, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service.</p>
     * 
     * @param headers DeleteServiceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a service.</p>
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteService(String serviceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteServiceHeaders headers = new DeleteServiceHeaders();
        return this.deleteServiceWithOptions(serviceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a service version.</p>
     * 
     * @param headers DeleteServiceVersionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceVersionResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Removes a service version.</p>
     * @return DeleteServiceVersionResponse
     */
    public DeleteServiceVersionResponse deleteServiceVersion(String serviceName, String versionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteServiceVersionHeaders headers = new DeleteServiceVersionHeaders();
        return this.deleteServiceVersionWithOptions(serviceName, versionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a trigger.</p>
     * 
     * @param headers DeleteTriggerHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTriggerResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a trigger.</p>
     * @return DeleteTriggerResponse
     */
    public DeleteTriggerResponse deleteTrigger(String serviceName, String functionName, String triggerName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteTriggerHeaders headers = new DeleteTriggerHeaders();
        return this.deleteTriggerWithOptions(serviceName, functionName, triggerName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access control policy from a specified policy group for a VPC firewall.</p>
     * 
     * @param headers DeleteVpcBindingHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVpcBindingResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes an access control policy from a specified policy group for a VPC firewall.</p>
     * @return DeleteVpcBindingResponse
     */
    public DeleteVpcBindingResponse deleteVpcBinding(String serviceName, String vpcId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteVpcBindingHeaders headers = new DeleteVpcBindingHeaders();
        return this.deleteVpcBindingWithOptions(serviceName, vpcId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deregisters an event source for a function invocation. This API operation has been deprecated. We recommend that you do not continue to use it.</p>
     * 
     * @param request DeregisterEventSourceRequest
     * @param headers DeregisterEventSourceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeregisterEventSourceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deregisters an event source for a function invocation. This API operation has been deprecated. We recommend that you do not continue to use it.</p>
     * 
     * @param request DeregisterEventSourceRequest
     * @return DeregisterEventSourceResponse
     */
    public DeregisterEventSourceResponse deregisterEventSource(String serviceName, String functionName, String sourceArn, DeregisterEventSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeregisterEventSourceHeaders headers = new DeregisterEventSourceHeaders();
        return this.deregisterEventSourceWithOptions(serviceName, functionName, sourceArn, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询产品的地域信息列表</p>
     * 
     * @param request DescribeRegionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2021-04-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2021-04-06/regions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询产品的地域信息列表</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the information about an account.</p>
     * 
     * @param headers GetAccountSettingsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccountSettingsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the information about an account.</p>
     * @return GetAccountSettingsResponse
     */
    public GetAccountSettingsResponse getAccountSettings() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetAccountSettingsHeaders headers = new GetAccountSettingsHeaders();
        return this.getAccountSettingsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about an alias.</p>
     * 
     * @param headers GetAliasHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAliasResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries information about an alias.</p>
     * @return GetAliasResponse
     */
    public GetAliasResponse getAlias(String serviceName, String aliasName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetAliasHeaders headers = new GetAliasHeaders();
        return this.getAliasWithOptions(serviceName, aliasName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a custom domain name.</p>
     * 
     * @param headers GetCustomDomainHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomDomainResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a custom domain name.</p>
     * @return GetCustomDomainResponse
     */
    public GetCustomDomainResponse getCustomDomain(String domainName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetCustomDomainHeaders headers = new GetCustomDomainHeaders();
        return this.getCustomDomainWithOptions(domainName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a function.</p>
     * 
     * @param request GetFunctionRequest
     * @param headers GetFunctionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFunctionResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a function.</p>
     * 
     * @param request GetFunctionRequest
     * @return GetFunctionResponse
     */
    public GetFunctionResponse getFunction(String serviceName, String functionName, GetFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFunctionHeaders headers = new GetFunctionHeaders();
        return this.getFunctionWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>StatefulAsyncInvocation indicates whether the asynchronous task feature is enabled. If the value of StatefulAsyncInvocation is true, the asynchronous task feature is enabled. All asynchronous invocations change to asynchronous task mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains asynchronous invocation configurations of a function.</p>
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
     * <b>description</b> :
     * <p>StatefulAsyncInvocation indicates whether the asynchronous task feature is enabled. If the value of StatefulAsyncInvocation is true, the asynchronous task feature is enabled. All asynchronous invocations change to asynchronous task mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains asynchronous invocation configurations of a function.</p>
     * 
     * @param request GetFunctionAsyncInvokeConfigRequest
     * @return GetFunctionAsyncInvokeConfigResponse
     */
    public GetFunctionAsyncInvokeConfigResponse getFunctionAsyncInvokeConfig(String serviceName, String functionName, GetFunctionAsyncInvokeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFunctionAsyncInvokeConfigHeaders headers = new GetFunctionAsyncInvokeConfigHeaders();
        return this.getFunctionAsyncInvokeConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the code package of a function.</p>
     * 
     * @param request GetFunctionCodeRequest
     * @param headers GetFunctionCodeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFunctionCodeResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the code package of a function.</p>
     * 
     * @param request GetFunctionCodeRequest
     * @return GetFunctionCodeResponse
     */
    public GetFunctionCodeResponse getFunctionCode(String serviceName, String functionName, GetFunctionCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFunctionCodeHeaders headers = new GetFunctionCodeHeaders();
        return this.getFunctionCodeWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains configurations of on-demand instances.</p>
     * 
     * @param request GetFunctionOnDemandConfigRequest
     * @param headers GetFunctionOnDemandConfigHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFunctionOnDemandConfigResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Obtains configurations of on-demand instances.</p>
     * 
     * @param request GetFunctionOnDemandConfigRequest
     * @return GetFunctionOnDemandConfigResponse
     */
    public GetFunctionOnDemandConfigResponse getFunctionOnDemandConfig(String serviceName, String functionName, GetFunctionOnDemandConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFunctionOnDemandConfigHeaders headers = new GetFunctionOnDemandConfigHeaders();
        return this.getFunctionOnDemandConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries versions of a layer.</p>
     * 
     * @param headers GetLayerVersionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLayerVersionResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries versions of a layer.</p>
     * @return GetLayerVersionResponse
     */
    public GetLayerVersionResponse getLayerVersion(String layerName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetLayerVersionHeaders headers = new GetLayerVersionHeaders();
        return this.getLayerVersionWithOptions(layerName, version, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of provisioned configurations.</p>
     * 
     * @param request GetProvisionConfigRequest
     * @param headers GetProvisionConfigHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProvisionConfigResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the details of provisioned configurations.</p>
     * 
     * @param request GetProvisionConfigRequest
     * @return GetProvisionConfigResponse
     */
    public GetProvisionConfigResponse getProvisionConfig(String serviceName, String functionName, GetProvisionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetProvisionConfigHeaders headers = new GetProvisionConfigHeaders();
        return this.getProvisionConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all the tags of a resource.</p>
     * 
     * @param request GetResourceTagsRequest
     * @param headers GetResourceTagsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceTagsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries all the tags of a resource.</p>
     * 
     * @param request GetResourceTagsRequest
     * @return GetResourceTagsResponse
     */
    public GetResourceTagsResponse getResourceTags(GetResourceTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetResourceTagsHeaders headers = new GetResourceTagsHeaders();
        return this.getResourceTagsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a specified service.</p>
     * 
     * @param request GetServiceRequest
     * @param headers GetServiceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries information about a specified service.</p>
     * 
     * @param request GetServiceRequest
     * @return GetServiceResponse
     */
    public GetServiceResponse getService(String serviceName, GetServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetServiceHeaders headers = new GetServiceHeaders();
        return this.getServiceWithOptions(serviceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>StatefulAsyncInvocation represents asynchronous tasks. Asynchronous tasks (StatefulAsyncInvocation) allow you to manage the states of asynchronous invocations. The asynchronous task feature is more suitable for task scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Gets asynchronous task records that meet specified conditions.</p>
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
     * <b>description</b> :
     * <p>StatefulAsyncInvocation represents asynchronous tasks. Asynchronous tasks (StatefulAsyncInvocation) allow you to manage the states of asynchronous invocations. The asynchronous task feature is more suitable for task scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Gets asynchronous task records that meet specified conditions.</p>
     * 
     * @param request GetStatefulAsyncInvocationRequest
     * @return GetStatefulAsyncInvocationResponse
     */
    public GetStatefulAsyncInvocationResponse getStatefulAsyncInvocation(String serviceName, String functionName, String invocationId, GetStatefulAsyncInvocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetStatefulAsyncInvocationHeaders headers = new GetStatefulAsyncInvocationHeaders();
        return this.getStatefulAsyncInvocationWithOptions(serviceName, functionName, invocationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a trigger.</p>
     * 
     * @param headers GetTriggerHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTriggerResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a trigger.</p>
     * @return GetTriggerResponse
     */
    public GetTriggerResponse getTrigger(String serviceName, String functionName, String triggerName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetTriggerHeaders headers = new GetTriggerHeaders();
        return this.getTriggerWithOptions(serviceName, functionName, triggerName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke a function.</p>
     * 
     * @param request InvokeFunctionRequest
     * @param headers InvokeFunctionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvokeFunctionResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Invoke a function.</p>
     * 
     * @param request InvokeFunctionRequest
     * @return InvokeFunctionResponse
     */
    public InvokeFunctionResponse invokeFunction(String serviceName, String functionName, InvokeFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvokeFunctionHeaders headers = new InvokeFunctionHeaders();
        return this.invokeFunctionWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all aliases of a service.</p>
     * 
     * @param request ListAliasesRequest
     * @param headers ListAliasesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAliasesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries all aliases of a service.</p>
     * 
     * @param request ListAliasesRequest
     * @return ListAliasesResponse
     */
    public ListAliasesResponse listAliases(String serviceName, ListAliasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListAliasesHeaders headers = new ListAliasesHeaders();
        return this.listAliasesWithOptions(serviceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available custom domain names.</p>
     * 
     * @param request ListCustomDomainsRequest
     * @param headers ListCustomDomainsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomDomainsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries available custom domain names.</p>
     * 
     * @param request ListCustomDomainsRequest
     * @return ListCustomDomainsResponse
     */
    public ListCustomDomainsResponse listCustomDomains(ListCustomDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListCustomDomainsHeaders headers = new ListCustomDomainsHeaders();
        return this.listCustomDomainsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of event sources for function invocations.</p>
     * 
     * @param request ListEventSourcesRequest
     * @param headers ListEventSourcesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEventSourcesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of event sources for function invocations.</p>
     * 
     * @param request ListEventSourcesRequest
     * @return ListEventSourcesResponse
     */
    public ListEventSourcesResponse listEventSources(String serviceName, String functionName, ListEventSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListEventSourcesHeaders headers = new ListEventSourcesHeaders();
        return this.listEventSourcesWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>StatefulAsyncInvocation indicates whether the asynchronous task feature is enabled. If StatefulAsyncInvocation is set to true, the asynchronous task is enabled. All asynchronous invocations to the function corresponding to this configuration change to asynchronous task mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all asynchronous invocation configurations of a function in a service. If the number of configurations exceeds the value of the limit parameter, the nextToken parameter is returned. You can use the nextToken parameter to query the next page of results.</p>
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
     * <b>description</b> :
     * <p>StatefulAsyncInvocation indicates whether the asynchronous task feature is enabled. If StatefulAsyncInvocation is set to true, the asynchronous task is enabled. All asynchronous invocations to the function corresponding to this configuration change to asynchronous task mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all asynchronous invocation configurations of a function in a service. If the number of configurations exceeds the value of the limit parameter, the nextToken parameter is returned. You can use the nextToken parameter to query the next page of results.</p>
     * 
     * @param request ListFunctionAsyncInvokeConfigsRequest
     * @return ListFunctionAsyncInvokeConfigsResponse
     */
    public ListFunctionAsyncInvokeConfigsResponse listFunctionAsyncInvokeConfigs(String serviceName, String functionName, ListFunctionAsyncInvokeConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListFunctionAsyncInvokeConfigsHeaders headers = new ListFunctionAsyncInvokeConfigsHeaders();
        return this.listFunctionAsyncInvokeConfigsWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries functions.</p>
     * 
     * @param request ListFunctionsRequest
     * @param headers ListFunctionsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFunctionsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries functions.</p>
     * 
     * @param request ListFunctionsRequest
     * @return ListFunctionsResponse
     */
    public ListFunctionsResponse listFunctions(String serviceName, ListFunctionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListFunctionsHeaders headers = new ListFunctionsHeaders();
        return this.listFunctionsWithOptions(serviceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The ListInstances operation allows you to query available instances of a function.
     * Available instances are instances that are processing requests or can be scheduled to process requests. Available instances queried by the ListInstances operation are the same as the active instances queried by using the InvokeFunction operation if values of <code>ServiceName</code>, <code>FunctionName</code>, and <code>Qualifier</code> are the same.</p>
     * 
     * <b>summary</b> : 
     * <p>Query a list of available instances of a function.</p>
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
     * <b>description</b> :
     * <p>The ListInstances operation allows you to query available instances of a function.
     * Available instances are instances that are processing requests or can be scheduled to process requests. Available instances queried by the ListInstances operation are the same as the active instances queried by using the InvokeFunction operation if values of <code>ServiceName</code>, <code>FunctionName</code>, and <code>Qualifier</code> are the same.</p>
     * 
     * <b>summary</b> : 
     * <p>Query a list of available instances of a function.</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(String serviceName, String functionName, ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListInstancesHeaders headers = new ListInstancesHeaders();
        return this.listInstancesWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets a list of layer versions.</p>
     * 
     * @param request ListLayerVersionsRequest
     * @param headers ListLayerVersionsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLayerVersionsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Gets a list of layer versions.</p>
     * 
     * @param request ListLayerVersionsRequest
     * @return ListLayerVersionsResponse
     */
    public ListLayerVersionsResponse listLayerVersions(String layerName, ListLayerVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListLayerVersionsHeaders headers = new ListLayerVersionsHeaders();
        return this.listLayerVersionsWithOptions(layerName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets a list of layers.</p>
     * 
     * @param request ListLayersRequest
     * @param headers ListLayersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLayersResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Gets a list of layers.</p>
     * 
     * @param request ListLayersRequest
     * @return ListLayersResponse
     */
    public ListLayersResponse listLayers(ListLayersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListLayersHeaders headers = new ListLayersHeaders();
        return this.listLayersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries on-demand instance configurations a function.</p>
     * 
     * @param request ListOnDemandConfigsRequest
     * @param headers ListOnDemandConfigsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOnDemandConfigsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries on-demand instance configurations a function.</p>
     * 
     * @param request ListOnDemandConfigsRequest
     * @return ListOnDemandConfigsResponse
     */
    public ListOnDemandConfigsResponse listOnDemandConfigs(ListOnDemandConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListOnDemandConfigsHeaders headers = new ListOnDemandConfigsHeaders();
        return this.listOnDemandConfigsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries configurations of provisioned instances.</p>
     * 
     * @param request ListProvisionConfigsRequest
     * @param headers ListProvisionConfigsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProvisionConfigsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries configurations of provisioned instances.</p>
     * 
     * @param request ListProvisionConfigsRequest
     * @return ListProvisionConfigsResponse
     */
    public ListProvisionConfigsResponse listProvisionConfigs(ListProvisionConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListProvisionConfigsHeaders headers = new ListProvisionConfigsHeaders();
        return this.listProvisionConfigsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries purchased provisioned instances. This API operation has been deprecated. We recommend that you do not continue to use this API operation.</p>
     * 
     * @param request ListReservedCapacitiesRequest
     * @param headers ListReservedCapacitiesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListReservedCapacitiesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries purchased provisioned instances. This API operation has been deprecated. We recommend that you do not continue to use this API operation.</p>
     * 
     * @param request ListReservedCapacitiesRequest
     * @return ListReservedCapacitiesResponse
     */
    public ListReservedCapacitiesResponse listReservedCapacities(ListReservedCapacitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListReservedCapacitiesHeaders headers = new ListReservedCapacitiesHeaders();
        return this.listReservedCapacitiesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all the versions of a service.</p>
     * 
     * @param request ListServiceVersionsRequest
     * @param headers ListServiceVersionsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceVersionsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries all the versions of a service.</p>
     * 
     * @param request ListServiceVersionsRequest
     * @return ListServiceVersionsResponse
     */
    public ListServiceVersionsResponse listServiceVersions(String serviceName, ListServiceVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListServiceVersionsHeaders headers = new ListServiceVersionsHeaders();
        return this.listServiceVersionsWithOptions(serviceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of services.</p>
     * 
     * @param request ListServicesRequest
     * @param headers ListServicesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServicesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of services.</p>
     * 
     * @param request ListServicesRequest
     * @return ListServicesResponse
     */
    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListServicesHeaders headers = new ListServicesHeaders();
        return this.listServicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>StatefulAsyncInvocation represents asynchronous tasks. Asynchronous tasks (StatefulAsyncInvocation) allow you to manage the states of asynchronous invocations. The asynchronous task feature is more suitable for task scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all function resources that have enabled asynchronous tasks within the current account.</p>
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
     * <b>description</b> :
     * <p>StatefulAsyncInvocation represents asynchronous tasks. Asynchronous tasks (StatefulAsyncInvocation) allow you to manage the states of asynchronous invocations. The asynchronous task feature is more suitable for task scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all function resources that have enabled asynchronous tasks within the current account.</p>
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
     * <b>description</b> :
     * <p>StatefulAsyncInvocation represents asynchronous tasks. Asynchronous tasks (StatefulAsyncInvocation) allow you to manage the states of asynchronous invocations. The asynchronous task feature is more suitable for task scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all asynchronous invocations in an asynchronous task that meets specific conditions.</p>
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
     * <b>description</b> :
     * <p>StatefulAsyncInvocation represents asynchronous tasks. Asynchronous tasks (StatefulAsyncInvocation) allow you to manage the states of asynchronous invocations. The asynchronous task feature is more suitable for task scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all asynchronous invocations in an asynchronous task that meets specific conditions.</p>
     * 
     * @param request ListStatefulAsyncInvocationsRequest
     * @return ListStatefulAsyncInvocationsResponse
     */
    public ListStatefulAsyncInvocationsResponse listStatefulAsyncInvocations(String serviceName, String functionName, ListStatefulAsyncInvocationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListStatefulAsyncInvocationsHeaders headers = new ListStatefulAsyncInvocationsHeaders();
        return this.listStatefulAsyncInvocationsWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all tagged services.</p>
     * 
     * @param request ListTaggedResourcesRequest
     * @param headers ListTaggedResourcesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaggedResourcesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries all tagged services.</p>
     * 
     * @param request ListTaggedResourcesRequest
     * @return ListTaggedResourcesResponse
     */
    public ListTaggedResourcesResponse listTaggedResources(ListTaggedResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListTaggedResourcesHeaders headers = new ListTaggedResourcesHeaders();
        return this.listTaggedResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the triggers of a function.</p>
     * 
     * @param request ListTriggersRequest
     * @param headers ListTriggersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTriggersResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the triggers of a function.</p>
     * 
     * @param request ListTriggersRequest
     * @return ListTriggersResponse
     */
    public ListTriggersResponse listTriggers(String serviceName, String functionName, ListTriggersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListTriggersHeaders headers = new ListTriggersHeaders();
        return this.listTriggersWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of existing VPC connections.</p>
     * 
     * @param headers ListVpcBindingsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpcBindingsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of existing VPC connections.</p>
     * @return ListVpcBindingsResponse
     */
    public ListVpcBindingsResponse listVpcBindings(String serviceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListVpcBindingsHeaders headers = new ListVpcBindingsHeaders();
        return this.listVpcBindingsWithOptions(serviceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>$.parameters[8].schema.enumValueTitles</p>
     * 
     * @param request PublishServiceVersionRequest
     * @param headers PublishServiceVersionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishServiceVersionResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>$.parameters[8].schema.enumValueTitles</p>
     * 
     * @param request PublishServiceVersionRequest
     * @return PublishServiceVersionResponse
     */
    public PublishServiceVersionResponse publishServiceVersion(String serviceName, PublishServiceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PublishServiceVersionHeaders headers = new PublishServiceVersionHeaders();
        return this.publishServiceVersionWithOptions(serviceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>StatefulAsyncInvocation specifies the configurations of an asynchronous task. Asynchronous tasks (StatefulAsyncInvocation) allow you to manage the states of asynchronous invocations. The asynchronous task feature is more suitable for task scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates or modifies an asynchronous invocation configuration for a function.</p>
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
     * <b>description</b> :
     * <p>StatefulAsyncInvocation specifies the configurations of an asynchronous task. Asynchronous tasks (StatefulAsyncInvocation) allow you to manage the states of asynchronous invocations. The asynchronous task feature is more suitable for task scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates or modifies an asynchronous invocation configuration for a function.</p>
     * 
     * @param request PutFunctionAsyncInvokeConfigRequest
     * @return PutFunctionAsyncInvokeConfigResponse
     */
    public PutFunctionAsyncInvokeConfigResponse putFunctionAsyncInvokeConfig(String serviceName, String functionName, PutFunctionAsyncInvokeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PutFunctionAsyncInvokeConfigHeaders headers = new PutFunctionAsyncInvokeConfigHeaders();
        return this.putFunctionAsyncInvokeConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a function rule.</p>
     * 
     * @param request PutFunctionOnDemandConfigRequest
     * @param headers PutFunctionOnDemandConfigHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutFunctionOnDemandConfigResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Creates a function rule.</p>
     * 
     * @param request PutFunctionOnDemandConfigRequest
     * @return PutFunctionOnDemandConfigResponse
     */
    public PutFunctionOnDemandConfigResponse putFunctionOnDemandConfig(String serviceName, String functionName, PutFunctionOnDemandConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PutFunctionOnDemandConfigHeaders headers = new PutFunctionOnDemandConfigHeaders();
        return this.putFunctionOnDemandConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies permissions of a layer.</p>
     * 
     * @param request PutLayerACLRequest
     * @param headers PutLayerACLHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutLayerACLResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Modifies permissions of a layer.</p>
     * 
     * @param request PutLayerACLRequest
     * @return PutLayerACLResponse
     */
    public PutLayerACLResponse putLayerACL(String layerName, PutLayerACLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PutLayerACLHeaders headers = new PutLayerACLHeaders();
        return this.putLayerACLWithOptions(layerName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates provisioned configurations.</p>
     * 
     * @param request PutProvisionConfigRequest
     * @param headers PutProvisionConfigHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutProvisionConfigResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Creates provisioned configurations.</p>
     * 
     * @param request PutProvisionConfigRequest
     * @return PutProvisionConfigResponse
     */
    public PutProvisionConfigResponse putProvisionConfig(String serviceName, String functionName, PutProvisionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PutProvisionConfigHeaders headers = new PutProvisionConfigHeaders();
        return this.putProvisionConfigWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Registers an event source.</p>
     * 
     * @param request RegisterEventSourceRequest
     * @param headers RegisterEventSourceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterEventSourceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Registers an event source.</p>
     * 
     * @param request RegisterEventSourceRequest
     * @return RegisterEventSourceResponse
     */
    public RegisterEventSourceResponse registerEventSource(String serviceName, String functionName, RegisterEventSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RegisterEventSourceHeaders headers = new RegisterEventSourceHeaders();
        return this.registerEventSourceWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>StatefulAsyncInvocation represents asynchronous tasks. Asynchronous tasks (StatefulAsyncInvocation) allow you to manage the states of asynchronous invocations. The asynchronous task feature is more suitable for task scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops an asynchronous task.</p>
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
     * <b>description</b> :
     * <p>StatefulAsyncInvocation represents asynchronous tasks. Asynchronous tasks (StatefulAsyncInvocation) allow you to manage the states of asynchronous invocations. The asynchronous task feature is more suitable for task scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops an asynchronous task.</p>
     * 
     * @param request StopStatefulAsyncInvocationRequest
     * @return StopStatefulAsyncInvocationResponse
     */
    public StopStatefulAsyncInvocationResponse stopStatefulAsyncInvocation(String serviceName, String functionName, String invocationId, StopStatefulAsyncInvocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StopStatefulAsyncInvocationHeaders headers = new StopStatefulAsyncInvocationHeaders();
        return this.stopStatefulAsyncInvocationWithOptions(serviceName, functionName, invocationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to a resource.</p>
     * 
     * @param request TagResourceRequest
     * @param headers TagResourceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Adds tags to a resource.</p>
     * 
     * @param request TagResourceRequest
     * @return TagResourceResponse
     */
    public TagResourceResponse tagResource(TagResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TagResourceHeaders headers = new TagResourceHeaders();
        return this.tagResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from resources.</p>
     * 
     * @param request UntagResourceRequest
     * @param headers UntagResourceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Removes tags from resources.</p>
     * 
     * @param request UntagResourceRequest
     * @return UntagResourceResponse
     */
    public UntagResourceResponse untagResource(UntagResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UntagResourceHeaders headers = new UntagResourceHeaders();
        return this.untagResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an alias.</p>
     * 
     * @param request UpdateAliasRequest
     * @param headers UpdateAliasHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAliasResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates an alias.</p>
     * 
     * @param request UpdateAliasRequest
     * @return UpdateAliasResponse
     */
    public UpdateAliasResponse updateAlias(String serviceName, String aliasName, UpdateAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateAliasHeaders headers = new UpdateAliasHeaders();
        return this.updateAliasWithOptions(serviceName, aliasName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a custom domain name.</p>
     * 
     * @param request UpdateCustomDomainRequest
     * @param headers UpdateCustomDomainHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomDomainResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Modifies a custom domain name.</p>
     * 
     * @param request UpdateCustomDomainRequest
     * @return UpdateCustomDomainResponse
     */
    public UpdateCustomDomainResponse updateCustomDomain(String domainName, UpdateCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateCustomDomainHeaders headers = new UpdateCustomDomainHeaders();
        return this.updateCustomDomainWithOptions(domainName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The GPU memory capacity for the function. Unit: MB. The value must be a multiple of 1,024.</p>
     * 
     * @param request UpdateFunctionRequest
     * @param headers UpdateFunctionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFunctionResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>The GPU memory capacity for the function. Unit: MB. The value must be a multiple of 1,024.</p>
     * 
     * @param request UpdateFunctionRequest
     * @return UpdateFunctionResponse
     */
    public UpdateFunctionResponse updateFunction(String serviceName, String functionName, UpdateFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateFunctionHeaders headers = new UpdateFunctionHeaders();
        return this.updateFunctionWithOptions(serviceName, functionName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a service.</p>
     * 
     * @param request UpdateServiceRequest
     * @param headers UpdateServiceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates a service.</p>
     * 
     * @param request UpdateServiceRequest
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateService(String serviceName, UpdateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateServiceHeaders headers = new UpdateServiceHeaders();
        return this.updateServiceWithOptions(serviceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a trigger.</p>
     * 
     * @param request UpdateTriggerRequest
     * @param headers UpdateTriggerHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTriggerResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Modifies a trigger.</p>
     * 
     * @param request UpdateTriggerRequest
     * @return UpdateTriggerResponse
     */
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
