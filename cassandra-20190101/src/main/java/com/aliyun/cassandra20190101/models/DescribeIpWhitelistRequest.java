// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeIpWhitelistRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeIpWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpWhitelistRequest self = new DescribeIpWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpWhitelistRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
