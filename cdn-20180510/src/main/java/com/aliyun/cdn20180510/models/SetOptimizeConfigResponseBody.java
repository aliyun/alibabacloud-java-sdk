// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetOptimizeConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetOptimizeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetOptimizeConfigResponseBody self = new SetOptimizeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetOptimizeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
