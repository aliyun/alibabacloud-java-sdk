// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostMetricResponseBody extends TeaModel {
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Metrics")
    public DescribeDedicatedHostMetricResponseBodyMetrics metrics;

    public static DescribeDedicatedHostMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostMetricResponseBody self = new DescribeDedicatedHostMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostMetricResponseBody setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeDedicatedHostMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostMetricResponseBody setMetrics(DescribeDedicatedHostMetricResponseBodyMetrics metrics) {
        this.metrics = metrics;
        return this;
    }
    public DescribeDedicatedHostMetricResponseBodyMetrics getMetrics() {
        return this.metrics;
    }

    public static class DescribeDedicatedHostMetricResponseBodyMetricsMetricsRisks extends TeaModel {
        @NameInMap("Risks")
        public java.util.List<String> risks;

        public static DescribeDedicatedHostMetricResponseBodyMetricsMetricsRisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostMetricResponseBodyMetricsMetricsRisks self = new DescribeDedicatedHostMetricResponseBodyMetricsMetricsRisks();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostMetricResponseBodyMetricsMetricsRisks setRisks(java.util.List<String> risks) {
            this.risks = risks;
            return this;
        }
        public java.util.List<String> getRisks() {
            return this.risks;
        }

    }

    public static class DescribeDedicatedHostMetricResponseBodyMetricsMetrics extends TeaModel {
        @NameInMap("AvgMemUsage")
        public Float avgMemUsage;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("AvgIops")
        public Integer avgIops;

        @NameInMap("MaxMemUsage")
        public Float maxMemUsage;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        @NameInMap("MaxIops")
        public Integer maxIops;

        @NameInMap("AvgCpuUsage")
        public Float avgCpuUsage;

        @NameInMap("DiskUsage")
        public Float diskUsage;

        @NameInMap("MaxCpuUsage")
        public Float maxCpuUsage;

        @NameInMap("Risks")
        public DescribeDedicatedHostMetricResponseBodyMetricsMetricsRisks risks;

        public static DescribeDedicatedHostMetricResponseBodyMetricsMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostMetricResponseBodyMetricsMetrics self = new DescribeDedicatedHostMetricResponseBodyMetricsMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostMetricResponseBodyMetricsMetrics setAvgMemUsage(Float avgMemUsage) {
            this.avgMemUsage = avgMemUsage;
            return this;
        }
        public Float getAvgMemUsage() {
            return this.avgMemUsage;
        }

        public DescribeDedicatedHostMetricResponseBodyMetricsMetrics setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeDedicatedHostMetricResponseBodyMetricsMetrics setAvgIops(Integer avgIops) {
            this.avgIops = avgIops;
            return this;
        }
        public Integer getAvgIops() {
            return this.avgIops;
        }

        public DescribeDedicatedHostMetricResponseBodyMetricsMetrics setMaxMemUsage(Float maxMemUsage) {
            this.maxMemUsage = maxMemUsage;
            return this;
        }
        public Float getMaxMemUsage() {
            return this.maxMemUsage;
        }

        public DescribeDedicatedHostMetricResponseBodyMetricsMetrics setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public DescribeDedicatedHostMetricResponseBodyMetricsMetrics setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeDedicatedHostMetricResponseBodyMetricsMetrics setMaxIops(Integer maxIops) {
            this.maxIops = maxIops;
            return this;
        }
        public Integer getMaxIops() {
            return this.maxIops;
        }

        public DescribeDedicatedHostMetricResponseBodyMetricsMetrics setAvgCpuUsage(Float avgCpuUsage) {
            this.avgCpuUsage = avgCpuUsage;
            return this;
        }
        public Float getAvgCpuUsage() {
            return this.avgCpuUsage;
        }

        public DescribeDedicatedHostMetricResponseBodyMetricsMetrics setDiskUsage(Float diskUsage) {
            this.diskUsage = diskUsage;
            return this;
        }
        public Float getDiskUsage() {
            return this.diskUsage;
        }

        public DescribeDedicatedHostMetricResponseBodyMetricsMetrics setMaxCpuUsage(Float maxCpuUsage) {
            this.maxCpuUsage = maxCpuUsage;
            return this;
        }
        public Float getMaxCpuUsage() {
            return this.maxCpuUsage;
        }

        public DescribeDedicatedHostMetricResponseBodyMetricsMetrics setRisks(DescribeDedicatedHostMetricResponseBodyMetricsMetricsRisks risks) {
            this.risks = risks;
            return this;
        }
        public DescribeDedicatedHostMetricResponseBodyMetricsMetricsRisks getRisks() {
            return this.risks;
        }

    }

    public static class DescribeDedicatedHostMetricResponseBodyMetrics extends TeaModel {
        @NameInMap("Metrics")
        public java.util.List<DescribeDedicatedHostMetricResponseBodyMetricsMetrics> metrics;

        public static DescribeDedicatedHostMetricResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostMetricResponseBodyMetrics self = new DescribeDedicatedHostMetricResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostMetricResponseBodyMetrics setMetrics(java.util.List<DescribeDedicatedHostMetricResponseBodyMetricsMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<DescribeDedicatedHostMetricResponseBodyMetricsMetrics> getMetrics() {
            return this.metrics;
        }

    }

}
