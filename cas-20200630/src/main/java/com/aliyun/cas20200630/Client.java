// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630;

import com.aliyun.tea.*;
import com.aliyun.cas20200630.models.*;

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
            new TeaPair("us-west-1", "cas.aliyuncs.com")
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
     * <h2>QPS limit</h2>
     * <p>This API operation is limited to 10 queries per second (QPS) per user. If you exceed this limit, the system throttles your API calls, which can affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Assigns the certificate quota to a subordinate certificate authority (CA) instance.</p>
     * 
     * @param request AssignCertificateCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssignCertificateCountResponse
     */
    public AssignCertificateCountResponse assignCertificateCountWithOptions(AssignCertificateCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certTotalCount)) {
            query.put("CertTotalCount", request.certTotalCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignCertificateCount"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssignCertificateCountResponse());
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>This API operation is limited to 10 queries per second (QPS) per user. If you exceed this limit, the system throttles your API calls, which can affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Assigns the certificate quota to a subordinate certificate authority (CA) instance.</p>
     * 
     * @param request AssignCertificateCountRequest
     * @return AssignCertificateCountResponse
     */
    public AssignCertificateCountResponse assignCertificateCount(AssignCertificateCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignCertificateCountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must create a root CA certificate by calling <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> and a subordinate CA certificate by calling <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a>. Only subordinate CA certificates can issue client certificates.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second per user. Calls that exceed this limit are throttled, which can impact your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a client certificate by using a system-generated certificate signing request (CSR). You must create a root CA certificate and a subordinate CA certificate before calling this operation.</p>
     * 
     * @param request CreateClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClientCertificateResponse
     */
    public CreateClientCertificateResponse createClientCertificateWithOptions(CreateClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.afterTime)) {
            query.put("AfterTime", request.afterTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            query.put("AliasName", request.aliasName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.customIdentifier)) {
            query.put("CustomIdentifier", request.customIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.days)) {
            query.put("Days", request.days);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCrl)) {
            query.put("EnableCrl", request.enableCrl);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.years)) {
            query.put("Years", request.years);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClientCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClientCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must create a root CA certificate by calling <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> and a subordinate CA certificate by calling <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a>. Only subordinate CA certificates can issue client certificates.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second per user. Calls that exceed this limit are throttled, which can impact your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a client certificate by using a system-generated certificate signing request (CSR). You must create a root CA certificate and a subordinate CA certificate before calling this operation.</p>
     * 
     * @param request CreateClientCertificateRequest
     * @return CreateClientCertificateResponse
     */
    public CreateClientCertificateResponse createClientCertificate(CreateClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must create a root CA certificate by calling <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> and a subordinate CA certificate by calling <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a>. Only subordinate CA certificates can issue client certificates.</p>
     * <h2>QPS limit</h2>
     * <p>This operation is limited to 10 queries per second (QPS) per user. If you exceed this limit, the system throttles your API calls, which may affect your business. We recommend that you plan your calls to avoid being throttled.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a client certificate by using a custom certificate signing request (CSR).</p>
     * 
     * @param request CreateClientCertificateWithCsrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClientCertificateWithCsrResponse
     */
    public CreateClientCertificateWithCsrResponse createClientCertificateWithCsrWithOptions(CreateClientCertificateWithCsrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.customIdentifier)) {
            query.put("CustomIdentifier", request.customIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.days)) {
            query.put("Days", request.days);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCrl)) {
            query.put("EnableCrl", request.enableCrl);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.years)) {
            query.put("Years", request.years);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClientCertificateWithCsr"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClientCertificateWithCsrResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must create a root CA certificate by calling <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> and a subordinate CA certificate by calling <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a>. Only subordinate CA certificates can issue client certificates.</p>
     * <h2>QPS limit</h2>
     * <p>This operation is limited to 10 queries per second (QPS) per user. If you exceed this limit, the system throttles your API calls, which may affect your business. We recommend that you plan your calls to avoid being throttled.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a client certificate by using a custom certificate signing request (CSR).</p>
     * 
     * @param request CreateClientCertificateWithCsrRequest
     * @return CreateClientCertificateWithCsrResponse
     */
    public CreateClientCertificateWithCsrResponse createClientCertificateWithCsr(CreateClientCertificateWithCsrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClientCertificateWithCsrWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>By default, the certificate subject is retrieved from the Certificate Signing Request (CSR). If you specify a certificate subject, the subject from the CSR is ignored and the specified subject is used to issue the certificate.
     * You must specify the key usage or extended key usage based on your scenario. The following examples show common scenarios:</p>
     * <ul>
     * <li>Server-side authentication certificate
     * Key usage: digitalSignature, keyEncipherment
     * Extended key usage: serverAuth</li>
     * <li>Client authentication certificate
     * Key usage: digitalSignature, keyEncipherment
     * Extended key usage: clientAuth</li>
     * <li>mTLS mutual authentication certificate
     * Key usage: digitalSignature, keyEncipherment
     * Extended key usage: serverAuth, clientAuth</li>
     * <li>Email signing certificate
     * Key usage: digitalSignature, contentCommitment
     * Extended key usage: emailProtection
     * Note: Compliance CAs are managed by third-party authorities and do not support this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Issues a custom digital certificate with specified subject, subject alternative names (SANs), key usage, and extended key usage attributes.</p>
     * 
     * @param request CreateCustomCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomCertificateResponse
     */
    public CreateCustomCertificateResponse createCustomCertificateWithOptions(CreateCustomCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiPassthrough)) {
            query.put("ApiPassthrough", request.apiPassthrough);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.csr)) {
            query.put("Csr", request.csr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCrl)) {
            query.put("EnableCrl", request.enableCrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.immediately)) {
            query.put("Immediately", request.immediately);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentIdentifier)) {
            query.put("ParentIdentifier", request.parentIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validity)) {
            query.put("Validity", request.validity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customIdentifier)) {
            query.put("customIdentifier", request.customIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>By default, the certificate subject is retrieved from the Certificate Signing Request (CSR). If you specify a certificate subject, the subject from the CSR is ignored and the specified subject is used to issue the certificate.
     * You must specify the key usage or extended key usage based on your scenario. The following examples show common scenarios:</p>
     * <ul>
     * <li>Server-side authentication certificate
     * Key usage: digitalSignature, keyEncipherment
     * Extended key usage: serverAuth</li>
     * <li>Client authentication certificate
     * Key usage: digitalSignature, keyEncipherment
     * Extended key usage: clientAuth</li>
     * <li>mTLS mutual authentication certificate
     * Key usage: digitalSignature, keyEncipherment
     * Extended key usage: serverAuth, clientAuth</li>
     * <li>Email signing certificate
     * Key usage: digitalSignature, contentCommitment
     * Extended key usage: emailProtection
     * Note: Compliance CAs are managed by third-party authorities and do not support this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Issues a custom digital certificate with specified subject, subject alternative names (SANs), key usage, and extended key usage attributes.</p>
     * 
     * @param request CreateCustomCertificateRequest
     * @return CreateCustomCertificateResponse
     */
    public CreateCustomCertificateResponse createCustomCertificate(CreateCustomCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>Creates an external subordinate CA certificate from a certificate signing request (CSR) and optional API pass-through parameters.</li>
     * <li>The required <code>InstanceId</code> parameter specifies the instance ID of the external subordinate CA.</li>
     * <li>The <code>Csr</code> parameter must contain a valid certificate signing request.</li>
     * <li>The <code>Validity</code> parameter specifies the certificate\&quot;s validity period and accepts values in either relative or absolute time formats.</li>
     * <li>The <code>ApiPassthrough</code> parameter lets you override information in the CSR, such as subject information, or add certificate extensions.</li>
     * <li>Note: For end-entity CA certificates, set the <code>pathLenConstraint</code> parameter to 0.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create and issue an external subordinate CA certificate using a CSR and API parameters.</p>
     * 
     * @param tmpReq CreateExternalCACertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExternalCACertificateResponse
     */
    public CreateExternalCACertificateResponse createExternalCACertificateWithOptions(CreateExternalCACertificateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateExternalCACertificateShrinkRequest request = new CreateExternalCACertificateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.apiPassthrough)) {
            request.apiPassthroughShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.apiPassthrough, "ApiPassthrough", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiPassthroughShrink)) {
            query.put("ApiPassthrough", request.apiPassthroughShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certMaxTime)) {
            query.put("CertMaxTime", request.certMaxTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.csr)) {
            query.put("Csr", request.csr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validity)) {
            query.put("Validity", request.validity);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExternalCACertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExternalCACertificateResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>Creates an external subordinate CA certificate from a certificate signing request (CSR) and optional API pass-through parameters.</li>
     * <li>The required <code>InstanceId</code> parameter specifies the instance ID of the external subordinate CA.</li>
     * <li>The <code>Csr</code> parameter must contain a valid certificate signing request.</li>
     * <li>The <code>Validity</code> parameter specifies the certificate\&quot;s validity period and accepts values in either relative or absolute time formats.</li>
     * <li>The <code>ApiPassthrough</code> parameter lets you override information in the CSR, such as subject information, or add certificate extensions.</li>
     * <li>Note: For end-entity CA certificates, set the <code>pathLenConstraint</code> parameter to 0.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create and issue an external subordinate CA certificate using a CSR and API parameters.</p>
     * 
     * @param request CreateExternalCACertificateRequest
     * @return CreateExternalCACertificateResponse
     */
    public CreateExternalCACertificateResponse createExternalCACertificate(CreateExternalCACertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExternalCACertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a client or server certificate is revoked, the client or server where the certificate is installed cannot establish HTTPS connections with other devices.
     * After a client or server certificate is revoked, you can call <a href="https://help.aliyun.com/document_detail/465981.html">DeleteClientCertificate</a> to permanently delete the certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The limit on queries per second (QPS) for this operation is 10 per user. If you exceed this limit, API calls are throttled, which can affect your business. Plan your API calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes a client certificate or a server certificate issued by a private certificate authority (CA).</p>
     * 
     * @param request CreateRevokeClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRevokeClientCertificateResponse
     */
    public CreateRevokeClientCertificateResponse createRevokeClientCertificateWithOptions(CreateRevokeClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRevokeClientCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRevokeClientCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>After a client or server certificate is revoked, the client or server where the certificate is installed cannot establish HTTPS connections with other devices.
     * After a client or server certificate is revoked, you can call <a href="https://help.aliyun.com/document_detail/465981.html">DeleteClientCertificate</a> to permanently delete the certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The limit on queries per second (QPS) for this operation is 10 per user. If you exceed this limit, API calls are throttled, which can affect your business. Plan your API calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes a client certificate or a server certificate issued by a private certificate authority (CA).</p>
     * 
     * @param request CreateRevokeClientCertificateRequest
     * @return CreateRevokeClientCertificateResponse
     */
    public CreateRevokeClientCertificateResponse createRevokeClientCertificate(CreateRevokeClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRevokeClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a self-signed root CA certificate. A root CA certificate is the starting point of a private trust chain within an enterprise. After you create a root CA certificate, you can use it to issue intermediate CA certificates. You can then use the intermediate CA certificates to issue client and server-side certificates.
     * Before calling this operation, purchase a private root CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">SSL Certificate Service console</a>. Otherwise, the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second per user. If you exceed the limit, API calls are throttled, which may affect your business. Call the API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a root certificate authority (CA) certificate.</p>
     * 
     * @param request CreateRootCACertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRootCACertificateResponse
     */
    public CreateRootCACertificateResponse createRootCACertificateWithOptions(CreateRootCACertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commonName)) {
            query.put("CommonName", request.commonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            query.put("CountryCode", request.countryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locality)) {
            query.put("Locality", request.locality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            query.put("Organization", request.organization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationUnit)) {
            query.put("OrganizationUnit", request.organizationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.years)) {
            query.put("Years", request.years);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRootCACertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRootCACertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a self-signed root CA certificate. A root CA certificate is the starting point of a private trust chain within an enterprise. After you create a root CA certificate, you can use it to issue intermediate CA certificates. You can then use the intermediate CA certificates to issue client and server-side certificates.
     * Before calling this operation, purchase a private root CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">SSL Certificate Service console</a>. Otherwise, the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second per user. If you exceed the limit, API calls are throttled, which may affect your business. Call the API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a root certificate authority (CA) certificate.</p>
     * 
     * @param request CreateRootCACertificateRequest
     * @return CreateRootCACertificateResponse
     */
    public CreateRootCACertificateResponse createRootCACertificate(CreateRootCACertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRootCACertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root certificate authority (CA) certificate and <a href="https://help.aliyun.com/document_detail/465975.html">CreateSubCACertificate</a> to create a subordinate CA certificate. Only a subordinate CA certificate can issue a server certificate.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed this limit, the system throttles your API calls, which can affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a server certificate by using a system-generated certificate signing request (CSR).</p>
     * 
     * @param request CreateServerCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServerCertificateResponse
     */
    public CreateServerCertificateResponse createServerCertificateWithOptions(CreateServerCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.customIdentifier)) {
            query.put("CustomIdentifier", request.customIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.days)) {
            query.put("Days", request.days);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCrl)) {
            query.put("EnableCrl", request.enableCrl);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.years)) {
            query.put("Years", request.years);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServerCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServerCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root certificate authority (CA) certificate and <a href="https://help.aliyun.com/document_detail/465975.html">CreateSubCACertificate</a> to create a subordinate CA certificate. Only a subordinate CA certificate can issue a server certificate.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed this limit, the system throttles your API calls, which can affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a server certificate by using a system-generated certificate signing request (CSR).</p>
     * 
     * @param request CreateServerCertificateRequest
     * @return CreateServerCertificateResponse
     */
    public CreateServerCertificateResponse createServerCertificate(CreateServerCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServerCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root CA certificate and <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a> to create a subordinate CA certificate. Server-side certificates can be issued only by subordinate CA certificates.</p>
     * <h2>Limits</h2>
     * <p>This operation has a queries per second (QPS) limit of 10 requests per user. If you exceed this limit, rate limiting is triggered, which may affect your business. Call this operation only as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a server certificate by using a custom certificate signing request (CSR).</p>
     * 
     * @param request CreateServerCertificateWithCsrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServerCertificateWithCsrResponse
     */
    public CreateServerCertificateWithCsrResponse createServerCertificateWithCsrWithOptions(CreateServerCertificateWithCsrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.customIdentifier)) {
            query.put("CustomIdentifier", request.customIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.days)) {
            query.put("Days", request.days);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCrl)) {
            query.put("EnableCrl", request.enableCrl);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.years)) {
            query.put("Years", request.years);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServerCertificateWithCsr"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServerCertificateWithCsrResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root CA certificate and <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a> to create a subordinate CA certificate. Server-side certificates can be issued only by subordinate CA certificates.</p>
     * <h2>Limits</h2>
     * <p>This operation has a queries per second (QPS) limit of 10 requests per user. If you exceed this limit, rate limiting is triggered, which may affect your business. Call this operation only as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a server certificate by using a custom certificate signing request (CSR).</p>
     * 
     * @param request CreateServerCertificateWithCsrRequest
     * @return CreateServerCertificateWithCsrResponse
     */
    public CreateServerCertificateWithCsrResponse createServerCertificateWithCsr(CreateServerCertificateWithCsrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServerCertificateWithCsrWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation issues an intermediate CA certificate from an existing root CA certificate. You can use the intermediate CA certificate to issue client and server certificates.
     * Before calling this operation, you must call the <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> operation to create a root CA certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per user. Calls that exceed this limit are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a subordinate certificate authority (CA) certificate under an existing root CA.</p>
     * 
     * @param request CreateSubCACertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSubCACertificateResponse
     */
    public CreateSubCACertificateResponse createSubCACertificateWithOptions(CreateSubCACertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certMaxTime)) {
            query.put("CertMaxTime", request.certMaxTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commonName)) {
            query.put("CommonName", request.commonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            query.put("CountryCode", request.countryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crlDay)) {
            query.put("CrlDay", request.crlDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCrl)) {
            query.put("EnableCrl", request.enableCrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendedKeyUsages)) {
            query.put("ExtendedKeyUsages", request.extendedKeyUsages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locality)) {
            query.put("Locality", request.locality);
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

        if (!com.aliyun.teautil.Common.isUnset(request.pathLenConstraint)) {
            query.put("PathLenConstraint", request.pathLenConstraint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.years)) {
            query.put("Years", request.years);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubCACertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubCACertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation issues an intermediate CA certificate from an existing root CA certificate. You can use the intermediate CA certificate to issue client and server certificates.
     * Before calling this operation, you must call the <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> operation to create a root CA certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per user. Calls that exceed this limit are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a subordinate certificate authority (CA) certificate under an existing root CA.</p>
     * 
     * @param request CreateSubCACertificateRequest
     * @return CreateSubCACertificateResponse
     */
    public CreateSubCACertificateResponse createSubCACertificate(CreateSubCACertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSubCACertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/465972.html">CreateRevokeClientCertificate</a> to revoke the client or server-side certificate.</p>
     * <h2>QPS limit</h2>
     * <p>This operation supports up to 10 queries per second (QPS) for each user. If you exceed the limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a revoked client certificate or server certificate. Only revoked certificates can be deleted.</p>
     * 
     * @param request DeleteClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClientCertificateResponse
     */
    public DeleteClientCertificateResponse deleteClientCertificateWithOptions(DeleteClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClientCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClientCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/465972.html">CreateRevokeClientCertificate</a> to revoke the client or server-side certificate.</p>
     * <h2>QPS limit</h2>
     * <p>This operation supports up to 10 queries per second (QPS) for each user. If you exceed the limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a revoked client certificate or server certificate. Only revoked certificates can be deleted.</p>
     * 
     * @param request DeleteClientCertificateRequest
     * @return DeleteClientCertificateResponse
     */
    public DeleteClientCertificateResponse deleteClientCertificate(DeleteClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of a root or subordinate CA certificate by its unique identifier. The details include the serial number, subject information, and certificate content.
     * Before you call this operation, you must create a root CA certificate by calling <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> and a subordinate CA certificate by calling <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed the limit, API calls are throttled, which can affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about a certificate authority (CA) certificate.</p>
     * 
     * @param request DescribeCACertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCACertificateResponse
     */
    public DescribeCACertificateResponse describeCACertificateWithOptions(DescribeCACertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCACertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCACertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of a root or subordinate CA certificate by its unique identifier. The details include the serial number, subject information, and certificate content.
     * Before you call this operation, you must create a root CA certificate by calling <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> and a subordinate CA certificate by calling <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed the limit, API calls are throttled, which can affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about a certificate authority (CA) certificate.</p>
     * 
     * @param request DescribeCACertificateRequest
     * @return DescribeCACertificateResponse
     */
    public DescribeCACertificateResponse describeCACertificate(DescribeCACertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCACertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the number of CA certificates that you have created, including root CA certificates and subordinate CA certificates.</p>
     * <h2>QPS limit</h2>
     * <p>Each user is limited to 10 queries per second (QPS) for this API operation. If you exceed the limit, your API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of certificate authority (CA) certificates that you created.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCACertificateCountResponse
     */
    public DescribeCACertificateCountResponse describeCACertificateCountWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCACertificateCount"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCACertificateCountResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the number of CA certificates that you have created, including root CA certificates and subordinate CA certificates.</p>
     * <h2>QPS limit</h2>
     * <p>Each user is limited to 10 queries per second (QPS) for this API operation. If you exceed the limit, your API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of certificate authority (CA) certificates that you created.</p>
     * @return DescribeCACertificateCountResponse
     */
    public DescribeCACertificateCountResponse describeCACertificateCount() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCACertificateCountWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of all your root and intermediate CA certificates by page. The details include the unique identifier, serial number, subject information, and content of each certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 for each user. If you exceed the limit, API calls are throttled. This may affect your business. We recommend that you call this operation a reasonable number of times.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all root and subordinate certificate authority (CA) certificates.</p>
     * 
     * @param request DescribeCACertificateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCACertificateListResponse
     */
    public DescribeCACertificateListResponse describeCACertificateListWithOptions(DescribeCACertificateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caStatus)) {
            query.put("CaStatus", request.caStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certType)) {
            query.put("CertType", request.certType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issuerType)) {
            query.put("IssuerType", request.issuerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validStatus)) {
            query.put("ValidStatus", request.validStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCACertificateList"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCACertificateListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of all your root and intermediate CA certificates by page. The details include the unique identifier, serial number, subject information, and content of each certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 for each user. If you exceed the limit, API calls are throttled. This may affect your business. We recommend that you call this operation a reasonable number of times.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all root and subordinate certificate authority (CA) certificates.</p>
     * 
     * @param request DescribeCACertificateListRequest
     * @return DescribeCACertificateListResponse
     */
    public DescribeCACertificateListResponse describeCACertificateList(DescribeCACertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCACertificateListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API applies only to certificates that are issued from a system-generated Certificate Signing Request (CSR). You can use this API to retrieve the encrypted private key of a client certificate or a server-side certificate. Before you call this API, you must have issued a client or server-side certificate by calling one of the following APIs:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/465967.html">CreateClientCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/465975.html">CreateServerCertificate</a>
     * To keep the private key secure during transmission, this API uses a password that you set to encrypt the private key. The API then returns the encrypted private key. After you retrieve the encrypted private key, you can decrypt it using one of the following methods:</li>
     * <li>If the certificate uses the RSA encryption algorithm, run the <code>openssl rsa -in &lt;encrypted_private_key_file&gt; -passin pass:&lt;private_key_password&gt; -out &lt;decrypted_private_key_file&gt;</code> command to decrypt the private key. You must run this command on a computer that has <a href="https://www.openssl.org/source/">OpenSSL</a> or <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> installed.</li>
     * <li>If the certificate uses the ECC encryption algorithm, run the <code>openssl ec -in &lt;encrypted_private_key_file&gt; -passin pass:&lt;private_key_password&gt; -out &lt;decrypted_private_key_file&gt;</code> command to decrypt the private key. You must run this command on a computer that has <a href="https://www.openssl.org/source/">OpenSSL</a> or <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> installed.</li>
     * <li>If the certificate uses the SM2 encryption algorithm, run the <code>openssl ec -in &lt;encrypted_private_key_file&gt; -passin pass:&lt;private_key_password&gt; -out &lt;decrypted_private_key_file&gt;</code> command to decrypt the private key. You must run this command on a computer that has <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> installed.<blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/465985.html">DescribeClientCertificate</a> to query the encryption algorithm of the client or server-side certificate.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>This API has a queries per second (QPS) limit of 10 for each user. If you exceed this limit, your API calls are throttled. Throttling can affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the encrypted private key of a client certificate or server certificate.</p>
     * 
     * @param request DescribeCertificatePrivateKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCertificatePrivateKeyResponse
     */
    public DescribeCertificatePrivateKeyResponse describeCertificatePrivateKeyWithOptions(DescribeCertificatePrivateKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptedCode)) {
            query.put("EncryptedCode", request.encryptedCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCertificatePrivateKey"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCertificatePrivateKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API applies only to certificates that are issued from a system-generated Certificate Signing Request (CSR). You can use this API to retrieve the encrypted private key of a client certificate or a server-side certificate. Before you call this API, you must have issued a client or server-side certificate by calling one of the following APIs:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/465967.html">CreateClientCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/465975.html">CreateServerCertificate</a>
     * To keep the private key secure during transmission, this API uses a password that you set to encrypt the private key. The API then returns the encrypted private key. After you retrieve the encrypted private key, you can decrypt it using one of the following methods:</li>
     * <li>If the certificate uses the RSA encryption algorithm, run the <code>openssl rsa -in &lt;encrypted_private_key_file&gt; -passin pass:&lt;private_key_password&gt; -out &lt;decrypted_private_key_file&gt;</code> command to decrypt the private key. You must run this command on a computer that has <a href="https://www.openssl.org/source/">OpenSSL</a> or <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> installed.</li>
     * <li>If the certificate uses the ECC encryption algorithm, run the <code>openssl ec -in &lt;encrypted_private_key_file&gt; -passin pass:&lt;private_key_password&gt; -out &lt;decrypted_private_key_file&gt;</code> command to decrypt the private key. You must run this command on a computer that has <a href="https://www.openssl.org/source/">OpenSSL</a> or <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> installed.</li>
     * <li>If the certificate uses the SM2 encryption algorithm, run the <code>openssl ec -in &lt;encrypted_private_key_file&gt; -passin pass:&lt;private_key_password&gt; -out &lt;decrypted_private_key_file&gt;</code> command to decrypt the private key. You must run this command on a computer that has <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> installed.<blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/465985.html">DescribeClientCertificate</a> to query the encryption algorithm of the client or server-side certificate.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>This API has a queries per second (QPS) limit of 10 for each user. If you exceed this limit, your API calls are throttled. Throttling can affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the encrypted private key of a client certificate or server certificate.</p>
     * 
     * @param request DescribeCertificatePrivateKeyRequest
     * @return DescribeCertificatePrivateKeyResponse
     */
    public DescribeCertificatePrivateKeyResponse describeCertificatePrivateKey(DescribeCertificatePrivateKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCertificatePrivateKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of a client certificate or a server-side certificate by its unique identifier. The details include the serial number, subject, content, and status of the certificate.
     * Before you call this operation, you must create a client certificate or a server-side certificate.
     * To create a client certificate by calling an API, see the following topics:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/465967.html">CreateClientCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/465970.html">CreateClientCertificateWithCsr</a>
     * To create a server-side certificate by calling an API, see the following topics:</li>
     * <li><a href="https://help.aliyun.com/document_detail/465975.html">CreateServerCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/465979.html">CreateServerCertificateWithCsr</a></li>
     * </ul>
     * <h2>Limits</h2>
     * <p>The queries per second (QPS) limit for this API call is 10 per user. If you exceed this limit, throttling is triggered, which may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a client certificate or server certificate by its unique identifier.</p>
     * 
     * @param request DescribeClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClientCertificateResponse
     */
    public DescribeClientCertificateResponse describeClientCertificateWithOptions(DescribeClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClientCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClientCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of a client certificate or a server-side certificate by its unique identifier. The details include the serial number, subject, content, and status of the certificate.
     * Before you call this operation, you must create a client certificate or a server-side certificate.
     * To create a client certificate by calling an API, see the following topics:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/465967.html">CreateClientCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/465970.html">CreateClientCertificateWithCsr</a>
     * To create a server-side certificate by calling an API, see the following topics:</li>
     * <li><a href="https://help.aliyun.com/document_detail/465975.html">CreateServerCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/465979.html">CreateServerCertificateWithCsr</a></li>
     * </ul>
     * <h2>Limits</h2>
     * <p>The queries per second (QPS) limit for this API call is 10 per user. If you exceed this limit, throttling is triggered, which may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a client certificate or server certificate by its unique identifier.</p>
     * 
     * @param request DescribeClientCertificateRequest
     * @return DescribeClientCertificateResponse
     */
    public DescribeClientCertificateResponse describeClientCertificate(DescribeClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage</h1>
     * <p>Retrieves the details of multiple client or server certificates by serial number. The response includes each certificate\&quot;s serial number, subject information, content, and status.
     * Before calling this operation, ensure you have created a client certificate or a server certificate.
     * To create a client certificate, see:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/330873.html">CreateClientCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/330875.html">CreateClientCertificateWithCsr</a>
     * To create a server certificate, see:</li>
     * <li><a href="https://help.aliyun.com/document_detail/330877.html">CreateServerCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/330878.html">CreateServerCertificateWithCsr</a></li>
     * </ul>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for this operation is 10 calls per second per account. Exceeding this limit triggers throttling, which can impact your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of multiple client or server certificates by serial number.</p>
     * 
     * @deprecated OpenAPI DescribeClientCertificateForSerialNumber is deprecated, please use cas::2020-06-30::DescribeClientCertificate instead.
     * 
     * @param request DescribeClientCertificateForSerialNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClientCertificateForSerialNumberResponse
     */
    @Deprecated
    // Deprecated
    public DescribeClientCertificateForSerialNumberResponse describeClientCertificateForSerialNumberWithOptions(DescribeClientCertificateForSerialNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClientCertificateForSerialNumber"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClientCertificateForSerialNumberResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage</h1>
     * <p>Retrieves the details of multiple client or server certificates by serial number. The response includes each certificate\&quot;s serial number, subject information, content, and status.
     * Before calling this operation, ensure you have created a client certificate or a server certificate.
     * To create a client certificate, see:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/330873.html">CreateClientCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/330875.html">CreateClientCertificateWithCsr</a>
     * To create a server certificate, see:</li>
     * <li><a href="https://help.aliyun.com/document_detail/330877.html">CreateServerCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/330878.html">CreateServerCertificateWithCsr</a></li>
     * </ul>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for this operation is 10 calls per second per account. Exceeding this limit triggers throttling, which can impact your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of multiple client or server certificates by serial number.</p>
     * 
     * @deprecated OpenAPI DescribeClientCertificateForSerialNumber is deprecated, please use cas::2020-06-30::DescribeClientCertificate instead.
     * 
     * @param request DescribeClientCertificateForSerialNumberRequest
     * @return DescribeClientCertificateForSerialNumberResponse
     */
    @Deprecated
    // Deprecated
    public DescribeClientCertificateForSerialNumberResponse describeClientCertificateForSerialNumber(DescribeClientCertificateForSerialNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClientCertificateForSerialNumberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the status of multiple client or server-side certificates in a batch using their unique identifiers. For example, you can check whether a certificate is revoked.</p>
     * <h2>QPS limits</h2>
     * <p>This operation is limited to 10 queries per second (QPS) for each user. API calls that exceed this limit are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a client certificate or server certificate by its unique identifier.</p>
     * 
     * @param request DescribeClientCertificateStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClientCertificateStatusResponse
     */
    public DescribeClientCertificateStatusResponse describeClientCertificateStatusWithOptions(DescribeClientCertificateStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClientCertificateStatus"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClientCertificateStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the status of multiple client or server-side certificates in a batch using their unique identifiers. For example, you can check whether a certificate is revoked.</p>
     * <h2>QPS limits</h2>
     * <p>This operation is limited to 10 queries per second (QPS) for each user. API calls that exceed this limit are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a client certificate or server certificate by its unique identifier.</p>
     * 
     * @param request DescribeClientCertificateStatusRequest
     * @return DescribeClientCertificateStatusResponse
     */
    public DescribeClientCertificateStatusResponse describeClientCertificateStatus(DescribeClientCertificateStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClientCertificateStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the status of one or more client or server certificates by their serial numbers. For example, you can check whether a certificate is revoked.</p>
     * <h2>QPS limit</h2>
     * <p>You can make up to 10 API calls per second per account. Exceeding this limit triggers throttling, which can impact your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of client and server-side certificates using their serial numbers.</p>
     * 
     * @param request DescribeClientCertificateStatusForSerialNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClientCertificateStatusForSerialNumberResponse
     */
    public DescribeClientCertificateStatusForSerialNumberResponse describeClientCertificateStatusForSerialNumberWithOptions(DescribeClientCertificateStatusForSerialNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClientCertificateStatusForSerialNumber"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClientCertificateStatusForSerialNumberResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the status of one or more client or server certificates by their serial numbers. For example, you can check whether a certificate is revoked.</p>
     * <h2>QPS limit</h2>
     * <p>You can make up to 10 API calls per second per account. Exceeding this limit triggers throttling, which can impact your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of client and server-side certificates using their serial numbers.</p>
     * 
     * @param request DescribeClientCertificateStatusForSerialNumberRequest
     * @return DescribeClientCertificateStatusForSerialNumberResponse
     */
    public DescribeClientCertificateStatusForSerialNumberResponse describeClientCertificateStatusForSerialNumber(DescribeClientCertificateStatusForSerialNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClientCertificateStatusForSerialNumberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation performs a paged query to retrieve the details of all your CA certificates, including root and subordinate CA certificates. These details include the unique identifier, serial number, subject information, and certificate content.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10. The system throttles API calls that exceed this limit, which may affect your business. To prevent throttling, call this operation within the stated limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Returns all your certification authority (CA) certificates. These include certificates generated by Private CA and imported external certificates.</p>
     * 
     * @param request DescribePcaAndExternalCACertificateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePcaAndExternalCACertificateListResponse
     */
    public DescribePcaAndExternalCACertificateListResponse describePcaAndExternalCACertificateListWithOptions(DescribePcaAndExternalCACertificateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePcaAndExternalCACertificateList"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePcaAndExternalCACertificateListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation performs a paged query to retrieve the details of all your CA certificates, including root and subordinate CA certificates. These details include the unique identifier, serial number, subject information, and certificate content.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10. The system throttles API calls that exceed this limit, which may affect your business. To prevent throttling, call this operation within the stated limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Returns all your certification authority (CA) certificates. These include certificates generated by Private CA and imported external certificates.</p>
     * 
     * @param request DescribePcaAndExternalCACertificateListRequest
     * @return DescribePcaAndExternalCACertificateListResponse
     */
    public DescribePcaAndExternalCACertificateListResponse describePcaAndExternalCACertificateList(DescribePcaAndExternalCACertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePcaAndExternalCACertificateListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Use this operation to query the status of a private CA instance by its ID. The status information includes the instance\&quot;s status, the total number of certificates it can issue, and the number of certificates already issued.
     * Before you call this operation, purchase a private CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limits</h2>
     * <p>This operation has a queries per second (QPS) limit of 10 for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a private certificate authority (CA) instance, including the remaining certificate quota.</p>
     * 
     * @param request GetCAInstanceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCAInstanceStatusResponse
     */
    public GetCAInstanceStatusResponse getCAInstanceStatusWithOptions(GetCAInstanceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCAInstanceStatus"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCAInstanceStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Use this operation to query the status of a private CA instance by its ID. The status information includes the instance\&quot;s status, the total number of certificates it can issue, and the number of certificates already issued.
     * Before you call this operation, purchase a private CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limits</h2>
     * <p>This operation has a queries per second (QPS) limit of 10 for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a private certificate authority (CA) instance, including the remaining certificate quota.</p>
     * 
     * @param request GetCAInstanceStatusRequest
     * @return GetCAInstanceStatusResponse
     */
    public GetCAInstanceStatusResponse getCAInstanceStatus(GetCAInstanceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCAInstanceStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is used to query the status information of a private CA instance that you purchased through the SSL Certificates Service console by using the ID of the private CA instance. For example, the status of the CA instance, the number of certificates contained, the number of issued certificates, and so on.
     * Before calling this API, you must have purchased a private CA through the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS Limit</h2>
     * <p>The per-user QPS limit for this API is 10 calls per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Please call the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the CRL URL of a CA</p>
     * 
     * @param request GetCaInstanceCrlAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCaInstanceCrlAddressResponse
     */
    public GetCaInstanceCrlAddressResponse getCaInstanceCrlAddressWithOptions(GetCaInstanceCrlAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caIdentifier)) {
            query.put("CaIdentifier", request.caIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCaInstanceCrlAddress"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCaInstanceCrlAddressResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is used to query the status information of a private CA instance that you purchased through the SSL Certificates Service console by using the ID of the private CA instance. For example, the status of the CA instance, the number of certificates contained, the number of issued certificates, and so on.
     * Before calling this API, you must have purchased a private CA through the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS Limit</h2>
     * <p>The per-user QPS limit for this API is 10 calls per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Please call the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the CRL URL of a CA</p>
     * 
     * @param request GetCaInstanceCrlAddressRequest
     * @return GetCaInstanceCrlAddressResponse
     */
    public GetCaInstanceCrlAddressResponse getCaInstanceCrlAddress(GetCaInstanceCrlAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCaInstanceCrlAddressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the status of a private Certificate Authority (CA) instance by its ID. It returns details for a private CA instance that you purchased in the Certificate Management Service (CAS) console. These details include the instance status, the number of certificates it contains, and the number of issued certificates.
     * Before calling this operation, purchase a private CA from the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed the limit, API calls are throttled, which may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the end-entity instances under a private certificate authority (CA).</p>
     * 
     * @param request ListAllEndEntityInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllEndEntityInstanceResponse
     */
    public ListAllEndEntityInstanceResponse listAllEndEntityInstanceWithOptions(ListAllEndEntityInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recursiveChildren)) {
            query.put("RecursiveChildren", request.recursiveChildren);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllEndEntityInstance"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllEndEntityInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the status of a private Certificate Authority (CA) instance by its ID. It returns details for a private CA instance that you purchased in the Certificate Management Service (CAS) console. These details include the instance status, the number of certificates it contains, and the number of issued certificates.
     * Before calling this operation, purchase a private CA from the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed the limit, API calls are throttled, which may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the end-entity instances under a private certificate authority (CA).</p>
     * 
     * @param request ListAllEndEntityInstanceRequest
     * @return ListAllEndEntityInstanceResponse
     */
    public ListAllEndEntityInstanceResponse listAllEndEntityInstance(ListAllEndEntityInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllEndEntityInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use this API to query the operation logs for a Certificate Authority (CA) certificate. These logs record operations, such as certificate creation and status changes, for both root and subordinate CA certificates.
     * This API is limited to 10 queries per second (QPS) per user. API calls that exceed this limit are throttled. This can impact your business. Ensure that you call the API within this limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the operation logs of a certificate authority (CA) certificate, such as issuance and revocation events.</p>
     * 
     * @param request ListCACertificateLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCACertificateLogResponse
     */
    public ListCACertificateLogResponse listCACertificateLogWithOptions(ListCACertificateLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCACertificateLog"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCACertificateLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use this API to query the operation logs for a Certificate Authority (CA) certificate. These logs record operations, such as certificate creation and status changes, for both root and subordinate CA certificates.
     * This API is limited to 10 queries per second (QPS) per user. API calls that exceed this limit are throttled. This can impact your business. Ensure that you call the API within this limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the operation logs of a certificate authority (CA) certificate, such as issuance and revocation events.</p>
     * 
     * @param request ListCACertificateLogRequest
     * @return ListCACertificateLogResponse
     */
    public ListCACertificateLogResponse listCACertificateLog(ListCACertificateLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCACertificateLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The QPS limit for this API is 10 per user. If you exceed this limit, your API calls will be throttled. To avoid impacting your business, please plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of certificates.</p>
     * 
     * @param request ListCertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCertResponse
     */
    public ListCertResponse listCertWithOptions(ListCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.afterDate)) {
            query.put("AfterDate", request.afterDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beforeDate)) {
            query.put("BeforeDate", request.beforeDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceUuid)) {
            query.put("InstanceUuid", request.instanceUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentIdentifier)) {
            query.put("ParentIdentifier", request.parentIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCert"),
            new TeaPair("version", "2020-06-30"),
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
     * <p>The QPS limit for this API is 10 per user. If you exceed this limit, your API calls will be throttled. To avoid impacting your business, please plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of certificates.</p>
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
     * <p>This API performs a paged query to retrieve the details of all client and server-side certificates that you have created. These details include the unique identifier, serial number, subject information, content, and status of each certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10 calls per second. If you exceed this limit, your API calls are throttled, which may affect your business. Call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists all client certificates and server certificates issued by a private certificate authority (CA).</p>
     * 
     * @param request ListClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClientCertificateResponse
     */
    public ListClientCertificateResponse listClientCertificateWithOptions(ListClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
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
            new TeaPair("action", "ListClientCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClientCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API performs a paged query to retrieve the details of all client and server-side certificates that you have created. These details include the unique identifier, serial number, subject information, content, and status of each certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10 calls per second. If you exceed this limit, your API calls are throttled, which may affect your business. Call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists all client certificates and server certificates issued by a private certificate authority (CA).</p>
     * 
     * @param request ListClientCertificateRequest
     * @return ListClientCertificateResponse
     */
    public ListClientCertificateResponse listClientCertificate(ListClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation lists CA certificates, including root and subordinate CA certificates.
     * This operation has a limit of 10 queries per second (QPS) for each user. If you exceed the limit, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists private certificate authority (CA) certificates.</p>
     * 
     * @param request ListPcaCaCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPcaCaCertificateResponse
     */
    public ListPcaCaCertificateResponse listPcaCaCertificateWithOptions(ListPcaCaCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPcaCaCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPcaCaCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation lists CA certificates, including root and subordinate CA certificates.
     * This operation has a limit of 10 queries per second (QPS) for each user. If you exceed the limit, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists private certificate authority (CA) certificates.</p>
     * 
     * @param request ListPcaCaCertificateRequest
     * @return ListPcaCaCertificateResponse
     */
    public ListPcaCaCertificateResponse listPcaCaCertificate(ListPcaCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPcaCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query to retrieve the details of all revoked client and server-side certificates, such as the unique identifier, serial number, and revocation date.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this API is 10 for each user. If you exceed this limit, API calls are throttled, which may affect your business. We recommend that you call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all revoked client certificates and server certificates.</p>
     * 
     * @param request ListRevokeCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRevokeCertificateResponse
     */
    public ListRevokeCertificateResponse listRevokeCertificateWithOptions(ListRevokeCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRevokeCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRevokeCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query to retrieve the details of all revoked client and server-side certificates, such as the unique identifier, serial number, and revocation date.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this API is 10 for each user. If you exceed this limit, API calls are throttled, which may affect your business. We recommend that you call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all revoked client certificates and server certificates.</p>
     * 
     * @param request ListRevokeCertificateRequest
     * @return ListRevokeCertificateResponse
     */
    public ListRevokeCertificateResponse listRevokeCertificate(ListRevokeCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRevokeCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must purchase a private CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.
     * You can call this operation up to 10 times per second per Alibaba Cloud account. If the number of calls per second exceeds this limit, throttling is triggered. This may affect your business. We recommend that you plan your calls accordingly.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second for each Alibaba Cloud account. If the number of calls per second exceeds this limit, throttling is triggered, which may affect your business. We recommend that you plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are attached to Certificate Management Service resources.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must purchase a private CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.
     * You can call this operation up to 10 times per second per Alibaba Cloud account. If the number of calls per second exceeds this limit, throttling is triggered. This may affect your business. We recommend that you plan your calls accordingly.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second for each Alibaba Cloud account. If the number of calls per second exceeds this limit, throttling is triggered, which may affect your business. We recommend that you plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are attached to Certificate Management Service resources.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the status information of a private CA instance that you purchased in the Certificate Management Service (CAS) console. You can query by the private CA instance ID to retrieve information such as the status of the CA instance, the number of certificates it contains, and the number of issued certificates.
     * Before you call this operation, you must purchase a private CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>This operation is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this operation within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Moves a Certificate Management Service resource to a different resource group.</p>
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
            new TeaPair("version", "2020-06-30"),
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
     * <b>description</b> :
     * <p>This operation queries the status information of a private CA instance that you purchased in the Certificate Management Service (CAS) console. You can query by the private CA instance ID to retrieve information such as the status of the CA instance, the number of certificates it contains, and the number of issued certificates.
     * Before you call this operation, you must purchase a private CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>This operation is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this operation within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Moves a Certificate Management Service resource to a different resource group.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation adds tags to one or more resources. You can add tags to private CA instances that you purchased in the Certificate Management Service (CAS) console.
     * Before calling this operation, purchase a private CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>This operation is limited to 10 queries per second (QPS) per user. If you exceed this limit, API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches tags to one or more Certificate Management Service resources.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation adds tags to one or more resources. You can add tags to private CA instances that you purchased in the Certificate Management Service (CAS) console.
     * Before calling this operation, purchase a private CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>This operation is limited to 10 queries per second (QPS) per user. If you exceed this limit, API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches tags to one or more Certificate Management Service resources.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries status information for a private Certificate Authority (CA) instance that you purchased in the Certificate Management Service (CAS) console. You can use the private CA instance ID to retrieve information such as the instance status, the number of certificates it contains, and the number of certificates issued.
     * Before you call this operation, you must purchase a private CA from the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second per user. If you exceed this limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from one or more Certificate Management Service resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation queries status information for a private Certificate Authority (CA) instance that you purchased in the Certificate Management Service (CAS) console. You can use the private CA instance ID to retrieve information such as the instance status, the number of certificates it contains, and the number of certificates issued.
     * Before you call this operation, you must purchase a private CA from the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second per user. If you exceed this limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from one or more Certificate Management Service resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you create a CA certificate, its status is ISSUE by default. You can call this API operation to change the status of a CA certificate from ISSUE to REVOKE. A CA certificate in the ISSUE state can be used to issue certificates. A CA certificate in the REVOKE state cannot be used to issue certificates, and all certificates issued by this CA certificate become invalid.
     * Before you call this API operation, create a root CA certificate by calling <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> and an intermediate CA certificate by calling <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a>.</p>
     * <h2>QPS limit</h2>
     * <p>This operation is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the status of a root or subordinate certificate authority (CA) certificate, such as revoking or disabling an active CA.</p>
     * 
     * @param request UpdateCACertificateStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCACertificateStatusResponse
     */
    public UpdateCACertificateStatusResponse updateCACertificateStatusWithOptions(UpdateCACertificateStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCACertificateStatus"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCACertificateStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you create a CA certificate, its status is ISSUE by default. You can call this API operation to change the status of a CA certificate from ISSUE to REVOKE. A CA certificate in the ISSUE state can be used to issue certificates. A CA certificate in the REVOKE state cannot be used to issue certificates, and all certificates issued by this CA certificate become invalid.
     * Before you call this API operation, create a root CA certificate by calling <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> and an intermediate CA certificate by calling <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a>.</p>
     * <h2>QPS limit</h2>
     * <p>This operation is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the status of a root or subordinate certificate authority (CA) certificate, such as revoking or disabling an active CA.</p>
     * 
     * @param request UpdateCACertificateStatusRequest
     * @return UpdateCACertificateStatusResponse
     */
    public UpdateCACertificateStatusResponse updateCACertificateStatus(UpdateCACertificateStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCACertificateStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When a Certificate Authority (CA) certificate is created, its status is Normal by default. You can call this API operation to change the status of a CA certificate to Revoked. A CA certificate in the Normal status can be used to issue certificates. A revoked CA certificate cannot be used to issue certificates, and all certificates previously issued by it become invalid.
     * Before you call this API operation, you must create a root CA certificate by calling <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> and a subordinate CA certificate by calling <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a>.</p>
     * <h2>QPS limits</h2>
     * <p>This API operation is limited to 10 queries per second (QPS) per user. If you exceed this limit, API calls are throttled, which may affect your business. Call this API operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the properties of a private CA certificate, such as the export status.</p>
     * 
     * @param request UpdatePcaCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePcaCertificateResponse
     */
    public UpdatePcaCertificateResponse updatePcaCertificateWithOptions(UpdatePcaCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            query.put("AliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePcaCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePcaCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>When a Certificate Authority (CA) certificate is created, its status is Normal by default. You can call this API operation to change the status of a CA certificate to Revoked. A CA certificate in the Normal status can be used to issue certificates. A revoked CA certificate cannot be used to issue certificates, and all certificates previously issued by it become invalid.
     * Before you call this API operation, you must create a root CA certificate by calling <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> and a subordinate CA certificate by calling <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a>.</p>
     * <h2>QPS limits</h2>
     * <p>This API operation is limited to 10 queries per second (QPS) per user. If you exceed this limit, API calls are throttled, which may affect your business. Call this API operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the properties of a private CA certificate, such as the export status.</p>
     * 
     * @param request UpdatePcaCertificateRequest
     * @return UpdatePcaCertificateResponse
     */
    public UpdatePcaCertificateResponse updatePcaCertificate(UpdatePcaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePcaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation uploads a PCA certificate to a certificate repository.</p>
     * <h2>QPS limit</h2>
     * <p>This operation has a queries per second (QPS) limit of 10 calls per second for each user. If you exceed the limit, your API calls are throttled. Throttling may affect your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads a private CA certificate to Certificate Management Service for centralized management.</p>
     * 
     * @param request UploadPcaCertToCasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadPcaCertToCasResponse
     */
    public UploadPcaCertToCasResponse uploadPcaCertToCasWithOptions(UploadPcaCertToCasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadPcaCertToCas"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadPcaCertToCasResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation uploads a PCA certificate to a certificate repository.</p>
     * <h2>QPS limit</h2>
     * <p>This operation has a queries per second (QPS) limit of 10 calls per second for each user. If you exceed the limit, your API calls are throttled. Throttling may affect your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads a private CA certificate to Certificate Management Service for centralized management.</p>
     * 
     * @param request UploadPcaCertToCasRequest
     * @return UploadPcaCertToCasResponse
     */
    public UploadPcaCertToCasResponse uploadPcaCertToCas(UploadPcaCertToCasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadPcaCertToCasWithOptions(request, runtime);
    }
}
