// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407;

import com.aliyun.tea.*;
import com.aliyun.cas20200407.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "cas.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "cas.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "cas.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "cas.aliyuncs.com"),
            new TeaPair("cn-beijing", "cas.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "cas.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "cas.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "cas.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "cas.aliyuncs.com"),
            new TeaPair("cn-chengdu", "cas.aliyuncs.com"),
            new TeaPair("cn-edge-1", "cas.aliyuncs.com"),
            new TeaPair("cn-fujian", "cas.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "cas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "cas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "cas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "cas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "cas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "cas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "cas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "cas.aliyuncs.com"),
            new TeaPair("cn-hongkong", "cas.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "cas.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "cas.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "cas.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "cas.aliyuncs.com"),
            new TeaPair("cn-qingdao", "cas.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "cas.aliyuncs.com"),
            new TeaPair("cn-shanghai", "cas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "cas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "cas.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "cas.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "cas.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "cas.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "cas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "cas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "cas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "cas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "cas.aliyuncs.com"),
            new TeaPair("cn-wuhan", "cas.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "cas.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "cas.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "cas.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "cas.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "cas.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "cas.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "cas.aliyuncs.com"),
            new TeaPair("eu-west-1", "cas.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "cas.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "cas.aliyuncs.com"),
            new TeaPair("us-east-1", "cas.aliyuncs.com"),
            new TeaPair("us-west-1", "cas.aliyuncs.com"),
            new TeaPair("me-east-1", "cas.me-east-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "cas.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "cas.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "cas.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "cas.ap-south-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "cas.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>The single-user QPS limit for this API is 100 queries per second (QPS). Calls that exceed this limit are throttled, which can affect your business operations. Call this API at a reasonable rate to avoid throttling.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds an AccessKey for authorization.</p>
     * 
     * @param request AddCloudAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCloudAccessResponse
     */
    public AddCloudAccessResponse addCloudAccessWithOptions(AddCloudAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudName)) {
            query.put("CloudName", request.cloudName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretId)) {
            query.put("SecretId", request.secretId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretKey)) {
            query.put("SecretKey", request.secretKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCloudAccess"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCloudAccessResponse());
    }

    /**
     * <b>description</b> :
     * <p>The single-user QPS limit for this API is 100 queries per second (QPS). Calls that exceed this limit are throttled, which can affect your business operations. Call this API at a reasonable rate to avoid throttling.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds an AccessKey for authorization.</p>
     * 
     * @param request AddCloudAccessRequest
     * @return AddCloudAccessResponse
     */
    public AddCloudAccessResponse addCloudAccess(AddCloudAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCloudAccessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Applies for a certificate.</p>
     * 
     * @param request ApplyCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyCertificateResponse
     */
    public ApplyCertificateResponse applyCertificateWithOptions(ApplyCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyCertificate"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Applies for a certificate.</p>
     * 
     * @param request ApplyCertificateRequest
     * @return ApplyCertificateResponse
     */
    public ApplyCertificateResponse applyCertificate(ApplyCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a CA certificate is created, it is in the normal issuance state by default. You can call this operation to change the status of a CA certificate from normal issuance to revoked. In the normal issuance state, the CA certificate can be used to issue certificates. In the revoked state, the CA certificate cannot be used to issue certificates, and the certificates that have been issued by the CA certificate also become invalid accordingly.
     * Before you call this operation, you must have called <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root CA certificate and called <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a> to create a sub CA certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit per user for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation properly.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the notification status in batches</p>
     * 
     * @param request BatchUpdateNoticeStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUpdateNoticeStatusResponse
     */
    public BatchUpdateNoticeStatusResponse batchUpdateNoticeStatusWithOptions(BatchUpdateNoticeStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeBiz)) {
            query.put("NoticeBiz", request.noticeBiz);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeStatus)) {
            query.put("NoticeStatus", request.noticeStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateNoticeStatus"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateNoticeStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>After a CA certificate is created, it is in the normal issuance state by default. You can call this operation to change the status of a CA certificate from normal issuance to revoked. In the normal issuance state, the CA certificate can be used to issue certificates. In the revoked state, the CA certificate cannot be used to issue certificates, and the certificates that have been issued by the CA certificate also become invalid accordingly.
     * Before you call this operation, you must have called <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root CA certificate and called <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a> to create a sub CA certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit per user for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation properly.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the notification status in batches</p>
     * 
     * @param request BatchUpdateNoticeStatusRequest
     * @return BatchUpdateNoticeStatusResponse
     */
    public BatchUpdateNoticeStatusResponse batchUpdateNoticeStatus(BatchUpdateNoticeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUpdateNoticeStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API has a limit of 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled. This can affect your business. Call the API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes an issued certificate or cancels a pending certificate order and restores the quota.</p>
     * 
     * @param request CancelCertificateForPackageRequestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelCertificateForPackageRequestResponse
     */
    public CancelCertificateForPackageRequestResponse cancelCertificateForPackageRequestWithOptions(CancelCertificateForPackageRequestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelCertificateForPackageRequest"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelCertificateForPackageRequestResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API has a limit of 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled. This can affect your business. Call the API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes an issued certificate or cancels a pending certificate order and restores the quota.</p>
     * 
     * @param request CancelCertificateForPackageRequestRequest
     * @return CancelCertificateForPackageRequestResponse
     */
    public CancelCertificateForPackageRequestResponse cancelCertificateForPackageRequest(CancelCertificateForPackageRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelCertificateForPackageRequestWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 100 queries per second (QPS) for each user. API calls that exceed this limit are throttled. Because this can impact your business, you should call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a certificate application order that is pending domain verification or under review.</p>
     * 
     * @param request CancelOrderRequestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelOrderRequestResponse
     */
    public CancelOrderRequestResponse cancelOrderRequestWithOptions(CancelOrderRequestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelOrderRequest"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOrderRequestResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 100 queries per second (QPS) for each user. API calls that exceed this limit are throttled. Because this can impact your business, you should call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a certificate application order that is pending domain verification or under review.</p>
     * 
     * @param request CancelOrderRequestRequest
     * @return CancelOrderRequestResponse
     */
    public CancelOrderRequestResponse cancelOrderRequest(CancelOrderRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelOrderRequestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a certificate application.</p>
     * 
     * @param request CancelPendingCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelPendingCertificateResponse
     */
    public CancelPendingCertificateResponse cancelPendingCertificateWithOptions(CancelPendingCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelPendingCertificate"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelPendingCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a certificate application.</p>
     * 
     * @param request CancelPendingCertificateRequest
     * @return CancelPendingCertificateResponse
     */
    public CancelPendingCertificateResponse cancelPendingCertificate(CancelPendingCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelPendingCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see <a href="https://help.aliyun.com/document_detail/28542.html">Purchase a certificate resource plan</a>. You can call the <a href="https://help.aliyun.com/document_detail/455800.html">DescribePackageState</a> operation to query the usage of a certificate resource plan of specified specifications, including the total number of certificate resource plans that you purchase, the number of certificate applications that you submit, and the number of certificates that are issued.</li>
     * <li>After you call this operation to submit a certificate application and the certificate is issued, the certificate quota provided by the resource plan that you purchased is consumed. When you call this operation, you can use the <strong>ProductCode</strong> parameter to specify the specifications of the certificate that you want to apply for.</li>
     * <li>After you call this operation to submit a certificate application, you also need to call the <a href="https://help.aliyun.com/document_detail/455800.html">DescribeCertificateState</a> operation to obtain the information that is required for domain name ownership verification and manually complete the verification. Then, your certificate application is reviewed by the certificate authority (CA). If you use the Domain Name System (DNS) verification method, you must complete the verification on your DNS service provider system. If you use the file verification method, you must complete the verification on the DNS server.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a certificate application by using a purchased certificate package quota.</p>
     * 
     * @param request CreateCertificateForPackageRequestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCertificateForPackageRequestResponse
     */
    public CreateCertificateForPackageRequestResponse createCertificateForPackageRequestWithOptions(CreateCertificateForPackageRequestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            query.put("CompanyName", request.companyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.csr)) {
            query.put("Csr", request.csr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validateType)) {
            query.put("ValidateType", request.validateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCertificateForPackageRequest"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCertificateForPackageRequestResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see <a href="https://help.aliyun.com/document_detail/28542.html">Purchase a certificate resource plan</a>. You can call the <a href="https://help.aliyun.com/document_detail/455800.html">DescribePackageState</a> operation to query the usage of a certificate resource plan of specified specifications, including the total number of certificate resource plans that you purchase, the number of certificate applications that you submit, and the number of certificates that are issued.</li>
     * <li>After you call this operation to submit a certificate application and the certificate is issued, the certificate quota provided by the resource plan that you purchased is consumed. When you call this operation, you can use the <strong>ProductCode</strong> parameter to specify the specifications of the certificate that you want to apply for.</li>
     * <li>After you call this operation to submit a certificate application, you also need to call the <a href="https://help.aliyun.com/document_detail/455800.html">DescribeCertificateState</a> operation to obtain the information that is required for domain name ownership verification and manually complete the verification. Then, your certificate application is reviewed by the certificate authority (CA). If you use the Domain Name System (DNS) verification method, you must complete the verification on your DNS service provider system. If you use the file verification method, you must complete the verification on the DNS server.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a certificate application by using a purchased certificate package quota.</p>
     * 
     * @param request CreateCertificateForPackageRequestRequest
     * @return CreateCertificateForPackageRequestResponse
     */
    public CreateCertificateForPackageRequestResponse createCertificateForPackageRequest(CreateCertificateForPackageRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCertificateForPackageRequestWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to apply for only DV certificates. If you want to apply for an organization validated (OV) or extended validation (EV) certificate, we recommend that you call the <a href="https://help.aliyun.com/document_detail/455296.html">CreateCertificateForPackageRequest</a> operation. This operation allows you to apply for certificates of all specifications and specify the method to generate a certificate signing request (CSR) file.</li>
     * <li>Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see <a href="https://help.aliyun.com/document_detail/28542.html">Purchase a certificate resource plan</a>. You can call the <a href="https://help.aliyun.com/document_detail/455803.html">DescribePackageState</a> operation to query the usage of a certificate resource plan of specified specifications, including the total number of certificate resource plans that you purchase, the number of certificate applications that you submit, and the number of certificates that are issued.</li>
     * <li>When you call this operation, you can use the <strong>ProductCode</strong> parameter to specify the specifications of the certificate.</li>
     * <li>After you call this operation to submit a certificate application, Certificate Management Service automatically creates a CSR file for your application and consumes the certificate quota in the certificate resource plans of the specified specifications that you purchased. After you call this operation, you also need to call the <a href="https://help.aliyun.com/document_detail/455800.html">DescribeCertificateState</a> operation to obtain the information that is required to complete domain name verification, and manually complete the verification. If you use the DNS verification method, you must complete the verification on the management platform of the domain name. If you use the file verification method, you must complete the verification on your DNS server. Then, the certificate authority (CA) will review your certificate application.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Purchases, applies for, and issues a domain validated (DV) certificate by using extended certificate services.</p>
     * 
     * @param request CreateCertificateRequestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCertificateRequestResponse
     */
    public CreateCertificateRequestResponse createCertificateRequestWithOptions(CreateCertificateRequestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validateType)) {
            query.put("ValidateType", request.validateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCertificateRequest"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCertificateRequestResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to apply for only DV certificates. If you want to apply for an organization validated (OV) or extended validation (EV) certificate, we recommend that you call the <a href="https://help.aliyun.com/document_detail/455296.html">CreateCertificateForPackageRequest</a> operation. This operation allows you to apply for certificates of all specifications and specify the method to generate a certificate signing request (CSR) file.</li>
     * <li>Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see <a href="https://help.aliyun.com/document_detail/28542.html">Purchase a certificate resource plan</a>. You can call the <a href="https://help.aliyun.com/document_detail/455803.html">DescribePackageState</a> operation to query the usage of a certificate resource plan of specified specifications, including the total number of certificate resource plans that you purchase, the number of certificate applications that you submit, and the number of certificates that are issued.</li>
     * <li>When you call this operation, you can use the <strong>ProductCode</strong> parameter to specify the specifications of the certificate.</li>
     * <li>After you call this operation to submit a certificate application, Certificate Management Service automatically creates a CSR file for your application and consumes the certificate quota in the certificate resource plans of the specified specifications that you purchased. After you call this operation, you also need to call the <a href="https://help.aliyun.com/document_detail/455800.html">DescribeCertificateState</a> operation to obtain the information that is required to complete domain name verification, and manually complete the verification. If you use the DNS verification method, you must complete the verification on the management platform of the domain name. If you use the file verification method, you must complete the verification on your DNS server. Then, the certificate authority (CA) will review your certificate application.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Purchases, applies for, and issues a domain validated (DV) certificate by using extended certificate services.</p>
     * 
     * @param request CreateCertificateRequestRequest
     * @return CreateCertificateRequestResponse
     */
    public CreateCertificateRequestResponse createCertificateRequest(CreateCertificateRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCertificateRequestWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can use this operation to apply for only a domain validated (DV) certificate. You cannot use this operation to apply for an organization validated (OV) certificate. We recommend that you use the <a href="https://help.aliyun.com/document_detail/455296.html">CreateCertificateForPackageRequest</a> operation to apply for a certificate. You can use the CreateCertificateForPackageRequest operation to apply for certificates of all types and specify the CSR generation method.</li>
     * <li>Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see <a href="https://help.aliyun.com/document_detail/28542.html">Purchase a certificate resource plan</a>. You can call the <a href="https://help.aliyun.com/document_detail/455803.html">DescribePackageState</a> operation to query the usage of a certificate resource plan of specified specifications, including the total number of certificate resource plans that you purchase, the number of certificate applications that you submit, and the number of certificates that are issued.</li>
     * <li>When you call this operation, you can use the <strong>ProductCode</strong> parameter to specify the specifications of the certificate that you want to apply for.</li>
     * <li>After you call this operation to submit a certificate application, the certificate quota of the required specifications that you purchased is consumed. After you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/455800.html">DescribeCertificateState</a> operation to obtain the information that is required for domain name ownership verification and manually complete the verification. Then, your certificate application is reviewed by the certificate authority (CA). If you use the Domain Name System (DNS) verification method, you must complete the verification on your DNS service provider system. If you use the file verification method, you must complete the verification on the DNS server.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Purchases, applies for, and issues a domain validated (DV) certificate by using a custom certificate signing request (CSR) file.</p>
     * 
     * @param request CreateCertificateWithCsrRequestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCertificateWithCsrRequestResponse
     */
    public CreateCertificateWithCsrRequestResponse createCertificateWithCsrRequestWithOptions(CreateCertificateWithCsrRequestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.csr)) {
            query.put("Csr", request.csr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validateType)) {
            query.put("ValidateType", request.validateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCertificateWithCsrRequest"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCertificateWithCsrRequestResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can use this operation to apply for only a domain validated (DV) certificate. You cannot use this operation to apply for an organization validated (OV) certificate. We recommend that you use the <a href="https://help.aliyun.com/document_detail/455296.html">CreateCertificateForPackageRequest</a> operation to apply for a certificate. You can use the CreateCertificateForPackageRequest operation to apply for certificates of all types and specify the CSR generation method.</li>
     * <li>Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see <a href="https://help.aliyun.com/document_detail/28542.html">Purchase a certificate resource plan</a>. You can call the <a href="https://help.aliyun.com/document_detail/455803.html">DescribePackageState</a> operation to query the usage of a certificate resource plan of specified specifications, including the total number of certificate resource plans that you purchase, the number of certificate applications that you submit, and the number of certificates that are issued.</li>
     * <li>When you call this operation, you can use the <strong>ProductCode</strong> parameter to specify the specifications of the certificate that you want to apply for.</li>
     * <li>After you call this operation to submit a certificate application, the certificate quota of the required specifications that you purchased is consumed. After you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/455800.html">DescribeCertificateState</a> operation to obtain the information that is required for domain name ownership verification and manually complete the verification. Then, your certificate application is reviewed by the certificate authority (CA). If you use the Domain Name System (DNS) verification method, you must complete the verification on your DNS service provider system. If you use the file verification method, you must complete the verification on the DNS server.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Purchases, applies for, and issues a domain validated (DV) certificate by using a custom certificate signing request (CSR) file.</p>
     * 
     * @param request CreateCertificateWithCsrRequestRequest
     * @return CreateCertificateWithCsrRequestResponse
     */
    public CreateCertificateWithCsrRequestResponse createCertificateWithCsrRequest(CreateCertificateWithCsrRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCertificateWithCsrRequestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a company.</p>
     * 
     * @param request CreateCompanyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCompanyResponse
     */
    public CreateCompanyResponse createCompanyWithOptions(CreateCompanyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyAddress)) {
            query.put("CompanyAddress", request.companyAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyCode)) {
            query.put("CompanyCode", request.companyCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyEmail)) {
            query.put("CompanyEmail", request.companyEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            query.put("CompanyName", request.companyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyPhone)) {
            query.put("CompanyPhone", request.companyPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyType)) {
            query.put("CompanyType", request.companyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            query.put("CountryCode", request.countryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.department)) {
            query.put("Department", request.department);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postCode)) {
            query.put("PostCode", request.postCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCompany"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCompanyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a company.</p>
     * 
     * @param request CreateCompanyRequest
     * @return CreateCompanyResponse
     */
    public CreateCompanyResponse createCompany(CreateCompanyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCompanyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a certificate application contact.</p>
     * 
     * @param request CreateContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateContactResponse
     */
    public CreateContactResponse createContactWithOptions(CreateContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idcard)) {
            query.put("Idcard", request.idcard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhooks)) {
            query.put("Webhooks", request.webhooks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateContact"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a certificate application contact.</p>
     * 
     * @param request CreateContactRequest
     * @return CreateContactResponse
     */
    public CreateContactResponse createContact(CreateContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a certificate signing request (CSR) that contains information about an SSL certificate to apply for, such as the domain names and the certificate holder. You must provide a CSR when you submit a certificate application to a certificate authority (CA).</p>
     * 
     * @param request CreateCsrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCsrResponse
     */
    public CreateCsrResponse createCsrWithOptions(CreateCsrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commonName)) {
            query.put("CommonName", request.commonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpName)) {
            query.put("CorpName", request.corpName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            query.put("CountryCode", request.countryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.department)) {
            query.put("Department", request.department);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keySize)) {
            query.put("KeySize", request.keySize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locality)) {
            query.put("Locality", request.locality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sans)) {
            query.put("Sans", request.sans);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCsr"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCsrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a certificate signing request (CSR) that contains information about an SSL certificate to apply for, such as the domain names and the certificate holder. You must provide a CSR when you submit a certificate application to a certificate authority (CA).</p>
     * 
     * @param request CreateCsrRequest
     * @return CreateCsrResponse
     */
    public CreateCsrResponse createCsr(CreateCsrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCsrWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After the task creation is completed, the task will be in the editing state. You need to call the UpdateDeploymentJobStatus interface to change the status to the pending state, otherwise the task will not be executed.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a certificate deployment task to deploy an SSL certificate to one or more Alibaba Cloud services immediately or at a scheduled time.</p>
     * 
     * @param request CreateDeploymentJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDeploymentJobResponse
     */
    public CreateDeploymentJobResponse createDeploymentJobWithOptions(CreateDeploymentJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certIds)) {
            query.put("CertIds", request.certIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactIds)) {
            query.put("ContactIds", request.contactIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTime)) {
            query.put("ScheduleTime", request.scheduleTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeploymentJob"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeploymentJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>After the task creation is completed, the task will be in the editing state. You need to call the UpdateDeploymentJobStatus interface to change the status to the pending state, otherwise the task will not be executed.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a certificate deployment task to deploy an SSL certificate to one or more Alibaba Cloud services immediately or at a scheduled time.</p>
     * 
     * @param request CreateDeploymentJobRequest
     * @return CreateDeploymentJobResponse
     */
    public CreateDeploymentJobResponse createDeploymentJob(CreateDeploymentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDeploymentJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 QPS per user. Exceeding this limit triggers throttling, which can affect your business. Call this API at a reasonable rate to avoid disruption.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a single client certificate from the general user certificate repository.</p>
     * 
     * @param request CreateWHClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWHClientCertificateResponse
     */
    public CreateWHClientCertificateResponse createWHClientCertificateWithOptions(CreateWHClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.afterTime)) {
            query.put("AfterTime", request.afterTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beforeTime)) {
            query.put("BeforeTime", request.beforeTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commonName)) {
            query.put("CommonName", request.commonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.csr)) {
            query.put("Csr", request.csr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.days)) {
            query.put("Days", request.days);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.immediately)) {
            query.put("Immediately", request.immediately);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locality)) {
            query.put("Locality", request.locality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.months)) {
            query.put("Months", request.months);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            query.put("Organization", request.organization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationUnit)) {
            query.put("OrganizationUnit", request.organizationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentIdentifier)) {
            query.put("ParentIdentifier", request.parentIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sanType)) {
            query.put("SanType", request.sanType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sanValue)) {
            query.put("SanValue", request.sanValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.years)) {
            query.put("Years", request.years);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWHClientCertificate"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWHClientCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 QPS per user. Exceeding this limit triggers throttling, which can affect your business. Call this API at a reasonable rate to avoid disruption.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a single client certificate from the general user certificate repository.</p>
     * 
     * @param request CreateWHClientCertificateRequest
     * @return CreateWHClientCertificateResponse
     */
    public CreateWHClientCertificateResponse createWHClientCertificate(CreateWHClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWHClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a certificate warehouse.</p>
     * 
     * @param request CreateWarehouseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWarehouseResponse
     */
    public CreateWarehouseResponse createWarehouseWithOptions(CreateWarehouseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.biz)) {
            query.put("Biz", request.biz);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWarehouse"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWarehouseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a certificate warehouse.</p>
     * 
     * @param request CreateWarehouseRequest
     * @return CreateWarehouseResponse
     */
    public CreateWarehouseResponse createWarehouse(CreateWarehouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWarehouseWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this API operation is 10 per user. If you exceed the limit, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Decrypts data that was encrypted by using a certificate in a certificate application repository.</p>
     * 
     * @param request DecryptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DecryptResponse
     */
    public DecryptResponse decryptWithOptions(DecryptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ciphertextBlob)) {
            query.put("CiphertextBlob", request.ciphertextBlob);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customIdentifier)) {
            query.put("CustomIdentifier", request.customIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            query.put("MessageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warehouseId)) {
            query.put("WarehouseId", request.warehouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Decrypt"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DecryptResponse());
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this API operation is 10 per user. If you exceed the limit, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Decrypts data that was encrypted by using a certificate in a certificate application repository.</p>
     * 
     * @param request DecryptRequest
     * @return DecryptResponse
     */
    public DecryptResponse decrypt(DecryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.decryptWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a certificate application order only in the following scenarios:</p>
     * <ul>
     * <li>The status of the order is <strong>review failed</strong>. You have called the <a href="https://help.aliyun.com/document_detail/455800.html">DescribeCertificateState</a> operation to query the status of the certificate application order and the value of the <strong>Type</strong> parameter is <strong>verify_fail</strong>.</li>
     * <li>The status of the order is <strong>pending application</strong>. You have called the <a href="https://help.aliyun.com/document_detail/455299.html">CancelOrderRequest</a> operation to cancel a certificate application order whose status is pending review or being reviewed. The status of the certificate application order that is canceled in this case changes to <strong>pending application</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a failed domain validated (DV) certificate application order.</p>
     * 
     * @param request DeleteCertificateRequestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCertificateRequestResponse
     */
    public DeleteCertificateRequestResponse deleteCertificateRequestWithOptions(DeleteCertificateRequestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCertificateRequest"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCertificateRequestResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a certificate application order only in the following scenarios:</p>
     * <ul>
     * <li>The status of the order is <strong>review failed</strong>. You have called the <a href="https://help.aliyun.com/document_detail/455800.html">DescribeCertificateState</a> operation to query the status of the certificate application order and the value of the <strong>Type</strong> parameter is <strong>verify_fail</strong>.</li>
     * <li>The status of the order is <strong>pending application</strong>. You have called the <a href="https://help.aliyun.com/document_detail/455299.html">CancelOrderRequest</a> operation to cancel a certificate application order whose status is pending review or being reviewed. The status of the certificate application order that is canceled in this case changes to <strong>pending application</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a failed domain validated (DV) certificate application order.</p>
     * 
     * @param request DeleteCertificateRequestRequest
     * @return DeleteCertificateRequestResponse
     */
    public DeleteCertificateRequestResponse deleteCertificateRequest(DeleteCertificateRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCertificateRequestWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is limited to 100 queries per second (QPS) per user. API calls that exceed this limit are throttled, which can impact your business.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access key.</p>
     * 
     * @param request DeleteCloudAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudAccessResponse
     */
    public DeleteCloudAccessResponse deleteCloudAccessWithOptions(DeleteCloudAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessId)) {
            query.put("AccessId", request.accessId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudAccess"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudAccessResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is limited to 100 queries per second (QPS) per user. API calls that exceed this limit are throttled, which can impact your business.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access key.</p>
     * 
     * @param request DeleteCloudAccessRequest
     * @return DeleteCloudAccessResponse
     */
    public DeleteCloudAccessResponse deleteCloudAccess(DeleteCloudAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudAccessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a company.</p>
     * 
     * @param request DeleteCompanyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCompanyResponse
     */
    public DeleteCompanyResponse deleteCompanyWithOptions(DeleteCompanyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("CompanyId", request.companyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCompany"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCompanyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a company.</p>
     * 
     * @param request DeleteCompanyRequest
     * @return DeleteCompanyResponse
     */
    public DeleteCompanyResponse deleteCompany(DeleteCompanyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCompanyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a contact.</p>
     * 
     * @param request DeleteContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContactResponse
     */
    public DeleteContactResponse deleteContactWithOptions(DeleteContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContact"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a contact.</p>
     * 
     * @param request DeleteContactRequest
     * @return DeleteContactResponse
     */
    public DeleteContactResponse deleteContact(DeleteContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a certificate signing request (CSR).</p>
     * 
     * @param request DeleteCsrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCsrResponse
     */
    public DeleteCsrResponse deleteCsrWithOptions(DeleteCsrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.csrId)) {
            query.put("CsrId", request.csrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCsr"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCsrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a certificate signing request (CSR).</p>
     * 
     * @param request DeleteCsrRequest
     * @return DeleteCsrResponse
     */
    public DeleteCsrResponse deleteCsr(DeleteCsrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCsrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a certificate deployment task.</p>
     * 
     * @param request DeleteDeploymentJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDeploymentJobResponse
     */
    public DeleteDeploymentJobResponse deleteDeploymentJobWithOptions(DeleteDeploymentJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeploymentJob"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeploymentJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a certificate deployment task.</p>
     * 
     * @param request DeleteDeploymentJobRequest
     * @return DeleteDeploymentJobResponse
     */
    public DeleteDeploymentJobResponse deleteDeploymentJob(DeleteDeploymentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeploymentJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Certificate Management Service instance.</p>
     * 
     * @param request DeleteInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Certificate Management Service instance.</p>
     * 
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeletePCACert operation to delete a private certificate from a certificate application repository.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a private certificate from a certificate application repository.</p>
     * 
     * @param request DeletePCACertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePCACertResponse
     */
    public DeletePCACertResponse deletePCACertWithOptions(DeletePCACertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePCACert"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePCACertResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeletePCACert operation to delete a private certificate from a certificate application repository.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a private certificate from a certificate application repository.</p>
     * 
     * @param request DeletePCACertRequest
     * @return DeletePCACertResponse
     */
    public DeletePCACertResponse deletePCACert(DeletePCACertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePCACertWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is limited to 100 queries per second (QPS) per user. API calls exceeding this limit are throttled, which can impact your business. We recommend calling this operation at a reasonable rate to avoid this.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an expired, revoked, or manually uploaded certificate from Certificate Management Service.</p>
     * 
     * @param request DeleteUserCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserCertificateResponse
     */
    public DeleteUserCertificateResponse deleteUserCertificateWithOptions(DeleteUserCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            query.put("CertId", request.certId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserCertificate"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is limited to 100 queries per second (QPS) per user. API calls exceeding this limit are throttled, which can impact your business. We recommend calling this operation at a reasonable rate to avoid this.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an expired, revoked, or manually uploaded certificate from Certificate Management Service.</p>
     * 
     * @param request DeleteUserCertificateRequest
     * @return DeleteUserCertificateResponse
     */
    public DeleteUserCertificateResponse deleteUserCertificate(DeleteUserCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes a certificate warehouse.</p>
     * <h3>QPS limit</h3>
     * <p>This operation has a QPS limit of 10 requests per second per user. Exceeding this limit causes subsequent API calls to be throttled, which can impact your services. To ensure service availability, call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a certificate warehouse.</p>
     * 
     * @param request DeleteWarehouseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWarehouseResponse
     */
    public DeleteWarehouseResponse deleteWarehouseWithOptions(DeleteWarehouseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.warehouseInstanceId)) {
            query.put("WarehouseInstanceId", request.warehouseInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWarehouse"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWarehouseResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes a certificate warehouse.</p>
     * <h3>QPS limit</h3>
     * <p>This operation has a QPS limit of 10 requests per second per user. Exceeding this limit causes subsequent API calls to be throttled, which can impact your services. To ensure service availability, call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a certificate warehouse.</p>
     * 
     * @param request DeleteWarehouseRequest
     * @return DeleteWarehouseResponse
     */
    public DeleteWarehouseResponse deleteWarehouse(DeleteWarehouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWarehouseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a worker task from a certificate deployment task.</p>
     * 
     * @param request DeleteWorkerResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkerResourceResponse
     */
    public DeleteWorkerResourceResponse deleteWorkerResourceWithOptions(DeleteWorkerResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerId)) {
            query.put("WorkerId", request.workerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkerResource"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkerResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a worker task from a certificate deployment task.</p>
     * 
     * @param request DeleteWorkerResourceRequest
     * @return DeleteWorkerResourceResponse
     */
    public DeleteWorkerResourceResponse deleteWorkerResource(DeleteWorkerResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkerResourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you have not completed domain ownership validation after submitting a certificate request, you can call this operation to obtain the information required to complete domain validation. Using the returned domain validation information, you can complete domain validation on the DNS management platform (DNS validation method) or on the domain server (file validation method).
     * Your certificate request will enter the CA center review stage only after you complete domain validation. After the CA center approves your certificate request, a certificate will be issued to you. If the certificate has been issued, you can call this operation to obtain the issued certificate file and private key content.
     * &lt;props=&quot;china&quot;&gt;
     * For the complete process of requesting a certificate using the resource plan API, see <a href="https://help.aliyun.com/document_detail/204741.html">Process of requesting a certificate using API operations</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a certificate application order, such as domain validation progress.</p>
     * 
     * @param request DescribeCertificateStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCertificateStateResponse
     */
    public DescribeCertificateStateResponse describeCertificateStateWithOptions(DescribeCertificateStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCertificateState"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCertificateStateResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you have not completed domain ownership validation after submitting a certificate request, you can call this operation to obtain the information required to complete domain validation. Using the returned domain validation information, you can complete domain validation on the DNS management platform (DNS validation method) or on the domain server (file validation method).
     * Your certificate request will enter the CA center review stage only after you complete domain validation. After the CA center approves your certificate request, a certificate will be issued to you. If the certificate has been issued, you can call this operation to obtain the issued certificate file and private key content.
     * &lt;props=&quot;china&quot;&gt;
     * For the complete process of requesting a certificate using the resource plan API, see <a href="https://help.aliyun.com/document_detail/204741.html">Process of requesting a certificate using API operations</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a certificate application order, such as domain validation progress.</p>
     * 
     * @param request DescribeCertificateStateRequest
     * @return DescribeCertificateStateResponse
     */
    public DescribeCertificateStateResponse describeCertificateState(DescribeCertificateStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCertificateStateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of cloud resources on which certificates were deployed by using a multi-cloud deployment task.</p>
     * 
     * @param request DescribeCloudResourceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudResourceStatusResponse
     */
    public DescribeCloudResourceStatusResponse describeCloudResourceStatusWithOptions(DescribeCloudResourceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.secretId)) {
            query.put("SecretId", request.secretId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudResourceStatus"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudResourceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of cloud resources on which certificates were deployed by using a multi-cloud deployment task.</p>
     * 
     * @param request DescribeCloudResourceStatusRequest
     * @return DescribeCloudResourceStatusResponse
     */
    public DescribeCloudResourceStatusResponse describeCloudResourceStatus(DescribeCloudResourceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudResourceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about a certificate deployment task, including the task status, target resources, and certificates.</p>
     * 
     * @param request DescribeDeploymentJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeploymentJobResponse
     */
    public DescribeDeploymentJobResponse describeDeploymentJobWithOptions(DescribeDeploymentJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeploymentJob"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeploymentJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about a certificate deployment task, including the task status, target resources, and certificates.</p>
     * 
     * @param request DescribeDeploymentJobRequest
     * @return DescribeDeploymentJobResponse
     */
    public DescribeDeploymentJobResponse describeDeploymentJob(DescribeDeploymentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeploymentJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution status summary of a certificate deployment task, including the number of succeeded and failed workers.</p>
     * 
     * @param request DescribeDeploymentJobStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeploymentJobStatusResponse
     */
    public DescribeDeploymentJobStatusResponse describeDeploymentJobStatusWithOptions(DescribeDeploymentJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeploymentJobStatus"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeploymentJobStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution status summary of a certificate deployment task, including the number of succeeded and failed workers.</p>
     * 
     * @param request DescribeDeploymentJobStatusRequest
     * @return DescribeDeploymentJobStatusResponse
     */
    public DescribeDeploymentJobStatusResponse describeDeploymentJobStatus(DescribeDeploymentJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeploymentJobStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota and usage of domain validated (DV) certificate packages.</p>
     * 
     * @param request DescribePackageStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePackageStateResponse
     */
    public DescribePackageStateResponse describePackageStateWithOptions(DescribePackageStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePackageState"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePackageStateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota and usage of domain validated (DV) certificate packages.</p>
     * 
     * @param request DescribePackageStateRequest
     * @return DescribePackageStateResponse
     */
    public DescribePackageStateResponse describePackageState(DescribePackageStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePackageStateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a certificate stored in a certificate warehouse.</p>
     * 
     * @param request DescribeWarehouseCertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWarehouseCertResponse
     */
    public DescribeWarehouseCertResponse describeWarehouseCertWithOptions(DescribeWarehouseCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWarehouseCert"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWarehouseCertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a certificate stored in a certificate warehouse.</p>
     * 
     * @param request DescribeWarehouseCertRequest
     * @return DescribeWarehouseCertResponse
     */
    public DescribeWarehouseCertResponse describeWarehouseCert(DescribeWarehouseCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWarehouseCertWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for a single user is 10. If you exceed this limit, API calls are throttled, which may affect your business. To prevent this, call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Encrypts data by using a certificate in a certificate application repository.</p>
     * 
     * @param request EncryptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EncryptResponse
     */
    public EncryptResponse encryptWithOptions(EncryptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customIdentifier)) {
            query.put("CustomIdentifier", request.customIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            query.put("MessageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plaintext)) {
            query.put("Plaintext", request.plaintext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warehouseId)) {
            query.put("WarehouseId", request.warehouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Encrypt"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EncryptResponse());
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for a single user is 10. If you exceed this limit, API calls are throttled, which may affect your business. To prevent this, call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Encrypts data by using a certificate in a certificate application repository.</p>
     * 
     * @param request EncryptRequest
     * @return EncryptResponse
     */
    public EncryptResponse encrypt(EncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.encryptWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the number of CA certificates (including root CA certificates and subordinate CA certificates) that you have created.</p>
     * <h2>QPS limit</h2>
     * <p>The China single-user QPS limit for this API is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of assets.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAssetCountResponse
     */
    public GetAssetCountResponse getAssetCountWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAssetCount"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAssetCountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the number of CA certificates (including root CA certificates and subordinate CA certificates) that you have created.</p>
     * <h2>QPS limit</h2>
     * <p>The China single-user QPS limit for this API is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of assets.</p>
     * @return GetAssetCountResponse
     */
    public GetAssetCountResponse getAssetCount() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAssetCountWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed the limit, your API calls are throttled. This may impact your business. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the remaining quota for certificate application repository operations.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCertWarehouseQuotaResponse
     */
    public GetCertWarehouseQuotaResponse getCertWarehouseQuotaWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCertWarehouseQuota"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCertWarehouseQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed the limit, your API calls are throttled. This may impact your business. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the remaining quota for certificate application repository operations.</p>
     * @return GetCertWarehouseQuotaResponse
     */
    public GetCertWarehouseQuotaResponse getCertWarehouseQuota() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCertWarehouseQuotaWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves certificate details, excluding the certificate body and private key.</p>
     * 
     * @param request GetCertificateDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCertificateDetailResponse
     */
    public GetCertificateDetailResponse getCertificateDetailWithOptions(GetCertificateDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCertificateDetail"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCertificateDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves certificate details, excluding the certificate body and private key.</p>
     * 
     * @param request GetCertificateDetailRequest
     * @return GetCertificateDetailResponse
     */
    public GetCertificateDetailResponse getCertificateDetail(GetCertificateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCertificateDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a company.</p>
     * 
     * @param request GetCompanyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCompanyResponse
     */
    public GetCompanyResponse getCompanyWithOptions(GetCompanyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("CompanyId", request.companyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompany"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a company.</p>
     * 
     * @param request GetCompanyRequest
     * @return GetCompanyResponse
     */
    public GetCompanyResponse getCompany(GetCompanyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCompanyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a contact.</p>
     * 
     * @param request GetContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContactResponse
     */
    public GetContactResponse getContactWithOptions(GetContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContact"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a contact.</p>
     * 
     * @param request GetContactRequest
     * @return GetContactResponse
     */
    public GetContactResponse getContact(GetContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the content of a certificate signing request (CSR).</p>
     * 
     * @param request GetCsrDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCsrDetailResponse
     */
    public GetCsrDetailResponse getCsrDetailWithOptions(GetCsrDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.csrId)) {
            query.put("CsrId", request.csrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCsrDetail"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCsrDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the content of a certificate signing request (CSR).</p>
     * 
     * @param request GetCsrDetailRequest
     * @return GetCsrDetailResponse
     */
    public GetCsrDetailResponse getCsrDetail(GetCsrDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCsrDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an instance.</p>
     * 
     * @param request GetInstanceDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceDetailResponse
     */
    public GetInstanceDetailResponse getInstanceDetailWithOptions(GetInstanceDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceDetail"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an instance.</p>
     * 
     * @param request GetInstanceDetailRequest
     * @return GetInstanceDetailResponse
     */
    public GetInstanceDetailResponse getInstanceDetail(GetInstanceDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the summary statistics of Certificate Management Service instances, such as certificate counts by status.</p>
     * 
     * @param request GetInstanceSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceSummaryResponse
     */
    public GetInstanceSummaryResponse getInstanceSummaryWithOptions(GetInstanceSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceSummary"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the summary statistics of Certificate Management Service instances, such as certificate counts by status.</p>
     * 
     * @param request GetInstanceSummaryRequest
     * @return GetInstanceSummaryResponse
     */
    public GetInstanceSummaryResponse getInstanceSummary(GetInstanceSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>本接口用于通过私有 CA 实例的 ID，查询您通过 SSL 证书服务控制台购买的私有 CA 实例的状态信息，例如，CA 实例的状态、包含的证书数量、已签发的证书数量等。
     * 调用本接口前，您必须已经通过<a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">数字证书管理服务控制台</a>购买了私有 CA。具体操作，请参见<a href="https://help.aliyun.com/document_detail/208553.html">购买私有 CA</a>。</p>
     * <h2>QPS 限制</h2>
     * <p>本接口的单用户 QPS 限制为 10 次/秒。超过限制，API 调用将会被限流，这可能影响您的业务，请合理调用。</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the resources that match a certificate.</p>
     * 
     * @param request GetMatchedResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMatchedResourcesResponse
     */
    public GetMatchedResourcesResponse getMatchedResourcesWithOptions(GetMatchedResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certIds)) {
            query.put("CertIds", request.certIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceScope)) {
            query.put("ResourceScope", request.resourceScope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMatchedResources"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMatchedResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>本接口用于通过私有 CA 实例的 ID，查询您通过 SSL 证书服务控制台购买的私有 CA 实例的状态信息，例如，CA 实例的状态、包含的证书数量、已签发的证书数量等。
     * 调用本接口前，您必须已经通过<a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">数字证书管理服务控制台</a>购买了私有 CA。具体操作，请参见<a href="https://help.aliyun.com/document_detail/208553.html">购买私有 CA</a>。</p>
     * <h2>QPS 限制</h2>
     * <p>本接口的单用户 QPS 限制为 10 次/秒。超过限制，API 调用将会被限流，这可能影响您的业务，请合理调用。</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the resources that match a certificate.</p>
     * 
     * @param request GetMatchedResourcesRequest
     * @return GetMatchedResourcesResponse
     */
    public GetMatchedResourcesResponse getMatchedResources(GetMatchedResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMatchedResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the number of created Certificate Authority (CA) certificates, including root and subordinate CA certificates.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, API calls are rate-limited, which may affect your business. We recommend that you call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of assets with certificate-related risks, such as expired or soon-to-expire certificates.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRiskCountResponse
     */
    public GetRiskCountResponse getRiskCountWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRiskCount"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRiskCountResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the number of created Certificate Authority (CA) certificates, including root and subordinate CA certificates.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, API calls are rate-limited, which may affect your business. We recommend that you call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of assets with certificate-related risks, such as expired or soon-to-expire certificates.</p>
     * @return GetRiskCountResponse
     */
    public GetRiskCountResponse getRiskCount() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRiskCountWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the processing result and status of a submitted certificate application.</p>
     * 
     * @param request GetTaskAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskAttributeResponse
     */
    public GetTaskAttributeResponse getTaskAttributeWithOptions(GetTaskAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskAttribute"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the processing result and status of a submitted certificate application.</p>
     * 
     * @param request GetTaskAttributeRequest
     * @return GetTaskAttributeResponse
     */
    public GetTaskAttributeResponse getTaskAttribute(GetTaskAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The China single-user queries per second (QPS) limit for this operation is 100. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a certificate, including basic information and public/private key content. You can use this operation to download the certificate content and private key.</p>
     * 
     * @param request GetUserCertificateDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserCertificateDetailResponse
     */
    public GetUserCertificateDetailResponse getUserCertificateDetailWithOptions(GetUserCertificateDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certFilter)) {
            query.put("CertFilter", request.certFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            query.put("CertId", request.certId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserCertificateDetail"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserCertificateDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>The China single-user queries per second (QPS) limit for this operation is 100. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a certificate, including basic information and public/private key content. You can use this operation to download the certificate content and private key.</p>
     * 
     * @param request GetUserCertificateDetailRequest
     * @return GetUserCertificateDetailResponse
     */
    public GetUserCertificateDetailResponse getUserCertificateDetail(GetUserCertificateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserCertificateDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the number of CA certificates (including root CA certificates and subordinate CA certificates) that you have created.</p>
     * <h2>QPS limit</h2>
     * <p>The China single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource statistics list of cloud services.</p>
     * 
     * @param request ListAssetCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAssetCountResponse
     */
    public ListAssetCountResponse listAssetCountWithOptions(ListAssetCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAssetCount"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAssetCountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the number of CA certificates (including root CA certificates and subordinate CA certificates) that you have created.</p>
     * <h2>QPS limit</h2>
     * <p>The China single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource statistics list of cloud services.</p>
     * 
     * @param request ListAssetCountRequest
     * @return ListAssetCountResponse
     */
    public ListAssetCountResponse listAssetCount(ListAssetCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAssetCountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The single-user QPS limit for this API is 10. Calls exceeding this limit are throttled, which may impact your business. Plan your API calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>This API queries certificates in the certificate store.</p>
     * 
     * @param request ListCertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCertResponse
     */
    public ListCertResponse listCertWithOptions(ListCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certType)) {
            query.put("CertType", request.certType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifiers)) {
            query.put("Identifiers", request.identifiers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warehouseId)) {
            query.put("WarehouseId", request.warehouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCert"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCertResponse());
    }

    /**
     * <b>description</b> :
     * <p>The single-user QPS limit for this API is 10. Calls exceeding this limit are throttled, which may impact your business. Plan your API calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>This API queries certificates in the certificate store.</p>
     * 
     * @param request ListCertRequest
     * @return ListCertResponse
     */
    public ListCertResponse listCert(ListCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCertWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the ListCertWarehouse operation to query certificate repositories.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificate application repositories in your account.</p>
     * 
     * @param request ListCertWarehouseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCertWarehouseResponse
     */
    public ListCertWarehouseResponse listCertWarehouseWithOptions(ListCertWarehouseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCertWarehouse"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCertWarehouseResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the ListCertWarehouse operation to query certificate repositories.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificate application repositories in your account.</p>
     * 
     * @param request ListCertWarehouseRequest
     * @return ListCertWarehouseResponse
     */
    public ListCertWarehouseResponse listCertWarehouse(ListCertWarehouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCertWarehouseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the certificates managed by Certificate Management Service.</p>
     * 
     * @param request ListCertificatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificatesWithOptions(ListCertificatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateSource)) {
            query.put("CertificateSource", request.certificateSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateStatus)) {
            query.put("CertificateStatus", request.certificateStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCertificates"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCertificatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the certificates managed by Certificate Management Service.</p>
     * 
     * @param request ListCertificatesRequest
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCertificatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the AccessKey pairs that are configured for multi-cloud certificate deployment.</p>
     * 
     * @param request ListCloudAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudAccessResponse
     */
    public ListCloudAccessResponse listCloudAccessWithOptions(ListCloudAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudName)) {
            query.put("CloudName", request.cloudName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretId)) {
            query.put("SecretId", request.secretId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudAccess"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudAccessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the AccessKey pairs that are configured for multi-cloud certificate deployment.</p>
     * 
     * @param request ListCloudAccessRequest
     * @return ListCloudAccessResponse
     */
    public ListCloudAccessResponse listCloudAccess(ListCloudAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudAccessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cloud resources on which certificates are deployed, such as Server Load Balancer (SLB) instances and CDN domains.</p>
     * 
     * @param tmpReq ListCloudResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudResourcesResponse
     */
    public ListCloudResourcesResponse listCloudResourcesWithOptions(ListCloudResourcesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCloudResourcesShrinkRequest request = new ListCloudResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.certIds)) {
            request.certIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.certIds, "CertIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certIdsShrink)) {
            query.put("CertIds", request.certIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudName)) {
            query.put("CloudName", request.cloudName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudProduct)) {
            query.put("CloudProduct", request.cloudProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretId)) {
            query.put("SecretId", request.secretId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudResources"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cloud resources on which certificates are deployed, such as Server Load Balancer (SLB) instances and CDN domains.</p>
     * 
     * @param request ListCloudResourcesRequest
     * @return ListCloudResourcesResponse
     */
    public ListCloudResourcesResponse listCloudResources(ListCloudResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of companies.</p>
     * 
     * @param request ListCompaniesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCompaniesResponse
     */
    public ListCompaniesResponse listCompaniesWithOptions(ListCompaniesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("CompanyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCompanies"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCompaniesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of companies.</p>
     * 
     * @param request ListCompaniesRequest
     * @return ListCompaniesResponse
     */
    public ListCompaniesResponse listCompanies(ListCompaniesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCompaniesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of contacts.</p>
     * 
     * @param request ListContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContactResponse
     */
    public ListContactResponse listContactWithOptions(ListContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListContact"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of contacts.</p>
     * 
     * @param request ListContactRequest
     * @return ListContactResponse
     */
    public ListContactResponse listContact(ListContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the certificate signing requests (CSRs) in your account.</p>
     * 
     * @param request ListCsrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCsrResponse
     */
    public ListCsrResponse listCsrWithOptions(ListCsrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCsr"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCsrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the certificate signing requests (CSRs) in your account.</p>
     * 
     * @param request ListCsrRequest
     * @return ListCsrResponse
     */
    public ListCsrResponse listCsr(ListCsrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCsrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of deployment tasks after you create a deployment task.</p>
     * 
     * @param request ListDeploymentJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeploymentJobResponse
     */
    public ListDeploymentJobResponse listDeploymentJobWithOptions(ListDeploymentJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeploymentJob"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeploymentJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of deployment tasks after you create a deployment task.</p>
     * 
     * @param request ListDeploymentJobRequest
     * @return ListDeploymentJobResponse
     */
    public ListDeploymentJobResponse listDeploymentJob(ListDeploymentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeploymentJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the certificates associated with a deployment task, such as the certificate instance ID, type, and name.</p>
     * 
     * @param request ListDeploymentJobCertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeploymentJobCertResponse
     */
    public ListDeploymentJobCertResponse listDeploymentJobCertWithOptions(ListDeploymentJobCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeploymentJobCert"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeploymentJobCertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the certificates associated with a deployment task, such as the certificate instance ID, type, and name.</p>
     * 
     * @param request ListDeploymentJobCertRequest
     * @return ListDeploymentJobCertResponse
     */
    public ListDeploymentJobCertResponse listDeploymentJobCert(ListDeploymentJobCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeploymentJobCertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cloud resources associated with a deployment task. An empty list indicates that the resources are invalid and must be re-associated.</p>
     * 
     * @param request ListDeploymentJobResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeploymentJobResourceResponse
     */
    public ListDeploymentJobResourceResponse listDeploymentJobResourceWithOptions(ListDeploymentJobResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeploymentJobResource"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeploymentJobResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cloud resources associated with a deployment task. An empty list indicates that the resources are invalid and must be re-associated.</p>
     * 
     * @param request ListDeploymentJobResourceRequest
     * @return ListDeploymentJobResourceResponse
     */
    public ListDeploymentJobResourceResponse listDeploymentJobResource(ListDeploymentJobResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeploymentJobResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of instances.</p>
     * 
     * @param request ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brand)) {
            query.put("Brand", request.brand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateStatus)) {
            query.put("CertificateStatus", request.certificateStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateType)) {
            query.put("CertificateType", request.certificateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of instances.</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to query the list of user certificates or orders. If OrderType is set to CERT or UPLOAD, the certificate list is queried. If OrderType is set to CPACK or BUY, the order list is queried.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of user certificates or orders.</p>
     * 
     * @param request ListUserCertificateOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserCertificateOrderResponse
     */
    public ListUserCertificateOrderResponse listUserCertificateOrderWithOptions(ListUserCertificateOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserCertificateOrder"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserCertificateOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to query the list of user certificates or orders. If OrderType is set to CERT or UPLOAD, the certificate list is queried. If OrderType is set to CPACK or BUY, the order list is queried.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of user certificates or orders.</p>
     * 
     * @param request ListUserCertificateOrderRequest
     * @return ListUserCertificateOrderResponse
     */
    public ListUserCertificateOrderResponse listUserCertificateOrder(ListUserCertificateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserCertificateOrderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation lists your warehouses.</p>
     * <h3>QPS limit</h3>
     * <p>This operation has a per-user QPS limit of 10 requests per second. Calls exceeding this limit are throttled, which can affect your business.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists warehouses.</p>
     * 
     * @param tmpReq ListWarehouseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWarehouseResponse
     */
    public ListWarehouseResponse listWarehouseWithOptions(ListWarehouseRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWarehouseShrinkRequest request = new ListWarehouseShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.warehouseInstanceIds)) {
            request.warehouseInstanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.warehouseInstanceIds, "WarehouseInstanceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.warehouseTypes)) {
            request.warehouseTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.warehouseTypes, "WarehouseTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warehouseInstanceIdsShrink)) {
            query.put("WarehouseInstanceIds", request.warehouseInstanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warehouseTypesShrink)) {
            query.put("WarehouseTypes", request.warehouseTypesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWarehouse"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWarehouseResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation lists your warehouses.</p>
     * <h3>QPS limit</h3>
     * <p>This operation has a per-user QPS limit of 10 requests per second. Calls exceeding this limit are throttled, which can affect your business.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists warehouses.</p>
     * 
     * @param request ListWarehouseRequest
     * @return ListWarehouseResponse
     */
    public ListWarehouseResponse listWarehouse(ListWarehouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWarehouseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the worker tasks of a deployment task. Each worker task deploys a certificate to a specific cloud resource in a cloud service.</p>
     * 
     * @param request ListWorkerResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkerResourceResponse
     */
    public ListWorkerResourceResponse listWorkerResourceWithOptions(ListWorkerResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudProduct)) {
            query.put("CloudProduct", request.cloudProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkerResource"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkerResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the worker tasks of a deployment task. Each worker task deploys a certificate to a specific cloud resource in a cloud service.</p>
     * 
     * @param request ListWorkerResourceRequest
     * @return ListWorkerResourceResponse
     */
    public ListWorkerResourceResponse listWorkerResource(ListWorkerResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkerResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which a certificate or certificate order belongs.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which a certificate or certificate order belongs.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Refunds an instance within 7 days.</p>
     * 
     * @param request RefundInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefundInstanceResponse
     */
    public RefundInstanceResponse refundInstanceWithOptions(RefundInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundInstance"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefundInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Refunds an instance within 7 days.</p>
     * 
     * @param request RefundInstanceRequest
     * @return RefundInstanceResponse
     */
    public RefundInstanceResponse refundInstance(RefundInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refundInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the RenewCertificateOrderForPackageRequest operation to submit a renewal application for a certificate only when the order of the certificate is in the expiring state. After the renewal is complete, a new certificate order whose status is pending application is generated. You must submit a certificate application for the new certificate order and install the new certificate after the new certificate is issued.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/164111.html">DescribeCertificateState</a> operation to query the status of a certificate application order. If the value of the <strong>Type</strong> response parameter is <strong>certificate</strong>, the certificate is issued.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Submits a renewal application for an issued SSL certificate.</p>
     * 
     * @param request RenewCertificateOrderForPackageRequestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewCertificateOrderForPackageRequestResponse
     */
    public RenewCertificateOrderForPackageRequestResponse renewCertificateOrderForPackageRequestWithOptions(RenewCertificateOrderForPackageRequestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.csr)) {
            query.put("Csr", request.csr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewCertificateOrderForPackageRequest"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewCertificateOrderForPackageRequestResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the RenewCertificateOrderForPackageRequest operation to submit a renewal application for a certificate only when the order of the certificate is in the expiring state. After the renewal is complete, a new certificate order whose status is pending application is generated. You must submit a certificate application for the new certificate order and install the new certificate after the new certificate is issued.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/164111.html">DescribeCertificateState</a> operation to query the status of a certificate application order. If the value of the <strong>Type</strong> response parameter is <strong>certificate</strong>, the certificate is issued.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Submits a renewal application for an issued SSL certificate.</p>
     * 
     * @param request RenewCertificateOrderForPackageRequestRequest
     * @return RenewCertificateOrderForPackageRequestResponse
     */
    public RenewCertificateOrderForPackageRequestResponse renewCertificateOrderForPackageRequest(RenewCertificateOrderForPackageRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewCertificateOrderForPackageRequestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a certificate.</p>
     * 
     * @param request RevokeCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeCertificateResponse
     */
    public RevokeCertificateResponse revokeCertificateWithOptions(RevokeCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeCertificate"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a certificate.</p>
     * 
     * @param request RevokeCertificateRequest
     * @return RevokeCertificateResponse
     */
    public RevokeCertificateResponse revokeCertificate(RevokeCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The rate limit for this API is 10 queries per second (QPS) per user. If you exceed this limit, subsequent API calls will be throttled, which can disrupt your services. We recommend that you call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes a client certificate from the certificate repository.</p>
     * 
     * @param request RevokeWHClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeWHClientCertificateResponse
     */
    public RevokeWHClientCertificateResponse revokeWHClientCertificateWithOptions(RevokeWHClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeWHClientCertificate"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeWHClientCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>The rate limit for this API is 10 queries per second (QPS) per user. If you exceed this limit, subsequent API calls will be throttled, which can disrupt your services. We recommend that you call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes a client certificate from the certificate repository.</p>
     * 
     * @param request RevokeWHClientCertificateRequest
     * @return RevokeWHClientCertificateResponse
     */
    public RevokeWHClientCertificateResponse revokeWHClientCertificate(RevokeWHClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeWHClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a digital signature with a PCA certificate from a certificate repository.</p>
     * <h3>QPS limit</h3>
     * <p>This operation supports up to 1,000 queries per second (QPS) for a single user. If you exceed this limit, the system throttles your API calls, which can impact your business. Plan your API calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation creates a digital signature with a PCA certificate from a certificate repository.</p>
     * 
     * @param request SignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SignResponse
     */
    public SignResponse signWithOptions(SignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customIdentifier)) {
            query.put("CustomIdentifier", request.customIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            query.put("MessageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signingAlgorithm)) {
            query.put("SigningAlgorithm", request.signingAlgorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warehouseId)) {
            query.put("WarehouseId", request.warehouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Sign"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SignResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a digital signature with a PCA certificate from a certificate repository.</p>
     * <h3>QPS limit</h3>
     * <p>This operation supports up to 1,000 queries per second (QPS) for a single user. If you exceed this limit, the system throttles your API calls, which can impact your business. Plan your API calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation creates a digital signature with a PCA certificate from a certificate repository.</p>
     * 
     * @param request SignRequest
     * @return SignResponse
     */
    public SignResponse sign(SignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.signWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates company information.</p>
     * 
     * @param request UpdateCompanyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCompanyResponse
     */
    public UpdateCompanyResponse updateCompanyWithOptions(UpdateCompanyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyAddress)) {
            query.put("CompanyAddress", request.companyAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyCode)) {
            query.put("CompanyCode", request.companyCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyEmail)) {
            query.put("CompanyEmail", request.companyEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("CompanyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            query.put("CompanyName", request.companyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyPhone)) {
            query.put("CompanyPhone", request.companyPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyType)) {
            query.put("CompanyType", request.companyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            query.put("CountryCode", request.countryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.department)) {
            query.put("Department", request.department);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postCode)) {
            query.put("PostCode", request.postCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCompany"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCompanyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates company information.</p>
     * 
     * @param request UpdateCompanyRequest
     * @return UpdateCompanyResponse
     */
    public UpdateCompanyResponse updateCompany(UpdateCompanyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCompanyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a contact.</p>
     * 
     * @param request UpdateContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContactResponse
     */
    public UpdateContactResponse updateContactWithOptions(UpdateContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idcard)) {
            query.put("Idcard", request.idcard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhooks)) {
            query.put("Webhooks", request.webhooks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContact"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a contact.</p>
     * 
     * @param request UpdateContactRequest
     * @return UpdateContactResponse
     */
    public UpdateContactResponse updateContact(UpdateContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads the private key corresponding to a CSR if the private key was not provided when the local CSR was uploaded.</p>
     * 
     * @param request UpdateCsrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCsrResponse
     */
    public UpdateCsrResponse updateCsrWithOptions(UpdateCsrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.csrId)) {
            query.put("CsrId", request.csrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCsr"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCsrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads the private key corresponding to a CSR if the private key was not provided when the local CSR was uploaded.</p>
     * 
     * @param request UpdateCsrRequest
     * @return UpdateCsrResponse
     */
    public UpdateCsrResponse updateCsr(UpdateCsrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCsrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a certificate deployment task, such as the certificates or target resources.</p>
     * 
     * @param request UpdateDeploymentJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDeploymentJobResponse
     */
    public UpdateDeploymentJobResponse updateDeploymentJobWithOptions(UpdateDeploymentJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certIds)) {
            query.put("CertIds", request.certIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactIds)) {
            query.put("ContactIds", request.contactIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTime)) {
            query.put("ScheduleTime", request.scheduleTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeploymentJob"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeploymentJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a certificate deployment task, such as the certificates or target resources.</p>
     * 
     * @param request UpdateDeploymentJobRequest
     * @return UpdateDeploymentJobResponse
     */
    public UpdateDeploymentJobResponse updateDeploymentJob(UpdateDeploymentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDeploymentJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of a certificate deployment task, such as changing from editing to pending execution.</p>
     * 
     * @param request UpdateDeploymentJobStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDeploymentJobStatusResponse
     */
    public UpdateDeploymentJobStatusResponse updateDeploymentJobStatusWithOptions(UpdateDeploymentJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeploymentJobStatus"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeploymentJobStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of a certificate deployment task, such as changing from editing to pending execution.</p>
     * 
     * @param request UpdateDeploymentJobStatusRequest
     * @return UpdateDeploymentJobStatusResponse
     */
    public UpdateDeploymentJobStatusResponse updateDeploymentJobStatus(UpdateDeploymentJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDeploymentJobStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a Certificate Management Service instance.</p>
     * 
     * @param request UpdateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoReissue)) {
            query.put("AutoReissue", request.autoReissue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateName)) {
            query.put("CertificateName", request.certificateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("CompanyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactIdList)) {
            query.put("ContactIdList", request.contactIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            query.put("CountryCode", request.countryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.csr)) {
            query.put("Csr", request.csr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateCsrMethod)) {
            query.put("GenerateCsrMethod", request.generateCsrMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyAlgorithm)) {
            query.put("KeyAlgorithm", request.keyAlgorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validationMethod)) {
            query.put("ValidationMethod", request.validationMethod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a Certificate Management Service instance.</p>
     * 
     * @param request UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Rolls back or re-executes a worker task in a certificate deployment task.</p>
     * 
     * @param request UpdateWorkerResourceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkerResourceStatusResponse
     */
    public UpdateWorkerResourceStatusResponse updateWorkerResourceStatusWithOptions(UpdateWorkerResourceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerId)) {
            query.put("WorkerId", request.workerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkerResourceStatus"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkerResourceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Rolls back or re-executes a worker task in a certificate deployment task.</p>
     * 
     * @param request UpdateWorkerResourceStatusRequest
     * @return UpdateWorkerResourceStatusResponse
     */
    public UpdateWorkerResourceStatusResponse updateWorkerResourceStatus(UpdateWorkerResourceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkerResourceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads an existing certificate signing request (CSR) to Certificate Management Service. After the upload, you can use the CSR to apply for certificates.</p>
     * 
     * @param request UploadCsrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadCsrResponse
     */
    public UploadCsrResponse uploadCsrWithOptions(UploadCsrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.csr)) {
            query.put("Csr", request.csr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadCsr"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadCsrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads an existing certificate signing request (CSR) to Certificate Management Service. After the upload, you can use the CSR to apply for certificates.</p>
     * 
     * @param request UploadCsrRequest
     * @return UploadCsrResponse
     */
    public UploadCsrResponse uploadCsr(UploadCsrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadCsrWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Use this operation to upload a PCA certificate to a certificate warehouse.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for this operation is 10 requests per second per user. Exceeding this limit triggers throttling, which can affect your business.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads a PCA certificate to a certificate warehouse.</p>
     * 
     * @param request UploadPCACertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadPCACertResponse
     */
    public UploadPCACertResponse uploadPCACertWithOptions(UploadPCACertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cert)) {
            query.put("Cert", request.cert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateKey)) {
            query.put("PrivateKey", request.privateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warehouseId)) {
            query.put("WarehouseId", request.warehouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadPCACert"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadPCACertResponse());
    }

    /**
     * <b>description</b> :
     * <p>Use this operation to upload a PCA certificate to a certificate warehouse.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for this operation is 10 requests per second per user. Exceeding this limit triggers throttling, which can affect your business.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads a PCA certificate to a certificate warehouse.</p>
     * 
     * @param request UploadPCACertRequest
     * @return UploadPCACertResponse
     */
    public UploadPCACertResponse uploadPCACert(UploadPCACertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadPCACertWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this operation is 100 for each user. If you exceed this limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads a certificate and its private key to Certificate Management Service. Both SM and non-SM certificates are supported.</p>
     * 
     * @param request UploadUserCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadUserCertificateResponse
     */
    public UploadUserCertificateResponse uploadUserCertificateWithOptions(UploadUserCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cert)) {
            query.put("Cert", request.cert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptCert)) {
            query.put("EncryptCert", request.encryptCert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptPrivateKey)) {
            query.put("EncryptPrivateKey", request.encryptPrivateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signCert)) {
            query.put("SignCert", request.signCert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signPrivateKey)) {
            query.put("SignPrivateKey", request.signPrivateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadUserCertificate"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadUserCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this operation is 100 for each user. If you exceed this limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads a certificate and its private key to Certificate Management Service. Both SM and non-SM certificates are supported.</p>
     * 
     * @param request UploadUserCertificateRequest
     * @return UploadUserCertificateResponse
     */
    public UploadUserCertificateResponse uploadUserCertificate(UploadUserCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadUserCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API verifies the signatures of PCA certificates and SSL certificates in the certificate repository.</p>
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for this API is 1,000 for a single user. For your specific QPS limit, refer to the certificate repository. If you exceed this limit, API calls are throttled, which may affect your business. Plan your API calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies a data signature by using a private certificate in a certificate application repository.</p>
     * 
     * @param request VerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyResponse
     */
    public VerifyResponse verifyWithOptions(VerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customIdentifier)) {
            query.put("CustomIdentifier", request.customIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            query.put("MessageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureValue)) {
            query.put("SignatureValue", request.signatureValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signingAlgorithm)) {
            query.put("SigningAlgorithm", request.signingAlgorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warehouseId)) {
            query.put("WarehouseId", request.warehouseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Verify"),
            new TeaPair("version", "2020-04-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API verifies the signatures of PCA certificates and SSL certificates in the certificate repository.</p>
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for this API is 1,000 for a single user. For your specific QPS limit, refer to the certificate repository. If you exceed this limit, API calls are throttled, which may affect your business. Plan your API calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies a data signature by using a private certificate in a certificate application repository.</p>
     * 
     * @param request VerifyRequest
     * @return VerifyResponse
     */
    public VerifyResponse verify(VerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyWithOptions(request, runtime);
    }
}
