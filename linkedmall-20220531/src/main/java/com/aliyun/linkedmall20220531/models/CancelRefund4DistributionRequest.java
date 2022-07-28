// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class CancelRefund4DistributionRequest extends TeaModel {
    @NameInMap("DisputeId")
    public Long disputeId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("SubDistributionOrderId")
    public String subDistributionOrderId;

    @NameInMap("TenantId")
    public String tenantId;

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

    public CancelRefund4DistributionRequest setSubDistributionOrderId(String subDistributionOrderId) {
        this.subDistributionOrderId = subDistributionOrderId;
        return this;
    }
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

    public CancelRefund4DistributionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
