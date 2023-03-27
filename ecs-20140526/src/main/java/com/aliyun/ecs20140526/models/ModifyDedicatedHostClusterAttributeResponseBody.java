// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostClusterAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDedicatedHostClusterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostClusterAttributeResponseBody self = new ModifyDedicatedHostClusterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostClusterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
