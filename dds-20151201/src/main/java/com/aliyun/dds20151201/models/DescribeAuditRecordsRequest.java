// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAuditRecordsRequest extends TeaModel {
    // The ID of the instance.
    // 
    // >  If you set this parameter to the ID of a sharded cluster instance, you must also specify the **NodeId** parameter.
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    // The name of the database to be queried. By default, all databases are queried.
    @NameInMap("Database")
    public String database;

    // The end of the time range that is specified to query the audit log. The end time must be later than the start time. Specify the time in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
    // 
    // >  The end time must be within 24 hours from the start time. Otherwise, the query fails.
    @NameInMap("EndTime")
    public String endTime;

    // The form of the audit log that the operation returns. Valid values:
    // 
    // *   **File**: triggers the generation of audit logs. If this parameter is set to File, only common parameters are returned.
    // *   **Stream**: returns data streams.
    // 
    // Default value: **Stream**.
    @NameInMap("Form")
    public String form;

    // The ID of the mongos node or shard node whose audit logs you want to query in the instance. If the instance is a sharded cluster instance, you must specify this parameter.
    // 
    // >  This parameter is valid only when **DBInstanceId** is set to the ID of a sharded cluster instance.
    @NameInMap("NodeId")
    public String nodeId;

    // The order of time in which the log entries to return are sorted. Valid values:
    // 
    // *   asc: The log entries are sorted by time in ascending order.
    // *   desc: The log entries are sorted by time in descending order.
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. The value must be an integer that is greater than 0. Default value: **1**.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Valid values: **30**, **50**, and **100**. Default value: **30**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The keywords that are used for queries. Separate multiple keywords with spaces. The maximum number of keywords is 10.
    @NameInMap("QueryKeywords")
    public String queryKeywords;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The beginning of the time range to query. Specify the time in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
    @NameInMap("StartTime")
    public String startTime;

    // The user of the database. If you do not specify this parameter, this operation returns records of all users.
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

    public DescribeAuditRecordsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
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
