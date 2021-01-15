// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDedicatedLineResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDedicatedLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedLineResponseBody self = new DeleteDedicatedLineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDedicatedLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
