// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PublishEdgeContainerAppVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PublishEdgeContainerAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishEdgeContainerAppVersionResponseBody self = new PublishEdgeContainerAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishEdgeContainerAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
