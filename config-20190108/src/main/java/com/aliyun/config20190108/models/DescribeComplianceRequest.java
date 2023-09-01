// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeComplianceRequest extends TeaModel {
    /**
     * <p>The compliance evaluation result of the resource. Valid values:</p>
     * <br>
     * <p>*   COMPLIANT: The resource is evaluated to be compliant.</p>
     * <p>*   NON_COMPLIANT: The resource is evaluated to be non-compliant.</p>
     * <p>*   NOT_APPLICABLE: The rule does not apply to the resource.</p>
     * <p>*   INSUFFICIENT_DATA: The resource data is insufficient.</p>
     */
    @NameInMap("ComplianceType")
    public String complianceType;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>If you query compliance evaluation results by resource, you must specify the ConfigRuleId, ResourceType, and ResourceId parameters. Otherwise, the ConfigRuleId parameter becomes invalid.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>This parameter is scheduled to be removed before 00:00:00, June 30, 2021. Account group-related APIs will be provided as an alternative before 00:00:00, May 30, 2021. If you are using this parameter, we recommend that you switch to account group-related APIs after 00:00:00, May 30, 2021. For more information, see [Account groups](~~211534~~).</p>
     */
    @NameInMap("MemberId")
    public Long memberId;

    /**
     * <p>This parameter is scheduled to be removed before 00:00:00, June 30, 2021. Account group-related APIs will be provided as an alternative before 00:00:00, May 30, 2021. If you are using this parameter, we recommend that you switch to account group-related APIs after 00:00:00, May 30, 2021. For more information, see [Account groups](~~211534~~).</p>
     */
    @NameInMap("MultiAccount")
    public Boolean multiAccount;

    /**
     * <p>The ID of the resource.</p>
     * <br>
     * <p>If you query compliance evaluation results by resource, you must specify the ResourceType and ResourceId parameters.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource.</p>
     * <br>
     * <p>If you query compliance evaluation results by resource, you must specify the ResourceType and ResourceId parameters.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeComplianceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComplianceRequest self = new DescribeComplianceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComplianceRequest setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public DescribeComplianceRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public DescribeComplianceRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public DescribeComplianceRequest setMultiAccount(Boolean multiAccount) {
        this.multiAccount = multiAccount;
        return this;
    }
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

    public DescribeComplianceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeComplianceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
