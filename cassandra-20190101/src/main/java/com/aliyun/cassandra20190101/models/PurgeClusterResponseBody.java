// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class PurgeClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PurgeClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PurgeClusterResponseBody self = new PurgeClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public PurgeClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
