// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteEdgeContainerAppImageSecretResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEdgeContainerAppImageSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeContainerAppImageSecretResponseBody self = new DeleteEdgeContainerAppImageSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeContainerAppImageSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
