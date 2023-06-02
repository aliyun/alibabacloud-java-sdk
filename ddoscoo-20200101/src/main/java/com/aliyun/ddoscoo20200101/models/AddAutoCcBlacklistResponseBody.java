// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AddAutoCcBlacklistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddAutoCcBlacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAutoCcBlacklistResponseBody self = new AddAutoCcBlacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAutoCcBlacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
