// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateLifecycleHookResponseBody extends TeaModel {
    /**
     * <p>The ID of the lifecycle hook.</p>
     */
    @NameInMap("LifecycleHookId")
    public String lifecycleHookId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLifecycleHookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLifecycleHookResponseBody self = new CreateLifecycleHookResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLifecycleHookResponseBody setLifecycleHookId(String lifecycleHookId) {
        this.lifecycleHookId = lifecycleHookId;
        return this;
    }
    public String getLifecycleHookId() {
        return this.lifecycleHookId;
    }

    public CreateLifecycleHookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
