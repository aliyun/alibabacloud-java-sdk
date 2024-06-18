// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeletePrivateAccessTagResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FD724DBC-CD76-5235-BF76-59C51B73296D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePrivateAccessTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateAccessTagResponseBody self = new DeletePrivateAccessTagResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrivateAccessTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
