// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ShopCreateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12344335</p>
     */
    @NameInMap("afterSaleDingTalkId")
    public String afterSaleDingTalkId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>店铺描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12344335</p>
     */
    @NameInMap("operatorDingTalkId")
    public String operatorDingTalkId;

    /**
     * <strong>example:</strong>
     * <p>12344335</p>
     */
    @NameInMap("preSaleDingTalkId")
    public String preSaleDingTalkId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>店铺名称</p>
     */
    @NameInMap("shopName")
    public String shopName;

    public static ShopCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ShopCreateRequest self = new ShopCreateRequest();
        return TeaModel.build(map, self);
    }

    public ShopCreateRequest setAfterSaleDingTalkId(String afterSaleDingTalkId) {
        this.afterSaleDingTalkId = afterSaleDingTalkId;
        return this;
    }
    public String getAfterSaleDingTalkId() {
        return this.afterSaleDingTalkId;
    }

    public ShopCreateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ShopCreateRequest setOperatorDingTalkId(String operatorDingTalkId) {
        this.operatorDingTalkId = operatorDingTalkId;
        return this;
    }
    public String getOperatorDingTalkId() {
        return this.operatorDingTalkId;
    }

    public ShopCreateRequest setPreSaleDingTalkId(String preSaleDingTalkId) {
        this.preSaleDingTalkId = preSaleDingTalkId;
        return this;
    }
    public String getPreSaleDingTalkId() {
        return this.preSaleDingTalkId;
    }

    public ShopCreateRequest setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }
    public String getShopName() {
        return this.shopName;
    }

}
