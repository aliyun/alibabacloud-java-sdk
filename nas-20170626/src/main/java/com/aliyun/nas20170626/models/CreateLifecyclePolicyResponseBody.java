// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLifecyclePolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateLifecyclePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLifecyclePolicyResponseBody self = new CreateLifecyclePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLifecyclePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLifecyclePolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
