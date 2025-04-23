// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListManagedRulesRequest extends TeaModel {
    /**
     * <p>The scope for filtering managed rules allows you to filter out managed rules without resource coverage. The possible values are:</p>
     * <ul>
     * <li><p>ALL: All rules.</p>
     * </li>
     * <li><p>UNCOVERED_RESOURCE: Filters managed rules where some resources are not covered.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("FilterType")
    public String filterType;

    /**
     * <p>The keyword of the managed rule.</p>
     * 
     * <strong>example:</strong>
     * <p>CDN</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number of the page to return.</p>
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
     * <p>The type of the resources to be evaluated based on the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    /**
     * <p>The risk level of the managed rule. Valid values:</p>
     * <ul>
     * <li>1: high</li>
     * <li>2: medium</li>
     * <li>3: low</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    public static ListManagedRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListManagedRulesRequest self = new ListManagedRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListManagedRulesRequest setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }
    public String getFilterType() {
        return this.filterType;
    }

    public ListManagedRulesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListManagedRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListManagedRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListManagedRulesRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public ListManagedRulesRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

}
