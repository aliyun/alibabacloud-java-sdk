// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyNetworkInterfaceAttributeRequest extends TeaModel {
    /**
     * <p>The network connectivity tracking configuration information collection.</p>
     * <p>Before you use this parameter, read <a href="https://help.aliyun.com/document_detail/2865958.html">Connection timeout management</a> carefully.</p>
     */
    @NameInMap("ConnectionTrackingConfiguration")
    public ModifyNetworkInterfaceAttributeRequestConnectionTrackingConfiguration connectionTrackingConfiguration;

    /**
     * <p>Specifies whether to retain the ENI when the instance is released. Valid values:</p>
     * <ul>
     * <li><p>true: The ENI is not retained.</p>
     * </li>
     * <li><p>false: The ENI is retained.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteOnRelease")
    public Boolean deleteOnRelease;

    /**
     * <p>The description of the network interface controller (NIC). The description must be 2 to 255 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the primary IPv6 address for the network interface controller (NIC).</p>
     */
    @NameInMap("EnablePrimaryIPv6")
    public Boolean enablePrimaryIPv6;

    /**
     * <p>This parameter is not available for public use.</p>
     */
    @NameInMap("EnhancedNetwork")
    public ModifyNetworkInterfaceAttributeRequestEnhancedNetwork enhancedNetwork;

    /**
     * <p>The ID of the network interface controller (NIC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-bp67acfmxazb4p****</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    /**
     * <p>The name of the Elastic Network Interface (ENI). The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>. It supports characters in the Letter category of Unicode, such as English letters, Chinese characters, and digits. It can contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>eniTestName</p>
     */
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    /**
     * <p>The traffic parameters of the network interface controller (NIC).</p>
     */
    @NameInMap("NetworkInterfaceTrafficConfig")
    public ModifyNetworkInterfaceAttributeRequestNetworkInterfaceTrafficConfig networkInterfaceTrafficConfig;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of queues for the ENI. Valid values: 1 to 2048.</p>
     * <ul>
     * <li><p>You can modify the number of queues for an ENI that is in the <code>Available</code> state, or for an ENI that is attached (<code>InUse</code>) to an instance that is in the <code>Stopped</code> state.</p>
     * </li>
     * <li><p>The number of queues for the ENI cannot exceed the maximum number of queues per ENI allowed by the instance type. The total number of queues for all ENIs attached to the instance cannot exceed the total queue quota allowed by the instance type. You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation and query the <code>MaximumQueueNumberPerEni</code> and <code>TotalEniQueueQuantity</code> parameters to obtain the maximum number of queues per ENI and the total queue quota for the instance type.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("QueueNumber")
    public Integer queueNumber;

    /**
     * <p>The region ID of the network interface controller (NIC). You can invoke the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The inbound queue depth of the network interface controller (NIC).</p>
     * <blockquote>
     * <p>This parameter is in invitational preview and is not available for public use. If you need to use it, submit a ticket to apply for whitelist access.</p>
     * </blockquote>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>This parameter applies only to seventh-generation and later ECS instance types.</li>
     * <li>This parameter currently applies only to Linux images.</li>
     * <li>A larger inbound queue depth can increase inbound throughput and reduce the packet loss rate, but it consumes more memory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("RxQueueSize")
    public Integer rxQueueSize;

    /**
     * <p>The list of security group IDs. The secondary network interface controller (NIC) is added to the specified security groups and removed from its current security groups.</p>
     * <ul>
     * <li><p>The valid values of N depend on the quota of security groups that each network interface controller (NIC) can join. For more information, see <a href="~~25412#SecurityGroupQuota~~">Limits</a>.</p>
     * </li>
     * <li><p>The modification takes effect shortly, but there may be a slight delay.</p>
     * </li>
     * </ul>
     */
    @NameInMap("SecurityGroupId")
    public java.util.List<String> securityGroupId;

    /**
     * <p>Specifies whether to enable source/destination checking. We recommend that you enable this feature to improve network security. Valid values:</p>
     * <ul>
     * <li><p>true: enabled.</p>
     * </li>
     * <li><p>false: disabled.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This feature is supported only in specific regions. Before you use it, read <a href="https://help.aliyun.com/document_detail/2863210.html">Source/destination checking</a> carefully.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceDestCheck")
    public Boolean sourceDestCheck;

    /**
     * <p>The outbound queue depth of the network interface controller (NIC).</p>
     * <blockquote>
     * <p>This parameter is in invitational preview and is not available for public use. If you need to use it, submit a ticket to apply for whitelist access.</p>
     * </blockquote>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>This parameter applies only to seventh-generation and later ECS instance types.</li>
     * <li>This parameter currently applies only to Linux images.</li>
     * <li>A larger outbound queue depth can increase outbound throughput and reduce the packet loss rate, but it consumes more memory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("TxQueueSize")
    public Integer txQueueSize;

    public static ModifyNetworkInterfaceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkInterfaceAttributeRequest self = new ModifyNetworkInterfaceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkInterfaceAttributeRequest setConnectionTrackingConfiguration(ModifyNetworkInterfaceAttributeRequestConnectionTrackingConfiguration connectionTrackingConfiguration) {
        this.connectionTrackingConfiguration = connectionTrackingConfiguration;
        return this;
    }
    public ModifyNetworkInterfaceAttributeRequestConnectionTrackingConfiguration getConnectionTrackingConfiguration() {
        return this.connectionTrackingConfiguration;
    }

    public ModifyNetworkInterfaceAttributeRequest setDeleteOnRelease(Boolean deleteOnRelease) {
        this.deleteOnRelease = deleteOnRelease;
        return this;
    }
    public Boolean getDeleteOnRelease() {
        return this.deleteOnRelease;
    }

    public ModifyNetworkInterfaceAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyNetworkInterfaceAttributeRequest setEnablePrimaryIPv6(Boolean enablePrimaryIPv6) {
        this.enablePrimaryIPv6 = enablePrimaryIPv6;
        return this;
    }
    public Boolean getEnablePrimaryIPv6() {
        return this.enablePrimaryIPv6;
    }

    public ModifyNetworkInterfaceAttributeRequest setEnhancedNetwork(ModifyNetworkInterfaceAttributeRequestEnhancedNetwork enhancedNetwork) {
        this.enhancedNetwork = enhancedNetwork;
        return this;
    }
    public ModifyNetworkInterfaceAttributeRequestEnhancedNetwork getEnhancedNetwork() {
        return this.enhancedNetwork;
    }

    public ModifyNetworkInterfaceAttributeRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public ModifyNetworkInterfaceAttributeRequest setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    public ModifyNetworkInterfaceAttributeRequest setNetworkInterfaceTrafficConfig(ModifyNetworkInterfaceAttributeRequestNetworkInterfaceTrafficConfig networkInterfaceTrafficConfig) {
        this.networkInterfaceTrafficConfig = networkInterfaceTrafficConfig;
        return this;
    }
    public ModifyNetworkInterfaceAttributeRequestNetworkInterfaceTrafficConfig getNetworkInterfaceTrafficConfig() {
        return this.networkInterfaceTrafficConfig;
    }

    public ModifyNetworkInterfaceAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyNetworkInterfaceAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyNetworkInterfaceAttributeRequest setQueueNumber(Integer queueNumber) {
        this.queueNumber = queueNumber;
        return this;
    }
    public Integer getQueueNumber() {
        return this.queueNumber;
    }

    public ModifyNetworkInterfaceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyNetworkInterfaceAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyNetworkInterfaceAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyNetworkInterfaceAttributeRequest setRxQueueSize(Integer rxQueueSize) {
        this.rxQueueSize = rxQueueSize;
        return this;
    }
    public Integer getRxQueueSize() {
        return this.rxQueueSize;
    }

    public ModifyNetworkInterfaceAttributeRequest setSecurityGroupId(java.util.List<String> securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public java.util.List<String> getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifyNetworkInterfaceAttributeRequest setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }
    public Boolean getSourceDestCheck() {
        return this.sourceDestCheck;
    }

    public ModifyNetworkInterfaceAttributeRequest setTxQueueSize(Integer txQueueSize) {
        this.txQueueSize = txQueueSize;
        return this;
    }
    public Integer getTxQueueSize() {
        return this.txQueueSize;
    }

    public static class ModifyNetworkInterfaceAttributeRequestConnectionTrackingConfiguration extends TeaModel {
        /**
         * <p>The timeout period for closed and TIME_WAIT TCP connections. Unit: seconds. Valid values: integers from 3 to 15.</p>
         * <p>Default value: 3.</p>
         * <blockquote>
         * <p>If your ECS instance is used together with an NLB or CLB instance, the default timeout period for connections in the <code>TIME_WAIT</code> state is 15 seconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TcpClosedAndTimeWaitTimeout")
        public Integer tcpClosedAndTimeWaitTimeout;

        /**
         * <p>The timeout period for established TCP connections. Unit: seconds. Valid values: 30, 60, 80, 100, 200, 300, 500, 700, and 910.</p>
         * <p>Default value: 910.</p>
         * 
         * <strong>example:</strong>
         * <p>910</p>
         */
        @NameInMap("TcpEstablishedTimeout")
        public Integer tcpEstablishedTimeout;

        /**
         * <p>The timeout period for UDP flows. Unit: seconds. Valid values: 10, 20, 30, 60, 80, and 100.</p>
         * <p>Default value: 30.</p>
         * <blockquote>
         * <p>If your ECS instance is used together with an NLB or CLB instance, the default value is 100 seconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UdpTimeout")
        public Integer udpTimeout;

        public static ModifyNetworkInterfaceAttributeRequestConnectionTrackingConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ModifyNetworkInterfaceAttributeRequestConnectionTrackingConfiguration self = new ModifyNetworkInterfaceAttributeRequestConnectionTrackingConfiguration();
            return TeaModel.build(map, self);
        }

        public ModifyNetworkInterfaceAttributeRequestConnectionTrackingConfiguration setTcpClosedAndTimeWaitTimeout(Integer tcpClosedAndTimeWaitTimeout) {
            this.tcpClosedAndTimeWaitTimeout = tcpClosedAndTimeWaitTimeout;
            return this;
        }
        public Integer getTcpClosedAndTimeWaitTimeout() {
            return this.tcpClosedAndTimeWaitTimeout;
        }

        public ModifyNetworkInterfaceAttributeRequestConnectionTrackingConfiguration setTcpEstablishedTimeout(Integer tcpEstablishedTimeout) {
            this.tcpEstablishedTimeout = tcpEstablishedTimeout;
            return this;
        }
        public Integer getTcpEstablishedTimeout() {
            return this.tcpEstablishedTimeout;
        }

        public ModifyNetworkInterfaceAttributeRequestConnectionTrackingConfiguration setUdpTimeout(Integer udpTimeout) {
            this.udpTimeout = udpTimeout;
            return this;
        }
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

    }

    public static class ModifyNetworkInterfaceAttributeRequestEnhancedNetwork extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is not available for public use.</p>
         * </blockquote>
         */
        @NameInMap("EnableExpress")
        public Boolean enableExpress;

        /**
         * <blockquote>
         * <p>This parameter is not available for public use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableRss")
        public Boolean enableRss;

        /**
         * <p>This parameter is not available for public use.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSriov")
        public Boolean enableSriov;

        /**
         * <p>The number of virtual functions when SR-IOV is enabled. Valid values: 1 to 256.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VirtualFunctionQuantity")
        public Integer virtualFunctionQuantity;

        /**
         * <p>The total number of queues for virtual functions when SR-IOV is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("VirtualFunctionTotalQueueNumber")
        public Integer virtualFunctionTotalQueueNumber;

        public static ModifyNetworkInterfaceAttributeRequestEnhancedNetwork build(java.util.Map<String, ?> map) throws Exception {
            ModifyNetworkInterfaceAttributeRequestEnhancedNetwork self = new ModifyNetworkInterfaceAttributeRequestEnhancedNetwork();
            return TeaModel.build(map, self);
        }

        public ModifyNetworkInterfaceAttributeRequestEnhancedNetwork setEnableExpress(Boolean enableExpress) {
            this.enableExpress = enableExpress;
            return this;
        }
        public Boolean getEnableExpress() {
            return this.enableExpress;
        }

        public ModifyNetworkInterfaceAttributeRequestEnhancedNetwork setEnableRss(Boolean enableRss) {
            this.enableRss = enableRss;
            return this;
        }
        public Boolean getEnableRss() {
            return this.enableRss;
        }

        public ModifyNetworkInterfaceAttributeRequestEnhancedNetwork setEnableSriov(Boolean enableSriov) {
            this.enableSriov = enableSriov;
            return this;
        }
        public Boolean getEnableSriov() {
            return this.enableSriov;
        }

        public ModifyNetworkInterfaceAttributeRequestEnhancedNetwork setVirtualFunctionQuantity(Integer virtualFunctionQuantity) {
            this.virtualFunctionQuantity = virtualFunctionQuantity;
            return this;
        }
        public Integer getVirtualFunctionQuantity() {
            return this.virtualFunctionQuantity;
        }

        public ModifyNetworkInterfaceAttributeRequestEnhancedNetwork setVirtualFunctionTotalQueueNumber(Integer virtualFunctionTotalQueueNumber) {
            this.virtualFunctionTotalQueueNumber = virtualFunctionTotalQueueNumber;
            return this;
        }
        public Integer getVirtualFunctionTotalQueueNumber() {
            return this.virtualFunctionTotalQueueNumber;
        }

    }

    public static class ModifyNetworkInterfaceAttributeRequestNetworkInterfaceTrafficConfig extends TeaModel {
        /**
         * <p>The traffic pattern of the network interface controller (NIC). Valid values of the parameter:</p>
         * <ul>
         * <li>Standard: uses the TCP traffic pattern.</li>
         * <li>HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the RDMA traffic pattern.</li>
         * </ul>
         * <p>When the Elastic Network Interface (ENI) is attached to an instance, take note of the following items:</p>
         * <ul>
         * <li>The total number of RDMA network interface controllers (NICs) for the instance cannot exceed the RDMA network interface controller (NIC) quota allowed by the instance type. You can invoke the DescribeInstanceTypes operation and query the EriQuantity parameter to obtain the RDMA network interface controller (NIC) quota for the instance type.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available for public use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The number of queues for the network interface controller (NIC).
         * When the Elastic Network Interface (ENI) is attached to an instance, take note of the following items:</p>
         * <ul>
         * <li>The number of queues cannot exceed the maximum number of queues per network interface controller (NIC) allowed by the instance type.</li>
         * <li>The total number of queues for all network interface controllers (NICs) attached to the instance cannot exceed the total queue quota allowed by the instance type. You can invoke the DescribeInstanceTypes operation and query the MaximumQueueNumberPerEni and TotalEniQueueQuantity parameters to obtain the maximum number of queues per network interface controller (NIC) and the total queue quota for the instance type.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available for public use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueueNumber")
        public Integer queueNumber;

        /**
         * <p>The number of queues for the RDMA network interface controller (NIC).
         * When the Elastic Network Interface (ENI) is attached to an instance, take note of the following items:</p>
         * <ul>
         * <li>The number of queues cannot exceed the maximum number of queues per RDMA network interface controller (NIC) allowed by the instance type. You can invoke the DescribeInstanceTypes operation and query the QueuePairNumber parameter to obtain the maximum number of queues per RDMA network interface controller (NIC) for the instance type.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available for public use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueuePairNumber")
        public Integer queuePairNumber;

        /**
         * <p>The inbound queue depth of the network interface controller (NIC).</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available for public use. If you need to use it, submit a ticket to apply for whitelist access.</p>
         * </blockquote>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>This parameter applies only to seventh-generation and later ECS instance types.</li>
         * <li>This parameter currently applies only to Linux images.</li>
         * <li>A larger inbound queue depth can increase inbound throughput and reduce the packet loss rate, but it consumes more memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("RxQueueSize")
        public Integer rxQueueSize;

        /**
         * <p>The outbound queue depth of the network interface controller (NIC).</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available for public use. If you need to use it, submit a ticket to apply for whitelist access.</p>
         * </blockquote>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>This parameter applies only to seventh-generation and later ECS instance types.</li>
         * <li>This parameter currently applies only to Linux images.</li>
         * <li>A larger outbound queue depth can increase outbound throughput and reduce the packet loss rate, but it consumes more memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("TxQueueSize")
        public Integer txQueueSize;

        public static ModifyNetworkInterfaceAttributeRequestNetworkInterfaceTrafficConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyNetworkInterfaceAttributeRequestNetworkInterfaceTrafficConfig self = new ModifyNetworkInterfaceAttributeRequestNetworkInterfaceTrafficConfig();
            return TeaModel.build(map, self);
        }

        public ModifyNetworkInterfaceAttributeRequestNetworkInterfaceTrafficConfig setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public ModifyNetworkInterfaceAttributeRequestNetworkInterfaceTrafficConfig setQueueNumber(Integer queueNumber) {
            this.queueNumber = queueNumber;
            return this;
        }
        public Integer getQueueNumber() {
            return this.queueNumber;
        }

        public ModifyNetworkInterfaceAttributeRequestNetworkInterfaceTrafficConfig setQueuePairNumber(Integer queuePairNumber) {
            this.queuePairNumber = queuePairNumber;
            return this;
        }
        public Integer getQueuePairNumber() {
            return this.queuePairNumber;
        }

        public ModifyNetworkInterfaceAttributeRequestNetworkInterfaceTrafficConfig setRxQueueSize(Integer rxQueueSize) {
            this.rxQueueSize = rxQueueSize;
            return this;
        }
        public Integer getRxQueueSize() {
            return this.rxQueueSize;
        }

        public ModifyNetworkInterfaceAttributeRequestNetworkInterfaceTrafficConfig setTxQueueSize(Integer txQueueSize) {
            this.txQueueSize = txQueueSize;
            return this;
        }
        public Integer getTxQueueSize() {
            return this.txQueueSize;
        }

    }

}
