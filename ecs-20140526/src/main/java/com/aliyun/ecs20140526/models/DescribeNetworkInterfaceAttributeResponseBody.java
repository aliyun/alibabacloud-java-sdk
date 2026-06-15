// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfaceAttributeResponseBody extends TeaModel {
    /**
     * <p>The elastic IP address that is associated with the primary private IP address of the elastic network interface.</p>
     */
    @NameInMap("AssociatedPublicIp")
    public DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp associatedPublicIp;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("Attachment")
    public DescribeNetworkInterfaceAttributeResponseBodyAttachment attachment;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("BondInterfaceSpecification")
    public DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecification bondInterfaceSpecification;

    /**
     * <p>The connection tracking configuration.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2865958.html">Connection timeout management</a>.</p>
     * <blockquote>
     * <p>This parameter is returned only if the <code>Attribute</code> parameter is set to <code>connectionTrackingConfiguration</code> in the request.</p>
     * </blockquote>
     */
    @NameInMap("ConnectionTrackingConfiguration")
    public DescribeNetworkInterfaceAttributeResponseBodyConnectionTrackingConfiguration connectionTrackingConfiguration;

    /**
     * <p>The time when the elastic network interface was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-25T12:31:31Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>Indicates whether to release the elastic network interface when the associated instance is released.</p>
     * <ul>
     * <li><p><code>true</code>: The interface is released.</p>
     * </li>
     * <li><p><code>false</code>: The interface is retained.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteOnRelease")
    public Boolean deleteOnRelease;

    /**
     * <p>The description of the elastic network interface.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is not publicly available.</p>
     */
    @NameInMap("EnhancedNetwork")
    public DescribeNetworkInterfaceAttributeResponseBodyEnhancedNetwork enhancedNetwork;

    /**
     * <p>The ID of the instance to which the elastic network interface is attached.</p>
     * <blockquote>
     * <p>This parameter is not returned if the elastic network interface is managed by another Alibaba Cloud service.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-bp1e2l6djkndyuli****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ipv4PrefixSets")
    public DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSets ipv4PrefixSets;

    @NameInMap("Ipv6PrefixSets")
    public DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSets ipv6PrefixSets;

    @NameInMap("Ipv6Sets")
    public DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets ipv6Sets;

    /**
     * <p>The MAC address of the elastic network interface.</p>
     * 
     * <strong>example:</strong>
     * <p>00:16:3e:12:<strong>:</strong></p>
     */
    @NameInMap("MacAddress")
    public String macAddress;

    /**
     * <p>The ID of the elastic network interface.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-bp125p95hhdhn3ot****</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    /**
     * <p>The name of the elastic network interface.</p>
     * 
     * <strong>example:</strong>
     * <p>my-eni-name</p>
     */
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    /**
     * <p>The communication parameters of the elastic network interface.</p>
     */
    @NameInMap("NetworkInterfaceTrafficConfig")
    public DescribeNetworkInterfaceAttributeResponseBodyNetworkInterfaceTrafficConfig networkInterfaceTrafficConfig;

    /**
     * <p>The communication mode of the elastic network interface. Valid values:</p>
     * <ul>
     * <li><p><code>Standard</code>: Uses TCP communication.</p>
     * </li>
     * <li><p><code>HighPerformance</code>: Uses the Elastic RDMA Interface (ERI) for RDMA communication.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The <code>HighPerformance</code> value is supported only by RDMA-enhanced instances, such as the c7re family.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("NetworkInterfaceTrafficMode")
    public String networkInterfaceTrafficMode;

    /**
     * <p>The ID of the account to which the elastic network interface belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The primary private IP address of the elastic network interface.</p>
     * 
     * <strong>example:</strong>
     * <p><code>10.1.**.**</code></p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("PrivateIpSets")
    public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets privateIpSets;

    /**
     * <p>The QoS settings.</p>
     */
    @NameInMap("QoSConfig")
    public DescribeNetworkInterfaceAttributeResponseBodyQoSConfig qoSConfig;

    /**
     * <p>The number of queues supported by the elastic network interface.</p>
     * <ul>
     * <li><p>For a primary network interface, this parameter returns the default number of queues for the instance type.</p>
     * </li>
     * <li><p>For a secondary network interface:</p>
     * <ul>
     * <li><p>If the interface is in the <code>InUse</code> state:</p>
     * <ul>
     * <li><p>If the queue number was not modified, the default value for the instance type is returned.</p>
     * </li>
     * <li><p>If the queue number was modified, the new value is returned.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If the secondary network interface is in the <code>Available</code> state:</p>
     * <ul>
     * <li><p>If the queue number was not modified, this parameter is not returned.</p>
     * </li>
     * <li><p>If the queue number was modified, the new value is returned.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("QueueNumber")
    public Integer queueNumber;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("QueuePairNumber")
    public Integer queuePairNumber;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the enterprise resource group to which the elastic network interface belongs. If you use this parameter to filter resources, the number of resources cannot exceed 1,000.</p>
     * <blockquote>
     * <p>Resources in the default resource group cannot be filtered.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityGroupIds")
    public DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds securityGroupIds;

    /**
     * <p>The ID of the virtual service provider (VSP) for the elastic network interface.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678910</p>
     */
    @NameInMap("ServiceID")
    public Long serviceID;

    /**
     * <p>Indicates whether the elastic network interface is managed by an Alibaba Cloud service or a VSP.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("SlaveInterfaceSpecification")
    public DescribeNetworkInterfaceAttributeResponseBodySlaveInterfaceSpecification slaveInterfaceSpecification;

    /**
     * <p>This parameter is not publicly available.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceDestCheck")
    public Boolean sourceDestCheck;

    /**
     * <p>The status of the elastic network interface. Valid values:</p>
     * <ul>
     * <li><p><code>Available</code>: The elastic network interface is available.</p>
     * </li>
     * <li><p><code>Attaching</code>: The elastic network interface is being attached.</p>
     * </li>
     * <li><p><code>InUse</code>: The elastic network interface is attached.</p>
     * </li>
     * <li><p><code>Detaching</code>: The elastic network interface is being detached.</p>
     * </li>
     * <li><p><code>Deleting</code>: The elastic network interface is being deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public DescribeNetworkInterfaceAttributeResponseBodyTags tags;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("TcpOptionAddressEnabled")
    public String tcpOptionAddressEnabled;

    /**
     * <p>The type of the elastic network interface. Valid values:</p>
     * <ul>
     * <li><p><code>Primary</code>: The primary network interface.</p>
     * </li>
     * <li><p><code>Secondary</code>: The secondary network interface.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Secondary</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the vSwitch to which the elastic network interface is connected.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1s5fnvk4gn2tws0****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC to which the elastic network interface belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp67acfmxazb4p****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeNetworkInterfaceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfaceAttributeResponseBody self = new DescribeNetworkInterfaceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfaceAttributeResponseBody setAssociatedPublicIp(DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp associatedPublicIp) {
        this.associatedPublicIp = associatedPublicIp;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp getAssociatedPublicIp() {
        return this.associatedPublicIp;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setAttachment(DescribeNetworkInterfaceAttributeResponseBodyAttachment attachment) {
        this.attachment = attachment;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyAttachment getAttachment() {
        return this.attachment;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setBondInterfaceSpecification(DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecification bondInterfaceSpecification) {
        this.bondInterfaceSpecification = bondInterfaceSpecification;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecification getBondInterfaceSpecification() {
        return this.bondInterfaceSpecification;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setConnectionTrackingConfiguration(DescribeNetworkInterfaceAttributeResponseBodyConnectionTrackingConfiguration connectionTrackingConfiguration) {
        this.connectionTrackingConfiguration = connectionTrackingConfiguration;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyConnectionTrackingConfiguration getConnectionTrackingConfiguration() {
        return this.connectionTrackingConfiguration;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setDeleteOnRelease(Boolean deleteOnRelease) {
        this.deleteOnRelease = deleteOnRelease;
        return this;
    }
    public Boolean getDeleteOnRelease() {
        return this.deleteOnRelease;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setEnhancedNetwork(DescribeNetworkInterfaceAttributeResponseBodyEnhancedNetwork enhancedNetwork) {
        this.enhancedNetwork = enhancedNetwork;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyEnhancedNetwork getEnhancedNetwork() {
        return this.enhancedNetwork;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setIpv4PrefixSets(DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSets ipv4PrefixSets) {
        this.ipv4PrefixSets = ipv4PrefixSets;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSets getIpv4PrefixSets() {
        return this.ipv4PrefixSets;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setIpv6PrefixSets(DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSets ipv6PrefixSets) {
        this.ipv6PrefixSets = ipv6PrefixSets;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSets getIpv6PrefixSets() {
        return this.ipv6PrefixSets;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setIpv6Sets(DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets ipv6Sets) {
        this.ipv6Sets = ipv6Sets;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets getIpv6Sets() {
        return this.ipv6Sets;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setNetworkInterfaceTrafficConfig(DescribeNetworkInterfaceAttributeResponseBodyNetworkInterfaceTrafficConfig networkInterfaceTrafficConfig) {
        this.networkInterfaceTrafficConfig = networkInterfaceTrafficConfig;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyNetworkInterfaceTrafficConfig getNetworkInterfaceTrafficConfig() {
        return this.networkInterfaceTrafficConfig;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
        this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
        return this;
    }
    public String getNetworkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setPrivateIpSets(DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets privateIpSets) {
        this.privateIpSets = privateIpSets;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets getPrivateIpSets() {
        return this.privateIpSets;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setQoSConfig(DescribeNetworkInterfaceAttributeResponseBodyQoSConfig qoSConfig) {
        this.qoSConfig = qoSConfig;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyQoSConfig getQoSConfig() {
        return this.qoSConfig;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setQueueNumber(Integer queueNumber) {
        this.queueNumber = queueNumber;
        return this;
    }
    public Integer getQueueNumber() {
        return this.queueNumber;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setQueuePairNumber(Integer queuePairNumber) {
        this.queuePairNumber = queuePairNumber;
        return this;
    }
    public Integer getQueuePairNumber() {
        return this.queuePairNumber;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setSecurityGroupIds(DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setServiceID(Long serviceID) {
        this.serviceID = serviceID;
        return this;
    }
    public Long getServiceID() {
        return this.serviceID;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setSlaveInterfaceSpecification(DescribeNetworkInterfaceAttributeResponseBodySlaveInterfaceSpecification slaveInterfaceSpecification) {
        this.slaveInterfaceSpecification = slaveInterfaceSpecification;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodySlaveInterfaceSpecification getSlaveInterfaceSpecification() {
        return this.slaveInterfaceSpecification;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }
    public Boolean getSourceDestCheck() {
        return this.sourceDestCheck;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setTags(DescribeNetworkInterfaceAttributeResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setTcpOptionAddressEnabled(String tcpOptionAddressEnabled) {
        this.tcpOptionAddressEnabled = tcpOptionAddressEnabled;
        return this;
    }
    public String getTcpOptionAddressEnabled() {
        return this.tcpOptionAddressEnabled;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp extends TeaModel {
        /**
         * <p>The ID of the elastic IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p><code>116.62.**.**</code></p>
         */
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        public static DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp self = new DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds extends TeaModel {
        @NameInMap("MemberNetworkInterfaceId")
        public java.util.List<String> memberNetworkInterfaceId;

        public static DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds self = new DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds setMemberNetworkInterfaceId(java.util.List<String> memberNetworkInterfaceId) {
            this.memberNetworkInterfaceId = memberNetworkInterfaceId;
            return this;
        }
        public java.util.List<String> getMemberNetworkInterfaceId() {
            return this.memberNetworkInterfaceId;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyAttachment extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("DeviceIndex")
        public Integer deviceIndex;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MemberNetworkInterfaceIds")
        public DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds memberNetworkInterfaceIds;

        /**
         * <p>The index of the physical network card to which the elastic network interface is attached.</p>
         * <ul>
         * <li><p>This parameter is not returned if the elastic network interface is <code>Available</code>, or if no index was specified during attachment.</p>
         * </li>
         * <li><p>If the elastic network interface is <code>InUse</code> and an index was specified during attachment, this parameter returns the index of the physical network card.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetworkCardIndex")
        public Integer networkCardIndex;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("TrunkNetworkInterfaceId")
        public String trunkNetworkInterfaceId;

        public static DescribeNetworkInterfaceAttributeResponseBodyAttachment build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyAttachment self = new DescribeNetworkInterfaceAttributeResponseBodyAttachment();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAttachment setDeviceIndex(Integer deviceIndex) {
            this.deviceIndex = deviceIndex;
            return this;
        }
        public Integer getDeviceIndex() {
            return this.deviceIndex;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAttachment setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAttachment setMemberNetworkInterfaceIds(DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds memberNetworkInterfaceIds) {
            this.memberNetworkInterfaceIds = memberNetworkInterfaceIds;
            return this;
        }
        public DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds getMemberNetworkInterfaceIds() {
            return this.memberNetworkInterfaceIds;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAttachment setNetworkCardIndex(Integer networkCardIndex) {
            this.networkCardIndex = networkCardIndex;
            return this;
        }
        public Integer getNetworkCardIndex() {
            return this.networkCardIndex;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAttachment setTrunkNetworkInterfaceId(String trunkNetworkInterfaceId) {
            this.trunkNetworkInterfaceId = trunkNetworkInterfaceId;
            return this;
        }
        public String getTrunkNetworkInterfaceId() {
            return this.trunkNetworkInterfaceId;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecificationSlaveInterfaceSpecificationSet extends TeaModel {
        @NameInMap("BondNetworkInterfaceId")
        public String bondNetworkInterfaceId;

        @NameInMap("SlaveNetworkInterfaceId")
        public String slaveNetworkInterfaceId;

        @NameInMap("WorkState")
        public String workState;

        public static DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecificationSlaveInterfaceSpecificationSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecificationSlaveInterfaceSpecificationSet self = new DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecificationSlaveInterfaceSpecificationSet();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecificationSlaveInterfaceSpecificationSet setBondNetworkInterfaceId(String bondNetworkInterfaceId) {
            this.bondNetworkInterfaceId = bondNetworkInterfaceId;
            return this;
        }
        public String getBondNetworkInterfaceId() {
            return this.bondNetworkInterfaceId;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecificationSlaveInterfaceSpecificationSet setSlaveNetworkInterfaceId(String slaveNetworkInterfaceId) {
            this.slaveNetworkInterfaceId = slaveNetworkInterfaceId;
            return this;
        }
        public String getSlaveNetworkInterfaceId() {
            return this.slaveNetworkInterfaceId;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecificationSlaveInterfaceSpecificationSet setWorkState(String workState) {
            this.workState = workState;
            return this;
        }
        public String getWorkState() {
            return this.workState;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecification extends TeaModel {
        @NameInMap("SlaveInterfaceSpecificationSet")
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecificationSlaveInterfaceSpecificationSet> slaveInterfaceSpecificationSet;

        public static DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecification build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecification self = new DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecification();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecification setSlaveInterfaceSpecificationSet(java.util.List<DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecificationSlaveInterfaceSpecificationSet> slaveInterfaceSpecificationSet) {
            this.slaveInterfaceSpecificationSet = slaveInterfaceSpecificationSet;
            return this;
        }
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecificationSlaveInterfaceSpecificationSet> getSlaveInterfaceSpecificationSet() {
            return this.slaveInterfaceSpecificationSet;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecification extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("BondMode")
        public String bondMode;

        @NameInMap("SlaveInterfaceSpecification")
        public DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecification slaveInterfaceSpecification;

        public static DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecification build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecification self = new DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecification();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecification setBondMode(String bondMode) {
            this.bondMode = bondMode;
            return this;
        }
        public String getBondMode() {
            return this.bondMode;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecification setSlaveInterfaceSpecification(DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecification slaveInterfaceSpecification) {
            this.slaveInterfaceSpecification = slaveInterfaceSpecification;
            return this;
        }
        public DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecificationSlaveInterfaceSpecification getSlaveInterfaceSpecification() {
            return this.slaveInterfaceSpecification;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyConnectionTrackingConfiguration extends TeaModel {
        /**
         * <p>The timeout period for TCP connections in the <code>TIME_WAIT</code> and <code>FIN-WAIT-2</code> states. Unit: seconds. Valid values: an integer from 3 to 15.</p>
         * <blockquote>
         * <p>For ECS instances used with a Network Load Balancer (NLB) or Classic Load Balancer (CLB), the default timeout for connections in the <code>TIME_WAIT</code> state is 15 seconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TcpClosedAndTimeWaitTimeout")
        public Integer tcpClosedAndTimeWaitTimeout;

        /**
         * <p>The timeout period for established TCP connections. Unit: seconds. Valid values: 30, 60, 80, 100, 200, 300, 500, 700, and 910.</p>
         * 
         * <strong>example:</strong>
         * <p>910</p>
         */
        @NameInMap("TcpEstablishedTimeout")
        public Integer tcpEstablishedTimeout;

        /**
         * <p>The timeout period for UDP streams. Unit: seconds. Valid values: 10, 20, 30, 60, 80, and 100.</p>
         * <blockquote>
         * <p>For ECS instances used with a Network Load Balancer (NLB) or Classic Load Balancer (CLB), the default UDP timeout is 100 seconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UdpTimeout")
        public Integer udpTimeout;

        public static DescribeNetworkInterfaceAttributeResponseBodyConnectionTrackingConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyConnectionTrackingConfiguration self = new DescribeNetworkInterfaceAttributeResponseBodyConnectionTrackingConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyConnectionTrackingConfiguration setTcpClosedAndTimeWaitTimeout(Integer tcpClosedAndTimeWaitTimeout) {
            this.tcpClosedAndTimeWaitTimeout = tcpClosedAndTimeWaitTimeout;
            return this;
        }
        public Integer getTcpClosedAndTimeWaitTimeout() {
            return this.tcpClosedAndTimeWaitTimeout;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyConnectionTrackingConfiguration setTcpEstablishedTimeout(Integer tcpEstablishedTimeout) {
            this.tcpEstablishedTimeout = tcpEstablishedTimeout;
            return this;
        }
        public Integer getTcpEstablishedTimeout() {
            return this.tcpEstablishedTimeout;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyConnectionTrackingConfiguration setUdpTimeout(Integer udpTimeout) {
            this.udpTimeout = udpTimeout;
            return this;
        }
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyEnhancedNetwork extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableRss")
        public Boolean enableRss;

        /**
         * <p>This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSriov")
        public Boolean enableSriov;

        @NameInMap("VirtualFunctionQuantity")
        public Integer virtualFunctionQuantity;

        @NameInMap("VirtualFunctionTotalQueueNumber")
        public Integer virtualFunctionTotalQueueNumber;

        public static DescribeNetworkInterfaceAttributeResponseBodyEnhancedNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyEnhancedNetwork self = new DescribeNetworkInterfaceAttributeResponseBodyEnhancedNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyEnhancedNetwork setEnableRss(Boolean enableRss) {
            this.enableRss = enableRss;
            return this;
        }
        public Boolean getEnableRss() {
            return this.enableRss;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyEnhancedNetwork setEnableSriov(Boolean enableSriov) {
            this.enableSriov = enableSriov;
            return this;
        }
        public Boolean getEnableSriov() {
            return this.enableSriov;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyEnhancedNetwork setVirtualFunctionQuantity(Integer virtualFunctionQuantity) {
            this.virtualFunctionQuantity = virtualFunctionQuantity;
            return this;
        }
        public Integer getVirtualFunctionQuantity() {
            return this.virtualFunctionQuantity;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyEnhancedNetwork setVirtualFunctionTotalQueueNumber(Integer virtualFunctionTotalQueueNumber) {
            this.virtualFunctionTotalQueueNumber = virtualFunctionTotalQueueNumber;
            return this;
        }
        public Integer getVirtualFunctionTotalQueueNumber() {
            return this.virtualFunctionTotalQueueNumber;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSetsIpv4PrefixSet extends TeaModel {
        @NameInMap("Ipv4Prefix")
        public String ipv4Prefix;

        public static DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSetsIpv4PrefixSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSetsIpv4PrefixSet self = new DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSetsIpv4PrefixSet();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSetsIpv4PrefixSet setIpv4Prefix(String ipv4Prefix) {
            this.ipv4Prefix = ipv4Prefix;
            return this;
        }
        public String getIpv4Prefix() {
            return this.ipv4Prefix;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSets extends TeaModel {
        @NameInMap("Ipv4PrefixSet")
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSetsIpv4PrefixSet> ipv4PrefixSet;

        public static DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSets self = new DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSets setIpv4PrefixSet(java.util.List<DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSetsIpv4PrefixSet> ipv4PrefixSet) {
            this.ipv4PrefixSet = ipv4PrefixSet;
            return this;
        }
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSetsIpv4PrefixSet> getIpv4PrefixSet() {
            return this.ipv4PrefixSet;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSetsIpv6PrefixSet extends TeaModel {
        @NameInMap("Ipv6Prefix")
        public String ipv6Prefix;

        public static DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSetsIpv6PrefixSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSetsIpv6PrefixSet self = new DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSetsIpv6PrefixSet();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSetsIpv6PrefixSet setIpv6Prefix(String ipv6Prefix) {
            this.ipv6Prefix = ipv6Prefix;
            return this;
        }
        public String getIpv6Prefix() {
            return this.ipv6Prefix;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSets extends TeaModel {
        @NameInMap("Ipv6PrefixSet")
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSetsIpv6PrefixSet> ipv6PrefixSet;

        public static DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSets self = new DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSets setIpv6PrefixSet(java.util.List<DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSetsIpv6PrefixSet> ipv6PrefixSet) {
            this.ipv6PrefixSet = ipv6PrefixSet;
            return this;
        }
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSetsIpv6PrefixSet> getIpv6PrefixSet() {
            return this.ipv6PrefixSet;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set extends TeaModel {
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        public static DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set self = new DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets extends TeaModel {
        @NameInMap("Ipv6Set")
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set> ipv6Set;

        public static DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets self = new DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets setIpv6Set(java.util.List<DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set> ipv6Set) {
            this.ipv6Set = ipv6Set;
            return this;
        }
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set> getIpv6Set() {
            return this.ipv6Set;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyNetworkInterfaceTrafficConfig extends TeaModel {
        /**
         * <p>The communication mode of the elastic network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The number of queues for the elastic network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueueNumber")
        public Integer queueNumber;

        /**
         * <p>The number of queue pairs for the RDMA-enabled elastic network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueuePairNumber")
        public Integer queuePairNumber;

        public static DescribeNetworkInterfaceAttributeResponseBodyNetworkInterfaceTrafficConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyNetworkInterfaceTrafficConfig self = new DescribeNetworkInterfaceAttributeResponseBodyNetworkInterfaceTrafficConfig();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyNetworkInterfaceTrafficConfig setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyNetworkInterfaceTrafficConfig setQueueNumber(Integer queueNumber) {
            this.queueNumber = queueNumber;
            return this;
        }
        public Integer getQueueNumber() {
            return this.queueNumber;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyNetworkInterfaceTrafficConfig setQueuePairNumber(Integer queuePairNumber) {
            this.queuePairNumber = queuePairNumber;
            return this;
        }
        public Integer getQueuePairNumber() {
            return this.queuePairNumber;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp extends TeaModel {
        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        public static DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp self = new DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet extends TeaModel {
        @NameInMap("AssociatedPublicIp")
        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp associatedPublicIp;

        @NameInMap("Primary")
        public Boolean primary;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        public static DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet self = new DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet setAssociatedPublicIp(DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp associatedPublicIp) {
            this.associatedPublicIp = associatedPublicIp;
            return this;
        }
        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet> privateIpSet;

        public static DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets self = new DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets setPrivateIpSet(java.util.List<DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet> privateIpSet) {
            this.privateIpSet = privateIpSet;
            return this;
        }
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyQoSConfigQoS extends TeaModel {
        /**
         * <p>The maximum inbound bandwidth on the internal network.</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("BandwidthRx")
        public Long bandwidthRx;

        /**
         * <p>The maximum outbound bandwidth on the internal network.</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("BandwidthTx")
        public Long bandwidthTx;

        /**
         * <p>The maximum number of connections.</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("ConcurrentConnections")
        public Long concurrentConnections;

        /**
         * <p>The inbound packet transmission rate on the internal network. Unit: packets per second (pps).</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("PpsRx")
        public Long ppsRx;

        /**
         * <p>The outbound packet transmission rate on the internal network. Unit: packets per second (pps).</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("PpsTx")
        public Long ppsTx;

        public static DescribeNetworkInterfaceAttributeResponseBodyQoSConfigQoS build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyQoSConfigQoS self = new DescribeNetworkInterfaceAttributeResponseBodyQoSConfigQoS();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyQoSConfigQoS setBandwidthRx(Long bandwidthRx) {
            this.bandwidthRx = bandwidthRx;
            return this;
        }
        public Long getBandwidthRx() {
            return this.bandwidthRx;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyQoSConfigQoS setBandwidthTx(Long bandwidthTx) {
            this.bandwidthTx = bandwidthTx;
            return this;
        }
        public Long getBandwidthTx() {
            return this.bandwidthTx;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyQoSConfigQoS setConcurrentConnections(Long concurrentConnections) {
            this.concurrentConnections = concurrentConnections;
            return this;
        }
        public Long getConcurrentConnections() {
            return this.concurrentConnections;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyQoSConfigQoS setPpsRx(Long ppsRx) {
            this.ppsRx = ppsRx;
            return this;
        }
        public Long getPpsRx() {
            return this.ppsRx;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyQoSConfigQoS setPpsTx(Long ppsTx) {
            this.ppsTx = ppsTx;
            return this;
        }
        public Long getPpsTx() {
            return this.ppsTx;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyQoSConfig extends TeaModel {
        /**
         * <p>Indicates whether QoS is enabled.</p>
         */
        @NameInMap("EnableQoS")
        public Boolean enableQoS;

        /**
         * <p>The QoS settings.</p>
         */
        @NameInMap("QoS")
        public DescribeNetworkInterfaceAttributeResponseBodyQoSConfigQoS qoS;

        public static DescribeNetworkInterfaceAttributeResponseBodyQoSConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyQoSConfig self = new DescribeNetworkInterfaceAttributeResponseBodyQoSConfig();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyQoSConfig setEnableQoS(Boolean enableQoS) {
            this.enableQoS = enableQoS;
            return this;
        }
        public Boolean getEnableQoS() {
            return this.enableQoS;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyQoSConfig setQoS(DescribeNetworkInterfaceAttributeResponseBodyQoSConfigQoS qoS) {
            this.qoS = qoS;
            return this;
        }
        public DescribeNetworkInterfaceAttributeResponseBodyQoSConfigQoS getQoS() {
            return this.qoS;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds self = new DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodySlaveInterfaceSpecification extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("BondNetworkInterfaceId")
        public String bondNetworkInterfaceId;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("SlaveNetworkInterfaceId")
        public String slaveNetworkInterfaceId;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("WorkState")
        public String workState;

        public static DescribeNetworkInterfaceAttributeResponseBodySlaveInterfaceSpecification build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodySlaveInterfaceSpecification self = new DescribeNetworkInterfaceAttributeResponseBodySlaveInterfaceSpecification();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodySlaveInterfaceSpecification setBondNetworkInterfaceId(String bondNetworkInterfaceId) {
            this.bondNetworkInterfaceId = bondNetworkInterfaceId;
            return this;
        }
        public String getBondNetworkInterfaceId() {
            return this.bondNetworkInterfaceId;
        }

        public DescribeNetworkInterfaceAttributeResponseBodySlaveInterfaceSpecification setSlaveNetworkInterfaceId(String slaveNetworkInterfaceId) {
            this.slaveNetworkInterfaceId = slaveNetworkInterfaceId;
            return this;
        }
        public String getSlaveNetworkInterfaceId() {
            return this.slaveNetworkInterfaceId;
        }

        public DescribeNetworkInterfaceAttributeResponseBodySlaveInterfaceSpecification setWorkState(String workState) {
            this.workState = workState;
            return this;
        }
        public String getWorkState() {
            return this.workState;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeNetworkInterfaceAttributeResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyTagsTag self = new DescribeNetworkInterfaceAttributeResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyTagsTag> tag;

        public static DescribeNetworkInterfaceAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyTags self = new DescribeNetworkInterfaceAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyTags setTag(java.util.List<DescribeNetworkInterfaceAttributeResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
