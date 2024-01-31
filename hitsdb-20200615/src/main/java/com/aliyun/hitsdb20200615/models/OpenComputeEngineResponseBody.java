// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class OpenComputeEngineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OpenComputeEngineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenComputeEngineResponseBody self = new OpenComputeEngineResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenComputeEngineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
