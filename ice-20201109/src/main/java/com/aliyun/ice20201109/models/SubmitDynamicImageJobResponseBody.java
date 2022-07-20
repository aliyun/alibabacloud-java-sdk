// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitDynamicImageJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDynamicImageJobResponseBody self = new SubmitDynamicImageJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDynamicImageJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitDynamicImageJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
