// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>job-518855d9a058c32798c319561f</p>
     */
    @NameInMap("jobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>136B3926-DD90-5DB2-96EC-8BAD6407D1C9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJobResponseBody self = new CreateJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
