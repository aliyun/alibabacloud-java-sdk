// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryTraceM3u8JobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1527441303</p>
     */
    @NameInMap("CreateTimeEnd")
    public Long createTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>1527441300</p>
     */
    @NameInMap("CreateTimeStart")
    public Long createTimeStart;

    /**
     * <strong>example:</strong>
     * <p>88c6ca184c0e47098a5b665e2a12****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static QueryTraceM3u8JobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceM3u8JobRequest self = new QueryTraceM3u8JobRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceM3u8JobRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public QueryTraceM3u8JobRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public QueryTraceM3u8JobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryTraceM3u8JobRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryTraceM3u8JobRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
