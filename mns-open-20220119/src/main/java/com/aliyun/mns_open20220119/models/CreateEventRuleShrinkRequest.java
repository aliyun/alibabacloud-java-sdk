// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateEventRuleShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Endpoints")
    public String endpointsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventTypes")
    public String eventTypesShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MatchRules")
    public String matchRulesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-xsXDW</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static CreateEventRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventRuleShrinkRequest self = new CreateEventRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventRuleShrinkRequest setEndpointsShrink(String endpointsShrink) {
        this.endpointsShrink = endpointsShrink;
        return this;
    }
    public String getEndpointsShrink() {
        return this.endpointsShrink;
    }

    public CreateEventRuleShrinkRequest setEventTypesShrink(String eventTypesShrink) {
        this.eventTypesShrink = eventTypesShrink;
        return this;
    }
    public String getEventTypesShrink() {
        return this.eventTypesShrink;
    }

    public CreateEventRuleShrinkRequest setMatchRulesShrink(String matchRulesShrink) {
        this.matchRulesShrink = matchRulesShrink;
        return this;
    }
    public String getMatchRulesShrink() {
        return this.matchRulesShrink;
    }

    public CreateEventRuleShrinkRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateEventRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
