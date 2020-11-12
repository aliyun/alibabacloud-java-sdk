// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SettleOrderRequest extends TeaModel {
    @NameInMap("OutRequestNo")
    public String outRequestNo;

    @NameInMap("TradeNo")
    public String tradeNo;

    @NameInMap("RoyaltyParameters")
    public String royaltyParameters;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("OutTradeNo")
    public String outTradeNo;

    @NameInMap("MerchantId")
    public String merchantId;

    public static SettleOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        SettleOrderRequest self = new SettleOrderRequest();
        return TeaModel.build(map, self);
    }

    public SettleOrderRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public SettleOrderRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public SettleOrderRequest setRoyaltyParameters(String royaltyParameters) {
        this.royaltyParameters = royaltyParameters;
        return this;
    }
    public String getRoyaltyParameters() {
        return this.royaltyParameters;
    }

    public SettleOrderRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public SettleOrderRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public SettleOrderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
