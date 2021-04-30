// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AddEntriesToAclResponseBody extends TeaModel {
    // job
    @NameInMap("JobId")
    public String jobId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AddEntriesToAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddEntriesToAclResponseBody self = new AddEntriesToAclResponseBody();
        return TeaModel.build(map, self);
    }

    public AddEntriesToAclResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public AddEntriesToAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
