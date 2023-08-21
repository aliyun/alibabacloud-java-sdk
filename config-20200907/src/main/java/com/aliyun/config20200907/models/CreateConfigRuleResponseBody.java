// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateConfigRuleResponseBody extends TeaModel {
    /**
     * <p>The rule ID.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateConfigRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigRuleResponseBody self = new CreateConfigRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConfigRuleResponseBody setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public CreateConfigRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
