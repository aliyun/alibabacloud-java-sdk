// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachClassicLinkVpcResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachClassicLinkVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachClassicLinkVpcResponseBody self = new DetachClassicLinkVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachClassicLinkVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
