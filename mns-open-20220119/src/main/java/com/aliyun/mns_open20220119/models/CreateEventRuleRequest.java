// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateEventRuleRequest extends TeaModel {
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
    public CreateEventRuleRequestEndpoint endpoint;

    /**
     * <p><strong>[Deprecated]</strong> This field is deprecated. Use the Endpoint parameter instead.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<CreateEventRuleRequestEndpoints> endpoints;

    /**
     * <p>The list of event types. Valid values depend on the selected cloud service. For example, if OSS is selected, common values include ObjectCreated:PutObject and ObjectRemoved:DeleteObject. For more information, see the event notification documentation for each cloud service.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventTypes")
    public java.util.List<String> eventTypes;

    /**
     * <p>The list of matching rules. A maximum of 10 rules can be specified at the outer level. The rules are connected by the OR operator.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MatchRules")
    public java.util.List<java.util.List<EventMatchRule>> matchRules;

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

    public static CreateEventRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventRuleRequest self = new CreateEventRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEventRuleRequest setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }
    public String getDeliveryMode() {
        return this.deliveryMode;
    }

    public CreateEventRuleRequest setEndpoint(CreateEventRuleRequestEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public CreateEventRuleRequestEndpoint getEndpoint() {
        return this.endpoint;
    }

    public CreateEventRuleRequest setEndpoints(java.util.List<CreateEventRuleRequestEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<CreateEventRuleRequestEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public CreateEventRuleRequest setEventTypes(java.util.List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public java.util.List<String> getEventTypes() {
        return this.eventTypes;
    }

    public CreateEventRuleRequest setMatchRules(java.util.List<java.util.List<EventMatchRule>> matchRules) {
        this.matchRules = matchRules;
        return this;
    }
    public java.util.List<java.util.List<EventMatchRule>> getMatchRules() {
        return this.matchRules;
    }

    public CreateEventRuleRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateEventRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public static class CreateEventRuleRequestEndpoint extends TeaModel {
        /**
         * <p>The ARN of the role for cross-account delivery. This parameter is required when EndpointType is set to queue and EndpointValue is set to the ARN of a cross-account queue, which means the account that owns the queue is different from the current account. Format: acs:ram::<UID of the account that owns the queue>:role/<Role name>. The role must be created by the account that owns the queue. The trust policy must allow the delivery account to assume the role, and the role must be granted permissions to send messages to the destination queue.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram:1234567890:role/CrossAccountQueueRole</p>
         */
        @NameInMap("EndpointRoleName")
        public String endpointRoleName;

        /**
         * <p>The endpoint type. Valid values:</p>
         * <ul>
         * <li><strong>topic</strong>: Topic type. Topics support delivery to multiple subscription endpoints. You can add or remove subscription endpoints later.</li>
         * <li><strong>queue</strong>: Queue type. Messages are delivered directly to the queue. This reduces the routing path, but you cannot add new subscription endpoints later.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topic</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The actual value of the endpoint. If EndpointType is set to topic, this parameter specifies the topic name. If EndpointType is set to queue, this parameter specifies the queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-topic</p>
         */
        @NameInMap("EndpointValue")
        public String endpointValue;

        public static CreateEventRuleRequestEndpoint build(java.util.Map<String, ?> map) throws Exception {
            CreateEventRuleRequestEndpoint self = new CreateEventRuleRequestEndpoint();
            return TeaModel.build(map, self);
        }

        public CreateEventRuleRequestEndpoint setEndpointRoleName(String endpointRoleName) {
            this.endpointRoleName = endpointRoleName;
            return this;
        }
        public String getEndpointRoleName() {
            return this.endpointRoleName;
        }

        public CreateEventRuleRequestEndpoint setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public CreateEventRuleRequestEndpoint setEndpointValue(String endpointValue) {
            this.endpointValue = endpointValue;
            return this;
        }
        public String getEndpointValue() {
            return this.endpointValue;
        }

    }

    public static class CreateEventRuleRequestEndpoints extends TeaModel {
        /**
         * <p><strong>[Deprecated]</strong> This field is deprecated. Use Endpoint.EndpointType instead.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p><strong>[Deprecated]</strong> This field is deprecated. Use Endpoint.EndpointValue instead.</p>
         * 
         * <strong>example:</strong>
         * <p>test-xxx-queue</p>
         */
        @NameInMap("EndpointValue")
        public String endpointValue;

        public static CreateEventRuleRequestEndpoints build(java.util.Map<String, ?> map) throws Exception {
            CreateEventRuleRequestEndpoints self = new CreateEventRuleRequestEndpoints();
            return TeaModel.build(map, self);
        }

        public CreateEventRuleRequestEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public CreateEventRuleRequestEndpoints setEndpointValue(String endpointValue) {
            this.endpointValue = endpointValue;
            return this;
        }
        public String getEndpointValue() {
            return this.endpointValue;
        }

    }

}
