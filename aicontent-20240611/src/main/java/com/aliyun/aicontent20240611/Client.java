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
            new TeaPair("pathname", "/api/v1/aliyunconsole/queryAliyunConsoleServiceList"),
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
}
