// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacesRequest extends TeaModel {
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
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 10.</p>
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
     * <li>Primary</li>
     * <li>Secondary</li>
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

    public static DescribeNetworkInterfacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfacesRequest self = new DescribeNetworkInterfacesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfacesRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeNetworkInterfacesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNetworkInterfacesRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public DescribeNetworkInterfacesRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public DescribeNetworkInterfacesRequest setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    public DescribeNetworkInterfacesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkInterfacesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkInterfacesRequest setPrimaryIpAddress(String primaryIpAddress) {
        this.primaryIpAddress = primaryIpAddress;
        return this;
    }
    public String getPrimaryIpAddress() {
        return this.primaryIpAddress;
    }

    public DescribeNetworkInterfacesRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeNetworkInterfacesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeNetworkInterfacesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeNetworkInterfacesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
