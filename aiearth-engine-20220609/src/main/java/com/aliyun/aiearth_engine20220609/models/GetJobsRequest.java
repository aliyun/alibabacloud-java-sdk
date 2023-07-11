// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class GetJobsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("JobIds")
    public java.util.List<Long> jobIds;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("NameLike")
    public String nameLike;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobsRequest self = new GetJobsRequest();
        return TeaModel.build(map, self);
    }

    public GetJobsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetJobsRequest setJobIds(java.util.List<Long> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<Long> getJobIds() {
        return this.jobIds;
    }

    public GetJobsRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public GetJobsRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public GetJobsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
