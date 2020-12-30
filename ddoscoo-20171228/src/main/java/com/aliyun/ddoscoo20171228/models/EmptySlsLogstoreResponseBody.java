// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class EmptySlsLogstoreResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EmptySlsLogstoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EmptySlsLogstoreResponseBody self = new EmptySlsLogstoreResponseBody();
        return TeaModel.build(map, self);
    }

    public EmptySlsLogstoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
