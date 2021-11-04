// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMattingJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Output")
    public String output;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    @NameInMap("UserData")
    public String userData;

    public static SubmitMattingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitMattingJobResponseBody self = new SubmitMattingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitMattingJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitMattingJobResponseBody setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitMattingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitMattingJobResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public SubmitMattingJobResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
