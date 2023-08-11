// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class QueryOrderRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ChannelTradeId")
    public String channelTradeId;

    @NameInMap("TradeId")
    public String tradeId;

    public static QueryOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderRequest self = new QueryOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryOrderRequest setChannelTradeId(String channelTradeId) {
        this.channelTradeId = channelTradeId;
        return this;
    }
    public String getChannelTradeId() {
        return this.channelTradeId;
    }

    public QueryOrderRequest setTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }
    public String getTradeId() {
        return this.tradeId;
    }

}
