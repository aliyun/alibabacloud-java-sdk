// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetPasswordPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetPasswordPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordPolicyResponseBody self = new SetPasswordPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPasswordPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
