// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansUsageTotalResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The return data.</p>
     */
    @NameInMap("Data")
    public DescribeSavingsPlansUsageTotalResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSavingsPlansUsageTotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansUsageTotalResponseBody self = new DescribeSavingsPlansUsageTotalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansUsageTotalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSavingsPlansUsageTotalResponseBody setData(DescribeSavingsPlansUsageTotalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSavingsPlansUsageTotalResponseBodyData getData() {
        return this.data;
    }

    public DescribeSavingsPlansUsageTotalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSavingsPlansUsageTotalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSavingsPlansUsageTotalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSavingsPlansUsageTotalResponseBodyDataPeriodCoverage extends TeaModel {
        /**
         * <p>The usage.</p>
         */
        @NameInMap("Percentage")
        public Float percentage;

        /**
         * <p>The period.</p>
         * <br>
         * <p>The value is in the format of yyyyMMddHH.</p>
         */
        @NameInMap("Period")
        public String period;

        public static DescribeSavingsPlansUsageTotalResponseBodyDataPeriodCoverage build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansUsageTotalResponseBodyDataPeriodCoverage self = new DescribeSavingsPlansUsageTotalResponseBodyDataPeriodCoverage();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansUsageTotalResponseBodyDataPeriodCoverage setPercentage(Float percentage) {
            this.percentage = percentage;
            return this;
        }
        public Float getPercentage() {
            return this.percentage;
        }

        public DescribeSavingsPlansUsageTotalResponseBodyDataPeriodCoverage setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

    }

    public static class DescribeSavingsPlansUsageTotalResponseBodyDataTotalUsage extends TeaModel {
        /**
         * <p>The total amount of the savings plan.</p>
         */
        @NameInMap("PoolValue")
        public Float poolValue;

        /**
         * <p>The pay-as-you-go cost.</p>
         */
        @NameInMap("PostpaidCost")
        public Float postpaidCost;

        /**
         * <p>The amount that is saved.</p>
         */
        @NameInMap("SavedCost")
        public Float savedCost;

        /**
         * <p>The total usage.</p>
         */
        @NameInMap("UsagePercentage")
        public Float usagePercentage;

        public static DescribeSavingsPlansUsageTotalResponseBodyDataTotalUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansUsageTotalResponseBodyDataTotalUsage self = new DescribeSavingsPlansUsageTotalResponseBodyDataTotalUsage();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansUsageTotalResponseBodyDataTotalUsage setPoolValue(Float poolValue) {
            this.poolValue = poolValue;
            return this;
        }
        public Float getPoolValue() {
            return this.poolValue;
        }

        public DescribeSavingsPlansUsageTotalResponseBodyDataTotalUsage setPostpaidCost(Float postpaidCost) {
            this.postpaidCost = postpaidCost;
            return this;
        }
        public Float getPostpaidCost() {
            return this.postpaidCost;
        }

        public DescribeSavingsPlansUsageTotalResponseBodyDataTotalUsage setSavedCost(Float savedCost) {
            this.savedCost = savedCost;
            return this;
        }
        public Float getSavedCost() {
            return this.savedCost;
        }

        public DescribeSavingsPlansUsageTotalResponseBodyDataTotalUsage setUsagePercentage(Float usagePercentage) {
            this.usagePercentage = usagePercentage;
            return this;
        }
        public Float getUsagePercentage() {
            return this.usagePercentage;
        }

    }

    public static class DescribeSavingsPlansUsageTotalResponseBodyData extends TeaModel {
        /**
         * <p>The usage in different periods.</p>
         */
        @NameInMap("PeriodCoverage")
        public java.util.List<DescribeSavingsPlansUsageTotalResponseBodyDataPeriodCoverage> periodCoverage;

        /**
         * <p>The usage summary.</p>
         */
        @NameInMap("TotalUsage")
        public DescribeSavingsPlansUsageTotalResponseBodyDataTotalUsage totalUsage;

        public static DescribeSavingsPlansUsageTotalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansUsageTotalResponseBodyData self = new DescribeSavingsPlansUsageTotalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansUsageTotalResponseBodyData setPeriodCoverage(java.util.List<DescribeSavingsPlansUsageTotalResponseBodyDataPeriodCoverage> periodCoverage) {
            this.periodCoverage = periodCoverage;
            return this;
        }
        public java.util.List<DescribeSavingsPlansUsageTotalResponseBodyDataPeriodCoverage> getPeriodCoverage() {
            return this.periodCoverage;
        }

        public DescribeSavingsPlansUsageTotalResponseBodyData setTotalUsage(DescribeSavingsPlansUsageTotalResponseBodyDataTotalUsage totalUsage) {
            this.totalUsage = totalUsage;
            return this;
        }
        public DescribeSavingsPlansUsageTotalResponseBodyDataTotalUsage getTotalUsage() {
            return this.totalUsage;
        }

    }

}
