// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class RevertEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListConfigRules](~~169607~~).</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The resources that are to be reevaluated.</p>
     */
    @NameInMap("Resources")
    public java.util.List<RevertEvaluationResultsRequestResources> resources;

    public static RevertEvaluationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        RevertEvaluationResultsRequest self = new RevertEvaluationResultsRequest();
        return TeaModel.build(map, self);
    }

    public RevertEvaluationResultsRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public RevertEvaluationResultsRequest setResources(java.util.List<RevertEvaluationResultsRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<RevertEvaluationResultsRequestResources> getResources() {
        return this.resources;
    }

    public static class RevertEvaluationResultsRequestResources extends TeaModel {
        /**
         * <p>The ID of the region in which the resource resides.</p>
         * <br>
         * <p>For more information about how to obtain the ID of the region in which a resource resides, see [ListDiscoveredResources](~~169620~~).</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         */
        @NameInMap("ResourceAccountId")
        public Long resourceAccountId;

        /**
         * <p>The ID of the resource.</p>
         * <br>
         * <p>For more information about how to obtain the ID of a resource, see [ListDiscoveredResources](~~169620~~).</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         * <br>
         * <p>For more information about how to obtain the type of a resource, see [ListDiscoveredResources](~~169620~~).</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static RevertEvaluationResultsRequestResources build(java.util.Map<String, ?> map) throws Exception {
            RevertEvaluationResultsRequestResources self = new RevertEvaluationResultsRequestResources();
            return TeaModel.build(map, self);
        }

        public RevertEvaluationResultsRequestResources setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public RevertEvaluationResultsRequestResources setResourceAccountId(Long resourceAccountId) {
            this.resourceAccountId = resourceAccountId;
            return this;
        }
        public Long getResourceAccountId() {
            return this.resourceAccountId;
        }

        public RevertEvaluationResultsRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public RevertEvaluationResultsRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
