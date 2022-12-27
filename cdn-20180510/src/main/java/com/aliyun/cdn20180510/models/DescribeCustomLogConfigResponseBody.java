// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCustomLogConfigResponseBody extends TeaModel {
    // The format of the log configuration.
    @NameInMap("Remark")
    public String remark;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // A sample log configuration.
    @NameInMap("Sample")
    public String sample;

    // The tag information about the log configuration.
    @NameInMap("Tag")
    public String tag;

    public static DescribeCustomLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLogConfigResponseBody self = new DescribeCustomLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLogConfigResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeCustomLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomLogConfigResponseBody setSample(String sample) {
        this.sample = sample;
        return this;
    }
    public String getSample() {
        return this.sample;
    }

    public DescribeCustomLogConfigResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
