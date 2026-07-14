// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DisableNotifyPolicyResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the request. Used for troubleshooting and ticket tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>70D52620-2609-1802-9788-6BC592C83F03</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The uuid of the notification policy that was operated on.</p>
     * 
     * <strong>example:</strong>
     * <p>04779a183add4f2ca06ab440f16cc580</p>
     */
    @NameInMap("uuid")
    public String uuid;

    public static DisableNotifyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableNotifyPolicyResponseBody self = new DisableNotifyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableNotifyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableNotifyPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DisableNotifyPolicyResponseBody setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
