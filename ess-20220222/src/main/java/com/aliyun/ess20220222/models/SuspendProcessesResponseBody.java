// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class SuspendProcessesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SuspendProcessesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SuspendProcessesResponseBody self = new SuspendProcessesResponseBody();
        return TeaModel.build(map, self);
    }

    public SuspendProcessesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
