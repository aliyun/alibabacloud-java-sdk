// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocateDedicatedHostsRequest extends TeaModel {
    @NameInMap("NetworkAttributes")
    public AllocateDedicatedHostsRequestNetworkAttributes networkAttributes;

    // The policy used to migrate the instances deployed on the dedicated host when the dedicated host fails or needs to be repaired online. Valid values:
    // 
    // *   Migrate: Instances are migrated to another physical server and restarted.
    // 
    //     If the dedicated host is attached with cloud disks, the default value is Migrate.
    // 
    // *   Stop: The instances are stopped. If the dedicated host cannot be repaired, the instances are migrated to another physical server and restarted.
    // 
    //     If the dedicated host is attached with local disks, the default value is Stop.
    @NameInMap("ActionOnMaintenance")
    public String actionOnMaintenance;

    // Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you create an ECS instance on a dedicated host without specifying the **DedicatedHostId** parameter, Alibaba Cloud selects a dedicated host from the resource pool to host the instance. For more information, see [Automatic deployment](~~118938~~). Valid values:
    // 
    // *   on: The dedicated host is added to the resource pool for automatic deployment.
    // *   off: The dedicated host is not added to the resource pool for automatic deployment.
    // 
    // Default value: on.
    // 
    // >  If you do not want to add the dedicated host to the resource pool for automatic deployment, set the value to off.
    @NameInMap("AutoPlacement")
    public String autoPlacement;

    // The automatic release time of the dedicated host. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // > *   It must be at least half an hour later than the current time.
    // > *   It must be at most three years later than the current time.
    // > *   If the value of seconds (ss) is not 00, it is automatically set to 00.
    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    // Specifies whether to automatically renew the subscription dedicated host.
    // 
    // >  The **AutoRenew** parameter takes effect only when the **ChargeType** parameter is set to PrePaid.
    // 
    // Default value: false.
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    // The auto-renewal period of the dedicated host. Unit: months. Valid values: 1, 2, 3, 6, and 12.
    // 
    // >  The **AutoRenewPeriod** parameter takes effect and is required only when the **AutoRenew** parameter is set to true.
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    // The billing method of the dedicated host. Default value: PostPaid. Valid values:
    // 
    // *   PrePaid: subscription. If you set this parameter to PrePaid, make sure that you have sufficient account balance or credit. Otherwise, InvalidPayMethod is returned.
    // *   PostPaid: pay-as-you-go.
    @NameInMap("ChargeType")
    public String chargeType;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The CPU overcommit ratio. You can configure CPU overcommit ratios only for the following dedicated host types: g6s, c6s, and r6s. Valid values: 1 to 5.
    // 
    // The CPU overcommit ratio affects the number of available vCPUs on a dedicated host. You can use the following formula to calculate the number of available vCPUs on a dedicated host: Number of available vCPUs = Number of physical CPU cores × 2 × CPU overcommit ratio. For example, the number of physical CPU cores on each g6s dedicated host is 52. If you set the CPU overcommit ratio of a g6s dedicated host to 4, the number of available vCPUs on the dedicated host is 416. For scenarios that have minimal requirements on CPU stability or where CPU load is not heavy, such as development and test environments, you can increase the number of available vCPUs on a dedicated host by increasing the CPU overcommit ratio. This way, you can deploy more ECS instances of the same specifications on the dedicated host and reduce the unit deployment cost.
    @NameInMap("CpuOverCommitRatio")
    public Float cpuOverCommitRatio;

    // The ID of the dedicated host cluster to which to assign the dedicated host.
    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    // The name of the dedicated host. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
    @NameInMap("DedicatedHostName")
    public String dedicatedHostName;

    // The type of the dedicated host. You can call the [DescribeDedicatedHostTypes](~~134240~~) operation to obtain the most recent list of dedicated host types.
    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    // The description of the dedicated host. The description must be 2 to 256 characters in length, and cannot start with `http://` or `https://`.
    @NameInMap("Description")
    public String description;

    // The minimum number of dedicated hosts to create. Valid values: 1 to 100.
    // 
    // >  If the number of available dedicated hosts is less than the minimum number of dedicated hosts to create, the dedicated hosts fail to be created.
    @NameInMap("MinQuantity")
    public Integer minQuantity;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The subscription period of the dedicated host. The `Period` parameter is required and takes effect only when the `ChargeType` parameter is set to `PrePaid`. Valid values:
    // 
    // *   Valid values when the PeriodUnit parameter is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, and 9.
    // *   Valid values when the PeriodUnit parameter is set to Year: 1, 2, 3, 4, and 5.
    @NameInMap("Period")
    public Integer period;

    // The unit of the subscription period of the dedicated host. Valid values:
    // 
    // *   Month
    // *   Year
    // 
    // Default value: Month.
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // The number of dedicated hosts that you want to create. Valid values: 1 to 100.
    // 
    // Default: 1.
    @NameInMap("Quantity")
    public Integer quantity;

    // The ID of the region in which to create the dedicated host. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group to which to assign the dedicated host.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The list of the tags that you want to add. It can be up to 20.
    @NameInMap("Tag")
    public java.util.List<AllocateDedicatedHostsRequestTag> tag;

    // The ID of the zone in which to create the dedicated host.
    // 
    // This parameter is empty by default. If you do not specify a zone, the system selects a zone.
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
        // The timeout period for a UDP session between a Server Load Balancer (SLB) instance and the dedicated host. Unit: seconds. Valid values: 15 to 310.
        @NameInMap("SlbUdpTimeout")
        public Integer slbUdpTimeout;

        // The timeout period for a UDP session between a user and an Alibaba Cloud service on the dedicated host. Unit: seconds. Valid values: 15 to 310.
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
        // The key of tag to be added to the dedicated host.
        // 
        // The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain `http://` or `https://`.
        @NameInMap("Key")
        public String key;

        // The value of tag to the dedicated host.
        // 
        // The tag value can be an empty string. It can be up to 128 characters in length. It cannot start with acs: or contain `http://` or `https://`.
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
