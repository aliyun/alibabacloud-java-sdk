// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateNotifyPolicyResponseBody extends TeaModel {
    /**
     * <p>The details of the notification policy object, including the policy UUID, name, description, and enabled status, as well as sub-entities such as the notification strategy (grouping and merging, notification routing, and channels), subscription (event filtering, cross-workspace routing, and legacy product event subscription), and response plan (escalation, repeated notifications, automatic recovery, and action integration).</p>
     */
    @NameInMap("notifyPolicy")
    public NotifyPolicy notifyPolicy;

    /**
     * <p>The unique ID of the request. This ID is used for troubleshooting and ticket tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateNotifyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNotifyPolicyResponseBody self = new CreateNotifyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNotifyPolicyResponseBody setNotifyPolicy(NotifyPolicy notifyPolicy) {
        this.notifyPolicy = notifyPolicy;
        return this;
    }
    public NotifyPolicy getNotifyPolicy() {
        return this.notifyPolicy;
    }

    public CreateNotifyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
