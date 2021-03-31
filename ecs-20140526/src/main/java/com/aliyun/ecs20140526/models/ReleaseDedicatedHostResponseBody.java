// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleaseDedicatedHostResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseDedicatedHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDedicatedHostResponseBody self = new ReleaseDedicatedHostResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseDedicatedHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
