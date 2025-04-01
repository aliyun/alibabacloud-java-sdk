// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120;

import com.aliyun.tea.*;
import com.aliyun.advisor20180120.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("advisor", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>根据多个维度获取用户最新的巡检结果，全量返回-openApi</p>
     * 
     * @param request DescribeAdvicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdvicesResponse
     */
    public DescribeAdvicesResponse describeAdvicesWithOptions(DescribeAdvicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adviceId)) {
            query.put("AdviceId", request.adviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkId)) {
            query.put("CheckId", request.checkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkPlanId)) {
            query.put("CheckPlanId", request.checkPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeAdviceId)) {
            query.put("ExcludeAdviceId", request.excludeAdviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdvices"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdvicesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeAdvicesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据多个维度获取用户最新的巡检结果，全量返回-openApi</p>
     * 
     * @param request DescribeAdvicesRequest
     * @return DescribeAdvicesResponse
     */
    public DescribeAdvicesResponse describeAdvices(DescribeAdvicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdvicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeAdvicesFlat分页</p>
     * 
     * @param request DescribeAdvicesFlatPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdvicesFlatPageResponse
     */
    public DescribeAdvicesFlatPageResponse describeAdvicesFlatPageWithOptions(DescribeAdvicesFlatPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adviceId)) {
            query.put("AdviceId", request.adviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkId)) {
            query.put("CheckId", request.checkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdvicesFlatPage"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdvicesFlatPageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeAdvicesFlatPageResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>DescribeAdvicesFlat分页</p>
     * 
     * @param request DescribeAdvicesFlatPageRequest
     * @return DescribeAdvicesFlatPageResponse
     */
    public DescribeAdvicesFlatPageResponse describeAdvicesFlatPage(DescribeAdvicesFlatPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdvicesFlatPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeAdvices分页</p>
     * 
     * @param request DescribeAdvicesPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdvicesPageResponse
     */
    public DescribeAdvicesPageResponse describeAdvicesPageWithOptions(DescribeAdvicesPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adviceId)) {
            query.put("AdviceId", request.adviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkId)) {
            query.put("CheckId", request.checkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkPlanId)) {
            query.put("CheckPlanId", request.checkPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdvicesPage"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdvicesPageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeAdvicesPageResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>DescribeAdvices分页</p>
     * 
     * @param request DescribeAdvicesPageRequest
     * @return DescribeAdvicesPageResponse
     */
    public DescribeAdvicesPageResponse describeAdvicesPage(DescribeAdvicesPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdvicesPageWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAdvisorChecksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdvisorChecksResponse
     */
    public DescribeAdvisorChecksResponse describeAdvisorChecksWithOptions(DescribeAdvisorChecksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdvisorChecks"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdvisorChecksResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeAdvisorChecksResponse());
        }

    }

    /**
     * @param request DescribeAdvisorChecksRequest
     * @return DescribeAdvisorChecksResponse
     */
    public DescribeAdvisorChecksResponse describeAdvisorChecks(DescribeAdvisorChecksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdvisorChecksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>巡检项设置-分页</p>
     * 
     * @param tmpReq DescribeAdvisorChecksFoPagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdvisorChecksFoPagesResponse
     */
    public DescribeAdvisorChecksFoPagesResponse describeAdvisorChecksFoPagesWithOptions(DescribeAdvisorChecksFoPagesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeAdvisorChecksFoPagesShrinkRequest request = new DescribeAdvisorChecksFoPagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.checkTypes)) {
            request.checkTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.checkTypes, "CheckTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assumeAliyunId)) {
            query.put("AssumeAliyunId", request.assumeAliyunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCategory)) {
            query.put("BizCategory", request.bizCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkTypesShrink)) {
            query.put("CheckTypes", request.checkTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdvisorChecksFoPages"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdvisorChecksFoPagesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeAdvisorChecksFoPagesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>巡检项设置-分页</p>
     * 
     * @param request DescribeAdvisorChecksFoPagesRequest
     * @return DescribeAdvisorChecksFoPagesResponse
     */
    public DescribeAdvisorChecksFoPagesResponse describeAdvisorChecksFoPages(DescribeAdvisorChecksFoPagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdvisorChecksFoPagesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAdvisorResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdvisorResourcesResponse
     */
    public DescribeAdvisorResourcesResponse describeAdvisorResourcesWithOptions(DescribeAdvisorResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdvisorResources"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdvisorResourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeAdvisorResourcesResponse());
        }

    }

    /**
     * @param request DescribeAdvisorResourcesRequest
     * @return DescribeAdvisorResourcesResponse
     */
    public DescribeAdvisorResourcesResponse describeAdvisorResources(DescribeAdvisorResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdvisorResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询成本优化结果详情</p>
     * 
     * @param tmpReq DescribeCostCheckAdvicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCostCheckAdvicesResponse
     */
    public DescribeCostCheckAdvicesResponse describeCostCheckAdvicesWithOptions(DescribeCostCheckAdvicesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeCostCheckAdvicesShrinkRequest request = new DescribeCostCheckAdvicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assumeAliyunIdList)) {
            request.assumeAliyunIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assumeAliyunIdList, "AssumeAliyunIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regionIds)) {
            request.regionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regionIds, "RegionIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIds)) {
            request.resourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIds, "ResourceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagKeys)) {
            request.tagKeysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagKeys, "TagKeys", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagList)) {
            request.tagListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagList, "TagList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagValues)) {
            request.tagValuesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagValues, "TagValues", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assumeAliyunIdListShrink)) {
            query.put("AssumeAliyunIdList", request.assumeAliyunIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkId)) {
            query.put("CheckId", request.checkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsShrink)) {
            query.put("RegionIds", request.regionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsShrink)) {
            query.put("ResourceIds", request.resourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.severity)) {
            query.put("Severity", request.severity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeysShrink)) {
            query.put("TagKeys", request.tagKeysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagListShrink)) {
            query.put("TagList", request.tagListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagValuesShrink)) {
            query.put("TagValues", request.tagValuesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCostCheckAdvices"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCostCheckAdvicesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCostCheckAdvicesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询成本优化结果详情</p>
     * 
     * @param request DescribeCostCheckAdvicesRequest
     * @return DescribeCostCheckAdvicesResponse
     */
    public DescribeCostCheckAdvicesResponse describeCostCheckAdvices(DescribeCostCheckAdvicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCostCheckAdvicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询巡检项聚合成本优化结果概览</p>
     * 
     * @param tmpReq DescribeCostCheckResultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCostCheckResultsResponse
     */
    public DescribeCostCheckResultsResponse describeCostCheckResultsWithOptions(DescribeCostCheckResultsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeCostCheckResultsShrinkRequest request = new DescribeCostCheckResultsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assumeAliyunIdList)) {
            request.assumeAliyunIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assumeAliyunIdList, "AssumeAliyunIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.checkIds)) {
            request.checkIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.checkIds, "CheckIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regionIds)) {
            request.regionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regionIds, "RegionIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceGroupIdList)) {
            request.resourceGroupIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceGroupIdList, "ResourceGroupIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIds)) {
            request.resourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIds, "ResourceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagKeys)) {
            request.tagKeysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagKeys, "TagKeys", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagList)) {
            request.tagListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagList, "TagList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagValues)) {
            request.tagValuesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagValues, "TagValues", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assumeAliyunIdListShrink)) {
            query.put("AssumeAliyunIdList", request.assumeAliyunIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkIdsShrink)) {
            query.put("CheckIds", request.checkIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("GroupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsShrink)) {
            query.put("RegionIds", request.regionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdListShrink)) {
            query.put("ResourceGroupIdList", request.resourceGroupIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsShrink)) {
            query.put("ResourceIds", request.resourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.severity)) {
            query.put("Severity", request.severity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeysShrink)) {
            query.put("TagKeys", request.tagKeysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagListShrink)) {
            query.put("TagList", request.tagListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagValuesShrink)) {
            query.put("TagValues", request.tagValuesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCostCheckResults"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCostCheckResultsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCostCheckResultsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询巡检项聚合成本优化结果概览</p>
     * 
     * @param request DescribeCostCheckResultsRequest
     * @return DescribeCostCheckResultsResponse
     */
    public DescribeCostCheckResultsResponse describeCostCheckResults(DescribeCostCheckResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCostCheckResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>成本优化-概览</p>
     * 
     * @param tmpReq DescribeCostOptimizationOverviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCostOptimizationOverviewResponse
     */
    public DescribeCostOptimizationOverviewResponse describeCostOptimizationOverviewWithOptions(DescribeCostOptimizationOverviewRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeCostOptimizationOverviewShrinkRequest request = new DescribeCostOptimizationOverviewShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assumeAliyunIdList)) {
            request.assumeAliyunIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assumeAliyunIdList, "AssumeAliyunIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assumeAliyunId)) {
            query.put("AssumeAliyunId", request.assumeAliyunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assumeAliyunIdListShrink)) {
            query.put("AssumeAliyunIdList", request.assumeAliyunIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCostOptimizationOverview"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCostOptimizationOverviewResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCostOptimizationOverviewResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>成本优化-概览</p>
     * 
     * @param request DescribeCostOptimizationOverviewRequest
     * @return DescribeCostOptimizationOverviewResponse
     */
    public DescribeCostOptimizationOverviewResponse describeCostOptimizationOverview(DescribeCostOptimizationOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCostOptimizationOverviewWithOptions(request, runtime);
    }

    /**
     * @param request GetHistoryAdvicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHistoryAdvicesResponse
     */
    public GetHistoryAdvicesResponse getHistoryAdvicesWithOptions(GetHistoryAdvicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            query.put("Reverse", request.reverse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.severity)) {
            query.put("Severity", request.severity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHistoryAdvices"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetHistoryAdvicesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetHistoryAdvicesResponse());
        }

    }

    /**
     * @param request GetHistoryAdvicesRequest
     * @return GetHistoryAdvicesResponse
     */
    public GetHistoryAdvicesResponse getHistoryAdvices(GetHistoryAdvicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHistoryAdvicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务执行进度(普通用户、RD单账号)</p>
     * 
     * @param request GetInspectProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInspectProgressResponse
     */
    public GetInspectProgressResponse getInspectProgressWithOptions(GetInspectProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assumeAliyunId)) {
            query.put("AssumeAliyunId", request.assumeAliyunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInspectProgress"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetInspectProgressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetInspectProgressResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取任务执行进度(普通用户、RD单账号)</p>
     * 
     * @param request GetInspectProgressRequest
     * @return GetInspectProgressResponse
     */
    public GetInspectProgressResponse getInspectProgress(GetInspectProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInspectProgressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取云产品的列表</p>
     * 
     * @param request GetProductListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProductListResponse
     */
    public GetProductListResponse getProductListWithOptions(GetProductListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProductList"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetProductListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetProductListResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取云产品的列表</p>
     * 
     * @param request GetProductListRequest
     * @return GetProductListResponse
     */
    public GetProductListResponse getProductList(GetProductListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProductListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据id获取任务状态</p>
     * 
     * @param request GetTaskStatusByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskStatusByIdResponse
     */
    public GetTaskStatusByIdResponse getTaskStatusByIdWithOptions(GetTaskStatusByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskStatusById"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskStatusByIdResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetTaskStatusByIdResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据id获取任务状态</p>
     * 
     * @param request GetTaskStatusByIdRequest
     * @return GetTaskStatusByIdResponse
     */
    public GetTaskStatusByIdResponse getTaskStatusById(GetTaskStatusByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskStatusByIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>触发立即巡检</p>
     * 
     * @param tmpReq RefreshAdvisorCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshAdvisorCheckResponse
     */
    public RefreshAdvisorCheckResponse refreshAdvisorCheckWithOptions(RefreshAdvisorCheckRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RefreshAdvisorCheckShrinkRequest request = new RefreshAdvisorCheckShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceDimensionList)) {
            request.resourceDimensionListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceDimensionList, "ResourceDimensionList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assumeAliyunId)) {
            query.put("AssumeAliyunId", request.assumeAliyunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkId)) {
            query.put("CheckId", request.checkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkPlanId)) {
            query.put("CheckPlanId", request.checkPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceDimensionListShrink)) {
            body.put("ResourceDimensionList", request.resourceDimensionListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshAdvisorCheck"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshAdvisorCheckResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RefreshAdvisorCheckResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>触发立即巡检</p>
     * 
     * @param request RefreshAdvisorCheckRequest
     * @return RefreshAdvisorCheckResponse
     */
    public RefreshAdvisorCheckResponse refreshAdvisorCheck(RefreshAdvisorCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshAdvisorCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发起成本优化巡检</p>
     * 
     * @param tmpReq RefreshAdvisorCostCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshAdvisorCostCheckResponse
     */
    public RefreshAdvisorCostCheckResponse refreshAdvisorCostCheckWithOptions(RefreshAdvisorCostCheckRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RefreshAdvisorCostCheckShrinkRequest request = new RefreshAdvisorCostCheckShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assumeAliyunIdList)) {
            request.assumeAliyunIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assumeAliyunIdList, "AssumeAliyunIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.checkIds)) {
            request.checkIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.checkIds, "CheckIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIds)) {
            request.resourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIds, "ResourceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assumeAliyunIdListShrink)) {
            query.put("AssumeAliyunIdList", request.assumeAliyunIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkIdsShrink)) {
            query.put("CheckIds", request.checkIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshResource)) {
            query.put("RefreshResource", request.refreshResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsShrink)) {
            query.put("ResourceIds", request.resourceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshAdvisorCostCheck"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshAdvisorCostCheckResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RefreshAdvisorCostCheckResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>发起成本优化巡检</p>
     * 
     * @param request RefreshAdvisorCostCheckRequest
     * @return RefreshAdvisorCostCheckResponse
     */
    public RefreshAdvisorCostCheckResponse refreshAdvisorCostCheck(RefreshAdvisorCostCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshAdvisorCostCheckWithOptions(request, runtime);
    }

    /**
     * @param request RefreshAdvisorResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshAdvisorResourceResponse
     */
    public RefreshAdvisorResourceResponse refreshAdvisorResourceWithOptions(RefreshAdvisorResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshAdvisorResource"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshAdvisorResourceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RefreshAdvisorResourceResponse());
        }

    }

    /**
     * @param request RefreshAdvisorResourceRequest
     * @return RefreshAdvisorResourceResponse
     */
    public RefreshAdvisorResourceResponse refreshAdvisorResource(RefreshAdvisorResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshAdvisorResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上报用户业务报警信息</p>
     * 
     * @param tmpReq ReportBizAlertInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReportBizAlertInfoResponse
     */
    public ReportBizAlertInfoResponse reportBizAlertInfoWithOptions(ReportBizAlertInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReportBizAlertInfoShrinkRequest request = new ReportBizAlertInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alertUid)) {
            request.alertUidShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alertUid, "AlertUid", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertDescription)) {
            query.put("AlertDescription", request.alertDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertDetail)) {
            query.put("AlertDetail", request.alertDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertGrade)) {
            query.put("AlertGrade", request.alertGrade);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertLabels)) {
            query.put("AlertLabels", request.alertLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertScene)) {
            query.put("AlertScene", request.alertScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertToken)) {
            query.put("AlertToken", request.alertToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertUidShrink)) {
            query.put("AlertUid", request.alertUidShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportBizAlertInfo"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ReportBizAlertInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ReportBizAlertInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>上报用户业务报警信息</p>
     * 
     * @param request ReportBizAlertInfoRequest
     * @return ReportBizAlertInfoResponse
     */
    public ReportBizAlertInfoResponse reportBizAlertInfo(ReportBizAlertInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportBizAlertInfoWithOptions(request, runtime);
    }
}
