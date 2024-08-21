// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeDeploymentJobRequest extends TeaModel {
    /**
     * <p>The ID of the deployment job. The <strong>ID</strong> of the job is returned after you call the <a href="https://help.aliyun.com/document_detail/2712234.html">CreateDeploymentJob</a> operation. You can also call the <a href="https://help.aliyun.com/document_detail/2712223.html">ListDeploymentJob</a> operation to obtain the ID.</p>
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
