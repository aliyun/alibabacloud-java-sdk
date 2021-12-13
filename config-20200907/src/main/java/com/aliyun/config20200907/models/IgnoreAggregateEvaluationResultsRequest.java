// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class IgnoreAggregateEvaluationResultsRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("ConfigRuleId")
    public String configRuleId;

    @NameInMap("Reason")
    public String reason;

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
        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceAccountId")
        public Long resourceAccountId;

        @NameInMap("ResourceId")
        public String resourceId;

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
