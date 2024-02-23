// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class OpenComputePreCheckResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OpenComputePreCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenComputePreCheckResponseBody self = new OpenComputePreCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenComputePreCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
