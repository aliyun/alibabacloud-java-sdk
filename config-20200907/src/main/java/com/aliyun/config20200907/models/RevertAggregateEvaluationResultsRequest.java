// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class RevertAggregateEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the rule in the account group.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The resources that you want to re-evaluate.</p>
     */
    @NameInMap("Resources")
    public java.util.List<RevertAggregateEvaluationResultsRequestResources> resources;

    public static RevertAggregateEvaluationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        RevertAggregateEvaluationResultsRequest self = new RevertAggregateEvaluationResultsRequest();
        return TeaModel.build(map, self);
    }

    public RevertAggregateEvaluationResultsRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public RevertAggregateEvaluationResultsRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public RevertAggregateEvaluationResultsRequest setResources(java.util.List<RevertAggregateEvaluationResultsRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<RevertAggregateEvaluationResultsRequestResources> getResources() {
        return this.resources;
    }

    public static class RevertAggregateEvaluationResultsRequestResources extends TeaModel {
        /**
         * <p>The ID of the region where the resource resides.</p>
         * <br>
         * <p>For more information about how to obtain the ID of a region, see [ListAggregateDiscoveredResources](~~265983~~).</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * <br>
         * <p>> You must specify the ID of the current management account or a member account in the account group of the management account.</p>
         */
        @NameInMap("ResourceAccountId")
        public Long resourceAccountId;

        /**
         * <p>The resource ID.</p>
         * <br>
         * <p>For more information about how to query the ID of a resource, see [ListAggregateDiscoveredResources](~~265983~~).</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of resource.</p>
         * <br>
         * <p>For more information about how to obtain the type of a resource, see [ListAggregateDiscoveredResources](~~265983~~).</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static RevertAggregateEvaluationResultsRequestResources build(java.util.Map<String, ?> map) throws Exception {
            RevertAggregateEvaluationResultsRequestResources self = new RevertAggregateEvaluationResultsRequestResources();
            return TeaModel.build(map, self);
        }

        public RevertAggregateEvaluationResultsRequestResources setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public RevertAggregateEvaluationResultsRequestResources setResourceAccountId(Long resourceAccountId) {
            this.resourceAccountId = resourceAccountId;
            return this;
        }
        public Long getResourceAccountId() {
            return this.resourceAccountId;
        }

        public RevertAggregateEvaluationResultsRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public RevertAggregateEvaluationResultsRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
