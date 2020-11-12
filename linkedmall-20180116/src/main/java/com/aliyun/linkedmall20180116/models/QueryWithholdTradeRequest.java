// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryWithholdTradeRequest extends TeaModel {
    @NameInMap("TradeNo")
    public String tradeNo;

    @NameInMap("OutTradeNo")
    public String outTradeNo;

    @NameInMap("MerchantId")
    public String merchantId;

    public static QueryWithholdTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWithholdTradeRequest self = new QueryWithholdTradeRequest();
        return TeaModel.build(map, self);
    }

    public QueryWithholdTradeRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryWithholdTradeRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public QueryWithholdTradeRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
