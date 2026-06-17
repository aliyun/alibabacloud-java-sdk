// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrivateDnsEndpointListRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pd-12345</p>
     */
    @NameInMap("AccessInstanceId")
    public String accessInstanceId;

    /**
     * <p>The name of the private instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccessInstanceName")
    public String accessInstanceName;

    /**
     * <p>The type of Cloud Firewall. Valid values:</p>
     * <ul>
     * <li><p><strong>internet</strong></p>
     * </li>
     * <li><p><strong>vpc</strong></p>
     * </li>
     * <li><p><strong>nat</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("FirewallType")
    public String firewallType;

    /**
     * <p>The UID of the member account.</p>
     * 
     * <strong>example:</strong>
     * <p>135809047715****</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The status of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>creating</strong>: The instance is being created.</p>
     * </li>
     * <li><p><strong>deleting</strong>: The instance is being deleted.</p>
     * </li>
     * <li><p><strong>normal</strong>: The instance is running as expected.</p>
     * </li>
     * <li><p><strong>updating</strong>: The instance is being updated.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-8vbwbo90rq0anm6t****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribePrivateDnsEndpointListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivateDnsEndpointListRequest self = new DescribePrivateDnsEndpointListRequest();
        return TeaModel.build(map, self);
    }

    public DescribePrivateDnsEndpointListRequest setAccessInstanceId(String accessInstanceId) {
        this.accessInstanceId = accessInstanceId;
        return this;
    }
    public String getAccessInstanceId() {
        return this.accessInstanceId;
    }

    public DescribePrivateDnsEndpointListRequest setAccessInstanceName(String accessInstanceName) {
        this.accessInstanceName = accessInstanceName;
        return this;
    }
    public String getAccessInstanceName() {
        return this.accessInstanceName;
    }

    public DescribePrivateDnsEndpointListRequest setFirewallType(String firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public String getFirewallType() {
        return this.firewallType;
    }

    public DescribePrivateDnsEndpointListRequest setMemberUid(Long memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public Long getMemberUid() {
        return this.memberUid;
    }

    public DescribePrivateDnsEndpointListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribePrivateDnsEndpointListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePrivateDnsEndpointListRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribePrivateDnsEndpointListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribePrivateDnsEndpointListRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
