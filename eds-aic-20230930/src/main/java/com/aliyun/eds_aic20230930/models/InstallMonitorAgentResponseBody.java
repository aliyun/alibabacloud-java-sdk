// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class InstallMonitorAgentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DB070C80-45AC-52CA-8101-937C25DA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InstallMonitorAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallMonitorAgentResponseBody self = new InstallMonitorAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallMonitorAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
