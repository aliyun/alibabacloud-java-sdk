// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxySQLExecAuditLogRequest extends TeaModel {
    // The end of the time range to query. The value of this parameter must be a timestamp that follows the UNIX time format.
    @NameInMap("EndTime")
    public Long endTime;

    // The execution status of the SQL statement. Valid values:
    // 
    // *   **FAIL**: The execution of the SQL statement fails.
    // *   **CANCEL**: The execution of the SQL statement is canceled.
    // *   **SUCCESS**: The SQL statement is executed.
    @NameInMap("ExecState")
    public String execState;

    // The alias of the user.
    @NameInMap("OpUserName")
    public String opUserName;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Maximum values: 100.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The type of SQL statement. Valid values:
    // 
    // *   **SELECT**
    // *   **INSERT**
    // *   **DELETE**
    // *   **CREATE_TABLE**
    // 
    // >  You can choose Operation Audit > Secure Access Proxy in the top navigation bar of the DMS console to view more types of SQL statements.
    @NameInMap("SQLType")
    public String SQLType;

    // The name of the database instance.
    @NameInMap("SearchName")
    public String searchName;

    // The beginning of the time range to query. The value of this parameter must be a timestamp that follows the UNIX time format.
    @NameInMap("StartTime")
    public Long startTime;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
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
