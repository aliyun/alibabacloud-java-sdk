// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReinitInstanceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReinitInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReinitInstanceResponseBody self = new ReinitInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReinitInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
