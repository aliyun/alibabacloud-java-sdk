// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribePackIpListRequest extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS Origin instance to query.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> to query the IDs of all Anti-DDoS Origin instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-n6w1r7nz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The protected IP address to query.</p>
     * 
     * <strong>example:</strong>
     * <p>47.98.XX.XX</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The UID of the member account.</p>
     * 
     * <strong>example:</strong>
     * <p>170858869679****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of protected IP addresses to return on each page. The maximum value is 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the cloud asset to which the protected IP address belongs. Valid values:</p>
     * <ul>
     * <li><p><strong>ECS</strong>: an Elastic Compute Service (ECS) instance.</p>
     * </li>
     * <li><p><strong>SLB</strong>: a Classic Load Balancer (CLB) instance.</p>
     * </li>
     * <li><p><strong>EIP</strong>: an Elastic IP Address (EIP) instance. Because Application Load Balancer (ALB) instances use EIPs, query the public IP address of an ALB instance using the EIP.</p>
     * </li>
     * <li><p><strong>WAF</strong>: a Web Application Firewall (WAF) instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The region ID of the Anti-DDoS Origin instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> to query the IDs of all regions that Anti-DDoS Origin supports.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.</p>
     * <p>If you do not set this parameter, the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    @Deprecated
    public String resourceGroupId;

    public static DescribePackIpListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePackIpListRequest self = new DescribePackIpListRequest();
        return TeaModel.build(map, self);
    }

    public DescribePackIpListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribePackIpListRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribePackIpListRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribePackIpListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribePackIpListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePackIpListRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public DescribePackIpListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    @Deprecated
    public DescribePackIpListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
