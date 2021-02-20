// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EmptyAutoCcBlacklistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EmptyAutoCcBlacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EmptyAutoCcBlacklistResponseBody self = new EmptyAutoCcBlacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public EmptyAutoCcBlacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
