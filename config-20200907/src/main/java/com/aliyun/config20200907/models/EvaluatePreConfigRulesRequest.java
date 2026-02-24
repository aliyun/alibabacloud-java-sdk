// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class EvaluatePreConfigRulesRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable rule templates. Valid values:</p>
     * <ul>
     * <li><p>true: enables rule templates.</p>
     * </li>
     * <li><p>false (default): does not enable rule templates.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableManagedRules")
    public Boolean enableManagedRules;

    /**
     * <p>An array that contains the resources that you want to evaluate.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceEvaluateItems")
    public java.util.List<EvaluatePreConfigRulesRequestResourceEvaluateItems> resourceEvaluateItems;

    /**
     * <p>The query start token</p>
     * 
     * <strong>example:</strong>
     * <p>ros</p>
     */
    @NameInMap("ResourceTypeFormat")
    public String resourceTypeFormat;

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

    public EvaluatePreConfigRulesRequest setResourceTypeFormat(String resourceTypeFormat) {
        this.resourceTypeFormat = resourceTypeFormat;
        return this;
    }
    public String getResourceTypeFormat() {
        return this.resourceTypeFormat;
    }

    public static class EvaluatePreConfigRulesRequestResourceEvaluateItemsRules extends TeaModel {
        /**
         * <p>The identifier of the rule.</p>
         * <p>For information about how to obtain the identifier of a rule, see <a href="https://help.aliyun.com/document_detail/467810.html">ListPreManagedRules</a>.</p>
         * <blockquote>
         * <p>The <code>ResourceType</code>, <code>Identifier</code>, and <code>ResourceProperties</code> parameters must be specified at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs-instance-deletion-protection-enabled</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The input parameters of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
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
         * <blockquote>
         * <p>If this parameter is empty, it is generated based on the Base64 value of <code>ResourceProperties</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ResourceLogicId-test</p>
         */
        @NameInMap("ResourceLogicalId")
        public String resourceLogicalId;

        /**
         * <p>The resource configuration items (properties of the resource to be created), such as the specifications, region, name, status, and port or network interface switch status of the resource.</p>
         * <blockquote>
         * <p>The <code>ResourceType</code>, <code>Identifier</code>, and <code>ResourceProperties</code> parameters must be specified at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ResourceGroupId&quot;:&quot;&quot;,&quot;Memory&quot;:8192,&quot;InstanceChargeType&quot;:&quot;PostPaid&quot;,&quot;Cpu&quot;:2}</p>
         */
        @NameInMap("ResourceProperties")
        public String resourceProperties;

        /**
         * <p>The type of the resource.</p>
         * <p>For information about how to obtain the identifier of an evaluation rule, see <a href="https://help.aliyun.com/document_detail/467810.html">ListPreManagedRules</a>.</p>
         * <blockquote>
         * <p>The <code>ResourceType</code>, <code>Identifier</code>, and <code>ResourceProperties</code> parameters must be specified at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>An array that contains the evaluation rules.</p>
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
