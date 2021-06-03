// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSmartJobsRequest extends TeaModel {
    @NameInMap("Status")
    public Long status;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("JobState")
    public String jobState;

    public static ListSmartJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSmartJobsRequest self = new ListSmartJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListSmartJobsRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public ListSmartJobsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSmartJobsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListSmartJobsRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListSmartJobsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSmartJobsRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListSmartJobsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListSmartJobsRequest setJobState(String jobState) {
        this.jobState = jobState;
        return this;
    }
    public String getJobState() {
        return this.jobState;
    }

}
