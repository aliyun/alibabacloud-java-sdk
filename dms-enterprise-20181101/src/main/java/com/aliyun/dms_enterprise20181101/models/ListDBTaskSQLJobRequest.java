// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDBTaskSQLJobRequest extends TeaModel {
    /**
     * <p>The ID of the SQL task group. You can call the [GetStructSyncJobDetail](~~206160~~) operation to obtain this parameter.</p>
     */
    @NameInMap("DBTaskGroupId")
    public Long DBTaskGroupId;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> : To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [Manage DMS tenants](~~181330~~).</p>
     */
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
