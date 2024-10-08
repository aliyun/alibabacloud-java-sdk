// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListDeploymentJobResourceRequest extends TeaModel {
    /**
     * <p>The ID of the deployment task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8888</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    public static ListDeploymentJobResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentJobResourceRequest self = new ListDeploymentJobResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListDeploymentJobResourceRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
