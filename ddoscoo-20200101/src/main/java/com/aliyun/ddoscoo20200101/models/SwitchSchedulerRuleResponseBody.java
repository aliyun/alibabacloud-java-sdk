// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class SwitchSchedulerRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchSchedulerRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchSchedulerRuleResponseBody self = new SwitchSchedulerRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchSchedulerRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
