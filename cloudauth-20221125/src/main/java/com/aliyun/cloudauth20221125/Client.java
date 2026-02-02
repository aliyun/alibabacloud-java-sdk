// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125;

import com.aliyun.tea.*;
import com.aliyun.cloudauth20221125.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudauth", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <p>Supports only enterprises and individual businesses.</p>
     * 
     * <b>summary</b> : 
     * <p>Enterprise Element Verification</p>
     * 
     * @param request EntElementVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EntElementVerifyResponse
     */
    public EntElementVerifyResponse entElementVerifyWithOptions(EntElementVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entName)) {
            query.put("EntName", request.entName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infoVerifyType)) {
            query.put("InfoVerifyType", request.infoVerifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonCertNo)) {
            query.put("LegalPersonCertNo", request.legalPersonCertNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonName)) {
            query.put("LegalPersonName", request.legalPersonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseNo)) {
            query.put("LicenseNo", request.licenseNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAuthorization)) {
            query.put("UserAuthorization", request.userAuthorization);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EntElementVerify"),
            new TeaPair("version", "2022-11-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EntElementVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Supports only enterprises and individual businesses.</p>
     * 
     * <b>summary</b> : 
     * <p>Enterprise Element Verification</p>
     * 
     * @param request EntElementVerifyRequest
     * @return EntElementVerifyResponse
     */
    public EntElementVerifyResponse entElementVerify(EntElementVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.entElementVerifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>企业要素核验PRO</p>
     * 
     * @param request EntElementVerifyPRORequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EntElementVerifyPROResponse
     */
    public EntElementVerifyPROResponse entElementVerifyPROWithOptions(EntElementVerifyPRORequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entName)) {
            query.put("EntName", request.entName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infoVerifyType)) {
            query.put("InfoVerifyType", request.infoVerifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonCertNo)) {
            query.put("LegalPersonCertNo", request.legalPersonCertNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonName)) {
            query.put("LegalPersonName", request.legalPersonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseNo)) {
            query.put("LicenseNo", request.licenseNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAuthorization)) {
            query.put("UserAuthorization", request.userAuthorization);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EntElementVerifyPRO"),
            new TeaPair("version", "2022-11-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EntElementVerifyPROResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>企业要素核验PRO</p>
     * 
     * @param request EntElementVerifyPRORequest
     * @return EntElementVerifyPROResponse
     */
    public EntElementVerifyPROResponse entElementVerifyPRO(EntElementVerifyPRORequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.entElementVerifyPROWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The Enterprise Element Verification API provides a service for verifying the consistency of enterprise element information, used to identify the authenticity of enterprise information.
     * It supports various institutions including enterprises, individual businesses, farmers\&quot; professional cooperatives, government agencies, public institutions, social organizations, legal profession institutions, and owners\&quot; meetings for 2-3 elements;
     * For 4 elements, it supports enterprises, individual businesses, farmers\&quot; professional cooperatives, and legal professions.</p>
     * 
     * <b>summary</b> : 
     * <p>Enterprise Element Verification V2</p>
     * 
     * @param request EntElementVerifyV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return EntElementVerifyV2Response
     */
    public EntElementVerifyV2Response entElementVerifyV2WithOptions(EntElementVerifyV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entName)) {
            query.put("EntName", request.entName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infoVerifyType)) {
            query.put("InfoVerifyType", request.infoVerifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonCertNo)) {
            query.put("LegalPersonCertNo", request.legalPersonCertNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonName)) {
            query.put("LegalPersonName", request.legalPersonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseNo)) {
            query.put("LicenseNo", request.licenseNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAuthorization)) {
            query.put("UserAuthorization", request.userAuthorization);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EntElementVerifyV2"),
            new TeaPair("version", "2022-11-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EntElementVerifyV2Response());
    }

    /**
     * <b>description</b> :
     * <p>The Enterprise Element Verification API provides a service for verifying the consistency of enterprise element information, used to identify the authenticity of enterprise information.
     * It supports various institutions including enterprises, individual businesses, farmers\&quot; professional cooperatives, government agencies, public institutions, social organizations, legal profession institutions, and owners\&quot; meetings for 2-3 elements;
     * For 4 elements, it supports enterprises, individual businesses, farmers\&quot; professional cooperatives, and legal professions.</p>
     * 
     * <b>summary</b> : 
     * <p>Enterprise Element Verification V2</p>
     * 
     * @param request EntElementVerifyV2Request
     * @return EntElementVerifyV2Response
     */
    public EntElementVerifyV2Response entElementVerifyV2(EntElementVerifyV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.entElementVerifyV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Abnormal Business Operation Query</p>
     * 
     * @param request EntRiskQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EntRiskQueryResponse
     */
    public EntRiskQueryResponse entRiskQueryWithOptions(EntRiskQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramValue)) {
            query.put("ParamValue", request.paramValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAuthorization)) {
            query.put("UserAuthorization", request.userAuthorization);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EntRiskQuery"),
            new TeaPair("version", "2022-11-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EntRiskQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Abnormal Business Operation Query</p>
     * 
     * @param request EntRiskQueryRequest
     * @return EntRiskQueryResponse
     */
    public EntRiskQueryResponse entRiskQuery(EntRiskQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.entRiskQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enterprise Authentication</p>
     * 
     * @param request EntVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EntVerifyResponse
     */
    public EntVerifyResponse entVerifyWithOptions(EntVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            query.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entName)) {
            query.put("EntName", request.entName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infoVerifyType)) {
            query.put("InfoVerifyType", request.infoVerifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonCertNo)) {
            query.put("LegalPersonCertNo", request.legalPersonCertNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonMobile)) {
            query.put("LegalPersonMobile", request.legalPersonMobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonName)) {
            query.put("LegalPersonName", request.legalPersonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseNo)) {
            query.put("LicenseNo", request.licenseNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantUserId)) {
            query.put("MerchantUserId", request.merchantUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskModelVersion)) {
            query.put("RiskModelVersion", request.riskModelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskVerifyType)) {
            query.put("RiskVerifyType", request.riskVerifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAuthorization)) {
            query.put("UserAuthorization", request.userAuthorization);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EntVerify"),
            new TeaPair("version", "2022-11-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EntVerifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enterprise Authentication</p>
     * 
     * @param request EntVerifyRequest
     * @return EntVerifyResponse
     */
    public EntVerifyResponse entVerify(EntVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.entVerifyWithOptions(request, runtime);
    }
}
