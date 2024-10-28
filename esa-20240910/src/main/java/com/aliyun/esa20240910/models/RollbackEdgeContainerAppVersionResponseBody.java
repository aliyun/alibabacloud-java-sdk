// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class RollbackEdgeContainerAppVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RollbackEdgeContainerAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackEdgeContainerAppVersionResponseBody self = new RollbackEdgeContainerAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackEdgeContainerAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
