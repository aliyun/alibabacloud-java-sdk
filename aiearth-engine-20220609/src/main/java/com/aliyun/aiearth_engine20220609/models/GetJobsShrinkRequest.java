// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class GetJobsShrinkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("JobIds")
    public String jobIdsShrink;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("NameLike")
    public String nameLike;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobsShrinkRequest self = new GetJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetJobsShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetJobsShrinkRequest setJobIdsShrink(String jobIdsShrink) {
        this.jobIdsShrink = jobIdsShrink;
        return this;
    }
    public String getJobIdsShrink() {
        return this.jobIdsShrink;
    }

    public GetJobsShrinkRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public GetJobsShrinkRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public GetJobsShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetJobsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
