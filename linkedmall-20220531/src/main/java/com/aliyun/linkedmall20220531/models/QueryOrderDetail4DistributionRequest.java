// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryOrderDetail4DistributionRequest extends TeaModel {
    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("MainDistributionOrderId")
    public String mainDistributionOrderId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryOrderDetail4DistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderDetail4DistributionRequest self = new QueryOrderDetail4DistributionRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderDetail4DistributionRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryOrderDetail4DistributionRequest setMainDistributionOrderId(String mainDistributionOrderId) {
        this.mainDistributionOrderId = mainDistributionOrderId;
        return this;
    }
    public String getMainDistributionOrderId() {
        return this.mainDistributionOrderId;
    }

    public QueryOrderDetail4DistributionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
