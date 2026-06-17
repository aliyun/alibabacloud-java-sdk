// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSecurityProxyResponseBody extends TeaModel {
    /**
     * <p>The list of NAT firewalls.</p>
     */
    @NameInMap("ProxyList")
    public java.util.List<DescribeSecurityProxyResponseBodyProxyList> proxyList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSecurityProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityProxyResponseBody self = new DescribeSecurityProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityProxyResponseBody setProxyList(java.util.List<DescribeSecurityProxyResponseBodyProxyList> proxyList) {
        this.proxyList = proxyList;
        return this;
    }
    public java.util.List<DescribeSecurityProxyResponseBodyProxyList> getProxyList() {
        return this.proxyList;
    }

    public DescribeSecurityProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityProxyResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSecurityProxyResponseBodyProxyList extends TeaModel {
        /**
         * <p>The IPv4 CIDR block of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The details of the exception.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The UID of the Cloud Firewall member account.</p>
         * 
         * <strong>example:</strong>
         * <p>1797733170015112</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The ID of the NAT Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-2zex8sf4s5vus8rq3rjqo</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The name of the NAT Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-slb-eip-waf</p>
         */
        @NameInMap("NatGatewayName")
        public String natGatewayName;

        /**
         * <p>The ID of the NAT firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>proxy-nat4921f192b6cf438d93f8</p>
         */
        @NameInMap("ProxyId")
        public String proxyId;

        /**
         * <p>The name of the NAT firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>nat-idmp-fir</p>
         */
        @NameInMap("ProxyName")
        public String proxyName;

        /**
         * <p>The region ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The list of SNAT IP addresses.</p>
         */
        @NameInMap("SnatIpList")
        public java.util.List<String> snatIpList;

        /**
         * <p>The status of the Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><p><strong>configuring</strong>: The firewall is being created.</p>
         * </li>
         * <li><p><strong>deleting</strong>: The firewall is being deleted.</p>
         * </li>
         * <li><p><strong>normal</strong>: The firewall is running.</p>
         * </li>
         * <li><p><strong>abnormal</strong>: The firewall is not running as expected.</p>
         * </li>
         * <li><p><strong>opening</strong>: The firewall is being enabled.</p>
         * </li>
         * <li><p><strong>closing</strong>: The firewall is being disabled.</p>
         * </li>
         * <li><p><strong>closed</strong>: The firewall is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the strict mode is enabled. 1: The strict mode is enabled. 0: The strict mode is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StrictMode")
        public Integer strictMode;

        /**
         * <p>The ID of the vSwitch to which the Cloud Firewall instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-5gu2qqfmjmwl8ktzgfekl</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9xn35tq33hunzvpu0se</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The instance name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1kw9igsq0yyzeanqamx</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeSecurityProxyResponseBodyProxyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityProxyResponseBodyProxyList self = new DescribeSecurityProxyResponseBodyProxyList();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityProxyResponseBodyProxyList setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeSecurityProxyResponseBodyProxyList setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeSecurityProxyResponseBodyProxyList setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeSecurityProxyResponseBodyProxyList setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeSecurityProxyResponseBodyProxyList setNatGatewayName(String natGatewayName) {
            this.natGatewayName = natGatewayName;
            return this;
        }
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        public DescribeSecurityProxyResponseBodyProxyList setProxyId(String proxyId) {
            this.proxyId = proxyId;
            return this;
        }
        public String getProxyId() {
            return this.proxyId;
        }

        public DescribeSecurityProxyResponseBodyProxyList setProxyName(String proxyName) {
            this.proxyName = proxyName;
            return this;
        }
        public String getProxyName() {
            return this.proxyName;
        }

        public DescribeSecurityProxyResponseBodyProxyList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeSecurityProxyResponseBodyProxyList setSnatIpList(java.util.List<String> snatIpList) {
            this.snatIpList = snatIpList;
            return this;
        }
        public java.util.List<String> getSnatIpList() {
            return this.snatIpList;
        }

        public DescribeSecurityProxyResponseBodyProxyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSecurityProxyResponseBodyProxyList setStrictMode(Integer strictMode) {
            this.strictMode = strictMode;
            return this;
        }
        public Integer getStrictMode() {
            return this.strictMode;
        }

        public DescribeSecurityProxyResponseBodyProxyList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeSecurityProxyResponseBodyProxyList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeSecurityProxyResponseBodyProxyList setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
