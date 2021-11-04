// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitURLUploadJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitURLUploadJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitURLUploadJobResponseBody self = new SubmitURLUploadJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitURLUploadJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitURLUploadJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
