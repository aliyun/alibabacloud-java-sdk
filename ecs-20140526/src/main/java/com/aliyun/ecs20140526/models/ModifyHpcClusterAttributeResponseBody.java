// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyHpcClusterAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHpcClusterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHpcClusterAttributeResponseBody self = new ModifyHpcClusterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHpcClusterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
