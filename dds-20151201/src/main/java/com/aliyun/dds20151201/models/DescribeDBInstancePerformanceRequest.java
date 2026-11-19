// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePerformanceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>If you specify the ID of a sharded cluster instance for this parameter, you must also specify the <strong>NodeId</strong> parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp2635****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The end time of the query. The end time must be later than the start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm</i>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-06-13T11:58Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The data granularity. Valid values: 5, 30, 60, 600, 1800, 3600, and 86400.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The performance metrics. For more information, see <a href="https://help.aliyun.com/document_detail/216973.html">Monitoring metrics</a>.</p>
     * <blockquote>
     * <p>To specify multiple metrics, separate them with commas (,).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CpuUsage</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>Instance ID of the mongos or shard node in a sharded cluster instance. You can use this parameter to query the performance of a single node.</p>
     * <blockquote>
     * <p>This parameter is available only when you specify instance ID of a sharded cluster instance for the <strong>DBInstanceId</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bp2287****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The role of the node in a standalone instance or replica set instance. Valid values:</p>
     * <ul>
     * <li><strong>Primary</strong>: The primary node.</li>
     * <li><strong>Secondary</strong>: The secondary node.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is available only when you specify instance ID of a standalone instance or replica set instance for the <strong>DBInstanceId</strong> parameter.</li>
     * <li>When you specify instance ID of a standalone instance for the <strong>DBInstanceId</strong> parameter, you can set this parameter only to <strong>Primary</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Primary</p>
     */
    @NameInMap("ReplicaSetRole")
    public String replicaSetRole;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The instance ID of the node in a standalone instance or replica set instance. You can call the <a href="https://help.aliyun.com/document_detail/62134.html">DescribeReplicaSetRole</a> operation to query the instance ID.</p>
     * <blockquote>
     * <p>This parameter is available only when you specify the ID of a standalone instance or replica set instance for the <strong>DBInstanceId</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6025****</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    /**
     * <p>The ID of the search node.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is available only when the search feature is enabled for the instance.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dds-2zec12675c9e****-search</p>
     */
    @NameInMap("SearchId")
    public String searchId;

    /**
     * <p>The start time of the query. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm</i>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-06-13T10:58Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBInstancePerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancePerformanceRequest self = new DescribeDBInstancePerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancePerformanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstancePerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBInstancePerformanceRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDBInstancePerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDBInstancePerformanceRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeDBInstancePerformanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBInstancePerformanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstancePerformanceRequest setReplicaSetRole(String replicaSetRole) {
        this.replicaSetRole = replicaSetRole;
        return this;
    }
    public String getReplicaSetRole() {
        return this.replicaSetRole;
    }

    public DescribeDBInstancePerformanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBInstancePerformanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBInstancePerformanceRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public DescribeDBInstancePerformanceRequest setSearchId(String searchId) {
        this.searchId = searchId;
        return this;
    }
    public String getSearchId() {
        return this.searchId;
    }

    public DescribeDBInstancePerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
