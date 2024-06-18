// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteRulesResponseBody extends TeaModel {
    /**
     * <p>The asynchronous task ID.</p>
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
     * <p>7BED4F62-3E6E-5E4F-8C53-2D8CCE77F2ED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRulesResponseBody self = new DeleteRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRulesResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DeleteRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
