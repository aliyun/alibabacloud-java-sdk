// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RedeployDedicatedHostResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RedeployDedicatedHostResponse build(java.util.Map<String, ?> map) throws Exception {
        RedeployDedicatedHostResponse self = new RedeployDedicatedHostResponse();
        return TeaModel.build(map, self);
    }

}
