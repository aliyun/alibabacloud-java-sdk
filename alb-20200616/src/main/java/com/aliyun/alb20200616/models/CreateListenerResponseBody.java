// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateListenerResponseBody extends TeaModel {
    // 异步任务Id
    @NameInMap("JobId")
    public String jobId;

    // 监听标识
    @NameInMap("ListenerId")
    public String listenerId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateListenerResponseBody self = new CreateListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateListenerResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateListenerResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
