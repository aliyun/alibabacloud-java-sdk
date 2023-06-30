// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDBTaskSQLJobDetailRequest extends TeaModel {
    /**
     * <p>The ID of the SQL task. You can call the [ListDBTaskSQLJob](~~207049~~) operation to query the SQL task ID.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

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
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListDBTaskSQLJobDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDBTaskSQLJobDetailRequest self = new ListDBTaskSQLJobDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListDBTaskSQLJobDetailRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ListDBTaskSQLJobDetailRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDBTaskSQLJobDetailRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDBTaskSQLJobDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
