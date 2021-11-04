// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitMediaDetailJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitMediaDetailJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaDetailJobResponseBody self = new SubmitMediaDetailJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitMediaDetailJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitMediaDetailJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
