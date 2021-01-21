// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchJobResultRequest extends TeaModel {
    @NameInMap("AppInstanceId")
    @Validation(required = true)
    public String appInstanceId;

    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

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

    public QueryPictureSearchJobResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
