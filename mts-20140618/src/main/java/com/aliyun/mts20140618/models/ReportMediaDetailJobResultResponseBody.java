// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportMediaDetailJobResultResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static ReportMediaDetailJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportMediaDetailJobResultResponseBody self = new ReportMediaDetailJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportMediaDetailJobResultResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ReportMediaDetailJobResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
