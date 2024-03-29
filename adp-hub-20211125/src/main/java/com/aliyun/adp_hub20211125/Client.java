// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp_hub20211125;

import com.aliyun.tea.*;
import com.aliyun.adp_hub20211125.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("adp-hub", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateProductVersionResponse createProductVersion(CreateProductVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProductVersionWithOptions(request, headers, runtime);
    }

    public CreateProductVersionResponse createProductVersionWithOptions(CreateProductVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productDescription)) {
            body.put("productDescription", request.productDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("productName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateProductVersion", "2021-11-25", "HTTPS", "POST", "AK", "/api/v2/hub/product-versions", "json", req, runtime), new CreateProductVersionResponse());
    }

    public CreateVersionPackageInstallConfigResponse createVersionPackageInstallConfig(CreateVersionPackageInstallConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVersionPackageInstallConfigWithOptions(request, headers, runtime);
    }

    public CreateVersionPackageInstallConfigResponse createVersionPackageInstallConfigWithOptions(CreateVersionPackageInstallConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentUID)) {
            body.put("environmentUID", request.environmentUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateVersionPackageInstallConfig", "2021-11-25", "HTTPS", "POST", "AK", "/api/v2/hub/version-packages/install-configs", "json", req, runtime), new CreateVersionPackageInstallConfigResponse());
    }

    public CreateVersionPackageLicenseResponse createVersionPackageLicense(CreateVersionPackageLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVersionPackageLicenseWithOptions(request, headers, runtime);
    }

    public CreateVersionPackageLicenseResponse createVersionPackageLicenseWithOptions(CreateVersionPackageLicenseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customProductQuotaList)) {
            body.put("customProductQuotaList", request.customProductQuotaList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentUID)) {
            body.put("environmentUID", request.environmentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            body.put("expiredTime", request.expiredTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineFingerprint)) {
            body.put("machineFingerprint", request.machineFingerprint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            body.put("productVersionUID", request.productVersionUID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateVersionPackageLicense", "2021-11-25", "HTTPS", "POST", "AK", "/api/v2/hub/version-packages/product-licenses", "json", req, runtime), new CreateVersionPackageLicenseResponse());
    }

    public DeleteProductResponse deleteProduct(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductWithOptions(uid, headers, runtime);
    }

    public DeleteProductResponse deleteProductWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteProduct", "2021-11-25", "HTTPS", "DELETE", "AK", "/api/v2/hub/products/" + uid + "", "json", req, runtime), new DeleteProductResponse());
    }

    public DeleteProductVersionResponse deleteProductVersion(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductVersionWithOptions(uid, headers, runtime);
    }

    public DeleteProductVersionResponse deleteProductVersionWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteProductVersion", "2021-11-25", "HTTPS", "DELETE", "AK", "/api/v2/hub/product-versions/" + uid + "", "json", req, runtime), new DeleteProductVersionResponse());
    }

    public GetProductVersionResponse getProductVersion(String uid) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductVersionWithOptions(uid, headers, runtime);
    }

    public GetProductVersionResponse getProductVersionWithOptions(String uid, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetProductVersion", "2021-11-25", "HTTPS", "GET", "AK", "/api/v2/hub/product-versions/" + uid + "", "json", req, runtime), new GetProductVersionResponse());
    }

    public ListProductVersionsResponse listProductVersions(ListProductVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductVersionsWithOptions(request, headers, runtime);
    }

    public ListProductVersionsResponse listProductVersionsWithOptions(ListProductVersionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("uid", request.uid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListProductVersions", "2021-11-25", "HTTPS", "GET", "AK", "/api/v2/hub/product-versions", "json", req, runtime), new ListProductVersionsResponse());
    }

    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductsWithOptions(request, headers, runtime);
    }

    public ListProductsResponse listProductsWithOptions(ListProductsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListProducts", "2021-11-25", "HTTPS", "GET", "AK", "/api/v2/hub/products", "json", req, runtime), new ListProductsResponse());
    }

    public ListVersionPackagesResponse listVersionPackages(ListVersionPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVersionPackagesWithOptions(request, headers, runtime);
    }

    public ListVersionPackagesResponse listVersionPackagesWithOptions(ListVersionPackagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("uid", request.uid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListVersionPackages", "2021-11-25", "HTTPS", "GET", "AK", "/api/v2/hub/version-packages", "json", req, runtime), new ListVersionPackagesResponse());
    }

    public UpdateProductResponse updateProduct(String uid, UpdateProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductWithOptions(uid, request, headers, runtime);
    }

    public UpdateProductResponse updateProductWithOptions(String uid, UpdateProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPublic)) {
            body.put("isPublic", request.isPublic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateProduct", "2021-11-25", "HTTPS", "PUT", "AK", "/api/v2/hub/products/" + uid + "", "json", req, runtime), new UpdateProductResponse());
    }

    public UpdateProductVersionResponse updateProductVersion(String uid, UpdateProductVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductVersionWithOptions(uid, request, headers, runtime);
    }

    public UpdateProductVersionResponse updateProductVersionWithOptions(String uid, UpdateProductVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        uid = com.aliyun.openapiutil.Client.getEncodeParam(uid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.document)) {
            body.put("document", request.document);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readme)) {
            body.put("readme", request.readme);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateProductVersion", "2021-11-25", "HTTPS", "PUT", "AK", "/api/v2/hub/product-versions/" + uid + "", "json", req, runtime), new UpdateProductVersionResponse());
    }
}
