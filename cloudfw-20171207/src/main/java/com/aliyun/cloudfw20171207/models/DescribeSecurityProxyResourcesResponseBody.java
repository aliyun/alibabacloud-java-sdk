// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSecurityProxyResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A8E8D50E-9F45-5662-B116-A1D0807F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceList")
    public java.util.List<DescribeSecurityProxyResourcesResponseBodyResourceList> resourceList;

    public static DescribeSecurityProxyResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityProxyResourcesResponseBody self = new DescribeSecurityProxyResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityProxyResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityProxyResourcesResponseBody setResourceList(java.util.List<DescribeSecurityProxyResourcesResponseBodyResourceList> resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public java.util.List<DescribeSecurityProxyResourcesResponseBodyResourceList> getResourceList() {
        return this.resourceList;
    }

    public static class DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGatewaysNatRouteEntryList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10.0.70.XX/24</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <strong>example:</strong>
         * <p>ngw-2zey0w2u02u1x584m****</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <strong>example:</strong>
         * <p>NatGateway</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <strong>example:</strong>
         * <p>vtb-2ze409pp09d994a****</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGatewaysNatRouteEntryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGatewaysNatRouteEntryList self = new DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGatewaysNatRouteEntryList();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGatewaysNatRouteEntryList setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGatewaysNatRouteEntryList setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGatewaysNatRouteEntryList setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGatewaysNatRouteEntryList setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGateways extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <strong>example:</strong>
         * <p>ngw-bp1bm0k2t8i6ooxu****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <strong>example:</strong>
         * <p>ngw-test</p>
         */
        @NameInMap("NatGatewayName")
        public String natGatewayName;

        @NameInMap("NatRouteEntryList")
        public java.util.List<DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGatewaysNatRouteEntryList> natRouteEntryList;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGateways self = new DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGateways();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGateways setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGateways setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGateways setNatGatewayName(String natGatewayName) {
            this.natGatewayName = natGatewayName;
            return this;
        }
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGateways setNatRouteEntryList(java.util.List<DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGatewaysNatRouteEntryList> natRouteEntryList) {
            this.natRouteEntryList = natRouteEntryList;
            return this;
        }
        public java.util.List<DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGatewaysNatRouteEntryList> getNatRouteEntryList() {
            return this.natRouteEntryList;
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGateways setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSecurityProxyResourcesResponseBodyResourceListVpcList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <strong>example:</strong>
         * <p>157862808111****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        @NameInMap("NatGateways")
        public java.util.List<DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGateways> natGateways;

        /**
         * <strong>example:</strong>
         * <p>vpc-8vbuzirdl3w1r7exw****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>vpc-wz94a4q37rgl7g****</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeSecurityProxyResourcesResponseBodyResourceListVpcList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityProxyResourcesResponseBodyResourceListVpcList self = new DescribeSecurityProxyResourcesResponseBodyResourceListVpcList();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceListVpcList setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceListVpcList setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceListVpcList setNatGateways(java.util.List<DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGateways> natGateways) {
            this.natGateways = natGateways;
            return this;
        }
        public java.util.List<DescribeSecurityProxyResourcesResponseBodyResourceListVpcListNatGateways> getNatGateways() {
            return this.natGateways;
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceListVpcList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceListVpcList setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class DescribeSecurityProxyResourcesResponseBodyResourceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("VpcList")
        public java.util.List<DescribeSecurityProxyResourcesResponseBodyResourceListVpcList> vpcList;

        public static DescribeSecurityProxyResourcesResponseBodyResourceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityProxyResourcesResponseBodyResourceList self = new DescribeSecurityProxyResourcesResponseBodyResourceList();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeSecurityProxyResourcesResponseBodyResourceList setVpcList(java.util.List<DescribeSecurityProxyResourcesResponseBodyResourceListVpcList> vpcList) {
            this.vpcList = vpcList;
            return this;
        }
        public java.util.List<DescribeSecurityProxyResourcesResponseBodyResourceListVpcList> getVpcList() {
            return this.vpcList;
        }

    }

}
