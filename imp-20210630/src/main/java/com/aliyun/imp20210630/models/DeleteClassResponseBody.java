// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteClassResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteClassResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClassResponseBody self = new DeleteClassResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClassResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
