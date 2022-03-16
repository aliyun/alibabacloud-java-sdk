// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeServerlessClusterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeServerlessClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerlessClusterRequest self = new DescribeServerlessClusterRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServerlessClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeServerlessClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
