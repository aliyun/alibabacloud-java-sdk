// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DissociateAdditionalCertificatesFromListenerResponseBody extends TeaModel {
    /**
     * <p>The asynchronous task ID.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DissociateAdditionalCertificatesFromListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateAdditionalCertificatesFromListenerResponseBody self = new DissociateAdditionalCertificatesFromListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateAdditionalCertificatesFromListenerResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DissociateAdditionalCertificatesFromListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
