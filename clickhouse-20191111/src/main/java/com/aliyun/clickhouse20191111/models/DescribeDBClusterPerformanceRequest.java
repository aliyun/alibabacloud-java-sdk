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
     * <p>The end of the time range to query. Specify the time in UTC using the <code>yyyy-MM-ddTHH:mmZ</code> format.</p>
     * <blockquote>
     * <p>The end time must be later than the start time. The maximum time range cannot exceed 32 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-27T16:38Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The performance metrics that you want to query. Separate multiple metric names with a comma (,). You can query up to five performance metrics at a time. The following performance metrics are supported:</p>
     * <blockquote>
     * <p><strong>Key</strong> is required.</p>
     * </blockquote>
     * <ul>
     * <li><p><strong>CPU</strong>:</p>
     * <ul>
     * <li><strong>CPU_USAGE</strong>: The CPU utilization.</li>
     * </ul>
     * </li>
     * <li><p><strong>Memory</strong>:</p>
     * <ul>
     * <li><p><strong>MEM_USAGE</strong>: The memory utilization.</p>
     * </li>
     * <li><p><strong>MEM_USAGE_SIZE</strong>: The memory usage in MB.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>Disk</strong>:</p>
     * <ul>
     * <li><p><strong>DISK_USAGE</strong>: The disk utilization.</p>
     * </li>
     * <li><p><strong>DISK_USAGE_SIZE</strong>: The disk usage in MB.</p>
     * </li>
     * <li><p><strong>IOPS</strong>: The disk input/output operations per second (IOPS).</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>Connection</strong>:</p>
     * <ul>
     * <li><p><strong>CONN_USAGE</strong>: The database connection utilization.</p>
     * </li>
     * <li><p><strong>CONN_USAGE_COUNT</strong>: The number of database connections.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>Write</strong>:</p>
     * <ul>
     * <li><p><strong>TPS</strong>: The number of rows written per second (TPS).</p>
     * </li>
     * <li><p><strong>INSERT_SIZE</strong>: The write size per second in MB.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>Query</strong>:</p>
     * <ul>
     * <li><p><strong>QPS</strong>: The queries per second (QPS).</p>
     * </li>
     * <li><p><strong>AVG_SEEK</strong>: The number of random SEEK calls.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>WAIT</strong>:</p>
     * <ul>
     * <li><p><strong>ZK_WAIT</strong>: The average wait time of ZooKeeper (ZK) in ms.</p>
     * </li>
     * <li><p><strong>IO_WAIT</strong>: The average I/O wait time in ms.</p>
     * </li>
     * <li><p><strong>CPU_WAIT</strong>: The average CPU wait time in ms.</p>
     * </li>
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
     * <p>The beginning of the time range to query. Specify the time in UTC using the <code>yyyy-MM-ddTHH:mmZ</code> format.</p>
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
