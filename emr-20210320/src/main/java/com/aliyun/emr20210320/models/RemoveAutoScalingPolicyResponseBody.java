// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RemoveAutoScalingPolicyResponseBody extends TeaModel {
    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveAutoScalingPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAutoScalingPolicyResponseBody self = new RemoveAutoScalingPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAutoScalingPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
