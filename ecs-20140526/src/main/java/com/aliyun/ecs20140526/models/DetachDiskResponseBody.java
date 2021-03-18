// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachDiskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DetachDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachDiskResponseBody self = new DetachDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
