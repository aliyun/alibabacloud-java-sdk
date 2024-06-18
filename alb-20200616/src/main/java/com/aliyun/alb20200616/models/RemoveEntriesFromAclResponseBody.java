// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class RemoveEntriesFromAclResponseBody extends TeaModel {
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
     * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveEntriesFromAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntriesFromAclResponseBody self = new RemoveEntriesFromAclResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveEntriesFromAclResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public RemoveEntriesFromAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
