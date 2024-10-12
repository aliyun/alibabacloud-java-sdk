// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628;

import com.aliyun.tea.*;
import com.aliyun.dianjin20240628.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dianjin", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建按年文档总结任务</p>
     * 
     * @param request CreateAnnualDocSummaryTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAnnualDocSummaryTaskResponse
     */
    public CreateAnnualDocSummaryTaskResponse createAnnualDocSummaryTaskWithOptions(String workspaceId, CreateAnnualDocSummaryTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anaYears)) {
            body.put("anaYears", request.anaYears);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docInfos)) {
            body.put("docInfos", request.docInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTable)) {
            body.put("enableTable", request.enableTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instruction)) {
            body.put("instruction", request.instruction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAnnualDocSummaryTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/summary/doc/annual"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAnnualDocSummaryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建按年文档总结任务</p>
     * 
     * @param request CreateAnnualDocSummaryTaskRequest
     * @return CreateAnnualDocSummaryTaskResponse
     */
    public CreateAnnualDocSummaryTaskResponse createAnnualDocSummaryTask(String workspaceId, CreateAnnualDocSummaryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAnnualDocSummaryTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建财报总结任务</p>
     * 
     * @param request CreateDocsSummaryTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDocsSummaryTaskResponse
     */
    public CreateDocsSummaryTaskResponse createDocsSummaryTaskWithOptions(String workspaceId, CreateDocsSummaryTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docInfos)) {
            body.put("docInfos", request.docInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTable)) {
            body.put("enableTable", request.enableTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instruction)) {
            body.put("instruction", request.instruction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDocsSummaryTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/summary/docs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDocsSummaryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建财报总结任务</p>
     * 
     * @param request CreateDocsSummaryTaskRequest
     * @return CreateDocsSummaryTaskResponse
     */
    public CreateDocsSummaryTaskResponse createDocsSummaryTask(String workspaceId, CreateDocsSummaryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDocsSummaryTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建财报总结任务</p>
     * 
     * @param request CreateFinReportSummaryTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFinReportSummaryTaskResponse
     */
    public CreateFinReportSummaryTaskResponse createFinReportSummaryTaskWithOptions(String workspaceId, CreateFinReportSummaryTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docId)) {
            body.put("docId", request.docId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTable)) {
            body.put("enableTable", request.enableTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPage)) {
            body.put("endPage", request.endPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instruction)) {
            body.put("instruction", request.instruction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startPage)) {
            body.put("startPage", request.startPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("taskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFinReportSummaryTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/summary"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFinReportSummaryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建财报总结任务</p>
     * 
     * @param request CreateFinReportSummaryTaskRequest
     * @return CreateFinReportSummaryTaskResponse
     */
    public CreateFinReportSummaryTaskResponse createFinReportSummaryTask(String workspaceId, CreateFinReportSummaryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFinReportSummaryTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建文档库</p>
     * 
     * @param request CreateLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLibraryResponse
     */
    public CreateLibraryResponse createLibraryWithOptions(String workspaceId, CreateLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexSetting)) {
            body.put("indexSetting", request.indexSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryName)) {
            body.put("libraryName", request.libraryName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLibrary"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建文档库</p>
     * 
     * @param request CreateLibraryRequest
     * @return CreateLibraryResponse
     */
    public CreateLibraryResponse createLibrary(String workspaceId, CreateLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLibraryWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建PDF翻译任务</p>
     * 
     * @param request CreatePdfTranslateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePdfTranslateTaskResponse
     */
    public CreatePdfTranslateTaskResponse createPdfTranslateTaskWithOptions(String workspaceId, CreatePdfTranslateTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docId)) {
            body.put("docId", request.docId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledge)) {
            body.put("knowledge", request.knowledge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translateTo)) {
            body.put("translateTo", request.translateTo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePdfTranslateTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/pdfTranslate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePdfTranslateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建PDF翻译任务</p>
     * 
     * @param request CreatePdfTranslateTaskRequest
     * @return CreatePdfTranslateTaskResponse
     */
    public CreatePdfTranslateTaskResponse createPdfTranslateTask(String workspaceId, CreatePdfTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPdfTranslateTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建预定义文档</p>
     * 
     * @param request CreatePredefinedDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePredefinedDocumentResponse
     */
    public CreatePredefinedDocumentResponse createPredefinedDocumentWithOptions(String workspaceId, CreatePredefinedDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chunks)) {
            body.put("chunks", request.chunks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadata)) {
            body.put("metadata", request.metadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePredefinedDocument"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/createPredefinedDocument"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePredefinedDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建预定义文档</p>
     * 
     * @param request CreatePredefinedDocumentRequest
     * @return CreatePredefinedDocumentResponse
     */
    public CreatePredefinedDocumentResponse createPredefinedDocument(String workspaceId, CreatePredefinedDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPredefinedDocumentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建财报总结的任务</p>
     * 
     * @param request CreateQualityCheckTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQualityCheckTaskResponse
     */
    public CreateQualityCheckTaskResponse createQualityCheckTaskWithOptions(String workspaceId, CreateQualityCheckTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationList)) {
            body.put("conversationList", request.conversationList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtService)) {
            body.put("gmtService", request.gmtService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaData)) {
            body.put("metaData", request.metaData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualityGroup)) {
            body.put("qualityGroup", request.qualityGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQualityCheckTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/qualitycheck/task/submit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQualityCheckTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建财报总结的任务</p>
     * 
     * @param request CreateQualityCheckTaskRequest
     * @return CreateQualityCheckTaskResponse
     */
    public CreateQualityCheckTaskResponse createQualityCheckTask(String workspaceId, CreateQualityCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createQualityCheckTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除文档</p>
     * 
     * @param request DeleteDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDocumentResponse
     */
    public DeleteDocumentResponse deleteDocumentWithOptions(String workspaceId, DeleteDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docIds)) {
            body.put("docIds", request.docIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDocument"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除文档</p>
     * 
     * @param request DeleteDocumentRequest
     * @return DeleteDocumentResponse
     */
    public DeleteDocumentResponse deleteDocument(String workspaceId, DeleteDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDocumentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除文档库</p>
     * 
     * @param request DeleteLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLibraryResponse
     */
    public DeleteLibraryResponse deleteLibraryWithOptions(String workspaceId, DeleteLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            query.put("libraryId", request.libraryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLibrary"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除文档库</p>
     * 
     * @param request DeleteLibraryRequest
     * @return DeleteLibraryResponse
     */
    public DeleteLibraryResponse deleteLibrary(String workspaceId, DeleteLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLibraryWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>中断任务</p>
     * 
     * @param request EvictTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EvictTaskResponse
     */
    public EvictTaskResponse evictTaskWithOptions(String workspaceId, EvictTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "EvictTask"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/evict"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EvictTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>中断任务</p>
     * 
     * @param request EvictTaskRequest
     * @return EvictTaskResponse
     */
    public EvictTaskResponse evictTask(String workspaceId, EvictTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.evictTaskWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取app配置</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppConfigResponse
     */
    public GetAppConfigResponse getAppConfigWithOptions(String workspaceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppConfig"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/app/config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取app配置</p>
     * @return GetAppConfigResponse
     */
    public GetAppConfigResponse getAppConfig(String workspaceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppConfigWithOptions(workspaceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档的chunk列表</p>
     * 
     * @param request GetDocumentChunkListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentChunkListResponse
     */
    public GetDocumentChunkListResponse getDocumentChunkListWithOptions(String workspaceId, GetDocumentChunkListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chunkIdList)) {
            body.put("chunkIdList", request.chunkIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docId)) {
            body.put("docId", request.docId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchQuery)) {
            body.put("searchQuery", request.searchQuery);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentChunkList"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/getDocumentChunk"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentChunkListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档的chunk列表</p>
     * 
     * @param request GetDocumentChunkListRequest
     * @return GetDocumentChunkListResponse
     */
    public GetDocumentChunkListResponse getDocumentChunkList(String workspaceId, GetDocumentChunkListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocumentChunkListWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询文档库的文档列表</p>
     * 
     * @param request GetDocumentListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentListResponse
     */
    public GetDocumentListResponse getDocumentListWithOptions(String workspaceId, GetDocumentListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            query.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
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
            new TeaPair("action", "GetDocumentList"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/listDocument"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询文档库的文档列表</p>
     * 
     * @param request GetDocumentListRequest
     * @return GetDocumentListResponse
     */
    public GetDocumentListResponse getDocumentList(String workspaceId, GetDocumentListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocumentListWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档URL</p>
     * 
     * @param request GetDocumentUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentUrlResponse
     */
    public GetDocumentUrlResponse getDocumentUrlWithOptions(String workspaceId, GetDocumentUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentId)) {
            query.put("documentId", request.documentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentUrl"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/url"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档URL</p>
     * 
     * @param request GetDocumentUrlRequest
     * @return GetDocumentUrlResponse
     */
    public GetDocumentUrlResponse getDocumentUrl(String workspaceId, GetDocumentUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocumentUrlWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>带条件的分页查询文档库的文档列表</p>
     * 
     * @param request GetFilterDocumentListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFilterDocumentListResponse
     */
    public GetFilterDocumentListResponse getFilterDocumentListWithOptions(String workspaceId, GetFilterDocumentListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.and)) {
            body.put("and", request.and);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docIdList)) {
            body.put("docIdList", request.docIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.or)) {
            body.put("or", request.or);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFilterDocumentList"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/filterDocument"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFilterDocumentListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>带条件的分页查询文档库的文档列表</p>
     * 
     * @param request GetFilterDocumentListRequest
     * @return GetFilterDocumentListResponse
     */
    public GetFilterDocumentListResponse getFilterDocumentList(String workspaceId, GetFilterDocumentListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFilterDocumentListWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询文档库列表</p>
     * 
     * @param request GetHistoryListByBizTypeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHistoryListByBizTypeResponse
     */
    public GetHistoryListByBizTypeResponse getHistoryListByBizTypeWithOptions(String workspaceId, GetHistoryListByBizTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("bizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("bizType", request.bizType);
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
            new TeaPair("action", "GetHistoryListByBizType"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/history/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHistoryListByBizTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询文档库列表</p>
     * 
     * @param request GetHistoryListByBizTypeRequest
     * @return GetHistoryListByBizTypeResponse
     */
    public GetHistoryListByBizTypeResponse getHistoryListByBizType(String workspaceId, GetHistoryListByBizTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHistoryListByBizTypeWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档库配置详情</p>
     * 
     * @param request GetLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLibraryResponse
     */
    public GetLibraryResponse getLibraryWithOptions(String workspaceId, GetLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            query.put("libraryId", request.libraryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibrary"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/get"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档库配置详情</p>
     * 
     * @param request GetLibraryRequest
     * @return GetLibraryResponse
     */
    public GetLibraryResponse getLibrary(String workspaceId, GetLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibraryWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询文档库列表</p>
     * 
     * @param request GetLibraryListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLibraryListResponse
     */
    public GetLibraryListResponse getLibraryListWithOptions(String workspaceId, GetLibraryListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibraryList"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibraryListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询文档库列表</p>
     * 
     * @param request GetLibraryListRequest
     * @return GetLibraryListResponse
     */
    public GetLibraryListResponse getLibraryList(String workspaceId, GetLibraryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibraryListWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取解析结果</p>
     * 
     * @param request GetParseResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetParseResultResponse
     */
    public GetParseResultResponse getParseResultWithOptions(String workspaceId, GetParseResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docId)) {
            body.put("docId", request.docId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetParseResult"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/getParseResult"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetParseResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取解析结果</p>
     * 
     * @param request GetParseResultRequest
     * @return GetParseResultResponse
     */
    public GetParseResultResponse getParseResult(String workspaceId, GetParseResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getParseResultWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取异步任务的结果</p>
     * 
     * @param request GetQualityCheckTaskResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityCheckTaskResultResponse
     */
    public GetQualityCheckTaskResultResponse getQualityCheckTaskResultWithOptions(String workspaceId, GetQualityCheckTaskResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetQualityCheckTaskResult"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/qualitycheck/task/query"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityCheckTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取异步任务的结果</p>
     * 
     * @param request GetQualityCheckTaskResultRequest
     * @return GetQualityCheckTaskResultResponse
     */
    public GetQualityCheckTaskResultResponse getQualityCheckTaskResult(String workspaceId, GetQualityCheckTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQualityCheckTaskResultWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取财报总结任务结果</p>
     * 
     * @param request GetSummaryTaskResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSummaryTaskResultResponse
     */
    public GetSummaryTaskResultResponse getSummaryTaskResultWithOptions(String workspaceId, GetSummaryTaskResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetSummaryTaskResult"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/summary/result"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSummaryTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取财报总结任务结果</p>
     * 
     * @param request GetSummaryTaskResultRequest
     * @return GetSummaryTaskResultResponse
     */
    public GetSummaryTaskResultResponse getSummaryTaskResult(String workspaceId, GetSummaryTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSummaryTaskResultWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取异步任务结果</p>
     * 
     * @param request GetTaskResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResultResponse
     */
    public GetTaskResultResponse getTaskResultWithOptions(String workspaceId, GetTaskResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetTaskResult"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/result"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取异步任务结果</p>
     * 
     * @param request GetTaskResultRequest
     * @return GetTaskResultResponse
     */
    public GetTaskResultResponse getTaskResult(String workspaceId, GetTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskResultWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取财报总结任务结果</p>
     * 
     * @param request GetTaskStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskStatusResponse
     */
    public GetTaskStatusResponse getTaskStatusWithOptions(String workspaceId, GetTaskStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetTaskStatus"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/task/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取财报总结任务结果</p>
     * 
     * @param request GetTaskStatusRequest
     * @return GetTaskStatusResponse
     */
    public GetTaskStatusResponse getTaskStatus(String workspaceId, GetTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskStatusWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>插件调试接口</p>
     * 
     * @param request InvokePluginRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvokePluginResponse
     */
    public InvokePluginResponse invokePluginWithOptions(String workspaceId, InvokePluginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            body.put("pluginId", request.pluginId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokePlugin"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/plugin/invoke"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokePluginResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>插件调试接口</p>
     * 
     * @param request InvokePluginRequest
     * @return InvokePluginResponse
     */
    public InvokePluginResponse invokePlugin(String workspaceId, InvokePluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.invokePluginWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档预览</p>
     * 
     * @param request PreviewDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreviewDocumentResponse
     */
    public PreviewDocumentResponse previewDocumentWithOptions(String workspaceId, PreviewDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentId)) {
            query.put("documentId", request.documentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewDocument"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/preview"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档预览</p>
     * 
     * @param request PreviewDocumentRequest
     * @return PreviewDocumentResponse
     */
    public PreviewDocumentResponse previewDocument(String workspaceId, PreviewDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewDocumentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重新索引</p>
     * 
     * @param request ReIndexRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReIndexResponse
     */
    public ReIndexResponse reIndexWithOptions(String workspaceId, ReIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentId)) {
            query.put("documentId", request.documentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReIndex"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/reIndex"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReIndexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重新索引</p>
     * 
     * @param request ReIndexRequest
     * @return ReIndexResponse
     */
    public ReIndexResponse reIndex(String workspaceId, ReIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reIndexWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档召回。</p>
     * 
     * @param request RecallDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecallDocumentResponse
     */
    public RecallDocumentResponse recallDocumentWithOptions(String workspaceId, RecallDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            body.put("filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rearrangement)) {
            body.put("rearrangement", request.rearrangement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topK)) {
            body.put("topK", request.topK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecallDocument"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/recallDocument"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecallDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档召回。</p>
     * 
     * @param request RecallDocumentRequest
     * @return RecallDocumentResponse
     */
    public RecallDocumentResponse recallDocument(String workspaceId, RecallDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recallDocumentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>意图识别</p>
     * 
     * @param request RecognizeIntentionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeIntentionResponse
     */
    public RecognizeIntentionResponse recognizeIntentionWithOptions(String workspaceId, RecognizeIntentionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysis)) {
            body.put("analysis", request.analysis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("bizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversation)) {
            body.put("conversation", request.conversation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalIntentionList)) {
            body.put("globalIntentionList", request.globalIntentionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hierarchicalIntentionList)) {
            body.put("hierarchicalIntentionList", request.hierarchicalIntentionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionList)) {
            body.put("intentionList", request.intentionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opType)) {
            body.put("opType", request.opType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recommend)) {
            body.put("recommend", request.recommend);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeIntention"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/recog/intent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeIntentionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>意图识别</p>
     * 
     * @param request RecognizeIntentionRequest
     * @return RecognizeIntentionResponse
     */
    public RecognizeIntentionResponse recognizeIntention(String workspaceId, RecognizeIntentionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recognizeIntentionWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取生成式对话结果</p>
     * 
     * @param request RunChatResultGenerationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunChatResultGenerationResponse
     */
    public RunChatResultGenerationResponse runChatResultGenerationWithOptions(String workspaceId, RunChatResultGenerationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inferenceParameters)) {
            body.put("inferenceParameters", request.inferenceParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("messages", request.messages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tools)) {
            body.put("tools", request.tools);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunChatResultGeneration"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/run/chat/generation"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunChatResultGenerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取生成式对话结果</p>
     * 
     * @param request RunChatResultGenerationRequest
     * @return RunChatResultGenerationResponse
     */
    public RunChatResultGenerationResponse runChatResultGeneration(String workspaceId, RunChatResultGenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runChatResultGenerationWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取生成式对话结果</p>
     * 
     * @param request RunLibraryChatGenerationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunLibraryChatGenerationResponse
     */
    public RunLibraryChatGenerationResponse runLibraryChatGenerationWithOptions(String workspaceId, RunLibraryChatGenerationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docIdList)) {
            body.put("docIdList", request.docIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableFollowUp)) {
            body.put("enableFollowUp", request.enableFollowUp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableMultiQuery)) {
            body.put("enableMultiQuery", request.enableMultiQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableOpenQa)) {
            body.put("enableOpenQa", request.enableOpenQa);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.followUpLlm)) {
            body.put("followUpLlm", request.followUpLlm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.llmType)) {
            body.put("llmType", request.llmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiQueryLlm)) {
            body.put("multiQueryLlm", request.multiQueryLlm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCriteria)) {
            body.put("queryCriteria", request.queryCriteria);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankType)) {
            body.put("rerankType", request.rerankType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subQueryList)) {
            body.put("subQueryList", request.subQueryList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textSearchParameter)) {
            body.put("textSearchParameter", request.textSearchParameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topK)) {
            body.put("topK", request.topK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vectorSearchParameter)) {
            body.put("vectorSearchParameter", request.vectorSearchParameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withDocumentReference)) {
            body.put("withDocumentReference", request.withDocumentReference);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunLibraryChatGeneration"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/run/library/chat/generation"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunLibraryChatGenerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取生成式对话结果</p>
     * 
     * @param request RunLibraryChatGenerationRequest
     * @return RunLibraryChatGenerationResponse
     */
    public RunLibraryChatGenerationResponse runLibraryChatGeneration(String workspaceId, RunLibraryChatGenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runLibraryChatGenerationWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新文档</p>
     * 
     * @param request UpdateDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDocumentResponse
     */
    public UpdateDocumentResponse updateDocumentWithOptions(String workspaceId, UpdateDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docId)) {
            body.put("docId", request.docId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.meta)) {
            body.put("meta", request.meta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDocument"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/updateDocument"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新文档</p>
     * 
     * @param request UpdateDocumentRequest
     * @return UpdateDocumentResponse
     */
    public UpdateDocumentResponse updateDocument(String workspaceId, UpdateDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDocumentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新文档库配置</p>
     * 
     * @param request UpdateLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLibraryResponse
     */
    public UpdateLibraryResponse updateLibraryWithOptions(String workspaceId, UpdateLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexSetting)) {
            body.put("indexSetting", request.indexSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryName)) {
            body.put("libraryName", request.libraryName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLibrary"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/update"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新文档库配置</p>
     * 
     * @param request UpdateLibraryRequest
     * @return UpdateLibraryResponse
     */
    public UpdateLibraryResponse updateLibrary(String workspaceId, UpdateLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLibraryWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上传文档到文档库</p>
     * 
     * @param request UploadDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadDocumentResponse
     */
    public UploadDocumentResponse uploadDocumentWithOptions(String workspaceId, UploadDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadDocument"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/api/library/document/upload"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上传文档到文档库</p>
     * 
     * @param request UploadDocumentRequest
     * @return UploadDocumentResponse
     */
    public UploadDocumentResponse uploadDocument(String workspaceId, UploadDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadDocumentWithOptions(workspaceId, request, headers, runtime);
    }

    public UploadDocumentResponse uploadDocumentAdvance(String workspaceId, UploadDocumentAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "DianJin"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        UploadDocumentRequest uploadDocumentReq = new UploadDocumentRequest();
        com.aliyun.openapiutil.Client.convert(request, uploadDocumentReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.fileUrlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            uploadDocumentReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        UploadDocumentResponse uploadDocumentResp = this.uploadDocumentWithOptions(workspaceId, uploadDocumentReq, headers, runtime);
        return uploadDocumentResp;
    }
}
