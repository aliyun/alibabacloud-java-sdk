// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachClassicLinkVpcResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AttachClassicLinkVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachClassicLinkVpcResponse self = new AttachClassicLinkVpcResponse();
        return TeaModel.build(map, self);
    }

}
