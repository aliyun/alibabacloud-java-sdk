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

    public AddStoryFilesResponse addStoryFilesWithOptions(AddStoryFilesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddStoryFilesShrinkRequest request = new AddStoryFilesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "Files", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            body.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filesShrink)) {
            body.put("Files", request.filesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            body.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddStoryFiles"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddStoryFilesResponse());
    }

    public AddStoryFilesResponse addStoryFiles(AddStoryFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addStoryFilesWithOptions(request, runtime);
    }

    public AttachOSSBucketResponse attachOSSBucketWithOptions(AttachOSSBucketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.OSSBucket)) {
            query.put("OSSBucket", request.OSSBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachOSSBucket"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachOSSBucketResponse());
    }

    public AttachOSSBucketResponse attachOSSBucket(AttachOSSBucketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachOSSBucketWithOptions(request, runtime);
    }

    public BatchDeleteFileMetaResponse batchDeleteFileMetaWithOptions(BatchDeleteFileMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchDeleteFileMetaShrinkRequest request = new BatchDeleteFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.URIs)) {
            request.URIsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.URIs, "URIs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URIsShrink)) {
            query.put("URIs", request.URIsShrink);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URIsShrink)) {
            query.put("URIs", request.URIsShrink);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filesShrink)) {
            query.put("Files", request.filesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filesShrink)) {
            query.put("Files", request.filesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

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

    public CreateBindingResponse createBindingWithOptions(CreateBindingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

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

    public CreateCompressPointCloudTaskResponse createCompressPointCloudTaskWithOptions(CreateCompressPointCloudTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCompressPointCloudTaskShrinkRequest request = new CreateCompressPointCloudTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.kdtreeOption))) {
            request.kdtreeOptionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.kdtreeOption), "KdtreeOption", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.octreeOption))) {
            request.octreeOptionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.octreeOption), "OctreeOption", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pointCloudFields)) {
            request.pointCloudFieldsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pointCloudFields, "PointCloudFields", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compressMethod)) {
            query.put("CompressMethod", request.compressMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kdtreeOptionShrink)) {
            query.put("KdtreeOption", request.kdtreeOptionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.octreeOptionShrink)) {
            query.put("OctreeOption", request.octreeOptionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pointCloudFieldsShrink)) {
            query.put("PointCloudFields", request.pointCloudFieldsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pointCloudFileFormat)) {
            query.put("PointCloudFileFormat", request.pointCloudFileFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetURI)) {
            query.put("TargetURI", request.targetURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCompressPointCloudTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCompressPointCloudTaskResponse());
    }

    public CreateCompressPointCloudTaskResponse createCompressPointCloudTask(CreateCompressPointCloudTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCompressPointCloudTaskWithOptions(request, runtime);
    }

    public CreateDatasetResponse createDatasetWithOptions(CreateDatasetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxBindCount)) {
            query.put("DatasetMaxBindCount", request.datasetMaxBindCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxEntityCount)) {
            query.put("DatasetMaxEntityCount", request.datasetMaxEntityCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxFileCount)) {
            query.put("DatasetMaxFileCount", request.datasetMaxFileCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxRelationCount)) {
            query.put("DatasetMaxRelationCount", request.datasetMaxRelationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxTotalFileSize)) {
            query.put("DatasetMaxTotalFileSize", request.datasetMaxTotalFileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

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

    public CreateDetectVideoLabelsTaskResponse createDetectVideoLabelsTaskWithOptions(CreateDetectVideoLabelsTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDetectVideoLabelsTaskShrinkRequest request = new CreateDetectVideoLabelsTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

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

    public CreateFigureClusteringTaskResponse createFigureClusteringTaskWithOptions(CreateFigureClusteringTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFigureClusteringTaskShrinkRequest request = new CreateFigureClusteringTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFigureClusteringTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFigureClusteringTaskResponse());
    }

    public CreateFigureClusteringTaskResponse createFigureClusteringTask(CreateFigureClusteringTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFigureClusteringTaskWithOptions(request, runtime);
    }

    public CreateFigureClustersMergingTaskResponse createFigureClustersMergingTaskWithOptions(CreateFigureClustersMergingTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFigureClustersMergingTaskShrinkRequest request = new CreateFigureClustersMergingTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("To", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFigureClustersMergingTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFigureClustersMergingTaskResponse());
    }

    public CreateFigureClustersMergingTaskResponse createFigureClustersMergingTask(CreateFigureClustersMergingTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFigureClustersMergingTaskWithOptions(request, runtime);
    }

    public CreateImageModerationTaskResponse createImageModerationTaskWithOptions(CreateImageModerationTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateImageModerationTaskShrinkRequest request = new CreateImageModerationTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scenes)) {
            request.scenesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scenes, "Scenes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxFrames)) {
            query.put("MaxFrames", request.maxFrames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewer)) {
            query.put("Reviewer", request.reviewer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenesShrink)) {
            query.put("Scenes", request.scenesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageModerationTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageModerationTaskResponse());
    }

    public CreateImageModerationTaskResponse createImageModerationTask(CreateImageModerationTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImageModerationTaskWithOptions(request, runtime);
    }

    public CreateImageSplicingTaskResponse createImageSplicingTaskWithOptions(CreateImageSplicingTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateImageSplicingTaskShrinkRequest request = new CreateImageSplicingTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sources)) {
            request.sourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sources, "Sources", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.align)) {
            query.put("Align", request.align);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundColor)) {
            query.put("BackgroundColor", request.backgroundColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageFormat)) {
            query.put("ImageFormat", request.imageFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.margin)) {
            query.put("Margin", request.margin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.padding)) {
            query.put("Padding", request.padding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quality)) {
            query.put("Quality", request.quality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleType)) {
            query.put("ScaleType", request.scaleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcesShrink)) {
            query.put("Sources", request.sourcesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetURI)) {
            query.put("TargetURI", request.targetURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageSplicingTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageSplicingTaskResponse());
    }

    public CreateImageSplicingTaskResponse createImageSplicingTask(CreateImageSplicingTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImageSplicingTaskWithOptions(request, runtime);
    }

    public CreateMediaConvertTaskResponse createMediaConvertTaskWithOptions(CreateMediaConvertTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMediaConvertTaskShrinkRequest request = new CreateMediaConvertTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sources)) {
            request.sourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sources, "Sources", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.targets)) {
            request.targetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.targets, "Targets", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcesShrink)) {
            query.put("Sources", request.sourcesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetsShrink)) {
            query.put("Targets", request.targetsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMediaConvertTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMediaConvertTaskResponse());
    }

    public CreateMediaConvertTaskResponse createMediaConvertTask(CreateMediaConvertTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMediaConvertTaskWithOptions(request, runtime);
    }

    public CreateOfficeConversionTaskResponse createOfficeConversionTaskWithOptions(CreateOfficeConversionTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOfficeConversionTaskShrinkRequest request = new CreateOfficeConversionTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.trimPolicy))) {
            request.trimPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.trimPolicy), "TrimPolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPage)) {
            query.put("EndPage", request.endPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstPage)) {
            query.put("FirstPage", request.firstPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fitToHeight)) {
            query.put("FitToHeight", request.fitToHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fitToWidth)) {
            query.put("FitToWidth", request.fitToWidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.holdLineFeed)) {
            query.put("HoldLineFeed", request.holdLineFeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageDPI)) {
            query.put("ImageDPI", request.imageDPI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longPicture)) {
            query.put("LongPicture", request.longPicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longText)) {
            query.put("LongText", request.longText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSheetColumn)) {
            query.put("MaxSheetColumn", request.maxSheetColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSheetRow)) {
            query.put("MaxSheetRow", request.maxSheetRow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pages)) {
            query.put("Pages", request.pages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paperHorizontal)) {
            query.put("PaperHorizontal", request.paperHorizontal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paperSize)) {
            query.put("PaperSize", request.paperSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quality)) {
            query.put("Quality", request.quality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalePercentage)) {
            query.put("ScalePercentage", request.scalePercentage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetCount)) {
            query.put("SheetCount", request.sheetCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetIndex)) {
            query.put("SheetIndex", request.sheetIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showComments)) {
            query.put("ShowComments", request.showComments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startPage)) {
            query.put("StartPage", request.startPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetURI)) {
            query.put("TargetURI", request.targetURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetURIPrefix)) {
            query.put("TargetURIPrefix", request.targetURIPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trimPolicyShrink)) {
            query.put("TrimPolicy", request.trimPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOfficeConversionTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOfficeConversionTaskResponse());
    }

    public CreateOfficeConversionTaskResponse createOfficeConversionTask(CreateOfficeConversionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOfficeConversionTaskWithOptions(request, runtime);
    }

    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxBindCount)) {
            query.put("DatasetMaxBindCount", request.datasetMaxBindCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxEntityCount)) {
            query.put("DatasetMaxEntityCount", request.datasetMaxEntityCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxFileCount)) {
            query.put("DatasetMaxFileCount", request.datasetMaxFileCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxRelationCount)) {
            query.put("DatasetMaxRelationCount", request.datasetMaxRelationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxTotalFileSize)) {
            query.put("DatasetMaxTotalFileSize", request.datasetMaxTotalFileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineConcurrency)) {
            query.put("EngineConcurrency", request.engineConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectMaxDatasetCount)) {
            query.put("ProjectMaxDatasetCount", request.projectMaxDatasetCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectQueriesPerSecond)) {
            query.put("ProjectQueriesPerSecond", request.projectQueriesPerSecond);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRole)) {
            query.put("ServiceRole", request.serviceRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

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

    public CreateStoryResponse createStoryWithOptions(CreateStoryRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStoryShrinkRequest request = new CreateStoryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customLabels)) {
            request.customLabelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customLabels, "CustomLabels", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customId)) {
            body.put("CustomId", request.customId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customLabelsShrink)) {
            body.put("CustomLabels", request.customLabelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            body.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxFileCount)) {
            body.put("MaxFileCount", request.maxFileCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minFileCount)) {
            body.put("MinFileCount", request.minFileCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            body.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            body.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyEndTime)) {
            body.put("StoryEndTime", request.storyEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyName)) {
            body.put("StoryName", request.storyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyStartTime)) {
            body.put("StoryStartTime", request.storyStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storySubType)) {
            body.put("StorySubType", request.storySubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyType)) {
            body.put("StoryType", request.storyType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStory"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStoryResponse());
    }

    public CreateStoryResponse createStory(CreateStoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStoryWithOptions(request, runtime);
    }

    public CreateVideoModerationTaskResponse createVideoModerationTaskWithOptions(CreateVideoModerationTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateVideoModerationTaskShrinkRequest request = new CreateVideoModerationTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scenes)) {
            request.scenesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scenes, "Scenes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxFrames)) {
            query.put("MaxFrames", request.maxFrames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewer)) {
            query.put("Reviewer", request.reviewer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenesShrink)) {
            query.put("Scenes", request.scenesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVideoModerationTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVideoModerationTaskResponse());
    }

    public CreateVideoModerationTaskResponse createVideoModerationTask(CreateVideoModerationTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVideoModerationTaskWithOptions(request, runtime);
    }

    public DeleteBindingResponse deleteBindingWithOptions(DeleteBindingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cleanup)) {
            query.put("Cleanup", request.cleanup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

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

    public DeleteStoryResponse deleteStoryWithOptions(DeleteStoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStory"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStoryResponse());
    }

    public DeleteStoryResponse deleteStory(DeleteStoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStoryWithOptions(request, runtime);
    }

    public DetachOSSBucketResponse detachOSSBucketWithOptions(DetachOSSBucketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.OSSBucket)) {
            query.put("OSSBucket", request.OSSBucket);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachOSSBucket"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachOSSBucketResponse());
    }

    public DetachOSSBucketResponse detachOSSBucket(DetachOSSBucketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachOSSBucketWithOptions(request, runtime);
    }

    public DetectImageBodiesResponse detectImageBodiesWithOptions(DetectImageBodiesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectImageBodiesShrinkRequest request = new DetectImageBodiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitivity)) {
            query.put("Sensitivity", request.sensitivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageBodies"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageBodiesResponse());
    }

    public DetectImageBodiesResponse detectImageBodies(DetectImageBodiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectImageBodiesWithOptions(request, runtime);
    }

    public DetectImageCodesResponse detectImageCodesWithOptions(DetectImageCodesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectImageCodesShrinkRequest request = new DetectImageCodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageCodes"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageCodesResponse());
    }

    public DetectImageCodesResponse detectImageCodes(DetectImageCodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectImageCodesWithOptions(request, runtime);
    }

    public DetectImageCroppingResponse detectImageCroppingWithOptions(DetectImageCroppingRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectImageCroppingShrinkRequest request = new DetectImageCroppingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aspectRatios)) {
            query.put("AspectRatios", request.aspectRatios);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageCropping"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageCroppingResponse());
    }

    public DetectImageCroppingResponse detectImageCropping(DetectImageCroppingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectImageCroppingWithOptions(request, runtime);
    }

    public DetectImageFacesResponse detectImageFacesWithOptions(DetectImageFacesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectImageFacesShrinkRequest request = new DetectImageFacesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageFaces"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageFacesResponse());
    }

    public DetectImageFacesResponse detectImageFaces(DetectImageFacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectImageFacesWithOptions(request, runtime);
    }

    public DetectImageLabelsResponse detectImageLabelsWithOptions(DetectImageLabelsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectImageLabelsShrinkRequest request = new DetectImageLabelsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

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

    public DetectImageScoreResponse detectImageScoreWithOptions(DetectImageScoreRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectImageScoreShrinkRequest request = new DetectImageScoreShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageScore"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageScoreResponse());
    }

    public DetectImageScoreResponse detectImageScore(DetectImageScoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectImageScoreWithOptions(request, runtime);
    }

    public DetectTextAnomalyResponse detectTextAnomalyWithOptions(DetectTextAnomalyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectTextAnomaly"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectTextAnomalyResponse());
    }

    public DetectTextAnomalyResponse detectTextAnomaly(DetectTextAnomalyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectTextAnomalyWithOptions(request, runtime);
    }

    public FuzzyQueryResponse fuzzyQueryWithOptions(FuzzyQueryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withStatistics)) {
            query.put("WithStatistics", request.withStatistics);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

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

    public GetMediaMetaResponse getMediaMetaWithOptions(GetMediaMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetMediaMetaShrinkRequest request = new GetMediaMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaMetaResponse());
    }

    public GetMediaMetaResponse getMediaMeta(GetMediaMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaMetaWithOptions(request, runtime);
    }

    public GetOSSBucketAttachmentResponse getOSSBucketAttachmentWithOptions(GetOSSBucketAttachmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.OSSBucket)) {
            query.put("OSSBucket", request.OSSBucket);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOSSBucketAttachment"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOSSBucketAttachmentResponse());
    }

    public GetOSSBucketAttachmentResponse getOSSBucketAttachment(GetOSSBucketAttachmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOSSBucketAttachmentWithOptions(request, runtime);
    }

    public GetProjectResponse getProjectWithOptions(GetProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withStatistics)) {
            query.put("WithStatistics", request.withStatistics);
        }

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

    public GetStoryResponse getStoryWithOptions(GetStoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStory"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStoryResponse());
    }

    public GetStoryResponse getStory(GetStoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStoryWithOptions(request, runtime);
    }

    public GetTaskResponse getTaskWithOptions(GetTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
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
        if (!com.aliyun.teautil.Common.isUnset(request.cachePreview)) {
            query.put("CachePreview", request.cachePreview);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalUploaded)) {
            query.put("ExternalUploaded", request.externalUploaded);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filename)) {
            query.put("Filename", request.filename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hidecmb)) {
            query.put("Hidecmb", request.hidecmb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionShrink)) {
            query.put("Permission", request.permissionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewPages)) {
            query.put("PreviewPages", request.previewPages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referer)) {
            query.put("Referer", request.referer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userShrink)) {
            query.put("User", request.userShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkShrink)) {
            query.put("Watermark", request.watermarkShrink);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileShrink)) {
            query.put("File", request.fileShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("Prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

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

    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("Prefix", request.prefix);
        }

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

    public ListRegionsResponse listRegionsWithOptions(ListRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
    }

    public ListRegionsResponse listRegions(ListRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRegionsWithOptions(request, runtime);
    }

    public ListTasksResponse listTasksWithOptions(ListTasksRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTasksShrinkRequest request = new ListTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.endTimeRange))) {
            request.endTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.endTimeRange), "EndTimeRange", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.startTimeRange))) {
            request.startTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.startTimeRange), "StartTimeRange", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskTypes)) {
            request.taskTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskTypes, "TaskTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimeRangeShrink)) {
            query.put("EndTimeRange", request.endTimeRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeRangeShrink)) {
            query.put("StartTimeRange", request.startTimeRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagSelector)) {
            query.put("TagSelector", request.tagSelector);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskTypesShrink)) {
            query.put("TaskTypes", request.taskTypesShrink);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clusterIdFrom)) {
            query.put("ClusterIdFrom", request.clusterIdFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterIdTo)) {
            query.put("ClusterIdTo", request.clusterIdTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customMessage)) {
            query.put("CustomMessage", request.customMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.figureType)) {
            query.put("FigureType", request.figureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicEndpoint)) {
            query.put("NotifyTopicEndpoint", request.notifyTopicEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

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

    public QueryFigureClustersResponse queryFigureClustersWithOptions(QueryFigureClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customLabels)) {
            query.put("CustomLabels", request.customLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFigureClusters"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFigureClustersResponse());
    }

    public QueryFigureClustersResponse queryFigureClusters(QueryFigureClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFigureClustersWithOptions(request, runtime);
    }

    public QueryStoriesResponse queryStoriesWithOptions(QueryStoriesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryStoriesShrinkRequest request = new QueryStoriesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.createTimeRange))) {
            request.createTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.createTimeRange), "CreateTimeRange", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.figureClusterIds)) {
            request.figureClusterIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.figureClusterIds, "FigureClusterIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.storyEndTimeRange))) {
            request.storyEndTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.storyEndTimeRange), "StoryEndTimeRange", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.storyStartTimeRange))) {
            request.storyStartTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.storyStartTimeRange), "StoryStartTimeRange", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeRangeShrink)) {
            query.put("CreateTimeRange", request.createTimeRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customLabels)) {
            query.put("CustomLabels", request.customLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.figureClusterIdsShrink)) {
            query.put("FigureClusterIds", request.figureClusterIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyEndTimeRangeShrink)) {
            query.put("StoryEndTimeRange", request.storyEndTimeRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyName)) {
            query.put("StoryName", request.storyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyStartTimeRangeShrink)) {
            query.put("StoryStartTimeRange", request.storyStartTimeRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storySubType)) {
            query.put("StorySubType", request.storySubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyType)) {
            query.put("StoryType", request.storyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withEmptyStories)) {
            query.put("WithEmptyStories", request.withEmptyStories);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryStories"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryStoriesResponse());
    }

    public QueryStoriesResponse queryStories(QueryStoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryStoriesWithOptions(request, runtime);
    }

    public RefreshWebofficeTokenResponse refreshWebofficeTokenWithOptions(RefreshWebofficeTokenRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RefreshWebofficeTokenShrinkRequest request = new RefreshWebofficeTokenShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.credentialConfig))) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.credentialConfig), "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshToken)) {
            query.put("RefreshToken", request.refreshToken);
        }

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

    public RemoveStoryFilesResponse removeStoryFilesWithOptions(RemoveStoryFilesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveStoryFilesShrinkRequest request = new RemoveStoryFilesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "Files", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            body.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filesShrink)) {
            body.put("Files", request.filesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            body.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveStoryFiles"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveStoryFilesResponse());
    }

    public RemoveStoryFilesResponse removeStoryFiles(RemoveStoryFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeStoryFilesWithOptions(request, runtime);
    }

    public ResumeBindingResponse resumeBindingWithOptions(ResumeBindingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.withFields)) {
            request.withFieldsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.withFields, "WithFields", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregationsShrink)) {
            query.put("Aggregations", request.aggregationsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryShrink)) {
            query.put("Query", request.queryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withFieldsShrink)) {
            query.put("WithFields", request.withFieldsShrink);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxBindCount)) {
            query.put("DatasetMaxBindCount", request.datasetMaxBindCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxEntityCount)) {
            query.put("DatasetMaxEntityCount", request.datasetMaxEntityCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxFileCount)) {
            query.put("DatasetMaxFileCount", request.datasetMaxFileCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxRelationCount)) {
            query.put("DatasetMaxRelationCount", request.datasetMaxRelationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxTotalFileSize)) {
            query.put("DatasetMaxTotalFileSize", request.datasetMaxTotalFileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.figureClusterShrink)) {
            query.put("FigureCluster", request.figureClusterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileShrink)) {
            query.put("File", request.fileShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxBindCount)) {
            query.put("DatasetMaxBindCount", request.datasetMaxBindCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxEntityCount)) {
            query.put("DatasetMaxEntityCount", request.datasetMaxEntityCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxFileCount)) {
            query.put("DatasetMaxFileCount", request.datasetMaxFileCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxRelationCount)) {
            query.put("DatasetMaxRelationCount", request.datasetMaxRelationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxTotalFileSize)) {
            query.put("DatasetMaxTotalFileSize", request.datasetMaxTotalFileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineConcurrency)) {
            query.put("EngineConcurrency", request.engineConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectMaxDatasetCount)) {
            query.put("ProjectMaxDatasetCount", request.projectMaxDatasetCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectQueriesPerSecond)) {
            query.put("ProjectQueriesPerSecond", request.projectQueriesPerSecond);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRole)) {
            query.put("ServiceRole", request.serviceRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

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

    public UpdateStoryResponse updateStoryWithOptions(UpdateStoryRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStoryShrinkRequest request = new UpdateStoryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.cover))) {
            request.coverShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.cover), "Cover", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customLabels)) {
            request.customLabelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customLabels, "CustomLabels", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coverShrink)) {
            body.put("Cover", request.coverShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customId)) {
            body.put("CustomId", request.customId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customLabelsShrink)) {
            body.put("CustomLabels", request.customLabelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            body.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            body.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyName)) {
            body.put("StoryName", request.storyName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStory"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStoryResponse());
    }

    public UpdateStoryResponse updateStory(UpdateStoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateStoryWithOptions(request, runtime);
    }
}
