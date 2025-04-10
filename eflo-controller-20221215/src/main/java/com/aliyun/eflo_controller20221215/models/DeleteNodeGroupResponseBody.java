// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DeleteNodeGroupResponseBody extends TeaModel {
    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>887FA855-89F4-5DB3-B305-C5879EC480E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNodeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodeGroupResponseBody self = new DeleteNodeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNodeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
