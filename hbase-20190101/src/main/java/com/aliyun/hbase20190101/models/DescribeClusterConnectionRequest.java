// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeClusterConnectionRequest extends TeaModel {
    /**
     * <p>The ID of target instance. You can call the <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> operation to obtain target instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp150tns0sjxs****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/144489.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
