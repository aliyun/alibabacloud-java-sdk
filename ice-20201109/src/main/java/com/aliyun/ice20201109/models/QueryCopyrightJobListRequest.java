// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryCopyrightJobListRequest extends TeaModel {
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
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The watermark level, indicating the color channel for embedding. 0: U. 1: UV. 2: YUV.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Level")
    public Long level;

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

    public static QueryCopyrightJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightJobListRequest self = new QueryCopyrightJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightJobListRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public QueryCopyrightJobListRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public QueryCopyrightJobListRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryCopyrightJobListRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public QueryCopyrightJobListRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryCopyrightJobListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
