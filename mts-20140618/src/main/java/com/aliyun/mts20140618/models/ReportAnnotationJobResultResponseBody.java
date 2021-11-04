// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportAnnotationJobResultResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static ReportAnnotationJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportAnnotationJobResultResponseBody self = new ReportAnnotationJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportAnnotationJobResultResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ReportAnnotationJobResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
