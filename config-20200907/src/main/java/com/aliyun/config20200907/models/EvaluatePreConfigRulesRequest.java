// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class EvaluatePreConfigRulesRequest extends TeaModel {
    @NameInMap("EnableManagedRules")
    public Boolean enableManagedRules;

    @NameInMap("ResourceEvaluateItems")
    public java.util.List<EvaluatePreConfigRulesRequestResourceEvaluateItems> resourceEvaluateItems;

    public static EvaluatePreConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluatePreConfigRulesRequest self = new EvaluatePreConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public EvaluatePreConfigRulesRequest setEnableManagedRules(Boolean enableManagedRules) {
        this.enableManagedRules = enableManagedRules;
        return this;
    }
    public Boolean getEnableManagedRules() {
        return this.enableManagedRules;
    }

    public EvaluatePreConfigRulesRequest setResourceEvaluateItems(java.util.List<EvaluatePreConfigRulesRequestResourceEvaluateItems> resourceEvaluateItems) {
        this.resourceEvaluateItems = resourceEvaluateItems;
        return this;
    }
    public java.util.List<EvaluatePreConfigRulesRequestResourceEvaluateItems> getResourceEvaluateItems() {
        return this.resourceEvaluateItems;
    }

    public static class EvaluatePreConfigRulesRequestResourceEvaluateItemsRules extends TeaModel {
        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("InputParameters")
        public String inputParameters;

        public static EvaluatePreConfigRulesRequestResourceEvaluateItemsRules build(java.util.Map<String, ?> map) throws Exception {
            EvaluatePreConfigRulesRequestResourceEvaluateItemsRules self = new EvaluatePreConfigRulesRequestResourceEvaluateItemsRules();
            return TeaModel.build(map, self);
        }

        public EvaluatePreConfigRulesRequestResourceEvaluateItemsRules setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public EvaluatePreConfigRulesRequestResourceEvaluateItemsRules setInputParameters(String inputParameters) {
            this.inputParameters = inputParameters;
            return this;
        }
        public String getInputParameters() {
            return this.inputParameters;
        }

    }

    public static class EvaluatePreConfigRulesRequestResourceEvaluateItems extends TeaModel {
        @NameInMap("ResourceLogicalId")
        public String resourceLogicalId;

        @NameInMap("ResourceProperties")
        public String resourceProperties;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Rules")
        public java.util.List<EvaluatePreConfigRulesRequestResourceEvaluateItemsRules> rules;

        public static EvaluatePreConfigRulesRequestResourceEvaluateItems build(java.util.Map<String, ?> map) throws Exception {
            EvaluatePreConfigRulesRequestResourceEvaluateItems self = new EvaluatePreConfigRulesRequestResourceEvaluateItems();
            return TeaModel.build(map, self);
        }

        public EvaluatePreConfigRulesRequestResourceEvaluateItems setResourceLogicalId(String resourceLogicalId) {
            this.resourceLogicalId = resourceLogicalId;
            return this;
        }
        public String getResourceLogicalId() {
            return this.resourceLogicalId;
        }

        public EvaluatePreConfigRulesRequestResourceEvaluateItems setResourceProperties(String resourceProperties) {
            this.resourceProperties = resourceProperties;
            return this;
        }
        public String getResourceProperties() {
            return this.resourceProperties;
        }

        public EvaluatePreConfigRulesRequestResourceEvaluateItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public EvaluatePreConfigRulesRequestResourceEvaluateItems setRules(java.util.List<EvaluatePreConfigRulesRequestResourceEvaluateItemsRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<EvaluatePreConfigRulesRequestResourceEvaluateItemsRules> getRules() {
            return this.rules;
        }

    }

}
