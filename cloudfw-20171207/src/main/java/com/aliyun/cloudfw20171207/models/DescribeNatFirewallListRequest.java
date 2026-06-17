// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallListRequest extends TeaModel {
    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the member account.</p>
     * 
     * <strong>example:</strong>
     * <p>147783******</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>The ID of the NAT Gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp123456g******</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of NAT firewalls to return on each page for a paged query.</p>
     * <p>The default value is <strong>10</strong>. The maximum value is <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the NAT firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy-nat97a******</p>
     */
    @NameInMap("ProxyId")
    public String proxyId;

    /**
     * <p>The name of the NAT firewall. The name must be 4 to 50 characters in length. It can contain letters, digits, and underscores (<em>). It cannot start with an underscore (</em>).</p>
     * 
     * <strong>example:</strong>
     * <p>nat-firewall</p>
     */
    @NameInMap("ProxyName")
    public String proxyName;

    /**
     * <p>The region ID of the VPC.</p>
     * <blockquote>
     * <p>For more information about the regions where Cloud Firewall is available, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

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
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the VPC instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-8vbwbo90rq0anm6t****</p>
     */
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
