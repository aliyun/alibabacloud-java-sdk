// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyHaVipAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyHaVipAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHaVipAttributeResponse self = new ModifyHaVipAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHaVipAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
