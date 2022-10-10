// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ApplyDistributorMallRequest extends TeaModel {
    @NameInMap("DistributionMallType")
    public String distributionMallType;

    public static ApplyDistributorMallRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDistributorMallRequest self = new ApplyDistributorMallRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDistributorMallRequest setDistributionMallType(String distributionMallType) {
        this.distributionMallType = distributionMallType;
        return this;
    }
    public String getDistributionMallType() {
        return this.distributionMallType;
    }

}
