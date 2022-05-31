// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ConfirmDisburse4DistributionRequest extends TeaModel {
    // 分销交易号
    @NameInMap("DistributionTradeId")
    public String distributionTradeId;

    // 分销商ID
    @NameInMap("DistributorId")
    public String distributorId;

    // 主分销订单号
    @NameInMap("MainDistributionOrderId")
    public String mainDistributionOrderId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

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

    public ConfirmDisburse4DistributionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
