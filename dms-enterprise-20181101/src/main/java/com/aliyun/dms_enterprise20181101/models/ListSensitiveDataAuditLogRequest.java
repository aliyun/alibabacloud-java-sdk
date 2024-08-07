// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveDataAuditLogRequest extends TeaModel {
    /**
     * <p>The name of the column that contains sensitive data.</p>
     * 
     * <strong>example:</strong>
     * <p>ExampleColumnName</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The name of the database that stores the sensitive data.</p>
     * 
     * <strong>example:</strong>
     * <p>ExampleDbName</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The end of the time range for which you want to query the audit logs for sensitive information. Specify the time in the yyyy-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-18 11:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The function module whose audit logs you want to query for sensitive data. If you do not specify this parameter, all audit logs are queried. Valid values:</p>
     * <ul>
     * <li><strong>SQL_CONSOLE</strong>: data query</li>
     * <li><strong>SQL_CONSOLE_EXPORT</strong>: query result export</li>
     * <li><strong>DATA_CHANGE</strong>: data change</li>
     * <li><strong>DATA_EXPORT</strong>: data export</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SQL_CONSOLE</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    /**
     * <p>The username of the requester.</p>
     * 
     * <strong>example:</strong>
     * <p>ExampleOpUserName</p>
     */
    @NameInMap("OpUserName")
    public String opUserName;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Example: 100</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range for which you want to query the audit logs for sensitive information. Specify the time in the yyyy-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-18 10:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the table that stores the sensitive data.</p>
     * 
     * <strong>example:</strong>
     * <p>ExampleTableName</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListSensitiveDataAuditLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveDataAuditLogRequest self = new ListSensitiveDataAuditLogRequest();
        return TeaModel.build(map, self);
    }

    public ListSensitiveDataAuditLogRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ListSensitiveDataAuditLogRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListSensitiveDataAuditLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListSensitiveDataAuditLogRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public ListSensitiveDataAuditLogRequest setOpUserName(String opUserName) {
        this.opUserName = opUserName;
        return this;
    }
    public String getOpUserName() {
        return this.opUserName;
    }

    public ListSensitiveDataAuditLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSensitiveDataAuditLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSensitiveDataAuditLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListSensitiveDataAuditLogRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListSensitiveDataAuditLogRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
