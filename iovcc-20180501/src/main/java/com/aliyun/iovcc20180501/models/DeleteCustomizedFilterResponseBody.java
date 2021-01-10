// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteCustomizedFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomizedFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizedFilterResponseBody self = new DeleteCustomizedFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizedFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
