// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ReleaseClusterPublicConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseClusterPublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterPublicConnectionResponseBody self = new ReleaseClusterPublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterPublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
