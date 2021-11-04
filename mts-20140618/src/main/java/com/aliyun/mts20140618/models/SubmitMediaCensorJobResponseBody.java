// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitMediaCensorJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitMediaCensorJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaCensorJobResponseBody self = new SubmitMediaCensorJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitMediaCensorJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitMediaCensorJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
