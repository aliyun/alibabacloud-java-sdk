// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetTimeTopResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("DataCount")
    public Integer dataCount;

    @NameInMap("DataList")
    public java.util.List<DescribeInternetTimeTopResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>7F2D5C04-731F-50B0-ADE1-01637B3C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1734399660</p>
     */
    @NameInMap("TrafficTime")
    public Integer trafficTime;

    public static DescribeInternetTimeTopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetTimeTopResponseBody self = new DescribeInternetTimeTopResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInternetTimeTopResponseBody setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
        return this;
    }
    public Integer getDataCount() {
        return this.dataCount;
    }

    public DescribeInternetTimeTopResponseBody setDataList(java.util.List<DescribeInternetTimeTopResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeInternetTimeTopResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeInternetTimeTopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInternetTimeTopResponseBody setTrafficTime(Integer trafficTime) {
        this.trafficTime = trafficTime;
        return this;
    }
    public Integer getTrafficTime() {
        return this.trafficTime;
    }

    public static class DescribeInternetTimeTopResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>183.60.164.XXX</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <strong>example:</strong>
         * <p>187</p>
         */
        @NameInMap("InBps")
        public Long inBps;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InPps")
        public Long inPps;

        /**
         * <strong>example:</strong>
         * <p>ngw-wz98eedr5l5hkb8****e7</p>
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
         * <p>47.97.66.XXX</p>
         */
        @NameInMap("NatIP")
        public String natIP;

        /**
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("NewConn")
        public Long newConn;

        /**
         * <strong>example:</strong>
         * <p>45</p>
         */
        @NameInMap("OutBps")
        public Long outBps;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OutPps")
        public Long outPps;

        /**
         * <strong>example:</strong>
         * <p>10.21.186.XXX</p>
         */
        @NameInMap("PrivateIP")
        public String privateIP;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>lb-bp14ue2rgktunncq****</p>
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
         * <p>EcsPublicIP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <strong>example:</strong>
         * <p>232</p>
         */
        @NameInMap("TotalBps")
        public Long totalBps;

        /**
         * <strong>example:</strong>
         * <p>88</p>
         */
        @NameInMap("TotalPps")
        public Long totalPps;

        /**
         * <strong>example:</strong>
         * <p>vpc-wz9o0uzfjuj81fx7m****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeInternetTimeTopResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetTimeTopResponseBodyDataList self = new DescribeInternetTimeTopResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeInternetTimeTopResponseBodyDataList setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeInternetTimeTopResponseBodyDataList setInBps(Long inBps) {
            this.inBps = inBps;
            return this;
        }
        public Long getInBps() {
            return this.inBps;
        }

        public DescribeInternetTimeTopResponseBodyDataList setInPps(Long inPps) {
            this.inPps = inPps;
            return this;
        }
        public Long getInPps() {
            return this.inPps;
        }

        public DescribeInternetTimeTopResponseBodyDataList setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeInternetTimeTopResponseBodyDataList setNatGatewayName(String natGatewayName) {
            this.natGatewayName = natGatewayName;
            return this;
        }
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        public DescribeInternetTimeTopResponseBodyDataList setNatIP(String natIP) {
            this.natIP = natIP;
            return this;
        }
        public String getNatIP() {
            return this.natIP;
        }

        public DescribeInternetTimeTopResponseBodyDataList setNewConn(Long newConn) {
            this.newConn = newConn;
            return this;
        }
        public Long getNewConn() {
            return this.newConn;
        }

        public DescribeInternetTimeTopResponseBodyDataList setOutBps(Long outBps) {
            this.outBps = outBps;
            return this;
        }
        public Long getOutBps() {
            return this.outBps;
        }

        public DescribeInternetTimeTopResponseBodyDataList setOutPps(Long outPps) {
            this.outPps = outPps;
            return this;
        }
        public Long getOutPps() {
            return this.outPps;
        }

        public DescribeInternetTimeTopResponseBodyDataList setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
            return this;
        }
        public String getPrivateIP() {
            return this.privateIP;
        }

        public DescribeInternetTimeTopResponseBodyDataList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeInternetTimeTopResponseBodyDataList setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public DescribeInternetTimeTopResponseBodyDataList setResourceInstanceName(String resourceInstanceName) {
            this.resourceInstanceName = resourceInstanceName;
            return this;
        }
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
        }

        public DescribeInternetTimeTopResponseBodyDataList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeInternetTimeTopResponseBodyDataList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeInternetTimeTopResponseBodyDataList setTotalBps(Long totalBps) {
            this.totalBps = totalBps;
            return this;
        }
        public Long getTotalBps() {
            return this.totalBps;
        }

        public DescribeInternetTimeTopResponseBodyDataList setTotalPps(Long totalPps) {
            this.totalPps = totalPps;
            return this;
        }
        public Long getTotalPps() {
            return this.totalPps;
        }

        public DescribeInternetTimeTopResponseBodyDataList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
