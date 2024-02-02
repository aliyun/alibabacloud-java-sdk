// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public ModifyInstanceSpecRequestSystemDisk systemDisk;

    @NameInMap("Temporary")
    public ModifyInstanceSpecRequestTemporary temporary;

    /**
     * <p>Specifies whether to support cross-cluster instance type upgrades.</p>
     * <br>
     * <p>Default value: false.</p>
     * <br>
     * <p>When `AllowMigrateAcrossZone` is set to true and you upgrade the instance configurations based on the returned information, take note of the following items:</p>
     * <br>
     * <p>Instances of the classic network type:</p>
     * <br>
     * <p>*   For [retired instance types](~~55263~~), the private IP address, disk device names, and software authorization codes of a non-I/O optimized instance change when you upgrade the instance to an I/O optimized instance. For Linux instances, basic disks (`cloud`) are identified by the prefix **xvd** such as **xvda and xvdb**. Ultra disks (`cloud_efficiency`) and standard SSDs (`cloud_ssd`) are identified by the prefix **vd** such as **vda and vdb**.</p>
     * <p>*   For instance families that are available for purchase, when the instance type of an instance is changed, the private IP address of the instance is also changed. For more information, see [Overview of instance families](~~25378~~).</p>
     * <br>
     * <p>Instances of the Virtual Private Cloud (VPC) type: For [retired instance types](~~55263~~), if a non-I/O-optimized instance is upgraded to an I/O-optimized instance, the disk device names and software authorization codes of the instance change. For Linux instances, basic disks (`cloud`) are identified by the prefix **xvd** such as **xvda and xvdb**. Ultra disks (`cloud_efficiency`) and standard SSDs (`cloud_ssd`) are identified by the prefix **vd** such as **vda and vdb**.</p>
     */
    @NameInMap("AllowMigrateAcrossZone")
    public Boolean allowMigrateAcrossZone;

    /**
     * <p>Specifies whether to submit an asynchronous request.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>>该参数暂未开放使用。</p>
     */
    @NameInMap("Disk")
    public java.util.List<ModifyInstanceSpecRequestDisk> disk;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new instance type. For more information, see [Overview of instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent list of instance types.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
     * <br>
     * <p>*   When the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid value of this parameter ranges from 1 to 10 and the default value is 10.</p>
     * <p>*   When the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the `InternetMaxBandwidthOut` value and the default value is the `InternetMaxBandwidthOut` value.</p>
     * <br>
     * <p>> When the **pay-by-traffic** billing method for network usage is used, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instance, use the **pay-by-bandwidth** billing method for network usage.</p>
     */
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
     * <br>
     * <p>> When the **pay-by-traffic** billing method for network usage is used, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instance, use the **pay-by-bandwidth** billing method for network usage.</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>>该参数暂未开放使用。</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

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

    public ModifyInstanceSpecRequest setDisk(java.util.List<ModifyInstanceSpecRequestDisk> disk) {
        this.disk = disk;
        return this;
    }
    public java.util.List<ModifyInstanceSpecRequestDisk> getDisk() {
        return this.disk;
    }

    public ModifyInstanceSpecRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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

    public ModifyInstanceSpecRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
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
        /**
         * <p>The new category of the system disk. This parameter is valid only when you upgrade an instance from a retired instance type to an available instance type or when you upgrade a non-I/O optimized instance to an I/O optimized instance. For more information, see [Retired instance types](~~55263~~) and [Overview of instance families](~~25378~~). Valid values:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         */
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
        /**
         * <p>> This parameter is in invitational preview and is not publicly available.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>> This parameter is in invitational preview and is not publicly available.</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <p>> This parameter is in invitational preview and is not publicly available.</p>
         */
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

    public static class ModifyInstanceSpecRequestDisk extends TeaModel {
        /**
         * <p>>该参数暂未开放使用。</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>>该参数暂未开放使用。</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>>该参数暂未开放使用。</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        public static ModifyInstanceSpecRequestDisk build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceSpecRequestDisk self = new ModifyInstanceSpecRequestDisk();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceSpecRequestDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyInstanceSpecRequestDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public ModifyInstanceSpecRequestDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

    }

}
