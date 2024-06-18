// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateServerGroupAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous job.</p>
     * 
     * <strong>example:</strong>
     * <p>72dcd26b-f12d-4c27-b3af-18f6aed5****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServerGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerGroupAttributeResponseBody self = new UpdateServerGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServerGroupAttributeResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateServerGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
