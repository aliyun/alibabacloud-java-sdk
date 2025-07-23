// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateEventRuleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeliveryMode")
    public String deliveryMode;

    @NameInMap("Endpoint")
    public CreateEventRuleRequestEndpoint endpoint;

    @NameInMap("Endpoints")
    public java.util.List<CreateEventRuleRequestEndpoints> endpoints;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventTypes")
    public java.util.List<String> eventTypes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MatchRules")
    public java.util.List<java.util.List<EventMatchRule>> matchRules;

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
        @NameInMap("EndpointType")
        public String endpointType;

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
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
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
