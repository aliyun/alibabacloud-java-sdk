// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportTerrorismJobResultResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static ReportTerrorismJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportTerrorismJobResultResponseBody self = new ReportTerrorismJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportTerrorismJobResultResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ReportTerrorismJobResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
