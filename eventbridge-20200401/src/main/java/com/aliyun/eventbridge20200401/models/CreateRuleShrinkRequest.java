// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateRuleShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EventBusName")
    public String eventBusName;

    @NameInMap("EventTargets")
    public String eventTargetsShrink;

    @NameInMap("FilterPattern")
    public String filterPattern;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Status")
    public String status;

    public static CreateRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleShrinkRequest self = new CreateRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRuleShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRuleShrinkRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public CreateRuleShrinkRequest setEventTargetsShrink(String eventTargetsShrink) {
        this.eventTargetsShrink = eventTargetsShrink;
        return this;
    }
    public String getEventTargetsShrink() {
        return this.eventTargetsShrink;
    }

    public CreateRuleShrinkRequest setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }
    public String getFilterPattern() {
        return this.filterPattern;
    }

    public CreateRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateRuleShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
