// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class InitApplyRefund4DistributionRequest extends TeaModel {
    // 退款类型
    @NameInMap("BizClaimType")
    public Integer bizClaimType;

    // 分销商ID
    @NameInMap("DistributorId")
    public String distributorId;

    // 货物状态
    @NameInMap("GoodsStatus")
    public Integer goodsStatus;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 子分销订单ID
    @NameInMap("SubDistributionOrderId")
    public String subDistributionOrderId;

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

    public InitApplyRefund4DistributionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitApplyRefund4DistributionRequest setSubDistributionOrderId(String subDistributionOrderId) {
        this.subDistributionOrderId = subDistributionOrderId;
        return this;
    }
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

}
