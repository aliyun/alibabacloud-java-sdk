// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCustomLogConfigResponseBody extends TeaModel {
    @NameInMap("Tag")
    public String tag;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("Sample")
    public String sample;

    public static DescribeCustomLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLogConfigResponseBody self = new DescribeCustomLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLogConfigResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public DescribeCustomLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomLogConfigResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeCustomLogConfigResponseBody setSample(String sample) {
        this.sample = sample;
        return this;
    }
    public String getSample() {
        return this.sample;
    }

}
