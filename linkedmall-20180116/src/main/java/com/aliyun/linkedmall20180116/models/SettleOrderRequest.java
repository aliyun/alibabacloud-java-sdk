// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SettleOrderRequest extends TeaModel {
    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("MerchantId")
    public String merchantId;

    @NameInMap("OutRequestNo")
    public String outRequestNo;

    @NameInMap("OutTradeNo")
    public String outTradeNo;

    @NameInMap("RoyaltyParameters")
    public String royaltyParameters;

    @NameInMap("TradeNo")
    public String tradeNo;

    public static SettleOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        SettleOrderRequest self = new SettleOrderRequest();
        return TeaModel.build(map, self);
    }

    public SettleOrderRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public SettleOrderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SettleOrderRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public SettleOrderRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public SettleOrderRequest setRoyaltyParameters(String royaltyParameters) {
        this.royaltyParameters = royaltyParameters;
        return this;
    }
    public String getRoyaltyParameters() {
        return this.royaltyParameters;
    }

    public SettleOrderRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
