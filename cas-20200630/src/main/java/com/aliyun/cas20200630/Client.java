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
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="~~CreateRootCACertificate~~">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="~~CreateRootCACertificate~~">CreateSubCACertificate</a> operation. Only intermediate CA certificates can issue client certificates.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a client certificate by using a system-generated certificate signing request (CSR) file.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.beforeTime)) {
            query.put("BeforeTime", request.beforeTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commonName)) {
            query.put("CommonName", request.commonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
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
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="~~CreateRootCACertificate~~">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="~~CreateRootCACertificate~~">CreateSubCACertificate</a> operation. Only intermediate CA certificates can issue client certificates.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a client certificate by using a system-generated certificate signing request (CSR) file.</p>
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
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="https://help.aliyun.com/document_detail/328093.html">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="https://help.aliyun.com/document_detail/328094.html">CreateSubCACertificate</a> operation. Only intermediate CA certificates can be used to issue client certificates.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a client certificate by using a custom certificate signing request (CSR) file.</p>
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
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="https://help.aliyun.com/document_detail/328093.html">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="https://help.aliyun.com/document_detail/328094.html">CreateSubCACertificate</a> operation. Only intermediate CA certificates can be used to issue client certificates.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a client certificate by using a custom certificate signing request (CSR) file.</p>
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
     * <p>By default, the name of the entity is obtained from the certificate signing request (CSR) of the certificate that you want to issue. If you specify a different name for the entity, the name of the entity in the CSR becomes invalid. The specified name is used to issue the certificate.
     * You must specify the key usage and extended key usage based on the certificate type. The following list describes common certificate types:</p>
     * <ul>
     * <li>Server certificate
     * Key usage: digitalSignature or keyEncipherment
     * Extended key usage: serverAuth</li>
     * <li>Client certificate
     * Key usage: digitalSignature or keyEncipherment
     * Extended key usage: clientAuth</li>
     * <li>Mutual Transport Layer Security (TLS) authentication certificate
     * Key usage: digitalSignature or keyEncipherment
     * Extended key usage: serverAuth or clientAuth</li>
     * <li>Email certificate
     * Key usage: digitalSignature or contentCommitment
     * Extended key usage: emailProtection
     * Note: Compliant certificate authorities (CAs) are managed by third-party authorities. This operation is not supported for compliant CAs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Issues a certificate based on the specified key usage, extended key usage, and name and alias of the entity that uses the certificate.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.validity)) {
            query.put("Validity", request.validity);
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
     * <p>By default, the name of the entity is obtained from the certificate signing request (CSR) of the certificate that you want to issue. If you specify a different name for the entity, the name of the entity in the CSR becomes invalid. The specified name is used to issue the certificate.
     * You must specify the key usage and extended key usage based on the certificate type. The following list describes common certificate types:</p>
     * <ul>
     * <li>Server certificate
     * Key usage: digitalSignature or keyEncipherment
     * Extended key usage: serverAuth</li>
     * <li>Client certificate
     * Key usage: digitalSignature or keyEncipherment
     * Extended key usage: clientAuth</li>
     * <li>Mutual Transport Layer Security (TLS) authentication certificate
     * Key usage: digitalSignature or keyEncipherment
     * Extended key usage: serverAuth or clientAuth</li>
     * <li>Email certificate
     * Key usage: digitalSignature or contentCommitment
     * Extended key usage: emailProtection
     * Note: Compliant certificate authorities (CAs) are managed by third-party authorities. This operation is not supported for compliant CAs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Issues a certificate based on the specified key usage, extended key usage, and name and alias of the entity that uses the certificate.</p>
     * 
     * @param request CreateCustomCertificateRequest
     * @return CreateCustomCertificateResponse
     */
    public CreateCustomCertificateResponse createCustomCertificate(CreateCustomCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomCertificateWithOptions(request, runtime);
    }

    /**
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
     * @param request CreateRevokeClientCertificateRequest
     * @return CreateRevokeClientCertificateResponse
     */
    public CreateRevokeClientCertificateResponse createRevokeClientCertificate(CreateRevokeClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRevokeClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the CreateRootCACertificate operation to create a self-signed root CA certificate. A root CA certificate is the trust anchor in a chain of trust for private certificates that are used within an enterprise. You must create a root CA certificate before you can use the root CA certificate to issue intermediate CA certificates. Then, you can use the intermediate CA certificates to issue client certificates and server certificates.
     * Before you call this operation, make sure that you have purchased a private root CA instance by using the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Create a private CA</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <p>You can call the CreateRootCACertificate operation to create a self-signed root CA certificate. A root CA certificate is the trust anchor in a chain of trust for private certificates that are used within an enterprise. You must create a root CA certificate before you can use the root CA certificate to issue intermediate CA certificates. Then, you can use the intermediate CA certificates to issue client certificates and server certificates.
     * Before you call this operation, make sure that you have purchased a private root CA instance by using the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Create a private CA</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="https://help.aliyun.com/document_detail/328093.html">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="https://help.aliyun.com/document_detail/328094.html">CreateSubCACertificate</a> operation. Only intermediate CA certificates can be used to issue server certificates.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a server certificate by using a system-generated certificate signing request (CSR) file.</p>
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
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="https://help.aliyun.com/document_detail/328093.html">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="https://help.aliyun.com/document_detail/328094.html">CreateSubCACertificate</a> operation. Only intermediate CA certificates can be used to issue server certificates.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a server certificate by using a system-generated certificate signing request (CSR) file.</p>
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
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="https://help.aliyun.com/document_detail/328093.html">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="https://help.aliyun.com/document_detail/328094.html">CreateSubCACertificate</a> operation. Only intermediate CA certificates can be used to issue server certificates.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a server certificate by using a custom certificate signing request (CSR) file.</p>
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
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="https://help.aliyun.com/document_detail/328093.html">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="https://help.aliyun.com/document_detail/328094.html">CreateSubCACertificate</a> operation. Only intermediate CA certificates can be used to issue server certificates.</p>
     * 
     * <b>summary</b> : 
     * <p>Issues a server certificate by using a custom certificate signing request (CSR) file.</p>
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
     * <p>You can call this operation to issue an intermediate certificate authority (CA) certificate by using an existing root CA certificate. Intermediate CA certificates can be used to issue client certificates and server certificates.
     * Before you call this operation, make sure that you have issued a root CA certificate by calling the [CreateRootCACertificate] operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an intermediate certificate authority (CA) certificate.</p>
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
     * <p>You can call this operation to issue an intermediate certificate authority (CA) certificate by using an existing root CA certificate. Intermediate CA certificates can be used to issue client certificates and server certificates.
     * Before you call this operation, make sure that you have issued a root CA certificate by calling the [CreateRootCACertificate] operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an intermediate certificate authority (CA) certificate.</p>
     * 
     * @param request CreateSubCACertificateRequest
     * @return CreateSubCACertificateResponse
     */
    public CreateSubCACertificateResponse createSubCACertificate(CreateSubCACertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSubCACertificateWithOptions(request, runtime);
    }

    /**
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
     * @param request DeleteClientCertificateRequest
     * @return DeleteClientCertificateResponse
     */
    public DeleteClientCertificateResponse deleteClientCertificate(DeleteClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeCACertificate operation to query the details about a root CA certificate or an intermediate CA certificate by using the unique identifier of the root CA certificate or intermediate CA certificate. The details include the serial number, user information, and content of a CA certificate.
     * Before you call this operation, make sure that you have created a root CA by calling the [CreateRootCACertificate] operation or an intermediate CA certificate by calling the [CreateSubCACertificate] operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a root certificate authority (CA) certificate or an intermediate CA certificate.</p>
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
     * <p>You can call the DescribeCACertificate operation to query the details about a root CA certificate or an intermediate CA certificate by using the unique identifier of the root CA certificate or intermediate CA certificate. The details include the serial number, user information, and content of a CA certificate.
     * Before you call this operation, make sure that you have created a root CA by calling the [CreateRootCACertificate] operation or an intermediate CA certificate by calling the [CreateSubCACertificate] operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a root certificate authority (CA) certificate or an intermediate CA certificate.</p>
     * 
     * @param request DescribeCACertificateRequest
     * @return DescribeCACertificateResponse
     */
    public DescribeCACertificateResponse describeCACertificate(DescribeCACertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCACertificateWithOptions(request, runtime);
    }

    /**
     * @param request DescribeCACertificateCountRequest
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
     * @return DescribeCACertificateCountResponse
     */
    public DescribeCACertificateCountResponse describeCACertificateCount() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCACertificateCountWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeCACertificateList operation to perform a paged query of the details about all CA certificates that you create. The details include the unique identifier, serial number, user information, and content of each root CA certificate or intermediate CA certificate.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about all root certificate authority (CA) certificates and intermediate CA certificates.</p>
     * 
     * @param request DescribeCACertificateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCACertificateListResponse
     */
    public DescribeCACertificateListResponse describeCACertificateListWithOptions(DescribeCACertificateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSize)) {
            query.put("ShowSize", request.showSize);
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
     * <p>You can call the DescribeCACertificateList operation to perform a paged query of the details about all CA certificates that you create. The details include the unique identifier, serial number, user information, and content of each root CA certificate or intermediate CA certificate.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about all root certificate authority (CA) certificates and intermediate CA certificates.</p>
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
     * <h2>Usage notes</h2>
     * <p>You can call the DescribeCertificatePrivateKey operation to obtain the encrypted private key of a client certificate or a server certificate. The certificate is issued based on a system-generated certificate signing request (CSR). Before you call this operation, make sure that you have issued a client certificate or a server certificate by calling the following operation:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/330873.html">CreateClientCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/330877.html">CreateServerCertificate</a>
     * To ensure the security of private key transmission, the DescribeCertificatePrivateKey operation encrypts the private key by using the private key password that you specify and returns the encrypted private key. The private key password is a string that is used to encrypt the private key. After you obtain the encrypted private key of the certificate, you can use the following methods to decrypt the private key:</li>
     * <li>If the encryption algorithm of the certificate is RSA, you must run the <code>openssl rsa -in &lt;Encrypted private key file&gt; -passin pass:&lt;Private key password&gt; -out &lt;Decrypted private key file&gt;</code> command in the computer on which <a href="https://www.openssl.org/source/">OpenSSL</a> or <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> is installed.</li>
     * <li>If the encryption algorithm of the certificate is ECC, you must run the <code>openssl ec -in &lt;Encrypted private key file&gt; -passin pass:&lt;Private key password&gt; -out &lt;Decrypted private key file&gt;</code> command in the computer on which <a href="https://www.openssl.org/source/">OpenSSL</a> or <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> is installed.</li>
     * <li>If the encryption algorithm of the certificate is SM2, you must run the <code>openssl ec -in &lt;Encrypted private key file&gt; -passin pass:&lt;Private key password&gt; -out &lt;Decrypted private key file&gt;</code> command in the computer on which <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> is installed.<blockquote>
     * <p> You can call the [DescribeClientCertificate] operation to query the encryption algorithm type of a client certificate or a server certificate.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the encrypted private key of a client certificate or a server certificate.</p>
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
     * <h2>Usage notes</h2>
     * <p>You can call the DescribeCertificatePrivateKey operation to obtain the encrypted private key of a client certificate or a server certificate. The certificate is issued based on a system-generated certificate signing request (CSR). Before you call this operation, make sure that you have issued a client certificate or a server certificate by calling the following operation:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/330873.html">CreateClientCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/330877.html">CreateServerCertificate</a>
     * To ensure the security of private key transmission, the DescribeCertificatePrivateKey operation encrypts the private key by using the private key password that you specify and returns the encrypted private key. The private key password is a string that is used to encrypt the private key. After you obtain the encrypted private key of the certificate, you can use the following methods to decrypt the private key:</li>
     * <li>If the encryption algorithm of the certificate is RSA, you must run the <code>openssl rsa -in &lt;Encrypted private key file&gt; -passin pass:&lt;Private key password&gt; -out &lt;Decrypted private key file&gt;</code> command in the computer on which <a href="https://www.openssl.org/source/">OpenSSL</a> or <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> is installed.</li>
     * <li>If the encryption algorithm of the certificate is ECC, you must run the <code>openssl ec -in &lt;Encrypted private key file&gt; -passin pass:&lt;Private key password&gt; -out &lt;Decrypted private key file&gt;</code> command in the computer on which <a href="https://www.openssl.org/source/">OpenSSL</a> or <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> is installed.</li>
     * <li>If the encryption algorithm of the certificate is SM2, you must run the <code>openssl ec -in &lt;Encrypted private key file&gt; -passin pass:&lt;Private key password&gt; -out &lt;Decrypted private key file&gt;</code> command in the computer on which <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> is installed.<blockquote>
     * <p> You can call the [DescribeClientCertificate] operation to query the encryption algorithm type of a client certificate or a server certificate.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the encrypted private key of a client certificate or a server certificate.</p>
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
     * <p>You can call the DescribeClientCertificate operation to query the details about a client certificate or a server certificate by using the unique identifier of the certificate. The details include the serial number, user information, content, and status of each certificate.
     * Before you call this operation, make sure that you have created a client certificate or a server certificate.
     * For more information about how to call an operation to create a client certificate, see the following topics:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/330873.html">CreateClientCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/330875.html">CreateClientCertificateWithCsr</a>
     * For more information about how to call an operation to create a server certificate, see the following topics:</li>
     * <li><a href="https://help.aliyun.com/document_detail/330877.html">CreateServerCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/330878.html">CreateServerCertificateWithCsr</a></li>
     * </ul>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a client certificate or a server certificate by using the unique identifier of the certificate.</p>
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
     * <p>You can call the DescribeClientCertificate operation to query the details about a client certificate or a server certificate by using the unique identifier of the certificate. The details include the serial number, user information, content, and status of each certificate.
     * Before you call this operation, make sure that you have created a client certificate or a server certificate.
     * For more information about how to call an operation to create a client certificate, see the following topics:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/330873.html">CreateClientCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/330875.html">CreateClientCertificateWithCsr</a>
     * For more information about how to call an operation to create a server certificate, see the following topics:</li>
     * <li><a href="https://help.aliyun.com/document_detail/330877.html">CreateServerCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/330878.html">CreateServerCertificateWithCsr</a></li>
     * </ul>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a client certificate or a server certificate by using the unique identifier of the certificate.</p>
     * 
     * @param request DescribeClientCertificateRequest
     * @return DescribeClientCertificateResponse
     */
    public DescribeClientCertificateResponse describeClientCertificate(DescribeClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClientCertificateWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeClientCertificateStatusRequest
     * @return DescribeClientCertificateStatusResponse
     */
    public DescribeClientCertificateStatusResponse describeClientCertificateStatus(DescribeClientCertificateStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClientCertificateStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call the GetCAInstanceStatus operation to query the status information of a private CA instance by using the ID of the instance. The instance is purchased by using the SSL Certificates Service console. The status information includes the status of the private CA instance, the number of certificates that can be issued by using the private CA instance, and the number of issued certificates.
     * Before you call this operation, make sure that you have purchased a private CA by using the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">SSL Certificates Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Create a private CA</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status information about a private root certificate authority (CA) instance or a private intermediate CA instance that you purchase by using the Certificate Management Service console.</p>
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
     * <h2>Usage notes</h2>
     * <p>You can call the GetCAInstanceStatus operation to query the status information of a private CA instance by using the ID of the instance. The instance is purchased by using the SSL Certificates Service console. The status information includes the status of the private CA instance, the number of certificates that can be issued by using the private CA instance, and the number of issued certificates.
     * Before you call this operation, make sure that you have purchased a private CA by using the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">SSL Certificates Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Create a private CA</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status information about a private root certificate authority (CA) instance or a private intermediate CA instance that you purchase by using the Certificate Management Service console.</p>
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
     * <p>You can call the ListClientCertificate operation to perform a paged query of the details about all client certificates and server certificates that you create. The details include the unique identifier, serial number, user information, content, and status of each certificate.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about all client certificates and server certificates.</p>
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
     * <p>You can call the ListClientCertificate operation to perform a paged query of the details about all client certificates and server certificates that you create. The details include the unique identifier, serial number, user information, content, and status of each certificate.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about all client certificates and server certificates.</p>
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
     * <p>You can call the ListRevokeCertificate operation to perform a paged query of the details about all revoked client certificates and server certificates. The details include the unique identifier, serial number, and revocation date of each certificate.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about all client certificates and server certificates that are revoked.</p>
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
     * <p>You can call the ListRevokeCertificate operation to perform a paged query of the details about all revoked client certificates and server certificates. The details include the unique identifier, serial number, and revocation date of each certificate.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about all client certificates and server certificates that are revoked.</p>
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
     * <p>After a CA certificate is created, the CA certificate is in the ISSUE state by default. You can call the UpdateCACertificateStatus operation to change the status of a CA certificate from ISSUE to REVOKE. If a CA certificate is in the ISSUE state, the CA certificate can be used to issue certificates. If a CA certificate is in the REVOKE state, the CA certificate cannot be used to issue certificates, and the certificates that are issued from the CA certificate become invalid.
     * Before you call this operation, make sure that you have created a root CA by calling the [CreateRootCACertificate] operation or an intermediate CA certificate by calling the [CreateSubCACertificate] operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the status of a root certificate authority (CA) certificate or an intermediate CA certificate from ISSUE to REVOKE.</p>
     * 
     * @param request UpdateCACertificateStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCACertificateStatusResponse
     */
    public UpdateCACertificateStatusResponse updateCACertificateStatusWithOptions(UpdateCACertificateStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * <p>After a CA certificate is created, the CA certificate is in the ISSUE state by default. You can call the UpdateCACertificateStatus operation to change the status of a CA certificate from ISSUE to REVOKE. If a CA certificate is in the ISSUE state, the CA certificate can be used to issue certificates. If a CA certificate is in the REVOKE state, the CA certificate cannot be used to issue certificates, and the certificates that are issued from the CA certificate become invalid.
     * Before you call this operation, make sure that you have created a root CA by calling the [CreateRootCACertificate] operation or an intermediate CA certificate by calling the [CreateSubCACertificate] operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the status of a root certificate authority (CA) certificate or an intermediate CA certificate from ISSUE to REVOKE.</p>
     * 
     * @param request UpdateCACertificateStatusRequest
     * @return UpdateCACertificateStatusResponse
     */
    public UpdateCACertificateStatusResponse updateCACertificateStatus(UpdateCACertificateStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCACertificateStatusWithOptions(request, runtime);
    }
}
