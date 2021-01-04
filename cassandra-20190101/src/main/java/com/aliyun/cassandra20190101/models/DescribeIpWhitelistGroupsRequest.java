// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeIpWhitelistGroupsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeIpWhitelistGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpWhitelistGroupsRequest self = new DescribeIpWhitelistGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpWhitelistGroupsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
