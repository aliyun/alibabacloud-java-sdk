// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteEdgeContainerAppResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether the deletion is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("State")
    public String state;

    public static DeleteEdgeContainerAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeContainerAppResponseBody self = new DeleteEdgeContainerAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeContainerAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteEdgeContainerAppResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
