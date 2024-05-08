// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class SetSecretPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetSecretPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSecretPolicyResponseBody self = new SetSecretPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSecretPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
