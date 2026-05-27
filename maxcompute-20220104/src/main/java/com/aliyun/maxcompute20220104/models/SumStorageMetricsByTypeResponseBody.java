// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumStorageMetricsByTypeResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<SumStorageMetricsByTypeResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <strong>example:</strong>
     * <p>0a06dc0917476202205161986edbbc</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SumStorageMetricsByTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SumStorageMetricsByTypeResponseBody self = new SumStorageMetricsByTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public SumStorageMetricsByTypeResponseBody setData(java.util.List<SumStorageMetricsByTypeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SumStorageMetricsByTypeResponseBodyData> getData() {
        return this.data;
    }

    public SumStorageMetricsByTypeResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public SumStorageMetricsByTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SumStorageMetricsByTypeResponseBodyDataDailyStorageMetrics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20260410</p>
         */
        @NameInMap("dateTime")
        public String dateTime;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("percentage")
        public Double percentage;

        /**
         * <strong>example:</strong>
         * <p>Storage</p>
         */
        @NameInMap("storageType")
        public String storageType;

        /**
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("usage")
        public Double usage;

        public static SumStorageMetricsByTypeResponseBodyDataDailyStorageMetrics build(java.util.Map<String, ?> map) throws Exception {
            SumStorageMetricsByTypeResponseBodyDataDailyStorageMetrics self = new SumStorageMetricsByTypeResponseBodyDataDailyStorageMetrics();
            return TeaModel.build(map, self);
        }

        public SumStorageMetricsByTypeResponseBodyDataDailyStorageMetrics setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public SumStorageMetricsByTypeResponseBodyDataDailyStorageMetrics setPercentage(Double percentage) {
            this.percentage = percentage;
            return this;
        }
        public Double getPercentage() {
            return this.percentage;
        }

        public SumStorageMetricsByTypeResponseBodyDataDailyStorageMetrics setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public SumStorageMetricsByTypeResponseBodyDataDailyStorageMetrics setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public SumStorageMetricsByTypeResponseBodyDataDailyStorageMetrics setUsage(Double usage) {
            this.usage = usage;
            return this;
        }
        public Double getUsage() {
            return this.usage;
        }

    }

    public static class SumStorageMetricsByTypeResponseBodyData extends TeaModel {
        @NameInMap("dailyStorageMetrics")
        public java.util.List<SumStorageMetricsByTypeResponseBodyDataDailyStorageMetrics> dailyStorageMetrics;

        /**
         * <strong>example:</strong>
         * <p>Storage</p>
         */
        @NameInMap("storageType")
        public String storageType;

        /**
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>329.503338</p>
         */
        @NameInMap("usage")
        public Double usage;

        public static SumStorageMetricsByTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SumStorageMetricsByTypeResponseBodyData self = new SumStorageMetricsByTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SumStorageMetricsByTypeResponseBodyData setDailyStorageMetrics(java.util.List<SumStorageMetricsByTypeResponseBodyDataDailyStorageMetrics> dailyStorageMetrics) {
            this.dailyStorageMetrics = dailyStorageMetrics;
            return this;
        }
        public java.util.List<SumStorageMetricsByTypeResponseBodyDataDailyStorageMetrics> getDailyStorageMetrics() {
            return this.dailyStorageMetrics;
        }

        public SumStorageMetricsByTypeResponseBodyData setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public SumStorageMetricsByTypeResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public SumStorageMetricsByTypeResponseBodyData setUsage(Double usage) {
            this.usage = usage;
            return this;
        }
        public Double getUsage() {
            return this.usage;
        }

    }

}
