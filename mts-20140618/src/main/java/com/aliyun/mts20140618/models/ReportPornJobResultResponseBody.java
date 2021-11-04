// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportPornJobResultResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static ReportPornJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportPornJobResultResponseBody self = new ReportPornJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportPornJobResultResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ReportPornJobResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
