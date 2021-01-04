// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterResponseBody self = new ModifyClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
