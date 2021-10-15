// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateSettleConfirmRequest extends TeaModel {
    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("MerchantId")
    @Validation(required = true)
    public String merchantId;

    @NameInMap("OutRequestNo")
    @Validation(required = true)
    public String outRequestNo;

    @NameInMap("OutTradeNo")
    public String outTradeNo;

    @NameInMap("SettleInfo")
    @Validation(required = true)
    public String settleInfo;

    @NameInMap("TradeNo")
    public String tradeNo;

    public static CreateSettleConfirmRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSettleConfirmRequest self = new CreateSettleConfirmRequest();
        return TeaModel.build(map, self);
    }

    public CreateSettleConfirmRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CreateSettleConfirmRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreateSettleConfirmRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public CreateSettleConfirmRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public CreateSettleConfirmRequest setSettleInfo(String settleInfo) {
        this.settleInfo = settleInfo;
        return this;
    }
    public String getSettleInfo() {
        return this.settleInfo;
    }

    public CreateSettleConfirmRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
