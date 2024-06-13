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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdvicesResponse());
    }

    /**
     * @param request DescribeAdvicesRequest
     * @return DescribeAdvicesResponse
     */
    public DescribeAdvicesResponse describeAdvices(DescribeAdvicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdvicesWithOptions(request, runtime);
    }

    /**
     * @summary DescribeAdvicesFlat分页
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdvicesFlatPageResponse());
    }

    /**
     * @summary DescribeAdvicesFlat分页
     *
     * @param request DescribeAdvicesFlatPageRequest
     * @return DescribeAdvicesFlatPageResponse
     */
    public DescribeAdvicesFlatPageResponse describeAdvicesFlatPage(DescribeAdvicesFlatPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdvicesFlatPageWithOptions(request, runtime);
    }

    /**
     * @summary DescribeAdvices分页
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdvicesPageResponse());
    }

    /**
     * @summary DescribeAdvices分页
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdvisorChecksResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdvisorResourcesResponse());
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
     * @summary 查询成本优化结果详情
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCostCheckAdvicesResponse());
    }

    /**
     * @summary 查询成本优化结果详情
     *
     * @param request DescribeCostCheckAdvicesRequest
     * @return DescribeCostCheckAdvicesResponse
     */
    public DescribeCostCheckAdvicesResponse describeCostCheckAdvices(DescribeCostCheckAdvicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCostCheckAdvicesWithOptions(request, runtime);
    }

    /**
     * @summary 查询巡检项聚合成本优化结果概览
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIds)) {
            request.resourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIds, "ResourceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagKeys)) {
            request.tagKeysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagKeys, "TagKeys", "json");
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCostCheckResultsResponse());
    }

    /**
     * @summary 查询巡检项聚合成本优化结果概览
     *
     * @param request DescribeCostCheckResultsRequest
     * @return DescribeCostCheckResultsResponse
     */
    public DescribeCostCheckResultsResponse describeCostCheckResults(DescribeCostCheckResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCostCheckResultsWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHistoryAdvicesResponse());
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
     * @summary 根据id获取任务状态
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskStatusByIdResponse());
    }

    /**
     * @summary 根据id获取任务状态
     *
     * @param request GetTaskStatusByIdRequest
     * @return GetTaskStatusByIdResponse
     */
    public GetTaskStatusByIdResponse getTaskStatusById(GetTaskStatusByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskStatusByIdWithOptions(request, runtime);
    }

    /**
     * @param request RefreshAdvisorCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshAdvisorCheckResponse
     */
    public RefreshAdvisorCheckResponse refreshAdvisorCheckWithOptions(RefreshAdvisorCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkId)) {
            query.put("CheckId", request.checkId);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshAdvisorCheckResponse());
    }

    /**
     * @param request RefreshAdvisorCheckRequest
     * @return RefreshAdvisorCheckResponse
     */
    public RefreshAdvisorCheckResponse refreshAdvisorCheck(RefreshAdvisorCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshAdvisorCheckWithOptions(request, runtime);
    }

    /**
     * @summary 发起成本优化巡检
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshAdvisorCostCheckResponse());
    }

    /**
     * @summary 发起成本优化巡检
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshAdvisorResourceResponse());
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
     * @summary 上报用户业务报警信息
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportBizAlertInfoResponse());
    }

    /**
     * @summary 上报用户业务报警信息
     *
     * @param request ReportBizAlertInfoRequest
     * @return ReportBizAlertInfoResponse
     */
    public ReportBizAlertInfoResponse reportBizAlertInfo(ReportBizAlertInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportBizAlertInfoWithOptions(request, runtime);
    }
}
