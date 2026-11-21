// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateNotifyPolicyResponseBody extends TeaModel {
    /**
     * <p>The details of the notification policy object, including the policy UUID, name, description, and enabling status, as well as sub-entities such as the notification policy (group merging, notification routing, and channels), subscriptions (event filtering, cross-workspace routing, and legacy product event subscriptions), and response plans (escalation, repeated notifications, automatic recovery, and action integration).</p>
     */
    @NameInMap("notifyPolicy")
    public NotifyPolicy notifyPolicy;

    /**
     * <p>The unique ID of the request, which is used for troubleshooting and ticket tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>70D52620-2609-1802-9788-6BC592C83F03</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateNotifyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNotifyPolicyResponseBody self = new UpdateNotifyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNotifyPolicyResponseBody setNotifyPolicy(NotifyPolicy notifyPolicy) {
        this.notifyPolicy = notifyPolicy;
        return this;
    }
    public NotifyPolicy getNotifyPolicy() {
        return this.notifyPolicy;
    }

    public UpdateNotifyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
