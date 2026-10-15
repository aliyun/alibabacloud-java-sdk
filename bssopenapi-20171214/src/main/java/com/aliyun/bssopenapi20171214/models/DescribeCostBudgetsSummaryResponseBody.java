// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeCostBudgetsSummaryResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public DescribeCostBudgetsSummaryResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3BFC23FE-A182-4D96-A1E4-7521B30B8E43</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCostBudgetsSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostBudgetsSummaryResponseBody self = new DescribeCostBudgetsSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCostBudgetsSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCostBudgetsSummaryResponseBody setData(DescribeCostBudgetsSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCostBudgetsSummaryResponseBodyData getData() {
        return this.data;
    }

    public DescribeCostBudgetsSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCostBudgetsSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCostBudgetsSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCostBudgetsSummaryResponseBodyDataItems extends TeaModel {
        /**
         * <p>Information about the budget.</p>
         * <ul>
         * <li><p>BudgetCycleType: The budget period. Valid values: daily, monthly, quarterly, and yearly.</p>
         * </li>
         * <li><p>TotalBudgetAmount: The total budget amount.</p>
         * </li>
         * <li><p>BudgetMemo: The notes for the budget.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{           &quot;budgetCycleType&quot;: &quot;monthly&quot;,           &quot;budgetMemo&quot;: &quot;&quot;,           &quot;totalBudgetAmount&quot;: 220         }</p>
         */
        @NameInMap("Budget")
        public java.util.Map<String, ?> budget;

        /**
         * <p>The name of the budget.</p>
         * 
         * <strong>example:</strong>
         * <p>全年预算</p>
         */
        @NameInMap("BudgetName")
        public String budgetName;

        /**
         * <p>The status of the budget.</p>
         * 
         * <strong>example:</strong>
         * <p>overdue</p>
         */
        @NameInMap("BudgetStatus")
        public String budgetStatus;

        /**
         * <p>The type of the budget.</p>
         * 
         * <strong>example:</strong>
         * <p>cost</p>
         */
        @NameInMap("BudgetType")
        public String budgetType;

        /**
         * <p>Information about the estimate-to-actual comparison.</p>
         * <ul>
         * <li><p>ActualConsumeSum: The accumulated actual consumption.</p>
         * </li>
         * <li><p>ActualAddForecastedAmount: The sum of the accumulated actual value and the predicted value. For a cost budget, this value represents the actual spending to date plus the forecasted spending until the budget period ends.</p>
         * </li>
         * <li><p>ActualAndBudgetComparison: The comparison of the actual consumption to the budget. This value is calculated using the following formula: (Accumulated actual value / Total budget amount) × 100%.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{           &quot;actualConsumeSum&quot;: 88.6,           &quot;actualAddForecastedAmount&quot;: 89.6,           &quot;actualAndBudgetComparison&quot;: &quot;20.73%&quot;         }</p>
         */
        @NameInMap("CalculatedValues")
        public java.util.Map<String, ?> calculatedValues;

        /**
         * <p>Information about the billing cycle.</p>
         * <ul>
         * <li><p>ConsumePeriodBegin: The start date of the budget.</p>
         * </li>
         * <li><p>ConsumePeriodEnd: The end date of the budget.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{           &quot;consumePeriodBegin&quot;: &quot;2022-10&quot;,           &quot;consumePeriodEnd&quot;: &quot;2022-11&quot;         }</p>
         */
        @NameInMap("ConsumePeriod")
        public java.util.Map<String, ?> consumePeriod;

        public static DescribeCostBudgetsSummaryResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostBudgetsSummaryResponseBodyDataItems self = new DescribeCostBudgetsSummaryResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeCostBudgetsSummaryResponseBodyDataItems setBudget(java.util.Map<String, ?> budget) {
            this.budget = budget;
            return this;
        }
        public java.util.Map<String, ?> getBudget() {
            return this.budget;
        }

        public DescribeCostBudgetsSummaryResponseBodyDataItems setBudgetName(String budgetName) {
            this.budgetName = budgetName;
            return this;
        }
        public String getBudgetName() {
            return this.budgetName;
        }

        public DescribeCostBudgetsSummaryResponseBodyDataItems setBudgetStatus(String budgetStatus) {
            this.budgetStatus = budgetStatus;
            return this;
        }
        public String getBudgetStatus() {
            return this.budgetStatus;
        }

        public DescribeCostBudgetsSummaryResponseBodyDataItems setBudgetType(String budgetType) {
            this.budgetType = budgetType;
            return this;
        }
        public String getBudgetType() {
            return this.budgetType;
        }

        public DescribeCostBudgetsSummaryResponseBodyDataItems setCalculatedValues(java.util.Map<String, ?> calculatedValues) {
            this.calculatedValues = calculatedValues;
            return this;
        }
        public java.util.Map<String, ?> getCalculatedValues() {
            return this.calculatedValues;
        }

        public DescribeCostBudgetsSummaryResponseBodyDataItems setConsumePeriod(java.util.Map<String, ?> consumePeriod) {
            this.consumePeriod = consumePeriod;
            return this;
        }
        public java.util.Map<String, ?> getConsumePeriod() {
            return this.consumePeriod;
        }

    }

    public static class DescribeCostBudgetsSummaryResponseBodyData extends TeaModel {
        /**
         * <p>The website.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The list of items.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeCostBudgetsSummaryResponseBodyDataItems> items;

        /**
         * <p>The maximum number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token for the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6NH0=</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeCostBudgetsSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostBudgetsSummaryResponseBodyData self = new DescribeCostBudgetsSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCostBudgetsSummaryResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public DescribeCostBudgetsSummaryResponseBodyData setItems(java.util.List<DescribeCostBudgetsSummaryResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeCostBudgetsSummaryResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeCostBudgetsSummaryResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeCostBudgetsSummaryResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeCostBudgetsSummaryResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
