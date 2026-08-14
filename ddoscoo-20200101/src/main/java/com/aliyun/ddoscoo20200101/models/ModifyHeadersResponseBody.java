// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyHeadersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHeadersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHeadersResponseBody self = new ModifyHeadersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHeadersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
