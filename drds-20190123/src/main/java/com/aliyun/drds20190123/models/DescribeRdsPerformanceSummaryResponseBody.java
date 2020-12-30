// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsPerformanceSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RdsPerformanceInfos")
    public java.util.List<DescribeRdsPerformanceSummaryResponseBodyRdsPerformanceInfos> rdsPerformanceInfos;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeRdsPerformanceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsPerformanceSummaryResponseBody self = new DescribeRdsPerformanceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsPerformanceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsPerformanceSummaryResponseBody setRdsPerformanceInfos(java.util.List<DescribeRdsPerformanceSummaryResponseBodyRdsPerformanceInfos> rdsPerformanceInfos) {
        this.rdsPerformanceInfos = rdsPerformanceInfos;
        return this;
    }
    public java.util.List<DescribeRdsPerformanceSummaryResponseBodyRdsPerformanceInfos> getRdsPerformanceInfos() {
        return this.rdsPerformanceInfos;
    }

    public DescribeRdsPerformanceSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRdsPerformanceSummaryResponseBodyRdsPerformanceInfos extends TeaModel {
        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("ActiveSessions")
        public Integer activeSessions;

        @NameInMap("TotalSessions")
        public Integer totalSessions;

        @NameInMap("RdsId")
        public String rdsId;

        @NameInMap("Iops")
        public Float iops;

        @NameInMap("SpaceUsage")
        public Long spaceUsage;

        public static DescribeRdsPerformanceSummaryResponseBodyRdsPerformanceInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsPerformanceSummaryResponseBodyRdsPerformanceInfos self = new DescribeRdsPerformanceSummaryResponseBodyRdsPerformanceInfos();
            return TeaModel.build(map, self);
        }

        public DescribeRdsPerformanceSummaryResponseBodyRdsPerformanceInfos setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeRdsPerformanceSummaryResponseBodyRdsPerformanceInfos setActiveSessions(Integer activeSessions) {
            this.activeSessions = activeSessions;
            return this;
        }
        public Integer getActiveSessions() {
            return this.activeSessions;
        }

        public DescribeRdsPerformanceSummaryResponseBodyRdsPerformanceInfos setTotalSessions(Integer totalSessions) {
            this.totalSessions = totalSessions;
            return this;
        }
        public Integer getTotalSessions() {
            return this.totalSessions;
        }

        public DescribeRdsPerformanceSummaryResponseBodyRdsPerformanceInfos setRdsId(String rdsId) {
            this.rdsId = rdsId;
            return this;
        }
        public String getRdsId() {
            return this.rdsId;
        }

        public DescribeRdsPerformanceSummaryResponseBodyRdsPerformanceInfos setIops(Float iops) {
            this.iops = iops;
            return this;
        }
        public Float getIops() {
            return this.iops;
        }

        public DescribeRdsPerformanceSummaryResponseBodyRdsPerformanceInfos setSpaceUsage(Long spaceUsage) {
            this.spaceUsage = spaceUsage;
            return this;
        }
        public Long getSpaceUsage() {
            return this.spaceUsage;
        }

    }

}
