// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127;

import com.aliyun.tea.*;
import com.aliyun.cd2021127.models.*;
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
        this._endpoint = this.getEndpoint("cd", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddProductImageResponse addProductImage(AddProductImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addProductImageWithOptions(request, headers, runtime);
    }

    public AddProductImageResponse addProductImageWithOptions(AddProductImageRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddProductImageShrinkRequest request = new AddProductImageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.productImageList)) {
            request.productImageListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.productImageList, "ProductImageList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productImageListShrink)) {
            body.put("ProductImageList", request.productImageListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("ProductName", request.productName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddProductImage"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/AddProductImage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddProductImageResponse());
    }

    public AddShopToGroupResponse addShopToGroup(AddShopToGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addShopToGroupWithOptions(request, headers, runtime);
    }

    public AddShopToGroupResponse addShopToGroupWithOptions(AddShopToGroupRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddShopToGroupShrinkRequest request = new AddShopToGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopIdList)) {
            request.shopIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopIdList, "ShopIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupId)) {
            body.put("ShopGroupId", request.shopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopIdListShrink)) {
            body.put("ShopIdList", request.shopIdListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddShopToGroup"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/AddShopToGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddShopToGroupResponse());
    }

    public AddShopsToGroupResponse addShopsToGroup(AddShopsToGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addShopsToGroupWithOptions(request, headers, runtime);
    }

    public AddShopsToGroupResponse addShopsToGroupWithOptions(AddShopsToGroupRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddShopsToGroupShrinkRequest request = new AddShopsToGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopIdList)) {
            request.shopIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopIdList, "ShopIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupId)) {
            body.put("ShopGroupId", request.shopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopIdListShrink)) {
            body.put("ShopIdList", request.shopIdListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddShopsToGroup"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/AddShopsToGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddShopsToGroupResponse());
    }

    public BatchCreateShopResponse batchCreateShop(BatchCreateShopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchCreateShopWithOptions(request, headers, runtime);
    }

    public BatchCreateShopResponse batchCreateShopWithOptions(BatchCreateShopRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchCreateShopShrinkRequest request = new BatchCreateShopShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopList)) {
            request.shopListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopList, "ShopList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopListShrink)) {
            body.put("ShopList", request.shopListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreateShop"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/BatchCreateShop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreateShopResponse());
    }

    public BatchCreateShopGroupResponse batchCreateShopGroup(BatchCreateShopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchCreateShopGroupWithOptions(request, headers, runtime);
    }

    public BatchCreateShopGroupResponse batchCreateShopGroupWithOptions(BatchCreateShopGroupRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchCreateShopGroupShrinkRequest request = new BatchCreateShopGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopGroupList)) {
            request.shopGroupListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopGroupList, "ShopGroupList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupListShrink)) {
            body.put("ShopGroupList", request.shopGroupListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreateShopGroup"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/BatchCreateShopGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreateShopGroupResponse());
    }

    public CreateMenuDataResponse createMenuData(CreateMenuDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMenuDataWithOptions(request, headers, runtime);
    }

    public CreateMenuDataResponse createMenuDataWithOptions(CreateMenuDataRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMenuDataShrinkRequest request = new CreateMenuDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.productCombineList)) {
            request.productCombineListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.productCombineList, "ProductCombineList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopIdList)) {
            request.shopIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopIdList, "ShopIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            body.put("BatchId", request.batchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCombineListShrink)) {
            body.put("ProductCombineList", request.productCombineListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productContainerId)) {
            body.put("ProductContainerId", request.productContainerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupId)) {
            body.put("ShopGroupId", request.shopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopIdListShrink)) {
            body.put("ShopIdList", request.shopIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMenuData"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/CreateMenuData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMenuDataResponse());
    }

    public CreateShopResponse createShop(CreateShopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createShopWithOptions(request, headers, runtime);
    }

    public CreateShopResponse createShopWithOptions(CreateShopRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateShopShrinkRequest request = new CreateShopShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopList)) {
            request.shopListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopList, "ShopList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopListShrink)) {
            body.put("ShopList", request.shopListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateShop"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/CreateShop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateShopResponse());
    }

    public CreateShopGroupResponse createShopGroup(CreateShopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createShopGroupWithOptions(request, headers, runtime);
    }

    public CreateShopGroupResponse createShopGroupWithOptions(CreateShopGroupRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateShopGroupShrinkRequest request = new CreateShopGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopGroupList)) {
            request.shopGroupListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopGroupList, "ShopGroupList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupListShrink)) {
            body.put("ShopGroupList", request.shopGroupListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateShopGroup"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/CreateShopGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateShopGroupResponse());
    }

    public DeleteProductImageResponse deleteProductImage(DeleteProductImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductImageWithOptions(request, headers, runtime);
    }

    public DeleteProductImageResponse deleteProductImageWithOptions(DeleteProductImageRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteProductImageShrinkRequest request = new DeleteProductImageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.productImageIds)) {
            request.productImageIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.productImageIds, "ProductImageIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productImageIdsShrink)) {
            body.put("ProductImageIds", request.productImageIdsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProductImage"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/DeleteProductImage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductImageResponse());
    }

    public DeleteShopResponse deleteShop(DeleteShopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteShopWithOptions(request, headers, runtime);
    }

    public DeleteShopResponse deleteShopWithOptions(DeleteShopRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopId)) {
            body.put("ShopId", request.shopId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteShop"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/DeleteShop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteShopResponse());
    }

    public DeleteShopGroupResponse deleteShopGroup(DeleteShopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteShopGroupWithOptions(request, headers, runtime);
    }

    public DeleteShopGroupResponse deleteShopGroupWithOptions(DeleteShopGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupId)) {
            body.put("ShopGroupId", request.shopGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteShopGroup"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/DeleteShopGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteShopGroupResponse());
    }

    public GetMenuDataStatusResponse getMenuDataStatus(GetMenuDataStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMenuDataStatusWithOptions(request, headers, runtime);
    }

    public GetMenuDataStatusResponse getMenuDataStatusWithOptions(GetMenuDataStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            body.put("BatchId", request.batchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productContainerId)) {
            body.put("ProductContainerId", request.productContainerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMenuDataStatus"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/GetMenuDataStatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMenuDataStatusResponse());
    }

    public GetShopResponse getShop(GetShopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getShopWithOptions(request, headers, runtime);
    }

    public GetShopResponse getShopWithOptions(GetShopRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopId)) {
            body.put("ShopId", request.shopId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetShop"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/GetShop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetShopResponse());
    }

    public GetShopGroupResponse getShopGroup(GetShopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getShopGroupWithOptions(request, headers, runtime);
    }

    public GetShopGroupResponse getShopGroupWithOptions(GetShopGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupId)) {
            body.put("ShopGroupId", request.shopGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetShopGroup"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/GetShopGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetShopGroupResponse());
    }

    public ListShopResponse listShop(ListShopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listShopWithOptions(request, headers, runtime);
    }

    public ListShopResponse listShopWithOptions(ListShopRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListShopShrinkRequest request = new ListShopShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopGroupIds)) {
            request.shopGroupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopGroupIds, "ShopGroupIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupIdsShrink)) {
            body.put("ShopGroupIds", request.shopGroupIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopId)) {
            body.put("ShopId", request.shopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopName)) {
            body.put("ShopName", request.shopName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListShop"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ListShop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListShopResponse());
    }

    public ListShopGroupResponse listShopGroup(ListShopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listShopGroupWithOptions(request, headers, runtime);
    }

    public ListShopGroupResponse listShopGroupWithOptions(ListShopGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupId)) {
            body.put("ShopGroupId", request.shopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupName)) {
            body.put("ShopGroupName", request.shopGroupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListShopGroup"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ListShopGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListShopGroupResponse());
    }

    public RemoveShopFromGroupResponse removeShopFromGroup(RemoveShopFromGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeShopFromGroupWithOptions(request, headers, runtime);
    }

    public RemoveShopFromGroupResponse removeShopFromGroupWithOptions(RemoveShopFromGroupRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveShopFromGroupShrinkRequest request = new RemoveShopFromGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopIdList)) {
            request.shopIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopIdList, "ShopIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupId)) {
            body.put("ShopGroupId", request.shopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopIdListShrink)) {
            body.put("ShopIdList", request.shopIdListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveShopFromGroup"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/RemoveShopFromGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveShopFromGroupResponse());
    }

    public RemoveShopsFromGroupResponse removeShopsFromGroup(RemoveShopsFromGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeShopsFromGroupWithOptions(request, headers, runtime);
    }

    public RemoveShopsFromGroupResponse removeShopsFromGroupWithOptions(RemoveShopsFromGroupRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveShopsFromGroupShrinkRequest request = new RemoveShopsFromGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopIdList)) {
            request.shopIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopIdList, "ShopIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupId)) {
            body.put("ShopGroupId", request.shopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopIdListShrink)) {
            body.put("ShopIdList", request.shopIdListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveShopsFromGroup"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/RemoveShopsFromGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveShopsFromGroupResponse());
    }

    public UpdateShopResponse updateShop(UpdateShopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateShopWithOptions(request, headers, runtime);
    }

    public UpdateShopResponse updateShopWithOptions(UpdateShopRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateShopShrinkRequest request = new UpdateShopShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopGroupIds)) {
            request.shopGroupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopGroupIds, "ShopGroupIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.latitude)) {
            body.put("Latitude", request.latitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longitude)) {
            body.put("Longitude", request.longitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionAddress)) {
            body.put("RegionAddress", request.regionAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            body.put("RegionCode", request.regionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupIdsShrink)) {
            body.put("ShopGroupIds", request.shopGroupIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopId)) {
            body.put("ShopId", request.shopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopName)) {
            body.put("ShopName", request.shopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weekdaysEndTime)) {
            body.put("WeekdaysEndTime", request.weekdaysEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weekdaysStartTime)) {
            body.put("WeekdaysStartTime", request.weekdaysStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weekendEndTime)) {
            body.put("WeekendEndTime", request.weekendEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weekendStartTime)) {
            body.put("WeekendStartTime", request.weekendStartTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateShop"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/UpdateShop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateShopResponse());
    }

    public UpdateShopGroupResponse updateShopGroup(UpdateShopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateShopGroupWithOptions(request, headers, runtime);
    }

    public UpdateShopGroupResponse updateShopGroupWithOptions(UpdateShopGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupId)) {
            body.put("ShopGroupId", request.shopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupName)) {
            body.put("ShopGroupName", request.shopGroupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateShopGroup"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/UpdateShopGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateShopGroupResponse());
    }
}
