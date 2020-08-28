// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleasePublicIpAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReleasePublicIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicIpAddressResponse self = new ReleasePublicIpAddressResponse();
        return TeaModel.build(map, self);
    }

}
