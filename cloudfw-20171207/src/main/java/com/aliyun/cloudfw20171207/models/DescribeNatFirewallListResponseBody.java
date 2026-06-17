// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallListResponseBody extends TeaModel {
    /**
     * <p>The list of Cloud Firewalls.</p>
     */
    @NameInMap("NatFirewallList")
    public java.util.List<DescribeNatFirewallListResponseBodyNatFirewallList> natFirewallList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>15FCCC52-1E23-57AE-B5EF-3E00A3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of NAT firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNatFirewallListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallListResponseBody self = new DescribeNatFirewallListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallListResponseBody setNatFirewallList(java.util.List<DescribeNatFirewallListResponseBodyNatFirewallList> natFirewallList) {
        this.natFirewallList = natFirewallList;
        return this;
    }
    public java.util.List<DescribeNatFirewallListResponseBodyNatFirewallList> getNatFirewallList() {
        return this.natFirewallList;
    }

    public DescribeNatFirewallListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNatFirewallListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNatFirewallListResponseBodyNatFirewallListNatRouteEntryList extends TeaModel {
        /**
         * <p>The destination CIDR block of the default route.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <p>The next hop of the original NAT Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-2ze0s284r9atg5******</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The network type of the next hop. The value is \<code>NatGateway\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>NatGateway</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The route table that contains the default route of the NAT Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp18o0gb******</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DescribeNatFirewallListResponseBodyNatFirewallListNatRouteEntryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatFirewallListResponseBodyNatFirewallListNatRouteEntryList self = new DescribeNatFirewallListResponseBodyNatFirewallListNatRouteEntryList();
            return TeaModel.build(map, self);
        }

        public DescribeNatFirewallListResponseBodyNatFirewallListNatRouteEntryList setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallListNatRouteEntryList setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallListNatRouteEntryList setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallListNatRouteEntryList setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeNatFirewallListResponseBodyNatFirewallList extends TeaModel {
        /**
         * <p>The UID of the Alibaba Cloud account.</p>
         * <blockquote>
         * <p>This is the primary account of the Cloud Firewall member account.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>19106481******</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The cause of the error.</p>
         * 
         * <strong>example:</strong>
         * <p>Firewall creation failed</p>
         */
        @NameInMap("ErrorDetail")
        public String errorDetail;

        /**
         * <p>The UID of the Cloud Firewall member account.</p>
         * 
         * <strong>example:</strong>
         * <p>19106481******</p>
         */
        @NameInMap("MemberUid")
        public Long memberUid;

        /**
         * <p>The ID of the NAT Gateway to query.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-uf6tnblxip4qcxg******</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The name of the NAT Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>nat-gateway-test</p>
         */
        @NameInMap("NatGatewayName")
        public String natGatewayName;

        /**
         * <p>The list of default route entries for the NAT Gateway.</p>
         */
        @NameInMap("NatRouteEntryList")
        public java.util.List<DescribeNatFirewallListResponseBodyNatFirewallListNatRouteEntryList> natRouteEntryList;

        /**
         * <p>The ID of the NAT firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>proxy-nat30******</p>
         */
        @NameInMap("ProxyId")
        public String proxyId;

        /**
         * <p>The name of the NAT firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>nat-firewall-test</p>
         */
        @NameInMap("ProxyName")
        public String proxyName;

        /**
         * <p>The ID of the Elastic Network Interface (ENI) that the firewall uses.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp127llmo4v5qju******</p>
         */
        @NameInMap("ProxyNetworkInterfaceId")
        public String proxyNetworkInterfaceId;

        /**
         * <p>The ID of the route table that the firewall uses.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp1pmyga7p4j10a******</p>
         */
        @NameInMap("ProxyRouteTableId")
        public String proxyRouteTableId;

        /**
         * <p>The status of the Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><p>configuring: The firewall is being created.</p>
         * </li>
         * <li><p>deleting: The firewall is being deleted.</p>
         * </li>
         * <li><p>normal: The firewall is working as expected.</p>
         * </li>
         * <li><p>abnormal: The firewall is not working as expected.</p>
         * </li>
         * <li><p>opening: The firewall is being enabled.</p>
         * </li>
         * <li><p>closing: The firewall is being disabled.</p>
         * </li>
         * <li><p>closed: The firewall is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("ProxyStatus")
        public String proxyStatus;

        /**
         * <p>The ID of the vSwitch that the firewall uses.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1amn3t1ktjjy8******</p>
         */
        @NameInMap("ProxyVSwitchId")
        public String proxyVSwitchId;

        /**
         * <p>The region ID where the Cloud Firewall is located.</p>
         * <blockquote>
         * <p>For more information about the regions where Cloud Firewall is available, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Indicates whether strict mode is enabled.</p>
         * <ul>
         * <li><p>1: Strict mode is enabled.</p>
         * </li>
         * <li><p>0: Strict mode is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StrictMode")
        public Integer strictMode;

        /**
         * <p>The ID of the VPC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze26ya******</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-test-instance</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeNatFirewallListResponseBodyNatFirewallList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatFirewallListResponseBodyNatFirewallList self = new DescribeNatFirewallListResponseBodyNatFirewallList();
            return TeaModel.build(map, self);
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setErrorDetail(String errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }
        public String getErrorDetail() {
            return this.errorDetail;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setMemberUid(Long memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public Long getMemberUid() {
            return this.memberUid;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setNatGatewayName(String natGatewayName) {
            this.natGatewayName = natGatewayName;
            return this;
        }
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setNatRouteEntryList(java.util.List<DescribeNatFirewallListResponseBodyNatFirewallListNatRouteEntryList> natRouteEntryList) {
            this.natRouteEntryList = natRouteEntryList;
            return this;
        }
        public java.util.List<DescribeNatFirewallListResponseBodyNatFirewallListNatRouteEntryList> getNatRouteEntryList() {
            return this.natRouteEntryList;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setProxyId(String proxyId) {
            this.proxyId = proxyId;
            return this;
        }
        public String getProxyId() {
            return this.proxyId;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setProxyName(String proxyName) {
            this.proxyName = proxyName;
            return this;
        }
        public String getProxyName() {
            return this.proxyName;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setProxyNetworkInterfaceId(String proxyNetworkInterfaceId) {
            this.proxyNetworkInterfaceId = proxyNetworkInterfaceId;
            return this;
        }
        public String getProxyNetworkInterfaceId() {
            return this.proxyNetworkInterfaceId;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setProxyRouteTableId(String proxyRouteTableId) {
            this.proxyRouteTableId = proxyRouteTableId;
            return this;
        }
        public String getProxyRouteTableId() {
            return this.proxyRouteTableId;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setProxyStatus(String proxyStatus) {
            this.proxyStatus = proxyStatus;
            return this;
        }
        public String getProxyStatus() {
            return this.proxyStatus;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setProxyVSwitchId(String proxyVSwitchId) {
            this.proxyVSwitchId = proxyVSwitchId;
            return this;
        }
        public String getProxyVSwitchId() {
            return this.proxyVSwitchId;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setStrictMode(Integer strictMode) {
            this.strictMode = strictMode;
            return this;
        }
        public Integer getStrictMode() {
            return this.strictMode;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeNatFirewallListResponseBodyNatFirewallList setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
