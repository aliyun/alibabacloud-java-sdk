// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachDiskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachDiskResponseBody self = new AttachDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
