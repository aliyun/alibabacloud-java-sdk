// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class RollbackEnvironmentVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B955107D-E658-4E77-B913-E0AC3D31693E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RollbackEnvironmentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackEnvironmentVersionResponseBody self = new RollbackEnvironmentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackEnvironmentVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
