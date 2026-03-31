// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class RevertAggregateEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-5b6c626622af008f****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the rule in the account group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-7e72626622af0051****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The resources that you want to re-evaluate.</p>
     * <p>This parameter is required.</p>
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
         * <p>The ID of the region in which your resources reside.</p>
         * <p>For more information about how to obtain the ID of the region in which your resources reside, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * <blockquote>
         * <p> You must specify the ID of the current management account or a member in the account group of the management account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        @NameInMap("ResourceAccountId")
        public Long resourceAccountId;

        /**
         * <p>The resource ID.</p>
         * <p>For more information about how to obtain the ID of a resource, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-hp3a3b4ztyfm2plgm****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         * <p>For more information about how to obtain the type of a resource, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::SLB::LoadBalancer</p>
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
