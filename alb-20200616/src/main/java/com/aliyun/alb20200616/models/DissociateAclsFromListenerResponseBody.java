// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DissociateAclsFromListenerResponseBody extends TeaModel {
    // 异步任务id
    @NameInMap("JobId")
    public String jobId;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    public static DissociateAclsFromListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateAclsFromListenerResponseBody self = new DissociateAclsFromListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateAclsFromListenerResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DissociateAclsFromListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
