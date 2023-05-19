// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceCoverageTotalResponseBody extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to DescribeResourceCoverageTotal.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the total coverage data of deduction plans.</p>
     */
    @NameInMap("Data")
    public DescribeResourceCoverageTotalResponseBodyData data;

    /**
     * <p>The type of deduction plans whose total coverage data is queried. Valid values: RI and SCU.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The coverage rate of deduction plans within the specified period.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range to query. The beginning is included in the time range. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeResourceCoverageTotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceCoverageTotalResponseBody self = new DescribeResourceCoverageTotalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceCoverageTotalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeResourceCoverageTotalResponseBody setData(DescribeResourceCoverageTotalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeResourceCoverageTotalResponseBodyData getData() {
        return this.data;
    }

    public DescribeResourceCoverageTotalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeResourceCoverageTotalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceCoverageTotalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeResourceCoverageTotalResponseBodyDataPeriodCoverage extends TeaModel {
        /**
         * <p>The returned data.</p>
         */
        @NameInMap("CoveragePercentage")
        public Float coveragePercentage;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Period")
        public String period;

        public static DescribeResourceCoverageTotalResponseBodyDataPeriodCoverage build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceCoverageTotalResponseBodyDataPeriodCoverage self = new DescribeResourceCoverageTotalResponseBodyDataPeriodCoverage();
            return TeaModel.build(map, self);
        }

        public DescribeResourceCoverageTotalResponseBodyDataPeriodCoverage setCoveragePercentage(Float coveragePercentage) {
            this.coveragePercentage = coveragePercentage;
            return this;
        }
        public Float getCoveragePercentage() {
            return this.coveragePercentage;
        }

        public DescribeResourceCoverageTotalResponseBodyDataPeriodCoverage setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

    }

    public static class DescribeResourceCoverageTotalResponseBodyDataTotalCoverage extends TeaModel {
        /**
         * <p>Queries the total coverage data of reserved instances (RIs) or storage capacity units (SCUs).</p>
         */
        @NameInMap("CapacityUnit")
        public String capacityUnit;

        @NameInMap("CoveragePercentage")
        public Float coveragePercentage;

        @NameInMap("DeductQuantity")
        public Float deductQuantity;

        @NameInMap("TotalQuantity")
        public Float totalQuantity;

        public static DescribeResourceCoverageTotalResponseBodyDataTotalCoverage build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceCoverageTotalResponseBodyDataTotalCoverage self = new DescribeResourceCoverageTotalResponseBodyDataTotalCoverage();
            return TeaModel.build(map, self);
        }

        public DescribeResourceCoverageTotalResponseBodyDataTotalCoverage setCapacityUnit(String capacityUnit) {
            this.capacityUnit = capacityUnit;
            return this;
        }
        public String getCapacityUnit() {
            return this.capacityUnit;
        }

        public DescribeResourceCoverageTotalResponseBodyDataTotalCoverage setCoveragePercentage(Float coveragePercentage) {
            this.coveragePercentage = coveragePercentage;
            return this;
        }
        public Float getCoveragePercentage() {
            return this.coveragePercentage;
        }

        public DescribeResourceCoverageTotalResponseBodyDataTotalCoverage setDeductQuantity(Float deductQuantity) {
            this.deductQuantity = deductQuantity;
            return this;
        }
        public Float getDeductQuantity() {
            return this.deductQuantity;
        }

        public DescribeResourceCoverageTotalResponseBodyDataTotalCoverage setTotalQuantity(Float totalQuantity) {
            this.totalQuantity = totalQuantity;
            return this;
        }
        public Float getTotalQuantity() {
            return this.totalQuantity;
        }

    }

    public static class DescribeResourceCoverageTotalResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the account for which you want to query total coverage data. If you do not set this parameter, the data of the current Alibaba Cloud account and its RAM users is queried. To query the data of a RAM user, specify the ID of the RAM user.</p>
         */
        @NameInMap("PeriodCoverage")
        public java.util.List<DescribeResourceCoverageTotalResponseBodyDataPeriodCoverage> periodCoverage;

        /**
         * <p>The unit that is used to measure the resources deducted from deduction plans.</p>
         */
        @NameInMap("TotalCoverage")
        public DescribeResourceCoverageTotalResponseBodyDataTotalCoverage totalCoverage;

        public static DescribeResourceCoverageTotalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceCoverageTotalResponseBodyData self = new DescribeResourceCoverageTotalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeResourceCoverageTotalResponseBodyData setPeriodCoverage(java.util.List<DescribeResourceCoverageTotalResponseBodyDataPeriodCoverage> periodCoverage) {
            this.periodCoverage = periodCoverage;
            return this;
        }
        public java.util.List<DescribeResourceCoverageTotalResponseBodyDataPeriodCoverage> getPeriodCoverage() {
            return this.periodCoverage;
        }

        public DescribeResourceCoverageTotalResponseBodyData setTotalCoverage(DescribeResourceCoverageTotalResponseBodyDataTotalCoverage totalCoverage) {
            this.totalCoverage = totalCoverage;
            return this;
        }
        public DescribeResourceCoverageTotalResponseBodyDataTotalCoverage getTotalCoverage() {
            return this.totalCoverage;
        }

    }

}
