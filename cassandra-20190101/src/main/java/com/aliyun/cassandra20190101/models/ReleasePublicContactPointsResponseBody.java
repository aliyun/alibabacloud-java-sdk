// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ReleasePublicContactPointsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleasePublicContactPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicContactPointsResponseBody self = new ReleasePublicContactPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleasePublicContactPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
