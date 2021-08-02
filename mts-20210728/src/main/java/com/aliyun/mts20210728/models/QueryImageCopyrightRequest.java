// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryImageCopyrightRequest extends TeaModel {
    // 创建时间起始
    @NameInMap("CreateTimeEnd")
    public Long createTimeEnd;

    // 创建时间截止
    @NameInMap("CreateTimeStart")
    public Long createTimeStart;

    // 任务ID
    @NameInMap("JobId")
    public String jobId;

    // 页偏移
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 每页数量
    @NameInMap("PageSize")
    public Long pageSize;

    public static QueryImageCopyrightRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryImageCopyrightRequest self = new QueryImageCopyrightRequest();
        return TeaModel.build(map, self);
    }

    public QueryImageCopyrightRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public QueryImageCopyrightRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public QueryImageCopyrightRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryImageCopyrightRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryImageCopyrightRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
