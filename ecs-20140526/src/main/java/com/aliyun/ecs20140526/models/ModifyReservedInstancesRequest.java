// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyReservedInstancesRequest extends TeaModel {
    /**
     * <p>The configurations of the new reserved instances. You can specify up to 100 new reserved instances.</p>
     */
    @NameInMap("Configuration")
    public java.util.List<ModifyReservedInstancesRequestConfiguration> configuration;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The IDs of reserved instances. Valid values of N: 1 to 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of reserved instances that you want to modify. You can specify up to 20 reserved instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ReservedInstanceId.1=&quot;ecsri-bp1cx3****&quot;,ReservedInstanceId.2=&quot;ecsri-bp15xx2****&quot;......</p>
     */
    @NameInMap("ReservedInstanceId")
    public java.util.List<String> reservedInstanceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyReservedInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservedInstancesRequest self = new ModifyReservedInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyReservedInstancesRequest setConfiguration(java.util.List<ModifyReservedInstancesRequestConfiguration> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.List<ModifyReservedInstancesRequestConfiguration> getConfiguration() {
        return this.configuration;
    }

    public ModifyReservedInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyReservedInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyReservedInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyReservedInstancesRequest setReservedInstanceId(java.util.List<String> reservedInstanceId) {
        this.reservedInstanceId = reservedInstanceId;
        return this;
    }
    public java.util.List<String> getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    public ModifyReservedInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyReservedInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyReservedInstancesRequestConfiguration extends TeaModel {
        /**
         * <p>The number of pay-as-you-go instances of the specified instance type that the new reserved instance can match. The value of this parameter must be greater than or equal to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        /**
         * <p>The instance types that the new reserved instance can match.</p>
         * <blockquote>
         * <p> The supported instance types are continuously updated. For information about the instance types supported by reserved instances, see <a href="~~100370#3c1b682051vt4~~">Overview of reserved instances</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.4xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The name of the new reserved instance.</p>
         * <p>The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testReservedInstanceName</p>
         */
        @NameInMap("ReservedInstanceName")
        public String reservedInstanceName;

        /**
         * <p>The scope level of the new reserved instance. Valid values:</p>
         * <ul>
         * <li>Region</li>
         * <li>Zone</li>
         * </ul>
         * <p>Default value: Region.</p>
         * 
         * <strong>example:</strong>
         * <p>Zone</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The zone ID of the new reserved instance.</p>
         * <p>This parameter is required when you set <code>Scope</code> to <code>Zone</code>.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeZones</a> operation to query the most recent zone list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ModifyReservedInstancesRequestConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ModifyReservedInstancesRequestConfiguration self = new ModifyReservedInstancesRequestConfiguration();
            return TeaModel.build(map, self);
        }

        public ModifyReservedInstancesRequestConfiguration setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        public ModifyReservedInstancesRequestConfiguration setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyReservedInstancesRequestConfiguration setReservedInstanceName(String reservedInstanceName) {
            this.reservedInstanceName = reservedInstanceName;
            return this;
        }
        public String getReservedInstanceName() {
            return this.reservedInstanceName;
        }

        public ModifyReservedInstancesRequestConfiguration setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ModifyReservedInstancesRequestConfiguration setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
