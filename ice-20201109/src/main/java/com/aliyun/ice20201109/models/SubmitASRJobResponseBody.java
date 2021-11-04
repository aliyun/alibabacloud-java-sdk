// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitASRJobResponseBody extends TeaModel {
    // 智能任务Id
    @NameInMap("JobId")
    public String jobId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 任务状态
    @NameInMap("State")
    public String state;

    public static SubmitASRJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitASRJobResponseBody self = new SubmitASRJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitASRJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitASRJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitASRJobResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
