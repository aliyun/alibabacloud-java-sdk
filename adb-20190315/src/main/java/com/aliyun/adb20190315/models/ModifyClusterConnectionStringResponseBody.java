// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyClusterConnectionStringResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterConnectionStringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterConnectionStringResponseBody self = new ModifyClusterConnectionStringResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterConnectionStringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
