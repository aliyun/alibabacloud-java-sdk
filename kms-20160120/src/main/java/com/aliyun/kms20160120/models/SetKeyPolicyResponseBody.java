// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class SetKeyPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetKeyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetKeyPolicyResponseBody self = new SetKeyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetKeyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
