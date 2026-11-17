// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateRuleShrinkRequest extends TeaModel {
    /**
     * <p>The description of the event bus.</p>
     * 
     * <strong>example:</strong>
     * <p>Filter rule for Simple Message Queue (formerly MNS) (SMQ)</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the event bus.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyEventBus</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The list of event targets.</p>
     */
    @NameInMap("EventTargets")
    public String eventTargetsShrink;

    /**
     * <p>The event pattern in JSON format. Valid values:
     * stringEqual mode.
     * stringExpression mode.
     * Up to 5 expressions are supported for each field (map structure).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;source&quot;: [
     *     {
     *       &quot;prefix&quot;: &quot;acs.&quot;
     *     }
     *   ],
     *   &quot;type&quot;: [
     *     {
     *       &quot;prefix&quot;: &quot;oss:ObjectReplication&quot;
     *     }
     *   ],
     *   &quot;subject&quot;: [
     *     {
     *       &quot;prefix&quot;: &quot;acs:oss:cn-hangzhou:123456789098****:my-movie-bucket/&quot;,
     *       &quot;suffix&quot;: &quot;.txt&quot;
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("FilterPattern")
    public String filterPattern;

    /**
     * <p>The name of the event rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMQRule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The status of the rule. Valid values:
     * ENABLE: The rule is enabled. This is the default status.
     * DISABLE: The rule is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>ENABLE</p>
     */
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
