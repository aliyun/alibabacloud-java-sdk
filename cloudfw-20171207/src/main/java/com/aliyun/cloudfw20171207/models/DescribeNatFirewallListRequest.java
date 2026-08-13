// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallListRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the member account of the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>147783******</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>The NAT gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp123456g******</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The page number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of NAT firewalls to display on each page in a paged query.</p>
     * <p>Default value: <strong>10</strong>, which indicates that each page contains <strong>10</strong> results. Maximum value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The NAT firewall ID.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy-nat97a******</p>
     */
    @NameInMap("ProxyId")
    public String proxyId;

    /**
     * <p>The NAT firewall name. The name can contain uppercase and lowercase letters, Chinese characters, digits, and underscores (_). The name must be 4 to 50 characters in length and cannot start with an underscore.</p>
     * 
     * <strong>example:</strong>
     * <p>nat-firewall</p>
     */
    @NameInMap("ProxyName")
    public String proxyName;

    /**
     * <p>The region ID of the VPC.</p>
     * <blockquote>
     * <p>For more information about the regions supported by Cloud Firewall, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The Cloud Firewall status. Valid values:</p>
     * <ul>
     * <li>configuring: being created</li>
     * <li>deleting: being deleted</li>
     * <li>normal: normal</li>
     * <li>abnormal: abnormal</li>
     * <li>opening: being enabled</li>
     * <li>closing: being disabled</li>
     * <li>closed: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The VPC-connected instance ID.</p>
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
