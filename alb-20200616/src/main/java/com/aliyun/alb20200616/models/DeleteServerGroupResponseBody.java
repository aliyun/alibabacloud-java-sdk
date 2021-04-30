// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteServerGroupResponseBody extends TeaModel {
    // job
    @NameInMap("JobId")
    public String jobId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteServerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServerGroupResponseBody self = new DeleteServerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServerGroupResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DeleteServerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
