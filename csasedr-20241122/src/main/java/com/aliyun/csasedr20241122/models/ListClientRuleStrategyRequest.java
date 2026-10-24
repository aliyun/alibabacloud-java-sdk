// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class ListClientRuleStrategyRequest extends TeaModel {
    /**
     * <p>The current page number for the paged query with paging. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The policy name for substring matching. If this parameter is not specified, policies are not filtered by name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries per page for the paged query with paging. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The policy type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Software hardening.</li>
     * <li><strong>1</strong>: Firewall.</li>
     * <li><strong>2</strong>: Proactive defense.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PolicyType")
    public Integer policyType;

    public static ListClientRuleStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClientRuleStrategyRequest self = new ListClientRuleStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ListClientRuleStrategyRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListClientRuleStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListClientRuleStrategyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClientRuleStrategyRequest setPolicyType(Integer policyType) {
        this.policyType = policyType;
        return this;
    }
    public Integer getPolicyType() {
        return this.policyType;
    }

}
