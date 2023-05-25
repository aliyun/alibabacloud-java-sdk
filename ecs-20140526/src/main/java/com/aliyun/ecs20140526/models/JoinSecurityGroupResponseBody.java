// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class JoinSecurityGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static JoinSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JoinSecurityGroupResponseBody self = new JoinSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public JoinSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
