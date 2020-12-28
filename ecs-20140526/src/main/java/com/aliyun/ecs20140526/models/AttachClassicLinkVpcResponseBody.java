// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachClassicLinkVpcResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AttachClassicLinkVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachClassicLinkVpcResponseBody self = new AttachClassicLinkVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachClassicLinkVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
