// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryOrderDetail4DistributionRequest extends TeaModel {
    // 分销商ID
    @NameInMap("DistributorId")
    public String distributorId;

    // 主分销订单号
    @NameInMap("MainDistributionOrderId")
    public String mainDistributionOrderId;

    // 请求标识
    @NameInMap("RequestId")
    public String requestId;

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

    public QueryOrderDetail4DistributionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
