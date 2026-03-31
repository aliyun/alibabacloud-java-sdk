// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateConfigRuleResponseBody extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-4e3d626622af0080****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5895065A-196C-4254-8AD8-14EFC31EEF50</p>
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
