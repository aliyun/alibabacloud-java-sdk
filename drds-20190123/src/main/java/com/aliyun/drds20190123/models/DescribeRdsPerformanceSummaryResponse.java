// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsPerformanceSummaryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RdsPerformanceInfos")
    @Validation(required = true)
    public java.util.List<DescribeRdsPerformanceSummaryResponseRdsPerformanceInfos> rdsPerformanceInfos;

    public static DescribeRdsPerformanceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsPerformanceSummaryResponse self = new DescribeRdsPerformanceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsPerformanceSummaryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsPerformanceSummaryResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRdsPerformanceSummaryResponse setRdsPerformanceInfos(java.util.List<DescribeRdsPerformanceSummaryResponseRdsPerformanceInfos> rdsPerformanceInfos) {
        this.rdsPerformanceInfos = rdsPerformanceInfos;
        return this;
    }
    public java.util.List<DescribeRdsPerformanceSummaryResponseRdsPerformanceInfos> getRdsPerformanceInfos() {
        return this.rdsPerformanceInfos;
    }

    public static class DescribeRdsPerformanceSummaryResponseRdsPerformanceInfos extends TeaModel {
        @NameInMap("RdsId")
        @Validation(required = true)
        public String rdsId;

        @NameInMap("Cpu")
        @Validation(required = true)
        public Float cpu;

        @NameInMap("Iops")
        @Validation(required = true)
        public Float iops;

        @NameInMap("ActiveSessions")
        @Validation(required = true)
        public Integer activeSessions;

        @NameInMap("TotalSessions")
        @Validation(required = true)
        public Integer totalSessions;

        @NameInMap("SpaceUsage")
        @Validation(required = true)
        public Long spaceUsage;

        public static DescribeRdsPerformanceSummaryResponseRdsPerformanceInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsPerformanceSummaryResponseRdsPerformanceInfos self = new DescribeRdsPerformanceSummaryResponseRdsPerformanceInfos();
            return TeaModel.build(map, self);
        }

        public DescribeRdsPerformanceSummaryResponseRdsPerformanceInfos setRdsId(String rdsId) {
            this.rdsId = rdsId;
            return this;
        }
        public String getRdsId() {
            return this.rdsId;
        }

        public DescribeRdsPerformanceSummaryResponseRdsPerformanceInfos setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeRdsPerformanceSummaryResponseRdsPerformanceInfos setIops(Float iops) {
            this.iops = iops;
            return this;
        }
        public Float getIops() {
            return this.iops;
        }

        public DescribeRdsPerformanceSummaryResponseRdsPerformanceInfos setActiveSessions(Integer activeSessions) {
            this.activeSessions = activeSessions;
            return this;
        }
        public Integer getActiveSessions() {
            return this.activeSessions;
        }

        public DescribeRdsPerformanceSummaryResponseRdsPerformanceInfos setTotalSessions(Integer totalSessions) {
            this.totalSessions = totalSessions;
            return this;
        }
        public Integer getTotalSessions() {
            return this.totalSessions;
        }

        public DescribeRdsPerformanceSummaryResponseRdsPerformanceInfos setSpaceUsage(Long spaceUsage) {
            this.spaceUsage = spaceUsage;
            return this;
        }
        public Long getSpaceUsage() {
            return this.spaceUsage;
        }

    }

}
