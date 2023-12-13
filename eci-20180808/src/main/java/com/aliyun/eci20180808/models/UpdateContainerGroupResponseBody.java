// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateContainerGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateContainerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerGroupResponseBody self = new UpdateContainerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContainerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
