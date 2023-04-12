// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class EvaluatePreConfigRulesRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the managed rule. Valid values:</p>
     * <br>
     * <p>*   true: enables the managed rule.</p>
     * <p>*   false: does not enable the managed rule. This is the default value.</p>
     * <br>
     * <p>>  After you create an evaluation rule, a managed rule that has the same settings as the evaluation rule is created. After you create a resource, the managed rule can be used to continuously check the compliance of the resource.</p>
     */
    @NameInMap("EnableManagedRules")
    public Boolean enableManagedRules;

    /**
     * <p>The resources that you want to evaluate.</p>
     */
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
        /**
         * <p>The identifier of the evaluation rule.</p>
         * <br>
         * <p>For more information about how to obtain the identifier of an evaluation rule, see [ListManagedRules](~~467810~~).</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The input parameters of the evaluation rule.</p>
         */
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
        /**
         * <p>The logical ID of the resource.</p>
         */
        @NameInMap("ResourceLogicalId")
        public String resourceLogicalId;

        /**
         * <p>The properties of the resource.</p>
         */
        @NameInMap("ResourceProperties")
        public String resourceProperties;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The evaluation rules.</p>
         */
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
