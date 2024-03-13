// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeDeploymentJobStatusRequest extends TeaModel {
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
