// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateEventRuleShrinkRequest extends TeaModel {
    /**
     * <p>A client token to ensure the idempotence of the request.</p>
     * <p>Generate a unique value for this parameter from your client for each request.</p>
     * 
     * <strong>example:</strong>
     * <p>06273500-249F-5863-121D-74D51123****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>--</p>
     */
    @NameInMap("DeliveryMode")
    public String deliveryMode;

    /**
     * <p>The endpoint that receives messages for this subscription.</p>
     */
    @NameInMap("Endpoint")
    public String endpointShrink;

    /**
     * <p>This parameter is deprecated. Use Endpoint instead.</p>
     */
    @NameInMap("Endpoints")
    public String endpointsShrink;

    /**
     * <p>A list of event types.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventTypes")
    public String eventTypesShrink;

    /**
     * <p>A list of matching rules. The logical relationship between the rules is OR.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MatchRules")
    public String matchRulesShrink;

    /**
     * <p>The name of the Alibaba Cloud product for which you want to receive event notifications.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The name of the event rule.</p>
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
