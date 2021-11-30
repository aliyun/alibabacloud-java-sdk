// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630;

import com.aliyun.tea.*;
import com.aliyun.cas20200630.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "cas.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "cas.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "cas.aliyuncs.com"),
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
            new TeaPair("cn-yushanfang", "cas.aliyuncs.com"),
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

    public CreateCertificateWithExtensionResponse createCertificateWithExtensionWithOptions(CreateCertificateWithExtensionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AfterTime", request.afterTime);
        query.put("AlgorithmKeySize", request.algorithmKeySize);
        query.put("AliasName", request.aliasName);
        query.put("AppendCrl", request.appendCrl);
        query.put("BasicConstraintsCritical", request.basicConstraintsCritical);
        query.put("BeforeTime", request.beforeTime);
        query.put("CertType", request.certType);
        query.put("CommonName", request.commonName);
        query.put("CountryCode", request.countryCode);
        query.put("CsrPemString", request.csrPemString);
        query.put("Locality", request.locality);
        query.put("Organization", request.organization);
        query.put("OrganizationUnit", request.organizationUnit);
        query.put("ParentIdentifier", request.parentIdentifier);
        query.put("Sans", request.sans);
        query.put("State", request.state);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCertificateWithExtension"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCertificateWithExtensionResponse());
    }

    public CreateCertificateWithExtensionResponse createCertificateWithExtension(CreateCertificateWithExtensionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCertificateWithExtensionWithOptions(request, runtime);
    }

    public CreateClientCertificateResponse createClientCertificateWithOptions(CreateClientCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AfterTime", request.afterTime);
        query.put("Algorithm", request.algorithm);
        query.put("BeforeTime", request.beforeTime);
        query.put("CommonName", request.commonName);
        query.put("Days", request.days);
        query.put("ParentIdentifier", request.parentIdentifier);
        query.put("SanType", request.sanType);
        query.put("SanValue", request.sanValue);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClientCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClientCertificateResponse());
    }

    public CreateClientCertificateResponse createClientCertificate(CreateClientCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClientCertificateWithOptions(request, runtime);
    }

    public CreateClientCertificateWithCsrResponse createClientCertificateWithCsrWithOptions(CreateClientCertificateWithCsrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AfterTime", request.afterTime);
        query.put("BeforeTime", request.beforeTime);
        query.put("Csr", request.csr);
        query.put("Days", request.days);
        query.put("ParentIdentifier", request.parentIdentifier);
        query.put("SanType", request.sanType);
        query.put("SanValue", request.sanValue);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClientCertificateWithCsr"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClientCertificateWithCsrResponse());
    }

    public CreateClientCertificateWithCsrResponse createClientCertificateWithCsr(CreateClientCertificateWithCsrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClientCertificateWithCsrWithOptions(request, runtime);
    }

    public CreateRevokeClientCertificateResponse createRevokeClientCertificateWithOptions(CreateRevokeClientCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Identifier", request.identifier);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRevokeClientCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRevokeClientCertificateResponse());
    }

    public CreateRevokeClientCertificateResponse createRevokeClientCertificate(CreateRevokeClientCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRevokeClientCertificateWithOptions(request, runtime);
    }

    public CreateRootCACertificateResponse createRootCACertificateWithOptions(CreateRootCACertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Algorithm", request.algorithm);
        query.put("CommonName", request.commonName);
        query.put("CountryCode", request.countryCode);
        query.put("Locality", request.locality);
        query.put("Organization", request.organization);
        query.put("OrganizationUnit", request.organizationUnit);
        query.put("State", request.state);
        query.put("Years", request.years);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRootCACertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRootCACertificateResponse());
    }

    public CreateRootCACertificateResponse createRootCACertificate(CreateRootCACertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRootCACertificateWithOptions(request, runtime);
    }

    public CreateServerCertificateResponse createServerCertificateWithOptions(CreateServerCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AfterTime", request.afterTime);
        query.put("Algorithm", request.algorithm);
        query.put("BeforeTime", request.beforeTime);
        query.put("CommonName", request.commonName);
        query.put("Days", request.days);
        query.put("Domain", request.domain);
        query.put("ParentIdentifier", request.parentIdentifier);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServerCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServerCertificateResponse());
    }

    public CreateServerCertificateResponse createServerCertificate(CreateServerCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServerCertificateWithOptions(request, runtime);
    }

    public CreateServerCertificateWithCsrResponse createServerCertificateWithCsrWithOptions(CreateServerCertificateWithCsrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AfterTime", request.afterTime);
        query.put("BeforeTime", request.beforeTime);
        query.put("Csr", request.csr);
        query.put("Days", request.days);
        query.put("Domain", request.domain);
        query.put("ParentIdentifier", request.parentIdentifier);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServerCertificateWithCsr"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServerCertificateWithCsrResponse());
    }

    public CreateServerCertificateWithCsrResponse createServerCertificateWithCsr(CreateServerCertificateWithCsrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServerCertificateWithCsrWithOptions(request, runtime);
    }

    public CreateSubCACertificateResponse createSubCACertificateWithOptions(CreateSubCACertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Algorithm", request.algorithm);
        query.put("CommonName", request.commonName);
        query.put("CountryCode", request.countryCode);
        query.put("Locality", request.locality);
        query.put("Organization", request.organization);
        query.put("OrganizationUnit", request.organizationUnit);
        query.put("ParentIdentifier", request.parentIdentifier);
        query.put("State", request.state);
        query.put("Years", request.years);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubCACertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubCACertificateResponse());
    }

    public CreateSubCACertificateResponse createSubCACertificate(CreateSubCACertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSubCACertificateWithOptions(request, runtime);
    }

    public DeleteClientCertificateResponse deleteClientCertificateWithOptions(DeleteClientCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Identifier", request.identifier);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClientCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClientCertificateResponse());
    }

    public DeleteClientCertificateResponse deleteClientCertificate(DeleteClientCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClientCertificateWithOptions(request, runtime);
    }

    public DescribeCACertificateResponse describeCACertificateWithOptions(DescribeCACertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Identifier", request.identifier);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCACertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCACertificateResponse());
    }

    public DescribeCACertificateResponse describeCACertificate(DescribeCACertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCACertificateWithOptions(request, runtime);
    }

    public DescribeCACertificateCountResponse describeCACertificateCountWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCACertificateCount"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCACertificateCountResponse());
    }

    public DescribeCACertificateCountResponse describeCACertificateCount() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCACertificateCountWithOptions(runtime);
    }

    public DescribeCACertificateListResponse describeCACertificateListWithOptions(DescribeCACertificateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("ShowSize", request.showSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCACertificateList"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCACertificateListResponse());
    }

    public DescribeCACertificateListResponse describeCACertificateList(DescribeCACertificateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCACertificateListWithOptions(request, runtime);
    }

    public DescribeCertificatePrivateKeyResponse describeCertificatePrivateKeyWithOptions(DescribeCertificatePrivateKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EncryptedCode", request.encryptedCode);
        query.put("Identifier", request.identifier);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCertificatePrivateKey"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCertificatePrivateKeyResponse());
    }

    public DescribeCertificatePrivateKeyResponse describeCertificatePrivateKey(DescribeCertificatePrivateKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCertificatePrivateKeyWithOptions(request, runtime);
    }

    public DescribeClientCertificateResponse describeClientCertificateWithOptions(DescribeClientCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Identifier", request.identifier);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClientCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClientCertificateResponse());
    }

    public DescribeClientCertificateResponse describeClientCertificate(DescribeClientCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClientCertificateWithOptions(request, runtime);
    }

    public DescribeClientCertificateForSerialNumberResponse describeClientCertificateForSerialNumberWithOptions(DescribeClientCertificateForSerialNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SerialNumber", request.serialNumber);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClientCertificateForSerialNumber"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClientCertificateForSerialNumberResponse());
    }

    public DescribeClientCertificateForSerialNumberResponse describeClientCertificateForSerialNumber(DescribeClientCertificateForSerialNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClientCertificateForSerialNumberWithOptions(request, runtime);
    }

    public DescribeClientCertificateStatusResponse describeClientCertificateStatusWithOptions(DescribeClientCertificateStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Identifier", request.identifier);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClientCertificateStatus"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClientCertificateStatusResponse());
    }

    public DescribeClientCertificateStatusResponse describeClientCertificateStatus(DescribeClientCertificateStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClientCertificateStatusWithOptions(request, runtime);
    }

    public DescribeClientCertificateStatusForSerialNumberResponse describeClientCertificateStatusForSerialNumberWithOptions(DescribeClientCertificateStatusForSerialNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SerialNumber", request.serialNumber);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClientCertificateStatusForSerialNumber"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClientCertificateStatusForSerialNumberResponse());
    }

    public DescribeClientCertificateStatusForSerialNumberResponse describeClientCertificateStatusForSerialNumber(DescribeClientCertificateStatusForSerialNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClientCertificateStatusForSerialNumberWithOptions(request, runtime);
    }

    public GetCAInstanceStatusResponse getCAInstanceStatusWithOptions(GetCAInstanceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCAInstanceStatus"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCAInstanceStatusResponse());
    }

    public GetCAInstanceStatusResponse getCAInstanceStatus(GetCAInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCAInstanceStatusWithOptions(request, runtime);
    }

    public ListCACertificateLogResponse listCACertificateLogWithOptions(ListCACertificateLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Identifier", request.identifier);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCACertificateLog"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCACertificateLogResponse());
    }

    public ListCACertificateLogResponse listCACertificateLog(ListCACertificateLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCACertificateLogWithOptions(request, runtime);
    }

    public ListClientCertificateResponse listClientCertificateWithOptions(ListClientCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("ShowSize", request.showSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClientCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClientCertificateResponse());
    }

    public ListClientCertificateResponse listClientCertificate(ListClientCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClientCertificateWithOptions(request, runtime);
    }

    public ListRevokeCertificateResponse listRevokeCertificateWithOptions(ListRevokeCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("ShowSize", request.showSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRevokeCertificate"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRevokeCertificateResponse());
    }

    public ListRevokeCertificateResponse listRevokeCertificate(ListRevokeCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRevokeCertificateWithOptions(request, runtime);
    }

    public UpdateCACertificateStatusResponse updateCACertificateStatusWithOptions(UpdateCACertificateStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Identifier", request.identifier);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCACertificateStatus"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCACertificateStatusResponse());
    }

    public UpdateCACertificateStatusResponse updateCACertificateStatus(UpdateCACertificateStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCACertificateStatusWithOptions(request, runtime);
    }
}
