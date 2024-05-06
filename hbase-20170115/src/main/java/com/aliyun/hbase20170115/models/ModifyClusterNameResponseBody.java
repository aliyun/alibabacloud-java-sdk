// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyClusterNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterNameResponseBody self = new ModifyClusterNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
