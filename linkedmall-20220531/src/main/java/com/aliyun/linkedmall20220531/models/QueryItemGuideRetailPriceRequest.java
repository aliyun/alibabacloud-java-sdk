// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryItemGuideRetailPriceRequest extends TeaModel {
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("LmItemIds")
    public java.util.List<String> lmItemIds;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryItemGuideRetailPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItemGuideRetailPriceRequest self = new QueryItemGuideRetailPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryItemGuideRetailPriceRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public QueryItemGuideRetailPriceRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryItemGuideRetailPriceRequest setLmItemIds(java.util.List<String> lmItemIds) {
        this.lmItemIds = lmItemIds;
        return this;
    }
    public java.util.List<String> getLmItemIds() {
        return this.lmItemIds;
    }

    public QueryItemGuideRetailPriceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
