// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class CancelDistributionTradeRequest extends TeaModel {
    @NameInMap("DistributionTradeId")
    public String distributionTradeId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("TenantId")
    public String tenantId;

    public static CancelDistributionTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDistributionTradeRequest self = new CancelDistributionTradeRequest();
        return TeaModel.build(map, self);
    }

    public CancelDistributionTradeRequest setDistributionTradeId(String distributionTradeId) {
        this.distributionTradeId = distributionTradeId;
        return this;
    }
    public String getDistributionTradeId() {
        return this.distributionTradeId;
    }

    public CancelDistributionTradeRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public CancelDistributionTradeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
