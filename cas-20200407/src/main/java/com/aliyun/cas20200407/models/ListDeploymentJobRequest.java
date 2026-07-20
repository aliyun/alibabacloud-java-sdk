// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListDeploymentJobRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The task type.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The number of certificates to display per page in a paged query. Default value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The deployment task status.</p>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
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
