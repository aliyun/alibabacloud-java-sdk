// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfaceAttributeResponseBody extends TeaModel {
    /**
     * <p>The elastic IP address (EIP) that is associated with the secondary private IP address of the ENI.</p>
     */
    @NameInMap("AssociatedPublicIp")
    public DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp associatedPublicIp;

    /**
     * <p>> This parameter is in invitational preview and is unavailable.</p>
     */
    @NameInMap("Attachment")
    public DescribeNetworkInterfaceAttributeResponseBodyAttachment attachment;

    /**
     * <p>> This parameter is in invitational preview and is unavailable.</p>
     */
    @NameInMap("BondInterfaceSpecification")
    public DescribeNetworkInterfaceAttributeResponseBodyBondInterfaceSpecification bondInterfaceSpecification;

    /**
     * <p>The time when the ENI was created.</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The description of the ENI.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the instance to which the ENI is attached.</p>
     * <br>
     * <p>> If the ENI is managed and controlled by other Alibaba Cloud services, no instance ID is returned.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IPv4 address prefixes of the ENI.</p>
     */
    @NameInMap("Ipv4PrefixSets")
    public DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSets ipv4PrefixSets;

    /**
     * <p>The IPv6 address prefixes of the ENI.</p>
     */
    @NameInMap("Ipv6PrefixSets")
    public DescribeNetworkInterfaceAttributeResponseBodyIpv6PrefixSets ipv6PrefixSets;

    /**
     * <p>The IPv6 addresses of the ENI.</p>
     */
    @NameInMap("Ipv6Sets")
    public DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets ipv6Sets;

    /**
     * <p>The media access control (MAC) address of the ENI.</p>
     */
    @NameInMap("MacAddress")
    public String macAddress;

    /**
     * <p>The ID of the ENI.</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    /**
     * <p>The name of the ENI.</p>
     */
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    /**
     * <p>The communication mode of the ENI. Valid values:</p>
     * <br>
     * <p>*   Standard: The TCP communication mode is used.</p>
     * <p>*   HighPerformance: Elastic RDMA Interface (ERI) is enabled and the remote direct memory access (RDMA) communication mode is used.</p>
     * <br>
     * <p>> This parameter can have a value of HighPerformance only when the ENI is attached to a c7re RDMA-enhanced instance that resides in Beijing Zone K.</p>
     */
    @NameInMap("NetworkInterfaceTrafficMode")
    public String networkInterfaceTrafficMode;

    /**
     * <p>The ID of the account to which the ENI belongs.</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The private IP address of the ENI.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>Details about the private IP addresses.</p>
     */
    @NameInMap("PrivateIpSets")
    public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets privateIpSets;

    /**
     * <p>The number of queues supported by the ENI.</p>
     * <br>
     * <p>*   For a primary ENI: The default number of queues that the instance type supports for the ENI is returned.</p>
     * <br>
     * <p>*   For a secondary ENI:</p>
     * <br>
     * <p>    *   When the ENI is in the InUse state, the following situations occur for the QueueNumber parameter:</p>
     * <br>
     * <p>        *   If the number of queues supported by the ENI has not been modified, the default number of queues that the instance type supports for the ENI is returned.</p>
     * <p>        *   If the number of queues supported by the ENI has been modified, the new number of queues is returned.</p>
     * <br>
     * <p>    *   When the ENI is in the Available state, the following situations occur for the QueueNumber parameter:</p>
     * <br>
     * <p>        *   If the number of queues supported by the ENI has not been modified, the return value is empty.</p>
     * <p>        *   If the number of queues supported by the ENI has been modified, the new number of queues is returned.</p>
     */
    @NameInMap("QueueNumber")
    public Integer queueNumber;

    /**
     * <p>> This parameter is in invitational preview and is unavailable.</p>
     */
    @NameInMap("QueuePairNumber")
    public Integer queuePairNumber;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the instance belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.</p>
     * <br>
     * <p>> Resources in the default resource group are displayed in the response regardless of how this parameter is set.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IDs of the security groups to which the ENI belongs.</p>
     */
    @NameInMap("SecurityGroupIds")
    public DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds securityGroupIds;

    /**
     * <p>The ID of the distributor to which the ENI belongs.</p>
     */
    @NameInMap("ServiceID")
    public Long serviceID;

    /**
     * <p>Indicates whether the user of the ENI is an Alibaba Cloud service or a distributor.</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>> This parameter is in invitational preview and is unavailable.</p>
     */
    @NameInMap("SlaveInterfaceSpecification")
    public DescribeNetworkInterfaceAttributeResponseBodySlaveInterfaceSpecification slaveInterfaceSpecification;

    /**
     * <p>The state of the ENI. Valid values:</p>
     * <br>
     * <p>*   Available: The ENI is not attached to an instance.</p>
     * <p>*   Attaching: The ENI is being attached to an instance.</p>
     * <p>*   InUse: The ENI is attached to an instance.</p>
     * <p>*   Detaching: The ENI is being detached from an instance.</p>
     * <p>*   Deleting: The ENI is being deleted.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that all states are queried.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the ENI.</p>
     */
    @NameInMap("Tags")
    public DescribeNetworkInterfaceAttributeResponseBodyTags tags;

    /**
     * <p>The type of the ENI. Valid values:</p>
     * <br>
     * <p>*   Primary</p>
     * <p>*   Secondary</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the vSwitch to which the ENI is connected.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the ENI belongs.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone.</p>
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

    public DescribeNetworkInterfaceAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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
         * <p>The ID of the EIP.</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The EIP.</p>
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
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
        @NameInMap("DeviceIndex")
        public Integer deviceIndex;

        /**
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
        @NameInMap("MemberNetworkInterfaceIds")
        public DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds memberNetworkInterfaceIds;

        /**
         * <p>网卡挂载指定的物理网卡索引。</p>
         * <p>- 如果网卡是未挂载（Available）状态或者挂载时未指定索引，则不返回此值。</p>
         * <p>- 如果网卡是已挂载（InUse）状态且挂载时指定，此值表示网卡挂载指定的物理网卡索引。</p>
         */
        @NameInMap("NetworkCardIndex")
        public Integer networkCardIndex;

        /**
         * <p>> This parameter is in invitational preview and is unavailable.</p>
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
        /**
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
        @NameInMap("BondNetworkInterfaceId")
        public String bondNetworkInterfaceId;

        /**
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
        @NameInMap("SlaveNetworkInterfaceId")
        public String slaveNetworkInterfaceId;

        /**
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
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
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
        @NameInMap("BondMode")
        public String bondMode;

        /**
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
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

    public static class DescribeNetworkInterfaceAttributeResponseBodyIpv4PrefixSetsIpv4PrefixSet extends TeaModel {
        /**
         * <p>The IPv4 address prefix.</p>
         */
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
        /**
         * <p>The IPv6 address prefix.</p>
         */
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
        /**
         * <p>The IPv6 address assigned to the ENI.</p>
         */
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

    public static class DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp extends TeaModel {
        /**
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The EIP.</p>
         */
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
        /**
         * <p>The EIP that is associated with the secondary private IP address of the ENI.</p>
         */
        @NameInMap("AssociatedPublicIp")
        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp associatedPublicIp;

        /**
         * <p>Indicates whether the IP address is the primary private IP address. Valid values:</p>
         * <br>
         * <p>*   true: The IP address is the primary private IP address.</p>
         * <p>*   false: The IP address is the secondary private IP address.</p>
         */
        @NameInMap("Primary")
        public Boolean primary;

        /**
         * <p>The private IP address of the ENI.</p>
         */
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
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
        @NameInMap("BondNetworkInterfaceId")
        public String bondNetworkInterfaceId;

        /**
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
        @NameInMap("SlaveNetworkInterfaceId")
        public String slaveNetworkInterfaceId;

        /**
         * <p>> This parameter is in invitational preview and is unavailable.</p>
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
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         */
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
