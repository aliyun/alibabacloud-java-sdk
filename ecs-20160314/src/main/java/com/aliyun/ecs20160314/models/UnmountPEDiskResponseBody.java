// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class UnmountPEDiskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static UnmountPEDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnmountPEDiskResponseBody self = new UnmountPEDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public UnmountPEDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnmountPEDiskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
