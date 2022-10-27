// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryItemGuideRetailPriceShrinkRequest extends TeaModel {
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("LmItemIds")
    public String lmItemIdsShrink;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryItemGuideRetailPriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItemGuideRetailPriceShrinkRequest self = new QueryItemGuideRetailPriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryItemGuideRetailPriceShrinkRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public QueryItemGuideRetailPriceShrinkRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryItemGuideRetailPriceShrinkRequest setLmItemIdsShrink(String lmItemIdsShrink) {
        this.lmItemIdsShrink = lmItemIdsShrink;
        return this;
    }
    public String getLmItemIdsShrink() {
        return this.lmItemIdsShrink;
    }

    public QueryItemGuideRetailPriceShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
