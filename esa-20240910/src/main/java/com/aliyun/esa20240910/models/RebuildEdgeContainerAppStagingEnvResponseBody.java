// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class RebuildEdgeContainerAppStagingEnvResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-3C82-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RebuildEdgeContainerAppStagingEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebuildEdgeContainerAppStagingEnvResponseBody self = new RebuildEdgeContainerAppStagingEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public RebuildEdgeContainerAppStagingEnvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
