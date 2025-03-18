// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateEventRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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

    public static class CreateEventRuleRequestEndpoints extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>This parameter is required.</p>
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
