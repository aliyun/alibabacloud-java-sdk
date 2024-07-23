// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAttributeRequest extends TeaModel {
    @NameInMap("NetworkAttributes")
    public ModifyDedicatedHostAttributeRequestNetworkAttributes networkAttributes;

    /**
     * <p>The policy for migrating the instances deployed on the dedicated host when the dedicated host fails or needs to be repaired online. Valid values:</p>
     * <ul>
     * <li>Migrate: The instances are migrated to another physical machine and then restarted.</li>
     * <li>Stop: The instances are stopped. If the dedicated host cannot be repaired, the instances are migrated to another physical machine and then restarted.</li>
     * </ul>
     * <p>If the dedicated host has cloud disks attached, the default value is Migrate.</p>
     * <p>If the dedicated host has local disks attached, the default value is Stop.</p>
     * 
     * <strong>example:</strong>
     * <p>Migrate</p>
     */
    @NameInMap("ActionOnMaintenance")
    public String actionOnMaintenance;

    /**
     * <p>Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you do not specify <strong>DedicatedHostId</strong> when you create an instance on a dedicated host, Alibaba Cloud automatically selects a dedicated host from the resource pool to host the instance. Valid values:</p>
     * <ul>
     * <li>on: adds the dedicated host to the resource pool for automatic deployment.</li>
     * <li>off: does not add the dedicated host to the resource pool for automatic deployment.</li>
     * </ul>
     * <p>For information about automatic deployment, see <a href="https://help.aliyun.com/document_detail/118938.html">Functions and features</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AutoPlacement")
    public String autoPlacement;

    /**
     * <p>The CPU overcommit ratio. You can configure CPU overcommit ratios only for the following dedicated host types: g6s, c6s, and r6s. Valid values: 1 to 5.</p>
     * <p>The CPU overcommit ratio affects the number of available vCPUs on a dedicated host. You can use the following formula to calculate the number of available vCPUs on a dedicated host: Number of available vCPUs = Number of physical CPU cores × 2 × CPU overcommit ratio. For example, the number of physical CPU cores on each g6s dedicated host is 52. If you change the CPU overcommit ratio of a g6s dedicated host to 4, the number of available vCPUs on the dedicated host is 416. For scenarios that have minimal requirements for CPU stability or where CPU load is not heavy, such as development and test environments, you can increase the number of available vCPUs on a dedicated host by increasing the CPU overcommit ratio. This allows you to deploy more ECS instances of the same specifications on the dedicated host and reduce the unit deployment cost.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CpuOverCommitRatio")
    public Float cpuOverCommitRatio;

    /**
     * <p>The ID of the dedicated host cluster to which to assign the dedicated host.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-bp165p6xk2tlw61e****</p>
     */
    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    /**
     * <p>The ID of the dedicated host.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp165p6xk2tlw61e****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The name of the dedicated host. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testDedicatedHostName</p>
     */
    @NameInMap("DedicatedHostName")
    public String dedicatedHostName;

    /**
     * <p>The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the dedicated host resides. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

    public static ModifyDedicatedHostAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAttributeRequest self = new ModifyDedicatedHostAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAttributeRequest setNetworkAttributes(ModifyDedicatedHostAttributeRequestNetworkAttributes networkAttributes) {
        this.networkAttributes = networkAttributes;
        return this;
    }
    public ModifyDedicatedHostAttributeRequestNetworkAttributes getNetworkAttributes() {
        return this.networkAttributes;
    }

    public ModifyDedicatedHostAttributeRequest setActionOnMaintenance(String actionOnMaintenance) {
        this.actionOnMaintenance = actionOnMaintenance;
        return this;
    }
    public String getActionOnMaintenance() {
        return this.actionOnMaintenance;
    }

    public ModifyDedicatedHostAttributeRequest setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }
    public String getAutoPlacement() {
        return this.autoPlacement;
    }

    public ModifyDedicatedHostAttributeRequest setCpuOverCommitRatio(Float cpuOverCommitRatio) {
        this.cpuOverCommitRatio = cpuOverCommitRatio;
        return this;
    }
    public Float getCpuOverCommitRatio() {
        return this.cpuOverCommitRatio;
    }

    public ModifyDedicatedHostAttributeRequest setDedicatedHostClusterId(String dedicatedHostClusterId) {
        this.dedicatedHostClusterId = dedicatedHostClusterId;
        return this;
    }
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    public ModifyDedicatedHostAttributeRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public ModifyDedicatedHostAttributeRequest setDedicatedHostName(String dedicatedHostName) {
        this.dedicatedHostName = dedicatedHostName;
        return this;
    }
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    public ModifyDedicatedHostAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDedicatedHostAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDedicatedHostAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDedicatedHostAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDedicatedHostAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDedicatedHostAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyDedicatedHostAttributeRequestNetworkAttributes extends TeaModel {
        /**
         * <p>The timeout period for a UDP session between a Server Load Balancer (SLB) instance and the dedicated host. Unit: seconds. Valid values: 15 to 310.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("SlbUdpTimeout")
        public Integer slbUdpTimeout;

        /**
         * <p>The timeout period for a UDP session between a user and an Alibaba Cloud service on the dedicated host. Unit: seconds. Valid values: 15 to 310.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("UdpTimeout")
        public Integer udpTimeout;

        public static ModifyDedicatedHostAttributeRequestNetworkAttributes build(java.util.Map<String, ?> map) throws Exception {
            ModifyDedicatedHostAttributeRequestNetworkAttributes self = new ModifyDedicatedHostAttributeRequestNetworkAttributes();
            return TeaModel.build(map, self);
        }

        public ModifyDedicatedHostAttributeRequestNetworkAttributes setSlbUdpTimeout(Integer slbUdpTimeout) {
            this.slbUdpTimeout = slbUdpTimeout;
            return this;
        }
        public Integer getSlbUdpTimeout() {
            return this.slbUdpTimeout;
        }

        public ModifyDedicatedHostAttributeRequestNetworkAttributes setUdpTimeout(Integer udpTimeout) {
            this.udpTimeout = udpTimeout;
            return this;
        }
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

    }

}
