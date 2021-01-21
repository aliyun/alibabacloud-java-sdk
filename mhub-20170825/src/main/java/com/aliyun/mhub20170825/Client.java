// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825;

import com.aliyun.tea.*;
import com.aliyun.mhub20170825.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mhub", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public OpenEmasServiceResponse openEmasServiceWithOptions(OpenEmasServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("OpenEmasService", "HTTPS", "POST", "2017-08-25", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new OpenEmasServiceResponse());
    }

    public OpenEmasServiceResponse openEmasService(OpenEmasServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openEmasServiceWithOptions(request, runtime);
    }

    public QueryVersionInfosResponse queryVersionInfosWithOptions(QueryVersionInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryVersionInfos", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryVersionInfosResponse());
    }

    public QueryVersionInfosResponse queryVersionInfos(QueryVersionInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryVersionInfosWithOptions(request, runtime);
    }

    public QueryProductInfoResponse queryProductInfoWithOptions(QueryProductInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryProductInfo", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryProductInfoResponse());
    }

    public QueryProductInfoResponse queryProductInfo(QueryProductInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProductInfoWithOptions(request, runtime);
    }

    public QueryAppSecurityInfoResponse queryAppSecurityInfoWithOptions(QueryAppSecurityInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAppSecurityInfo", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryAppSecurityInfoResponse());
    }

    public QueryAppSecurityInfoResponse queryAppSecurityInfo(QueryAppSecurityInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAppSecurityInfoWithOptions(request, runtime);
    }

    public QueryAppInfoResponse queryAppInfoWithOptions(QueryAppInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAppInfo", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryAppInfoResponse());
    }

    public QueryAppInfoResponse queryAppInfo(QueryAppInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAppInfoWithOptions(request, runtime);
    }

    public ModifyProductResponse modifyProductWithOptions(ModifyProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyProduct", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new ModifyProductResponse());
    }

    public ModifyProductResponse modifyProduct(ModifyProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyProductWithOptions(request, runtime);
    }

    public ModifyAppResponse modifyAppWithOptions(ModifyAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyApp", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new ModifyAppResponse());
    }

    public ModifyAppResponse modifyApp(ModifyAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAppWithOptions(request, runtime);
    }

    public ListProductsResponse listProductsWithOptions(ListProductsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListProducts", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new ListProductsResponse());
    }

    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProductsWithOptions(request, runtime);
    }

    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListApps", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new ListAppsResponse());
    }

    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppsWithOptions(request, runtime);
    }

    public DeleteProductResponse deleteProductWithOptions(DeleteProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteProduct", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new DeleteProductResponse());
    }

    public DeleteProductResponse deleteProduct(DeleteProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProductWithOptions(request, runtime);
    }

    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteApp", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAppResponse());
    }

    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    public CreateProductResponse createProductWithOptions(CreateProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateProduct", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new CreateProductResponse());
    }

    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProductWithOptions(request, runtime);
    }

    public CreateAppResponse createAppWithOptions(CreateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateApp", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
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
}
