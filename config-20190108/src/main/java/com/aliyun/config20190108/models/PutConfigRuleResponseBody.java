// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutConfigRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the rule.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PutConfigRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutConfigRuleResponseBody self = new PutConfigRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public PutConfigRuleResponseBody setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public PutConfigRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
