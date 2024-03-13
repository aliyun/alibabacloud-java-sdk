// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListDeploymentJobCertRequest extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    public static ListDeploymentJobCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentJobCertRequest self = new ListDeploymentJobCertRequest();
        return TeaModel.build(map, self);
    }

    public ListDeploymentJobCertRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
