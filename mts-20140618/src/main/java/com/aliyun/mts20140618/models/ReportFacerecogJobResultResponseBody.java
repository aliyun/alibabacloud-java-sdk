// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportFacerecogJobResultResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static ReportFacerecogJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportFacerecogJobResultResponseBody self = new ReportFacerecogJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportFacerecogJobResultResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ReportFacerecogJobResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
