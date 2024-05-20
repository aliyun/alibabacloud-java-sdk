// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * <br>
     * <p>>  The end time must be later than the start time. The interval cannot be more than 32 days.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The performance metrics that you want to query. Separate multiple performance metrics with commas (,). You can query up to five performance metrics at a time. You can query the following performance metrics:</p>
     * <br>
     * <p>>  The **Key** parameter is required.</p>
     * <br>
     * <p>*   **CPU**:</p>
     * <br>
     * <p>    *   **CPU_USAGE**: the CPU utilization</p>
     * <br>
     * <p>*   **Memory**:</p>
     * <br>
     * <p>    *   **MEM_USAGE**: the memory usage</p>
     * <p>    *   **MEM_USAGE_SIZE**: the used memory. Unit: MB</p>
     * <br>
     * <p>*   **Disk**:</p>
     * <br>
     * <p>    *   **DISK_USAGE**: the disk usage</p>
     * <p>    *   **DISK_USAGE_SIZE**: the size of the used disks. Unit: MB</p>
     * <p>    *   **IOPS**: the disk Input/Output Operations per Second (IOPS)</p>
     * <br>
     * <p>*   **Connection**:</p>
     * <br>
     * <p>    *   **CONN_USAGE**: the database connection usage</p>
     * <p>    *   **CONN_USAGE_COUNT**: the number of database connections used</p>
     * <br>
     * <p>*   **Write**:</p>
     * <br>
     * <p>    *   **TPS**: the number of rows written per second</p>
     * <p>    *   **INSERT_SIZE**: the amount of data written per second. Unit: MB</p>
     * <br>
     * <p>*   **Query**:</p>
     * <br>
     * <p>    *   **QPS**: the queries per second</p>
     * <p>    *   **AVG_SEEK**: the average number of random seek calls</p>
     * <br>
     * <p>*   **WAIT**:</p>
     * <br>
     * <p>    *   **ZK_WAIT**: the average ZooKeeper wait time. Unit: ms</p>
     * <p>    *   **IO_WAIT**: the average I/O wait time. Unit: ms</p>
     * <p>    *   **CPU_WAIT**: the average CPU wait time. Unit: ms</p>
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
     * <br>
     * <p>This parameter is required.</p>
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
