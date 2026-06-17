// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetTrafficTrendResponseBody extends TeaModel {
    /**
     * <p>The average inbound network throughput. Unit: bps.</p>
     * 
     * <strong>example:</strong>
     * <p>6114152</p>
     */
    @NameInMap("AvgInBps")
    public Long avgInBps;

    /**
     * <p>The average outbound network throughput. Unit: bps.</p>
     * 
     * <strong>example:</strong>
     * <p>70148993</p>
     */
    @NameInMap("AvgOutBps")
    public Long avgOutBps;

    /**
     * <p>The average number of requests.</p>
     * 
     * <strong>example:</strong>
     * <p>79013</p>
     */
    @NameInMap("AvgSession")
    public Long avgSession;

    /**
     * <p>The average total network throughput for inbound and outbound traffic. Unit: bps.</p>
     * 
     * <strong>example:</strong>
     * <p>2306</p>
     */
    @NameInMap("AvgTotalBps")
    public Long avgTotalBps;

    /**
     * <p>A list of traffic statistics.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeInternetTrafficTrendResponseBodyDataList> dataList;

    /**
     * <p>The UNIX timestamp when the peak bandwidth was reached. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1672736400</p>
     */
    @NameInMap("MaxBandwidthTime")
    public Long maxBandwidthTime;

    /**
     * <p>The peak daily excess traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>873</p>
     */
    @NameInMap("MaxDayExceedBytes")
    public Long maxDayExceedBytes;

    /**
     * <p>The peak inbound network throughput. Unit: bps.</p>
     * 
     * <strong>example:</strong>
     * <p>10275643</p>
     */
    @NameInMap("MaxInBps")
    public Long maxInBps;

    /**
     * <p>The peak outbound network throughput. Unit: bps.</p>
     * 
     * <strong>example:</strong>
     * <p>395188</p>
     */
    @NameInMap("MaxOutBps")
    public Long maxOutBps;

    /**
     * <p>The peak number of requests.</p>
     * 
     * <strong>example:</strong>
     * <p>931641</p>
     */
    @NameInMap("MaxSession")
    public Long maxSession;

    /**
     * <p>The peak total network throughput for inbound and outbound traffic. Unit: bps.</p>
     * 
     * <strong>example:</strong>
     * <p>89783147</p>
     */
    @NameInMap("MaxTotalBps")
    public Long maxTotalBps;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C7E837BE-0379-565E-B7B4-DE595C8D337C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total inbound and outbound traffic. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>963227674958</p>
     */
    @NameInMap("TotalBytes")
    public Long totalBytes;

    /**
     * <p>The total excess traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>4243873</p>
     */
    @NameInMap("TotalExceedBytes")
    public Long totalExceedBytes;

    /**
     * <p>The total inbound traffic. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>41536824243873</p>
     */
    @NameInMap("TotalInBytes")
    public Long totalInBytes;

    /**
     * <p>The total outbound traffic. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>2660894567178</p>
     */
    @NameInMap("TotalOutBytes")
    public Long totalOutBytes;

    /**
     * <p>The total number of requests.</p>
     * 
     * <strong>example:</strong>
     * <p>1061449</p>
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

    public DescribeInternetTrafficTrendResponseBody setMaxDayExceedBytes(Long maxDayExceedBytes) {
        this.maxDayExceedBytes = maxDayExceedBytes;
        return this;
    }
    public Long getMaxDayExceedBytes() {
        return this.maxDayExceedBytes;
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

    public DescribeInternetTrafficTrendResponseBody setTotalExceedBytes(Long totalExceedBytes) {
        this.totalExceedBytes = totalExceedBytes;
        return this;
    }
    public Long getTotalExceedBytes() {
        return this.totalExceedBytes;
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
         * <p>The inbound network throughput. Unit: bps.</p>
         * 
         * <strong>example:</strong>
         * <p>187</p>
         */
        @NameInMap("InBps")
        public Long inBps;

        /**
         * <p>The inbound traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>235</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <p>The inbound packet rate. Unit: pps.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InPps")
        public Long inPps;

        /**
         * <p>The number of new connections.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("NewConn")
        public Long newConn;

        /**
         * <p>The outbound network throughput. Unit: bps.</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        @NameInMap("OutBps")
        public Long outBps;

        /**
         * <p>The outbound traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1123</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <p>The outbound packet rate. Unit: pps.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OutPps")
        public Long outPps;

        /**
         * <p>The number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <p>The time when the traffic was recorded. This value is a UNIX timestamp in seconds.</p>
         * <p>If data for this time point has not been processed, the values of other fields are -1.</p>
         * 
         * <strong>example:</strong>
         * <p>1659405600</p>
         */
        @NameInMap("Time")
        public Integer time;

        /**
         * <p>The total inbound and outbound network throughput. Unit: bps.</p>
         * 
         * <strong>example:</strong>
         * <p>232</p>
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
