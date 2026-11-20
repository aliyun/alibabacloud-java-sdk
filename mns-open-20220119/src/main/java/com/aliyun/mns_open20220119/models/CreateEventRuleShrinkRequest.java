// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateEventRuleShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate a value for this parameter on the client side and ensure that the value is unique across different requests.</p>
     * 
     * <strong>example:</strong>
     * <p>06273500-249F-5863-121D-74D51123****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p><strong>[Deprecated]</strong> This field is deprecated.</p>
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
     * <p><strong>[Deprecated]</strong> This field is deprecated. Use the Endpoint parameter instead.</p>
     */
    @NameInMap("Endpoints")
    public String endpointsShrink;

    /**
     * <p>The list of event types. Valid values depend on the selected cloud service. For example, if OSS is selected, common values include ObjectCreated:PutObject and ObjectRemoved:DeleteObject. For more information, see the event notification documentation for each cloud service.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventTypes")
    public String eventTypesShrink;

    /**
     * <p>The list of matching rules. A maximum of 10 rules can be specified at the outer level. The rules are connected by the OR operator.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MatchRules")
    public String matchRulesShrink;

    /**
     * <p>The name of the cloud service for event notification. Currently, only OSS is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The name of the event notification rule. This parameter is required.</p>
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
