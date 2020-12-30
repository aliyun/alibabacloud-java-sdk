// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RunClusterServiceActionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RunClusterServiceActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunClusterServiceActionResponseBody self = new RunClusterServiceActionResponseBody();
        return TeaModel.build(map, self);
    }

    public RunClusterServiceActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
