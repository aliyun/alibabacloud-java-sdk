// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReInitDiskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReInitDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReInitDiskResponseBody self = new ReInitDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ReInitDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
