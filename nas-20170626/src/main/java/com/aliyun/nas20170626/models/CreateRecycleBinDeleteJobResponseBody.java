// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateRecycleBinDeleteJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobId")
    public String jobId;

    public static CreateRecycleBinDeleteJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRecycleBinDeleteJobResponseBody self = new CreateRecycleBinDeleteJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRecycleBinDeleteJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRecycleBinDeleteJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
