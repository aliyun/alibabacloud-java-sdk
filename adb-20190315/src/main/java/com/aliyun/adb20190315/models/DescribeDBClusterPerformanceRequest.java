// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeDBClusters](~~129857~~) operation to query the IDs of all AnalyticDB for MySQL clusters within a region.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. Specify the time in the ISO 8601 standard in the *yyyy-MM-ddTHH:mmZ* format. The time must be in UTC.</p>
     * <br>
     * <p>> The end time must be later than the start time. The maximum time range that can be specified is two days.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The performance metrics to be queried. Separate multiple values with commas (,). Valid values:</p>
     * <br>
     * <p>*   CPU</p>
     * <br>
     * <p>    *   **AnalyticDB_CPU**: the average CPU utilization.</p>
     * <br>
     * <p>*   Connections</p>
     * <br>
     * <p>    *   **AnalyticDB_Connections**: the number of database connections.</p>
     * <br>
     * <p>*   Writes</p>
     * <br>
     * <p>    *   **AnalyticDB_TPS**: the write transactions per second (TPS).</p>
     * <p>    *   **AnalyticDB_InsertRT**: the write response time.</p>
     * <p>    *   **AnalyticDB_InsertBytes**: the write throughput.</p>
     * <br>
     * <p>*   Updates</p>
     * <br>
     * <p>    *   **AnalyticDB_UpdateRT**: the update response time.</p>
     * <br>
     * <p>*   Deletion</p>
     * <br>
     * <p>    *   **AnalyticDB_DeleteRT**: the delete response time.</p>
     * <br>
     * <p>*   Queries</p>
     * <br>
     * <p>    *   **AnalyticDB_QPS**: the queries per second (QPS).</p>
     * <p>    *   **AnalyticDB_QueryRT**: the query response time.</p>
     * <p>    *   **AnalyticDB_QueryWaitTime**: the query wait time.</p>
     * <br>
     * <p>*   Disks</p>
     * <br>
     * <p>    *   **AnalyticDB_IO**: the disk I/O throughput.</p>
     * <p>    *   **AnalyticDB_IO_UTIL**: the I/O utilization.</p>
     * <p>    *   **AnalyticDB_IO_WAIT**: the I/O wait time.</p>
     * <p>    *   **AnalyticDB_IOPS**: the disk input/output operations per second (IOPS).</p>
     * <p>    *   **AnalyticDB_DiskUsage**: the disk space that is used.</p>
     * <p>    *   **AnalyticDB_HotDataDiskUsage**: the disk space that is used by hot data.</p>
     * <p>    *   **AnalyticDB_ColdDataDiskUsage**: the disk space that is used by cold data.</p>
     * <br>
     * <p>>  If you leave this parameter empty, the values of all the preceding performance metrics are returned.</p>
     */
    @NameInMap("Key")
    public String key;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the cluster.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the resource group.</p>
     */
    @NameInMap("ResourcePools")
    public String resourcePools;

    /**
     * <p>The start time of the query. Specify the time in the ISO 8601 standard in the *yyyy-MM-ddTHH:mmZ* format. The time must be in UTC.</p>
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

    public DescribeDBClusterPerformanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
