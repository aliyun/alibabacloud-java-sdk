// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefundOrderRequest extends TeaModel {
    @NameInMap("OutRequestNo")
    public String outRequestNo;

    @NameInMap("OutTradeNo")
    public String outTradeNo;

    @NameInMap("TradeNo")
    public String tradeNo;

    @NameInMap("RefundReason")
    public String refundReason;

    @NameInMap("RefundAmount")
    public String refundAmount;

    @NameInMap("RefundRoyaltyParameters")
    public String refundRoyaltyParameters;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("MerchantId")
    public String merchantId;

    public static RefundOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundOrderRequest self = new RefundOrderRequest();
        return TeaModel.build(map, self);
    }

    public RefundOrderRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public RefundOrderRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public RefundOrderRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public RefundOrderRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

    public RefundOrderRequest setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public String getRefundAmount() {
        return this.refundAmount;
    }

    public RefundOrderRequest setRefundRoyaltyParameters(String refundRoyaltyParameters) {
        this.refundRoyaltyParameters = refundRoyaltyParameters;
        return this;
    }
    public String getRefundRoyaltyParameters() {
        return this.refundRoyaltyParameters;
    }

    public RefundOrderRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public RefundOrderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
