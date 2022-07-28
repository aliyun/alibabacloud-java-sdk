// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryItemDetailRequest extends TeaModel {
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("LmItemId")
    public String lmItemId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryItemDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailRequest self = new QueryItemDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public QueryItemDetailRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryItemDetailRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public QueryItemDetailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
