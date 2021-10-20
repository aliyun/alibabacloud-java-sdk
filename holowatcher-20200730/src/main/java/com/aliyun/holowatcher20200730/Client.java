// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730;

import com.aliyun.tea.*;
import com.aliyun.holowatcher20200730.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "holowatcher.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("holowatcher", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CheckImageResponse checkImageWithOptions(CheckImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckImage", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new CheckImageResponse());
    }

    public CheckImageResponse checkImage(CheckImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkImageWithOptions(request, runtime);
    }

    public ScanDataUpdateProjectResponse scanDataUpdateProjectWithOptions(ScanDataUpdateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ScanDataUpdateProject", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new ScanDataUpdateProjectResponse());
    }

    public ScanDataUpdateProjectResponse scanDataUpdateProject(ScanDataUpdateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scanDataUpdateProjectWithOptions(request, runtime);
    }

    public VrUserCreateScanUserResponse vrUserCreateScanUserWithOptions(VrUserCreateScanUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VrUserCreateScanUser", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new VrUserCreateScanUserResponse());
    }

    public VrUserCreateScanUserResponse vrUserCreateScanUser(VrUserCreateScanUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.vrUserCreateScanUserWithOptions(request, runtime);
    }

    public DeleteQRCodeResponse deleteQRCodeWithOptions(DeleteQRCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteQRCode", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteQRCodeResponse());
    }

    public DeleteQRCodeResponse deleteQRCode(DeleteQRCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteQRCodeWithOptions(request, runtime);
    }

    public PublishRealResponse publishRealWithOptions(PublishRealRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishReal", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new PublishRealResponse());
    }

    public PublishRealResponse publishReal(PublishRealRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishRealWithOptions(request, runtime);
    }

    public ProduceExpoNoticeResponse produceExpoNoticeWithOptions(ProduceExpoNoticeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ProduceExpoNotice", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new ProduceExpoNoticeResponse());
    }

    public ProduceExpoNoticeResponse produceExpoNotice(ProduceExpoNoticeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.produceExpoNoticeWithOptions(request, runtime);
    }

    public PublishGalleryResponse publishGalleryWithOptions(PublishGalleryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishGallery", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new PublishGalleryResponse());
    }

    public PublishGalleryResponse publishGallery(PublishGalleryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishGalleryWithOptions(request, runtime);
    }

    public ScanDataRemoveRoleResponse scanDataRemoveRoleWithOptions(ScanDataRemoveRoleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ScanDataRemoveRoleShrinkRequest request = new ScanDataRemoveRoleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.removeUserDataRequest))) {
            request.removeUserDataRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.removeUserDataRequest), "RemoveUserDataRequest", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ScanDataRemoveRole", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new ScanDataRemoveRoleResponse());
    }

    public ScanDataRemoveRoleResponse scanDataRemoveRole(ScanDataRemoveRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scanDataRemoveRoleWithOptions(request, runtime);
    }

    public GetTokenResponse getTokenWithOptions(GetTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetToken", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetTokenResponse());
    }

    public GetTokenResponse getToken(GetTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTokenWithOptions(request, runtime);
    }

    public ScanDataCreateProjectResponse scanDataCreateProjectWithOptions(ScanDataCreateProjectRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ScanDataCreateProjectShrinkRequest request = new ScanDataCreateProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.createScanUserDataRequest))) {
            request.createScanUserDataRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.createScanUserDataRequest), "CreateScanUserDataRequest", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ScanDataCreateProject", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new ScanDataCreateProjectResponse());
    }

    public ScanDataCreateProjectResponse scanDataCreateProject(ScanDataCreateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scanDataCreateProjectWithOptions(request, runtime);
    }

    public DeleteMaterialResponse deleteMaterialWithOptions(DeleteMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMaterial", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMaterialResponse());
    }

    public DeleteMaterialResponse deleteMaterial(DeleteMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMaterialWithOptions(request, runtime);
    }

    public AddQRCodeResponse addQRCodeWithOptions(AddQRCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddQRCode", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new AddQRCodeResponse());
    }

    public AddQRCodeResponse addQRCode(AddQRCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addQRCodeWithOptions(request, runtime);
    }

    public CommonRequestResponse commonRequestWithOptions(CommonRequestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CommonRequest", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new CommonRequestResponse());
    }

    public CommonRequestResponse commonRequest(CommonRequestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.commonRequestWithOptions(request, runtime);
    }

    public TransTextToAudioResponse transTextToAudioWithOptions(TransTextToAudioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransTextToAudio", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new TransTextToAudioResponse());
    }

    public TransTextToAudioResponse transTextToAudio(TransTextToAudioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transTextToAudioWithOptions(request, runtime);
    }

    public CreateMaterialResponse createMaterialWithOptions(CreateMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMaterial", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMaterialResponse());
    }

    public CreateMaterialResponse createMaterial(CreateMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMaterialWithOptions(request, runtime);
    }

    public QueryQRCodeInfoResponse queryQRCodeInfoWithOptions(QueryQRCodeInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryQRCodeInfo", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new QueryQRCodeInfoResponse());
    }

    public QueryQRCodeInfoResponse queryQRCodeInfo(QueryQRCodeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryQRCodeInfoWithOptions(request, runtime);
    }

    public ScanDataQueryProjectResponse scanDataQueryProjectWithOptions(ScanDataQueryProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ScanDataQueryProject", "2020-07-30", "HTTPS", "GET", "AK", "json", req, runtime), new ScanDataQueryProjectResponse());
    }

    public ScanDataQueryProjectResponse scanDataQueryProject(ScanDataQueryProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scanDataQueryProjectWithOptions(request, runtime);
    }

    public ScanDataShareProjectResponse scanDataShareProjectWithOptions(ScanDataShareProjectRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ScanDataShareProjectShrinkRequest request = new ScanDataShareProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.shareUserDataRequest))) {
            request.shareUserDataRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.shareUserDataRequest), "ShareUserDataRequest", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ScanDataShareProject", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new ScanDataShareProjectResponse());
    }

    public ScanDataShareProjectResponse scanDataShareProject(ScanDataShareProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scanDataShareProjectWithOptions(request, runtime);
    }

    public GetTemplateListResponse getTemplateListWithOptions(GetTemplateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTemplateList", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetTemplateListResponse());
    }

    public GetTemplateListResponse getTemplateList(GetTemplateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplateListWithOptions(request, runtime);
    }

    public GetMaterialListResponse getMaterialListWithOptions(GetMaterialListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMaterialList", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetMaterialListResponse());
    }

    public GetMaterialListResponse getMaterialList(GetMaterialListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMaterialListWithOptions(request, runtime);
    }

    public ProduceNoticeResponse produceNoticeWithOptions(ProduceNoticeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ProduceNotice", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new ProduceNoticeResponse());
    }

    public ProduceNoticeResponse produceNotice(ProduceNoticeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.produceNoticeWithOptions(request, runtime);
    }

    public QueryAccountLabelResponse queryAccountLabelWithOptions(QueryAccountLabelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAccountLabel", "2020-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAccountLabelResponse());
    }

    public QueryAccountLabelResponse queryAccountLabel(QueryAccountLabelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountLabelWithOptions(request, runtime);
    }
}
