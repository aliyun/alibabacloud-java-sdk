// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class RemoveEntriesFromAclResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static RemoveEntriesFromAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntriesFromAclResponseBody self = new RemoveEntriesFromAclResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveEntriesFromAclResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public RemoveEntriesFromAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
