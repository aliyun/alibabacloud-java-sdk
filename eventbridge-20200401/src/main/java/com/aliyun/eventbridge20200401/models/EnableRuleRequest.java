// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EnableRuleRequest extends TeaModel {
    /**
     * <p>The name of the event bus.</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The name of the event rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static EnableRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableRuleRequest self = new EnableRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableRuleRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public EnableRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
