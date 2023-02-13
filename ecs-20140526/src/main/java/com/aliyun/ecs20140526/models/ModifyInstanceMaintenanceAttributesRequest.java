// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceMaintenanceAttributesRequest extends TeaModel {
    @NameInMap("ActionOnMaintenance")
    public String actionOnMaintenance;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("MaintenanceWindow")
    public java.util.List<ModifyInstanceMaintenanceAttributesRequestMaintenanceWindow> maintenanceWindow;

    @NameInMap("NotifyOnMaintenance")
    public Boolean notifyOnMaintenance;

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

    public ModifyInstanceMaintenanceAttributesRequest setMaintenanceWindow(java.util.List<ModifyInstanceMaintenanceAttributesRequestMaintenanceWindow> maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }
    public java.util.List<ModifyInstanceMaintenanceAttributesRequestMaintenanceWindow> getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    public ModifyInstanceMaintenanceAttributesRequest setNotifyOnMaintenance(Boolean notifyOnMaintenance) {
        this.notifyOnMaintenance = notifyOnMaintenance;
        return this;
    }
    public Boolean getNotifyOnMaintenance() {
        return this.notifyOnMaintenance;
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

    public static class ModifyInstanceMaintenanceAttributesRequestMaintenanceWindow extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        public static ModifyInstanceMaintenanceAttributesRequestMaintenanceWindow build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceMaintenanceAttributesRequestMaintenanceWindow self = new ModifyInstanceMaintenanceAttributesRequestMaintenanceWindow();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceMaintenanceAttributesRequestMaintenanceWindow setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ModifyInstanceMaintenanceAttributesRequestMaintenanceWindow setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
