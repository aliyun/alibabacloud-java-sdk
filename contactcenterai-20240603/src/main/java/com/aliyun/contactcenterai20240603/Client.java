// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603;

import com.aliyun.tea.*;
import com.aliyun.contactcenterai20240603.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("contactcenterai", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>根据类型调用大模型</p>
     * 
     * @param request AnalyzeConversationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AnalyzeConversationResponse
     */
    public AnalyzeConversationResponse analyzeConversationWithOptions(String workspaceId, String appId, AnalyzeConversationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryTags)) {
            body.put("categoryTags", request.categoryTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPrompt)) {
            body.put("customPrompt", request.customPrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogue)) {
            body.put("dialogue", request.dialogue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.examples)) {
            body.put("examples", request.examples);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCode)) {
            body.put("modelCode", request.modelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultTypes)) {
            body.put("resultTypes", request.resultTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            body.put("sceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInspection)) {
            body.put("serviceInspection", request.serviceInspection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCallerUid)) {
            body.put("sourceCallerUid", request.sourceCallerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeConstraintList)) {
            body.put("timeConstraintList", request.timeConstraintList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userProfiles)) {
            body.put("userProfiles", request.userProfiles);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AnalyzeConversation"),
            new TeaPair("version", "2024-06-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/ccai/app/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/analyze_conversation"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AnalyzeConversationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AnalyzeConversationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据类型调用大模型</p>
     * 
     * @param request AnalyzeConversationRequest
     * @return AnalyzeConversationResponse
     */
    public AnalyzeConversationResponse analyzeConversation(String workspaceId, String appId, AnalyzeConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.analyzeConversationWithOptions(workspaceId, appId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片分析</p>
     * 
     * @param request AnalyzeImageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AnalyzeImageResponse
     */
    public AnalyzeImageResponse analyzeImageWithOptions(String workspaceId, String appId, AnalyzeImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrls)) {
            body.put("imageUrls", request.imageUrls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultTypes)) {
            body.put("resultTypes", request.resultTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AnalyzeImage"),
            new TeaPair("version", "2024-06-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/ccai/app/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/analyzeImage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AnalyzeImageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AnalyzeImageResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>图片分析</p>
     * 
     * @param request AnalyzeImageRequest
     * @return AnalyzeImageResponse
     */
    public AnalyzeImageResponse analyzeImage(String workspaceId, String appId, AnalyzeImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.analyzeImageWithOptions(workspaceId, appId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建语音文件调用llm任务</p>
     * 
     * @param request CreateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTaskWithOptions(String workspaceId, String appId, CreateTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customPrompt)) {
            body.put("customPrompt", request.customPrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogue)) {
            body.put("dialogue", request.dialogue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.examples)) {
            body.put("examples", request.examples);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCode)) {
            body.put("modelCode", request.modelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultTypes)) {
            body.put("resultTypes", request.resultTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInspection)) {
            body.put("serviceInspection", request.serviceInspection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("taskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateIds)) {
            body.put("templateIds", request.templateIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transcription)) {
            body.put("transcription", request.transcription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTask"),
            new TeaPair("version", "2024-06-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/ccai/app/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/createTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建语音文件调用llm任务</p>
     * 
     * @param request CreateTaskRequest
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(String workspaceId, String appId, CreateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTaskWithOptions(workspaceId, appId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建热词</p>
     * 
     * @param request CreateVocabRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVocabResponse
     */
    public CreateVocabResponse createVocabWithOptions(CreateVocabRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioModelCode)) {
            body.put("audioModelCode", request.audioModelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wordWeightList)) {
            body.put("wordWeightList", request.wordWeightList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVocab"),
            new TeaPair("version", "2024-06-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/vocab/createVocab"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVocabResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateVocabResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建热词</p>
     * 
     * @param request CreateVocabRequest
     * @return CreateVocabResponse
     */
    public CreateVocabResponse createVocab(CreateVocabRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVocabWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删删除热词</p>
     * 
     * @param request DeleteVocabRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVocabResponse
     */
    public DeleteVocabResponse deleteVocabWithOptions(DeleteVocabRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vocabularyId)) {
            body.put("vocabularyId", request.vocabularyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVocab"),
            new TeaPair("version", "2024-06-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/vocab/deleteVocab"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVocabResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteVocabResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删删除热词</p>
     * 
     * @param request DeleteVocabRequest
     * @return DeleteVocabResponse
     */
    public DeleteVocabResponse deleteVocab(DeleteVocabRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVocabWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>语音文件调用大模型获取结果</p>
     * 
     * @param tmpReq GetTaskResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResultResponse
     */
    public GetTaskResultResponse getTaskResultWithOptions(GetTaskResultRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetTaskResultShrinkRequest request = new GetTaskResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.requiredFieldList)) {
            request.requiredFieldListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.requiredFieldList, "requiredFieldList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requiredFieldListShrink)) {
            query.put("requiredFieldList", request.requiredFieldListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskResult"),
            new TeaPair("version", "2024-06-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ccai/app/getTaskResult"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResultResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetTaskResultResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>语音文件调用大模型获取结果</p>
     * 
     * @param request GetTaskResultRequest
     * @return GetTaskResultResponse
     */
    public GetTaskResultResponse getTaskResult(GetTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取热词</p>
     * 
     * @param request GetVocabRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVocabResponse
     */
    public GetVocabResponse getVocabWithOptions(GetVocabRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vocabularyId)) {
            body.put("vocabularyId", request.vocabularyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVocab"),
            new TeaPair("version", "2024-06-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/vocab/getVocab"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetVocabResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetVocabResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取热词</p>
     * 
     * @param request GetVocabRequest
     * @return GetVocabResponse
     */
    public GetVocabResponse getVocab(GetVocabRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVocabWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>热词列表</p>
     * 
     * @param request ListVocabRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVocabResponse
     */
    public ListVocabResponse listVocabWithOptions(ListVocabRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVocab"),
            new TeaPair("version", "2024-06-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/vocab/listVocab"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListVocabResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListVocabResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>热词列表</p>
     * 
     * @param request ListVocabRequest
     * @return ListVocabResponse
     */
    public ListVocabResponse listVocab(ListVocabRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVocabWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CCAI服务面API</p>
     * 
     * @param request RunCompletionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunCompletionResponse
     */
    public RunCompletionResponse runCompletionWithOptions(String workspaceId, String appId, RunCompletionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dialogue)) {
            body.put("Dialogue", request.dialogue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCode)) {
            body.put("ModelCode", request.modelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInspection)) {
            body.put("ServiceInspection", request.serviceInspection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("Stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateIds)) {
            body.put("TemplateIds", request.templateIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCompletion"),
            new TeaPair("version", "2024-06-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/ccai/app/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/completion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RunCompletionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RunCompletionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>CCAI服务面API</p>
     * 
     * @param request RunCompletionRequest
     * @return RunCompletionResponse
     */
    public RunCompletionResponse runCompletion(String workspaceId, String appId, RunCompletionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runCompletionWithOptions(workspaceId, appId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CCAI服务面API</p>
     * 
     * @param request RunCompletionMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunCompletionMessageResponse
     */
    public RunCompletionMessageResponse runCompletionMessageWithOptions(String workspaceId, String appId, RunCompletionMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("Messages", request.messages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCode)) {
            body.put("ModelCode", request.modelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("Stream", request.stream);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCompletionMessage"),
            new TeaPair("version", "2024-06-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/ccai/app/" + com.aliyun.openapiutil.Client.getEncodeParam(appId) + "/completion_message"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RunCompletionMessageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RunCompletionMessageResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>CCAI服务面API</p>
     * 
     * @param request RunCompletionMessageRequest
     * @return RunCompletionMessageResponse
     */
    public RunCompletionMessageResponse runCompletionMessage(String workspaceId, String appId, RunCompletionMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runCompletionMessageWithOptions(workspaceId, appId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改热词</p>
     * 
     * @param request UpdateVocabRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVocabResponse
     */
    public UpdateVocabResponse updateVocabWithOptions(UpdateVocabRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vocabularyId)) {
            body.put("vocabularyId", request.vocabularyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wordWeightList)) {
            body.put("wordWeightList", request.wordWeightList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVocab"),
            new TeaPair("version", "2024-06-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/vocab/updateVocab"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVocabResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateVocabResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修改热词</p>
     * 
     * @param request UpdateVocabRequest
     * @return UpdateVocabResponse
     */
    public UpdateVocabResponse updateVocab(UpdateVocabRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateVocabWithOptions(request, headers, runtime);
    }
}
