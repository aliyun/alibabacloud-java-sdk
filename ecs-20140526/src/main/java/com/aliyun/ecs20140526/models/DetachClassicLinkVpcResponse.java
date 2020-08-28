// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachClassicLinkVpcResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DetachClassicLinkVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachClassicLinkVpcResponse self = new DetachClassicLinkVpcResponse();
        return TeaModel.build(map, self);
    }

}
