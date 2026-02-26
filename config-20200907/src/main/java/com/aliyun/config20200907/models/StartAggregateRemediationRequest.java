// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartAggregateRemediationRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>To get the account group ID, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-6b4a626622af0012****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the rule.</p>
     * <p>To get the rule ID, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-6b7c626622af00b4****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resources to be remediated belong. If this parameter is left empty, non-compliant resources of all accounts in the account group are remediated.</p>
     * <blockquote>
     * <p>You must specify the ID of the current management account or a member account in the account group of the management account.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100271897542****</p>
     */
    @NameInMap("ResourceAccountId")
    public Long resourceAccountId;

    /**
     * <strong>example:</strong>
     * <p>vpc-xxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <strong>example:</strong>
     * <p>ACS::VPC::VPC</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static StartAggregateRemediationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAggregateRemediationRequest self = new StartAggregateRemediationRequest();
        return TeaModel.build(map, self);
    }

    public StartAggregateRemediationRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public StartAggregateRemediationRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public StartAggregateRemediationRequest setResourceAccountId(Long resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
        return this;
    }
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    public StartAggregateRemediationRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public StartAggregateRemediationRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public StartAggregateRemediationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
