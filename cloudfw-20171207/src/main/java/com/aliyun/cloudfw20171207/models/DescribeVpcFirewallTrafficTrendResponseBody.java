// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallTrafficTrendResponseBody extends TeaModel {
    /**
     * <p>The average inbound network throughput. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>1264110</p>
     */
    @NameInMap("AvgInBps")
    public Long avgInBps;

    /**
     * <p>The average outbound network throughput. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>68915</p>
     */
    @NameInMap("AvgOutBps")
    public Long avgOutBps;

    /**
     * <p>The average number of requests.</p>
     * 
     * <strong>example:</strong>
     * <p>1995</p>
     */
    @NameInMap("AvgSession")
    public Long avgSession;

    /**
     * <p>The average total network throughput in both the outbound and inbound directions. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>34291</p>
     */
    @NameInMap("AvgTotalBps")
    public Long avgTotalBps;

    /**
     * <p>The data list.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeVpcFirewallTrafficTrendResponseBodyDataList> dataList;

    /**
     * <p>The timestamp when the peak bandwidth occurred. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1768008060</p>
     */
    @NameInMap("MaxBandwidthTime")
    public Long maxBandwidthTime;

    /**
     * <p>The peak inbound network throughput. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>1436</p>
     */
    @NameInMap("MaxInBps")
    public Long maxInBps;

    /**
     * <p>The peak outbound network throughput. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>2128</p>
     */
    @NameInMap("MaxOutBps")
    public Long maxOutBps;

    /**
     * <p>The peak number of requests.</p>
     * 
     * <strong>example:</strong>
     * <p>2003</p>
     */
    @NameInMap("MaxSession")
    public Long maxSession;

    /**
     * <p>The peak total network throughput in both the outbound and inbound directions. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>61947852</p>
     */
    @NameInMap("MaxTotalBps")
    public Long maxTotalBps;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>45F8B9E6-8583-56B3-A127-1B421C9E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total traffic. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>141688156232</p>
     */
    @NameInMap("TotalBytes")
    public Long totalBytes;

    /**
     * <p>The total inbound network throughput. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>2659635037</p>
     */
    @NameInMap("TotalInBytes")
    public Long totalInBytes;

    /**
     * <p>The total outbound network throughput. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>399762701</p>
     */
    @NameInMap("TotalOutBytes")
    public Long totalOutBytes;

    /**
     * <p>The total number of requests.</p>
     * 
     * <strong>example:</strong>
     * <p>1078757</p>
     */
    @NameInMap("TotalSession")
    public Long totalSession;

    public static DescribeVpcFirewallTrafficTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallTrafficTrendResponseBody self = new DescribeVpcFirewallTrafficTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallTrafficTrendResponseBody setAvgInBps(Long avgInBps) {
        this.avgInBps = avgInBps;
        return this;
    }
    public Long getAvgInBps() {
        return this.avgInBps;
    }

    public DescribeVpcFirewallTrafficTrendResponseBody setAvgOutBps(Long avgOutBps) {
        this.avgOutBps = avgOutBps;
        return this;
    }
    public Long getAvgOutBps() {
        return this.avgOutBps;
    }

    public DescribeVpcFirewallTrafficTrendResponseBody setAvgSession(Long avgSession) {
        this.avgSession = avgSession;
        return this;
    }
    public Long getAvgSession() {
        return this.avgSession;
    }

    public DescribeVpcFirewallTrafficTrendResponseBody setAvgTotalBps(Long avgTotalBps) {
        this.avgTotalBps = avgTotalBps;
        return this;
    }
    public Long getAvgTotalBps() {
        return this.avgTotalBps;
    }

    public DescribeVpcFirewallTrafficTrendResponseBody setDataList(java.util.List<DescribeVpcFirewallTrafficTrendResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeVpcFirewallTrafficTrendResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeVpcFirewallTrafficTrendResponseBody setMaxBandwidthTime(Long maxBandwidthTime) {
        this.maxBandwidthTime = maxBandwidthTime;
        return this;
    }
    public Long getMaxBandwidthTime() {
        return this.maxBandwidthTime;
    }

    public DescribeVpcFirewallTrafficTrendResponseBody setMaxInBps(Long maxInBps) {
        this.maxInBps = maxInBps;
        return this;
    }
    public Long getMaxInBps() {
        return this.maxInBps;
    }

    public DescribeVpcFirewallTrafficTrendResponseBody setMaxOutBps(Long maxOutBps) {
        this.maxOutBps = maxOutBps;
        return this;
    }
    public Long getMaxOutBps() {
        return this.maxOutBps;
    }

    public DescribeVpcFirewallTrafficTrendResponseBody setMaxSession(Long maxSession) {
        this.maxSession = maxSession;
        return this;
    }
    public Long getMaxSession() {
        return this.maxSession;
    }

    public DescribeVpcFirewallTrafficTrendResponseBody setMaxTotalBps(Long maxTotalBps) {
        this.maxTotalBps = maxTotalBps;
        return this;
    }
    public Long getMaxTotalBps() {
        return this.maxTotalBps;
    }

    public DescribeVpcFirewallTrafficTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallTrafficTrendResponseBody setTotalBytes(Long totalBytes) {
        this.totalBytes = totalBytes;
        return this;
    }
    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public DescribeVpcFirewallTrafficTrendResponseBody setTotalInBytes(Long totalInBytes) {
        this.totalInBytes = totalInBytes;
        return this;
    }
    public Long getTotalInBytes() {
        return this.totalInBytes;
    }

    public DescribeVpcFirewallTrafficTrendResponseBody setTotalOutBytes(Long totalOutBytes) {
        this.totalOutBytes = totalOutBytes;
        return this;
    }
    public Long getTotalOutBytes() {
        return this.totalOutBytes;
    }

    public DescribeVpcFirewallTrafficTrendResponseBody setTotalSession(Long totalSession) {
        this.totalSession = totalSession;
        return this;
    }
    public Long getTotalSession() {
        return this.totalSession;
    }

    public static class DescribeVpcFirewallTrafficTrendResponseBodyDataList extends TeaModel {
        /**
         * <p>The inbound bandwidth. Unit: bit/s.</p>
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
         * <p>32</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <p>The inbound packet forwarding rate. Unit: pps.</p>
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
         * <p>The outbound traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        @NameInMap("OutBps")
        public Long outBps;

        /**
         * <p>The total outbound network throughput. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>230</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <p>The outbound packet forwarding rate. Unit: pps.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OutPps")
        public Long outPps;

        /**
         * <p>The number of sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <p>The time when the traffic occurred. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1758470400</p>
         */
        @NameInMap("Time")
        public Integer time;

        public static DescribeVpcFirewallTrafficTrendResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallTrafficTrendResponseBodyDataList self = new DescribeVpcFirewallTrafficTrendResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallTrafficTrendResponseBodyDataList setInBps(Long inBps) {
            this.inBps = inBps;
            return this;
        }
        public Long getInBps() {
            return this.inBps;
        }

        public DescribeVpcFirewallTrafficTrendResponseBodyDataList setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribeVpcFirewallTrafficTrendResponseBodyDataList setInPps(Long inPps) {
            this.inPps = inPps;
            return this;
        }
        public Long getInPps() {
            return this.inPps;
        }

        public DescribeVpcFirewallTrafficTrendResponseBodyDataList setNewConn(Long newConn) {
            this.newConn = newConn;
            return this;
        }
        public Long getNewConn() {
            return this.newConn;
        }

        public DescribeVpcFirewallTrafficTrendResponseBodyDataList setOutBps(Long outBps) {
            this.outBps = outBps;
            return this;
        }
        public Long getOutBps() {
            return this.outBps;
        }

        public DescribeVpcFirewallTrafficTrendResponseBodyDataList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeVpcFirewallTrafficTrendResponseBodyDataList setOutPps(Long outPps) {
            this.outPps = outPps;
            return this;
        }
        public Long getOutPps() {
            return this.outPps;
        }

        public DescribeVpcFirewallTrafficTrendResponseBodyDataList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeVpcFirewallTrafficTrendResponseBodyDataList setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

    }

}
