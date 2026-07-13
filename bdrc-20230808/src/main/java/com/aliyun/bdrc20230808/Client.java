// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808;

import com.aliyun.tea.*;
import com.aliyun.bdrc20230808.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai-finance-1", "bdrc.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shanghai", "bdrc.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "bdrc.ap-southeast-1.aliyuncs.com")
        );
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
     * <b>summary</b> : 
     * <p>Checks data protection scoring rules. Calling this operation triggers an asynchronous task to check whether your resources meet the data protection scoring requirements.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Checks data protection scoring rules. Calling this operation triggers an asynchronous task to check whether your resources meet the data protection scoring requirements.</p>
     * 
     * @param request CheckRulesRequest
     * @return CheckRulesResponse
     */
    public CheckRulesResponse checkRules(CheckRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkRulesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Shuts down the Backup and Disaster Recovery Center.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Shuts down the Backup and Disaster Recovery Center.</p>
     * @return CloseBdrcServiceResponse
     */
    public CloseBdrcServiceResponse closeBdrcService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeBdrcServiceWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a protection policy.</p>
     * 
     * @param tmpReq CreateProtectionPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProtectionPolicyResponse
     */
    public CreateProtectionPolicyResponse createProtectionPolicyWithOptions(CreateProtectionPolicyRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateProtectionPolicyShrinkRequest request = new CreateProtectionPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.boundResourceCategoryIds)) {
            request.boundResourceCategoryIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.boundResourceCategoryIds, "BoundResourceCategoryIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subProtectionPolicies)) {
            request.subProtectionPoliciesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subProtectionPolicies, "SubProtectionPolicies", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.boundResourceCategoryIdsShrink)) {
            body.put("BoundResourceCategoryIds", request.boundResourceCategoryIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionPolicyName)) {
            body.put("ProtectionPolicyName", request.protectionPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionPolicyRegionId)) {
            body.put("ProtectionPolicyRegionId", request.protectionPolicyRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subProtectionPoliciesShrink)) {
            body.put("SubProtectionPolicies", request.subProtectionPoliciesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProtectionPolicy"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/protection-policies"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProtectionPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a protection policy.</p>
     * 
     * @param request CreateProtectionPolicyRequest
     * @return CreateProtectionPolicyResponse
     */
    public CreateProtectionPolicyResponse createProtectionPolicy(CreateProtectionPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProtectionPolicyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a resource category.</p>
     * 
     * @param request CreateResourceCategoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceCategoryResponse
     */
    public CreateResourceCategoryResponse createResourceCategoryWithOptions(CreateResourceCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceCategoryName)) {
            body.put("ResourceCategoryName", request.resourceCategoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceMatcher)) {
            body.put("ResourceMatcher", request.resourceMatcher);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceCategory"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resource-categories/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a resource category.</p>
     * 
     * @param request CreateResourceCategoryRequest
     * @return CreateResourceCategoryResponse
     */
    public CreateResourceCategoryResponse createResourceCategory(CreateResourceCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceCategoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a protection policy.</p>
     * 
     * @param request DeleteProtectionPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProtectionPolicyResponse
     */
    public DeleteProtectionPolicyResponse deleteProtectionPolicyWithOptions(String ProtectionPolicyId, DeleteProtectionPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProtectionPolicy"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/protection-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(ProtectionPolicyId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProtectionPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a protection policy.</p>
     * 
     * @param request DeleteProtectionPolicyRequest
     * @return DeleteProtectionPolicyResponse
     */
    public DeleteProtectionPolicyResponse deleteProtectionPolicy(String ProtectionPolicyId, DeleteProtectionPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProtectionPolicyWithOptions(ProtectionPolicyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a resource category.</p>
     * 
     * @param request DeleteResourceCategoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceCategoryResponse
     */
    public DeleteResourceCategoryResponse deleteResourceCategoryWithOptions(DeleteResourceCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceCategoryId)) {
            body.put("ResourceCategoryId", request.resourceCategoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceCategory"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resource-categories/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a resource category.</p>
     * 
     * @param request DeleteResourceCategoryRequest
     * @return DeleteResourceCategoryResponse
     */
    public DeleteResourceCategoryResponse deleteResourceCategory(DeleteResourceCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceCategoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the check results for data protection rules.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves the check results for data protection rules.</p>
     * 
     * @param request DescribeCheckDetailsRequest
     * @return DescribeCheckDetailsResponse
     */
    public DescribeCheckDetailsResponse describeCheckDetails(DescribeCheckDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeCheckDetailsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries statistics on data redundancy types for a cloud service.</p>
     * 
     * @param tmpReq DescribeProductDataRedundancyTypeStatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProductDataRedundancyTypeStatResponse
     */
    public DescribeProductDataRedundancyTypeStatResponse describeProductDataRedundancyTypeStatWithOptions(DescribeProductDataRedundancyTypeStatRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeProductDataRedundancyTypeStatShrinkRequest request = new DescribeProductDataRedundancyTypeStatShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceOwnerIds)) {
            request.resourceOwnerIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceOwnerIds, "ResourceOwnerIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceCategoryId)) {
            query.put("ResourceCategoryId", request.resourceCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerIdsShrink)) {
            query.put("ResourceOwnerIds", request.resourceOwnerIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProductDataRedundancyTypeStat"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/products/data-redundancy-type-stat"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProductDataRedundancyTypeStatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries statistics on data redundancy types for a cloud service.</p>
     * 
     * @param request DescribeProductDataRedundancyTypeStatRequest
     * @return DescribeProductDataRedundancyTypeStatResponse
     */
    public DescribeProductDataRedundancyTypeStatResponse describeProductDataRedundancyTypeStat(DescribeProductDataRedundancyTypeStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeProductDataRedundancyTypeStatWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data protection score status for cloud products.</p>
     * 
     * @param tmpReq DescribeProductsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProductsResponse
     */
    public DescribeProductsResponse describeProductsWithOptions(DescribeProductsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeProductsShrinkRequest request = new DescribeProductsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceOwnerIds)) {
            request.resourceOwnerIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceOwnerIds, "ResourceOwnerIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceCategoryId)) {
            query.put("ResourceCategoryId", request.resourceCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerIdsShrink)) {
            query.put("ResourceOwnerIds", request.resourceOwnerIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
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
     * <b>summary</b> : 
     * <p>Queries the data protection score status for cloud products.</p>
     * 
     * @param request DescribeProductsRequest
     * @return DescribeProductsResponse
     */
    public DescribeProductsResponse describeProducts(DescribeProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeProductsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query resources</p>
     * 
     * @param tmpReq DescribeResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourcesResponse
     */
    public DescribeResourcesResponse describeResourcesWithOptions(DescribeResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeResourcesShrinkRequest request = new DescribeResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceOwnerIds)) {
            request.resourceOwnerIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceOwnerIds, "ResourceOwnerIds", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceArn)) {
            query.put("ResourceArn", request.resourceArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceCategoryId)) {
            query.put("ResourceCategoryId", request.resourceCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerIdsShrink)) {
            query.put("ResourceOwnerIds", request.resourceOwnerIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
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
     * <b>summary</b> : 
     * <p>Query resources</p>
     * 
     * @param request DescribeResourcesRequest
     * @return DescribeResourcesResponse
     */
    public DescribeResourcesResponse describeResources(DescribeResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists all data protection rules.</p>
     * 
     * @param tmpReq DescribeRulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRulesResponse
     */
    public DescribeRulesResponse describeRulesWithOptions(DescribeRulesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeRulesShrinkRequest request = new DescribeRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceOwnerIds)) {
            request.resourceOwnerIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceOwnerIds, "ResourceOwnerIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceCategoryId)) {
            query.put("ResourceCategoryId", request.resourceCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerIdsShrink)) {
            query.put("ResourceOwnerIds", request.resourceOwnerIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
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
     * <b>summary</b> : 
     * <p>Lists all data protection rules.</p>
     * 
     * @param request DescribeRulesRequest
     * @return DescribeRulesResponse
     */
    public DescribeRulesResponse describeRules(DescribeRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRulesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an asynchronous task.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves the details of an asynchronous task.</p>
     * @return DescribeTaskResponse
     */
    public DescribeTaskResponse describeTask(String TaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTaskWithOptions(TaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves asynchronous tasks.</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
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
     * <b>summary</b> : 
     * <p>Retrieves asynchronous tasks.</p>
     * 
     * @param request DescribeTasksRequest
     * @return DescribeTasksResponse
     */
    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTasksWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the most threatened resources.</p>
     * 
     * @param tmpReq DescribeTopRiskyResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTopRiskyResourcesResponse
     */
    public DescribeTopRiskyResourcesResponse describeTopRiskyResourcesWithOptions(DescribeTopRiskyResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeTopRiskyResourcesShrinkRequest request = new DescribeTopRiskyResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceOwnerIds)) {
            request.resourceOwnerIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceOwnerIds, "ResourceOwnerIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceCategoryId)) {
            query.put("ResourceCategoryId", request.resourceCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerIdsShrink)) {
            query.put("ResourceOwnerIds", request.resourceOwnerIdsShrink);
        }

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
     * <b>summary</b> : 
     * <p>Lists the most threatened resources.</p>
     * 
     * @param request DescribeTopRiskyResourcesRequest
     * @return DescribeTopRiskyResourcesResponse
     */
    public DescribeTopRiskyResourcesResponse describeTopRiskyResources(DescribeTopRiskyResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTopRiskyResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the data protection score for a cloud product.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Disables the data protection score for a cloud product.</p>
     * 
     * @param request DisableCheckProductRequest
     * @return DisableCheckProductResponse
     */
    public DisableCheckProductResponse disableCheckProduct(DisableCheckProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableCheckProductWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the data protection score for a resource.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Disables the data protection score for a resource.</p>
     * 
     * @param request DisableCheckResourceRequest
     * @return DisableCheckResourceResponse
     */
    public DisableCheckResourceResponse disableCheckResource(DisableCheckResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableCheckResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables data protection scoring for a cloud product.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Enables data protection scoring for a cloud product.</p>
     * 
     * @param request EnableCheckProductRequest
     * @return EnableCheckProductResponse
     */
    public EnableCheckProductResponse enableCheckProduct(EnableCheckProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableCheckProductWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables data protection scoring for a single resource.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Enables data protection scoring for a single resource.</p>
     * 
     * @param request EnableCheckResourceRequest
     * @return EnableCheckResourceResponse
     */
    public EnableCheckResourceResponse enableCheckResource(EnableCheckResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableCheckResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the Backup and Disaster Recovery Center.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the status of the Backup and Disaster Recovery Center.</p>
     * @return GetBdrcServiceResponse
     */
    public GetBdrcServiceResponse getBdrcService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBdrcServiceWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a single message.</p>
     * 
     * @param request GetMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMessageResponse
     */
    public GetMessageResponse getMessageWithOptions(String MessageId, GetMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMessage"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/messages/" + com.aliyun.openapiutil.Client.getEncodeParam(MessageId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a single message.</p>
     * 
     * @param request GetMessageRequest
     * @return GetMessageResponse
     */
    public GetMessageResponse getMessage(String MessageId, GetMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMessageWithOptions(MessageId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a protection policy.</p>
     * 
     * @param request GetProtectionPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProtectionPolicyResponse
     */
    public GetProtectionPolicyResponse getProtectionPolicyWithOptions(String ProtectionPolicyId, GetProtectionPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProtectionPolicy"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/protection-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(ProtectionPolicyId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProtectionPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a protection policy.</p>
     * 
     * @param request GetProtectionPolicyRequest
     * @return GetProtectionPolicyResponse
     */
    public GetProtectionPolicyResponse getProtectionPolicy(String ProtectionPolicyId, GetProtectionPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProtectionPolicyWithOptions(ProtectionPolicyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a single resource category.</p>
     * 
     * @param request GetResourceCategoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceCategoryResponse
     */
    public GetResourceCategoryResponse getResourceCategoryWithOptions(GetResourceCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceCategoryId)) {
            query.put("ResourceCategoryId", request.resourceCategoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceCategory"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resource-categories/get"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a single resource category.</p>
     * 
     * @param request GetResourceCategoryRequest
     * @return GetResourceCategoryResponse
     */
    public GetResourceCategoryResponse getResourceCategory(GetResourceCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceCategoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries messages in batches.</p>
     * 
     * @param request ListMessagesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMessagesResponse
     */
    public ListMessagesResponse listMessagesWithOptions(ListMessagesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageLevel)) {
            query.put("MessageLevel", request.messageLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageTimeEarlierThan)) {
            query.put("MessageTimeEarlierThan", request.messageTimeEarlierThan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageTimeLaterThan)) {
            query.put("MessageTimeLaterThan", request.messageTimeLaterThan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            query.put("MessageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMessages"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/messages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMessagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries messages in batches.</p>
     * 
     * @param request ListMessagesRequest
     * @return ListMessagesResponse
     */
    public ListMessagesResponse listMessages(ListMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMessagesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of protection policies.</p>
     * 
     * @param request ListProtectionPoliciesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProtectionPoliciesResponse
     */
    public ListProtectionPoliciesResponse listProtectionPoliciesWithOptions(ListProtectionPoliciesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionPolicyId)) {
            query.put("ProtectionPolicyId", request.protectionPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionPolicyRegionId)) {
            query.put("ProtectionPolicyRegionId", request.protectionPolicyRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProtectionPolicies"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/protection-policies"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProtectionPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of protection policies.</p>
     * 
     * @param request ListProtectionPoliciesRequest
     * @return ListProtectionPoliciesResponse
     */
    public ListProtectionPoliciesResponse listProtectionPolicies(ListProtectionPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProtectionPoliciesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the application history of the protection policy.</p>
     * 
     * @param request ListProtectionPolicyApplicationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProtectionPolicyApplicationsResponse
     */
    public ListProtectionPolicyApplicationsResponse listProtectionPolicyApplicationsWithOptions(String ProtectionPolicyId, ListProtectionPolicyApplicationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyStatus)) {
            query.put("ApplyStatus", request.applyStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subProtectionPolicyType)) {
            query.put("SubProtectionPolicyType", request.subProtectionPolicyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProtectionPolicyApplications"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/protection-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(ProtectionPolicyId) + "/list-applications"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProtectionPolicyApplicationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the application history of the protection policy.</p>
     * 
     * @param request ListProtectionPolicyApplicationsRequest
     * @return ListProtectionPolicyApplicationsResponse
     */
    public ListProtectionPolicyApplicationsResponse listProtectionPolicyApplications(String ProtectionPolicyId, ListProtectionPolicyApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProtectionPolicyApplicationsWithOptions(ProtectionPolicyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of resource categories.</p>
     * 
     * @param request ListResourceCategoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceCategoriesResponse
     */
    public ListResourceCategoriesResponse listResourceCategoriesWithOptions(ListResourceCategoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceCategoryId)) {
            query.put("ResourceCategoryId", request.resourceCategoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceCategories"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resource-categories/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceCategoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of resource categories.</p>
     * 
     * @param request ListResourceCategoriesRequest
     * @return ListResourceCategoriesResponse
     */
    public ListResourceCategoriesResponse listResourceCategories(ListResourceCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceCategoriesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the Backup and Disaster Recovery Center.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Enables the Backup and Disaster Recovery Center.</p>
     * @return OpenBdrcServiceResponse
     */
    public OpenBdrcServiceResponse openBdrcService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openBdrcServiceWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a protection policy.</p>
     * 
     * @param tmpReq UpdateProtectionPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProtectionPolicyResponse
     */
    public UpdateProtectionPolicyResponse updateProtectionPolicyWithOptions(String ProtectionPolicyId, UpdateProtectionPolicyRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateProtectionPolicyShrinkRequest request = new UpdateProtectionPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.boundResourceCategoryIds)) {
            request.boundResourceCategoryIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.boundResourceCategoryIds, "BoundResourceCategoryIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subProtectionPolicies)) {
            request.subProtectionPoliciesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subProtectionPolicies, "SubProtectionPolicies", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.boundResourceCategoryIdsShrink)) {
            body.put("BoundResourceCategoryIds", request.boundResourceCategoryIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionPolicyName)) {
            body.put("ProtectionPolicyName", request.protectionPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subProtectionPoliciesShrink)) {
            body.put("SubProtectionPolicies", request.subProtectionPoliciesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProtectionPolicy"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/protection-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(ProtectionPolicyId) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProtectionPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a protection policy.</p>
     * 
     * @param request UpdateProtectionPolicyRequest
     * @return UpdateProtectionPolicyResponse
     */
    public UpdateProtectionPolicyResponse updateProtectionPolicy(String ProtectionPolicyId, UpdateProtectionPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProtectionPolicyWithOptions(ProtectionPolicyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a resource category.</p>
     * 
     * @param request UpdateResourceCategoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceCategoryResponse
     */
    public UpdateResourceCategoryResponse updateResourceCategoryWithOptions(UpdateResourceCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceCategoryId)) {
            body.put("ResourceCategoryId", request.resourceCategoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceCategoryName)) {
            body.put("ResourceCategoryName", request.resourceCategoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceMatcher)) {
            body.put("ResourceMatcher", request.resourceMatcher);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceCategory"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resource-categories/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a resource category.</p>
     * 
     * @param request UpdateResourceCategoryRequest
     * @return UpdateResourceCategoryResponse
     */
    public UpdateResourceCategoryResponse updateResourceCategory(UpdateResourceCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceCategoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the resource list. When you call this operation, an asynchronous task is triggered to update your resource list and data protection score.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Updates the resource list. When you call this operation, an asynchronous task is triggered to update your resource list and data protection score.</p>
     * 
     * @param request UpdateResourcesRequest
     * @return UpdateResourcesResponse
     */
    public UpdateResourcesResponse updateResources(UpdateResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourcesWithOptions(request, headers, runtime);
    }
}
