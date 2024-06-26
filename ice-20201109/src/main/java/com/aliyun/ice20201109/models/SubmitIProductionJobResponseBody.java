// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitIProductionJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>C1849434-FC47-5DC1-92B6-F7EAAFE3851E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitIProductionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitIProductionJobResponseBody self = new SubmitIProductionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitIProductionJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitIProductionJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
