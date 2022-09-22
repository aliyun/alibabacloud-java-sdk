// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyWaitingOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWaitingOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWaitingOrderResponseBody self = new ModifyWaitingOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWaitingOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
