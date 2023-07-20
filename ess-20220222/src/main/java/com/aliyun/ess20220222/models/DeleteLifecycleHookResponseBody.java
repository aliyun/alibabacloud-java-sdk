// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteLifecycleHookResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLifecycleHookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLifecycleHookResponseBody self = new DeleteLifecycleHookResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLifecycleHookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
