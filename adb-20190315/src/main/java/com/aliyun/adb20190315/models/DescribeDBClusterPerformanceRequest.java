// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time. The maximum time range that can be specified is two days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-05-03T15:01Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The performance metrics to be queried. Separate multiple values with commas (,). Valid values:</p>
     * <ul>
     * <li><p>CPU</p>
     * <ul>
     * <li><strong>AnalyticDB_CPU</strong>: the average CPU utilization.</li>
     * </ul>
     * </li>
     * <li><p>Connections</p>
     * <ul>
     * <li><strong>AnalyticDB_Connections</strong>: the number of connections of the cluster.</li>
     * </ul>
     * </li>
     * <li><p>Writes</p>
     * <ul>
     * <li><strong>AnalyticDB_TPS</strong>: the write transactions per second (TPS).</li>
     * <li><strong>AnalyticDB_InsertRT</strong>: the write response time.</li>
     * <li><strong>AnalyticDB_InsertBytes</strong>: the write throughput.</li>
     * </ul>
     * </li>
     * <li><p>Updates</p>
     * <ul>
     * <li><strong>AnalyticDB_UpdateRT</strong>: the update response time.</li>
     * </ul>
     * </li>
     * <li><p>Deletes</p>
     * <ul>
     * <li><strong>AnalyticDB_DeleteRT</strong>: the delete response time.</li>
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
     * <li><strong>AnalyticDB_IO</strong>: the disk I/O throughput.</li>
     * <li><strong>AnalyticDB_IO_UTIL</strong>: the disk I/O usage.</li>
     * <li><strong>AnalyticDB_IO_WAIT</strong>: the disk I/O wait time.</li>
     * <li><strong>AnalyticDB_IOPS</strong>: the disk IOPS.</li>
     * <li><strong>AnalyticDB_DiskUsage</strong>: the disk space that is used.</li>
     * <li><strong>AnalyticDB_HotDataDiskUsage</strong>: the disk space that is used by hot data.</li>
     * <li><strong>AnalyticDB_ColdDataDiskUsage</strong>: the disk space that is used by cold data.</li>
     * </ul>
     * </li>
     * <li><p>Other</p>
     * <ul>
     * <li><strong>AnalyticDB_BuildTaskCount</strong>: the number of BUILD jobs.</li>
     * <li><strong>AnalyticDB_ComputeMemoryUsedRatio</strong>: the compute memory usage.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> If you leave this parameter empty, the values of all the preceding performance metrics are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AnalyticDB_CPU</p>
     */
    @NameInMap("Key")
    public String key;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourcePools")
    public String resourcePools;

    /**
     * <p>The start time of the query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-03T15:00Z</p>
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
