// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxySQLExecAuditLogRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value of this parameter must be a timestamp that follows the UNIX time format.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The execution status of the SQL statement. Valid values:</p>
     * <br>
     * <p>*   **FAIL**: The execution of the SQL statement fails.</p>
     * <p>*   **CANCEL**: The execution of the SQL statement is canceled.</p>
     * <p>*   **SUCCESS**: The SQL statement is executed.</p>
     */
    @NameInMap("ExecState")
    public String execState;

    /**
     * <p>The alias of the user.</p>
     */
    @NameInMap("OpUserName")
    public String opUserName;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum values: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of SQL statement. Valid values:</p>
     * <br>
     * <p>*   **SELECT**</p>
     * <p>*   **INSERT**</p>
     * <p>*   **DELETE**</p>
     * <p>*   **CREATE_TABLE**</p>
     * <br>
     * <p>>  You can choose Operation Audit > Secure Access Proxy in the top navigation bar of the DMS console to view more types of SQL statements.</p>
     */
    @NameInMap("SQLType")
    public String SQLType;

    /**
     * <p>The name of the database instance.</p>
     */
    @NameInMap("SearchName")
    public String searchName;

    /**
     * <p>The beginning of the time range to query. The value of this parameter must be a timestamp that follows the UNIX time format.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListProxySQLExecAuditLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProxySQLExecAuditLogRequest self = new ListProxySQLExecAuditLogRequest();
        return TeaModel.build(map, self);
    }

    public ListProxySQLExecAuditLogRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListProxySQLExecAuditLogRequest setExecState(String execState) {
        this.execState = execState;
        return this;
    }
    public String getExecState() {
        return this.execState;
    }

    public ListProxySQLExecAuditLogRequest setOpUserName(String opUserName) {
        this.opUserName = opUserName;
        return this;
    }
    public String getOpUserName() {
        return this.opUserName;
    }

    public ListProxySQLExecAuditLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProxySQLExecAuditLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProxySQLExecAuditLogRequest setSQLType(String SQLType) {
        this.SQLType = SQLType;
        return this;
    }
    public String getSQLType() {
        return this.SQLType;
    }

    public ListProxySQLExecAuditLogRequest setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

    public ListProxySQLExecAuditLogRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListProxySQLExecAuditLogRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
