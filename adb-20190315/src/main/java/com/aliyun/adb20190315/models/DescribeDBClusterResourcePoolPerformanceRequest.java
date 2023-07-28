// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterResourcePoolPerformanceRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusters](~~129857~~) operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range to monitor the resource group. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-ddTHH:mmZ* format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The metrics of the resource group. You can enter multiple metrics at the same time to query the monitoring information. Separate multiple metrics with commas (,). Valid values:</p>
     * <br>
     * <p>*   **AnalyticDB_RP_CPU**: the average CPU utilization. Unit: %.</p>
     * <p>*   **AnalyticDB_RP_RT**: the query response time (RT). Unit: milliseconds.</p>
     * <p>*   **AnalyticDB_RP_QPS**: the queries per second (QPS). The value of this parameter must be a numeric value.</p>
     * <p>*   **AnalyticDB_RP_WaitTime**: the query waiting time. Unit: milliseconds.</p>
     * <p>*   **AnalyticDB_RP_OriginalNode**: the number of basic nodes in the resource group.</p>
     * <p>*   **AnalyticDB_RP_ActualNode**: the number of scheduled nodes that are scaled out in the resource group.</p>
     * <p>*   **AnalyticDB_RP_PlanNode**: the number of scheduled nodes to be scaled out in the resource group.</p>
     * <p>*   **AnalyticDB_RP_TotalNode**: the total number of nodes in the resource group. Total number of nodes = Number of basic nodes + Number of scheduled nodes that are scaled out.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you leave this parameter empty, the monitoring information about all metrics is returned.</p>
     * <br>
     * <p>*   For more information about scaling plans, see [Create a resource scaling plan](~~189507~~).</p>
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
     * <p>The names of the resource groups that you want to query. You can enter multiple names of resource groups. Separate multiple names with commas (,).</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The value of this parameter is case-insensitive. For example, `USER_DEFAULT` and `user_default` specify the same resource group.</p>
     * <br>
     * <p>*   If you leave this parameter empty, the monitoring information about the `USER_DEFAULT` resource group is returned.</p>
     */
    @NameInMap("ResourcePools")
    public String resourcePools;

    /**
     * <p>The beginning of the time range to monitor the resource group. Specify the time in the ISO 8601 standard in the *yyyy-MM-ddTHH:mmZ* format. The time must be in UTC.</p>
     * <br>
     * <p>> You can view only the monitoring information about the resource groups within the last two days.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBClusterResourcePoolPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterResourcePoolPerformanceRequest self = new DescribeDBClusterResourcePoolPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterResourcePoolPerformanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterResourcePoolPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBClusterResourcePoolPerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDBClusterResourcePoolPerformanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBClusterResourcePoolPerformanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBClusterResourcePoolPerformanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBClusterResourcePoolPerformanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBClusterResourcePoolPerformanceRequest setResourcePools(String resourcePools) {
        this.resourcePools = resourcePools;
        return this;
    }
    public String getResourcePools() {
        return this.resourcePools;
    }

    public DescribeDBClusterResourcePoolPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
