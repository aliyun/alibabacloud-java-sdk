// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DetachCommonBandwidthPackageFromLoadBalancerResponseBody extends TeaModel {
    /**
     * <p>The asynchronous task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>72dcd26b-f12d-4c27-b3af-18f6aed5****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2EF39708-974B-5E74-AFF5-3445263035A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachCommonBandwidthPackageFromLoadBalancerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachCommonBandwidthPackageFromLoadBalancerResponseBody self = new DetachCommonBandwidthPackageFromLoadBalancerResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachCommonBandwidthPackageFromLoadBalancerResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DetachCommonBandwidthPackageFromLoadBalancerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
