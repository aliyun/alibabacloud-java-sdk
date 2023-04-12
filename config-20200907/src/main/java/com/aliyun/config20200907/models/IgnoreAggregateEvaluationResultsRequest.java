// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class IgnoreAggregateEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListAggregateConfigRules](~~264148~~).</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The date from which the system automatically re-evaluates the ignored incompliant resources.</p>
     * <br>
     * <p>>  If you leave this parameter empty, the system does not automatically re-evaluate the ignored incompliant resources. You must manually re-evaluate the ignored incompliant resources.</p>
     */
    @NameInMap("IgnoreDate")
    public String ignoreDate;

    /**
     * <p>The reason why you ignore the resource.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The resources to be ignored.</p>
     */
    @NameInMap("Resources")
    public java.util.List<IgnoreAggregateEvaluationResultsRequestResources> resources;

    public static IgnoreAggregateEvaluationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        IgnoreAggregateEvaluationResultsRequest self = new IgnoreAggregateEvaluationResultsRequest();
        return TeaModel.build(map, self);
    }

    public IgnoreAggregateEvaluationResultsRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public IgnoreAggregateEvaluationResultsRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public IgnoreAggregateEvaluationResultsRequest setIgnoreDate(String ignoreDate) {
        this.ignoreDate = ignoreDate;
        return this;
    }
    public String getIgnoreDate() {
        return this.ignoreDate;
    }

    public IgnoreAggregateEvaluationResultsRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public IgnoreAggregateEvaluationResultsRequest setResources(java.util.List<IgnoreAggregateEvaluationResultsRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<IgnoreAggregateEvaluationResultsRequestResources> getResources() {
        return this.resources;
    }

    public static class IgnoreAggregateEvaluationResultsRequestResources extends TeaModel {
        /**
         * <p>The ID of the region in which the resource resides.</p>
         * <br>
         * <p>For more information about how to obtain the ID of a region, see [ListAggregateDiscoveredResources](~~265983~~).</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resources belong.</p>
         * <br>
         * <p>>  You must specify the ID of the current management account or a member account in the account group of the management account.</p>
         */
        @NameInMap("ResourceAccountId")
        public Long resourceAccountId;

        /**
         * <p>The ID of the resource.</p>
         * <br>
         * <p>For more information about how to query the ID of a resource, see [ListAggregateDiscoveredResources](~~265983~~).</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         * <br>
         * <p>For more information about how to query the type of a resource, see [ListAggregateDiscoveredResources](~~265983~~).</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static IgnoreAggregateEvaluationResultsRequestResources build(java.util.Map<String, ?> map) throws Exception {
            IgnoreAggregateEvaluationResultsRequestResources self = new IgnoreAggregateEvaluationResultsRequestResources();
            return TeaModel.build(map, self);
        }

        public IgnoreAggregateEvaluationResultsRequestResources setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public IgnoreAggregateEvaluationResultsRequestResources setResourceAccountId(Long resourceAccountId) {
            this.resourceAccountId = resourceAccountId;
            return this;
        }
        public Long getResourceAccountId() {
            return this.resourceAccountId;
        }

        public IgnoreAggregateEvaluationResultsRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public IgnoreAggregateEvaluationResultsRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
