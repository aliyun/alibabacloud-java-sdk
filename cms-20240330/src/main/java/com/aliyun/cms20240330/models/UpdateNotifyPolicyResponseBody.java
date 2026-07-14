// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateNotifyPolicyResponseBody extends TeaModel {
    /**
     * <p>The notification policy object details, including the policy uuid, name, description, enabled status, and sub-entities such as notification policies (noise reduction, notification routing, and channels), subscriptions (event filtering, cross-workspace routing, and legacy product event subscriptions), and response plans (escalation, repeated notifications, automatic recovery, and action integration).</p>
     */
    @NameInMap("notifyPolicy")
    public NotifyPolicy notifyPolicy;

    /**
     * <p>The unique ID of the request. You can use this ID for troubleshooting and ticket locating.</p>
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
