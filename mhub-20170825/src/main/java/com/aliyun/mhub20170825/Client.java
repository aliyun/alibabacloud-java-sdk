// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825;

import com.aliyun.tea.*;
import com.aliyun.mhub20170825.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mhub", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public ListAppsByOwnerResponse listAppsByOwnerWithOptions(ListAppsByOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAppsByOwner", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new ListAppsByOwnerResponse());
    }

    public ListAppsByOwnerResponse listAppsByOwner(ListAppsByOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppsByOwnerWithOptions(request, runtime);
    }

    public QueryUserServiceInfoResponse queryUserServiceInfoWithOptions(QueryUserServiceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryUserServiceInfo", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryUserServiceInfoResponse());
    }

    public QueryUserServiceInfoResponse queryUserServiceInfo(QueryUserServiceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserServiceInfoWithOptions(request, runtime);
    }

    public UpdateUserServiceInfoResponse updateUserServiceInfoWithOptions(UpdateUserServiceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateUserServiceInfo", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new UpdateUserServiceInfoResponse());
    }

    public UpdateUserServiceInfoResponse updateUserServiceInfo(UpdateUserServiceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserServiceInfoWithOptions(request, runtime);
    }

    public ListUserServiceInfosResponse listUserServiceInfosWithOptions(ListUserServiceInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListUserServiceInfos", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new ListUserServiceInfosResponse());
    }

    public ListUserServiceInfosResponse listUserServiceInfos(ListUserServiceInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserServiceInfosWithOptions(request, runtime);
    }

    public SpiPhysicalDeleteResourceResponse spiPhysicalDeleteResourceWithOptions(SpiPhysicalDeleteResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SpiPhysicalDeleteResource", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new SpiPhysicalDeleteResourceResponse());
    }

    public SpiPhysicalDeleteResourceResponse spiPhysicalDeleteResource(SpiPhysicalDeleteResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.spiPhysicalDeleteResourceWithOptions(request, runtime);
    }

    public SpiLogicalDeleteResourceResponse spiLogicalDeleteResourceWithOptions(SpiLogicalDeleteResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SpiLogicalDeleteResource", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new SpiLogicalDeleteResourceResponse());
    }

    public SpiLogicalDeleteResourceResponse spiLogicalDeleteResource(SpiLogicalDeleteResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.spiLogicalDeleteResourceWithOptions(request, runtime);
    }

    public SpiCheckResourceResponse spiCheckResourceWithOptions(SpiCheckResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SpiCheckResource", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new SpiCheckResourceResponse());
    }

    public SpiCheckResourceResponse spiCheckResource(SpiCheckResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.spiCheckResourceWithOptions(request, runtime);
    }

    public BuildSDKConfigResponse buildSDKConfigWithOptions(BuildSDKConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BuildSDKConfig", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new BuildSDKConfigResponse());
    }

    public BuildSDKConfigResponse buildSDKConfig(BuildSDKConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.buildSDKConfigWithOptions(request, runtime);
    }

    public TestFlightResponse testFlightWithOptions(TestFlightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TestFlight", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new TestFlightResponse());
    }

    public TestFlightResponse testFlight(TestFlightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testFlightWithOptions(request, runtime);
    }

    public VerifyCertResponse verifyCertWithOptions(VerifyCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("VerifyCert", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new VerifyCertResponse());
    }

    public VerifyCertResponse verifyCert(VerifyCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyCertWithOptions(request, runtime);
    }

    public QueryVersionInfosResponse queryVersionInfosWithOptions(QueryVersionInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryVersionInfos", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryVersionInfosResponse());
    }

    public QueryVersionInfosResponse queryVersionInfos(QueryVersionInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryVersionInfosWithOptions(request, runtime);
    }

    public QueryUserNoticeStatusResponse queryUserNoticeStatusWithOptions(QueryUserNoticeStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryUserNoticeStatus", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryUserNoticeStatusResponse());
    }

    public QueryUserNoticeStatusResponse queryUserNoticeStatus(QueryUserNoticeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserNoticeStatusWithOptions(request, runtime);
    }

    public QueryPackInfoResponse queryPackInfoWithOptions(QueryPackInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryPackInfo", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryPackInfoResponse());
    }

    public QueryPackInfoResponse queryPackInfo(QueryPackInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPackInfoWithOptions(request, runtime);
    }

    public QueryPackHistoriesResponse queryPackHistoriesWithOptions(QueryPackHistoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryPackHistories", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryPackHistoriesResponse());
    }

    public QueryPackHistoriesResponse queryPackHistories(QueryPackHistoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPackHistoriesWithOptions(request, runtime);
    }

    public QueryLastestVersionInfoResponse queryLastestVersionInfoWithOptions(QueryLastestVersionInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryLastestVersionInfo", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryLastestVersionInfoResponse());
    }

    public QueryLastestVersionInfoResponse queryLastestVersionInfo(QueryLastestVersionInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLastestVersionInfoWithOptions(request, runtime);
    }

    public PackSDKResponse packSDKWithOptions(PackSDKRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PackSDK", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new PackSDKResponse());
    }

    public PackSDKResponse packSDK(PackSDKRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.packSDKWithOptions(request, runtime);
    }

    public DownloadPackageResponse downloadPackageWithOptions(DownloadPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DownloadPackage", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new DownloadPackageResponse());
    }

    public DownloadPackageResponse downloadPackage(DownloadPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadPackageWithOptions(request, runtime);
    }

    public QueryProductInfoResponse queryProductInfoWithOptions(QueryProductInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryProductInfo", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryProductInfoResponse());
    }

    public QueryProductInfoResponse queryProductInfo(QueryProductInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryProductInfoWithOptions(request, runtime);
    }

    public QueryAppSecurityInfoResponse queryAppSecurityInfoWithOptions(QueryAppSecurityInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAppSecurityInfo", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryAppSecurityInfoResponse());
    }

    public QueryAppSecurityInfoResponse queryAppSecurityInfo(QueryAppSecurityInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAppSecurityInfoWithOptions(request, runtime);
    }

    public QueryAppInfoResponse queryAppInfoWithOptions(QueryAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAppInfo", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryAppInfoResponse());
    }

    public QueryAppInfoResponse queryAppInfo(QueryAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAppInfoWithOptions(request, runtime);
    }

    public ModifyProductResponse modifyProductWithOptions(ModifyProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyProduct", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new ModifyProductResponse());
    }

    public ModifyProductResponse modifyProduct(ModifyProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyProductWithOptions(request, runtime);
    }

    public ModifyAppResponse modifyAppWithOptions(ModifyAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyApp", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new ModifyAppResponse());
    }

    public ModifyAppResponse modifyApp(ModifyAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppWithOptions(request, runtime);
    }

    public ListProductsResponse listProductsWithOptions(ListProductsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListProducts", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new ListProductsResponse());
    }

    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductsWithOptions(request, runtime);
    }

    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListApps", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new ListAppsResponse());
    }

    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppsWithOptions(request, runtime);
    }

    public DeleteProductResponse deleteProductWithOptions(DeleteProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteProduct", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new DeleteProductResponse());
    }

    public DeleteProductResponse deleteProduct(DeleteProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProductWithOptions(request, runtime);
    }

    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteApp", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAppResponse());
    }

    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    public CreateProductResponse createProductWithOptions(CreateProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateProduct", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new CreateProductResponse());
    }

    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProductWithOptions(request, runtime);
    }

    public CreateAppResponse createAppWithOptions(CreateAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateApp", "HTTPS", "POST", "2017-08-25", "AK", null, TeaModel.buildMap(request), runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
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
