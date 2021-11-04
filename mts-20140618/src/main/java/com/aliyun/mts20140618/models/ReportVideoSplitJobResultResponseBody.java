// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportVideoSplitJobResultResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static ReportVideoSplitJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportVideoSplitJobResultResponseBody self = new ReportVideoSplitJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportVideoSplitJobResultResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ReportVideoSplitJobResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
