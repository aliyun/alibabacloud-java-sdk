// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemoveGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>42FE70D8-4336-471B-8314-CCCFCE41****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupResponseBody self = new RemoveGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
