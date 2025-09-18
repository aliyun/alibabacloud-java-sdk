// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class ExecuteSmartHomeSceneResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>435CF567-12DC-5761-AFA8-650774502E2D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteSmartHomeSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSmartHomeSceneResponseBody self = new ExecuteSmartHomeSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteSmartHomeSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
