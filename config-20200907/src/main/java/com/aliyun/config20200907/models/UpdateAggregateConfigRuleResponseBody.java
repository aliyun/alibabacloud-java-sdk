// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateConfigRuleResponseBody extends TeaModel {
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

    public static UpdateAggregateConfigRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateConfigRuleResponseBody self = new UpdateAggregateConfigRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAggregateConfigRuleResponseBody setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public UpdateAggregateConfigRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
