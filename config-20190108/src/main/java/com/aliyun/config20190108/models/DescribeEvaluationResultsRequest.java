// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The compliance evaluation result. Valid values:</p>
     * <br>
     * <p>*   COMPLIANT: The resources are evaluated as compliant.</p>
     * <p>*   NON_COMPLIANT: The resources are evaluated as non-compliant.</p>
     * <p>*   NOT_APPLICABLE: The rule does not apply to the resources.</p>
     * <p>*   INSUFFICIENT_DATA: The resource data is insufficient.</p>
     */
    @NameInMap("ComplianceType")
    public String complianceType;

    /**
     * <p>The rule ID. If you query the compliance evaluation results of resources by rule, you must specify this parameter.</p>
     * <br>
     * <p>> You must specify the ResourceType or ConfigRuleId parameter.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

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
     * <p>The number of the page to return. Pages start from page 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page. Valid values: 1 to 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource ID. If you query the compliance evaluation results of resources by resource type, you must specify this parameter.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of resource. If you query the compliance evaluation results of resources by resource type, you must specify this parameter.</p>
     * <br>
     * <p>You can call the GetSupportedResourceTypes operation to query the resource types supported by Cloud Config. For more information, see [GetSupportedResourceTypes](~~169618~~).</p>
     * <br>
     * <p>> You must specify the ResourceType or ConfigRuleId parameter.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeEvaluationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluationResultsRequest self = new DescribeEvaluationResultsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluationResultsRequest setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public DescribeEvaluationResultsRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public DescribeEvaluationResultsRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public DescribeEvaluationResultsRequest setMultiAccount(Boolean multiAccount) {
        this.multiAccount = multiAccount;
        return this;
    }
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

    public DescribeEvaluationResultsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEvaluationResultsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEvaluationResultsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeEvaluationResultsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
