// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePrivateAccessPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateAccessPolicyResponseBody self = new UpdatePrivateAccessPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateAccessPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
