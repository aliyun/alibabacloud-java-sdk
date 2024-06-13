// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeDeploymentJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
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
