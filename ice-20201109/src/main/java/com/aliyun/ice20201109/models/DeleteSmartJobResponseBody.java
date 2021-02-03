// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteSmartJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    @NameInMap("JobId")
    public String jobId;

    public static DeleteSmartJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmartJobResponseBody self = new DeleteSmartJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSmartJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSmartJobResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DeleteSmartJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
