// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="~~~612397~~~">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1hx5n1o8f61****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time. The maximum time range that can be specified is two days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-03-11T15:01Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The performance metrics to be queried. Separate multiple values with commas (,). Valid values:</p>
     * <ul>
     * <li><p>CPU</p>
     * <ul>
     * <li><strong>AnalyticDB_CPU_Usage_Percentage</strong>: the average CPU utilization.</li>
     * </ul>
     * </li>
     * <li><p>Connections</p>
     * <ul>
     * <li><strong>AnalyticDB_Instance_Connection_Count</strong>: the number of database connections.</li>
     * </ul>
     * </li>
     * <li><p>Writes</p>
     * <ul>
     * <li><strong>AnalyticDB_TPS</strong>: the write transactions per second (TPS).</li>
     * <li><strong>AnalyticDB_InsertRT</strong>: the write response time.</li>
     * <li><strong>AnalyticDB_InsertBytes</strong>: the write throughput.</li>
     * </ul>
     * </li>
     * <li><p>Queries</p>
     * <ul>
     * <li><strong>AnalyticDB_QPS</strong>: the queries per second (QPS).</li>
     * <li><strong>AnalyticDB_QueryRT</strong>: the query response time.</li>
     * <li><strong>AnalyticDB_QueryWaitTime</strong>: the query wait time.</li>
     * </ul>
     * </li>
     * <li><p>Disks</p>
     * <ul>
     * <li><strong>AnalyticDB_Disk_IO_Avg_Usage_Percentage</strong>: the average I/O utilization.</li>
     * <li><strong>AnalyticDB_Disk_IO_Avg_Waiting_Time</strong>: the average I/O wait time.</li>
     * <li><strong>AnalyticDB_IO_Throughput</strong>: the disk throughput.</li>
     * <li><strong>AnalyticDB_IOPS</strong>: the disk IOPS.</li>
     * <li><strong>AnalyticDB_Disk_Usage</strong>: the disk space that is used.</li>
     * <li><strong>AnalyticDB_Disk_Usage_Percentage</strong>: the disk usage.</li>
     * <li><strong>AnalyticDB_Hot_Data_Usage</strong>: the disk space that is used by hot data.</li>
     * <li><strong>AnalyticDB_Cold_Data_Usage</strong>: the disk space that is used by code data.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> This parameter must be specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AnalyticDB_CPU_Usage_Percentage</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/612393.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>user_default</p>
     */
    @NameInMap("ResourcePools")
    public String resourcePools;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
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
