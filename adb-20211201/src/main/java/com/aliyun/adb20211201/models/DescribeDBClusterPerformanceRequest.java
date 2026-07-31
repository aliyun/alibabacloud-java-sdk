// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceRequest extends TeaModel {
    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of an enterprise edition, basic edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of a Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="~~~612397~~~">DescribeDBClusters</a> operation to query the IDs of all clusters in a specific region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1hx5n1o8f61****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range. The time is in UTC and must be in the <em>yyyy-MM-ddTHH:mmZ</em> format.</p>
     * <blockquote>
     * <p>The end time must be later than the start time. The time range cannot exceed two days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-03-11T15:01Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The key of the performance metric. Separate multiple keys with commas (,). For a list of supported metrics, see <a href="https://help.aliyun.com/document_detail/2863211.html">metric overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>AnalyticDB_CPU_Usage_Percentage</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/612393.html">DescribeRegions</a> operation to query the regions and availability zones supported by AnalyticDB for MySQL, including the region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the resource pool.</p>
     * 
     * <strong>example:</strong>
     * <p>user_default</p>
     */
    @NameInMap("ResourcePools")
    public String resourcePools;

    /**
     * <p>The start of the time range. The time is in UTC and must be in the <em>yyyy-MM-ddTHH:mmZ</em> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-10T23:56Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBClusterPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPerformanceRequest self = new DescribeDBClusterPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterPerformanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBClusterPerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDBClusterPerformanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBClusterPerformanceRequest setResourcePools(String resourcePools) {
        this.resourcePools = resourcePools;
        return this;
    }
    public String getResourcePools() {
        return this.resourcePools;
    }

    public DescribeDBClusterPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
