// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class IgnoreEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListConfigRules](https://help.aliyun.com/document_detail/169607.html).</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <p>The reason why you want to ignore the resource.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The resources to be ignored.</p>
     * <br>
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
         * <p>The ID of the region in which the resource resides.</p>
         * <br>
         * <p>For more information about how to obtain the ID of the region in which a resource resides, see [ListDiscoveredResources](https://help.aliyun.com/document_detail/169620.html).</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resources belong.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ResourceAccountId")
        public Long resourceAccountId;

        /**
         * <p>The ID of the resource.</p>
         * <br>
         * <p>For more information about how to obtain the ID of a resource, see [ListDiscoveredResources](https://help.aliyun.com/document_detail/169620.html).</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         * <br>
         * <p>For more information about how to obtain the type of a resource, see [ListDiscoveredResources](https://help.aliyun.com/document_detail/169620.html).</p>
         * <br>
         * <p>This parameter is required.</p>
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
