// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCustomLogConfigResponseBody extends TeaModel {
    /**
     * <p>The format of the log configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>$time_iso8601_$request_method_$</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>94E3559F-7B6A-4A5E-AFFD-44E2A208A249</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sample.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;[9/Jun/2015:01:58:09 +0800] 188.165.15.75 - 1542 \&quot;-\&quot; \&quot;GEThttp: //<a href="http://www.aliyun.com/index.html%5C%5C">www.aliyun.com/index.html\\</a>&quot; 200</p>
     */
    @NameInMap("Sample")
    public String sample;

    /**
     * <p>The tag information about the log configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>img1</p>
     */
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
