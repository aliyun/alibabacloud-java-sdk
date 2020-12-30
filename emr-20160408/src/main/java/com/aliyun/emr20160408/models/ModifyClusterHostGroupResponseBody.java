// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyClusterHostGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterHostGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterHostGroupResponseBody self = new ModifyClusterHostGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterHostGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
