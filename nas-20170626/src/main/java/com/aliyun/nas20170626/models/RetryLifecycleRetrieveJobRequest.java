// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class RetryLifecycleRetrieveJobRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    public static RetryLifecycleRetrieveJobRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryLifecycleRetrieveJobRequest self = new RetryLifecycleRetrieveJobRequest();
        return TeaModel.build(map, self);
    }

    public RetryLifecycleRetrieveJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
