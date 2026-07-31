// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyUserBusinessBehaviorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUserBusinessBehaviorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserBusinessBehaviorResponseBody self = new ModifyUserBusinessBehaviorResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUserBusinessBehaviorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
