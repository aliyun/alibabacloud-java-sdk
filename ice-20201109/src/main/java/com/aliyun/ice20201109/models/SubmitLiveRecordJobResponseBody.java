// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveRecordJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ab0e3e76-1e9d-11ed-ba64-0c42a1b73d66</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>BEA98A0C-7870-15FE-B96F-8880BB600A2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitLiveRecordJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveRecordJobResponseBody self = new SubmitLiveRecordJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitLiveRecordJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitLiveRecordJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
