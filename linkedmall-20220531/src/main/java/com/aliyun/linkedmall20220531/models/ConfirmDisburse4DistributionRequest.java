// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ConfirmDisburse4DistributionRequest extends TeaModel {
    @NameInMap("DistributionTradeId")
    public String distributionTradeId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("MainDistributionOrderId")
    public String mainDistributionOrderId;

    @NameInMap("TenantId")
    public String tenantId;

    public static ConfirmDisburse4DistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmDisburse4DistributionRequest self = new ConfirmDisburse4DistributionRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmDisburse4DistributionRequest setDistributionTradeId(String distributionTradeId) {
        this.distributionTradeId = distributionTradeId;
        return this;
    }
    public String getDistributionTradeId() {
        return this.distributionTradeId;
    }

    public ConfirmDisburse4DistributionRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public ConfirmDisburse4DistributionRequest setMainDistributionOrderId(String mainDistributionOrderId) {
        this.mainDistributionOrderId = mainDistributionOrderId;
        return this;
    }
    public String getMainDistributionOrderId() {
        return this.mainDistributionOrderId;
    }

    public ConfirmDisburse4DistributionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
