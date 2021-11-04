// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitAnnotationJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAnnotationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAnnotationJobResponseBody self = new SubmitAnnotationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAnnotationJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitAnnotationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
