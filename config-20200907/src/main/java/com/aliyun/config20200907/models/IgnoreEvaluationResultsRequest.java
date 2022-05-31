// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class IgnoreEvaluationResultsRequest extends TeaModel {
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    @NameInMap("IgnoreDate")
    public String ignoreDate;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("Resources")
    public java.util.List<IgnoreEvaluationResultsRequestResources> resources;

    public static IgnoreEvaluationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        IgnoreEvaluationResultsRequest self = new IgnoreEvaluationResultsRequest();
        return TeaModel.build(map, self);
    }

    public IgnoreEvaluationResultsRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public IgnoreEvaluationResultsRequest setIgnoreDate(String ignoreDate) {
        this.ignoreDate = ignoreDate;
        return this;
    }
    public String getIgnoreDate() {
        return this.ignoreDate;
    }

    public IgnoreEvaluationResultsRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public IgnoreEvaluationResultsRequest setResources(java.util.List<IgnoreEvaluationResultsRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<IgnoreEvaluationResultsRequestResources> getResources() {
        return this.resources;
    }

    public static class IgnoreEvaluationResultsRequestResources extends TeaModel {
        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceAccountId")
        public Long resourceAccountId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static IgnoreEvaluationResultsRequestResources build(java.util.Map<String, ?> map) throws Exception {
            IgnoreEvaluationResultsRequestResources self = new IgnoreEvaluationResultsRequestResources();
            return TeaModel.build(map, self);
        }

        public IgnoreEvaluationResultsRequestResources setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public IgnoreEvaluationResultsRequestResources setResourceAccountId(Long resourceAccountId) {
            this.resourceAccountId = resourceAccountId;
            return this;
        }
        public Long getResourceAccountId() {
            return this.resourceAccountId;
        }

        public IgnoreEvaluationResultsRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public IgnoreEvaluationResultsRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
