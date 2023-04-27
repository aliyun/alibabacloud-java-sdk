// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDBTaskSQLJobDetailRequest extends TeaModel {
    /**
     * <p>The number of times that the SQL statement was executed.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The status of the SQL task. Valid values:</p>
     * <br>
     * <p>*   **INIT**: The SQL task was initialized.</p>
     * <p>*   **PENDING**: The SQL task waited to be run.</p>
     * <p>*   **BE_SCHEDULED**: The SQL task waited to be scheduled.</p>
     * <p>*   **FAIL**: The SQL task failed.</p>
     * <p>*   **SUCCESS**: The SQL task was successful.</p>
     * <p>*   **PAUSE**: The SQL task was paused.</p>
     * <p>*   **DELETE**: The SQL task was deleted.</p>
     * <p>*   **RUNNING**: The SQL task was being run.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The error code that is returned.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the physical database.</p>
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
