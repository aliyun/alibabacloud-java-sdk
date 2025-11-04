// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryTraceM3u8JobListRequest extends TeaModel {
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
     * <p>The job ID. You can obtain the value of this parameter from the response of the SubmitTraceM3u8Job operation.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
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

    public static QueryTraceM3u8JobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceM3u8JobListRequest self = new QueryTraceM3u8JobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceM3u8JobListRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public QueryTraceM3u8JobListRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public QueryTraceM3u8JobListRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryTraceM3u8JobListRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryTraceM3u8JobListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
