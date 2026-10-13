// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumStorageMetricsByTypeResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public java.util.List<SumStorageMetricsByTypeResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>1xx: Informational response. The request has been received and is being processed.</li>
     * <li>2xx: Success. The request has been successfully received, understood, and accepted by the server.</li>
     * <li>3xx: Redirection. The request is redirected. Further action is required to complete the request.</li>
     * <li>4xx: Client error. The request contains invalid parameters, bad syntax, or specific request conditions cannot be fulfilled.</li>
     * <li>5xx: Server error. The server cannot fulfill the request due to other reasons.</li>
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
         * <p>The statistics date. Format: yyyyMMdd.</p>
         * 
         * <strong>example:</strong>
         * <p>20260410</p>
         */
        @NameInMap("dateTime")
        public String dateTime;

        /**
         * <p>The storage usage percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("percentage")
        public Double percentage;

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li>Storage: standard storage.</li>
         * <li>LowFreqStorage: infrequent access storage.</li>
         * <li>ColdStorage: long-term storage.</li>
         * <li>$sum: total storage.</li>
         * <li>RecycleBinStorage: backup storage.</li>
         * <li>DRStorage: multi-AZ storage.</li>
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
         * <p>The storage usage.</p>
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
         * <p>The list of daily storage usage statistics.</p>
         */
        @NameInMap("dailyStorageMetrics")
        public java.util.List<SumStorageMetricsByTypeResponseBodyDataDailyStorageMetrics> dailyStorageMetrics;

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li>Storage: standard storage.</li>
         * <li>LowFreqStorage: infrequent access storage.</li>
         * <li>ColdStorage: long-term storage.</li>
         * <li>$sum: total storage.</li>
         * <li>RecycleBinStorage: backup storage.</li>
         * <li>DRStorage: multi-AZ storage.</li>
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
