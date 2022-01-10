// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712;

import com.aliyun.tea.*;
import com.aliyun.commondriver20160712.models.*;
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
        this._endpoint = this.getEndpoint("commondriver", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ActiveProductResponse activeProductWithOptions(ActiveProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activeCode)) {
            body.put("ActiveCode", request.activeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            body.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemCode)) {
            body.put("ItemCode", request.itemCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActiveProduct"),
            new TeaPair("version", "2016-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActiveProductResponse());
    }

    public ActiveProductResponse activeProduct(ActiveProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activeProductWithOptions(request, runtime);
    }

    public CreateOrderIapResponse createOrderIapWithOptions(CreateOrderIapRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramString)) {
            body.put("ParamString", request.paramString);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrderIap"),
            new TeaPair("version", "2016-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderIapResponse());
    }

    public CreateOrderIapResponse createOrderIap(CreateOrderIapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrderIapWithOptions(request, runtime);
    }

    public GetInstanceIdsFromTokenResponse getInstanceIdsFromTokenWithOptions(GetInstanceIdsFromTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceIdsFromToken"),
            new TeaPair("version", "2016-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceIdsFromTokenResponse());
    }

    public GetInstanceIdsFromTokenResponse getInstanceIdsFromToken(GetInstanceIdsFromTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceIdsFromTokenWithOptions(request, runtime);
    }

    public GetPlanItemSpecificationResponse getPlanItemSpecificationWithOptions(GetPlanItemSpecificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerId)) {
            query.put("BuyerId", request.buyerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childId)) {
            query.put("ChildId", request.childId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromApp)) {
            query.put("FromApp", request.fromApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payerId)) {
            query.put("PayerId", request.payerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planItemId)) {
            query.put("PlanItemId", request.planItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretKey)) {
            query.put("SecretKey", request.secretKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPlanItemSpecification"),
            new TeaPair("version", "2016-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPlanItemSpecificationResponse());
    }

    public GetPlanItemSpecificationResponse getPlanItemSpecification(GetPlanItemSpecificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPlanItemSpecificationWithOptions(request, runtime);
    }

    public GetPlanSpecificationResponse getPlanSpecificationWithOptions(GetPlanSpecificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerId)) {
            query.put("BuyerId", request.buyerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childId)) {
            query.put("ChildId", request.childId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromApp)) {
            query.put("FromApp", request.fromApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needItemSpecification)) {
            query.put("NeedItemSpecification", request.needItemSpecification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payerId)) {
            query.put("PayerId", request.payerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planCode)) {
            query.put("PlanCode", request.planCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretKey)) {
            query.put("SecretKey", request.secretKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPlanSpecification"),
            new TeaPair("version", "2016-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPlanSpecificationResponse());
    }

    public GetPlanSpecificationResponse getPlanSpecification(GetPlanSpecificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPlanSpecificationWithOptions(request, runtime);
    }

    public GetSpecificationsResponse getSpecificationsWithOptions(GetSpecificationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramStr)) {
            query.put("paramStr", request.paramStr);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSpecifications"),
            new TeaPair("version", "2016-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSpecificationsResponse());
    }

    public GetSpecificationsResponse getSpecifications(GetSpecificationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSpecificationsWithOptions(request, runtime);
    }

    public GlobalSyncSubDataResponse globalSyncSubDataWithOptions(GlobalSyncSubDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramStr)) {
            query.put("paramStr", request.paramStr);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GlobalSyncSubData"),
            new TeaPair("version", "2016-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalSyncSubDataResponse());
    }

    public GlobalSyncSubDataResponse globalSyncSubData(GlobalSyncSubDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.globalSyncSubDataWithOptions(request, runtime);
    }

    public GlobalSyncSubReleaseResponse globalSyncSubReleaseWithOptions(GlobalSyncSubReleaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramStr)) {
            query.put("paramStr", request.paramStr);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GlobalSyncSubRelease"),
            new TeaPair("version", "2016-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalSyncSubReleaseResponse());
    }

    public GlobalSyncSubReleaseResponse globalSyncSubRelease(GlobalSyncSubReleaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.globalSyncSubReleaseWithOptions(request, runtime);
    }

    public HostBindResponse hostBindWithOptions(HostBindRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            query.put("Param", request.param);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HostBind"),
            new TeaPair("version", "2016-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HostBindResponse());
    }

    public HostBindResponse hostBind(HostBindRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.hostBindWithOptions(request, runtime);
    }

    public PutInstanceIdsToTokenResponse putInstanceIdsToTokenWithOptions(PutInstanceIdsToTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromApp)) {
            query.put("FromApp", request.fromApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutInstanceIdsToToken"),
            new TeaPair("version", "2016-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutInstanceIdsToTokenResponse());
    }

    public PutInstanceIdsToTokenResponse putInstanceIdsToToken(PutInstanceIdsToTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putInstanceIdsToTokenWithOptions(request, runtime);
    }

    public QueryHostResponse queryHostWithOptions(QueryHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            query.put("Param", request.param);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHost"),
            new TeaPair("version", "2016-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHostResponse());
    }

    public QueryHostResponse queryHost(QueryHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryHostWithOptions(request, runtime);
    }

    public UpdateHostResponse updateHostWithOptions(UpdateHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            query.put("Param", request.param);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHost"),
            new TeaPair("version", "2016-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHostResponse());
    }

    public UpdateHostResponse updateHost(UpdateHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateHostWithOptions(request, runtime);
    }
}
