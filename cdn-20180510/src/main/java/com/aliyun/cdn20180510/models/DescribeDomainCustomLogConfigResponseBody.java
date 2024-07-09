// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCustomLogConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the log configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ConfigId")
    public String configId;

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
     * <p>The sample log configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>[9/Jun/2015:01:58:09+0800]188.165.15.75-1542\&quot;-\&quot;\&quot;GET <a href="http://www.aliyun.com/index.html%5C%5C">http://www.aliyun.com/index.html\\</a></p>
     */
    @NameInMap("Sample")
    public String sample;

    /**
     * <p>The tag information about the log configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>book</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static DescribeDomainCustomLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCustomLogConfigResponseBody self = new DescribeDomainCustomLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCustomLogConfigResponseBody setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public DescribeDomainCustomLogConfigResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeDomainCustomLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainCustomLogConfigResponseBody setSample(String sample) {
        this.sample = sample;
        return this;
    }
    public String getSample() {
        return this.sample;
    }

    public DescribeDomainCustomLogConfigResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
