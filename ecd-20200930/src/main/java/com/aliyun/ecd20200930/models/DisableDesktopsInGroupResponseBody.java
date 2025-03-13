// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DisableDesktopsInGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>34FB4D97-C0D9-5534-ABC6-90C7EBD5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableDesktopsInGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableDesktopsInGroupResponseBody self = new DisableDesktopsInGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableDesktopsInGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
