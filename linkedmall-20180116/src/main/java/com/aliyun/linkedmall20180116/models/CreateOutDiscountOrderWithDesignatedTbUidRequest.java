// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOutDiscountOrderWithDesignatedTbUidRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL2022***01</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("BuyerMessages")
    public String buyerMessages;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeliveryAddress")
    public String deliveryAddress;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;id\&quot;:\&quot;20\&quot;,\&quot;postFee\&quot;:0,\&quot;serviceType\&quot;:-4}</p>
     */
    @NameInMap("DeliveryInfo")
    public String deliveryInfo;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtInfo")
    public String extInfo;

    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("OrderExpireTime")
    public Long orderExpireTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;lmItemId\&quot;:\&quot;100<em><strong>1-6300</strong></em>472\&quot;,\&quot;number\&quot;:1,\&quot;outDiscountFee\&quot;:\&quot;6810\&quot;,\&quot;price\&quot;:\&quot;8800\&quot;,\&quot;skuId\&quot;:4649***225}]</p>
     */
    @NameInMap("OrderItems")
    public String orderItems;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;promotionInfos\&quot;:[{\&quot;discountFee\&quot;:\&quot;10000\&quot;,\&quot;promotionInstanceId\&quot;:\&quot;{\\\&quot;couponId\\\&quot;:\\\&quot;136807<em><strong>98136\\\&quot;,\\\&quot;couponTemplateId\\\&quot;:\\\&quot;50</strong></em>5\\\&quot;}\&quot;}],\&quot;totalDiscountFee\&quot;:\&quot;10000\&quot;}</p>
     */
    @NameInMap("OutDiscountInfos")
    public String outDiscountInfos;

    /**
     * <strong>example:</strong>
     * <p>134860***596130</p>
     */
    @NameInMap("OutTradeId")
    public String outTradeId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ANONY</p>
     */
    @NameInMap("TbAccountType")
    public String tbAccountType;

    /**
     * <strong>example:</strong>
     * <p>321**123</p>
     */
    @NameInMap("TbUserId")
    public Long tbUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user***001</p>
     */
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
