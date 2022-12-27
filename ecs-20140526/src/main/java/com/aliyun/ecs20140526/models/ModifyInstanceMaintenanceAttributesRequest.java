// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceMaintenanceAttributesRequest extends TeaModel {
    // The maintenance action. Valid values:
    // 
    // *   Stop: stops the instance.
    // *   AutoRecover: automatically recovers the instance.
    // *   AutoRedeploy: fails the instance over, which may cause damage to the data disks attached to the instance.
    @NameInMap("ActionOnMaintenance")
    public String actionOnMaintenance;

    // The IDs of the instances. You can specify up to 100 IDs.
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    // The list of maintenance windows.
    @NameInMap("MaintenanceWindow")
    public java.util.List<ModifyInstanceMaintenanceAttributesRequestMaintenanceWindow> maintenanceWindow;

    // Specifies whether to send an event notification before instance shutdown. Valid values:
    // 
    // *   True: sends an event notification.
    // *   False: does not send an event notification.
    // 
    // Default value: false.
    @NameInMap("NotifyOnMaintenance")
    public Boolean notifyOnMaintenance;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
        // The end time of maintenance window.
        // 
        // The time must be on the hour at exactly 0 minute and 0 second. The StartTime and EndTime parameters must be specified at the same time. The Endtime value must be 1 to 23 hours later than the StartTime value. Specify the time in the `HH:mm:ss` format.
        // 
        // The time must be in UTC+8.
        @NameInMap("EndTime")
        public String endTime;

        // The start time of maintenance window.
        // 
        // The time must be on the hour at exactly 0 minute and 0 second. The StartTime and EndTime parameters must be specified at the same time. The Endtime value must be 1 to 23 hours later than the StartTime value. Specify the time in the `HH:mm:ss` format.
        // 
        // The time must be in UTC+8.
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
