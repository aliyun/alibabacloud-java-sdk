// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyReservedInstancesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReservedInstanceId")
    public java.util.List<String> reservedInstanceId;

    @NameInMap("Configuration")
    public java.util.List<ModifyReservedInstancesRequestConfiguration> configuration;

    public static ModifyReservedInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservedInstancesRequest self = new ModifyReservedInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyReservedInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public ModifyReservedInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
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

    public ModifyReservedInstancesRequest setConfiguration(java.util.List<ModifyReservedInstancesRequestConfiguration> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.List<ModifyReservedInstancesRequestConfiguration> getConfiguration() {
        return this.configuration;
    }

    public static class ModifyReservedInstancesRequestConfiguration extends TeaModel {
        @NameInMap("ReservedInstanceName")
        public String reservedInstanceName;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        public static ModifyReservedInstancesRequestConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ModifyReservedInstancesRequestConfiguration self = new ModifyReservedInstancesRequestConfiguration();
            return TeaModel.build(map, self);
        }

        public ModifyReservedInstancesRequestConfiguration setReservedInstanceName(String reservedInstanceName) {
            this.reservedInstanceName = reservedInstanceName;
            return this;
        }
        public String getReservedInstanceName() {
            return this.reservedInstanceName;
        }

        public ModifyReservedInstancesRequestConfiguration setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ModifyReservedInstancesRequestConfiguration setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ModifyReservedInstancesRequestConfiguration setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyReservedInstancesRequestConfiguration setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

    }

}
