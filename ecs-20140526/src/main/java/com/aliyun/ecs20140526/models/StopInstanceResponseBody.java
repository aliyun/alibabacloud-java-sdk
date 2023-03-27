// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceResponseBody self = new StopInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
