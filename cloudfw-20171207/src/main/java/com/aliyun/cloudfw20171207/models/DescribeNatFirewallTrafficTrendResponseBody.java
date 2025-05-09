// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallTrafficTrendResponseBody extends TeaModel {
    /**
     * <p>The statistics on traffic.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeNatFirewallTrafficTrendResponseBodyDataList> dataList;

    /**
     * <p>The maximum inbound network throughput, which indicates the maximum number of bits that are sent inbound per second. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>18038632</p>
     */
    @NameInMap("MaxInBps")
    public Long maxInBps;

    /**
     * <p>The maximum outbound network throughput, which indicates the maximum number of bits that are sent outbound per second. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>122596487</p>
     */
    @NameInMap("MaxOutBps")
    public Long maxOutBps;

    /**
     * <p>The total maximum inbound and outbound network throughput, which indicates the maximum number of bits that are sent inbound and outbound per second. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>66953194</p>
     */
    @NameInMap("MaxTotalBps")
    public Long maxTotalBps;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>87F23A3A-6F57-59C3-8237-A090D0613D71</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNatFirewallTrafficTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallTrafficTrendResponseBody self = new DescribeNatFirewallTrafficTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallTrafficTrendResponseBody setDataList(java.util.List<DescribeNatFirewallTrafficTrendResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeNatFirewallTrafficTrendResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeNatFirewallTrafficTrendResponseBody setMaxInBps(Long maxInBps) {
        this.maxInBps = maxInBps;
        return this;
    }
    public Long getMaxInBps() {
        return this.maxInBps;
    }

    public DescribeNatFirewallTrafficTrendResponseBody setMaxOutBps(Long maxOutBps) {
        this.maxOutBps = maxOutBps;
        return this;
    }
    public Long getMaxOutBps() {
        return this.maxOutBps;
    }

    public DescribeNatFirewallTrafficTrendResponseBody setMaxTotalBps(Long maxTotalBps) {
        this.maxTotalBps = maxTotalBps;
        return this;
    }
    public Long getMaxTotalBps() {
        return this.maxTotalBps;
    }

    public DescribeNatFirewallTrafficTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNatFirewallTrafficTrendResponseBodyDataList extends TeaModel {
        /**
         * <p>The maximum inbound network throughput, which indicates the maximum number of bits that are sent inbound per second. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>18038632</p>
         */
        @NameInMap("MaxInBps")
        public Long maxInBps;

        /**
         * <p>The maximum outbound network throughput, which indicates the maximum number of bits that are sent outbound per second. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>122596487</p>
         */
        @NameInMap("MaxOutBps")
        public Long maxOutBps;

        /**
         * <p>The total maximum inbound and outbound network throughput, which indicates the maximum number of bits that are sent inbound and outbound per second. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>66953194</p>
         */
        @NameInMap("MaxTotalBps")
        public Long maxTotalBps;

        /**
         * <p>The time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1734418980</p>
         */
        @NameInMap("TrafficTime")
        public Long trafficTime;

        public static DescribeNatFirewallTrafficTrendResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatFirewallTrafficTrendResponseBodyDataList self = new DescribeNatFirewallTrafficTrendResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeNatFirewallTrafficTrendResponseBodyDataList setMaxInBps(Long maxInBps) {
            this.maxInBps = maxInBps;
            return this;
        }
        public Long getMaxInBps() {
            return this.maxInBps;
        }

        public DescribeNatFirewallTrafficTrendResponseBodyDataList setMaxOutBps(Long maxOutBps) {
            this.maxOutBps = maxOutBps;
            return this;
        }
        public Long getMaxOutBps() {
            return this.maxOutBps;
        }

        public DescribeNatFirewallTrafficTrendResponseBodyDataList setMaxTotalBps(Long maxTotalBps) {
            this.maxTotalBps = maxTotalBps;
            return this;
        }
        public Long getMaxTotalBps() {
            return this.maxTotalBps;
        }

        public DescribeNatFirewallTrafficTrendResponseBodyDataList setTrafficTime(Long trafficTime) {
            this.trafficTime = trafficTime;
            return this;
        }
        public Long getTrafficTime() {
            return this.trafficTime;
        }

    }

}
