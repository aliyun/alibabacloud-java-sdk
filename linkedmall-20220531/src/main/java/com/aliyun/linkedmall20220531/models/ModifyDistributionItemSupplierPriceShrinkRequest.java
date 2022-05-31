// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ModifyDistributionItemSupplierPriceShrinkRequest extends TeaModel {
    // 业务号
    @NameInMap("BizId")
    public String bizId;

    // 分销商城id
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    // 商品id
    @NameInMap("ItemList")
    public String itemListShrink;

    public static ModifyDistributionItemSupplierPriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDistributionItemSupplierPriceShrinkRequest self = new ModifyDistributionItemSupplierPriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDistributionItemSupplierPriceShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyDistributionItemSupplierPriceShrinkRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public ModifyDistributionItemSupplierPriceShrinkRequest setItemListShrink(String itemListShrink) {
        this.itemListShrink = itemListShrink;
        return this;
    }
    public String getItemListShrink() {
        return this.itemListShrink;
    }

}
