// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class RpcUploadDemoResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RpcUploadDemoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RpcUploadDemoResponseBody self = new RpcUploadDemoResponseBody();
        return TeaModel.build(map, self);
    }

    public RpcUploadDemoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
