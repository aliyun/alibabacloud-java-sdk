// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryRefundApplicationDetail4DistributionRequest extends TeaModel {
    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("SubDistributionOrderId")
    public String subDistributionOrderId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryRefundApplicationDetail4DistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRefundApplicationDetail4DistributionRequest self = new QueryRefundApplicationDetail4DistributionRequest();
        return TeaModel.build(map, self);
    }

    public QueryRefundApplicationDetail4DistributionRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryRefundApplicationDetail4DistributionRequest setSubDistributionOrderId(String subDistributionOrderId) {
        this.subDistributionOrderId = subDistributionOrderId;
        return this;
    }
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

    public QueryRefundApplicationDetail4DistributionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
