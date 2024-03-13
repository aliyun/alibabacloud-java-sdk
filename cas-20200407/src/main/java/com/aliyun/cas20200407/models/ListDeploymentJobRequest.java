// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListDeploymentJobRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("ShowSize")
    public Integer showSize;

    @NameInMap("Status")
    public String status;

    public static ListDeploymentJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentJobRequest self = new ListDeploymentJobRequest();
        return TeaModel.build(map, self);
    }

    public ListDeploymentJobRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDeploymentJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListDeploymentJobRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListDeploymentJobRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
