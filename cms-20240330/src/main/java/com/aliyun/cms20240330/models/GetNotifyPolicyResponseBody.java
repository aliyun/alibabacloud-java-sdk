// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetNotifyPolicyResponseBody extends TeaModel {
    /**
     * <p>The notification policy object details, including the policy UUID, name, description, enabled status, and sub-entities such as notification policies (noise reduction, notification routing, and channels), subscriptions (event filtering, cross-workspace routing, and legacy product event subscriptions), and response plans (escalation, repeated notifications, automatic recovery, and action integration).</p>
     */
    @NameInMap("notifyPolicy")
    public NotifyPolicy notifyPolicy;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetNotifyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNotifyPolicyResponseBody self = new GetNotifyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNotifyPolicyResponseBody setNotifyPolicy(NotifyPolicy notifyPolicy) {
        this.notifyPolicy = notifyPolicy;
        return this;
    }
    public NotifyPolicy getNotifyPolicy() {
        return this.notifyPolicy;
    }

    public GetNotifyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
