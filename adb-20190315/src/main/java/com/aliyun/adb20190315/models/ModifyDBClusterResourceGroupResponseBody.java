// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterResourceGroupResponseBody self = new ModifyDBClusterResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
