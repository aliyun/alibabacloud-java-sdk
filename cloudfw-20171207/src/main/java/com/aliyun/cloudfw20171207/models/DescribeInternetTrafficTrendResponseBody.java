// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetTrafficTrendResponseBody extends TeaModel {
    @NameInMap("AvgInBps")
    public Long avgInBps;

    @NameInMap("AvgOutBps")
    public Long avgOutBps;

    @NameInMap("AvgSession")
    public Long avgSession;

    @NameInMap("AvgTotalBps")
    public Long avgTotalBps;

    @NameInMap("DataList")
    public java.util.List<DescribeInternetTrafficTrendResponseBodyDataList> dataList;

    @NameInMap("MaxBandwidthTime")
    public Long maxBandwidthTime;

    @NameInMap("MaxInBps")
    public Long maxInBps;

    @NameInMap("MaxOutBps")
    public Long maxOutBps;

    @NameInMap("MaxSession")
    public Long maxSession;

    @NameInMap("MaxTotalBps")
    public Long maxTotalBps;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalBytes")
    public Long totalBytes;

    @NameInMap("TotalInBytes")
    public Long totalInBytes;

    @NameInMap("TotalOutBytes")
    public Long totalOutBytes;

    @NameInMap("TotalSession")
    public Long totalSession;

    public static DescribeInternetTrafficTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetTrafficTrendResponseBody self = new DescribeInternetTrafficTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInternetTrafficTrendResponseBody setAvgInBps(Long avgInBps) {
        this.avgInBps = avgInBps;
        return this;
    }
    public Long getAvgInBps() {
        return this.avgInBps;
    }

    public DescribeInternetTrafficTrendResponseBody setAvgOutBps(Long avgOutBps) {
        this.avgOutBps = avgOutBps;
        return this;
    }
    public Long getAvgOutBps() {
        return this.avgOutBps;
    }

    public DescribeInternetTrafficTrendResponseBody setAvgSession(Long avgSession) {
        this.avgSession = avgSession;
        return this;
    }
    public Long getAvgSession() {
        return this.avgSession;
    }

    public DescribeInternetTrafficTrendResponseBody setAvgTotalBps(Long avgTotalBps) {
        this.avgTotalBps = avgTotalBps;
        return this;
    }
    public Long getAvgTotalBps() {
        return this.avgTotalBps;
    }

    public DescribeInternetTrafficTrendResponseBody setDataList(java.util.List<DescribeInternetTrafficTrendResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeInternetTrafficTrendResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeInternetTrafficTrendResponseBody setMaxBandwidthTime(Long maxBandwidthTime) {
        this.maxBandwidthTime = maxBandwidthTime;
        return this;
    }
    public Long getMaxBandwidthTime() {
        return this.maxBandwidthTime;
    }

    public DescribeInternetTrafficTrendResponseBody setMaxInBps(Long maxInBps) {
        this.maxInBps = maxInBps;
        return this;
    }
    public Long getMaxInBps() {
        return this.maxInBps;
    }

    public DescribeInternetTrafficTrendResponseBody setMaxOutBps(Long maxOutBps) {
        this.maxOutBps = maxOutBps;
        return this;
    }
    public Long getMaxOutBps() {
        return this.maxOutBps;
    }

    public DescribeInternetTrafficTrendResponseBody setMaxSession(Long maxSession) {
        this.maxSession = maxSession;
        return this;
    }
    public Long getMaxSession() {
        return this.maxSession;
    }

    public DescribeInternetTrafficTrendResponseBody setMaxTotalBps(Long maxTotalBps) {
        this.maxTotalBps = maxTotalBps;
        return this;
    }
    public Long getMaxTotalBps() {
        return this.maxTotalBps;
    }

    public DescribeInternetTrafficTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInternetTrafficTrendResponseBody setTotalBytes(Long totalBytes) {
        this.totalBytes = totalBytes;
        return this;
    }
    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public DescribeInternetTrafficTrendResponseBody setTotalInBytes(Long totalInBytes) {
        this.totalInBytes = totalInBytes;
        return this;
    }
    public Long getTotalInBytes() {
        return this.totalInBytes;
    }

    public DescribeInternetTrafficTrendResponseBody setTotalOutBytes(Long totalOutBytes) {
        this.totalOutBytes = totalOutBytes;
        return this;
    }
    public Long getTotalOutBytes() {
        return this.totalOutBytes;
    }

    public DescribeInternetTrafficTrendResponseBody setTotalSession(Long totalSession) {
        this.totalSession = totalSession;
        return this;
    }
    public Long getTotalSession() {
        return this.totalSession;
    }

    public static class DescribeInternetTrafficTrendResponseBodyDataList extends TeaModel {
        @NameInMap("InBps")
        public Long inBps;

        @NameInMap("InBytes")
        public Long inBytes;

        @NameInMap("InPps")
        public Long inPps;

        @NameInMap("NewConn")
        public Long newConn;

        @NameInMap("OutBps")
        public Long outBps;

        @NameInMap("OutBytes")
        public Long outBytes;

        @NameInMap("OutPps")
        public Long outPps;

        @NameInMap("SessionCount")
        public Long sessionCount;

        @NameInMap("Time")
        public Integer time;

        @NameInMap("TotalBps")
        public Long totalBps;

        public static DescribeInternetTrafficTrendResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetTrafficTrendResponseBodyDataList self = new DescribeInternetTrafficTrendResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeInternetTrafficTrendResponseBodyDataList setInBps(Long inBps) {
            this.inBps = inBps;
            return this;
        }
        public Long getInBps() {
            return this.inBps;
        }

        public DescribeInternetTrafficTrendResponseBodyDataList setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribeInternetTrafficTrendResponseBodyDataList setInPps(Long inPps) {
            this.inPps = inPps;
            return this;
        }
        public Long getInPps() {
            return this.inPps;
        }

        public DescribeInternetTrafficTrendResponseBodyDataList setNewConn(Long newConn) {
            this.newConn = newConn;
            return this;
        }
        public Long getNewConn() {
            return this.newConn;
        }

        public DescribeInternetTrafficTrendResponseBodyDataList setOutBps(Long outBps) {
            this.outBps = outBps;
            return this;
        }
        public Long getOutBps() {
            return this.outBps;
        }

        public DescribeInternetTrafficTrendResponseBodyDataList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeInternetTrafficTrendResponseBodyDataList setOutPps(Long outPps) {
            this.outPps = outPps;
            return this;
        }
        public Long getOutPps() {
            return this.outPps;
        }

        public DescribeInternetTrafficTrendResponseBodyDataList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeInternetTrafficTrendResponseBodyDataList setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

        public DescribeInternetTrafficTrendResponseBodyDataList setTotalBps(Long totalBps) {
            this.totalBps = totalBps;
            return this;
        }
        public Long getTotalBps() {
            return this.totalBps;
        }

    }

}
