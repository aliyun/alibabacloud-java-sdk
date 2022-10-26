// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderWithDesignatedTbUidRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BuyerMessages")
    public String buyerMessages;

    @NameInMap("DeliveryAddress")
    public String deliveryAddress;

    @NameInMap("DeliveryInfo")
    public String deliveryInfo;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("OrderExpireTime")
    public Long orderExpireTime;

    @NameInMap("OrderItems")
    public String orderItems;

    @NameInMap("OutTradeId")
    public String outTradeId;

    @NameInMap("TbAccountType")
    public String tbAccountType;

    @NameInMap("TbUserId")
    public Long tbUserId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static CreateOrderWithDesignatedTbUidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderWithDesignatedTbUidRequest self = new CreateOrderWithDesignatedTbUidRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderWithDesignatedTbUidRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateOrderWithDesignatedTbUidRequest setBuyerMessages(String buyerMessages) {
        this.buyerMessages = buyerMessages;
        return this;
    }
    public String getBuyerMessages() {
        return this.buyerMessages;
    }

    public CreateOrderWithDesignatedTbUidRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public CreateOrderWithDesignatedTbUidRequest setDeliveryInfo(String deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
        return this;
    }
    public String getDeliveryInfo() {
        return this.deliveryInfo;
    }

    public CreateOrderWithDesignatedTbUidRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CreateOrderWithDesignatedTbUidRequest setOrderExpireTime(Long orderExpireTime) {
        this.orderExpireTime = orderExpireTime;
        return this;
    }
    public Long getOrderExpireTime() {
        return this.orderExpireTime;
    }

    public CreateOrderWithDesignatedTbUidRequest setOrderItems(String orderItems) {
        this.orderItems = orderItems;
        return this;
    }
    public String getOrderItems() {
        return this.orderItems;
    }

    public CreateOrderWithDesignatedTbUidRequest setOutTradeId(String outTradeId) {
        this.outTradeId = outTradeId;
        return this;
    }
    public String getOutTradeId() {
        return this.outTradeId;
    }

    public CreateOrderWithDesignatedTbUidRequest setTbAccountType(String tbAccountType) {
        this.tbAccountType = tbAccountType;
        return this;
    }
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    public CreateOrderWithDesignatedTbUidRequest setTbUserId(Long tbUserId) {
        this.tbUserId = tbUserId;
        return this;
    }
    public Long getTbUserId() {
        return this.tbUserId;
    }

    public CreateOrderWithDesignatedTbUidRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
