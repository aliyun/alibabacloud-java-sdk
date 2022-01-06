// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128;

import com.aliyun.tea.*;
import com.aliyun.cccxspace20191128.models.*;
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
            new TeaPair("ap-northeast-1", "cccxspace.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "cccxspace.aliyuncs.com"),
            new TeaPair("ap-south-1", "cccxspace.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "cccxspace.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "cccxspace.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "cccxspace.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-beijing", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-chengdu", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-edge-1", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-fujian", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-hongkong", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-qingdao", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-wuhan", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "cccxspace.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "cccxspace.aliyuncs.com"),
            new TeaPair("eu-central-1", "cccxspace.aliyuncs.com"),
            new TeaPair("eu-west-1", "cccxspace.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "cccxspace.aliyuncs.com"),
            new TeaPair("me-east-1", "cccxspace.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "cccxspace.aliyuncs.com"),
            new TeaPair("us-east-1", "cccxspace.aliyuncs.com"),
            new TeaPair("us-west-1", "cccxspace.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cccxspace", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddAccountAsInstanceResponse addAccountAsInstanceWithOptions(AddAccountAsInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAccountAsInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAccountAsInstanceResponse());
    }

    public AddAccountAsInstanceResponse addAccountAsInstance(AddAccountAsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAccountAsInstanceWithOptions(request, runtime);
    }

    public AddInstanceUserResponse addInstanceUserWithOptions(AddInstanceUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buName)) {
            body.put("BuName", request.buName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginName)) {
            body.put("LoginName", request.loginName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realName)) {
            body.put("RealName", request.realName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddInstanceUser"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddInstanceUserResponse());
    }

    public AddInstanceUserResponse addInstanceUser(AddInstanceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addInstanceUserWithOptions(request, runtime);
    }

    public AddInstanceUserSaleResponse addInstanceUserSaleWithOptions(AddInstanceUserSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buName)) {
            body.put("BuName", request.buName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginName)) {
            body.put("LoginName", request.loginName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realName)) {
            body.put("RealName", request.realName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddInstanceUserSale"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddInstanceUserSaleResponse());
    }

    public AddInstanceUserSaleResponse addInstanceUserSale(AddInstanceUserSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addInstanceUserSaleWithOptions(request, runtime);
    }

    public AddUserResponse addUserWithOptions(AddUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buName)) {
            query.put("BuName", request.buName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginName)) {
            query.put("LoginName", request.loginName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realName)) {
            query.put("RealName", request.realName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUser"),
            new TeaPair("version", "2019-11-28"),
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

    public ChangeGradeAliyunInstanceResponse changeGradeAliyunInstanceWithOptions(ChangeGradeAliyunInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityList)) {
            body.put("CommodityList", request.commodityList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeGradeAliyunInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeGradeAliyunInstanceResponse());
    }

    public ChangeGradeAliyunInstanceResponse changeGradeAliyunInstance(ChangeGradeAliyunInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeGradeAliyunInstanceWithOptions(request, runtime);
    }

    public ChangeGradeAliyunInstanceSaleResponse changeGradeAliyunInstanceSaleWithOptions(ChangeGradeAliyunInstanceSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityList)) {
            body.put("CommodityList", request.commodityList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeGradeAliyunInstanceSale"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeGradeAliyunInstanceSaleResponse());
    }

    public ChangeGradeAliyunInstanceSaleResponse changeGradeAliyunInstanceSale(ChangeGradeAliyunInstanceSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeGradeAliyunInstanceSaleWithOptions(request, runtime);
    }

    public CheckAliyunInstanceStatusSaleResponse checkAliyunInstanceStatusSaleWithOptions(CheckAliyunInstanceStatusSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckAliyunInstanceStatusSale"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAliyunInstanceStatusSaleResponse());
    }

    public CheckAliyunInstanceStatusSaleResponse checkAliyunInstanceStatusSale(CheckAliyunInstanceStatusSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkAliyunInstanceStatusSaleWithOptions(request, runtime);
    }

    public CheckCardUsedOrNotResponse checkCardUsedOrNotWithOptions(CheckCardUsedOrNotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cardId)) {
            query.put("CardId", request.cardId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckCardUsedOrNot"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckCardUsedOrNotResponse());
    }

    public CheckCardUsedOrNotResponse checkCardUsedOrNot(CheckCardUsedOrNotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkCardUsedOrNotWithOptions(request, runtime);
    }

    public CheckOpenResponse checkOpenWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckOpen"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckOpenResponse());
    }

    public CheckOpenResponse checkOpen() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkOpenWithOptions(runtime);
    }

    public CheckOpenSaleResponse checkOpenSaleWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckOpenSale"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckOpenSaleResponse());
    }

    public CheckOpenSaleResponse checkOpenSale() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkOpenSaleWithOptions(runtime);
    }

    public CheckOpenXspaceResponse checkOpenXspaceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckOpenXspace"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckOpenXspaceResponse());
    }

    public CheckOpenXspaceResponse checkOpenXspace() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkOpenXspaceWithOptions(runtime);
    }

    public CreateAliyunInstanceNewResponse createAliyunInstanceNewWithOptions(CreateAliyunInstanceNewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityList)) {
            body.put("CommodityList", request.commodityList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceComponent)) {
            body.put("InstanceComponent", request.instanceComponent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAliyunInstanceNew"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAliyunInstanceNewResponse());
    }

    public CreateAliyunInstanceNewResponse createAliyunInstanceNew(CreateAliyunInstanceNewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAliyunInstanceNewWithOptions(request, runtime);
    }

    public CreateAliyunInstanceNewSaleResponse createAliyunInstanceNewSaleWithOptions(CreateAliyunInstanceNewSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityList)) {
            body.put("CommodityList", request.commodityList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceComponent)) {
            body.put("InstanceComponent", request.instanceComponent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAliyunInstanceNewSale"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAliyunInstanceNewSaleResponse());
    }

    public CreateAliyunInstanceNewSaleResponse createAliyunInstanceNewSale(CreateAliyunInstanceNewSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAliyunInstanceNewSaleWithOptions(request, runtime);
    }

    public CreateMemberTypeBySourceIdResponse createMemberTypeBySourceIdWithOptions(CreateMemberTypeBySourceIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authId)) {
            query.put("AuthId", request.authId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            query.put("IdentityType", request.identityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMemberTypeBySourceId"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMemberTypeBySourceIdResponse());
    }

    public CreateMemberTypeBySourceIdResponse createMemberTypeBySourceId(CreateMemberTypeBySourceIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMemberTypeBySourceIdWithOptions(request, runtime);
    }

    public CreateSkillGroupResponse createSkillGroupWithOptions(CreateSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            body.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupName)) {
            body.put("SkillGroupName", request.skillGroupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSkillGroup"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSkillGroupResponse());
    }

    public CreateSkillGroupResponse createSkillGroup(CreateSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSkillGroupWithOptions(request, runtime);
    }

    public CreateSubTicketResponse createSubTicketWithOptions(CreateSubTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizData)) {
            query.put("BizData", request.bizData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            query.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorName)) {
            query.put("CreatorName", request.creatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formData)) {
            query.put("FormData", request.formData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromInfo)) {
            query.put("FromInfo", request.fromInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberName)) {
            query.put("MemberName", request.memberName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCaseId)) {
            query.put("ParentCaseId", request.parentCaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubTicket"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubTicketResponse());
    }

    public CreateSubTicketResponse createSubTicket(CreateSubTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSubTicketWithOptions(request, runtime);
    }

    public CreateXspaceCommodityInstanceResponse createXspaceCommodityInstanceWithOptions(CreateXspaceCommodityInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alipkUserId)) {
            query.put("AlipkUserId", request.alipkUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargetype)) {
            query.put("Chargetype", request.chargetype);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityInstanceComponent)) {
            query.put("CommodityInstanceComponent", request.commodityInstanceComponent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityInstanceId)) {
            query.put("CommodityInstanceId", request.commodityInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityInstanceName)) {
            query.put("CommodityInstanceName", request.commodityInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotlineSeatNum)) {
            query.put("HotlineSeatNum", request.hotlineSeatNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotlineVersion)) {
            query.put("HotlineVersion", request.hotlineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlineSeatNum)) {
            query.put("OnlineSeatNum", request.onlineSeatNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlineVersion)) {
            query.put("OnlineVersion", request.onlineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateXspaceCommodityInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateXspaceCommodityInstanceResponse());
    }

    public CreateXspaceCommodityInstanceResponse createXspaceCommodityInstance(CreateXspaceCommodityInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createXspaceCommodityInstanceWithOptions(request, runtime);
    }

    public DeleteXsInstanceResponse deleteXsInstanceWithOptions(DeleteXsInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteXsInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteXsInstanceResponse());
    }

    public DeleteXsInstanceResponse deleteXsInstance(DeleteXsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteXsInstanceWithOptions(request, runtime);
    }

    public DescribeInstanceResponse describeInstanceWithOptions(DescribeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityInstanceId)) {
            body.put("CommodityInstanceId", request.commodityInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceResponse());
    }

    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceWithOptions(request, runtime);
    }

    public DescribeInstanceSaleResponse describeInstanceSaleWithOptions(DescribeInstanceSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityInstanceId)) {
            body.put("CommodityInstanceId", request.commodityInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceSale"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSaleResponse());
    }

    public DescribeInstanceSaleResponse describeInstanceSale(DescribeInstanceSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceSaleWithOptions(request, runtime);
    }

    public DescribeXsInstanceResponse describeXsInstanceWithOptions(DescribeXsInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeXsInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeXsInstanceResponse());
    }

    public DescribeXsInstanceResponse describeXsInstance(DescribeXsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeXsInstanceWithOptions(request, runtime);
    }

    public DisplayInstanceUserResponse displayInstanceUserWithOptions(DisplayInstanceUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityInstanceId)) {
            body.put("CommodityInstanceId", request.commodityInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisplayInstanceUser"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisplayInstanceUserResponse());
    }

    public DisplayInstanceUserResponse displayInstanceUser(DisplayInstanceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.displayInstanceUserWithOptions(request, runtime);
    }

    public DisplayInstanceUserSaleResponse displayInstanceUserSaleWithOptions(DisplayInstanceUserSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityInstanceId)) {
            body.put("CommodityInstanceId", request.commodityInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisplayInstanceUserSale"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisplayInstanceUserSaleResponse());
    }

    public DisplayInstanceUserSaleResponse displayInstanceUserSale(DisplayInstanceUserSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.displayInstanceUserSaleWithOptions(request, runtime);
    }

    public DoLogicalDeleteInstanceResponse doLogicalDeleteInstanceWithOptions(DoLogicalDeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DoLogicalDeleteInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DoLogicalDeleteInstanceResponse());
    }

    public DoLogicalDeleteInstanceResponse doLogicalDeleteInstance(DoLogicalDeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doLogicalDeleteInstanceWithOptions(request, runtime);
    }

    public GetAliyunInstanceRouteSaleResponse getAliyunInstanceRouteSaleWithOptions(GetAliyunInstanceRouteSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAliyunInstanceRouteSale"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAliyunInstanceRouteSaleResponse());
    }

    public GetAliyunInstanceRouteSaleResponse getAliyunInstanceRouteSale(GetAliyunInstanceRouteSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAliyunInstanceRouteSaleWithOptions(request, runtime);
    }

    public GetByForeignIdResponse getByForeignIdWithOptions(GetByForeignIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.foreignId)) {
            query.put("ForeignId", request.foreignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetByForeignId"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetByForeignIdResponse());
    }

    public GetByForeignIdResponse getByForeignId(GetByForeignIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getByForeignIdWithOptions(request, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    public GetInstanceListResponse getInstanceListWithOptions(GetInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceList"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceListResponse());
    }

    public GetInstanceListResponse getInstanceList(GetInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceListWithOptions(request, runtime);
    }

    public GetInstanceListSaleResponse getInstanceListSaleWithOptions(GetInstanceListSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceListSale"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceListSaleResponse());
    }

    public GetInstanceListSaleResponse getInstanceListSale(GetInstanceListSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceListSaleWithOptions(request, runtime);
    }

    public GetInstanceSaleResponse getInstanceSaleWithOptions(GetInstanceSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceSale"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceSaleResponse());
    }

    public GetInstanceSaleResponse getInstanceSale(GetInstanceSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceSaleWithOptions(request, runtime);
    }

    public GetUsersResponse getUsersWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUsers"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUsersResponse());
    }

    public GetUsersResponse getUsers() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUsersWithOptions(runtime);
    }

    public InitPlayAlimeSopResponse initPlayAlimeSopWithOptions(InitPlayAlimeSopRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.app))) {
            query.put("App", request.app);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.member))) {
            query.put("Member", request.member);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sopFlowId)) {
            query.put("SopFlowId", request.sopFlowId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitPlayAlimeSop"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitPlayAlimeSopResponse());
    }

    public InitPlayAlimeSopResponse initPlayAlimeSop(InitPlayAlimeSopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initPlayAlimeSopWithOptions(request, runtime);
    }

    public ListSopFlowsResponse listSopFlowsWithOptions(ListSopFlowsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSopFlows"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSopFlowsResponse());
    }

    public ListSopFlowsResponse listSopFlows(ListSopFlowsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSopFlowsWithOptions(request, runtime);
    }

    public ListXsInstancesResponse listXsInstancesWithOptions(ListXsInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListXsInstances"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListXsInstancesResponse());
    }

    public ListXsInstancesResponse listXsInstances(ListXsInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listXsInstancesWithOptions(request, runtime);
    }

    public ModifyUserResponse modifyUserWithOptions(ModifyUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buName)) {
            query.put("BuName", request.buName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUser"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserResponse());
    }

    public ModifyUserResponse modifyUser(ModifyUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserWithOptions(request, runtime);
    }

    public ModifyXsInstanceResponse modifyXsInstanceWithOptions(ModifyXsInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyXsInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyXsInstanceResponse());
    }

    public ModifyXsInstanceResponse modifyXsInstance(ModifyXsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyXsInstanceWithOptions(request, runtime);
    }

    public PhysicalDeleteInstanceResponse physicalDeleteInstanceWithOptions(PhysicalDeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PhysicalDeleteInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PhysicalDeleteInstanceResponse());
    }

    public PhysicalDeleteInstanceResponse physicalDeleteInstance(PhysicalDeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.physicalDeleteInstanceWithOptions(request, runtime);
    }

    public PlayAlimeSopResponse playAlimeSopWithOptions(PlayAlimeSopRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.data))) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PlayAlimeSop"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PlayAlimeSopResponse());
    }

    public PlayAlimeSopResponse playAlimeSop(PlayAlimeSopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.playAlimeSopWithOptions(request, runtime);
    }

    public QueryCommodityInstanceListResponse queryCommodityInstanceListWithOptions(QueryCommodityInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCommodityInstanceList"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCommodityInstanceListResponse());
    }

    public QueryCommodityInstanceListResponse queryCommodityInstanceList(QueryCommodityInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCommodityInstanceListWithOptions(request, runtime);
    }

    public QueryHotlineDashboardInfoResponse queryHotlineDashboardInfoWithOptions(QueryHotlineDashboardInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroups)) {
            query.put("SkillGroups", request.skillGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortFields)) {
            query.put("SortFields", request.sortFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHotlineDashboardInfo"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHotlineDashboardInfoResponse());
    }

    public QueryHotlineDashboardInfoResponse queryHotlineDashboardInfo(QueryHotlineDashboardInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryHotlineDashboardInfoWithOptions(request, runtime);
    }

    public QuerySkillGroupsResponse querySkillGroupsWithOptions(QuerySkillGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySkillGroups"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySkillGroupsResponse());
    }

    public QuerySkillGroupsResponse querySkillGroups(QuerySkillGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySkillGroupsWithOptions(request, runtime);
    }

    public ReleaseAliyunCommodityInstanceResponse releaseAliyunCommodityInstanceWithOptions(ReleaseAliyunCommodityInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityList)) {
            body.put("CommodityList", request.commodityList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseAliyunCommodityInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseAliyunCommodityInstanceResponse());
    }

    public ReleaseAliyunCommodityInstanceResponse releaseAliyunCommodityInstance(ReleaseAliyunCommodityInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseAliyunCommodityInstanceWithOptions(request, runtime);
    }

    public ReleaseAliyunCommodityInstanceSaleResponse releaseAliyunCommodityInstanceSaleWithOptions(ReleaseAliyunCommodityInstanceSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityList)) {
            body.put("CommodityList", request.commodityList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseAliyunCommodityInstanceSale"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseAliyunCommodityInstanceSaleResponse());
    }

    public ReleaseAliyunCommodityInstanceSaleResponse releaseAliyunCommodityInstanceSale(ReleaseAliyunCommodityInstanceSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseAliyunCommodityInstanceSaleWithOptions(request, runtime);
    }

    public ReleaseCommodityInstanceResponse releaseCommodityInstanceWithOptions(ReleaseCommodityInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityInstanceId)) {
            query.put("CommodityInstanceId", request.commodityInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseCommodityInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseCommodityInstanceResponse());
    }

    public ReleaseCommodityInstanceResponse releaseCommodityInstance(ReleaseCommodityInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseCommodityInstanceWithOptions(request, runtime);
    }

    public RemoveSkillGroupResponse removeSkillGroupWithOptions(RemoveSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            body.put("SkillGroupId", request.skillGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSkillGroup"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSkillGroupResponse());
    }

    public RemoveSkillGroupResponse removeSkillGroup(RemoveSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeSkillGroupWithOptions(request, runtime);
    }

    public RenewAliyunCommodityInstanceResponse renewAliyunCommodityInstanceWithOptions(RenewAliyunCommodityInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityList)) {
            body.put("CommodityList", request.commodityList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewAliyunCommodityInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewAliyunCommodityInstanceResponse());
    }

    public RenewAliyunCommodityInstanceResponse renewAliyunCommodityInstance(RenewAliyunCommodityInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewAliyunCommodityInstanceWithOptions(request, runtime);
    }

    public RenewAliyunCommodityInstanceSaleResponse renewAliyunCommodityInstanceSaleWithOptions(RenewAliyunCommodityInstanceSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityList)) {
            body.put("CommodityList", request.commodityList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewAliyunCommodityInstanceSale"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewAliyunCommodityInstanceSaleResponse());
    }

    public RenewAliyunCommodityInstanceSaleResponse renewAliyunCommodityInstanceSale(RenewAliyunCommodityInstanceSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewAliyunCommodityInstanceSaleWithOptions(request, runtime);
    }

    public RenewInstanceCommodityInstanceResponse renewInstanceCommodityInstanceWithOptions(RenewInstanceCommodityInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityInstanceId)) {
            query.put("CommodityInstanceId", request.commodityInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewInstanceCommodityInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewInstanceCommodityInstanceResponse());
    }

    public RenewInstanceCommodityInstanceResponse renewInstanceCommodityInstance(RenewInstanceCommodityInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewInstanceCommodityInstanceWithOptions(request, runtime);
    }

    public ResumeCommodityInstanceResponse resumeCommodityInstanceWithOptions(ResumeCommodityInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityInstanceId)) {
            query.put("CommodityInstanceId", request.commodityInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeCommodityInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeCommodityInstanceResponse());
    }

    public ResumeCommodityInstanceResponse resumeCommodityInstance(ResumeCommodityInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeCommodityInstanceWithOptions(request, runtime);
    }

    public SubmitResponse submitWithOptions(SubmitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Submit"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitResponse());
    }

    public SubmitResponse submit(SubmitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitWithOptions(request, runtime);
    }

    public SuspendCommodityInstanceResponse suspendCommodityInstanceWithOptions(SuspendCommodityInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityInstanceId)) {
            query.put("CommodityInstanceId", request.commodityInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendCommodityInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendCommodityInstanceResponse());
    }

    public SuspendCommodityInstanceResponse suspendCommodityInstance(SuspendCommodityInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendCommodityInstanceWithOptions(request, runtime);
    }

    public TestGetInstanceBaseInfoResponse testGetInstanceBaseInfoWithOptions(TestGetInstanceBaseInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestGetInstanceBaseInfo"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestGetInstanceBaseInfoResponse());
    }

    public TestGetInstanceBaseInfoResponse testGetInstanceBaseInfo(TestGetInstanceBaseInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testGetInstanceBaseInfoWithOptions(request, runtime);
    }

    public TestGetUserByIdResponse testGetUserByIdWithOptions(TestGetUserByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestGetUserById"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestGetUserByIdResponse());
    }

    public TestGetUserByIdResponse testGetUserById(TestGetUserByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testGetUserByIdWithOptions(request, runtime);
    }

    public UpGradeInstanceResponse upGradeInstanceWithOptions(UpGradeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityInstanceId)) {
            query.put("CommodityInstanceId", request.commodityInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotlineSeatNum)) {
            query.put("HotlineSeatNum", request.hotlineSeatNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotlineVersion)) {
            query.put("HotlineVersion", request.hotlineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlineSeatNum)) {
            query.put("OnlineSeatNum", request.onlineSeatNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlineVersion)) {
            query.put("OnlineVersion", request.onlineVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpGradeInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpGradeInstanceResponse());
    }

    public UpGradeInstanceResponse upGradeInstance(UpGradeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upGradeInstanceWithOptions(request, runtime);
    }

    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityInstanceId)) {
            body.put("CommodityInstanceId", request.commodityInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceWithOptions(request, runtime);
    }

    public UpdateInstanceSaleResponse updateInstanceSaleWithOptions(UpdateInstanceSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityInstanceId)) {
            body.put("CommodityInstanceId", request.commodityInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceSale"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceSaleResponse());
    }

    public UpdateInstanceSaleResponse updateInstanceSale(UpdateInstanceSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceSaleWithOptions(request, runtime);
    }

    public UpdateInstanceUserResponse updateInstanceUserWithOptions(UpdateInstanceUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buName)) {
            body.put("BuName", request.buName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceUser"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceUserResponse());
    }

    public UpdateInstanceUserResponse updateInstanceUser(UpdateInstanceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceUserWithOptions(request, runtime);
    }

    public UpdateInstanceUserSaleResponse updateInstanceUserSaleWithOptions(UpdateInstanceUserSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buName)) {
            body.put("BuName", request.buName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceUserSale"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceUserSaleResponse());
    }

    public UpdateInstanceUserSaleResponse updateInstanceUserSale(UpdateInstanceUserSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceUserSaleWithOptions(request, runtime);
    }

    public UpdateSkillGroupResponse updateSkillGroupWithOptions(UpdateSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupName)) {
            query.put("SkillGroupName", request.skillGroupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSkillGroup"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSkillGroupResponse());
    }

    public UpdateSkillGroupResponse updateSkillGroup(UpdateSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSkillGroupWithOptions(request, runtime);
    }

    public XspaceAccessCfServiceResponse xspaceAccessCfServiceWithOptions(XspaceAccessCfServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorEmpId)) {
            query.put("ExecutorEmpId", request.executorEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeTaskId)) {
            query.put("UpgradeTaskId", request.upgradeTaskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "XspaceAccessCfService"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new XspaceAccessCfServiceResponse());
    }

    public XspaceAccessCfServiceResponse xspaceAccessCfService(XspaceAccessCfServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.xspaceAccessCfServiceWithOptions(request, runtime);
    }

    public XspaceCancelCfServiceResponse xspaceCancelCfServiceWithOptions(XspaceCancelCfServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            query.put("SourceOrderId", request.sourceOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "XspaceCancelCfService"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new XspaceCancelCfServiceResponse());
    }

    public XspaceCancelCfServiceResponse xspaceCancelCfService(XspaceCancelCfServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.xspaceCancelCfServiceWithOptions(request, runtime);
    }

    public XspaceEndCfServiceResponse xspaceEndCfServiceWithOptions(XspaceEndCfServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            query.put("SourceOrderId", request.sourceOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "XspaceEndCfService"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new XspaceEndCfServiceResponse());
    }

    public XspaceEndCfServiceResponse xspaceEndCfService(XspaceEndCfServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.xspaceEndCfServiceWithOptions(request, runtime);
    }

    public XspaceQueryStatusCfServiceResponse xspaceQueryStatusCfServiceWithOptions(XspaceQueryStatusCfServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            query.put("SourceOrderId", request.sourceOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "XspaceQueryStatusCfService"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new XspaceQueryStatusCfServiceResponse());
    }

    public XspaceQueryStatusCfServiceResponse xspaceQueryStatusCfService(XspaceQueryStatusCfServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.xspaceQueryStatusCfServiceWithOptions(request, runtime);
    }

    public XspaceStartCfServiceResponse xspaceStartCfServiceWithOptions(XspaceStartCfServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorEmpId)) {
            query.put("ExecutorEmpId", request.executorEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            query.put("SourceOrderId", request.sourceOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "XspaceStartCfService"),
            new TeaPair("version", "2019-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new XspaceStartCfServiceResponse());
    }

    public XspaceStartCfServiceResponse xspaceStartCfService(XspaceStartCfServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.xspaceStartCfServiceWithOptions(request, runtime);
    }
}
