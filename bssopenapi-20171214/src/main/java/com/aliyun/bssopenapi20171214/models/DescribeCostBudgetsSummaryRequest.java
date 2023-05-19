// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeCostBudgetsSummaryRequest extends TeaModel {
    /**
     * <p>The name of the budget. Fuzzy match is supported.</p>
     */
    @NameInMap("BudgetName")
    public String budgetName;

    /**
     * <p>The status of the budget. Valid values: overdue and notOverdue. A value of overdue specifies to filter expired budgets. A value of notOverdue specifies to filter budgets that do not expire. By default, if you do not specify this parameter, information about all budgets is to be returned.</p>
     */
    @NameInMap("BudgetStatus")
    public String budgetStatus;

    /**
     * <p>The type of the budget. Valid values: cost, byquantity, and asset. A value of cost specifies to filter expense budgets. A value of byquantity specifies to filter budgets calculated based on the resource usage. A value of asset specifies to filter usage or coverage budgets. By default, information about all budgets is returned if you do not specify this parameter.</p>
     */
    @NameInMap("BudgetType")
    public String budgetType;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 10. Minimum value: 1.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The position in which the query starts. You must set this parameter to null or the token that is obtained from the previous query. Otherwise, an error is returned. If you set the NextToken parameter to null, the query starts from the beginning. The default value is null.</p>
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
