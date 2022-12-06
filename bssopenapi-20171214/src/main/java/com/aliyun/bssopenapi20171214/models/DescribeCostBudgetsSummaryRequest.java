// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeCostBudgetsSummaryRequest extends TeaModel {
    @NameInMap("BudgetName")
    public String budgetName;

    @NameInMap("BudgetStatus")
    public String budgetStatus;

    @NameInMap("BudgetType")
    public String budgetType;

    @NameInMap("MaxResults")
    public Integer maxResults;

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
