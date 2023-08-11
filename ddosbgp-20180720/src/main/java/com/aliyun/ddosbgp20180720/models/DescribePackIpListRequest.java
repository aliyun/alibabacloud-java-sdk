// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribePackIpListRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.</p>
     * <br>
     * <p>If you do not specify this parameter, the instance belongs to the default resource group.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("Ip")
    public String ip;

    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribePackIpList**.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The type of the cloud asset to which the protected IP address to query belongs. Valid values:</p>
     * <br>
     * <p>*   **ECS**: an Elastic Compute Service (ECS) instance.</p>
     * <p>*   **SLB**: a Classic Load Balancer (CLB) instance, originally called a Server Load Balancer (SLB) instance.</p>
     * <p>*   **EIP**: an elastic IP address (EIP). An Internet-facing Application Load Balancer (ALB) instance uses an EIP. If the IP address belongs to the Internet-facing ALB instance, set this parameter to EIP.</p>
     * <p>*   **WAF**: a Web Application Firewall (WAF) instance.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The protected IP address to query.</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The list of IP addresses that are protected by the Anti-DDoS Origin instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the cloud asset to which the IP address belongs. Valid values:</p>
     * <br>
     * <p>*   **ECS**: an ECS instance.</p>
     * <p>*   **SLB**: an CLB instance.</p>
     * <p>*   **EIP**: an EIP. If the IP address belongs to an ALB instance, the value EIP is returned.</p>
     * <p>*   **WAF**: a WAF instance.</p>
     */
    @NameInMap("ResourceGroupId")
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

    public DescribePackIpListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
