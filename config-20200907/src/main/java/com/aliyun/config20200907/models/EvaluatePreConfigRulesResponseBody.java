// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class EvaluatePreConfigRulesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the compliance evaluation result.</p>
     */
    @NameInMap("ResourceEvaluations")
    public java.util.List<EvaluatePreConfigRulesResponseBodyResourceEvaluations> resourceEvaluations;

    public static EvaluatePreConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EvaluatePreConfigRulesResponseBody self = new EvaluatePreConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public EvaluatePreConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EvaluatePreConfigRulesResponseBody setResourceEvaluations(java.util.List<EvaluatePreConfigRulesResponseBodyResourceEvaluations> resourceEvaluations) {
        this.resourceEvaluations = resourceEvaluations;
        return this;
    }
    public java.util.List<EvaluatePreConfigRulesResponseBodyResourceEvaluations> getResourceEvaluations() {
        return this.resourceEvaluations;
    }

    public static class EvaluatePreConfigRulesResponseBodyResourceEvaluationsRules extends TeaModel {
        /**
         * <p>The reason why the resource was evaluated as incompliant.</p>
         */
        @NameInMap("Annotation")
        public String annotation;

        /**
         * <p>The compliance type of the resource that was evaluated by using the evaluation rule. Valid values:</p>
         * <br>
         * <p>*   COMPLIANT: The resource was evaluated as compliant.</p>
         * <p>*   NON_COMPLIANT: The resource was evaluated as incompliant.</p>
         * <p>*   NOT_APPLICABLE: The evaluation rule does not apply to the resource.</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The URL of the topic that describes how the managed rule remediates the incompliant configurations.</p>
         */
        @NameInMap("HelpUrl")
        public String helpUrl;

        /**
         * <p>The identifier of the evaluation rule.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        public static EvaluatePreConfigRulesResponseBodyResourceEvaluationsRules build(java.util.Map<String, ?> map) throws Exception {
            EvaluatePreConfigRulesResponseBodyResourceEvaluationsRules self = new EvaluatePreConfigRulesResponseBodyResourceEvaluationsRules();
            return TeaModel.build(map, self);
        }

        public EvaluatePreConfigRulesResponseBodyResourceEvaluationsRules setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public EvaluatePreConfigRulesResponseBodyResourceEvaluationsRules setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public EvaluatePreConfigRulesResponseBodyResourceEvaluationsRules setHelpUrl(String helpUrl) {
            this.helpUrl = helpUrl;
            return this;
        }
        public String getHelpUrl() {
            return this.helpUrl;
        }

        public EvaluatePreConfigRulesResponseBodyResourceEvaluationsRules setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

    }

    public static class EvaluatePreConfigRulesResponseBodyResourceEvaluations extends TeaModel {
        /**
         * <p>The logical ID of the resource.</p>
         * <br>
         * <p>>  If the ResourceLogicalId request parameter is left empty, the value of the ResourceLogicalId response parameter is generated based on the value of the `ResourceProperties` parameter.</p>
         */
        @NameInMap("ResourceLogicalId")
        public String resourceLogicalId;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The evaluation rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<EvaluatePreConfigRulesResponseBodyResourceEvaluationsRules> rules;

        public static EvaluatePreConfigRulesResponseBodyResourceEvaluations build(java.util.Map<String, ?> map) throws Exception {
            EvaluatePreConfigRulesResponseBodyResourceEvaluations self = new EvaluatePreConfigRulesResponseBodyResourceEvaluations();
            return TeaModel.build(map, self);
        }

        public EvaluatePreConfigRulesResponseBodyResourceEvaluations setResourceLogicalId(String resourceLogicalId) {
            this.resourceLogicalId = resourceLogicalId;
            return this;
        }
        public String getResourceLogicalId() {
            return this.resourceLogicalId;
        }

        public EvaluatePreConfigRulesResponseBodyResourceEvaluations setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public EvaluatePreConfigRulesResponseBodyResourceEvaluations setRules(java.util.List<EvaluatePreConfigRulesResponseBodyResourceEvaluationsRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<EvaluatePreConfigRulesResponseBodyResourceEvaluationsRules> getRules() {
            return this.rules;
        }

    }

}
