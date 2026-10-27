// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetFullRequestStatResultByInstanceIdRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort the results in ascending order. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("Asc")
    public Boolean asc;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>dbtest01</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The end time of the query. The time is a UNIX timestamp in milliseconds.</p>
     * <blockquote>
     * <p>The end time must be later than the start time, and the interval between the start time and the end time cannot exceed one day.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1645668213000</p>
     */
    @NameInMap("End")
    public Long end;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The query keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>dbtest01</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p>For PolarDB for MySQL instances, the node ID is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-bp12v7243x012****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The field by which to sort the results. Default value: <strong>count</strong>.</p>
     * <ul>
     * <li><p><strong>count</strong>: the number of executions.</p>
     * </li>
     * <li><p><strong>avgRt</strong>: the average execution time.</p>
     * </li>
     * <li><p><strong>rtRate</strong>: the execution time proportion.</p>
     * </li>
     * <li><p><strong>rowsExamined</strong>: the total number of scanned rows.</p>
     * </li>
     * <li><p><strong>avgRowsExamined</strong>: the average number of scanned rows.</p>
     * </li>
     * <li><p><strong>avgRowsReturned</strong>: the average number of returned rows.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>count</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The IP address of the client that executed the SQL statement.</p>
     * <blockquote>
     * <p>This parameter is optional. If you specify a client IP address, the full request data of the specified client IP address is aggregated. If you leave this parameter empty, the full request data of the entire database instance is aggregated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.26.XX.XXX</p>
     */
    @NameInMap("OriginHost")
    public String originHost;

    /**
     * <p>The page number for the paged query. The paging starts from 1. Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The data volume per page for paging in a paged query. Default value: 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The node information of the PolarDB-X 2.0 database instance. Valid values:</p>
     * <ul>
     * <li><p><strong>polarx_cn</strong>: compute node.</p>
     * </li>
     * <li><p><strong>polarx_dn</strong>: data node.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>polarx_cn</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The SQL ID.</p>
     * <blockquote>
     * <p>If you specify an SQL ID, the full request data of the specified SQL ID is aggregated. If you leave this parameter empty, the full request data of the entire database instance is aggregated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d71f82be1eef72bd105128204d2e****</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>The type of the SQL statement. Valid values: <strong>SELECT</strong>, <strong>INSERT</strong>, <strong>UPDATE</strong>, <strong>DELETE</strong>, <strong>LOGIN</strong>, <strong>LOGOUT</strong>, <strong>MERGE</strong>, <strong>ALTER</strong>, <strong>CREATEINDEX</strong>, <strong>DROPINDEX</strong>, <strong>CREATE</strong>, <strong>DROP</strong>, <strong>SET</strong>, <strong>DESC</strong>, <strong>REPLACE</strong>, <strong>CALL</strong>, <strong>BEGIN</strong>, <strong>DESCRIBE</strong>, <strong>ROLLBACK</strong>, <strong>FLUSH</strong>, <strong>USE</strong>, <strong>SHOW</strong>, <strong>START</strong>, <strong>COMMIT</strong>, and <strong>RENAME</strong>.</p>
     * <blockquote>
     * <p>If the database instance is an ApsaraDB RDS for MySQL, PolarDB for MySQL, or PolarDB-X 2.0 instance, you can aggregate data by SQL statement type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The start time of the query. The format is a UNIX timestamp, in milliseconds.</p>
     * <blockquote>
     * <p>The start time must be within the SQL Explorer storage duration for the database instance and cannot be more than 90 days earlier than the current time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1645581813000</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>The instance ID, which is the ID of the Alibaba Cloud account that created the database instance.</p>
     * <blockquote>
     * <p>This parameter is optional. After you enter the ID of the target database instance, the system automatically obtains the instance ID when you call the API operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>196278346919****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetFullRequestStatResultByInstanceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFullRequestStatResultByInstanceIdRequest self = new GetFullRequestStatResultByInstanceIdRequest();
        return TeaModel.build(map, self);
    }

    public GetFullRequestStatResultByInstanceIdRequest setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }
    public Boolean getAsc() {
        return this.asc;
    }

    public GetFullRequestStatResultByInstanceIdRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetFullRequestStatResultByInstanceIdRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetFullRequestStatResultByInstanceIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetFullRequestStatResultByInstanceIdRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetFullRequestStatResultByInstanceIdRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetFullRequestStatResultByInstanceIdRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetFullRequestStatResultByInstanceIdRequest setOriginHost(String originHost) {
        this.originHost = originHost;
        return this;
    }
    public String getOriginHost() {
        return this.originHost;
    }

    public GetFullRequestStatResultByInstanceIdRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetFullRequestStatResultByInstanceIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetFullRequestStatResultByInstanceIdRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public GetFullRequestStatResultByInstanceIdRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public GetFullRequestStatResultByInstanceIdRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public GetFullRequestStatResultByInstanceIdRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public GetFullRequestStatResultByInstanceIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
