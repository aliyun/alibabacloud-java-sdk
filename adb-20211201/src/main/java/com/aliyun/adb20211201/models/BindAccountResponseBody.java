// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class BindAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAccountResponseBody self = new BindAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
