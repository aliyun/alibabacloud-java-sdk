// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801;

import com.aliyun.tea.*;
import com.aliyun.cloudesl20190801.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * @param request ActivateApDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateApDeviceResponse
     */
    public ActivateApDeviceResponse activateApDeviceWithOptions(ActivateApDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            body.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateApDevice"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request ActivateApDeviceRequest
     * @return ActivateApDeviceResponse
     */
    public ActivateApDeviceResponse activateApDevice(ActivateApDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activateApDeviceWithOptions(request, runtime);
    }

    /**
     * @param request AddApDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddApDeviceResponse
     */
    public AddApDeviceResponse addApDeviceWithOptions(AddApDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            body.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddApDevice"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request AddApDeviceRequest
     * @return AddApDeviceResponse
     */
    public AddApDeviceResponse addApDevice(AddApDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addApDeviceWithOptions(request, runtime);
    }

    /**
     * @param request AddEslDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddEslDeviceResponse
     */
    public AddEslDeviceResponse addEslDeviceWithOptions(AddEslDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eslBarCode)) {
            body.put("EslBarCode", request.eslBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEslDevice"),
            new TeaPair("version", "2019-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddEslDeviceResponse());
    }

    /**
     * @param request AddEslDeviceRequest
     * @return AddEslDeviceResponse
     */
    public AddEslDeviceResponse addEslDevice(AddEslDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEslDeviceWithOptions(request, runtime);
    }

    /**
     * @param request AddUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserResponse
     */
    public AddUserResponse addUserWithOptions(AddUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUser"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request AddUserRequest
     * @return AddUserResponse
     */
    public AddUserResponse addUser(AddUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserWithOptions(request, runtime);
    }

    /**
     * @param request AssignUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssignUserResponse
     */
    public AssignUserResponse assignUserWithOptions(AssignUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.stores)) {
            body.put("Stores", request.stores);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            body.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignUser"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request AssignUserRequest
     * @return AssignUserResponse
     */
    public AssignUserResponse assignUser(AssignUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignUserWithOptions(request, runtime);
    }

    /**
     * @param request BatchInsertItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchInsertItemsResponse
     */
    public BatchInsertItemsResponse batchInsertItemsWithOptions(BatchInsertItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemInfo)) {
            body.put("ItemInfo", request.itemInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchInsertItems"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request BatchInsertItemsRequest
     * @return BatchInsertItemsResponse
     */
    public BatchInsertItemsResponse batchInsertItems(BatchInsertItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchInsertItemsWithOptions(request, runtime);
    }

    /**
     * @param request BindEslDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindEslDeviceResponse
     */
    public BindEslDeviceResponse bindEslDeviceWithOptions(BindEslDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eslBarCode)) {
            body.put("EslBarCode", request.eslBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemBarCode)) {
            body.put("ItemBarCode", request.itemBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindEslDevice"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request BindEslDeviceRequest
     * @return BindEslDeviceResponse
     */
    public BindEslDeviceResponse bindEslDevice(BindEslDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindEslDeviceWithOptions(request, runtime);
    }

    /**
     * @param request BindEslDeviceShelfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindEslDeviceShelfResponse
     */
    public BindEslDeviceShelfResponse bindEslDeviceShelfWithOptions(BindEslDeviceShelfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eslBarCode)) {
            body.put("EslBarCode", request.eslBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shelfCode)) {
            body.put("ShelfCode", request.shelfCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindEslDeviceShelf"),
            new TeaPair("version", "2019-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindEslDeviceShelfResponse());
    }

    /**
     * @param request BindEslDeviceShelfRequest
     * @return BindEslDeviceShelfResponse
     */
    public BindEslDeviceShelfResponse bindEslDeviceShelf(BindEslDeviceShelfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindEslDeviceShelfWithOptions(request, runtime);
    }

    /**
     * @param request ConfirmLogisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfirmLogisticsResponse
     */
    public ConfirmLogisticsResponse confirmLogisticsWithOptions(ConfirmLogisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logisticsDocuments)) {
            body.put("LogisticsDocuments", request.logisticsDocuments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poNumber)) {
            body.put("PoNumber", request.poNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prNumber)) {
            body.put("PrNumber", request.prNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmLogistics"),
            new TeaPair("version", "2019-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmLogisticsResponse());
    }

    /**
     * @param request ConfirmLogisticsRequest
     * @return ConfirmLogisticsResponse
     */
    public ConfirmLogisticsResponse confirmLogistics(ConfirmLogisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.confirmLogisticsWithOptions(request, runtime);
    }

    /**
     * @param request CreateStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStoreResponse
     */
    public CreateStoreResponse createStoreWithOptions(CreateStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brand)) {
            body.put("Brand", request.brand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comments)) {
            body.put("Comments", request.comments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            body.put("CompanyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groups)) {
            body.put("Groups", request.groups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            body.put("OutId", request.outId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStore"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request CreateStoreRequest
     * @return CreateStoreResponse
     */
    public CreateStoreResponse createStore(CreateStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStoreWithOptions(request, runtime);
    }

    /**
     * @param request DeleteApDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApDeviceResponse
     */
    public DeleteApDeviceResponse deleteApDeviceWithOptions(DeleteApDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            body.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApDevice"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request DeleteApDeviceRequest
     * @return DeleteApDeviceResponse
     */
    public DeleteApDeviceResponse deleteApDevice(DeleteApDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApDeviceWithOptions(request, runtime);
    }

    /**
     * @param request DeleteEslDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEslDeviceResponse
     */
    public DeleteEslDeviceResponse deleteEslDeviceWithOptions(DeleteEslDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eslBarCode)) {
            body.put("EslBarCode", request.eslBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEslDevice"),
            new TeaPair("version", "2019-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEslDeviceResponse());
    }

    /**
     * @param request DeleteEslDeviceRequest
     * @return DeleteEslDeviceResponse
     */
    public DeleteEslDeviceResponse deleteEslDevice(DeleteEslDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEslDeviceWithOptions(request, runtime);
    }

    /**
     * @param request DeleteItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteItemResponse
     */
    public DeleteItemResponse deleteItemWithOptions(DeleteItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemBarCode)) {
            body.put("ItemBarCode", request.itemBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteItem"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request DeleteItemRequest
     * @return DeleteItemResponse
     */
    public DeleteItemResponse deleteItem(DeleteItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteItemWithOptions(request, runtime);
    }

    /**
     * @param request DeleteItemBySkuIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteItemBySkuIdResponse
     */
    public DeleteItemBySkuIdResponse deleteItemBySkuIdWithOptions(DeleteItemBySkuIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.skuId)) {
            body.put("SkuId", request.skuId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteItemBySkuId"),
            new TeaPair("version", "2019-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteItemBySkuIdResponse());
    }

    /**
     * @param request DeleteItemBySkuIdRequest
     * @return DeleteItemBySkuIdResponse
     */
    public DeleteItemBySkuIdResponse deleteItemBySkuId(DeleteItemBySkuIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteItemBySkuIdWithOptions(request, runtime);
    }

    /**
     * @param request DeleteStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStoreResponse
     */
    public DeleteStoreResponse deleteStoreWithOptions(DeleteStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStore"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request DeleteStoreRequest
     * @return DeleteStoreResponse
     */
    public DeleteStoreResponse deleteStore(DeleteStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStoreWithOptions(request, runtime);
    }

    /**
     * @param request DeleteUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request DeleteUserRequest
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAlarmsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlarmsResponse
     */
    public DescribeAlarmsResponse describeAlarmsWithOptions(DescribeAlarmsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmId)) {
            body.put("AlarmId", request.alarmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmStatus)) {
            body.put("AlarmStatus", request.alarmStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmType)) {
            body.put("AlarmType", request.alarmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorType)) {
            body.put("ErrorType", request.errorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromAlarmTime)) {
            body.put("FromAlarmTime", request.fromAlarmTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.toAlarmTime)) {
            body.put("ToAlarmTime", request.toAlarmTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlarms"),
            new TeaPair("version", "2019-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlarmsResponse());
    }

    /**
     * @param request DescribeAlarmsRequest
     * @return DescribeAlarmsResponse
     */
    public DescribeAlarmsResponse describeAlarms(DescribeAlarmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlarmsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeApDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApDevicesResponse
     */
    public DescribeApDevicesResponse describeApDevicesWithOptions(DescribeApDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activated)) {
            body.put("Activated", request.activated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            body.put("ApMac", request.apMac);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApDevices"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request DescribeApDevicesRequest
     * @return DescribeApDevicesResponse
     */
    public DescribeApDevicesResponse describeApDevices(DescribeApDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApDevicesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeEslDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEslDevicesResponse
     */
    public DescribeEslDevicesResponse describeEslDevicesWithOptions(DescribeEslDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beBind)) {
            body.put("BeBind", request.beBind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eslBarCode)) {
            body.put("EslBarCode", request.eslBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eslStatus)) {
            body.put("EslStatus", request.eslStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromBatteryLevel)) {
            body.put("FromBatteryLevel", request.fromBatteryLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemBarCode)) {
            body.put("ItemBarCode", request.itemBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            body.put("Mac", request.mac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shelfCode)) {
            body.put("ShelfCode", request.shelfCode);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("Vendor", request.vendor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEslDevices"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request DescribeEslDevicesRequest
     * @return DescribeEslDevicesResponse
     */
    public DescribeEslDevicesResponse describeEslDevices(DescribeEslDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEslDevicesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeItemsResponse
     */
    public DescribeItemsResponse describeItemsWithOptions(DescribeItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bePromotion)) {
            body.put("BePromotion", request.bePromotion);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeItems"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request DescribeItemsRequest
     * @return DescribeItemsResponse
     */
    public DescribeItemsResponse describeItems(DescribeItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeItemsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeLogisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogisticsResponse
     */
    public DescribeLogisticsResponse describeLogisticsWithOptions(DescribeLogisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("OrderId", request.orderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogistics"),
            new TeaPair("version", "2019-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogisticsResponse());
    }

    /**
     * @param request DescribeLogisticsRequest
     * @return DescribeLogisticsResponse
     */
    public DescribeLogisticsResponse describeLogistics(DescribeLogisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogisticsWithOptions(request, runtime);
    }

    /**
     * @param request DescribePayOrdersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePayOrdersResponse
     */
    public DescribePayOrdersResponse describePayOrdersWithOptions(DescribePayOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromDate)) {
            body.put("FromDate", request.fromDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toDate)) {
            body.put("ToDate", request.toDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePayOrders"),
            new TeaPair("version", "2019-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePayOrdersResponse());
    }

    /**
     * @param request DescribePayOrdersRequest
     * @return DescribePayOrdersResponse
     */
    public DescribePayOrdersResponse describePayOrders(DescribePayOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePayOrdersWithOptions(request, runtime);
    }

    /**
     * @param request DescribePlanogramRailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePlanogramRailsResponse
     */
    public DescribePlanogramRailsResponse describePlanogramRailsWithOptions(DescribePlanogramRailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.layer)) {
            body.put("Layer", request.layer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.railCode)) {
            body.put("RailCode", request.railCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shelf)) {
            body.put("Shelf", request.shelf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePlanogramRails"),
            new TeaPair("version", "2019-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePlanogramRailsResponse());
    }

    /**
     * @param request DescribePlanogramRailsRequest
     * @return DescribePlanogramRailsResponse
     */
    public DescribePlanogramRailsResponse describePlanogramRails(DescribePlanogramRailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlanogramRailsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeStoresRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStoresResponse
     */
    public DescribeStoresResponse describeStoresWithOptions(DescribeStoresRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brand)) {
            body.put("Brand", request.brand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            body.put("CompanyId", request.companyId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.toDate)) {
            body.put("ToDate", request.toDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStores"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request DescribeStoresRequest
     * @return DescribeStoresResponse
     */
    public DescribeStoresResponse describeStores(DescribeStoresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStoresWithOptions(request, runtime);
    }

    /**
     * @param request DescribeUserLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserLogResponse
     */
    public DescribeUserLogResponse describeUserLogWithOptions(DescribeUserLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eslBarCode)) {
            body.put("EslBarCode", request.eslBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromDate)) {
            body.put("FromDate", request.fromDate);
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

        if (!com.aliyun.teautil.Common.isUnset(request.operateStatus)) {
            body.put("OperateStatus", request.operateStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            body.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateUserId)) {
            body.put("OperateUserId", request.operateUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            body.put("Reverse", request.reverse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toDate)) {
            body.put("ToDate", request.toDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserLog"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request DescribeUserLogRequest
     * @return DescribeUserLogResponse
     */
    public DescribeUserLogResponse describeUserLog(DescribeUserLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserLogWithOptions(request, runtime);
    }

    /**
     * @param request DescribeUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUsersResponse
     */
    public DescribeUsersResponse describeUsersWithOptions(DescribeUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsers"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request DescribeUsersRequest
     * @return DescribeUsersResponse
     */
    public DescribeUsersResponse describeUsers(DescribeUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUsersWithOptions(request, runtime);
    }

    /**
     * @param request GetCompanyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCompanyResponse
     */
    public GetCompanyResponse getCompanyWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompany"),
            new TeaPair("version", "2019-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompanyResponse());
    }

    /**
     * @return GetCompanyResponse
     */
    public GetCompanyResponse getCompany() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCompanyWithOptions(runtime);
    }

    /**
     * @param request GetUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(GetUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request GetUserRequest
     * @return GetUserResponse
     */
    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    /**
     * @param request MapPlanogramRailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MapPlanogramRailResponse
     */
    public MapPlanogramRailResponse mapPlanogramRailWithOptions(MapPlanogramRailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.layer)) {
            body.put("Layer", request.layer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.railCode)) {
            body.put("RailCode", request.railCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shelf)) {
            body.put("Shelf", request.shelf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MapPlanogramRail"),
            new TeaPair("version", "2019-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MapPlanogramRailResponse());
    }

    /**
     * @param request MapPlanogramRailRequest
     * @return MapPlanogramRailResponse
     */
    public MapPlanogramRailResponse mapPlanogramRail(MapPlanogramRailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mapPlanogramRailWithOptions(request, runtime);
    }

    /**
     * @param request RefreshTaobaoItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshTaobaoItemResponse
     */
    public RefreshTaobaoItemResponse refreshTaobaoItemWithOptions(RefreshTaobaoItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outerId)) {
            body.put("OuterId", request.outerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skuId)) {
            body.put("SkuId", request.skuId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taobaoItemId)) {
            body.put("TaobaoItemId", request.taobaoItemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshTaobaoItem"),
            new TeaPair("version", "2019-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshTaobaoItemResponse());
    }

    /**
     * @param request RefreshTaobaoItemRequest
     * @return RefreshTaobaoItemResponse
     */
    public RefreshTaobaoItemResponse refreshTaobaoItem(RefreshTaobaoItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshTaobaoItemWithOptions(request, runtime);
    }

    /**
     * @param request UnassignUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnassignUserResponse
     */
    public UnassignUserResponse unassignUserWithOptions(UnassignUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnassignUser"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request UnassignUserRequest
     * @return UnassignUserResponse
     */
    public UnassignUserResponse unassignUser(UnassignUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassignUserWithOptions(request, runtime);
    }

    /**
     * @param request UnbindEslDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindEslDeviceResponse
     */
    public UnbindEslDeviceResponse unbindEslDeviceWithOptions(UnbindEslDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eslBarCode)) {
            body.put("EslBarCode", request.eslBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemBarCode)) {
            body.put("ItemBarCode", request.itemBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindEslDevice"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request UnbindEslDeviceRequest
     * @return UnbindEslDeviceResponse
     */
    public UnbindEslDeviceResponse unbindEslDevice(UnbindEslDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindEslDeviceWithOptions(request, runtime);
    }

    /**
     * @param request UnbindEslDeviceShelfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindEslDeviceShelfResponse
     */
    public UnbindEslDeviceShelfResponse unbindEslDeviceShelfWithOptions(UnbindEslDeviceShelfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eslBarCode)) {
            body.put("EslBarCode", request.eslBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindEslDeviceShelf"),
            new TeaPair("version", "2019-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindEslDeviceShelfResponse());
    }

    /**
     * @param request UnbindEslDeviceShelfRequest
     * @return UnbindEslDeviceShelfResponse
     */
    public UnbindEslDeviceShelfResponse unbindEslDeviceShelf(UnbindEslDeviceShelfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindEslDeviceShelfWithOptions(request, runtime);
    }

    /**
     * @param request UnmapPlanogramRailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnmapPlanogramRailResponse
     */
    public UnmapPlanogramRailResponse unmapPlanogramRailWithOptions(UnmapPlanogramRailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.railCode)) {
            body.put("RailCode", request.railCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnmapPlanogramRail"),
            new TeaPair("version", "2019-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnmapPlanogramRailResponse());
    }

    /**
     * @param request UnmapPlanogramRailRequest
     * @return UnmapPlanogramRailResponse
     */
    public UnmapPlanogramRailResponse unmapPlanogramRail(UnmapPlanogramRailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unmapPlanogramRailWithOptions(request, runtime);
    }

    /**
     * @param request UpdateEslDeviceLightRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEslDeviceLightResponse
     */
    public UpdateEslDeviceLightResponse updateEslDeviceLightWithOptions(UpdateEslDeviceLightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eslBarCode)) {
            body.put("EslBarCode", request.eslBarCode);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEslDeviceLight"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request UpdateEslDeviceLightRequest
     * @return UpdateEslDeviceLightResponse
     */
    public UpdateEslDeviceLightResponse updateEslDeviceLight(UpdateEslDeviceLightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEslDeviceLightWithOptions(request, runtime);
    }

    /**
     * @param request UpdateStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStoreResponse
     */
    public UpdateStoreResponse updateStoreWithOptions(UpdateStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brand)) {
            body.put("Brand", request.brand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comments)) {
            body.put("Comments", request.comments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groups)) {
            body.put("Groups", request.groups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            body.put("OutId", request.outId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStore"),
            new TeaPair("version", "2019-08-01"),
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

    /**
     * @param request UpdateStoreRequest
     * @return UpdateStoreResponse
     */
    public UpdateStoreResponse updateStore(UpdateStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStoreWithOptions(request, runtime);
    }
}
