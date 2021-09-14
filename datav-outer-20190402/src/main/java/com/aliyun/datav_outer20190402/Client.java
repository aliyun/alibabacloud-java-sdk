// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402;

import com.aliyun.tea.*;
import com.aliyun.datav_outer20190402.models.*;
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
            new TeaPair("cn-hangzhou", "datav.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "datav.cn-shanghai.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("datav-outer", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ConvertImageToScreenResponse convertImageToScreenWithOptions(ConvertImageToScreenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConvertImageToScreen", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new ConvertImageToScreenResponse());
    }

    public ConvertImageToScreenResponse convertImageToScreen(ConvertImageToScreenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.convertImageToScreenWithOptions(request, runtime);
    }

    public GetScreenConfigResponse getScreenConfigWithOptions(GetScreenConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetScreenConfig", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetScreenConfigResponse());
    }

    public GetScreenConfigResponse getScreenConfig(GetScreenConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getScreenConfigWithOptions(request, runtime);
    }

    public GetTemplateDataSourceResponse getTemplateDataSourceWithOptions(GetTemplateDataSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTemplateDataSource", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetTemplateDataSourceResponse());
    }

    public GetTemplateDataSourceResponse getTemplateDataSource(GetTemplateDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplateDataSourceWithOptions(request, runtime);
    }

    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTemplate", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTemplateResponse());
    }

    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    public PublishScreenWithSnapshotResponse publishScreenWithSnapshotWithOptions(PublishScreenWithSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishScreenWithSnapshot", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new PublishScreenWithSnapshotResponse());
    }

    public PublishScreenWithSnapshotResponse publishScreenWithSnapshot(PublishScreenWithSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishScreenWithSnapshotWithOptions(request, runtime);
    }

    public ListScreenByWorkspaceResponse listScreenByWorkspaceWithOptions(ListScreenByWorkspaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListScreenByWorkspace", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new ListScreenByWorkspaceResponse());
    }

    public ListScreenByWorkspaceResponse listScreenByWorkspace(ListScreenByWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listScreenByWorkspaceWithOptions(request, runtime);
    }

    public QueryDatasetDataResponse queryDatasetDataWithOptions(QueryDatasetDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDatasetData", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDatasetDataResponse());
    }

    public QueryDatasetDataResponse queryDatasetData(QueryDatasetDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDatasetDataWithOptions(request, runtime);
    }

    public CreateScreenResponse createScreenWithOptions(CreateScreenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScreen", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScreenResponse());
    }

    public CreateScreenResponse createScreen(CreateScreenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScreenWithOptions(request, runtime);
    }

    public PublishScreenResponse publishScreenWithOptions(PublishScreenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishScreen", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new PublishScreenResponse());
    }

    public PublishScreenResponse publishScreen(PublishScreenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishScreenWithOptions(request, runtime);
    }

    public CreateScreenByTemplateResponse createScreenByTemplateWithOptions(CreateScreenByTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScreenByTemplate", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScreenByTemplateResponse());
    }

    public CreateScreenByTemplateResponse createScreenByTemplate(CreateScreenByTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScreenByTemplateWithOptions(request, runtime);
    }

    public GetScreenAccessResponse getScreenAccessWithOptions(GetScreenAccessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetScreenAccess", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetScreenAccessResponse());
    }

    public GetScreenAccessResponse getScreenAccess(GetScreenAccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getScreenAccessWithOptions(request, runtime);
    }

    public CreateWorkspaceResponse createWorkspaceWithOptions(CreateWorkspaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateWorkspace", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateWorkspaceResponse());
    }

    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createWorkspaceWithOptions(request, runtime);
    }

    public SetScreenHookResponse setScreenHookWithOptions(SetScreenHookRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetScreenHook", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new SetScreenHookResponse());
    }

    public SetScreenHookResponse setScreenHook(SetScreenHookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setScreenHookWithOptions(request, runtime);
    }

    public DeleteScreenResponse deleteScreenWithOptions(DeleteScreenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteScreen", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteScreenResponse());
    }

    public DeleteScreenResponse deleteScreen(DeleteScreenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScreenWithOptions(request, runtime);
    }

    public AddWorkspaceMemberResponse addWorkspaceMemberWithOptions(AddWorkspaceMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddWorkspaceMember", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new AddWorkspaceMemberResponse());
    }

    public AddWorkspaceMemberResponse addWorkspaceMember(AddWorkspaceMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addWorkspaceMemberWithOptions(request, runtime);
    }

    public BatchCreateScreensByTemplatesResponse batchCreateScreensByTemplatesWithOptions(BatchCreateScreensByTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchCreateScreensByTemplates", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new BatchCreateScreensByTemplatesResponse());
    }

    public BatchCreateScreensByTemplatesResponse batchCreateScreensByTemplates(BatchCreateScreensByTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchCreateScreensByTemplatesWithOptions(request, runtime);
    }

    public BatchDeleteScreensResponse batchDeleteScreensWithOptions(BatchDeleteScreensRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchDeleteScreens", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new BatchDeleteScreensResponse());
    }

    public BatchDeleteScreensResponse batchDeleteScreens(BatchDeleteScreensRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteScreensWithOptions(request, runtime);
    }

    public GetScreenDatasourceConfigResponse getScreenDatasourceConfigWithOptions(GetScreenDatasourceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetScreenDatasourceConfig", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetScreenDatasourceConfigResponse());
    }

    public GetScreenDatasourceConfigResponse getScreenDatasourceConfig(GetScreenDatasourceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getScreenDatasourceConfigWithOptions(request, runtime);
    }

    public DeleteWorkspaceMemberResponse deleteWorkspaceMemberWithOptions(DeleteWorkspaceMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteWorkspaceMember", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteWorkspaceMemberResponse());
    }

    public DeleteWorkspaceMemberResponse deleteWorkspaceMember(DeleteWorkspaceMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteWorkspaceMemberWithOptions(request, runtime);
    }

    public CreateTemplateByScreenResponse createTemplateByScreenWithOptions(CreateTemplateByScreenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTemplateByScreen", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTemplateByScreenResponse());
    }

    public CreateTemplateByScreenResponse createTemplateByScreen(CreateTemplateByScreenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTemplateByScreenWithOptions(request, runtime);
    }

    public GiveScreenResponse giveScreenWithOptions(GiveScreenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GiveScreen", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new GiveScreenResponse());
    }

    public GiveScreenResponse giveScreen(GiveScreenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.giveScreenWithOptions(request, runtime);
    }

    public CreateTemporaryScreenByLiteSchemaResponse createTemporaryScreenByLiteSchemaWithOptions(CreateTemporaryScreenByLiteSchemaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTemporaryScreenByLiteSchemaShrinkRequest request = new CreateTemporaryScreenByLiteSchemaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.schema)) {
            request.schemaShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.schema, "Schema", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTemporaryScreenByLiteSchema", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTemporaryScreenByLiteSchemaResponse());
    }

    public CreateTemporaryScreenByLiteSchemaResponse createTemporaryScreenByLiteSchema(CreateTemporaryScreenByLiteSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTemporaryScreenByLiteSchemaWithOptions(request, runtime);
    }

    public GetScreenResponse getScreenWithOptions(GetScreenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetScreen", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetScreenResponse());
    }

    public GetScreenResponse getScreen(GetScreenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getScreenWithOptions(request, runtime);
    }

    public CreateDCStorageResponse createDCStorageWithOptions(CreateDCStorageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDCStorageShrinkRequest request = new CreateDCStorageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.authorization)) {
            request.authorizationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.authorization, "Authorization", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "Extra", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDCStorage", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDCStorageResponse());
    }

    public CreateDCStorageResponse createDCStorage(CreateDCStorageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDCStorageWithOptions(request, runtime);
    }

    public BatchCreateTemplatesByScreensResponse batchCreateTemplatesByScreensWithOptions(BatchCreateTemplatesByScreensRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchCreateTemplatesByScreens", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new BatchCreateTemplatesByScreensResponse());
    }

    public BatchCreateTemplatesByScreensResponse batchCreateTemplatesByScreens(BatchCreateTemplatesByScreensRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchCreateTemplatesByScreensWithOptions(request, runtime);
    }

    public GetDatasourceUserAssociationResponse getDatasourceUserAssociationWithOptions(GetDatasourceUserAssociationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDatasourceUserAssociation", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetDatasourceUserAssociationResponse());
    }

    public GetDatasourceUserAssociationResponse getDatasourceUserAssociation(GetDatasourceUserAssociationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDatasourceUserAssociationWithOptions(request, runtime);
    }

    public SetDatasourceUserAssociationResponse setDatasourceUserAssociationWithOptions(SetDatasourceUserAssociationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDatasourceUserAssociation", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new SetDatasourceUserAssociationResponse());
    }

    public SetDatasourceUserAssociationResponse setDatasourceUserAssociation(SetDatasourceUserAssociationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDatasourceUserAssociationWithOptions(request, runtime);
    }

    public ListTemplateByIdsResponse listTemplateByIdsWithOptions(ListTemplateByIdsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTemplateByIds", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new ListTemplateByIdsResponse());
    }

    public ListTemplateByIdsResponse listTemplateByIds(ListTemplateByIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTemplateByIdsWithOptions(request, runtime);
    }

    public BatchGetTemplateDataSourcesResponse batchGetTemplateDataSourcesWithOptions(BatchGetTemplateDataSourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchGetTemplateDataSources", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new BatchGetTemplateDataSourcesResponse());
    }

    public BatchGetTemplateDataSourcesResponse batchGetTemplateDataSources(BatchGetTemplateDataSourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetTemplateDataSourcesWithOptions(request, runtime);
    }

    public UpdateScreenDatasourceConfigResponse updateScreenDatasourceConfigWithOptions(UpdateScreenDatasourceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateScreenDatasourceConfig", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateScreenDatasourceConfigResponse());
    }

    public UpdateScreenDatasourceConfigResponse updateScreenDatasourceConfig(UpdateScreenDatasourceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateScreenDatasourceConfigWithOptions(request, runtime);
    }

    public ListTemplateByWorkspaceResponse listTemplateByWorkspaceWithOptions(ListTemplateByWorkspaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTemplateByWorkspace", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new ListTemplateByWorkspaceResponse());
    }

    public ListTemplateByWorkspaceResponse listTemplateByWorkspace(ListTemplateByWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTemplateByWorkspaceWithOptions(request, runtime);
    }

    public BatchPublishScreensResponse batchPublishScreensWithOptions(BatchPublishScreensRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchPublishScreens", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new BatchPublishScreensResponse());
    }

    public BatchPublishScreensResponse batchPublishScreens(BatchPublishScreensRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchPublishScreensWithOptions(request, runtime);
    }

    public SetScreenInteractionResponse setScreenInteractionWithOptions(SetScreenInteractionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetScreenInteraction", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new SetScreenInteractionResponse());
    }

    public SetScreenInteractionResponse setScreenInteraction(SetScreenInteractionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setScreenInteractionWithOptions(request, runtime);
    }

    public DeleteDatasourceUserAssociationResponse deleteDatasourceUserAssociationWithOptions(DeleteDatasourceUserAssociationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDatasourceUserAssociation", "2019-04-02", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDatasourceUserAssociationResponse());
    }

    public DeleteDatasourceUserAssociationResponse deleteDatasourceUserAssociation(DeleteDatasourceUserAssociationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDatasourceUserAssociationWithOptions(request, runtime);
    }
}
