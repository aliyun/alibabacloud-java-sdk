// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchJobRequest extends TeaModel {
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("JobStatus")
    public Integer jobStatus;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryPictureSearchJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchJobRequest self = new QueryPictureSearchJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchJobRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public QueryPictureSearchJobRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryPictureSearchJobRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public QueryPictureSearchJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
