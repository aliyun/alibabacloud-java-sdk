// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceCoverageTotalResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeResourceCoverageTotalResponseBodyData data;

    /**
     * <p>The message returned.</p>
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
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The coverage rate of deduction plans within the specified period.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("CoveragePercentage")
        public Float coveragePercentage;

        /**
         * <p>The period.</p>
         * <p>The value is in the format of yyyyMMddHH.</p>
         * 
         * <strong>example:</strong>
         * <p>2020110100</p>
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
         * <p>The unit that is used to measure the resources deducted from deduction plans.</p>
         */
        @NameInMap("CapacityUnit")
        public String capacityUnit;

        /**
         * <p>The total coverage rate of deduction plans.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CoveragePercentage")
        public Float coveragePercentage;

        /**
         * <p>The total amount of the resources deducted from deduction plans.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DeductQuantity")
        public Float deductQuantity;

        /**
         * <p>The total amount of resources consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
         * <p>The information about the coverage rate of deduction plans within a period.</p>
         */
        @NameInMap("PeriodCoverage")
        public java.util.List<DescribeResourceCoverageTotalResponseBodyDataPeriodCoverage> periodCoverage;

        /**
         * <p>The information about the total coverage data of deduction plans.</p>
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
