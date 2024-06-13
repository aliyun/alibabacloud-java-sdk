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
     * @summary You can call the CancelCertificateForPackageRequest operation to cancel a certificate application order and revoke the issued certificate in the order. You can call this operation only when the certificate application order is in the **issued** state.
     * >  You can call the [DescribeCertificateState](https://help.aliyun.com/document_detail/164111.html) operation to query the status of a certificate application order. If the value of the **Type** response parameter is **certificate**, the certificate is issued.
     * If a certificate is revoked within 30 calendar days after the issuance date, the consumed certificate quota is returned to you. Otherwise, the consumed certificate quota is not returned.
     *
     * @description Revokes an issued certificate and cancels the application order of the certificate.
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
     * @summary You can call the CancelCertificateForPackageRequest operation to cancel a certificate application order and revoke the issued certificate in the order. You can call this operation only when the certificate application order is in the **issued** state.
     * >  You can call the [DescribeCertificateState](https://help.aliyun.com/document_detail/164111.html) operation to query the status of a certificate application order. If the value of the **Type** response parameter is **certificate**, the certificate is issued.
     * If a certificate is revoked within 30 calendar days after the issuance date, the consumed certificate quota is returned to you. Otherwise, the consumed certificate quota is not returned.
     *
     * @description Revokes an issued certificate and cancels the application order of the certificate.
     *
     * @param request CancelCertificateForPackageRequestRequest
     * @return CancelCertificateForPackageRequestResponse
     */
    public CancelCertificateForPackageRequestResponse cancelCertificateForPackageRequest(CancelCertificateForPackageRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelCertificateForPackageRequestWithOptions(request, runtime);
    }

    /**
     * @summary Cancels a certificate application order that is in the pending validation or being reviewed state.
     *
     * @description You can call the CancelOrderRequest operation to cancel a certificate application order only in the following scenarios:
     * *   The order is in the **pending validation** state. You have submitted a certificate application but the verification of the domain name ownership is not complete.
     * *   The order is in the **being reviewed** state. You have submitted a certificate application and the verification of the domain name ownership is complete, but the certificate authority (CA) does not complete the review of the certificate application.
     * After a certificate application order is canceled, the status of the order changes to the **pending application** state. In this case, you can call the [DeleteCertificateRequest](https://help.aliyun.com/document_detail/164109.html) operation to delete the certificate application order. Then, the consumed certificate quota is returned to you.
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
     * @summary Cancels a certificate application order that is in the pending validation or being reviewed state.
     *
     * @description You can call the CancelOrderRequest operation to cancel a certificate application order only in the following scenarios:
     * *   The order is in the **pending validation** state. You have submitted a certificate application but the verification of the domain name ownership is not complete.
     * *   The order is in the **being reviewed** state. You have submitted a certificate application and the verification of the domain name ownership is complete, but the certificate authority (CA) does not complete the review of the certificate application.
     * After a certificate application order is canceled, the status of the order changes to the **pending application** state. In this case, you can call the [DeleteCertificateRequest](https://help.aliyun.com/document_detail/164109.html) operation to delete the certificate application order. Then, the consumed certificate quota is returned to you.
     *
     * @param request CancelOrderRequestRequest
     * @return CancelOrderRequestResponse
     */
    public CancelOrderRequestResponse cancelOrderRequest(CancelOrderRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelOrderRequestWithOptions(request, runtime);
    }

    /**
     * @summary Submits a certificate application.
     *
     * @description *   Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see [Purchase a certificate resource plan](https://help.aliyun.com/document_detail/28542.html). You can call the [DescribePackageState](https://help.aliyun.com/document_detail/455800.html) operation to query the usage of certificate resource plans of specified specifications, including the total number of certificate resource plans that you purchase, the number of certificate applications that are submitted, and the number of certificates that are issued.
     * *   After you call this operation to submit a certificate application and the certificate is issued, the certificate quota provided by the resource plan that you purchased is consumed. When you call this operation, you can use the **ProductCode** parameter to specify the specifications of the certificate that you want to apply for.
     * *   After you call this operation to submit a certificate application, you also need to call the [DescribeCertificateState](https://help.aliyun.com/document_detail/455800.html) operation to obtain the information that is required to complete the verification of the domain name ownership, and complete the verification. If you use the DNS verification method, you must complete the verification in the management platform of the domain name. If you use the file verification method, you must complete the verification in the DNS server. Then, the certificate application order will be reviewed by the certificate authority (CA).
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
     * @summary Submits a certificate application.
     *
     * @description *   Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see [Purchase a certificate resource plan](https://help.aliyun.com/document_detail/28542.html). You can call the [DescribePackageState](https://help.aliyun.com/document_detail/455800.html) operation to query the usage of certificate resource plans of specified specifications, including the total number of certificate resource plans that you purchase, the number of certificate applications that are submitted, and the number of certificates that are issued.
     * *   After you call this operation to submit a certificate application and the certificate is issued, the certificate quota provided by the resource plan that you purchased is consumed. When you call this operation, you can use the **ProductCode** parameter to specify the specifications of the certificate that you want to apply for.
     * *   After you call this operation to submit a certificate application, you also need to call the [DescribeCertificateState](https://help.aliyun.com/document_detail/455800.html) operation to obtain the information that is required to complete the verification of the domain name ownership, and complete the verification. If you use the DNS verification method, you must complete the verification in the management platform of the domain name. If you use the file verification method, you must complete the verification in the DNS server. Then, the certificate application order will be reviewed by the certificate authority (CA).
     *
     * @param request CreateCertificateForPackageRequestRequest
     * @return CreateCertificateForPackageRequestResponse
     */
    public CreateCertificateForPackageRequestResponse createCertificateForPackageRequest(CreateCertificateForPackageRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCertificateForPackageRequestWithOptions(request, runtime);
    }

    /**
     * @summary Purchases, applies for, and issues a domain validated (DV) certificate by using extended certificate services.
     *
     * @description *   You can call this operation to apply for only DV certificates. If you want to apply for an organization validated (OV) or extended validation (EV) certificate, we recommend that you call the [CreateCertificateForPackageRequest](https://help.aliyun.com/document_detail/455296.html) operation. This operation allows you to apply for certificates of all specifications and specify the method to generate a certificate signing request (CSR) file.
     * *   Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see [Purchase a certificate resource plan](https://help.aliyun.com/document_detail/28542.html). You can call the [DescribePackageState](https://help.aliyun.com/document_detail/455803.html) operation to query the usage of certificate resource plans of specified specifications, including the total number of purchased certificate resource plans of the specified specifications, the number of times that certificate applications have been submitted, and the number of times that certificates have been issued.
     * *   When you call this operation, you can use the **ProductCode** parameter to specify the specifications of the certificate.
     * *   After you call this operation to submit a certificate application, Certificate Management Service automatically creates a CSR file for your application and consumes the certificate quota in the certificate resource plans of the specified specifications that you purchased. After you call this operation, you also need to call the [DescribeCertificateState](https://help.aliyun.com/document_detail/455800.html) operation to obtain the information that is required to complete domain name verification, and manually complete the verification. If you use the DNS verification method, you must complete the verification on the management platform of the domain name. If you use the file verification method, you must complete the verification on your DNS server. Then, the certificate authority (CA) will review your certificate application.
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
     * @summary Purchases, applies for, and issues a domain validated (DV) certificate by using extended certificate services.
     *
     * @description *   You can call this operation to apply for only DV certificates. If you want to apply for an organization validated (OV) or extended validation (EV) certificate, we recommend that you call the [CreateCertificateForPackageRequest](https://help.aliyun.com/document_detail/455296.html) operation. This operation allows you to apply for certificates of all specifications and specify the method to generate a certificate signing request (CSR) file.
     * *   Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see [Purchase a certificate resource plan](https://help.aliyun.com/document_detail/28542.html). You can call the [DescribePackageState](https://help.aliyun.com/document_detail/455803.html) operation to query the usage of certificate resource plans of specified specifications, including the total number of purchased certificate resource plans of the specified specifications, the number of times that certificate applications have been submitted, and the number of times that certificates have been issued.
     * *   When you call this operation, you can use the **ProductCode** parameter to specify the specifications of the certificate.
     * *   After you call this operation to submit a certificate application, Certificate Management Service automatically creates a CSR file for your application and consumes the certificate quota in the certificate resource plans of the specified specifications that you purchased. After you call this operation, you also need to call the [DescribeCertificateState](https://help.aliyun.com/document_detail/455800.html) operation to obtain the information that is required to complete domain name verification, and manually complete the verification. If you use the DNS verification method, you must complete the verification on the management platform of the domain name. If you use the file verification method, you must complete the verification on your DNS server. Then, the certificate authority (CA) will review your certificate application.
     *
     * @param request CreateCertificateRequestRequest
     * @return CreateCertificateRequestResponse
     */
    public CreateCertificateRequestResponse createCertificateRequest(CreateCertificateRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCertificateRequestWithOptions(request, runtime);
    }

    /**
     * @summary Purchases, applies for, and issues a domain validated (DV) certificate by using a custom certificate signing request (CSR) file. You can use extended certificate services to purchase and apply for a DV certificate with a few clicks.
     *
     * @description *   You can call the CreateCertificateWithCsrRequest operation to apply only for DV certificates. We recommend that you call the [CreateCertificateForPackageRequest](https://help.aliyun.com/document_detail/455296.html) operation to submit a certificate application. This operation allows you to apply for certificates of all specifications and specify the method to generate a CSR file.
     * *   Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see [Purchase a certificate resource plan](https://help.aliyun.com/document_detail/28542.html). You can call the [DescribePackageState](https://help.aliyun.com/document_detail/164110.html) operation to query the usage of certificate resource plans of specified specifications. The usage information includes the total number of purchased certificate resource plans of the specified specifications, the number of times that certificate applications are submitted, and the number of times that certificates are issued.
     * *   When you call this operation, you can use the **ProductCode** parameter to specify the specifications of the certificate.
     * *   After you call this operation to submit a certificate application, the certificate quota of the required specifications that you purchased is consumed. After you call this operation, you also need to call the [DescribeCertificateState](https://help.aliyun.com/document_detail/164111.html) operation to obtain the information that is required to complete domain name verification, and manually complete the verification. If you use the DNS verification method, you must complete the verification on the management platform of the domain name. If you use the file verification method, you must complete the verification on your DNS server. The certificate authority (CA) starts to review your certificate application only after the domain name verification is complete.
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
     * @summary Purchases, applies for, and issues a domain validated (DV) certificate by using a custom certificate signing request (CSR) file. You can use extended certificate services to purchase and apply for a DV certificate with a few clicks.
     *
     * @description *   You can call the CreateCertificateWithCsrRequest operation to apply only for DV certificates. We recommend that you call the [CreateCertificateForPackageRequest](https://help.aliyun.com/document_detail/455296.html) operation to submit a certificate application. This operation allows you to apply for certificates of all specifications and specify the method to generate a CSR file.
     * *   Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see [Purchase a certificate resource plan](https://help.aliyun.com/document_detail/28542.html). You can call the [DescribePackageState](https://help.aliyun.com/document_detail/164110.html) operation to query the usage of certificate resource plans of specified specifications. The usage information includes the total number of purchased certificate resource plans of the specified specifications, the number of times that certificate applications are submitted, and the number of times that certificates are issued.
     * *   When you call this operation, you can use the **ProductCode** parameter to specify the specifications of the certificate.
     * *   After you call this operation to submit a certificate application, the certificate quota of the required specifications that you purchased is consumed. After you call this operation, you also need to call the [DescribeCertificateState](https://help.aliyun.com/document_detail/164111.html) operation to obtain the information that is required to complete domain name verification, and manually complete the verification. If you use the DNS verification method, you must complete the verification on the management platform of the domain name. If you use the file verification method, you must complete the verification on your DNS server. The certificate authority (CA) starts to review your certificate application only after the domain name verification is complete.
     *
     * @param request CreateCertificateWithCsrRequestRequest
     * @return CreateCertificateWithCsrRequestResponse
     */
    public CreateCertificateWithCsrRequestResponse createCertificateWithCsrRequest(CreateCertificateWithCsrRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCertificateWithCsrRequestWithOptions(request, runtime);
    }

    /**
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
     * @param request CreateCsrRequest
     * @return CreateCsrResponse
     */
    public CreateCsrResponse createCsr(CreateCsrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCsrWithOptions(request, runtime);
    }

    /**
     * @summary 创建部署任务
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
     * @summary 创建部署任务
     *
     * @param request CreateDeploymentJobRequest
     * @return CreateDeploymentJobResponse
     */
    public CreateDeploymentJobResponse createDeploymentJob(CreateDeploymentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDeploymentJobWithOptions(request, runtime);
    }

    /**
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
     * @param request CreateWHClientCertificateRequest
     * @return CreateWHClientCertificateResponse
     */
    public CreateWHClientCertificateResponse createWHClientCertificate(CreateWHClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWHClientCertificateWithOptions(request, runtime);
    }

    /**
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

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            query.put("MessageType", request.messageType);
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
     * @param request DecryptRequest
     * @return DecryptResponse
     */
    public DecryptResponse decrypt(DecryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.decryptWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an order in which the application for a domain validated (DV) certificate failed.
     *
     * @description You can call this operation to delete a certificate application order only in the following scenarios:
     * *   The status of the order is review failed. You have called the [DescribeCertificateState](https://help.aliyun.com/document_detail/455800.html)  operation to query the status of the certificate application order and the value of the **Type** parameter is **verify_fail**.
     * *   The status of the order is **pending application**. You have called the [CancelOrderRequest](https://help.aliyun.com/document_detail/455299.html) operation to cancel a certificate application order whose status is pending review or being reviewed. The status of the certificate application order that is canceled in this case changes to **pending application**.
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
     * @summary Deletes an order in which the application for a domain validated (DV) certificate failed.
     *
     * @description You can call this operation to delete a certificate application order only in the following scenarios:
     * *   The status of the order is review failed. You have called the [DescribeCertificateState](https://help.aliyun.com/document_detail/455800.html)  operation to query the status of the certificate application order and the value of the **Type** parameter is **verify_fail**.
     * *   The status of the order is **pending application**. You have called the [CancelOrderRequest](https://help.aliyun.com/document_detail/455299.html) operation to cancel a certificate application order whose status is pending review or being reviewed. The status of the certificate application order that is canceled in this case changes to **pending application**.
     *
     * @param request DeleteCertificateRequestRequest
     * @return DeleteCertificateRequestResponse
     */
    public DeleteCertificateRequestResponse deleteCertificateRequest(DeleteCertificateRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCertificateRequestWithOptions(request, runtime);
    }

    /**
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
     * @param request DeleteCsrRequest
     * @return DeleteCsrResponse
     */
    public DeleteCsrResponse deleteCsr(DeleteCsrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCsrWithOptions(request, runtime);
    }

    /**
     * @summary 删除部署任务
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
     * @summary 删除部署任务
     *
     * @param request DeleteDeploymentJobRequest
     * @return DeleteDeploymentJobResponse
     */
    public DeleteDeploymentJobResponse deleteDeploymentJob(DeleteDeploymentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeploymentJobWithOptions(request, runtime);
    }

    /**
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
     * @param request DeletePCACertRequest
     * @return DeletePCACertResponse
     */
    public DeletePCACertResponse deletePCACert(DeletePCACertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePCACertWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an expired or uploaded certificate.
     *
     * @description You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Deletes an expired or uploaded certificate.
     *
     * @description You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DeleteUserCertificateRequest
     * @return DeleteUserCertificateResponse
     */
    public DeleteUserCertificateResponse deleteUserCertificate(DeleteUserCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserCertificateWithOptions(request, runtime);
    }

    /**
     * @summary 删除部署任务worker
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
     * @summary 删除部署任务worker
     *
     * @param request DeleteWorkerResourceRequest
     * @return DeleteWorkerResourceResponse
     */
    public DeleteWorkerResourceResponse deleteWorkerResource(DeleteWorkerResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkerResourceWithOptions(request, runtime);
    }

    /**
     * @summary Queries the status of a specified certificate application order.
     *
     * @description If you do not complete the verification of the domain name ownership after you submit a certificate application, you can call this operation to obtain the information that is required to complete the verification. You can complete the verification of the domain name ownership based on the data returned. If you use the DNS verification method, you must complete the verification on the management platform of the domain name. If you use the file verification method, you must complete the verification on the DNS server.
     * The certificate authority (CA) reviews your certificate application only after you complete the verification of the domain name ownership. After the CA approves your certificate application, the CA issues the certificate. If a certificate is issued, you can call this operation to obtain the CA certificate and private key of the certificate.
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
     * @summary Queries the status of a specified certificate application order.
     *
     * @description If you do not complete the verification of the domain name ownership after you submit a certificate application, you can call this operation to obtain the information that is required to complete the verification. You can complete the verification of the domain name ownership based on the data returned. If you use the DNS verification method, you must complete the verification on the management platform of the domain name. If you use the file verification method, you must complete the verification on the DNS server.
     * The certificate authority (CA) reviews your certificate application only after you complete the verification of the domain name ownership. After the CA approves your certificate application, the CA issues the certificate. If a certificate is issued, you can call this operation to obtain the CA certificate and private key of the certificate.
     *
     * @param request DescribeCertificateStateRequest
     * @return DescribeCertificateStateResponse
     */
    public DescribeCertificateStateResponse describeCertificateState(DescribeCertificateStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCertificateStateWithOptions(request, runtime);
    }

    /**
     * @summary 云产品分组-获取用户资源计数 
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
     * @summary 云产品分组-获取用户资源计数 
     *
     * @param request DescribeCloudResourceStatusRequest
     * @return DescribeCloudResourceStatusResponse
     */
    public DescribeCloudResourceStatusResponse describeCloudResourceStatus(DescribeCloudResourceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudResourceStatusWithOptions(request, runtime);
    }

    /**
     * @summary 获取部署任务详情
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
     * @summary 获取部署任务详情
     *
     * @param request DescribeDeploymentJobRequest
     * @return DescribeDeploymentJobResponse
     */
    public DescribeDeploymentJobResponse describeDeploymentJob(DescribeDeploymentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeploymentJobWithOptions(request, runtime);
    }

    /**
     * @summary 查询任务状态
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
     * @summary 查询任务状态
     *
     * @param request DescribeDeploymentJobStatusRequest
     * @return DescribeDeploymentJobStatusResponse
     */
    public DescribeDeploymentJobStatusResponse describeDeploymentJobStatus(DescribeDeploymentJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeploymentJobStatusWithOptions(request, runtime);
    }

    /**
     * @summary Queries the number and usage of purchased domain validated (DV) certificates.
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
     * @summary Queries the number and usage of purchased domain validated (DV) certificates.
     *
     * @param request DescribePackageStateRequest
     * @return DescribePackageStateResponse
     */
    public DescribePackageStateResponse describePackageState(DescribePackageStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePackageStateWithOptions(request, runtime);
    }

    /**
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

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            query.put("MessageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plaintext)) {
            query.put("Plaintext", request.plaintext);
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
     * @param request EncryptRequest
     * @return EncryptResponse
     */
    public EncryptResponse encrypt(EncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.encryptWithOptions(request, runtime);
    }

    /**
     * @param request GetCertWarehouseQuotaRequest
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
     * @return GetCertWarehouseQuotaResponse
     */
    public GetCertWarehouseQuotaResponse getCertWarehouseQuota() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCertWarehouseQuotaWithOptions(runtime);
    }

    /**
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
     * @param request GetCsrDetailRequest
     * @return GetCsrDetailResponse
     */
    public GetCsrDetailResponse getCsrDetail(GetCsrDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCsrDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a certificate.
     *
     * @description You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the details of a certificate.
     *
     * @description You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request GetUserCertificateDetailRequest
     * @return GetUserCertificateDetailResponse
     */
    public GetUserCertificateDetailResponse getUserCertificateDetail(GetUserCertificateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserCertificateDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the certificates in a certificate repository.
     *
     * @description You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the certificates in a certificate repository.
     *
     * @description You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request ListCertRequest
     * @return ListCertResponse
     */
    public ListCertResponse listCert(ListCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCertWithOptions(request, runtime);
    }

    /**
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
     * @param request ListCertWarehouseRequest
     * @return ListCertWarehouseResponse
     */
    public ListCertWarehouseResponse listCertWarehouse(ListCertWarehouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCertWarehouseWithOptions(request, runtime);
    }

    /**
     * @summary 云授权ak查询
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
     * @summary 云授权ak查询
     *
     * @param request ListCloudAccessRequest
     * @return ListCloudAccessResponse
     */
    public ListCloudAccessResponse listCloudAccess(ListCloudAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudAccessWithOptions(request, runtime);
    }

    /**
     * @summary 可选择的资源-查询云资源列表
     *
     * @param request ListCloudResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudResourcesResponse
     */
    public ListCloudResourcesResponse listCloudResourcesWithOptions(ListCloudResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * @summary 可选择的资源-查询云资源列表
     *
     * @param request ListCloudResourcesRequest
     * @return ListCloudResourcesResponse
     */
    public ListCloudResourcesResponse listCloudResources(ListCloudResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudResourcesWithOptions(request, runtime);
    }

    /**
     * @summary 获取联系人列表
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
     * @summary 获取联系人列表
     *
     * @param request ListContactRequest
     * @return ListContactResponse
     */
    public ListContactResponse listContact(ListContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContactWithOptions(request, runtime);
    }

    /**
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
     * @param request ListCsrRequest
     * @return ListCsrResponse
     */
    public ListCsrResponse listCsr(ListCsrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCsrWithOptions(request, runtime);
    }

    /**
     * @summary 获取部署任务列表
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
     * @summary 获取部署任务列表
     *
     * @param request ListDeploymentJobRequest
     * @return ListDeploymentJobResponse
     */
    public ListDeploymentJobResponse listDeploymentJob(ListDeploymentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeploymentJobWithOptions(request, runtime);
    }

    /**
     * @summary 获取部署任务的证书列表
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
     * @summary 获取部署任务的证书列表
     *
     * @param request ListDeploymentJobCertRequest
     * @return ListDeploymentJobCertResponse
     */
    public ListDeploymentJobCertResponse listDeploymentJobCert(ListDeploymentJobCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeploymentJobCertWithOptions(request, runtime);
    }

    /**
     * @summary 部署任务的资源列表
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
     * @summary 部署任务的资源列表
     *
     * @param request ListDeploymentJobResourceRequest
     * @return ListDeploymentJobResourceResponse
     */
    public ListDeploymentJobResourceResponse listDeploymentJobResource(ListDeploymentJobResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeploymentJobResourceWithOptions(request, runtime);
    }

    /**
     * @summary Queries the certificates or certificate orders of users.
     *
     * @description You can call the ListUserCertificateOrder operation to query the certificates or certificate orders of users. If you set OrderType to CERT or UPLOAD, certificates are returned. If you set OrderType to CPACK or BUY, certificate orders are returned.
     * ## Limits
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the certificates or certificate orders of users.
     *
     * @description You can call the ListUserCertificateOrder operation to query the certificates or certificate orders of users. If you set OrderType to CERT or UPLOAD, certificates are returned. If you set OrderType to CPACK or BUY, certificate orders are returned.
     * ## Limits
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request ListUserCertificateOrderRequest
     * @return ListUserCertificateOrderResponse
     */
    public ListUserCertificateOrderResponse listUserCertificateOrder(ListUserCertificateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserCertificateOrderWithOptions(request, runtime);
    }

    /**
     * @summary 查询部署任务worker
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
     * @summary 查询部署任务worker
     *
     * @param request ListWorkerResourceRequest
     * @return ListWorkerResourceResponse
     */
    public ListWorkerResourceResponse listWorkerResource(ListWorkerResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkerResourceWithOptions(request, runtime);
    }

    /**
     * @summary Move Resource Group
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
     * @summary Move Resource Group
     *
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
     * @summary Submits a renewal application for the certificate order of an issued certificate.
     *
     * @description You can call this operation to submit a renewal application for a certificate only when the order of the certificate is in the expiring state. After the renewal is complete, a new certificate order whose status is pending application is generated. You must submit a certificate application for the new certificate order and install the new certificate after the new certificate is issued.
     * > You can call the [DescribeCertificateState](https://help.aliyun.com/document_detail/455800.html) operation to query the status of a certificate application order. If the value of the **Type** response parameter is **certificate**, the certificate is issued.
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
     * @summary Submits a renewal application for the certificate order of an issued certificate.
     *
     * @description You can call this operation to submit a renewal application for a certificate only when the order of the certificate is in the expiring state. After the renewal is complete, a new certificate order whose status is pending application is generated. You must submit a certificate application for the new certificate order and install the new certificate after the new certificate is issued.
     * > You can call the [DescribeCertificateState](https://help.aliyun.com/document_detail/455800.html) operation to query the status of a certificate application order. If the value of the **Type** response parameter is **certificate**, the certificate is issued.
     *
     * @param request RenewCertificateOrderForPackageRequestRequest
     * @return RenewCertificateOrderForPackageRequestResponse
     */
    public RenewCertificateOrderForPackageRequestResponse renewCertificateOrderForPackageRequest(RenewCertificateOrderForPackageRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewCertificateOrderForPackageRequestWithOptions(request, runtime);
    }

    /**
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
     * @param request RevokeWHClientCertificateRequest
     * @return RevokeWHClientCertificateResponse
     */
    public RevokeWHClientCertificateResponse revokeWHClientCertificate(RevokeWHClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeWHClientCertificateWithOptions(request, runtime);
    }

    /**
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

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            query.put("MessageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signingAlgorithm)) {
            query.put("SigningAlgorithm", request.signingAlgorithm);
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
     * @param request SignRequest
     * @return SignResponse
     */
    public SignResponse sign(SignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.signWithOptions(request, runtime);
    }

    /**
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
     * @param request UpdateCsrRequest
     * @return UpdateCsrResponse
     */
    public UpdateCsrResponse updateCsr(UpdateCsrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCsrWithOptions(request, runtime);
    }

    /**
     * @summary 更新部署任务
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
     * @summary 更新部署任务
     *
     * @param request UpdateDeploymentJobRequest
     * @return UpdateDeploymentJobResponse
     */
    public UpdateDeploymentJobResponse updateDeploymentJob(UpdateDeploymentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDeploymentJobWithOptions(request, runtime);
    }

    /**
     * @summary 更新任务部署任务状态
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
     * @summary 更新任务部署任务状态
     *
     * @param request UpdateDeploymentJobStatusRequest
     * @return UpdateDeploymentJobStatusResponse
     */
    public UpdateDeploymentJobStatusResponse updateDeploymentJobStatus(UpdateDeploymentJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDeploymentJobStatusWithOptions(request, runtime);
    }

    /**
     * @summary 更新部署任务worker状态
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
     * @summary 更新部署任务worker状态
     *
     * @param request UpdateWorkerResourceStatusRequest
     * @return UpdateWorkerResourceStatusResponse
     */
    public UpdateWorkerResourceStatusResponse updateWorkerResourceStatus(UpdateWorkerResourceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkerResourceStatusWithOptions(request, runtime);
    }

    /**
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
     * @param request UploadCsrRequest
     * @return UploadCsrResponse
     */
    public UploadCsrResponse uploadCsr(UploadCsrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadCsrWithOptions(request, runtime);
    }

    /**
     * @summary The private key of the certificate.
     *
     * @description The unique identifier of the certificate.
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
     * @summary The private key of the certificate.
     *
     * @description The unique identifier of the certificate.
     *
     * @param request UploadPCACertRequest
     * @return UploadPCACertResponse
     */
    public UploadPCACertResponse uploadPCACert(UploadPCACertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadPCACertWithOptions(request, runtime);
    }

    /**
     * @summary Uploads a certificate.
     *
     * @description You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Uploads a certificate.
     *
     * @description You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request UploadUserCertificateRequest
     * @return UploadUserCertificateResponse
     */
    public UploadUserCertificateResponse uploadUserCertificate(UploadUserCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadUserCertificateWithOptions(request, runtime);
    }

    /**
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
     * @param request VerifyRequest
     * @return VerifyResponse
     */
    public VerifyResponse verify(VerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyWithOptions(request, runtime);
    }
}
