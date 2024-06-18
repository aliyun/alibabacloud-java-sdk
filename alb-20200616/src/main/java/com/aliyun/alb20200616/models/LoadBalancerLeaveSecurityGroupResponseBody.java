// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class LoadBalancerLeaveSecurityGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>51c5b627-3500-487c-b17d-5cc583f0****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>EC0C96E4-7CCB-599C-9329-3A5DB6FF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LoadBalancerLeaveSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoadBalancerLeaveSecurityGroupResponseBody self = new LoadBalancerLeaveSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public LoadBalancerLeaveSecurityGroupResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public LoadBalancerLeaveSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
