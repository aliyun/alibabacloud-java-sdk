// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeMultiZoneClusterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeMultiZoneClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiZoneClusterRequest self = new DescribeMultiZoneClusterRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMultiZoneClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
