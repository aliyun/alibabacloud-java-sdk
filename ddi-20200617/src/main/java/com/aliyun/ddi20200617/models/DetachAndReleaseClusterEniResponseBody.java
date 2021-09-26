// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DetachAndReleaseClusterEniResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DetachAndReleaseClusterEniResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachAndReleaseClusterEniResponseBody self = new DetachAndReleaseClusterEniResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachAndReleaseClusterEniResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
