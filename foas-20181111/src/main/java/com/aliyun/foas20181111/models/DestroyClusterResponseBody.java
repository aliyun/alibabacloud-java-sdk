// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class DestroyClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DestroyClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DestroyClusterResponseBody self = new DestroyClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DestroyClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
