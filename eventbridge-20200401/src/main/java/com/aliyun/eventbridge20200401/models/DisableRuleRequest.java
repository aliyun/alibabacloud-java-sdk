// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DisableRuleRequest extends TeaModel {
    /**
     * <p>The name of the event bus.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The name of the event rule.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static DisableRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableRuleRequest self = new DisableRuleRequest();
        return TeaModel.build(map, self);
    }

    public DisableRuleRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public DisableRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
