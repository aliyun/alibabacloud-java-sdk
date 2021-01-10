// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionTestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVersionTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionTestResponseBody self = new DeleteVersionTestResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVersionTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
