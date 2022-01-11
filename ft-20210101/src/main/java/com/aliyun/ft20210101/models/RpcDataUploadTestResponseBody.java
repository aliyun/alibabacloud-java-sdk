// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class RpcDataUploadTestResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RpcDataUploadTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RpcDataUploadTestResponseBody self = new RpcDataUploadTestResponseBody();
        return TeaModel.build(map, self);
    }

    public RpcDataUploadTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
