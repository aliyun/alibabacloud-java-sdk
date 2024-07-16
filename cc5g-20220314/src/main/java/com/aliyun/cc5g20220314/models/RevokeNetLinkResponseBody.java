// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class RevokeNetLinkResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1E781588-69D4-56C3-93BA-DEFECF2596B8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeNetLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeNetLinkResponseBody self = new RevokeNetLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeNetLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
