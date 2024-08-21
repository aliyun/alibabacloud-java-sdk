// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteDeploymentJobRequest extends TeaModel {
    /**
     * <p>The ID of the deployment task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8888</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    public static DeleteDeploymentJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentJobRequest self = new DeleteDeploymentJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
