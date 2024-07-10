// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryCopyrightJobRequest extends TeaModel {
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
     * <p>2a0697e35a7342859f733a9190c4****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
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
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static QueryCopyrightJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightJobRequest self = new QueryCopyrightJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightJobRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public QueryCopyrightJobRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public QueryCopyrightJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryCopyrightJobRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public QueryCopyrightJobRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryCopyrightJobRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
