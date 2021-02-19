// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class CreateLifecycleHookResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LifecycleHookId")
    public String lifecycleHookId;

    public static CreateLifecycleHookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLifecycleHookResponseBody self = new CreateLifecycleHookResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLifecycleHookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLifecycleHookResponseBody setLifecycleHookId(String lifecycleHookId) {
        this.lifecycleHookId = lifecycleHookId;
        return this;
    }
    public String getLifecycleHookId() {
        return this.lifecycleHookId;
    }

}
