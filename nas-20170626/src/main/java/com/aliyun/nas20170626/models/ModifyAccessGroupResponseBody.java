// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAccessGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ED2AE737-9D50-4CA4-B0DA-31BD610C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccessGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessGroupResponseBody self = new ModifyAccessGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccessGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
