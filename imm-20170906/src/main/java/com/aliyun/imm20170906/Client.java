// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906;

import com.aliyun.tea.*;
import com.aliyun.imm20170906.models.*;
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

    public CompareImageFacesResponse compareImageFacesWithOptions(CompareImageFacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faceIdA)) {
            query.put("FaceIdA", request.faceIdA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceIdB)) {
            query.put("FaceIdB", request.faceIdB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUriA)) {
            query.put("ImageUriA", request.imageUriA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUriB)) {
            query.put("ImageUriB", request.imageUriB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompareImageFaces"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompareImageFacesResponse());
    }

    public CompareImageFacesResponse compareImageFaces(CompareImageFacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.compareImageFacesWithOptions(request, runtime);
    }

    public ConvertOfficeFormatResponse convertOfficeFormatWithOptions(ConvertOfficeFormatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endPage)) {
            query.put("EndPage", request.endPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fitToPagesTall)) {
            query.put("FitToPagesTall", request.fitToPagesTall);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fitToPagesWide)) {
            query.put("FitToPagesWide", request.fitToPagesWide);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hidecomments)) {
            query.put("Hidecomments", request.hidecomments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSheetCol)) {
            query.put("MaxSheetCol", request.maxSheetCol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSheetCount)) {
            query.put("MaxSheetCount", request.maxSheetCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSheetRow)) {
            query.put("MaxSheetRow", request.maxSheetRow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("ModelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pdfVector)) {
            query.put("PdfVector", request.pdfVector);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetOnePage)) {
            query.put("SheetOnePage", request.sheetOnePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcType)) {
            query.put("SrcType", request.srcType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUri)) {
            query.put("SrcUri", request.srcUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startPage)) {
            query.put("StartPage", request.startPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tgtFilePages)) {
            query.put("TgtFilePages", request.tgtFilePages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tgtFilePrefix)) {
            query.put("TgtFilePrefix", request.tgtFilePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tgtFileSuffix)) {
            query.put("TgtFileSuffix", request.tgtFileSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tgtType)) {
            query.put("TgtType", request.tgtType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tgtUri)) {
            query.put("TgtUri", request.tgtUri);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConvertOfficeFormat"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConvertOfficeFormatResponse());
    }

    public ConvertOfficeFormatResponse convertOfficeFormat(ConvertOfficeFormatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.convertOfficeFormatWithOptions(request, runtime);
    }

    public CreateGrabFrameTaskResponse createGrabFrameTaskWithOptions(CreateGrabFrameTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customMessage)) {
            query.put("CustomMessage", request.customMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyEndpoint)) {
            query.put("NotifyEndpoint", request.notifyEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetList)) {
            query.put("TargetList", request.targetList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoUri)) {
            query.put("VideoUri", request.videoUri);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGrabFrameTask"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGrabFrameTaskResponse());
    }

    public CreateGrabFrameTaskResponse createGrabFrameTask(CreateGrabFrameTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGrabFrameTaskWithOptions(request, runtime);
    }

    public CreateGroupFacesJobResponse createGroupFacesJobWithOptions(CreateGroupFacesJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notifyEndpoint)) {
            query.put("NotifyEndpoint", request.notifyEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroupFacesJob"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGroupFacesJobResponse());
    }

    public CreateGroupFacesJobResponse createGroupFacesJob(CreateGroupFacesJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGroupFacesJobWithOptions(request, runtime);
    }

    public CreateMergeFaceGroupsJobResponse createMergeFaceGroupsJobWithOptions(CreateMergeFaceGroupsJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customMessage)) {
            query.put("CustomMessage", request.customMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIdFrom)) {
            query.put("GroupIdFrom", request.groupIdFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIdTo)) {
            query.put("GroupIdTo", request.groupIdTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyEndpoint)) {
            query.put("NotifyEndpoint", request.notifyEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMergeFaceGroupsJob"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMergeFaceGroupsJobResponse());
    }

    public CreateMergeFaceGroupsJobResponse createMergeFaceGroupsJob(CreateMergeFaceGroupsJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMergeFaceGroupsJobWithOptions(request, runtime);
    }

    public CreateOfficeConversionTaskResponse createOfficeConversionTaskWithOptions(CreateOfficeConversionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayDpi)) {
            query.put("DisplayDpi", request.displayDpi);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPage)) {
            query.put("EndPage", request.endPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fitToPagesTall)) {
            query.put("FitToPagesTall", request.fitToPagesTall);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fitToPagesWide)) {
            query.put("FitToPagesWide", request.fitToPagesWide);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hidecomments)) {
            query.put("Hidecomments", request.hidecomments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentToken)) {
            query.put("IdempotentToken", request.idempotentToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSheetCol)) {
            query.put("MaxSheetCol", request.maxSheetCol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSheetCount)) {
            query.put("MaxSheetCount", request.maxSheetCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSheetRow)) {
            query.put("MaxSheetRow", request.maxSheetRow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("ModelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyEndpoint)) {
            query.put("NotifyEndpoint", request.notifyEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pdfVector)) {
            query.put("PdfVector", request.pdfVector);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetOnePage)) {
            query.put("SheetOnePage", request.sheetOnePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcType)) {
            query.put("SrcType", request.srcType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUri)) {
            query.put("SrcUri", request.srcUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startPage)) {
            query.put("StartPage", request.startPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tgtFilePages)) {
            query.put("TgtFilePages", request.tgtFilePages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tgtFilePrefix)) {
            query.put("TgtFilePrefix", request.tgtFilePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tgtFileSuffix)) {
            query.put("TgtFileSuffix", request.tgtFileSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tgtType)) {
            query.put("TgtType", request.tgtType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tgtUri)) {
            query.put("TgtUri", request.tgtUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOfficeConversionTask"),
            new TeaPair("version", "2017-09-06"),
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

    public CreateSetResponse createSetWithOptions(CreateSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setName)) {
            query.put("SetName", request.setName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSet"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSetResponse());
    }

    public CreateSetResponse createSet(CreateSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSetWithOptions(request, runtime);
    }

    public CreateVideoCompressTaskResponse createVideoCompressTaskWithOptions(CreateVideoCompressTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customMessage)) {
            query.put("CustomMessage", request.customMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyEndpoint)) {
            query.put("NotifyEndpoint", request.notifyEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetList)) {
            query.put("TargetList", request.targetList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetSegment)) {
            query.put("TargetSegment", request.targetSegment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetSubtitle)) {
            query.put("TargetSubtitle", request.targetSubtitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoUri)) {
            query.put("VideoUri", request.videoUri);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVideoCompressTask"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVideoCompressTaskResponse());
    }

    public CreateVideoCompressTaskResponse createVideoCompressTask(CreateVideoCompressTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVideoCompressTaskWithOptions(request, runtime);
    }

    public DecodeBlindWatermarkResponse decodeBlindWatermarkWithOptions(DecodeBlindWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageQuality)) {
            query.put("ImageQuality", request.imageQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            query.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalImageUri)) {
            query.put("OriginalImageUri", request.originalImageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUri)) {
            query.put("TargetUri", request.targetUri);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DecodeBlindWatermark"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DecodeBlindWatermarkResponse());
    }

    public DecodeBlindWatermarkResponse decodeBlindWatermark(DecodeBlindWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.decodeBlindWatermarkWithOptions(request, runtime);
    }

    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            query.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImage"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImageResponse());
    }

    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    public DeleteOfficeConversionTaskResponse deleteOfficeConversionTaskWithOptions(DeleteOfficeConversionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOfficeConversionTask"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOfficeConversionTaskResponse());
    }

    public DeleteOfficeConversionTaskResponse deleteOfficeConversionTask(DeleteOfficeConversionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOfficeConversionTaskWithOptions(request, runtime);
    }

    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2017-09-06"),
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

    public DeleteSetResponse deleteSetWithOptions(DeleteSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSet"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSetResponse());
    }

    public DeleteSetResponse deleteSet(DeleteSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSetWithOptions(request, runtime);
    }

    public DeleteVideoResponse deleteVideoWithOptions(DeleteVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoUri)) {
            query.put("VideoUri", request.videoUri);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVideo"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVideoResponse());
    }

    public DeleteVideoResponse deleteVideo(DeleteVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVideoWithOptions(request, runtime);
    }

    public DeleteVideoTaskResponse deleteVideoTaskWithOptions(DeleteVideoTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
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
            new TeaPair("action", "DeleteVideoTask"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVideoTaskResponse());
    }

    public DeleteVideoTaskResponse deleteVideoTask(DeleteVideoTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVideoTaskWithOptions(request, runtime);
    }

    public DetectImageBodiesResponse detectImageBodiesWithOptions(DetectImageBodiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            query.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageBodies"),
            new TeaPair("version", "2017-09-06"),
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

    public DetectImageFacesResponse detectImageFacesWithOptions(DetectImageFacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            query.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageFaces"),
            new TeaPair("version", "2017-09-06"),
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

    public DetectImageQRCodesResponse detectImageQRCodesWithOptions(DetectImageQRCodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            query.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageQRCodes"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageQRCodesResponse());
    }

    public DetectImageQRCodesResponse detectImageQRCodes(DetectImageQRCodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectImageQRCodesWithOptions(request, runtime);
    }

    public DetectImageTagsResponse detectImageTagsWithOptions(DetectImageTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            query.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageTags"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageTagsResponse());
    }

    public DetectImageTagsResponse detectImageTags(DetectImageTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectImageTagsWithOptions(request, runtime);
    }

    public DetectQRCodesResponse detectQRCodesWithOptions(DetectQRCodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUris)) {
            query.put("SrcUris", request.srcUris);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectQRCodes"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectQRCodesResponse());
    }

    public DetectQRCodesResponse detectQRCodes(DetectQRCodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectQRCodesWithOptions(request, runtime);
    }

    public EncodeBlindWatermarkResponse encodeBlindWatermarkWithOptions(EncodeBlindWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageQuality)) {
            query.put("ImageQuality", request.imageQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            query.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetImageType)) {
            query.put("TargetImageType", request.targetImageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUri)) {
            query.put("TargetUri", request.targetUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkUri)) {
            query.put("WatermarkUri", request.watermarkUri);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EncodeBlindWatermark"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EncodeBlindWatermarkResponse());
    }

    public EncodeBlindWatermarkResponse encodeBlindWatermark(EncodeBlindWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.encodeBlindWatermarkWithOptions(request, runtime);
    }

    public FindImagesResponse findImagesWithOptions(FindImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressLineContentsMatch)) {
            query.put("AddressLineContentsMatch", request.addressLineContentsMatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ageRange)) {
            query.put("AgeRange", request.ageRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeRange)) {
            query.put("CreateTimeRange", request.createTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emotion)) {
            query.put("Emotion", request.emotion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalId)) {
            query.put("ExternalId", request.externalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facesModifyTimeRange)) {
            query.put("FacesModifyTimeRange", request.facesModifyTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            query.put("Gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageSizeRange)) {
            query.put("ImageSizeRange", request.imageSizeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageTimeRange)) {
            query.put("ImageTimeRange", request.imageTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationBoundary)) {
            query.put("LocationBoundary", request.locationBoundary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyTimeRange)) {
            query.put("ModifyTimeRange", request.modifyTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OCRContentsMatch)) {
            query.put("OCRContentsMatch", request.OCRContentsMatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksAPrefix)) {
            query.put("RemarksAPrefix", request.remarksAPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksArrayAIn)) {
            query.put("RemarksArrayAIn", request.remarksArrayAIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksArrayBIn)) {
            query.put("RemarksArrayBIn", request.remarksArrayBIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksBPrefix)) {
            query.put("RemarksBPrefix", request.remarksBPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksCPrefix)) {
            query.put("RemarksCPrefix", request.remarksCPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksDPrefix)) {
            query.put("RemarksDPrefix", request.remarksDPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceUriPrefix)) {
            query.put("SourceUriPrefix", request.sourceUriPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagNames)) {
            query.put("TagNames", request.tagNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsModifyTimeRange)) {
            query.put("TagsModifyTimeRange", request.tagsModifyTimeRange);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindImages"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindImagesResponse());
    }

    public FindImagesResponse findImages(FindImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findImagesWithOptions(request, runtime);
    }

    public FindSimilarFacesResponse findSimilarFacesWithOptions(FindSimilarFacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faceId)) {
            query.put("FaceId", request.faceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            query.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minSimilarity)) {
            query.put("MinSimilarity", request.minSimilarity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseFormat)) {
            query.put("ResponseFormat", request.responseFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindSimilarFaces"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindSimilarFacesResponse());
    }

    public FindSimilarFacesResponse findSimilarFaces(FindSimilarFacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findSimilarFacesWithOptions(request, runtime);
    }

    public GetImageResponse getImageWithOptions(GetImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            query.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImage"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageResponse());
    }

    public GetImageResponse getImage(GetImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImageWithOptions(request, runtime);
    }

    public GetImageCroppingSuggestionsResponse getImageCroppingSuggestionsWithOptions(GetImageCroppingSuggestionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aspectRatios)) {
            query.put("AspectRatios", request.aspectRatios);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            query.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageCroppingSuggestions"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageCroppingSuggestionsResponse());
    }

    public GetImageCroppingSuggestionsResponse getImageCroppingSuggestions(GetImageCroppingSuggestionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImageCroppingSuggestionsWithOptions(request, runtime);
    }

    public GetImageQualityResponse getImageQualityWithOptions(GetImageQualityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            query.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageQuality"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageQualityResponse());
    }

    public GetImageQualityResponse getImageQuality(GetImageQualityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImageQualityWithOptions(request, runtime);
    }

    public GetMediaMetaResponse getMediaMetaWithOptions(GetMediaMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaUri)) {
            query.put("MediaUri", request.mediaUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaMeta"),
            new TeaPair("version", "2017-09-06"),
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

    public GetOfficeConversionTaskResponse getOfficeConversionTaskWithOptions(GetOfficeConversionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOfficeConversionTask"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOfficeConversionTaskResponse());
    }

    public GetOfficeConversionTaskResponse getOfficeConversionTask(GetOfficeConversionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOfficeConversionTaskWithOptions(request, runtime);
    }

    public GetOfficePreviewURLResponse getOfficePreviewURLWithOptions(GetOfficePreviewURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcType)) {
            query.put("SrcType", request.srcType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUri)) {
            query.put("SrcUri", request.srcUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkFillStyle)) {
            query.put("WatermarkFillStyle", request.watermarkFillStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkFont)) {
            query.put("WatermarkFont", request.watermarkFont);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkHorizontal)) {
            query.put("WatermarkHorizontal", request.watermarkHorizontal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkRotate)) {
            query.put("WatermarkRotate", request.watermarkRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkType)) {
            query.put("WatermarkType", request.watermarkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkValue)) {
            query.put("WatermarkValue", request.watermarkValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkVertical)) {
            query.put("WatermarkVertical", request.watermarkVertical);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOfficePreviewURL"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOfficePreviewURLResponse());
    }

    public GetOfficePreviewURLResponse getOfficePreviewURL(GetOfficePreviewURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOfficePreviewURLWithOptions(request, runtime);
    }

    public GetProjectResponse getProjectWithOptions(GetProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2017-09-06"),
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

    public GetSetResponse getSetWithOptions(GetSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSet"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSetResponse());
    }

    public GetSetResponse getSet(GetSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSetWithOptions(request, runtime);
    }

    public GetVideoResponse getVideoWithOptions(GetVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoUri)) {
            query.put("VideoUri", request.videoUri);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideo"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoResponse());
    }

    public GetVideoResponse getVideo(GetVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoWithOptions(request, runtime);
    }

    public GetVideoTaskResponse getVideoTaskWithOptions(GetVideoTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
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
            new TeaPair("action", "GetVideoTask"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoTaskResponse());
    }

    public GetVideoTaskResponse getVideoTask(GetVideoTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoTaskWithOptions(request, runtime);
    }

    public GetWebofficeURLResponse getWebofficeURLWithOptions(GetWebofficeURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.file)) {
            query.put("File", request.file);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileID)) {
            query.put("FileID", request.fileID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hidecmb)) {
            query.put("Hidecmb", request.hidecmb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyEndpoint)) {
            query.put("NotifyEndpoint", request.notifyEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permission)) {
            query.put("Permission", request.permission);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcType)) {
            query.put("SrcType", request.srcType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermark)) {
            query.put("Watermark", request.watermark);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWebofficeURL"),
            new TeaPair("version", "2017-09-06"),
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

    public IndexImageResponse indexImageWithOptions(IndexImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalId)) {
            query.put("ExternalId", request.externalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            query.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyEndpoint)) {
            query.put("NotifyEndpoint", request.notifyEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksA)) {
            query.put("RemarksA", request.remarksA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksArrayA)) {
            query.put("RemarksArrayA", request.remarksArrayA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksArrayB)) {
            query.put("RemarksArrayB", request.remarksArrayB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksB)) {
            query.put("RemarksB", request.remarksB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksC)) {
            query.put("RemarksC", request.remarksC);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksD)) {
            query.put("RemarksD", request.remarksD);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePosition)) {
            query.put("SourcePosition", request.sourcePosition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceUri)) {
            query.put("SourceUri", request.sourceUri);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IndexImage"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IndexImageResponse());
    }

    public IndexImageResponse indexImage(IndexImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.indexImageWithOptions(request, runtime);
    }

    public IndexVideoResponse indexVideoWithOptions(IndexVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalId)) {
            query.put("ExternalId", request.externalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyEndpoint)) {
            query.put("NotifyEndpoint", request.notifyEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksA)) {
            query.put("RemarksA", request.remarksA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksB)) {
            query.put("RemarksB", request.remarksB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksC)) {
            query.put("RemarksC", request.remarksC);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksD)) {
            query.put("RemarksD", request.remarksD);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tgtUri)) {
            query.put("TgtUri", request.tgtUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoUri)) {
            query.put("VideoUri", request.videoUri);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IndexVideo"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IndexVideoResponse());
    }

    public IndexVideoResponse indexVideo(IndexVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.indexVideoWithOptions(request, runtime);
    }

    public ListFaceGroupsResponse listFaceGroupsWithOptions(ListFaceGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalId)) {
            query.put("ExternalId", request.externalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksAQuery)) {
            query.put("RemarksAQuery", request.remarksAQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksArrayAQuery)) {
            query.put("RemarksArrayAQuery", request.remarksArrayAQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksArrayBQuery)) {
            query.put("RemarksArrayBQuery", request.remarksArrayBQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksBQuery)) {
            query.put("RemarksBQuery", request.remarksBQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksCQuery)) {
            query.put("RemarksCQuery", request.remarksCQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksDQuery)) {
            query.put("RemarksDQuery", request.remarksDQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFaceGroups"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFaceGroupsResponse());
    }

    public ListFaceGroupsResponse listFaceGroups(ListFaceGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFaceGroupsWithOptions(request, runtime);
    }

    public ListImagesResponse listImagesWithOptions(ListImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            query.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImages"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImagesResponse());
    }

    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listImagesWithOptions(request, runtime);
    }

    public ListOfficeConversionTaskResponse listOfficeConversionTaskWithOptions(ListOfficeConversionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("MaxKeys", request.maxKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOfficeConversionTask"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOfficeConversionTaskResponse());
    }

    public ListOfficeConversionTaskResponse listOfficeConversionTask(ListOfficeConversionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOfficeConversionTaskWithOptions(request, runtime);
    }

    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("MaxKeys", request.maxKeys);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2017-09-06"),
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

    public ListSetTagsResponse listSetTagsWithOptions(ListSetTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSetTags"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSetTagsResponse());
    }

    public ListSetTagsResponse listSetTags(ListSetTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSetTagsWithOptions(request, runtime);
    }

    public ListSetsResponse listSetsWithOptions(ListSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSets"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSetsResponse());
    }

    public ListSetsResponse listSets(ListSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSetsWithOptions(request, runtime);
    }

    public ListVideoAudiosResponse listVideoAudiosWithOptions(ListVideoAudiosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoUri)) {
            query.put("VideoUri", request.videoUri);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVideoAudios"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVideoAudiosResponse());
    }

    public ListVideoAudiosResponse listVideoAudios(ListVideoAudiosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVideoAudiosWithOptions(request, runtime);
    }

    public ListVideoFramesResponse listVideoFramesWithOptions(ListVideoFramesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoUri)) {
            query.put("VideoUri", request.videoUri);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVideoFrames"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVideoFramesResponse());
    }

    public ListVideoFramesResponse listVideoFrames(ListVideoFramesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVideoFramesWithOptions(request, runtime);
    }

    public ListVideoTasksResponse listVideoTasksWithOptions(ListVideoTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("MaxKeys", request.maxKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVideoTasks"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVideoTasksResponse());
    }

    public ListVideoTasksResponse listVideoTasks(ListVideoTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVideoTasksWithOptions(request, runtime);
    }

    public ListVideosResponse listVideosWithOptions(ListVideosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            query.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVideos"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVideosResponse());
    }

    public ListVideosResponse listVideos(ListVideosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVideosWithOptions(request, runtime);
    }

    public OpenImmServiceResponse openImmServiceWithOptions(OpenImmServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenImmService"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenImmServiceResponse());
    }

    public OpenImmServiceResponse openImmService(OpenImmServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openImmServiceWithOptions(request, runtime);
    }

    public PutProjectResponse putProjectWithOptions(PutProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRole)) {
            query.put("ServiceRole", request.serviceRole);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutProject"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutProjectResponse());
    }

    public PutProjectResponse putProject(PutProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putProjectWithOptions(request, runtime);
    }

    public RefreshOfficePreviewTokenResponse refreshOfficePreviewTokenWithOptions(RefreshOfficePreviewTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshToken)) {
            query.put("RefreshToken", request.refreshToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshOfficePreviewToken"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshOfficePreviewTokenResponse());
    }

    public RefreshOfficePreviewTokenResponse refreshOfficePreviewToken(RefreshOfficePreviewTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshOfficePreviewTokenWithOptions(request, runtime);
    }

    public RefreshWebofficeTokenResponse refreshWebofficeTokenWithOptions(RefreshWebofficeTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshToken)) {
            query.put("RefreshToken", request.refreshToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshWebofficeToken"),
            new TeaPair("version", "2017-09-06"),
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

    public UpdateFaceGroupResponse updateFaceGroupWithOptions(UpdateFaceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalId)) {
            query.put("ExternalId", request.externalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupCoverFaceId)) {
            query.put("GroupCoverFaceId", request.groupCoverFaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksA)) {
            query.put("RemarksA", request.remarksA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksArrayA)) {
            query.put("RemarksArrayA", request.remarksArrayA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksArrayB)) {
            query.put("RemarksArrayB", request.remarksArrayB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksB)) {
            query.put("RemarksB", request.remarksB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksC)) {
            query.put("RemarksC", request.remarksC);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksD)) {
            query.put("RemarksD", request.remarksD);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resetItems)) {
            query.put("ResetItems", request.resetItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFaceGroup"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFaceGroupResponse());
    }

    public UpdateFaceGroupResponse updateFaceGroup(UpdateFaceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFaceGroupWithOptions(request, runtime);
    }

    public UpdateImageResponse updateImageWithOptions(UpdateImageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateImageShrinkRequest request = new UpdateImageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.faces)) {
            request.facesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.faces, "Faces", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalId)) {
            query.put("ExternalId", request.externalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facesShrink)) {
            query.put("Faces", request.facesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            query.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksA)) {
            query.put("RemarksA", request.remarksA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksArrayA)) {
            query.put("RemarksArrayA", request.remarksArrayA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksArrayB)) {
            query.put("RemarksArrayB", request.remarksArrayB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksB)) {
            query.put("RemarksB", request.remarksB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksC)) {
            query.put("RemarksC", request.remarksC);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarksD)) {
            query.put("RemarksD", request.remarksD);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePosition)) {
            query.put("SourcePosition", request.sourcePosition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceUri)) {
            query.put("SourceUri", request.sourceUri);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateImage"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateImageResponse());
    }

    public UpdateImageResponse updateImage(UpdateImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateImageWithOptions(request, runtime);
    }

    public UpdateProjectResponse updateProjectWithOptions(UpdateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newCU)) {
            query.put("NewCU", request.newCU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newServiceRole)) {
            query.put("NewServiceRole", request.newServiceRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "2017-09-06"),
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

    public UpdateSetResponse updateSetWithOptions(UpdateSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setId)) {
            query.put("SetId", request.setId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setName)) {
            query.put("SetName", request.setName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSet"),
            new TeaPair("version", "2017-09-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSetResponse());
    }

    public UpdateSetResponse updateSet(UpdateSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSetWithOptions(request, runtime);
    }
}
