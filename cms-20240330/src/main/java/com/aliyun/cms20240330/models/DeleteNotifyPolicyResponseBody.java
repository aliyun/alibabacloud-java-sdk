// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteNotifyPolicyResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the request. Used for troubleshooting and ticket tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>A1234567-1234-1234-1234-123456789012</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The uuid of the notification policy that was operated on.</p>
     * 
     * <strong>example:</strong>
     * <p>np-12345678-1234-1234-1234-123456789012</p>
     */
    @NameInMap("uuid")
    public String uuid;

    public static DeleteNotifyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNotifyPolicyResponseBody self = new DeleteNotifyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNotifyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteNotifyPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteNotifyPolicyResponseBody setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
