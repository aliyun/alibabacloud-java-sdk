// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchJobResultRequest extends TeaModel {
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryPictureSearchJobResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchJobResultRequest self = new QueryPictureSearchJobResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchJobResultRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public QueryPictureSearchJobResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryPictureSearchJobResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryPictureSearchJobResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
