// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumComputeMetricsByUsageResponseBody extends TeaModel {
    /**
     * <p>The usage data for each metering type.</p>
     */
    @NameInMap("data")
    public java.util.List<SumComputeMetricsByUsageResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li><p><code>1xx</code>: Informational response. The request is received and is being processed.</p>
     * </li>
     * <li><p><code>2xx</code>: Success. The request was successfully received, understood, and accepted.</p>
     * </li>
     * <li><p><code>3xx</code>: Redirection. Further action is required to complete the request.</p>
     * </li>
     * <li><p><code>4xx</code>: Client error. The request has invalid syntax or cannot be fulfilled.</p>
     * </li>
     * <li><p><code>5xx</code>: Server error. The server failed to fulfill an otherwise valid request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The date of the usage, in <code>yyyyMMdd</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>20260413</p>
         */
        @NameInMap("dateTime")
        public String dateTime;

        /**
         * <p>The unit of compute usage.</p>
         * 
         * <strong>example:</strong>
         * <p>GBCplx</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <p>The total usage for the day.</p>
         * 
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
        /**
         * <p>The daily usage statistics.</p>
         */
        @NameInMap("dailyComputeMetrics")
        public java.util.List<SumComputeMetricsByUsageResponseBodyDataDailyComputeMetrics> dailyComputeMetrics;

        /**
         * <p>The metering type.</p>
         * <p><code>ComputationSql</code>: Metering data for SQL jobs on internal tables.</p>
         * <p><code>ComputationSqlOTS</code>: Metering data for SQL jobs on OTS external tables.</p>
         * <p><code>ComputationSqlOSS</code>: Metering data for SQL jobs on OSS external tables.</p>
         * <p><code>MapReduce</code>: Metering data for MapReduce jobs.</p>
         * <p><code>spark</code>: Metering data for Spark jobs.</p>
         * <p><code>mars</code>: Metering data for Mars jobs.</p>
         * 
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
