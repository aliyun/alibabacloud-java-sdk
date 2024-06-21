// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeletePolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BD06F539-2FBE-450D-9391-7EFF7871****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyResponseBody self = new DeletePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
