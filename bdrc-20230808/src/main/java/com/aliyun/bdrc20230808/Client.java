// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808;

import com.aliyun.tea.*;
import com.aliyun.bdrc20230808.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("bdrc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request CheckRulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckRulesResponse
     */
    public CheckRulesResponse checkRulesWithOptions(CheckRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceArn)) {
            body.put("ResourceArn", request.resourceArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckRules"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/rules/check"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckRulesResponse());
    }

    /**
     * @param request CheckRulesRequest
     * @return CheckRulesResponse
     */
    public CheckRulesResponse checkRules(CheckRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkRulesWithOptions(request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseBdrcServiceResponse
     */
    public CloseBdrcServiceResponse closeBdrcServiceWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseBdrcService"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/service/close"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseBdrcServiceResponse());
    }

    /**
     * @return CloseBdrcServiceResponse
     */
    public CloseBdrcServiceResponse closeBdrcService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeBdrcServiceWithOptions(headers, runtime);
    }

    /**
     * @param request DescribeCheckDetailsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCheckDetailsResponse
     */
    public DescribeCheckDetailsResponse describeCheckDetailsWithOptions(DescribeCheckDetailsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceArn)) {
            query.put("ResourceArn", request.resourceArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCheckDetails"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/check-details"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCheckDetailsResponse());
    }

    /**
     * @param request DescribeCheckDetailsRequest
     * @return DescribeCheckDetailsResponse
     */
    public DescribeCheckDetailsResponse describeCheckDetails(DescribeCheckDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeCheckDetailsWithOptions(request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProductsResponse
     */
    public DescribeProductsResponse describeProductsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProducts"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/products"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProductsResponse());
    }

    /**
     * @return DescribeProductsResponse
     */
    public DescribeProductsResponse describeProducts() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeProductsWithOptions(headers, runtime);
    }

    /**
     * @param request DescribeResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourcesResponse
     */
    public DescribeResourcesResponse describeResourcesWithOptions(DescribeResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataRedundancyType)) {
            query.put("DataRedundancyType", request.dataRedundancyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failedRuleTemplate)) {
            query.put("FailedRuleTemplate", request.failedRuleTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageClass)) {
            query.put("StorageClass", request.storageClass);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResources"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourcesResponse());
    }

    /**
     * @param request DescribeResourcesRequest
     * @return DescribeResourcesResponse
     */
    public DescribeResourcesResponse describeResources(DescribeResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourcesWithOptions(request, headers, runtime);
    }

    /**
     * @param request DescribeRulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRulesResponse
     */
    public DescribeRulesResponse describeRulesWithOptions(DescribeRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRules"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/rules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRulesResponse());
    }

    /**
     * @param request DescribeRulesRequest
     * @return DescribeRulesResponse
     */
    public DescribeRulesResponse describeRules(DescribeRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRulesWithOptions(request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTaskResponse
     */
    public DescribeTaskResponse describeTaskWithOptions(String TaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTask"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTaskResponse());
    }

    /**
     * @return DescribeTaskResponse
     */
    public DescribeTaskResponse describeTask(String TaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTaskWithOptions(TaskId, headers, runtime);
    }

    /**
     * @param request DescribeTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTasksResponse
     */
    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            query.put("TaskStatus", request.taskStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTasks"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTasksResponse());
    }

    /**
     * @param request DescribeTasksRequest
     * @return DescribeTasksResponse
     */
    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTasksWithOptions(request, headers, runtime);
    }

    /**
     * @param request DescribeTopRiskyResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTopRiskyResourcesResponse
     */
    public DescribeTopRiskyResourcesResponse describeTopRiskyResourcesWithOptions(DescribeTopRiskyResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTopRiskyResources"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/top-risky"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTopRiskyResourcesResponse());
    }

    /**
     * @param request DescribeTopRiskyResourcesRequest
     * @return DescribeTopRiskyResourcesResponse
     */
    public DescribeTopRiskyResourcesResponse describeTopRiskyResources(DescribeTopRiskyResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTopRiskyResourcesWithOptions(request, headers, runtime);
    }

    /**
     * @param request DisableCheckProductRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableCheckProductResponse
     */
    public DisableCheckProductResponse disableCheckProductWithOptions(DisableCheckProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableCheckProduct"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/products/disable-check"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableCheckProductResponse());
    }

    /**
     * @param request DisableCheckProductRequest
     * @return DisableCheckProductResponse
     */
    public DisableCheckProductResponse disableCheckProduct(DisableCheckProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableCheckProductWithOptions(request, headers, runtime);
    }

    /**
     * @param request DisableCheckResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableCheckResourceResponse
     */
    public DisableCheckResourceResponse disableCheckResourceWithOptions(DisableCheckResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceArn)) {
            body.put("ResourceArn", request.resourceArn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableCheckResource"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/disable-check"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableCheckResourceResponse());
    }

    /**
     * @param request DisableCheckResourceRequest
     * @return DisableCheckResourceResponse
     */
    public DisableCheckResourceResponse disableCheckResource(DisableCheckResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableCheckResourceWithOptions(request, headers, runtime);
    }

    /**
     * @param request EnableCheckProductRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableCheckProductResponse
     */
    public EnableCheckProductResponse enableCheckProductWithOptions(EnableCheckProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableCheckProduct"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/products/enable-check"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableCheckProductResponse());
    }

    /**
     * @param request EnableCheckProductRequest
     * @return EnableCheckProductResponse
     */
    public EnableCheckProductResponse enableCheckProduct(EnableCheckProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableCheckProductWithOptions(request, headers, runtime);
    }

    /**
     * @param request EnableCheckResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableCheckResourceResponse
     */
    public EnableCheckResourceResponse enableCheckResourceWithOptions(EnableCheckResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceArn)) {
            body.put("ResourceArn", request.resourceArn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableCheckResource"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/enable-check"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableCheckResourceResponse());
    }

    /**
     * @param request EnableCheckResourceRequest
     * @return EnableCheckResourceResponse
     */
    public EnableCheckResourceResponse enableCheckResource(EnableCheckResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableCheckResourceWithOptions(request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBdrcServiceResponse
     */
    public GetBdrcServiceResponse getBdrcServiceWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBdrcService"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/service"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBdrcServiceResponse());
    }

    /**
     * @return GetBdrcServiceResponse
     */
    public GetBdrcServiceResponse getBdrcService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBdrcServiceWithOptions(headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenBdrcServiceResponse
     */
    public OpenBdrcServiceResponse openBdrcServiceWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenBdrcService"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/service/open"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenBdrcServiceResponse());
    }

    /**
     * @return OpenBdrcServiceResponse
     */
    public OpenBdrcServiceResponse openBdrcService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openBdrcServiceWithOptions(headers, runtime);
    }

    /**
     * @param request UpdateResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourcesResponse
     */
    public UpdateResourcesResponse updateResourcesWithOptions(UpdateResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResources"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourcesResponse());
    }

    /**
     * @param request UpdateResourcesRequest
     * @return UpdateResourcesResponse
     */
    public UpdateResourcesResponse updateResources(UpdateResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourcesWithOptions(request, headers, runtime);
    }
}
