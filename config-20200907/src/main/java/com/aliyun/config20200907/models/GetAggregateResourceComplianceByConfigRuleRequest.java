// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceByConfigRuleRequest extends TeaModel {
    /**
     * <p>The compliance evaluation result of the resources. Valid values:</p>
     * <br>
     * <p>*   COMPLIANT: The resources are evaluated as compliant.</p>
     * <p>*   NON_COMPLIANT: The resources are evaluated as non-compliant.</p>
     * <p>*   NOT_APPLICABLE: The rule does not apply to your resources.</p>
     * <p>*   INSUFFICIENT_DATA: No resource data is available.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The total number of evaluated resources.</p>
     */
    @NameInMap("ComplianceType")
    public String complianceType;

    /**
     * <p>The compliance evaluation results returned.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    @NameInMap("ResourceAccountId")
    public Long resourceAccountId;

    @NameInMap("ResourceOwnerId")
    @Deprecated
    public Long resourceOwnerId;

    public static GetAggregateResourceComplianceByConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceByConfigRuleRequest self = new GetAggregateResourceComplianceByConfigRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceByConfigRuleRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateResourceComplianceByConfigRuleRequest setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public GetAggregateResourceComplianceByConfigRuleRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public GetAggregateResourceComplianceByConfigRuleRequest setResourceAccountId(Long resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
        return this;
    }
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    public GetAggregateResourceComplianceByConfigRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
