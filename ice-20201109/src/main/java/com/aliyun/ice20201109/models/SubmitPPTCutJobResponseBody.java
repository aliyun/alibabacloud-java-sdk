// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitPPTCutJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Output")
    public String output;

    @NameInMap("State")
    public String state;

    @NameInMap("UserData")
    public String userData;

    public static SubmitPPTCutJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitPPTCutJobResponseBody self = new SubmitPPTCutJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitPPTCutJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitPPTCutJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitPPTCutJobResponseBody setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitPPTCutJobResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public SubmitPPTCutJobResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
