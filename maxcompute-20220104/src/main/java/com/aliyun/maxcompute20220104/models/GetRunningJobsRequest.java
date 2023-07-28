// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetRunningJobsRequest extends TeaModel {
    @NameInMap("from")
    public Long from;

    @NameInMap("jobOwnerList")
    public java.util.List<String> jobOwnerList;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("quotaNicknameList")
    public java.util.List<String> quotaNicknameList;

    @NameInMap("to")
    public Long to;

    public static GetRunningJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRunningJobsRequest self = new GetRunningJobsRequest();
        return TeaModel.build(map, self);
    }

    public GetRunningJobsRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetRunningJobsRequest setJobOwnerList(java.util.List<String> jobOwnerList) {
        this.jobOwnerList = jobOwnerList;
        return this;
    }
    public java.util.List<String> getJobOwnerList() {
        return this.jobOwnerList;
    }

    public GetRunningJobsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetRunningJobsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetRunningJobsRequest setQuotaNicknameList(java.util.List<String> quotaNicknameList) {
        this.quotaNicknameList = quotaNicknameList;
        return this;
    }
    public java.util.List<String> getQuotaNicknameList() {
        return this.quotaNicknameList;
    }

    public GetRunningJobsRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
