// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111;

import com.aliyun.tea.*;
import com.aliyun.iqs20241111.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-zhangjiakou", "iqs.cn-zhangjiakou.aliyuncs.com")
        );
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
     * <b>description</b> :
     * <p>Provides streaming results in two stages, common_search and post_retrieval, for on-demand use.
     * General search results (common_search): The raw search results. Covers key fields such as web page title, dynamic summary, body text, source website, and publication time. Post-retrieval processing (post_retrieval): Uses a rerank model to rerank and filter the common_search results from the previous stage. The mAP metric for context relevancy improves by approximately 5%, with an additional latency of approximately 110 ms.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the method to invoke the multi-stage streaming API V3 for general search by using the Alibaba Cloud OpenAPI SDK, including parameter descriptions.</p>
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
     * <b>description</b> :
     * <p>Provides streaming results in two stages, common_search and post_retrieval, for on-demand use.
     * General search results (common_search): The raw search results. Covers key fields such as web page title, dynamic summary, body text, source website, and publication time. Post-retrieval processing (post_retrieval): Uses a rerank model to rerank and filter the common_search results from the previous stage. The mAP metric for context relevancy improves by approximately 5%, with an additional latency of approximately 110 ms.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the method to invoke the multi-stage streaming API V3 for general search by using the Alibaba Cloud OpenAPI SDK, including parameter descriptions.</p>
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
     * <b>description</b> :
     * <p>自然语言搜索通用接口</p>
     * 
     * <b>summary</b> : 
     * <p>自然语言通用查询</p>
     * 
     * @param request CommonQueryBySceneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CommonQueryBySceneResponse
     */
    public CommonQueryBySceneResponse commonQueryBySceneWithOptions(CommonQueryBySceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommonQueryByScene"),
            new TeaPair("version", "2024-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/amap-function-call-agent/iqs-agent-service/v2/nl/common"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommonQueryBySceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>自然语言搜索通用接口</p>
     * 
     * <b>summary</b> : 
     * <p>自然语言通用查询</p>
     * 
     * @param request CommonQueryBySceneRequest
     * @return CommonQueryBySceneResponse
     */
    public CommonQueryBySceneResponse commonQueryByScene(CommonQueryBySceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.commonQueryBySceneWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>GenericAdvancedSearch is currently in the testing phase. New specifications will be available for purchase in the future.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes how to invoke the enhanced search operation (GenericAdvancedSearch) by using the Alibaba Cloud OpenAPI SDK, including the method and metric description. Compared with GenericSearch, GenericAdvancedSearch provides better recall of authoritative websites, with a maximum recall count of 40, delivering improved authoritativeness and data diversity. The response parameters and format of the enhanced operation are consistent with those of GenericAdvancedSearch.</p>
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
     * <b>description</b> :
     * <p>GenericAdvancedSearch is currently in the testing phase. New specifications will be available for purchase in the future.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes how to invoke the enhanced search operation (GenericAdvancedSearch) by using the Alibaba Cloud OpenAPI SDK, including the method and metric description. Compared with GenericSearch, GenericAdvancedSearch provides better recall of authoritative websites, with a maximum recall count of 40, delivering improved authoritativeness and data diversity. The response parameters and format of the enhanced operation are consistent with those of GenericAdvancedSearch.</p>
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
     * <p>Performs a general-purpose search.</p>
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
     * <p>Performs a general-purpose search.</p>
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
     * <p>Query daily usage by dimension for the Information Query Service API</p>
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
     * <p>Query daily usage by dimension for the Information Query Service API</p>
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
     * <b>description</b> :
     * <p>This document describes the usage and parameter specifications of GlobalSearch, the global edition of IQS Search.</p>
     * 
     * <b>summary</b> : 
     * <p>IQS Search - Global Edition (Global Information Search)</p>
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
     * <b>description</b> :
     * <p>This document describes the usage and parameter specifications of GlobalSearch, the global edition of IQS Search.</p>
     * 
     * <b>summary</b> : 
     * <p>IQS Search - Global Edition (Global Information Search)</p>
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
     * <p>Medical Q&amp;A</p>
     * 
     * @param request MedicalAnswerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MedicalAnswerResponse
     */
    public MedicalAnswerResponse medicalAnswerWithOptions(MedicalAnswerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MedicalAnswer"),
            new TeaPair("version", "2024-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-entry/v1/iqs/domain/medical/answer"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MedicalAnswerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Medical Q&amp;A</p>
     * 
     * @param request MedicalAnswerRequest
     * @return MedicalAnswerResponse
     */
    public MedicalAnswerResponse medicalAnswer(MedicalAnswerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.medicalAnswerWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Health Graph</p>
     * 
     * @param request MedicalKnowledgeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MedicalKnowledgeResponse
     */
    public MedicalKnowledgeResponse medicalKnowledgeWithOptions(MedicalKnowledgeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MedicalKnowledge"),
            new TeaPair("version", "2024-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-entry/v1/iqs/domain/medical/know"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MedicalKnowledgeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Health Graph</p>
     * 
     * @param request MedicalKnowledgeRequest
     * @return MedicalKnowledgeResponse
     */
    public MedicalKnowledgeResponse medicalKnowledge(MedicalKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.medicalKnowledgeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Multimodal search</p>
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
     * <p>Multimodal search</p>
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
     * <p>This topic describes the intelligent search Q&amp;A streaming API (SearchStream). Based on retrieval-augmented generation (RAG) and large language model technologies, this API accepts natural language questions from users and automatically performs intent recognition, query rewrite, multi-source retrieval, and content generation. The API returns data using the Server-Sent Events (SSE) streaming protocol, supporting real-time output of inference status, reference sources, and token-by-token generated answers. It is suitable for AI chat and search scenarios that require low latency and high interpretability.</p>
     * 
     * @param request OmniAnswerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OmniAnswerResponse
     */
    public OmniAnswerResponse omniAnswerWithOptions(OmniAnswerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OmniAnswer"),
            new TeaPair("version", "2024-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-entry/v1/iqs/answer/omni/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OmniAnswerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This topic describes the intelligent search Q&amp;A streaming API (SearchStream). Based on retrieval-augmented generation (RAG) and large language model technologies, this API accepts natural language questions from users and automatically performs intent recognition, query rewrite, multi-source retrieval, and content generation. The API returns data using the Server-Sent Events (SSE) streaming protocol, supporting real-time output of inference status, reference sources, and token-by-token generated answers. It is suitable for AI chat and search scenarios that require low latency and high interpretability.</p>
     * 
     * @param request OmniAnswerRequest
     * @return OmniAnswerResponse
     */
    public OmniAnswerResponse omniAnswer(OmniAnswerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.omniAnswerWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>When the HTTP status code (httpcode) of the target address is less than 500, it is counted as one valid request.  </li>
     * <li>If the content type (Content-Type) in the response header of the target address is application/pdf, the system automatically triggers PDF parsing (PDF file size must not exceed 20 MB). This operation is counted as an additional valid request.  </li>
     * <li>Trial terms: During the trial period, the API is limited to 5 queries per second (QPS); the trial quota is 1,000 requests per 30 days.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Quickly retrieve HTML and parse static web page content.</p>
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
     * <b>description</b> :
     * <ol>
     * <li>When the HTTP status code (httpcode) of the target address is less than 500, it is counted as one valid request.  </li>
     * <li>If the content type (Content-Type) in the response header of the target address is application/pdf, the system automatically triggers PDF parsing (PDF file size must not exceed 20 MB). This operation is counted as an additional valid request.  </li>
     * <li>Trial terms: During the trial period, the API is limited to 5 queries per second (QPS); the trial quota is 1,000 requests per 30 days.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Quickly retrieve HTML and parse static web page content.</p>
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
     * <b>description</b> :
     * <ol>
     * <li>A request is counted as valid when the HTTP status code (httpcode) of the target URL is less than 500.  </li>
     * <li>If the content type (Content-Type) in the response header of the target URL is application/pdf, the system automatically triggers PDF parsing (PDF files up to 20 MB are supported). This operation is counted as an additional valid request.  </li>
     * <li>Trial terms: During the trial period, the API is limited to 5 queries per second (QPS); the trial quota is 1,000 requests per 30 days.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <ol>
     * <li>Read HTML and parse web page content through the browser sandbox environment.  </li>
     * <li>The API starts parsing after all resources on the target page are fully loaded (the maximum waiting duration can be adjusted via the pageTimeout parameter). The overall Duration of the API call is significantly affected by the resource loading performance of the target site.</li>
     * </ol>
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
     * <b>description</b> :
     * <ol>
     * <li>A request is counted as valid when the HTTP status code (httpcode) of the target URL is less than 500.  </li>
     * <li>If the content type (Content-Type) in the response header of the target URL is application/pdf, the system automatically triggers PDF parsing (PDF files up to 20 MB are supported). This operation is counted as an additional valid request.  </li>
     * <li>Trial terms: During the trial period, the API is limited to 5 queries per second (QPS); the trial quota is 1,000 requests per 30 days.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <ol>
     * <li>Read HTML and parse web page content through the browser sandbox environment.  </li>
     * <li>The API starts parsing after all resources on the target page are fully loaded (the maximum waiting duration can be adjusted via the pageTimeout parameter). The overall Duration of the API call is significantly affected by the resource loading performance of the target site.</li>
     * </ol>
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
     * <p>扫描文件</p>
     * 
     * @param request ScanFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScanFileResponse
     */
    public ScanFileResponse scanFileWithOptions(ScanFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScanFile"),
            new TeaPair("version", "2024-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-entry/v1/iqs/domain/scan/file"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>扫描文件</p>
     * 
     * @param request ScanFileRequest
     * @return ScanFileResponse
     */
    public ScanFileResponse scanFile(ScanFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scanFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Provides access to the Tongxiao unified search API, enabling quick and easy integration of web-wide general search capabilities.</p>
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
     * <p>Provides access to the Tongxiao unified search API, enabling quick and easy integration of web-wide general search capabilities.</p>
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
