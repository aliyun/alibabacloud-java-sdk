// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeClusterConnectionRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeClusterConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterConnectionRequest self = new DescribeClusterConnectionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterConnectionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
