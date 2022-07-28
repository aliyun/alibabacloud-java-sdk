// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class SubmitReturnGoodLogistics4DistributionRequest extends TeaModel {
    @NameInMap("CpCode")
    public String cpCode;

    @NameInMap("DisputeId")
    public Long disputeId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("LogisticsNo")
    public String logisticsNo;

    @NameInMap("SubDistributionOrderId")
    public String subDistributionOrderId;

    @NameInMap("TenantId")
    public String tenantId;

    public static SubmitReturnGoodLogistics4DistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitReturnGoodLogistics4DistributionRequest self = new SubmitReturnGoodLogistics4DistributionRequest();
        return TeaModel.build(map, self);
    }

    public SubmitReturnGoodLogistics4DistributionRequest setCpCode(String cpCode) {
        this.cpCode = cpCode;
        return this;
    }
    public String getCpCode() {
        return this.cpCode;
    }

    public SubmitReturnGoodLogistics4DistributionRequest setDisputeId(Long disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public Long getDisputeId() {
        return this.disputeId;
    }

    public SubmitReturnGoodLogistics4DistributionRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public SubmitReturnGoodLogistics4DistributionRequest setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
        return this;
    }
    public String getLogisticsNo() {
        return this.logisticsNo;
    }

    public SubmitReturnGoodLogistics4DistributionRequest setSubDistributionOrderId(String subDistributionOrderId) {
        this.subDistributionOrderId = subDistributionOrderId;
        return this;
    }
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

    public SubmitReturnGoodLogistics4DistributionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
