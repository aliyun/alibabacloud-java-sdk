// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListCompliancePackTemplatesRequest extends TeaModel {
    /**
     * <p>The ID of the compliance package template.</p>
     * 
     * <strong>example:</strong>
     * <p>ct-d254ff4e06a300cf****</p>
     */
    @NameInMap("CompliancePackTemplateId")
    public String compliancePackTemplateId;

    /**
     * <strong>example:</strong>
     * <p>LAW</p>
     */
    @NameInMap("FilterType")
    public String filterType;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1. Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100. Minimum value: 1. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The types of the resources evaluated based on the rule. If you configure this parameter, only the rules that include the resource types in the compliance package template are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    @NameInMap("RuleRiskLevel")
    public Integer ruleRiskLevel;

    public static ListCompliancePackTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCompliancePackTemplatesRequest self = new ListCompliancePackTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListCompliancePackTemplatesRequest setCompliancePackTemplateId(String compliancePackTemplateId) {
        this.compliancePackTemplateId = compliancePackTemplateId;
        return this;
    }
    public String getCompliancePackTemplateId() {
        return this.compliancePackTemplateId;
    }

    public ListCompliancePackTemplatesRequest setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }
    public String getFilterType() {
        return this.filterType;
    }

    public ListCompliancePackTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCompliancePackTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCompliancePackTemplatesRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public ListCompliancePackTemplatesRequest setRuleRiskLevel(Integer ruleRiskLevel) {
        this.ruleRiskLevel = ruleRiskLevel;
        return this;
    }
    public Integer getRuleRiskLevel() {
        return this.ruleRiskLevel;
    }

}
