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
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetBillingTrendResponseBodyData data;

    /**
     * <p>The request result description.</p>
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
     * <p>Indicates whether the request was successful.</p>
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
         * <p>The total amount.</p>
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
         * <p>The grouping dimension value.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The display name of the group. This value is affected by the locale parameter.</p>
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

    public static class GetBillingTrendResponseBodyDataResultByTimePeriodDetails extends TeaModel {
        /**
         * <p>The amount of the group within the current period.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("amount")
        public String amount;

        /**
         * <p>The grouping dimension value. Data beyond the top N uses DIMENSION_GROUP_OTHERS_VALUE.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The display name of the group. This value is affected by the locale parameter.</p>
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
         * <p>The pretax amount of the group within the current period.</p>
         * 
         * <strong>example:</strong>
         * <p>18.87</p>
         */
        @NameInMap("pretaxAmount")
        public String pretaxAmount;

        /**
         * <p>The tax amount of the group within the current period.</p>
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
         * <p>The total amount for the current period.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("amount")
        public String amount;

        /**
         * <p>The currency of the amount for the current period.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("currency")
        public String currency;

        /**
         * <p>The pretax amount for the current period.</p>
         * 
         * <strong>example:</strong>
         * <p>28.30</p>
         */
        @NameInMap("pretaxAmount")
        public String pretaxAmount;

        /**
         * <p>The tax amount for the current period.</p>
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
         * <p>The statistical period. DAY returns yyyyMMdd. MONTH returns yyyyMM.</p>
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
         * <p>The total cost for the current period.</p>
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
         * <p>The total cost for the entire query time range, including the top N groups and &quot;Others&quot;.</p>
         */
        @NameInMap("costTotals")
        public GetBillingTrendResponseBodyDataCostTotals costTotals;

        /**
         * <p>The total cost of the top N groups and the optional &quot;Others&quot; group within the period.</p>
         */
        @NameInMap("groupByTotal")
        public java.util.List<GetBillingTrendResponseBodyDataGroupByTotal> groupByTotal;

        /**
         * <p>The cost trend list sorted by time in ascending order.</p>
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

        public GetBillingTrendResponseBodyData setResultByTime(java.util.List<GetBillingTrendResponseBodyDataResultByTime> resultByTime) {
            this.resultByTime = resultByTime;
            return this;
        }
        public java.util.List<GetBillingTrendResponseBodyDataResultByTime> getResultByTime() {
            return this.resultByTime;
        }

    }

}
