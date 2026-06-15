// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyNetworkInterfaceAttributeRequest extends TeaModel {
    /**
     * <p>The connection tracking configuration.</p>
     * <p>Before using this parameter, we recommend that you read <a href="https://help.aliyun.com/document_detail/2865958.html">Connection timeout management</a>.</p>
     */
    @NameInMap("ConnectionTrackingConfiguration")
    public ModifyNetworkInterfaceAttributeRequestConnectionTrackingConfiguration connectionTrackingConfiguration;

    /**
     * <p>Specifies whether to delete the elastic network interface when its attached instance is released. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The elastic network interface is deleted.</p>
     * </li>
     * <li><p><code>false</code>: The elastic network interface is retained.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteOnRelease")
    public Boolean deleteOnRelease;

    /**
     * <p>The description of the elastic network interface. The description must be 2 to 255 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>Default value: empty.</p>
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
    public ModifyNetworkInterfaceAttributeRequestEnhancedNetwork enhancedNetwork;

    /**
     * <p>The ID of the elastic network interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-bp67acfmxazb4p****</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    /**
     * <p>The name of the elastic network interface. The name must be 2 to 128 characters in length, start with a letter or a Chinese character, and not start with <code>http://</code> or <code>https://</code>. It can contain letters, digits, Chinese characters, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>eniTestName</p>
     */
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    /**
     * <p>The traffic configuration of the elastic network interface.</p>
     */
    @NameInMap("NetworkInterfaceTrafficConfig")
    public ModifyNetworkInterfaceAttributeRequestNetworkInterfaceTrafficConfig networkInterfaceTrafficConfig;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of queues for the elastic network interface. Valid values: 1 to 2048.</p>
     * <ul>
     * <li><p>You can change the number of queues for an elastic network interface only when it is in the <code>Available</code> state or is attached to an instance in the <code>Stopped</code> state.</p>
     * </li>
     * <li><p>The number of queues cannot exceed the maximum supported by the instance type. The total number of queues for all elastic network interfaces attached to the instance cannot exceed the instance\&quot;s queue quota. You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the <code>MaximumQueueNumberPerEni</code> and <code>TotalEniQueueQuantity</code> values for an instance type.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("QueueNumber")
    public Integer queueNumber;

    /**
     * <p>The ID of the region where the elastic network interface is located. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the latest list of Alibaba Cloud regions.</p>
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
     * <p>The queue depth for inbound traffic on the elastic network interface.</p>
     * <blockquote>
     * <p>This parameter is available by invitation only. To use this feature, submit a ticket.</p>
     * </blockquote>
     * <p>Note the following:</p>
     * <ul>
     * <li><p>This parameter is available only for instance types of the 7th generation and later.</p>
     * </li>
     * <li><p>This parameter is available only for instances that use Linux images.</p>
     * </li>
     * <li><p>A larger queue depth for inbound traffic increases throughput and reduces the packet loss rate, but consumes more memory.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("RxQueueSize")
    public Integer rxQueueSize;

    /**
     * <p>The IDs of new security groups to associate with the secondary elastic network interface. The interface is then detached from its original security groups.</p>
     * <ul>
     * <li><p>The number of security groups that you can specify is limited by the maximum number of security groups to which an elastic network interface can be attached. For more information, see <a href="~~25412#SecurityGroupQuota~~">Usage limits</a>.</p>
     * </li>
     * <li><p>The changes take effect after a short delay.</p>
     * </li>
     * </ul>
     */
    @NameInMap("SecurityGroupId")
    public java.util.List<String> securityGroupId;

    /**
     * <p>Specifies whether to enable the source/destination check. For enhanced security, we recommend enabling this feature. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enabled</p>
     * </li>
     * <li><p><code>false</code>: Disabled</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <blockquote>
     * <p>This feature is available only in specific regions. Before you use this parameter, read <a href="https://help.aliyun.com/document_detail/2863210.html">Source/destination check</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceDestCheck")
    public Boolean sourceDestCheck;

    /**
     * <p>The queue depth for outbound traffic on the elastic network interface.</p>
     * <blockquote>
     * <p>This parameter is available by invitation only. To use this feature, submit a ticket.</p>
     * </blockquote>
     * <p>Note the following:</p>
     * <ul>
     * <li><p>This parameter is available only for instance types of the 7th generation and later.</p>
     * </li>
     * <li><p>This parameter is available only for instances that use Linux images.</p>
     * </li>
     * <li><p>A larger queue depth for outbound traffic increases throughput and reduces the packet loss rate, but consumes more memory.</p>
     * </li>
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
         * <p>The timeout period, in seconds, for TCP connections in the <code>TIME_WAIT</code> or <code>CLOSE_WAIT</code> state. The value must be an integer from 3 to 15.</p>
         * <p>Default value: 3.</p>
         * <blockquote>
         * <p>If your ECS instance is used with Network Load Balancer (NLB) or Classic Load Balancer (CLB), the default timeout period for connections in the <code>TIME_WAIT</code> state is 15 seconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TcpClosedAndTimeWaitTimeout")
        public Integer tcpClosedAndTimeWaitTimeout;

        /**
         * <p>The timeout period for TCP connections in the <code>ESTABLISHED</code> state, in seconds. Valid values: 30, 60, 80, 100, 200, 300, 500, 700, and 910.</p>
         * <p>Default value: 910.</p>
         * 
         * <strong>example:</strong>
         * <p>910</p>
         */
        @NameInMap("TcpEstablishedTimeout")
        public Integer tcpEstablishedTimeout;

        /**
         * <p>The timeout period for UDP flows, in seconds. Valid values: 10, 20, 30, 60, 80, and 100.</p>
         * <p>Default value: 30.</p>
         * <blockquote>
         * <p>If your ECS instance is used with Network Load Balancer (NLB) or Classic Load Balancer (CLB), the default value is 100 seconds.</p>
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
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableRss")
        public Boolean enableRss;

        /**
         * <p>This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSriov")
        public Boolean enableSriov;

        @NameInMap("VirtualFunctionQuantity")
        public Integer virtualFunctionQuantity;

        @NameInMap("VirtualFunctionTotalQueueNumber")
        public Integer virtualFunctionTotalQueueNumber;

        public static ModifyNetworkInterfaceAttributeRequestEnhancedNetwork build(java.util.Map<String, ?> map) throws Exception {
            ModifyNetworkInterfaceAttributeRequestEnhancedNetwork self = new ModifyNetworkInterfaceAttributeRequestEnhancedNetwork();
            return TeaModel.build(map, self);
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
         * <p>The traffic mode of the elastic network interface. Valid values:</p>
         * <ul>
         * <li><p><code>Standard</code>: The standard TCP traffic mode.</p>
         * </li>
         * <li><p><code>HighPerformance</code>: The RDMA traffic mode with the Elastic RDMA Interface (ERI) feature enabled.</p>
         * </li>
         * </ul>
         * <p>If the elastic network interface is attached to an instance, note the following:</p>
         * <ul>
         * <li>The total number of ERI-enabled elastic network interfaces on the instance cannot exceed the quota for the instance type. You can call the <a href="">DescribeInstanceTypes operation to query the value of the <code>EriQuantity</code> parameter.</a></li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available by invitation only.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The number of queues for the elastic network interface.
         * If the elastic network interface is attached to an instance, note the following:</p>
         * <ul>
         * <li><p>The value cannot exceed the maximum number of queues per elastic network interface that is supported by the instance type.</p>
         * </li>
         * <li><p>The total number of queues for all elastic network interfaces on the instance cannot exceed the queue quota for the instance type. You can call the <a href="">DescribeInstanceTypes operation to query the <code>MaximumQueueNumberPerEni</code> and <code>TotalEniQueueQuantity</code> values for an instance type.</a></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available by invitation only. To use this feature, submit a ticket.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueueNumber")
        public Integer queueNumber;

        /**
         * <p>The number of queue pairs for the ERI.
         * If the elastic network interface is attached to an instance, note the following:</p>
         * <ul>
         * <li>The value cannot exceed the maximum number of queue pairs per ERI that is supported by the instance type. You can call the <a href="">DescribeInstanceTypes operation to query the value of the <code>QueuePairNumber</code> parameter for an instance type.</a></li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available by invitation only. To use this feature, submit a ticket.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueuePairNumber")
        public Integer queuePairNumber;

        /**
         * <p>The queue depth for inbound traffic on the elastic network interface.</p>
         * <blockquote>
         * <p>This parameter is available by invitation only. To use this feature, submit a ticket.</p>
         * </blockquote>
         * <p>Note the following:</p>
         * <ul>
         * <li><p>This parameter is available only for instance types of the 7th generation and later.</p>
         * </li>
         * <li><p>This parameter is available only for instances that use Linux images.</p>
         * </li>
         * <li><p>A larger queue depth for inbound traffic increases throughput and reduces the packet loss rate, but consumes more memory.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("RxQueueSize")
        public Integer rxQueueSize;

        /**
         * <p>The queue depth for outbound traffic on the elastic network interface.</p>
         * <blockquote>
         * <p>This parameter is available by invitation only. To use this feature, submit a ticket.</p>
         * </blockquote>
         * <p>Note the following:</p>
         * <ul>
         * <li><p>This parameter is available only for instance types of the 7th generation and later.</p>
         * </li>
         * <li><p>This parameter is available only for instances that use Linux images.</p>
         * </li>
         * <li><p>A larger queue depth for outbound traffic increases throughput and reduces the packet loss rate, but consumes more memory.</p>
         * </li>
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
