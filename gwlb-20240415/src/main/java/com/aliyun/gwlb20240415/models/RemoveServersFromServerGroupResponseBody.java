// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class RemoveServersFromServerGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveServersFromServerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveServersFromServerGroupResponseBody self = new RemoveServersFromServerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveServersFromServerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
