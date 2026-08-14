// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyHttp2EnableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHttp2EnableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHttp2EnableResponseBody self = new ModifyHttp2EnableResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHttp2EnableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
