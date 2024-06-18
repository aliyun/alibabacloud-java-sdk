// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DisableLoadBalancerIpv6InternetResponseBody extends TeaModel {
    /**
     * <p>The asynchronous task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d12871a6-ebb2-41f3-8d74-d9f452bb****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7D866E37-1123-5160-AFF1-BDAF5EB86A8A</p>
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
