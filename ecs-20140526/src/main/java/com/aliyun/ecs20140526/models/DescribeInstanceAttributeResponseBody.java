// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster to which the instance belongs. </p>
     * <br>
     * <p>>  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of vCPUs.</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. For more information, see [ISO 8601](https://icms.alibaba-inc.com/content/ecs/api?l=1&m=277&n=10049).</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The performance mode of the burstable instance. Valid values:</p>
     * <br>
     * <p>- Standard: standard mode. For more information, see the "Standard mode" section in [Overview](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/burstable-instance-types-overview#section-svb-w9d-dju).</p>
     * <p>- Unlimited: unlimited mode. For more information, see the "Unlimited mode" section in [Overview](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/burstable-instance-types-overview#section-svb-w9d-dju).</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>Details about the dedicated host. It is an array that consists of the DedicatedHostClusterId, DedicatedHostId, and DedicatedHostName parameters.</p>
     */
    @NameInMap("DedicatedHostAttribute")
    public DescribeInstanceAttributeResponseBodyDedicatedHostAttribute dedicatedHostAttribute;

    /**
     * <p>The description of the instance.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Details about the elastic IP address (EIP) associated with the instance.</p>
     */
    @NameInMap("EipAddress")
    public DescribeInstanceAttributeResponseBodyEipAddress eipAddress;

    @NameInMap("EnableJumboFrame")
    public Boolean enableJumboFrame;

    /**
     * <p>The time when the instance expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. For more information, see [ISO 8601](https://icms.alibaba-inc.com/content/ecs/api?l=1&m=277&n=10049).</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The hostname of the instance.</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the image that the instance is running.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The internal IP address of the instance located in the classic network.</p>
     */
    @NameInMap("InnerIpAddress")
    public DescribeInstanceAttributeResponseBodyInnerIpAddress innerIpAddress;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>- PrePaid: subscription</p>
     * <p>- PostPaid: pay-as-you-go</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The ID of instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The network type of the instance. Valid values: </p>
     * <br>
     * <p>- classic</p>
     * <p>- vpc</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The instance type of the instance.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <br>
     * <p>- PayByBandwidth: pay-by-bandwidth</p>
     * <p>- PayByTraffic: pay-by-traffic</p>
     * <br>
     * <p>>  When the **pay-by-traffic** billing method for network usage is used, the maximum inbound and outbound bandwidth values are used as upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instance, use the **pay-by-bandwidth** billing method for network usage.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum inbound public bandwidth. Unit: Mbit/s.</p>
     */
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s.</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Indicates whether the instance is I/O optimized.</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The memory size of the instance. Unit: MiB.</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The reason why the instance was locked. Valid values:</p>
     * <br>
     * <p>- financial: The instance was locked due to overdue payments.</p>
     * <p>- security: The instance was locked due to security reasons.</p>
     * <p>- recycling: The preemptible instance was locked and pending release.</p>
     * <p>- dedicatedhostfinancial: The instance was locked due to overdue payments for the dedicated host.</p>
     * <p>- refunded: The instance was locked because a refund was made for the instance.</p>
     */
    @NameInMap("OperationLocks")
    public DescribeInstanceAttributeResponseBodyOperationLocks operationLocks;

    /**
     * <p>The public IP address of the instance.</p>
     */
    @NameInMap("PublicIpAddress")
    public DescribeInstanceAttributeResponseBodyPublicIpAddress publicIpAddress;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IDs of the security groups to which the instance belongs.</p>
     */
    @NameInMap("SecurityGroupIds")
    public DescribeInstanceAttributeResponseBodySecurityGroupIds securityGroupIds;

    /**
     * <p>The serial number of the instance.</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>The state of the instance. Valid values:</p>
     * <br>
     * <p>- Pending: The instance is being created.</p>
     * <p>- Running: The instance is running.</p>
     * <p>- Starting: The instance is being started.</p>
     * <p>- Stopping: The instance is being stopped.</p>
     * <p>- Stopped: The instance is stopped.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the instance continues to be billed after it is stopped. Valid values:</p>
     * <br>
     * <p>- KeepCharging: standard mode. Billing of the instance continues after the instance is stopped, and resources are retained for the instance.</p>
     * <p>- StopCharging: economical mode. Billing of some resources of the instance stops after the instance is stopped. When the instance is stopped, its resources such as vCPUs, memory, and public IP address are released. You may be unable to restart the instance if some types of resources are out of stock in the current region.</p>
     * <p>- Not-applicable: Economical mode is not applicable to the instance.</p>
     */
    @NameInMap("StoppedMode")
    public String stoppedMode;

    /**
     * <p>The virtual LAN (VLAN) ID of the instance. </p>
     * <br>
     * <p>>  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
     */
    @NameInMap("VlanId")
    public String vlanId;

    /**
     * <p>The virtual private cloud (VPC) attributes of the instance.</p>
     */
    @NameInMap("VpcAttributes")
    public DescribeInstanceAttributeResponseBodyVpcAttributes vpcAttributes;

    /**
     * <p>The zone ID of the instance.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeResponseBody self = new DescribeInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttributeResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeInstanceAttributeResponseBody setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DescribeInstanceAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeInstanceAttributeResponseBody setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public DescribeInstanceAttributeResponseBody setDedicatedHostAttribute(DescribeInstanceAttributeResponseBodyDedicatedHostAttribute dedicatedHostAttribute) {
        this.dedicatedHostAttribute = dedicatedHostAttribute;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyDedicatedHostAttribute getDedicatedHostAttribute() {
        return this.dedicatedHostAttribute;
    }

    public DescribeInstanceAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeInstanceAttributeResponseBody setEipAddress(DescribeInstanceAttributeResponseBodyEipAddress eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyEipAddress getEipAddress() {
        return this.eipAddress;
    }

    public DescribeInstanceAttributeResponseBody setEnableJumboFrame(Boolean enableJumboFrame) {
        this.enableJumboFrame = enableJumboFrame;
        return this;
    }
    public Boolean getEnableJumboFrame() {
        return this.enableJumboFrame;
    }

    public DescribeInstanceAttributeResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeInstanceAttributeResponseBody setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeInstanceAttributeResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeInstanceAttributeResponseBody setInnerIpAddress(DescribeInstanceAttributeResponseBodyInnerIpAddress innerIpAddress) {
        this.innerIpAddress = innerIpAddress;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyInnerIpAddress getInnerIpAddress() {
        return this.innerIpAddress;
    }

    public DescribeInstanceAttributeResponseBody setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeInstanceAttributeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceAttributeResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceAttributeResponseBody setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public DescribeInstanceAttributeResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstanceAttributeResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeInstanceAttributeResponseBody setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public DescribeInstanceAttributeResponseBody setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public DescribeInstanceAttributeResponseBody setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeInstanceAttributeResponseBody setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DescribeInstanceAttributeResponseBody setOperationLocks(DescribeInstanceAttributeResponseBodyOperationLocks operationLocks) {
        this.operationLocks = operationLocks;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyOperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    public DescribeInstanceAttributeResponseBody setPublicIpAddress(DescribeInstanceAttributeResponseBodyPublicIpAddress publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyPublicIpAddress getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public DescribeInstanceAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAttributeResponseBody setSecurityGroupIds(DescribeInstanceAttributeResponseBodySecurityGroupIds securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public DescribeInstanceAttributeResponseBodySecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public DescribeInstanceAttributeResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public DescribeInstanceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeInstanceAttributeResponseBody setStoppedMode(String stoppedMode) {
        this.stoppedMode = stoppedMode;
        return this;
    }
    public String getStoppedMode() {
        return this.stoppedMode;
    }

    public DescribeInstanceAttributeResponseBody setVlanId(String vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public String getVlanId() {
        return this.vlanId;
    }

    public DescribeInstanceAttributeResponseBody setVpcAttributes(DescribeInstanceAttributeResponseBodyVpcAttributes vpcAttributes) {
        this.vpcAttributes = vpcAttributes;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyVpcAttributes getVpcAttributes() {
        return this.vpcAttributes;
    }

    public DescribeInstanceAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeInstanceAttributeResponseBodyDedicatedHostAttribute extends TeaModel {
        /**
         * <p>The ID of the dedicated host.</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>The name of the dedicated host.</p>
         */
        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        public static DescribeInstanceAttributeResponseBodyDedicatedHostAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyDedicatedHostAttribute self = new DescribeInstanceAttributeResponseBodyDedicatedHostAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyDedicatedHostAttribute setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeInstanceAttributeResponseBodyDedicatedHostAttribute setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyEipAddress extends TeaModel {
        /**
         * <p>The ID of the EIP.</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The maximum public bandwidth of the EIP. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The billing method for network usage. Valid values:</p>
         * <br>
         * <p>- PayByBandwidth: pay-by-bandwidth</p>
         * <p>- PayByTraffic: pay-by-traffic</p>
         * <br>
         * <p>>  When the **pay-by-traffic** billing method for network usage is used, the maximum inbound and outbound bandwidth values are used as upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instance, use the **pay-by-bandwidth** billing method for network usage.</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The EIP of the instance.</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        public static DescribeInstanceAttributeResponseBodyEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyEipAddress self = new DescribeInstanceAttributeResponseBodyEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeInstanceAttributeResponseBodyEipAddress setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeInstanceAttributeResponseBodyEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeInstanceAttributeResponseBodyEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyInnerIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstanceAttributeResponseBodyInnerIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInnerIpAddress self = new DescribeInstanceAttributeResponseBodyInnerIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInnerIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyOperationLocksLockReason extends TeaModel {
        /**
         * <p>The reason why the instance was locked. Valid values:</p>
         * <br>
         * <p>- financial: The instance was locked due to overdue payments.</p>
         * <p>- security: The instance was locked due to security reasons.</p>
         * <p>- recycling: The preemptible instance was locked and pending release.</p>
         * <p>- dedicatedhostfinancial: The instance was locked due to overdue payments for the dedicated host.</p>
         * <p>- refunded: The instance was locked because a refund was made for the instance.</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeInstanceAttributeResponseBodyOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyOperationLocksLockReason self = new DescribeInstanceAttributeResponseBodyOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public java.util.List<DescribeInstanceAttributeResponseBodyOperationLocksLockReason> lockReason;

        public static DescribeInstanceAttributeResponseBodyOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyOperationLocks self = new DescribeInstanceAttributeResponseBodyOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyOperationLocks setLockReason(java.util.List<DescribeInstanceAttributeResponseBodyOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeInstanceAttributeResponseBodyOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyPublicIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstanceAttributeResponseBodyPublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyPublicIpAddress self = new DescribeInstanceAttributeResponseBodyPublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyPublicIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstanceAttributeResponseBodySecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeInstanceAttributeResponseBodySecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodySecurityGroupIds self = new DescribeInstanceAttributeResponseBodySecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodySecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress self = new DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyVpcAttributes extends TeaModel {
        /**
         * <p>The Network Address Translation (NAT) IP address of the instance. It is used by ECS instances in different VPCs for communication.</p>
         */
        @NameInMap("NatIpAddress")
        public String natIpAddress;

        /**
         * <p>The private IP address of the instance.</p>
         */
        @NameInMap("PrivateIpAddress")
        public DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress privateIpAddress;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeInstanceAttributeResponseBodyVpcAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyVpcAttributes self = new DescribeInstanceAttributeResponseBodyVpcAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyVpcAttributes setNatIpAddress(String natIpAddress) {
            this.natIpAddress = natIpAddress;
            return this;
        }
        public String getNatIpAddress() {
            return this.natIpAddress;
        }

        public DescribeInstanceAttributeResponseBodyVpcAttributes setPrivateIpAddress(DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeInstanceAttributeResponseBodyVpcAttributes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeInstanceAttributeResponseBodyVpcAttributes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
