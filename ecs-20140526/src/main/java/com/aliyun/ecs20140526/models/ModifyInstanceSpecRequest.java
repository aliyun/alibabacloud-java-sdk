// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public ModifyInstanceSpecRequestSystemDisk systemDisk;

    @NameInMap("Temporary")
    public ModifyInstanceSpecRequestTemporary temporary;

    // Specifies whether to allow cross-cluster instance type upgrades.
    // 
    // Default value: false.
    // 
    // When `AllowMigrateAcrossZone` is set to true and you upgrade the instance configurations based on the returned information, take note of the following items:
    // 
    // Instances in the classic network:
    // 
    // *   For retired instance types, when the configurations of a non-I/O optimized instance is upgraded to those of an I/O optimized instance, the private IP address, disk device names, and software license code of the instance are changed. For information about retired instance types, see [Retired instance types](~~55263~~). For Linux instances, basic disks (`cloud`) are identified as xvd\*, such as **xvda** and **xvdb**. Ultra disks (`cloud_efficiency`) and standard SSDs (`cloud_ssd`) are identified as vd\*, such as **vda** and **vdb**.
    // *   For instance families available for purchase, when the instance type of an instance is changed, the private IP address of the instance is also changed. For information about instance families available for purchase, see [Instance families](~~25378~~).
    // 
    // Instances in VPCs: For retired instance types, when the configurations of a non-I/O optimized instance is upgraded to those of an I/O optimized instance, the disk device names and software license code of the instance are changed. For information about retired instance types, see [Retired instance types](~~55263~~). For Linux instances, basic disks (`cloud`) are identified as xvd\*, such as **xvda** and **xvdb**. Ultra disks (`cloud_efficiency`) and standard SSDs (`cloud_ssd`) are identified as vd\*, such as **vda** and **vdb**.
    @NameInMap("AllowMigrateAcrossZone")
    public Boolean allowMigrateAcrossZone;

    // Specifies whether to submit an asynchronous request.
    // 
    // Default value: false.
    @NameInMap("Async")
    public Boolean async;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The **ClientToken** value must contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The new instance type. For more information, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent instance type list.
    @NameInMap("InstanceType")
    public String instanceType;

    // The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:
    // 
    // *   When the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of InternetMaxBandwidthIn are 1 to 10 and the default value is 10.
    // *   When the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of InternetMaxBandwidthIn are 1 to the `InternetMaxBandwidthOut` value and the default value is the `InternetMaxBandwidthOut` value.
    // 
    // >  When the **pay-by-traffic** billing method for network usage is used, the peak inbound and outbound bandwidths indicate the upper limits for bandwidths and are used only for reference. When resources are insufficient, these maximum bandwidths cannot be guaranteed. If you want guaranteed bandwidths for your instances, use the **pay-by-bandwidth** billing method for network usage.
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    // The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
    // 
    // >  When the **pay-by-traffic** billing method for network usage is used, the maximum inbound and outbound bandwidths indicate the upper limits for bandwidths and are used only for reference. When resources are insufficient, these maximum bandwidths cannot be guaranteed. If you want guaranteed bandwidths for your instances, use the **pay-by-bandwidth** billing method for network usage.
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSpecRequest self = new ModifyInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSpecRequest setSystemDisk(ModifyInstanceSpecRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public ModifyInstanceSpecRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public ModifyInstanceSpecRequest setTemporary(ModifyInstanceSpecRequestTemporary temporary) {
        this.temporary = temporary;
        return this;
    }
    public ModifyInstanceSpecRequestTemporary getTemporary() {
        return this.temporary;
    }

    public ModifyInstanceSpecRequest setAllowMigrateAcrossZone(Boolean allowMigrateAcrossZone) {
        this.allowMigrateAcrossZone = allowMigrateAcrossZone;
        return this;
    }
    public Boolean getAllowMigrateAcrossZone() {
        return this.allowMigrateAcrossZone;
    }

    public ModifyInstanceSpecRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public ModifyInstanceSpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceSpecRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyInstanceSpecRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public ModifyInstanceSpecRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public ModifyInstanceSpecRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceSpecRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceSpecRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyInstanceSpecRequestSystemDisk extends TeaModel {
        // The category of the system disk. This parameter is valid only when you upgrade the configurations of an instance from a retired instance type to an available instance type or from a non-I/O optimized instance to an I/O optimized instance. For more information, see [Retired instance types](~~55263~~) and [Instance families](~~25378~~). Valid values:
        // 
        // *   cloud_efficiency: ultra disk
        // *   cloud_ssd: standard SSD
        @NameInMap("Category")
        public String category;

        public static ModifyInstanceSpecRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceSpecRequestSystemDisk self = new ModifyInstanceSpecRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceSpecRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

    public static class ModifyInstanceSpecRequestTemporary extends TeaModel {
        // >  This parameter is currently in invitational preview and unavailable for general users.
        @NameInMap("EndTime")
        public String endTime;

        // >  This parameter is currently in invitational preview and unavailable for general users.
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        // >  This parameter is currently in invitational preview and unavailable for general users.
        @NameInMap("StartTime")
        public String startTime;

        public static ModifyInstanceSpecRequestTemporary build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceSpecRequestTemporary self = new ModifyInstanceSpecRequestTemporary();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceSpecRequestTemporary setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ModifyInstanceSpecRequestTemporary setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public ModifyInstanceSpecRequestTemporary setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
