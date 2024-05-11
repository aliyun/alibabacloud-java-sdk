// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class PutTargetsShrinkRequest extends TeaModel {
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

    /**
     * <p>The event targets to be created or updated. For more information, see [Limits.](https://www.alibabacloud.com/help/en/eventbridge/latest/limits)</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public String targetsShrink;

    public static PutTargetsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PutTargetsShrinkRequest self = new PutTargetsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PutTargetsShrinkRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public PutTargetsShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutTargetsShrinkRequest setTargetsShrink(String targetsShrink) {
        this.targetsShrink = targetsShrink;
        return this;
    }
    public String getTargetsShrink() {
        return this.targetsShrink;
    }

}
