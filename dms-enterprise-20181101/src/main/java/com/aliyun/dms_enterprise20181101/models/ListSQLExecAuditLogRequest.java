// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLExecAuditLogRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>>  The end time supports fuzzy match. Specify the time in the YYYY-MM-DD hh:mm:ss format. We recommend that you use the StartTime and EndTime parameters to specify a time range that does not exceed one day. The returned entries can be displayed by page to improve query efficiency.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The execution status of the SQL statement. Valid values:</p>
     * <br>
     * <p>*   **FAIL**: The SQL statement fails to be executed.</p>
     * <p>*   **NOEXE**: The SQL statement has not been executed.</p>
     * <p>*   **RUNNING**: The SQL statement is being executed.</p>
     * <p>*   **CANCEL**: The execution of the SQL statement is canceled.</p>
     * <p>*   **SUCCESS**: The SQL statement is executed.</p>
     */
    @NameInMap("ExecState")
    public String execState;

    /**
     * <p>The nickname of the user who wrote the SQL statement.</p>
     */
    @NameInMap("OpUserName")
    public String opUserName;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The value cannot exceed 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the database or instance based on which you want to query SQL statements.</p>
     * <br>
     * <p>>  If the SQL statements to be queried are at the instance level, you can set this parameter to an instance name. If the SQL statements to be queried are at the database level, you can set this parameter to a database name.</p>
     */
    @NameInMap("SearchName")
    public String searchName;

    /**
     * <p>The type of the SQL statement. Valid values:</p>
     * <br>
     * <p>*   **SELECT**: the SQL statement that is used to query data.</p>
     * <p>*   **INSERT**: the SQL statement that is used to insert data.</p>
     * <p>*   **DELETE**: the SQL statement that is used to delete data.</p>
     * <p>*   **CREATE_TABLE**: the SQL statement that is used to create tables.</p>
     * <br>
     * <p>>  To view more types of SQL statements, log on to the DMS console and click Security and Specifications. In the left-side navigation pane, click **Operation Audit**. Then, you can view all supported types of SQL statements from the **SQL type** drop-down list.</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>>  The start time supports fuzzy match. Specify the time in the YYYY-MM-DD hh:mm:ss format.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.</p>
     */
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
