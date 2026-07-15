// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePerformanceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p><strong>NodeId</strong> is required when specifying a sharded cluster instance ID</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp2635****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-06-13T11:58Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The data granularity of the performance metrics in seconds. Valid values: 5, 30, 60, 600, 1800, 3600, and 86400.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The performance metrics. For more information, see <a href="https://help.aliyun.com/document_detail/216973.html">Metrics</a>.</p>
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
     * <p>The ID of a mongos or shard node in the sharded cluster instance. This parameter lets you query the performance of a single node.</p>
     * <blockquote>
     * <p>Available only when <strong>DBInstanceId</strong> is set to the ID of a sharded cluster instance.</p>
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
     * <p>The role of a node in a standalone or replica set instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Primary</strong>: The primary node.</p>
     * </li>
     * <li><p><strong>Secondary</strong>: A secondary node.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>Available only when <strong>DBInstanceId</strong> is set to the ID of a standalone or replica set instance.</p>
     * </li>
     * <li><p>If <strong>DBInstanceId</strong> is set to the ID of a standalone instance, this parameter only supports the value <strong>Primary</strong>.</p>
     * </li>
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
     * <p>The role ID of a node in a standalone or replica set instance. To query the role ID, call the <a href="https://help.aliyun.com/document_detail/62134.html">DescribeReplicaSetRole</a> operation.</p>
     * <blockquote>
     * <p>Available only when <strong>DBInstanceId</strong> is set to the ID of a standalone or replica set instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6025****</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    /**
     * <p>The Search node ID.</p>
     * <blockquote>
     * <p>Available only after the Search feature is enabled for the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dds-2zec12675c9e****-search</p>
     */
    @NameInMap("SearchId")
    public String searchId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
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
