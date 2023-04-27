// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstanceLoginAuditLogRequest extends TeaModel {
    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("OpUserName")
    public String opUserName;

    /**
     * <p>The logon records of the instance.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The alias of the user.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("SearchName")
    public String searchName;

    /**
     * <p>The name of the database or instance whose logon records you want to query.</p>
     * <br>
     * <p>>  If SQL statements are executed at the instance level, you can set this parameter to an instance name. If SQL statements are executed at the database level, you can set this parameter to a database name.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The operation that you want to perform. Set the value to **ListInstanceLoginAuditLog**.</p>
     */
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
