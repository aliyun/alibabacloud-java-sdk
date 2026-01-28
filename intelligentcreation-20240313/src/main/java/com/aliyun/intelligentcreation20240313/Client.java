// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313;

import com.aliyun.tea.*;
import com.aliyun.intelligentcreation20240313.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("intelligentcreation", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>添加文案反馈</p>
     * 
     * @param request AddTextFeedbackRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTextFeedbackResponse
     */
    public AddTextFeedbackResponse addTextFeedbackWithOptions(AddTextFeedbackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quality)) {
            body.put("quality", request.quality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textId)) {
            body.put("textId", request.textId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTextFeedback"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/addTextFeedback"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTextFeedbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加文案反馈</p>
     * 
     * @param request AddTextFeedbackRequest
     * @return AddTextFeedbackResponse
     */
    public AddTextFeedbackResponse addTextFeedback(AddTextFeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addTextFeedbackWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量添加知识文档</p>
     * 
     * @param request BatchAddDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchAddDocumentResponse
     */
    public BatchAddDocumentResponse batchAddDocumentWithOptions(String knowledgeBaseId, BatchAddDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addDocumentInfos)) {
            body.put("addDocumentInfos", request.addDocumentInfos);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAddDocument"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/knowledge-base/" + com.aliyun.openapiutil.Client.getEncodeParam(knowledgeBaseId) + "/documents"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAddDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量添加知识文档</p>
     * 
     * @param request BatchAddDocumentRequest
     * @return BatchAddDocumentResponse
     */
    public BatchAddDocumentResponse batchAddDocument(String knowledgeBaseId, BatchAddDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchAddDocumentWithOptions(knowledgeBaseId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量发布剧本任务</p>
     * 
     * @param request BatchCreateAICoachTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCreateAICoachTaskResponse
     */
    public BatchCreateAICoachTaskResponse batchCreateAICoachTaskWithOptions(BatchCreateAICoachTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptRecordId)) {
            body.put("scriptRecordId", request.scriptRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.studentIds)) {
            body.put("studentIds", request.studentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.studentList)) {
            body.put("studentList", request.studentList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreateAICoachTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/batchCreateTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreateAICoachTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量发布剧本任务</p>
     * 
     * @param request BatchCreateAICoachTaskRequest
     * @return BatchCreateAICoachTaskResponse
     */
    public BatchCreateAICoachTaskResponse batchCreateAICoachTask(BatchCreateAICoachTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchCreateAICoachTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除对练任务</p>
     * 
     * @param tmpReq BatchDeletePracticeTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeletePracticeTaskResponse
     */
    public BatchDeletePracticeTaskResponse batchDeletePracticeTaskWithOptions(BatchDeletePracticeTaskRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchDeletePracticeTaskShrinkRequest request = new BatchDeletePracticeTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskIds)) {
            request.taskIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskIds, "taskIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("idempotentId", request.idempotentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIdsShrink)) {
            query.put("taskIds", request.taskIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeletePracticeTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/batchDeletePracticeTask"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeletePracticeTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除对练任务</p>
     * 
     * @param request BatchDeletePracticeTaskRequest
     * @return BatchDeletePracticeTaskResponse
     */
    public BatchDeletePracticeTaskResponse batchDeletePracticeTask(BatchDeletePracticeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchDeletePracticeTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询项目信息</p>
     * 
     * @param tmpReq BatchGetProjectTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetProjectTaskResponse
     */
    public BatchGetProjectTaskResponse batchGetProjectTaskWithOptions(BatchGetProjectTaskRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchGetProjectTaskShrinkRequest request = new BatchGetProjectTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskIdList)) {
            request.taskIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskIdList, "taskIdList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskIdListShrink)) {
            query.put("taskIdList", request.taskIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetProjectTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/digitalHuman/project/batchGetProjectTask"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetProjectTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询项目信息</p>
     * 
     * @param request BatchGetProjectTaskRequest
     * @return BatchGetProjectTaskResponse
     */
    public BatchGetProjectTaskResponse batchGetProjectTask(BatchGetProjectTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGetProjectTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询声音复刻任务</p>
     * 
     * @param tmpReq BatchGetTrainTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetTrainTaskResponse
     */
    public BatchGetTrainTaskResponse batchGetTrainTaskWithOptions(BatchGetTrainTaskRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchGetTrainTaskShrinkRequest request = new BatchGetTrainTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskIdList)) {
            request.taskIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskIdList, "taskIdList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunMainId)) {
            query.put("aliyunMainId", request.aliyunMainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIdListShrink)) {
            query.put("taskIdList", request.taskIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetTrainTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/train/task/batchGetTrainTaskInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetTrainTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询声音复刻任务</p>
     * 
     * @param request BatchGetTrainTaskRequest
     * @return BatchGetTrainTaskResponse
     */
    public BatchGetTrainTaskResponse batchGetTrainTask(BatchGetTrainTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGetTrainTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询视频切片任务信息</p>
     * 
     * @param tmpReq BatchGetVideoClipTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetVideoClipTaskResponse
     */
    public BatchGetVideoClipTaskResponse batchGetVideoClipTaskWithOptions(BatchGetVideoClipTaskRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchGetVideoClipTaskShrinkRequest request = new BatchGetVideoClipTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskIdList)) {
            request.taskIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskIdList, "taskIdList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskIdListShrink)) {
            query.put("taskIdList", request.taskIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetVideoClipTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/video/clip/batchGetVideoClipTask"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetVideoClipTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询视频切片任务信息</p>
     * 
     * @param request BatchGetVideoClipTaskRequest
     * @return BatchGetVideoClipTaskResponse
     */
    public BatchGetVideoClipTaskResponse batchGetVideoClipTask(BatchGetVideoClipTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGetVideoClipTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询文案</p>
     * 
     * @param tmpReq BatchQueryIndividuationTextRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchQueryIndividuationTextResponse
     */
    public BatchQueryIndividuationTextResponse batchQueryIndividuationTextWithOptions(BatchQueryIndividuationTextRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchQueryIndividuationTextShrinkRequest request = new BatchQueryIndividuationTextShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.textIdList)) {
            request.textIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.textIdList, "textIdList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.textIdListShrink)) {
            query.put("textIdList", request.textIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchQueryIndividuationText"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/individuationText/batchQueryText"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchQueryIndividuationTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询文案</p>
     * 
     * @param request BatchQueryIndividuationTextRequest
     * @return BatchQueryIndividuationTextResponse
     */
    public BatchQueryIndividuationTextResponse batchQueryIndividuationText(BatchQueryIndividuationTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchQueryIndividuationTextWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>快速发布剧本</p>
     * 
     * @param request BuildAICoachScriptRecordRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BuildAICoachScriptRecordResponse
     */
    public BuildAICoachScriptRecordResponse buildAICoachScriptRecordWithOptions(BuildAICoachScriptRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scriptJsonUrl)) {
            body.put("scriptJsonUrl", request.scriptJsonUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BuildAICoachScriptRecord"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/buildScriptRecord"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BuildAICoachScriptRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>快速发布剧本</p>
     * 
     * @param request BuildAICoachScriptRecordRequest
     * @return BuildAICoachScriptRecordResponse
     */
    public BuildAICoachScriptRecordResponse buildAICoachScriptRecord(BuildAICoachScriptRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.buildAICoachScriptRecordWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查会话状态</p>
     * 
     * @param request CheckSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckSessionResponse
     */
    public CheckSessionResponse checkSessionWithOptions(CheckSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSession"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/checkSession"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查会话状态</p>
     * 
     * @param request CheckSessionRequest
     * @return CheckSessionResponse
     */
    public CheckSessionResponse checkSession(CheckSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>学员关闭会话</p>
     * 
     * @param request CloseAICoachTaskSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseAICoachTaskSessionResponse
     */
    public CloseAICoachTaskSessionResponse closeAICoachTaskSessionWithOptions(CloseAICoachTaskSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            body.put("uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseAICoachTaskSession"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/closeSession"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseAICoachTaskSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>学员关闭会话</p>
     * 
     * @param request CloseAICoachTaskSessionRequest
     * @return CloseAICoachTaskSessionResponse
     */
    public CloseAICoachTaskSessionResponse closeAICoachTaskSession(CloseAICoachTaskSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeAICoachTaskSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文本数量统计</p>
     * 
     * @param request CountTextRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CountTextResponse
     */
    public CountTextResponse countTextWithOptions(CountTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.generationSource)) {
            query.put("generationSource", request.generationSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishStatus)) {
            query.put("publishStatus", request.publishStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.style)) {
            query.put("style", request.style);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CountText"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/countText"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CountTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文本数量统计</p>
     * 
     * @param request CountTextRequest
     * @return CountTextResponse
     */
    public CountTextResponse countText(CountTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countTextWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询剧本列表</p>
     * 
     * @param request CreateAICoachTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAICoachTaskResponse
     */
    public CreateAICoachTaskResponse createAICoachTaskWithOptions(CreateAICoachTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptRecordId)) {
            body.put("scriptRecordId", request.scriptRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.studentAudioUrl)) {
            body.put("studentAudioUrl", request.studentAudioUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.studentId)) {
            body.put("studentId", request.studentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAICoachTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/createTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAICoachTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询剧本列表</p>
     * 
     * @param request CreateAICoachTaskRequest
     * @return CreateAICoachTaskResponse
     */
    public CreateAICoachTaskResponse createAICoachTask(CreateAICoachTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAICoachTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>学员开启对练会话</p>
     * 
     * @param request CreateAICoachTaskSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAICoachTaskSessionResponse
     */
    public CreateAICoachTaskSessionResponse createAICoachTaskSessionWithOptions(CreateAICoachTaskSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            body.put("uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAICoachTaskSession"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/startSession"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAICoachTaskSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>学员开启对练会话</p>
     * 
     * @param request CreateAICoachTaskSessionRequest
     * @return CreateAICoachTaskSessionResponse
     */
    public CreateAICoachTaskSessionResponse createAICoachTaskSession(CreateAICoachTaskSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAICoachTaskSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateAgent</p>
     * 
     * @param request CreateAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentResponse
     */
    public CreateAgentResponse createAgentWithOptions(CreateAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentIconUrl)) {
            body.put("agentIconUrl", request.agentIconUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            body.put("agentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentScene)) {
            body.put("agentScene", request.agentScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.characterAgeStage)) {
            body.put("characterAgeStage", request.characterAgeStage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.characterGender)) {
            body.put("characterGender", request.characterGender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.characterName)) {
            body.put("characterName", request.characterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraDescription)) {
            body.put("extraDescription", request.extraDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            body.put("industry", request.industry);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgent"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/agent/createAgent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateAgent</p>
     * 
     * @param request CreateAgentRequest
     * @return CreateAgentResponse
     */
    public CreateAgentResponse createAgent(CreateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAgentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建照片数字人</p>
     * 
     * @param request CreateAnchorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAnchorResponse
     */
    public CreateAnchorResponse createAnchorWithOptions(CreateAnchorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anchorCategory)) {
            body.put("anchorCategory", request.anchorCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.anchorMaterialName)) {
            body.put("anchorMaterialName", request.anchorMaterialName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverUrl)) {
            body.put("coverUrl", request.coverUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalHumanType)) {
            body.put("digitalHumanType", request.digitalHumanType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            body.put("gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useScene)) {
            body.put("useScene", request.useScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoOssKey)) {
            body.put("videoOssKey", request.videoOssKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAnchor"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/digitalHuman/anchorOpen/createAnchor"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAnchorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建照片数字人</p>
     * 
     * @param request CreateAnchorRequest
     * @return CreateAnchorResponse
     */
    public CreateAnchorResponse createAnchor(CreateAnchorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAnchorWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建配图生成任务</p>
     * 
     * @param request CreateIllustrationTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIllustrationTaskResponse
     */
    public CreateIllustrationTaskResponse createIllustrationTaskWithOptions(String textId, CreateIllustrationTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIllustrationTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/texts/" + com.aliyun.openapiutil.Client.getEncodeParam(textId) + "/illustrationTasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIllustrationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建配图生成任务</p>
     * 
     * @param request CreateIllustrationTaskRequest
     * @return CreateIllustrationTaskResponse
     */
    public CreateIllustrationTaskResponse createIllustrationTask(String textId, CreateIllustrationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIllustrationTaskWithOptions(textId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建个性化文案项目</p>
     * 
     * @param request CreateIndividuationProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIndividuationProjectResponse
     */
    public CreateIndividuationProjectResponse createIndividuationProjectWithOptions(CreateIndividuationProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectInfo)) {
            body.put("projectInfo", request.projectInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("projectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purpose)) {
            body.put("purpose", request.purpose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("sceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIndividuationProject"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/individuationText/createProject"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIndividuationProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建个性化文案项目</p>
     * 
     * @param request CreateIndividuationProjectRequest
     * @return CreateIndividuationProjectResponse
     */
    public CreateIndividuationProjectResponse createIndividuationProject(CreateIndividuationProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIndividuationProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建个性化文案任务</p>
     * 
     * @param request CreateIndividuationTextTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIndividuationTextTaskResponse
     */
    public CreateIndividuationTextTaskResponse createIndividuationTextTaskWithOptions(CreateIndividuationTextTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crowdPack)) {
            body.put("crowdPack", request.crowdPack);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("taskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIndividuationTextTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/individuationText/createTextTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIndividuationTextTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建个性化文案任务</p>
     * 
     * @param request CreateIndividuationTextTaskRequest
     * @return CreateIndividuationTextTaskResponse
     */
    public CreateIndividuationTextTaskResponse createIndividuationTextTask(CreateIndividuationTextTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIndividuationTextTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建产品图</p>
     * 
     * @param request CreateProductImageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProductImageResponse
     */
    public CreateProductImageResponse createProductImageWithOptions(CreateProductImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backgroundDescription)) {
            body.put("backgroundDescription", request.backgroundDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundPriority)) {
            body.put("backgroundPriority", request.backgroundPriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundUrl)) {
            body.put("backgroundUrl", request.backgroundUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.highlightText)) {
            body.put("highlightText", request.highlightText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCount)) {
            body.put("imageCount", request.imageCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("imageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subTitle)) {
            body.put("subTitle", request.subTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProductImage"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/images/products"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建产品图</p>
     * 
     * @param request CreateProductImageRequest
     * @return CreateProductImageResponse
     */
    public CreateProductImageResponse createProductImage(CreateProductImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProductImageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>写实人像创作</p>
     * 
     * @param request CreateRealisticPortraitRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRealisticPortraitResponse
     */
    public CreateRealisticPortraitResponse createRealisticPortraitWithOptions(CreateRealisticPortraitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ages)) {
            body.put("ages", request.ages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloth)) {
            body.put("cloth", request.cloth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.color)) {
            body.put("color", request.color);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custom)) {
            body.put("custom", request.custom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.face)) {
            body.put("face", request.face);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.figure)) {
            body.put("figure", request.figure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            body.put("gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hairColor)) {
            body.put("hairColor", request.hairColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hairstyle)) {
            body.put("hairstyle", request.hairstyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.height)) {
            body.put("height", request.height);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("imageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numbers)) {
            body.put("numbers", request.numbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ratio)) {
            body.put("ratio", request.ratio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.width)) {
            body.put("width", request.width);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRealisticPortrait"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/images/portrait/realistic"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRealisticPortraitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>写实人像创作</p>
     * 
     * @param request CreateRealisticPortraitRequest
     * @return CreateRealisticPortraitResponse
     */
    public CreateRealisticPortraitResponse createRealisticPortrait(CreateRealisticPortraitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRealisticPortraitWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建文案生成任务</p>
     * 
     * @param request CreateTextTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTextTaskResponse
     */
    public CreateTextTaskResponse createTextTaskWithOptions(CreateTextTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTextTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/textTasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTextTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建文案生成任务</p>
     * 
     * @param request CreateTextTaskRequest
     * @return CreateTextTaskResponse
     */
    public CreateTextTaskResponse createTextTask(CreateTextTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTextTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交声音复刻任务</p>
     * 
     * @param request CreateTrainTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTrainTaskResponse
     */
    public CreateTrainTaskResponse createTrainTaskWithOptions(CreateTrainTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunMainId)) {
            body.put("aliyunMainId", request.aliyunMainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resSpecType)) {
            body.put("resSpecType", request.resSpecType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("taskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useScene)) {
            body.put("useScene", request.useScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceGender)) {
            body.put("voiceGender", request.voiceGender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceLanguage)) {
            body.put("voiceLanguage", request.voiceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceName)) {
            body.put("voiceName", request.voiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voicePath)) {
            body.put("voicePath", request.voicePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrainTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/train/task/createTrainTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrainTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交声音复刻任务</p>
     * 
     * @param request CreateTrainTaskRequest
     * @return CreateTrainTaskResponse
     */
    public CreateTrainTaskResponse createTrainTask(CreateTrainTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTrainTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交视频切片任务</p>
     * 
     * @param request CreateVideoClipTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVideoClipTaskResponse
     */
    public CreateVideoClipTaskResponse createVideoClipTaskWithOptions(CreateVideoClipTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunMainId)) {
            body.put("aliyunMainId", request.aliyunMainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKeys)) {
            body.put("ossKeys", request.ossKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requirement)) {
            body.put("requirement", request.requirement);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVideoClipTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/video/clip/createVideoClipTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVideoClipTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交视频切片任务</p>
     * 
     * @param request CreateVideoClipTaskRequest
     * @return CreateVideoClipTaskResponse
     */
    public CreateVideoClipTaskResponse createVideoClipTask(CreateVideoClipTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVideoClipTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteAICoachScript</p>
     * 
     * @param request DeleteAICoachScriptRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAICoachScriptResponse
     */
    public DeleteAICoachScriptResponse deleteAICoachScriptWithOptions(DeleteAICoachScriptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            body.put("scriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAICoachScript"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/deleteAICoachScript"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAICoachScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteAICoachScript</p>
     * 
     * @param request DeleteAICoachScriptRequest
     * @return DeleteAICoachScriptResponse
     */
    public DeleteAICoachScriptResponse deleteAICoachScript(DeleteAICoachScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAICoachScriptWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteAgent</p>
     * 
     * @param request DeleteAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgentWithOptions(DeleteAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agentId", request.agentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgent"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/agent/deleteAgent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteAgent</p>
     * 
     * @param request DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgent(DeleteAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除个性化文案项目</p>
     * 
     * @param request DeleteIndividuationProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIndividuationProjectResponse
     */
    public DeleteIndividuationProjectResponse deleteIndividuationProjectWithOptions(DeleteIndividuationProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIndividuationProject"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/individuationText/deleteProject"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIndividuationProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除个性化文案项目</p>
     * 
     * @param request DeleteIndividuationProjectRequest
     * @return DeleteIndividuationProjectResponse
     */
    public DeleteIndividuationProjectResponse deleteIndividuationProject(DeleteIndividuationProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndividuationProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除个性化文案</p>
     * 
     * @param request DeleteIndividuationTextRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIndividuationTextResponse
     */
    public DeleteIndividuationTextResponse deleteIndividuationTextWithOptions(DeleteIndividuationTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.textIdList)) {
            body.put("textIdList", request.textIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIndividuationText"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/individuationText/deleteText"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIndividuationTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除个性化文案</p>
     * 
     * @param request DeleteIndividuationTextRequest
     * @return DeleteIndividuationTextResponse
     */
    public DeleteIndividuationTextResponse deleteIndividuationText(DeleteIndividuationTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndividuationTextWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询文档信息与状态</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDocumentResponse
     */
    public DescribeDocumentResponse describeDocumentWithOptions(String knowledgeBaseId, String documentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDocument"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/knowledge-base/" + com.aliyun.openapiutil.Client.getEncodeParam(knowledgeBaseId) + "/documents/" + com.aliyun.openapiutil.Client.getEncodeParam(documentId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询文档信息与状态</p>
     * @return DescribeDocumentResponse
     */
    public DescribeDocumentResponse describeDocument(String knowledgeBaseId, String documentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDocumentWithOptions(knowledgeBaseId, documentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>学员完成会话</p>
     * 
     * @param request FinishAICoachTaskSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FinishAICoachTaskSessionResponse
     */
    public FinishAICoachTaskSessionResponse finishAICoachTaskSessionWithOptions(FinishAICoachTaskSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            body.put("uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FinishAICoachTaskSession"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/finishSession"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FinishAICoachTaskSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>学员完成会话</p>
     * 
     * @param request FinishAICoachTaskSessionRequest
     * @return FinishAICoachTaskSessionResponse
     */
    public FinishAICoachTaskSessionResponse finishAICoachTaskSession(FinishAICoachTaskSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishAICoachTaskSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取考核点详情</p>
     * 
     * @param request GetAICoachAssessmentPointRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAICoachAssessmentPointResponse
     */
    public GetAICoachAssessmentPointResponse getAICoachAssessmentPointWithOptions(GetAICoachAssessmentPointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pointId)) {
            query.put("pointId", request.pointId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAICoachAssessmentPoint"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/getAssessmentPoint"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAICoachAssessmentPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取考核点详情</p>
     * 
     * @param request GetAICoachAssessmentPointRequest
     * @return GetAICoachAssessmentPointResponse
     */
    public GetAICoachAssessmentPointResponse getAICoachAssessmentPoint(GetAICoachAssessmentPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAICoachAssessmentPointWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询作弊检测详情</p>
     * 
     * @param request GetAICoachCheatDetectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAICoachCheatDetectionResponse
     */
    public GetAICoachCheatDetectionResponse getAICoachCheatDetectionWithOptions(GetAICoachCheatDetectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAICoachCheatDetection"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/getCheatDetection"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAICoachCheatDetectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询作弊检测详情</p>
     * 
     * @param request GetAICoachCheatDetectionRequest
     * @return GetAICoachCheatDetectionResponse
     */
    public GetAICoachCheatDetectionResponse getAICoachCheatDetection(GetAICoachCheatDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAICoachCheatDetectionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询剧本详情</p>
     * 
     * @param request GetAICoachScriptRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAICoachScriptResponse
     */
    public GetAICoachScriptResponse getAICoachScriptWithOptions(GetAICoachScriptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scriptRecordId)) {
            query.put("scriptRecordId", request.scriptRecordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAICoachScript"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/getScript"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAICoachScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询剧本详情</p>
     * 
     * @param request GetAICoachScriptRequest
     * @return GetAICoachScriptResponse
     */
    public GetAICoachScriptResponse getAICoachScript(GetAICoachScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAICoachScriptWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>学员查询会话历史</p>
     * 
     * @param request GetAICoachTaskSessionHistoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAICoachTaskSessionHistoryResponse
     */
    public GetAICoachTaskSessionHistoryResponse getAICoachTaskSessionHistoryWithOptions(GetAICoachTaskSessionHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAICoachTaskSessionHistory"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/querySessionHistory"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAICoachTaskSessionHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>学员查询会话历史</p>
     * 
     * @param request GetAICoachTaskSessionHistoryRequest
     * @return GetAICoachTaskSessionHistoryResponse
     */
    public GetAICoachTaskSessionHistoryResponse getAICoachTaskSessionHistory(GetAICoachTaskSessionHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAICoachTaskSessionHistoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>学员查询会话评测报告</p>
     * 
     * @param request GetAICoachTaskSessionReportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAICoachTaskSessionReportResponse
     */
    public GetAICoachTaskSessionReportResponse getAICoachTaskSessionReportWithOptions(GetAICoachTaskSessionReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAICoachTaskSessionReport"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/queryTaskSessionReport"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAICoachTaskSessionReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>学员查询会话评测报告</p>
     * 
     * @param request GetAICoachTaskSessionReportRequest
     * @return GetAICoachTaskSessionReportResponse
     */
    public GetAICoachTaskSessionReportResponse getAICoachTaskSessionReport(GetAICoachTaskSessionReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAICoachTaskSessionReportWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取对练会话资源使用情况</p>
     * 
     * @param request GetAICoachTaskSessionResourceUsageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAICoachTaskSessionResourceUsageResponse
     */
    public GetAICoachTaskSessionResourceUsageResponse getAICoachTaskSessionResourceUsageWithOptions(GetAICoachTaskSessionResourceUsageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAICoachTaskSessionResourceUsage"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/getSessionResourceUsage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAICoachTaskSessionResourceUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取对练会话资源使用情况</p>
     * 
     * @param request GetAICoachTaskSessionResourceUsageRequest
     * @return GetAICoachTaskSessionResourceUsageResponse
     */
    public GetAICoachTaskSessionResourceUsageResponse getAICoachTaskSessionResourceUsage(GetAICoachTaskSessionResourceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAICoachTaskSessionResourceUsageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询配图</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIllustrationResponse
     */
    public GetIllustrationResponse getIllustrationWithOptions(String textId, String illustrationId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIllustration"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/texts/" + com.aliyun.openapiutil.Client.getEncodeParam(textId) + "/illustrations/" + com.aliyun.openapiutil.Client.getEncodeParam(illustrationId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIllustrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询配图</p>
     * @return GetIllustrationResponse
     */
    public GetIllustrationResponse getIllustration(String textId, String illustrationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIllustrationWithOptions(textId, illustrationId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询配图任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIllustrationTaskResponse
     */
    public GetIllustrationTaskResponse getIllustrationTaskWithOptions(String textId, String illustrationTaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIllustrationTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/texts/" + com.aliyun.openapiutil.Client.getEncodeParam(textId) + "/illustrationTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(illustrationTaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIllustrationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询配图任务</p>
     * @return GetIllustrationTaskResponse
     */
    public GetIllustrationTaskResponse getIllustrationTask(String textId, String illustrationTaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIllustrationTaskWithOptions(textId, illustrationTaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取图片上传oss token</p>
     * 
     * @param request GetOssUploadTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssUploadTokenResponse
     */
    public GetOssUploadTokenResponse getOssUploadTokenWithOptions(GetOssUploadTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("fileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            query.put("uploadType", request.uploadType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssUploadToken"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/uploadToken"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssUploadTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取图片上传oss token</p>
     * 
     * @param request GetOssUploadTokenRequest
     * @return GetOssUploadTokenResponse
     */
    public GetOssUploadTokenResponse getOssUploadToken(GetOssUploadTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOssUploadTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据人合成信息</p>
     * 
     * @param request GetProjectTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectTaskResponse
     */
    public GetProjectTaskResponse getProjectTaskWithOptions(GetProjectTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("IdempotentId", request.idempotentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/digitalHuman/project/getProjectTask"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据人合成信息</p>
     * 
     * @param request GetProjectTaskRequest
     * @return GetProjectTaskResponse
     */
    public GetProjectTaskResponse getProjectTask(GetProjectTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询文案</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTextResponse
     */
    public GetTextResponse getTextWithOptions(String textId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetText"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/texts/" + com.aliyun.openapiutil.Client.getEncodeParam(textId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询文案</p>
     * @return GetTextResponse
     */
    public GetTextResponse getText(String textId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTextWithOptions(textId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询文案任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTextTaskResponse
     */
    public GetTextTaskResponse getTextTaskWithOptions(String textTaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTextTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/textTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(textTaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTextTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询文案任务</p>
     * @return GetTextTaskResponse
     */
    public GetTextTaskResponse getTextTask(String textTaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTextTaskWithOptions(textTaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询表单配置</p>
     * 
     * @param request GetTextTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTextTemplateResponse
     */
    public GetTextTemplateResponse getTextTemplateWithOptions(GetTextTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("industry", request.industry);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTextTemplate"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/texts/commands/getTextTemplate"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTextTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询表单配置</p>
     * 
     * @param request GetTextTemplateRequest
     * @return GetTextTemplateResponse
     */
    public GetTextTemplateResponse getTextTemplate(GetTextTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTextTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>营销文案互动问答</p>
     * 
     * @param request InteractTextRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InteractTextResponse
     */
    public InteractTextResponse interactTextWithOptions(InteractTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InteractText"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/stream/interactText"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InteractTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>营销文案互动问答</p>
     * 
     * @param request InteractTextRequest
     * @return InteractTextResponse
     */
    public InteractTextResponse interactText(InteractTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.interactTextWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询剧本列表</p>
     * 
     * @param request ListAICoachScriptPageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAICoachScriptPageResponse
     */
    public ListAICoachScriptPageResponse listAICoachScriptPageWithOptions(ListAICoachScriptPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAICoachScriptPage"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/pageScript"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAICoachScriptPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询剧本列表</p>
     * 
     * @param request ListAICoachScriptPageRequest
     * @return ListAICoachScriptPageResponse
     */
    public ListAICoachScriptPageResponse listAICoachScriptPage(ListAICoachScriptPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAICoachScriptPageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务列表</p>
     * 
     * @param request ListAICoachTaskPageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAICoachTaskPageResponse
     */
    public ListAICoachTaskPageResponse listAICoachTaskPageWithOptions(ListAICoachTaskPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.studentId)) {
            query.put("studentId", request.studentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAICoachTaskPage"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/listTaskPage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAICoachTaskPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务列表</p>
     * 
     * @param request ListAICoachTaskPageRequest
     * @return ListAICoachTaskPageResponse
     */
    public ListAICoachTaskPageResponse listAICoachTaskPage(ListAICoachTaskPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAICoachTaskPageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询智能体</p>
     * 
     * @param request ListAgentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentsResponse
     */
    public ListAgentsResponse listAgentsWithOptions(ListAgentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentScene)) {
            query.put("agentScene", request.agentScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
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
            new TeaPair("action", "ListAgents"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/agent/listAgents"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询智能体</p>
     * 
     * @param request ListAgentsRequest
     * @return ListAgentsResponse
     */
    public ListAgentsResponse listAgents(ListAgentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数字人模特列表</p>
     * 
     * @param request ListAnchorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAnchorResponse
     */
    public ListAnchorResponse listAnchorWithOptions(ListAnchorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anchorCategory)) {
            query.put("anchorCategory", request.anchorCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.anchorId)) {
            query.put("anchorId", request.anchorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.anchorType)) {
            query.put("anchorType", request.anchorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverRate)) {
            query.put("coverRate", request.coverRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalHumanType)) {
            query.put("digitalHumanType", request.digitalHumanType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resSpecType)) {
            query.put("resSpecType", request.resSpecType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useScene)) {
            query.put("useScene", request.useScene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnchor"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/digitalHuman/anchorOpen/listAnchor"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnchorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数字人模特列表</p>
     * 
     * @param request ListAnchorRequest
     * @return ListAnchorResponse
     */
    public ListAnchorResponse listAnchor(ListAnchorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAnchorWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询数字人项目启动结果</p>
     * 
     * @param tmpReq ListAvatarProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAvatarProjectResponse
     */
    public ListAvatarProjectResponse listAvatarProjectWithOptions(ListAvatarProjectRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAvatarProjectShrinkRequest request = new ListAvatarProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.projectIdList)) {
            request.projectIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.projectIdList, "projectIdList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectIdListShrink)) {
            query.put("projectIdList", request.projectIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvatarProject"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/listAvatarProject"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvatarProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询数字人项目启动结果</p>
     * 
     * @param request ListAvatarProjectRequest
     * @return ListAvatarProjectResponse
     */
    public ListAvatarProjectResponse listAvatarProject(ListAvatarProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAvatarProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询知识库</p>
     * 
     * @param request ListKnowledgeBaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKnowledgeBaseResponse
     */
    public ListKnowledgeBaseResponse listKnowledgeBaseWithOptions(ListKnowledgeBaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeBaseId)) {
            query.put("knowledgeBaseId", request.knowledgeBaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKnowledgeBase"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/knowledge-base"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKnowledgeBaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询知识库</p>
     * 
     * @param request ListKnowledgeBaseRequest
     * @return ListKnowledgeBaseResponse
     */
    public ListKnowledgeBaseResponse listKnowledgeBase(ListKnowledgeBaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKnowledgeBaseWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询文案主题列表</p>
     * 
     * @param request ListTextThemesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTextThemesResponse
     */
    public ListTextThemesResponse listTextThemesWithOptions(ListTextThemesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("industry", request.industry);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTextThemes"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/textThemes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTextThemesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询文案主题列表</p>
     * 
     * @param request ListTextThemesRequest
     * @return ListTextThemesResponse
     */
    public ListTextThemesResponse listTextThemes(ListTextThemesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTextThemesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举文案</p>
     * 
     * @param request ListTextsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTextsResponse
     */
    public ListTextsResponse listTextsWithOptions(ListTextsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.generationSource)) {
            query.put("generationSource", request.generationSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishStatus)) {
            query.put("publishStatus", request.publishStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textStyleType)) {
            query.put("textStyleType", request.textStyleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textTheme)) {
            query.put("textTheme", request.textTheme);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTexts"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/texts"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTextsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举文案</p>
     * 
     * @param request ListTextsRequest
     * @return ListTextsResponse
     */
    public ListTextsResponse listTexts(ListTextsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTextsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取声音模版列表</p>
     * 
     * @param request ListVoiceModelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVoiceModelsResponse
     */
    public ListVoiceModelsResponse listVoiceModelsWithOptions(ListVoiceModelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resSpecType)) {
            query.put("resSpecType", request.resSpecType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useScene)) {
            query.put("useScene", request.useScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceLanguage)) {
            query.put("voiceLanguage", request.voiceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceType)) {
            query.put("voiceType", request.voiceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVoiceModels"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/digitalHuman/voiceOpen/listVoiceModels"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVoiceModelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取声音模版列表</p>
     * 
     * @param request ListVoiceModelsRequest
     * @return ListVoiceModelsResponse
     */
    public ListVoiceModelsResponse listVoiceModels(ListVoiceModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVoiceModelsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下线剧本</p>
     * 
     * @param request OfflineAICoachScriptRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineAICoachScriptResponse
     */
    public OfflineAICoachScriptResponse offlineAICoachScriptWithOptions(OfflineAICoachScriptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            body.put("scriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineAICoachScript"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/aicoach/offlineAICoachScript"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineAICoachScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下线剧本</p>
     * 
     * @param request OfflineAICoachScriptRequest
     * @return OfflineAICoachScriptResponse
     */
    public OfflineAICoachScriptResponse offlineAICoachScript(OfflineAICoachScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineAICoachScriptWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>操作实时数字人项目</p>
     * 
     * @param request OperateAvatarProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateAvatarProjectResponse
     */
    public OperateAvatarProjectResponse operateAvatarProjectWithOptions(OperateAvatarProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            body.put("operateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resChannelNumber)) {
            body.put("resChannelNumber", request.resChannelNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resType)) {
            body.put("resType", request.resType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateAvatarProject"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/operateProjectAvatar"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateAvatarProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>操作实时数字人项目</p>
     * 
     * @param request OperateAvatarProjectRequest
     * @return OperateAvatarProjectResponse
     */
    public OperateAvatarProjectResponse operateAvatarProject(OperateAvatarProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateAvatarProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数字人项目信息</p>
     * 
     * @param request QueryAvatarProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAvatarProjectResponse
     */
    public QueryAvatarProjectResponse queryAvatarProjectWithOptions(QueryAvatarProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryAvatarProject"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/queryAvatarProject"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAvatarProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数字人项目信息</p>
     * 
     * @param request QueryAvatarProjectRequest
     * @return QueryAvatarProjectResponse
     */
    public QueryAvatarProjectResponse queryAvatarProject(QueryAvatarProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAvatarProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查找资源</p>
     * 
     * @param request QueryAvatarResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAvatarResourceResponse
     */
    public QueryAvatarResourceResponse queryAvatarResourceWithOptions(QueryAvatarResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("idempotentId", request.idempotentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAvatarResource"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/queryResource"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAvatarResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查找资源</p>
     * 
     * @param request QueryAvatarResourceRequest
     * @return QueryAvatarResourceResponse
     */
    public QueryAvatarResourceResponse queryAvatarResource(QueryAvatarResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAvatarResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询图片转视频任务</p>
     * 
     * @param request QueryImageToVideoTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryImageToVideoTaskResponse
     */
    public QueryImageToVideoTaskResponse queryImageToVideoTaskWithOptions(QueryImageToVideoTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryImageToVideoTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/video/imageToVideo/task"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryImageToVideoTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询图片转视频任务</p>
     * 
     * @param request QueryImageToVideoTaskRequest
     * @return QueryImageToVideoTaskResponse
     */
    public QueryImageToVideoTaskResponse queryImageToVideoTask(QueryImageToVideoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryImageToVideoTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询个性化文案任务</p>
     * 
     * @param request QueryIndividuationTextTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryIndividuationTextTaskResponse
     */
    public QueryIndividuationTextTaskResponse queryIndividuationTextTaskWithOptions(QueryIndividuationTextTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryIndividuationTextTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/individuationText/queryTextTask"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryIndividuationTextTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询个性化文案任务</p>
     * 
     * @param request QueryIndividuationTextTaskRequest
     * @return QueryIndividuationTextTaskResponse
     */
    public QueryIndividuationTextTaskResponse queryIndividuationTextTask(QueryIndividuationTextTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIndividuationTextTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询会话信息</p>
     * 
     * @param tmpReq QuerySessionInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySessionInfoResponse
     */
    public QuerySessionInfoResponse querySessionInfoWithOptions(QuerySessionInfoRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QuerySessionInfoShrinkRequest request = new QuerySessionInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statusList)) {
            request.statusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statusList, "statusList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("pageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusListShrink)) {
            query.put("statusList", request.statusListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySessionInfo"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/querySessionInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySessionInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询会话信息</p>
     * 
     * @param request QuerySessionInfoRequest
     * @return QuerySessionInfoResponse
     */
    public QuerySessionInfoResponse querySessionInfo(QuerySessionInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySessionInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>流式输出文案</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTextStreamResponse
     */
    public QueryTextStreamResponse queryTextStreamWithOptions(String textId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTextStream"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/stream/queryTextStream/" + com.aliyun.openapiutil.Client.getEncodeParam(textId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTextStreamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>流式输出文案</p>
     * @return QueryTextStreamResponse
     */
    public QueryTextStreamResponse queryTextStream(String textId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTextStreamWithOptions(textId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ReleaseAgent</p>
     * 
     * @param request ReleaseAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseAgentResponse
     */
    public ReleaseAgentResponse releaseAgentWithOptions(ReleaseAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agentId", request.agentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseAgent"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/agent/releaseAgent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ReleaseAgent</p>
     * 
     * @param request ReleaseAgentRequest
     * @return ReleaseAgentResponse
     */
    public ReleaseAgentResponse releaseAgent(ReleaseAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseAgentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存实时数字人项目</p>
     * 
     * @param request SaveAvatarProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveAvatarProjectResponse
     */
    public SaveAvatarProjectResponse saveAvatarProjectWithOptions(SaveAvatarProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bitRate)) {
            body.put("bitRate", request.bitRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frameRate)) {
            body.put("frameRate", request.frameRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frames)) {
            body.put("frames", request.frames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            body.put("operateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("projectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resSpecType)) {
            body.put("resSpecType", request.resSpecType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolution)) {
            body.put("resolution", request.resolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleType)) {
            body.put("scaleType", request.scaleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptModelTag)) {
            body.put("scriptModelTag", request.scriptModelTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizedDisplay)) {
            body.put("synchronizedDisplay", request.synchronizedDisplay);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveAvatarProject"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/saveAvatarProject"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveAvatarProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存实时数字人项目</p>
     * 
     * @param request SaveAvatarProjectRequest
     * @return SaveAvatarProjectResponse
     */
    public SaveAvatarProjectResponse saveAvatarProject(SaveAvatarProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveAvatarProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询图片任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SelectImageTaskResponse
     */
    public SelectImageTaskResponse selectImageTaskWithOptions(String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SelectImageTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/images/portrait/select/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SelectImageTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询图片任务</p>
     * @return SelectImageTaskResponse
     */
    public SelectImageTaskResponse selectImageTask(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.selectImageTaskWithOptions(taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询离线数字人剩余资源</p>
     * 
     * @param request SelectResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SelectResourceResponse
     */
    public SelectResourceResponse selectResourceWithOptions(SelectResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("idempotentId", request.idempotentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SelectResource"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/digitalHuman/project/commands/overview"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SelectResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询离线数字人剩余资源</p>
     * 
     * @param request SelectResourceRequest
     * @return SelectResourceResponse
     */
    public SelectResourceResponse selectResource(SelectResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.selectResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送sdk消息</p>
     * 
     * @param request SendSdkMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendSdkMessageResponse
     */
    public SendSdkMessageResponse sendSdkMessageWithOptions(SendSdkMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.header)) {
            body.put("header", request.header);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            body.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationName)) {
            body.put("operationName", request.operationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendSdkMessage"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/sdk/sendMessage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendSdkMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送sdk消息</p>
     * 
     * @param request SendSdkMessageRequest
     * @return SendSdkMessageResponse
     */
    public SendSdkMessageResponse sendSdkMessage(SendSdkMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendSdkMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送sdk流式消息</p>
     * 
     * @param request SendSdkStreamMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendSdkStreamMessageResponse
     */
    public SendSdkStreamMessageResponse sendSdkStreamMessageWithOptions(SendSdkStreamMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.header)) {
            body.put("header", request.header);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            body.put("moduleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationName)) {
            body.put("operationName", request.operationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendSdkStreamMessage"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/sdk/stream/sendMessage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendSdkStreamMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送sdk流式消息</p>
     * 
     * @param request SendSdkStreamMessageRequest
     * @return SendSdkStreamMessageResponse
     */
    public SendSdkStreamMessageResponse sendSdkStreamMessage(SendSdkStreamMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendSdkStreamMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送文本消息</p>
     * 
     * @param request SendTextMsgRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendTextMsgResponse
     */
    public SendTextMsgResponse sendTextMsgWithOptions(SendTextMsgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendTextMsg"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/sendTextMsg"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendTextMsgResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送文本消息</p>
     * 
     * @param request SendTextMsgRequest
     * @return SendTextMsgResponse
     */
    public SendTextMsgResponse sendTextMsg(SendTextMsgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendTextMsgWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动会话</p>
     * 
     * @param request StartAvatarSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartAvatarSessionResponse
     */
    public StartAvatarSessionResponse startAvatarSessionWithOptions(StartAvatarSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelToken)) {
            body.put("channelToken", request.channelToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPushUrl)) {
            body.put("customPushUrl", request.customPushUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customUserId)) {
            body.put("customUserId", request.customUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAvatarSession"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/startAvatarSession"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartAvatarSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动会话</p>
     * 
     * @param request StartAvatarSessionRequest
     * @return StartAvatarSessionResponse
     */
    public StartAvatarSessionResponse startAvatarSession(StartAvatarSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAvatarSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止会话</p>
     * 
     * @param request StopAvatarSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAvatarSessionResponse
     */
    public StopAvatarSessionResponse stopAvatarSessionWithOptions(StopAvatarSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAvatarSession"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/stopAvatarSession"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopAvatarSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止会话</p>
     * 
     * @param request StopAvatarSessionRequest
     * @return StopAvatarSessionResponse
     */
    public StopAvatarSessionResponse stopAvatarSession(StopAvatarSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopAvatarSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视频合成任务停止</p>
     * 
     * @param request StopProjectTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopProjectTaskResponse
     */
    public StopProjectTaskResponse stopProjectTaskWithOptions(StopProjectTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopProjectTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/digitalHuman/project/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopProjectTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>视频合成任务停止</p>
     * 
     * @param request StopProjectTaskRequest
     * @return StopProjectTaskResponse
     */
    public StopProjectTaskResponse stopProjectTask(StopProjectTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopProjectTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交图片转视频任务</p>
     * 
     * @param request SubmitImageToVideoTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitImageToVideoTaskResponse
     */
    public SubmitImageToVideoTaskResponse submitImageToVideoTaskWithOptions(SubmitImageToVideoTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("imageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.posPrompt)) {
            body.put("posPrompt", request.posPrompt);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitImageToVideoTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/video/imageToVideo/task"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitImageToVideoTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交图片转视频任务</p>
     * 
     * @param request SubmitImageToVideoTaskRequest
     * @return SubmitImageToVideoTaskResponse
     */
    public SubmitImageToVideoTaskResponse submitImageToVideoTask(SubmitImageToVideoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitImageToVideoTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交离线数字人合成任务</p>
     * 
     * @param request SubmitProjectTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitProjectTaskResponse
     */
    public SubmitProjectTaskResponse submitProjectTaskWithOptions(SubmitProjectTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.frames)) {
            body.put("frames", request.frames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleType)) {
            body.put("scaleType", request.scaleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subtitleTag)) {
            body.put("subtitleTag", request.subtitleTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transparentBackground)) {
            body.put("transparentBackground", request.transparentBackground);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitProjectTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/digitalHuman/project/submitProjectTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitProjectTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交离线数字人合成任务</p>
     * 
     * @param request SubmitProjectTaskRequest
     * @return SubmitProjectTaskResponse
     */
    public SubmitProjectTaskResponse submitProjectTask(SubmitProjectTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitProjectTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>人像风格变化</p>
     * 
     * @param request TransferPortraitStyleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferPortraitStyleResponse
     */
    public TransferPortraitStyleResponse transferPortraitStyleWithOptions(TransferPortraitStyleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.height)) {
            body.put("height", request.height);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("imageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numbers)) {
            body.put("numbers", request.numbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redrawAmplitude)) {
            body.put("redrawAmplitude", request.redrawAmplitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.style)) {
            body.put("style", request.style);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.width)) {
            body.put("width", request.width);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferPortraitStyle"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/images/portrait/transferPortraitStyle"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferPortraitStyleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>人像风格变化</p>
     * 
     * @param request TransferPortraitStyleRequest
     * @return TransferPortraitStyleResponse
     */
    public TransferPortraitStyleResponse transferPortraitStyle(TransferPortraitStyleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferPortraitStyleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateAgent</p>
     * 
     * @param request UpdateAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentResponse
     */
    public UpdateAgentResponse updateAgentWithOptions(UpdateAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentIconUrl)) {
            body.put("agentIconUrl", request.agentIconUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            body.put("agentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.characterAgeStage)) {
            body.put("characterAgeStage", request.characterAgeStage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.characterGender)) {
            body.put("characterGender", request.characterGender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.characterName)) {
            body.put("characterName", request.characterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraDescription)) {
            body.put("extraDescription", request.extraDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            body.put("industry", request.industry);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgent"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/agent/updateAgent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateAgent</p>
     * 
     * @param request UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    public UpdateAgentResponse updateAgent(UpdateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAgentWithOptions(request, headers, runtime);
    }
}
