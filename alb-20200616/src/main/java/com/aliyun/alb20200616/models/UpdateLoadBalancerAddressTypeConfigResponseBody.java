// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAddressTypeConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous job.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLoadBalancerAddressTypeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerAddressTypeConfigResponseBody self = new UpdateLoadBalancerAddressTypeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerAddressTypeConfigResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateLoadBalancerAddressTypeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
