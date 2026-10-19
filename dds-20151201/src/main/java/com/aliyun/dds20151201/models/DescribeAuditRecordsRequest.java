// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAuditRecordsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>If you specify a sharded cluster instance ID for this parameter, you must also specify the <strong>NodeId</strong> parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp12c5b040dc****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database. The default value is all databases.</p>
     * 
     * <strong>example:</strong>
     * <p>database****</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The end time of the query. The end time must be later than the start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The time range between the end time and the start time cannot exceed 24 hours. If the time range exceeds 24 hours, the call fails.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-03-13T13:11:14Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The display format of the returned audit records. Valid values:</p>
     * <ul>
     * <li><strong>File</strong>: Triggers the generation of an audit log file. If you set this parameter to this value, only common parameters are returned.</li>
     * <li><strong>Stream</strong> (default): Returns a data stream.</li>
     * </ul>
     * <blockquote>
     * <p>The <strong>File</strong> value is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Stream</p>
     */
    @NameInMap("Form")
    public String form;

    /**
     * <p>The logical operator for keyword search. The default value is and.</p>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("LogicalOperator")
    public String logicalOperator;

    /**
     * <p>Instance ID of a mongos node or shard node in the sharded cluster instance.</p>
     * <blockquote>
     * <p>This parameter is available only when <strong>DBInstanceId</strong> is set to instance ID of a sharded cluster instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bp128a003436****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The order in which the queried slow logs are sorted by time. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: sorts results in ascending order by time.</li>
     * <li><strong>desc</strong>: sorts results in descending order by time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value must be greater than 0 and cannot exceed the maximum value of the Integer type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page. Valid values: <strong>30</strong> (default), <strong>50</strong>, and <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keywords to query. Separate multiple keywords with spaces. You can specify a maximum of 10 keywords.</p>
     * 
     * <strong>example:</strong>
     * <p>slow</p>
     */
    @NameInMap("QueryKeywords")
    public String queryKeywords;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time of the query. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-03-13T12:11:14Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The database account. The default value is all accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
