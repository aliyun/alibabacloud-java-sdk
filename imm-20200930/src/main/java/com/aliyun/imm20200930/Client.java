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

    public ListBindingsResponse listBindingsWithOptions(ListBindingsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBindings", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListBindingsResponse());
    }

    public ListBindingsResponse listBindings(ListBindingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBindingsWithOptions(request, runtime);
    }

    public DeleteFileMetaResponse deleteFileMetaWithOptions(DeleteFileMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFileMeta", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFileMetaResponse());
    }

    public DeleteFileMetaResponse deleteFileMeta(DeleteFileMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFileMetaWithOptions(request, runtime);
    }

    public BatchIndexFileMetaResponse batchIndexFileMetaWithOptions(BatchIndexFileMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchIndexFileMetaShrinkRequest request = new BatchIndexFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "Files", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchIndexFileMeta", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new BatchIndexFileMetaResponse());
    }

    public BatchIndexFileMetaResponse batchIndexFileMeta(BatchIndexFileMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchIndexFileMetaWithOptions(request, runtime);
    }

    public SimpleQueryResponse simpleQueryWithOptions(SimpleQueryRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SimpleQueryShrinkRequest request = new SimpleQueryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.query))) {
            request.queryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.query), "Query", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aggregations)) {
            request.aggregationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aggregations, "Aggregations", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SimpleQuery", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new SimpleQueryResponse());
    }

    public SimpleQueryResponse simpleQuery(SimpleQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.simpleQueryWithOptions(request, runtime);
    }

    public GetBindingResponse getBindingWithOptions(GetBindingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBinding", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetBindingResponse());
    }

    public GetBindingResponse getBinding(GetBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBindingWithOptions(request, runtime);
    }

    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListProjects", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListProjectsResponse());
    }

    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    public GetDatasetResponse getDatasetWithOptions(GetDatasetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDataset", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetDatasetResponse());
    }

    public GetDatasetResponse getDataset(GetDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDatasetWithOptions(request, runtime);
    }

    public BatchUpdateFileMetaResponse batchUpdateFileMetaWithOptions(BatchUpdateFileMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchUpdateFileMetaShrinkRequest request = new BatchUpdateFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "Files", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchUpdateFileMeta", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new BatchUpdateFileMetaResponse());
    }

    public BatchUpdateFileMetaResponse batchUpdateFileMeta(BatchUpdateFileMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUpdateFileMetaWithOptions(request, runtime);
    }

    public CreateOfficeConversionTaskResponse createOfficeConversionTaskWithOptions(CreateOfficeConversionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOfficeConversionTask", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOfficeConversionTaskResponse());
    }

    public CreateOfficeConversionTaskResponse createOfficeConversionTask(CreateOfficeConversionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOfficeConversionTaskWithOptions(request, runtime);
    }

    public GetWebofficeURLResponse getWebofficeURLWithOptions(GetWebofficeURLRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetWebofficeURLShrinkRequest request = new GetWebofficeURLShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.permission))) {
            request.permissionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.permission), "Permission", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.user))) {
            request.userShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.user), "User", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.watermark))) {
            request.watermarkShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.watermark), "Watermark", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.assumeRoleChain))) {
            request.assumeRoleChainShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.assumeRoleChain), "AssumeRoleChain", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetWebofficeURL", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetWebofficeURLResponse());
    }

    public GetWebofficeURLResponse getWebofficeURL(GetWebofficeURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWebofficeURLWithOptions(request, runtime);
    }

    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateProject", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateProjectResponse());
    }

    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    public ListDatasetsResponse listDatasetsWithOptions(ListDatasetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDatasets", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListDatasetsResponse());
    }

    public ListDatasetsResponse listDatasets(ListDatasetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDatasetsWithOptions(request, runtime);
    }

    public DeleteBindingResponse deleteBindingWithOptions(DeleteBindingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBinding", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBindingResponse());
    }

    public DeleteBindingResponse deleteBinding(DeleteBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBindingWithOptions(request, runtime);
    }

    public RefreshWebofficeTokenResponse refreshWebofficeTokenWithOptions(RefreshWebofficeTokenRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RefreshWebofficeTokenShrinkRequest request = new RefreshWebofficeTokenShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.assumeRoleChain))) {
            request.assumeRoleChainShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.assumeRoleChain), "AssumeRoleChain", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshWebofficeToken", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshWebofficeTokenResponse());
    }

    public RefreshWebofficeTokenResponse refreshWebofficeToken(RefreshWebofficeTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshWebofficeTokenWithOptions(request, runtime);
    }

    public CreateBindingResponse createBindingWithOptions(CreateBindingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBinding", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBindingResponse());
    }

    public CreateBindingResponse createBinding(CreateBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBindingWithOptions(request, runtime);
    }

    public DeleteDatasetResponse deleteDatasetWithOptions(DeleteDatasetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDataset", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDatasetResponse());
    }

    public DeleteDatasetResponse deleteDataset(DeleteDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDatasetWithOptions(request, runtime);
    }

    public GetOfficeConversionTaskResponse getOfficeConversionTaskWithOptions(GetOfficeConversionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOfficeConversionTask", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetOfficeConversionTaskResponse());
    }

    public GetOfficeConversionTaskResponse getOfficeConversionTask(GetOfficeConversionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOfficeConversionTaskWithOptions(request, runtime);
    }

    public GetFileMetaResponse getFileMetaWithOptions(GetFileMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetFileMeta", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetFileMetaResponse());
    }

    public GetFileMetaResponse getFileMeta(GetFileMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFileMetaWithOptions(request, runtime);
    }

    public BatchDeleteFileMetaResponse batchDeleteFileMetaWithOptions(BatchDeleteFileMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchDeleteFileMetaShrinkRequest request = new BatchDeleteFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.URIs)) {
            request.URIsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.URIs, "URIs", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchDeleteFileMeta", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new BatchDeleteFileMetaResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchGetFileMeta", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new BatchGetFileMetaResponse());
    }

    public BatchGetFileMetaResponse batchGetFileMeta(BatchGetFileMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetFileMetaWithOptions(request, runtime);
    }

    public StopBindingResponse stopBindingWithOptions(StopBindingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopBinding", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new StopBindingResponse());
    }

    public StopBindingResponse stopBinding(StopBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopBindingWithOptions(request, runtime);
    }

    public ResumeBindingResponse resumeBindingWithOptions(ResumeBindingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResumeBinding", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ResumeBindingResponse());
    }

    public ResumeBindingResponse resumeBinding(ResumeBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeBindingWithOptions(request, runtime);
    }

    public UpdateFileMetaResponse updateFileMetaWithOptions(UpdateFileMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateFileMetaShrinkRequest request = new UpdateFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.file))) {
            request.fileShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.file), "File", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFileMeta", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFileMetaResponse());
    }

    public UpdateFileMetaResponse updateFileMeta(UpdateFileMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFileMetaWithOptions(request, runtime);
    }

    public IndexFileMetaResponse indexFileMetaWithOptions(IndexFileMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IndexFileMetaShrinkRequest request = new IndexFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.file))) {
            request.fileShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.file), "File", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("IndexFileMeta", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new IndexFileMetaResponse());
    }

    public IndexFileMetaResponse indexFileMeta(IndexFileMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.indexFileMetaWithOptions(request, runtime);
    }

    public DetectImageLabelsResponse detectImageLabelsWithOptions(DetectImageLabelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetectImageLabels", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DetectImageLabelsResponse());
    }

    public DetectImageLabelsResponse detectImageLabels(DetectImageLabelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectImageLabelsWithOptions(request, runtime);
    }

    public GetProjectResponse getProjectWithOptions(GetProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetProject", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetProjectResponse());
    }

    public GetProjectResponse getProject(GetProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getProjectWithOptions(request, runtime);
    }

    public CreateDatasetResponse createDatasetWithOptions(CreateDatasetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDataset", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDatasetResponse());
    }

    public CreateDatasetResponse createDataset(CreateDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDatasetWithOptions(request, runtime);
    }

    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteProject", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteProjectResponse());
    }

    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    public GetFileSignedURIResponse getFileSignedURIWithOptions(GetFileSignedURIRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetFileSignedURI", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetFileSignedURIResponse());
    }

    public GetFileSignedURIResponse getFileSignedURI(GetFileSignedURIRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFileSignedURIWithOptions(request, runtime);
    }

    public UpdateProjectResponse updateProjectWithOptions(UpdateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateProject", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateProjectResponse());
    }

    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProjectWithOptions(request, runtime);
    }

    public UpdateDatasetResponse updateDatasetWithOptions(UpdateDatasetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDataset", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDatasetResponse());
    }

    public UpdateDatasetResponse updateDataset(UpdateDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDatasetWithOptions(request, runtime);
    }

    public FuzzyQueryResponse fuzzyQueryWithOptions(FuzzyQueryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FuzzyQuery", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new FuzzyQueryResponse());
    }

    public FuzzyQueryResponse fuzzyQuery(FuzzyQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fuzzyQueryWithOptions(request, runtime);
    }

    public ListOfficeConversionTaskResponse listOfficeConversionTaskWithOptions(ListOfficeConversionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOfficeConversionTask", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListOfficeConversionTaskResponse());
    }

    public ListOfficeConversionTaskResponse listOfficeConversionTask(ListOfficeConversionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOfficeConversionTaskWithOptions(request, runtime);
    }
}
