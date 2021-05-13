// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsResourceUsageRequest extends TeaModel {
    // vm实例使用结束时间查询开始范围，格式： yyyy-MM-dd或yyyy-MM-dd HH:mm:ss
    @NameInMap("ExpiredStartTime")
    public String expiredStartTime;

    // vm实例使用结束时间查询结束范围，，格式： yyyy-MM-dd或yyyy-MM-dd HH:mm:ss
    @NameInMap("ExpiredEndTime")
    public String expiredEndTime;

    public static DescribeEnsResourceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsResourceUsageRequest self = new DescribeEnsResourceUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsResourceUsageRequest setExpiredStartTime(String expiredStartTime) {
        this.expiredStartTime = expiredStartTime;
        return this;
    }
    public String getExpiredStartTime() {
        return this.expiredStartTime;
    }

    public DescribeEnsResourceUsageRequest setExpiredEndTime(String expiredEndTime) {
        this.expiredEndTime = expiredEndTime;
        return this;
    }
    public String getExpiredEndTime() {
        return this.expiredEndTime;
    }

}
