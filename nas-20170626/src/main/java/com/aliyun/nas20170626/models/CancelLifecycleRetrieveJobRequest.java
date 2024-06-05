// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelLifecycleRetrieveJobRequest extends TeaModel {
    /**
     * <p>The ID of the data retrieval task.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static CancelLifecycleRetrieveJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelLifecycleRetrieveJobRequest self = new CancelLifecycleRetrieveJobRequest();
        return TeaModel.build(map, self);
    }

    public CancelLifecycleRetrieveJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
