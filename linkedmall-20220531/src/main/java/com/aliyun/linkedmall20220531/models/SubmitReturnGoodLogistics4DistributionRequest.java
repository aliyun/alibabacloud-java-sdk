// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class SubmitReturnGoodLogistics4DistributionRequest extends TeaModel {
    // 公司代码
    @NameInMap("CpCode")
    public String cpCode;

    // 纠纷ID
    @NameInMap("DisputeId")
    public Long disputeId;

    // 分销商ID
    @NameInMap("DistributorId")
    public String distributorId;

    // 物流单号
    @NameInMap("LogisticsNo")
    public String logisticsNo;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 子分销订单ID
    @NameInMap("SubDistributionOrderId")
    public String subDistributionOrderId;

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

    public SubmitReturnGoodLogistics4DistributionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitReturnGoodLogistics4DistributionRequest setSubDistributionOrderId(String subDistributionOrderId) {
        this.subDistributionOrderId = subDistributionOrderId;
        return this;
    }
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

}
