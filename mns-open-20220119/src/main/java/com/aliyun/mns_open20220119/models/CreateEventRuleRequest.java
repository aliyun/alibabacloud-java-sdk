// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateEventRuleRequest extends TeaModel {
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
    public CreateEventRuleRequestEndpoint endpoint;

    /**
     * <p>This parameter is deprecated. Use Endpoint instead.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<CreateEventRuleRequestEndpoints> endpoints;

    /**
     * <p>A list of event types.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventTypes")
    public java.util.List<String> eventTypes;

    /**
     * <p>A list of matching rules. The logical relationship between the rules is OR.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MatchRules")
    public java.util.List<java.util.List<EventMatchRule>> matchRules;

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
         * <p>The endpoint type. Valid values:</p>
         * <ul>
         * <li><p><strong>topic</strong>: The endpoint is a topic. A topic can deliver messages to multiple subscribers. You can add or remove subscribers later.</p>
         * </li>
         * <li><p><strong>queue</strong>: The endpoint is a queue. Messages are delivered directly to the queue. This simplifies the delivery path, but you cannot add new subscribers later.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topic</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The value of the endpoint.</p>
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
         * <p>Deprecated. Use Endpoint.EndpointType instead.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>Deprecated. Use Endpoint.EndpointValue instead.</p>
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
