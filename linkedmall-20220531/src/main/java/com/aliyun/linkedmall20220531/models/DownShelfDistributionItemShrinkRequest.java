// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class DownShelfDistributionItemShrinkRequest extends TeaModel {
    // 业务号
    @NameInMap("BizId")
    public String bizId;

    // 分销商城id
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    // lm商品id
    @NameInMap("LmItemIds")
    public String lmItemIdsShrink;

    public static DownShelfDistributionItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DownShelfDistributionItemShrinkRequest self = new DownShelfDistributionItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DownShelfDistributionItemShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DownShelfDistributionItemShrinkRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public DownShelfDistributionItemShrinkRequest setLmItemIdsShrink(String lmItemIdsShrink) {
        this.lmItemIdsShrink = lmItemIdsShrink;
        return this;
    }
    public String getLmItemIdsShrink() {
        return this.lmItemIdsShrink;
    }

}
