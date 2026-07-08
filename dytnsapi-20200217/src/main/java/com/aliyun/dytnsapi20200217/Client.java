// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217;

import com.aliyun.tea.*;
import com.aliyun.dytnsapi20200217.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("us-west-1", "dytnsapi.aliyuncs.com"),
            new TeaPair("us-east-1", "dytnsapi.aliyuncs.com"),
            new TeaPair("me-east-1", "dytnsapi.aliyuncs.com"),
            new TeaPair("eu-west-1", "dytnsapi.aliyuncs.com"),
            new TeaPair("eu-central-1", "dytnsapi.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dytnsapi.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "dytnsapi.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dytnsapi.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dytnsapi.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dytnsapi.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dytnsapi.aliyuncs.com"),
            new TeaPair("cn-qingdao", "dytnsapi.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dytnsapi.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dytnsapi.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dytnsapi.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dytnsapi.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dytnsapi.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "dytnsapi.aliyuncs.com"),
            new TeaPair("cn-beijing", "dytnsapi.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dytnsapi.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dytnsapi.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dytnsapi.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "dytnsapi.aliyuncs.com")
        );
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
     * <b>description</b> :
     * <ul>
     * <li>Before using this API, log on to the Cell Phone Number Service console, go to the Tag Square page, find the corresponding tag, click Apply to Activate, fill in the application materials, and use the tag after the application is approved.</li>
     * <li>Before using this API, make sure that you have fully understood the <a href="https://help.aliyun.com/document_detail/154751.html">Cell Phone Number Service pricing</a>.</li>
     * <li>Billing applies only when the API return value is Code=&quot;OK&quot;. Other return results are not billed.</li>
     * <li>For the verifiable scope, see <a href="https://help.aliyun.com/document_detail/2844379.html">ID Card Three Elements Verification</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>The per-user QPS limit for this API is 200 calls per second. If you exceed the limit, API calls are throttled, which may affect your business. Call the API reasonably.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Three-element (name, ID card number, and ID card photo) verification. Used to compare whether the three pieces of information (the name and ID card number filled in by the user and the uploaded portrait photo) belong to the same user.</p>
     * 
     * @param request CertNoThreeElementVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CertNoThreeElementVerificationResponse
     */
    public CertNoThreeElementVerificationResponse certNoThreeElementVerificationWithOptions(CertNoThreeElementVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.certPicture)) {
            query.put("CertPicture", request.certPicture);
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
            new TeaPair("action", "CertNoThreeElementVerification"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CertNoThreeElementVerificationResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before using this API, log on to the Cell Phone Number Service console, go to the Tag Square page, find the corresponding tag, click Apply to Activate, fill in the application materials, and use the tag after the application is approved.</li>
     * <li>Before using this API, make sure that you have fully understood the <a href="https://help.aliyun.com/document_detail/154751.html">Cell Phone Number Service pricing</a>.</li>
     * <li>Billing applies only when the API return value is Code=&quot;OK&quot;. Other return results are not billed.</li>
     * <li>For the verifiable scope, see <a href="https://help.aliyun.com/document_detail/2844379.html">ID Card Three Elements Verification</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>The per-user QPS limit for this API is 200 calls per second. If you exceed the limit, API calls are throttled, which may affect your business. Call the API reasonably.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Three-element (name, ID card number, and ID card photo) verification. Used to compare whether the three pieces of information (the name and ID card number filled in by the user and the uploaded portrait photo) belong to the same user.</p>
     * 
     * @param request CertNoThreeElementVerificationRequest
     * @return CertNoThreeElementVerificationResponse
     */
    public CertNoThreeElementVerificationResponse certNoThreeElementVerification(CertNoThreeElementVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.certNoThreeElementVerificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before using this operation, make sure that you have fully understood the pricing of Cell Phone Number Service.</li>
     * <li>Before using this operation, log on to the Cell Phone Number Service console. On the Tag Marketplace page, find the desired tag, click Apply to Activate, and fill in the application information. You can use the operation only after your application is approved.</li>
     * <li>The operation is charged when the response contains Code=&quot;OK&quot; and IsConsistent != 2. Other response results are not charged.</li>
     * </ul>
     * <h2>QPS Limit</h2>
     * <p>The per-user QPS limit of this operation is 200 calls per second. If the limit is exceeded, the API calls are throttled, which may affect your business. Call the operation properly.</p>
     * 
     * <b>summary</b> : 
     * <p>Two-element (name and ID card number) verification. Used to verify whether the name and ID card number entered by a user belong to the same person.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before using this operation, make sure that you have fully understood the pricing of Cell Phone Number Service.</li>
     * <li>Before using this operation, log on to the Cell Phone Number Service console. On the Tag Marketplace page, find the desired tag, click Apply to Activate, and fill in the application information. You can use the operation only after your application is approved.</li>
     * <li>The operation is charged when the response contains Code=&quot;OK&quot; and IsConsistent != 2. Other response results are not charged.</li>
     * </ul>
     * <h2>QPS Limit</h2>
     * <p>The per-user QPS limit of this operation is 200 calls per second. If the limit is exceeded, the API calls are throttled, which may affect your business. Call the operation properly.</p>
     * 
     * <b>summary</b> : 
     * <p>Two-element (name and ID card number) verification. Used to verify whether the name and ID card number entered by a user belong to the same person.</p>
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
     * <ul>
     * <li>Before you use this API, make sure that you fully understand the billing method and prices of the Enterprise Four-Element Verification product. For billing details, see <a href="https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4">Product Billing</a>.</li>
     * <li>Billing applies when VerifyResult returns true/false and ReasonCode is 0, 1, or 2 in the response. Billing does not apply in other cases.</li>
     * <li>Before you use this API, log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC&lang=zh">Cell Phone Number Service console</a>, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the corresponding tag, click <strong>Apply to Activate</strong>, and submit your application. You can use the API after the application is approved.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this API is 200 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the enterprise name, enterprise certificate number, enterprise legal person name, and enterprise legal person ID card number. All four items must be consistent and the enterprise\&quot;s operating status must be active for verification to pass.</p>
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
     * <ul>
     * <li>Before you use this API, make sure that you fully understand the billing method and prices of the Enterprise Four-Element Verification product. For billing details, see <a href="https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4">Product Billing</a>.</li>
     * <li>Billing applies when VerifyResult returns true/false and ReasonCode is 0, 1, or 2 in the response. Billing does not apply in other cases.</li>
     * <li>Before you use this API, log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC&lang=zh">Cell Phone Number Service console</a>, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the corresponding tag, click <strong>Apply to Activate</strong>, and submit your application. You can use the API after the application is approved.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this API is 200 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the enterprise name, enterprise certificate number, enterprise legal person name, and enterprise legal person ID card number. All four items must be consistent and the enterprise\&quot;s operating status must be active for verification to pass.</p>
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
     * <ul>
     * <li>Before you use this API, make sure that you have fully understood the billing method and pricing of the Three-Element Company Verification product. For billing details, see <a href="https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4">Billing</a>.</li>
     * <li>In the returned result, charges apply when VerifyResult is true/false and ReasonCode is 0/1/2. No charges apply in other cases.</li>
     * <li>Before you use this API, log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC&lang=zh">Cell Phone Number Service console</a>, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Plaza</a> page, find the corresponding tag, click <strong>Apply for Activation</strong>, and submit the application materials. You can use the API after the application is approved.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this API is 200 calls per second. Requests that exceed this limit are throttled, which may affect your business. Call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Used to verify a company name, company certificate number, and the name of the company\&quot;s legal representative. Verification passes only when all three are consistent and the company\&quot;s operating status is in business.</p>
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
     * <ul>
     * <li>Before you use this API, make sure that you have fully understood the billing method and pricing of the Three-Element Company Verification product. For billing details, see <a href="https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4">Billing</a>.</li>
     * <li>In the returned result, charges apply when VerifyResult is true/false and ReasonCode is 0/1/2. No charges apply in other cases.</li>
     * <li>Before you use this API, log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC&lang=zh">Cell Phone Number Service console</a>, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Plaza</a> page, find the corresponding tag, click <strong>Apply for Activation</strong>, and submit the application materials. You can use the API after the application is approved.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this API is 200 calls per second. Requests that exceed this limit are throttled, which may affect your business. Call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Used to verify a company name, company certificate number, and the name of the company\&quot;s legal representative. Verification passes only when all three are consistent and the company\&quot;s operating status is in business.</p>
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
     * <ul>
     * <li>Before you use this API, make sure that you fully understand the billing methods and pricing of the Enterprise Two-Element Verification product. For billing details, see <a href="https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4">Product billing</a>.</li>
     * <li>Billing applies when Code=OK and ReasonCode=0/1/3 in the returned result. Other cases are not billed.</li>
     * <li>Before you use this API, log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC&lang=zh">Cell Phone Number Service console</a>, find the corresponding tag on the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Plaza</a> page, click <strong>Apply to Activate</strong>, and fill in the application materials. After the application is approved, you can use the API.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this API is 200 times/second. If the limit is exceeded, API calls will be throttled, which may affect your business. Please call the API reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>Used to verify the enterprise name and enterprise certificate number. The name and certificate must be fully consistent, and the enterprise must be in operating status for the verification to pass.</p>
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
     * <ul>
     * <li>Before you use this API, make sure that you fully understand the billing methods and pricing of the Enterprise Two-Element Verification product. For billing details, see <a href="https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4">Product billing</a>.</li>
     * <li>Billing applies when Code=OK and ReasonCode=0/1/3 in the returned result. Other cases are not billed.</li>
     * <li>Before you use this API, log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC&lang=zh">Cell Phone Number Service console</a>, find the corresponding tag on the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Plaza</a> page, click <strong>Apply to Activate</strong>, and fill in the application materials. After the application is approved, you can use the API.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this API is 200 times/second. If the limit is exceeded, API calls will be throttled, which may affect your business. Please call the API reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>Used to verify the enterprise name and enterprise certificate number. The name and certificate must be fully consistent, and the enterprise must be in operating status for the verification to pass.</p>
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
     * <ul>
     * <li>Make sure you have activated Phone Number Identity Service before calling this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a contact.</p>
     * 
     * @param request DeleteContactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContactsResponse
     */
    public DeleteContactsResponse deleteContactsWithOptions(DeleteContactsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
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
            new TeaPair("action", "DeleteContacts"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContactsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Make sure you have activated Phone Number Identity Service before calling this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a contact.</p>
     * 
     * @param request DeleteContactsRequest
     * @return DeleteContactsResponse
     */
    public DeleteContactsResponse deleteContacts(DeleteContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>本接口用于验证号码是否为空号。发起调用该接口验证号码请求时，系统会根据验证次数计费，标准价为0.01元/次。<strong>请确保在使用该接口前，已充分了解本产品的收费方式和价格。</strong></li>
     * <li>当返回结果中：Code=&quot;OK&quot; 且 Status != UNKNOWN 时计费，其他情况不计费。 </li>
     * <li>由于本产品通过AI算法预测手机号的空号概率，所以无法做到100%准确。当前评估的准确率和召回率约为95%左右。<strong>调用时请注意差别</strong>。</li>
     * <li>使用本接口前，请登录号码百科控制台，在<a href="https://dytns.console.aliyun.com/analysis/square">标签广场</a>页面，找到对应的标签，单击<strong>申请开通</strong>，填写申请资料，审批通过后即可使用。</li>
     * </ul>
     * <h3>QPS限制</h3>
     * <p>本接口的单用户QPS限制为100次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。</p>
     * <h3>授权信息</h3>
     * <p>默认仅限阿里云账号使用本接口，RAM用户只有在被授予了相关API操作权限后方可使用。具体请参见<a href="https://help.aliyun.com/document_detail/154006.html">为RAM用户授权</a>。</p>
     * 
     * <b>summary</b> : 
     * <p>Predicts whether a phone number is invalid by using AI algorithms.</p>
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
     * <ul>
     * <li>本接口用于验证号码是否为空号。发起调用该接口验证号码请求时，系统会根据验证次数计费，标准价为0.01元/次。<strong>请确保在使用该接口前，已充分了解本产品的收费方式和价格。</strong></li>
     * <li>当返回结果中：Code=&quot;OK&quot; 且 Status != UNKNOWN 时计费，其他情况不计费。 </li>
     * <li>由于本产品通过AI算法预测手机号的空号概率，所以无法做到100%准确。当前评估的准确率和召回率约为95%左右。<strong>调用时请注意差别</strong>。</li>
     * <li>使用本接口前，请登录号码百科控制台，在<a href="https://dytns.console.aliyun.com/analysis/square">标签广场</a>页面，找到对应的标签，单击<strong>申请开通</strong>，填写申请资料，审批通过后即可使用。</li>
     * </ul>
     * <h3>QPS限制</h3>
     * <p>本接口的单用户QPS限制为100次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。</p>
     * <h3>授权信息</h3>
     * <p>默认仅限阿里云账号使用本接口，RAM用户只有在被授予了相关API操作权限后方可使用。具体请参见<a href="https://help.aliyun.com/document_detail/154006.html">为RAM用户授权</a>。</p>
     * 
     * <b>summary</b> : 
     * <p>Predicts whether a phone number is invalid by using AI algorithms.</p>
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
     * <p>号码归属地查询v2</p>
     * 
     * @param request DescribeMobileOperatorAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMobileOperatorAttributeResponse
     */
    public DescribeMobileOperatorAttributeResponse describeMobileOperatorAttributeWithOptions(DescribeMobileOperatorAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeMobileOperatorAttribute"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMobileOperatorAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>号码归属地查询v2</p>
     * 
     * @param request DescribeMobileOperatorAttributeRequest
     * @return DescribeMobileOperatorAttributeResponse
     */
    public DescribeMobileOperatorAttributeResponse describeMobileOperatorAttribute(DescribeMobileOperatorAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMobileOperatorAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you use this API, log on to the Phone Number Service console, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Plaza</a> page, find the corresponding tag, click <strong>Apply to Activate</strong>, fill in the application materials, and then use the API after the application is approved.</li>
     * <li>Before you use this API, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/154008.html">billing</a> of Phone Number Service.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit of this API is 1,000 calls per second per user. If the limit is exceeded, API calls are throttled, which may affect your business. Make calls properly.</p>
     * <h3>Authorization information</h3>
     * <p>By default, only Alibaba Cloud accounts can use this API. RAM users can use this API only after they are granted the related API operation permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Authorize a RAM user</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the result returned by phone number analysis.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before you use this API, log on to the Phone Number Service console, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Plaza</a> page, find the corresponding tag, click <strong>Apply to Activate</strong>, fill in the application materials, and then use the API after the application is approved.</li>
     * <li>Before you use this API, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/154008.html">billing</a> of Phone Number Service.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit of this API is 1,000 calls per second per user. If the limit is exceeded, API calls are throttled, which may affect your business. Make calls properly.</p>
     * <h3>Authorization information</h3>
     * <p>By default, only Alibaba Cloud accounts can use this API. RAM users can use this API only after they are granted the related API operation permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Authorize a RAM user</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the result returned by phone number analysis.</p>
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
     * <p>Before using this operation, log on to the Cell Phone Number Service console, go to the Tag Square page, find the corresponding tag, click Apply to activate, and fill in the application materials. You can use the operation after the application is approved.
     * Make sure that you fully understand the billing of the Cell Phone Number Service before you use this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Get the phone number analysis result.</p>
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
     * <p>Before using this operation, log on to the Cell Phone Number Service console, go to the Tag Square page, find the corresponding tag, click Apply to activate, and fill in the application materials. You can use the operation after the application is approved.
     * Make sure that you fully understand the billing of the Cell Phone Number Service before you use this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Get the phone number analysis result.</p>
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
     * <p>号码分析服务pai供应商批量查询接口</p>
     * 
     * @param request DescribePhoneNumberAnalysisPaiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePhoneNumberAnalysisPaiResponse
     */
    public DescribePhoneNumberAnalysisPaiResponse describePhoneNumberAnalysisPaiWithOptions(DescribePhoneNumberAnalysisPaiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribePhoneNumberAnalysisPai"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePhoneNumberAnalysisPaiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>号码分析服务pai供应商批量查询接口</p>
     * 
     * @param request DescribePhoneNumberAnalysisPaiRequest
     * @return DescribePhoneNumberAnalysisPaiResponse
     */
    public DescribePhoneNumberAnalysisPaiResponse describePhoneNumberAnalysisPai(DescribePhoneNumberAnalysisPaiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePhoneNumberAnalysisPaiWithOptions(request, runtime);
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
     * <ul>
     * <li>Before using this API, log on to the Cell Phone Number Service console, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the corresponding tag, click <strong>Apply for Activation</strong>, fill in the application materials, and use the API after the application is approved.</li>
     * <li>Make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/154751.html">product pricing</a> of Cell Phone Number Service before using this API.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this API is 200 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the duration for which a mobile user has been registered on the carrier\&quot;s network.</p>
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
     * <ul>
     * <li>Before using this API, log on to the Cell Phone Number Service console, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the corresponding tag, click <strong>Apply for Activation</strong>, fill in the application materials, and use the API after the application is approved.</li>
     * <li>Make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/154751.html">product pricing</a> of Cell Phone Number Service before using this API.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this API is 200 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the duration for which a mobile user has been registered on the carrier\&quot;s network.</p>
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
     * <ul>
     * <li>Before you use this API, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154008.html">billing</a> of Cell Phone Number Service.</li>
     * <li>By default, only Alibaba Cloud accounts can use this API. RAM users can use this API only after they are granted the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to a RAM user</a>.</li>
     * <li>This API is used to obtain the current carrier, location, and number portability information of a phone number. The API supports queries for <strong>plaintext</strong>, <strong>MD5</strong>, and <strong>SHA256</strong> encrypted phone numbers.</li>
     * <li>Before you use this API, log on to the Cell Phone Number Service console, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the corresponding tag, click <strong>Apply for Activation</strong>, and submit the application materials. You can use the API after your application is approved.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user for this API is 2,000 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make calls reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the carrier information of a phone number, including the province, city, basic carrier (China Mobile, China Unicom, China Telecom, or China Broadnet), mobile virtual network operator (such as Alibaba Cloud Communication), whether the number has been ported, and the number segment.</p>
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
     * <ul>
     * <li>Before you use this API, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154008.html">billing</a> of Cell Phone Number Service.</li>
     * <li>By default, only Alibaba Cloud accounts can use this API. RAM users can use this API only after they are granted the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to a RAM user</a>.</li>
     * <li>This API is used to obtain the current carrier, location, and number portability information of a phone number. The API supports queries for <strong>plaintext</strong>, <strong>MD5</strong>, and <strong>SHA256</strong> encrypted phone numbers.</li>
     * <li>Before you use this API, log on to the Cell Phone Number Service console, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the corresponding tag, click <strong>Apply for Activation</strong>, and submit the application materials. You can use the API after your application is approved.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user for this API is 2,000 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make calls reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the carrier information of a phone number, including the province, city, basic carrier (China Mobile, China Unicom, China Telecom, or China Broadnet), mobile virtual network operator (such as Alibaba Cloud Communication), whether the number has been ported, and the number segment.</p>
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
     * <p>号码归属服务(包年包月客户专用)</p>
     * 
     * @param request DescribePhoneNumberOperatorAttributeAnnualRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePhoneNumberOperatorAttributeAnnualResponse
     */
    public DescribePhoneNumberOperatorAttributeAnnualResponse describePhoneNumberOperatorAttributeAnnualWithOptions(DescribePhoneNumberOperatorAttributeAnnualRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePhoneNumberOperatorAttributeAnnual"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePhoneNumberOperatorAttributeAnnualResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>号码归属服务(包年包月客户专用)</p>
     * 
     * @param request DescribePhoneNumberOperatorAttributeAnnualRequest
     * @return DescribePhoneNumberOperatorAttributeAnnualResponse
     */
    public DescribePhoneNumberOperatorAttributeAnnualResponse describePhoneNumberOperatorAttributeAnnual(DescribePhoneNumberOperatorAttributeAnnualRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePhoneNumberOperatorAttributeAnnualWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>号码归属服务(包年包月客户专用)</p>
     * 
     * @param request DescribePhoneNumberOperatorAttributeAnnualUseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePhoneNumberOperatorAttributeAnnualUseResponse
     */
    public DescribePhoneNumberOperatorAttributeAnnualUseResponse describePhoneNumberOperatorAttributeAnnualUseWithOptions(DescribePhoneNumberOperatorAttributeAnnualUseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePhoneNumberOperatorAttributeAnnualUse"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePhoneNumberOperatorAttributeAnnualUseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>号码归属服务(包年包月客户专用)</p>
     * 
     * @param request DescribePhoneNumberOperatorAttributeAnnualUseRequest
     * @return DescribePhoneNumberOperatorAttributeAnnualUseResponse
     */
    public DescribePhoneNumberOperatorAttributeAnnualUseResponse describePhoneNumberOperatorAttributeAnnualUse(DescribePhoneNumberOperatorAttributeAnnualUseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePhoneNumberOperatorAttributeAnnualUseWithOptions(request, runtime);
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
     * <ul>
     * <li>Before you use this API, make sure you understand the <a href="https://help.aliyun.com/document_detail/154751.html">pricing</a> for Phone Number Verification Service.</li>
     * <li>You are charged only when the API response returns <code>Code=&quot;OK&quot;</code> and <code>VerifyResult</code> is not <code>0</code>. No charge is incurred in any other case.</li>
     * <li>Before you use this API, log in to the Phone Number Verification Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the tag you need, click <strong>Request Activation</strong>, and complete the application form. You can use the API once your application is approved.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>The QPS limit is 100 per user. If you exceed this limit, the system throttles your API calls, which may affect your business. Plan your API calls accordingly.</p>
     * <h2>Authorization</h2>
     * <p>By default, only an Alibaba Cloud account can call this API. A RAM user must be granted the required permissions to call the API. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to a RAM user</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Quickly verify in a single request if a mobile phone number is a carrier\&quot;s secondary number assignment.</p>
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
     * <ul>
     * <li>Before you use this API, make sure you understand the <a href="https://help.aliyun.com/document_detail/154751.html">pricing</a> for Phone Number Verification Service.</li>
     * <li>You are charged only when the API response returns <code>Code=&quot;OK&quot;</code> and <code>VerifyResult</code> is not <code>0</code>. No charge is incurred in any other case.</li>
     * <li>Before you use this API, log in to the Phone Number Verification Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the tag you need, click <strong>Request Activation</strong>, and complete the application form. You can use the API once your application is approved.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>The QPS limit is 100 per user. If you exceed this limit, the system throttles your API calls, which may affect your business. Plan your API calls accordingly.</p>
     * <h2>Authorization</h2>
     * <p>By default, only an Alibaba Cloud account can call this API. A RAM user must be granted the required permissions to call the API. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to a RAM user</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Quickly verify in a single request if a mobile phone number is a carrier\&quot;s secondary number assignment.</p>
     * 
     * @param request DescribePhoneTwiceTelVerifyRequest
     * @return DescribePhoneTwiceTelVerifyResponse
     */
    public DescribePhoneTwiceTelVerifyResponse describePhoneTwiceTelVerify(DescribePhoneTwiceTelVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePhoneTwiceTelVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API provides only the <strong>signing function for obtaining an authorization token</strong> as part of the UAID retrieval process for China\&quot;s three major operators.</p>
     * <ul>
     * <li>To generate the other parameters required to obtain the authorization token, refer to the respective operator\&quot;s documentation.</li>
     * <li>To request the authorization token, refer to the respective operator\&quot;s documentation. Note that the request must be sent from the user\&quot;s mobile device over a cellular network.</li>
     * <li>After obtaining the authorization token, call the <a href="~~UAIDVerification~~">UAIDVerification</a> API to complete the UAID retrieval.</li>
     * </ul>
     * <h3>How to request an authorization token</h3>
     * <blockquote>
     * <p>Notice: 
     * When you request an authorization token, the client or H5 page must be connected to a cellular network.</p>
     * </blockquote>
     * <h4>China Mobile (CM)</h4>
     * <p>Protocol: HTTPS + application/json
     * Method: POST
     * URL: https\://msg.cmpassport.com/h5/getMobile</p>
     * <h5>Request parameters</h5>
     * <p>Request example:
     * <code>{ &quot;traceId&quot;: &quot;mfawsxtcmyplwzpayzzvdvbsowxmkynr&quot;, &quot;appId&quot;: &quot;300011580392&quot;, &quot;sign&quot;: &quot;2c61b3c58ffbeed97461e31be4fd931a&quot;, &quot;msgId&quot;: &quot;redbyxsdetddwaaffajcwwapspykftzx&quot;, &quot;expandParams&quot;: &quot;&quot;, &quot;businessType&quot;: &quot;3&quot;, &quot;version&quot;: &quot;1.0&quot;, &quot;timestamp&quot;: &quot;20201125101540980&quot; }</code>
     * Parameter description:</p>
     * <ul>
     * <li><code>version</code>: Use <code>1.0</code>.</li>
     * <li><code>timestamp</code>: The request timestamp, with millisecond precision. This value and its format must match the <code>Time</code> input parameter for this API.</li>
     * <li><code>appId</code>: Use <code>300011580392</code>.</li>
     * <li><code>businessType</code>: Use <code>3</code>.</li>
     * <li><code>traceId</code>: The trace ID. This value must match this API\&quot;s <code>OutId</code> input parameter.</li>
     * <li><code>sign</code>: Obtained by calling this API.</li>
     * <li><code>msgId</code>: A unique message identifier.</li>
     * </ul>
     * <h5>Response parameters</h5>
     * <p>Response example:
     * <code>{ &quot;header&quot;: { &quot;appId&quot;: &quot;300011580392&quot;, &quot;msgId&quot;: &quot;redbyxsdetddwaaffajcwwapspykftzx&quot;, &quot;timestamp&quot;: &quot;20201125101607932&quot; }, &quot;body&quot;: { &quot;resultCode&quot;: &quot;103000&quot;, &quot;expandParams&quot;: &quot;&quot;, &quot;resultDesc&quot;: &quot;成功&quot;, &quot;token&quot;: &quot;H5HTTPS4187AE9743AFCB14F8D99B9D65ED9E01&quot; } }</code>
     * Retrieve the <code>token</code> from the response <code>body</code>.</p>
     * <h4>China Unicom (CU)</h4>
     * <p>Obtain the token in two steps.</p>
     * <h5>Step 1: Obtain the authurl</h5>
     * <p>Send a request to the portal server to get the authentication server address (<code>authurl</code>).
     * Protocol: HTTPS + application/json
     * Method: GET
     * URL: https\://nisportal.10010.com:9001/api</p>
     * <h6>Request parameters</h6>
     * <p>Request examples:
     * JSON request: <code>?appid=1554778161153</code>
     * JSONP request: <code>?appid=1554778161153&amp;callback=callbackFunction</code>
     * Parameter description:</p>
     * <ul>
     * <li><code>appid</code>: Use 1554778161153.</li>
     * <li><code>callback</code>: The name of the JSONP callback function. This parameter is required only for JSONP requests.</li>
     * </ul>
     * <h6>Response parameters</h6>
     * <p>Response examples:
     * JSON response:
     * <code>{&quot;authurl&quot;: &quot;https://enrichgw.10010.com/d93222629f52ec79&quot;}</code>
     * JSONP response:
     * <code>callbackFunction({&quot;authurl&quot;:&quot;https://enrichgw.10010.com/d93222629f52ec79&quot;})</code>
     * Retrieve the <code>authurl</code> from the response.</p>
     * <h5>Step 2: Obtain the token</h5>
     * <p>Protocol: HTTPS + application/json
     * Method: GET
     * URL: The authurl from Step 1, with /api appended.
     * Request URL example: <code>https://enrichgw.10010.com/d93222629f52ec79/api</code></p>
     * <h6>Request parameters</h6>
     * <p>Request examples:
     * JSON request: <code>?appid=1554778161153</code>
     * JSONP request: <code>?appid=1554778161153&amp;callback=callbackFunction</code>
     * Parameter description:</p>
     * <ul>
     * <li><code>appid</code>: Use 1554778161153.</li>
     * <li><code>callback</code>: The name of the JSONP callback function. This parameter is required only for JSONP requests.</li>
     * </ul>
     * <h6>Response parameters</h6>
     * <p>Response examples:
     * JSON response:
     * <code>{ &quot;province&quot;: &quot;1&quot;, &quot;code&quot;: &quot;7nHS1nggx2WP613750206700RN6oiRN1&quot; }</code>
     * JSONP response:
     * <code>callbackFunction({&quot;province&quot;:&quot;1&quot;,&quot;code&quot;:&quot;7nHS3Dnkd1BS701851092400RN6oiRN1&quot;})</code>
     * Retrieve the <code>code</code> from the response.</p>
     * <h4>China Telecom (CT)</h4>
     * <p>Protocol: HTTPS + application/x-www-form-urlencoded;charset=UTF-8
     * Method: GET
     * URL: https\://id6.me/gw/preuniq.do</p>
     * <h5>Request parameters</h5>
     * <p>Request example:
     * <code>?clientType=30100&amp;appId=9390188202&amp;format=json&amp;sign=D63C166FA19E1996EF********09C6A5397C10B4&amp;paramKey=1D7C25EB8B0B8B4CB3CF8DC60628F6549********786B0AF1FEF93FA1335057A35BF5F0B39A3867EAA9BE14B3898********8B01DE34965060445B6E1F66401D714650E4AB161CD6DCF4A72********3B856F22A192B8B0C39D7A55B961062E68C89C928894F119B25********7C548355FE9DB82852EB93C939F2200B48CD17&amp;paramStr=140********95AF8E138B94754CB4CF83BA6FB********52B258BFDFD38BF233&amp;version=1.1</code>
     * Parameter description:</p>
     * <ul>
     * <li><code>appId</code>: Use <code>9390188202</code>.</li>
     * <li><code>clientType</code>: The client type. This value must match the <code>ClientType</code> input parameter for this API.</li>
     * <li><code>format</code>: Use <code>json</code> or <code>jsonp</code>.</li>
     * <li><code>version</code>: Use <code>1.1</code>.</li>
     * <li><code>sign</code>: Obtained by calling this API.</li>
     * <li><code>paramKey</code>: The ciphertext of key A. Key A is a 16-character random string generated by the client. To generate paramKey, encrypt key A using the RSA algorithm and the China Telecom public key. The padding mode is <code>RSA/ECB/PKCS1Padding</code>. Download the <a href="https://id.189.cn/source/files/API.pem">China Telecom RSA public key</a>.</li>
     * <li><code>paramStr</code>: The ciphertext of a parameter string. This string contains <code>timeStamp</code> (a Unix timestamp with millisecond precision, for example <code>1697791988302</code>, that corresponds to the value of the <code>Time</code> parameter of this API) and <code>callback</code> (the name of the JSONP callback function, required only when <code>format</code> is set to <code>jsonp</code>). To generate <code>paramStr</code>, encrypt the string using AES with key A. The padding mode is <code>AES/CBC/PKCS5Padding</code>, and the initialization vector is <code>0000000000000000</code>.</li>
     * </ul>
     * <h5>Response parameters</h5>
     * <p>Response example:
     * <code>callback?result=10000&amp;msg=success&amp;data=a35336711c70456cb883f4f224e9a259</code>
     * The <code>data</code> parameter contains the ciphertext of the business result. To get the result, decrypt the data value using key A, the <code>AES/CBC/PKCS5Padding</code> mode, and an initialization vector of <code>0000000000000000</code>.
     * Decrypted business result example:
     * <code>{&quot;accessCode&quot;: &quot;H5HTTPS4187AE9743AFCB14F8D99B9D65ED9E01&quot;}</code>
     * Retrieve the <code>accessCode</code> from the decrypted result.</p>
     * 
     * <b>summary</b> : 
     * <p>This API only provides the signing functionality for acquiring an authorization token during UAID retrieval from the three-network operators.</p>
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
     * <b>description</b> :
     * <p>This API provides only the <strong>signing function for obtaining an authorization token</strong> as part of the UAID retrieval process for China\&quot;s three major operators.</p>
     * <ul>
     * <li>To generate the other parameters required to obtain the authorization token, refer to the respective operator\&quot;s documentation.</li>
     * <li>To request the authorization token, refer to the respective operator\&quot;s documentation. Note that the request must be sent from the user\&quot;s mobile device over a cellular network.</li>
     * <li>After obtaining the authorization token, call the <a href="~~UAIDVerification~~">UAIDVerification</a> API to complete the UAID retrieval.</li>
     * </ul>
     * <h3>How to request an authorization token</h3>
     * <blockquote>
     * <p>Notice: 
     * When you request an authorization token, the client or H5 page must be connected to a cellular network.</p>
     * </blockquote>
     * <h4>China Mobile (CM)</h4>
     * <p>Protocol: HTTPS + application/json
     * Method: POST
     * URL: https\://msg.cmpassport.com/h5/getMobile</p>
     * <h5>Request parameters</h5>
     * <p>Request example:
     * <code>{ &quot;traceId&quot;: &quot;mfawsxtcmyplwzpayzzvdvbsowxmkynr&quot;, &quot;appId&quot;: &quot;300011580392&quot;, &quot;sign&quot;: &quot;2c61b3c58ffbeed97461e31be4fd931a&quot;, &quot;msgId&quot;: &quot;redbyxsdetddwaaffajcwwapspykftzx&quot;, &quot;expandParams&quot;: &quot;&quot;, &quot;businessType&quot;: &quot;3&quot;, &quot;version&quot;: &quot;1.0&quot;, &quot;timestamp&quot;: &quot;20201125101540980&quot; }</code>
     * Parameter description:</p>
     * <ul>
     * <li><code>version</code>: Use <code>1.0</code>.</li>
     * <li><code>timestamp</code>: The request timestamp, with millisecond precision. This value and its format must match the <code>Time</code> input parameter for this API.</li>
     * <li><code>appId</code>: Use <code>300011580392</code>.</li>
     * <li><code>businessType</code>: Use <code>3</code>.</li>
     * <li><code>traceId</code>: The trace ID. This value must match this API\&quot;s <code>OutId</code> input parameter.</li>
     * <li><code>sign</code>: Obtained by calling this API.</li>
     * <li><code>msgId</code>: A unique message identifier.</li>
     * </ul>
     * <h5>Response parameters</h5>
     * <p>Response example:
     * <code>{ &quot;header&quot;: { &quot;appId&quot;: &quot;300011580392&quot;, &quot;msgId&quot;: &quot;redbyxsdetddwaaffajcwwapspykftzx&quot;, &quot;timestamp&quot;: &quot;20201125101607932&quot; }, &quot;body&quot;: { &quot;resultCode&quot;: &quot;103000&quot;, &quot;expandParams&quot;: &quot;&quot;, &quot;resultDesc&quot;: &quot;成功&quot;, &quot;token&quot;: &quot;H5HTTPS4187AE9743AFCB14F8D99B9D65ED9E01&quot; } }</code>
     * Retrieve the <code>token</code> from the response <code>body</code>.</p>
     * <h4>China Unicom (CU)</h4>
     * <p>Obtain the token in two steps.</p>
     * <h5>Step 1: Obtain the authurl</h5>
     * <p>Send a request to the portal server to get the authentication server address (<code>authurl</code>).
     * Protocol: HTTPS + application/json
     * Method: GET
     * URL: https\://nisportal.10010.com:9001/api</p>
     * <h6>Request parameters</h6>
     * <p>Request examples:
     * JSON request: <code>?appid=1554778161153</code>
     * JSONP request: <code>?appid=1554778161153&amp;callback=callbackFunction</code>
     * Parameter description:</p>
     * <ul>
     * <li><code>appid</code>: Use 1554778161153.</li>
     * <li><code>callback</code>: The name of the JSONP callback function. This parameter is required only for JSONP requests.</li>
     * </ul>
     * <h6>Response parameters</h6>
     * <p>Response examples:
     * JSON response:
     * <code>{&quot;authurl&quot;: &quot;https://enrichgw.10010.com/d93222629f52ec79&quot;}</code>
     * JSONP response:
     * <code>callbackFunction({&quot;authurl&quot;:&quot;https://enrichgw.10010.com/d93222629f52ec79&quot;})</code>
     * Retrieve the <code>authurl</code> from the response.</p>
     * <h5>Step 2: Obtain the token</h5>
     * <p>Protocol: HTTPS + application/json
     * Method: GET
     * URL: The authurl from Step 1, with /api appended.
     * Request URL example: <code>https://enrichgw.10010.com/d93222629f52ec79/api</code></p>
     * <h6>Request parameters</h6>
     * <p>Request examples:
     * JSON request: <code>?appid=1554778161153</code>
     * JSONP request: <code>?appid=1554778161153&amp;callback=callbackFunction</code>
     * Parameter description:</p>
     * <ul>
     * <li><code>appid</code>: Use 1554778161153.</li>
     * <li><code>callback</code>: The name of the JSONP callback function. This parameter is required only for JSONP requests.</li>
     * </ul>
     * <h6>Response parameters</h6>
     * <p>Response examples:
     * JSON response:
     * <code>{ &quot;province&quot;: &quot;1&quot;, &quot;code&quot;: &quot;7nHS1nggx2WP613750206700RN6oiRN1&quot; }</code>
     * JSONP response:
     * <code>callbackFunction({&quot;province&quot;:&quot;1&quot;,&quot;code&quot;:&quot;7nHS3Dnkd1BS701851092400RN6oiRN1&quot;})</code>
     * Retrieve the <code>code</code> from the response.</p>
     * <h4>China Telecom (CT)</h4>
     * <p>Protocol: HTTPS + application/x-www-form-urlencoded;charset=UTF-8
     * Method: GET
     * URL: https\://id6.me/gw/preuniq.do</p>
     * <h5>Request parameters</h5>
     * <p>Request example:
     * <code>?clientType=30100&amp;appId=9390188202&amp;format=json&amp;sign=D63C166FA19E1996EF********09C6A5397C10B4&amp;paramKey=1D7C25EB8B0B8B4CB3CF8DC60628F6549********786B0AF1FEF93FA1335057A35BF5F0B39A3867EAA9BE14B3898********8B01DE34965060445B6E1F66401D714650E4AB161CD6DCF4A72********3B856F22A192B8B0C39D7A55B961062E68C89C928894F119B25********7C548355FE9DB82852EB93C939F2200B48CD17&amp;paramStr=140********95AF8E138B94754CB4CF83BA6FB********52B258BFDFD38BF233&amp;version=1.1</code>
     * Parameter description:</p>
     * <ul>
     * <li><code>appId</code>: Use <code>9390188202</code>.</li>
     * <li><code>clientType</code>: The client type. This value must match the <code>ClientType</code> input parameter for this API.</li>
     * <li><code>format</code>: Use <code>json</code> or <code>jsonp</code>.</li>
     * <li><code>version</code>: Use <code>1.1</code>.</li>
     * <li><code>sign</code>: Obtained by calling this API.</li>
     * <li><code>paramKey</code>: The ciphertext of key A. Key A is a 16-character random string generated by the client. To generate paramKey, encrypt key A using the RSA algorithm and the China Telecom public key. The padding mode is <code>RSA/ECB/PKCS1Padding</code>. Download the <a href="https://id.189.cn/source/files/API.pem">China Telecom RSA public key</a>.</li>
     * <li><code>paramStr</code>: The ciphertext of a parameter string. This string contains <code>timeStamp</code> (a Unix timestamp with millisecond precision, for example <code>1697791988302</code>, that corresponds to the value of the <code>Time</code> parameter of this API) and <code>callback</code> (the name of the JSONP callback function, required only when <code>format</code> is set to <code>jsonp</code>). To generate <code>paramStr</code>, encrypt the string using AES with key A. The padding mode is <code>AES/CBC/PKCS5Padding</code>, and the initialization vector is <code>0000000000000000</code>.</li>
     * </ul>
     * <h5>Response parameters</h5>
     * <p>Response example:
     * <code>callback?result=10000&amp;msg=success&amp;data=a35336711c70456cb883f4f224e9a259</code>
     * The <code>data</code> parameter contains the ciphertext of the business result. To get the result, decrypt the data value using key A, the <code>AES/CBC/PKCS5Padding</code> mode, and an initialization vector of <code>0000000000000000</code>.
     * Decrypted business result example:
     * <code>{&quot;accessCode&quot;: &quot;H5HTTPS4187AE9743AFCB14F8D99B9D65ED9E01&quot;}</code>
     * Retrieve the <code>accessCode</code> from the decrypted result.</p>
     * 
     * <b>summary</b> : 
     * <p>This API only provides the signing functionality for acquiring an authorization token during UAID retrieval from the three-network operators.</p>
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
     * <h2>Usage notes</h2>
     * <ul>
     * <li>Before you use this API, ensure you understand its <a href="https://help.aliyun.com/zh/cpns/product-overview/pricing-of-cpns">pricing</a>.</li>
     * <li>Before you use this API, log on to the Phone Number Intelligence console and apply for the required tag on the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Plaza</a> page.</li>
     * <li>You are charged for a call only when the response returns <code>Code=\\&quot;OK\\&quot;</code> and <code>IsConsistent != 0</code>. No charges are incurred for any other results.</li>
     * <li>Verification of China Broadcasting Network numbers (numbers with the 192 prefix) is not supported. If you provide a number with the 192 prefix, an HTTP 400 error is returned.</li>
     * <li>Due to number portability, the actual carrier may differ from the current carrier of record. You can use the <code>Carrier</code> parameter to route the query to a specific carrier.</li>
     * <li>The queries per second (QPS) limit per user is 200. Requests that exceed this limit are throttled.</li>
     * <li>In the authorization information, the action is <code>dytns:HistoryThreeElementsVerification</code>, the access level is Read, and the resource type is All Resources.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether a name, phone number, and ID number belonged to the same user at a specific point in time.</p>
     * 
     * @param request HistoryThreeElementsVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return HistoryThreeElementsVerificationResponse
     */
    public HistoryThreeElementsVerificationResponse historyThreeElementsVerificationWithOptions(HistoryThreeElementsVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.carrier)) {
            query.put("Carrier", request.carrier);
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

        if (!com.aliyun.teautil.Common.isUnset(request.verificationTime)) {
            query.put("VerificationTime", request.verificationTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HistoryThreeElementsVerification"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HistoryThreeElementsVerificationResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>Before you use this API, ensure you understand its <a href="https://help.aliyun.com/zh/cpns/product-overview/pricing-of-cpns">pricing</a>.</li>
     * <li>Before you use this API, log on to the Phone Number Intelligence console and apply for the required tag on the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Plaza</a> page.</li>
     * <li>You are charged for a call only when the response returns <code>Code=\\&quot;OK\\&quot;</code> and <code>IsConsistent != 0</code>. No charges are incurred for any other results.</li>
     * <li>Verification of China Broadcasting Network numbers (numbers with the 192 prefix) is not supported. If you provide a number with the 192 prefix, an HTTP 400 error is returned.</li>
     * <li>Due to number portability, the actual carrier may differ from the current carrier of record. You can use the <code>Carrier</code> parameter to route the query to a specific carrier.</li>
     * <li>The queries per second (QPS) limit per user is 200. Requests that exceed this limit are throttled.</li>
     * <li>In the authorization information, the action is <code>dytns:HistoryThreeElementsVerification</code>, the access level is Read, and the resource type is All Resources.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether a name, phone number, and ID number belonged to the same user at a specific point in time.</p>
     * 
     * @param request HistoryThreeElementsVerificationRequest
     * @return HistoryThreeElementsVerificationResponse
     */
    public HistoryThreeElementsVerificationResponse historyThreeElementsVerification(HistoryThreeElementsVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.historyThreeElementsVerificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the corresponding tag, click <strong>Apply for Activation</strong>, and submit the application materials. You can use this operation after the application is approved.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user for this operation is 1,000 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs invalid phone number filtering operations.</p>
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
     * <p>Before you call this operation, log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the corresponding tag, click <strong>Apply for Activation</strong>, and submit the application materials. You can use this operation after the application is approved.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user for this operation is 1,000 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs invalid phone number filtering operations.</p>
     * 
     * @param request InvalidPhoneNumberFilterRequest
     * @return InvalidPhoneNumberFilterResponse
     */
    public InvalidPhoneNumberFilterResponse invalidPhoneNumberFilter(InvalidPhoneNumberFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.invalidPhoneNumberFilterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before using this API, ensure that you have activated Number Encyclopedia.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the alert contacts for Number Encyclopedia.</p>
     * 
     * @param request ListContactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContactsResponse
     */
    public ListContactsResponse listContactsWithOptions(ListContactsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
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
            new TeaPair("action", "ListContacts"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContactsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before using this API, ensure that you have activated Number Encyclopedia.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the alert contacts for Number Encyclopedia.</p>
     * 
     * @param request ListContactsRequest
     * @return ListContactsResponse
     */
    public ListContactsResponse listContacts(ListContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContactsWithOptions(request, runtime);
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
     * <p>Before you use this API, log on to the Cell Phone Number Service console, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Plaza</a> page, find the corresponding tag, click <strong>Apply for Activation</strong>, and fill in the application materials. You can use this API after the application is approved.</p>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit of this API is 1,000 calls per second. If the number of API calls exceeds the limit, the calls will be throttled, which may affect your business. Call the API properly.</p>
     * 
     * <b>summary</b> : 
     * <p>Encrypts an original phone number into a virtual phone number that starts with 140. By integrating with Alibaba Cloud communication services, you can use the encrypted 140 phone number to initiate voice calls, achieving the effect of a virtual phone number call.</p>
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
     * <p>Before you use this API, log on to the Cell Phone Number Service console, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Plaza</a> page, find the corresponding tag, click <strong>Apply for Activation</strong>, and fill in the application materials. You can use this API after the application is approved.</p>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit of this API is 1,000 calls per second. If the number of API calls exceeds the limit, the calls will be throttled, which may affect your business. Call the API properly.</p>
     * 
     * <b>summary</b> : 
     * <p>Encrypts an original phone number into a virtual phone number that starts with 140. By integrating with Alibaba Cloud communication services, you can use the encrypted 140 phone number to initiate voice calls, achieving the effect of a virtual phone number call.</p>
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
     * <ul>
     * <li><strong>Before you use this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/154751.html">pricing</a> of Phone Number Intelligence.</strong></li>
     * <li>By default, only an Alibaba Cloud account can call this operation. A RAM user can call this operation only after receiving the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you use this operation, log on to the Phone Number Intelligence console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Plaza</a> page, find the required tag, click <strong>Apply</strong>, and then submit the required information. You can use this operation once your application is approved.</li>
     * <li>The phone number status query feature supports numbers from China Telecom, China Unicom, and China Mobile. This feature does not support numbers from China Broadnet. If you call this operation to query a China Broadnet number, the API returns the error code <code>OperatorLimit</code>, which indicates that the query is prohibited by the carrier.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>This operation has a queries per second (QPS) limit of 300 per user. If you exceed this limit, your API calls are throttled, which may affect your services. We recommend that you call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the real-time network status of a mobile phone number, such as active, shutdown, or non-existent. You can query numbers that are in plaintext or hashed using MD5 or SHA256.</p>
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
     * <ul>
     * <li><strong>Before you use this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/154751.html">pricing</a> of Phone Number Intelligence.</strong></li>
     * <li>By default, only an Alibaba Cloud account can call this operation. A RAM user can call this operation only after receiving the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you use this operation, log on to the Phone Number Intelligence console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Plaza</a> page, find the required tag, click <strong>Apply</strong>, and then submit the required information. You can use this operation once your application is approved.</li>
     * <li>The phone number status query feature supports numbers from China Telecom, China Unicom, and China Mobile. This feature does not support numbers from China Broadnet. If you call this operation to query a China Broadnet number, the API returns the error code <code>OperatorLimit</code>, which indicates that the query is prohibited by the carrier.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>This operation has a queries per second (QPS) limit of 300 per user. If you exceed this limit, your API calls are throttled, which may affect your services. We recommend that you call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the real-time network status of a mobile phone number, such as active, shutdown, or non-existent. You can query numbers that are in plaintext or hashed using MD5 or SHA256.</p>
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
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/154751.html">pricing</a> of Phone Number Intelligence.</strong></li>
     * <li>By default, only an Alibaba Cloud account can call this operation. A RAM user must be granted the required permissions before calling this operation. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before calling this operation, log on to the Phone Number Intelligence console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the required tag, click <strong>Apply</strong>, and submit your application. You can use the operation after your application is approved.</li>
     * <li>The number status query feature supports numbers from China Telecom, China Unicom, and China Mobile, but does not support numbers from China Broadnet. If you call this operation to query the status of a China Broadnet number, the <code>OperatorLimit</code> error code is returned, which indicates that the query is prohibited by the carrier.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for each user is 300. API calls that exceed this limit are throttled. To avoid business disruptions, plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time status of a mobile phone number to determine whether it is in service, suspended, or non-existent. This operation supports queries for plaintext numbers or numbers encrypted with MD5 or SHA256.</p>
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
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/154751.html">pricing</a> of Phone Number Intelligence.</strong></li>
     * <li>By default, only an Alibaba Cloud account can call this operation. A RAM user must be granted the required permissions before calling this operation. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before calling this operation, log on to the Phone Number Intelligence console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the required tag, click <strong>Apply</strong>, and submit your application. You can use the operation after your application is approved.</li>
     * <li>The number status query feature supports numbers from China Telecom, China Unicom, and China Mobile, but does not support numbers from China Broadnet. If you call this operation to query the status of a China Broadnet number, the <code>OperatorLimit</code> error code is returned, which indicates that the query is prohibited by the carrier.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for each user is 300. API calls that exceed this limit are throttled. To avoid business disruptions, plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time status of a mobile phone number to determine whether it is in service, suspended, or non-existent. This operation supports queries for plaintext numbers or numbers encrypted with MD5 or SHA256.</p>
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
     * <ul>
     * <li><strong>Before calling this operation, ensure you fully understand the <a href="https://help.aliyun.com/document_detail/154751.html">pricing</a> of Phone Number Intelligence.</strong></li>
     * <li>By default, only an Alibaba Cloud account can call this operation. To allow a RAM user to call this operation, you must first grant the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, log on to the Phone Number Intelligence console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the required tag, click <strong>Request Activation</strong>, and then submit your application. You can call this operation only after your application is approved.</li>
     * <li>This operation supports phone numbers from China Telecom, China Unicom, and China Mobile. Numbers from China Broadnet are not supported. If you call this operation to query a China Broadnet number, the API returns the error code <code>OperatorLimit</code> and an error message indicating that the query is restricted by the carrier.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this operation is 300 queries per second (QPS) per user. The system throttles calls that exceed this limit, which may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time status of a mobile phone number, such as normal, suspended, or not in service. This operation supports queries for phone numbers that are in plaintext or encrypted by using MD5, SHA256, or SM3.</p>
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
     * <ul>
     * <li><strong>Before calling this operation, ensure you fully understand the <a href="https://help.aliyun.com/document_detail/154751.html">pricing</a> of Phone Number Intelligence.</strong></li>
     * <li>By default, only an Alibaba Cloud account can call this operation. To allow a RAM user to call this operation, you must first grant the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, log on to the Phone Number Intelligence console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the required tag, click <strong>Request Activation</strong>, and then submit your application. You can call this operation only after your application is approved.</li>
     * <li>This operation supports phone numbers from China Telecom, China Unicom, and China Mobile. Numbers from China Broadnet are not supported. If you call this operation to query a China Broadnet number, the API returns the error code <code>OperatorLimit</code> and an error message indicating that the query is restricted by the carrier.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this operation is 300 queries per second (QPS) per user. The system throttles calls that exceed this limit, which may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time status of a mobile phone number, such as normal, suspended, or not in service. This operation supports queries for phone numbers that are in plaintext or encrypted by using MD5, SHA256, or SM3.</p>
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
     * <ul>
     * <li><strong>Before you call this operation, make sure you understand the <a href="https://help.aliyun.com/document_detail/154751.html">Product Pricing</a> of Phone Number Pedia</strong>.</li>
     * <li>By default, only an Alibaba Cloud account can call this operation. A RAM user can call this operation only after being granted the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to a RAM user</a>.</li>
     * <li>Before calling this operation, log on to the Phone Number Pedia console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the required tag, click <strong>Request Activation</strong>, and then complete the application form. You can use this operation only after your application is approved.</li>
     * <li>This feature supports phone numbers from China Telecom, China Unicom, and China Mobile, but does not support phone numbers from China Broadnet. If you call this operation to query the status of a China Broadnet number, the <code>OperatorLimit</code> error code and the &quot;The number is limited by the operator.&quot; message are returned.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>This operation is limited to 300 queries per second (QPS) for each user. Calls that exceed this limit are throttled, which may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the real-time network status of a phone number, such as active, shutdown, or non-existent. This operation supports queries for numbers in plaintext or numbers encrypted by using MD5, SHA256, or SM3.</p>
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
     * <ul>
     * <li><strong>Before you call this operation, make sure you understand the <a href="https://help.aliyun.com/document_detail/154751.html">Product Pricing</a> of Phone Number Pedia</strong>.</li>
     * <li>By default, only an Alibaba Cloud account can call this operation. A RAM user can call this operation only after being granted the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to a RAM user</a>.</li>
     * <li>Before calling this operation, log on to the Phone Number Pedia console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the required tag, click <strong>Request Activation</strong>, and then complete the application form. You can use this operation only after your application is approved.</li>
     * <li>This feature supports phone numbers from China Telecom, China Unicom, and China Mobile, but does not support phone numbers from China Broadnet. If you call this operation to query the status of a China Broadnet number, the <code>OperatorLimit</code> error code and the &quot;The number is limited by the operator.&quot; message are returned.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>This operation is limited to 300 queries per second (QPS) for each user. Calls that exceed this limit are throttled, which may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the real-time network status of a phone number, such as active, shutdown, or non-existent. This operation supports queries for numbers in plaintext or numbers encrypted by using MD5, SHA256, or SM3.</p>
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
     * <ul>
     * <li><strong>Before you use this API, make sure that you understand the <a href="https://help.aliyun.com/document_detail/154751.html">pricing</a> of Phone Number Encyclopedia</strong>.</li>
     * <li>By default, only Alibaba Cloud accounts can call this API. To allow a RAM user to do so, you must grant them the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you use this API, log in to the Phone Number Encyclopedia console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the required tag, click <strong>Apply for Access</strong>, and then complete the application form. You can call this API after your application is approved.</li>
     * <li>This feature supports phone numbers from China Telecom, China Unicom, and China Mobile, but not from China Broadnet. If you query a China Broadnet number, the <code>OperatorLimit</code> error code and an error message are returned: The number is limited by the operator.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 300 queries per second. If you exceed this limit, the system throttles your API calls, which may impact your business. To avoid interruptions, call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time network status of a mobile phone number, such as normal, shutdown, or non-existent. This operation supports queries for numbers in plaintext and numbers encrypted by using MD5, SHA256, or SM3.</p>
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
     * <ul>
     * <li><strong>Before you use this API, make sure that you understand the <a href="https://help.aliyun.com/document_detail/154751.html">pricing</a> of Phone Number Encyclopedia</strong>.</li>
     * <li>By default, only Alibaba Cloud accounts can call this API. To allow a RAM user to do so, you must grant them the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you use this API, log in to the Phone Number Encyclopedia console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the required tag, click <strong>Apply for Access</strong>, and then complete the application form. You can call this API after your application is approved.</li>
     * <li>This feature supports phone numbers from China Telecom, China Unicom, and China Mobile, but not from China Broadnet. If you query a China Broadnet number, the <code>OperatorLimit</code> error code and an error message are returned: The number is limited by the operator.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 300 queries per second. If you exceed this limit, the system throttles your API calls, which may impact your business. To avoid interruptions, call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time network status of a mobile phone number, such as normal, shutdown, or non-existent. This operation supports queries for numbers in plaintext and numbers encrypted by using MD5, SHA256, or SM3.</p>
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
     * <p>Queries package type information.</p>
     * 
     * @param request QueryPackageTypeInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPackageTypeInfoResponse
     */
    public QueryPackageTypeInfoResponse queryPackageTypeInfoWithOptions(QueryPackageTypeInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            query.put("ProductName", request.productName);
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
            new TeaPair("action", "QueryPackageTypeInfo"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPackageTypeInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries package type information.</p>
     * 
     * @param request QueryPackageTypeInfoRequest
     * @return QueryPackageTypeInfoResponse
     */
    public QueryPackageTypeInfoResponse queryPackageTypeInfo(QueryPackageTypeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPackageTypeInfoWithOptions(request, runtime);
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
     * <p>Queries tag information.</p>
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
     * <p>Queries tag information.</p>
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
     * <p>Queries the tag list by page.</p>
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
     * <p>Queries the tag list by page.</p>
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
     * <p>Queries a list of offline tasks.</p>
     * 
     * @param tmpReq QueryTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTaskListResponse
     */
    public QueryTaskListResponse queryTaskListWithOptions(QueryTaskListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryTaskListShrinkRequest request = new QueryTaskListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.result)) {
            request.resultShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.result, "Result", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskType)) {
            request.taskTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskType, "TaskType", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resultShrink)) {
            query.put("Result", request.resultShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskTypeShrink)) {
            query.put("TaskType", request.taskTypeShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTaskList"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of offline tasks.</p>
     * 
     * @param request QueryTaskListRequest
     * @return QueryTaskListResponse
     */
    public QueryTaskListResponse queryTaskList(QueryTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTaskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries usage statistics by tag ID.</p>
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
     * <p>Queries usage statistics by tag ID.</p>
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
     * <ul>
     * <li>Before you call this operation, ensure you have activated Phone Number Intelligence.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Saves an alert contact.</p>
     * 
     * @param request SaveContactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveContactsResponse
     */
    public SaveContactsResponse saveContactsWithOptions(SaveContactsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactEmail)) {
            query.put("ContactEmail", request.contactEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactPhone)) {
            query.put("ContactPhone", request.contactPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mailStatus)) {
            query.put("MailStatus", request.mailStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openStatusWarning)) {
            query.put("OpenStatusWarning", request.openStatusWarning);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opentAttributionWarning)) {
            query.put("OpentAttributionWarning", request.opentAttributionWarning);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneStatus)) {
            query.put("PhoneStatus", request.phoneStatus);
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
            new TeaPair("action", "SaveContacts"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveContactsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, ensure you have activated Phone Number Intelligence.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Saves an alert contact.</p>
     * 
     * @param request SaveContactsRequest
     * @return SaveContactsResponse
     */
    public SaveContactsResponse saveContacts(SaveContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveContactsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this API, make sure that you have fully understood the <a href="https://help.aliyun.com/document_detail/154751.html">pricing</a> of Cell Phone Number Service.</li>
     * <li>Before you call this API, log on to the Cell Phone Number Service console, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the corresponding tag, click <strong>Apply for Activation</strong>, fill in the application materials, and call the API after the application is approved.</li>
     * <li>Billing applies when the API returns Code=\&quot;OK\&quot; and IsConsistent != 2. Other return results are not billed.</li>
     * <li>The verification of virtual carrier numbers is not supported. Virtual carrier numbers refer to numbers that start with 170, 171, 162, or 165.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user for this API is 200 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the API in a reasonable manner.</p>
     * 
     * <b>summary</b> : 
     * <p>Verification of three elements (name, mobile phone number, and ID card number). Used to verify whether the name, mobile phone number, and ID card number entered by a user belong to the same user.</p>
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
     * <ul>
     * <li>Before you call this API, make sure that you have fully understood the <a href="https://help.aliyun.com/document_detail/154751.html">pricing</a> of Cell Phone Number Service.</li>
     * <li>Before you call this API, log on to the Cell Phone Number Service console, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the corresponding tag, click <strong>Apply for Activation</strong>, fill in the application materials, and call the API after the application is approved.</li>
     * <li>Billing applies when the API returns Code=\&quot;OK\&quot; and IsConsistent != 2. Other return results are not billed.</li>
     * <li>The verification of virtual carrier numbers is not supported. Virtual carrier numbers refer to numbers that start with 170, 171, 162, or 165.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user for this API is 200 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the API in a reasonable manner.</p>
     * 
     * <b>summary</b> : 
     * <p>Verification of three elements (name, mobile phone number, and ID card number). Used to verify whether the name, mobile phone number, and ID card number entered by a user belong to the same user.</p>
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
     * <ul>
     * <li>Before using this API, ensure that you fully understand the <a href="https://help.aliyun.com/document_detail/154751.html">product pricing</a> of Cell Phone Number Service.</li>
     * <li>Before using this API, log on to the Cell Phone Number Service console, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the corresponding tag, click <strong>Apply to Enable</strong>, fill in the application materials, and use it after the approval.</li>
     * <li>Billing is applied when the API returns Code=&quot;OK&quot; and IsConsistent != 2. Other return results are not billed.</li>
     * <li>MVNO number verification is not supported. MVNO numbers refer to numbers starting with 170, 171, 162, and 165.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit of this API is 200 times/second. If the limit is exceeded, API calls will be throttled, which may affect your business. Please call the API reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>Two-element (name and phone number) verification. Used to compare whether the name and phone number entered by the user belong to the same user.</p>
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
     * <ul>
     * <li>Before using this API, ensure that you fully understand the <a href="https://help.aliyun.com/document_detail/154751.html">product pricing</a> of Cell Phone Number Service.</li>
     * <li>Before using this API, log on to the Cell Phone Number Service console, go to the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Square</a> page, find the corresponding tag, click <strong>Apply to Enable</strong>, fill in the application materials, and use it after the approval.</li>
     * <li>Billing is applied when the API returns Code=&quot;OK&quot; and IsConsistent != 2. Other return results are not billed.</li>
     * <li>MVNO number verification is not supported. MVNO numbers refer to numbers starting with 170, 171, 162, and 165.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit of this API is 200 times/second. If the limit is exceeded, API calls will be throttled, which may affect your business. Please call the API reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>Two-element (name and phone number) verification. Used to compare whether the name and phone number entered by the user belong to the same user.</p>
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
     * <b>description</b> :
     * <p>Before you call this API, make sure that you have fully understood the billing method and <a href="https://www.aliyun.com/price/product#/dytns/detail/dytns_penqbag_public_cn">pricing</a> of Cell Phone Number Service.<br>Obtains a UAID based on the carrier authorization token.<br>For information about how to obtain the authorization token and its signature, see the GetUAIDApplyTokenSign API documentation.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a UAID based on the carrier authorization token.
     * For information about how to obtain the authorization token and its signature, see the GetUAIDApplyTokenSign API documentation.
     * A UAID is 64 characters in length. The first 32 characters describe the device information, and the last 32 characters describe the phone number information.</p>
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
     * <b>description</b> :
     * <p>Before you call this API, make sure that you have fully understood the billing method and <a href="https://www.aliyun.com/price/product#/dytns/detail/dytns_penqbag_public_cn">pricing</a> of Cell Phone Number Service.<br>Obtains a UAID based on the carrier authorization token.<br>For information about how to obtain the authorization token and its signature, see the GetUAIDApplyTokenSign API documentation.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a UAID based on the carrier authorization token.
     * For information about how to obtain the authorization token and its signature, see the GetUAIDApplyTokenSign API documentation.
     * A UAID is 64 characters in length. The first 32 characters describe the device information, and the last 32 characters describe the phone number information.</p>
     * 
     * @param request UAIDVerificationRequest
     * @return UAIDVerificationResponse
     */
    public UAIDVerificationResponse uAIDVerification(UAIDVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uAIDVerificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Ensure that you have activated the Phone Number Information Service before calling this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates an alert contact.</p>
     * 
     * @param request UpdateContactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContactsResponse
     */
    public UpdateContactsResponse updateContactsWithOptions(UpdateContactsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactEmail)) {
            query.put("ContactEmail", request.contactEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactPhone)) {
            query.put("ContactPhone", request.contactPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mailStatus)) {
            query.put("MailStatus", request.mailStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openStatusWarning)) {
            query.put("OpenStatusWarning", request.openStatusWarning);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opentAttributionWarning)) {
            query.put("OpentAttributionWarning", request.opentAttributionWarning);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneStatus)) {
            query.put("PhoneStatus", request.phoneStatus);
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
            new TeaPair("action", "UpdateContacts"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContactsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Ensure that you have activated the Phone Number Information Service before calling this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates an alert contact.</p>
     * 
     * @param request UpdateContactsRequest
     * @return UpdateContactsResponse
     */
    public UpdateContactsResponse updateContacts(UpdateContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContactsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>虚商三要素</p>
     * 
     * @param request VirtualThreeElementsVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VirtualThreeElementsVerificationResponse
     */
    public VirtualThreeElementsVerificationResponse virtualThreeElementsVerificationWithOptions(VirtualThreeElementsVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certCode)) {
            query.put("CertCode", request.certCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputNumber)) {
            query.put("InputNumber", request.inputNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VirtualThreeElementsVerification"),
            new TeaPair("version", "2020-02-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VirtualThreeElementsVerificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>虚商三要素</p>
     * 
     * @param request VirtualThreeElementsVerificationRequest
     * @return VirtualThreeElementsVerificationResponse
     */
    public VirtualThreeElementsVerificationResponse virtualThreeElementsVerification(VirtualThreeElementsVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.virtualThreeElementsVerificationWithOptions(request, runtime);
    }
}
