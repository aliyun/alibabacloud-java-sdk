// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeDeploymentJobRequest extends TeaModel {
    /**
     * <p>The ID of the deployment job. To get the job ID, call the <a href="https://help.aliyun.com/document_detail/2712234.html">CreateDeploymentJob</a> or <a href="https://help.aliyun.com/document_detail/2712223.html">ListDeploymentJob</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8888</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    public static DescribeDeploymentJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentJobRequest self = new DescribeDeploymentJobRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
