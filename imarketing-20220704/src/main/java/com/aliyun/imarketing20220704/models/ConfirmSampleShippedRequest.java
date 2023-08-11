// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ConfirmSampleShippedRequest extends TeaModel {
    @NameInMap("BuyerAddress")
    public String buyerAddress;

    @NameInMap("BuyerName")
    public String buyerName;

    @NameInMap("BuyerPhoneNumber")
    public String buyerPhoneNumber;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("TradeId")
    public String tradeId;

    public static ConfirmSampleShippedRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmSampleShippedRequest self = new ConfirmSampleShippedRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmSampleShippedRequest setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
        return this;
    }
    public String getBuyerAddress() {
        return this.buyerAddress;
    }

    public ConfirmSampleShippedRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public ConfirmSampleShippedRequest setBuyerPhoneNumber(String buyerPhoneNumber) {
        this.buyerPhoneNumber = buyerPhoneNumber;
        return this;
    }
    public String getBuyerPhoneNumber() {
        return this.buyerPhoneNumber;
    }

    public ConfirmSampleShippedRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public ConfirmSampleShippedRequest setTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }
    public String getTradeId() {
        return this.tradeId;
    }

}
