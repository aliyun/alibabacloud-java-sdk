// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsResourceUsageRequest extends TeaModel {
    @NameInMap("ExpiredEndTime")
    public String expiredEndTime;

    @NameInMap("ExpiredStartTime")
    public String expiredStartTime;

    public static DescribeEnsResourceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsResourceUsageRequest self = new DescribeEnsResourceUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsResourceUsageRequest setExpiredEndTime(String expiredEndTime) {
        this.expiredEndTime = expiredEndTime;
        return this;
    }
    public String getExpiredEndTime() {
        return this.expiredEndTime;
    }

    public DescribeEnsResourceUsageRequest setExpiredStartTime(String expiredStartTime) {
        this.expiredStartTime = expiredStartTime;
        return this;
    }
    public String getExpiredStartTime() {
        return this.expiredStartTime;
    }

}
