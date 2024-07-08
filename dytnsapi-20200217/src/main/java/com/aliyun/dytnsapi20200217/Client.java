// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217;

import com.aliyun.tea.*;
import com.aliyun.dytnsapi20200217.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dytnsapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>身份证二要素认证</p>
     * 
     * @param request CertNoTwoElementVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CertNoTwoElementVerificationResponse
     */
    public CertNoTwoElementVerificationResponse certNoTwoElementVerificationWithOptions(CertNoTwoElementVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certNo)) {
            query.put("CertNo", request.certNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CertNoTwoElementVerification"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CertNoTwoElementVerificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>身份证二要素认证</p>
     * 
     * @param request CertNoTwoElementVerificationRequest
     * @return CertNoTwoElementVerificationResponse
     */
    public CertNoTwoElementVerificationResponse certNoTwoElementVerification(CertNoTwoElementVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.certNoTwoElementVerificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing of services related to four-element verification for enterprises. For more information, see <a href="https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4">Billing</a>.</p>
     * <ul>
     * <li>You are charged only if the value of VerifyResult is true or false and the value of ReasonCode is 0, 1, or 2.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC%5C&lang=zh">Cell Phone Number Service console</a>. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether the enterprise name, the business license number, and the name and ID card of the legal representative belong to the same enterprise. The verification is successful only when the preceding four elements belong to the same enterprise and the business status of the enterprise is Active.</p>
     * 
     * @param request CompanyFourElementsVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompanyFourElementsVerificationResponse
     */
    public CompanyFourElementsVerificationResponse companyFourElementsVerificationWithOptions(CompanyFourElementsVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.epCertName)) {
            query.put("EpCertName", request.epCertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.epCertNo)) {
            query.put("EpCertNo", request.epCertNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonCertName)) {
            query.put("LegalPersonCertName", request.legalPersonCertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonCertNo)) {
            query.put("LegalPersonCertNo", request.legalPersonCertNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompanyFourElementsVerification"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompanyFourElementsVerificationResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing of services related to four-element verification for enterprises. For more information, see <a href="https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4">Billing</a>.</p>
     * <ul>
     * <li>You are charged only if the value of VerifyResult is true or false and the value of ReasonCode is 0, 1, or 2.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC%5C&lang=zh">Cell Phone Number Service console</a>. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether the enterprise name, the business license number, and the name and ID card of the legal representative belong to the same enterprise. The verification is successful only when the preceding four elements belong to the same enterprise and the business status of the enterprise is Active.</p>
     * 
     * @param request CompanyFourElementsVerificationRequest
     * @return CompanyFourElementsVerificationResponse
     */
    public CompanyFourElementsVerificationResponse companyFourElementsVerification(CompanyFourElementsVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.companyFourElementsVerificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing of services related to three-element verification for enterprises. For more information, see <a href="https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4">Billing</a>.</p>
     * <ul>
     * <li>You are charged only if the value of VerifyResult is true or false and the value of ReasonCode is 0, 1, or 2.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC%5C&lang=zh">Cell Phone Number Service console</a>. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether the enterprise name, the business license number, and the name of the legal representative belong to the same enterprise. The verification is successful only when the three elements belong to the same enterprise and the business status of the enterprise is Active.</p>
     * 
     * @param request CompanyThreeElementsVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompanyThreeElementsVerificationResponse
     */
    public CompanyThreeElementsVerificationResponse companyThreeElementsVerificationWithOptions(CompanyThreeElementsVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.epCertName)) {
            query.put("EpCertName", request.epCertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.epCertNo)) {
            query.put("EpCertNo", request.epCertNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonCertName)) {
            query.put("LegalPersonCertName", request.legalPersonCertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompanyThreeElementsVerification"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompanyThreeElementsVerificationResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing of services related to three-element verification for enterprises. For more information, see <a href="https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4">Billing</a>.</p>
     * <ul>
     * <li>You are charged only if the value of VerifyResult is true or false and the value of ReasonCode is 0, 1, or 2.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC%5C&lang=zh">Cell Phone Number Service console</a>. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether the enterprise name, the business license number, and the name of the legal representative belong to the same enterprise. The verification is successful only when the three elements belong to the same enterprise and the business status of the enterprise is Active.</p>
     * 
     * @param request CompanyThreeElementsVerificationRequest
     * @return CompanyThreeElementsVerificationResponse
     */
    public CompanyThreeElementsVerificationResponse companyThreeElementsVerification(CompanyThreeElementsVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.companyThreeElementsVerificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing of services related to two-element verification for enterprises. For more information, see <a href="https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4">Billing</a>.</p>
     * <ul>
     * <li>You are charged only if the value of VerifyResult is true or false and the value of ReasonCode is 0 or 1.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC%5C&lang=zh">Cell Phone Number Service console</a>. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether the enterprise name and the business license number belong to the same enterprise. The verification is successful only when the two elements belong to the same enterprise and the business status of the enterprise is Active.</p>
     * 
     * @param request CompanyTwoElementsVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompanyTwoElementsVerificationResponse
     */
    public CompanyTwoElementsVerificationResponse companyTwoElementsVerificationWithOptions(CompanyTwoElementsVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.epCertName)) {
            query.put("EpCertName", request.epCertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.epCertNo)) {
            query.put("EpCertNo", request.epCertNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompanyTwoElementsVerification"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompanyTwoElementsVerificationResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing of services related to two-element verification for enterprises. For more information, see <a href="https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4">Billing</a>.</p>
     * <ul>
     * <li>You are charged only if the value of VerifyResult is true or false and the value of ReasonCode is 0 or 1.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC%5C&lang=zh">Cell Phone Number Service console</a>. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether the enterprise name and the business license number belong to the same enterprise. The verification is successful only when the two elements belong to the same enterprise and the business status of the enterprise is Active.</p>
     * 
     * @param request CompanyTwoElementsVerificationRequest
     * @return CompanyTwoElementsVerificationResponse
     */
    public CompanyTwoElementsVerificationResponse companyTwoElementsVerification(CompanyTwoElementsVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.companyTwoElementsVerificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to verify whether a phone number is a nonexistent number. When you call this operation to verify a number, the system charges you CNY 0.01 per verification based on the number of verifications. <strong>Before you call this operation, make sure that you are familiar with the billing of Cell Phone Number Service.</strong></p>
     * <ul>
     * <li>You are charged only if the value of Code is OK and the value of Status is not UNKNOWN.</li>
     * <li>The prediction is not strictly accurate because Cell Phone Number Service predicts the nonexistent number probability by using AI algorithms. The accuracy rate of the prediction and the recall rate of empty numbers are about 95%. <strong>Pay attention to this point when you call this operation</strong>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <h3><a href="#"></a>Authorization information</h3>
     * <p>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Predicts whether a phone number is a nonexistent number by using AI algorithms.</p>
     * 
     * @param request DescribeEmptyNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEmptyNumberResponse
     */
    public DescribeEmptyNumberResponse describeEmptyNumberWithOptions(DescribeEmptyNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEmptyNumber"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEmptyNumberResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to verify whether a phone number is a nonexistent number. When you call this operation to verify a number, the system charges you CNY 0.01 per verification based on the number of verifications. <strong>Before you call this operation, make sure that you are familiar with the billing of Cell Phone Number Service.</strong></p>
     * <ul>
     * <li>You are charged only if the value of Code is OK and the value of Status is not UNKNOWN.</li>
     * <li>The prediction is not strictly accurate because Cell Phone Number Service predicts the nonexistent number probability by using AI algorithms. The accuracy rate of the prediction and the recall rate of empty numbers are about 95%. <strong>Pay attention to this point when you call this operation</strong>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <h3><a href="#"></a>Authorization information</h3>
     * <p>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Predicts whether a phone number is a nonexistent number by using AI algorithms.</p>
     * 
     * @param request DescribeEmptyNumberRequest
     * @return DescribeEmptyNumberResponse
     */
    public DescribeEmptyNumberResponse describeEmptyNumber(DescribeEmptyNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEmptyNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>号码分析实时查询蚂蚁</p>
     * 
     * @param request DescribePhoneNumberAnalysisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePhoneNumberAnalysisResponse
     */
    public DescribePhoneNumberAnalysisResponse describePhoneNumberAnalysisWithOptions(DescribePhoneNumberAnalysisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberType)) {
            query.put("NumberType", request.numberType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rate)) {
            query.put("Rate", request.rate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePhoneNumberAnalysis"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePhoneNumberAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>号码分析实时查询蚂蚁</p>
     * 
     * @param request DescribePhoneNumberAnalysisRequest
     * @return DescribePhoneNumberAnalysisResponse
     */
    public DescribePhoneNumberAnalysisResponse describePhoneNumberAnalysis(DescribePhoneNumberAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePhoneNumberAnalysisWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the Labels page, find the label that you want to use, click Activate Now, enter the required information, and then submit your application. After your application is approved, you can use the label. Before you call this operation, make sure that you are familiar with the billing of Cell Phone Number Service.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of a phone number.</p>
     * 
     * @param request DescribePhoneNumberAnalysisAIRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePhoneNumberAnalysisAIResponse
     */
    public DescribePhoneNumberAnalysisAIResponse describePhoneNumberAnalysisAIWithOptions(DescribePhoneNumberAnalysisAIRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelConfig)) {
            query.put("ModelConfig", request.modelConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rate)) {
            query.put("Rate", request.rate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePhoneNumberAnalysisAI"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePhoneNumberAnalysisAIResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the Labels page, find the label that you want to use, click Activate Now, enter the required information, and then submit your application. After your application is approved, you can use the label. Before you call this operation, make sure that you are familiar with the billing of Cell Phone Number Service.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of a phone number.</p>
     * 
     * @param request DescribePhoneNumberAnalysisAIRequest
     * @return DescribePhoneNumberAnalysisAIResponse
     */
    public DescribePhoneNumberAnalysisAIResponse describePhoneNumberAnalysisAI(DescribePhoneNumberAnalysisAIRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePhoneNumberAnalysisAIWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>泛行业人群筛选</p>
     * 
     * @param request DescribePhoneNumberAnalysisTransparentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePhoneNumberAnalysisTransparentResponse
     */
    public DescribePhoneNumberAnalysisTransparentResponse describePhoneNumberAnalysisTransparentWithOptions(DescribePhoneNumberAnalysisTransparentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberType)) {
            query.put("NumberType", request.numberType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePhoneNumberAnalysisTransparent"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePhoneNumberAnalysisTransparentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>泛行业人群筛选</p>
     * 
     * @param request DescribePhoneNumberAnalysisTransparentRequest
     * @return DescribePhoneNumberAnalysisTransparentResponse
     */
    public DescribePhoneNumberAnalysisTransparentResponse describePhoneNumberAnalysisTransparent(DescribePhoneNumberAnalysisTransparentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePhoneNumberAnalysisTransparentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 2,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the carrier, registration location, and mobile number portability information of a phone number.</p>
     * 
     * @deprecated OpenAPI DescribePhoneNumberAttribute is deprecated, please use Dytnsapi::2020-02-17::DescribePhoneNumberOperatorAttribute instead.
     * 
     * @param request DescribePhoneNumberAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePhoneNumberAttributeResponse
     */
    @Deprecated
    // Deprecated
    public DescribePhoneNumberAttributeResponse describePhoneNumberAttributeWithOptions(DescribePhoneNumberAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePhoneNumberAttribute"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePhoneNumberAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 2,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the carrier, registration location, and mobile number portability information of a phone number.</p>
     * 
     * @deprecated OpenAPI DescribePhoneNumberAttribute is deprecated, please use Dytnsapi::2020-02-17::DescribePhoneNumberOperatorAttribute instead.
     * 
     * @param request DescribePhoneNumberAttributeRequest
     * @return DescribePhoneNumberAttributeResponse
     */
    @Deprecated
    // Deprecated
    public DescribePhoneNumberAttributeResponse describePhoneNumberAttribute(DescribePhoneNumberAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePhoneNumberAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage period of a phone number of a user.</p>
     * 
     * @param request DescribePhoneNumberOnlineTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePhoneNumberOnlineTimeResponse
     */
    public DescribePhoneNumberOnlineTimeResponse describePhoneNumberOnlineTimeWithOptions(DescribePhoneNumberOnlineTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.carrier)) {
            query.put("Carrier", request.carrier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePhoneNumberOnlineTime"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePhoneNumberOnlineTimeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage period of a phone number of a user.</p>
     * 
     * @param request DescribePhoneNumberOnlineTimeRequest
     * @return DescribePhoneNumberOnlineTimeResponse
     */
    public DescribePhoneNumberOnlineTimeResponse describePhoneNumberOnlineTime(DescribePhoneNumberOnlineTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePhoneNumberOnlineTimeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154008.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>You can call this operation to obtain the carrier, registration location, and mobile number portability information about a phone number. You can query phone numbers in <strong>plaintext</strong> and phone numbers that are encrypted by using <strong>MD5</strong> and <strong>SHA256</strong>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the attribute information about a phone number, including the registration province, registration city, basic carrier (such as China Mobile, China Unicom, China Telecom, or China Broadnet), reseller of mobile communications services (such as Alibaba Communications), mobile number portability, and the number segment to which the phone number belongs.</p>
     * 
     * @param request DescribePhoneNumberOperatorAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePhoneNumberOperatorAttributeResponse
     */
    public DescribePhoneNumberOperatorAttributeResponse describePhoneNumberOperatorAttributeWithOptions(DescribePhoneNumberOperatorAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            query.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultCount)) {
            query.put("ResultCount", request.resultCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePhoneNumberOperatorAttribute"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePhoneNumberOperatorAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154008.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>You can call this operation to obtain the carrier, registration location, and mobile number portability information about a phone number. You can query phone numbers in <strong>plaintext</strong> and phone numbers that are encrypted by using <strong>MD5</strong> and <strong>SHA256</strong>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the attribute information about a phone number, including the registration province, registration city, basic carrier (such as China Mobile, China Unicom, China Telecom, or China Broadnet), reseller of mobile communications services (such as Alibaba Communications), mobile number portability, and the number segment to which the phone number belongs.</p>
     * 
     * @param request DescribePhoneNumberOperatorAttributeRequest
     * @return DescribePhoneNumberOperatorAttributeResponse
     */
    public DescribePhoneNumberOperatorAttributeResponse describePhoneNumberOperatorAttribute(DescribePhoneNumberOperatorAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePhoneNumberOperatorAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>风险用户评分</p>
     * 
     * @param request DescribePhoneNumberRiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePhoneNumberRiskResponse
     */
    public DescribePhoneNumberRiskResponse describePhoneNumberRiskWithOptions(DescribePhoneNumberRiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePhoneNumberRisk"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePhoneNumberRiskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>风险用户评分</p>
     * 
     * @param request DescribePhoneNumberRiskRequest
     * @return DescribePhoneNumberRiskResponse
     */
    public DescribePhoneNumberRiskResponse describePhoneNumberRisk(DescribePhoneNumberRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePhoneNumberRiskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>You are charged for phone number verifications only if the value of Code is OK and the value of VerifyResult is not 0.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h2><a href="#qps"></a>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <h2><a href="#"></a>Authorization information</h2>
     * <p>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether a phone number is a reassigned phone number by calling this operation.</p>
     * 
     * @param request DescribePhoneTwiceTelVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePhoneTwiceTelVerifyResponse
     */
    public DescribePhoneTwiceTelVerifyResponse describePhoneTwiceTelVerifyWithOptions(DescribePhoneTwiceTelVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePhoneTwiceTelVerify"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePhoneTwiceTelVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>You are charged for phone number verifications only if the value of Code is OK and the value of VerifyResult is not 0.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h2><a href="#qps"></a>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <h2><a href="#"></a>Authorization information</h2>
     * <p>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether a phone number is a reassigned phone number by calling this operation.</p>
     * 
     * @param request DescribePhoneTwiceTelVerifyRequest
     * @return DescribePhoneTwiceTelVerifyResponse
     */
    public DescribePhoneTwiceTelVerifyResponse describePhoneTwiceTelVerify(DescribePhoneTwiceTelVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePhoneTwiceTelVerifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取UAID申请Token所需的签名字段</p>
     * 
     * @param request GetUAIDApplyTokenSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUAIDApplyTokenSignResponse
     */
    public GetUAIDApplyTokenSignResponse getUAIDApplyTokenSignWithOptions(GetUAIDApplyTokenSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.carrier)) {
            query.put("Carrier", request.carrier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            query.put("Format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramKey)) {
            query.put("ParamKey", request.paramKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramStr)) {
            query.put("ParamStr", request.paramStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            query.put("Time", request.time);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUAIDApplyTokenSign"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUAIDApplyTokenSignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取UAID申请Token所需的签名字段</p>
     * 
     * @param request GetUAIDApplyTokenSignRequest
     * @return GetUAIDApplyTokenSignResponse
     */
    public GetUAIDApplyTokenSignResponse getUAIDApplyTokenSign(GetUAIDApplyTokenSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUAIDApplyTokenSignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取号码采集服务申请Token所需的签名字段</p>
     * 
     * @param request GetUAIDConversionSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUAIDConversionSignResponse
     */
    public GetUAIDConversionSignResponse getUAIDConversionSignWithOptions(GetUAIDConversionSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.carrier)) {
            query.put("Carrier", request.carrier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            query.put("Format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramKey)) {
            query.put("ParamKey", request.paramKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramStr)) {
            query.put("ParamStr", request.paramStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            query.put("Time", request.time);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUAIDConversionSign"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUAIDConversionSignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取号码采集服务申请Token所需的签名字段</p>
     * 
     * @param request GetUAIDConversionSignRequest
     * @return GetUAIDConversionSignResponse
     */
    public GetUAIDConversionSignResponse getUAIDConversionSign(GetUAIDConversionSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUAIDConversionSignWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Filters invalid phone numbers.</p>
     * 
     * @param request InvalidPhoneNumberFilterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvalidPhoneNumberFilterResponse
     */
    public InvalidPhoneNumberFilterResponse invalidPhoneNumberFilterWithOptions(InvalidPhoneNumberFilterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvalidPhoneNumberFilter"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvalidPhoneNumberFilterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Filters invalid phone numbers.</p>
     * 
     * @param request InvalidPhoneNumberFilterRequest
     * @return InvalidPhoneNumberFilterResponse
     */
    public InvalidPhoneNumberFilterResponse invalidPhoneNumberFilter(InvalidPhoneNumberFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.invalidPhoneNumberFilterWithOptions(request, runtime);
    }

    /**
     * @param request PhoneNumberConvertServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PhoneNumberConvertServiceResponse
     */
    public PhoneNumberConvertServiceResponse phoneNumberConvertServiceWithOptions(PhoneNumberConvertServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PhoneNumberConvertService"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PhoneNumberConvertServiceResponse());
    }

    /**
     * @param request PhoneNumberConvertServiceRequest
     * @return PhoneNumberConvertServiceResponse
     */
    public PhoneNumberConvertServiceResponse phoneNumberConvertService(PhoneNumberConvertServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.phoneNumberConvertServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Encrypts the original phone number into a virtual number that starts with 140. Cell Phone Number Service integrates the communications services provided by Alibaba Cloud. This allows you to initiate a call by using a virtual number that starts with 140.</p>
     * 
     * @param request PhoneNumberEncryptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PhoneNumberEncryptResponse
     */
    public PhoneNumberEncryptResponse phoneNumberEncryptWithOptions(PhoneNumberEncryptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PhoneNumberEncrypt"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PhoneNumberEncryptResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Encrypts the original phone number into a virtual number that starts with 140. Cell Phone Number Service integrates the communications services provided by Alibaba Cloud. This allows you to initiate a call by using a virtual number that starts with 140.</p>
     * 
     * @param request PhoneNumberEncryptRequest
     * @return PhoneNumberEncryptResponse
     */
    public PhoneNumberEncryptResponse phoneNumberEncrypt(PhoneNumberEncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.phoneNumberEncryptWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time service state of a phone number. The state includes NORMAL, SHUTDOWN, and NOT_EXIST. You can choose an encryption method for your phone number query, including plaintext, MD5, and SHA256.</p>
     * 
     * @param request PhoneNumberStatusForAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PhoneNumberStatusForAccountResponse
     */
    public PhoneNumberStatusForAccountResponse phoneNumberStatusForAccountWithOptions(PhoneNumberStatusForAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PhoneNumberStatusForAccount"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PhoneNumberStatusForAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time service state of a phone number. The state includes NORMAL, SHUTDOWN, and NOT_EXIST. You can choose an encryption method for your phone number query, including plaintext, MD5, and SHA256.</p>
     * 
     * @param request PhoneNumberStatusForAccountRequest
     * @return PhoneNumberStatusForAccountResponse
     */
    public PhoneNumberStatusForAccountResponse phoneNumberStatusForAccount(PhoneNumberStatusForAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.phoneNumberStatusForAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time service state of a phone number. The state includes NORMAL, SHUTDOWN, and NOT_EXIST. You can choose an encryption method for your phone number query, including plaintext, MD5, and SHA256.</p>
     * 
     * @param request PhoneNumberStatusForPublicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PhoneNumberStatusForPublicResponse
     */
    public PhoneNumberStatusForPublicResponse phoneNumberStatusForPublicWithOptions(PhoneNumberStatusForPublicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PhoneNumberStatusForPublic"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PhoneNumberStatusForPublicResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time service state of a phone number. The state includes NORMAL, SHUTDOWN, and NOT_EXIST. You can choose an encryption method for your phone number query, including plaintext, MD5, and SHA256.</p>
     * 
     * @param request PhoneNumberStatusForPublicRequest
     * @return PhoneNumberStatusForPublicResponse
     */
    public PhoneNumberStatusForPublicResponse phoneNumberStatusForPublic(PhoneNumberStatusForPublicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.phoneNumberStatusForPublicWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time service state of a phone number. The state includes NORMAL, SHUTDOWN, and NOT_EXIST. You can choose an encryption method for your phone number query, including plaintext, MD5, and SHA256.</p>
     * 
     * @param request PhoneNumberStatusForRealRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PhoneNumberStatusForRealResponse
     */
    public PhoneNumberStatusForRealResponse phoneNumberStatusForRealWithOptions(PhoneNumberStatusForRealRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PhoneNumberStatusForReal"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PhoneNumberStatusForRealResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time service state of a phone number. The state includes NORMAL, SHUTDOWN, and NOT_EXIST. You can choose an encryption method for your phone number query, including plaintext, MD5, and SHA256.</p>
     * 
     * @param request PhoneNumberStatusForRealRequest
     * @return PhoneNumberStatusForRealResponse
     */
    public PhoneNumberStatusForRealResponse phoneNumberStatusForReal(PhoneNumberStatusForRealRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.phoneNumberStatusForRealWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time service state of a phone number. The state includes NORMAL, SHUTDOWN, and NOT_EXIST. You can choose an encryption method for your phone number query, including plaintext, MD5, and SHA256.</p>
     * 
     * @param request PhoneNumberStatusForSmsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PhoneNumberStatusForSmsResponse
     */
    public PhoneNumberStatusForSmsResponse phoneNumberStatusForSmsWithOptions(PhoneNumberStatusForSmsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PhoneNumberStatusForSms"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PhoneNumberStatusForSmsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time service state of a phone number. The state includes NORMAL, SHUTDOWN, and NOT_EXIST. You can choose an encryption method for your phone number query, including plaintext, MD5, and SHA256.</p>
     * 
     * @param request PhoneNumberStatusForSmsRequest
     * @return PhoneNumberStatusForSmsResponse
     */
    public PhoneNumberStatusForSmsResponse phoneNumberStatusForSms(PhoneNumberStatusForSmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.phoneNumberStatusForSmsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>You are charged only if the value of Code is OK and the value of IsPrivacyNumber is true or false.</li>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a virtual phone number. You can choose an encryption method for your phone number query, including plaintext, MD5, and SHA256.</p>
     * 
     * @param request PhoneNumberStatusForVirtualRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PhoneNumberStatusForVirtualResponse
     */
    public PhoneNumberStatusForVirtualResponse phoneNumberStatusForVirtualWithOptions(PhoneNumberStatusForVirtualRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PhoneNumberStatusForVirtual"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PhoneNumberStatusForVirtualResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>You are charged only if the value of Code is OK and the value of IsPrivacyNumber is true or false.</li>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a virtual phone number. You can choose an encryption method for your phone number query, including plaintext, MD5, and SHA256.</p>
     * 
     * @param request PhoneNumberStatusForVirtualRequest
     * @return PhoneNumberStatusForVirtualResponse
     */
    public PhoneNumberStatusForVirtualResponse phoneNumberStatusForVirtual(PhoneNumberStatusForVirtualRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.phoneNumberStatusForVirtualWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time service state of a phone number. The state includes NORMAL, SHUTDOWN, and NOT_EXIST. You can choose an encryption method for your phone number query, including plaintext, MD5, and SHA256.</p>
     * 
     * @param request PhoneNumberStatusForVoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PhoneNumberStatusForVoiceResponse
     */
    public PhoneNumberStatusForVoiceResponse phoneNumberStatusForVoiceWithOptions(PhoneNumberStatusForVoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PhoneNumberStatusForVoice"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PhoneNumberStatusForVoiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time service state of a phone number. The state includes NORMAL, SHUTDOWN, and NOT_EXIST. You can choose an encryption method for your phone number query, including plaintext, MD5, and SHA256.</p>
     * 
     * @param request PhoneNumberStatusForVoiceRequest
     * @return PhoneNumberStatusForVoiceResponse
     */
    public PhoneNumberStatusForVoiceResponse phoneNumberStatusForVoice(PhoneNumberStatusForVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.phoneNumberStatusForVoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available authorization codes.</p>
     * 
     * @param request QueryAvailableAuthCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAvailableAuthCodeResponse
     */
    public QueryAvailableAuthCodeResponse queryAvailableAuthCodeWithOptions(QueryAvailableAuthCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAvailableAuthCode"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAvailableAuthCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available authorization codes.</p>
     * 
     * @param request QueryAvailableAuthCodeRequest
     * @return QueryAvailableAuthCodeResponse
     */
    public QueryAvailableAuthCodeResponse queryAvailableAuthCode(QueryAvailableAuthCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAvailableAuthCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>在网时长专用接口</p>
     * 
     * @param request QueryPhoneNumberOnlineTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPhoneNumberOnlineTimeResponse
     */
    public QueryPhoneNumberOnlineTimeResponse queryPhoneNumberOnlineTimeWithOptions(QueryPhoneNumberOnlineTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPhoneNumberOnlineTime"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPhoneNumberOnlineTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>在网时长专用接口</p>
     * 
     * @param request QueryPhoneNumberOnlineTimeRequest
     * @return QueryPhoneNumberOnlineTimeResponse
     */
    public QueryPhoneNumberOnlineTimeResponse queryPhoneNumberOnlineTime(QueryPhoneNumberOnlineTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPhoneNumberOnlineTimeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>二次号携号转网号码查询</p>
     * 
     * @param request QueryPhoneTwiceTelVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPhoneTwiceTelVerifyResponse
     */
    public QueryPhoneTwiceTelVerifyResponse queryPhoneTwiceTelVerifyWithOptions(QueryPhoneTwiceTelVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPhoneTwiceTelVerify"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPhoneTwiceTelVerifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>二次号携号转网号码查询</p>
     * 
     * @param request QueryPhoneTwiceTelVerifyRequest
     * @return QueryPhoneTwiceTelVerifyResponse
     */
    public QueryPhoneTwiceTelVerifyResponse queryPhoneTwiceTelVerify(QueryPhoneTwiceTelVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPhoneTwiceTelVerifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tag application rules.</p>
     * 
     * @param request QueryTagApplyRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTagApplyRuleResponse
     */
    public QueryTagApplyRuleResponse queryTagApplyRuleWithOptions(QueryTagApplyRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTagApplyRule"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTagApplyRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tag application rules.</p>
     * 
     * @param request QueryTagApplyRuleRequest
     * @return QueryTagApplyRuleResponse
     */
    public QueryTagApplyRuleResponse queryTagApplyRule(QueryTagApplyRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTagApplyRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about tags.</p>
     * 
     * @param request QueryTagInfoBySelectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTagInfoBySelectionResponse
     */
    public QueryTagInfoBySelectionResponse queryTagInfoBySelectionWithOptions(QueryTagInfoBySelectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.industryId)) {
            query.put("IndustryId", request.industryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTagInfoBySelection"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTagInfoBySelectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about tags.</p>
     * 
     * @param request QueryTagInfoBySelectionRequest
     * @return QueryTagInfoBySelectionResponse
     */
    public QueryTagInfoBySelectionResponse queryTagInfoBySelection(QueryTagInfoBySelectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTagInfoBySelectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tags by page.</p>
     * 
     * @param request QueryTagListPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTagListPageResponse
     */
    public QueryTagListPageResponse queryTagListPageWithOptions(QueryTagListPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTagListPage"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTagListPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tags by page.</p>
     * 
     * @param request QueryTagListPageRequest
     * @return QueryTagListPageResponse
     */
    public QueryTagListPageResponse queryTagListPage(QueryTagListPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTagListPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the usage statistics based on tag IDs.</p>
     * 
     * @param request QueryUsageStatisticsByTagIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUsageStatisticsByTagIdResponse
     */
    public QueryUsageStatisticsByTagIdResponse queryUsageStatisticsByTagIdWithOptions(QueryUsageStatisticsByTagIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUsageStatisticsByTagId"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUsageStatisticsByTagIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the usage statistics based on tag IDs.</p>
     * 
     * @param request QueryUsageStatisticsByTagIdRequest
     * @return QueryUsageStatisticsByTagIdResponse
     */
    public QueryUsageStatisticsByTagIdResponse queryUsageStatisticsByTagId(QueryUsageStatisticsByTagIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUsageStatisticsByTagIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * <li>You are charged only if the value of Code is OK and the value of IsConsistent is not 2.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether the name, phone number, and ID card number entered by a user belong to the same user.</p>
     * 
     * @param request ThreeElementsVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ThreeElementsVerificationResponse
     */
    public ThreeElementsVerificationResponse threeElementsVerificationWithOptions(ThreeElementsVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certCode)) {
            query.put("CertCode", request.certCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ThreeElementsVerification"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ThreeElementsVerificationResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * <li>You are charged only if the value of Code is OK and the value of IsConsistent is not 2.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether the name, phone number, and ID card number entered by a user belong to the same user.</p>
     * 
     * @param request ThreeElementsVerificationRequest
     * @return ThreeElementsVerificationResponse
     */
    public ThreeElementsVerificationResponse threeElementsVerification(ThreeElementsVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.threeElementsVerificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * <li>You are charged only if the value of Code is OK and the value of IsConsistent is not 2.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether the name and phone number entered by a user belong to the same user.</p>
     * 
     * @param request TwoElementsVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TwoElementsVerificationResponse
     */
    public TwoElementsVerificationResponse twoElementsVerificationWithOptions(TwoElementsVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TwoElementsVerification"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TwoElementsVerificationResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * <li>You are charged only if the value of Code is OK and the value of IsConsistent is not 2.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether the name and phone number entered by a user belong to the same user.</p>
     * 
     * @param request TwoElementsVerificationRequest
     * @return TwoElementsVerificationResponse
     */
    public TwoElementsVerificationResponse twoElementsVerification(TwoElementsVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.twoElementsVerificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>UAID采集</p>
     * 
     * @param request UAIDCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UAIDCollectionResponse
     */
    public UAIDCollectionResponse uAIDCollectionWithOptions(UAIDCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.carrier)) {
            query.put("Carrier", request.carrier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGrantId)) {
            query.put("UserGrantId", request.userGrantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UAIDCollection"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UAIDCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>UAID采集</p>
     * 
     * @param request UAIDCollectionRequest
     * @return UAIDCollectionResponse
     */
    public UAIDCollectionResponse uAIDCollection(UAIDCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uAIDCollectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>uaid号码转换服务</p>
     * 
     * @param request UAIDConversionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UAIDConversionResponse
     */
    public UAIDConversionResponse uAIDConversionWithOptions(UAIDConversionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.carrier)) {
            query.put("Carrier", request.carrier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uaidList)) {
            query.put("UaidList", request.uaidList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UAIDConversion"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UAIDConversionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>uaid号码转换服务</p>
     * 
     * @param request UAIDConversionRequest
     * @return UAIDConversionResponse
     */
    public UAIDConversionResponse uAIDConversion(UAIDConversionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uAIDConversionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取UAID</p>
     * 
     * @param request UAIDVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UAIDVerificationResponse
     */
    public UAIDVerificationResponse uAIDVerificationWithOptions(UAIDVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.carrier)) {
            query.put("Carrier", request.carrier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGrantId)) {
            query.put("UserGrantId", request.userGrantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UAIDVerification"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UAIDVerificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取UAID</p>
     * 
     * @param request UAIDVerificationRequest
     * @return UAIDVerificationResponse
     */
    public UAIDVerificationResponse uAIDVerification(UAIDVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uAIDVerificationWithOptions(request, runtime);
    }
}
