// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RenderOrderWithDesignatedTbUidShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DeliveryAddress")
    public String deliveryAddress;

    @NameInMap("ItemList")
    public String itemListShrink;

    @NameInMap("TbAccountType")
    public String tbAccountType;

    @NameInMap("TbUserId")
    public Long tbUserId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static RenderOrderWithDesignatedTbUidShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RenderOrderWithDesignatedTbUidShrinkRequest self = new RenderOrderWithDesignatedTbUidShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RenderOrderWithDesignatedTbUidShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RenderOrderWithDesignatedTbUidShrinkRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public RenderOrderWithDesignatedTbUidShrinkRequest setItemListShrink(String itemListShrink) {
        this.itemListShrink = itemListShrink;
        return this;
    }
    public String getItemListShrink() {
        return this.itemListShrink;
    }

    public RenderOrderWithDesignatedTbUidShrinkRequest setTbAccountType(String tbAccountType) {
        this.tbAccountType = tbAccountType;
        return this;
    }
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    public RenderOrderWithDesignatedTbUidShrinkRequest setTbUserId(Long tbUserId) {
        this.tbUserId = tbUserId;
        return this;
    }
    public Long getTbUserId() {
        return this.tbUserId;
    }

    public RenderOrderWithDesignatedTbUidShrinkRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
