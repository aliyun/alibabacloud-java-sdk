// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachDBInstancesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachDBInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachDBInstancesResponseBody self = new DetachDBInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachDBInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
