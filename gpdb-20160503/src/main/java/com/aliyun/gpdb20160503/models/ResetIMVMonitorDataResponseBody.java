// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ResetIMVMonitorDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Boolean status;

    public static ResetIMVMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetIMVMonitorDataResponseBody self = new ResetIMVMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetIMVMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetIMVMonitorDataResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
