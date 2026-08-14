// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EmptyAutoCcWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EmptyAutoCcWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EmptyAutoCcWhitelistResponseBody self = new EmptyAutoCcWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public EmptyAutoCcWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
