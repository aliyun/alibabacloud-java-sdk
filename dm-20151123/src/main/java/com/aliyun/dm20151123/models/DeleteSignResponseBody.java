// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteSignResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSignResponseBody self = new DeleteSignResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
