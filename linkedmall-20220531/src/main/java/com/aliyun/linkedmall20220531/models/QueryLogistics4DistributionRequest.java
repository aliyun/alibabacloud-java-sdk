// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryLogistics4DistributionRequest extends TeaModel {
    // 分销商ID
    @NameInMap("DistributorId")
    public String distributorId;

    // 主分销订单号
    @NameInMap("MainDistributionOrderId")
    public String mainDistributionOrderId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static QueryLogistics4DistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLogistics4DistributionRequest self = new QueryLogistics4DistributionRequest();
        return TeaModel.build(map, self);
    }

    public QueryLogistics4DistributionRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryLogistics4DistributionRequest setMainDistributionOrderId(String mainDistributionOrderId) {
        this.mainDistributionOrderId = mainDistributionOrderId;
        return this;
    }
    public String getMainDistributionOrderId() {
        return this.mainDistributionOrderId;
    }

    public QueryLogistics4DistributionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
