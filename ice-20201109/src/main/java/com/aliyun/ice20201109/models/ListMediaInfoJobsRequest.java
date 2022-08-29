// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaInfoJobsRequest extends TeaModel {
    @NameInMap("EndOfCreateTime")
    public String endOfCreateTime;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartOfCreateTime")
    public String startOfCreateTime;

    @NameInMap("Status")
    public String status;

    public static ListMediaInfoJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaInfoJobsRequest self = new ListMediaInfoJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListMediaInfoJobsRequest setEndOfCreateTime(String endOfCreateTime) {
        this.endOfCreateTime = endOfCreateTime;
        return this;
    }
    public String getEndOfCreateTime() {
        return this.endOfCreateTime;
    }

    public ListMediaInfoJobsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListMediaInfoJobsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListMediaInfoJobsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListMediaInfoJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMediaInfoJobsRequest setStartOfCreateTime(String startOfCreateTime) {
        this.startOfCreateTime = startOfCreateTime;
        return this;
    }
    public String getStartOfCreateTime() {
        return this.startOfCreateTime;
    }

    public ListMediaInfoJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
