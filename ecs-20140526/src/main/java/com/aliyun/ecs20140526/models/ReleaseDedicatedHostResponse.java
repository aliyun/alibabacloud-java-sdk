// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleaseDedicatedHostResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReleaseDedicatedHostResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDedicatedHostResponse self = new ReleaseDedicatedHostResponse();
        return TeaModel.build(map, self);
    }

}
