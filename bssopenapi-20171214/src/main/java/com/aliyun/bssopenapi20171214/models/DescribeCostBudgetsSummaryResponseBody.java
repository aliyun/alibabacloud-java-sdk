// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeCostBudgetsSummaryResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
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
     * <p>Indicates whether the request is successful.</p>
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
         * <p>The information about the budget. The BudgetCycleType parameter indicates the cycle of the budget. Valid values: daily, monthly, quarterly, and yearly. The TotalBudgetAmount parameter indicates the total budget. The BudgetMemo parameter indicates the remarks of the budget.</p>
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
         * <p>Annual budget</p>
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
         * <p>The information about the estimate-to-actual analysis. The ActualConsumeSum parameter indicates the accumulated actual value. The ActualAddForecastedAmount parameter indicates the sum of accumulated actual value and predicted value. If the BudgetType parameter is set to cost, the sum of actual value and predicted value includes the actual cost incurred from the budget start date to the current date and the predicted cost from the current date to the budget end date. If the BudgetType parameter is set to asset, the sum of actual value and predicted value includes the actual usage or coverage from the budget start date to the budget end date. If the budget end date minus the current date is more than one year, the part that exceeds one year is not included. The ActualAndBudgetComparison parameter indicates the comparison between the actual value and the predicted value. The value of the ActualAndBudgetComparison parameter is calculated based on the following formula: Accumulated actual value/Total budget × 100%.</p>
         * 
         * <strong>example:</strong>
         * <p>{           &quot;actualConsumeSum&quot;: 88.6,           &quot;actualAddForecastedAmount&quot;: 89.6,           &quot;actualAndBudgetComparison&quot;: &quot;20.73%&quot;         }</p>
         */
        @NameInMap("CalculatedValues")
        public java.util.Map<String, ?> calculatedValues;

        /**
         * <p>The information about the billing cycle. The ConsumePeriodBegin parameter indicates the start date of the budget. The ConsumePeriodEnd parameter indicates the end date of the budget.</p>
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
         * <p>The site of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The data that is returned.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeCostBudgetsSummaryResponseBodyDataItems> items;

        /**
         * <p>The maximum number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that is used to retrieve the next page</p>
         * 
         * <strong>example:</strong>
         * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6NH0=</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries that are returned.</p>
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
