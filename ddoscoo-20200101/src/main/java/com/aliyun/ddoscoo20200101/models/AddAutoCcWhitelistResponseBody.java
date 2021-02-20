// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AddAutoCcWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddAutoCcWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAutoCcWhitelistResponseBody self = new AddAutoCcWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAutoCcWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
