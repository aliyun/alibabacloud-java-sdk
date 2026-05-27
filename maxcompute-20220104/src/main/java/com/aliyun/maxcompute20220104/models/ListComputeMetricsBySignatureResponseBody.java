// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListComputeMetricsBySignatureResponseBody extends TeaModel {
    @NameInMap("data")
    public ListComputeMetricsBySignatureResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <strong>example:</strong>
     * <p>0adbef0f17600626304764284d0001</p>
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
         * <strong>example:</strong>
         * <p>1770886999000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>20250910185415772gu7vl8vwk22</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1762946698000</p>
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
        @NameInMap("instances")
        public java.util.List<ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetricsInstances> instances;

        @NameInMap("projectNames")
        public java.util.List<String> projectNames;

        /**
         * <strong>example:</strong>
         * <p>oC0HkG5aTRscH3BDrttrLwHf8XA=</p>
         */
        @NameInMap("signature")
        public String signature;

        /**
         * <strong>example:</strong>
         * <p>GBCplx</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>100</p>
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("signatureComputeMetrics")
        public java.util.List<ListComputeMetricsBySignatureResponseBodyDataSignatureComputeMetrics> signatureComputeMetrics;

        /**
         * <strong>example:</strong>
         * <p>57</p>
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
