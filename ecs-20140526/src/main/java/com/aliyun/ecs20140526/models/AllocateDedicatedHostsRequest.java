// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocateDedicatedHostsRequest extends TeaModel {
    @NameInMap("NetworkAttributes")
    public AllocateDedicatedHostsRequestNetworkAttributes networkAttributes;

    /**
     * <p>The policy used to migrate the instances deployed on the dedicated host when the dedicated host fails or needs to be repaired online. Valid values:</p>
     * <br>
     * <p>*   Migrate: The instances are migrated to another physical server and restarted.</p>
     * <br>
     * <p>    If cloud disks are attached to the dedicated host, the default value is Migrate.</p>
     * <br>
     * <p>*   Stop: The instances are stopped. If the dedicated host cannot be repaired, the instances are migrated to another physical machine and then restarted.</p>
     * <br>
     * <p>    If local disks are attached to the dedicated host, the default value is Stop.</p>
     */
    @NameInMap("ActionOnMaintenance")
    public String actionOnMaintenance;

    /**
     * <p>Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you create an ECS instance on a dedicated host without specifying the **DedicatedHostId** parameter, Alibaba Cloud selects a dedicated host from the resource pool to host the instance. For more information, see [Automatic deployment](~~118938~~). Valid values:</p>
     * <br>
     * <p>*   on: adds the dedicated host to the resource pool for automatic deployment.</p>
     * <p>*   off: does not add the dedicated host to the resource pool for automatic deployment.</p>
     * <br>
     * <p>Default value: on.</p>
     * <br>
     * <p>> If you do not want to add the dedicated host to the resource pool for automatic deployment, set this parameter to off.</p>
     */
    @NameInMap("AutoPlacement")
    public String autoPlacement;

    /**
     * <p>The time when to automatically release the dedicated host. Specify the time in the `ISO 8601` standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   It must be at least half an hour later than the current time.</p>
     * <br>
     * <p>*   It must be at most three years later than the current time.</p>
     * <br>
     * <p>*   If the value of seconds (ss) is not 00, it is automatically set to 00.</p>
     */
    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    /**
     * <p>Specifies whether to automatically renew the subscription dedicated host.</p>
     * <br>
     * <p>> The **AutoRenew** parameter takes effect only when the **ChargeType** parameter is set to PrePaid.</p>
     * <br>
     * <p>Default value: false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration of the dedicated host. The **AutoRenewPeriod** parameter takes effect and is required only when the **AutoRenew** parameter is set to true. Valid values:</p>
     * <br>
     * <p>Valid values when PeriodUnit is set to Month: 1, 2, 3, 6, and 12.</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The billing method of the dedicated host. Valid values:</p>
     * <br>
     * <p>*   PrePaid: subscription. If you set this parameter to PrePaid, make sure that you have sufficient account balance or credits. Otherwise, `InvalidPayMethod` is returned.</p>
     * <p>*   PostPaid: pay-as-you-go.</p>
     * <br>
     * <p>Default value: PostPaid.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate a client token. Make sure that a unique client token is used for each request. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The CPU overcommit ratio. You can configure CPU overcommit ratios only for the following dedicated host types: g6s, c6s, and r6s. Valid values: 1 to 5.</p>
     * <br>
     * <p>The CPU overcommit ratio affects the number of available vCPUs on a dedicated host. You can use the following formula to calculate the number of available vCPUs on a dedicated host: Number of available vCPUs = Number of physical CPU cores × 2 × CPU overcommit ratio. For example, the number of physical CPU cores on each g6s dedicated host is 52. If you set the CPU overcommit ratio of a g6s dedicated host to 4, the number of available vCPUs on the dedicated host is 416. For scenarios that have minimal requirements on CPU stability or where CPU load is not heavy, such as development and test environments, you can increase the number of available vCPUs on a dedicated host by increasing the CPU overcommit ratio. This way, you can deploy more ECS instances of the same specifications on the dedicated host and reduce the unit deployment cost.</p>
     */
    @NameInMap("CpuOverCommitRatio")
    public Float cpuOverCommitRatio;

    /**
     * <p>The ID of the dedicated host cluster in which to create the dedicated host.</p>
     */
    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    /**
     * <p>The name of the dedicated host. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("DedicatedHostName")
    public String dedicatedHostName;

    /**
     * <p>The dedicated host type. You can call the [DescribeDedicatedHostTypes](~~134240~~) operation to query the most recent list of dedicated host types.</p>
     */
    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    /**
     * <p>The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The minimum number of dedicated hosts to create. Valid values: 1 to 100.</p>
     * <br>
     * <p>> If the number of available dedicated hosts is less than the minimum number of dedicated hosts to create, the dedicated hosts fail to be created.</p>
     */
    @NameInMap("MinQuantity")
    public Integer minQuantity;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription duration of the dedicated host. The `Period` parameter is required and takes effect only when the `ChargeType` parameter is set to `PrePaid`. Valid values:</p>
     * <br>
     * <p>*   Valid values when the PeriodUnit parameter is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     * <p>*   Valid values when the PeriodUnit parameter is set to Year: 1, 2, 3, 4, and 5.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration of the dedicated host. Valid values:</p>
     * <br>
     * <p>*   Month</p>
     * <p>*   Year</p>
     * <br>
     * <p>Default value: Month.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The number of dedicated hosts that you want to create. Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>The region ID of the dedicated host. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the dedicated host.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags of the command.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AllocateDedicatedHostsRequestTag> tag;

    /**
     * <p>The ID of the zone in which to create the dedicated host.</p>
     * <br>
     * <p>This parameter is empty by default. If you do not specify a zone, the system selects a zone.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static AllocateDedicatedHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateDedicatedHostsRequest self = new AllocateDedicatedHostsRequest();
        return TeaModel.build(map, self);
    }

    public AllocateDedicatedHostsRequest setNetworkAttributes(AllocateDedicatedHostsRequestNetworkAttributes networkAttributes) {
        this.networkAttributes = networkAttributes;
        return this;
    }
    public AllocateDedicatedHostsRequestNetworkAttributes getNetworkAttributes() {
        return this.networkAttributes;
    }

    public AllocateDedicatedHostsRequest setActionOnMaintenance(String actionOnMaintenance) {
        this.actionOnMaintenance = actionOnMaintenance;
        return this;
    }
    public String getActionOnMaintenance() {
        return this.actionOnMaintenance;
    }

    public AllocateDedicatedHostsRequest setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }
    public String getAutoPlacement() {
        return this.autoPlacement;
    }

    public AllocateDedicatedHostsRequest setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    public AllocateDedicatedHostsRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public AllocateDedicatedHostsRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public AllocateDedicatedHostsRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public AllocateDedicatedHostsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AllocateDedicatedHostsRequest setCpuOverCommitRatio(Float cpuOverCommitRatio) {
        this.cpuOverCommitRatio = cpuOverCommitRatio;
        return this;
    }
    public Float getCpuOverCommitRatio() {
        return this.cpuOverCommitRatio;
    }

    public AllocateDedicatedHostsRequest setDedicatedHostClusterId(String dedicatedHostClusterId) {
        this.dedicatedHostClusterId = dedicatedHostClusterId;
        return this;
    }
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    public AllocateDedicatedHostsRequest setDedicatedHostName(String dedicatedHostName) {
        this.dedicatedHostName = dedicatedHostName;
        return this;
    }
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    public AllocateDedicatedHostsRequest setDedicatedHostType(String dedicatedHostType) {
        this.dedicatedHostType = dedicatedHostType;
        return this;
    }
    public String getDedicatedHostType() {
        return this.dedicatedHostType;
    }

    public AllocateDedicatedHostsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AllocateDedicatedHostsRequest setMinQuantity(Integer minQuantity) {
        this.minQuantity = minQuantity;
        return this;
    }
    public Integer getMinQuantity() {
        return this.minQuantity;
    }

    public AllocateDedicatedHostsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AllocateDedicatedHostsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocateDedicatedHostsRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public AllocateDedicatedHostsRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public AllocateDedicatedHostsRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public AllocateDedicatedHostsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateDedicatedHostsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AllocateDedicatedHostsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocateDedicatedHostsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AllocateDedicatedHostsRequest setTag(java.util.List<AllocateDedicatedHostsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AllocateDedicatedHostsRequestTag> getTag() {
        return this.tag;
    }

    public AllocateDedicatedHostsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class AllocateDedicatedHostsRequestNetworkAttributes extends TeaModel {
        /**
         * <p>The timeout period for a UDP session between a Server Load Balancer (SLB) instance and the dedicated host. Unit: seconds. Valid values: 15 to 310.</p>
         */
        @NameInMap("SlbUdpTimeout")
        public Integer slbUdpTimeout;

        /**
         * <p>The timeout period for a UDP session between a user and an Alibaba Cloud service on the dedicated host. Unit: seconds. Valid values: 15 to 310.</p>
         */
        @NameInMap("UdpTimeout")
        public Integer udpTimeout;

        public static AllocateDedicatedHostsRequestNetworkAttributes build(java.util.Map<String, ?> map) throws Exception {
            AllocateDedicatedHostsRequestNetworkAttributes self = new AllocateDedicatedHostsRequestNetworkAttributes();
            return TeaModel.build(map, self);
        }

        public AllocateDedicatedHostsRequestNetworkAttributes setSlbUdpTimeout(Integer slbUdpTimeout) {
            this.slbUdpTimeout = slbUdpTimeout;
            return this;
        }
        public Integer getSlbUdpTimeout() {
            return this.slbUdpTimeout;
        }

        public AllocateDedicatedHostsRequestNetworkAttributes setUdpTimeout(Integer udpTimeout) {
            this.udpTimeout = udpTimeout;
            return this;
        }
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

    }

    public static class AllocateDedicatedHostsRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the dedicated host. Valid values of N: 1 to 20.</p>
         * <br>
         * <p>The tag value cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the dedicated host. Valid values of N: 1 to 20.</p>
         * <br>
         * <p>The tag value can be an empty string. It can be up to 128 characters in length and cannot start with acs: or contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static AllocateDedicatedHostsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AllocateDedicatedHostsRequestTag self = new AllocateDedicatedHostsRequestTag();
            return TeaModel.build(map, self);
        }

        public AllocateDedicatedHostsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AllocateDedicatedHostsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
