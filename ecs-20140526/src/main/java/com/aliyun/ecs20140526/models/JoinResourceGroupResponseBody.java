// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class JoinResourceGroupResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static JoinResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JoinResourceGroupResponseBody self = new JoinResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public JoinResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
