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
      * @deprecated : CardOcr is deprecated, please use Cloudauth-intl::2022-08-09::DocOcr instead.
      *
      * @param request CardOcrRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CardOcrResponse
     */
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

        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureBase64)) {
            query.put("IdOcrPictureBase64", request.idOcrPictureBase64);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
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
      * @deprecated : CardOcr is deprecated, please use Cloudauth-intl::2022-08-09::DocOcr instead.
      *
      * @param request CardOcrRequest
      * @return CardOcrResponse
     */
    // Deprecated
    public CardOcrResponse cardOcr(CardOcrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cardOcrWithOptions(request, runtime);
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

    public DeletePictureResponse deletePictureWithOptions(DeletePictureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deletePicAfterQuery)) {
            query.put("DeletePicAfterQuery", request.deletePicAfterQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionId)) {
            query.put("TransactionId", request.transactionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePicture"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePictureResponse());
    }

    public DeletePictureResponse deletePicture(DeletePictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePictureWithOptions(request, runtime);
    }

    public DescribeAddressLabelsResponse describeAddressLabelsWithOptions(DescribeAddressLabelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coin)) {
            query.put("Coin", request.coin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAddressLabels"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAddressLabelsResponse());
    }

    public DescribeAddressLabelsResponse describeAddressLabels(DescribeAddressLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAddressLabelsWithOptions(request, runtime);
    }

    public DescribeAddressOverviewResponse describeAddressOverviewWithOptions(DescribeAddressOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coin)) {
            query.put("Coin", request.coin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAddressOverview"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAddressOverviewResponse());
    }

    public DescribeAddressOverviewResponse describeAddressOverview(DescribeAddressOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAddressOverviewWithOptions(request, runtime);
    }

    public DescribeMaliciousAddressResponse describeMaliciousAddressWithOptions(DescribeMaliciousAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coin)) {
            query.put("Coin", request.coin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMaliciousAddress"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMaliciousAddressResponse());
    }

    public DescribeMaliciousAddressResponse describeMaliciousAddress(DescribeMaliciousAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMaliciousAddressWithOptions(request, runtime);
    }

    public DescribeRiskScoreResponse describeRiskScoreWithOptions(DescribeRiskScoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coin)) {
            query.put("Coin", request.coin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRiskScore"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRiskScoreResponse());
    }

    public DescribeRiskScoreResponse describeRiskScore(DescribeRiskScoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRiskScoreWithOptions(request, runtime);
    }

    public DescribeTransactionsListResponse describeTransactionsListWithOptions(DescribeTransactionsListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coin)) {
            query.put("Coin", request.coin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTransactionsList"),
            new TeaPair("version", "2022-08-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTransactionsListResponse());
    }

    public DescribeTransactionsListResponse describeTransactionsList(DescribeTransactionsListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTransactionsListWithOptions(request, runtime);
    }

    public DocOcrResponse docOcrWithOptions(DocOcrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            query.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idFaceQuality)) {
            query.put("IdFaceQuality", request.idFaceQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idOcrPictureBase64)) {
            query.put("IdOcrPictureBase64", request.idOcrPictureBase64);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
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

    public DocOcrResponse docOcr(DocOcrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.docOcrWithOptions(request, runtime);
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

    public FaceLivenessResponse faceLivenessWithOptions(FaceLivenessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            query.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facePictureBase64)) {
            query.put("FacePictureBase64", request.facePictureBase64);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
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

    public FaceLivenessResponse faceLiveness(FaceLivenessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.faceLivenessWithOptions(request, runtime);
    }

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

    public FraudResultCallBackResponse fraudResultCallBack(FraudResultCallBackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fraudResultCallBackWithOptions(request, runtime);
    }

    public InitializeResponse initializeWithOptions(InitializeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorize)) {
            query.put("Authorize", request.authorize);
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
