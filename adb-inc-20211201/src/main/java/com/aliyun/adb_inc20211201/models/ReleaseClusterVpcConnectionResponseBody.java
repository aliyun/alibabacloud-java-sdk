// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ReleaseClusterVpcConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseClusterVpcConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterVpcConnectionResponseBody self = new ReleaseClusterVpcConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterVpcConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
