// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDedicatedHostAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAttributeResponseBody self = new ModifyDedicatedHostAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
