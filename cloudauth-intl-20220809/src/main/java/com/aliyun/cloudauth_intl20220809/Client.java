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

    public CheckResultResponse checkResult(CheckResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkResultWithOptions(request, runtime);
    }

    public FaceCompareResponse faceCompareWithOptions(FaceCompareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceFacePicture)) {
            query.put("SourceFacePicture", request.sourceFacePicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceFacePictureUrl)) {
            query.put("SourceFacePictureUrl", request.sourceFacePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFacePicture)) {
            query.put("TargetFacePicture", request.targetFacePicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFacePictureUrl)) {
            query.put("TargetFacePictureUrl", request.targetFacePictureUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
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

    public FaceCompareResponse faceCompare(FaceCompareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.faceCompareWithOptions(request, runtime);
    }

    public InitializeResponse initializeWithOptions(InitializeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            query.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            query.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facePictureBase64)) {
            query.put("FacePictureBase64", request.facePictureBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facePictureUrl)) {
            query.put("FacePictureUrl", request.facePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowType)) {
            query.put("FlowType", request.flowType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idFaceQuality)) {
            query.put("IdFaceQuality", request.idFaceQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idSpoof)) {
            query.put("IdSpoof", request.idSpoof);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ocr)) {
            query.put("Ocr", request.ocr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationMode)) {
            query.put("OperationMode", request.operationMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pages)) {
            query.put("Pages", request.pages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productConfig)) {
            query.put("ProductConfig", request.productConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnUrl)) {
            query.put("ReturnUrl", request.returnUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceLevel)) {
            query.put("ServiceLevel", request.serviceLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
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

    public InitializeResponse initialize(InitializeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initializeWithOptions(request, runtime);
    }
}
