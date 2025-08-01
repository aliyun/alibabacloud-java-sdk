// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UninstallMonitorAgentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6C8439B9-7DBF-57F4-92AE-55A9B9D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UninstallMonitorAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallMonitorAgentResponseBody self = new UninstallMonitorAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallMonitorAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
