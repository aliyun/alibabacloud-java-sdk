// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitMediaFpDeleteJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobId")
    public String jobId;

    public static SubmitMediaFpDeleteJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaFpDeleteJobResponseBody self = new SubmitMediaFpDeleteJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitMediaFpDeleteJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitMediaFpDeleteJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
