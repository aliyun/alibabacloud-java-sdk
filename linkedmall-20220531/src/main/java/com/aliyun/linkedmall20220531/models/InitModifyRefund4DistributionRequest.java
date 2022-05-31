// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class InitModifyRefund4DistributionRequest extends TeaModel {
    // 退款类型
    @NameInMap("BizClaimType")
    public Integer bizClaimType;

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

    public static InitModifyRefund4DistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        InitModifyRefund4DistributionRequest self = new InitModifyRefund4DistributionRequest();
        return TeaModel.build(map, self);
    }

    public InitModifyRefund4DistributionRequest setBizClaimType(Integer bizClaimType) {
        this.bizClaimType = bizClaimType;
        return this;
    }
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    public InitModifyRefund4DistributionRequest setDisputeId(Long disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public Long getDisputeId() {
        return this.disputeId;
    }

    public InitModifyRefund4DistributionRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public InitModifyRefund4DistributionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitModifyRefund4DistributionRequest setSubDistributionOrderId(String subDistributionOrderId) {
        this.subDistributionOrderId = subDistributionOrderId;
        return this;
    }
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

}
