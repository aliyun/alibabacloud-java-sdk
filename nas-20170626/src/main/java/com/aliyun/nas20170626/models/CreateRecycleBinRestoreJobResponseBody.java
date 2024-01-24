// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateRecycleBinRestoreJobResponseBody extends TeaModel {
    /**
     * <p>The job ID.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRecycleBinRestoreJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRecycleBinRestoreJobResponseBody self = new CreateRecycleBinRestoreJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRecycleBinRestoreJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateRecycleBinRestoreJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
