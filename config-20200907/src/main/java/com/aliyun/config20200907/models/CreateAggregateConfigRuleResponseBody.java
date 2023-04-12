// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateConfigRuleResponseBody extends TeaModel {
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

    public static CreateAggregateConfigRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateConfigRuleResponseBody self = new CreateAggregateConfigRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAggregateConfigRuleResponseBody setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public CreateAggregateConfigRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
