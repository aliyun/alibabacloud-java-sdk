// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportFpShotJobResultResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static ReportFpShotJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportFpShotJobResultResponseBody self = new ReportFpShotJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportFpShotJobResultResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ReportFpShotJobResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
