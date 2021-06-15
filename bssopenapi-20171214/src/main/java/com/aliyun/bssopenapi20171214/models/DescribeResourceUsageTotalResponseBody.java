// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageTotalResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public DescribeResourceUsageTotalResponseBodyData data;

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

    public DescribeResourceUsageTotalResponseBody setData(DescribeResourceUsageTotalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeResourceUsageTotalResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeResourceUsageTotalResponseBodyDataPeriodCoverage extends TeaModel {
        @NameInMap("UsagePercentage")
        public Float usagePercentage;

        @NameInMap("Period")
        public String period;

        public static DescribeResourceUsageTotalResponseBodyDataPeriodCoverage build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceUsageTotalResponseBodyDataPeriodCoverage self = new DescribeResourceUsageTotalResponseBodyDataPeriodCoverage();
            return TeaModel.build(map, self);
        }

        public DescribeResourceUsageTotalResponseBodyDataPeriodCoverage setUsagePercentage(Float usagePercentage) {
            this.usagePercentage = usagePercentage;
            return this;
        }
        public Float getUsagePercentage() {
            return this.usagePercentage;
        }

        public DescribeResourceUsageTotalResponseBodyDataPeriodCoverage setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

    }

    public static class DescribeResourceUsageTotalResponseBodyDataTotalUsage extends TeaModel {
        @NameInMap("PostpaidCost")
        public Float postpaidCost;

        @NameInMap("SavedCost")
        public Float savedCost;

        @NameInMap("UsagePercentage")
        public Float usagePercentage;

        @NameInMap("PotentialSavedCost")
        public Float potentialSavedCost;

        @NameInMap("ReservationCost")
        public Float reservationCost;

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

    }

    public static class DescribeResourceUsageTotalResponseBodyData extends TeaModel {
        @NameInMap("PeriodCoverage")
        public java.util.List<DescribeResourceUsageTotalResponseBodyDataPeriodCoverage> periodCoverage;

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
