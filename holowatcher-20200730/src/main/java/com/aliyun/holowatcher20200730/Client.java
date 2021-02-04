// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730;

import com.aliyun.tea.*;
import com.aliyun.holowatcher20200730.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
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
}
