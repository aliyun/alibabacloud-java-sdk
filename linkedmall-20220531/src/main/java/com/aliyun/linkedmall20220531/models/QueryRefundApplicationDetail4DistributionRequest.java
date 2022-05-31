// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryRefundApplicationDetail4DistributionRequest extends TeaModel {
    // 分销商ID
    @NameInMap("DistributorId")
    public String distributorId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 子分销订单ID
    @NameInMap("SubDistributionOrderId")
    public String subDistributionOrderId;

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

    public QueryRefundApplicationDetail4DistributionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRefundApplicationDetail4DistributionRequest setSubDistributionOrderId(String subDistributionOrderId) {
        this.subDistributionOrderId = subDistributionOrderId;
        return this;
    }
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

}
