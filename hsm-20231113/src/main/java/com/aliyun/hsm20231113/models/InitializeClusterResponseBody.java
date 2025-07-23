// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class InitializeClusterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049366F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InitializeClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeClusterResponseBody self = new InitializeClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
