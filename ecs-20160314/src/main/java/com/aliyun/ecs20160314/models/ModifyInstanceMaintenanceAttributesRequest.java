// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyInstanceMaintenanceAttributesRequest extends TeaModel {
    @NameInMap("ActionOnMaintenance")
    public String actionOnMaintenance;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("LiveMigration")
    public Boolean liveMigration;

    @NameInMap("MaintenanceWindow")
    public java.util.List<MaintenanceWindow> maintenanceWindow;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyInstanceMaintenanceAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMaintenanceAttributesRequest self = new ModifyInstanceMaintenanceAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMaintenanceAttributesRequest setActionOnMaintenance(String actionOnMaintenance) {
        this.actionOnMaintenance = actionOnMaintenance;
        return this;
    }
    public String getActionOnMaintenance() {
        return this.actionOnMaintenance;
    }

    public ModifyInstanceMaintenanceAttributesRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceMaintenanceAttributesRequest setLiveMigration(Boolean liveMigration) {
        this.liveMigration = liveMigration;
        return this;
    }
    public Boolean getLiveMigration() {
        return this.liveMigration;
    }

    public ModifyInstanceMaintenanceAttributesRequest setMaintenanceWindow(java.util.List<MaintenanceWindow> maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }
    public java.util.List<MaintenanceWindow> getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    public ModifyInstanceMaintenanceAttributesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceMaintenanceAttributesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceMaintenanceAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceMaintenanceAttributesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceMaintenanceAttributesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class MaintenanceWindow extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        public static MaintenanceWindow build(java.util.Map<String, ?> map) throws Exception {
            MaintenanceWindow self = new MaintenanceWindow();
            return TeaModel.build(map, self);
        }

        public MaintenanceWindow setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public MaintenanceWindow setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
