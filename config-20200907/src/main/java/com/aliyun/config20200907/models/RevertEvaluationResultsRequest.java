// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class RevertEvaluationResultsRequest extends TeaModel {
    @NameInMap("ConfigRuleId")
    public String configRuleId;

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
        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceAccountId")
        public Long resourceAccountId;

        @NameInMap("ResourceId")
        public String resourceId;

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
