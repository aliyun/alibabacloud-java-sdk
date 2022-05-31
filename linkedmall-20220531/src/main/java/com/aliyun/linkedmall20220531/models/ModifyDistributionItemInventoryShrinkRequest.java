// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ModifyDistributionItemInventoryShrinkRequest extends TeaModel {
    // 业务号
    @NameInMap("BizId")
    public String bizId;

    // 分销商城id
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    // 商品id
    @NameInMap("ItemList")
    public String itemListShrink;

    public static ModifyDistributionItemInventoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDistributionItemInventoryShrinkRequest self = new ModifyDistributionItemInventoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDistributionItemInventoryShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyDistributionItemInventoryShrinkRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public ModifyDistributionItemInventoryShrinkRequest setItemListShrink(String itemListShrink) {
        this.itemListShrink = itemListShrink;
        return this;
    }
    public String getItemListShrink() {
        return this.itemListShrink;
    }

}
