// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111;

import com.aliyun.tea.*;
import com.aliyun.iqs20241111.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("iqs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>AI搜索流式接口(废弃)</p>
     * 
     * @param request AiSearchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AiSearchResponse
     */
    public AiSearchResponse aiSearchWithOptions(AiSearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("timeRange", request.timeRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AiSearch"),
            new TeaPair("version", "2024-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-entry/v3/linkedRetrieval/commands/aiSearch"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AiSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>AI搜索流式接口(废弃)</p>
     * 
     * @param request AiSearchRequest
     * @return AiSearchResponse
     */
    public AiSearchResponse aiSearch(AiSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aiSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>增强版通用搜索</p>
     * 
     * @param request GenericAdvancedSearchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenericAdvancedSearchResponse
     */
    public GenericAdvancedSearchResponse genericAdvancedSearchWithOptions(GenericAdvancedSearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("timeRange", request.timeRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenericAdvancedSearch"),
            new TeaPair("version", "2024-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-entry/v2/linkedRetrieval/commands/genericAdvancedSearch"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenericAdvancedSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>增强版通用搜索</p>
     * 
     * @param request GenericAdvancedSearchRequest
     * @return GenericAdvancedSearchResponse
     */
    public GenericAdvancedSearchResponse genericAdvancedSearch(GenericAdvancedSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.genericAdvancedSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通用搜索</p>
     * 
     * @param tmpReq GenericSearchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenericSearchResponse
     */
    public GenericSearchResponse genericSearchWithOptions(GenericSearchRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GenericSearchShrinkRequest request = new GenericSearchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.advancedParams)) {
            request.advancedParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.advancedParams, "advancedParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advancedParamsShrink)) {
            query.put("advancedParams", request.advancedParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRerank)) {
            query.put("enableRerank", request.enableRerank);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnMainText)) {
            query.put("returnMainText", request.returnMainText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnMarkdownText)) {
            query.put("returnMarkdownText", request.returnMarkdownText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnRichMainBody)) {
            query.put("returnRichMainBody", request.returnRichMainBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnSummary)) {
            query.put("returnSummary", request.returnSummary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("timeRange", request.timeRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenericSearch"),
            new TeaPair("version", "2024-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-entry/v2/linkedRetrieval/commands/genericSearch"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenericSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通用搜索</p>
     * 
     * @param request GenericSearchRequest
     * @return GenericSearchResponse
     */
    public GenericSearchResponse genericSearch(GenericSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.genericSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>信息查询服务接口日维度使用量查询</p>
     * 
     * @param request GetIqsUsageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIqsUsageResponse
     */
    public GetIqsUsageResponse getIqsUsageWithOptions(GetIqsUsageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callerId)) {
            query.put("callerId", request.callerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("endDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("startDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIqsUsage"),
            new TeaPair("version", "2024-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-admin/v1/iqs/usage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIqsUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>信息查询服务接口日维度使用量查询</p>
     * 
     * @param request GetIqsUsageRequest
     * @return GetIqsUsageResponse
     */
    public GetIqsUsageResponse getIqsUsage(GetIqsUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIqsUsageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通晓搜索-出海版(全球信息搜索)</p>
     * 
     * @param request GlobalSearchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GlobalSearchResponse
     */
    public GlobalSearchResponse globalSearchWithOptions(GlobalSearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("timeRange", request.timeRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GlobalSearch"),
            new TeaPair("version", "2024-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-entry/v1/iqs/search/global"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通晓搜索-出海版(全球信息搜索)</p>
     * 
     * @param request GlobalSearchRequest
     * @return GlobalSearchResponse
     */
    public GlobalSearchResponse globalSearch(GlobalSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.globalSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>多模态搜索</p>
     * 
     * @param request MultimodalSearchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MultimodalSearchResponse
     */
    public MultimodalSearchResponse multimodalSearchWithOptions(MultimodalSearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MultimodalSearch"),
            new TeaPair("version", "2024-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-entry/v1/iqs/multimodal/unified"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MultimodalSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>多模态搜索</p>
     * 
     * @param request MultimodalSearchRequest
     * @return MultimodalSearchResponse
     */
    public MultimodalSearchResponse multimodalSearch(MultimodalSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.multimodalSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>页面读取</p>
     * 
     * @param request ReadPageBasicRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadPageBasicResponse
     */
    public ReadPageBasicResponse readPageBasicWithOptions(ReadPageBasicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadPageBasic"),
            new TeaPair("version", "2024-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-entry/v1/iqs/readpage/basic"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadPageBasicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>页面读取</p>
     * 
     * @param request ReadPageBasicRequest
     * @return ReadPageBasicResponse
     */
    public ReadPageBasicResponse readPageBasic(ReadPageBasicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.readPageBasicWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>动态页面解析</p>
     * 
     * @param request ReadPageScrapeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadPageScrapeResponse
     */
    public ReadPageScrapeResponse readPageScrapeWithOptions(ReadPageScrapeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadPageScrape"),
            new TeaPair("version", "2024-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-entry/v1/iqs/readpage/scrape"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadPageScrapeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>动态页面解析</p>
     * 
     * @param request ReadPageScrapeRequest
     * @return ReadPageScrapeResponse
     */
    public ReadPageScrapeResponse readPageScrape(ReadPageScrapeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.readPageScrapeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通晓统一搜索API</p>
     * 
     * @param request UnifiedSearchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnifiedSearchResponse
     */
    public UnifiedSearchResponse unifiedSearchWithOptions(UnifiedSearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnifiedSearch"),
            new TeaPair("version", "2024-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-entry/v1/iqs/search/unified"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnifiedSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通晓统一搜索API</p>
     * 
     * @param request UnifiedSearchRequest
     * @return UnifiedSearchResponse
     */
    public UnifiedSearchResponse unifiedSearch(UnifiedSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unifiedSearchWithOptions(request, headers, runtime);
    }
}
