// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeServerlessClusterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp16f1441y6p2****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdh0b7f4k5f****</p>
     */
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
