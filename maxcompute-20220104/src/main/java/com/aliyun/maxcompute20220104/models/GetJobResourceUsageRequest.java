// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetJobResourceUsageRequest extends TeaModel {
    @NameInMap("date")
    public String date;

    @NameInMap("jobOwnerList")
    public java.util.List<String> jobOwnerList;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("quotaNicknameList")
    public java.util.List<String> quotaNicknameList;

    public static GetJobResourceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobResourceUsageRequest self = new GetJobResourceUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetJobResourceUsageRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetJobResourceUsageRequest setJobOwnerList(java.util.List<String> jobOwnerList) {
        this.jobOwnerList = jobOwnerList;
        return this;
    }
    public java.util.List<String> getJobOwnerList() {
        return this.jobOwnerList;
    }

    public GetJobResourceUsageRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetJobResourceUsageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetJobResourceUsageRequest setQuotaNicknameList(java.util.List<String> quotaNicknameList) {
        this.quotaNicknameList = quotaNicknameList;
        return this;
    }
    public java.util.List<String> getQuotaNicknameList() {
        return this.quotaNicknameList;
    }

}
