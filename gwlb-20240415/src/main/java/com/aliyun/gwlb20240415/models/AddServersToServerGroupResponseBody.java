// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class AddServersToServerGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddServersToServerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddServersToServerGroupResponseBody self = new AddServersToServerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddServersToServerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
