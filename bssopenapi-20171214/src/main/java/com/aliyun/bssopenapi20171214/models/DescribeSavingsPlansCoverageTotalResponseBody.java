// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansCoverageTotalResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public DescribeSavingsPlansCoverageTotalResponseBodyData data;

    public static DescribeSavingsPlansCoverageTotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansCoverageTotalResponseBody self = new DescribeSavingsPlansCoverageTotalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansCoverageTotalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSavingsPlansCoverageTotalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSavingsPlansCoverageTotalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSavingsPlansCoverageTotalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSavingsPlansCoverageTotalResponseBody setData(DescribeSavingsPlansCoverageTotalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSavingsPlansCoverageTotalResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeSavingsPlansCoverageTotalResponseBodyDataPeriodCoverage extends TeaModel {
        @NameInMap("Percentage")
        public Float percentage;

        @NameInMap("Period")
        public String period;

        public static DescribeSavingsPlansCoverageTotalResponseBodyDataPeriodCoverage build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansCoverageTotalResponseBodyDataPeriodCoverage self = new DescribeSavingsPlansCoverageTotalResponseBodyDataPeriodCoverage();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansCoverageTotalResponseBodyDataPeriodCoverage setPercentage(Float percentage) {
            this.percentage = percentage;
            return this;
        }
        public Float getPercentage() {
            return this.percentage;
        }

        public DescribeSavingsPlansCoverageTotalResponseBodyDataPeriodCoverage setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

    }

    public static class DescribeSavingsPlansCoverageTotalResponseBodyDataTotalCoverage extends TeaModel {
        @NameInMap("CoveragePercentage")
        public Float coveragePercentage;

        @NameInMap("DeductAmount")
        public Float deductAmount;

        public static DescribeSavingsPlansCoverageTotalResponseBodyDataTotalCoverage build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansCoverageTotalResponseBodyDataTotalCoverage self = new DescribeSavingsPlansCoverageTotalResponseBodyDataTotalCoverage();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansCoverageTotalResponseBodyDataTotalCoverage setCoveragePercentage(Float coveragePercentage) {
            this.coveragePercentage = coveragePercentage;
            return this;
        }
        public Float getCoveragePercentage() {
            return this.coveragePercentage;
        }

        public DescribeSavingsPlansCoverageTotalResponseBodyDataTotalCoverage setDeductAmount(Float deductAmount) {
            this.deductAmount = deductAmount;
            return this;
        }
        public Float getDeductAmount() {
            return this.deductAmount;
        }

    }

    public static class DescribeSavingsPlansCoverageTotalResponseBodyData extends TeaModel {
        @NameInMap("PeriodCoverage")
        public java.util.List<DescribeSavingsPlansCoverageTotalResponseBodyDataPeriodCoverage> periodCoverage;

        @NameInMap("TotalCoverage")
        public DescribeSavingsPlansCoverageTotalResponseBodyDataTotalCoverage totalCoverage;

        public static DescribeSavingsPlansCoverageTotalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansCoverageTotalResponseBodyData self = new DescribeSavingsPlansCoverageTotalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansCoverageTotalResponseBodyData setPeriodCoverage(java.util.List<DescribeSavingsPlansCoverageTotalResponseBodyDataPeriodCoverage> periodCoverage) {
            this.periodCoverage = periodCoverage;
            return this;
        }
        public java.util.List<DescribeSavingsPlansCoverageTotalResponseBodyDataPeriodCoverage> getPeriodCoverage() {
            return this.periodCoverage;
        }

        public DescribeSavingsPlansCoverageTotalResponseBodyData setTotalCoverage(DescribeSavingsPlansCoverageTotalResponseBodyDataTotalCoverage totalCoverage) {
            this.totalCoverage = totalCoverage;
            return this;
        }
        public DescribeSavingsPlansCoverageTotalResponseBodyDataTotalCoverage getTotalCoverage() {
            return this.totalCoverage;
        }

    }

}
