// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531;

import com.aliyun.tea.*;
import com.aliyun.linkedmall20220531.models.*;
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
            new TeaPair("cn-hangzhou", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-south-1", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-beijing", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-chengdu", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-edge-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-fujian", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hongkong", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-qingdao", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-wuhan", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "linkedmall.aliyuncs.com"),
            new TeaPair("eu-central-1", "linkedmall.aliyuncs.com"),
            new TeaPair("eu-west-1", "linkedmall.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "linkedmall.aliyuncs.com"),
            new TeaPair("me-east-1", "linkedmall.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "linkedmall.aliyuncs.com"),
            new TeaPair("us-east-1", "linkedmall.aliyuncs.com"),
            new TeaPair("us-west-1", "linkedmall.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("linkedmall", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ApplyCreateDistributionOrderResponse applyCreateDistributionOrderWithOptions(ApplyCreateDistributionOrderRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyCreateDistributionOrderShrinkRequest request = new ApplyCreateDistributionOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemInfoLists)) {
            request.itemInfoListsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemInfoLists, "ItemInfoLists", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buyerId)) {
            body.put("BuyerId", request.buyerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryAddress)) {
            body.put("DeliveryAddress", request.deliveryAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionSupplierId)) {
            body.put("DistributionSupplierId", request.distributionSupplierId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemInfoListsShrink)) {
            body.put("ItemInfoLists", request.itemInfoListsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyCreateDistributionOrder"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyCreateDistributionOrderResponse());
    }

    public ApplyCreateDistributionOrderResponse applyCreateDistributionOrder(ApplyCreateDistributionOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyCreateDistributionOrderWithOptions(request, runtime);
    }

    public ApplyRefund4DistributionResponse applyRefund4DistributionWithOptions(ApplyRefund4DistributionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyRefund4DistributionShrinkRequest request = new ApplyRefund4DistributionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.leavePictureLists)) {
            request.leavePictureListsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.leavePictureLists, "LeavePictureLists", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyReasonTextId)) {
            body.put("ApplyReasonTextId", request.applyReasonTextId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyRefundCount)) {
            body.put("ApplyRefundCount", request.applyRefundCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyRefundFee)) {
            body.put("ApplyRefundFee", request.applyRefundFee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizClaimType)) {
            body.put("BizClaimType", request.bizClaimType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.goodsStatus)) {
            body.put("GoodsStatus", request.goodsStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.leaveMessage)) {
            body.put("LeaveMessage", request.leaveMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.leavePictureListsShrink)) {
            body.put("LeavePictureLists", request.leavePictureListsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDistributionOrderId)) {
            body.put("SubDistributionOrderId", request.subDistributionOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyRefund4Distribution"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyRefund4DistributionResponse());
    }

    public ApplyRefund4DistributionResponse applyRefund4Distribution(ApplyRefund4DistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyRefund4DistributionWithOptions(request, runtime);
    }

    public CancelDistributionTradeResponse cancelDistributionTradeWithOptions(CancelDistributionTradeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distributionTradeId)) {
            body.put("DistributionTradeId", request.distributionTradeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelDistributionTrade"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelDistributionTradeResponse());
    }

    public CancelDistributionTradeResponse cancelDistributionTrade(CancelDistributionTradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelDistributionTradeWithOptions(request, runtime);
    }

    public CancelRefund4DistributionResponse cancelRefund4DistributionWithOptions(CancelRefund4DistributionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disputeId)) {
            body.put("DisputeId", request.disputeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDistributionOrderId)) {
            body.put("SubDistributionOrderId", request.subDistributionOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRefund4Distribution"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRefund4DistributionResponse());
    }

    public CancelRefund4DistributionResponse cancelRefund4Distribution(CancelRefund4DistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelRefund4DistributionWithOptions(request, runtime);
    }

    public ConfirmDisburse4DistributionResponse confirmDisburse4DistributionWithOptions(ConfirmDisburse4DistributionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distributionTradeId)) {
            body.put("DistributionTradeId", request.distributionTradeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainDistributionOrderId)) {
            body.put("MainDistributionOrderId", request.mainDistributionOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmDisburse4Distribution"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmDisburse4DistributionResponse());
    }

    public ConfirmDisburse4DistributionResponse confirmDisburse4Distribution(ConfirmDisburse4DistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmDisburse4DistributionWithOptions(request, runtime);
    }

    public InitApplyRefund4DistributionResponse initApplyRefund4DistributionWithOptions(InitApplyRefund4DistributionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizClaimType)) {
            body.put("BizClaimType", request.bizClaimType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.goodsStatus)) {
            body.put("GoodsStatus", request.goodsStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDistributionOrderId)) {
            body.put("SubDistributionOrderId", request.subDistributionOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitApplyRefund4Distribution"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitApplyRefund4DistributionResponse());
    }

    public InitApplyRefund4DistributionResponse initApplyRefund4Distribution(InitApplyRefund4DistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initApplyRefund4DistributionWithOptions(request, runtime);
    }

    public InitModifyRefund4DistributionResponse initModifyRefund4DistributionWithOptions(InitModifyRefund4DistributionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizClaimType)) {
            body.put("BizClaimType", request.bizClaimType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disputeId)) {
            body.put("DisputeId", request.disputeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDistributionOrderId)) {
            body.put("SubDistributionOrderId", request.subDistributionOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitModifyRefund4Distribution"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitModifyRefund4DistributionResponse());
    }

    public InitModifyRefund4DistributionResponse initModifyRefund4Distribution(InitModifyRefund4DistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initModifyRefund4DistributionWithOptions(request, runtime);
    }

    public ListDistributionItemResponse listDistributionItemWithOptions(ListDistributionItemRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDistributionItemShrinkRequest request = new ListDistributionItemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionMallId)) {
            body.put("DistributionMallId", request.distributionMallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemStatus)) {
            body.put("ItemStatus", request.itemStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemIdsShrink)) {
            body.put("LmItemIds", request.lmItemIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDistributionItem"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDistributionItemResponse());
    }

    public ListDistributionItemResponse listDistributionItem(ListDistributionItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDistributionItemWithOptions(request, runtime);
    }

    public ListDistributionMallResponse listDistributionMallWithOptions(ListDistributionMallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelSupplierId)) {
            body.put("ChannelSupplierId", request.channelSupplierId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionMallName)) {
            body.put("DistributionMallName", request.distributionMallName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDistributionMall"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDistributionMallResponse());
    }

    public ListDistributionMallResponse listDistributionMall(ListDistributionMallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDistributionMallWithOptions(request, runtime);
    }

    public ModifyRefund4DistributionResponse modifyRefund4DistributionWithOptions(ModifyRefund4DistributionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyRefund4DistributionShrinkRequest request = new ModifyRefund4DistributionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.leavePictureLists)) {
            request.leavePictureListsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.leavePictureLists, "LeavePictureLists", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyReasonTextId)) {
            body.put("ApplyReasonTextId", request.applyReasonTextId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyRefundCount)) {
            body.put("ApplyRefundCount", request.applyRefundCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyRefundFee)) {
            body.put("ApplyRefundFee", request.applyRefundFee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizClaimType)) {
            body.put("BizClaimType", request.bizClaimType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disputeId)) {
            body.put("DisputeId", request.disputeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.goodsStatus)) {
            body.put("GoodsStatus", request.goodsStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.leaveMessage)) {
            body.put("LeaveMessage", request.leaveMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.leavePictureListsShrink)) {
            body.put("LeavePictureLists", request.leavePictureListsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDistributionOrderId)) {
            body.put("SubDistributionOrderId", request.subDistributionOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRefund4Distribution"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRefund4DistributionResponse());
    }

    public ModifyRefund4DistributionResponse modifyRefund4Distribution(ModifyRefund4DistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRefund4DistributionWithOptions(request, runtime);
    }

    public QueryDistributionMallResponse queryDistributionMallWithOptions(QueryDistributionMallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distributionMallId)) {
            body.put("DistributionMallId", request.distributionMallId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDistributionMall"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDistributionMallResponse());
    }

    public QueryDistributionMallResponse queryDistributionMall(QueryDistributionMallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDistributionMallWithOptions(request, runtime);
    }

    public QueryDistributionTradeStatusResponse queryDistributionTradeStatusWithOptions(QueryDistributionTradeStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distributionSupplierId)) {
            body.put("DistributionSupplierId", request.distributionSupplierId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionTradeId)) {
            body.put("DistributionTradeId", request.distributionTradeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDistributionTradeStatus"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDistributionTradeStatusResponse());
    }

    public QueryDistributionTradeStatusResponse queryDistributionTradeStatus(QueryDistributionTradeStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDistributionTradeStatusWithOptions(request, runtime);
    }

    public QueryItemDetailResponse queryItemDetailWithOptions(QueryItemDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distributionMallId)) {
            body.put("DistributionMallId", request.distributionMallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryItemDetail"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryItemDetailResponse());
    }

    public QueryItemDetailResponse queryItemDetail(QueryItemDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryItemDetailWithOptions(request, runtime);
    }

    public QueryLogistics4DistributionResponse queryLogistics4DistributionWithOptions(QueryLogistics4DistributionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainDistributionOrderId)) {
            body.put("MainDistributionOrderId", request.mainDistributionOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLogistics4Distribution"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLogistics4DistributionResponse());
    }

    public QueryLogistics4DistributionResponse queryLogistics4Distribution(QueryLogistics4DistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryLogistics4DistributionWithOptions(request, runtime);
    }

    public QueryOrderDetail4DistributionResponse queryOrderDetail4DistributionWithOptions(QueryOrderDetail4DistributionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainDistributionOrderId)) {
            body.put("MainDistributionOrderId", request.mainDistributionOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderDetail4Distribution"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderDetail4DistributionResponse());
    }

    public QueryOrderDetail4DistributionResponse queryOrderDetail4Distribution(QueryOrderDetail4DistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderDetail4DistributionWithOptions(request, runtime);
    }

    public QueryOrderList4DistributionResponse queryOrderList4DistributionWithOptions(QueryOrderList4DistributionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterOption)) {
            body.put("FilterOption", request.filterOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderList4Distribution"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderList4DistributionResponse());
    }

    public QueryOrderList4DistributionResponse queryOrderList4Distribution(QueryOrderList4DistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderList4DistributionWithOptions(request, runtime);
    }

    public QueryRefundApplicationDetail4DistributionResponse queryRefundApplicationDetail4DistributionWithOptions(QueryRefundApplicationDetail4DistributionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDistributionOrderId)) {
            body.put("SubDistributionOrderId", request.subDistributionOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRefundApplicationDetail4Distribution"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRefundApplicationDetail4DistributionResponse());
    }

    public QueryRefundApplicationDetail4DistributionResponse queryRefundApplicationDetail4Distribution(QueryRefundApplicationDetail4DistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRefundApplicationDetail4DistributionWithOptions(request, runtime);
    }

    public RenderDistributionOrderResponse renderDistributionOrderWithOptions(RenderDistributionOrderRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RenderDistributionOrderShrinkRequest request = new RenderDistributionOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemInfoLists)) {
            request.itemInfoListsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemInfoLists, "ItemInfoLists", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buyerId)) {
            body.put("BuyerId", request.buyerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryAddress)) {
            body.put("DeliveryAddress", request.deliveryAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionSupplierId)) {
            body.put("DistributionSupplierId", request.distributionSupplierId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemInfoListsShrink)) {
            body.put("ItemInfoLists", request.itemInfoListsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenderDistributionOrder"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenderDistributionOrderResponse());
    }

    public RenderDistributionOrderResponse renderDistributionOrder(RenderDistributionOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renderDistributionOrderWithOptions(request, runtime);
    }

    public SubmitReturnGoodLogistics4DistributionResponse submitReturnGoodLogistics4DistributionWithOptions(SubmitReturnGoodLogistics4DistributionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpCode)) {
            body.put("CpCode", request.cpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disputeId)) {
            body.put("DisputeId", request.disputeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorId)) {
            body.put("DistributorId", request.distributorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logisticsNo)) {
            body.put("LogisticsNo", request.logisticsNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDistributionOrderId)) {
            body.put("SubDistributionOrderId", request.subDistributionOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitReturnGoodLogistics4Distribution"),
            new TeaPair("version", "2022-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitReturnGoodLogistics4DistributionResponse());
    }

    public SubmitReturnGoodLogistics4DistributionResponse submitReturnGoodLogistics4Distribution(SubmitReturnGoodLogistics4DistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitReturnGoodLogistics4DistributionWithOptions(request, runtime);
    }
}
