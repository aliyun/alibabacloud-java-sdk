// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocateDedicatedHostsRequest extends TeaModel {
    @NameInMap("NetworkAttributes")
    public AllocateDedicatedHostsRequestNetworkAttributes networkAttributes;

    /**
     * <p>The policy used to migrate the instances deployed on the dedicated host when the dedicated host fails or needs to be repaired online. Valid values:</p>
     * <ul>
     * <li><p>Migrate: The instances are migrated to another physical server and restarted.</p>
     * <p>Default value when cloud disks are attached to the dedicated host: Migrate.</p>
     * </li>
     * <li><p>Stop: The instances are stopped on the current dedicated host. After the dedicated host is confirmed to be irreparable, the instances are migrated to another physical server and restarted.</p>
     * <p>Default value when local disks are attached to the dedicated host: Stop.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Migrate</p>
     */
    @NameInMap("ActionOnMaintenance")
    public String actionOnMaintenance;

    /**
     * <p>Specifies whether to add the dedicated host to the automatic deployment resource pool. If you create an instance on a dedicated host without specifying <strong>DedicatedHostId</strong>, Alibaba Cloud automatically selects a dedicated host from the resource pool to host the instance. For more information, see <a href="https://help.aliyun.com/document_detail/118938.html">Automatic deployment</a>. Valid values:</p>
     * <ul>
     * <li><p>on: adds the dedicated host to the automatic deployment resource pool.</p>
     * </li>
     * <li><p>off: does not add the dedicated host to the automatic deployment resource pool.</p>
     * </li>
     * </ul>
     * <p>Default value: on.</p>
     * <blockquote>
     * <p>If you do not want the dedicated host to be added to the automatic deployment resource pool, set this parameter to off.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("AutoPlacement")
    public String autoPlacement;

    /**
     * <p>The automatic release time of the dedicated host. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC+0.</p>
     * <blockquote>
     * <ul>
     * <li>The earliest release time must be at least half an hour from the current time.</li>
     * <li>The latest release time must be at most three years from the current time.</li>
     * <li>If the value of seconds (ss) is not 00, it is automatically set to 00.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-08-21T12:30:24Z</p>
     */
    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    /**
     * <p>Specifies whether to enable auto-renewal for the subscription dedicated host.</p>
     * <blockquote>
     * <p>The <strong>AutoRenew</strong> parameter takes effect only when <strong>ChargeType</strong> is set to PrePaid.</p>
     * </blockquote>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. The <strong>AutoRenewPeriod</strong> parameter takes effect and is required only when <strong>AutoRenew</strong> is set to true. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>If PeriodUnit is set to Week: 1, 2, and 3.</li>
     * <li>If PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;If PeriodUnit is set to Month: 1, 2, 3, 6, and 12.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The billing method of the dedicated host. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p>PrePaid: subscription. If you set this parameter to PrePaid, confirm that your payment method supports balance payment or credit payment. Otherwise, the <code>InvalidPayMethod</code> error is returned.</p>
     * </li>
     * <li><p>PostPaid: pay-as-you-go.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><p>PrePaid: subscription. If you set this parameter to PrePaid, confirm that your payment method supports credit payment. Otherwise, the <code>InvalidPayMethod</code> error is returned.</p>
     * </li>
     * <li><p>PostPaid: pay-as-you-go.</p>
     * </li>
     * </ul>
     * <p>Default value: PostPaid.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The CPU overcommit ratio. Only the custom instance types g6s, c6s, and r6s support the CPU overcommit ratio. Valid values: 1 to 5.</p>
     * <p>The CPU overcommit ratio affects the number of available vCPUs on a dedicated host. The number of available vCPUs on a dedicated host = Number of physical CPU cores × 2 × CPU overcommit ratio. For example, the number of physical CPU cores on each g6s host is 52. If you set the CPU overcommit ratio to 4, the total number of vCPUs on the dedicated host is 416. For scenarios that do not require strict CPU stability or have low CPU loads, such as development and testing environments, you can increase the CPU overcommit ratio to increase the number of available vCPUs and deploy more ECS instances of the same specifications, which reduces the unit deployment cost.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CpuOverCommitRatio")
    public Float cpuOverCommitRatio;

    /**
     * <p>The ID of the dedicated host cluster to which the dedicated host belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-bp12wlf6am0vz9v2****</p>
     */
    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    /**
     * <p>The name of the dedicated host. The name must be 2 to 128 characters in length and can contain Unicode characters under the Letter category, which includes characters from various scripts such as English, Chinese, and digits. The name can contain colons (:), underscores (_), periods (.), or hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>myDDH</p>
     */
    @NameInMap("DedicatedHostName")
    public String dedicatedHostName;

    /**
     * <p>The type of the dedicated host. You can call <a href="https://help.aliyun.com/document_detail/134240.html">DescribeDedicatedHostTypes</a> to query the most recent list of dedicated host types.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddh.c5</p>
     */
    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    /**
     * <p>The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This-is-my-DDH</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The minimum number of dedicated hosts to create. Valid values: 1 to 100.</p>
     * <blockquote>
     * <p>If the active stock of dedicated hosts is less than the minimum number, the dedicated host creation fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinQuantity")
    public Integer minQuantity;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription duration of the dedicated host. The <code>Period</code> parameter takes effect and is required only when <code>ChargeType</code> is set to <code>PrePaid</code>. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>If PeriodUnit is set to Week: 1, 2, 3, and 4.</li>
     * <li>If PeriodUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
     * <li>If PeriodUnit is set to Year: 1, 2, 3, 4, and 5.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>If PeriodUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
     * <li>If PeriodUnit is set to Year: 1, 2, 3, 4, and 5.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Week</li>
     * <li>Month</li>
     * <li>Year</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>Month</li>
     * <li>Year</li>
     * </ul>
     * <p>Default value: Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The number of dedicated hosts to create. Valid values: 1 to 100.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>The region ID of the dedicated host. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the dedicated host belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4ph***</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AllocateDedicatedHostsRequestTag> tag;

    /**
     * <p>The zone ID of the dedicated host.</p>
     * <p>Default value: empty, which indicates that the system selects a zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-f</p>
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
         * <p>The timeout period of a UDP session for load balancing connections to the dedicated host. Unit: seconds. Valid values: 15 to 310.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("SlbUdpTimeout")
        public Integer slbUdpTimeout;

        /**
         * <p>The timeout period of a UDP session between a user and a cloud service running on the dedicated host. Unit: seconds. Valid values: 15 to 310.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
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
         * <p>The tag key of the dedicated host. Valid values of N: 1 to 20.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Environment</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the dedicated host. Valid values of N: 1 to 20.</p>
         * <p>The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Production</p>
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
