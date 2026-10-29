// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201;

import com.aliyun.tea.*;
import com.aliyun.httpdns20160201.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "httpdns-api.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("httpdns", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Adds a domain name based on the specified parameters.</p>
     * 
     * @param request AddDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDomainResponse
     */
    public AddDomainResponse addDomainWithOptions(AddDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDomain"),
            new TeaPair("version", "2016-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a domain name based on the specified parameters.</p>
     * 
     * @param request AddDomainRequest
     * @return AddDomainResponse
     */
    public AddDomainResponse addDomain(AddDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom resolution policy for a domain name connected to the current account. This operation supports the LINE mode and the IP_RANGE mode. IP address ranges can include IPv4 and IPv6 addresses. When a match occurs, A or AAAA records are returned based on the rules. By default, the policy is created in the disabled state. If Enable is set to true, the policy is enabled upon creation, but actual resolution still requires waiting for configuration propagation. The returned Id is used for subsequent queries, updates, enabling, disabling, and deletion. Create a disabled policy first, and then enable it after querying and verifying it. The policy type and the bound domain name cannot be modified after creation. If the response times out or is lost, query the list first to verify and avoid duplicate creation.</p>
     * 
     * @param tmpReq CreateSdnsRuleCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSdnsRuleCategoryResponse
     */
    public CreateSdnsRuleCategoryResponse createSdnsRuleCategoryWithOptions(CreateSdnsRuleCategoryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSdnsRuleCategoryShrinkRequest request = new CreateSdnsRuleCategoryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clientIpRanges)) {
            request.clientIpRangesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clientIpRanges, "ClientIpRanges", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.paths)) {
            request.pathsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.paths, "Paths", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rules)) {
            request.rulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rules, "Rules", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIpRangesShrink)) {
            body.put("ClientIpRanges", request.clientIpRangesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lineId)) {
            body.put("LineId", request.lineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchType)) {
            body.put("MatchType", request.matchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pathsShrink)) {
            body.put("Paths", request.pathsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesShrink)) {
            body.put("Rules", request.rulesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSdnsRuleCategory"),
            new TeaPair("version", "2016-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSdnsRuleCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom resolution policy for a domain name connected to the current account. This operation supports the LINE mode and the IP_RANGE mode. IP address ranges can include IPv4 and IPv6 addresses. When a match occurs, A or AAAA records are returned based on the rules. By default, the policy is created in the disabled state. If Enable is set to true, the policy is enabled upon creation, but actual resolution still requires waiting for configuration propagation. The returned Id is used for subsequent queries, updates, enabling, disabling, and deletion. Create a disabled policy first, and then enable it after querying and verifying it. The policy type and the bound domain name cannot be modified after creation. If the response times out or is lost, query the list first to verify and avoid duplicate creation.</p>
     * 
     * @param request CreateSdnsRuleCategoryRequest
     * @return CreateSdnsRuleCategoryResponse
     */
    public CreateSdnsRuleCategoryResponse createSdnsRuleCategory(CreateSdnsRuleCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSdnsRuleCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a domain name based on the specified parameters.</p>
     * 
     * @param request DeleteDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomain"),
            new TeaPair("version", "2016-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a domain name based on the specified parameters.</p>
     * 
     * @param request DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the domain names of a user based on the specified parameters.</p>
     * 
     * @param request DescribeDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainsResponse
     */
    public DescribeDomainsResponse describeDomainsWithOptions(DescribeDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomains"),
            new TeaPair("version", "2016-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the domain names of a user based on the specified parameters.</p>
     * 
     * @param request DescribeDomainsRequest
     * @return DescribeDomainsResponse
     */
    public DescribeDomainsResponse describeDomains(DescribeDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the current HTTPDNS account information.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccountInfoResponse
     */
    public GetAccountInfoResponse getAccountInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccountInfo"),
            new TeaPair("version", "2016-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the current HTTPDNS account information.</p>
     * @return GetAccountInfoResponse
     */
    public GetAccountInfoResponse getAccountInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves parse and billing statistics, corresponding to the &quot;Billing&quot; page feature in the console.</p>
     * 
     * @param request GetResolveCountSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResolveCountSummaryResponse
     */
    public GetResolveCountSummaryResponse getResolveCountSummaryWithOptions(GetResolveCountSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("Granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeSpan)) {
            query.put("TimeSpan", request.timeSpan);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResolveCountSummary"),
            new TeaPair("version", "2016-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResolveCountSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves parse and billing statistics, corresponding to the &quot;Billing&quot; page feature in the console.</p>
     * 
     * @param request GetResolveCountSummaryRequest
     * @return GetResolveCountSummaryResponse
     */
    public GetResolveCountSummaryResponse getResolveCountSummary(GetResolveCountSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResolveCountSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the statistics information of parse requests for a specific domain name.</p>
     * 
     * @param request GetResolveStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResolveStatisticsResponse
     */
    public GetResolveStatisticsResponse getResolveStatisticsWithOptions(GetResolveStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("Granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolName)) {
            query.put("ProtocolName", request.protocolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeSpan)) {
            query.put("TimeSpan", request.timeSpan);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResolveStatistics"),
            new TeaPair("version", "2016-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResolveStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the statistics information of parse requests for a specific domain name.</p>
     * 
     * @param request GetResolveStatisticsRequest
     * @return GetResolveStatisticsResponse
     */
    public GetResolveStatisticsResponse getResolveStatistics(GetResolveStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResolveStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Operation description</h1>
     * <ul>
     * <li>You can specify the page number (PageNumber) and the number of entries per page (PageSize) for the query.</li>
     * <li>By default, the domain name list is sorted in descending order of the time when the domain names were added.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the domain names and resolution counts of a user based on the specified parameters.</p>
     * 
     * @param request ListDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomainsWithOptions(ListDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withoutMeteringData)) {
            query.put("WithoutMeteringData", request.withoutMeteringData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDomains"),
            new TeaPair("version", "2016-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDomainsResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Operation description</h1>
     * <ul>
     * <li>You can specify the page number (PageNumber) and the number of entries per page (PageSize) for the query.</li>
     * <li>By default, the domain name list is sorted in descending order of the time when the domain names were added.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the domain names and resolution counts of a user based on the specified parameters.</p>
     * 
     * @param request ListDomainsRequest
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomains(ListDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Refreshes the domain name cache.</p>
     * 
     * @param tmpReq RefreshResolveCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshResolveCacheResponse
     */
    public RefreshResolveCacheResponse refreshResolveCacheWithOptions(RefreshResolveCacheRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RefreshResolveCacheShrinkRequest request = new RefreshResolveCacheShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.domains)) {
            request.domainsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.domains, "Domains", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainsShrink)) {
            query.put("Domains", request.domainsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshResolveCache"),
            new TeaPair("version", "2016-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshResolveCacheResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Refreshes the domain name cache.</p>
     * 
     * @param request RefreshResolveCacheRequest
     * @return RefreshResolveCacheResponse
     */
    public RefreshResolveCacheResponse refreshResolveCache(RefreshResolveCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshResolveCacheWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom resolution policy of the current account by policy ID. A deleted policy cannot be recovered by using its original ID, and a new ID is generated when the policy is recreated. Disable the policy and verify the resolution results before deletion. After an address block policy is deleted, its scope is excluded from overlap checks with other policies. Actual resolution takes effect after configuration propagation. You can call SdnsListRuleCategories to verify the deletion.</p>
     * 
     * @param request SdnsDeleteRuleCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SdnsDeleteRuleCategoryResponse
     */
    public SdnsDeleteRuleCategoryResponse sdnsDeleteRuleCategoryWithOptions(SdnsDeleteRuleCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SdnsDeleteRuleCategory"),
            new TeaPair("version", "2016-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SdnsDeleteRuleCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom resolution policy of the current account by policy ID. A deleted policy cannot be recovered by using its original ID, and a new ID is generated when the policy is recreated. Disable the policy and verify the resolution results before deletion. After an address block policy is deleted, its scope is excluded from overlap checks with other policies. Actual resolution takes effect after configuration propagation. You can call SdnsListRuleCategories to verify the deletion.</p>
     * 
     * @param request SdnsDeleteRuleCategoryRequest
     * @return SdnsDeleteRuleCategoryResponse
     */
    public SdnsDeleteRuleCategoryResponse sdnsDeleteRuleCategory(SdnsDeleteRuleCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sdnsDeleteRuleCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据ID获取规则策略</p>
     * 
     * @param request SdnsGetRuleCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SdnsGetRuleCategoryResponse
     */
    public SdnsGetRuleCategoryResponse sdnsGetRuleCategoryWithOptions(SdnsGetRuleCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SdnsGetRuleCategory"),
            new TeaPair("version", "2016-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SdnsGetRuleCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据ID获取规则策略</p>
     * 
     * @param request SdnsGetRuleCategoryRequest
     * @return SdnsGetRuleCategoryResponse
     */
    public SdnsGetRuleCategoryResponse sdnsGetRuleCategory(SdnsGetRuleCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sdnsGetRuleCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the custom resolution policies for a specified domain name under the current account, including line policies, client CIDR block policies, and policies in enabled or disabled states. The returned IDs can be used to query details, update, enable, disable, or delete policies. This operation does not provide pagination parameters and does not guarantee the order of returned results. CIDR blocks are returned in the original input format.</p>
     * 
     * @param request SdnsListRuleCategoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SdnsListRuleCategoriesResponse
     */
    public SdnsListRuleCategoriesResponse sdnsListRuleCategoriesWithOptions(SdnsListRuleCategoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SdnsListRuleCategories"),
            new TeaPair("version", "2016-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SdnsListRuleCategoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the custom resolution policies for a specified domain name under the current account, including line policies, client CIDR block policies, and policies in enabled or disabled states. The returned IDs can be used to query details, update, enable, disable, or delete policies. This operation does not provide pagination parameters and does not guarantee the order of returned results. CIDR blocks are returned in the original input format.</p>
     * 
     * @param request SdnsListRuleCategoriesRequest
     * @return SdnsListRuleCategoriesResponse
     */
    public SdnsListRuleCategoriesResponse sdnsListRuleCategories(SdnsListRuleCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sdnsListRuleCategoriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用、禁用规则策略</p>
     * 
     * @param request SdnsSwitchRuleCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SdnsSwitchRuleCategoryResponse
     */
    public SdnsSwitchRuleCategoryResponse sdnsSwitchRuleCategoryWithOptions(SdnsSwitchRuleCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SdnsSwitchRuleCategory"),
            new TeaPair("version", "2016-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SdnsSwitchRuleCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启用、禁用规则策略</p>
     * 
     * @param request SdnsSwitchRuleCategoryRequest
     * @return SdnsSwitchRuleCategoryResponse
     */
    public SdnsSwitchRuleCategoryResponse sdnsSwitchRuleCategory(SdnsSwitchRuleCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sdnsSwitchRuleCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Validates the submitted rules without saving or enabling any policies. In IP_RANGE mode, the Cip parameter is used to simulate a client IPv4 or IPv6 address. The system checks for CIDR block matches first and then returns the matched rules. If no custom parameters are used, pass an empty JSON object {} for the top-level Args parameter. If no rules are matched, the Data field is empty or omitted. A successful API call does not indicate a policy match. This operation does not check for CIDR block conflicts with existing policies, perform A/AAAA query type filtering or weight sampling, or simulate the complete resolution chain such as legacy CIDR block configurations, line fallback, or Function Compute. After saving and enabling the policies, verify them by using the actual resolution API.</p>
     * 
     * @param tmpReq SdnsVerifyRuleCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SdnsVerifyRuleCategoryResponse
     */
    public SdnsVerifyRuleCategoryResponse sdnsVerifyRuleCategoryWithOptions(SdnsVerifyRuleCategoryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SdnsVerifyRuleCategoryShrinkRequest request = new SdnsVerifyRuleCategoryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.args)) {
            request.argsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.args, "Args", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clientIpRanges)) {
            request.clientIpRangesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clientIpRanges, "ClientIpRanges", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rules)) {
            request.rulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rules, "Rules", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.argsShrink)) {
            body.put("Args", request.argsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cip)) {
            body.put("Cip", request.cip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIpRangesShrink)) {
            body.put("ClientIpRanges", request.clientIpRangesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchType)) {
            body.put("MatchType", request.matchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesShrink)) {
            body.put("Rules", request.rulesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SdnsVerifyRuleCategory"),
            new TeaPair("version", "2016-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SdnsVerifyRuleCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Validates the submitted rules without saving or enabling any policies. In IP_RANGE mode, the Cip parameter is used to simulate a client IPv4 or IPv6 address. The system checks for CIDR block matches first and then returns the matched rules. If no custom parameters are used, pass an empty JSON object {} for the top-level Args parameter. If no rules are matched, the Data field is empty or omitted. A successful API call does not indicate a policy match. This operation does not check for CIDR block conflicts with existing policies, perform A/AAAA query type filtering or weight sampling, or simulate the complete resolution chain such as legacy CIDR block configurations, line fallback, or Function Compute. After saving and enabling the policies, verify them by using the actual resolution API.</p>
     * 
     * @param request SdnsVerifyRuleCategoryRequest
     * @return SdnsVerifyRuleCategoryResponse
     */
    public SdnsVerifyRuleCategoryResponse sdnsVerifyRuleCategory(SdnsVerifyRuleCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sdnsVerifyRuleCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the complete rule list of an existing policy for the current account. For IP_RANGE policies, the client IP address ranges can be replaced as a whole at the same time. If ClientIpRanges is omitted, the original IP address ranges are retained. Explicitly passing an empty array is not allowed. The update does not change the bound domain names, match types, or enabled status of the policy. The new ranges are checked for conflicts only with other IP address range policies under the same domain name. If the validation fails, the update is not saved. After a successful update, you can call SdnsGetRuleCategory to verify the configuration. Actual DNS resolution requires waiting for configuration propagation.</p>
     * 
     * @param tmpReq UpdateSdnsRuleCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSdnsRuleCategoryResponse
     */
    public UpdateSdnsRuleCategoryResponse updateSdnsRuleCategoryWithOptions(UpdateSdnsRuleCategoryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSdnsRuleCategoryShrinkRequest request = new UpdateSdnsRuleCategoryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rules)) {
            request.rulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rules, "Rules", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIpRanges)) {
            body.put("ClientIpRanges", request.clientIpRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesShrink)) {
            body.put("Rules", request.rulesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSdnsRuleCategory"),
            new TeaPair("version", "2016-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSdnsRuleCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the complete rule list of an existing policy for the current account. For IP_RANGE policies, the client IP address ranges can be replaced as a whole at the same time. If ClientIpRanges is omitted, the original IP address ranges are retained. Explicitly passing an empty array is not allowed. The update does not change the bound domain names, match types, or enabled status of the policy. The new ranges are checked for conflicts only with other IP address range policies under the same domain name. If the validation fails, the update is not saved. After a successful update, you can call SdnsGetRuleCategory to verify the configuration. Actual DNS resolution requires waiting for configuration propagation.</p>
     * 
     * @param request UpdateSdnsRuleCategoryRequest
     * @return UpdateSdnsRuleCategoryResponse
     */
    public UpdateSdnsRuleCategoryResponse updateSdnsRuleCategory(UpdateSdnsRuleCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSdnsRuleCategoryWithOptions(request, runtime);
    }
}
