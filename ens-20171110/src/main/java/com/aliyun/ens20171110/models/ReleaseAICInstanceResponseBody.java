// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleaseAICInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseAICInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAICInstanceResponseBody self = new ReleaseAICInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseAICInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
