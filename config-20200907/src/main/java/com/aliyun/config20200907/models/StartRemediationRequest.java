// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartRemediationRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * <p>For information about how to obtain the rule ID, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-8a973ac2e2be00a2****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

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

    public static StartRemediationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRemediationRequest self = new StartRemediationRequest();
        return TeaModel.build(map, self);
    }

    public StartRemediationRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public StartRemediationRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public StartRemediationRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public StartRemediationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
