// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyClusterServiceConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterServiceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterServiceConfigResponseBody self = new ModifyClusterServiceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterServiceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
