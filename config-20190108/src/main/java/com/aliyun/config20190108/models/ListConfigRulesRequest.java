// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class ListConfigRulesRequest extends TeaModel {
    /**
     * <p>The ID of the compliance package to which the rule belongs.</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The compliance evaluation result of the resources. Valid values:</p>
     * <br>
     * <p>*   COMPLIANT: The resources are evaluated as compliant.</p>
     * <p>*   NON_COMPLIANT: The resources are evaluated as non-compliant.</p>
     * <p>*   NOT_APPLICABLE: The rule does not apply to the resources.</p>
     * <p>*   INSUFFICIENT_DATA: The resource data is insufficient.</p>
     */
    @NameInMap("ComplianceType")
    public String complianceType;

    /**
     * <p>The name of the monitoring rule.</p>
     */
    @NameInMap("ConfigRuleName")
    public String configRuleName;

    /**
     * <p>The status of the rule. Valid values:</p>
     * <br>
     * <p>*   ACTIVE: The rule is enabled.</p>
     * <p>*   EVALUATING: The rule is triggered and is being used to monitor resource configurations.</p>
     * <p>*   INACTIVE: The rule is disabled.</p>
     */
    @NameInMap("ConfigRuleState")
    public String configRuleState;

    /**
     * <p>This parameter is unavailable since 00:00:00 on June 30, 2021. Account group-related operations are provided as an alternative after 00:00:00 on May 30, 2021. If you are using this parameter, we recommend that you switch to account group-related operations after 00:00:00 on May 30, 2021. For information about account groups, see [Overview](~~211534~~).</p>
     */
    @NameInMap("MemberId")
    public Long memberId;

    /**
     * <p>This parameter is unavailable since 00:00:00 on June 30, 2021. Account group-related operations are provided as an alternative after 00:00:00 on May 30, 2021. If you are using this parameter, we recommend that you switch to account group-related operations after 00:00:00 on May 30, 2021. For information about account groups, see [Overview](~~211534~~).</p>
     */
    @NameInMap("MultiAccount")
    public Boolean multiAccount;

    /**
     * <p>The page number of the returned page. A minimum of one entry can be returned on each page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The risk level of the resources that are not compliant with the rule. Valid values:</p>
     * <br>
     * <p>*   1: high</p>
     * <p>*   2: medium</p>
     * <p>*   3: low</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    public static ListConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRulesRequest self = new ListConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigRulesRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public ListConfigRulesRequest setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public ListConfigRulesRequest setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    public ListConfigRulesRequest setConfigRuleState(String configRuleState) {
        this.configRuleState = configRuleState;
        return this;
    }
    public String getConfigRuleState() {
        return this.configRuleState;
    }

    public ListConfigRulesRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public ListConfigRulesRequest setMultiAccount(Boolean multiAccount) {
        this.multiAccount = multiAccount;
        return this;
    }
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

    public ListConfigRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConfigRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListConfigRulesRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

}
