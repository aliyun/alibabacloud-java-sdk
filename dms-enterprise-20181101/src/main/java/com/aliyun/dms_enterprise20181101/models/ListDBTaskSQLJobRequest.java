// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDBTaskSQLJobRequest extends TeaModel {
    @NameInMap("DBTaskGroupId")
    public Long DBTaskGroupId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Tid")
    public Long tid;

    public static ListDBTaskSQLJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDBTaskSQLJobRequest self = new ListDBTaskSQLJobRequest();
        return TeaModel.build(map, self);
    }

    public ListDBTaskSQLJobRequest setDBTaskGroupId(Long DBTaskGroupId) {
        this.DBTaskGroupId = DBTaskGroupId;
        return this;
    }
    public Long getDBTaskGroupId() {
        return this.DBTaskGroupId;
    }

    public ListDBTaskSQLJobRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDBTaskSQLJobRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDBTaskSQLJobRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
