// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201;

import com.aliyun.tea.*;
import com.aliyun.cloudesl20200201.models.*;
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
            new TeaPair("ap-northeast-1", "cloudesl.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "cloudesl.aliyuncs.com"),
            new TeaPair("ap-south-1", "cloudesl.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "cloudesl.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "cloudesl.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "cloudesl.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-beijing", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-chengdu", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-edge-1", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-fujian", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-hongkong", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-qingdao", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-shanghai", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-wuhan", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "cloudesl.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "cloudesl.aliyuncs.com"),
            new TeaPair("eu-central-1", "cloudesl.aliyuncs.com"),
            new TeaPair("eu-west-1", "cloudesl.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "cloudesl.aliyuncs.com"),
            new TeaPair("me-east-1", "cloudesl.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "cloudesl.aliyuncs.com"),
            new TeaPair("us-east-1", "cloudesl.aliyuncs.com"),
            new TeaPair("us-west-1", "cloudesl.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudesl", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ActivateApDeviceResponse activateApDeviceWithOptions(ActivateApDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            body.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateApDevice"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateApDeviceResponse());
    }

    public ActivateApDeviceResponse activateApDevice(ActivateApDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activateApDeviceWithOptions(request, runtime);
    }

    public AddApDeviceResponse addApDeviceWithOptions(AddApDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            body.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            body.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddApDevice"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddApDeviceResponse());
    }

    public AddApDeviceResponse addApDevice(AddApDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addApDeviceWithOptions(request, runtime);
    }

    public AddUserResponse addUserWithOptions(AddUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUser"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserResponse());
    }

    public AddUserResponse addUser(AddUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUserWithOptions(request, runtime);
    }

    public AssignUserResponse assignUserWithOptions(AssignUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stores)) {
            body.put("Stores", request.stores);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            body.put("UserType", request.userType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignUser"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssignUserResponse());
    }

    public AssignUserResponse assignUser(AssignUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.assignUserWithOptions(request, runtime);
    }

    public BatchInsertItemsResponse batchInsertItemsWithOptions(BatchInsertItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemInfo)) {
            body.put("ItemInfo", request.itemInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncByItemId)) {
            body.put("SyncByItemId", request.syncByItemId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchInsertItems"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchInsertItemsResponse());
    }

    public BatchInsertItemsResponse batchInsertItems(BatchInsertItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchInsertItemsWithOptions(request, runtime);
    }

    public BindEslDeviceResponse bindEslDeviceWithOptions(BindEslDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.column)) {
            body.put("Column", request.column);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eslBarCode)) {
            body.put("EslBarCode", request.eslBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemBarCode)) {
            body.put("ItemBarCode", request.itemBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layer)) {
            body.put("Layer", request.layer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shelf)) {
            body.put("Shelf", request.shelf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindEslDevice"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindEslDeviceResponse());
    }

    public BindEslDeviceResponse bindEslDevice(BindEslDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindEslDeviceWithOptions(request, runtime);
    }

    public CreateStoreResponse createStoreWithOptions(CreateStoreRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeName)) {
            body.put("StoreName", request.storeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("TimeZone", request.timeZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userStoreCode)) {
            body.put("UserStoreCode", request.userStoreCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStore"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStoreResponse());
    }

    public CreateStoreResponse createStore(CreateStoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStoreWithOptions(request, runtime);
    }

    public DeleteApDeviceResponse deleteApDeviceWithOptions(DeleteApDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            body.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApDevice"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApDeviceResponse());
    }

    public DeleteApDeviceResponse deleteApDevice(DeleteApDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteApDeviceWithOptions(request, runtime);
    }

    public DeleteItemResponse deleteItemWithOptions(DeleteItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemBarCode)) {
            body.put("ItemBarCode", request.itemBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unbindEslDevice)) {
            body.put("UnbindEslDevice", request.unbindEslDevice);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteItem"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteItemResponse());
    }

    public DeleteItemResponse deleteItem(DeleteItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteItemWithOptions(request, runtime);
    }

    public DeleteStoreResponse deleteStoreWithOptions(DeleteStoreRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStore"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStoreResponse());
    }

    public DeleteStoreResponse deleteStore(DeleteStoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStoreWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserResponse());
    }

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public DescribeApDevicesResponse describeApDevicesWithOptions(DescribeApDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            body.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beActivate)) {
            body.put("BeActivate", request.beActivate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApDevices"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApDevicesResponse());
    }

    public DescribeApDevicesResponse describeApDevices(DescribeApDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApDevicesWithOptions(request, runtime);
    }

    public DescribeBindersResponse describeBindersWithOptions(DescribeBindersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eslBarCode)) {
            body.put("EslBarCode", request.eslBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemBarCode)) {
            body.put("ItemBarCode", request.itemBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemTitle)) {
            body.put("ItemTitle", request.itemTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBinders"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBindersResponse());
    }

    public DescribeBindersResponse describeBinders(DescribeBindersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBindersWithOptions(request, runtime);
    }

    public DescribeEslDevicesResponse describeEslDevicesWithOptions(DescribeEslDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eslBarCode)) {
            body.put("EslBarCode", request.eslBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eslStatus)) {
            body.put("EslStatus", request.eslStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromBatteryLevel)) {
            body.put("FromBatteryLevel", request.fromBatteryLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toBatteryLevel)) {
            body.put("ToBatteryLevel", request.toBatteryLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeEncode)) {
            body.put("TypeEncode", request.typeEncode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEslDevices"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEslDevicesResponse());
    }

    public DescribeEslDevicesResponse describeEslDevices(DescribeEslDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEslDevicesWithOptions(request, runtime);
    }

    public DescribeItemsResponse describeItemsWithOptions(DescribeItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bePromotion)) {
            body.put("BePromotion", request.bePromotion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemBarCode)) {
            body.put("ItemBarCode", request.itemBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            body.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemTitle)) {
            body.put("ItemTitle", request.itemTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skuId)) {
            body.put("SkuId", request.skuId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeItems"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeItemsResponse());
    }

    public DescribeItemsResponse describeItems(DescribeItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeItemsWithOptions(request, runtime);
    }

    public DescribeStoreConfigResponse describeStoreConfigWithOptions(DescribeStoreConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStoreConfig"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStoreConfigResponse());
    }

    public DescribeStoreConfigResponse describeStoreConfig(DescribeStoreConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStoreConfigWithOptions(request, runtime);
    }

    public DescribeStoresResponse describeStoresWithOptions(DescribeStoresRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromDate)) {
            body.put("FromDate", request.fromDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeName)) {
            body.put("StoreName", request.storeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            body.put("TemplateVersion", request.templateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toDate)) {
            body.put("ToDate", request.toDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userStoreCode)) {
            body.put("UserStoreCode", request.userStoreCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStores"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStoresResponse());
    }

    public DescribeStoresResponse describeStores(DescribeStoresRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStoresWithOptions(request, runtime);
    }

    public DescribeUserLogResponse describeUserLogWithOptions(DescribeUserLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eslBarCode)) {
            body.put("EslBarCode", request.eslBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromDate)) {
            body.put("FromDate", request.fromDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemBarCode)) {
            body.put("ItemBarCode", request.itemBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemShortTitle)) {
            body.put("ItemShortTitle", request.itemShortTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logId)) {
            body.put("LogId", request.logId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationStatus)) {
            body.put("OperationStatus", request.operationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            body.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toDate)) {
            body.put("ToDate", request.toDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserLog"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserLogResponse());
    }

    public DescribeUserLogResponse describeUserLog(DescribeUserLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserLogWithOptions(request, runtime);
    }

    public DescribeUsersResponse describeUsersWithOptions(DescribeUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            body.put("UserType", request.userType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsers"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsersResponse());
    }

    public DescribeUsersResponse describeUsers(DescribeUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUsersWithOptions(request, runtime);
    }

    public GetUserResponse getUserWithOptions(GetUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    public UnassignUserResponse unassignUserWithOptions(UnassignUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnassignUser"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnassignUserResponse());
    }

    public UnassignUserResponse unassignUser(UnassignUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassignUserWithOptions(request, runtime);
    }

    public UnbindEslDeviceResponse unbindEslDeviceWithOptions(UnbindEslDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.column)) {
            body.put("Column", request.column);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eslBarCode)) {
            body.put("EslBarCode", request.eslBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemBarCode)) {
            body.put("ItemBarCode", request.itemBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layer)) {
            body.put("Layer", request.layer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shelf)) {
            body.put("Shelf", request.shelf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindEslDevice"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindEslDeviceResponse());
    }

    public UnbindEslDeviceResponse unbindEslDevice(UnbindEslDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindEslDeviceWithOptions(request, runtime);
    }

    public UpdateEslDeviceLightResponse updateEslDeviceLightWithOptions(UpdateEslDeviceLightRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eslBarCode)) {
            body.put("EslBarCode", request.eslBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frequency)) {
            body.put("Frequency", request.frequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemBarCode)) {
            body.put("ItemBarCode", request.itemBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ledColor)) {
            body.put("LedColor", request.ledColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lightUpTime)) {
            body.put("LightUpTime", request.lightUpTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEslDeviceLight"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEslDeviceLightResponse());
    }

    public UpdateEslDeviceLightResponse updateEslDeviceLight(UpdateEslDeviceLightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEslDeviceLightWithOptions(request, runtime);
    }

    public UpdateStoreResponse updateStoreWithOptions(UpdateStoreRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeName)) {
            body.put("StoreName", request.storeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            body.put("TemplateVersion", request.templateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            body.put("Timezone", request.timezone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userStoreCode)) {
            body.put("UserStoreCode", request.userStoreCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStore"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStoreResponse());
    }

    public UpdateStoreResponse updateStore(UpdateStoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateStoreWithOptions(request, runtime);
    }

    public UpdateStoreConfigResponse updateStoreConfigWithOptions(UpdateStoreConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableNotification)) {
            body.put("EnableNotification", request.enableNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationSilentTimes)) {
            body.put("NotificationSilentTimes", request.notificationSilentTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationWebHook)) {
            body.put("NotificationWebHook", request.notificationWebHook);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStoreConfig"),
            new TeaPair("version", "2020-02-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStoreConfigResponse());
    }

    public UpdateStoreConfigResponse updateStoreConfig(UpdateStoreConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateStoreConfigWithOptions(request, runtime);
    }
}
