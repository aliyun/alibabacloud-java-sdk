// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyUsageRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("StartDate")
    @Validation(required = true)
    public String startDate;

    @NameInMap("EndDate")
    @Validation(required = true)
    public String endDate;

    public static DescribeVerifyUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyUsageRequest self = new DescribeVerifyUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyUsageRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeVerifyUsageRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeVerifyUsageRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

}
