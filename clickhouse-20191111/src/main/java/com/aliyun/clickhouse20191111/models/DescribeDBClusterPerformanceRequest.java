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
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time. The interval cannot be more than 32 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-27T16:38Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The performance metrics that you want to query. Separate multiple performance metrics with commas (,). You can query up to five performance metrics at a time. You can query the following performance metrics:</p>
     * <blockquote>
     * <p> The <strong>Key</strong> parameter is required.</p>
     * </blockquote>
     * <ul>
     * <li><p><strong>CPU</strong>:</p>
     * <ul>
     * <li><strong>CPU_USAGE</strong>: the CPU utilization</li>
     * </ul>
     * </li>
     * <li><p><strong>Memory</strong>:</p>
     * <ul>
     * <li><strong>MEM_USAGE</strong>: the memory usage</li>
     * <li><strong>MEM_USAGE_SIZE</strong>: the used memory. Unit: MB</li>
     * </ul>
     * </li>
     * <li><p><strong>Disk</strong>:</p>
     * <ul>
     * <li><strong>DISK_USAGE</strong>: the disk usage</li>
     * <li><strong>DISK_USAGE_SIZE</strong>: the size of the used disks. Unit: MB</li>
     * <li><strong>IOPS</strong>: the disk Input/Output Operations per Second (IOPS)</li>
     * </ul>
     * </li>
     * <li><p><strong>Connection</strong>:</p>
     * <ul>
     * <li><strong>CONN_USAGE</strong>: the database connection usage</li>
     * <li><strong>CONN_USAGE_COUNT</strong>: the number of database connections used</li>
     * </ul>
     * </li>
     * <li><p><strong>Write</strong>:</p>
     * <ul>
     * <li><strong>TPS</strong>: the number of rows written per second</li>
     * <li><strong>INSERT_SIZE</strong>: the amount of data written per second. Unit: MB</li>
     * </ul>
     * </li>
     * <li><p><strong>Query</strong>:</p>
     * <ul>
     * <li><strong>QPS</strong>: the queries per second</li>
     * <li><strong>AVG_SEEK</strong>: the average number of random seek calls</li>
     * </ul>
     * </li>
     * <li><p><strong>WAIT</strong>:</p>
     * <ul>
     * <li><strong>ZK_WAIT</strong>: the average ZooKeeper wait time. Unit: ms</li>
     * <li><strong>IO_WAIT</strong>: the average I/O wait time. Unit: ms</li>
     * <li><strong>CPU_WAIT</strong>: the average CPU wait time. Unit: ms</li>
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
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in Coordinated Universal Time (UTC).</p>
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
