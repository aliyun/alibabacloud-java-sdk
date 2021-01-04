// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class RebootClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RebootClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootClusterResponseBody self = new RebootClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
