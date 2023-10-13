// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330;

import com.aliyun.tea.*;
import com.aliyun.fc20230330.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("fc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
      * 创建函数别名。
      *
      * @param request CreateAliasRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateAliasResponse
     */
    public CreateAliasResponse createAliasWithOptions(String functionName, CreateAliasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlias"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/aliases"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAliasResponse());
    }

    /**
      * 创建函数别名。
      *
      * @param request CreateAliasRequest
      * @return CreateAliasResponse
     */
    public CreateAliasResponse createAlias(String functionName, CreateAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAliasWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 创建自定义域名。
      *
      * @param request CreateCustomDomainRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateCustomDomainResponse
     */
    public CreateCustomDomainResponse createCustomDomainWithOptions(CreateCustomDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomDomain"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/custom-domains"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomDomainResponse());
    }

    /**
      * 创建自定义域名。
      *
      * @param request CreateCustomDomainRequest
      * @return CreateCustomDomainResponse
     */
    public CreateCustomDomainResponse createCustomDomain(CreateCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCustomDomainWithOptions(request, headers, runtime);
    }

    /**
      * 创建函数。
      *
      * @param request CreateFunctionRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateFunctionResponse
     */
    public CreateFunctionResponse createFunctionWithOptions(CreateFunctionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFunction"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFunctionResponse());
    }

    /**
      * 创建函数。
      *
      * @param request CreateFunctionRequest
      * @return CreateFunctionResponse
     */
    public CreateFunctionResponse createFunction(CreateFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFunctionWithOptions(request, headers, runtime);
    }

    /**
      * 创建层版本。
      *
      * @param request CreateLayerVersionRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateLayerVersionResponse
     */
    public CreateLayerVersionResponse createLayerVersionWithOptions(String layerName, CreateLayerVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLayerVersion"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/layers/" + com.aliyun.openapiutil.Client.getEncodeParam(layerName) + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLayerVersionResponse());
    }

    /**
      * 创建层版本。
      *
      * @param request CreateLayerVersionRequest
      * @return CreateLayerVersionResponse
     */
    public CreateLayerVersionResponse createLayerVersion(String layerName, CreateLayerVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLayerVersionWithOptions(layerName, request, headers, runtime);
    }

    /**
      * 创建函数触发器。
      *
      * @param request CreateTriggerRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateTriggerResponse
     */
    public CreateTriggerResponse createTriggerWithOptions(String functionName, CreateTriggerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrigger"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/triggers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTriggerResponse());
    }

    /**
      * 创建函数触发器。
      *
      * @param request CreateTriggerRequest
      * @return CreateTriggerResponse
     */
    public CreateTriggerResponse createTrigger(String functionName, CreateTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTriggerWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 创建VPC绑定。
      *
      * @param request CreateVpcBindingRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateVpcBindingResponse
     */
    public CreateVpcBindingResponse createVpcBindingWithOptions(String functionName, CreateVpcBindingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcBinding"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/vpc-bindings"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcBindingResponse());
    }

    /**
      * 创建VPC绑定。
      *
      * @param request CreateVpcBindingRequest
      * @return CreateVpcBindingResponse
     */
    public CreateVpcBindingResponse createVpcBinding(String functionName, CreateVpcBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVpcBindingWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 删除函数别名。
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteAliasResponse
     */
    public DeleteAliasResponse deleteAliasWithOptions(String functionName, String aliasName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlias"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/aliases/" + com.aliyun.openapiutil.Client.getEncodeParam(aliasName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAliasResponse());
    }

    /**
      * 删除函数别名。
      *
      * @return DeleteAliasResponse
     */
    public DeleteAliasResponse deleteAlias(String functionName, String aliasName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAliasWithOptions(functionName, aliasName, headers, runtime);
    }

    /**
      * 删除函数异步调用配置。
      *
      * @param request DeleteAsyncInvokeConfigRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteAsyncInvokeConfigResponse
     */
    public DeleteAsyncInvokeConfigResponse deleteAsyncInvokeConfigWithOptions(String functionName, DeleteAsyncInvokeConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAsyncInvokeConfig"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/async-invoke-config"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAsyncInvokeConfigResponse());
    }

    /**
      * 删除函数异步调用配置。
      *
      * @param request DeleteAsyncInvokeConfigRequest
      * @return DeleteAsyncInvokeConfigResponse
     */
    public DeleteAsyncInvokeConfigResponse deleteAsyncInvokeConfig(String functionName, DeleteAsyncInvokeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAsyncInvokeConfigWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 删除函数并发度配置。
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteConcurrencyConfigResponse
     */
    public DeleteConcurrencyConfigResponse deleteConcurrencyConfigWithOptions(String functionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConcurrencyConfig"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/concurrency"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConcurrencyConfigResponse());
    }

    /**
      * 删除函数并发度配置。
      *
      * @return DeleteConcurrencyConfigResponse
     */
    public DeleteConcurrencyConfigResponse deleteConcurrencyConfig(String functionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConcurrencyConfigWithOptions(functionName, headers, runtime);
    }

    /**
      * 删除自定义域名。
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteCustomDomainResponse
     */
    public DeleteCustomDomainResponse deleteCustomDomainWithOptions(String domainName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomDomain"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/custom-domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomDomainResponse());
    }

    /**
      * 删除自定义域名。
      *
      * @return DeleteCustomDomainResponse
     */
    public DeleteCustomDomainResponse deleteCustomDomain(String domainName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCustomDomainWithOptions(domainName, headers, runtime);
    }

    /**
      * 删除函数。
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteFunctionResponse
     */
    public DeleteFunctionResponse deleteFunctionWithOptions(String functionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunction"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionResponse());
    }

    /**
      * 删除函数。
      *
      * @return DeleteFunctionResponse
     */
    public DeleteFunctionResponse deleteFunction(String functionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFunctionWithOptions(functionName, headers, runtime);
    }

    /**
      * 删除函数版本。
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteFunctionVersionResponse
     */
    public DeleteFunctionVersionResponse deleteFunctionVersionWithOptions(String functionName, String versionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunctionVersion"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(versionId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionVersionResponse());
    }

    /**
      * 删除函数版本。
      *
      * @return DeleteFunctionVersionResponse
     */
    public DeleteFunctionVersionResponse deleteFunctionVersion(String functionName, String versionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFunctionVersionWithOptions(functionName, versionId, headers, runtime);
    }

    /**
      * 删除层版本。
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteLayerVersionResponse
     */
    public DeleteLayerVersionResponse deleteLayerVersionWithOptions(String layerName, String version, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLayerVersion"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/layers/" + com.aliyun.openapiutil.Client.getEncodeParam(layerName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLayerVersionResponse());
    }

    /**
      * 删除层版本。
      *
      * @return DeleteLayerVersionResponse
     */
    public DeleteLayerVersionResponse deleteLayerVersion(String layerName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLayerVersionWithOptions(layerName, version, headers, runtime);
    }

    /**
      * 删除函数预留配置。
      *
      * @param request DeleteProvisionConfigRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteProvisionConfigResponse
     */
    public DeleteProvisionConfigResponse deleteProvisionConfigWithOptions(String functionName, DeleteProvisionConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProvisionConfig"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/provision-config"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProvisionConfigResponse());
    }

    /**
      * 删除函数预留配置。
      *
      * @param request DeleteProvisionConfigRequest
      * @return DeleteProvisionConfigResponse
     */
    public DeleteProvisionConfigResponse deleteProvisionConfig(String functionName, DeleteProvisionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProvisionConfigWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 删除函数触发器。
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteTriggerResponse
     */
    public DeleteTriggerResponse deleteTriggerWithOptions(String functionName, String triggerName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrigger"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/triggers/" + com.aliyun.openapiutil.Client.getEncodeParam(triggerName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTriggerResponse());
    }

    /**
      * 删除函数触发器。
      *
      * @return DeleteTriggerResponse
     */
    public DeleteTriggerResponse deleteTrigger(String functionName, String triggerName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTriggerWithOptions(functionName, triggerName, headers, runtime);
    }

    /**
      * 删除VPC绑定。
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteVpcBindingResponse
     */
    public DeleteVpcBindingResponse deleteVpcBindingWithOptions(String functionName, String vpcId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpcBinding"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/vpc-bindings/" + com.aliyun.openapiutil.Client.getEncodeParam(vpcId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpcBindingResponse());
    }

    /**
      * 删除VPC绑定。
      *
      * @return DeleteVpcBindingResponse
     */
    public DeleteVpcBindingResponse deleteVpcBinding(String functionName, String vpcId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVpcBindingWithOptions(functionName, vpcId, headers, runtime);
    }

    /**
      * 获取函数别名信息。
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAliasResponse
     */
    public GetAliasResponse getAliasWithOptions(String functionName, String aliasName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlias"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/aliases/" + com.aliyun.openapiutil.Client.getEncodeParam(aliasName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAliasResponse());
    }

    /**
      * 获取函数别名信息。
      *
      * @return GetAliasResponse
     */
    public GetAliasResponse getAlias(String functionName, String aliasName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAliasWithOptions(functionName, aliasName, headers, runtime);
    }

    /**
      * 获取函数异步调用配置。
      *
      * @param request GetAsyncInvokeConfigRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAsyncInvokeConfigResponse
     */
    public GetAsyncInvokeConfigResponse getAsyncInvokeConfigWithOptions(String functionName, GetAsyncInvokeConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsyncInvokeConfig"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/async-invoke-config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAsyncInvokeConfigResponse());
    }

    /**
      * 获取函数异步调用配置。
      *
      * @param request GetAsyncInvokeConfigRequest
      * @return GetAsyncInvokeConfigResponse
     */
    public GetAsyncInvokeConfigResponse getAsyncInvokeConfig(String functionName, GetAsyncInvokeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAsyncInvokeConfigWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 获取函数并发度配置。
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetConcurrencyConfigResponse
     */
    public GetConcurrencyConfigResponse getConcurrencyConfigWithOptions(String functionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConcurrencyConfig"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/concurrency"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConcurrencyConfigResponse());
    }

    /**
      * 获取函数并发度配置。
      *
      * @return GetConcurrencyConfigResponse
     */
    public GetConcurrencyConfigResponse getConcurrencyConfig(String functionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConcurrencyConfigWithOptions(functionName, headers, runtime);
    }

    /**
      * 获取自定义域名。
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetCustomDomainResponse
     */
    public GetCustomDomainResponse getCustomDomainWithOptions(String domainName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomDomain"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/custom-domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomDomainResponse());
    }

    /**
      * 获取自定义域名。
      *
      * @return GetCustomDomainResponse
     */
    public GetCustomDomainResponse getCustomDomain(String domainName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCustomDomainWithOptions(domainName, headers, runtime);
    }

    /**
      * 获取函数信息。
      *
      * @param request GetFunctionRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetFunctionResponse
     */
    public GetFunctionResponse getFunctionWithOptions(String functionName, GetFunctionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunction"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionResponse());
    }

    /**
      * 获取函数信息。
      *
      * @param request GetFunctionRequest
      * @return GetFunctionResponse
     */
    public GetFunctionResponse getFunction(String functionName, GetFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 获取函数代码。
      *
      * @param request GetFunctionCodeRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetFunctionCodeResponse
     */
    public GetFunctionCodeResponse getFunctionCodeWithOptions(String functionName, GetFunctionCodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunctionCode"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/code"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionCodeResponse());
    }

    /**
      * 获取函数代码。
      *
      * @param request GetFunctionCodeRequest
      * @return GetFunctionCodeResponse
     */
    public GetFunctionCodeResponse getFunctionCode(String functionName, GetFunctionCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionCodeWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 获取层版本。
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetLayerVersionResponse
     */
    public GetLayerVersionResponse getLayerVersionWithOptions(String layerName, String version, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLayerVersion"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/layers/" + com.aliyun.openapiutil.Client.getEncodeParam(layerName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLayerVersionResponse());
    }

    /**
      * 获取层版本。
      *
      * @return GetLayerVersionResponse
     */
    public GetLayerVersionResponse getLayerVersion(String layerName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLayerVersionWithOptions(layerName, version, headers, runtime);
    }

    /**
      * 根据资源标识获取层版本。
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetLayerVersionByArnResponse
     */
    public GetLayerVersionByArnResponse getLayerVersionByArnWithOptions(String arn, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLayerVersionByArn"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/layerarn/" + com.aliyun.openapiutil.Client.getEncodeParam(arn) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLayerVersionByArnResponse());
    }

    /**
      * 根据资源标识获取层版本。
      *
      * @return GetLayerVersionByArnResponse
     */
    public GetLayerVersionByArnResponse getLayerVersionByArn(String arn) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLayerVersionByArnWithOptions(arn, headers, runtime);
    }

    /**
      * 获取函数预留配置。
      *
      * @param request GetProvisionConfigRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetProvisionConfigResponse
     */
    public GetProvisionConfigResponse getProvisionConfigWithOptions(String functionName, GetProvisionConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProvisionConfig"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/provision-config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProvisionConfigResponse());
    }

    /**
      * 获取函数预留配置。
      *
      * @param request GetProvisionConfigRequest
      * @return GetProvisionConfigResponse
     */
    public GetProvisionConfigResponse getProvisionConfig(String functionName, GetProvisionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProvisionConfigWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 获取资源标签。
      *
      * @param request GetResourceTagsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetResourceTagsResponse
     */
    public GetResourceTagsResponse getResourceTagsWithOptions(GetResourceTagsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arn)) {
            query.put("arn", request.arn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceTags"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/tag"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceTagsResponse());
    }

    /**
      * 获取资源标签。
      *
      * @param request GetResourceTagsRequest
      * @return GetResourceTagsResponse
     */
    public GetResourceTagsResponse getResourceTags(GetResourceTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceTagsWithOptions(request, headers, runtime);
    }

    /**
      * 获取函数触发器。
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetTriggerResponse
     */
    public GetTriggerResponse getTriggerWithOptions(String functionName, String triggerName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrigger"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/triggers/" + com.aliyun.openapiutil.Client.getEncodeParam(triggerName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTriggerResponse());
    }

    /**
      * 获取函数触发器。
      *
      * @return GetTriggerResponse
     */
    public GetTriggerResponse getTrigger(String functionName, String triggerName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTriggerWithOptions(functionName, triggerName, headers, runtime);
    }

    /**
      * 调用函数。
      *
      * @param request InvokeFunctionRequest
      * @param headers InvokeFunctionHeaders
      * @param runtime runtime options for this request RuntimeOptions
      * @return InvokeFunctionResponse
     */
    public InvokeFunctionResponse invokeFunctionWithOptions(String functionName, InvokeFunctionRequest request, InvokeFunctionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcInvocationType)) {
            realHeaders.put("x-fc-invocation-type", com.aliyun.teautil.Common.toJSONString(headers.xFcInvocationType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xFcLogType)) {
            realHeaders.put("x-fc-log-type", com.aliyun.teautil.Common.toJSONString(headers.xFcLogType));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeFunction"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/invocations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "binary")
        ));
        InvokeFunctionResponse res = new InvokeFunctionResponse();
        java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.assertAsMap(this.callApi(params, req, runtime));
        if (!com.aliyun.teautil.Common.isUnset(tmp.get("body"))) {
            java.io.InputStream respBody = com.aliyun.teautil.Common.assertAsReadable(tmp.get("body"));
            res.body = respBody;
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.get("headers"))) {
            java.util.Map<String, Object> respHeaders = com.aliyun.teautil.Common.assertAsMap(tmp.get("headers"));
            res.headers = com.aliyun.teautil.Common.stringifyMapValue(respHeaders);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.get("statusCode"))) {
            Integer statusCode = com.aliyun.teautil.Common.assertAsInteger(tmp.get("statusCode"));
            res.statusCode = statusCode;
        }

        return res;
    }

    /**
      * 调用函数。
      *
      * @param request InvokeFunctionRequest
      * @return InvokeFunctionResponse
     */
    public InvokeFunctionResponse invokeFunction(String functionName, InvokeFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvokeFunctionHeaders headers = new InvokeFunctionHeaders();
        return this.invokeFunctionWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 列出函数别名。
      *
      * @param request ListAliasesRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAliasesResponse
     */
    public ListAliasesResponse listAliasesWithOptions(String functionName, ListAliasesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAliases"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/aliases"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAliasesResponse());
    }

    /**
      * 列出函数别名。
      *
      * @param request ListAliasesRequest
      * @return ListAliasesResponse
     */
    public ListAliasesResponse listAliases(String functionName, ListAliasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAliasesWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 列出函数异步调用配置。
      *
      * @param request ListAsyncInvokeConfigsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAsyncInvokeConfigsResponse
     */
    public ListAsyncInvokeConfigsResponse listAsyncInvokeConfigsWithOptions(ListAsyncInvokeConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("functionName", request.functionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAsyncInvokeConfigs"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/async-invoke-configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAsyncInvokeConfigsResponse());
    }

    /**
      * 列出函数异步调用配置。
      *
      * @param request ListAsyncInvokeConfigsRequest
      * @return ListAsyncInvokeConfigsResponse
     */
    public ListAsyncInvokeConfigsResponse listAsyncInvokeConfigs(ListAsyncInvokeConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAsyncInvokeConfigsWithOptions(request, headers, runtime);
    }

    /**
      * 列出函数并发度配置。
      *
      * @param request ListConcurrencyConfigsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListConcurrencyConfigsResponse
     */
    public ListConcurrencyConfigsResponse listConcurrencyConfigsWithOptions(ListConcurrencyConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("functionName", request.functionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConcurrencyConfigs"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/concurrency-configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConcurrencyConfigsResponse());
    }

    /**
      * 列出函数并发度配置。
      *
      * @param request ListConcurrencyConfigsRequest
      * @return ListConcurrencyConfigsResponse
     */
    public ListConcurrencyConfigsResponse listConcurrencyConfigs(ListConcurrencyConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConcurrencyConfigsWithOptions(request, headers, runtime);
    }

    /**
      * 列出自定义域名。
      *
      * @param request ListCustomDomainsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListCustomDomainsResponse
     */
    public ListCustomDomainsResponse listCustomDomainsWithOptions(ListCustomDomainsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomDomains"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/custom-domains"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomDomainsResponse());
    }

    /**
      * 列出自定义域名。
      *
      * @param request ListCustomDomainsRequest
      * @return ListCustomDomainsResponse
     */
    public ListCustomDomainsResponse listCustomDomains(ListCustomDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCustomDomainsWithOptions(request, headers, runtime);
    }

    /**
      * 列出函数版本。
      *
      * @param request ListFunctionVersionsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListFunctionVersionsResponse
     */
    public ListFunctionVersionsResponse listFunctionVersionsWithOptions(String functionName, ListFunctionVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctionVersions"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionVersionsResponse());
    }

    /**
      * 列出函数版本。
      *
      * @param request ListFunctionVersionsRequest
      * @return ListFunctionVersionsResponse
     */
    public ListFunctionVersionsResponse listFunctionVersions(String functionName, ListFunctionVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionVersionsWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 列出函数。
      *
      * @param request ListFunctionsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListFunctionsResponse
     */
    public ListFunctionsResponse listFunctionsWithOptions(ListFunctionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctions"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionsResponse());
    }

    /**
      * 列出函数。
      *
      * @param request ListFunctionsRequest
      * @return ListFunctionsResponse
     */
    public ListFunctionsResponse listFunctions(ListFunctionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionsWithOptions(request, headers, runtime);
    }

    /**
      * 列出函数实例。
      *
      * @param request ListInstancesRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(String functionName, ListInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withAllActive)) {
            query.put("withAllActive", request.withAllActive);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
      * 列出函数实例。
      *
      * @param request ListInstancesRequest
      * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(String functionName, ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 列出层版本。
      *
      * @param request ListLayerVersionsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListLayerVersionsResponse
     */
    public ListLayerVersionsResponse listLayerVersionsWithOptions(String layerName, ListLayerVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startVersion)) {
            query.put("startVersion", request.startVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLayerVersions"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/layers/" + com.aliyun.openapiutil.Client.getEncodeParam(layerName) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLayerVersionsResponse());
    }

    /**
      * 列出层版本。
      *
      * @param request ListLayerVersionsRequest
      * @return ListLayerVersionsResponse
     */
    public ListLayerVersionsResponse listLayerVersions(String layerName, ListLayerVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLayerVersionsWithOptions(layerName, request, headers, runtime);
    }

    /**
      * 列出层。
      *
      * @param request ListLayersRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListLayersResponse
     */
    public ListLayersResponse listLayersWithOptions(ListLayersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLayers"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/layers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLayersResponse());
    }

    /**
      * 列出层。
      *
      * @param request ListLayersRequest
      * @return ListLayersResponse
     */
    public ListLayersResponse listLayers(ListLayersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLayersWithOptions(request, headers, runtime);
    }

    /**
      * 列出函数预留配置。
      *
      * @param request ListProvisionConfigsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListProvisionConfigsResponse
     */
    public ListProvisionConfigsResponse listProvisionConfigsWithOptions(ListProvisionConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("functionName", request.functionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProvisionConfigs"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/provision-configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProvisionConfigsResponse());
    }

    /**
      * 列出函数预留配置。
      *
      * @param request ListProvisionConfigsRequest
      * @return ListProvisionConfigsResponse
     */
    public ListProvisionConfigsResponse listProvisionConfigs(ListProvisionConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProvisionConfigsWithOptions(request, headers, runtime);
    }

    /**
      * 列出具有标签的资源。
      *
      * @param request ListTaggedResourcesRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListTaggedResourcesResponse
     */
    public ListTaggedResourcesResponse listTaggedResourcesWithOptions(ListTaggedResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaggedResources"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaggedResourcesResponse());
    }

    /**
      * 列出具有标签的资源。
      *
      * @param request ListTaggedResourcesRequest
      * @return ListTaggedResourcesResponse
     */
    public ListTaggedResourcesResponse listTaggedResources(ListTaggedResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTaggedResourcesWithOptions(request, headers, runtime);
    }

    /**
      * 列出函数触发器。
      *
      * @param request ListTriggersRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListTriggersResponse
     */
    public ListTriggersResponse listTriggersWithOptions(String functionName, ListTriggersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTriggers"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/triggers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTriggersResponse());
    }

    /**
      * 列出函数触发器。
      *
      * @param request ListTriggersRequest
      * @return ListTriggersResponse
     */
    public ListTriggersResponse listTriggers(String functionName, ListTriggersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTriggersWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 列出VPC绑定配置。
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListVpcBindingsResponse
     */
    public ListVpcBindingsResponse listVpcBindingsWithOptions(String functionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcBindings"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/vpc-bindings"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcBindingsResponse());
    }

    /**
      * 列出VPC绑定配置。
      *
      * @return ListVpcBindingsResponse
     */
    public ListVpcBindingsResponse listVpcBindings(String functionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVpcBindingsWithOptions(functionName, headers, runtime);
    }

    /**
      * 发布函数版本。
      *
      * @param request PublishFunctionVersionRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return PublishFunctionVersionResponse
     */
    public PublishFunctionVersionResponse publishFunctionVersionWithOptions(String functionName, PublishFunctionVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishFunctionVersion"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishFunctionVersionResponse());
    }

    /**
      * 发布函数版本。
      *
      * @param request PublishFunctionVersionRequest
      * @return PublishFunctionVersionResponse
     */
    public PublishFunctionVersionResponse publishFunctionVersion(String functionName, PublishFunctionVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishFunctionVersionWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 设置函数异步调用配置。
      *
      * @param request PutAsyncInvokeConfigRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return PutAsyncInvokeConfigResponse
     */
    public PutAsyncInvokeConfigResponse putAsyncInvokeConfigWithOptions(String functionName, PutAsyncInvokeConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutAsyncInvokeConfig"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/async-invoke-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutAsyncInvokeConfigResponse());
    }

    /**
      * 设置函数异步调用配置。
      *
      * @param request PutAsyncInvokeConfigRequest
      * @return PutAsyncInvokeConfigResponse
     */
    public PutAsyncInvokeConfigResponse putAsyncInvokeConfig(String functionName, PutAsyncInvokeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putAsyncInvokeConfigWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 设置函数并发度配置。
      *
      * @param request PutConcurrencyConfigRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return PutConcurrencyConfigResponse
     */
    public PutConcurrencyConfigResponse putConcurrencyConfigWithOptions(String functionName, PutConcurrencyConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutConcurrencyConfig"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/concurrency"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutConcurrencyConfigResponse());
    }

    /**
      * 设置函数并发度配置。
      *
      * @param request PutConcurrencyConfigRequest
      * @return PutConcurrencyConfigResponse
     */
    public PutConcurrencyConfigResponse putConcurrencyConfig(String functionName, PutConcurrencyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putConcurrencyConfigWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 设置层的访问权限。
      *
      * @param request PutLayerACLRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return PutLayerACLResponse
     */
    public PutLayerACLResponse putLayerACLWithOptions(String layerName, PutLayerACLRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request._public)) {
            query.put("public", request._public);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutLayerACL"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/layers/" + com.aliyun.openapiutil.Client.getEncodeParam(layerName) + "/acl"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutLayerACLResponse());
    }

    /**
      * 设置层的访问权限。
      *
      * @param request PutLayerACLRequest
      * @return PutLayerACLResponse
     */
    public PutLayerACLResponse putLayerACL(String layerName, PutLayerACLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putLayerACLWithOptions(layerName, request, headers, runtime);
    }

    /**
      * 设置函数预留配置。
      *
      * @param request PutProvisionConfigRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return PutProvisionConfigResponse
     */
    public PutProvisionConfigResponse putProvisionConfigWithOptions(String functionName, PutProvisionConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            query.put("qualifier", request.qualifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutProvisionConfig"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/provision-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutProvisionConfigResponse());
    }

    /**
      * 设置函数预留配置。
      *
      * @param request PutProvisionConfigRequest
      * @return PutProvisionConfigResponse
     */
    public PutProvisionConfigResponse putProvisionConfig(String functionName, PutProvisionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putProvisionConfigWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 设置资源标签。
      *
      * @param request TagResourceRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return TagResourceResponse
     */
    public TagResourceResponse tagResourceWithOptions(TagResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResource"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/tag"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourceResponse());
    }

    /**
      * 设置资源标签。
      *
      * @param request TagResourceRequest
      * @return TagResourceResponse
     */
    public TagResourceResponse tagResource(TagResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourceWithOptions(request, headers, runtime);
    }

    /**
      * 删除资源标签。
      *
      * @param request UntagResourceRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UntagResourceResponse
     */
    public UntagResourceResponse untagResourceWithOptions(UntagResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("all", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arn)) {
            query.put("arn", request.arn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            query.put("tagKeys", request.tagKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResource"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/tag"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourceResponse());
    }

    /**
      * 删除资源标签。
      *
      * @param request UntagResourceRequest
      * @return UntagResourceResponse
     */
    public UntagResourceResponse untagResource(UntagResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourceWithOptions(request, headers, runtime);
    }

    /**
      * 更新函数别名。
      *
      * @param request UpdateAliasRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAliasResponse
     */
    public UpdateAliasResponse updateAliasWithOptions(String functionName, String aliasName, UpdateAliasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlias"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/aliases/" + com.aliyun.openapiutil.Client.getEncodeParam(aliasName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAliasResponse());
    }

    /**
      * 更新函数别名。
      *
      * @param request UpdateAliasRequest
      * @return UpdateAliasResponse
     */
    public UpdateAliasResponse updateAlias(String functionName, String aliasName, UpdateAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAliasWithOptions(functionName, aliasName, request, headers, runtime);
    }

    /**
      * 更新自定义域名。
      *
      * @param request UpdateCustomDomainRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateCustomDomainResponse
     */
    public UpdateCustomDomainResponse updateCustomDomainWithOptions(String domainName, UpdateCustomDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomDomain"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/custom-domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomDomainResponse());
    }

    /**
      * 更新自定义域名。
      *
      * @param request UpdateCustomDomainRequest
      * @return UpdateCustomDomainResponse
     */
    public UpdateCustomDomainResponse updateCustomDomain(String domainName, UpdateCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCustomDomainWithOptions(domainName, request, headers, runtime);
    }

    /**
      * 更新函数。
      *
      * @param request UpdateFunctionRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateFunctionResponse
     */
    public UpdateFunctionResponse updateFunctionWithOptions(String functionName, UpdateFunctionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFunction"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFunctionResponse());
    }

    /**
      * 更新函数。
      *
      * @param request UpdateFunctionRequest
      * @return UpdateFunctionResponse
     */
    public UpdateFunctionResponse updateFunction(String functionName, UpdateFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFunctionWithOptions(functionName, request, headers, runtime);
    }

    /**
      * 更新函数触发器。
      *
      * @param request UpdateTriggerRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateTriggerResponse
     */
    public UpdateTriggerResponse updateTriggerWithOptions(String functionName, String triggerName, UpdateTriggerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTrigger"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/triggers/" + com.aliyun.openapiutil.Client.getEncodeParam(triggerName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTriggerResponse());
    }

    /**
      * 更新函数触发器。
      *
      * @param request UpdateTriggerRequest
      * @return UpdateTriggerResponse
     */
    public UpdateTriggerResponse updateTrigger(String functionName, String triggerName, UpdateTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTriggerWithOptions(functionName, triggerName, request, headers, runtime);
    }
}
