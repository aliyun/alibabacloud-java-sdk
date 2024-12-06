// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809;

import com.aliyun.tea.*;
import com.aliyun.cloudauth_intl20220809.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudauth-intl", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>证件OCR识别纯服务端接口</p>
     * 
     * @deprecated OpenAPI CardOcr is deprecated, please use Cloudauth-intl::2022-08-09::DocOcr instead.
     * 
     * @param request CardOcrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CardOcrResponse
     */
    @Deprecated
    // Deprecated
    public CardOcrResponse cardOcrWithOptions(CardOcrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            query.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idFaceQuality)) {
            query.put("IdFaceQuality", request.idFaceQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureUrl)) {
            query.put("IdOcrPictureUrl", request.idOcrPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ocr)) {
            query.put("Ocr", request.ocr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spoof)) {
            query.put("Spoof", request.spoof);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureBase64)) {
            body.put("IdOcrPictureBase64", request.idOcrPictureBase64);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CardOcr"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CardOcrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>证件OCR识别纯服务端接口</p>
     * 
     * @deprecated OpenAPI CardOcr is deprecated, please use Cloudauth-intl::2022-08-09::DocOcr instead.
     * 
     * @param request CardOcrRequest
     * @return CardOcrResponse
     */
    @Deprecated
    // Deprecated
    public CardOcrResponse cardOcr(CardOcrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cardOcrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>结果查询</p>
     * 
     * @param request CheckResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckResultResponse
     */
    public CheckResultResponse checkResultWithOptions(CheckResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraImageControlList)) {
            query.put("ExtraImageControlList", request.extraImageControlList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isReturnImage)) {
            query.put("IsReturnImage", request.isReturnImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnFiveCategorySpoofResult)) {
            query.put("ReturnFiveCategorySpoofResult", request.returnFiveCategorySpoofResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionId)) {
            query.put("TransactionId", request.transactionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckResult"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>结果查询</p>
     * 
     * @param request CheckResultRequest
     * @return CheckResultResponse
     */
    public CheckResultResponse checkResult(CheckResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户认证记录结果</p>
     * 
     * @param request DeleteVerifyResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVerifyResultResponse
     */
    public DeleteVerifyResultResponse deleteVerifyResultWithOptions(DeleteVerifyResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteAfterQuery)) {
            query.put("DeleteAfterQuery", request.deleteAfterQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteType)) {
            query.put("DeleteType", request.deleteType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionId)) {
            query.put("TransactionId", request.transactionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVerifyResult"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVerifyResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户认证记录结果</p>
     * 
     * @param request DeleteVerifyResultRequest
     * @return DeleteVerifyResultResponse
     */
    public DeleteVerifyResultResponse deleteVerifyResult(DeleteVerifyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVerifyResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>卡证ocr纯服务端</p>
     * 
     * @param request DocOcrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DocOcrResponse
     */
    public DocOcrResponse docOcrWithOptions(DocOcrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cardSide)) {
            query.put("CardSide", request.cardSide);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            query.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idFaceQuality)) {
            query.put("IdFaceQuality", request.idFaceQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureUrl)) {
            query.put("IdOcrPictureUrl", request.idOcrPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idThreshold)) {
            query.put("IdThreshold", request.idThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ocr)) {
            query.put("Ocr", request.ocr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spoof)) {
            query.put("Spoof", request.spoof);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureBase64)) {
            body.put("IdOcrPictureBase64", request.idOcrPictureBase64);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DocOcr"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DocOcrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>卡证ocr纯服务端</p>
     * 
     * @param request DocOcrRequest
     * @return DocOcrResponse
     */
    public DocOcrResponse docOcr(DocOcrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.docOcrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ekyc纯服务端接口</p>
     * 
     * @param request EkycVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EkycVerifyResponse
     */
    public EkycVerifyResponse ekycVerifyWithOptions(EkycVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorize)) {
            query.put("Authorize", request.authorize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            query.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docName)) {
            query.put("DocName", request.docName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docNo)) {
            query.put("DocNo", request.docNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            query.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facePictureUrl)) {
            query.put("FacePictureUrl", request.facePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureUrl)) {
            query.put("IdOcrPictureUrl", request.idOcrPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idThreshold)) {
            query.put("IdThreshold", request.idThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.facePictureBase64)) {
            body.put("FacePictureBase64", request.facePictureBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureBase64)) {
            body.put("IdOcrPictureBase64", request.idOcrPictureBase64);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EkycVerify"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EkycVerifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ekyc纯服务端接口</p>
     * 
     * @param request EkycVerifyRequest
     * @return EkycVerifyResponse
     */
    public EkycVerifyResponse ekycVerify(EkycVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ekycVerifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>人脸比对</p>
     * 
     * @param request FaceCompareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FaceCompareResponse
     */
    public FaceCompareResponse faceCompareWithOptions(FaceCompareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceFacePictureUrl)) {
            query.put("SourceFacePictureUrl", request.sourceFacePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFacePictureUrl)) {
            query.put("TargetFacePictureUrl", request.targetFacePictureUrl);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceFacePicture)) {
            body.put("SourceFacePicture", request.sourceFacePicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFacePicture)) {
            body.put("TargetFacePicture", request.targetFacePicture);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FaceCompare"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FaceCompareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>人脸比对</p>
     * 
     * @param request FaceCompareRequest
     * @return FaceCompareResponse
     */
    public FaceCompareResponse faceCompare(FaceCompareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.faceCompareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际人脸保镖纯服务端接口</p>
     * 
     * @param request FaceGuardRiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FaceGuardRiskResponse
     */
    public FaceGuardRiskResponse faceGuardRiskWithOptions(FaceGuardRiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceToken)) {
            query.put("DeviceToken", request.deviceToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FaceGuardRisk"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FaceGuardRiskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>国际人脸保镖纯服务端接口</p>
     * 
     * @param request FaceGuardRiskRequest
     * @return FaceGuardRiskResponse
     */
    public FaceGuardRiskResponse faceGuardRisk(FaceGuardRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.faceGuardRiskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>静默活体API 纯服务端</p>
     * 
     * @param request FaceLivenessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FaceLivenessResponse
     */
    public FaceLivenessResponse faceLivenessWithOptions(FaceLivenessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            query.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facePictureUrl)) {
            query.put("FacePictureUrl", request.facePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceQuality)) {
            query.put("FaceQuality", request.faceQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.occlusion)) {
            query.put("Occlusion", request.occlusion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.facePictureBase64)) {
            body.put("FacePictureBase64", request.facePictureBase64);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FaceLiveness"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FaceLivenessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>静默活体API 纯服务端</p>
     * 
     * @param request FaceLivenessRequest
     * @return FaceLivenessResponse
     */
    public FaceLivenessResponse faceLiveness(FaceLivenessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.faceLivenessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>防伪回调接口</p>
     * 
     * @param request FraudResultCallBackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FraudResultCallBackResponse
     */
    public FraudResultCallBackResponse fraudResultCallBackWithOptions(FraudResultCallBackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certifyId)) {
            query.put("CertifyId", request.certifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extParams)) {
            query.put("ExtParams", request.extParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultCode)) {
            query.put("ResultCode", request.resultCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyDeployEnv)) {
            query.put("VerifyDeployEnv", request.verifyDeployEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FraudResultCallBack"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FraudResultCallBackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>防伪回调接口</p>
     * 
     * @param request FraudResultCallBackRequest
     * @return FraudResultCallBackResponse
     */
    public FraudResultCallBackResponse fraudResultCallBack(FraudResultCallBackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fraudResultCallBackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>身份二要素国际版接口</p>
     * 
     * @param request Id2MetaVerifyIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Id2MetaVerifyIntlResponse
     */
    public Id2MetaVerifyIntlResponse id2MetaVerifyIntlWithOptions(Id2MetaVerifyIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            query.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Id2MetaVerifyIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Id2MetaVerifyIntlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>身份二要素国际版接口</p>
     * 
     * @param request Id2MetaVerifyIntlRequest
     * @return Id2MetaVerifyIntlResponse
     */
    public Id2MetaVerifyIntlResponse id2MetaVerifyIntl(Id2MetaVerifyIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.id2MetaVerifyIntlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>认证初始化</p>
     * 
     * @param request InitializeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitializeResponse
     */
    public InitializeResponse initializeWithOptions(InitializeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appQualityCheck)) {
            query.put("AppQualityCheck", request.appQualityCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorize)) {
            query.put("Authorize", request.authorize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackToken)) {
            query.put("CallbackToken", request.callbackToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            query.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            query.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docScanMode)) {
            query.put("DocScanMode", request.docScanMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            query.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docVideo)) {
            query.put("DocVideo", request.docVideo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experienceCode)) {
            query.put("ExperienceCode", request.experienceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facePictureUrl)) {
            query.put("FacePictureUrl", request.facePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idFaceQuality)) {
            query.put("IdFaceQuality", request.idFaceQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idSpoof)) {
            query.put("IdSpoof", request.idSpoof);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idThreshold)) {
            query.put("IdThreshold", request.idThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageConfig)) {
            query.put("LanguageConfig", request.languageConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaInfo)) {
            query.put("MetaInfo", request.metaInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ocr)) {
            query.put("Ocr", request.ocr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.procedurePriority)) {
            query.put("ProcedurePriority", request.procedurePriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productFlow)) {
            query.put("ProductFlow", request.productFlow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnUrl)) {
            query.put("ReturnUrl", request.returnUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityLevel)) {
            query.put("SecurityLevel", request.securityLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showAlbumIcon)) {
            query.put("ShowAlbumIcon", request.showAlbumIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showGuidePage)) {
            query.put("ShowGuidePage", request.showGuidePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showOcrResult)) {
            query.put("ShowOcrResult", request.showOcrResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.styleConfig)) {
            query.put("StyleConfig", request.styleConfig);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.facePictureBase64)) {
            body.put("FacePictureBase64", request.facePictureBase64);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Initialize"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitializeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>认证初始化</p>
     * 
     * @param request InitializeRequest
     * @return InitializeResponse
     */
    public InitializeResponse initialize(InitializeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initializeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>手机号三要素国际版接口</p>
     * 
     * @param request Mobile3MetaVerifyIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Mobile3MetaVerifyIntlResponse
     */
    public Mobile3MetaVerifyIntlResponse mobile3MetaVerifyIntlWithOptions(Mobile3MetaVerifyIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            query.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Mobile3MetaVerifyIntl"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Mobile3MetaVerifyIntlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>手机号三要素国际版接口</p>
     * 
     * @param request Mobile3MetaVerifyIntlRequest
     * @return Mobile3MetaVerifyIntlResponse
     */
    public Mobile3MetaVerifyIntlResponse mobile3MetaVerifyIntl(Mobile3MetaVerifyIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mobile3MetaVerifyIntlWithOptions(request, runtime);
    }
}
