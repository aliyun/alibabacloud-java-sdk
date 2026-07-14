// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeModelOperatorUsageResponseBody extends TeaModel {
    /**
     * <p>The end time of the query. The time is in the <i>YYYY-MM-DDThh:mmZ</i> format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-02T00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list of metric values.</p>
     */
    @NameInMap("Keys")
    public java.util.List<DescribeModelOperatorUsageResponseBodyKeys> keys;

    /**
     * <p>The actual bucket size used, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query. The time is in the <i>YYYY-MM-DDThh:mmZ</i> format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-01T00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeModelOperatorUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelOperatorUsageResponseBody self = new DescribeModelOperatorUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelOperatorUsageResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeModelOperatorUsageResponseBody setKeys(java.util.List<DescribeModelOperatorUsageResponseBodyKeys> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<DescribeModelOperatorUsageResponseBodyKeys> getKeys() {
        return this.keys;
    }

    public DescribeModelOperatorUsageResponseBody setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeModelOperatorUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModelOperatorUsageResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeModelOperatorUsageResponseBodyKeysSeriesValues extends TeaModel {
        /**
         * <p>The specific metric information, consisting of a timestamp and a metric value.</p>
         */
        @NameInMap("Point")
        public java.util.List<String> point;

        public static DescribeModelOperatorUsageResponseBodyKeysSeriesValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelOperatorUsageResponseBodyKeysSeriesValues self = new DescribeModelOperatorUsageResponseBodyKeysSeriesValues();
            return TeaModel.build(map, self);
        }

        public DescribeModelOperatorUsageResponseBodyKeysSeriesValues setPoint(java.util.List<String> point) {
            this.point = point;
            return this;
        }
        public java.util.List<String> getPoint() {
            return this.point;
        }

    }

    public static class DescribeModelOperatorUsageResponseBodyKeysSeries extends TeaModel {
        /**
         * <p>The API key ID. This value is returned only when GroupBy contains api_key.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApiKeyId")
        public Integer apiKeyId;

        /**
         * <p>The model name when GroupBy contains model. The api_key_id string when GroupBy contains only api_key.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.6-plus</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The normalized GroupBy value: model, api_key, or model,api_key.</p>
         * 
         * <strong>example:</strong>
         * <p>model</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The list of metric values. Each value corresponds to a collection time point.</p>
         */
        @NameInMap("Values")
        public java.util.List<DescribeModelOperatorUsageResponseBodyKeysSeriesValues> values;

        public static DescribeModelOperatorUsageResponseBodyKeysSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelOperatorUsageResponseBodyKeysSeries self = new DescribeModelOperatorUsageResponseBodyKeysSeries();
            return TeaModel.build(map, self);
        }

        public DescribeModelOperatorUsageResponseBodyKeysSeries setApiKeyId(Integer apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }
        public Integer getApiKeyId() {
            return this.apiKeyId;
        }

        public DescribeModelOperatorUsageResponseBodyKeysSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeModelOperatorUsageResponseBodyKeysSeries setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeModelOperatorUsageResponseBodyKeysSeries setValues(java.util.List<DescribeModelOperatorUsageResponseBodyKeysSeriesValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeModelOperatorUsageResponseBodyKeysSeriesValues> getValues() {
            return this.values;
        }

    }

    public static class DescribeModelOperatorUsageResponseBodyKeys extends TeaModel {
        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>request_count</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The collection of metric values.</p>
         */
        @NameInMap("Series")
        public java.util.List<DescribeModelOperatorUsageResponseBodyKeysSeries> series;

        /**
         * <p>The unit. Valid values:</p>
         * <ul>
         * <li>requests</li>
         * <li>tokens</li>
         * <li>%</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>requests</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static DescribeModelOperatorUsageResponseBodyKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelOperatorUsageResponseBodyKeys self = new DescribeModelOperatorUsageResponseBodyKeys();
            return TeaModel.build(map, self);
        }

        public DescribeModelOperatorUsageResponseBodyKeys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeModelOperatorUsageResponseBodyKeys setSeries(java.util.List<DescribeModelOperatorUsageResponseBodyKeysSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeModelOperatorUsageResponseBodyKeysSeries> getSeries() {
            return this.series;
        }

        public DescribeModelOperatorUsageResponseBodyKeys setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
