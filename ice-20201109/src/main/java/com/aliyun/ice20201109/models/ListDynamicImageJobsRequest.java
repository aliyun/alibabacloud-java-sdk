// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListDynamicImageJobsRequest extends TeaModel {
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

    public static ListDynamicImageJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicImageJobsRequest self = new ListDynamicImageJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListDynamicImageJobsRequest setEndOfCreateTime(String endOfCreateTime) {
        this.endOfCreateTime = endOfCreateTime;
        return this;
    }
    public String getEndOfCreateTime() {
        return this.endOfCreateTime;
    }

    public ListDynamicImageJobsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListDynamicImageJobsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListDynamicImageJobsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDynamicImageJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDynamicImageJobsRequest setStartOfCreateTime(String startOfCreateTime) {
        this.startOfCreateTime = startOfCreateTime;
        return this;
    }
    public String getStartOfCreateTime() {
        return this.startOfCreateTime;
    }

    public ListDynamicImageJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
