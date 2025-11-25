// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallTimeTopResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DataCount")
    public Long dataCount;

    @NameInMap("DataList")
    public java.util.List<DescribeNatFirewallTimeTopResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>C5DDD596-1191-5F36-A504-8733045A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1656923760</p>
     */
    @NameInMap("TrafficTime")
    public String trafficTime;

    public static DescribeNatFirewallTimeTopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallTimeTopResponseBody self = new DescribeNatFirewallTimeTopResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallTimeTopResponseBody setDataCount(Long dataCount) {
        this.dataCount = dataCount;
        return this;
    }
    public Long getDataCount() {
        return this.dataCount;
    }

    public DescribeNatFirewallTimeTopResponseBody setDataList(java.util.List<DescribeNatFirewallTimeTopResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeNatFirewallTimeTopResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeNatFirewallTimeTopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNatFirewallTimeTopResponseBody setTrafficTime(String trafficTime) {
        this.trafficTime = trafficTime;
        return this;
    }
    public String getTrafficTime() {
        return this.trafficTime;
    }

    public static class DescribeNatFirewallTimeTopResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>187</p>
         */
        @NameInMap("InBps")
        public Long inBps;

        /**
         * <strong>example:</strong>
         * <p>10.66.231.XXX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>vfw-tr-7a9c8901ed394****</p>
         */
        @NameInMap("NatFirewallId")
        public String natFirewallId;

        /**
         * <strong>example:</strong>
         * <p>vfw-test</p>
         */
        @NameInMap("NatFirewallName")
        public String natFirewallName;

        /**
         * <strong>example:</strong>
         * <p>ngw-uf6pnry5vpawb****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <strong>example:</strong>
         * <p>ngw-test</p>
         */
        @NameInMap("NatGatewayName")
        public String natGatewayName;

        /**
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("NewConn")
        public String newConn;

        /**
         * <strong>example:</strong>
         * <p>45</p>
         */
        @NameInMap("OutBps")
        public Long outBps;

        /**
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>i-bp130nn8h6157dir****</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceInstanceName")
        public String resourceInstanceName;

        /**
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("SessionCount")
        public String sessionCount;

        /**
         * <strong>example:</strong>
         * <p>232</p>
         */
        @NameInMap("TotalBps")
        public Long totalBps;

        public static DescribeNatFirewallTimeTopResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatFirewallTimeTopResponseBodyDataList self = new DescribeNatFirewallTimeTopResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeNatFirewallTimeTopResponseBodyDataList setInBps(Long inBps) {
            this.inBps = inBps;
            return this;
        }
        public Long getInBps() {
            return this.inBps;
        }

        public DescribeNatFirewallTimeTopResponseBodyDataList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeNatFirewallTimeTopResponseBodyDataList setNatFirewallId(String natFirewallId) {
            this.natFirewallId = natFirewallId;
            return this;
        }
        public String getNatFirewallId() {
            return this.natFirewallId;
        }

        public DescribeNatFirewallTimeTopResponseBodyDataList setNatFirewallName(String natFirewallName) {
            this.natFirewallName = natFirewallName;
            return this;
        }
        public String getNatFirewallName() {
            return this.natFirewallName;
        }

        public DescribeNatFirewallTimeTopResponseBodyDataList setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeNatFirewallTimeTopResponseBodyDataList setNatGatewayName(String natGatewayName) {
            this.natGatewayName = natGatewayName;
            return this;
        }
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        public DescribeNatFirewallTimeTopResponseBodyDataList setNewConn(String newConn) {
            this.newConn = newConn;
            return this;
        }
        public String getNewConn() {
            return this.newConn;
        }

        public DescribeNatFirewallTimeTopResponseBodyDataList setOutBps(Long outBps) {
            this.outBps = outBps;
            return this;
        }
        public Long getOutBps() {
            return this.outBps;
        }

        public DescribeNatFirewallTimeTopResponseBodyDataList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeNatFirewallTimeTopResponseBodyDataList setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public DescribeNatFirewallTimeTopResponseBodyDataList setResourceInstanceName(String resourceInstanceName) {
            this.resourceInstanceName = resourceInstanceName;
            return this;
        }
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
        }

        public DescribeNatFirewallTimeTopResponseBodyDataList setSessionCount(String sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public String getSessionCount() {
            return this.sessionCount;
        }

        public DescribeNatFirewallTimeTopResponseBodyDataList setTotalBps(Long totalBps) {
            this.totalBps = totalBps;
            return this;
        }
        public Long getTotalBps() {
            return this.totalBps;
        }

    }

}
