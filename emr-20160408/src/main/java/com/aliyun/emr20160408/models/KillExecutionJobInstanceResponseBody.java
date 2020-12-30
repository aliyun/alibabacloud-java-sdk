// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class KillExecutionJobInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static KillExecutionJobInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KillExecutionJobInstanceResponseBody self = new KillExecutionJobInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public KillExecutionJobInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
