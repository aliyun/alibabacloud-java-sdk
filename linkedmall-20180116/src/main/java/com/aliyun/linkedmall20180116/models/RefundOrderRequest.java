// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefundOrderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtInfo")
    public String extInfo;

    /**
     * <strong>example:</strong>
     * <p>64******721</p>
     */
    @NameInMap("MerchantId")
    public String merchantId;

    /**
     * <strong>example:</strong>
     * <p>4111584A-44D8-49B6-80BD-FACD0726054C</p>
     */
    @NameInMap("OutRequestNo")
    public String outRequestNo;

    /**
     * <strong>example:</strong>
     * <p>23******32727</p>
     */
    @NameInMap("OutTradeNo")
    public String outTradeNo;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("RefundAmount")
    public String refundAmount;

    @NameInMap("RefundReason")
    public String refundReason;

    @NameInMap("RefundRoyaltyParameters")
    public String refundRoyaltyParameters;

    /**
     * <strong>example:</strong>
     * <p>WH******27</p>
     */
    @NameInMap("TradeNo")
    public String tradeNo;

    public static RefundOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundOrderRequest self = new RefundOrderRequest();
        return TeaModel.build(map, self);
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

    public RefundOrderRequest setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public String getRefundAmount() {
        return this.refundAmount;
    }

    public RefundOrderRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

    public RefundOrderRequest setRefundRoyaltyParameters(String refundRoyaltyParameters) {
        this.refundRoyaltyParameters = refundRoyaltyParameters;
        return this;
    }
    public String getRefundRoyaltyParameters() {
        return this.refundRoyaltyParameters;
    }

    public RefundOrderRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
