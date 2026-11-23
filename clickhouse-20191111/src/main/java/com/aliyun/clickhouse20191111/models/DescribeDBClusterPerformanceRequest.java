// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp125e3uu94wo****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. Format: yyyy-MM-ddTHH:mmZ (UTC time).</p>
     * <blockquote>
     * <p>The end time must be later than the start time, and the time interval between the start time and the end time cannot exceed 32 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-27T16:38Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The names of the performance metrics to query. Separate multiple values with commas (,). You can query up to 5 performance metrics at a time. The following performance metrics are supported:</p>
     * <blockquote>
     * <p><strong>Key</strong> is required.</p>
     * </blockquote>
     * <ul>
     * <li><strong>CPU</strong>:<ul>
     * <li><strong>CPU_USAGE</strong>: CPU utilization.</li>
     * </ul>
     * </li>
     * <li><strong>Memory</strong>:<ul>
     * <li><strong>MEM_USAGE</strong>: Memory utilization.</li>
     * <li><strong>MEM_USAGE_SIZE</strong>: Memory usage (unit: MB).</li>
     * </ul>
     * </li>
     * <li><strong>Disk</strong>:<ul>
     * <li><strong>DISK_USAGE</strong>: Disk utilization. </li>
     * <li><strong>DISK_USAGE_SIZE</strong>: Disk usage (unit: MB).</li>
     * <li><strong>IOPS</strong>: Disk IOPS.</li>
     * </ul>
     * </li>
     * <li><strong>Connections</strong>:<ul>
     * <li><strong>CONN_USAGE</strong>: Database connection utilization.</li>
     * <li><strong>CONN_USAGE_COUNT</strong>: Number of database connections in use.</li>
     * </ul>
     * </li>
     * <li><strong>Writes</strong>: <ul>
     * <li><strong>TPS</strong>: Number of rows written per second.</li>
     * <li><strong>INSERT_SIZE</strong>: Size of data written per second (unit: MB).</li>
     * </ul>
     * </li>
     * <li><strong>Queries</strong>: <ul>
     * <li><strong>QPS</strong>: Queries per second (QPS).</li>
     * <li><strong>AVG_SEEK</strong>: Number of random SEEK calls.</li>
     * </ul>
     * </li>
     * <li><strong>WAIT</strong>: <ul>
     * <li><strong>ZK_WAIT</strong>: Average wait time for ZooKeeper (unit: ms).</li>
     * <li><strong>IO_WAIT</strong>: Average wait time for IO_WAIT (unit: ms).</li>
     * <li><strong>CPU_WAIT</strong>: Average wait time for CPU_WAIT (unit: ms).</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MEM_USAGE</p>
     */
    @NameInMap("Key")
    public String key;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time of the query. Format: yyyy-MM-ddTHH:mmZ (UTC time).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-27T16:37Z</p>
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

    public DescribeDBClusterPerformanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBClusterPerformanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBClusterPerformanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBClusterPerformanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBClusterPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
