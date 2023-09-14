// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AssociateAclsWithListenerResponseBody extends TeaModel {
    /**
     * <p>The synchronous task ID.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateAclsWithListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateAclsWithListenerResponseBody self = new AssociateAclsWithListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateAclsWithListenerResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public AssociateAclsWithListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
