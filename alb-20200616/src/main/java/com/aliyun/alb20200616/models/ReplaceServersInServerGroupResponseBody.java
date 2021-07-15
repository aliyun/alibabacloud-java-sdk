// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ReplaceServersInServerGroupResponseBody extends TeaModel {
    // 异步任务id
    @NameInMap("JobId")
    public String jobId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ReplaceServersInServerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceServersInServerGroupResponseBody self = new ReplaceServersInServerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceServersInServerGroupResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ReplaceServersInServerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
