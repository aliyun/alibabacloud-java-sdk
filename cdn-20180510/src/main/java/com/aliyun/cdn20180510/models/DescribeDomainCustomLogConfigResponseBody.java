// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCustomLogConfigResponseBody extends TeaModel {
    // The ID of the log configuration.
    @NameInMap("ConfigId")
    public String configId;

    // The format of the log configuration.
    @NameInMap("Remark")
    public String remark;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The sample log configuration.
    @NameInMap("Sample")
    public String sample;

    // The tag information about the log configuration.
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
