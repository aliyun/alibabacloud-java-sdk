// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class RevertAggregateEvaluationResultsRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("ConfigRuleId")
    public String configRuleId;

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
        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceAccountId")
        public Long resourceAccountId;

        @NameInMap("ResourceId")
        public String resourceId;

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
