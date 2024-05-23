// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyNetworkInterfaceAttributeRequest extends TeaModel {
    @NameInMap("ConnectionTrackingConfiguration")
    public ModifyNetworkInterfaceAttributeRequestConnectionTrackingConfiguration connectionTrackingConfiguration;

    /**
     * <p>Specifies whether to release the ENI when the associated instance is released. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("DeleteOnRelease")
    public Boolean deleteOnRelease;

    /**
     * <p>The description of the ENI. The description must be 2 to 255 characters in length and cannot start with [http:// or https://](http://https://。).</p>
     * <br>
     * <p>This parameter is left empty by default.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the ENI.</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    /**
     * <p>The name of the ENI. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    @NameInMap("NetworkInterfaceTrafficConfig")
    public ModifyNetworkInterfaceAttributeRequestNetworkInterfaceTrafficConfig networkInterfaceTrafficConfig;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of queues supported by the ENI. Valid values: 1 to 2048.</p>
     * <br>
     * <p>*   You can change only the number of queues supported by the secondary ENI.</p>
     * <p>*   You can change the number of queues supported by the secondary ENI only when the ENI is in the `Available` state or the ENI is attached (`InUse`) to an instance that is in the `Stopped` state.</p>
     * <p>*   The number of queues supported by the secondary ENI cannot exceed the maximum number of queues that the instance allows for each ENI. The total number of queues for all ENIs on the instance cannot exceed the queue quota that the instance allows. To query the maximum number of queues per ENI and the queue quota for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation and check the values of `MaximumQueueNumberPerEni` and `TotalEniQueueQuantity` in the response.</p>
     */
    @NameInMap("QueueNumber")
    public Integer queueNumber;

    /**
     * <p>The region ID of the ENI. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The receive (Rx) queue depth of the ENI.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   The Rx queue depth of an ENI must be the same as the transmit (Tx) queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.</p>
     * <p>*   A larger Rx queue depth yields higher inbound throughput but consumes more memory.</p>
     */
    @NameInMap("RxQueueSize")
    public Integer rxQueueSize;

    /**
     * <p>The IDs of the security groups to which to add the secondary ENI. The secondary ENI is added to the specified security groups and are removed from its original security groups.</p>
     * <br>
     * <p>*   The valid value range of N varies based on the number of security groups to which an ENI can be added. For more information, see [Limits](~~25412#SecurityGroupQuota~~).</p>
     * <p>*   The new security groups take effect after a short delay.</p>
     */
    @NameInMap("SecurityGroupId")
    public java.util.List<String> securityGroupId;

    /**
     * <p>The Tx queue depth of the ENI.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   The Tx queue depth of an ENI must be the same as the Rx queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.</p>
     * <p>*   A larger Tx queue depth yields higher outbound throughput but consumes more memory.</p>
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

    public ModifyNetworkInterfaceAttributeRequest setTxQueueSize(Integer txQueueSize) {
        this.txQueueSize = txQueueSize;
        return this;
    }
    public Integer getTxQueueSize() {
        return this.txQueueSize;
    }

    public static class ModifyNetworkInterfaceAttributeRequestConnectionTrackingConfiguration extends TeaModel {
        @NameInMap("TcpClosedAndTimeWaitTimeout")
        public Integer tcpClosedAndTimeWaitTimeout;

        @NameInMap("TcpEstablishedTimeout")
        public Integer tcpEstablishedTimeout;

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

    public static class ModifyNetworkInterfaceAttributeRequestNetworkInterfaceTrafficConfig extends TeaModel {
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        @NameInMap("QueueNumber")
        public Integer queueNumber;

        @NameInMap("QueuePairNumber")
        public Integer queuePairNumber;

        @NameInMap("RxQueueSize")
        public Integer rxQueueSize;

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
