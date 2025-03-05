// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class EnableLoadBalancerAccessLogResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous job.</p>
     * 
     * <strong>example:</strong>
     * <p>ff7713ca-5818-4120-85e3-0bf9fr******</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>593B0448-D13E-4C56-AC0D-FDF0FD******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableLoadBalancerAccessLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableLoadBalancerAccessLogResponseBody self = new EnableLoadBalancerAccessLogResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableLoadBalancerAccessLogResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public EnableLoadBalancerAccessLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
