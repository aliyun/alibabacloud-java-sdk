// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopCasterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopCasterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopCasterResponseBody self = new StopCasterResponseBody();
        return TeaModel.build(map, self);
    }

    public StopCasterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
