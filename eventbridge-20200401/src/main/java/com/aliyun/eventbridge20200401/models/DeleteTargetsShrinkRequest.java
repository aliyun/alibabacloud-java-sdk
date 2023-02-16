// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteTargetsShrinkRequest extends TeaModel {
    @NameInMap("EventBusName")
    public String eventBusName;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("TargetIds")
    public String targetIdsShrink;

    public static DeleteTargetsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTargetsShrinkRequest self = new DeleteTargetsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTargetsShrinkRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public DeleteTargetsShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DeleteTargetsShrinkRequest setTargetIdsShrink(String targetIdsShrink) {
        this.targetIdsShrink = targetIdsShrink;
        return this;
    }
    public String getTargetIdsShrink() {
        return this.targetIdsShrink;
    }

}
