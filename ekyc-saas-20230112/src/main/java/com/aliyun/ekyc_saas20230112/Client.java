// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112;

import com.aliyun.tea.*;
import com.aliyun.ekyc_saas20230112.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ekyc-saas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public FaceRecognitionCompareResponse faceRecognitionCompareWithOptions(FaceRecognitionCompareRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idCardImageData)) {
            body.put("idCardImageData", request.idCardImageData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardImageType)) {
            body.put("idCardImageType", request.idCardImageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardImageUrl)) {
            body.put("idCardImageUrl", request.idCardImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portraitImageData)) {
            body.put("portraitImageData", request.portraitImageData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portraitImageType)) {
            body.put("portraitImageType", request.portraitImageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portraitImageUrl)) {
            body.put("portraitImageUrl", request.portraitImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualityControl)) {
            body.put("qualityControl", request.qualityControl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FaceRecognitionCompare"),
            new TeaPair("version", "2023-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/face_recognition_compare"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FaceRecognitionCompareResponse());
    }

    public FaceRecognitionCompareResponse faceRecognitionCompare(FaceRecognitionCompareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.faceRecognitionCompareWithOptions(request, headers, runtime);
    }

    public FaceToFaceCompareResponse faceToFaceCompareWithOptions(FaceToFaceCompareRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.portraitImageData1)) {
            body.put("portraitImageData1", request.portraitImageData1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portraitImageData2)) {
            body.put("portraitImageData2", request.portraitImageData2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portraitImageType1)) {
            body.put("portraitImageType1", request.portraitImageType1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portraitImageType2)) {
            body.put("portraitImageType2", request.portraitImageType2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portraitImageUrl1)) {
            body.put("portraitImageUrl1", request.portraitImageUrl1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portraitImageUrl2)) {
            body.put("portraitImageUrl2", request.portraitImageUrl2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualityControl)) {
            body.put("qualityControl", request.qualityControl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FaceToFaceCompare"),
            new TeaPair("version", "2023-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/face_to_face_compare"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FaceToFaceCompareResponse());
    }

    public FaceToFaceCompareResponse faceToFaceCompare(FaceToFaceCompareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.faceToFaceCompareWithOptions(request, headers, runtime);
    }

    public IdDetectOcrCompareFacesResponse idDetectOcrCompareFacesWithOptions(IdDetectOcrCompareFacesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.OCR)) {
            body.put("OCR", request.OCR);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unrepeat)) {
            body.put("Unrepeat", request.unrepeat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardDetect)) {
            body.put("cardDetect", request.cardDetect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            body.put("countryCode", request.countryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentType)) {
            body.put("documentType", request.documentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceCompare)) {
            body.put("faceCompare", request.faceCompare);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageAType)) {
            body.put("imageAType", request.imageAType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageBType)) {
            body.put("imageBType", request.imageBType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageDataA)) {
            body.put("imageDataA", request.imageDataA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageDataB)) {
            body.put("imageDataB", request.imageDataB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlA)) {
            body.put("imageUrlA", request.imageUrlA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlB)) {
            body.put("imageUrlB", request.imageUrlB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portraitImageData)) {
            body.put("portraitImageData", request.portraitImageData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portraitImageUrl)) {
            body.put("portraitImageUrl", request.portraitImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualityControl)) {
            body.put("qualityControl", request.qualityControl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IdDetectOcrCompareFaces"),
            new TeaPair("version", "2023-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/id_detect_ocr_compare_faces"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IdDetectOcrCompareFacesResponse());
    }

    public IdDetectOcrCompareFacesResponse idDetectOcrCompareFaces(IdDetectOcrCompareFacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.idDetectOcrCompareFacesWithOptions(request, headers, runtime);
    }

    public IdDetectionAndScanDocumentResponse idDetectionAndScanDocumentWithOptions(IdDetectionAndScanDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            body.put("countryCode", request.countryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentType)) {
            body.put("documentType", request.documentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageAType)) {
            body.put("imageAType", request.imageAType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageBType)) {
            body.put("imageBType", request.imageBType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageDataA)) {
            body.put("imageDataA", request.imageDataA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageDataB)) {
            body.put("imageDataB", request.imageDataB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlA)) {
            body.put("imageUrlA", request.imageUrlA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlB)) {
            body.put("imageUrlB", request.imageUrlB);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IdDetectionAndScanDocument"),
            new TeaPair("version", "2023-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/id_detection_and_scan_document"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IdDetectionAndScanDocumentResponse());
    }

    public IdDetectionAndScanDocumentResponse idDetectionAndScanDocument(IdDetectionAndScanDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.idDetectionAndScanDocumentWithOptions(request, headers, runtime);
    }

    /**
      * After you upload the front-side image and back-side image (optional) of the certificate, the system returns the structured OCR results.
      * ### Limits
      * *   Format: JPEG or PNG.
      * *   Resolution: The length of an image is no greater than 4000 pixels, and the width is no smaller than 400 pixels. Recommended size: 1024\\*768.
      * *   Size: the size of a single image. Valid values: \\[4KB, 6MB].
      * ### Data protocol
      * *   Request: application/json.
      * *   Response: application/json.
      * *   Binary data: Base64.
      *
      * @param request ScanDocumentRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ScanDocumentResponse
     */
    public ScanDocumentResponse scanDocumentWithOptions(ScanDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            body.put("countryCode", request.countryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentType)) {
            body.put("documentType", request.documentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageAType)) {
            body.put("imageAType", request.imageAType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageBType)) {
            body.put("imageBType", request.imageBType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageDataA)) {
            body.put("imageDataA", request.imageDataA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageDataB)) {
            body.put("imageDataB", request.imageDataB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlA)) {
            body.put("imageUrlA", request.imageUrlA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlB)) {
            body.put("imageUrlB", request.imageUrlB);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScanDocument"),
            new TeaPair("version", "2023-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scan_document"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanDocumentResponse());
    }

    /**
      * After you upload the front-side image and back-side image (optional) of the certificate, the system returns the structured OCR results.
      * ### Limits
      * *   Format: JPEG or PNG.
      * *   Resolution: The length of an image is no greater than 4000 pixels, and the width is no smaller than 400 pixels. Recommended size: 1024\\*768.
      * *   Size: the size of a single image. Valid values: \\[4KB, 6MB].
      * ### Data protocol
      * *   Request: application/json.
      * *   Response: application/json.
      * *   Binary data: Base64.
      *
      * @param request ScanDocumentRequest
      * @return ScanDocumentResponse
     */
    public ScanDocumentResponse scanDocument(ScanDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scanDocumentWithOptions(request, headers, runtime);
    }

    public VerifyDocumentResponse verifyDocumentWithOptions(VerifyDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            body.put("countryCode", request.countryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detThickness)) {
            body.put("detThickness", request.detThickness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentType)) {
            body.put("documentType", request.documentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageAType)) {
            body.put("imageAType", request.imageAType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageBType)) {
            body.put("imageBType", request.imageBType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCType)) {
            body.put("imageCType", request.imageCType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageDataA)) {
            body.put("imageDataA", request.imageDataA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageDataB)) {
            body.put("imageDataB", request.imageDataB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageDataC)) {
            body.put("imageDataC", request.imageDataC);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlA)) {
            body.put("imageUrlA", request.imageUrlA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlB)) {
            body.put("imageUrlB", request.imageUrlB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlC)) {
            body.put("imageUrlC", request.imageUrlC);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyDocument"),
            new TeaPair("version", "2023-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/verify_document"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyDocumentResponse());
    }

    public VerifyDocumentResponse verifyDocument(VerifyDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyDocumentWithOptions(request, headers, runtime);
    }
}
