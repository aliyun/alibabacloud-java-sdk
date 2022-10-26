// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOutDiscountOrderWithDesignatedTbUidRequest extends TeaModel {
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

    @NameInMap("OutDiscountInfos")
    public String outDiscountInfos;

    @NameInMap("OutTradeId")
    public String outTradeId;

    @NameInMap("TbAccountType")
    public String tbAccountType;

    @NameInMap("TbUserId")
    public Long tbUserId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static CreateOutDiscountOrderWithDesignatedTbUidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOutDiscountOrderWithDesignatedTbUidRequest self = new CreateOutDiscountOrderWithDesignatedTbUidRequest();
        return TeaModel.build(map, self);
    }

    public CreateOutDiscountOrderWithDesignatedTbUidRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateOutDiscountOrderWithDesignatedTbUidRequest setBuyerMessages(String buyerMessages) {
        this.buyerMessages = buyerMessages;
        return this;
    }
    public String getBuyerMessages() {
        return this.buyerMessages;
    }

    public CreateOutDiscountOrderWithDesignatedTbUidRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public CreateOutDiscountOrderWithDesignatedTbUidRequest setDeliveryInfo(String deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
        return this;
    }
    public String getDeliveryInfo() {
        return this.deliveryInfo;
    }

    public CreateOutDiscountOrderWithDesignatedTbUidRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CreateOutDiscountOrderWithDesignatedTbUidRequest setOrderExpireTime(Long orderExpireTime) {
        this.orderExpireTime = orderExpireTime;
        return this;
    }
    public Long getOrderExpireTime() {
        return this.orderExpireTime;
    }

    public CreateOutDiscountOrderWithDesignatedTbUidRequest setOrderItems(String orderItems) {
        this.orderItems = orderItems;
        return this;
    }
    public String getOrderItems() {
        return this.orderItems;
    }

    public CreateOutDiscountOrderWithDesignatedTbUidRequest setOutDiscountInfos(String outDiscountInfos) {
        this.outDiscountInfos = outDiscountInfos;
        return this;
    }
    public String getOutDiscountInfos() {
        return this.outDiscountInfos;
    }

    public CreateOutDiscountOrderWithDesignatedTbUidRequest setOutTradeId(String outTradeId) {
        this.outTradeId = outTradeId;
        return this;
    }
    public String getOutTradeId() {
        return this.outTradeId;
    }

    public CreateOutDiscountOrderWithDesignatedTbUidRequest setTbAccountType(String tbAccountType) {
        this.tbAccountType = tbAccountType;
        return this;
    }
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    public CreateOutDiscountOrderWithDesignatedTbUidRequest setTbUserId(Long tbUserId) {
        this.tbUserId = tbUserId;
        return this;
    }
    public Long getTbUserId() {
        return this.tbUserId;
    }

    public CreateOutDiscountOrderWithDesignatedTbUidRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
