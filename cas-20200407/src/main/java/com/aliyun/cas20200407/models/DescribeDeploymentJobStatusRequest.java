// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeDeploymentJobStatusRequest extends TeaModel {
    /**
     * <p>The ID of the deployment task. You can call the <a href="https://help.aliyun.com/document_detail/2712234.html">CreateDeploymentJob</a> operation to obtain the ID of a deployment task from the <strong>JobId</strong> parameter. You can also call the <a href="https://help.aliyun.com/document_detail/2712223.html">ListDeploymentJob</a> operation to obtain the ID of a deployment task.</p>
     * 
     * <strong>example:</strong>
     * <p>8888</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    public static DescribeDeploymentJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentJobStatusRequest self = new DescribeDeploymentJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentJobStatusRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
