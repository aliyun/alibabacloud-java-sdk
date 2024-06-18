// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateAScriptsResponseBody extends TeaModel {
    /**
     * <p>The asynchronous task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2e82b5f4-1ba9-4d20-89c8-1082ebaa****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ACA19FE1-C09E-53C7-8FDA-560F49D71891</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAScriptsResponseBody self = new UpdateAScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAScriptsResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateAScriptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
