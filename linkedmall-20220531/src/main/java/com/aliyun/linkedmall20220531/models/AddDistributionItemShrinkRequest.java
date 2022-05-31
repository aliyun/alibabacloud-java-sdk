// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class AddDistributionItemShrinkRequest extends TeaModel {
    // 业务号
    @NameInMap("BizId")
    public String bizId;

    // 分销商城id
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    // 商品id
    @NameInMap("LmItemIds")
    public String lmItemIdsShrink;

    public static AddDistributionItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDistributionItemShrinkRequest self = new AddDistributionItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddDistributionItemShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AddDistributionItemShrinkRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public AddDistributionItemShrinkRequest setLmItemIdsShrink(String lmItemIdsShrink) {
        this.lmItemIdsShrink = lmItemIdsShrink;
        return this;
    }
    public String getLmItemIdsShrink() {
        return this.lmItemIdsShrink;
    }

}
