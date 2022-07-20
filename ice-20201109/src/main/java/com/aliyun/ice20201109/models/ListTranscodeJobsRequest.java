// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListTranscodeJobsRequest extends TeaModel {
    // 任务创建时间筛选条件的结束时间
    @NameInMap("EndOfCreateTime")
    public String endOfCreateTime;

    // 按 jobId 筛选
    @NameInMap("JobId")
    public String jobId;

    // 连续分页查询时下一页的标记 (第一页没有)
    @NameInMap("NextPageToken")
    public String nextPageToken;

    // 排序顺序，目前只支持两种：CreateTimeDesc 和 CreateTimeAsc
    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 任务创建时间筛选条件的起始时间
    @NameInMap("StartOfCreateTime")
    public String startOfCreateTime;

    // 任务状态
    @NameInMap("Status")
    public String status;

    public static ListTranscodeJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTranscodeJobsRequest self = new ListTranscodeJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListTranscodeJobsRequest setEndOfCreateTime(String endOfCreateTime) {
        this.endOfCreateTime = endOfCreateTime;
        return this;
    }
    public String getEndOfCreateTime() {
        return this.endOfCreateTime;
    }

    public ListTranscodeJobsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListTranscodeJobsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListTranscodeJobsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListTranscodeJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTranscodeJobsRequest setStartOfCreateTime(String startOfCreateTime) {
        this.startOfCreateTime = startOfCreateTime;
        return this;
    }
    public String getStartOfCreateTime() {
        return this.startOfCreateTime;
    }

    public ListTranscodeJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
