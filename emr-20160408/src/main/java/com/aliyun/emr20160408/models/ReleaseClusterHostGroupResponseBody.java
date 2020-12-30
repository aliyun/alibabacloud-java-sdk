// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ReleaseClusterHostGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseClusterHostGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterHostGroupResponseBody self = new ReleaseClusterHostGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterHostGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
