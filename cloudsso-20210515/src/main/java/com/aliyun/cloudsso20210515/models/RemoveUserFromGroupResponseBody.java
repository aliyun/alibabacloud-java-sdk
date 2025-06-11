// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class RemoveUserFromGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F723DE01-6276-5DC4-9B1F-9CBE3E1748B2</p>
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
