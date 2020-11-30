// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class EmptySlsLogstoreResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static EmptySlsLogstoreResponse build(java.util.Map<String, ?> map) throws Exception {
        EmptySlsLogstoreResponse self = new EmptySlsLogstoreResponse();
        return TeaModel.build(map, self);
    }

    public EmptySlsLogstoreResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
