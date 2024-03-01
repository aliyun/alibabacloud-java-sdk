// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetTrafficTrendResponseBody extends TeaModel {
    /**
     * <p>The average inbound network throughput, which indicates the average number of bits that are sent inbound per second. Unit: bit/s.</p>
     */
    @NameInMap("AvgInBps")
    public Long avgInBps;

    /**
     * <p>The average outbound network throughput, which indicates the average number of bits that are sent outbound per second. Unit: bit/s.</p>
     */
    @NameInMap("AvgOutBps")
    public Long avgOutBps;

    /**
     * <p>The average number of requests.</p>
     */
    @NameInMap("AvgSession")
    public Long avgSession;

    /**
     * <p>The total average inbound and outbound network throughput, which indicates the average number of bits that are sent inbound and outbound per second. Unit: bit/s.</p>
     */
    @NameInMap("AvgTotalBps")
    public Long avgTotalBps;

    /**
     * <p>The statistics on traffic.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeInternetTrafficTrendResponseBodyDataList> dataList;

    /**
     * <p>The timestamp generated when the bandwidth reaches the peak value. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("MaxBandwidthTime")
    public Long maxBandwidthTime;

    /**
     * <p>The maximum inbound network throughput, which indicates the maximum number of bits that are sent inbound per second. Unit: bit/s.</p>
     */
    @NameInMap("MaxInBps")
    public Long maxInBps;

    /**
     * <p>The maximum outbound network throughput, which indicates the maximum number of bits that are sent outbound per second. Unit: bit/s.</p>
     */
    @NameInMap("MaxOutBps")
    public Long maxOutBps;

    /**
     * <p>The number of requests during the peak hour of the network throughout.</p>
     */
    @NameInMap("MaxSession")
    public Long maxSession;

    /**
     * <p>The total maximum inbound and outbound network throughput, which indicates the maximum number of bits that are sent inbound and outbound per second. Unit: bit/s.</p>
     */
    @NameInMap("MaxTotalBps")
    public Long maxTotalBps;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total inbound and outbound network throughput, which indicates the total number of bytes that are sent inbound and outbound. Unit: bytes.</p>
     */
    @NameInMap("TotalBytes")
    public Long totalBytes;

    /**
     * <p>The inbound network throughput, which indicates the total number of bytes that are sent inbound. Unit: bytes.</p>
     */
    @NameInMap("TotalInBytes")
    public Long totalInBytes;

    /**
     * <p>The outbound network throughput, which indicates the total number of bytes that are sent outbound. Unit: bytes.</p>
     */
    @NameInMap("TotalOutBytes")
    public Long totalOutBytes;

    /**
     * <p>The total number of requests.</p>
     */
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
        /**
         * <p>The inbound network throughput, which indicates the number of bits that are sent inbound per second. Unit: bit/s.</p>
         */
        @NameInMap("InBps")
        public Long inBps;

        /**
         * <p>The inbound network throughput, which indicates the total number of bytes that are sent inbound. Unit: bytes.</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <p>The inbound network throughput, which indicates the number of packets that are sent inbound per second. Unit: packets per second (pps).</p>
         */
        @NameInMap("InPps")
        public Long inPps;

        /**
         * <p>The number of new connections.</p>
         */
        @NameInMap("NewConn")
        public Long newConn;

        /**
         * <p>The outbound network throughput, which indicates the number of bits that are sent inbound per second. Unit: bit/s.</p>
         */
        @NameInMap("OutBps")
        public Long outBps;

        /**
         * <p>The outbound network throughput, which indicates the total number of bytes that are sent outbound. Unit: bytes.</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <p>The outbound network throughput, which indicates the number of packets that are sent outbound per second. Unit: pps.</p>
         */
        @NameInMap("OutPps")
        public Long outPps;

        /**
         * <p>The number of requests.</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <p>The time when traffic is generated. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("Time")
        public Integer time;

        /**
         * <p>The total outbound and inbound network throughput, which indicates the total number of bits that are sent inbound and outbound per second. Unit: bit/s.</p>
         */
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
