// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyDistributionMallRequest extends TeaModel {
    // 商城名称
    @NameInMap("DistributionMallName")
    public String distributionMallName;

    // 分销商id
    @NameInMap("DistributorId")
    public String distributorId;

    // 备注
    @NameInMap("Remark")
    public String remark;

    public static ApplyDistributionMallRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDistributionMallRequest self = new ApplyDistributionMallRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDistributionMallRequest setDistributionMallName(String distributionMallName) {
        this.distributionMallName = distributionMallName;
        return this;
    }
    public String getDistributionMallName() {
        return this.distributionMallName;
    }

    public ApplyDistributionMallRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public ApplyDistributionMallRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
