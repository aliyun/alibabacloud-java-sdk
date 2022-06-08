// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSmartJobsRequest extends TeaModel {
    // 任务状态
    @NameInMap("JobState")
    public String jobState;

    // 任务类型
    @NameInMap("JobType")
    public String jobType;

    // 分页大小。最大不超过100。  默认值：10
    @NameInMap("MaxResults")
    public Long maxResults;

    // 当前开始读取的位置
    @NameInMap("NextToken")
    public String nextToken;

    // 当前页码。默认值为1。
    @NameInMap("PageNo")
    public Long pageNo;

    // 分页大小，每页显示条数。默认值为10，最大值为100。
    @NameInMap("PageSize")
    public Long pageSize;

    // 排序参数，默认根据创建时间倒序
    @NameInMap("SortBy")
    public String sortBy;

    public static ListSmartJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSmartJobsRequest self = new ListSmartJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListSmartJobsRequest setJobState(String jobState) {
        this.jobState = jobState;
        return this;
    }
    public String getJobState() {
        return this.jobState;
    }

    public ListSmartJobsRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListSmartJobsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListSmartJobsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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

    public ListSmartJobsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
