// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyQosRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyQosRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyQosRuleResponseBody self = new ModifyQosRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyQosRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
