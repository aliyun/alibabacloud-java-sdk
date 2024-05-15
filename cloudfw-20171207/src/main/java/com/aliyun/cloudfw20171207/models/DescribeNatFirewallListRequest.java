// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("MemberUid")
    public Long memberUid;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProxyId")
    public String proxyId;

    @NameInMap("ProxyName")
    public String proxyName;

    @NameInMap("RegionNo")
    public String regionNo;

    @NameInMap("Status")
    public String status;

    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeNatFirewallListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallListRequest self = new DescribeNatFirewallListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNatFirewallListRequest setMemberUid(Long memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public Long getMemberUid() {
        return this.memberUid;
    }

    public DescribeNatFirewallListRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeNatFirewallListRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribeNatFirewallListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeNatFirewallListRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

    public DescribeNatFirewallListRequest setProxyName(String proxyName) {
        this.proxyName = proxyName;
        return this;
    }
    public String getProxyName() {
        return this.proxyName;
    }

    public DescribeNatFirewallListRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeNatFirewallListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeNatFirewallListRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
