// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacesShrinkRequest extends TeaModel {
    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-tianjin-cmcc</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5t7z99n32gplriv</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>IPv6 addresses N of the ENI. You can specify multiple IPv6 addresses. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("Ipv6Address")
    public String ipv6AddressShrink;

    /**
     * <p>The ID of the network.</p>
     * 
     * <strong>example:</strong>
     * <p>n-2zeuphj08tt7q3brd****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The ID of the ENI.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-58z57orgmt6d1****</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    /**
     * <p>The name of the ENI.</p>
     * 
     * <strong>example:</strong>
     * <p>test-01</p>
     */
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    /**
     * <p>The page number of the returned page. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The primary IP address of the ENI.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("PrimaryIpAddress")
    public String primaryIpAddress;

    /**
     * <p>The ID of the security group to which the secondary ENI belongs. To query the details of secondary ENIs based on the ID of a security group, specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-5p1fg655nh68xyz9i***</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The status of the ENI. Valid values:</p>
     * <ul>
     * <li>Available: The ENI is available.</li>
     * <li>Attaching: The ENI is being attached to an instance.</li>
     * <li>InUse: The ENI is attached to an instance.</li>
     * <li>Detaching: The ENI is being detached from an instance.</li>
     * <li>Deleting: The ENI is being deleted.</li>
     * </ul>
     * <p>This parameter is empty by default, which indicates that ENIs in all states are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the ENI. Valid values:</p>
     * <ul>
     * <li>Primary: primary ENI.</li>
     * <li>Secondary: secondary ENI.</li>
     * </ul>
     * <p>This parameter is empty by default, which indicates that both primary and secondary ENIs are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Secondary</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-12345</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static DescribeNetworkInterfacesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfacesShrinkRequest self = new DescribeNetworkInterfacesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfacesShrinkRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeNetworkInterfacesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNetworkInterfacesShrinkRequest setIpv6AddressShrink(String ipv6AddressShrink) {
        this.ipv6AddressShrink = ipv6AddressShrink;
        return this;
    }
    public String getIpv6AddressShrink() {
        return this.ipv6AddressShrink;
    }

    public DescribeNetworkInterfacesShrinkRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public DescribeNetworkInterfacesShrinkRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public DescribeNetworkInterfacesShrinkRequest setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    public DescribeNetworkInterfacesShrinkRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkInterfacesShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkInterfacesShrinkRequest setPrimaryIpAddress(String primaryIpAddress) {
        this.primaryIpAddress = primaryIpAddress;
        return this;
    }
    public String getPrimaryIpAddress() {
        return this.primaryIpAddress;
    }

    public DescribeNetworkInterfacesShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeNetworkInterfacesShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeNetworkInterfacesShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeNetworkInterfacesShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
