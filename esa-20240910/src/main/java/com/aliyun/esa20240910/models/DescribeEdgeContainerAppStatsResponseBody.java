// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeEdgeContainerAppStatsResponseBody extends TeaModel {
    @NameInMap("CpuUsageSecondsQuotaRateAvg")
    public Double cpuUsageSecondsQuotaRateAvg;

    @NameInMap("CpuUsageSecondsTotalAvg")
    public Double cpuUsageSecondsTotalAvg;

    @NameInMap("FsReadsBytesAvgAvg")
    public Double fsReadsBytesAvgAvg;

    @NameInMap("FsWritesBytesAvgAvg")
    public Double fsWritesBytesAvgAvg;

    @NameInMap("MemoryRssAvg")
    public Double memoryRssAvg;

    @NameInMap("MemoryRssQuotaRateAvg")
    public Double memoryRssQuotaRateAvg;

    @NameInMap("PodReadyRateAvg")
    public Double podReadyRateAvg;

    @NameInMap("Points")
    public java.util.List<DescribeEdgeContainerAppStatsResponseBodyPoints> points;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>35C66C7B-671H-4297-9187-2C4477247A78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEdgeContainerAppStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeContainerAppStatsResponseBody self = new DescribeEdgeContainerAppStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeContainerAppStatsResponseBody setCpuUsageSecondsQuotaRateAvg(Double cpuUsageSecondsQuotaRateAvg) {
        this.cpuUsageSecondsQuotaRateAvg = cpuUsageSecondsQuotaRateAvg;
        return this;
    }
    public Double getCpuUsageSecondsQuotaRateAvg() {
        return this.cpuUsageSecondsQuotaRateAvg;
    }

    public DescribeEdgeContainerAppStatsResponseBody setCpuUsageSecondsTotalAvg(Double cpuUsageSecondsTotalAvg) {
        this.cpuUsageSecondsTotalAvg = cpuUsageSecondsTotalAvg;
        return this;
    }
    public Double getCpuUsageSecondsTotalAvg() {
        return this.cpuUsageSecondsTotalAvg;
    }

    public DescribeEdgeContainerAppStatsResponseBody setFsReadsBytesAvgAvg(Double fsReadsBytesAvgAvg) {
        this.fsReadsBytesAvgAvg = fsReadsBytesAvgAvg;
        return this;
    }
    public Double getFsReadsBytesAvgAvg() {
        return this.fsReadsBytesAvgAvg;
    }

    public DescribeEdgeContainerAppStatsResponseBody setFsWritesBytesAvgAvg(Double fsWritesBytesAvgAvg) {
        this.fsWritesBytesAvgAvg = fsWritesBytesAvgAvg;
        return this;
    }
    public Double getFsWritesBytesAvgAvg() {
        return this.fsWritesBytesAvgAvg;
    }

    public DescribeEdgeContainerAppStatsResponseBody setMemoryRssAvg(Double memoryRssAvg) {
        this.memoryRssAvg = memoryRssAvg;
        return this;
    }
    public Double getMemoryRssAvg() {
        return this.memoryRssAvg;
    }

    public DescribeEdgeContainerAppStatsResponseBody setMemoryRssQuotaRateAvg(Double memoryRssQuotaRateAvg) {
        this.memoryRssQuotaRateAvg = memoryRssQuotaRateAvg;
        return this;
    }
    public Double getMemoryRssQuotaRateAvg() {
        return this.memoryRssQuotaRateAvg;
    }

    public DescribeEdgeContainerAppStatsResponseBody setPodReadyRateAvg(Double podReadyRateAvg) {
        this.podReadyRateAvg = podReadyRateAvg;
        return this;
    }
    public Double getPodReadyRateAvg() {
        return this.podReadyRateAvg;
    }

    public DescribeEdgeContainerAppStatsResponseBody setPoints(java.util.List<DescribeEdgeContainerAppStatsResponseBodyPoints> points) {
        this.points = points;
        return this;
    }
    public java.util.List<DescribeEdgeContainerAppStatsResponseBodyPoints> getPoints() {
        return this.points;
    }

    public DescribeEdgeContainerAppStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEdgeContainerAppStatsResponseBodyPoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("ContainerCpuUsageSecondsQuotaRate")
        public Double containerCpuUsageSecondsQuotaRate;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ContainerCpuUsageSecondsTotal")
        public Double containerCpuUsageSecondsTotal;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ContainerFsReadsBytesAvg")
        public Double containerFsReadsBytesAvg;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ContainerFsWritesBytesAvg")
        public Double containerFsWritesBytesAvg;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("ContainerMemoryRss")
        public Double containerMemoryRss;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ContainerMemoryRssQuotaRate")
        public Double containerMemoryRssQuotaRate;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PodReadyRate")
        public Double podReadyRate;

        /**
         * <strong>example:</strong>
         * <p>2024-01-18T15:04:05Z</p>
         */
        @NameInMap("Time")
        public String time;

        public static DescribeEdgeContainerAppStatsResponseBodyPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeEdgeContainerAppStatsResponseBodyPoints self = new DescribeEdgeContainerAppStatsResponseBodyPoints();
            return TeaModel.build(map, self);
        }

        public DescribeEdgeContainerAppStatsResponseBodyPoints setContainerCpuUsageSecondsQuotaRate(Double containerCpuUsageSecondsQuotaRate) {
            this.containerCpuUsageSecondsQuotaRate = containerCpuUsageSecondsQuotaRate;
            return this;
        }
        public Double getContainerCpuUsageSecondsQuotaRate() {
            return this.containerCpuUsageSecondsQuotaRate;
        }

        public DescribeEdgeContainerAppStatsResponseBodyPoints setContainerCpuUsageSecondsTotal(Double containerCpuUsageSecondsTotal) {
            this.containerCpuUsageSecondsTotal = containerCpuUsageSecondsTotal;
            return this;
        }
        public Double getContainerCpuUsageSecondsTotal() {
            return this.containerCpuUsageSecondsTotal;
        }

        public DescribeEdgeContainerAppStatsResponseBodyPoints setContainerFsReadsBytesAvg(Double containerFsReadsBytesAvg) {
            this.containerFsReadsBytesAvg = containerFsReadsBytesAvg;
            return this;
        }
        public Double getContainerFsReadsBytesAvg() {
            return this.containerFsReadsBytesAvg;
        }

        public DescribeEdgeContainerAppStatsResponseBodyPoints setContainerFsWritesBytesAvg(Double containerFsWritesBytesAvg) {
            this.containerFsWritesBytesAvg = containerFsWritesBytesAvg;
            return this;
        }
        public Double getContainerFsWritesBytesAvg() {
            return this.containerFsWritesBytesAvg;
        }

        public DescribeEdgeContainerAppStatsResponseBodyPoints setContainerMemoryRss(Double containerMemoryRss) {
            this.containerMemoryRss = containerMemoryRss;
            return this;
        }
        public Double getContainerMemoryRss() {
            return this.containerMemoryRss;
        }

        public DescribeEdgeContainerAppStatsResponseBodyPoints setContainerMemoryRssQuotaRate(Double containerMemoryRssQuotaRate) {
            this.containerMemoryRssQuotaRate = containerMemoryRssQuotaRate;
            return this;
        }
        public Double getContainerMemoryRssQuotaRate() {
            return this.containerMemoryRssQuotaRate;
        }

        public DescribeEdgeContainerAppStatsResponseBodyPoints setPodReadyRate(Double podReadyRate) {
            this.podReadyRate = podReadyRate;
            return this;
        }
        public Double getPodReadyRate() {
            return this.podReadyRate;
        }

        public DescribeEdgeContainerAppStatsResponseBodyPoints setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
