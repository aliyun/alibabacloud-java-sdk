// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeCostBudgetsSummaryRequest extends TeaModel {
    /**
     * <p>The name of the budget. Supports fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>全年预算</p>
     */
    @NameInMap("BudgetName")
    public String budgetName;

    /**
     * <p>The status of the budget. If you do not specify this parameter, budgets in all statuses are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>notOverdue</p>
     */
    @NameInMap("BudgetStatus")
    public String budgetStatus;

    /**
     * <p>The type of the budget. If you do not specify this parameter, budgets of all types are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>cost</p>
     */
    @NameInMap("BudgetType")
    public String budgetType;

    /**
     * <p>The maximum number of items to return. Valid values: 1 to 10. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Set this parameter to the NextToken value that is returned in the response to the previous request. If you do not specify this parameter, the query starts from the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6NH0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static DescribeCostBudgetsSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostBudgetsSummaryRequest self = new DescribeCostBudgetsSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCostBudgetsSummaryRequest setBudgetName(String budgetName) {
        this.budgetName = budgetName;
        return this;
    }
    public String getBudgetName() {
        return this.budgetName;
    }

    public DescribeCostBudgetsSummaryRequest setBudgetStatus(String budgetStatus) {
        this.budgetStatus = budgetStatus;
        return this;
    }
    public String getBudgetStatus() {
        return this.budgetStatus;
    }

    public DescribeCostBudgetsSummaryRequest setBudgetType(String budgetType) {
        this.budgetType = budgetType;
        return this;
    }
    public String getBudgetType() {
        return this.budgetType;
    }

    public DescribeCostBudgetsSummaryRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCostBudgetsSummaryRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
