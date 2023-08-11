// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ConfirmSampleReceivedRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("TradeId")
    public String tradeId;

    public static ConfirmSampleReceivedRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmSampleReceivedRequest self = new ConfirmSampleReceivedRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmSampleReceivedRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public ConfirmSampleReceivedRequest setTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }
    public String getTradeId() {
        return this.tradeId;
    }

}
