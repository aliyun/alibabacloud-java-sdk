// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611;

import com.aliyun.tea.*;
import com.aliyun.aicontent20240611.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "aicontent.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "aicontent.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "aicontent.aliyuncs.com"),
            new TeaPair("public", "aicontent.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aicontent", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Generate Q&amp;A pairs to expand data.</p>
     * 
     * @param request AITeacherExpansionPracticeTaskGenerateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AITeacherExpansionPracticeTaskGenerateResponse
     */
    public AITeacherExpansionPracticeTaskGenerateResponse aITeacherExpansionPracticeTaskGenerateWithOptions(AITeacherExpansionPracticeTaskGenerateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.grade)) {
            body.put("grade", request.grade);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keySentences)) {
            body.put("keySentences", request.keySentences);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWords)) {
            body.put("keyWords", request.keyWords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.learningObject)) {
            body.put("learningObject", request.learningObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textContent)) {
            body.put("textContent", request.textContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textbook)) {
            body.put("textbook", request.textbook);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            body.put("topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AITeacherExpansionPracticeTaskGenerate"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiteacher/expansionPractice/generateTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AITeacherExpansionPracticeTaskGenerateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generate Q&amp;A pairs to expand data.</p>
     * 
     * @param request AITeacherExpansionPracticeTaskGenerateRequest
     * @return AITeacherExpansionPracticeTaskGenerateResponse
     */
    public AITeacherExpansionPracticeTaskGenerateResponse aITeacherExpansionPracticeTaskGenerate(AITeacherExpansionPracticeTaskGenerateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aITeacherExpansionPracticeTaskGenerateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronous basic practice is primarily for dialogue tasks with a ground truth. Although this mode allows some deviation from the ground truth, the AI strictly requires users to follow it.</p>
     * 
     * @param request AITeacherSyncPracticeTaskGenerateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AITeacherSyncPracticeTaskGenerateResponse
     */
    public AITeacherSyncPracticeTaskGenerateResponse aITeacherSyncPracticeTaskGenerateWithOptions(AITeacherSyncPracticeTaskGenerateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.grade)) {
            body.put("grade", request.grade);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keySentences)) {
            body.put("keySentences", request.keySentences);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWords)) {
            body.put("keyWords", request.keyWords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.learningObject)) {
            body.put("learningObject", request.learningObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textContent)) {
            body.put("textContent", request.textContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textbook)) {
            body.put("textbook", request.textbook);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            body.put("topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AITeacherSyncPracticeTaskGenerate"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiteacher/syncPractice/generateTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AITeacherSyncPracticeTaskGenerateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronous basic practice is primarily for dialogue tasks with a ground truth. Although this mode allows some deviation from the ground truth, the AI strictly requires users to follow it.</p>
     * 
     * @param request AITeacherSyncPracticeTaskGenerateRequest
     * @return AITeacherSyncPracticeTaskGenerateResponse
     */
    public AITeacherSyncPracticeTaskGenerateResponse aITeacherSyncPracticeTaskGenerate(AITeacherSyncPracticeTaskGenerateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aITeacherSyncPracticeTaskGenerateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the services available on the Alibaba Cloud Console.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse
     */
    public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse aliyunConsoleOpenApiQueryAliyunConsoleServcieListWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AliyunConsoleOpenApiQueryAliyunConsoleServcieList"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aliyunconsole/queryAliyunConsoleServcieList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the services available on the Alibaba Cloud Console.</p>
     * @return AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse
     */
    public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse aliyunConsoleOpenApiQueryAliyunConsoleServcieList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aliyunConsoleOpenApiQueryAliyunConsoleServcieListWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the services available in the Alibaba Cloud console.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse
     */
    public AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse aliyunConsoleOpenApiQueryAliyunConsoleServiceListWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AliyunConsoleOpenApiQueryAliyunConsoleServiceList"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aliyunConsole/queryAliyunConsoleServiceList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the services available in the Alibaba Cloud console.</p>
     * @return AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse
     */
    public AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse aliyunConsoleOpenApiQueryAliyunConsoleServiceList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aliyunConsoleOpenApiQueryAliyunConsoleServiceListWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud Management Console / List purchased resources</p>
     * 
     * @param request AliyunConsoleOpenApiQueryPaidResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AliyunConsoleOpenApiQueryPaidResourceResponse
     */
    public AliyunConsoleOpenApiQueryPaidResourceResponse aliyunConsoleOpenApiQueryPaidResourceWithOptions(AliyunConsoleOpenApiQueryPaidResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("groupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTotalCount)) {
            query.put("needTotalCount", request.needTotalCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AliyunConsoleOpenApiQueryPaidResource"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aliyunConsole/queryPaidResource"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AliyunConsoleOpenApiQueryPaidResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud Management Console / List purchased resources</p>
     * 
     * @param request AliyunConsoleOpenApiQueryPaidResourceRequest
     * @return AliyunConsoleOpenApiQueryPaidResourceResponse
     */
    public AliyunConsoleOpenApiQueryPaidResourceResponse aliyunConsoleOpenApiQueryPaidResource(AliyunConsoleOpenApiQueryPaidResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aliyunConsoleOpenApiQueryPaidResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Intelligent Correction / Oral Evaluation / Statistics / call volume</p>
     * 
     * @param request CountOralEvaluationStatisticsCallsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CountOralEvaluationStatisticsCallsResponse
     */
    public CountOralEvaluationStatisticsCallsResponse countOralEvaluationStatisticsCallsWithOptions(CountOralEvaluationStatisticsCallsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CountOralEvaluationStatisticsCalls"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aliyunConsole/countOralEvaluationStatisticsCalls"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CountOralEvaluationStatisticsCallsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Intelligent Correction / Oral Evaluation / Statistics / call volume</p>
     * 
     * @param request CountOralEvaluationStatisticsCallsRequest
     * @return CountOralEvaluationStatisticsCallsResponse
     */
    public CountOralEvaluationStatisticsCallsResponse countOralEvaluationStatisticsCalls(CountOralEvaluationStatisticsCallsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countOralEvaluationStatisticsCallsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Intelligent grading / oral evaluation / statistics / concurrency</p>
     * 
     * @param request CountOralEvaluationStatisticsConcurrentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CountOralEvaluationStatisticsConcurrentResponse
     */
    public CountOralEvaluationStatisticsConcurrentResponse countOralEvaluationStatisticsConcurrentWithOptions(CountOralEvaluationStatisticsConcurrentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CountOralEvaluationStatisticsConcurrent"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aliyunConsole/countOralEvaluationStatisticsConcurrent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CountOralEvaluationStatisticsConcurrentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Intelligent grading / oral evaluation / statistics / concurrency</p>
     * 
     * @param request CountOralEvaluationStatisticsConcurrentRequest
     * @return CountOralEvaluationStatisticsConcurrentResponse
     */
    public CountOralEvaluationStatisticsConcurrentResponse countOralEvaluationStatisticsConcurrent(CountOralEvaluationStatisticsConcurrentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countOralEvaluationStatisticsConcurrentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves statistics about API call errors for the oral evaluation service.</p>
     * 
     * @param request CountOralEvaluationStatisticsErrorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CountOralEvaluationStatisticsErrorResponse
     */
    public CountOralEvaluationStatisticsErrorResponse countOralEvaluationStatisticsErrorWithOptions(CountOralEvaluationStatisticsErrorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CountOralEvaluationStatisticsError"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aliyunConsole/countOralEvaluationStatisticsError"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CountOralEvaluationStatisticsErrorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves statistics about API call errors for the oral evaluation service.</p>
     * 
     * @param request CountOralEvaluationStatisticsErrorRequest
     * @return CountOralEvaluationStatisticsErrorResponse
     */
    public CountOralEvaluationStatisticsErrorResponse countOralEvaluationStatisticsError(CountOralEvaluationStatisticsErrorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countOralEvaluationStatisticsErrorWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access warrant.</p>
     * 
     * @param request CreateAccessWarrantRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessWarrantResponse
     */
    public CreateAccessWarrantResponse createAccessWarrantWithOptions(CreateAccessWarrantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestSign)) {
            body.put("requestSign", request.requestSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timestamp)) {
            body.put("timestamp", request.timestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            body.put("userClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warrantAvailable)) {
            body.put("warrantAvailable", request.warrantAvailable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessWarrant"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aliyunConsole/createAccessWarrant"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessWarrantResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access warrant.</p>
     * 
     * @param request CreateAccessWarrantRequest
     * @return CreateAccessWarrantResponse
     */
    public CreateAccessWarrantResponse createAccessWarrant(CreateAccessWarrantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAccessWarrantWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud console &gt; Create Project</p>
     * 
     * @param request CreateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("projectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectType)) {
            body.put("projectType", request.projectType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aliyunConsole/createProject"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud console &gt; Create Project</p>
     * 
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Executes a workflow for Chinese composition tutoring.</p>
     * 
     * @param request ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse
     */
    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse executeAITeacherChineseCompositionTutoringWorkflowRunWithOptions(ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.essayOutline)) {
            body.put("essayOutline", request.essayOutline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.essayRequirements)) {
            body.put("essayRequirements", request.essayRequirements);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.essayTopic)) {
            body.put("essayTopic", request.essayTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.essayType)) {
            body.put("essayType", request.essayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.essayWordCount)) {
            body.put("essayWordCount", request.essayWordCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grade)) {
            body.put("grade", request.grade);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseMode)) {
            body.put("responseMode", request.responseMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteAITeacherChineseCompositionTutoringWorkflowRun"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/api/v1/intelligentAgent/chineseCompositionTutoring/workflowRun"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Executes a workflow for Chinese composition tutoring.</p>
     * 
     * @param request ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest
     * @return ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse
     */
    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse executeAITeacherChineseCompositionTutoringWorkflowRun(ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeAITeacherChineseCompositionTutoringWorkflowRunWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>English Composition Tutoring</p>
     * 
     * @param request ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse
     */
    public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse executeAITeacherEnglishCompositionTutoringWorkflowRunWithOptions(ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.essayOutline)) {
            body.put("essayOutline", request.essayOutline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.essayRequirements)) {
            body.put("essayRequirements", request.essayRequirements);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.essayTopic)) {
            body.put("essayTopic", request.essayTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.essayType)) {
            body.put("essayType", request.essayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.essayWordCount)) {
            body.put("essayWordCount", request.essayWordCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grade)) {
            body.put("grade", request.grade);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseMode)) {
            body.put("responseMode", request.responseMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteAITeacherEnglishCompositionTutoringWorkflowRun"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/api/v1/intelligentAgent/englishCompositionTutoring/workflowRun"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>English Composition Tutoring</p>
     * 
     * @param request ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest
     * @return ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse
     */
    public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse executeAITeacherEnglishCompositionTutoringWorkflowRun(ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeAITeacherEnglishCompositionTutoringWorkflowRunWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Answers English-related questions.</p>
     * 
     * @param request ExecuteAITeacherEnglishParaphraseChatMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteAITeacherEnglishParaphraseChatMessageResponse
     */
    public ExecuteAITeacherEnglishParaphraseChatMessageResponse executeAITeacherEnglishParaphraseChatMessageWithOptions(ExecuteAITeacherEnglishParaphraseChatMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("chatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grade)) {
            body.put("grade", request.grade);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.questionId)) {
            body.put("questionId", request.questionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.questionInfo)) {
            body.put("questionInfo", request.questionInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseMode)) {
            body.put("responseMode", request.responseMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAnswer)) {
            body.put("userAnswer", request.userAnswer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteAITeacherEnglishParaphraseChatMessage"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/api/v1/intelligentAgent/englishParaphrase/chatMessage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteAITeacherEnglishParaphraseChatMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Answers English-related questions.</p>
     * 
     * @param request ExecuteAITeacherEnglishParaphraseChatMessageRequest
     * @return ExecuteAITeacherEnglishParaphraseChatMessageResponse
     */
    public ExecuteAITeacherEnglishParaphraseChatMessageResponse executeAITeacherEnglishParaphraseChatMessage(ExecuteAITeacherEnglishParaphraseChatMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeAITeacherEnglishParaphraseChatMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Expansion dialogues are for open-ended conversations. In these conversations, the AI poses open-ended questions, but the user must stay on topic. If a user\&quot;s response is off-topic, the AI steers the conversation back on topic. If the user gives two consecutive off-topic responses, the AI moves on to the next topic.</p>
     * 
     * @param request ExecuteAITeacherExpansionDialogueRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteAITeacherExpansionDialogueResponse
     */
    public ExecuteAITeacherExpansionDialogueResponse executeAITeacherExpansionDialogueWithOptions(ExecuteAITeacherExpansionDialogueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.background)) {
            body.put("background", request.background);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogueTasks)) {
            body.put("dialogueTasks", request.dialogueTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageCode)) {
            body.put("languageCode", request.languageCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.records)) {
            body.put("records", request.records);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleInfo)) {
            body.put("roleInfo", request.roleInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startSentence)) {
            body.put("startSentence", request.startSentence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            body.put("topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteAITeacherExpansionDialogue"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiteacher/expansionPractice/executeExpansionTraining"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteAITeacherExpansionDialogueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Expansion dialogues are for open-ended conversations. In these conversations, the AI poses open-ended questions, but the user must stay on topic. If a user\&quot;s response is off-topic, the AI steers the conversation back on topic. If the user gives two consecutive off-topic responses, the AI moves on to the next topic.</p>
     * 
     * @param request ExecuteAITeacherExpansionDialogueRequest
     * @return ExecuteAITeacherExpansionDialogueResponse
     */
    public ExecuteAITeacherExpansionDialogueResponse executeAITeacherExpansionDialogue(ExecuteAITeacherExpansionDialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeAITeacherExpansionDialogueWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uses context to polish the expanded text.</p>
     * 
     * @param request ExecuteAITeacherExpansionDialogueRefineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteAITeacherExpansionDialogueRefineResponse
     */
    public ExecuteAITeacherExpansionDialogueRefineResponse executeAITeacherExpansionDialogueRefineWithOptions(ExecuteAITeacherExpansionDialogueRefineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.background)) {
            body.put("background", request.background);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogueTasks)) {
            body.put("dialogueTasks", request.dialogueTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageCode)) {
            body.put("languageCode", request.languageCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.records)) {
            body.put("records", request.records);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleInfo)) {
            body.put("roleInfo", request.roleInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startSentence)) {
            body.put("startSentence", request.startSentence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            body.put("topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteAITeacherExpansionDialogueRefine"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiteacher/expansionPractice/refineByContext"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteAITeacherExpansionDialogueRefineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uses context to polish the expanded text.</p>
     * 
     * @param request ExecuteAITeacherExpansionDialogueRefineRequest
     * @return ExecuteAITeacherExpansionDialogueRefineResponse
     */
    public ExecuteAITeacherExpansionDialogueRefineResponse executeAITeacherExpansionDialogueRefine(ExecuteAITeacherExpansionDialogueRefineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeAITeacherExpansionDialogueRefineWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Further Contextual Translation Practice.</p>
     * 
     * @param request ExecuteAITeacherExpansionDialogueTranslateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteAITeacherExpansionDialogueTranslateResponse
     */
    public ExecuteAITeacherExpansionDialogueTranslateResponse executeAITeacherExpansionDialogueTranslateWithOptions(ExecuteAITeacherExpansionDialogueTranslateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.background)) {
            body.put("background", request.background);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogueTasks)) {
            body.put("dialogueTasks", request.dialogueTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.records)) {
            body.put("records", request.records);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleInfo)) {
            body.put("roleInfo", request.roleInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startSentence)) {
            body.put("startSentence", request.startSentence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            body.put("topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteAITeacherExpansionDialogueTranslate"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiteacher/expansionPractice/translate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteAITeacherExpansionDialogueTranslateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Further Contextual Translation Practice.</p>
     * 
     * @param request ExecuteAITeacherExpansionDialogueTranslateRequest
     * @return ExecuteAITeacherExpansionDialogueTranslateResponse
     */
    public ExecuteAITeacherExpansionDialogueTranslateResponse executeAITeacherExpansionDialogueTranslate(ExecuteAITeacherExpansionDialogueTranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeAITeacherExpansionDialogueTranslateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a grammar check.</p>
     * 
     * @param request ExecuteAITeacherGrammarCheckRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteAITeacherGrammarCheckResponse
     */
    public ExecuteAITeacherGrammarCheckResponse executeAITeacherGrammarCheckWithOptions(ExecuteAITeacherGrammarCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteAITeacherGrammarCheck"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiteacher/common/grammarChecking"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteAITeacherGrammarCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a grammar check.</p>
     * 
     * @param request ExecuteAITeacherGrammarCheckRequest
     * @return ExecuteAITeacherGrammarCheckResponse
     */
    public ExecuteAITeacherGrammarCheckResponse executeAITeacherGrammarCheck(ExecuteAITeacherGrammarCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeAITeacherGrammarCheckWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Practice synchronous dialogue.</p>
     * 
     * @param request ExecuteAITeacherSyncDialogueRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteAITeacherSyncDialogueResponse
     */
    public ExecuteAITeacherSyncDialogueResponse executeAITeacherSyncDialogueWithOptions(ExecuteAITeacherSyncDialogueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dialogueTasks)) {
            body.put("dialogueTasks", request.dialogueTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageCode)) {
            body.put("languageCode", request.languageCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.records)) {
            body.put("records", request.records);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteAITeacherSyncDialogue"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiteacher/syncPractice/executeSyncTraining"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteAITeacherSyncDialogueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Practice synchronous dialogue.</p>
     * 
     * @param request ExecuteAITeacherSyncDialogueRequest
     * @return ExecuteAITeacherSyncDialogueResponse
     */
    public ExecuteAITeacherSyncDialogueResponse executeAITeacherSyncDialogue(ExecuteAITeacherSyncDialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeAITeacherSyncDialogueWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can practice contextual translation in real-time.</p>
     * 
     * @param request ExecuteAITeacherSyncDialogueTranslateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteAITeacherSyncDialogueTranslateResponse
     */
    public ExecuteAITeacherSyncDialogueTranslateResponse executeAITeacherSyncDialogueTranslateWithOptions(ExecuteAITeacherSyncDialogueTranslateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dialogueTasks)) {
            body.put("dialogueTasks", request.dialogueTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.records)) {
            body.put("records", request.records);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteAITeacherSyncDialogueTranslate"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiteacher/syncPractice/translate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteAITeacherSyncDialogueTranslateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can practice contextual translation in real-time.</p>
     * 
     * @param request ExecuteAITeacherSyncDialogueTranslateRequest
     * @return ExecuteAITeacherSyncDialogueTranslateResponse
     */
    public ExecuteAITeacherSyncDialogueTranslateResponse executeAITeacherSyncDialogueTranslate(ExecuteAITeacherSyncDialogueTranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeAITeacherSyncDialogueTranslateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Executes a dialogue turn with the Textbook Assistant.</p>
     * 
     * @param request ExecuteTextbookAssistantDialogueRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTextbookAssistantDialogueResponse
     */
    public ExecuteTextbookAssistantDialogueResponse executeTextbookAssistantDialogueWithOptions(ExecuteTextbookAssistantDialogueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authToken)) {
            body.put("authToken", request.authToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("chatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("scenario", request.scenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMessage)) {
            body.put("userMessage", request.userMessage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTextbookAssistantDialogue"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/dialogue/ExecuteDialogue"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTextbookAssistantDialogueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Executes a dialogue turn with the Textbook Assistant.</p>
     * 
     * @param request ExecuteTextbookAssistantDialogueRequest
     * @return ExecuteTextbookAssistantDialogueResponse
     */
    public ExecuteTextbookAssistantDialogueResponse executeTextbookAssistantDialogue(ExecuteTextbookAssistantDialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeTextbookAssistantDialogueWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adjusts the difficulty of the textbook assistant\&quot;s dialogue.</p>
     * 
     * @param request ExecuteTextbookAssistantDifficultyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTextbookAssistantDifficultyResponse
     */
    public ExecuteTextbookAssistantDifficultyResponse executeTextbookAssistantDifficultyWithOptions(ExecuteTextbookAssistantDifficultyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assistant)) {
            body.put("assistant", request.assistant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authToken)) {
            body.put("authToken", request.authToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("chatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("scenario", request.scenario);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTextbookAssistantDifficulty"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/dialogue/ExecuteDifficulty"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTextbookAssistantDifficultyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adjusts the difficulty of the textbook assistant\&quot;s dialogue.</p>
     * 
     * @param request ExecuteTextbookAssistantDifficultyRequest
     * @return ExecuteTextbookAssistantDifficultyResponse
     */
    public ExecuteTextbookAssistantDifficultyResponse executeTextbookAssistantDifficulty(ExecuteTextbookAssistantDifficultyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeTextbookAssistantDifficultyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a grammar check.</p>
     * 
     * @param request ExecuteTextbookAssistantGrammarCheckRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTextbookAssistantGrammarCheckResponse
     */
    public ExecuteTextbookAssistantGrammarCheckResponse executeTextbookAssistantGrammarCheckWithOptions(ExecuteTextbookAssistantGrammarCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authToken)) {
            body.put("authToken", request.authToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("chatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("scenario", request.scenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            body.put("user", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTextbookAssistantGrammarCheck"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/dialogue/ExecuteGrammarCheck"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTextbookAssistantGrammarCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a grammar check.</p>
     * 
     * @param request ExecuteTextbookAssistantGrammarCheckRequest
     * @return ExecuteTextbookAssistantGrammarCheckResponse
     */
    public ExecuteTextbookAssistantGrammarCheckResponse executeTextbookAssistantGrammarCheck(ExecuteTextbookAssistantGrammarCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeTextbookAssistantGrammarCheckWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Refines a sentence based on the conversational context.</p>
     * 
     * @param request ExecuteTextbookAssistantRefineByContextRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTextbookAssistantRefineByContextResponse
     */
    public ExecuteTextbookAssistantRefineByContextResponse executeTextbookAssistantRefineByContextWithOptions(ExecuteTextbookAssistantRefineByContextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authToken)) {
            body.put("authToken", request.authToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("chatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("scenario", request.scenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            body.put("user", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTextbookAssistantRefineByContext"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/dialogue/RefineByContext"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTextbookAssistantRefineByContextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Refines a sentence based on the conversational context.</p>
     * 
     * @param request ExecuteTextbookAssistantRefineByContextRequest
     * @return ExecuteTextbookAssistantRefineByContextResponse
     */
    public ExecuteTextbookAssistantRefineByContextResponse executeTextbookAssistantRefineByContext(ExecuteTextbookAssistantRefineByContextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeTextbookAssistantRefineByContextWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation retries a conversation.</p>
     * 
     * @param request ExecuteTextbookAssistantRetryConversationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTextbookAssistantRetryConversationResponse
     */
    public ExecuteTextbookAssistantRetryConversationResponse executeTextbookAssistantRetryConversationWithOptions(ExecuteTextbookAssistantRetryConversationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assistant)) {
            body.put("assistant", request.assistant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authToken)) {
            body.put("authToken", request.authToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("chatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("scenario", request.scenario);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTextbookAssistantRetryConversation"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/dialogue/RetryConversation"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTextbookAssistantRetryConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This operation retries a conversation.</p>
     * 
     * @param request ExecuteTextbookAssistantRetryConversationRequest
     * @return ExecuteTextbookAssistantRetryConversationResponse
     */
    public ExecuteTextbookAssistantRetryConversationResponse executeTextbookAssistantRetryConversation(ExecuteTextbookAssistantRetryConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeTextbookAssistantRetryConversationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a conversation and returns a streaming output.</p>
     * 
     * @param request ExecuteTextbookAssistantSseDialogueRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTextbookAssistantSseDialogueResponse
     */
    public ExecuteTextbookAssistantSseDialogueResponse executeTextbookAssistantSseDialogueWithOptions(ExecuteTextbookAssistantSseDialogueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authToken)) {
            body.put("authToken", request.authToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("chatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("scenario", request.scenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMessage)) {
            body.put("userMessage", request.userMessage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTextbookAssistantSseDialogue"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/dialogue/ExecuteSseDialogue"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTextbookAssistantSseDialogueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a conversation and returns a streaming output.</p>
     * 
     * @param request ExecuteTextbookAssistantSseDialogueRequest
     * @return ExecuteTextbookAssistantSseDialogueResponse
     */
    public ExecuteTextbookAssistantSseDialogueResponse executeTextbookAssistantSseDialogue(ExecuteTextbookAssistantSseDialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeTextbookAssistantSseDialogueWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a conversation with the AI teacher. The teacher then sends the initial message.</p>
     * 
     * @param request ExecuteTextbookAssistantStartConversationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTextbookAssistantStartConversationResponse
     */
    public ExecuteTextbookAssistantStartConversationResponse executeTextbookAssistantStartConversationWithOptions(ExecuteTextbookAssistantStartConversationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.articleId)) {
            body.put("articleId", request.articleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authToken)) {
            body.put("authToken", request.authToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("scenario", request.scenario);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTextbookAssistantStartConversation"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/dialogue/StartConversation"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTextbookAssistantStartConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a conversation with the AI teacher. The teacher then sends the initial message.</p>
     * 
     * @param request ExecuteTextbookAssistantStartConversationRequest
     * @return ExecuteTextbookAssistantStartConversationResponse
     */
    public ExecuteTextbookAssistantStartConversationResponse executeTextbookAssistantStartConversation(ExecuteTextbookAssistantStartConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeTextbookAssistantStartConversationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a suggested response from the textbook-based AI teacher.</p>
     * 
     * @param request ExecuteTextbookAssistantSuggestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTextbookAssistantSuggestionResponse
     */
    public ExecuteTextbookAssistantSuggestionResponse executeTextbookAssistantSuggestionWithOptions(ExecuteTextbookAssistantSuggestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assistant)) {
            body.put("assistant", request.assistant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authToken)) {
            body.put("authToken", request.authToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("chatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("scenario", request.scenario);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTextbookAssistantSuggestion"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/dialogue/Suggestion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTextbookAssistantSuggestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a suggested response from the textbook-based AI teacher.</p>
     * 
     * @param request ExecuteTextbookAssistantSuggestionRequest
     * @return ExecuteTextbookAssistantSuggestionResponse
     */
    public ExecuteTextbookAssistantSuggestionResponse executeTextbookAssistantSuggestion(ExecuteTextbookAssistantSuggestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeTextbookAssistantSuggestionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Translates the content of a message.</p>
     * 
     * @param request ExecuteTextbookAssistantTranslateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTextbookAssistantTranslateResponse
     */
    public ExecuteTextbookAssistantTranslateResponse executeTextbookAssistantTranslateWithOptions(ExecuteTextbookAssistantTranslateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assistant)) {
            body.put("assistant", request.assistant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authToken)) {
            body.put("authToken", request.authToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("chatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("scenario", request.scenario);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTextbookAssistantTranslate"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/dialogue/ExecuteTranslate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTextbookAssistantTranslateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Translates the content of a message.</p>
     * 
     * @param request ExecuteTextbookAssistantTranslateRequest
     * @return ExecuteTextbookAssistantTranslateResponse
     */
    public ExecuteTextbookAssistantTranslateResponse executeTextbookAssistantTranslate(ExecuteTextbookAssistantTranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeTextbookAssistantTranslateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Supplemental Practice Assistant</p>
     * 
     * @param request GetAITeacherExpansionDialogueSuggestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAITeacherExpansionDialogueSuggestionResponse
     */
    public GetAITeacherExpansionDialogueSuggestionResponse getAITeacherExpansionDialogueSuggestionWithOptions(GetAITeacherExpansionDialogueSuggestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.background)) {
            body.put("background", request.background);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogueTasks)) {
            body.put("dialogueTasks", request.dialogueTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageCode)) {
            body.put("languageCode", request.languageCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.records)) {
            body.put("records", request.records);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleInfo)) {
            body.put("roleInfo", request.roleInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startSentence)) {
            body.put("startSentence", request.startSentence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            body.put("topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAITeacherExpansionDialogueSuggestion"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiteacher/expansionPractice/suggestion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAITeacherExpansionDialogueSuggestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Supplemental Practice Assistant</p>
     * 
     * @param request GetAITeacherExpansionDialogueSuggestionRequest
     * @return GetAITeacherExpansionDialogueSuggestionResponse
     */
    public GetAITeacherExpansionDialogueSuggestionResponse getAITeacherExpansionDialogueSuggestion(GetAITeacherExpansionDialogueSuggestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAITeacherExpansionDialogueSuggestionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sync Practice Assistant</p>
     * 
     * @param request GetAITeacherSyncDialogueSuggestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAITeacherSyncDialogueSuggestionResponse
     */
    public GetAITeacherSyncDialogueSuggestionResponse getAITeacherSyncDialogueSuggestionWithOptions(GetAITeacherSyncDialogueSuggestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dialogueTasks)) {
            body.put("dialogueTasks", request.dialogueTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageCode)) {
            body.put("languageCode", request.languageCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.records)) {
            body.put("records", request.records);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAITeacherSyncDialogueSuggestion"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aiteacher/syncPractice/suggestion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAITeacherSyncDialogueSuggestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sync Practice Assistant</p>
     * 
     * @param request GetAITeacherSyncDialogueSuggestionRequest
     * @return GetAITeacherSyncDialogueSuggestionResponse
     */
    public GetAITeacherSyncDialogueSuggestionResponse getAITeacherSyncDialogueSuggestion(GetAITeacherSyncDialogueSuggestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAITeacherSyncDialogueSuggestionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains an authorization token to make API calls.</p>
     * 
     * @param request GetTextbookAssistantTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTextbookAssistantTokenResponse
     */
    public GetTextbookAssistantTokenResponse getTextbookAssistantTokenWithOptions(GetTextbookAssistantTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("deviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTextbookAssistantToken"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/teachingResource/GetToken"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTextbookAssistantTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains an authorization token to make API calls.</p>
     * 
     * @param request GetTextbookAssistantTokenRequest
     * @return GetTextbookAssistantTokenResponse
     */
    public GetTextbookAssistantTokenResponse getTextbookAssistantToken(GetTextbookAssistantTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTextbookAssistantTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch get article details</p>
     * 
     * @param request ListTextbookAssistantArticleDetailsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTextbookAssistantArticleDetailsResponse
     */
    public ListTextbookAssistantArticleDetailsResponse listTextbookAssistantArticleDetailsWithOptions(ListTextbookAssistantArticleDetailsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.articleIdList)) {
            body.put("articleIdList", request.articleIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authToken)) {
            body.put("authToken", request.authToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTextbookAssistantArticleDetails"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/teachingResource/ListArticleDetails"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTextbookAssistantArticleDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch get article details</p>
     * 
     * @param request ListTextbookAssistantArticleDetailsRequest
     * @return ListTextbookAssistantArticleDetailsResponse
     */
    public ListTextbookAssistantArticleDetailsResponse listTextbookAssistantArticleDetails(ListTextbookAssistantArticleDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTextbookAssistantArticleDetailsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns a list of articles.</p>
     * 
     * @param request ListTextbookAssistantArticlesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTextbookAssistantArticlesResponse
     */
    public ListTextbookAssistantArticlesResponse listTextbookAssistantArticlesWithOptions(ListTextbookAssistantArticlesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authToken)) {
            body.put("authToken", request.authToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTextbookAssistantArticles"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/teachingResource/ListArticles"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTextbookAssistantArticlesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Returns a list of articles.</p>
     * 
     * @param request ListTextbookAssistantArticlesRequest
     * @return ListTextbookAssistantArticlesResponse
     */
    public ListTextbookAssistantArticlesResponse listTextbookAssistantArticles(ListTextbookAssistantArticlesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTextbookAssistantArticlesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the table of contents of a book.</p>
     * 
     * @param request ListTextbookAssistantBookDirectoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTextbookAssistantBookDirectoriesResponse
     */
    public ListTextbookAssistantBookDirectoriesResponse listTextbookAssistantBookDirectoriesWithOptions(ListTextbookAssistantBookDirectoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authToken)) {
            body.put("authToken", request.authToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bookId)) {
            body.put("bookId", request.bookId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("scenario", request.scenario);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTextbookAssistantBookDirectories"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/teachingResource/ListBookDirectories"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTextbookAssistantBookDirectoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the table of contents of a book.</p>
     * 
     * @param request ListTextbookAssistantBookDirectoriesRequest
     * @return ListTextbookAssistantBookDirectoriesResponse
     */
    public ListTextbookAssistantBookDirectoriesResponse listTextbookAssistantBookDirectories(ListTextbookAssistantBookDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTextbookAssistantBookDirectoriesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of books for a specified grade.</p>
     * 
     * @param request ListTextbookAssistantBooksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTextbookAssistantBooksResponse
     */
    public ListTextbookAssistantBooksResponse listTextbookAssistantBooksWithOptions(ListTextbookAssistantBooksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authToken)) {
            body.put("authToken", request.authToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bookId)) {
            body.put("bookId", request.bookId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grade)) {
            body.put("grade", request.grade);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            body.put("volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTextbookAssistantBooks"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/teachingResource/ListBooks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTextbookAssistantBooksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of books for a specified grade.</p>
     * 
     * @param request ListTextbookAssistantBooksRequest
     * @return ListTextbookAssistantBooksResponse
     */
    public ListTextbookAssistantBooksResponse listTextbookAssistantBooks(ListTextbookAssistantBooksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTextbookAssistantBooksWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the available grades and volumes for the Textbook Assistant.</p>
     * 
     * @param request ListTextbookAssistantGradeVolumesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTextbookAssistantGradeVolumesResponse
     */
    public ListTextbookAssistantGradeVolumesResponse listTextbookAssistantGradeVolumesWithOptions(ListTextbookAssistantGradeVolumesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authToken)) {
            body.put("authToken", request.authToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("scenario", request.scenario);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTextbookAssistantGradeVolumes"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/teachingResource/ListGradeVolumes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTextbookAssistantGradeVolumesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the available grades and volumes for the Textbook Assistant.</p>
     * 
     * @param request ListTextbookAssistantGradeVolumesRequest
     * @return ListTextbookAssistantGradeVolumesResponse
     */
    public ListTextbookAssistantGradeVolumesResponse listTextbookAssistantGradeVolumes(ListTextbookAssistantGradeVolumesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTextbookAssistantGradeVolumesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Article Details</p>
     * 
     * @param request ListTextbookAssistantSceneDetailsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTextbookAssistantSceneDetailsResponse
     */
    public ListTextbookAssistantSceneDetailsResponse listTextbookAssistantSceneDetailsWithOptions(ListTextbookAssistantSceneDetailsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authToken)) {
            body.put("authToken", request.authToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneIdList)) {
            body.put("sceneIdList", request.sceneIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTextbookAssistantSceneDetails"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/textbookAssistant/teachingResource/ListSceneDetails"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTextbookAssistantSceneDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Article Details</p>
     * 
     * @param request ListTextbookAssistantSceneDetailsRequest
     * @return ListTextbookAssistantSceneDetailsResponse
     */
    public ListTextbookAssistantSceneDetailsResponse listTextbookAssistantSceneDetails(ListTextbookAssistantSceneDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTextbookAssistantSceneDetailsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Binds model groups to departments in batches.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds model groups to departments in batches.</p>
     * 
     * @param request ModelRouterBatchBindModelGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterBatchBindModelGroupResponse
     */
    public ModelRouterBatchBindModelGroupResponse modelRouterBatchBindModelGroupWithOptions(ModelRouterBatchBindModelGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedModelGroupConfig)) {
            body.put("allowedModelGroupConfig", request.allowedModelGroupConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIdList)) {
            body.put("clientIdList", request.clientIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterBatchBindModelGroup"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/batch-bind-model-group"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterBatchBindModelGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Binds model groups to departments in batches.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds model groups to departments in batches.</p>
     * 
     * @param request ModelRouterBatchBindModelGroupRequest
     * @return ModelRouterBatchBindModelGroupResponse
     */
    public ModelRouterBatchBindModelGroupResponse modelRouterBatchBindModelGroup(ModelRouterBatchBindModelGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterBatchBindModelGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates API keys in batches for members under a department in organization management.</p>
     * 
     * @param request ModelRouterBatchCreateMemberApiKeysRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterBatchCreateMemberApiKeysResponse
     */
    public ModelRouterBatchCreateMemberApiKeysResponse modelRouterBatchCreateMemberApiKeysWithOptions(String id, ModelRouterBatchCreateMemberApiKeysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireAt)) {
            body.put("expireAt", request.expireAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("userIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterBatchCreateMemberApiKeys"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/member-apikeys"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterBatchCreateMemberApiKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates API keys in batches for members under a department in organization management.</p>
     * 
     * @param request ModelRouterBatchCreateMemberApiKeysRequest
     * @return ModelRouterBatchCreateMemberApiKeysResponse
     */
    public ModelRouterBatchCreateMemberApiKeysResponse modelRouterBatchCreateMemberApiKeys(String id, ModelRouterBatchCreateMemberApiKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterBatchCreateMemberApiKeysWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Manages models by performing batch model creation.</p>
     * 
     * @param request ModelRouterBatchCreateModelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterBatchCreateModelResponse
     */
    public ModelRouterBatchCreateModelResponse modelRouterBatchCreateModelWithOptions(ModelRouterBatchCreateModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            body.put("apiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baseUrl)) {
            body.put("baseUrl", request.baseUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.models)) {
            body.put("models", request.models);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.symbol)) {
            body.put("symbol", request.symbol);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterBatchCreateModel"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/models/batch"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterBatchCreateModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Manages models by performing batch model creation.</p>
     * 
     * @param request ModelRouterBatchCreateModelRequest
     * @return ModelRouterBatchCreateModelResponse
     */
    public ModelRouterBatchCreateModelResponse modelRouterBatchCreateModel(ModelRouterBatchCreateModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterBatchCreateModelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables API keys in batches for members under a department in organization management.</p>
     * 
     * @param request ModelRouterBatchDisableMemberApiKeysRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterBatchDisableMemberApiKeysResponse
     */
    public ModelRouterBatchDisableMemberApiKeysResponse modelRouterBatchDisableMemberApiKeysWithOptions(String id, ModelRouterBatchDisableMemberApiKeysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("userIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterBatchDisableMemberApiKeys"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/member-apikeys/disable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterBatchDisableMemberApiKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables API keys in batches for members under a department in organization management.</p>
     * 
     * @param request ModelRouterBatchDisableMemberApiKeysRequest
     * @return ModelRouterBatchDisableMemberApiKeysResponse
     */
    public ModelRouterBatchDisableMemberApiKeysResponse modelRouterBatchDisableMemberApiKeys(String id, ModelRouterBatchDisableMemberApiKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterBatchDisableMemberApiKeysWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch resets member authorizations to inherit under a department in organization management.</p>
     * 
     * @param request ModelRouterBatchResetMemberAuthorizationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterBatchResetMemberAuthorizationResponse
     */
    public ModelRouterBatchResetMemberAuthorizationResponse modelRouterBatchResetMemberAuthorizationWithOptions(String id, ModelRouterBatchResetMemberAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("userIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterBatchResetMemberAuthorization"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/member-authorizations/reset"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterBatchResetMemberAuthorizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch resets member authorizations to inherit under a department in organization management.</p>
     * 
     * @param request ModelRouterBatchResetMemberAuthorizationRequest
     * @return ModelRouterBatchResetMemberAuthorizationResponse
     */
    public ModelRouterBatchResetMemberAuthorizationResponse modelRouterBatchResetMemberAuthorization(String id, ModelRouterBatchResetMemberAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterBatchResetMemberAuthorizationWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch sets member authorization under a department.</p>
     * 
     * @param request ModelRouterBatchSetMemberAuthorizationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterBatchSetMemberAuthorizationResponse
     */
    public ModelRouterBatchSetMemberAuthorizationResponse modelRouterBatchSetMemberAuthorizationWithOptions(String id, ModelRouterBatchSetMemberAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedModelGroupConfig)) {
            body.put("allowedModelGroupConfig", request.allowedModelGroupConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdList)) {
            body.put("userIdList", request.userIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterBatchSetMemberAuthorization"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/member-authorizations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterBatchSetMemberAuthorizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch sets member authorization under a department.</p>
     * 
     * @param request ModelRouterBatchSetMemberAuthorizationRequest
     * @return ModelRouterBatchSetMemberAuthorizationResponse
     */
    public ModelRouterBatchSetMemberAuthorizationResponse modelRouterBatchSetMemberAuthorization(String id, ModelRouterBatchSetMemberAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterBatchSetMemberAuthorizationWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the usage monitoring tab configuration.</p>
     * 
     * @param request ModelRouterBillingCostTabsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterBillingCostTabsResponse
     */
    public ModelRouterBillingCostTabsResponse modelRouterBillingCostTabsWithOptions(ModelRouterBillingCostTabsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterBillingCostTabs"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/billing/cost/tabs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterBillingCostTabsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the usage monitoring tab configuration.</p>
     * 
     * @param request ModelRouterBillingCostTabsRequest
     * @return ModelRouterBillingCostTabsResponse
     */
    public ModelRouterBillingCostTabsResponse modelRouterBillingCostTabs(ModelRouterBillingCostTabsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterBillingCostTabsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Initiates a chat conversation.</p>
     * 
     * @param request ModelRouterChatCompletionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterChatCompletionsResponse
     */
    public ModelRouterChatCompletionsResponse modelRouterChatCompletionsWithOptions(ModelRouterChatCompletionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterChatCompletions"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/chat/completions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterChatCompletionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Initiates a chat conversation.</p>
     * 
     * @param request ModelRouterChatCompletionsRequest
     * @return ModelRouterChatCompletionsResponse
     */
    public ModelRouterChatCompletionsResponse modelRouterChatCompletions(ModelRouterChatCompletionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterChatCompletionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables balance-based throttling for a department.</p>
     * 
     * @param request ModelRouterConfigureClientBalanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterConfigureClientBalanceResponse
     */
    public ModelRouterConfigureClientBalanceResponse modelRouterConfigureClientBalanceWithOptions(String id, ModelRouterConfigureClientBalanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.balanceType)) {
            body.put("balanceType", request.balanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableBalance)) {
            body.put("enableBalance", request.enableBalance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialBalance)) {
            body.put("initialBalance", request.initialBalance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterConfigureClientBalance"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterConfigureClientBalanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables balance-based throttling for a department.</p>
     * 
     * @param request ModelRouterConfigureClientBalanceRequest
     * @return ModelRouterConfigureClientBalanceResponse
     */
    public ModelRouterConfigureClientBalanceResponse modelRouterConfigureClientBalance(String id, ModelRouterConfigureClientBalanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterConfigureClientBalanceWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the sub-wallet balance of a member in an organization.</p>
     * 
     * @param request ModelRouterConfigureMemberBalanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterConfigureMemberBalanceResponse
     */
    public ModelRouterConfigureMemberBalanceResponse modelRouterConfigureMemberBalanceWithOptions(String clientId, String id, ModelRouterConfigureMemberBalanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.balanceType)) {
            body.put("balanceType", request.balanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableBalance)) {
            body.put("enableBalance", request.enableBalance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialBalance)) {
            body.put("initialBalance", request.initialBalance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterConfigureMemberBalance"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(clientId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterConfigureMemberBalanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the sub-wallet balance of a member in an organization.</p>
     * 
     * @param request ModelRouterConfigureMemberBalanceRequest
     * @return ModelRouterConfigureMemberBalanceResponse
     */
    public ModelRouterConfigureMemberBalanceResponse modelRouterConfigureMemberBalance(String clientId, String id, ModelRouterConfigureMemberBalanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterConfigureMemberBalanceWithOptions(clientId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Copies an API key.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterCopyApiKeyResponse
     */
    public ModelRouterCopyApiKeyResponse modelRouterCopyApiKeyWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterCopyApiKey"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/apikeys/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/copy"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterCopyApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Copies an API key.</p>
     * @return ModelRouterCopyApiKeyResponse
     */
    public ModelRouterCopyApiKeyResponse modelRouterCopyApiKey(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterCopyApiKeyWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an API key.</p>
     * 
     * @param request ModelRouterCreateApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterCreateApiKeyResponse
     */
    public ModelRouterCreateApiKeyResponse modelRouterCreateApiKeyWithOptions(ModelRouterCreateApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("clientId", request.clientId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterCreateApiKey"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/apikeys"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterCreateApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an API key.</p>
     * 
     * @param request ModelRouterCreateApiKeyRequest
     * @return ModelRouterCreateApiKeyResponse
     */
    public ModelRouterCreateApiKeyResponse modelRouterCreateApiKey(ModelRouterCreateApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterCreateApiKeyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Manages customers or creates a balance transaction.</p>
     * 
     * @param request ModelRouterCreateBalanceTransactionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterCreateBalanceTransactionResponse
     */
    public ModelRouterCreateBalanceTransactionResponse modelRouterCreateBalanceTransactionWithOptions(String id, ModelRouterCreateBalanceTransactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            body.put("amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.balanceType)) {
            body.put("balanceType", request.balanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotencyKey)) {
            body.put("idempotencyKey", request.idempotencyKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterCreateBalanceTransaction"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance/transactions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterCreateBalanceTransactionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Manages customers or creates a balance transaction.</p>
     * 
     * @param request ModelRouterCreateBalanceTransactionRequest
     * @return ModelRouterCreateBalanceTransactionResponse
     */
    public ModelRouterCreateBalanceTransactionResponse modelRouterCreateBalanceTransaction(String id, ModelRouterCreateBalanceTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterCreateBalanceTransactionWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a billing rule.</p>
     * 
     * @param request ModelRouterCreateBillingRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterCreateBillingRuleResponse
     */
    public ModelRouterCreateBillingRuleResponse modelRouterCreateBillingRuleWithOptions(ModelRouterCreateBillingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billingType)) {
            body.put("billingType", request.billingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            body.put("effectiveTime", request.effectiveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            body.put("expireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingConfig)) {
            body.put("pricingConfig", request.pricingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterCreateBillingRule"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/billing/rules"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterCreateBillingRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a billing rule.</p>
     * 
     * @param request ModelRouterCreateBillingRuleRequest
     * @return ModelRouterCreateBillingRuleResponse
     */
    public ModelRouterCreateBillingRuleResponse modelRouterCreateBillingRule(ModelRouterCreateBillingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterCreateBillingRuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a customer.</p>
     * 
     * @param request ModelRouterCreateClientRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterCreateClientResponse
     */
    public ModelRouterCreateClientResponse modelRouterCreateClientWithOptions(ModelRouterCreateClientRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowedModelGroupConfig)) {
            body.put("allowedModelGroupConfig", request.allowedModelGroupConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowedModels)) {
            body.put("allowedModels", request.allowedModels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contact)) {
            body.put("contact", request.contact);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discount)) {
            body.put("discount", request.discount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("parentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterCreateClient"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterCreateClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a customer.</p>
     * 
     * @param request ModelRouterCreateClientRequest
     * @return ModelRouterCreateClientResponse
     */
    public ModelRouterCreateClientResponse modelRouterCreateClient(ModelRouterCreateClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterCreateClientWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a conversation.</p>
     * 
     * @param request ModelRouterCreateConversationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterCreateConversationResponse
     */
    public ModelRouterCreateConversationResponse modelRouterCreateConversationWithOptions(ModelRouterCreateConversationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatData)) {
            body.put("chatData", request.chatData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelIds)) {
            body.put("modelIds", request.modelIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterCreateConversation"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/conversations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterCreateConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a conversation.</p>
     * 
     * @param request ModelRouterCreateConversationRequest
     * @return ModelRouterCreateConversationResponse
     */
    public ModelRouterCreateConversationResponse modelRouterCreateConversation(ModelRouterCreateConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterCreateConversationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an API key for a member in the organization.</p>
     * 
     * @param request ModelRouterCreateMemberApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterCreateMemberApiKeyResponse
     */
    public ModelRouterCreateMemberApiKeyResponse modelRouterCreateMemberApiKeyWithOptions(String clientId, String id, ModelRouterCreateMemberApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireAt)) {
            body.put("expireAt", request.expireAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterCreateMemberApiKey"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(clientId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/apikeys"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterCreateMemberApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an API key for a member in the organization.</p>
     * 
     * @param request ModelRouterCreateMemberApiKeyRequest
     * @return ModelRouterCreateMemberApiKeyResponse
     */
    public ModelRouterCreateMemberApiKeyResponse modelRouterCreateMemberApiKey(String clientId, String id, ModelRouterCreateMemberApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterCreateMemberApiKeyWithOptions(clientId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a balance transaction on a member sub-wallet in organization management.</p>
     * 
     * @param request ModelRouterCreateMemberBalanceTransactionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterCreateMemberBalanceTransactionResponse
     */
    public ModelRouterCreateMemberBalanceTransactionResponse modelRouterCreateMemberBalanceTransactionWithOptions(String clientId, String id, ModelRouterCreateMemberBalanceTransactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            body.put("amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.balanceType)) {
            body.put("balanceType", request.balanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotencyKey)) {
            body.put("idempotencyKey", request.idempotencyKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterCreateMemberBalanceTransaction"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(clientId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance/transactions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterCreateMemberBalanceTransactionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a balance transaction on a member sub-wallet in organization management.</p>
     * 
     * @param request ModelRouterCreateMemberBalanceTransactionRequest
     * @return ModelRouterCreateMemberBalanceTransactionResponse
     */
    public ModelRouterCreateMemberBalanceTransactionResponse modelRouterCreateMemberBalanceTransaction(String clientId, String id, ModelRouterCreateMemberBalanceTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterCreateMemberBalanceTransactionWithOptions(clientId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a balance subscription for a member in an organization.</p>
     * 
     * @param request ModelRouterCreateMemberSubscriptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterCreateMemberSubscriptionResponse
     */
    public ModelRouterCreateMemberSubscriptionResponse modelRouterCreateMemberSubscriptionWithOptions(String clientId, String id, ModelRouterCreateMemberSubscriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            body.put("amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.balanceType)) {
            body.put("balanceType", request.balanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            body.put("effectiveTime", request.effectiveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotencyKey)) {
            body.put("idempotencyKey", request.idempotencyKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterCreateMemberSubscription"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(clientId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance/subscription"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterCreateMemberSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a balance subscription for a member in an organization.</p>
     * 
     * @param request ModelRouterCreateMemberSubscriptionRequest
     * @return ModelRouterCreateMemberSubscriptionResponse
     */
    public ModelRouterCreateMemberSubscriptionResponse modelRouterCreateMemberSubscription(String clientId, String id, ModelRouterCreateMemberSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterCreateMemberSubscriptionWithOptions(clientId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs model creation.</p>
     * 
     * @param request ModelRouterCreateModelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterCreateModelResponse
     */
    public ModelRouterCreateModelResponse modelRouterCreateModelWithOptions(ModelRouterCreateModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            body.put("apiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baseUrl)) {
            body.put("baseUrl", request.baseUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extensions)) {
            body.put("extensions", request.extensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inOut)) {
            body.put("inOut", request.inOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxInputLength)) {
            body.put("maxInputLength", request.maxInputLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxOutputLength)) {
            body.put("maxOutputLength", request.maxOutputLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            body.put("modelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.symbol)) {
            body.put("symbol", request.symbol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterCreateModel"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/models"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterCreateModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs model creation.</p>
     * 
     * @param request ModelRouterCreateModelRequest
     * @return ModelRouterCreateModelResponse
     */
    public ModelRouterCreateModelResponse modelRouterCreateModel(ModelRouterCreateModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterCreateModelWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a manual model group.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a manual model group.</p>
     * 
     * @param request ModelRouterCreateModelGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterCreateModelGroupResponse
     */
    public ModelRouterCreateModelGroupResponse modelRouterCreateModelGroupWithOptions(ModelRouterCreateModelGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelList)) {
            body.put("modelList", request.modelList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterCreateModelGroup"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/model-groups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterCreateModelGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a manual model group.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a manual model group.</p>
     * 
     * @param request ModelRouterCreateModelGroupRequest
     * @return ModelRouterCreateModelGroupResponse
     */
    public ModelRouterCreateModelGroupResponse modelRouterCreateModelGroup(ModelRouterCreateModelGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterCreateModelGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a periodic recharge subscription for customer management.</p>
     * 
     * @param request ModelRouterCreateSubscriptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterCreateSubscriptionResponse
     */
    public ModelRouterCreateSubscriptionResponse modelRouterCreateSubscriptionWithOptions(String id, ModelRouterCreateSubscriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.balanceType)) {
            body.put("balanceType", request.balanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            body.put("effectiveTime", request.effectiveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotencyKey)) {
            body.put("idempotencyKey", request.idempotencyKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionAmount)) {
            body.put("subscriptionAmount", request.subscriptionAmount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterCreateSubscription"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance/subscription"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterCreateSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a periodic recharge subscription for customer management.</p>
     * 
     * @param request ModelRouterCreateSubscriptionRequest
     * @return ModelRouterCreateSubscriptionResponse
     */
    public ModelRouterCreateSubscriptionResponse modelRouterCreateSubscription(String id, ModelRouterCreateSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterCreateSubscriptionWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a user.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user.</p>
     * 
     * @param request ModelRouterCreateUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterCreateUserResponse
     */
    public ModelRouterCreateUserResponse modelRouterCreateUserWithOptions(ModelRouterCreateUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentRoles)) {
            body.put("departmentRoles", request.departmentRoles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginName)) {
            body.put("loginName", request.loginName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterCreateUser"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/users"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterCreateUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a user.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user.</p>
     * 
     * @param request ModelRouterCreateUserRequest
     * @return ModelRouterCreateUserResponse
     */
    public ModelRouterCreateUserResponse modelRouterCreateUser(ModelRouterCreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterCreateUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an API key.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterDeleteApiKeyResponse
     */
    public ModelRouterDeleteApiKeyResponse modelRouterDeleteApiKeyWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterDeleteApiKey"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/apikeys/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterDeleteApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an API key.</p>
     * @return ModelRouterDeleteApiKeyResponse
     */
    public ModelRouterDeleteApiKeyResponse modelRouterDeleteApiKey(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterDeleteApiKeyWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a customer.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterDeleteClientResponse
     */
    public ModelRouterDeleteClientResponse modelRouterDeleteClientWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterDeleteClient"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterDeleteClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a customer.</p>
     * @return ModelRouterDeleteClientResponse
     */
    public ModelRouterDeleteClientResponse modelRouterDeleteClient(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterDeleteClientWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a conversation.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterDeleteConversationResponse
     */
    public ModelRouterDeleteConversationResponse modelRouterDeleteConversationWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterDeleteConversation"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/conversations/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterDeleteConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a conversation.</p>
     * @return ModelRouterDeleteConversationResponse
     */
    public ModelRouterDeleteConversationResponse modelRouterDeleteConversation(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterDeleteConversationWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a model.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterDeleteModelResponse
     */
    public ModelRouterDeleteModelResponse modelRouterDeleteModelWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterDeleteModel"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/models/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterDeleteModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a model.</p>
     * @return ModelRouterDeleteModelResponse
     */
    public ModelRouterDeleteModelResponse modelRouterDeleteModel(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterDeleteModelWithOptions(id, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a manual group.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a manual group.</p>
     * 
     * @param request ModelRouterDeleteModelGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterDeleteModelGroupResponse
     */
    public ModelRouterDeleteModelGroupResponse modelRouterDeleteModelGroupWithOptions(String groupId, ModelRouterDeleteModelGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterDeleteModelGroup"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/model-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterDeleteModelGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a manual group.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a manual group.</p>
     * 
     * @param request ModelRouterDeleteModelGroupRequest
     * @return ModelRouterDeleteModelGroupResponse
     */
    public ModelRouterDeleteModelGroupResponse modelRouterDeleteModelGroup(String groupId, ModelRouterDeleteModelGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterDeleteModelGroupWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user.</p>
     * 
     * @param request ModelRouterDeleteUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterDeleteUserResponse
     */
    public ModelRouterDeleteUserResponse modelRouterDeleteUserWithOptions(String id, ModelRouterDeleteUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterDeleteUser"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/users/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterDeleteUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user.</p>
     * 
     * @param request ModelRouterDeleteUserRequest
     * @return ModelRouterDeleteUserResponse
     */
    public ModelRouterDeleteUserResponse modelRouterDeleteUser(String id, ModelRouterDeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterDeleteUserWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Exports the balance change records of a member in the organization.</p>
     * 
     * @param request ModelRouterExportMemberBalanceOrdersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterExportMemberBalanceOrdersResponse
     */
    public ModelRouterExportMemberBalanceOrdersResponse modelRouterExportMemberBalanceOrdersWithOptions(String clientId, String id, ModelRouterExportMemberBalanceOrdersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.balanceType)) {
            query.put("balanceType", request.balanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("direction", request.direction);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterExportMemberBalanceOrders"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(clientId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance/orders/export"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterExportMemberBalanceOrdersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Exports the balance change records of a member in the organization.</p>
     * 
     * @param request ModelRouterExportMemberBalanceOrdersRequest
     * @return ModelRouterExportMemberBalanceOrdersResponse
     */
    public ModelRouterExportMemberBalanceOrdersResponse modelRouterExportMemberBalanceOrders(String clientId, String id, ModelRouterExportMemberBalanceOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterExportMemberBalanceOrdersWithOptions(clientId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the total cost trend of bills in the Billing Center.</p>
     * 
     * @param request ModelRouterGetBillingBillSummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterGetBillingBillSummaryResponse
     */
    public ModelRouterGetBillingBillSummaryResponse modelRouterGetBillingBillSummaryWithOptions(ModelRouterGetBillingBillSummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKeyId)) {
            query.put("apiKeyId", request.apiKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIds)) {
            query.put("clientIds", request.clientIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUserIds)) {
            query.put("memberUserIds", request.memberUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTypes)) {
            query.put("modelTypes", request.modelTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterGetBillingBillSummary"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/billing/bills/summary"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterGetBillingBillSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the total cost trend of bills in the Billing Center.</p>
     * 
     * @param request ModelRouterGetBillingBillSummaryRequest
     * @return ModelRouterGetBillingBillSummaryResponse
     */
    public ModelRouterGetBillingBillSummaryResponse modelRouterGetBillingBillSummary(ModelRouterGetBillingBillSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterGetBillingBillSummaryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Client Management/Get department balance</p>
     * 
     * @param request ModelRouterGetClientBalanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterGetClientBalanceResponse
     */
    public ModelRouterGetClientBalanceResponse modelRouterGetClientBalanceWithOptions(String id, ModelRouterGetClientBalanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterGetClientBalance"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterGetClientBalanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Client Management/Get department balance</p>
     * 
     * @param request ModelRouterGetClientBalanceRequest
     * @return ModelRouterGetClientBalanceResponse
     */
    public ModelRouterGetClientBalanceResponse modelRouterGetClientBalance(String id, ModelRouterGetClientBalanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterGetClientBalanceWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the balance change logs of a department.</p>
     * 
     * @param request ModelRouterGetClientBalanceLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterGetClientBalanceLogsResponse
     */
    public ModelRouterGetClientBalanceLogsResponse modelRouterGetClientBalanceLogsWithOptions(String id, ModelRouterGetClientBalanceLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeType)) {
            query.put("changeType", request.changeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterGetClientBalanceLogs"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterGetClientBalanceLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the balance change logs of a department.</p>
     * 
     * @param request ModelRouterGetClientBalanceLogsRequest
     * @return ModelRouterGetClientBalanceLogsResponse
     */
    public ModelRouterGetClientBalanceLogsResponse modelRouterGetClientBalanceLogs(String id, ModelRouterGetClientBalanceLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterGetClientBalanceLogsWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the balance overview of a department.</p>
     * 
     * @param request ModelRouterGetDeptBalanceSummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterGetDeptBalanceSummaryResponse
     */
    public ModelRouterGetDeptBalanceSummaryResponse modelRouterGetDeptBalanceSummaryWithOptions(String id, ModelRouterGetDeptBalanceSummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterGetDeptBalanceSummary"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance-summary"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterGetDeptBalanceSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the balance overview of a department.</p>
     * 
     * @param request ModelRouterGetDeptBalanceSummaryRequest
     * @return ModelRouterGetDeptBalanceSummaryResponse
     */
    public ModelRouterGetDeptBalanceSummaryResponse modelRouterGetDeptBalanceSummary(String id, ModelRouterGetDeptBalanceSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterGetDeptBalanceSummaryWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of API keys for a member in the organization.</p>
     * 
     * @param request ModelRouterGetMemberApiKeysRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterGetMemberApiKeysResponse
     */
    public ModelRouterGetMemberApiKeysResponse modelRouterGetMemberApiKeysWithOptions(String clientId, String id, ModelRouterGetMemberApiKeysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterGetMemberApiKeys"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(clientId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/apikeys"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterGetMemberApiKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of API keys for a member in the organization.</p>
     * 
     * @param request ModelRouterGetMemberApiKeysRequest
     * @return ModelRouterGetMemberApiKeysResponse
     */
    public ModelRouterGetMemberApiKeysResponse modelRouterGetMemberApiKeys(String clientId, String id, ModelRouterGetMemberApiKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterGetMemberApiKeysWithOptions(clientId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the sub-wallet balance of a member in an organization.</p>
     * 
     * @param request ModelRouterGetMemberBalanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterGetMemberBalanceResponse
     */
    public ModelRouterGetMemberBalanceResponse modelRouterGetMemberBalanceWithOptions(String clientId, String id, ModelRouterGetMemberBalanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterGetMemberBalance"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(clientId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterGetMemberBalanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the sub-wallet balance of a member in an organization.</p>
     * 
     * @param request ModelRouterGetMemberBalanceRequest
     * @return ModelRouterGetMemberBalanceResponse
     */
    public ModelRouterGetMemberBalanceResponse modelRouterGetMemberBalance(String clientId, String id, ModelRouterGetMemberBalanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterGetMemberBalanceWithOptions(clientId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the balance change logs of a member in an organization.</p>
     * 
     * @param request ModelRouterGetMemberBalanceLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterGetMemberBalanceLogsResponse
     */
    public ModelRouterGetMemberBalanceLogsResponse modelRouterGetMemberBalanceLogsWithOptions(String clientId, String id, ModelRouterGetMemberBalanceLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeType)) {
            query.put("changeType", request.changeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipTotal)) {
            query.put("skipTotal", request.skipTotal);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterGetMemberBalanceLogs"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(clientId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterGetMemberBalanceLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the balance change logs of a member in an organization.</p>
     * 
     * @param request ModelRouterGetMemberBalanceLogsRequest
     * @return ModelRouterGetMemberBalanceLogsResponse
     */
    public ModelRouterGetMemberBalanceLogsResponse modelRouterGetMemberBalanceLogs(String clientId, String id, ModelRouterGetMemberBalanceLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterGetMemberBalanceLogsWithOptions(clientId, id, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the role assignments of a user.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the cross-department role assignments of a user.</p>
     * 
     * @param request ModelRouterGetUserRolesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterGetUserRolesResponse
     */
    public ModelRouterGetUserRolesResponse modelRouterGetUserRolesWithOptions(String id, ModelRouterGetUserRolesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterGetUserRoles"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/users/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/roles"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterGetUserRolesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the role assignments of a user.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the cross-department role assignments of a user.</p>
     * 
     * @param request ModelRouterGetUserRolesRequest
     * @return ModelRouterGetUserRolesResponse
     */
    public ModelRouterGetUserRolesResponse modelRouterGetUserRoles(String id, ModelRouterGetUserRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterGetUserRolesWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is deprecated. Do not use it.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries balance change records.</p>
     * 
     * @param request ModelRouterListBalanceOrdersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterListBalanceOrdersResponse
     */
    public ModelRouterListBalanceOrdersResponse modelRouterListBalanceOrdersWithOptions(String id, ModelRouterListBalanceOrdersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.balanceType)) {
            query.put("balanceType", request.balanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("orderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterListBalanceOrders"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance/orders"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterListBalanceOrdersResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is deprecated. Do not use it.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries balance change records.</p>
     * 
     * @param request ModelRouterListBalanceOrdersRequest
     * @return ModelRouterListBalanceOrdersResponse
     */
    public ModelRouterListBalanceOrdersResponse modelRouterListBalanceOrders(String id, ModelRouterListBalanceOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterListBalanceOrdersWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of members in a specified department.</p>
     * 
     * @param request ModelRouterListDeptMembersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterListDeptMembersResponse
     */
    public ModelRouterListDeptMembersResponse modelRouterListDeptMembersWithOptions(String id, ModelRouterListDeptMembersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authConfig)) {
            query.put("authConfig", request.authConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeAuthorization)) {
            query.put("includeAuthorization", request.includeAuthorization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeBalance)) {
            query.put("includeBalance", request.includeBalance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterListDeptMembers"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/members"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterListDeptMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of members in a specified department.</p>
     * 
     * @param request ModelRouterListDeptMembersRequest
     * @return ModelRouterListDeptMembersResponse
     */
    public ModelRouterListDeptMembersResponse modelRouterListDeptMembers(String id, ModelRouterListDeptMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterListDeptMembersWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the balance change records of a member in the organization.</p>
     * 
     * @param request ModelRouterListMemberBalanceOrdersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterListMemberBalanceOrdersResponse
     */
    public ModelRouterListMemberBalanceOrdersResponse modelRouterListMemberBalanceOrdersWithOptions(String clientId, String id, ModelRouterListMemberBalanceOrdersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.balanceType)) {
            query.put("balanceType", request.balanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("orderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterListMemberBalanceOrders"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(clientId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance/orders"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterListMemberBalanceOrdersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the balance change records of a member in the organization.</p>
     * 
     * @param request ModelRouterListMemberBalanceOrdersRequest
     * @return ModelRouterListMemberBalanceOrdersResponse
     */
    public ModelRouterListMemberBalanceOrdersResponse modelRouterListMemberBalanceOrders(String clientId, String id, ModelRouterListMemberBalanceOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterListMemberBalanceOrdersWithOptions(clientId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the subscription list of a member in the organization.</p>
     * 
     * @param request ModelRouterListMemberSubscriptionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterListMemberSubscriptionsResponse
     */
    public ModelRouterListMemberSubscriptionsResponse modelRouterListMemberSubscriptionsWithOptions(String clientId, String id, ModelRouterListMemberSubscriptionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterListMemberSubscriptions"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(clientId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance/subscription"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterListMemberSubscriptionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the subscription list of a member in the organization.</p>
     * 
     * @param request ModelRouterListMemberSubscriptionsRequest
     * @return ModelRouterListMemberSubscriptionsResponse
     */
    public ModelRouterListMemberSubscriptionsResponse modelRouterListMemberSubscriptions(String clientId, String id, ModelRouterListMemberSubscriptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterListMemberSubscriptionsWithOptions(clientId, id, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is deprecated. Do not use it.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of periodic recharge subscriptions.</p>
     * 
     * @param request ModelRouterListSubscriptionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterListSubscriptionsResponse
     */
    public ModelRouterListSubscriptionsResponse modelRouterListSubscriptionsWithOptions(String id, ModelRouterListSubscriptionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.balanceType)) {
            query.put("balanceType", request.balanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterListSubscriptions"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance/subscription"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterListSubscriptionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is deprecated. Do not use it.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of periodic recharge subscriptions.</p>
     * 
     * @param request ModelRouterListSubscriptionsRequest
     * @return ModelRouterListSubscriptionsResponse
     */
    public ModelRouterListSubscriptionsResponse modelRouterListSubscriptions(String id, ModelRouterListSubscriptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterListSubscriptionsWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an API key.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryApiKeyResponse
     */
    public ModelRouterQueryApiKeyResponse modelRouterQueryApiKeyWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryApiKey"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/apikeys/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an API key.</p>
     * @return ModelRouterQueryApiKeyResponse
     */
    public ModelRouterQueryApiKeyResponse modelRouterQueryApiKey(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryApiKeyWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of API keys.</p>
     * 
     * @param request ModelRouterQueryApiKeyListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryApiKeyListResponse
     */
    public ModelRouterQueryApiKeyListResponse modelRouterQueryApiKeyListWithOptions(ModelRouterQueryApiKeyListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("groupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeMemberKeys)) {
            query.put("includeMemberKeys", request.includeMemberKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUserIds)) {
            query.put("memberUserIds", request.memberUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTotalCount)) {
            query.put("needTotalCount", request.needTotalCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryApiKeyList"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/apikeys"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryApiKeyListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of API keys.</p>
     * 
     * @param request ModelRouterQueryApiKeyListRequest
     * @return ModelRouterQueryApiKeyListResponse
     */
    public ModelRouterQueryApiKeyListResponse modelRouterQueryApiKeyList(ModelRouterQueryApiKeyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryApiKeyListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries billing details in batches.</p>
     * 
     * @param request ModelRouterQueryBillingCostBreakdownRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryBillingCostBreakdownResponse
     */
    public ModelRouterQueryBillingCostBreakdownResponse modelRouterQueryBillingCostBreakdownWithOptions(ModelRouterQueryBillingCostBreakdownRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKeyId)) {
            query.put("apiKeyId", request.apiKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIds)) {
            query.put("clientIds", request.clientIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUserIds)) {
            query.put("memberUserIds", request.memberUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTypes)) {
            query.put("modelTypes", request.modelTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryBillingCostBreakdown"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/billing/cost/breakdown"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryBillingCostBreakdownResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries billing details in batches.</p>
     * 
     * @param request ModelRouterQueryBillingCostBreakdownRequest
     * @return ModelRouterQueryBillingCostBreakdownResponse
     */
    public ModelRouterQueryBillingCostBreakdownResponse modelRouterQueryBillingCostBreakdown(ModelRouterQueryBillingCostBreakdownRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryBillingCostBreakdownWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Billing management / Query billing rule list</p>
     * 
     * @param request ModelRouterQueryBillingRuleListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryBillingRuleListResponse
     */
    public ModelRouterQueryBillingRuleListResponse modelRouterQueryBillingRuleListWithOptions(ModelRouterQueryBillingRuleListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activeOnly)) {
            query.put("activeOnly", request.activeOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCode)) {
            query.put("modelCode", request.modelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            query.put("modelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryBillingRuleList"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/billing/rules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryBillingRuleListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Billing management / Query billing rule list</p>
     * 
     * @param request ModelRouterQueryBillingRuleListRequest
     * @return ModelRouterQueryBillingRuleListResponse
     */
    public ModelRouterQueryBillingRuleListResponse modelRouterQueryBillingRuleList(ModelRouterQueryBillingRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryBillingRuleListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the discount modification history for a client.</p>
     * 
     * @param request ModelRouterQueryClientDiscountLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryClientDiscountLogsResponse
     */
    public ModelRouterQueryClientDiscountLogsResponse modelRouterQueryClientDiscountLogsWithOptions(String id, ModelRouterQueryClientDiscountLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryClientDiscountLogs"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/discount-logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryClientDiscountLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the discount modification history for a client.</p>
     * 
     * @param request ModelRouterQueryClientDiscountLogsRequest
     * @return ModelRouterQueryClientDiscountLogsResponse
     */
    public ModelRouterQueryClientDiscountLogsResponse modelRouterQueryClientDiscountLogs(String id, ModelRouterQueryClientDiscountLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryClientDiscountLogsWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of clients.</p>
     * 
     * @param request ModelRouterQueryClientListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryClientListResponse
     */
    public ModelRouterQueryClientListResponse modelRouterQueryClientListWithOptions(ModelRouterQueryClientListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("groupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTotalCount)) {
            query.put("needTotalCount", request.needTotalCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("parentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryClientList"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryClientListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of clients.</p>
     * 
     * @param request ModelRouterQueryClientListRequest
     * @return ModelRouterQueryClientListResponse
     */
    public ModelRouterQueryClientListResponse modelRouterQueryClientList(ModelRouterQueryClientListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryClientListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the customer tree structure.</p>
     * 
     * @param request ModelRouterQueryClientTreeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryClientTreeResponse
     */
    public ModelRouterQueryClientTreeResponse modelRouterQueryClientTreeWithOptions(ModelRouterQueryClientTreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryClientTree"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/tree"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryClientTreeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the customer tree structure.</p>
     * 
     * @param request ModelRouterQueryClientTreeRequest
     * @return ModelRouterQueryClientTreeResponse
     */
    public ModelRouterQueryClientTreeResponse modelRouterQueryClientTree(ModelRouterQueryClientTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryClientTreeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a conversation.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryConversationResponse
     */
    public ModelRouterQueryConversationResponse modelRouterQueryConversationWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryConversation"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/conversations/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a conversation.</p>
     * @return ModelRouterQueryConversationResponse
     */
    public ModelRouterQueryConversationResponse modelRouterQueryConversation(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryConversationWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Conversation management/Conversation list</p>
     * 
     * @param request ModelRouterQueryConversationListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryConversationListResponse
     */
    public ModelRouterQueryConversationListResponse modelRouterQueryConversationListWithOptions(ModelRouterQueryConversationListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("groupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTotalCount)) {
            query.put("needTotalCount", request.needTotalCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryConversationList"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/conversations"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryConversationListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Conversation management/Conversation list</p>
     * 
     * @param request ModelRouterQueryConversationListRequest
     * @return ModelRouterQueryConversationListResponse
     */
    public ModelRouterQueryConversationListResponse modelRouterQueryConversationList(ModelRouterQueryConversationListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryConversationListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves model usage details for billing management.</p>
     * 
     * @param request ModelRouterQueryCostModelDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryCostModelDetailResponse
     */
    public ModelRouterQueryCostModelDetailResponse modelRouterQueryCostModelDetailWithOptions(ModelRouterQueryCostModelDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKeyId)) {
            query.put("apiKeyId", request.apiKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIds)) {
            query.put("clientIds", request.clientIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUserIds)) {
            query.put("memberUserIds", request.memberUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryCostModelDetail"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/billing/cost/model-detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryCostModelDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves model usage details for billing management.</p>
     * 
     * @param request ModelRouterQueryCostModelDetailRequest
     * @return ModelRouterQueryCostModelDetailResponse
     */
    public ModelRouterQueryCostModelDetailResponse modelRouterQueryCostModelDetail(ModelRouterQueryCostModelDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryCostModelDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of models called for billing management.</p>
     * 
     * @param request ModelRouterQueryCostModelListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryCostModelListResponse
     */
    public ModelRouterQueryCostModelListResponse modelRouterQueryCostModelListWithOptions(ModelRouterQueryCostModelListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKeyId)) {
            query.put("apiKeyId", request.apiKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIds)) {
            query.put("clientIds", request.clientIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUserIds)) {
            query.put("memberUserIds", request.memberUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTypes)) {
            query.put("modelTypes", request.modelTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryCostModelList"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/billing/cost/models"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryCostModelListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of models called for billing management.</p>
     * 
     * @param request ModelRouterQueryCostModelListRequest
     * @return ModelRouterQueryCostModelListResponse
     */
    public ModelRouterQueryCostModelListResponse modelRouterQueryCostModelList(ModelRouterQueryCostModelListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryCostModelListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves cost overview metrics for billing management.</p>
     * 
     * @param request ModelRouterQueryCostOverviewMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryCostOverviewMetricsResponse
     */
    public ModelRouterQueryCostOverviewMetricsResponse modelRouterQueryCostOverviewMetricsWithOptions(ModelRouterQueryCostOverviewMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKeyId)) {
            query.put("apiKeyId", request.apiKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIds)) {
            query.put("clientIds", request.clientIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUserIds)) {
            query.put("memberUserIds", request.memberUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTypes)) {
            query.put("modelTypes", request.modelTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryCostOverviewMetrics"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/billing/cost/overview"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryCostOverviewMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves cost overview metrics for billing management.</p>
     * 
     * @param request ModelRouterQueryCostOverviewMetricsRequest
     * @return ModelRouterQueryCostOverviewMetricsResponse
     */
    public ModelRouterQueryCostOverviewMetricsResponse modelRouterQueryCostOverviewMetrics(ModelRouterQueryCostOverviewMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryCostOverviewMetricsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves usage cost trends.</p>
     * 
     * @param request ModelRouterQueryCostTrendMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryCostTrendMetricsResponse
     */
    public ModelRouterQueryCostTrendMetricsResponse modelRouterQueryCostTrendMetricsWithOptions(ModelRouterQueryCostTrendMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKeyId)) {
            query.put("apiKeyId", request.apiKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIds)) {
            query.put("clientIds", request.clientIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUserIds)) {
            query.put("memberUserIds", request.memberUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTypes)) {
            query.put("modelTypes", request.modelTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryCostTrendMetrics"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/billing/cost/trend"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryCostTrendMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves usage cost trends.</p>
     * 
     * @param request ModelRouterQueryCostTrendMetricsRequest
     * @return ModelRouterQueryCostTrendMetricsResponse
     */
    public ModelRouterQueryCostTrendMetricsResponse modelRouterQueryCostTrendMetrics(ModelRouterQueryCostTrendMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryCostTrendMetricsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves details for a specific model.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryModelResponse
     */
    public ModelRouterQueryModelResponse modelRouterQueryModelWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryModel"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/models/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves details for a specific model.</p>
     * @return ModelRouterQueryModelResponse
     */
    public ModelRouterQueryModelResponse modelRouterQueryModel(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryModelWithOptions(id, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a model group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a model group.</p>
     * 
     * @param request ModelRouterQueryModelGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryModelGroupResponse
     */
    public ModelRouterQueryModelGroupResponse modelRouterQueryModelGroupWithOptions(String groupId, ModelRouterQueryModelGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryModelGroup"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/model-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryModelGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a model group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a model group.</p>
     * 
     * @param request ModelRouterQueryModelGroupRequest
     * @return ModelRouterQueryModelGroupResponse
     */
    public ModelRouterQueryModelGroupResponse modelRouterQueryModelGroup(String groupId, ModelRouterQueryModelGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryModelGroupWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the departments bound to a model group by paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the departments bound to a model group by paging.</p>
     * 
     * @param request ModelRouterQueryModelGroupClientsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryModelGroupClientsResponse
     */
    public ModelRouterQueryModelGroupClientsResponse modelRouterQueryModelGroupClientsWithOptions(String groupId, ModelRouterQueryModelGroupClientsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryModelGroupClients"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/model-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/clients"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryModelGroupClientsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the departments bound to a model group by paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the departments bound to a model group by paging.</p>
     * 
     * @param request ModelRouterQueryModelGroupClientsRequest
     * @return ModelRouterQueryModelGroupClientsResponse
     */
    public ModelRouterQueryModelGroupClientsResponse modelRouterQueryModelGroupClients(String groupId, ModelRouterQueryModelGroupClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryModelGroupClientsWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of model groups by paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of model groups by paging.</p>
     * 
     * @param request ModelRouterQueryModelGroupListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryModelGroupListResponse
     */
    public ModelRouterQueryModelGroupListResponse modelRouterQueryModelGroupListWithOptions(ModelRouterQueryModelGroupListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryModelGroupList"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/model-groups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryModelGroupListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of model groups by paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of model groups by paging.</p>
     * 
     * @param request ModelRouterQueryModelGroupListRequest
     * @return ModelRouterQueryModelGroupListResponse
     */
    public ModelRouterQueryModelGroupListResponse modelRouterQueryModelGroupList(ModelRouterQueryModelGroupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryModelGroupListWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries models within a group with pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query for models within a model group.</p>
     * 
     * @param request ModelRouterQueryModelGroupModelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryModelGroupModelsResponse
     */
    public ModelRouterQueryModelGroupModelsResponse modelRouterQueryModelGroupModelsWithOptions(String groupId, ModelRouterQueryModelGroupModelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryModelGroupModels"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/model-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/models"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryModelGroupModelsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries models within a group with pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query for models within a model group.</p>
     * 
     * @param request ModelRouterQueryModelGroupModelsRequest
     * @return ModelRouterQueryModelGroupModelsResponse
     */
    public ModelRouterQueryModelGroupModelsResponse modelRouterQueryModelGroupModels(String groupId, ModelRouterQueryModelGroupModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryModelGroupModelsWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the users attached to a model group by paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the users attached to a model group by paging.</p>
     * 
     * @param request ModelRouterQueryModelGroupUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryModelGroupUsersResponse
     */
    public ModelRouterQueryModelGroupUsersResponse modelRouterQueryModelGroupUsersWithOptions(String groupId, ModelRouterQueryModelGroupUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryModelGroupUsers"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/model-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/users"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryModelGroupUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the users attached to a model group by paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the users attached to a model group by paging.</p>
     * 
     * @param request ModelRouterQueryModelGroupUsersRequest
     * @return ModelRouterQueryModelGroupUsersResponse
     */
    public ModelRouterQueryModelGroupUsersResponse modelRouterQueryModelGroupUsers(String groupId, ModelRouterQueryModelGroupUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryModelGroupUsersWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the bound groups and models by API key.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the bound groups and models by API key.</p>
     * 
     * @param request ModelRouterQueryModelGroupsByApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryModelGroupsByApiKeyResponse
     */
    public ModelRouterQueryModelGroupsByApiKeyResponse modelRouterQueryModelGroupsByApiKeyWithOptions(String id, ModelRouterQueryModelGroupsByApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryModelGroupsByApiKey"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/apikeys/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/model-groups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryModelGroupsByApiKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the bound groups and models by API key.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the bound groups and models by API key.</p>
     * 
     * @param request ModelRouterQueryModelGroupsByApiKeyRequest
     * @return ModelRouterQueryModelGroupsByApiKeyResponse
     */
    public ModelRouterQueryModelGroupsByApiKeyResponse modelRouterQueryModelGroupsByApiKey(String id, ModelRouterQueryModelGroupsByApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryModelGroupsByApiKeyWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Model management/Get model list</p>
     * 
     * @param request ModelRouterQueryModelListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryModelListResponse
     */
    public ModelRouterQueryModelListResponse modelRouterQueryModelListWithOptions(ModelRouterQueryModelListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("groupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            query.put("modelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTotalCount)) {
            query.put("needTotalCount", request.needTotalCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryModelList"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/models"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryModelListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Model management/Get model list</p>
     * 
     * @param request ModelRouterQueryModelListRequest
     * @return ModelRouterQueryModelListResponse
     */
    public ModelRouterQueryModelListResponse modelRouterQueryModelList(ModelRouterQueryModelListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryModelListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of Nacos service providers through Nacos configuration.</p>
     * 
     * @param request ModelRouterQueryNacosProvidersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryNacosProvidersResponse
     */
    public ModelRouterQueryNacosProvidersResponse modelRouterQueryNacosProvidersWithOptions(ModelRouterQueryNacosProvidersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("groupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTotalCount)) {
            query.put("needTotalCount", request.needTotalCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryNacosProviders"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/nacos/providers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryNacosProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of Nacos service providers through Nacos configuration.</p>
     * 
     * @param request ModelRouterQueryNacosProvidersRequest
     * @return ModelRouterQueryNacosProvidersResponse
     */
    public ModelRouterQueryNacosProvidersResponse modelRouterQueryNacosProviders(ModelRouterQueryNacosProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryNacosProvidersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of tags from Nacos.</p>
     * 
     * @param request ModelRouterQueryNacosTagsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryNacosTagsResponse
     */
    public ModelRouterQueryNacosTagsResponse modelRouterQueryNacosTagsWithOptions(ModelRouterQueryNacosTagsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            query.put("configType", request.configType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("groupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTotalCount)) {
            query.put("needTotalCount", request.needTotalCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryNacosTags"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/nacos/tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryNacosTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of tags from Nacos.</p>
     * 
     * @param request ModelRouterQueryNacosTagsRequest
     * @return ModelRouterQueryNacosTagsResponse
     */
    public ModelRouterQueryNacosTagsResponse modelRouterQueryNacosTags(ModelRouterQueryNacosTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryNacosTagsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves observation chart data for model monitoring.</p>
     * 
     * @param request ModelRouterQueryObservationChartsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryObservationChartsResponse
     */
    public ModelRouterQueryObservationChartsResponse modelRouterQueryObservationChartsWithOptions(ModelRouterQueryObservationChartsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKeyId)) {
            query.put("apiKeyId", request.apiKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIds)) {
            query.put("clientIds", request.clientIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUserIds)) {
            query.put("memberUserIds", request.memberUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("timeRange", request.timeRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryObservationCharts"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/observation/charts"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryObservationChartsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves observation chart data for model monitoring.</p>
     * 
     * @param request ModelRouterQueryObservationChartsRequest
     * @return ModelRouterQueryObservationChartsResponse
     */
    public ModelRouterQueryObservationChartsResponse modelRouterQueryObservationCharts(ModelRouterQueryObservationChartsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryObservationChartsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of observation logs for model monitoring.</p>
     * 
     * @param request ModelRouterQueryObservationLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryObservationLogsResponse
     */
    public ModelRouterQueryObservationLogsResponse modelRouterQueryObservationLogsWithOptions(ModelRouterQueryObservationLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKeyId)) {
            query.put("apiKeyId", request.apiKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIds)) {
            query.put("clientIds", request.clientIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("groupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUserIds)) {
            query.put("memberUserIds", request.memberUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTotalCount)) {
            query.put("needTotalCount", request.needTotalCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("timeRange", request.timeRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryObservationLogs"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/observation/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryObservationLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of observation logs for model monitoring.</p>
     * 
     * @param request ModelRouterQueryObservationLogsRequest
     * @return ModelRouterQueryObservationLogsResponse
     */
    public ModelRouterQueryObservationLogsResponse modelRouterQueryObservationLogs(ModelRouterQueryObservationLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryObservationLogsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves observability metric data for model API calls.</p>
     * 
     * @param request ModelRouterQueryObservationMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryObservationMetricsResponse
     */
    public ModelRouterQueryObservationMetricsResponse modelRouterQueryObservationMetricsWithOptions(ModelRouterQueryObservationMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKeyId)) {
            query.put("apiKeyId", request.apiKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIds)) {
            query.put("clientIds", request.clientIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("groupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUserIds)) {
            query.put("memberUserIds", request.memberUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTotalCount)) {
            query.put("needTotalCount", request.needTotalCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("timeRange", request.timeRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryObservationMetrics"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/observation/metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryObservationMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves observability metric data for model API calls.</p>
     * 
     * @param request ModelRouterQueryObservationMetricsRequest
     * @return ModelRouterQueryObservationMetricsResponse
     */
    public ModelRouterQueryObservationMetricsResponse modelRouterQueryObservationMetrics(ModelRouterQueryObservationMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryObservationMetricsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries usage details in batches for usage management.</p>
     * 
     * @param request ModelRouterQueryUsageBreakdownRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryUsageBreakdownResponse
     */
    public ModelRouterQueryUsageBreakdownResponse modelRouterQueryUsageBreakdownWithOptions(ModelRouterQueryUsageBreakdownRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKeyId)) {
            query.put("apiKeyId", request.apiKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIds)) {
            query.put("clientIds", request.clientIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUserIds)) {
            query.put("memberUserIds", request.memberUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryUsageBreakdown"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/usage/breakdown"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryUsageBreakdownResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries usage details in batches for usage management.</p>
     * 
     * @param request ModelRouterQueryUsageBreakdownRequest
     * @return ModelRouterQueryUsageBreakdownResponse
     */
    public ModelRouterQueryUsageBreakdownResponse modelRouterQueryUsageBreakdown(ModelRouterQueryUsageBreakdownRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryUsageBreakdownWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of users.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of users.</p>
     * 
     * @param request ModelRouterQueryUserListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterQueryUserListResponse
     */
    public ModelRouterQueryUserListResponse modelRouterQueryUserListWithOptions(ModelRouterQueryUserListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("phone", request.phone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterQueryUserList"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/users"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterQueryUserListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of users.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of users.</p>
     * 
     * @param request ModelRouterQueryUserListRequest
     * @return ModelRouterQueryUserListResponse
     */
    public ModelRouterQueryUserListResponse modelRouterQueryUserList(ModelRouterQueryUserListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterQueryUserListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the authorization of a member to inherit from the organization.</p>
     * 
     * @param request ModelRouterResetMemberAuthorizationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterResetMemberAuthorizationResponse
     */
    public ModelRouterResetMemberAuthorizationResponse modelRouterResetMemberAuthorizationWithOptions(String clientId, String id, ModelRouterResetMemberAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterResetMemberAuthorization"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(clientId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/authorization"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterResetMemberAuthorizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the authorization of a member to inherit from the organization.</p>
     * 
     * @param request ModelRouterResetMemberAuthorizationRequest
     * @return ModelRouterResetMemberAuthorizationResponse
     */
    public ModelRouterResetMemberAuthorizationResponse modelRouterResetMemberAuthorization(String clientId, String id, ModelRouterResetMemberAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterResetMemberAuthorizationWithOptions(clientId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Flow control management / Save flow control configuration</p>
     * 
     * @param request ModelRouterSaveFlowConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterSaveFlowConfigResponse
     */
    public ModelRouterSaveFlowConfigResponse modelRouterSaveFlowConfigWithOptions(ModelRouterSaveFlowConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rpm)) {
            body.put("rpm", request.rpm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smoothFlowEnabled)) {
            body.put("smoothFlowEnabled", request.smoothFlowEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tpm)) {
            body.put("tpm", request.tpm);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterSaveFlowConfig"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/flow-config"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterSaveFlowConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Flow control management / Save flow control configuration</p>
     * 
     * @param request ModelRouterSaveFlowConfigRequest
     * @return ModelRouterSaveFlowConfigResponse
     */
    public ModelRouterSaveFlowConfigResponse modelRouterSaveFlowConfig(ModelRouterSaveFlowConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterSaveFlowConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Searches and locates nodes in the department tree for organization management.</p>
     * 
     * @param request ModelRouterSearchClientTreeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterSearchClientTreeResponse
     */
    public ModelRouterSearchClientTreeResponse modelRouterSearchClientTreeWithOptions(ModelRouterSearchClientTreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterSearchClientTree"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/tree/search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterSearchClientTreeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Searches and locates nodes in the department tree for organization management.</p>
     * 
     * @param request ModelRouterSearchClientTreeRequest
     * @return ModelRouterSearchClientTreeResponse
     */
    public ModelRouterSearchClientTreeResponse modelRouterSearchClientTree(ModelRouterSearchClientTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterSearchClientTreeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the member authorization model for an organization.</p>
     * 
     * @param request ModelRouterSetMemberAuthorizationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterSetMemberAuthorizationResponse
     */
    public ModelRouterSetMemberAuthorizationResponse modelRouterSetMemberAuthorizationWithOptions(String clientId, String id, ModelRouterSetMemberAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedModelGroupConfig)) {
            body.put("allowedModelGroupConfig", request.allowedModelGroupConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowedModels)) {
            body.put("allowedModels", request.allowedModels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterSetMemberAuthorization"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(clientId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/authorization"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterSetMemberAuthorizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the member authorization model for an organization.</p>
     * 
     * @param request ModelRouterSetMemberAuthorizationRequest
     * @return ModelRouterSetMemberAuthorizationResponse
     */
    public ModelRouterSetMemberAuthorizationResponse modelRouterSetMemberAuthorization(String clientId, String id, ModelRouterSetMemberAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterSetMemberAuthorizationWithOptions(clientId, id, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Sets user roles or changes the department to which a user belongs.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets user roles or changes the department to which a user belongs.</p>
     * 
     * @param request ModelRouterSetUserRolesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterSetUserRolesResponse
     */
    public ModelRouterSetUserRolesResponse modelRouterSetUserRolesWithOptions(String id, ModelRouterSetUserRolesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentRoles)) {
            body.put("departmentRoles", request.departmentRoles);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterSetUserRoles"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/users/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/roles"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterSetUserRolesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Sets user roles or changes the department to which a user belongs.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets user roles or changes the department to which a user belongs.</p>
     * 
     * @param request ModelRouterSetUserRolesRequest
     * @return ModelRouterSetUserRolesResponse
     */
    public ModelRouterSetUserRolesResponse modelRouterSetUserRoles(String id, ModelRouterSetUserRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterSetUserRolesWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>组织管理/停止成员订阅</p>
     * 
     * @param request ModelRouterStopMemberSubscriptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterStopMemberSubscriptionResponse
     */
    public ModelRouterStopMemberSubscriptionResponse modelRouterStopMemberSubscriptionWithOptions(String clientId, String id, ModelRouterStopMemberSubscriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.balanceType)) {
            body.put("balanceType", request.balanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterStopMemberSubscription"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(clientId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance/subscription/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterStopMemberSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>组织管理/停止成员订阅</p>
     * 
     * @param request ModelRouterStopMemberSubscriptionRequest
     * @return ModelRouterStopMemberSubscriptionResponse
     */
    public ModelRouterStopMemberSubscriptionResponse modelRouterStopMemberSubscription(String clientId, String id, ModelRouterStopMemberSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterStopMemberSubscriptionWithOptions(clientId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a periodic recharge subscription for customer management.</p>
     * 
     * @param request ModelRouterStopSubscriptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterStopSubscriptionResponse
     */
    public ModelRouterStopSubscriptionResponse modelRouterStopSubscriptionWithOptions(String id, ModelRouterStopSubscriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.balanceType)) {
            body.put("balanceType", request.balanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterStopSubscription"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/balance/subscription/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterStopSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a periodic recharge subscription for customer management.</p>
     * 
     * @param request ModelRouterStopSubscriptionRequest
     * @return ModelRouterStopSubscriptionResponse
     */
    public ModelRouterStopSubscriptionResponse modelRouterStopSubscription(String id, ModelRouterStopSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterStopSubscriptionWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Transfers funds from a department to a member within an organization.</p>
     * 
     * @param request ModelRouterTransferToMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterTransferToMemberResponse
     */
    public ModelRouterTransferToMemberResponse modelRouterTransferToMemberWithOptions(String clientId, String id, ModelRouterTransferToMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            body.put("amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.balanceType)) {
            body.put("balanceType", request.balanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotencyKey)) {
            body.put("idempotencyKey", request.idempotencyKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monthlyQuota)) {
            body.put("monthlyQuota", request.monthlyQuota);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterTransferToMember"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(clientId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/transfer"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterTransferToMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Transfers funds from a department to a member within an organization.</p>
     * 
     * @param request ModelRouterTransferToMemberRequest
     * @return ModelRouterTransferToMemberResponse
     */
    public ModelRouterTransferToMemberResponse modelRouterTransferToMember(String clientId, String id, ModelRouterTransferToMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterTransferToMemberWithOptions(clientId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Billing management/Update billing rules</p>
     * 
     * @param request ModelRouterUpdateBillingRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterUpdateBillingRuleResponse
     */
    public ModelRouterUpdateBillingRuleResponse modelRouterUpdateBillingRuleWithOptions(String id, ModelRouterUpdateBillingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billingType)) {
            body.put("billingType", request.billingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            body.put("effectiveTime", request.effectiveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            body.put("expireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingConfig)) {
            body.put("pricingConfig", request.pricingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterUpdateBillingRule"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/billing/rules/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterUpdateBillingRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Billing management/Update billing rules</p>
     * 
     * @param request ModelRouterUpdateBillingRuleRequest
     * @return ModelRouterUpdateBillingRuleResponse
     */
    public ModelRouterUpdateBillingRuleResponse modelRouterUpdateBillingRule(String id, ModelRouterUpdateBillingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterUpdateBillingRuleWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates customer information.</p>
     * 
     * @param request ModelRouterUpdateClientRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterUpdateClientResponse
     */
    public ModelRouterUpdateClientResponse modelRouterUpdateClientWithOptions(String id, ModelRouterUpdateClientRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowedModelGroupConfig)) {
            body.put("allowedModelGroupConfig", request.allowedModelGroupConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowedModels)) {
            body.put("allowedModels", request.allowedModels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contact)) {
            body.put("contact", request.contact);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discount)) {
            body.put("discount", request.discount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterUpdateClient"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/clients/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterUpdateClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates customer information.</p>
     * 
     * @param request ModelRouterUpdateClientRequest
     * @return ModelRouterUpdateClientResponse
     */
    public ModelRouterUpdateClientResponse modelRouterUpdateClient(String id, ModelRouterUpdateClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterUpdateClientWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Conversation management / Update conversation</p>
     * 
     * @param request ModelRouterUpdateConversationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterUpdateConversationResponse
     */
    public ModelRouterUpdateConversationResponse modelRouterUpdateConversationWithOptions(String id, ModelRouterUpdateConversationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatData)) {
            body.put("chatData", request.chatData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageCount)) {
            body.put("messageCount", request.messageCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelIds)) {
            body.put("modelIds", request.modelIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterUpdateConversation"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/conversations/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterUpdateConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Conversation management / Update conversation</p>
     * 
     * @param request ModelRouterUpdateConversationRequest
     * @return ModelRouterUpdateConversationResponse
     */
    public ModelRouterUpdateConversationResponse modelRouterUpdateConversation(String id, ModelRouterUpdateConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterUpdateConversationWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Model Management / Update Model</p>
     * 
     * @param request ModelRouterUpdateModelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterUpdateModelResponse
     */
    public ModelRouterUpdateModelResponse modelRouterUpdateModelWithOptions(String id, ModelRouterUpdateModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            body.put("apiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baseUrl)) {
            body.put("baseUrl", request.baseUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxInputLength)) {
            body.put("maxInputLength", request.maxInputLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxOutputLength)) {
            body.put("maxOutputLength", request.maxOutputLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            body.put("modelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.symbol)) {
            body.put("symbol", request.symbol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterUpdateModel"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/models/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterUpdateModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Model Management / Update Model</p>
     * 
     * @param request ModelRouterUpdateModelRequest
     * @return ModelRouterUpdateModelResponse
     */
    public ModelRouterUpdateModelResponse modelRouterUpdateModel(String id, ModelRouterUpdateModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterUpdateModelWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Edits a manual group.</p>
     * 
     * <b>summary</b> : 
     * <p>Edits a manual model group.</p>
     * 
     * @param request ModelRouterUpdateModelGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterUpdateModelGroupResponse
     */
    public ModelRouterUpdateModelGroupResponse modelRouterUpdateModelGroupWithOptions(String groupId, ModelRouterUpdateModelGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelList)) {
            body.put("modelList", request.modelList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterUpdateModelGroup"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/model-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterUpdateModelGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Edits a manual group.</p>
     * 
     * <b>summary</b> : 
     * <p>Edits a manual model group.</p>
     * 
     * @param request ModelRouterUpdateModelGroupRequest
     * @return ModelRouterUpdateModelGroupResponse
     */
    public ModelRouterUpdateModelGroupResponse modelRouterUpdateModelGroup(String groupId, ModelRouterUpdateModelGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterUpdateModelGroupWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates user information.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates user information.</p>
     * 
     * @param request ModelRouterUpdateUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelRouterUpdateUserResponse
     */
    public ModelRouterUpdateUserResponse modelRouterUpdateUserWithOptions(String id, ModelRouterUpdateUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelRouterUpdateUser"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/modelRouter/open/users/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelRouterUpdateUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates user information.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates user information.</p>
     * 
     * @param request ModelRouterUpdateUserRequest
     * @return ModelRouterUpdateUserResponse
     */
    public ModelRouterUpdateUserResponse modelRouterUpdateUser(String id, ModelRouterUpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelRouterUpdateUserWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Personalized text-to-image: Create image inference tasks using a pre-trained model.</p>
     * 
     * @param request PersonalizedTextToImageAddInferenceJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PersonalizedTextToImageAddInferenceJobResponse
     */
    public PersonalizedTextToImageAddInferenceJobResponse personalizedTextToImageAddInferenceJobWithOptions(PersonalizedTextToImageAddInferenceJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageNumber)) {
            body.put("imageNumber", request.imageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("imageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seed)) {
            body.put("seed", request.seed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strength)) {
            body.put("strength", request.strength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainSteps)) {
            body.put("trainSteps", request.trainSteps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PersonalizedTextToImageAddInferenceJob"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/personalizedtxt2img/addPreModelInferenceJob"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PersonalizedTextToImageAddInferenceJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Personalized text-to-image: Create image inference tasks using a pre-trained model.</p>
     * 
     * @param request PersonalizedTextToImageAddInferenceJobRequest
     * @return PersonalizedTextToImageAddInferenceJobResponse
     */
    public PersonalizedTextToImageAddInferenceJobResponse personalizedTextToImageAddInferenceJob(PersonalizedTextToImageAddInferenceJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.personalizedTextToImageAddInferenceJobWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the content of an image from the personalized text-to-image service using its unique image ID.</p>
     * 
     * @param request PersonalizedTextToImageQueryImageAssetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PersonalizedTextToImageQueryImageAssetResponse
     */
    public PersonalizedTextToImageQueryImageAssetResponse personalizedTextToImageQueryImageAssetWithOptions(PersonalizedTextToImageQueryImageAssetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encodeFormat)) {
            query.put("encodeFormat", request.encodeFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("imageId", request.imageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PersonalizedTextToImageQueryImageAsset"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/personalizedtxt2img/queryImageAssetFromImageId"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "any")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PersonalizedTextToImageQueryImageAssetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the content of an image from the personalized text-to-image service using its unique image ID.</p>
     * 
     * @param request PersonalizedTextToImageQueryImageAssetRequest
     * @return PersonalizedTextToImageQueryImageAssetResponse
     */
    public PersonalizedTextToImageQueryImageAssetResponse personalizedTextToImageQueryImageAsset(PersonalizedTextToImageQueryImageAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.personalizedTextToImageQueryImageAssetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a personalized text-to-image inference job.</p>
     * 
     * @param request PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse
     */
    public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse personalizedTextToImageQueryPreModelInferenceJobInfoWithOptions(PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inferenceJobId)) {
            query.put("inferenceJobId", request.inferenceJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PersonalizedTextToImageQueryPreModelInferenceJobInfo"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/personalizedtxt2img/queryPreModelInferenceJobInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a personalized text-to-image inference job.</p>
     * 
     * @param request PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest
     * @return PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse
     */
    public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse personalizedTextToImageQueryPreModelInferenceJobInfo(PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.personalizedTextToImageQueryPreModelInferenceJobInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an inference job to generate images based on a personalized text-to-image model.</p>
     * 
     * @param request Personalizedtxt2imgAddInferenceJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return Personalizedtxt2imgAddInferenceJobResponse
     */
    public Personalizedtxt2imgAddInferenceJobResponse personalizedtxt2imgAddInferenceJobWithOptions(Personalizedtxt2imgAddInferenceJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageNumber)) {
            body.put("imageNumber", request.imageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seed)) {
            body.put("seed", request.seed);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Personalizedtxt2imgAddInferenceJob"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/personalizedtxt2img/addInferenceJob"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Personalizedtxt2imgAddInferenceJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an inference job to generate images based on a personalized text-to-image model.</p>
     * 
     * @param request Personalizedtxt2imgAddInferenceJobRequest
     * @return Personalizedtxt2imgAddInferenceJobResponse
     */
    public Personalizedtxt2imgAddInferenceJobResponse personalizedtxt2imgAddInferenceJob(Personalizedtxt2imgAddInferenceJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.personalizedtxt2imgAddInferenceJobWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Personalized text-to-image: Create a model training task.</p>
     * 
     * @param request Personalizedtxt2imgAddModelTrainJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return Personalizedtxt2imgAddModelTrainJobResponse
     */
    public Personalizedtxt2imgAddModelTrainJobResponse personalizedtxt2imgAddModelTrainJobWithOptions(Personalizedtxt2imgAddModelTrainJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("imageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            body.put("objectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainSteps)) {
            body.put("trainSteps", request.trainSteps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Personalizedtxt2imgAddModelTrainJob"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/personalizedtxt2img/addModelTrainJob"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Personalizedtxt2imgAddModelTrainJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Personalized text-to-image: Create a model training task.</p>
     * 
     * @param request Personalizedtxt2imgAddModelTrainJobRequest
     * @return Personalizedtxt2imgAddModelTrainJobResponse
     */
    public Personalizedtxt2imgAddModelTrainJobResponse personalizedtxt2imgAddModelTrainJob(Personalizedtxt2imgAddModelTrainJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.personalizedtxt2imgAddModelTrainJobWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the binary data of an image generated by the personalized text-to-image service.</p>
     * 
     * @param request Personalizedtxt2imgQueryImageAssetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return Personalizedtxt2imgQueryImageAssetResponse
     */
    public Personalizedtxt2imgQueryImageAssetResponse personalizedtxt2imgQueryImageAssetWithOptions(Personalizedtxt2imgQueryImageAssetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encodeFormat)) {
            query.put("encodeFormat", request.encodeFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("imageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptId)) {
            query.put("promptId", request.promptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Personalizedtxt2imgQueryImageAsset"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/personalizedtxt2img/queryImageAsset"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "any")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Personalizedtxt2imgQueryImageAssetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the binary data of an image generated by the personalized text-to-image service.</p>
     * 
     * @param request Personalizedtxt2imgQueryImageAssetRequest
     * @return Personalizedtxt2imgQueryImageAssetResponse
     */
    public Personalizedtxt2imgQueryImageAssetResponse personalizedtxt2imgQueryImageAsset(Personalizedtxt2imgQueryImageAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.personalizedtxt2imgQueryImageAssetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the status and results of a Personalizedtxt2img inference job.</p>
     * 
     * @param request Personalizedtxt2imgQueryInferenceJobInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return Personalizedtxt2imgQueryInferenceJobInfoResponse
     */
    public Personalizedtxt2imgQueryInferenceJobInfoResponse personalizedtxt2imgQueryInferenceJobInfoWithOptions(Personalizedtxt2imgQueryInferenceJobInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inferenceJobId)) {
            query.put("inferenceJobId", request.inferenceJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Personalizedtxt2imgQueryInferenceJobInfo"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/personalizedtxt2img/queryInferenceJobInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Personalizedtxt2imgQueryInferenceJobInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the status and results of a Personalizedtxt2img inference job.</p>
     * 
     * @param request Personalizedtxt2imgQueryInferenceJobInfoRequest
     * @return Personalizedtxt2imgQueryInferenceJobInfoResponse
     */
    public Personalizedtxt2imgQueryInferenceJobInfoResponse personalizedtxt2imgQueryInferenceJobInfo(Personalizedtxt2imgQueryInferenceJobInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.personalizedtxt2imgQueryInferenceJobInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Your personalized model training tasks: image generation and query models.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return Personalizedtxt2imgQueryModelTrainJobListResponse
     */
    public Personalizedtxt2imgQueryModelTrainJobListResponse personalizedtxt2imgQueryModelTrainJobListWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Personalizedtxt2imgQueryModelTrainJobList"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/personalizedtxt2img/queryModelTrainJobList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Personalizedtxt2imgQueryModelTrainJobListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Your personalized model training tasks: image generation and query models.</p>
     * @return Personalizedtxt2imgQueryModelTrainJobListResponse
     */
    public Personalizedtxt2imgQueryModelTrainJobListResponse personalizedtxt2imgQueryModelTrainJobList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.personalizedtxt2imgQueryModelTrainJobListWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the training status of a personalized text-to-image model.</p>
     * 
     * @param request Personalizedtxt2imgQueryModelTrainStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return Personalizedtxt2imgQueryModelTrainStatusResponse
     */
    public Personalizedtxt2imgQueryModelTrainStatusResponse personalizedtxt2imgQueryModelTrainStatusWithOptions(Personalizedtxt2imgQueryModelTrainStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("modelId", request.modelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Personalizedtxt2imgQueryModelTrainStatus"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/personalizedtxt2img/queryModelTrainStatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Personalizedtxt2imgQueryModelTrainStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the training status of a personalized text-to-image model.</p>
     * 
     * @param request Personalizedtxt2imgQueryModelTrainStatusRequest
     * @return Personalizedtxt2imgQueryModelTrainStatusResponse
     */
    public Personalizedtxt2imgQueryModelTrainStatusResponse personalizedtxt2imgQueryModelTrainStatus(Personalizedtxt2imgQueryModelTrainStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.personalizedtxt2imgQueryModelTrainStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about an application access ID (appkey).</p>
     * 
     * @param request QueryApplicationAccessIdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryApplicationAccessIdResponse
     */
    public QueryApplicationAccessIdResponse queryApplicationAccessIdWithOptions(QueryApplicationAccessIdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationAccessId)) {
            query.put("applicationAccessId", request.applicationAccessId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryApplicationAccessId"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aliyunConsole/queryApplicationAccessId"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryApplicationAccessIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about an application access ID (appkey).</p>
     * 
     * @param request QueryApplicationAccessIdRequest
     * @return QueryApplicationAccessIdResponse
     */
    public QueryApplicationAccessIdResponse queryApplicationAccessId(QueryApplicationAccessIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationAccessIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud console / Project list</p>
     * 
     * @param request QueryProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryProjectResponse
     */
    public QueryProjectResponse queryProjectWithOptions(QueryProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("projectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryProject"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aliyunConsole/queryProject"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud console / Project list</p>
     * 
     * @param request QueryProjectRequest
     * @return QueryProjectResponse
     */
    public QueryProjectResponse queryProject(QueryProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud console / Project List</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryProjectListResponse
     */
    public QueryProjectListResponse queryProjectListWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryProjectList"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aliyunConsole/queryProjectList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryProjectListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud console / Project List</p>
     * @return QueryProjectListResponse
     */
    public QueryProjectListResponse queryProjectList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryProjectListWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud Console / Purchased Services</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPurchasedServiceResponse
     */
    public QueryPurchasedServiceResponse queryPurchasedServiceWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPurchasedService"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aliyunConsole/queryPurchasedService"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPurchasedServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud Console / Purchased Services</p>
     * @return QueryPurchasedServiceResponse
     */
    public QueryPurchasedServiceResponse queryPurchasedService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPurchasedServiceWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud Console / Update project information</p>
     * 
     * @param request UpdateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProjectWithOptions(UpdateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("projectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aliyunConsole/updateProject"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud Console / Update project information</p>
     * 
     * @param request UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectWithOptions(request, headers, runtime);
    }
}
