// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class ExecuteSceneResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>191C79AD-F9F9-531E-B8C1-73DF6433B920</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSceneResponseBody self = new ExecuteSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
