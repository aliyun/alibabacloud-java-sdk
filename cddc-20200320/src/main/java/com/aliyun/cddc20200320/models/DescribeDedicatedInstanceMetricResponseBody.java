// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedInstanceMetricResponseBody extends TeaModel {
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Metrics")
    public DescribeDedicatedInstanceMetricResponseBodyMetrics metrics;

    public static DescribeDedicatedInstanceMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedInstanceMetricResponseBody self = new DescribeDedicatedInstanceMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedInstanceMetricResponseBody setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public DescribeDedicatedInstanceMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedInstanceMetricResponseBody setMetrics(DescribeDedicatedInstanceMetricResponseBodyMetrics metrics) {
        this.metrics = metrics;
        return this;
    }
    public DescribeDedicatedInstanceMetricResponseBodyMetrics getMetrics() {
        return this.metrics;
    }

    public static class DescribeDedicatedInstanceMetricResponseBodyMetricsMetricsRisks extends TeaModel {
        @NameInMap("Risks")
        public java.util.List<String> risks;

        public static DescribeDedicatedInstanceMetricResponseBodyMetricsMetricsRisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedInstanceMetricResponseBodyMetricsMetricsRisks self = new DescribeDedicatedInstanceMetricResponseBodyMetricsMetricsRisks();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetricsRisks setRisks(java.util.List<String> risks) {
            this.risks = risks;
            return this;
        }
        public java.util.List<String> getRisks() {
            return this.risks;
        }

    }

    public static class DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics extends TeaModel {
        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("MaxMemUsage")
        public Float maxMemUsage;

        @NameInMap("DedicatedInstanceId")
        public String dedicatedInstanceId;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("DiskUsage")
        public Float diskUsage;

        @NameInMap("AvgMemUsage")
        public Float avgMemUsage;

        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        @NameInMap("Memory")
        public Float memory;

        @NameInMap("AvgCpuUsage")
        public Float avgCpuUsage;

        @NameInMap("AvgIOPS")
        public Integer avgIOPS;

        @NameInMap("Role")
        public String role;

        @NameInMap("MaxCpuUsage")
        public Float maxCpuUsage;

        @NameInMap("Risks")
        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetricsRisks risks;

        public static DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics self = new DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics setMaxMemUsage(Float maxMemUsage) {
            this.maxMemUsage = maxMemUsage;
            return this;
        }
        public Float getMaxMemUsage() {
            return this.maxMemUsage;
        }

        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics setDedicatedInstanceId(String dedicatedInstanceId) {
            this.dedicatedInstanceId = dedicatedInstanceId;
            return this;
        }
        public String getDedicatedInstanceId() {
            return this.dedicatedInstanceId;
        }

        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics setDiskUsage(Float diskUsage) {
            this.diskUsage = diskUsage;
            return this;
        }
        public Float getDiskUsage() {
            return this.diskUsage;
        }

        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics setAvgMemUsage(Float avgMemUsage) {
            this.avgMemUsage = avgMemUsage;
            return this;
        }
        public Float getAvgMemUsage() {
            return this.avgMemUsage;
        }

        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics setAvgCpuUsage(Float avgCpuUsage) {
            this.avgCpuUsage = avgCpuUsage;
            return this;
        }
        public Float getAvgCpuUsage() {
            return this.avgCpuUsage;
        }

        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics setAvgIOPS(Integer avgIOPS) {
            this.avgIOPS = avgIOPS;
            return this;
        }
        public Integer getAvgIOPS() {
            return this.avgIOPS;
        }

        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics setMaxCpuUsage(Float maxCpuUsage) {
            this.maxCpuUsage = maxCpuUsage;
            return this;
        }
        public Float getMaxCpuUsage() {
            return this.maxCpuUsage;
        }

        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics setRisks(DescribeDedicatedInstanceMetricResponseBodyMetricsMetricsRisks risks) {
            this.risks = risks;
            return this;
        }
        public DescribeDedicatedInstanceMetricResponseBodyMetricsMetricsRisks getRisks() {
            return this.risks;
        }

    }

    public static class DescribeDedicatedInstanceMetricResponseBodyMetrics extends TeaModel {
        @NameInMap("Metrics")
        public java.util.List<DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics> metrics;

        public static DescribeDedicatedInstanceMetricResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedInstanceMetricResponseBodyMetrics self = new DescribeDedicatedInstanceMetricResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedInstanceMetricResponseBodyMetrics setMetrics(java.util.List<DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<DescribeDedicatedInstanceMetricResponseBodyMetricsMetrics> getMetrics() {
            return this.metrics;
        }

    }

}
