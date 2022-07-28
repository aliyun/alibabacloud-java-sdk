// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class InitModifyRefund4DistributionRequest extends TeaModel {
    @NameInMap("BizClaimType")
    public Integer bizClaimType;

    @NameInMap("DisputeId")
    public Long disputeId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("SubDistributionOrderId")
    public String subDistributionOrderId;

    @NameInMap("TenantId")
    public String tenantId;

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

    public InitModifyRefund4DistributionRequest setSubDistributionOrderId(String subDistributionOrderId) {
        this.subDistributionOrderId = subDistributionOrderId;
        return this;
    }
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

    public InitModifyRefund4DistributionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
