// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkRules")
    public String networkRules;

    public static DescribeHealthCheckStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckStatusRequest self = new DescribeHealthCheckStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckStatusRequest setNetworkRules(String networkRules) {
        this.networkRules = networkRules;
        return this;
    }
    public String getNetworkRules() {
        return this.networkRules;
    }

}
