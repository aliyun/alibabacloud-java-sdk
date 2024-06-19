// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateContainerGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB8D2B22-D636-4182-****-1FC9DBDAD66F</p>
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
