// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateServerGroupResponseBody extends TeaModel {
    // 异步任务Id
    @NameInMap("JobId")
    public String jobId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 服务器组id
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    public static CreateServerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServerGroupResponseBody self = new CreateServerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServerGroupResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateServerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServerGroupResponseBody setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

}
