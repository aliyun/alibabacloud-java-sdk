// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartAIAgentOutboundCallResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><em><strong><strong><strong><strong>296014bb58670940</strong></strong></strong></strong></em></p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p><em><strong><strong><strong><strong><strong>-4417-BDB2</strong></strong></strong></strong></strong></em>*</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartAIAgentOutboundCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartAIAgentOutboundCallResponseBody self = new StartAIAgentOutboundCallResponseBody();
        return TeaModel.build(map, self);
    }

    public StartAIAgentOutboundCallResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartAIAgentOutboundCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
