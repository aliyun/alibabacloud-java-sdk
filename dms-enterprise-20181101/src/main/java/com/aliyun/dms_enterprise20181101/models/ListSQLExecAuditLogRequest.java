// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLExecAuditLogRequest extends TeaModel {
    // The end of the time range to query.
    // 
    // >  The end time supports fuzzy match. Specify the time in the YYYY-MM-DD hh:mm:ss format. We recommend that you use the StartTime and EndTime parameters to specify a time range that does not exceed one day. The returned entries can be displayed by page to improve query efficiency.
    @NameInMap("EndTime")
    public String endTime;

    // The execution status of the SQL statement. Valid values:
    // 
    // *   **FAIL**: The SQL statement fails to be executed.
    // *   **NOEXE**: The SQL statement has not been executed.
    // *   **RUNNING**: The SQL statement is being executed.
    // *   **CANCEL**: The execution of the SQL statement is canceled.
    // *   **SUCCESS**: The SQL statement is executed.
    @NameInMap("ExecState")
    public String execState;

    // The nickname of the user who wrote the SQL statement.
    @NameInMap("OpUserName")
    public String opUserName;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. The value cannot exceed 100.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The name of the database or instance based on which you want to query SQL statements.
    // 
    // >  If the SQL statements to be queried are at the instance level, you can set this parameter to an instance name. If the SQL statements to be queried are at the database level, you can set this parameter to a database name.
    @NameInMap("SearchName")
    public String searchName;

    // The type of the SQL statement. Valid values:
    // 
    // *   **SELECT**: the SQL statement that is used to query data.
    // *   **INSERT**: the SQL statement that is used to insert data.
    // *   **DELETE**: the SQL statement that is used to delete data.
    // *   **CREATE_TABLE**: the SQL statement that is used to create tables.
    // 
    // >  To view more types of SQL statements, log on to the DMS console and click Security and Specifications. In the left-side navigation pane, click **Operation Audit**. Then, you can view all supported types of SQL statements from the **SQL type** drop-down list.
    @NameInMap("SqlType")
    public String sqlType;

    // The beginning of the time range to query.
    // 
    // >  The start time supports fuzzy match. Specify the time in the YYYY-MM-DD hh:mm:ss format.
    @NameInMap("StartTime")
    public String startTime;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    public static ListSQLExecAuditLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSQLExecAuditLogRequest self = new ListSQLExecAuditLogRequest();
        return TeaModel.build(map, self);
    }

    public ListSQLExecAuditLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListSQLExecAuditLogRequest setExecState(String execState) {
        this.execState = execState;
        return this;
    }
    public String getExecState() {
        return this.execState;
    }

    public ListSQLExecAuditLogRequest setOpUserName(String opUserName) {
        this.opUserName = opUserName;
        return this;
    }
    public String getOpUserName() {
        return this.opUserName;
    }

    public ListSQLExecAuditLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSQLExecAuditLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSQLExecAuditLogRequest setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

    public ListSQLExecAuditLogRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public ListSQLExecAuditLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListSQLExecAuditLogRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
