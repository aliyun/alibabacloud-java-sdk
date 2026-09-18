// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumStorageMetricsByDateResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public java.util.List<SumStorageMetricsByDateResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li><p>1xx: Informational. The request is received and the process is continuing.</p>
     * </li>
     * <li><p>2xx: Success. The request is successfully received, understood, and accepted.</p>
     * </li>
     * <li><p>3xx: Redirection. Further action needs to be taken to complete the request.</p>
     * </li>
     * <li><p>4xx: Client Error. The request contains bad syntax or cannot be fulfilled.</p>
     * </li>
     * <li><p>5xx: Server Error. The server fails to fulfill an apparently valid request.</p>
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
     * <p>0abb781a17411408145995819e0dae</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SumStorageMetricsByDateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SumStorageMetricsByDateResponseBody self = new SumStorageMetricsByDateResponseBody();
        return TeaModel.build(map, self);
    }

    public SumStorageMetricsByDateResponseBody setData(java.util.List<SumStorageMetricsByDateResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SumStorageMetricsByDateResponseBodyData> getData() {
        return this.data;
    }

    public SumStorageMetricsByDateResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public SumStorageMetricsByDateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SumStorageMetricsByDateResponseBodyDataItemStorageMetrics extends TeaModel {
        /**
         * <p>If the type is PROJECT, this parameter indicates the project name. If the type is STORAGE_TYPE, this parameter indicates the storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>prj</p>
         */
        @NameInMap("itemName")
        public String itemName;

        /**
         * <p>The percentage of the storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>91.22</p>
         */
        @NameInMap("percentage")
        public Double percentage;

        /**
         * <p>The storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>300.560392</p>
         */
        @NameInMap("usage")
        public String usage;

        public static SumStorageMetricsByDateResponseBodyDataItemStorageMetrics build(java.util.Map<String, ?> map) throws Exception {
            SumStorageMetricsByDateResponseBodyDataItemStorageMetrics self = new SumStorageMetricsByDateResponseBodyDataItemStorageMetrics();
            return TeaModel.build(map, self);
        }

        public SumStorageMetricsByDateResponseBodyDataItemStorageMetrics setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public SumStorageMetricsByDateResponseBodyDataItemStorageMetrics setPercentage(Double percentage) {
            this.percentage = percentage;
            return this;
        }
        public Double getPercentage() {
            return this.percentage;
        }

        public SumStorageMetricsByDateResponseBodyDataItemStorageMetrics setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class SumStorageMetricsByDateResponseBodyData extends TeaModel {
        /**
         * <p>The date of the statistics. The format is yyyyMMdd.</p>
         * 
         * <strong>example:</strong>
         * <p>20250719</p>
         */
        @NameInMap("dateTime")
        public String dateTime;

        /**
         * <p>The list of storage usage of a specified type.</p>
         */
        @NameInMap("itemStorageMetrics")
        public java.util.List<SumStorageMetricsByDateResponseBodyDataItemStorageMetrics> itemStorageMetrics;

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li><p>Storage: Standard.</p>
         * </li>
         * <li><p>LowFreqStorage: Infrequent Access (IA).</p>
         * </li>
         * <li><p>ColdStorage: Archive.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Storage</p>
         */
        @NameInMap("storageType")
        public String storageType;

        /**
         * <p>The unit of the total storage.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <p>The total storage.</p>
         * 
         * <strong>example:</strong>
         * <p>329.503338</p>
         */
        @NameInMap("usage")
        public String usage;

        public static SumStorageMetricsByDateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SumStorageMetricsByDateResponseBodyData self = new SumStorageMetricsByDateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SumStorageMetricsByDateResponseBodyData setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public SumStorageMetricsByDateResponseBodyData setItemStorageMetrics(java.util.List<SumStorageMetricsByDateResponseBodyDataItemStorageMetrics> itemStorageMetrics) {
            this.itemStorageMetrics = itemStorageMetrics;
            return this;
        }
        public java.util.List<SumStorageMetricsByDateResponseBodyDataItemStorageMetrics> getItemStorageMetrics() {
            return this.itemStorageMetrics;
        }

        public SumStorageMetricsByDateResponseBodyData setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public SumStorageMetricsByDateResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public SumStorageMetricsByDateResponseBodyData setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

}
