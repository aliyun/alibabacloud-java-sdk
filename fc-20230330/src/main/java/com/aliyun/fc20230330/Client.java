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
      * create function version
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
      * create function version
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
      * Create custom domain.
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
      * Create custom domain.
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
      * Create function
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
      * Create function
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
      * Create layer version
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
      * Create layer version
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
      * Create trigger.
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
      * Create trigger.
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
      * Delete function alias
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
      * Delete function alias
      *
      * @return DeleteAliasResponse
     */
    public DeleteAliasResponse deleteAlias(String functionName, String aliasName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAliasWithOptions(functionName, aliasName, headers, runtime);
    }

    /**
      * Delete function async invoke config
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
      * Delete function async invoke config
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
      * deletes the concurrency config for a function
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
      * deletes the concurrency config for a function
      *
      * @return DeleteConcurrencyConfigResponse
     */
    public DeleteConcurrencyConfigResponse deleteConcurrencyConfig(String functionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConcurrencyConfigWithOptions(functionName, headers, runtime);
    }

    /**
      * Delete custom domain.
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
      * Delete custom domain.
      *
      * @return DeleteCustomDomainResponse
     */
    public DeleteCustomDomainResponse deleteCustomDomain(String domainName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCustomDomainWithOptions(domainName, headers, runtime);
    }

    /**
      * Delete function
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
      * Delete function
      *
      * @return DeleteFunctionResponse
     */
    public DeleteFunctionResponse deleteFunction(String functionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFunctionWithOptions(functionName, headers, runtime);
    }

    /**
      * Delete function version
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteFunctionVersionResponse
     */
    public DeleteFunctionVersionResponse deleteFunctionVersionWithOptions(String functionName, String versionID, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunctionVersion"),
            new TeaPair("version", "2023-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2023-03-30/functions/" + com.aliyun.openapiutil.Client.getEncodeParam(functionName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(versionID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionVersionResponse());
    }

    /**
      * Delete function version
      *
      * @return DeleteFunctionVersionResponse
     */
    public DeleteFunctionVersionResponse deleteFunctionVersion(String functionName, String versionID) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFunctionVersionWithOptions(functionName, versionID, headers, runtime);
    }

    /**
      * Delete layer version
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
      * Delete layer version
      *
      * @return DeleteLayerVersionResponse
     */
    public DeleteLayerVersionResponse deleteLayerVersion(String layerName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLayerVersionWithOptions(layerName, version, headers, runtime);
    }

    /**
      * Delete provision config.
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
      * Delete provision config.
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
      * Delete trigger.
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
      * Delete trigger.
      *
      * @return DeleteTriggerResponse
     */
    public DeleteTriggerResponse deleteTrigger(String functionName, String triggerName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTriggerWithOptions(functionName, triggerName, headers, runtime);
    }

    /**
      * Get function alias
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
      * Get function alias
      *
      * @return GetAliasResponse
     */
    public GetAliasResponse getAlias(String functionName, String aliasName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAliasWithOptions(functionName, aliasName, headers, runtime);
    }

    /**
      * Get function async invoke config
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
      * Get function async invoke config
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
      * gets the concurrency config for a function
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
      * gets the concurrency config for a function
      *
      * @return GetConcurrencyConfigResponse
     */
    public GetConcurrencyConfigResponse getConcurrencyConfig(String functionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConcurrencyConfigWithOptions(functionName, headers, runtime);
    }

    /**
      * Get custom domain.
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
      * Get custom domain.
      *
      * @return GetCustomDomainResponse
     */
    public GetCustomDomainResponse getCustomDomain(String domainName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCustomDomainWithOptions(domainName, headers, runtime);
    }

    /**
      * Get function info by function name
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
      * Get function info by function name
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
      * Get function code by function name
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
      * Get function code by function name
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
      * Get layer version.
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
      * Get layer version.
      *
      * @return GetLayerVersionResponse
     */
    public GetLayerVersionResponse getLayerVersion(String layerName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLayerVersionWithOptions(layerName, version, headers, runtime);
    }

    /**
      * Get layer version by arn.
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
      * Get layer version by arn.
      *
      * @return GetLayerVersionByArnResponse
     */
    public GetLayerVersionByArnResponse getLayerVersionByArn(String arn) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLayerVersionByArnWithOptions(arn, headers, runtime);
    }

    /**
      * Get provision config.
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
      * Get provision config.
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
      * Get resource tag
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
      * Get resource tag
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
      * Get trigger.
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
      * Get trigger.
      *
      * @return GetTriggerResponse
     */
    public GetTriggerResponse getTrigger(String functionName, String triggerName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTriggerWithOptions(functionName, triggerName, headers, runtime);
    }

    /**
      * Invoke function
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
      * Invoke function
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
      * List function aliases
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
      * List function aliases
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
      * List all functions async invoke config
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
      * List all functions async invoke config
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
      * List all functions concurrency configs
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
      * List all functions concurrency configs
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
      * List custom domains.
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
      * List custom domains.
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
      * List function versions
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
      * List function versions
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
      * Lists existing functions.
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
      * Lists existing functions.
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
      * List instances for function.
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
      * List instances for function.
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
      * List layer versions.
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
      * List layer versions.
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
      * List layers .
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
      * List layers .
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
      * List provision configs.
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
      * List provision configs.
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
      * List tagged resources
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
      * List tagged resources
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
      * List triggers.
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
      * List triggers.
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
      * publish new function version
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
      * publish new function version
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
      * Put function async invoke config.
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
      * Put function async invoke config.
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
      * sets the concurrency config for a function
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
      * sets the concurrency config for a function
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
      * Update layer ACL.
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
      * Update layer ACL.
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
      * Put provision config.
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
      * Put provision config.
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
      * Tag resource
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
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourceResponse());
    }

    /**
      * Tag resource
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
      * Untag resource tag, support resource type: function, service
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
      * Untag resource tag, support resource type: function, service
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
      * Update function alias
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
      * Update function alias
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
      * Update custom domain.
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
      * Update custom domain.
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
      * Update function
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
      * Update function
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
      * Update trigger.
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
      * Update trigger.
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
