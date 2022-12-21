// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstanceLoginAuditLogRequest extends TeaModel {
    // The end of the time range to query.
    // 
    // >  The end time supports fuzzy match. Specify the time in the YYYY-MM-DD hh:mm:ss format. We recommend that you use the StartTime and EndTime parameters to specify a time range that does not exceed one day. This way, the returned entries can be displayed by page to increase query efficiency.
    @NameInMap("EndTime")
    public String endTime;

    // The alias of the user.
    @NameInMap("OpUserName")
    public String opUserName;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Maximum value: 100.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The name of the database or instance whose logon records you want to query.
    // 
    // >  If SQL statements are executed at the instance level, you can set this parameter to an instance name. If SQL statements are executed at the database level, you can set this parameter to a database name.
    @NameInMap("SearchName")
    public String searchName;

    // The beginning of the time range to query.
    // 
    // >  The start time supports fuzzy match. Specify the time in the YYYY-MM-DD hh:mm:ss format.
    @NameInMap("StartTime")
    public String startTime;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    public static ListInstanceLoginAuditLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceLoginAuditLogRequest self = new ListInstanceLoginAuditLogRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceLoginAuditLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListInstanceLoginAuditLogRequest setOpUserName(String opUserName) {
        this.opUserName = opUserName;
        return this;
    }
    public String getOpUserName() {
        return this.opUserName;
    }

    public ListInstanceLoginAuditLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstanceLoginAuditLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstanceLoginAuditLogRequest setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

    public ListInstanceLoginAuditLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListInstanceLoginAuditLogRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
