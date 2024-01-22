// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAuditRecordsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>> If you set this parameter to the ID of a sharded cluster instance, you must also specify the **NodeId** parameter.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database to be queried. By default, all databases are queried.</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>> The end time must be within 24 hours from the start time. Otherwise, the query fails.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The form of the audit log that the operation returns. Valid values:</p>
     * <br>
     * <p>*   **File**: triggers the generation of audit logs. If this parameter is set to File, only common parameters are returned.</p>
     * <p>*   **Stream** (default): returns data streams.</p>
     */
    @NameInMap("Form")
    public String form;

    /**
     * <p>The logical relationship between multiple keywords. Valid values:</p>
     * <br>
     * <p>*   **or**</p>
     * <p>*   **and** (default value)</p>
     */
    @NameInMap("LogicalOperator")
    public String logicalOperator;

    /**
     * <p>The ID of the mongos node or shard node in the instance.</p>
     * <br>
     * <p>> This parameter takes effect only when you set the **DBInstanceId** parameter to the ID of a sharded cluster instance.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The order of time in which the log entries to return are sorted. Valid values:</p>
     * <br>
     * <p>*   **asc**: The log entries are sorted by time in ascending order.</p>
     * <p>*   **desc**: The log entries are sorted by time in descending order.</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the page to return. The valid value must be a positive integer that does not exceed the maximum value of the INTEGER data type. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page. Default value: 30. Valid values: **30**, **50**, and **100**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keywords used for query. You can enter up to 10 keywords at a time. If you enter multiple keywords, separate the keywords with spaces.</p>
     */
    @NameInMap("QueryKeywords")
    public String queryKeywords;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The user of the database. If you do not specify this parameter, this operation returns records of all users.</p>
     */
    @NameInMap("User")
    public String user;

    public static DescribeAuditRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditRecordsRequest self = new DescribeAuditRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAuditRecordsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeAuditRecordsRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeAuditRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAuditRecordsRequest setForm(String form) {
        this.form = form;
        return this;
    }
    public String getForm() {
        return this.form;
    }

    public DescribeAuditRecordsRequest setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    public DescribeAuditRecordsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeAuditRecordsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeAuditRecordsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeAuditRecordsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAuditRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAuditRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAuditRecordsRequest setQueryKeywords(String queryKeywords) {
        this.queryKeywords = queryKeywords;
        return this;
    }
    public String getQueryKeywords() {
        return this.queryKeywords;
    }

    public DescribeAuditRecordsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAuditRecordsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAuditRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeAuditRecordsRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
