// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetFullRequestStatResultByInstanceIdRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort the results in ascending order. By default, the results are not sorted in ascending order.</p>
     */
    @NameInMap("Asc")
    public Boolean asc;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>>  The end time must be later than the start time. The interval cannot exceed one day.</p>
     */
    @NameInMap("End")
    public Long end;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The keywords that are used for query.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The node ID.</p>
     * <br>
     * <p>>  You must specify the node ID if your database instance is a PolarDB for MySQL cluster.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The field by which to sort the returned entries. Default value: **count**. Valid values:</p>
     * <br>
     * <p>*   **count**: the number of executions.</p>
     * <p>*   **avgRt**: the average execution duration.</p>
     * <p>*   **rtRate**: the execution duration percentage.</p>
     * <p>*   **rowsExamined**: the total number of scanned rows.</p>
     * <p>*   **avgRowsExamined**: the average number of scanned rows.</p>
     * <p>*   **avgRowsReturned**: the average number of returned rows.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The IP address of the client that executes the SQL statement.</p>
     * <br>
     * <p>>  This parameter is optional. If this parameter is specified, the full request statistics of the specified IP address are collected. If this parameter is left empty, the full request statistics of the entire database instance are collected.</p>
     */
    @NameInMap("OriginHost")
    public String originHost;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The role of the node in the PolarDB-X 2.0 instance. Valid values:</p>
     * <br>
     * <p>*   **polarx_cn**: compute node.</p>
     * <p>*   **polarx_dn**: data node.</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The SQL ID.</p>
     * <br>
     * <p>>  If this parameter is specified, the full request statistics of the specified SQL query are collected. If this parameter is left empty, the full request statistics of the entire database instance are collected.</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>The type of the SQL statement. Valid values: **SELECT**, **INSERT**, **UPDATE**, **DELETE**, **LOGIN**, **LOGOUT**, **MERGE**, **ALTER**, **CREATEINDEX**, **DROPINDEX**, **CREATE**, **DROP**, **SET**, **DESC**, **REPLACE**, **CALL**, **BEGIN**, **DESCRIBE**, **ROLLBACK**, **FLUSH**, **USE**, **SHOW**, **START**, **COMMIT**, and **RENAME**.</p>
     * <br>
     * <p>>  If your database instance is an ApsaraDB RDS for MySQL instance, a PolarDB for MySQL cluster, or a PolarDB-X 2.0 instance, the statistics can be collected based on the SQL statement type.</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>>  The start time can be up to 90 days earlier than the current time.</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>The ID of the Alibaba Cloud account that was used to create the database instance.</p>
     * <br>
     * <p>>  This parameter is optional. The system can automatically obtain the Alibaba Cloud account ID based on the value of InstanceId when you call the GetFullRequestOriginStatByInstanceId operation.</p>
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
