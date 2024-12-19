// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116;

import com.aliyun.tea.*;
import com.aliyun.linkedmall20180116.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * @param request AddAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAddressResponse
     */
    public AddAddressResponse addAddressWithOptions(AddAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressInfo)) {
            body.put("AddressInfo", request.addressInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAddress"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAddressResponse());
    }

    /**
     * @param request AddAddressRequest
     * @return AddAddressResponse
     */
    public AddAddressResponse addAddress(AddAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAddressWithOptions(request, runtime);
    }

    /**
     * @param request AddItemLimitRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddItemLimitRuleResponse
     */
    public AddItemLimitRuleResponse addItemLimitRuleWithOptions(AddItemLimitRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmActivityId)) {
            query.put("LmActivityId", request.lmActivityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            query.put("LmItemId", request.lmItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subBizCode)) {
            query.put("SubBizCode", request.subBizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upperNum)) {
            query.put("UpperNum", request.upperNum);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddItemLimitRule"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddItemLimitRuleResponse());
    }

    /**
     * @param request AddItemLimitRuleRequest
     * @return AddItemLimitRuleResponse
     */
    public AddItemLimitRuleResponse addItemLimitRule(AddItemLimitRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addItemLimitRuleWithOptions(request, runtime);
    }

    /**
     * @param tmpReq AddItemToSubBizsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddItemToSubBizsResponse
     */
    public AddItemToSubBizsResponse addItemToSubBizsWithOptions(AddItemToSubBizsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddItemToSubBizsShrinkRequest request = new AddItemToSubBizsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subBizIds)) {
            request.subBizIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subBizIds, "SubBizIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            body.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            body.put("LmItemId", request.lmItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subBizIdsShrink)) {
            body.put("SubBizIds", request.subBizIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddItemToSubBizs"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddItemToSubBizsResponse());
    }

    /**
     * @param request AddItemToSubBizsRequest
     * @return AddItemToSubBizsResponse
     */
    public AddItemToSubBizsResponse addItemToSubBizs(AddItemToSubBizsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addItemToSubBizsWithOptions(request, runtime);
    }

    /**
     * @param request AddSupplierNewItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSupplierNewItemsResponse
     */
    public AddSupplierNewItemsResponse addSupplierNewItemsWithOptions(AddSupplierNewItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemList)) {
            query.put("ItemList", request.itemList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSupplierNewItems"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSupplierNewItemsResponse());
    }

    /**
     * @param request AddSupplierNewItemsRequest
     * @return AddSupplierNewItemsResponse
     */
    public AddSupplierNewItemsResponse addSupplierNewItems(AddSupplierNewItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSupplierNewItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>退款申请</p>
     * 
     * @param request ApplyRefundRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyRefundResponse
     */
    public ApplyRefundResponse applyRefundWithOptions(ApplyRefundRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyReasonTextId)) {
            query.put("ApplyReasonTextId", request.applyReasonTextId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyRefundCount)) {
            query.put("ApplyRefundCount", request.applyRefundCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyRefundFee)) {
            query.put("ApplyRefundFee", request.applyRefundFee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizClaimType)) {
            query.put("BizClaimType", request.bizClaimType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.goodsStatus)) {
            query.put("GoodsStatus", request.goodsStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subLmOrderId)) {
            query.put("SubLmOrderId", request.subLmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.leaveMessage)) {
            body.put("LeaveMessage", request.leaveMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.leavePictureList)) {
            body.put("LeavePictureList", request.leavePictureList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyRefund"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyRefundResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>退款申请</p>
     * 
     * @param request ApplyRefundRequest
     * @return ApplyRefundResponse
     */
    public ApplyRefundResponse applyRefund(ApplyRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyRefundWithOptions(request, runtime);
    }

    /**
     * @param tmpReq ApplyRefundWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyRefundWithDesignatedTbUidResponse
     */
    public ApplyRefundWithDesignatedTbUidResponse applyRefundWithDesignatedTbUidWithOptions(ApplyRefundWithDesignatedTbUidRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyRefundWithDesignatedTbUidShrinkRequest request = new ApplyRefundWithDesignatedTbUidShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.proofs)) {
            request.proofsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.proofs, "Proofs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disputeId)) {
            body.put("DisputeId", request.disputeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.goodsStatus)) {
            body.put("GoodsStatus", request.goodsStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            body.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proofsShrink)) {
            body.put("Proofs", request.proofsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reasonId)) {
            body.put("ReasonId", request.reasonId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundCode)) {
            body.put("RefundCode", request.refundCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundCount)) {
            body.put("RefundCount", request.refundCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundFee)) {
            body.put("RefundFee", request.refundFee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subLmOrderId)) {
            body.put("SubLmOrderId", request.subLmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyRefundWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyRefundWithDesignatedTbUidResponse());
    }

    /**
     * @param request ApplyRefundWithDesignatedTbUidRequest
     * @return ApplyRefundWithDesignatedTbUidResponse
     */
    public ApplyRefundWithDesignatedTbUidResponse applyRefundWithDesignatedTbUid(ApplyRefundWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyRefundWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * @param request BatchRegistAnonymousTbAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchRegistAnonymousTbAccountResponse
     */
    public BatchRegistAnonymousTbAccountResponse batchRegistAnonymousTbAccountWithOptions(BatchRegistAnonymousTbAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idJsonList)) {
            query.put("IdJsonList", request.idJsonList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchRegistAnonymousTbAccount"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchRegistAnonymousTbAccountResponse());
    }

    /**
     * @param request BatchRegistAnonymousTbAccountRequest
     * @return BatchRegistAnonymousTbAccountResponse
     */
    public BatchRegistAnonymousTbAccountResponse batchRegistAnonymousTbAccount(BatchRegistAnonymousTbAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchRegistAnonymousTbAccountWithOptions(request, runtime);
    }

    /**
     * @param request CancelOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelOrderResponse
     */
    public CancelOrderResponse cancelOrderWithOptions(CancelOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmOrderId)) {
            query.put("LmOrderId", request.lmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOrderResponse());
    }

    /**
     * @param request CancelOrderRequest
     * @return CancelOrderResponse
     */
    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelOrderWithOptions(request, runtime);
    }

    /**
     * @param request CancelOrderWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelOrderWithDesignatedTbUidResponse
     */
    public CancelOrderWithDesignatedTbUidResponse cancelOrderWithDesignatedTbUidWithOptions(CancelOrderWithDesignatedTbUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmOrderId)) {
            body.put("LmOrderId", request.lmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelOrderWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOrderWithDesignatedTbUidResponse());
    }

    /**
     * @param request CancelOrderWithDesignatedTbUidRequest
     * @return CancelOrderWithDesignatedTbUidResponse
     */
    public CancelOrderWithDesignatedTbUidResponse cancelOrderWithDesignatedTbUid(CancelOrderWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelOrderWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * @param request CancelRealTbAccountSupportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelRealTbAccountSupportResponse
     */
    public CancelRealTbAccountSupportResponse cancelRealTbAccountSupportWithOptions(CancelRealTbAccountSupportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRealTbAccountSupport"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRealTbAccountSupportResponse());
    }

    /**
     * @param request CancelRealTbAccountSupportRequest
     * @return CancelRealTbAccountSupportResponse
     */
    public CancelRealTbAccountSupportResponse cancelRealTbAccountSupport(CancelRealTbAccountSupportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelRealTbAccountSupportWithOptions(request, runtime);
    }

    /**
     * @param request CancelRefundRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelRefundResponse
     */
    public CancelRefundResponse cancelRefundWithOptions(CancelRefundRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disputeId)) {
            query.put("DisputeId", request.disputeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subLmOrderId)) {
            query.put("SubLmOrderId", request.subLmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRefund"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRefundResponse());
    }

    /**
     * @param request CancelRefundRequest
     * @return CancelRefundResponse
     */
    public CancelRefundResponse cancelRefund(CancelRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelRefundWithOptions(request, runtime);
    }

    /**
     * @param request CancelRefundWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelRefundWithDesignatedTbUidResponse
     */
    public CancelRefundWithDesignatedTbUidResponse cancelRefundWithDesignatedTbUidWithOptions(CancelRefundWithDesignatedTbUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disputeId)) {
            body.put("DisputeId", request.disputeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subLmOrderId)) {
            body.put("SubLmOrderId", request.subLmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRefundWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRefundWithDesignatedTbUidResponse());
    }

    /**
     * @param request CancelRefundWithDesignatedTbUidRequest
     * @return CancelRefundWithDesignatedTbUidResponse
     */
    public CancelRefundWithDesignatedTbUidResponse cancelRefundWithDesignatedTbUid(CancelRefundWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelRefundWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * @param request ConfirmDisburseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfirmDisburseResponse
     */
    public ConfirmDisburseResponse confirmDisburseWithOptions(ConfirmDisburseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmOrderId)) {
            query.put("LmOrderId", request.lmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmDisburse"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmDisburseResponse());
    }

    /**
     * @param request ConfirmDisburseRequest
     * @return ConfirmDisburseResponse
     */
    public ConfirmDisburseResponse confirmDisburse(ConfirmDisburseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.confirmDisburseWithOptions(request, runtime);
    }

    /**
     * @param request ConfirmDisburseWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfirmDisburseWithDesignatedTbUidResponse
     */
    public ConfirmDisburseWithDesignatedTbUidResponse confirmDisburseWithDesignatedTbUidWithOptions(ConfirmDisburseWithDesignatedTbUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmOrderId)) {
            body.put("LmOrderId", request.lmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmDisburseWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmDisburseWithDesignatedTbUidResponse());
    }

    /**
     * @param request ConfirmDisburseWithDesignatedTbUidRequest
     * @return ConfirmDisburseWithDesignatedTbUidResponse
     */
    public ConfirmDisburseWithDesignatedTbUidResponse confirmDisburseWithDesignatedTbUid(ConfirmDisburseWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.confirmDisburseWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * @param request CreateOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerMessageMap)) {
            query.put("BuyerMessageMap", request.buyerMessageMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryAddress)) {
            query.put("DeliveryAddress", request.deliveryAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemList)) {
            query.put("ItemList", request.itemList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            query.put("LmItemId", request.lmItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderExpireTime)) {
            query.put("OrderExpireTime", request.orderExpireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeId)) {
            query.put("OutTradeId", request.outTradeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quantity)) {
            query.put("Quantity", request.quantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalAmount)) {
            query.put("TotalAmount", request.totalAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderResponse());
    }

    /**
     * @param request CreateOrderRequest
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>支持外部传入优惠下单接口</p>
     * 
     * @param request CreateOrderPayUrlForOutDiscountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrderPayUrlForOutDiscountResponse
     */
    public CreateOrderPayUrlForOutDiscountResponse createOrderPayUrlForOutDiscountWithOptions(CreateOrderPayUrlForOutDiscountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buyInfo)) {
            body.put("BuyInfo", request.buyInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrderPayUrlForOutDiscount"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderPayUrlForOutDiscountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>支持外部传入优惠下单接口</p>
     * 
     * @param request CreateOrderPayUrlForOutDiscountRequest
     * @return CreateOrderPayUrlForOutDiscountResponse
     */
    public CreateOrderPayUrlForOutDiscountResponse createOrderPayUrlForOutDiscount(CreateOrderPayUrlForOutDiscountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderPayUrlForOutDiscountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成订单交易明细文件</p>
     * 
     * @param request CreateOrderTransactionDetailFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrderTransactionDetailFileResponse
     */
    public CreateOrderTransactionDetailFileResponse createOrderTransactionDetailFileWithOptions(CreateOrderTransactionDetailFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelName)) {
            body.put("ChannelName", request.channelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createEndTime)) {
            body.put("CreateEndTime", request.createEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createStartTime)) {
            body.put("CreateStartTime", request.createStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            body.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmShopId)) {
            body.put("LmShopId", request.lmShopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderStatus)) {
            body.put("OrderStatus", request.orderStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payStatus)) {
            body.put("PayStatus", request.payStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentEndTime)) {
            body.put("PaymentEndTime", request.paymentEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentStartTime)) {
            body.put("PaymentStartTime", request.paymentStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poCode)) {
            body.put("PoCode", request.poCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundEndTime)) {
            body.put("RefundEndTime", request.refundEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundStartTime)) {
            body.put("RefundStartTime", request.refundStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerId)) {
            body.put("SellerId", request.sellerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerName)) {
            body.put("SellerName", request.sellerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settlementNode)) {
            body.put("SettlementNode", request.settlementNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopName)) {
            body.put("ShopName", request.shopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbMainOrderId)) {
            body.put("TbMainOrderId", request.tbMainOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantName)) {
            body.put("TenantName", request.tenantName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrderTransactionDetailFile"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderTransactionDetailFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成订单交易明细文件</p>
     * 
     * @param request CreateOrderTransactionDetailFileRequest
     * @return CreateOrderTransactionDetailFileResponse
     */
    public CreateOrderTransactionDetailFileResponse createOrderTransactionDetailFile(CreateOrderTransactionDetailFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderTransactionDetailFileWithOptions(request, runtime);
    }

    /**
     * @param request CreateOrderV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrderV2Response
     */
    public CreateOrderV2Response createOrderV2WithOptions(CreateOrderV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerMessageMap)) {
            query.put("BuyerMessageMap", request.buyerMessageMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryAddress)) {
            query.put("DeliveryAddress", request.deliveryAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemList)) {
            query.put("ItemList", request.itemList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            query.put("LmItemId", request.lmItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderExpireTime)) {
            query.put("OrderExpireTime", request.orderExpireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeId)) {
            query.put("OutTradeId", request.outTradeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quantity)) {
            query.put("Quantity", request.quantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalAmount)) {
            query.put("TotalAmount", request.totalAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrderV2"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderV2Response());
    }

    /**
     * @param request CreateOrderV2Request
     * @return CreateOrderV2Response
     */
    public CreateOrderV2Response createOrderV2(CreateOrderV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderV2WithOptions(request, runtime);
    }

    /**
     * @param request CreateOrderWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrderWithDesignatedTbUidResponse
     */
    public CreateOrderWithDesignatedTbUidResponse createOrderWithDesignatedTbUidWithOptions(CreateOrderWithDesignatedTbUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerMessages)) {
            body.put("BuyerMessages", request.buyerMessages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryAddress)) {
            body.put("DeliveryAddress", request.deliveryAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryInfo)) {
            body.put("DeliveryInfo", request.deliveryInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderExpireTime)) {
            body.put("OrderExpireTime", request.orderExpireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderItems)) {
            body.put("OrderItems", request.orderItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeId)) {
            body.put("OutTradeId", request.outTradeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrderWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderWithDesignatedTbUidResponse());
    }

    /**
     * @param request CreateOrderWithDesignatedTbUidRequest
     * @return CreateOrderWithDesignatedTbUidResponse
     */
    public CreateOrderWithDesignatedTbUidResponse createOrderWithDesignatedTbUid(CreateOrderWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * @param request CreateOutDiscountOrderWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOutDiscountOrderWithDesignatedTbUidResponse
     */
    public CreateOutDiscountOrderWithDesignatedTbUidResponse createOutDiscountOrderWithDesignatedTbUidWithOptions(CreateOutDiscountOrderWithDesignatedTbUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerMessages)) {
            body.put("BuyerMessages", request.buyerMessages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryAddress)) {
            body.put("DeliveryAddress", request.deliveryAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryInfo)) {
            body.put("DeliveryInfo", request.deliveryInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderExpireTime)) {
            body.put("OrderExpireTime", request.orderExpireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderItems)) {
            body.put("OrderItems", request.orderItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outDiscountInfos)) {
            body.put("OutDiscountInfos", request.outDiscountInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeId)) {
            body.put("OutTradeId", request.outTradeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOutDiscountOrderWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOutDiscountOrderWithDesignatedTbUidResponse());
    }

    /**
     * @param request CreateOutDiscountOrderWithDesignatedTbUidRequest
     * @return CreateOutDiscountOrderWithDesignatedTbUidResponse
     */
    public CreateOutDiscountOrderWithDesignatedTbUidResponse createOutDiscountOrderWithDesignatedTbUid(CreateOutDiscountOrderWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOutDiscountOrderWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * @param request CreatePayUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePayUrlResponse
     */
    public CreatePayUrlResponse createPayUrlWithOptions(CreatePayUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buyInfo)) {
            body.put("BuyInfo", request.buyInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePayUrl"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePayUrlResponse());
    }

    /**
     * @param request CreatePayUrlRequest
     * @return CreatePayUrlResponse
     */
    public CreatePayUrlResponse createPayUrl(CreatePayUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPayUrlWithOptions(request, runtime);
    }

    /**
     * @param request CreateSettleConfirmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSettleConfirmResponse
     */
    public CreateSettleConfirmResponse createSettleConfirmWithOptions(CreateSettleConfirmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantId)) {
            body.put("MerchantId", request.merchantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outRequestNo)) {
            body.put("OutRequestNo", request.outRequestNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeNo)) {
            body.put("OutTradeNo", request.outTradeNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settleInfo)) {
            body.put("SettleInfo", request.settleInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeNo)) {
            body.put("TradeNo", request.tradeNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSettleConfirm"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSettleConfirmResponse());
    }

    /**
     * @param request CreateSettleConfirmRequest
     * @return CreateSettleConfirmResponse
     */
    public CreateSettleConfirmResponse createSettleConfirm(CreateSettleConfirmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSettleConfirmWithOptions(request, runtime);
    }

    /**
     * @param request CreateVirtualProductOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVirtualProductOrderResponse
     */
    public CreateVirtualProductOrderResponse createVirtualProductOrderWithOptions(CreateVirtualProductOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryAddress)) {
            query.put("DeliveryAddress", request.deliveryAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemList)) {
            query.put("ItemList", request.itemList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            query.put("LmItemId", request.lmItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderExpireTime)) {
            query.put("OrderExpireTime", request.orderExpireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeId)) {
            query.put("OutTradeId", request.outTradeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quantity)) {
            query.put("Quantity", request.quantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalAmount)) {
            query.put("TotalAmount", request.totalAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVirtualProductOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVirtualProductOrderResponse());
    }

    /**
     * @param request CreateVirtualProductOrderRequest
     * @return CreateVirtualProductOrderResponse
     */
    public CreateVirtualProductOrderResponse createVirtualProductOrder(CreateVirtualProductOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVirtualProductOrderWithOptions(request, runtime);
    }

    /**
     * @param request CreateWithholdTradeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWithholdTradeResponse
     */
    public CreateWithholdTradeResponse createWithholdTradeWithOptions(CreateWithholdTradeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agreementNo)) {
            body.put("AgreementNo", request.agreementNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerId)) {
            body.put("BuyerId", request.buyerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.goodsDetail)) {
            body.put("GoodsDetail", request.goodsDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantId)) {
            body.put("MerchantId", request.merchantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outRequestNo)) {
            body.put("OutRequestNo", request.outRequestNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeNo)) {
            body.put("OutTradeNo", request.outTradeNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settleMode)) {
            body.put("SettleMode", request.settleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            body.put("Subject", request.subject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalAmount)) {
            body.put("TotalAmount", request.totalAmount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWithholdTrade"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWithholdTradeResponse());
    }

    /**
     * @param request CreateWithholdTradeRequest
     * @return CreateWithholdTradeResponse
     */
    public CreateWithholdTradeResponse createWithholdTrade(CreateWithholdTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWithholdTradeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>扣减用户积分</p>
     * 
     * @param tmpReq DeductUserPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeductUserPointResponse
     */
    public DeductUserPointResponse deductUserPointWithOptions(DeductUserPointRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeductUserPointShrinkRequest request = new DeductUserPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("IdempotentId", request.idempotentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extInfoShrink)) {
            body.put("ExtInfo", request.extInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeductUserPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeductUserPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>扣减用户积分</p>
     * 
     * @param request DeductUserPointRequest
     * @return DeductUserPointResponse
     */
    public DeductUserPointResponse deductUserPoint(DeductUserPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deductUserPointWithOptions(request, runtime);
    }

    /**
     * @param request DeleteBizItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBizItemsResponse
     */
    public DeleteBizItemsResponse deleteBizItemsWithOptions(DeleteBizItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemIdList)) {
            query.put("ItemIdList", request.itemIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subBizId)) {
            query.put("SubBizId", request.subBizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBizItems"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBizItemsResponse());
    }

    /**
     * @param request DeleteBizItemsRequest
     * @return DeleteBizItemsResponse
     */
    public DeleteBizItemsResponse deleteBizItems(DeleteBizItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBizItemsWithOptions(request, runtime);
    }

    /**
     * @param request DeleteItemLimitRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteItemLimitRuleResponse
     */
    public DeleteItemLimitRuleResponse deleteItemLimitRuleWithOptions(DeleteItemLimitRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmActivityId)) {
            query.put("LmActivityId", request.lmActivityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            query.put("LmItemId", request.lmItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subBizCode)) {
            query.put("SubBizCode", request.subBizCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteItemLimitRule"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteItemLimitRuleResponse());
    }

    /**
     * @param request DeleteItemLimitRuleRequest
     * @return DeleteItemLimitRuleResponse
     */
    public DeleteItemLimitRuleResponse deleteItemLimitRule(DeleteItemLimitRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteItemLimitRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载佣金账单明细文件</p>
     * 
     * @param request DownloadCpsBillFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadCpsBillFileResponse
     */
    public DownloadCpsBillFileResponse downloadCpsBillFileWithOptions(DownloadCpsBillFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billId)) {
            body.put("BillId", request.billId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadCpsBillFile"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadCpsBillFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下载佣金账单明细文件</p>
     * 
     * @param request DownloadCpsBillFileRequest
     * @return DownloadCpsBillFileResponse
     */
    public DownloadCpsBillFileResponse downloadCpsBillFile(DownloadCpsBillFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadCpsBillFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载商品账单明细文件</p>
     * 
     * @param request DownloadItemBillFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadItemBillFileResponse
     */
    public DownloadItemBillFileResponse downloadItemBillFileWithOptions(DownloadItemBillFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billId)) {
            body.put("BillId", request.billId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadItemBillFile"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadItemBillFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下载商品账单明细文件</p>
     * 
     * @param request DownloadItemBillFileRequest
     * @return DownloadItemBillFileResponse
     */
    public DownloadItemBillFileResponse downloadItemBillFile(DownloadItemBillFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadItemBillFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载订单交易明细文件</p>
     * 
     * @param request DownloadOrderTransactionDetailFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadOrderTransactionDetailFileResponse
     */
    public DownloadOrderTransactionDetailFileResponse downloadOrderTransactionDetailFileWithOptions(DownloadOrderTransactionDetailFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            body.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadOrderTransactionDetailFile"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadOrderTransactionDetailFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下载订单交易明细文件</p>
     * 
     * @param request DownloadOrderTransactionDetailFileRequest
     * @return DownloadOrderTransactionDetailFileResponse
     */
    public DownloadOrderTransactionDetailFileResponse downloadOrderTransactionDetailFile(DownloadOrderTransactionDetailFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadOrderTransactionDetailFileWithOptions(request, runtime);
    }

    /**
     * @param request EnableOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableOrderResponse
     */
    public EnableOrderResponse enableOrderWithOptions(EnableOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmOrderId)) {
            query.put("LmOrderId", request.lmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeId)) {
            query.put("OutTradeId", request.outTradeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableOrderResponse());
    }

    /**
     * @param request EnableOrderRequest
     * @return EnableOrderResponse
     */
    public EnableOrderResponse enableOrder(EnableOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableOrderWithOptions(request, runtime);
    }

    /**
     * @param request EnableOrderWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableOrderWithDesignatedTbUidResponse
     */
    public EnableOrderWithDesignatedTbUidResponse enableOrderWithDesignatedTbUidWithOptions(EnableOrderWithDesignatedTbUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmOrderId)) {
            body.put("LmOrderId", request.lmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableOrderWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableOrderWithDesignatedTbUidResponse());
    }

    /**
     * @param request EnableOrderWithDesignatedTbUidRequest
     * @return EnableOrderWithDesignatedTbUidResponse
     */
    public EnableOrderWithDesignatedTbUidResponse enableOrderWithDesignatedTbUid(EnableOrderWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableOrderWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * @param request ExecuteNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteNodeResponse
     */
    public ExecuteNodeResponse executeNodeWithOptions(ExecuteNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeInstanceId)) {
            query.put("NodeInstanceId", request.nodeInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processId)) {
            query.put("ProcessId", request.processId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processInstanceId)) {
            query.put("ProcessInstanceId", request.processInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestData)) {
            query.put("RequestData", request.requestData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteNode"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteNodeResponse());
    }

    /**
     * @param request ExecuteNodeRequest
     * @return ExecuteNodeResponse
     */
    public ExecuteNodeResponse executeNode(ExecuteNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>冻结用户积分</p>
     * 
     * @param tmpReq FreezeUserPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FreezeUserPointResponse
     */
    public FreezeUserPointResponse freezeUserPointWithOptions(FreezeUserPointRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FreezeUserPointShrinkRequest request = new FreezeUserPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("IdempotentId", request.idempotentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extInfoShrink)) {
            body.put("ExtInfo", request.extInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FreezeUserPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FreezeUserPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>冻结用户积分</p>
     * 
     * @param request FreezeUserPointRequest
     * @return FreezeUserPointResponse
     */
    public FreezeUserPointResponse freezeUserPoint(FreezeUserPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.freezeUserPointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取活动玩法信息</p>
     * 
     * @param tmpReq GetActivityGameInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetActivityGameInfoResponse
     */
    public GetActivityGameInfoResponse getActivityGameInfoWithOptions(GetActivityGameInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetActivityGameInfoShrinkRequest request = new GetActivityGameInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gameId)) {
            query.put("GameId", request.gameId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extInfoShrink)) {
            body.put("ExtInfo", request.extInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetActivityGameInfo"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetActivityGameInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取活动玩法信息</p>
     * 
     * @param request GetActivityGameInfoRequest
     * @return GetActivityGameInfoResponse
     */
    public GetActivityGameInfoResponse getActivityGameInfo(GetActivityGameInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getActivityGameInfoWithOptions(request, runtime);
    }

    /**
     * @param request GetCategoryChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCategoryChainResponse
     */
    public GetCategoryChainResponse getCategoryChainWithOptions(GetCategoryChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            query.put("LmItemId", request.lmItemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCategoryChain"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCategoryChainResponse());
    }

    /**
     * @param request GetCategoryChainRequest
     * @return GetCategoryChainResponse
     */
    public GetCategoryChainResponse getCategoryChain(GetCategoryChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCategoryChainWithOptions(request, runtime);
    }

    /**
     * @param request GetCategoryListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCategoryListResponse
     */
    public GetCategoryListResponse getCategoryListWithOptions(GetCategoryListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCategoryList"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCategoryListResponse());
    }

    /**
     * @param request GetCategoryListRequest
     * @return GetCategoryListResponse
     */
    public GetCategoryListResponse getCategoryList(GetCategoryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCategoryListWithOptions(request, runtime);
    }

    /**
     * @param request GetCustomServiceUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomServiceUrlResponse
     */
    public GetCustomServiceUrlResponse getCustomServiceUrlWithOptions(GetCustomServiceUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cuid)) {
            query.put("Cuid", request.cuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nick)) {
            query.put("Nick", request.nick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerId)) {
            query.put("SellerId", request.sellerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomServiceUrl"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomServiceUrlResponse());
    }

    /**
     * @param request GetCustomServiceUrlRequest
     * @return GetCustomServiceUrlResponse
     */
    public GetCustomServiceUrlResponse getCustomServiceUrl(GetCustomServiceUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomServiceUrlWithOptions(request, runtime);
    }

    /**
     * @param request GetGuidePageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGuidePageResponse
     */
    public GetGuidePageResponse getGuidePageWithOptions(GetGuidePageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGuidePage"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGuidePageResponse());
    }

    /**
     * @param request GetGuidePageRequest
     * @return GetGuidePageResponse
     */
    public GetGuidePageResponse getGuidePage(GetGuidePageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGuidePageWithOptions(request, runtime);
    }

    /**
     * @param request GetItemPromotionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetItemPromotionResponse
     */
    public GetItemPromotionResponse getItemPromotionWithOptions(GetItemPromotionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            query.put("LmItemId", request.lmItemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetItemPromotion"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetItemPromotionResponse());
    }

    /**
     * @param request GetItemPromotionRequest
     * @return GetItemPromotionResponse
     */
    public GetItemPromotionResponse getItemPromotion(GetItemPromotionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getItemPromotionWithOptions(request, runtime);
    }

    /**
     * @param request GetLoginPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLoginPageResponse
     */
    public GetLoginPageResponse getLoginPageWithOptions(GetLoginPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.failUrl)) {
            body.put("FailUrl", request.failUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUrl)) {
            body.put("TargetUrl", request.targetUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLoginPage"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLoginPageResponse());
    }

    /**
     * @param request GetLoginPageRequest
     * @return GetLoginPageResponse
     */
    public GetLoginPageResponse getLoginPage(GetLoginPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLoginPageWithOptions(request, runtime);
    }

    /**
     * @param request GetSwitchUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSwitchUrlResponse
     */
    public GetSwitchUrlResponse getSwitchUrlWithOptions(GetSwitchUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSwitchUrl"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSwitchUrlResponse());
    }

    /**
     * @param request GetSwitchUrlRequest
     * @return GetSwitchUrlResponse
     */
    public GetSwitchUrlResponse getSwitchUrl(GetSwitchUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSwitchUrlWithOptions(request, runtime);
    }

    /**
     * @param request GetUserInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserInfoResponse
     */
    public GetUserInfoResponse getUserInfoWithOptions(GetUserInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userFlag)) {
            query.put("UserFlag", request.userFlag);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queryJson)) {
            body.put("QueryJson", request.queryJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserInfo"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserInfoResponse());
    }

    /**
     * @param request GetUserInfoRequest
     * @return GetUserInfoResponse
     */
    public GetUserInfoResponse getUserInfo(GetUserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取种用户登录态cookie的页面</p>
     * 
     * @param request GetUserTokenPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserTokenPageResponse
     */
    public GetUserTokenPageResponse getUserTokenPageWithOptions(GetUserTokenPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserTokenPage"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserTokenPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取种用户登录态cookie的页面</p>
     * 
     * @param request GetUserTokenPageRequest
     * @return GetUserTokenPageResponse
     */
    public GetUserTokenPageResponse getUserTokenPage(GetUserTokenPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserTokenPageWithOptions(request, runtime);
    }

    /**
     * @param request GetWithholdSignPageUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWithholdSignPageUrlResponse
     */
    public GetWithholdSignPageUrlResponse getWithholdSignPageUrlWithOptions(GetWithholdSignPageUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalAgreementNo)) {
            body.put("ExternalAgreementNo", request.externalAgreementNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityParameters)) {
            body.put("IdentityParameters", request.identityParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantId)) {
            body.put("MerchantId", request.merchantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantServiceDescription)) {
            body.put("MerchantServiceDescription", request.merchantServiceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantServiceName)) {
            body.put("MerchantServiceName", request.merchantServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyUrl)) {
            body.put("NotifyUrl", request.notifyUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outRequestNo)) {
            body.put("OutRequestNo", request.outRequestNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnUrl)) {
            body.put("ReturnUrl", request.returnUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWithholdSignPageUrl"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWithholdSignPageUrlResponse());
    }

    /**
     * @param request GetWithholdSignPageUrlRequest
     * @return GetWithholdSignPageUrlResponse
     */
    public GetWithholdSignPageUrlResponse getWithholdSignPageUrl(GetWithholdSignPageUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWithholdSignPageUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>用户间赠送积分</p>
     * 
     * @param tmpReq GiveUserPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GiveUserPointResponse
     */
    public GiveUserPointResponse giveUserPointWithOptions(GiveUserPointRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GiveUserPointShrinkRequest request = new GiveUserPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("IdempotentId", request.idempotentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetBizUid)) {
            query.put("TargetBizUid", request.targetBizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extInfoShrink)) {
            body.put("ExtInfo", request.extInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GiveUserPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GiveUserPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>用户间赠送积分</p>
     * 
     * @param request GiveUserPointRequest
     * @return GiveUserPointResponse
     */
    public GiveUserPointResponse giveUserPoint(GiveUserPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.giveUserPointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>给用户发放优惠权益</p>
     * 
     * @param tmpReq GrantPromotionToUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantPromotionToUserResponse
     */
    public GrantPromotionToUserResponse grantPromotionToUserWithOptions(GrantPromotionToUserRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GrantPromotionToUserShrinkRequest request = new GrantPromotionToUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireSeconds)) {
            query.put("ExpireSeconds", request.expireSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantMode)) {
            query.put("GrantMode", request.grantMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantWay)) {
            query.put("GrantWay", request.grantWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("IdempotentId", request.idempotentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityCode)) {
            query.put("SecurityCode", request.securityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantPromotionToUser"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantPromotionToUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>给用户发放优惠权益</p>
     * 
     * @param request GrantPromotionToUserRequest
     * @return GrantPromotionToUserResponse
     */
    public GrantPromotionToUserResponse grantPromotionToUser(GrantPromotionToUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantPromotionToUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发放用户积分</p>
     * 
     * @param tmpReq GrantUserPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantUserPointResponse
     */
    public GrantUserPointResponse grantUserPointWithOptions(GrantUserPointRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GrantUserPointShrinkRequest request = new GrantUserPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("IdempotentId", request.idempotentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extInfoShrink)) {
            body.put("ExtInfo", request.extInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantUserPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantUserPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发放用户积分</p>
     * 
     * @param request GrantUserPointRequest
     * @return GrantUserPointResponse
     */
    public GrantUserPointResponse grantUserPoint(GrantUserPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantUserPointWithOptions(request, runtime);
    }

    /**
     * @param request InitApplyRefundRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitApplyRefundResponse
     */
    public InitApplyRefundResponse initApplyRefundWithOptions(InitApplyRefundRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizClaimType)) {
            query.put("BizClaimType", request.bizClaimType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.goodsStatus)) {
            query.put("GoodsStatus", request.goodsStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subLmOrderId)) {
            query.put("SubLmOrderId", request.subLmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitApplyRefund"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitApplyRefundResponse());
    }

    /**
     * @param request InitApplyRefundRequest
     * @return InitApplyRefundResponse
     */
    public InitApplyRefundResponse initApplyRefund(InitApplyRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initApplyRefundWithOptions(request, runtime);
    }

    /**
     * @param request InitApplyRefundWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitApplyRefundWithDesignatedTbUidResponse
     */
    public InitApplyRefundWithDesignatedTbUidResponse initApplyRefundWithDesignatedTbUidWithOptions(InitApplyRefundWithDesignatedTbUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disputeId)) {
            body.put("DisputeId", request.disputeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundCode)) {
            body.put("RefundCode", request.refundCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subLmOrderId)) {
            body.put("SubLmOrderId", request.subLmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitApplyRefundWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitApplyRefundWithDesignatedTbUidResponse());
    }

    /**
     * @param request InitApplyRefundWithDesignatedTbUidRequest
     * @return InitApplyRefundWithDesignatedTbUidResponse
     */
    public InitApplyRefundWithDesignatedTbUidResponse initApplyRefundWithDesignatedTbUid(InitApplyRefundWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initApplyRefundWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>初始化修改申请方案</p>
     * 
     * @param request InitModifyRefundRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitModifyRefundResponse
     */
    public InitModifyRefundResponse initModifyRefundWithOptions(InitModifyRefundRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizClaimType)) {
            query.put("BizClaimType", request.bizClaimType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disputeId)) {
            query.put("DisputeId", request.disputeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.goodsStatus)) {
            query.put("GoodsStatus", request.goodsStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subLmOrderId)) {
            query.put("SubLmOrderId", request.subLmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitModifyRefund"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitModifyRefundResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>初始化修改申请方案</p>
     * 
     * @param request InitModifyRefundRequest
     * @return InitModifyRefundResponse
     */
    public InitModifyRefundResponse initModifyRefund(InitModifyRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initModifyRefundWithOptions(request, runtime);
    }

    /**
     * @param request InitModifyRefundWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitModifyRefundWithDesignatedTbUidResponse
     */
    public InitModifyRefundWithDesignatedTbUidResponse initModifyRefundWithDesignatedTbUidWithOptions(InitModifyRefundWithDesignatedTbUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disputeId)) {
            body.put("DisputeId", request.disputeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundCode)) {
            body.put("RefundCode", request.refundCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subLmOrderId)) {
            body.put("SubLmOrderId", request.subLmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitModifyRefundWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitModifyRefundWithDesignatedTbUidResponse());
    }

    /**
     * @param request InitModifyRefundWithDesignatedTbUidRequest
     * @return InitModifyRefundWithDesignatedTbUidResponse
     */
    public InitModifyRefundWithDesignatedTbUidResponse initModifyRefundWithDesignatedTbUid(InitModifyRefundWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initModifyRefundWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询玩法氛围数据</p>
     * 
     * @param request ListActivityAtmosphereRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListActivityAtmosphereResponse
     */
    public ListActivityAtmosphereResponse listActivityAtmosphereWithOptions(ListActivityAtmosphereRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListActivityAtmosphere"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListActivityAtmosphereResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询玩法氛围数据</p>
     * 
     * @param request ListActivityAtmosphereRequest
     * @return ListActivityAtmosphereResponse
     */
    public ListActivityAtmosphereResponse listActivityAtmosphere(ListActivityAtmosphereRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listActivityAtmosphereWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询玩法信息列表</p>
     * 
     * @param request ListActivityGameInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListActivityGameInfoResponse
     */
    public ListActivityGameInfoResponse listActivityGameInfoWithOptions(ListActivityGameInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListActivityGameInfo"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListActivityGameInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询玩法信息列表</p>
     * 
     * @param request ListActivityGameInfoRequest
     * @return ListActivityGameInfoResponse
     */
    public ListActivityGameInfoResponse listActivityGameInfo(ListActivityGameInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listActivityGameInfoWithOptions(request, runtime);
    }

    /**
     * @param tmpReq ListItemActivitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListItemActivitiesResponse
     */
    public ListItemActivitiesResponse listItemActivitiesWithOptions(ListItemActivitiesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListItemActivitiesShrinkRequest request = new ListItemActivitiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemIdsShrink)) {
            query.put("ItemIds", request.itemIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemIdsShrink)) {
            query.put("LmItemIds", request.lmItemIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListItemActivities"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListItemActivitiesResponse());
    }

    /**
     * @param request ListItemActivitiesRequest
     * @return ListItemActivitiesResponse
     */
    public ListItemActivitiesResponse listItemActivities(ListItemActivitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listItemActivitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户的玩法进度列表</p>
     * 
     * @param request ListUserGameProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserGameProcessResponse
     */
    public ListUserGameProcessResponse listUserGameProcessWithOptions(ListUserGameProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserGameProcess"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGameProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户的玩法进度列表</p>
     * 
     * @param request ListUserGameProcessRequest
     * @return ListUserGameProcessResponse
     */
    public ListUserGameProcessResponse listUserGameProcess(ListUserGameProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGameProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户积分记录列表</p>
     * 
     * @param request ListUserPointRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserPointRecordsResponse
     */
    public ListUserPointRecordsResponse listUserPointRecordsWithOptions(ListUserPointRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserPointRecords"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserPointRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户积分记录列表</p>
     * 
     * @param request ListUserPointRecordsRequest
     * @return ListUserPointRecordsResponse
     */
    public ListUserPointRecordsResponse listUserPointRecords(ListUserPointRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserPointRecordsWithOptions(request, runtime);
    }

    /**
     * @param request ModifyBasicAndBizItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBasicAndBizItemsResponse
     */
    public ModifyBasicAndBizItemsResponse modifyBasicAndBizItemsWithOptions(ModifyBasicAndBizItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subBizId)) {
            query.put("SubBizId", request.subBizId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemList)) {
            body.put("ItemList", request.itemList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBasicAndBizItems"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBasicAndBizItemsResponse());
    }

    /**
     * @param request ModifyBasicAndBizItemsRequest
     * @return ModifyBasicAndBizItemsResponse
     */
    public ModifyBasicAndBizItemsResponse modifyBasicAndBizItems(ModifyBasicAndBizItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBasicAndBizItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改基础库商品供货价</p>
     * 
     * @param request ModifyBasicItemSupplierPriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBasicItemSupplierPriceResponse
     */
    public ModifyBasicItemSupplierPriceResponse modifyBasicItemSupplierPriceWithOptions(ModifyBasicItemSupplierPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            query.put("LmItemId", request.lmItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmShopId)) {
            query.put("LmShopId", request.lmShopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skuId)) {
            query.put("SkuId", request.skuId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierPrice)) {
            query.put("SupplierPrice", request.supplierPrice);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBasicItemSupplierPrice"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBasicItemSupplierPriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改基础库商品供货价</p>
     * 
     * @param request ModifyBasicItemSupplierPriceRequest
     * @return ModifyBasicItemSupplierPriceResponse
     */
    public ModifyBasicItemSupplierPriceResponse modifyBasicItemSupplierPrice(ModifyBasicItemSupplierPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBasicItemSupplierPriceWithOptions(request, runtime);
    }

    /**
     * @param request ModifyBizItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBizItemsResponse
     */
    public ModifyBizItemsResponse modifyBizItemsWithOptions(ModifyBizItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subBizId)) {
            query.put("SubBizId", request.subBizId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemList)) {
            body.put("ItemList", request.itemList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBizItems"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBizItemsResponse());
    }

    /**
     * @param request ModifyBizItemsRequest
     * @return ModifyBizItemsResponse
     */
    public ModifyBizItemsResponse modifyBizItems(ModifyBizItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBizItemsWithOptions(request, runtime);
    }

    /**
     * @param request ModifyItemLimitRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyItemLimitRuleResponse
     */
    public ModifyItemLimitRuleResponse modifyItemLimitRuleWithOptions(ModifyItemLimitRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmActivityId)) {
            query.put("LmActivityId", request.lmActivityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            query.put("LmItemId", request.lmItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subBizCode)) {
            query.put("SubBizCode", request.subBizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upperNum)) {
            query.put("UpperNum", request.upperNum);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyItemLimitRule"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyItemLimitRuleResponse());
    }

    /**
     * @param request ModifyItemLimitRuleRequest
     * @return ModifyItemLimitRuleResponse
     */
    public ModifyItemLimitRuleResponse modifyItemLimitRule(ModifyItemLimitRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyItemLimitRuleWithOptions(request, runtime);
    }

    /**
     * @param request ModifyOrderDeliveryAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyOrderDeliveryAddressResponse
     */
    public ModifyOrderDeliveryAddressResponse modifyOrderDeliveryAddressWithOptions(ModifyOrderDeliveryAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryAddress)) {
            query.put("DeliveryAddress", request.deliveryAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmOrderId)) {
            query.put("LmOrderId", request.lmOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOrderDeliveryAddress"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOrderDeliveryAddressResponse());
    }

    /**
     * @param request ModifyOrderDeliveryAddressRequest
     * @return ModifyOrderDeliveryAddressResponse
     */
    public ModifyOrderDeliveryAddressResponse modifyOrderDeliveryAddress(ModifyOrderDeliveryAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyOrderDeliveryAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改申请</p>
     * 
     * @param request ModifyRefundRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRefundResponse
     */
    public ModifyRefundResponse modifyRefundWithOptions(ModifyRefundRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyReasonTextId)) {
            query.put("ApplyReasonTextId", request.applyReasonTextId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyRefundCount)) {
            query.put("ApplyRefundCount", request.applyRefundCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyRefundFee)) {
            query.put("ApplyRefundFee", request.applyRefundFee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizClaimType)) {
            query.put("BizClaimType", request.bizClaimType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disputeId)) {
            query.put("DisputeId", request.disputeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.goodsStatus)) {
            query.put("GoodsStatus", request.goodsStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subLmOrderId)) {
            query.put("SubLmOrderId", request.subLmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.leaveMessage)) {
            body.put("LeaveMessage", request.leaveMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.leavePictureList)) {
            body.put("LeavePictureList", request.leavePictureList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRefund"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRefundResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改申请</p>
     * 
     * @param request ModifyRefundRequest
     * @return ModifyRefundResponse
     */
    public ModifyRefundResponse modifyRefund(ModifyRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRefundWithOptions(request, runtime);
    }

    /**
     * @param tmpReq ModifyRefundWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRefundWithDesignatedTbUidResponse
     */
    public ModifyRefundWithDesignatedTbUidResponse modifyRefundWithDesignatedTbUidWithOptions(ModifyRefundWithDesignatedTbUidRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyRefundWithDesignatedTbUidShrinkRequest request = new ModifyRefundWithDesignatedTbUidShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.proofs)) {
            request.proofsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.proofs, "Proofs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disputeId)) {
            body.put("DisputeId", request.disputeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.goodsStatus)) {
            body.put("GoodsStatus", request.goodsStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            body.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proofsShrink)) {
            body.put("Proofs", request.proofsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reasonId)) {
            body.put("ReasonId", request.reasonId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundCode)) {
            body.put("RefundCode", request.refundCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundCount)) {
            body.put("RefundCount", request.refundCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundFee)) {
            body.put("RefundFee", request.refundFee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subLmOrderId)) {
            body.put("SubLmOrderId", request.subLmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRefundWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRefundWithDesignatedTbUidResponse());
    }

    /**
     * @param request ModifyRefundWithDesignatedTbUidRequest
     * @return ModifyRefundWithDesignatedTbUidResponse
     */
    public ModifyRefundWithDesignatedTbUidResponse modifyRefundWithDesignatedTbUid(ModifyRefundWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRefundWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改结算账号</p>
     * 
     * @param request ModifySettleAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySettleAccountResponse
     */
    public ModifySettleAccountResponse modifySettleAccountWithOptions(ModifySettleAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountChannel)) {
            body.put("AccountChannel", request.accountChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPayType)) {
            body.put("AccountPayType", request.accountPayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            body.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryOrAreaCode)) {
            body.put("CountryOrAreaCode", request.countryOrAreaCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currency)) {
            body.put("Currency", request.currency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            body.put("IdempotentId", request.idempotentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySettleAccount"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySettleAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改结算账号</p>
     * 
     * @param request ModifySettleAccountRequest
     * @return ModifySettleAccountResponse
     */
    public ModifySettleAccountResponse modifySettleAccount(ModifySettleAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySettleAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改商品供货价和渠道售价</p>
     * 
     * @param request ModifySupplierPriceAndPriceCentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySupplierPriceAndPriceCentResponse
     */
    public ModifySupplierPriceAndPriceCentResponse modifySupplierPriceAndPriceCentWithOptions(ModifySupplierPriceAndPriceCentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            query.put("LmItemId", request.lmItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmShopId)) {
            query.put("LmShopId", request.lmShopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priceCent)) {
            query.put("PriceCent", request.priceCent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skuId)) {
            query.put("SkuId", request.skuId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierPrice)) {
            query.put("SupplierPrice", request.supplierPrice);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySupplierPriceAndPriceCent"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySupplierPriceAndPriceCentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改商品供货价和渠道售价</p>
     * 
     * @param request ModifySupplierPriceAndPriceCentRequest
     * @return ModifySupplierPriceAndPriceCentResponse
     */
    public ModifySupplierPriceAndPriceCentResponse modifySupplierPriceAndPriceCent(ModifySupplierPriceAndPriceCentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySupplierPriceAndPriceCentWithOptions(request, runtime);
    }

    /**
     * @param request OpenRealTbAccountSupportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenRealTbAccountSupportResponse
     */
    public OpenRealTbAccountSupportResponse openRealTbAccountSupportWithOptions(OpenRealTbAccountSupportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenRealTbAccountSupport"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenRealTbAccountSupportResponse());
    }

    /**
     * @param request OpenRealTbAccountSupportRequest
     * @return OpenRealTbAccountSupportResponse
     */
    public OpenRealTbAccountSupportResponse openRealTbAccountSupport(OpenRealTbAccountSupportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openRealTbAccountSupportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推进用户游戏进度（活动玩法）</p>
     * 
     * @param tmpReq PushUserGameProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushUserGameProcessResponse
     */
    public PushUserGameProcessResponse pushUserGameProcessWithOptions(PushUserGameProcessRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushUserGameProcessShrinkRequest request = new PushUserGameProcessShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentStepId)) {
            query.put("CurrentStepId", request.currentStepId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processId)) {
            query.put("ProcessId", request.processId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extInfoShrink)) {
            body.put("ExtInfo", request.extInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushUserGameProcess"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushUserGameProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>推进用户游戏进度（活动玩法）</p>
     * 
     * @param request PushUserGameProcessRequest
     * @return PushUserGameProcessResponse
     */
    public PushUserGameProcessResponse pushUserGameProcess(PushUserGameProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushUserGameProcessWithOptions(request, runtime);
    }

    /**
     * @param request QueryActivityItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryActivityItemsResponse
     */
    public QueryActivityItemsResponse queryActivityItemsWithOptions(QueryActivityItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmActivityId)) {
            query.put("LmActivityId", request.lmActivityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryActivityItems"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryActivityItemsResponse());
    }

    /**
     * @param request QueryActivityItemsRequest
     * @return QueryActivityItemsResponse
     */
    public QueryActivityItemsResponse queryActivityItems(QueryActivityItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryActivityItemsWithOptions(request, runtime);
    }

    /**
     * @param request QueryAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAddressResponse
     */
    public QueryAddressResponse queryAddressWithOptions(QueryAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.divisionCode)) {
            query.put("DivisionCode", request.divisionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAddress"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAddressResponse());
    }

    /**
     * @param request QueryAddressRequest
     * @return QueryAddressResponse
     */
    public QueryAddressResponse queryAddress(QueryAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAddressWithOptions(request, runtime);
    }

    /**
     * @param request QueryAddressDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAddressDetailResponse
     */
    public QueryAddressDetailResponse queryAddressDetailWithOptions(QueryAddressDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressInfo)) {
            query.put("AddressInfo", request.addressInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAddressDetail"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAddressDetailResponse());
    }

    /**
     * @param request QueryAddressDetailRequest
     * @return QueryAddressDetailResponse
     */
    public QueryAddressDetailResponse queryAddressDetail(QueryAddressDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAddressDetailWithOptions(request, runtime);
    }

    /**
     * @param request QueryAddressListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAddressListResponse
     */
    public QueryAddressListResponse queryAddressListWithOptions(QueryAddressListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAddressList"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAddressListResponse());
    }

    /**
     * @param request QueryAddressListRequest
     * @return QueryAddressListResponse
     */
    public QueryAddressListResponse queryAddressList(QueryAddressListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAddressListWithOptions(request, runtime);
    }

    /**
     * @param request QueryAdvertisementSettleInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAdvertisementSettleInfoResponse
     */
    public QueryAdvertisementSettleInfoResponse queryAdvertisementSettleInfoWithOptions(QueryAdvertisementSettleInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            query.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaSettleDetailId)) {
            query.put("MediaSettleDetailId", request.mediaSettleDetailId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settleNo)) {
            query.put("SettleNo", request.settleNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAdvertisementSettleInfo"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAdvertisementSettleInfoResponse());
    }

    /**
     * @param request QueryAdvertisementSettleInfoRequest
     * @return QueryAdvertisementSettleInfoResponse
     */
    public QueryAdvertisementSettleInfoResponse queryAdvertisementSettleInfo(QueryAdvertisementSettleInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAdvertisementSettleInfoWithOptions(request, runtime);
    }

    /**
     * @param request QueryAgreementRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAgreementResponse
     */
    public QueryAgreementResponse queryAgreementWithOptions(QueryAgreementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agreementNo)) {
            body.put("AgreementNo", request.agreementNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalAgreementNo)) {
            body.put("ExternalAgreementNo", request.externalAgreementNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantId)) {
            body.put("MerchantId", request.merchantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAgreement"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAgreementResponse());
    }

    /**
     * @param request QueryAgreementRequest
     * @return QueryAgreementResponse
     */
    public QueryAgreementResponse queryAgreement(QueryAgreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAgreementWithOptions(request, runtime);
    }

    /**
     * @param request QueryAllCinemasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAllCinemasResponse
     */
    public QueryAllCinemasResponse queryAllCinemasWithOptions(QueryAllCinemasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            query.put("CityCode", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAllCinemas"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAllCinemasResponse());
    }

    /**
     * @param request QueryAllCinemasRequest
     * @return QueryAllCinemasResponse
     */
    public QueryAllCinemasResponse queryAllCinemas(QueryAllCinemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAllCinemasWithOptions(request, runtime);
    }

    /**
     * @param tmpReq QueryAllCitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAllCitiesResponse
     */
    public QueryAllCitiesResponse queryAllCitiesWithOptions(QueryAllCitiesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryAllCitiesShrinkRequest request = new QueryAllCitiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extJson)) {
            request.extJsonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extJson, "ExtJson", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJsonShrink)) {
            query.put("ExtJson", request.extJsonShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAllCities"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAllCitiesResponse());
    }

    /**
     * @param request QueryAllCitiesRequest
     * @return QueryAllCitiesResponse
     */
    public QueryAllCitiesResponse queryAllCities(QueryAllCitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAllCitiesWithOptions(request, runtime);
    }

    /**
     * @param request QueryBatchRegistAnonymousTbAccountResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBatchRegistAnonymousTbAccountResultResponse
     */
    public QueryBatchRegistAnonymousTbAccountResultResponse queryBatchRegistAnonymousTbAccountResultWithOptions(QueryBatchRegistAnonymousTbAccountResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            query.put("BatchId", request.batchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBatchRegistAnonymousTbAccountResult"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBatchRegistAnonymousTbAccountResultResponse());
    }

    /**
     * @param request QueryBatchRegistAnonymousTbAccountResultRequest
     * @return QueryBatchRegistAnonymousTbAccountResultResponse
     */
    public QueryBatchRegistAnonymousTbAccountResultResponse queryBatchRegistAnonymousTbAccountResult(QueryBatchRegistAnonymousTbAccountResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBatchRegistAnonymousTbAccountResultWithOptions(request, runtime);
    }

    /**
     * @param tmpReq QueryBestSession4ItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBestSession4ItemsResponse
     */
    public QueryBestSession4ItemsResponse queryBestSession4ItemsWithOptions(QueryBestSession4ItemsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryBestSession4ItemsShrinkRequest request = new QueryBestSession4ItemsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemIdsShrink)) {
            query.put("ItemIds", request.itemIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemIdsShrink)) {
            query.put("LmItemIds", request.lmItemIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBestSession4Items"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBestSession4ItemsResponse());
    }

    /**
     * @param request QueryBestSession4ItemsRequest
     * @return QueryBestSession4ItemsResponse
     */
    public QueryBestSession4ItemsResponse queryBestSession4Items(QueryBestSession4ItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBestSession4ItemsWithOptions(request, runtime);
    }

    /**
     * @param tmpReq QueryBizItemListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBizItemListResponse
     */
    public QueryBizItemListResponse queryBizItemListWithOptions(QueryBizItemListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryBizItemListShrinkRequest request = new QueryBizItemListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemIdsShrink)) {
            query.put("ItemIds", request.itemIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemIdsShrink)) {
            query.put("LmItemIds", request.lmItemIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subBizId)) {
            query.put("SubBizId", request.subBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBizItemList"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBizItemListResponse());
    }

    /**
     * @param request QueryBizItemListRequest
     * @return QueryBizItemListResponse
     */
    public QueryBizItemListResponse queryBizItemList(QueryBizItemListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBizItemListWithOptions(request, runtime);
    }

    /**
     * @param tmpReq QueryBizItemListV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBizItemListV2Response
     */
    public QueryBizItemListV2Response queryBizItemListV2WithOptions(QueryBizItemListV2Request tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryBizItemListV2ShrinkRequest request = new QueryBizItemListV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemIdsShrink)) {
            query.put("ItemIds", request.itemIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemIdsShrink)) {
            query.put("LmItemIds", request.lmItemIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subBizId)) {
            query.put("SubBizId", request.subBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBizItemListV2"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBizItemListV2Response());
    }

    /**
     * @param request QueryBizItemListV2Request
     * @return QueryBizItemListV2Response
     */
    public QueryBizItemListV2Response queryBizItemListV2(QueryBizItemListV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBizItemListV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询商品库商品信息，支持C端导购场景，有30分钟缓存</p>
     * 
     * @param tmpReq QueryBizItemListWithCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBizItemListWithCacheResponse
     */
    public QueryBizItemListWithCacheResponse queryBizItemListWithCacheWithOptions(QueryBizItemListWithCacheRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryBizItemListWithCacheShrinkRequest request = new QueryBizItemListWithCacheShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBizItemListWithCache"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBizItemListWithCacheResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询商品库商品信息，支持C端导购场景，有30分钟缓存</p>
     * 
     * @param request QueryBizItemListWithCacheRequest
     * @return QueryBizItemListWithCacheResponse
     */
    public QueryBizItemListWithCacheResponse queryBizItemListWithCache(QueryBizItemListWithCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBizItemListWithCacheWithOptions(request, runtime);
    }

    /**
     * @param request QueryBizItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBizItemsResponse
     */
    public QueryBizItemsResponse queryBizItemsWithOptions(QueryBizItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subBizId)) {
            query.put("SubBizId", request.subBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBizItems"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBizItemsResponse());
    }

    /**
     * @param request QueryBizItemsRequest
     * @return QueryBizItemsResponse
     */
    public QueryBizItemsResponse queryBizItems(QueryBizItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBizItemsWithOptions(request, runtime);
    }

    /**
     * @param tmpReq QueryBizItemsWithActivityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBizItemsWithActivityResponse
     */
    public QueryBizItemsWithActivityResponse queryBizItemsWithActivityWithOptions(QueryBizItemsWithActivityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryBizItemsWithActivityShrinkRequest request = new QueryBizItemsWithActivityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBizItemsWithActivity"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBizItemsWithActivityResponse());
    }

    /**
     * @param request QueryBizItemsWithActivityRequest
     * @return QueryBizItemsWithActivityResponse
     */
    public QueryBizItemsWithActivityResponse queryBizItemsWithActivity(QueryBizItemsWithActivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBizItemsWithActivityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询采购商品信息</p>
     * 
     * @param request QueryBudgetTicketItemListByBizIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBudgetTicketItemListByBizIdResponse
     */
    public QueryBudgetTicketItemListByBizIdResponse queryBudgetTicketItemListByBizIdWithOptions(QueryBudgetTicketItemListByBizIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.budgetTicketNo)) {
            query.put("BudgetTicketNo", request.budgetTicketNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBudgetTicketItemListByBizId"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBudgetTicketItemListByBizIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询采购商品信息</p>
     * 
     * @param request QueryBudgetTicketItemListByBizIdRequest
     * @return QueryBudgetTicketItemListByBizIdResponse
     */
    public QueryBudgetTicketItemListByBizIdResponse queryBudgetTicketItemListByBizId(QueryBudgetTicketItemListByBizIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBudgetTicketItemListByBizIdWithOptions(request, runtime);
    }

    /**
     * @param request QueryChannelItemBillDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryChannelItemBillDownloadUrlResponse
     */
    public QueryChannelItemBillDownloadUrlResponse queryChannelItemBillDownloadUrlWithOptions(QueryChannelItemBillDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billId)) {
            body.put("BillId", request.billId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billPeriod)) {
            body.put("BillPeriod", request.billPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billStatus)) {
            body.put("BillStatus", request.billStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmShopId)) {
            body.put("LmShopId", request.lmShopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmShopName)) {
            body.put("LmShopName", request.lmShopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryChannelItemBillDownloadUrl"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryChannelItemBillDownloadUrlResponse());
    }

    /**
     * @param request QueryChannelItemBillDownloadUrlRequest
     * @return QueryChannelItemBillDownloadUrlResponse
     */
    public QueryChannelItemBillDownloadUrlResponse queryChannelItemBillDownloadUrl(QueryChannelItemBillDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryChannelItemBillDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询导购商品组</p>
     * 
     * @param request QueryGuideItemGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGuideItemGroupResponse
     */
    public QueryGuideItemGroupResponse queryGuideItemGroupWithOptions(QueryGuideItemGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemState)) {
            query.put("ItemState", request.itemState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGuideItemGroup"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGuideItemGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询导购商品组</p>
     * 
     * @param request QueryGuideItemGroupRequest
     * @return QueryGuideItemGroupResponse
     */
    public QueryGuideItemGroupResponse queryGuideItemGroup(QueryGuideItemGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGuideItemGroupWithOptions(request, runtime);
    }

    /**
     * @param request QueryGuideItemGroupForCrowdOperationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGuideItemGroupForCrowdOperationResponse
     */
    public QueryGuideItemGroupForCrowdOperationResponse queryGuideItemGroupForCrowdOperationWithOptions(QueryGuideItemGroupForCrowdOperationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemState)) {
            query.put("ItemState", request.itemState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userFlag)) {
            query.put("UserFlag", request.userFlag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGuideItemGroupForCrowdOperation"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGuideItemGroupForCrowdOperationResponse());
    }

    /**
     * @param request QueryGuideItemGroupForCrowdOperationRequest
     * @return QueryGuideItemGroupForCrowdOperationResponse
     */
    public QueryGuideItemGroupForCrowdOperationResponse queryGuideItemGroupForCrowdOperation(QueryGuideItemGroupForCrowdOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGuideItemGroupForCrowdOperationWithOptions(request, runtime);
    }

    /**
     * @param request QueryGuideItemGroupWithOutInventoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGuideItemGroupWithOutInventoryResponse
     */
    public QueryGuideItemGroupWithOutInventoryResponse queryGuideItemGroupWithOutInventoryWithOptions(QueryGuideItemGroupWithOutInventoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGuideItemGroupWithOutInventory"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGuideItemGroupWithOutInventoryResponse());
    }

    /**
     * @param request QueryGuideItemGroupWithOutInventoryRequest
     * @return QueryGuideItemGroupWithOutInventoryResponse
     */
    public QueryGuideItemGroupWithOutInventoryResponse queryGuideItemGroupWithOutInventory(QueryGuideItemGroupWithOutInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGuideItemGroupWithOutInventoryWithOptions(request, runtime);
    }

    /**
     * @param request QueryHotMoviesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryHotMoviesResponse
     */
    public QueryHotMoviesResponse queryHotMoviesWithOptions(QueryHotMoviesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            query.put("CityCode", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHotMovies"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHotMoviesResponse());
    }

    /**
     * @param request QueryHotMoviesRequest
     * @return QueryHotMoviesResponse
     */
    public QueryHotMoviesResponse queryHotMovies(QueryHotMoviesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryHotMoviesWithOptions(request, runtime);
    }

    /**
     * @param tmpReq QueryInventoryOfItemsInBizItemGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInventoryOfItemsInBizItemGroupResponse
     */
    public QueryInventoryOfItemsInBizItemGroupResponse queryInventoryOfItemsInBizItemGroupWithOptions(QueryInventoryOfItemsInBizItemGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryInventoryOfItemsInBizItemGroupShrinkRequest request = new QueryInventoryOfItemsInBizItemGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInventoryOfItemsInBizItemGroup"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInventoryOfItemsInBizItemGroupResponse());
    }

    /**
     * @param request QueryInventoryOfItemsInBizItemGroupRequest
     * @return QueryInventoryOfItemsInBizItemGroupResponse
     */
    public QueryInventoryOfItemsInBizItemGroupResponse queryInventoryOfItemsInBizItemGroup(QueryInventoryOfItemsInBizItemGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInventoryOfItemsInBizItemGroupWithOptions(request, runtime);
    }

    /**
     * @param request QueryItemDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryItemDetailResponse
     */
    public QueryItemDetailResponse queryItemDetailWithOptions(QueryItemDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            query.put("LmItemId", request.lmItemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryItemDetail"),
            new TeaPair("version", "2018-01-16"),
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

    /**
     * @param request QueryItemDetailRequest
     * @return QueryItemDetailResponse
     */
    public QueryItemDetailResponse queryItemDetail(QueryItemDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryItemDetailWithOptions(request, runtime);
    }

    /**
     * @param request QueryItemDetailInnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryItemDetailInnerResponse
     */
    public QueryItemDetailInnerResponse queryItemDetailInnerWithOptions(QueryItemDetailInnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.divisionCode)) {
            query.put("DivisionCode", request.divisionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            query.put("LmItemId", request.lmItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryItemDetailInner"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryItemDetailInnerResponse());
    }

    /**
     * @param request QueryItemDetailInnerRequest
     * @return QueryItemDetailInnerResponse
     */
    public QueryItemDetailInnerResponse queryItemDetailInner(QueryItemDetailInnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryItemDetailInnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询商品详情tea版本</p>
     * 
     * @param request QueryItemDetailTeaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryItemDetailTeaResponse
     */
    public QueryItemDetailTeaResponse queryItemDetailTeaWithOptions(QueryItemDetailTeaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.divisionCode)) {
            query.put("DivisionCode", request.divisionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            query.put("LmItemId", request.lmItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userFlag)) {
            query.put("UserFlag", request.userFlag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryItemDetailTea"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryItemDetailTeaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询商品详情tea版本</p>
     * 
     * @param request QueryItemDetailTeaRequest
     * @return QueryItemDetailTeaResponse
     */
    public QueryItemDetailTeaResponse queryItemDetailTea(QueryItemDetailTeaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryItemDetailTeaWithOptions(request, runtime);
    }

    /**
     * @param tmpReq QueryItemInSubBizsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryItemInSubBizsResponse
     */
    public QueryItemInSubBizsResponse queryItemInSubBizsWithOptions(QueryItemInSubBizsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryItemInSubBizsShrinkRequest request = new QueryItemInSubBizsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subBizIds)) {
            request.subBizIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subBizIds, "SubBizIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryItemInSubBizs"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryItemInSubBizsResponse());
    }

    /**
     * @param request QueryItemInSubBizsRequest
     * @return QueryItemInSubBizsResponse
     */
    public QueryItemInSubBizsResponse queryItemInSubBizs(QueryItemInSubBizsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryItemInSubBizsWithOptions(request, runtime);
    }

    /**
     * @param request QueryItemInventoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryItemInventoryResponse
     */
    public QueryItemInventoryResponse queryItemInventoryWithOptions(QueryItemInventoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.divisionCode)) {
            query.put("DivisionCode", request.divisionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemList)) {
            query.put("ItemList", request.itemList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryItemInventory"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryItemInventoryResponse());
    }

    /**
     * @param request QueryItemInventoryRequest
     * @return QueryItemInventoryResponse
     */
    public QueryItemInventoryResponse queryItemInventory(QueryItemInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryItemInventoryWithOptions(request, runtime);
    }

    /**
     * @param request QueryItemInventoryV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryItemInventoryV2Response
     */
    public QueryItemInventoryV2Response queryItemInventoryV2WithOptions(QueryItemInventoryV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.divisionCode)) {
            query.put("DivisionCode", request.divisionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemList)) {
            query.put("ItemList", request.itemList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryItemInventoryV2"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryItemInventoryV2Response());
    }

    /**
     * @param request QueryItemInventoryV2Request
     * @return QueryItemInventoryV2Response
     */
    public QueryItemInventoryV2Response queryItemInventoryV2(QueryItemInventoryV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryItemInventoryV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询商品下个限购周期限购信息</p>
     * 
     * @param tmpReq QueryItemNextCycleRestrictionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryItemNextCycleRestrictionResponse
     */
    public QueryItemNextCycleRestrictionResponse queryItemNextCycleRestrictionWithOptions(QueryItemNextCycleRestrictionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryItemNextCycleRestrictionShrinkRequest request = new QueryItemNextCycleRestrictionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemId)) {
            request.lmItemIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemId, "LmItemId", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subBizId)) {
            query.put("SubBizId", request.subBizId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lmItemIdShrink)) {
            body.put("LmItemId", request.lmItemIdShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryItemNextCycleRestriction"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryItemNextCycleRestrictionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询商品下个限购周期限购信息</p>
     * 
     * @param request QueryItemNextCycleRestrictionRequest
     * @return QueryItemNextCycleRestrictionResponse
     */
    public QueryItemNextCycleRestrictionResponse queryItemNextCycleRestriction(QueryItemNextCycleRestrictionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryItemNextCycleRestrictionWithOptions(request, runtime);
    }

    /**
     * @param request QueryLogisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryLogisticsResponse
     */
    public QueryLogisticsResponse queryLogisticsWithOptions(QueryLogisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmOrderId)) {
            query.put("LmOrderId", request.lmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLogistics"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLogisticsResponse());
    }

    /**
     * @param request QueryLogisticsRequest
     * @return QueryLogisticsResponse
     */
    public QueryLogisticsResponse queryLogistics(QueryLogisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLogisticsWithOptions(request, runtime);
    }

    /**
     * @param request QueryMediaSettleInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMediaSettleInfoResponse
     */
    public QueryMediaSettleInfoResponse queryMediaSettleInfoWithOptions(QueryMediaSettleInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            query.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaName)) {
            query.put("MediaName", request.mediaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settleNo)) {
            query.put("SettleNo", request.settleNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMediaSettleInfo"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMediaSettleInfoResponse());
    }

    /**
     * @param request QueryMediaSettleInfoRequest
     * @return QueryMediaSettleInfoResponse
     */
    public QueryMediaSettleInfoResponse queryMediaSettleInfo(QueryMediaSettleInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMediaSettleInfoWithOptions(request, runtime);
    }

    /**
     * @param request QueryMessagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMessagesResponse
     */
    public QueryMessagesResponse queryMessagesWithOptions(QueryMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMessages"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMessagesResponse());
    }

    /**
     * @param request QueryMessagesRequest
     * @return QueryMessagesResponse
     */
    public QueryMessagesResponse queryMessages(QueryMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMessagesWithOptions(request, runtime);
    }

    /**
     * @param request QueryMovieCommentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMovieCommentsResponse
     */
    public QueryMovieCommentsResponse queryMovieCommentsWithOptions(QueryMovieCommentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.movieId)) {
            query.put("MovieId", request.movieId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMovieComments"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMovieCommentsResponse());
    }

    /**
     * @param request QueryMovieCommentsRequest
     * @return QueryMovieCommentsResponse
     */
    public QueryMovieCommentsResponse queryMovieComments(QueryMovieCommentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMovieCommentsWithOptions(request, runtime);
    }

    /**
     * @param request QueryMovieSchedulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMovieSchedulesResponse
     */
    public QueryMovieSchedulesResponse queryMovieSchedulesWithOptions(QueryMovieSchedulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cinemaId)) {
            query.put("CinemaId", request.cinemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMovieSchedules"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMovieSchedulesResponse());
    }

    /**
     * @param request QueryMovieSchedulesRequest
     * @return QueryMovieSchedulesResponse
     */
    public QueryMovieSchedulesResponse queryMovieSchedules(QueryMovieSchedulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMovieSchedulesWithOptions(request, runtime);
    }

    /**
     * @param request QueryMovieSeatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMovieSeatsResponse
     */
    public QueryMovieSeatsResponse queryMovieSeatsWithOptions(QueryMovieSeatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleId)) {
            query.put("ScheduleId", request.scheduleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMovieSeats"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMovieSeatsResponse());
    }

    /**
     * @param request QueryMovieSeatsRequest
     * @return QueryMovieSeatsResponse
     */
    public QueryMovieSeatsResponse queryMovieSeats(QueryMovieSeatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMovieSeatsWithOptions(request, runtime);
    }

    /**
     * @param request QueryMovieTicketsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMovieTicketsResponse
     */
    public QueryMovieTicketsResponse queryMovieTicketsWithOptions(QueryMovieTicketsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMovieTickets"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMovieTicketsResponse());
    }

    /**
     * @param request QueryMovieTicketsRequest
     * @return QueryMovieTicketsResponse
     */
    public QueryMovieTicketsResponse queryMovieTickets(QueryMovieTicketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMovieTicketsWithOptions(request, runtime);
    }

    /**
     * @param request QueryOrderAndPaymentListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrderAndPaymentListResponse
     */
    public QueryOrderAndPaymentListResponse queryOrderAndPaymentListWithOptions(QueryOrderAndPaymentListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterOption)) {
            query.put("FilterOption", request.filterOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderAndPaymentList"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderAndPaymentListResponse());
    }

    /**
     * @param request QueryOrderAndPaymentListRequest
     * @return QueryOrderAndPaymentListResponse
     */
    public QueryOrderAndPaymentListResponse queryOrderAndPaymentList(QueryOrderAndPaymentListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrderAndPaymentListWithOptions(request, runtime);
    }

    /**
     * @param request QueryOrderAndPaymentListWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrderAndPaymentListWithDesignatedTbUidResponse
     */
    public QueryOrderAndPaymentListWithDesignatedTbUidResponse queryOrderAndPaymentListWithDesignatedTbUidWithOptions(QueryOrderAndPaymentListWithDesignatedTbUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderAndPaymentListWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderAndPaymentListWithDesignatedTbUidResponse());
    }

    /**
     * @param request QueryOrderAndPaymentListWithDesignatedTbUidRequest
     * @return QueryOrderAndPaymentListWithDesignatedTbUidResponse
     */
    public QueryOrderAndPaymentListWithDesignatedTbUidResponse queryOrderAndPaymentListWithDesignatedTbUid(QueryOrderAndPaymentListWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrderAndPaymentListWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * @param request QueryOrderCommissionRateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrderCommissionRateResponse
     */
    public QueryOrderCommissionRateResponse queryOrderCommissionRateWithOptions(QueryOrderCommissionRateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmOrderId)) {
            query.put("LmOrderId", request.lmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderCommissionRate"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderCommissionRateResponse());
    }

    /**
     * @param request QueryOrderCommissionRateRequest
     * @return QueryOrderCommissionRateResponse
     */
    public QueryOrderCommissionRateResponse queryOrderCommissionRate(QueryOrderCommissionRateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrderCommissionRateWithOptions(request, runtime);
    }

    /**
     * @param request QueryOrderDetailInnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrderDetailInnerResponse
     */
    public QueryOrderDetailInnerResponse queryOrderDetailInnerWithOptions(QueryOrderDetailInnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterOption)) {
            query.put("FilterOption", request.filterOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderDetailInner"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderDetailInnerResponse());
    }

    /**
     * @param request QueryOrderDetailInnerRequest
     * @return QueryOrderDetailInnerResponse
     */
    public QueryOrderDetailInnerResponse queryOrderDetailInner(QueryOrderDetailInnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrderDetailInnerWithOptions(request, runtime);
    }

    /**
     * @param request QueryOrderIdByPayIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrderIdByPayIdResponse
     */
    public QueryOrderIdByPayIdResponse queryOrderIdByPayIdWithOptions(QueryOrderIdByPayIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentId)) {
            query.put("PaymentId", request.paymentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderIdByPayId"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderIdByPayIdResponse());
    }

    /**
     * @param request QueryOrderIdByPayIdRequest
     * @return QueryOrderIdByPayIdResponse
     */
    public QueryOrderIdByPayIdResponse queryOrderIdByPayId(QueryOrderIdByPayIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrderIdByPayIdWithOptions(request, runtime);
    }

    /**
     * @param request QueryOrderInfoAfterSaleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrderInfoAfterSaleResponse
     */
    public QueryOrderInfoAfterSaleResponse queryOrderInfoAfterSaleWithOptions(QueryOrderInfoAfterSaleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderInfoAfterSale"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderInfoAfterSaleResponse());
    }

    /**
     * @param request QueryOrderInfoAfterSaleRequest
     * @return QueryOrderInfoAfterSaleResponse
     */
    public QueryOrderInfoAfterSaleResponse queryOrderInfoAfterSale(QueryOrderInfoAfterSaleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrderInfoAfterSaleWithOptions(request, runtime);
    }

    /**
     * @param request QueryOrderItemInfoByPaymentIdForAiZhanYouRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrderItemInfoByPaymentIdForAiZhanYouResponse
     */
    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponse queryOrderItemInfoByPaymentIdForAiZhanYouWithOptions(QueryOrderItemInfoByPaymentIdForAiZhanYouRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentId)) {
            query.put("PaymentId", request.paymentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderItemInfoByPaymentIdForAiZhanYou"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderItemInfoByPaymentIdForAiZhanYouResponse());
    }

    /**
     * @param request QueryOrderItemInfoByPaymentIdForAiZhanYouRequest
     * @return QueryOrderItemInfoByPaymentIdForAiZhanYouResponse
     */
    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponse queryOrderItemInfoByPaymentIdForAiZhanYou(QueryOrderItemInfoByPaymentIdForAiZhanYouRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrderItemInfoByPaymentIdForAiZhanYouWithOptions(request, runtime);
    }

    /**
     * @param request QueryOrderListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrderListResponse
     */
    public QueryOrderListResponse queryOrderListWithOptions(QueryOrderListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterOption)) {
            query.put("FilterOption", request.filterOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderList"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderListResponse());
    }

    /**
     * @param request QueryOrderListRequest
     * @return QueryOrderListResponse
     */
    public QueryOrderListResponse queryOrderList(QueryOrderListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrderListWithOptions(request, runtime);
    }

    /**
     * @param request QueryOrderListWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrderListWithDesignatedTbUidResponse
     */
    public QueryOrderListWithDesignatedTbUidResponse queryOrderListWithDesignatedTbUidWithOptions(QueryOrderListWithDesignatedTbUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderListWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderListWithDesignatedTbUidResponse());
    }

    /**
     * @param request QueryOrderListWithDesignatedTbUidRequest
     * @return QueryOrderListWithDesignatedTbUidResponse
     */
    public QueryOrderListWithDesignatedTbUidResponse queryOrderListWithDesignatedTbUid(QueryOrderListWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrderListWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * @param request QueryOrderLogisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrderLogisticsResponse
     */
    public QueryOrderLogisticsResponse queryOrderLogisticsWithOptions(QueryOrderLogisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmOrderId)) {
            query.put("LmOrderId", request.lmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderLogistics"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderLogisticsResponse());
    }

    /**
     * @param request QueryOrderLogisticsRequest
     * @return QueryOrderLogisticsResponse
     */
    public QueryOrderLogisticsResponse queryOrderLogistics(QueryOrderLogisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrderLogisticsWithOptions(request, runtime);
    }

    /**
     * @param request QueryOrderLogisticsWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrderLogisticsWithDesignatedTbUidResponse
     */
    public QueryOrderLogisticsWithDesignatedTbUidResponse queryOrderLogisticsWithDesignatedTbUidWithOptions(QueryOrderLogisticsWithDesignatedTbUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmOrderId)) {
            body.put("LmOrderId", request.lmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderLogisticsWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderLogisticsWithDesignatedTbUidResponse());
    }

    /**
     * @param request QueryOrderLogisticsWithDesignatedTbUidRequest
     * @return QueryOrderLogisticsWithDesignatedTbUidResponse
     */
    public QueryOrderLogisticsWithDesignatedTbUidResponse queryOrderLogisticsWithDesignatedTbUid(QueryOrderLogisticsWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrderLogisticsWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * @param request QueryRealTbAccountSupportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRealTbAccountSupportResponse
     */
    public QueryRealTbAccountSupportResponse queryRealTbAccountSupportWithOptions(QueryRealTbAccountSupportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRealTbAccountSupport"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRealTbAccountSupportResponse());
    }

    /**
     * @param request QueryRealTbAccountSupportRequest
     * @return QueryRealTbAccountSupportResponse
     */
    public QueryRealTbAccountSupportResponse queryRealTbAccountSupport(QueryRealTbAccountSupportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRealTbAccountSupportWithOptions(request, runtime);
    }

    /**
     * @param request QueryRefundApplicationDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRefundApplicationDetailResponse
     */
    public QueryRefundApplicationDetailResponse queryRefundApplicationDetailWithOptions(QueryRefundApplicationDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subLmOrderId)) {
            query.put("SubLmOrderId", request.subLmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRefundApplicationDetail"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRefundApplicationDetailResponse());
    }

    /**
     * @param request QueryRefundApplicationDetailRequest
     * @return QueryRefundApplicationDetailResponse
     */
    public QueryRefundApplicationDetailResponse queryRefundApplicationDetail(QueryRefundApplicationDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRefundApplicationDetailWithOptions(request, runtime);
    }

    /**
     * @param request QueryRefundApplyWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRefundApplyWithDesignatedTbUidResponse
     */
    public QueryRefundApplyWithDesignatedTbUidResponse queryRefundApplyWithDesignatedTbUidWithOptions(QueryRefundApplyWithDesignatedTbUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subLmOrderId)) {
            body.put("SubLmOrderId", request.subLmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRefundApplyWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRefundApplyWithDesignatedTbUidResponse());
    }

    /**
     * @param request QueryRefundApplyWithDesignatedTbUidRequest
     * @return QueryRefundApplyWithDesignatedTbUidResponse
     */
    public QueryRefundApplyWithDesignatedTbUidResponse queryRefundApplyWithDesignatedTbUid(QueryRefundApplyWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRefundApplyWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>商家证照查询接口</p>
     * 
     * @param request QuerySellerLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySellerLicenseResponse
     */
    public QuerySellerLicenseResponse querySellerLicenseWithOptions(QuerySellerLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerId)) {
            body.put("SellerId", request.sellerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySellerLicense"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySellerLicenseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>商家证照查询接口</p>
     * 
     * @param request QuerySellerLicenseRequest
     * @return QuerySellerLicenseResponse
     */
    public QuerySellerLicenseResponse querySellerLicense(QuerySellerLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySellerLicenseWithOptions(request, runtime);
    }

    /**
     * @param request QueryStatementsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryStatementsResponse
     */
    public QueryStatementsResponse queryStatementsWithOptions(QueryStatementsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currency)) {
            query.put("Currency", request.currency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            query.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payeeIds)) {
            query.put("PayeeIds", request.payeeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settleNoes)) {
            query.put("SettleNoes", request.settleNoes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settleStatus)) {
            query.put("SettleStatus", request.settleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settleType)) {
            query.put("SettleType", request.settleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryStatements"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryStatementsResponse());
    }

    /**
     * @param request QueryStatementsRequest
     * @return QueryStatementsResponse
     */
    public QueryStatementsResponse queryStatements(QueryStatementsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryStatementsWithOptions(request, runtime);
    }

    /**
     * @param request QuerySupplierItemBillDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySupplierItemBillDownloadUrlResponse
     */
    public QuerySupplierItemBillDownloadUrlResponse querySupplierItemBillDownloadUrlWithOptions(QuerySupplierItemBillDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billId)) {
            body.put("BillId", request.billId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billPeriod)) {
            body.put("BillPeriod", request.billPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billStatus)) {
            body.put("BillStatus", request.billStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmShopId)) {
            body.put("LmShopId", request.lmShopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmShopName)) {
            body.put("LmShopName", request.lmShopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySupplierItemBillDownloadUrl"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySupplierItemBillDownloadUrlResponse());
    }

    /**
     * @param request QuerySupplierItemBillDownloadUrlRequest
     * @return QuerySupplierItemBillDownloadUrlResponse
     */
    public QuerySupplierItemBillDownloadUrlResponse querySupplierItemBillDownloadUrl(QuerySupplierItemBillDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySupplierItemBillDownloadUrlWithOptions(request, runtime);
    }

    /**
     * @param request QueryUnfinishedActivitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUnfinishedActivitiesResponse
     */
    public QueryUnfinishedActivitiesResponse queryUnfinishedActivitiesWithOptions(QueryUnfinishedActivitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUnfinishedActivities"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUnfinishedActivitiesResponse());
    }

    /**
     * @param request QueryUnfinishedActivitiesRequest
     * @return QueryUnfinishedActivitiesResponse
     */
    public QueryUnfinishedActivitiesResponse queryUnfinishedActivities(QueryUnfinishedActivitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUnfinishedActivitiesWithOptions(request, runtime);
    }

    /**
     * @param request QueryUnfinishedSessionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUnfinishedSessionsResponse
     */
    public QueryUnfinishedSessionsResponse queryUnfinishedSessionsWithOptions(QueryUnfinishedSessionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryTime)) {
            query.put("QueryTime", request.queryTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUnfinishedSessions"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUnfinishedSessionsResponse());
    }

    /**
     * @param request QueryUnfinishedSessionsRequest
     * @return QueryUnfinishedSessionsResponse
     */
    public QueryUnfinishedSessionsResponse queryUnfinishedSessions(QueryUnfinishedSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUnfinishedSessionsWithOptions(request, runtime);
    }

    /**
     * @param tmpReq QueryUnfinishedSessions4ItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUnfinishedSessions4ItemsResponse
     */
    public QueryUnfinishedSessions4ItemsResponse queryUnfinishedSessions4ItemsWithOptions(QueryUnfinishedSessions4ItemsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryUnfinishedSessions4ItemsShrinkRequest request = new QueryUnfinishedSessions4ItemsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemIdsShrink)) {
            query.put("ItemIds", request.itemIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemIdsShrink)) {
            query.put("LmItemIds", request.lmItemIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryTime)) {
            query.put("QueryTime", request.queryTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUnfinishedSessions4Items"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUnfinishedSessions4ItemsResponse());
    }

    /**
     * @param request QueryUnfinishedSessions4ItemsRequest
     * @return QueryUnfinishedSessions4ItemsResponse
     */
    public QueryUnfinishedSessions4ItemsResponse queryUnfinishedSessions4Items(QueryUnfinishedSessions4ItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUnfinishedSessions4ItemsWithOptions(request, runtime);
    }

    /**
     * @param tmpReq QueryUpcomingMoviesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUpcomingMoviesResponse
     */
    public QueryUpcomingMoviesResponse queryUpcomingMoviesWithOptions(QueryUpcomingMoviesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryUpcomingMoviesShrinkRequest request = new QueryUpcomingMoviesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extJson)) {
            request.extJsonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extJson, "ExtJson", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            query.put("CityCode", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJsonShrink)) {
            query.put("ExtJson", request.extJsonShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUpcomingMovies"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUpcomingMoviesResponse());
    }

    /**
     * @param request QueryUpcomingMoviesRequest
     * @return QueryUpcomingMoviesResponse
     */
    public QueryUpcomingMoviesResponse queryUpcomingMovies(QueryUpcomingMoviesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUpcomingMoviesWithOptions(request, runtime);
    }

    /**
     * @param request QueryUserAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserAccountResponse
     */
    public QueryUserAccountResponse queryUserAccountWithOptions(QueryUserAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserAccount"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserAccountResponse());
    }

    /**
     * @param request QueryUserAccountRequest
     * @return QueryUserAccountResponse
     */
    public QueryUserAccountResponse queryUserAccount(QueryUserAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户活动玩法进度</p>
     * 
     * @param tmpReq QueryUserGameProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserGameProcessResponse
     */
    public QueryUserGameProcessResponse queryUserGameProcessWithOptions(QueryUserGameProcessRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryUserGameProcessShrinkRequest request = new QueryUserGameProcessShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processId)) {
            query.put("ProcessId", request.processId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extInfoShrink)) {
            body.put("ExtInfo", request.extInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserGameProcess"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserGameProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户活动玩法进度</p>
     * 
     * @param request QueryUserGameProcessRequest
     * @return QueryUserGameProcessResponse
     */
    public QueryUserGameProcessResponse queryUserGameProcess(QueryUserGameProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserGameProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>LM查询用户积分</p>
     * 
     * @param tmpReq QueryUserPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserPointResponse
     */
    public QueryUserPointResponse queryUserPointWithOptions(QueryUserPointRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryUserPointShrinkRequest request = new QueryUserPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>LM查询用户积分</p>
     * 
     * @param request QueryUserPointRequest
     * @return QueryUserPointResponse
     */
    public QueryUserPointResponse queryUserPoint(QueryUserPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserPointWithOptions(request, runtime);
    }

    /**
     * @param request QueryWithholdTradeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryWithholdTradeResponse
     */
    public QueryWithholdTradeResponse queryWithholdTradeWithOptions(QueryWithholdTradeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.merchantId)) {
            body.put("MerchantId", request.merchantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeNo)) {
            body.put("OutTradeNo", request.outTradeNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeNo)) {
            body.put("TradeNo", request.tradeNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryWithholdTrade"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryWithholdTradeResponse());
    }

    /**
     * @param request QueryWithholdTradeRequest
     * @return QueryWithholdTradeResponse
     */
    public QueryWithholdTradeResponse queryWithholdTrade(QueryWithholdTradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryWithholdTradeWithOptions(request, runtime);
    }

    /**
     * @param request RebindTbAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebindTbAccountResponse
     */
    public RebindTbAccountResponse rebindTbAccountWithOptions(RebindTbAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebindTbAccount"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebindTbAccountResponse());
    }

    /**
     * @param request RebindTbAccountRequest
     * @return RebindTbAccountResponse
     */
    public RebindTbAccountResponse rebindTbAccount(RebindTbAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebindTbAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>刷新在途结算单的结算账号</p>
     * 
     * @param request RefreshSettlementOrderAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshSettlementOrderAccountResponse
     */
    public RefreshSettlementOrderAccountResponse refreshSettlementOrderAccountWithOptions(RefreshSettlementOrderAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshSettlementOrderAccount"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshSettlementOrderAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>刷新在途结算单的结算账号</p>
     * 
     * @param request RefreshSettlementOrderAccountRequest
     * @return RefreshSettlementOrderAccountResponse
     */
    public RefreshSettlementOrderAccountResponse refreshSettlementOrderAccount(RefreshSettlementOrderAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshSettlementOrderAccountWithOptions(request, runtime);
    }

    /**
     * @param request RefundOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefundOrderResponse
     */
    public RefundOrderResponse refundOrderWithOptions(RefundOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantId)) {
            body.put("MerchantId", request.merchantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outRequestNo)) {
            body.put("OutRequestNo", request.outRequestNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeNo)) {
            body.put("OutTradeNo", request.outTradeNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundAmount)) {
            body.put("RefundAmount", request.refundAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundReason)) {
            body.put("RefundReason", request.refundReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundRoyaltyParameters)) {
            body.put("RefundRoyaltyParameters", request.refundRoyaltyParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeNo)) {
            body.put("TradeNo", request.tradeNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefundOrderResponse());
    }

    /**
     * @param request RefundOrderRequest
     * @return RefundOrderResponse
     */
    public RefundOrderResponse refundOrder(RefundOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refundOrderWithOptions(request, runtime);
    }

    /**
     * @param request RefundPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefundPointResponse
     */
    public RefundPointResponse refundPointWithOptions(RefundPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmOrderId)) {
            query.put("LmOrderId", request.lmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerId)) {
            query.put("SellerId", request.sellerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefundPointResponse());
    }

    /**
     * @param request RefundPointRequest
     * @return RefundPointResponse
     */
    public RefundPointResponse refundPoint(RefundPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refundPointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>退还用户积分</p>
     * 
     * @param tmpReq RefundUserPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefundUserPointResponse
     */
    public RefundUserPointResponse refundUserPointWithOptions(RefundUserPointRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RefundUserPointShrinkRequest request = new RefundUserPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("IdempotentId", request.idempotentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originRecordId)) {
            query.put("OriginRecordId", request.originRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extInfoShrink)) {
            body.put("ExtInfo", request.extInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundUserPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefundUserPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>退还用户积分</p>
     * 
     * @param request RefundUserPointRequest
     * @return RefundUserPointResponse
     */
    public RefundUserPointResponse refundUserPoint(RefundUserPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refundUserPointWithOptions(request, runtime);
    }

    /**
     * @param request RefuseMerchantSyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefuseMerchantSyncTaskResponse
     */
    public RefuseMerchantSyncTaskResponse refuseMerchantSyncTaskWithOptions(RefuseMerchantSyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerNick)) {
            query.put("SellerNick", request.sellerNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStamp)) {
            query.put("TimeStamp", request.timeStamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefuseMerchantSyncTask"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefuseMerchantSyncTaskResponse());
    }

    /**
     * @param request RefuseMerchantSyncTaskRequest
     * @return RefuseMerchantSyncTaskResponse
     */
    public RefuseMerchantSyncTaskResponse refuseMerchantSyncTask(RefuseMerchantSyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refuseMerchantSyncTaskWithOptions(request, runtime);
    }

    /**
     * @param request RegistAnonymousTbAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegistAnonymousTbAccountResponse
     */
    public RegistAnonymousTbAccountResponse registAnonymousTbAccountWithOptions(RegistAnonymousTbAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegistAnonymousTbAccount"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegistAnonymousTbAccountResponse());
    }

    /**
     * @param request RegistAnonymousTbAccountRequest
     * @return RegistAnonymousTbAccountResponse
     */
    public RegistAnonymousTbAccountResponse registAnonymousTbAccount(RegistAnonymousTbAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registAnonymousTbAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>注册结算账号</p>
     * 
     * @param request RegisterSettleAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterSettleAccountResponse
     */
    public RegisterSettleAccountResponse registerSettleAccountWithOptions(RegisterSettleAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountChannel)) {
            body.put("AccountChannel", request.accountChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPayType)) {
            body.put("AccountPayType", request.accountPayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            body.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryOrAreaCode)) {
            body.put("CountryOrAreaCode", request.countryOrAreaCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currency)) {
            body.put("Currency", request.currency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            body.put("IdempotentId", request.idempotentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterSettleAccount"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterSettleAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>注册结算账号</p>
     * 
     * @param request RegisterSettleAccountRequest
     * @return RegisterSettleAccountResponse
     */
    public RegisterSettleAccountResponse registerSettleAccount(RegisterSettleAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerSettleAccountWithOptions(request, runtime);
    }

    /**
     * @param request RegisterUserAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterUserAccountResponse
     */
    public RegisterUserAccountResponse registerUserAccountWithOptions(RegisterUserAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterUserAccount"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterUserAccountResponse());
    }

    /**
     * @param request RegisterUserAccountRequest
     * @return RegisterUserAccountResponse
     */
    public RegisterUserAccountResponse registerUserAccount(RegisterUserAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerUserAccountWithOptions(request, runtime);
    }

    /**
     * @param request ReleaseMovieSeatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseMovieSeatResponse
     */
    public ReleaseMovieSeatResponse releaseMovieSeatWithOptions(ReleaseMovieSeatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lockSeatApplyKey)) {
            query.put("LockSeatApplyKey", request.lockSeatApplyKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseMovieSeat"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseMovieSeatResponse());
    }

    /**
     * @param request ReleaseMovieSeatRequest
     * @return ReleaseMovieSeatResponse
     */
    public ReleaseMovieSeatResponse releaseMovieSeat(ReleaseMovieSeatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseMovieSeatWithOptions(request, runtime);
    }

    /**
     * @param request RemoveAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveAddressResponse
     */
    public RemoveAddressResponse removeAddressWithOptions(RemoveAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressInfo)) {
            body.put("AddressInfo", request.addressInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveAddress"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAddressResponse());
    }

    /**
     * @param request RemoveAddressRequest
     * @return RemoveAddressResponse
     */
    public RemoveAddressResponse removeAddress(RemoveAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeAddressWithOptions(request, runtime);
    }

    /**
     * @param request RemoveMessagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveMessagesResponse
     */
    public RemoveMessagesResponse removeMessagesWithOptions(RemoveMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageIds)) {
            query.put("MessageIds", request.messageIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveMessages"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveMessagesResponse());
    }

    /**
     * @param request RemoveMessagesRequest
     * @return RemoveMessagesResponse
     */
    public RemoveMessagesResponse removeMessages(RemoveMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeMessagesWithOptions(request, runtime);
    }

    /**
     * @param request RenderH5OrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenderH5OrderResponse
     */
    public RenderH5OrderResponse renderH5OrderWithOptions(RenderH5OrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyOrderRequestModel)) {
            query.put("BuyOrderRequestModel", request.buyOrderRequestModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenderH5Order"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenderH5OrderResponse());
    }

    /**
     * @param request RenderH5OrderRequest
     * @return RenderH5OrderResponse
     */
    public RenderH5OrderResponse renderH5Order(RenderH5OrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renderH5OrderWithOptions(request, runtime);
    }

    /**
     * @param request RenderOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenderOrderResponse
     */
    public RenderOrderResponse renderOrderWithOptions(RenderOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryAddress)) {
            query.put("DeliveryAddress", request.deliveryAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemList)) {
            query.put("ItemList", request.itemList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            query.put("LmItemId", request.lmItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenderOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenderOrderResponse());
    }

    /**
     * @param request RenderOrderRequest
     * @return RenderOrderResponse
     */
    public RenderOrderResponse renderOrder(RenderOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renderOrderWithOptions(request, runtime);
    }

    /**
     * @param tmpReq RenderOrderWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenderOrderWithDesignatedTbUidResponse
     */
    public RenderOrderWithDesignatedTbUidResponse renderOrderWithDesignatedTbUidWithOptions(RenderOrderWithDesignatedTbUidRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RenderOrderWithDesignatedTbUidShrinkRequest request = new RenderOrderWithDesignatedTbUidShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemList)) {
            request.itemListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemList, "ItemList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryAddress)) {
            body.put("DeliveryAddress", request.deliveryAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemListShrink)) {
            body.put("ItemList", request.itemListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenderOrderWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenderOrderWithDesignatedTbUidResponse());
    }

    /**
     * @param request RenderOrderWithDesignatedTbUidRequest
     * @return RenderOrderWithDesignatedTbUidResponse
     */
    public RenderOrderWithDesignatedTbUidResponse renderOrderWithDesignatedTbUid(RenderOrderWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renderOrderWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * @param request RepayForPayUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RepayForPayUrlResponse
     */
    public RepayForPayUrlResponse repayForPayUrlWithOptions(RepayForPayUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmOrderId)) {
            query.put("LmOrderId", request.lmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RepayForPayUrl"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RepayForPayUrlResponse());
    }

    /**
     * @param request RepayForPayUrlRequest
     * @return RepayForPayUrlResponse
     */
    public RepayForPayUrlResponse repayForPayUrl(RepayForPayUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.repayForPayUrlWithOptions(request, runtime);
    }

    /**
     * @param request RepayOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RepayOrderResponse
     */
    public RepayOrderResponse repayOrderWithOptions(RepayOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmOrderId)) {
            query.put("LmOrderId", request.lmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RepayOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RepayOrderResponse());
    }

    /**
     * @param request RepayOrderRequest
     * @return RepayOrderResponse
     */
    public RepayOrderResponse repayOrder(RepayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.repayOrderWithOptions(request, runtime);
    }

    /**
     * @param request RepayWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RepayWithDesignatedTbUidResponse
     */
    public RepayWithDesignatedTbUidResponse repayWithDesignatedTbUidWithOptions(RepayWithDesignatedTbUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            body.put("ExtJson", request.extJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmOrderId)) {
            body.put("LmOrderId", request.lmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RepayWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RepayWithDesignatedTbUidResponse());
    }

    /**
     * @param request RepayWithDesignatedTbUidRequest
     * @return RepayWithDesignatedTbUidResponse
     */
    public RepayWithDesignatedTbUidResponse repayWithDesignatedTbUid(RepayWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.repayWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * @param request ReserveMovieSeatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReserveMovieSeatResponse
     */
    public ReserveMovieSeatResponse reserveMovieSeatWithOptions(ReserveMovieSeatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleId)) {
            query.put("ScheduleId", request.scheduleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seatIds)) {
            query.put("SeatIds", request.seatIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seatNames)) {
            query.put("SeatNames", request.seatNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReserveMovieSeat"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReserveMovieSeatResponse());
    }

    /**
     * @param request ReserveMovieSeatRequest
     * @return ReserveMovieSeatResponse
     */
    public ReserveMovieSeatResponse reserveMovieSeat(ReserveMovieSeatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reserveMovieSeatWithOptions(request, runtime);
    }

    /**
     * @param request SettleOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SettleOrderResponse
     */
    public SettleOrderResponse settleOrderWithOptions(SettleOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantId)) {
            body.put("MerchantId", request.merchantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outRequestNo)) {
            body.put("OutRequestNo", request.outRequestNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeNo)) {
            body.put("OutTradeNo", request.outTradeNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.royaltyParameters)) {
            body.put("RoyaltyParameters", request.royaltyParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeNo)) {
            body.put("TradeNo", request.tradeNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SettleOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SettleOrderResponse());
    }

    /**
     * @param request SettleOrderRequest
     * @return SettleOrderResponse
     */
    public SettleOrderResponse settleOrder(SettleOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.settleOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>用户开始游戏（活动玩法）</p>
     * 
     * @param tmpReq StartUserGameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartUserGameResponse
     */
    public StartUserGameResponse startUserGameWithOptions(StartUserGameRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartUserGameShrinkRequest request = new StartUserGameShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gameId)) {
            query.put("GameId", request.gameId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userApp)) {
            query.put("UserApp", request.userApp);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extInfoShrink)) {
            body.put("ExtInfo", request.extInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartUserGame"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartUserGameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>用户开始游戏（活动玩法）</p>
     * 
     * @param request StartUserGameRequest
     * @return StartUserGameResponse
     */
    public StartUserGameResponse startUserGame(StartUserGameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startUserGameWithOptions(request, runtime);
    }

    /**
     * @param request SubmitReturnGoodLogisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitReturnGoodLogisticsResponse
     */
    public SubmitReturnGoodLogisticsResponse submitReturnGoodLogisticsWithOptions(SubmitReturnGoodLogisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpCode)) {
            query.put("CpCode", request.cpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disputeId)) {
            query.put("DisputeId", request.disputeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logisticsNo)) {
            query.put("LogisticsNo", request.logisticsNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subLmOrderId)) {
            query.put("SubLmOrderId", request.subLmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitReturnGoodLogistics"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitReturnGoodLogisticsResponse());
    }

    /**
     * @param request SubmitReturnGoodLogisticsRequest
     * @return SubmitReturnGoodLogisticsResponse
     */
    public SubmitReturnGoodLogisticsResponse submitReturnGoodLogistics(SubmitReturnGoodLogisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitReturnGoodLogisticsWithOptions(request, runtime);
    }

    /**
     * @param request SubmitReturnGoodLogisticsWithDesignatedTbUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitReturnGoodLogisticsWithDesignatedTbUidResponse
     */
    public SubmitReturnGoodLogisticsWithDesignatedTbUidResponse submitReturnGoodLogisticsWithDesignatedTbUidWithOptions(SubmitReturnGoodLogisticsWithDesignatedTbUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpCode)) {
            body.put("CpCode", request.cpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disputeId)) {
            body.put("DisputeId", request.disputeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logisticsNo)) {
            body.put("LogisticsNo", request.logisticsNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subLmOrderId)) {
            body.put("SubLmOrderId", request.subLmOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbAccountType)) {
            body.put("TbAccountType", request.tbAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserId)) {
            body.put("TbUserId", request.tbUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            body.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitReturnGoodLogisticsWithDesignatedTbUid"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitReturnGoodLogisticsWithDesignatedTbUidResponse());
    }

    /**
     * @param request SubmitReturnGoodLogisticsWithDesignatedTbUidRequest
     * @return SubmitReturnGoodLogisticsWithDesignatedTbUidResponse
     */
    public SubmitReturnGoodLogisticsWithDesignatedTbUidResponse submitReturnGoodLogisticsWithDesignatedTbUid(SubmitReturnGoodLogisticsWithDesignatedTbUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitReturnGoodLogisticsWithDesignatedTbUidWithOptions(request, runtime);
    }

    /**
     * @param request SyncMerchantInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncMerchantInfoResponse
     */
    public SyncMerchantInfoResponse syncMerchantInfoWithOptions(SyncMerchantInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerNick)) {
            query.put("SellerNick", request.sellerNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStamp)) {
            query.put("TimeStamp", request.timeStamp);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemList)) {
            body.put("ItemList", request.itemList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncMerchantInfo"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncMerchantInfoResponse());
    }

    /**
     * @param request SyncMerchantInfoRequest
     * @return SyncMerchantInfoResponse
     */
    public SyncMerchantInfoResponse syncMerchantInfo(SyncMerchantInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncMerchantInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解冻用户积分</p>
     * 
     * @param tmpReq UnFreezeUserPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnFreezeUserPointResponse
     */
    public UnFreezeUserPointResponse unFreezeUserPointWithOptions(UnFreezeUserPointRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UnFreezeUserPointShrinkRequest request = new UnFreezeUserPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("IdempotentId", request.idempotentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extInfoShrink)) {
            body.put("ExtInfo", request.extInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnFreezeUserPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnFreezeUserPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解冻用户积分</p>
     * 
     * @param request UnFreezeUserPointRequest
     * @return UnFreezeUserPointResponse
     */
    public UnFreezeUserPointResponse unFreezeUserPoint(UnFreezeUserPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unFreezeUserPointWithOptions(request, runtime);
    }

    /**
     * @param request UnsignWithholdAgreementRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnsignWithholdAgreementResponse
     */
    public UnsignWithholdAgreementResponse unsignWithholdAgreementWithOptions(UnsignWithholdAgreementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agreementNo)) {
            body.put("AgreementNo", request.agreementNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalAgreementNo)) {
            body.put("ExternalAgreementNo", request.externalAgreementNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantId)) {
            body.put("MerchantId", request.merchantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outRequestNo)) {
            body.put("OutRequestNo", request.outRequestNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnsignWithholdAgreement"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnsignWithholdAgreementResponse());
    }

    /**
     * @param request UnsignWithholdAgreementRequest
     * @return UnsignWithholdAgreementResponse
     */
    public UnsignWithholdAgreementResponse unsignWithholdAgreement(UnsignWithholdAgreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unsignWithholdAgreementWithOptions(request, runtime);
    }

    /**
     * @param request UpdateAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAddressResponse
     */
    public UpdateAddressResponse updateAddressWithOptions(UpdateAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyUserId)) {
            query.put("ThirdPartyUserId", request.thirdPartyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAnonymousTbAccount)) {
            query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressInfo)) {
            body.put("AddressInfo", request.addressInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAddress"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAddressResponse());
    }

    /**
     * @param request UpdateAddressRequest
     * @return UpdateAddressResponse
     */
    public UpdateAddressResponse updateAddress(UpdateAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAddressWithOptions(request, runtime);
    }

    /**
     * @param request ValidateTaobaoAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateTaobaoAccountResponse
     */
    public ValidateTaobaoAccountResponse validateTaobaoAccountWithOptions(ValidateTaobaoAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizUid)) {
            query.put("BizUid", request.bizUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extJson)) {
            query.put("ExtJson", request.extJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileNo)) {
            query.put("MobileNo", request.mobileNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUserNick)) {
            query.put("TbUserNick", request.tbUserNick);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateTaobaoAccount"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateTaobaoAccountResponse());
    }

    /**
     * @param request ValidateTaobaoAccountRequest
     * @return ValidateTaobaoAccountResponse
     */
    public ValidateTaobaoAccountResponse validateTaobaoAccount(ValidateTaobaoAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateTaobaoAccountWithOptions(request, runtime);
    }
}
