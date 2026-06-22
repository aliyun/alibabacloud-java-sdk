// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSecurityProxyRequest extends TeaModel {
    /**
     * <p>The language type for the request and response messages. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the member accounts of the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The ID of the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-zm0h3c1exm5bifuorg8c5</p>
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
    public String pageNo;

    /**
     * <p>The maximum number of entries per page in a paged query. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the NAT firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy-nat80d763eb0dee4eacaec9</p>
     */
    @NameInMap("ProxyId")
    public String proxyId;

    /**
     * <p>The name of the NAT firewall. The name can contain uppercase and lowercase letters, Chinese characters, digits, and underscores (_). The name must be 4 to 50 characters in length and cannot start with an underscore.</p>
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
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The status of Cloud Firewall. Valid values:</p>
     * <ul>
     * <li><strong>configuring</strong>: Being created.</li>
     * <li><strong>deleting</strong>: Being deleted.</li>
     * <li><strong>normal</strong>: Normal.</li>
     * <li><strong>abnormal</strong>: Abnormal.</li>
     * <li><strong>opening</strong>: Being enabled.</li>
     * <li><strong>closing</strong>: Being disabled.</li>
     * <li><strong>closed</strong>: Disabled.</li>
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

    public static DescribeSecurityProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityProxyRequest self = new DescribeSecurityProxyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityProxyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSecurityProxyRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeSecurityProxyRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeSecurityProxyRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public DescribeSecurityProxyRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSecurityProxyRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

    public DescribeSecurityProxyRequest setProxyName(String proxyName) {
        this.proxyName = proxyName;
        return this;
    }
    public String getProxyName() {
        return this.proxyName;
    }

    public DescribeSecurityProxyRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeSecurityProxyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSecurityProxyRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
