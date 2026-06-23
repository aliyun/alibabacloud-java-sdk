// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class OpenEdgeContainerResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54B1C88C-9BB7-568F-9D02-DFBE6F44624D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenEdgeContainerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenEdgeContainerResponseBody self = new OpenEdgeContainerResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenEdgeContainerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
