// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930;

import com.aliyun.tea.*;
import com.aliyun.imm20200930.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing-gov-1", "imm-vpc.cn-beijing-gov-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("imm", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public BatchDeleteFileMetaResponse batchDeleteFileMetaWithOptions(BatchDeleteFileMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchDeleteFileMetaShrinkRequest request = new BatchDeleteFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.URIs)) {
            request.URIsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.URIs, "URIs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("ProjectName", request.projectName);
        query.put("URIs", request.URIsShrink);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteFileMetaResponse());
    }

    public BatchDeleteFileMetaResponse batchDeleteFileMeta(BatchDeleteFileMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteFileMetaWithOptions(request, runtime);
    }

    public BatchGetFileMetaResponse batchGetFileMetaWithOptions(BatchGetFileMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchGetFileMetaShrinkRequest request = new BatchGetFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.URIs)) {
            request.URIsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.URIs, "URIs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("ProjectName", request.projectName);
        query.put("URIs", request.URIsShrink);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetFileMetaResponse());
    }

    public BatchGetFileMetaResponse batchGetFileMeta(BatchGetFileMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetFileMetaWithOptions(request, runtime);
    }

    public BatchIndexFileMetaResponse batchIndexFileMetaWithOptions(BatchIndexFileMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchIndexFileMetaShrinkRequest request = new BatchIndexFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "Files", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("Files", request.filesShrink);
        query.put("NotifyEndpoint", request.notifyEndpoint);
        query.put("NotifyTopicName", request.notifyTopicName);
        query.put("ProjectName", request.projectName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchIndexFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchIndexFileMetaResponse());
    }

    public BatchIndexFileMetaResponse batchIndexFileMeta(BatchIndexFileMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchIndexFileMetaWithOptions(request, runtime);
    }

    public BatchUpdateFileMetaResponse batchUpdateFileMetaWithOptions(BatchUpdateFileMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchUpdateFileMetaShrinkRequest request = new BatchUpdateFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "Files", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("Files", request.filesShrink);
        query.put("ProjectName", request.projectName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateFileMetaResponse());
    }

    public BatchUpdateFileMetaResponse batchUpdateFileMeta(BatchUpdateFileMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUpdateFileMetaWithOptions(request, runtime);
    }

    public ClusterFiguresResponse clusterFiguresWithOptions(ClusterFiguresRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CustomMessage", request.customMessage);
        query.put("DatasetName", request.datasetName);
        query.put("FigureType", request.figureType);
        query.put("NotifyTopicEndpoint", request.notifyTopicEndpoint);
        query.put("NotifyTopicName", request.notifyTopicName);
        query.put("ProjectName", request.projectName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClusterFigures"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClusterFiguresResponse());
    }

    public ClusterFiguresResponse clusterFigures(ClusterFiguresRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clusterFiguresWithOptions(request, runtime);
    }

    public CreateBindingResponse createBindingWithOptions(CreateBindingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("ProjectName", request.projectName);
        query.put("URI", request.URI);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBinding"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBindingResponse());
    }

    public CreateBindingResponse createBinding(CreateBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBindingWithOptions(request, runtime);
    }

    public CreateDatasetResponse createDatasetWithOptions(CreateDatasetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetMaxBindCount", request.datasetMaxBindCount);
        query.put("DatasetMaxEntityCount", request.datasetMaxEntityCount);
        query.put("DatasetMaxFileCount", request.datasetMaxFileCount);
        query.put("DatasetMaxRelationCount", request.datasetMaxRelationCount);
        query.put("DatasetMaxTotalFileSize", request.datasetMaxTotalFileSize);
        query.put("DatasetName", request.datasetName);
        query.put("Description", request.description);
        query.put("ProjectName", request.projectName);
        query.put("TemplateId", request.templateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataset"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatasetResponse());
    }

    public CreateDatasetResponse createDataset(CreateDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDatasetWithOptions(request, runtime);
    }

    public CreateDetectVideoLabelsTaskResponse createDetectVideoLabelsTaskWithOptions(CreateDetectVideoLabelsTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectName", request.projectName);
        query.put("SourceURI", request.sourceURI);
        query.put("UserData", request.userData);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDetectVideoLabelsTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDetectVideoLabelsTaskResponse());
    }

    public CreateDetectVideoLabelsTaskResponse createDetectVideoLabelsTask(CreateDetectVideoLabelsTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDetectVideoLabelsTaskWithOptions(request, runtime);
    }

    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetMaxBindCount", request.datasetMaxBindCount);
        query.put("DatasetMaxEntityCount", request.datasetMaxEntityCount);
        query.put("DatasetMaxFileCount", request.datasetMaxFileCount);
        query.put("DatasetMaxRelationCount", request.datasetMaxRelationCount);
        query.put("DatasetMaxTotalFileSize", request.datasetMaxTotalFileSize);
        query.put("Description", request.description);
        query.put("EngineConcurrency", request.engineConcurrency);
        query.put("ProjectMaxDatasetCount", request.projectMaxDatasetCount);
        query.put("ProjectName", request.projectName);
        query.put("ProjectQueriesPerSecond", request.projectQueriesPerSecond);
        query.put("ServiceRole", request.serviceRole);
        query.put("TemplateId", request.templateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    public DeleteBindingResponse deleteBindingWithOptions(DeleteBindingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("ProjectName", request.projectName);
        query.put("URI", request.URI);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBinding"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBindingResponse());
    }

    public DeleteBindingResponse deleteBinding(DeleteBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBindingWithOptions(request, runtime);
    }

    public DeleteDatasetResponse deleteDatasetWithOptions(DeleteDatasetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("ProjectName", request.projectName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataset"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatasetResponse());
    }

    public DeleteDatasetResponse deleteDataset(DeleteDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDatasetWithOptions(request, runtime);
    }

    public DeleteFileMetaResponse deleteFileMetaWithOptions(DeleteFileMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("ProjectName", request.projectName);
        query.put("URI", request.URI);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFileMetaResponse());
    }

    public DeleteFileMetaResponse deleteFileMeta(DeleteFileMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFileMetaWithOptions(request, runtime);
    }

    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectName", request.projectName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    public DetectImageLabelsResponse detectImageLabelsWithOptions(DetectImageLabelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectName", request.projectName);
        query.put("SourceURI", request.sourceURI);
        query.put("Threshold", request.threshold);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageLabels"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageLabelsResponse());
    }

    public DetectImageLabelsResponse detectImageLabels(DetectImageLabelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectImageLabelsWithOptions(request, runtime);
    }

    public FuzzyQueryResponse fuzzyQueryWithOptions(FuzzyQueryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("ProjectName", request.projectName);
        query.put("Query", request.query);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FuzzyQuery"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FuzzyQueryResponse());
    }

    public FuzzyQueryResponse fuzzyQuery(FuzzyQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fuzzyQueryWithOptions(request, runtime);
    }

    public GetBindingResponse getBindingWithOptions(GetBindingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("ProjectName", request.projectName);
        query.put("URI", request.URI);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBinding"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBindingResponse());
    }

    public GetBindingResponse getBinding(GetBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBindingWithOptions(request, runtime);
    }

    public GetDatasetResponse getDatasetWithOptions(GetDatasetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("ProjectName", request.projectName);
        query.put("WithStatistics", request.withStatistics);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataset"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatasetResponse());
    }

    public GetDatasetResponse getDataset(GetDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDatasetWithOptions(request, runtime);
    }

    public GetDetectVideoLabelsResultResponse getDetectVideoLabelsResultWithOptions(GetDetectVideoLabelsResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectName", request.projectName);
        query.put("TaskId", request.taskId);
        query.put("TaskType", request.taskType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDetectVideoLabelsResult"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDetectVideoLabelsResultResponse());
    }

    public GetDetectVideoLabelsResultResponse getDetectVideoLabelsResult(GetDetectVideoLabelsResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDetectVideoLabelsResultWithOptions(request, runtime);
    }

    public GetFigureClusterResponse getFigureClusterWithOptions(GetFigureClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("FigureClusterId", request.figureClusterId);
        query.put("ProjectName", request.projectName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFigureCluster"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFigureClusterResponse());
    }

    public GetFigureClusterResponse getFigureCluster(GetFigureClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFigureClusterWithOptions(request, runtime);
    }

    public GetFileMetaResponse getFileMetaWithOptions(GetFileMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("ProjectName", request.projectName);
        query.put("URI", request.URI);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileMetaResponse());
    }

    public GetFileMetaResponse getFileMeta(GetFileMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFileMetaWithOptions(request, runtime);
    }

    public GetFileSignedURIResponse getFileSignedURIWithOptions(GetFileSignedURIRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectName", request.projectName);
        query.put("URI", request.URI);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileSignedURI"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileSignedURIResponse());
    }

    public GetFileSignedURIResponse getFileSignedURI(GetFileSignedURIRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFileSignedURIWithOptions(request, runtime);
    }

    public GetProjectResponse getProjectWithOptions(GetProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectName", request.projectName);
        query.put("WithStatistics", request.withStatistics);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectResponse());
    }

    public GetProjectResponse getProject(GetProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getProjectWithOptions(request, runtime);
    }

    public GetTaskResponse getTaskWithOptions(GetTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectName", request.projectName);
        query.put("TaskId", request.taskId);
        query.put("TaskType", request.taskType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    public GetTaskResponse getTask(GetTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskWithOptions(request, runtime);
    }

    public GetWebofficeURLResponse getWebofficeURLWithOptions(GetWebofficeURLRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetWebofficeURLShrinkRequest request = new GetWebofficeURLShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.assumeRoleChain))) {
            request.assumeRoleChainShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.assumeRoleChain), "AssumeRoleChain", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.permission))) {
            request.permissionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.permission), "Permission", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.user))) {
            request.userShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.user), "User", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.watermark))) {
            request.watermarkShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.watermark), "Watermark", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AssumeRoleChain", request.assumeRoleChainShrink);
        query.put("ExternalUploaded", request.externalUploaded);
        query.put("Filename", request.filename);
        query.put("Hidecmb", request.hidecmb);
        query.put("NotifyEndpoint", request.notifyEndpoint);
        query.put("NotifyTopicName", request.notifyTopicName);
        query.put("Password", request.password);
        query.put("Permission", request.permissionShrink);
        query.put("PreviewPages", request.previewPages);
        query.put("ProjectName", request.projectName);
        query.put("Referer", request.referer);
        query.put("SourceURI", request.sourceURI);
        query.put("User", request.userShrink);
        query.put("UserData", request.userData);
        query.put("Watermark", request.watermarkShrink);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWebofficeURL"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWebofficeURLResponse());
    }

    public GetWebofficeURLResponse getWebofficeURL(GetWebofficeURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWebofficeURLWithOptions(request, runtime);
    }

    public IndexFileMetaResponse indexFileMetaWithOptions(IndexFileMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IndexFileMetaShrinkRequest request = new IndexFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.file))) {
            request.fileShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.file), "File", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("File", request.fileShrink);
        query.put("NotifyEndpoint", request.notifyEndpoint);
        query.put("NotifyTopicName", request.notifyTopicName);
        query.put("ProjectName", request.projectName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IndexFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IndexFileMetaResponse());
    }

    public IndexFileMetaResponse indexFileMeta(IndexFileMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.indexFileMetaWithOptions(request, runtime);
    }

    public ListBindingsResponse listBindingsWithOptions(ListBindingsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("ProjectName", request.projectName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBindings"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBindingsResponse());
    }

    public ListBindingsResponse listBindings(ListBindingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBindingsWithOptions(request, runtime);
    }

    public ListDatasetsResponse listDatasetsWithOptions(ListDatasetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("Prefix", request.prefix);
        query.put("ProjectName", request.projectName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatasets"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatasetsResponse());
    }

    public ListDatasetsResponse listDatasets(ListDatasetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDatasetsWithOptions(request, runtime);
    }

    public ListFigureClustersResponse listFigureClustersWithOptions(ListFigureClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("Labels", request.labels);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("Order", request.order);
        query.put("ProjectName", request.projectName);
        query.put("Sort", request.sort);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFigureClusters"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFigureClustersResponse());
    }

    public ListFigureClustersResponse listFigureClusters(ListFigureClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFigureClustersWithOptions(request, runtime);
    }

    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("Prefix", request.prefix);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
    }

    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    public ListTasksResponse listTasksWithOptions(ListTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("ProjectName", request.projectName);
        query.put("TaskType", request.taskType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksResponse());
    }

    public ListTasksResponse listTasks(ListTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTasksWithOptions(request, runtime);
    }

    public MergeFigureClustersResponse mergeFigureClustersWithOptions(MergeFigureClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterIdFrom", request.clusterIdFrom);
        query.put("ClusterIdTo", request.clusterIdTo);
        query.put("CustomMessage", request.customMessage);
        query.put("DatasetName", request.datasetName);
        query.put("FigureType", request.figureType);
        query.put("NotifyTopicEndpoint", request.notifyTopicEndpoint);
        query.put("NotifyTopicName", request.notifyTopicName);
        query.put("ProjectName", request.projectName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MergeFigureClusters"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MergeFigureClustersResponse());
    }

    public MergeFigureClustersResponse mergeFigureClusters(MergeFigureClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.mergeFigureClustersWithOptions(request, runtime);
    }

    public RefreshWebofficeTokenResponse refreshWebofficeTokenWithOptions(RefreshWebofficeTokenRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RefreshWebofficeTokenShrinkRequest request = new RefreshWebofficeTokenShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.assumeRoleChain))) {
            request.assumeRoleChainShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.assumeRoleChain), "AssumeRoleChain", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessToken", request.accessToken);
        query.put("AssumeRoleChain", request.assumeRoleChainShrink);
        query.put("ProjectName", request.projectName);
        query.put("RefreshToken", request.refreshToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshWebofficeToken"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshWebofficeTokenResponse());
    }

    public RefreshWebofficeTokenResponse refreshWebofficeToken(RefreshWebofficeTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshWebofficeTokenWithOptions(request, runtime);
    }

    public ResumeBindingResponse resumeBindingWithOptions(ResumeBindingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("ProjectName", request.projectName);
        query.put("URI", request.URI);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeBinding"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeBindingResponse());
    }

    public ResumeBindingResponse resumeBinding(ResumeBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeBindingWithOptions(request, runtime);
    }

    public SemanticQueryResponse semanticQueryWithOptions(SemanticQueryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("ProjectName", request.projectName);
        query.put("Query", request.query);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SemanticQuery"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SemanticQueryResponse());
    }

    public SemanticQueryResponse semanticQuery(SemanticQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.semanticQueryWithOptions(request, runtime);
    }

    public SimpleQueryResponse simpleQueryWithOptions(SimpleQueryRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SimpleQueryShrinkRequest request = new SimpleQueryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aggregations)) {
            request.aggregationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aggregations, "Aggregations", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.query))) {
            request.queryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.query), "Query", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Aggregations", request.aggregationsShrink);
        query.put("DatasetName", request.datasetName);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("Order", request.order);
        query.put("ProjectName", request.projectName);
        query.put("Query", request.queryShrink);
        query.put("Sort", request.sort);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SimpleQuery"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SimpleQueryResponse());
    }

    public SimpleQueryResponse simpleQuery(SimpleQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.simpleQueryWithOptions(request, runtime);
    }

    public StopBindingResponse stopBindingWithOptions(StopBindingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("ProjectName", request.projectName);
        query.put("Reason", request.reason);
        query.put("URI", request.URI);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopBinding"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopBindingResponse());
    }

    public StopBindingResponse stopBinding(StopBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopBindingWithOptions(request, runtime);
    }

    public UpdateDatasetResponse updateDatasetWithOptions(UpdateDatasetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetMaxBindCount", request.datasetMaxBindCount);
        query.put("DatasetMaxEntityCount", request.datasetMaxEntityCount);
        query.put("DatasetMaxFileCount", request.datasetMaxFileCount);
        query.put("DatasetMaxRelationCount", request.datasetMaxRelationCount);
        query.put("DatasetMaxTotalFileSize", request.datasetMaxTotalFileSize);
        query.put("DatasetName", request.datasetName);
        query.put("Description", request.description);
        query.put("ProjectName", request.projectName);
        query.put("TemplateId", request.templateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataset"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDatasetResponse());
    }

    public UpdateDatasetResponse updateDataset(UpdateDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDatasetWithOptions(request, runtime);
    }

    public UpdateFigureClusterResponse updateFigureClusterWithOptions(UpdateFigureClusterRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateFigureClusterShrinkRequest request = new UpdateFigureClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.figureCluster))) {
            request.figureClusterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.figureCluster), "FigureCluster", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("FigureCluster", request.figureClusterShrink);
        query.put("ProjectName", request.projectName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFigureCluster"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFigureClusterResponse());
    }

    public UpdateFigureClusterResponse updateFigureCluster(UpdateFigureClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFigureClusterWithOptions(request, runtime);
    }

    public UpdateFileMetaResponse updateFileMetaWithOptions(UpdateFileMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateFileMetaShrinkRequest request = new UpdateFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.file))) {
            request.fileShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.file), "File", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetName", request.datasetName);
        query.put("File", request.fileShrink);
        query.put("ProjectName", request.projectName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFileMetaResponse());
    }

    public UpdateFileMetaResponse updateFileMeta(UpdateFileMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFileMetaWithOptions(request, runtime);
    }

    public UpdateProjectResponse updateProjectWithOptions(UpdateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DatasetMaxBindCount", request.datasetMaxBindCount);
        query.put("DatasetMaxEntityCount", request.datasetMaxEntityCount);
        query.put("DatasetMaxFileCount", request.datasetMaxFileCount);
        query.put("DatasetMaxRelationCount", request.datasetMaxRelationCount);
        query.put("DatasetMaxTotalFileSize", request.datasetMaxTotalFileSize);
        query.put("Description", request.description);
        query.put("EngineConcurrency", request.engineConcurrency);
        query.put("ProjectMaxDatasetCount", request.projectMaxDatasetCount);
        query.put("ProjectName", request.projectName);
        query.put("ProjectQueriesPerSecond", request.projectQueriesPerSecond);
        query.put("ServiceRole", request.serviceRole);
        query.put("TemplateId", request.templateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectResponse());
    }

    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProjectWithOptions(request, runtime);
    }
}
