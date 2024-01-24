// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLifecycleRetrieveJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the data retrieval task.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLifecycleRetrieveJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLifecycleRetrieveJobResponseBody self = new CreateLifecycleRetrieveJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLifecycleRetrieveJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateLifecycleRetrieveJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
