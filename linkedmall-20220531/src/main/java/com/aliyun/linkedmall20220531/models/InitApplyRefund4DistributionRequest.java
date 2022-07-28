// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class InitApplyRefund4DistributionRequest extends TeaModel {
    @NameInMap("BizClaimType")
    public Integer bizClaimType;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("GoodsStatus")
    public Integer goodsStatus;

    @NameInMap("SubDistributionOrderId")
    public String subDistributionOrderId;

    @NameInMap("TenantId")
    public String tenantId;

    public static InitApplyRefund4DistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        InitApplyRefund4DistributionRequest self = new InitApplyRefund4DistributionRequest();
        return TeaModel.build(map, self);
    }

    public InitApplyRefund4DistributionRequest setBizClaimType(Integer bizClaimType) {
        this.bizClaimType = bizClaimType;
        return this;
    }
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    public InitApplyRefund4DistributionRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public InitApplyRefund4DistributionRequest setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    public InitApplyRefund4DistributionRequest setSubDistributionOrderId(String subDistributionOrderId) {
        this.subDistributionOrderId = subDistributionOrderId;
        return this;
    }
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

    public InitApplyRefund4DistributionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
