// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeCostBudgetsSummaryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeCostBudgetsSummaryResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Budget")
        public java.util.Map<String, ?> budget;

        @NameInMap("BudgetName")
        public String budgetName;

        @NameInMap("BudgetStatus")
        public String budgetStatus;

        @NameInMap("BudgetType")
        public String budgetType;

        @NameInMap("CalculatedValues")
        public java.util.Map<String, ?> calculatedValues;

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
        @NameInMap("HostId")
        public String hostId;

        @NameInMap("Items")
        public java.util.List<DescribeCostBudgetsSummaryResponseBodyDataItems> items;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

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
