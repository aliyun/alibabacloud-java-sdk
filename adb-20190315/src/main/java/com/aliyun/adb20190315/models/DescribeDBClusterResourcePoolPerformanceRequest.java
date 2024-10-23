// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterResourcePoolPerformanceRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range to monitor the resource group. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-10T07:01Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The metrics of the resource group. You can enter multiple metrics at the same time to query the monitoring information. Separate multiple metrics with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>AnalyticDB_RP_CPU</strong>: the average CPU utilization. Unit: %.</li>
     * <li><strong>AnalyticDB_RP_RT</strong>: the query response time (RT). Unit: milliseconds.</li>
     * <li><strong>AnalyticDB_RP_QPS</strong>: the queries per second (QPS). The value of this parameter must be a numeric value.</li>
     * <li><strong>AnalyticDB_RP_WaitTime</strong>: the query waiting time. Unit: milliseconds.</li>
     * <li><strong>AnalyticDB_RP_OriginalNode</strong>: the number of basic nodes in the resource group.</li>
     * <li><strong>AnalyticDB_RP_ActualNode</strong>: the number of scheduled nodes that are scaled out in the resource group.</li>
     * <li><strong>AnalyticDB_RP_PlanNode</strong>: the number of scheduled nodes to be scaled out in the resource group.</li>
     * <li><strong>AnalyticDB_RP_TotalNode</strong>: the total number of nodes in the resource group. Total number of nodes = Number of basic nodes + Number of scheduled nodes that are scaled out.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you leave this parameter empty, the monitoring information about all metrics is returned.</p>
     * </li>
     * <li><p>For more information about scaling plans, see <a href="https://help.aliyun.com/document_detail/189507.html">Create a resource scaling plan</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AnalyticDB_RP_CPU</p>
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
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The value of this parameter is case-insensitive. For example, <code>USER_DEFAULT</code> and <code>user_default</code> specify the same resource group.</p>
     * </li>
     * <li><p>If you leave this parameter empty, the monitoring information about the <code>USER_DEFAULT</code> resource group is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TEST_POOL</p>
     */
    @NameInMap("ResourcePools")
    public String resourcePools;

    /**
     * <p>The beginning of the time range to monitor the resource group. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
     * <blockquote>
     * <p>You can view only the monitoring information about the resource groups within the last two days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-10T07:00Z</p>
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
