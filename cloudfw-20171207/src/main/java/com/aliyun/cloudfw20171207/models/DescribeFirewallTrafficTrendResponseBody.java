// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallTrafficTrendResponseBody extends TeaModel {
    /**
     * <p>The returned data list.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeFirewallTrafficTrendResponseBodyDataList> dataList;

    /**
     * <p>The timestamp when the peak total traffic occurred. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1758470400</p>
     */
    @NameInMap("MaxBandwidthTime")
    public Long maxBandwidthTime;

    /**
     * <p>The traffic distribution at the time of peak total traffic.</p>
     */
    @NameInMap("MaxBandwidthTimeBps")
    public DescribeFirewallTrafficTrendResponseBodyMaxBandwidthTimeBps maxBandwidthTimeBps;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4E7F94C7-781F-5192-86CF-DB085****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFirewallTrafficTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallTrafficTrendResponseBody self = new DescribeFirewallTrafficTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallTrafficTrendResponseBody setDataList(java.util.List<DescribeFirewallTrafficTrendResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeFirewallTrafficTrendResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeFirewallTrafficTrendResponseBody setMaxBandwidthTime(Long maxBandwidthTime) {
        this.maxBandwidthTime = maxBandwidthTime;
        return this;
    }
    public Long getMaxBandwidthTime() {
        return this.maxBandwidthTime;
    }

    public DescribeFirewallTrafficTrendResponseBody setMaxBandwidthTimeBps(DescribeFirewallTrafficTrendResponseBodyMaxBandwidthTimeBps maxBandwidthTimeBps) {
        this.maxBandwidthTimeBps = maxBandwidthTimeBps;
        return this;
    }
    public DescribeFirewallTrafficTrendResponseBodyMaxBandwidthTimeBps getMaxBandwidthTimeBps() {
        return this.maxBandwidthTimeBps;
    }

    public DescribeFirewallTrafficTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFirewallTrafficTrendResponseBodyDataList extends TeaModel {
        /**
         * <p>The Internet firewall traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InternetBps")
        public Long internetBps;

        /**
         * <p>The NAT firewall traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("NatBps")
        public Long natBps;

        /**
         * <p>The time when the traffic occurred. The value is a UNIX timestamp. Unit: seconds.</p>
         * <p>If the data at this point in time has not been processed, the values of all other fields are -1.</p>
         * 
         * <strong>example:</strong>
         * <p>1758470400</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The total firewall traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("TotalBps")
        public Long totalBps;

        /**
         * <p>The VPC firewall traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("VpcBps")
        public Long vpcBps;

        public static DescribeFirewallTrafficTrendResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirewallTrafficTrendResponseBodyDataList self = new DescribeFirewallTrafficTrendResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeFirewallTrafficTrendResponseBodyDataList setInternetBps(Long internetBps) {
            this.internetBps = internetBps;
            return this;
        }
        public Long getInternetBps() {
            return this.internetBps;
        }

        public DescribeFirewallTrafficTrendResponseBodyDataList setNatBps(Long natBps) {
            this.natBps = natBps;
            return this;
        }
        public Long getNatBps() {
            return this.natBps;
        }

        public DescribeFirewallTrafficTrendResponseBodyDataList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeFirewallTrafficTrendResponseBodyDataList setTotalBps(Long totalBps) {
            this.totalBps = totalBps;
            return this;
        }
        public Long getTotalBps() {
            return this.totalBps;
        }

        public DescribeFirewallTrafficTrendResponseBodyDataList setVpcBps(Long vpcBps) {
            this.vpcBps = vpcBps;
            return this;
        }
        public Long getVpcBps() {
            return this.vpcBps;
        }

    }

    public static class DescribeFirewallTrafficTrendResponseBodyMaxBandwidthTimeBps extends TeaModel {
        /**
         * <p>The Internet firewall traffic at the time of peak total traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InternetBps")
        public Long internetBps;

        /**
         * <p>The NAT firewall traffic at the time of peak total traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("NatBps")
        public Long natBps;

        /**
         * <p>The peak total traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("TotalBps")
        public Long totalBps;

        /**
         * <p>The VPC firewall traffic at the time of peak total traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("VpcBps")
        public Long vpcBps;

        public static DescribeFirewallTrafficTrendResponseBodyMaxBandwidthTimeBps build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirewallTrafficTrendResponseBodyMaxBandwidthTimeBps self = new DescribeFirewallTrafficTrendResponseBodyMaxBandwidthTimeBps();
            return TeaModel.build(map, self);
        }

        public DescribeFirewallTrafficTrendResponseBodyMaxBandwidthTimeBps setInternetBps(Long internetBps) {
            this.internetBps = internetBps;
            return this;
        }
        public Long getInternetBps() {
            return this.internetBps;
        }

        public DescribeFirewallTrafficTrendResponseBodyMaxBandwidthTimeBps setNatBps(Long natBps) {
            this.natBps = natBps;
            return this;
        }
        public Long getNatBps() {
            return this.natBps;
        }

        public DescribeFirewallTrafficTrendResponseBodyMaxBandwidthTimeBps setTotalBps(Long totalBps) {
            this.totalBps = totalBps;
            return this;
        }
        public Long getTotalBps() {
            return this.totalBps;
        }

        public DescribeFirewallTrafficTrendResponseBodyMaxBandwidthTimeBps setVpcBps(Long vpcBps) {
            this.vpcBps = vpcBps;
            return this;
        }
        public Long getVpcBps() {
            return this.vpcBps;
        }

    }

}
