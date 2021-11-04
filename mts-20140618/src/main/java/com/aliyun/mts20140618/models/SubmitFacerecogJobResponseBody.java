// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFacerecogJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitFacerecogJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitFacerecogJobResponseBody self = new SubmitFacerecogJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitFacerecogJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitFacerecogJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
