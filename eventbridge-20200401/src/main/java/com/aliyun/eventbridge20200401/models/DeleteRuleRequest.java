// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteRuleRequest extends TeaModel {
    /**
     * <p>The name of the event bus.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The name of the event rule that you want to delete.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static DeleteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleRequest self = new DeleteRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRuleRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public DeleteRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
