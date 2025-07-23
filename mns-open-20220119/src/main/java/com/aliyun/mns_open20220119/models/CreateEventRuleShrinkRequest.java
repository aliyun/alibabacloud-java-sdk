// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateEventRuleShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeliveryMode")
    public String deliveryMode;

    @NameInMap("Endpoint")
    public String endpointShrink;

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

    public CreateEventRuleShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEventRuleShrinkRequest setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }
    public String getDeliveryMode() {
        return this.deliveryMode;
    }

    public CreateEventRuleShrinkRequest setEndpointShrink(String endpointShrink) {
        this.endpointShrink = endpointShrink;
        return this;
    }
    public String getEndpointShrink() {
        return this.endpointShrink;
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
