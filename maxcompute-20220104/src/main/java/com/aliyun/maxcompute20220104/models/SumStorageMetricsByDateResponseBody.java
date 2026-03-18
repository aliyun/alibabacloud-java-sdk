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
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>this quota is not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>1xx: Informational response. The request has been received and is being processed.</li>
     * <li>2xx: Success. The action was successfully received, understood, and accepted by the server.</li>
     * <li>3xx: Redirection. The request was redirected, and further action is required to complete the request.</li>
     * <li>4xx: Client error. The request contains invalid request parameters or syntax, or specific request conditions cannot be met.</li>
     * <li>5xx: Server error. The server failed to fulfill the request for other reasons.</li>
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

    public SumStorageMetricsByDateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SumStorageMetricsByDateResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
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
         * <p>If the specified type is PROJECT, this parameter indicates the project name. If the specified type is STORAGE_TYPE, this parameter indicates the storage class.</p>
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
         * <p>A list of storage usage for the specified type.</p>
         */
        @NameInMap("itemStorageMetrics")
        public java.util.List<SumStorageMetricsByDateResponseBodyDataItemStorageMetrics> itemStorageMetrics;

        /**
         * <p>The storage class. Valid values:</p>
         * <ul>
         * <li>Storage. Standard storage.</li>
         * <li>LowFreqStorage. IA storage class.</li>
         * <li>ColdStorage. Archive storage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Storage</p>
         */
        @NameInMap("storageType")
        public String storageType;

        /**
         * <p>The unit of the total storage usage.</p>
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
