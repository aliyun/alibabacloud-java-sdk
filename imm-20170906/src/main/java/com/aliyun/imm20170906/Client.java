// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906;

import com.aliyun.tea.*;
import com.aliyun.imm20170906.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
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

    public CompareImageFacesResponse compareImageFacesWithOptions(CompareImageFacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CompareImageFaces", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new CompareImageFacesResponse());
    }

    public CompareImageFacesResponse compareImageFaces(CompareImageFacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.compareImageFacesWithOptions(request, runtime);
    }

    public ConvertOfficeFormatResponse convertOfficeFormatWithOptions(ConvertOfficeFormatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConvertOfficeFormat", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new ConvertOfficeFormatResponse());
    }

    public ConvertOfficeFormatResponse convertOfficeFormat(ConvertOfficeFormatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.convertOfficeFormatWithOptions(request, runtime);
    }

    public CreateGrabFrameTaskResponse createGrabFrameTaskWithOptions(CreateGrabFrameTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGrabFrameTask", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGrabFrameTaskResponse());
    }

    public CreateGrabFrameTaskResponse createGrabFrameTask(CreateGrabFrameTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGrabFrameTaskWithOptions(request, runtime);
    }

    public CreateGroupFacesJobResponse createGroupFacesJobWithOptions(CreateGroupFacesJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGroupFacesJob", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGroupFacesJobResponse());
    }

    public CreateGroupFacesJobResponse createGroupFacesJob(CreateGroupFacesJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGroupFacesJobWithOptions(request, runtime);
    }

    public CreateImageProcessTaskResponse createImageProcessTaskWithOptions(CreateImageProcessTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateImageProcessTask", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateImageProcessTaskResponse());
    }

    public CreateImageProcessTaskResponse createImageProcessTask(CreateImageProcessTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImageProcessTaskWithOptions(request, runtime);
    }

    public CreateMediaComplexTaskResponse createMediaComplexTaskWithOptions(CreateMediaComplexTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMediaComplexTask", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMediaComplexTaskResponse());
    }

    public CreateMediaComplexTaskResponse createMediaComplexTask(CreateMediaComplexTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMediaComplexTaskWithOptions(request, runtime);
    }

    public CreateMergeFaceGroupsJobResponse createMergeFaceGroupsJobWithOptions(CreateMergeFaceGroupsJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMergeFaceGroupsJob", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMergeFaceGroupsJobResponse());
    }

    public CreateMergeFaceGroupsJobResponse createMergeFaceGroupsJob(CreateMergeFaceGroupsJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMergeFaceGroupsJobWithOptions(request, runtime);
    }

    public CreateOfficeConversionTaskResponse createOfficeConversionTaskWithOptions(CreateOfficeConversionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOfficeConversionTask", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOfficeConversionTaskResponse());
    }

    public CreateOfficeConversionTaskResponse createOfficeConversionTask(CreateOfficeConversionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOfficeConversionTaskWithOptions(request, runtime);
    }

    public CreateSetResponse createSetWithOptions(CreateSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSet", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSetResponse());
    }

    public CreateSetResponse createSet(CreateSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSetWithOptions(request, runtime);
    }

    public CreateStreamAnalyseTaskResponse createStreamAnalyseTaskWithOptions(CreateStreamAnalyseTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateStreamAnalyseTask", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateStreamAnalyseTaskResponse());
    }

    public CreateStreamAnalyseTaskResponse createStreamAnalyseTask(CreateStreamAnalyseTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStreamAnalyseTaskWithOptions(request, runtime);
    }

    public CreateVideoAbstractTaskResponse createVideoAbstractTaskWithOptions(CreateVideoAbstractTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVideoAbstractTask", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVideoAbstractTaskResponse());
    }

    public CreateVideoAbstractTaskResponse createVideoAbstractTask(CreateVideoAbstractTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVideoAbstractTaskWithOptions(request, runtime);
    }

    public CreateVideoAnalyseTaskResponse createVideoAnalyseTaskWithOptions(CreateVideoAnalyseTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVideoAnalyseTask", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVideoAnalyseTaskResponse());
    }

    public CreateVideoAnalyseTaskResponse createVideoAnalyseTask(CreateVideoAnalyseTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVideoAnalyseTaskWithOptions(request, runtime);
    }

    public CreateVideoCompressTaskResponse createVideoCompressTaskWithOptions(CreateVideoCompressTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVideoCompressTask", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVideoCompressTaskResponse());
    }

    public CreateVideoCompressTaskResponse createVideoCompressTask(CreateVideoCompressTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVideoCompressTaskWithOptions(request, runtime);
    }

    public CreateVideoProduceTaskResponse createVideoProduceTaskWithOptions(CreateVideoProduceTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVideoProduceTask", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVideoProduceTaskResponse());
    }

    public CreateVideoProduceTaskResponse createVideoProduceTask(CreateVideoProduceTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVideoProduceTaskWithOptions(request, runtime);
    }

    public DecodeBlindWatermarkResponse decodeBlindWatermarkWithOptions(DecodeBlindWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DecodeBlindWatermark", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new DecodeBlindWatermarkResponse());
    }

    public DecodeBlindWatermarkResponse decodeBlindWatermark(DecodeBlindWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.decodeBlindWatermarkWithOptions(request, runtime);
    }

    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteImage", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteImageResponse());
    }

    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    public DeleteImageJobResponse deleteImageJobWithOptions(DeleteImageJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteImageJob", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteImageJobResponse());
    }

    public DeleteImageJobResponse deleteImageJob(DeleteImageJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImageJobWithOptions(request, runtime);
    }

    public DeleteOfficeConversionTaskResponse deleteOfficeConversionTaskWithOptions(DeleteOfficeConversionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteOfficeConversionTask", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteOfficeConversionTaskResponse());
    }

    public DeleteOfficeConversionTaskResponse deleteOfficeConversionTask(DeleteOfficeConversionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOfficeConversionTaskWithOptions(request, runtime);
    }

    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteProject", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteProjectResponse());
    }

    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    public DeleteSetResponse deleteSetWithOptions(DeleteSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSet", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSetResponse());
    }

    public DeleteSetResponse deleteSet(DeleteSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSetWithOptions(request, runtime);
    }

    public DeleteVideoResponse deleteVideoWithOptions(DeleteVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVideo", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVideoResponse());
    }

    public DeleteVideoResponse deleteVideo(DeleteVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVideoWithOptions(request, runtime);
    }

    public DeleteVideoTaskResponse deleteVideoTaskWithOptions(DeleteVideoTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVideoTask", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVideoTaskResponse());
    }

    public DeleteVideoTaskResponse deleteVideoTask(DeleteVideoTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVideoTaskWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(runtime);
    }

    public DetectImageBodiesResponse detectImageBodiesWithOptions(DetectImageBodiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetectImageBodies", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new DetectImageBodiesResponse());
    }

    public DetectImageBodiesResponse detectImageBodies(DetectImageBodiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectImageBodiesWithOptions(request, runtime);
    }

    public DetectImageFacesResponse detectImageFacesWithOptions(DetectImageFacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetectImageFaces", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new DetectImageFacesResponse());
    }

    public DetectImageFacesResponse detectImageFaces(DetectImageFacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectImageFacesWithOptions(request, runtime);
    }

    public DetectImageLogosResponse detectImageLogosWithOptions(DetectImageLogosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetectImageLogos", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new DetectImageLogosResponse());
    }

    public DetectImageLogosResponse detectImageLogos(DetectImageLogosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectImageLogosWithOptions(request, runtime);
    }

    public DetectImageQRCodesResponse detectImageQRCodesWithOptions(DetectImageQRCodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetectImageQRCodes", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new DetectImageQRCodesResponse());
    }

    public DetectImageQRCodesResponse detectImageQRCodes(DetectImageQRCodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectImageQRCodesWithOptions(request, runtime);
    }

    public DetectImageTagsResponse detectImageTagsWithOptions(DetectImageTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetectImageTags", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new DetectImageTagsResponse());
    }

    public DetectImageTagsResponse detectImageTags(DetectImageTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectImageTagsWithOptions(request, runtime);
    }

    public DetectQRCodesResponse detectQRCodesWithOptions(DetectQRCodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetectQRCodes", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new DetectQRCodesResponse());
    }

    public DetectQRCodesResponse detectQRCodes(DetectQRCodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectQRCodesWithOptions(request, runtime);
    }

    public EncodeBlindWatermarkResponse encodeBlindWatermarkWithOptions(EncodeBlindWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EncodeBlindWatermark", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new EncodeBlindWatermarkResponse());
    }

    public EncodeBlindWatermarkResponse encodeBlindWatermark(EncodeBlindWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.encodeBlindWatermarkWithOptions(request, runtime);
    }

    public FindImagesResponse findImagesWithOptions(FindImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindImages", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new FindImagesResponse());
    }

    public FindImagesResponse findImages(FindImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findImagesWithOptions(request, runtime);
    }

    public FindSimilarFacesResponse findSimilarFacesWithOptions(FindSimilarFacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindSimilarFaces", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new FindSimilarFacesResponse());
    }

    public FindSimilarFacesResponse findSimilarFaces(FindSimilarFacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findSimilarFacesWithOptions(request, runtime);
    }

    public GetContentKeyResponse getContentKeyWithOptions(GetContentKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetContentKey", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetContentKeyResponse());
    }

    public GetContentKeyResponse getContentKey(GetContentKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getContentKeyWithOptions(request, runtime);
    }

    public GetDRMLicenseResponse getDRMLicenseWithOptions(GetDRMLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDRMLicense", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetDRMLicenseResponse());
    }

    public GetDRMLicenseResponse getDRMLicense(GetDRMLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDRMLicenseWithOptions(request, runtime);
    }

    public GetImageResponse getImageWithOptions(GetImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetImage", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetImageResponse());
    }

    public GetImageResponse getImage(GetImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImageWithOptions(request, runtime);
    }

    public GetImageCroppingSuggestionsResponse getImageCroppingSuggestionsWithOptions(GetImageCroppingSuggestionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetImageCroppingSuggestions", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetImageCroppingSuggestionsResponse());
    }

    public GetImageCroppingSuggestionsResponse getImageCroppingSuggestions(GetImageCroppingSuggestionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImageCroppingSuggestionsWithOptions(request, runtime);
    }

    public GetImageQualityResponse getImageQualityWithOptions(GetImageQualityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetImageQuality", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetImageQualityResponse());
    }

    public GetImageQualityResponse getImageQuality(GetImageQualityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImageQualityWithOptions(request, runtime);
    }

    public GetMediaMetaResponse getMediaMetaWithOptions(GetMediaMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMediaMeta", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetMediaMetaResponse());
    }

    public GetMediaMetaResponse getMediaMeta(GetMediaMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaMetaWithOptions(request, runtime);
    }

    public GetOfficeConversionTaskResponse getOfficeConversionTaskWithOptions(GetOfficeConversionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOfficeConversionTask", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetOfficeConversionTaskResponse());
    }

    public GetOfficeConversionTaskResponse getOfficeConversionTask(GetOfficeConversionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOfficeConversionTaskWithOptions(request, runtime);
    }

    public GetOfficeEditURLResponse getOfficeEditURLWithOptions(GetOfficeEditURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOfficeEditURL", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetOfficeEditURLResponse());
    }

    public GetOfficeEditURLResponse getOfficeEditURL(GetOfficeEditURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOfficeEditURLWithOptions(request, runtime);
    }

    public GetOfficePreviewURLResponse getOfficePreviewURLWithOptions(GetOfficePreviewURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOfficePreviewURL", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetOfficePreviewURLResponse());
    }

    public GetOfficePreviewURLResponse getOfficePreviewURL(GetOfficePreviewURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOfficePreviewURLWithOptions(request, runtime);
    }

    public GetProjectResponse getProjectWithOptions(GetProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetProject", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetProjectResponse());
    }

    public GetProjectResponse getProject(GetProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getProjectWithOptions(request, runtime);
    }

    public GetSetResponse getSetWithOptions(GetSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSet", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetSetResponse());
    }

    public GetSetResponse getSet(GetSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSetWithOptions(request, runtime);
    }

    public GetVideoResponse getVideoWithOptions(GetVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideo", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoResponse());
    }

    public GetVideoResponse getVideo(GetVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoWithOptions(request, runtime);
    }

    public GetVideoTaskResponse getVideoTaskWithOptions(GetVideoTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideoTask", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoTaskResponse());
    }

    public GetVideoTaskResponse getVideoTask(GetVideoTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoTaskWithOptions(request, runtime);
    }

    public GetWebofficeURLResponse getWebofficeURLWithOptions(GetWebofficeURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetWebofficeURL", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetWebofficeURLResponse());
    }

    public GetWebofficeURLResponse getWebofficeURL(GetWebofficeURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWebofficeURLWithOptions(request, runtime);
    }

    public IndexImageResponse indexImageWithOptions(IndexImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("IndexImage", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new IndexImageResponse());
    }

    public IndexImageResponse indexImage(IndexImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.indexImageWithOptions(request, runtime);
    }

    public IndexVideoResponse indexVideoWithOptions(IndexVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("IndexVideo", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new IndexVideoResponse());
    }

    public IndexVideoResponse indexVideo(IndexVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.indexVideoWithOptions(request, runtime);
    }

    public ListFaceGroupsResponse listFaceGroupsWithOptions(ListFaceGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFaceGroups", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListFaceGroupsResponse());
    }

    public ListFaceGroupsResponse listFaceGroups(ListFaceGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFaceGroupsWithOptions(request, runtime);
    }

    public ListImagesResponse listImagesWithOptions(ListImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListImages", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListImagesResponse());
    }

    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listImagesWithOptions(request, runtime);
    }

    public ListOfficeConversionTaskResponse listOfficeConversionTaskWithOptions(ListOfficeConversionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOfficeConversionTask", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListOfficeConversionTaskResponse());
    }

    public ListOfficeConversionTaskResponse listOfficeConversionTask(ListOfficeConversionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOfficeConversionTaskWithOptions(request, runtime);
    }

    public ListProjectAPIsResponse listProjectAPIsWithOptions(ListProjectAPIsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListProjectAPIs", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListProjectAPIsResponse());
    }

    public ListProjectAPIsResponse listProjectAPIs(ListProjectAPIsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProjectAPIsWithOptions(request, runtime);
    }

    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListProjects", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListProjectsResponse());
    }

    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    public ListSetsResponse listSetsWithOptions(ListSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSets", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListSetsResponse());
    }

    public ListSetsResponse listSets(ListSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSetsWithOptions(request, runtime);
    }

    public ListSetTagsResponse listSetTagsWithOptions(ListSetTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSetTags", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListSetTagsResponse());
    }

    public ListSetTagsResponse listSetTags(ListSetTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSetTagsWithOptions(request, runtime);
    }

    public ListVideoAudiosResponse listVideoAudiosWithOptions(ListVideoAudiosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVideoAudios", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListVideoAudiosResponse());
    }

    public ListVideoAudiosResponse listVideoAudios(ListVideoAudiosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVideoAudiosWithOptions(request, runtime);
    }

    public ListVideoFramesResponse listVideoFramesWithOptions(ListVideoFramesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVideoFrames", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListVideoFramesResponse());
    }

    public ListVideoFramesResponse listVideoFrames(ListVideoFramesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVideoFramesWithOptions(request, runtime);
    }

    public ListVideosResponse listVideosWithOptions(ListVideosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVideos", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListVideosResponse());
    }

    public ListVideosResponse listVideos(ListVideosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVideosWithOptions(request, runtime);
    }

    public ListVideoTasksResponse listVideoTasksWithOptions(ListVideoTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVideoTasks", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListVideoTasksResponse());
    }

    public ListVideoTasksResponse listVideoTasks(ListVideoTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVideoTasksWithOptions(request, runtime);
    }

    public OpenImmServiceResponse openImmServiceWithOptions(OpenImmServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenImmService", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new OpenImmServiceResponse());
    }

    public OpenImmServiceResponse openImmService(OpenImmServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openImmServiceWithOptions(request, runtime);
    }

    public PutProjectResponse putProjectWithOptions(PutProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutProject", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new PutProjectResponse());
    }

    public PutProjectResponse putProject(PutProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putProjectWithOptions(request, runtime);
    }

    public RefreshOfficeEditTokenResponse refreshOfficeEditTokenWithOptions(RefreshOfficeEditTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshOfficeEditToken", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshOfficeEditTokenResponse());
    }

    public RefreshOfficeEditTokenResponse refreshOfficeEditToken(RefreshOfficeEditTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshOfficeEditTokenWithOptions(request, runtime);
    }

    public RefreshOfficePreviewTokenResponse refreshOfficePreviewTokenWithOptions(RefreshOfficePreviewTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshOfficePreviewToken", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshOfficePreviewTokenResponse());
    }

    public RefreshOfficePreviewTokenResponse refreshOfficePreviewToken(RefreshOfficePreviewTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshOfficePreviewTokenWithOptions(request, runtime);
    }

    public RefreshWebofficeTokenResponse refreshWebofficeTokenWithOptions(RefreshWebofficeTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshWebofficeToken", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshWebofficeTokenResponse());
    }

    public RefreshWebofficeTokenResponse refreshWebofficeToken(RefreshWebofficeTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshWebofficeTokenWithOptions(request, runtime);
    }

    public UpdateFaceGroupResponse updateFaceGroupWithOptions(UpdateFaceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFaceGroup", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFaceGroupResponse());
    }

    public UpdateFaceGroupResponse updateFaceGroup(UpdateFaceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFaceGroupWithOptions(request, runtime);
    }

    public UpdateImageResponse updateImageWithOptions(UpdateImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateImage", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateImageResponse());
    }

    public UpdateImageResponse updateImage(UpdateImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateImageWithOptions(request, runtime);
    }

    public UpdateProjectResponse updateProjectWithOptions(UpdateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateProject", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateProjectResponse());
    }

    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProjectWithOptions(request, runtime);
    }

    public UpdateSetResponse updateSetWithOptions(UpdateSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSet", "2017-09-06", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSetResponse());
    }

    public UpdateSetResponse updateSet(UpdateSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSetWithOptions(request, runtime);
    }
}
