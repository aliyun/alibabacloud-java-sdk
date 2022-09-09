// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCustomizedListHeadersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCustomizedListHeadersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomizedListHeadersResponseBody self = new ModifyCustomizedListHeadersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCustomizedListHeadersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
