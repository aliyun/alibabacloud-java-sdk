// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ReleaseClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterResponseBody self = new ReleaseClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
