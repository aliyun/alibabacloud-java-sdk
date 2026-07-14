// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EnableNotifyPolicyResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-***</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The unique identifier of the notification policy.</p>
     * 
     * <strong>example:</strong>
     * <p>7076c75c-c804-461e-975f-c6f9ed5af745</p>
     */
    @NameInMap("uuid")
    public String uuid;

    public static EnableNotifyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableNotifyPolicyResponseBody self = new EnableNotifyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableNotifyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableNotifyPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EnableNotifyPolicyResponseBody setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
