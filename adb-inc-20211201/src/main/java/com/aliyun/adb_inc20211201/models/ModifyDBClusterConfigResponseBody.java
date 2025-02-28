// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterConfigResponseBody self = new ModifyDBClusterConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
