// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourceGroupMetricDataResponseBody extends TeaModel {
    /**
     * <p>Monitoring metric data.</p>
     */
    @NameInMap("MetricData")
    public ListResourceGroupMetricDataResponseBodyMetricData metricData;

    /**
     * <p>The request ID, used for locating logs and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
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
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1761184929633</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The value of the metric data.</p>
         * 
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
         * <p>The unique identifier for the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The metric name. Valid values:</p>
         * <ul>
         * <li>CUSpec: Maximum CU capacity of the resource group, in CUs.</li>
         * <li>CUUsage: CU usage of the resource group, in CUs.</li>
         * <li>CUUtilization: CU utilization of the resource group, in %.</li>
         * <li>SlotSpec: Maximum number of concurrent slots for resource group scheduling, in slots.</li>
         * <li>SlotUsage: Used concurrency for resource group scheduling, in slots.</li>
         * <li>SchedulerCUMaxSpec: Maximum CU quota for data computing, in CUs.</li>
         * <li>SchedulerCUUsage: CU usage for data computing, in CUs.</li>
         * <li>SchedulerCUMinSpec: Minimum guaranteed CUs for data computing, in CUs.</li>
         * <li>DataIntegrationCUMaxSpec: Maximum CU quota for Data Integration, in CUs.</li>
         * <li>DataIntegrationCUUsage: CU usage for Data Integration, in CUs.</li>
         * <li>DataIntegrationCUMinSpec: Minimum guaranteed CUs for Data Integration, in CUs.</li>
         * <li>DataServiceCUMaxSpec: Maximum CU quota for DataService Studio, in CUs.</li>
         * <li>DataServiceCUUsage: CU usage for DataService Studio, in CUs.</li>
         * <li>DataServiceCUMinSpec: Minimum guaranteed CUs for DataService Studio, in CUs.</li>
         * <li>ServerIdeCUMaxSpec: Maximum CU quota for personal development environment, in CUs.</li>
         * <li>ServerIdeCUUsage: CU usage for personal development environment, in CUs.</li>
         * <li>ServerIdeCUMinSpec: Minimum guaranteed CUs for personal development environment, in CUs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSpec</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The list of metric data.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<ListResourceGroupMetricDataResponseBodyMetricDataMetrics> metrics;

        /**
         * <p>The pagination cursor.</p>
         * 
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
