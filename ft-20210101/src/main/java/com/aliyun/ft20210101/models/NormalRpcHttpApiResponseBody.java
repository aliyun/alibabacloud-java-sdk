// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class NormalRpcHttpApiResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static NormalRpcHttpApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NormalRpcHttpApiResponseBody self = new NormalRpcHttpApiResponseBody();
        return TeaModel.build(map, self);
    }

    public NormalRpcHttpApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
