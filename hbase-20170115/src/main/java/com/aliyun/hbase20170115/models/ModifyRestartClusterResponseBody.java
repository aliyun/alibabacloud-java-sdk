// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyRestartClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRestartClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRestartClusterResponseBody self = new ModifyRestartClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRestartClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
