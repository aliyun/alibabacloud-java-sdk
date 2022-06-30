// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckListRequest extends TeaModel {
    @NameInMap("NetworkRules")
    public String networkRules;

    public static DescribeHealthCheckListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckListRequest self = new DescribeHealthCheckListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckListRequest setNetworkRules(String networkRules) {
        this.networkRules = networkRules;
        return this;
    }
    public String getNetworkRules() {
        return this.networkRules;
    }

}
