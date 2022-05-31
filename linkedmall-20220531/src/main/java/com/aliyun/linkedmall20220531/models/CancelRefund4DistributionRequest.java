// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class CancelRefund4DistributionRequest extends TeaModel {
    // 纠纷ID
    @NameInMap("DisputeId")
    public Long disputeId;

    // 分销商ID
    @NameInMap("DistributorId")
    public String distributorId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 子分销订单ID
    @NameInMap("SubDistributionOrderId")
    public String subDistributionOrderId;

    public static CancelRefund4DistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelRefund4DistributionRequest self = new CancelRefund4DistributionRequest();
        return TeaModel.build(map, self);
    }

    public CancelRefund4DistributionRequest setDisputeId(Long disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public Long getDisputeId() {
        return this.disputeId;
    }

    public CancelRefund4DistributionRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public CancelRefund4DistributionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelRefund4DistributionRequest setSubDistributionOrderId(String subDistributionOrderId) {
        this.subDistributionOrderId = subDistributionOrderId;
        return this;
    }
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

}
