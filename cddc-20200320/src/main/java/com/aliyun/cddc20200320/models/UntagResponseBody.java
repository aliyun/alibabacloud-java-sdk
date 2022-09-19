// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class UntagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UntagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagResponseBody self = new UntagResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
