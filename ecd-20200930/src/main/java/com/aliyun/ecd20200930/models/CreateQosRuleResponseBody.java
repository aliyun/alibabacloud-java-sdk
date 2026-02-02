// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateQosRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>qos-5605u0gelk200****</p>
     */
    @NameInMap("QosRuleId")
    public String qosRuleId;

    /**
     * <strong>example:</strong>
     * <p>51592A88-0F2C-55E6-AD2C-2AD9C10D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateQosRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQosRuleResponseBody self = new CreateQosRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQosRuleResponseBody setQosRuleId(String qosRuleId) {
        this.qosRuleId = qosRuleId;
        return this;
    }
    public String getQosRuleId() {
        return this.qosRuleId;
    }

    public CreateQosRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
