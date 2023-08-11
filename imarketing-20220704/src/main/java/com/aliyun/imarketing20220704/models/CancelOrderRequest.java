// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class CancelOrderRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("TradeId")
    public String tradeId;

    public static CancelOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderRequest self = new CancelOrderRequest();
        return TeaModel.build(map, self);
    }

    public CancelOrderRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CancelOrderRequest setTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }
    public String getTradeId() {
        return this.tradeId;
    }

}
