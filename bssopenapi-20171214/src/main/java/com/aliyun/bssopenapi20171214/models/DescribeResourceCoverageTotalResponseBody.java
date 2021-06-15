// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceCoverageTotalResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public DescribeResourceCoverageTotalResponseBodyData data;

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

    public DescribeResourceCoverageTotalResponseBody setData(DescribeResourceCoverageTotalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeResourceCoverageTotalResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeResourceCoverageTotalResponseBodyDataPeriodCoverage extends TeaModel {
        @NameInMap("CoveragePercentage")
        public Float coveragePercentage;

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
        @NameInMap("CapacityUnit")
        public String capacityUnit;

        @NameInMap("DeductQuantity")
        public Float deductQuantity;

        @NameInMap("CoveragePercentage")
        public Float coveragePercentage;

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

        public DescribeResourceCoverageTotalResponseBodyDataTotalCoverage setDeductQuantity(Float deductQuantity) {
            this.deductQuantity = deductQuantity;
            return this;
        }
        public Float getDeductQuantity() {
            return this.deductQuantity;
        }

        public DescribeResourceCoverageTotalResponseBodyDataTotalCoverage setCoveragePercentage(Float coveragePercentage) {
            this.coveragePercentage = coveragePercentage;
            return this;
        }
        public Float getCoveragePercentage() {
            return this.coveragePercentage;
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
        @NameInMap("PeriodCoverage")
        public java.util.List<DescribeResourceCoverageTotalResponseBodyDataPeriodCoverage> periodCoverage;

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
