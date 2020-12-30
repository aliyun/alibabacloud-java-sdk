// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class EnableAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableAccountResponseBody self = new EnableAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
