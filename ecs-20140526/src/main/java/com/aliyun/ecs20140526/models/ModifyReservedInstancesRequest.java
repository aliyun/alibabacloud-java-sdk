// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyReservedInstancesRequest extends TeaModel {
    /**
     * <p>The configurations of reserved instances.</p>
     */
    @NameInMap("Configuration")
    public java.util.List<ModifyReservedInstancesRequestConfiguration> configuration;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the reserved instance.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of reserved instances. Valid values of N: 1 to 20.</p>
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
         * <p>The number of pay-as-you-go instances of the same instance type that the reserved instance can match. The value of this parameter must be greater than or equal to 1. Valid values of N: 1 to 100.</p>
         */
        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        /**
         * <p>The instance type that reserved instance N can match. Valid values of N: 1 to 100.</p>
         * <br>
         * <p>> The supported instance types are regularly updated. For more information, see the "Attributes" section of [Overview](~~100370~~).</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The name of reserved instance N. Valid values of N: 1 to 100.</p>
         * <br>
         * <p>The name must be 2 to 128 characters in length. It must start with a letter but cannot start with [http:// or https://. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).](http://https://。、（:）、（\_）（-）。)</p>
         */
        @NameInMap("ReservedInstanceName")
        public String reservedInstanceName;

        /**
         * <p>The scope of reserved instance N. Valid values:</p>
         * <br>
         * <p>*   Region: regional.</p>
         * <p>*   Zone: zonal.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>Default value: Region.</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The zone ID of reserved instance N. Valid values of N: 1 to 100.</p>
         * <br>
         * <p>This parameter is required when `Scope` is set to `Zone`.</p>
         * <br>
         * <p>You can call the [DescribeZones](~~25609~~) operation to query the most recent list of zones.</p>
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
