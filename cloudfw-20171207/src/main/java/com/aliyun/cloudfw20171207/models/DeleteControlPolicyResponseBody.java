// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteControlPolicyResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteControlPolicyResponseBody self = new DeleteControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
