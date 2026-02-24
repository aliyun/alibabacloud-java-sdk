// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListManagedRulesRequest extends TeaModel {
    /**
     * <p>The scope of the filter.</p>
     * 
     * <strong>example:</strong>
     * <p>托管规则筛选范围，可以筛选无资源覆盖的托管规则。取值：</p>
     * <ul>
     * <li>ALL 全部</li>
     * <li>UNCOVERED_RESOURCE 筛选有资源未覆盖的托管规则</li>
     * </ul>
     */
    @NameInMap("FilterType")
    public String filterType;

    /**
     * <p>The keyword of the rule template.</p>
     * 
     * <strong>example:</strong>
     * <p>CDN</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number.</p>
     * <p>The value must be greater than or equal to 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource type that is evaluated by the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    /**
     * <p>The risk level of the rule template. Valid values:</p>
     * <ul>
     * <li><p>1: high</p>
     * </li>
     * <li><p>2: medium</p>
     * </li>
     * <li><p>3: low</p>
     * </li>
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
