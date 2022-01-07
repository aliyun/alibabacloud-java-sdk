// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstanceLoginAuditLogRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OpUserName")
    public String opUserName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchName")
    public String searchName;

    @NameInMap("StartTime")
    public String startTime;

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
