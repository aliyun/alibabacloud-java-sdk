// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryTraceAbJobListRequest extends TeaModel {
    /**
     * <p>The end of the creation time range for the query, in UNIX timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1627357325</p>
     */
    @NameInMap("CreateTimeEnd")
    public Long createTimeEnd;

    /**
     * <p>The start of the creation time range for the query, in UNIX timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1627357322</p>
     */
    @NameInMap("CreateTimeStart")
    public Long createTimeStart;

    /**
     * <p>The job ID. You can obtain the value of this parameter from the response of the SubmitTraceAbJob operation.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The media ID for the trace watermark. You can obtain this from the response of the SubmitTraceAbJob operation.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>437bd2b51105d07b12a9</strong></strong></p>
     */
    @NameInMap("TraceMediaId")
    public String traceMediaId;

    public static QueryTraceAbJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceAbJobListRequest self = new QueryTraceAbJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceAbJobListRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public QueryTraceAbJobListRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public QueryTraceAbJobListRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryTraceAbJobListRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryTraceAbJobListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTraceAbJobListRequest setTraceMediaId(String traceMediaId) {
        this.traceMediaId = traceMediaId;
        return this;
    }
    public String getTraceMediaId() {
        return this.traceMediaId;
    }

}
