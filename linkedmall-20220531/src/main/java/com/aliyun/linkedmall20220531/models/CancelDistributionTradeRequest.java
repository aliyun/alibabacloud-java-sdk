// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class CancelDistributionTradeRequest extends TeaModel {
    // 分销交易号
    @NameInMap("DistributionTradeId")
    public String distributionTradeId;

    // 分销商ID
    @NameInMap("DistributorId")
    public String distributorId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

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

    public CancelDistributionTradeRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
