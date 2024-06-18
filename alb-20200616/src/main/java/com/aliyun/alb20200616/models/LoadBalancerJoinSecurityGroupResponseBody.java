// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class LoadBalancerJoinSecurityGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8fe81f25-79a0-4fa0-9036-f2601fda****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>D3B9AE45-F5DB-58E3-A4B5-EE58F1EC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LoadBalancerJoinSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoadBalancerJoinSecurityGroupResponseBody self = new LoadBalancerJoinSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public LoadBalancerJoinSecurityGroupResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public LoadBalancerJoinSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
