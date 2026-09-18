// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumStorageMetricsByTypeResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public java.util.List<SumStorageMetricsByTypeResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li><p><code>1xx</code>: Informational response - The request has been received and is being processed.</p>
     * </li>
     * <li><p><code>2xx</code>: Success - The request was successfully received, understood, and accepted.</p>
     * </li>
     * <li><p><code>3xx</code>: Redirection - Further action is needed to complete the request.</p>
     * </li>
     * <li><p><code>4xx</code>: Client error - The request contains invalid syntax or cannot be fulfilled.</p>
     * </li>
     * <li><p><code>5xx</code>: Server error - The server failed to fulfill a valid request.</p>
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
         * <p>The date of the metric, in <code>yyyyMMdd</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>20260410</p>
         */
        @NameInMap("dateTime")
        public String dateTime;

        /**
         * <p>The percentage of total daily storage that this storage type accounts for.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("percentage")
        public Double percentage;

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li><p><code>Storage</code>: standard storage.</p>
         * </li>
         * <li><p><code>LowFreqStorage</code>: infrequent access storage.</p>
         * </li>
         * <li><p><code>ColdStorage</code>: archive storage.</p>
         * </li>
         * <li><p><code>$sum</code>: total storage.</p>
         * </li>
         * <li><p><code>RecycleBinStorage</code>: recycle bin storage.</p>
         * </li>
         * <li><p><code>DRStorage</code>: multi-AZ storage.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Storage</p>
         */
        @NameInMap("storageType")
        public String storageType;

        /**
         * <p>The unit of the storage metric.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <p>The storage usage for this day.</p>
         * 
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
        /**
         * <p>A list of daily storage usage metrics.</p>
         */
        @NameInMap("dailyStorageMetrics")
        public java.util.List<SumStorageMetricsByTypeResponseBodyDataDailyStorageMetrics> dailyStorageMetrics;

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li><p><code>Storage</code>: standard storage.</p>
         * </li>
         * <li><p><code>LowFreqStorage</code>: infrequent access storage.</p>
         * </li>
         * <li><p><code>ColdStorage</code>: archive storage.</p>
         * </li>
         * <li><p><code>$sum</code>: total storage.</p>
         * </li>
         * <li><p><code>RecycleBinStorage</code>: recycle bin storage.</p>
         * </li>
         * <li><p><code>DRStorage</code>: multi-AZ storage.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Storage</p>
         */
        @NameInMap("storageType")
        public String storageType;

        /**
         * <p>The unit of the storage metric.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <p>The total storage usage.</p>
         * 
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
