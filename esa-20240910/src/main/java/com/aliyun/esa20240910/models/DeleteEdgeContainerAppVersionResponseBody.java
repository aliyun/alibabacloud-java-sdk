// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteEdgeContainerAppVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b021e538-9dde-46ed-a1f2-9469da8f3e77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEdgeContainerAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeContainerAppVersionResponseBody self = new DeleteEdgeContainerAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeContainerAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
