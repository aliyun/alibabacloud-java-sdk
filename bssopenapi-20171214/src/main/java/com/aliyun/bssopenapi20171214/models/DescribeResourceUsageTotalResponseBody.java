// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageTotalResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeResourceUsageTotalResponseBodyData data;

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

    public static DescribeResourceUsageTotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageTotalResponseBody self = new DescribeResourceUsageTotalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceUsageTotalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeResourceUsageTotalResponseBody setData(DescribeResourceUsageTotalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeResourceUsageTotalResponseBodyData getData() {
        return this.data;
    }

    public DescribeResourceUsageTotalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeResourceUsageTotalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceUsageTotalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeResourceUsageTotalResponseBodyDataPeriodCoverage extends TeaModel {
        /**
         * <p>The period.</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The usage of deduction plans within the specified period.</p>
         */
        @NameInMap("UsagePercentage")
        public Float usagePercentage;

        public static DescribeResourceUsageTotalResponseBodyDataPeriodCoverage build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceUsageTotalResponseBodyDataPeriodCoverage self = new DescribeResourceUsageTotalResponseBodyDataPeriodCoverage();
            return TeaModel.build(map, self);
        }

        public DescribeResourceUsageTotalResponseBodyDataPeriodCoverage setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeResourceUsageTotalResponseBodyDataPeriodCoverage setUsagePercentage(Float usagePercentage) {
            this.usagePercentage = usagePercentage;
            return this;
        }
        public Float getUsagePercentage() {
            return this.usagePercentage;
        }

    }

    public static class DescribeResourceUsageTotalResponseBodyDataTotalUsage extends TeaModel {
        /**
         * <p>The total costs of pay-as-you-go instances.</p>
         */
        @NameInMap("PostpaidCost")
        public Float postpaidCost;

        /**
         * <p>The total potential savings.</p>
         */
        @NameInMap("PotentialSavedCost")
        public Float potentialSavedCost;

        /**
         * <p>The fee of purchased deduction plans.</p>
         */
        @NameInMap("ReservationCost")
        public Float reservationCost;

        /**
         * <p>The total savings.</p>
         */
        @NameInMap("SavedCost")
        public Float savedCost;

        /**
         * <p>The total usage of deduction plans.</p>
         */
        @NameInMap("UsagePercentage")
        public Float usagePercentage;

        public static DescribeResourceUsageTotalResponseBodyDataTotalUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceUsageTotalResponseBodyDataTotalUsage self = new DescribeResourceUsageTotalResponseBodyDataTotalUsage();
            return TeaModel.build(map, self);
        }

        public DescribeResourceUsageTotalResponseBodyDataTotalUsage setPostpaidCost(Float postpaidCost) {
            this.postpaidCost = postpaidCost;
            return this;
        }
        public Float getPostpaidCost() {
            return this.postpaidCost;
        }

        public DescribeResourceUsageTotalResponseBodyDataTotalUsage setPotentialSavedCost(Float potentialSavedCost) {
            this.potentialSavedCost = potentialSavedCost;
            return this;
        }
        public Float getPotentialSavedCost() {
            return this.potentialSavedCost;
        }

        public DescribeResourceUsageTotalResponseBodyDataTotalUsage setReservationCost(Float reservationCost) {
            this.reservationCost = reservationCost;
            return this;
        }
        public Float getReservationCost() {
            return this.reservationCost;
        }

        public DescribeResourceUsageTotalResponseBodyDataTotalUsage setSavedCost(Float savedCost) {
            this.savedCost = savedCost;
            return this;
        }
        public Float getSavedCost() {
            return this.savedCost;
        }

        public DescribeResourceUsageTotalResponseBodyDataTotalUsage setUsagePercentage(Float usagePercentage) {
            this.usagePercentage = usagePercentage;
            return this;
        }
        public Float getUsagePercentage() {
            return this.usagePercentage;
        }

    }

    public static class DescribeResourceUsageTotalResponseBodyData extends TeaModel {
        /**
         * <p>The information about the usage of deduction plans within a period.</p>
         */
        @NameInMap("PeriodCoverage")
        public java.util.List<DescribeResourceUsageTotalResponseBodyDataPeriodCoverage> periodCoverage;

        /**
         * <p>The information about the total usage data of deduction plans.</p>
         */
        @NameInMap("TotalUsage")
        public DescribeResourceUsageTotalResponseBodyDataTotalUsage totalUsage;

        public static DescribeResourceUsageTotalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceUsageTotalResponseBodyData self = new DescribeResourceUsageTotalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeResourceUsageTotalResponseBodyData setPeriodCoverage(java.util.List<DescribeResourceUsageTotalResponseBodyDataPeriodCoverage> periodCoverage) {
            this.periodCoverage = periodCoverage;
            return this;
        }
        public java.util.List<DescribeResourceUsageTotalResponseBodyDataPeriodCoverage> getPeriodCoverage() {
            return this.periodCoverage;
        }

        public DescribeResourceUsageTotalResponseBodyData setTotalUsage(DescribeResourceUsageTotalResponseBodyDataTotalUsage totalUsage) {
            this.totalUsage = totalUsage;
            return this;
        }
        public DescribeResourceUsageTotalResponseBodyDataTotalUsage getTotalUsage() {
            return this.totalUsage;
        }

    }

}
