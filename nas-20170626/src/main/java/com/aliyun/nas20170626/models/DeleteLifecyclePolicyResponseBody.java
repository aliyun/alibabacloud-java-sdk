// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteLifecyclePolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteLifecyclePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLifecyclePolicyResponseBody self = new DeleteLifecyclePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLifecyclePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLifecyclePolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
