// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class RemoveUserFromGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveUserFromGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromGroupResponseBody self = new RemoveUserFromGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
