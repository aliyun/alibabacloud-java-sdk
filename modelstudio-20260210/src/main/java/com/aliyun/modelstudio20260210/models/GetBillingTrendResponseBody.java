// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetBillingTrendResponseBody extends TeaModel {
    /**
     * <p>The request result code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetBillingTrendResponseBodyData data;

    /**
     * <p>The description of the request result.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>099A671E-FA21-5A36-8A73-918572DDEF53</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetBillingTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBillingTrendResponseBody self = new GetBillingTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBillingTrendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBillingTrendResponseBody setData(GetBillingTrendResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBillingTrendResponseBodyData getData() {
        return this.data;
    }

    public GetBillingTrendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBillingTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBillingTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBillingTrendResponseBodyDataCostTotals extends TeaModel {
        /**
         * <p>The total cost amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("amount")
        public String amount;

        /**
         * <p>The currency of the amount.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("currency")
        public String currency;

        /**
         * <p>The pretax amount.</p>
         * 
         * <strong>example:</strong>
         * <p>94.34</p>
         */
        @NameInMap("pretaxAmount")
        public String pretaxAmount;

        /**
         * <p>The tax amount.</p>
         * 
         * <strong>example:</strong>
         * <p>5.66</p>
         */
        @NameInMap("taxAmount")
        public String taxAmount;

        public static GetBillingTrendResponseBodyDataCostTotals build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendResponseBodyDataCostTotals self = new GetBillingTrendResponseBodyDataCostTotals();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendResponseBodyDataCostTotals setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GetBillingTrendResponseBodyDataCostTotals setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetBillingTrendResponseBodyDataCostTotals setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public GetBillingTrendResponseBodyDataCostTotals setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public String getTaxAmount() {
            return this.taxAmount;
        }

    }

    public static class GetBillingTrendResponseBodyDataGroupByTotal extends TeaModel {
        /**
         * <p>The total amount of the current group.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("amount")
        public String amount;

        /**
         * <p>The dimension value of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The display name of the group, which is affected by the locale input parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The pretax amount of the current group.</p>
         * 
         * <strong>example:</strong>
         * <p>56.60</p>
         */
        @NameInMap("pretaxAmount")
        public String pretaxAmount;

        /**
         * <p>The tax amount of the current group.</p>
         * 
         * <strong>example:</strong>
         * <p>3.40</p>
         */
        @NameInMap("taxAmount")
        public String taxAmount;

        public static GetBillingTrendResponseBodyDataGroupByTotal build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendResponseBodyDataGroupByTotal self = new GetBillingTrendResponseBodyDataGroupByTotal();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendResponseBodyDataGroupByTotal setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GetBillingTrendResponseBodyDataGroupByTotal setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetBillingTrendResponseBodyDataGroupByTotal setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBillingTrendResponseBodyDataGroupByTotal setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public GetBillingTrendResponseBodyDataGroupByTotal setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public String getTaxAmount() {
            return this.taxAmount;
        }

    }

    public static class GetBillingTrendResponseBodyDataHistoryPeriodCostTotals extends TeaModel {
        /**
         * <p>The total cost amount.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("amount")
        public String amount;

        /**
         * <p>The currency of the amount.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("currency")
        public String currency;

        /**
         * <p>The pretax amount.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("pretaxAmount")
        public String pretaxAmount;

        /**
         * <p>The tax amount.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("taxAmount")
        public String taxAmount;

        public static GetBillingTrendResponseBodyDataHistoryPeriodCostTotals build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendResponseBodyDataHistoryPeriodCostTotals self = new GetBillingTrendResponseBodyDataHistoryPeriodCostTotals();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodCostTotals setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodCostTotals setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodCostTotals setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodCostTotals setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public String getTaxAmount() {
            return this.taxAmount;
        }

    }

    public static class GetBillingTrendResponseBodyDataHistoryPeriodGroupByTotal extends TeaModel {
        /**
         * <p>The total amount of the current group.</p>
         * 
         * <strong>example:</strong>
         * <p>246</p>
         */
        @NameInMap("amount")
        public String amount;

        /**
         * <p>The dimension value of the group. If the value is null, DIMENSION_FILTER_NULL_VALUE is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The display name of the group, which is affected by the locale parameter. If the value is null, a hyphen (-) is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The total pretax amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("pretaxAmount")
        public String pretaxAmount;

        /**
         * <p>The total tax amount.</p>
         * 
         * <strong>example:</strong>
         * <p>146</p>
         */
        @NameInMap("taxAmount")
        public String taxAmount;

        public static GetBillingTrendResponseBodyDataHistoryPeriodGroupByTotal build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendResponseBodyDataHistoryPeriodGroupByTotal self = new GetBillingTrendResponseBodyDataHistoryPeriodGroupByTotal();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodGroupByTotal setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodGroupByTotal setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodGroupByTotal setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodGroupByTotal setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodGroupByTotal setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public String getTaxAmount() {
            return this.taxAmount;
        }

    }

    public static class GetBillingTrendResponseBodyDataHistoryPeriodResultByTimePeriodDetails extends TeaModel {
        /**
         * <p>The amount of the current group.</p>
         * 
         * <strong>example:</strong>
         * <p>526</p>
         */
        @NameInMap("amount")
        public String amount;

        /**
         * <p>The dimension value of the group. If the value is null, DIMENSION_FILTER_NULL_VALUE is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The display name of the group, which is affected by the locale parameter. If the value is null, a hyphen (-) is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The percentage of the group amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("percentage")
        public String percentage;

        /**
         * <p>The total pretax amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("pretaxAmount")
        public String pretaxAmount;

        /**
         * <p>The total tax amount.</p>
         * 
         * <strong>example:</strong>
         * <p>426</p>
         */
        @NameInMap("taxAmount")
        public String taxAmount;

        public static GetBillingTrendResponseBodyDataHistoryPeriodResultByTimePeriodDetails build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendResponseBodyDataHistoryPeriodResultByTimePeriodDetails self = new GetBillingTrendResponseBodyDataHistoryPeriodResultByTimePeriodDetails();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodResultByTimePeriodDetails setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodResultByTimePeriodDetails setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodResultByTimePeriodDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodResultByTimePeriodDetails setPercentage(String percentage) {
            this.percentage = percentage;
            return this;
        }
        public String getPercentage() {
            return this.percentage;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodResultByTimePeriodDetails setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodResultByTimePeriodDetails setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public String getTaxAmount() {
            return this.taxAmount;
        }

    }

    public static class GetBillingTrendResponseBodyDataHistoryPeriodResultByTimeTotal extends TeaModel {
        /**
         * <p>The total cost amount of the current period.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("amount")
        public String amount;

        /**
         * <p>The currency of the amount.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("currency")
        public String currency;

        /**
         * <p>The total pretax amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("pretaxAmount")
        public String pretaxAmount;

        /**
         * <p>The total tax amount.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("taxAmount")
        public String taxAmount;

        public static GetBillingTrendResponseBodyDataHistoryPeriodResultByTimeTotal build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendResponseBodyDataHistoryPeriodResultByTimeTotal self = new GetBillingTrendResponseBodyDataHistoryPeriodResultByTimeTotal();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodResultByTimeTotal setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodResultByTimeTotal setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodResultByTimeTotal setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodResultByTimeTotal setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public String getTaxAmount() {
            return this.taxAmount;
        }

    }

    public static class GetBillingTrendResponseBodyDataHistoryPeriodResultByTime extends TeaModel {
        /**
         * <p>The statistical period.</p>
         * 
         * <strong>example:</strong>
         * <p>20260801</p>
         */
        @NameInMap("period")
        public String period;

        /**
         * <p>The cost groups that actually exist in the current period.</p>
         */
        @NameInMap("periodDetails")
        public java.util.List<GetBillingTrendResponseBodyDataHistoryPeriodResultByTimePeriodDetails> periodDetails;

        /**
         * <p>The total costs of the current period.</p>
         */
        @NameInMap("total")
        public GetBillingTrendResponseBodyDataHistoryPeriodResultByTimeTotal total;

        public static GetBillingTrendResponseBodyDataHistoryPeriodResultByTime build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendResponseBodyDataHistoryPeriodResultByTime self = new GetBillingTrendResponseBodyDataHistoryPeriodResultByTime();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodResultByTime setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodResultByTime setPeriodDetails(java.util.List<GetBillingTrendResponseBodyDataHistoryPeriodResultByTimePeriodDetails> periodDetails) {
            this.periodDetails = periodDetails;
            return this;
        }
        public java.util.List<GetBillingTrendResponseBodyDataHistoryPeriodResultByTimePeriodDetails> getPeriodDetails() {
            return this.periodDetails;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriodResultByTime setTotal(GetBillingTrendResponseBodyDataHistoryPeriodResultByTimeTotal total) {
            this.total = total;
            return this;
        }
        public GetBillingTrendResponseBodyDataHistoryPeriodResultByTimeTotal getTotal() {
            return this.total;
        }

    }

    public static class GetBillingTrendResponseBodyDataHistoryPeriod extends TeaModel {
        /**
         * <p>The total costs within the historical range, including the top N items and Other.</p>
         */
        @NameInMap("costTotals")
        public GetBillingTrendResponseBodyDataHistoryPeriodCostTotals costTotals;

        /**
         * <p>The total costs of the top N groups and the optional Other group within the historical period.</p>
         */
        @NameInMap("groupByTotal")
        public java.util.List<GetBillingTrendResponseBodyDataHistoryPeriodGroupByTotal> groupByTotal;

        /**
         * <p>The list of cost trends sorted in ascending order by time.</p>
         */
        @NameInMap("resultByTime")
        public java.util.List<GetBillingTrendResponseBodyDataHistoryPeriodResultByTime> resultByTime;

        public static GetBillingTrendResponseBodyDataHistoryPeriod build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendResponseBodyDataHistoryPeriod self = new GetBillingTrendResponseBodyDataHistoryPeriod();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendResponseBodyDataHistoryPeriod setCostTotals(GetBillingTrendResponseBodyDataHistoryPeriodCostTotals costTotals) {
            this.costTotals = costTotals;
            return this;
        }
        public GetBillingTrendResponseBodyDataHistoryPeriodCostTotals getCostTotals() {
            return this.costTotals;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriod setGroupByTotal(java.util.List<GetBillingTrendResponseBodyDataHistoryPeriodGroupByTotal> groupByTotal) {
            this.groupByTotal = groupByTotal;
            return this;
        }
        public java.util.List<GetBillingTrendResponseBodyDataHistoryPeriodGroupByTotal> getGroupByTotal() {
            return this.groupByTotal;
        }

        public GetBillingTrendResponseBodyDataHistoryPeriod setResultByTime(java.util.List<GetBillingTrendResponseBodyDataHistoryPeriodResultByTime> resultByTime) {
            this.resultByTime = resultByTime;
            return this;
        }
        public java.util.List<GetBillingTrendResponseBodyDataHistoryPeriodResultByTime> getResultByTime() {
            return this.resultByTime;
        }

    }

    public static class GetBillingTrendResponseBodyDataResultByTimePeriodDetails extends TeaModel {
        /**
         * <p>The amount of the group in the current period.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("amount")
        public String amount;

        /**
         * <p>The dimension value of the group. For data other than the top N items, DIMENSION_GROUP_OTHERS_VALUE is used.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The display name of the group, which is affected by the locale input parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ratio of the current group amount to the total amount of the current period.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6667</p>
         */
        @NameInMap("percentage")
        public String percentage;

        /**
         * <p>The pretax amount of the group in the current period.</p>
         * 
         * <strong>example:</strong>
         * <p>18.87</p>
         */
        @NameInMap("pretaxAmount")
        public String pretaxAmount;

        /**
         * <p>The tax amount of the group in the current period.</p>
         * 
         * <strong>example:</strong>
         * <p>1.13</p>
         */
        @NameInMap("taxAmount")
        public String taxAmount;

        public static GetBillingTrendResponseBodyDataResultByTimePeriodDetails build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendResponseBodyDataResultByTimePeriodDetails self = new GetBillingTrendResponseBodyDataResultByTimePeriodDetails();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendResponseBodyDataResultByTimePeriodDetails setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GetBillingTrendResponseBodyDataResultByTimePeriodDetails setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetBillingTrendResponseBodyDataResultByTimePeriodDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBillingTrendResponseBodyDataResultByTimePeriodDetails setPercentage(String percentage) {
            this.percentage = percentage;
            return this;
        }
        public String getPercentage() {
            return this.percentage;
        }

        public GetBillingTrendResponseBodyDataResultByTimePeriodDetails setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public GetBillingTrendResponseBodyDataResultByTimePeriodDetails setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public String getTaxAmount() {
            return this.taxAmount;
        }

    }

    public static class GetBillingTrendResponseBodyDataResultByTimeTotal extends TeaModel {
        /**
         * <p>The total cost amount of the current period.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("amount")
        public String amount;

        /**
         * <p>The currency of the amount in the current period.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("currency")
        public String currency;

        /**
         * <p>The pretax amount of the current period.</p>
         * 
         * <strong>example:</strong>
         * <p>28.30</p>
         */
        @NameInMap("pretaxAmount")
        public String pretaxAmount;

        /**
         * <p>The tax amount of the current period.</p>
         * 
         * <strong>example:</strong>
         * <p>1.70</p>
         */
        @NameInMap("taxAmount")
        public String taxAmount;

        public static GetBillingTrendResponseBodyDataResultByTimeTotal build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendResponseBodyDataResultByTimeTotal self = new GetBillingTrendResponseBodyDataResultByTimeTotal();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendResponseBodyDataResultByTimeTotal setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GetBillingTrendResponseBodyDataResultByTimeTotal setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetBillingTrendResponseBodyDataResultByTimeTotal setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public GetBillingTrendResponseBodyDataResultByTimeTotal setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public String getTaxAmount() {
            return this.taxAmount;
        }

    }

    public static class GetBillingTrendResponseBodyDataResultByTime extends TeaModel {
        /**
         * <p>The statistical period. DAY returns yyyyMMdd, and MONTH returns yyyyMM.</p>
         * 
         * <strong>example:</strong>
         * <p>20260801</p>
         */
        @NameInMap("period")
        public String period;

        /**
         * <p>The cost groups that actually exist in the current period.</p>
         */
        @NameInMap("periodDetails")
        public java.util.List<GetBillingTrendResponseBodyDataResultByTimePeriodDetails> periodDetails;

        /**
         * <p>The total costs of the current period.</p>
         */
        @NameInMap("total")
        public GetBillingTrendResponseBodyDataResultByTimeTotal total;

        public static GetBillingTrendResponseBodyDataResultByTime build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendResponseBodyDataResultByTime self = new GetBillingTrendResponseBodyDataResultByTime();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendResponseBodyDataResultByTime setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public GetBillingTrendResponseBodyDataResultByTime setPeriodDetails(java.util.List<GetBillingTrendResponseBodyDataResultByTimePeriodDetails> periodDetails) {
            this.periodDetails = periodDetails;
            return this;
        }
        public java.util.List<GetBillingTrendResponseBodyDataResultByTimePeriodDetails> getPeriodDetails() {
            return this.periodDetails;
        }

        public GetBillingTrendResponseBodyDataResultByTime setTotal(GetBillingTrendResponseBodyDataResultByTimeTotal total) {
            this.total = total;
            return this;
        }
        public GetBillingTrendResponseBodyDataResultByTimeTotal getTotal() {
            return this.total;
        }

    }

    public static class GetBillingTrendResponseBodyData extends TeaModel {
        /**
         * <p>The total costs within the entire query time range, including the top N items and Other.</p>
         */
        @NameInMap("costTotals")
        public GetBillingTrendResponseBodyDataCostTotals costTotals;

        /**
         * <p>The total costs of the top N groups and the optional Other group within the period.</p>
         */
        @NameInMap("groupByTotal")
        public java.util.List<GetBillingTrendResponseBodyDataGroupByTotal> groupByTotal;

        /**
         * <p>The historical period data, which is returned when the includeHistoryPeriod input parameter is set to true.</p>
         */
        @NameInMap("historyPeriod")
        public GetBillingTrendResponseBodyDataHistoryPeriod historyPeriod;

        /**
         * <p>The list of cost trends sorted in ascending order by time.</p>
         */
        @NameInMap("resultByTime")
        public java.util.List<GetBillingTrendResponseBodyDataResultByTime> resultByTime;

        public static GetBillingTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendResponseBodyData self = new GetBillingTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendResponseBodyData setCostTotals(GetBillingTrendResponseBodyDataCostTotals costTotals) {
            this.costTotals = costTotals;
            return this;
        }
        public GetBillingTrendResponseBodyDataCostTotals getCostTotals() {
            return this.costTotals;
        }

        public GetBillingTrendResponseBodyData setGroupByTotal(java.util.List<GetBillingTrendResponseBodyDataGroupByTotal> groupByTotal) {
            this.groupByTotal = groupByTotal;
            return this;
        }
        public java.util.List<GetBillingTrendResponseBodyDataGroupByTotal> getGroupByTotal() {
            return this.groupByTotal;
        }

        public GetBillingTrendResponseBodyData setHistoryPeriod(GetBillingTrendResponseBodyDataHistoryPeriod historyPeriod) {
            this.historyPeriod = historyPeriod;
            return this;
        }
        public GetBillingTrendResponseBodyDataHistoryPeriod getHistoryPeriod() {
            return this.historyPeriod;
        }

        public GetBillingTrendResponseBodyData setResultByTime(java.util.List<GetBillingTrendResponseBodyDataResultByTime> resultByTime) {
            this.resultByTime = resultByTime;
            return this;
        }
        public java.util.List<GetBillingTrendResponseBodyDataResultByTime> getResultByTime() {
            return this.resultByTime;
        }

    }

}
