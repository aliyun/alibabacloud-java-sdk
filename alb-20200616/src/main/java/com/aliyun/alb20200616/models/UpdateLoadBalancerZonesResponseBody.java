// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerZonesResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLoadBalancerZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerZonesResponseBody self = new UpdateLoadBalancerZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerZonesResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateLoadBalancerZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
