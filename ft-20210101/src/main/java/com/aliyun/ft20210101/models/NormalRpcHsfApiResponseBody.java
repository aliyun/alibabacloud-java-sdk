// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class NormalRpcHsfApiResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static NormalRpcHsfApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NormalRpcHsfApiResponseBody self = new NormalRpcHsfApiResponseBody();
        return TeaModel.build(map, self);
    }

    public NormalRpcHsfApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
