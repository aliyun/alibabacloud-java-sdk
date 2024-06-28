// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageTotalResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The queried data.</p>
     */
    @NameInMap("Data")
    public DescribeResourceUsageTotalResponseBodyData data;

    /**
     * <p>The returned message. If the request was successful, a success message is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>364C7C81-5E5E-51A0-B738-1969D2671B05</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
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
         * 
         * <strong>example:</strong>
         * <p>2021071500</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The usage of resource plans.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
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
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("PostpaidCost")
        public Float postpaidCost;

        /**
         * <p>The total potential savings.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PotentialSavedCost")
        public Float potentialSavedCost;

        /**
         * <p>The fee of purchased resource plans.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ReservationCost")
        public Float reservationCost;

        /**
         * <p>The total savings.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SavedCost")
        public Float savedCost;

        /**
         * <p>The total usage of resource plans.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The usage of resource plans in the specified period.</p>
         */
        @NameInMap("PeriodCoverage")
        public java.util.List<DescribeResourceUsageTotalResponseBodyDataPeriodCoverage> periodCoverage;

        /**
         * <p>The total usage of resource plans.</p>
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
