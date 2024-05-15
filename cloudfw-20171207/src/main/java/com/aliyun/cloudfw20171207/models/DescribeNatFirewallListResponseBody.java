// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallListResponseBody extends TeaModel {
    @NameInMap("NatFirewallList")
    public java.util.List<DescribeNatFirewallListResponseBodyNatFirewallList> natFirewallList;

    @NameInMap("RequestId")
    public String requestId;

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

    public static class DescribeNatFirewallListResponseBodyNatFirewallList extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("ErrorDetail")
        public String errorDetail;

        @NameInMap("MemberUid")
        public Long memberUid;

        @NameInMap("NatGatewayId")
        public String natGatewayId;

        @NameInMap("NatGatewayName")
        public String natGatewayName;

        @NameInMap("ProxyId")
        public String proxyId;

        @NameInMap("ProxyName")
        public String proxyName;

        @NameInMap("ProxyStatus")
        public String proxyStatus;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StrictMode")
        public Integer strictMode;

        @NameInMap("VpcId")
        public String vpcId;

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

        public DescribeNatFirewallListResponseBodyNatFirewallList setProxyStatus(String proxyStatus) {
            this.proxyStatus = proxyStatus;
            return this;
        }
        public String getProxyStatus() {
            return this.proxyStatus;
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
