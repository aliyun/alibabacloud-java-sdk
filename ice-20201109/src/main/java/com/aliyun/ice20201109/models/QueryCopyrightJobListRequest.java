// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryCopyrightJobListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1627357325</p>
     */
    @NameInMap("CreateTimeEnd")
    public Long createTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>1627357322</p>
     */
    @NameInMap("CreateTimeStart")
    public Long createTimeStart;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Level")
    public Long level;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
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
