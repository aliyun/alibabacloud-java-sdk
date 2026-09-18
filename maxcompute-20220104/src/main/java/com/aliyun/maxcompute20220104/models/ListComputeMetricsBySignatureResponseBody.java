// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListComputeMetricsBySignatureResponseBody extends TeaModel {
    /**
     * <p>The data payload of the response.</p>
     */
    @NameInMap("data")
    public ListComputeMetricsBySignatureResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li><p><code>1xx</code>: Informational - The server has received the request and is processing it.</p>
     * </li>
     * <li><p><code>2xx</code>: Success - The server successfully received, understood, and accepted the request.</p>
     * </li>
     * <li><p><code>3xx</code>: Redirection - Further action is required to complete the request.</p>
     * </li>
     * <li><p><code>4xx</code>: Client Error - The request contains invalid syntax or cannot be fulfilled.</p>
     * </li>
     * <li><p><code>5xx</code>: Server Error - The server failed to fulfill a valid request.</p>
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
     * <p>0a06dc0a17495216593736061e45a3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListComputeMetricsBySignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComputeMetricsBySignatureResponseBody self = new ListComputeMetricsBySignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComputeMetricsBySignatureResponseBody setData(ListComputeMetricsBySignatureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListComputeMetricsBySignatureResponseBodyData getData() {
        return this.data;
    }

    public ListComputeMetricsBySignatureResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListComputeMetricsBySignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetricsInstances extends TeaModel {
        /**
         * <p>The end time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1766780295000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20260124052241299gdxd3wveqsj</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The start time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1765765291000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        public static ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetricsInstances build(java.util.Map<String, ?> map) throws Exception {
            ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetricsInstances self = new ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetricsInstances();
            return TeaModel.build(map, self);
        }

        public ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetricsInstances setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetricsInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetricsInstances setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetrics extends TeaModel {
        /**
         * <p>A list of instances.</p>
         */
        @NameInMap("instances")
        public java.util.List<ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetricsInstances> instances;

        /**
         * <p>A list of project names.</p>
         */
        @NameInMap("projectNames")
        public java.util.List<String> projectNames;

        /**
         * <p>The signature of the SQL job.</p>
         * 
         * <strong>example:</strong>
         * <p>YF3JMiEXEvZVmGzUXz6G4MtWVJk=</p>
         */
        @NameInMap("signature")
        public String signature;

        /**
         * <p>The unit of compute usage.</p>
         * 
         * <strong>example:</strong>
         * <p>GBCplx</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <p>The compute usage.</p>
         * 
         * <strong>example:</strong>
         * <p>32.67767215706408</p>
         */
        @NameInMap("usage")
        public Double usage;

        public static ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetrics self = new ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetrics();
            return TeaModel.build(map, self);
        }

        public ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetrics setInstances(java.util.List<ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetricsInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetricsInstances> getInstances() {
            return this.instances;
        }

        public ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetrics setProjectNames(java.util.List<String> projectNames) {
            this.projectNames = projectNames;
            return this;
        }
        public java.util.List<String> getProjectNames() {
            return this.projectNames;
        }

        public ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetrics setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetrics setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetrics setUsage(Double usage) {
            this.usage = usage;
            return this;
        }
        public Double getUsage() {
            return this.usage;
        }

    }

    public static class ListComputeMetricsBySignatureResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>An array containing the compute metrics for each signature.</p>
         */
        @NameInMap("signatureComputeMetrics")
        public java.util.List<ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetrics> signatureComputeMetrics;

        /**
         * <p>The total number of entries that match the query.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListComputeMetricsBySignatureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListComputeMetricsBySignatureResponseBodyData self = new ListComputeMetricsBySignatureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListComputeMetricsBySignatureResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListComputeMetricsBySignatureResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListComputeMetricsBySignatureResponseBodyData setSignatureComputeMetrics(java.util.List<ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetrics> signatureComputeMetrics) {
            this.signatureComputeMetrics = signatureComputeMetrics;
            return this;
        }
        public java.util.List<ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetrics> getSignatureComputeMetrics() {
            return this.signatureComputeMetrics;
        }

        public ListComputeMetricsBySignatureResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
