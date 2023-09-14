// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class EnableLoadBalancerIpv6InternetResponseBody extends TeaModel {
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

    public static EnableLoadBalancerIpv6InternetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableLoadBalancerIpv6InternetResponseBody self = new EnableLoadBalancerIpv6InternetResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableLoadBalancerIpv6InternetResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public EnableLoadBalancerIpv6InternetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
