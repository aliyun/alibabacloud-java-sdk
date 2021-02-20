// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckStatusRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("NetworkRules")
    public String networkRules;

    public static DescribeHealthCheckStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckStatusRequest self = new DescribeHealthCheckStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeHealthCheckStatusRequest setNetworkRules(String networkRules) {
        this.networkRules = networkRules;
        return this;
    }
    public String getNetworkRules() {
        return this.networkRules;
    }

}
