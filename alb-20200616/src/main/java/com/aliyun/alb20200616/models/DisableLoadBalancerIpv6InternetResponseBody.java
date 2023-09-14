// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DisableLoadBalancerIpv6InternetResponseBody extends TeaModel {
    /**
     * <p>The asynchronous task ID.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableLoadBalancerIpv6InternetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableLoadBalancerIpv6InternetResponseBody self = new DisableLoadBalancerIpv6InternetResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableLoadBalancerIpv6InternetResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DisableLoadBalancerIpv6InternetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
