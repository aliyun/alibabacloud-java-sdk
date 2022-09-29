// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520;

import com.aliyun.tea.*;
import com.aliyun.linkcard20210520.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("linkcard", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddDirectionalCardResponse addDirectionalCardWithOptions(AddDirectionalCardRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddDirectionalCardShrinkRequest request = new AddDirectionalCardShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderList)) {
            request.orderListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderList, "OrderList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagList)) {
            request.tagListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagList, "TagList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileUri)) {
            query.put("FileUri", request.fileUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderListShrink)) {
            query.put("OrderList", request.orderListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagListShrink)) {
            query.put("TagList", request.tagListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadMethod)) {
            query.put("UploadMethod", request.uploadMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            query.put("UploadType", request.uploadType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDirectionalCard"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDirectionalCardResponse());
    }

    public AddDirectionalCardResponse addDirectionalCard(AddDirectionalCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDirectionalCardWithOptions(request, runtime);
    }

    public AddDirectionalGroupResponse addDirectionalGroupWithOptions(AddDirectionalGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDirectionalGroup"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDirectionalGroupResponse());
    }

    public AddDirectionalGroupResponse addDirectionalGroup(AddDirectionalGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDirectionalGroupWithOptions(request, runtime);
    }

    public BatchAddDirectionalAddressResponse batchAddDirectionalAddressWithOptions(BatchAddDirectionalAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listAddress)) {
            query.put("ListAddress", request.listAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAddDirectionalAddress"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAddDirectionalAddressResponse());
    }

    public BatchAddDirectionalAddressResponse batchAddDirectionalAddress(BatchAddDirectionalAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchAddDirectionalAddressWithOptions(request, runtime);
    }

    public ForceActivationResponse forceActivationWithOptions(ForceActivationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dateType)) {
            query.put("DateType", request.dateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ForceActivation"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ForceActivationResponse());
    }

    public ForceActivationResponse forceActivation(ForceActivationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.forceActivationWithOptions(request, runtime);
    }

    public GetCardDetailResponse getCardDetailWithOptions(GetCardDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destroyCard)) {
            query.put("DestroyCard", request.destroyCard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showPsim)) {
            query.put("ShowPsim", request.showPsim);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCardDetail"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCardDetailResponse());
    }

    public GetCardDetailResponse getCardDetail(GetCardDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCardDetailWithOptions(request, runtime);
    }

    public GetCardFlowInfoResponse getCardFlowInfoWithOptions(GetCardFlowInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dateList)) {
            query.put("DateList", request.dateList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCardFlowInfo"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCardFlowInfoResponse());
    }

    public GetCardFlowInfoResponse getCardFlowInfo(GetCardFlowInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCardFlowInfoWithOptions(request, runtime);
    }

    public GetCredentialPoolStatisticsResponse getCredentialPoolStatisticsWithOptions(GetCredentialPoolStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialNO)) {
            query.put("CredentialNO", request.credentialNO);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            query.put("Date", request.date);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCredentialPoolStatistics"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCredentialPoolStatisticsResponse());
    }

    public GetCredentialPoolStatisticsResponse getCredentialPoolStatistics(GetCredentialPoolStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCredentialPoolStatisticsWithOptions(request, runtime);
    }

    public ListCardInfoResponse listCardInfoWithOptions(ListCardInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activeTimeEnd)) {
            query.put("ActiveTimeEnd", request.activeTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activeTimeStart)) {
            query.put("ActiveTimeStart", request.activeTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliFee)) {
            query.put("AliFee", request.aliFee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunOrderId)) {
            query.put("AliyunOrderId", request.aliyunOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apnName)) {
            query.put("ApnName", request.apnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certifyType)) {
            query.put("CertifyType", request.certifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialNo)) {
            query.put("CredentialNo", request.credentialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataLevel)) {
            query.put("DataLevel", request.dataLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directionalGroupId)) {
            query.put("DirectionalGroupId", request.directionalGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTimeEnd)) {
            query.put("ExpireTimeEnd", request.expireTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTimeStart)) {
            query.put("ExpireTimeStart", request.expireTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imsi)) {
            query.put("Imsi", request.imsi);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAutoRecharge)) {
            query.put("IsAutoRecharge", request.isAutoRecharge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxFlow)) {
            query.put("MaxFlow", request.maxFlow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRestFlowPercentage)) {
            query.put("MaxRestFlowPercentage", request.maxRestFlowPercentage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minFlow)) {
            query.put("MinFlow", request.minFlow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msisdn)) {
            query.put("Msisdn", request.msisdn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyId)) {
            query.put("NotifyId", request.notifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osStatus)) {
            query.put("OsStatus", request.osStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolId)) {
            query.put("PoolId", request.poolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.simType)) {
            query.put("SimType", request.simType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            query.put("Vendor", request.vendor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCardInfo"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCardInfoResponse());
    }

    public ListCardInfoResponse listCardInfo(ListCardInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCardInfoWithOptions(request, runtime);
    }

    public ListDirectionalAddressResponse listDirectionalAddressWithOptions(ListDirectionalAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDirectionalAddress"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDirectionalAddressResponse());
    }

    public ListDirectionalAddressResponse listDirectionalAddress(ListDirectionalAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDirectionalAddressWithOptions(request, runtime);
    }

    public ListDirectionalDetailResponse listDirectionalDetailWithOptions(ListDirectionalDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDirectionalDetail"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDirectionalDetailResponse());
    }

    public ListDirectionalDetailResponse listDirectionalDetail(ListDirectionalDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDirectionalDetailWithOptions(request, runtime);
    }

    public ListOrderResponse listOrderWithOptions(ListOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderStatus)) {
            query.put("OrderStatus", request.orderStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrder"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrderResponse());
    }

    public ListOrderResponse listOrder(ListOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOrderWithOptions(request, runtime);
    }

    public RebindResumeSingleCardResponse rebindResumeSingleCardWithOptions(RebindResumeSingleCardRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RebindResumeSingleCardShrinkRequest request = new RebindResumeSingleCardShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.optMsisdns)) {
            request.optMsisdnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.optMsisdns, "OptMsisdns", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optMsisdnsShrink)) {
            query.put("OptMsisdns", request.optMsisdnsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebindResumeSingleCard"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebindResumeSingleCardResponse());
    }

    public RebindResumeSingleCardResponse rebindResumeSingleCard(RebindResumeSingleCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebindResumeSingleCardWithOptions(request, runtime);
    }

    public RenewResponse renewWithOptions(RenewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buyNum)) {
            query.put("BuyNum", request.buyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offerCode)) {
            query.put("OfferCode", request.offerCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rechargeType)) {
            query.put("RechargeType", request.rechargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            query.put("SerialNo", request.serialNo);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiProduct)) {
            body.put("ApiProduct", request.apiProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiRevision)) {
            body.put("ApiRevision", request.apiRevision);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Renew"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewResponse());
    }

    public RenewResponse renew(RenewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewWithOptions(request, runtime);
    }

    public ResumeSingleCardResponse resumeSingleCardWithOptions(ResumeSingleCardRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ResumeSingleCardShrinkRequest request = new ResumeSingleCardShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.optMsisdns)) {
            request.optMsisdnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.optMsisdns, "OptMsisdns", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optMsisdnsShrink)) {
            query.put("OptMsisdns", request.optMsisdnsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeSingleCard"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeSingleCardResponse());
    }

    public ResumeSingleCardResponse resumeSingleCard(ResumeSingleCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeSingleCardWithOptions(request, runtime);
    }

    public SetCardStopRuleResponse setCardStopRuleWithOptions(SetCardStopRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRestore)) {
            query.put("AutoRestore", request.autoRestore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLimit)) {
            query.put("FlowLimit", request.flowLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCardStopRule"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCardStopRuleResponse());
    }

    public SetCardStopRuleResponse setCardStopRule(SetCardStopRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCardStopRuleWithOptions(request, runtime);
    }

    public StopSingleCardResponse stopSingleCardWithOptions(StopSingleCardRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StopSingleCardShrinkRequest request = new StopSingleCardShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.optMsisdns)) {
            request.optMsisdnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.optMsisdns, "OptMsisdns", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optMsisdnsShrink)) {
            query.put("OptMsisdns", request.optMsisdnsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopSingleCard"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopSingleCardResponse());
    }

    public StopSingleCardResponse stopSingleCard(StopSingleCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopSingleCardWithOptions(request, runtime);
    }

    public UpdateAutoRechargeSwitchResponse updateAutoRechargeSwitchWithOptions(UpdateAutoRechargeSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.open)) {
            query.put("Open", request.open);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoRechargeSwitch"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutoRechargeSwitchResponse());
    }

    public UpdateAutoRechargeSwitchResponse updateAutoRechargeSwitch(UpdateAutoRechargeSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAutoRechargeSwitchWithOptions(request, runtime);
    }

    public VerifyIotCardResponse verifyIotCardWithOptions(VerifyIotCardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyIotCard"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyIotCardResponse());
    }

    public VerifyIotCardResponse verifyIotCard(VerifyIotCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyIotCardWithOptions(request, runtime);
    }
}
