// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class IgnoreEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * <p>For more information about how to obtain the rule ID, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-7e72626622af0051****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The date on which the ignored evaluation results are automatically restored.</p>
     * <blockquote>
     * <p>If this parameter is left empty, the ignored evaluation results are not automatically restored. You must manually restore them.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-06-01</p>
     */
    @NameInMap("IgnoreDate")
    public String ignoreDate;

    /**
     * <p>The reason for ignoring the resources.</p>
     * 
     * <strong>example:</strong>
     * <p>无需检测。</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The list of resources to be ignored.</p>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The ID of the region to which the resource belongs.</p>
         * <p>For more information about how to obtain the ID of the region to which the resource belongs, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("ResourceAccountId")
        public Long resourceAccountId;

        /**
         * <p>The resource ID.</p>
         * <p>For more information about how to obtain the resource ID, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-hp3a3b4ztyfm2plgm****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         * <p>For more information about how to obtain the resource type, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::SLB::LoadBalancer</p>
         */
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
