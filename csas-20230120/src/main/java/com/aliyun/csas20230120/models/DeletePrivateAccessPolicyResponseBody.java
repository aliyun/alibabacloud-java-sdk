// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeletePrivateAccessPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePrivateAccessPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateAccessPolicyResponseBody self = new DeletePrivateAccessPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrivateAccessPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
