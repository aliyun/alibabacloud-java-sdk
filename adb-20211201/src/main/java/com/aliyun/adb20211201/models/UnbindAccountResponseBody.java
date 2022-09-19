// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UnbindAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindAccountResponseBody self = new UnbindAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
