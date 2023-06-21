// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RemoveUsersFromGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveUsersFromGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersFromGroupResponseBody self = new RemoveUsersFromGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveUsersFromGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
