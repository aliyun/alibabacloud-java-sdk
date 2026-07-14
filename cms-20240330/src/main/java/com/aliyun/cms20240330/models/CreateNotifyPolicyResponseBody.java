// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateNotifyPolicyResponseBody extends TeaModel {
    /**
     * <p>The notification policy object details, including the policy UUID, name, description, enabled status, and sub-entities such as notification strategy (grouping, noise reduction, notification routing, and channels), subscription (event filtering, cross-workspace routing, and legacy product event subscription), and response plan (upgrade, repeated notification, automatic recovery, and action integration).</p>
     */
    @NameInMap("notifyPolicy")
    public NotifyPolicy notifyPolicy;

    /**
     * <p>The unique ID of the request. You can use this ID for troubleshooting and ticket tracking.</p>
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
