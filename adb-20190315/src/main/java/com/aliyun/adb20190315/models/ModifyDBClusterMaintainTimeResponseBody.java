// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMaintainTimeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterMaintainTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMaintainTimeResponseBody self = new ModifyDBClusterMaintainTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterMaintainTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
