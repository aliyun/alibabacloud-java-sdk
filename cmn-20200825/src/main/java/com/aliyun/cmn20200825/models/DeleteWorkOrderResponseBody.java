// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteWorkOrderResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWorkOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkOrderResponseBody self = new DeleteWorkOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
