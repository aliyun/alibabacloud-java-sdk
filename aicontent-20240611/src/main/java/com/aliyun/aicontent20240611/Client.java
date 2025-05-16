// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611;

import com.aliyun.tea.*;
import com.aliyun.aicontent20240611.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
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
     * <p>拓展练问答对生成</p>
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
     * <p>拓展练问答对生成</p>
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
     * <p>同步基础练问答对生成</p>
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
     * <p>同步基础练问答对生成</p>
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
     * <p>阿里云控制台/列出阿里云控制台上可使用的服务列表</p>
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
     * <p>阿里云控制台/列出阿里云控制台上可使用的服务列表</p>
     * @return AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse
     */
    public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse aliyunConsoleOpenApiQueryAliyunConsoleServcieList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aliyunConsoleOpenApiQueryAliyunConsoleServcieListWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>阿里云控制台/列出阿里云控制台上可使用的服务列表</p>
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
     * <p>阿里云控制台/列出阿里云控制台上可使用的服务列表</p>
     * @return AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse
     */
    public AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse aliyunConsoleOpenApiQueryAliyunConsoleServiceList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aliyunConsoleOpenApiQueryAliyunConsoleServiceListWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>智能批改/口语评测/统计/调用量</p>
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
     * <p>智能批改/口语评测/统计/调用量</p>
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
     * <p>智能批改/口语评测/统计/并发数</p>
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
     * <p>智能批改/口语评测/统计/并发数</p>
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
     * <p>智能批改/口语评测/统计/调用错误</p>
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
     * <p>智能批改/口语评测/统计/调用错误</p>
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
     * <p>阿里云控制台/授权凭证创建</p>
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
     * <p>阿里云控制台/授权凭证创建</p>
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
     * <p>阿里云控制台/创建项目</p>
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
     * <p>阿里云控制台/创建项目</p>
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
     * <p>中文作文辅导</p>
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
     * <p>中文作文辅导</p>
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
     * <p>英语作文辅导</p>
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
     * <p>英语作文辅导</p>
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
     * <p>英文释义</p>
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
     * <p>英文释义</p>
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
     * <p>进行拓展练对话</p>
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
     * <p>进行拓展练对话</p>
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
     * <p>拓展练根据上下文进行润色</p>
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
     * <p>拓展练根据上下文进行润色</p>
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
     * <p>拓展练语境翻译</p>
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
     * <p>拓展练语境翻译</p>
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
     * <p>语法检测</p>
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
     * <p>语法检测</p>
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
     * <p>进行同步练对话</p>
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
     * <p>进行同步练对话</p>
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
     * <p>同步练语境翻译</p>
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
     * <p>同步练语境翻译</p>
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
     * <p>十万个为什么对话接入</p>
     * 
     * @param request ExecuteHundredThousandWhysDialogueRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteHundredThousandWhysDialogueResponse
     */
    public ExecuteHundredThousandWhysDialogueResponse executeHundredThousandWhysDialogueWithOptions(ExecuteHundredThousandWhysDialogueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ageGroup)) {
            body.put("ageGroup", request.ageGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("chatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("deviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.macAddress)) {
            body.put("macAddress", request.macAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("messages", request.messages);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteHundredThousandWhysDialogue"),
            new TeaPair("version", "20240611"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/api/v1/intelligentAgent/tenWWhys/executeDialogue"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteHundredThousandWhysDialogueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>十万个为什么对话接入</p>
     * 
     * @param request ExecuteHundredThousandWhysDialogueRequest
     * @return ExecuteHundredThousandWhysDialogueResponse
     */
    public ExecuteHundredThousandWhysDialogueResponse executeHundredThousandWhysDialogue(ExecuteHundredThousandWhysDialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeHundredThousandWhysDialogueWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>进行AI对话</p>
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
     * <p>进行AI对话</p>
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
     * <p>调整难度</p>
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
     * <p>调整难度</p>
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
     * <p>语法检测</p>
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
     * <p>语法检测</p>
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
     * <p>句子润色</p>
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
     * <p>句子润色</p>
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
     * <p>对话重试</p>
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
     * <p>对话重试</p>
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
     * <p>进行对话-流式输出</p>
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
     * <p>进行对话-流式输出</p>
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
     * <p>开启自由对话</p>
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
     * <p>开启自由对话</p>
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
     * <p>获取鉴权参数</p>
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
     * <p>获取鉴权参数</p>
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
     * <p>翻译消息内容</p>
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
     * <p>翻译消息内容</p>
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
     * <p>拓展练小助手</p>
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
     * <p>拓展练小助手</p>
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
     * <p>同步练小助手</p>
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
     * <p>同步练小助手</p>
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
     * <p>获取请求鉴权参数</p>
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
     * <p>获取请求鉴权参数</p>
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
     * <p>批量获取文章详情</p>
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
     * <p>批量获取文章详情</p>
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
     * <p>获取文章列表</p>
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
     * <p>获取文章列表</p>
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
     * <p>获取书本下的目录信息</p>
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
     * <p>获取书本下的目录信息</p>
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
     * <p>获取包含年级下的书本列表</p>
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
     * <p>获取包含年级下的书本列表</p>
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
     * <p>获取有资源的年级信息</p>
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
     * <p>获取有资源的年级信息</p>
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
     * <p>获取文章内容详情</p>
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
     * <p>获取文章内容详情</p>
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
     * <b>summary</b> : 
     * <p>个性化文生图/基于一个预训练模型创建图片推理任务</p>
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
     * <p>个性化文生图/基于一个预训练模型创建图片推理任务</p>
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
     * <p>个性化文生图/通过唯一的图片编号获取图片内容</p>
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
     * <p>个性化文生图/通过唯一的图片编号获取图片内容</p>
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
     * <p>个性化文生图/查询预制模型推理任务的状态</p>
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
     * <p>个性化文生图/查询预制模型推理任务的状态</p>
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
     * <p>个性化文生图/基于一个模型创建图片推理任务</p>
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
     * <p>个性化文生图/基于一个模型创建图片推理任务</p>
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
     * <p>个性化文生图/创建一个模型训练任务</p>
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
     * <p>个性化文生图/创建一个模型训练任务</p>
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
     * <p>个性化文生图/图片二进制内容获取</p>
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
     * <p>个性化文生图/图片二进制内容获取</p>
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
     * <p>个性化文生图/查询模型推理任务的状态和结果信息</p>
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
     * <p>个性化文生图/查询模型推理任务的状态和结果信息</p>
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
     * <p>个性化文生图/查询模型训练任务列表</p>
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
     * <p>个性化文生图/查询模型训练任务列表</p>
     * @return Personalizedtxt2imgQueryModelTrainJobListResponse
     */
    public Personalizedtxt2imgQueryModelTrainJobListResponse personalizedtxt2imgQueryModelTrainJobList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.personalizedtxt2imgQueryModelTrainJobListWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>个性化文生图/模型训练状态查询</p>
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
     * <p>个性化文生图/模型训练状态查询</p>
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
     * <p>阿里云控制台/获取应用访问识别码(appkey)信息</p>
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
     * <p>阿里云控制台/获取应用访问识别码(appkey)信息</p>
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
     * <p>阿里云控制台/获取项目列表</p>
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
     * <p>阿里云控制台/获取项目列表</p>
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
     * <p>阿里云控制台/获取项目列表</p>
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
     * <p>阿里云控制台/获取项目列表</p>
     * @return QueryProjectListResponse
     */
    public QueryProjectListResponse queryProjectList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryProjectListWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>阿里云控制台/已经购买过的服务项目</p>
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
     * <p>阿里云控制台/已经购买过的服务项目</p>
     * @return QueryPurchasedServiceResponse
     */
    public QueryPurchasedServiceResponse queryPurchasedService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPurchasedServiceWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>阿里云控制台/更新项目信息</p>
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
     * <p>阿里云控制台/更新项目信息</p>
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
