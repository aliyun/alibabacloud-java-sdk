// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumComputeMetricsByUsageResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<SumComputeMetricsByUsageResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <strong>example:</strong>
     * <p>0bc0598d17544456742466519e6611</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SumComputeMetricsByUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SumComputeMetricsByUsageResponseBody self = new SumComputeMetricsByUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public SumComputeMetricsByUsageResponseBody setData(java.util.List<SumComputeMetricsByUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SumComputeMetricsByUsageResponseBodyData> getData() {
        return this.data;
    }

    public SumComputeMetricsByUsageResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public SumComputeMetricsByUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SumComputeMetricsByUsageResponseBodyDataDailyComputeMetrics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20260413</p>
         */
        @NameInMap("dateTime")
        public String dateTime;

        /**
         * <strong>example:</strong>
         * <p>GBCplx</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>1.149683987</p>
         */
        @NameInMap("usage")
        public String usage;

        public static SumComputeMetricsByUsageResponseBodyDataDailyComputeMetrics build(java.util.Map<String, ?> map) throws Exception {
            SumComputeMetricsByUsageResponseBodyDataDailyComputeMetrics self = new SumComputeMetricsByUsageResponseBodyDataDailyComputeMetrics();
            return TeaModel.build(map, self);
        }

        public SumComputeMetricsByUsageResponseBodyDataDailyComputeMetrics setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public SumComputeMetricsByUsageResponseBodyDataDailyComputeMetrics setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public SumComputeMetricsByUsageResponseBodyDataDailyComputeMetrics setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class SumComputeMetricsByUsageResponseBodyData extends TeaModel {
        @NameInMap("dailyComputeMetrics")
        public java.util.List<SumComputeMetricsByUsageResponseBodyDataDailyComputeMetrics> dailyComputeMetrics;

        /**
         * <strong>example:</strong>
         * <p>ComputationSql</p>
         */
        @NameInMap("type")
        public String type;

        public static SumComputeMetricsByUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SumComputeMetricsByUsageResponseBodyData self = new SumComputeMetricsByUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SumComputeMetricsByUsageResponseBodyData setDailyComputeMetrics(java.util.List<SumComputeMetricsByUsageResponseBodyDataDailyComputeMetrics> dailyComputeMetrics) {
            this.dailyComputeMetrics = dailyComputeMetrics;
            return this;
        }
        public java.util.List<SumComputeMetricsByUsageResponseBodyDataDailyComputeMetrics> getDailyComputeMetrics() {
            return this.dailyComputeMetrics;
        }

        public SumComputeMetricsByUsageResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
