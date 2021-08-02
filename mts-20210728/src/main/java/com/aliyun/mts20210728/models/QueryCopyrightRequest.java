// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryCopyrightRequest extends TeaModel {
    // 创建时间截止
    @NameInMap("CreateTimeEnd")
    public Long createTimeEnd;

    // 创建时间起始
    @NameInMap("CreateTimeStart")
    public Long createTimeStart;

    // 任务id
    @NameInMap("JobId")
    public String jobId;

    // 水印强度
    @NameInMap("Level")
    public Long level;

    // 翻页下标
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 每页数量
    @NameInMap("PageSize")
    public Long pageSize;

    public static QueryCopyrightRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightRequest self = new QueryCopyrightRequest();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public QueryCopyrightRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public QueryCopyrightRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryCopyrightRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public QueryCopyrightRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryCopyrightRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
