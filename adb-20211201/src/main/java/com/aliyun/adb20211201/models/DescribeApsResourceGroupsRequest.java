// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsResourceGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/612397.html">DescribeDBClusters</a> operation to view the cluster ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1t6rym21****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to view the region ID of a cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the data synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>aps-hz1686v37sx****</p>
     */
    @NameInMap("WorkloadId")
    public String workloadId;

    public static DescribeApsResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsResourceGroupsRequest self = new DescribeApsResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApsResourceGroupsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeApsResourceGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApsResourceGroupsRequest setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
        return this;
    }
    public String getWorkloadId() {
        return this.workloadId;
    }

}
