// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentexplorer20260317;

import com.aliyun.tea.*;
import com.aliyun.agentexplorer20260317.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("public", "agentexplorer.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "agentexplorer.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("agentexplorer", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Get the SKILL.md file content of the specified Agent Skill</p>
     * 
     * @param request GetSkillContentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillContentResponse
     */
    public GetSkillContentResponse getSkillContentWithOptions(String skillName, GetSkillContentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillContent"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/skills/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get the SKILL.md file content of the specified Agent Skill</p>
     * 
     * @param request GetSkillContentRequest
     * @return GetSkillContentResponse
     */
    public GetSkillContentResponse getSkillContent(String skillName, GetSkillContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSkillContentWithOptions(skillName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List all Alibaba Cloud Skills categories.</p>
     * 
     * @param request ListCategoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCategoriesResponse
     */
    public ListCategoriesResponse listCategoriesWithOptions(ListCategoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCategories"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/categories"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCategoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List all Alibaba Cloud Skills categories.</p>
     * 
     * @param request ListCategoriesRequest
     * @return ListCategoriesResponse
     */
    public ListCategoriesResponse listCategories(ListCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCategoriesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for Alibaba Cloud Agent Skills by keyword or category.</p>
     * 
     * @param request SearchSkillsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchSkillsResponse
     */
    public SearchSkillsResponse searchSkillsWithOptions(SearchSkillsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryCode)) {
            query.put("categoryCode", request.categoryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("searchMode", request.searchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            query.put("skip", request.skip);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchSkills"),
            new TeaPair("version", "2026-03-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/skills"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchSkillsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for Alibaba Cloud Agent Skills by keyword or category.</p>
     * 
     * @param request SearchSkillsRequest
     * @return SearchSkillsResponse
     */
    public SearchSkillsResponse searchSkills(SearchSkillsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchSkillsWithOptions(request, headers, runtime);
    }
}
