// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxySQLExecAuditLogRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ExecState")
    public String execState;

    @NameInMap("OpUserName")
    public String opUserName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SQLType")
    public String SQLType;

    @NameInMap("SearchName")
    public String searchName;

    @NameInMap("StartTime")
    public Long startTime;

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
