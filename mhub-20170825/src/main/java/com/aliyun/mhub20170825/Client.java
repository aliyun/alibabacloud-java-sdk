// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825;

import com.aliyun.tea.*;
import com.aliyun.mhub20170825.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mhub", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request CreateAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppResponse
     */
    public CreateAppResponse createAppWithOptions(CreateAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bundleId)) {
            query.put("BundleId", request.bundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodedIcon)) {
            query.put("EncodedIcon", request.encodedIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industryId)) {
            query.put("IndustryId", request.industryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageName)) {
            query.put("PackageName", request.packageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApp"),
            new TeaPair("version", "2017-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateAppResponse());
        }

    }

    /**
     * @param request CreateAppRequest
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    /**
     * @param request CreateProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProductResponse
     */
    public CreateProductResponse createProductWithOptions(CreateProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProduct"),
            new TeaPair("version", "2017-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateProductResponse());
        }

    }

    /**
     * @param request CreateProductRequest
     * @return CreateProductResponse
     */
    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProductWithOptions(request, runtime);
    }

    /**
     * @param request DeleteAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApp"),
            new TeaPair("version", "2017-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteAppResponse());
        }

    }

    /**
     * @param request DeleteAppRequest
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    /**
     * @param request DeleteProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProductWithOptions(DeleteProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProduct"),
            new TeaPair("version", "2017-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteProductResponse());
        }

    }

    /**
     * @param request DeleteProductRequest
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProduct(DeleteProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取emas dashboard</p>
     * 
     * @param request DescribeDashboardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDashboardResponse
     */
    public DescribeDashboardResponse describeDashboardWithOptions(DescribeDashboardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            query.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            query.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyAction)) {
            query.put("ProxyAction", request.proxyAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDashboard"),
            new TeaPair("version", "2017-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDashboardResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDashboardResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取emas dashboard</p>
     * 
     * @param request DescribeDashboardRequest
     * @return DescribeDashboardResponse
     */
    public DescribeDashboardResponse describeDashboard(DescribeDashboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDashboardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>展示用户应用列表</p>
     * 
     * @param request ListAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppsResponse
     */
    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApps"),
            new TeaPair("version", "2017-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListAppsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>展示用户应用列表</p>
     * 
     * @param request ListAppsRequest
     * @return ListAppsResponse
     */
    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppsWithOptions(request, runtime);
    }

    /**
     * @param request ListProductsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductsResponse
     */
    public ListProductsResponse listProductsWithOptions(ListProductsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            query.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.simple)) {
            query.put("Simple", request.simple);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProducts"),
            new TeaPair("version", "2017-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListProductsResponse());
        }

    }

    /**
     * @param request ListProductsRequest
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductsWithOptions(request, runtime);
    }

    /**
     * @param request ModifyAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppResponse
     */
    public ModifyAppResponse modifyAppWithOptions(ModifyAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bundleId)) {
            query.put("BundleId", request.bundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodedIcon)) {
            query.put("EncodedIcon", request.encodedIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industryId)) {
            query.put("IndustryId", request.industryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageName)) {
            query.put("PackageName", request.packageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApp"),
            new TeaPair("version", "2017-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyAppResponse());
        }

    }

    /**
     * @param request ModifyAppRequest
     * @return ModifyAppResponse
     */
    public ModifyAppResponse modifyApp(ModifyAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppWithOptions(request, runtime);
    }

    /**
     * @param request ModifyProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyProductResponse
     */
    public ModifyProductResponse modifyProductWithOptions(ModifyProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyProduct"),
            new TeaPair("version", "2017-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyProductResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyProductResponse());
        }

    }

    /**
     * @param request ModifyProductRequest
     * @return ModifyProductResponse
     */
    public ModifyProductResponse modifyProduct(ModifyProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyProductWithOptions(request, runtime);
    }

    /**
     * @param request OpenEmasServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenEmasServiceResponse
     */
    public OpenEmasServiceResponse openEmasServiceWithOptions(OpenEmasServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenEmasService"),
            new TeaPair("version", "2017-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new OpenEmasServiceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new OpenEmasServiceResponse());
        }

    }

    /**
     * @param request OpenEmasServiceRequest
     * @return OpenEmasServiceResponse
     */
    public OpenEmasServiceResponse openEmasService(OpenEmasServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openEmasServiceWithOptions(request, runtime);
    }

    /**
     * @param request QueryAppInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAppInfoResponse
     */
    public QueryAppInfoResponse queryAppInfoWithOptions(QueryAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAppInfo"),
            new TeaPair("version", "2017-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAppInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryAppInfoResponse());
        }

    }

    /**
     * @param request QueryAppInfoRequest
     * @return QueryAppInfoResponse
     */
    public QueryAppInfoResponse queryAppInfo(QueryAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAppInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用对应的安全字段</p>
     * 
     * @param request QueryAppSecurityInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAppSecurityInfoResponse
     */
    public QueryAppSecurityInfoResponse queryAppSecurityInfoWithOptions(QueryAppSecurityInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAppSecurityInfo"),
            new TeaPair("version", "2017-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAppSecurityInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryAppSecurityInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询应用对应的安全字段</p>
     * 
     * @param request QueryAppSecurityInfoRequest
     * @return QueryAppSecurityInfoResponse
     */
    public QueryAppSecurityInfoResponse queryAppSecurityInfo(QueryAppSecurityInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAppSecurityInfoWithOptions(request, runtime);
    }

    /**
     * @param request QueryProductInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryProductInfoResponse
     */
    public QueryProductInfoResponse queryProductInfoWithOptions(QueryProductInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryProductInfo"),
            new TeaPair("version", "2017-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryProductInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryProductInfoResponse());
        }

    }

    /**
     * @param request QueryProductInfoRequest
     * @return QueryProductInfoResponse
     */
    public QueryProductInfoResponse queryProductInfo(QueryProductInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryProductInfoWithOptions(request, runtime);
    }
}
