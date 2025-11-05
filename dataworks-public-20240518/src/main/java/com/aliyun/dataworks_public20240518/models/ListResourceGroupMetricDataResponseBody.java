// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourceGroupMetricDataResponseBody extends TeaModel {
    @NameInMap("MetricData")
    public ListResourceGroupMetricDataResponseBodyMetricData metricData;

    /**
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListResourceGroupMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupMetricDataResponseBody self = new ListResourceGroupMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupMetricDataResponseBody setMetricData(ListResourceGroupMetricDataResponseBodyMetricData metricData) {
        this.metricData = metricData;
        return this;
    }
    public ListResourceGroupMetricDataResponseBodyMetricData getMetricData() {
        return this.metricData;
    }

    public ListResourceGroupMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceGroupMetricDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListResourceGroupMetricDataResponseBodyMetricDataMetrics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1761184929633</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Value")
        public Double value;

        public static ListResourceGroupMetricDataResponseBodyMetricDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupMetricDataResponseBodyMetricDataMetrics self = new ListResourceGroupMetricDataResponseBodyMetricDataMetrics();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupMetricDataResponseBodyMetricDataMetrics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListResourceGroupMetricDataResponseBodyMetricDataMetrics setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class ListResourceGroupMetricDataResponseBodyMetricData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>CUSpec</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Metrics")
        public java.util.List<ListResourceGroupMetricDataResponseBodyMetricDataMetrics> metrics;

        /**
         * <strong>example:</strong>
         * <p>tSBOXZcAmk+akxRkwRuXnGQEsIDODyd5ulPqgytNTbLp4bhb7fuvz13FXtm87Kfl</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListResourceGroupMetricDataResponseBodyMetricData build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupMetricDataResponseBodyMetricData self = new ListResourceGroupMetricDataResponseBodyMetricData();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupMetricDataResponseBodyMetricData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourceGroupMetricDataResponseBodyMetricData setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ListResourceGroupMetricDataResponseBodyMetricData setMetrics(java.util.List<ListResourceGroupMetricDataResponseBodyMetricDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<ListResourceGroupMetricDataResponseBodyMetricDataMetrics> getMetrics() {
            return this.metrics;
        }

        public ListResourceGroupMetricDataResponseBodyMetricData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
