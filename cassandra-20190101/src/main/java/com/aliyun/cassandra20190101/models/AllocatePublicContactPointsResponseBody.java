// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class AllocatePublicContactPointsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AllocatePublicContactPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicContactPointsResponseBody self = new AllocatePublicContactPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocatePublicContactPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
