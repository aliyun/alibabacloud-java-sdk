// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public ModifyPrepayInstanceSpecRequestSystemDisk systemDisk;

    /**
     * <p>Specifies whether to enable automatic payment when you upgrade the instance type. Valid values:</p>
     * <br>
     * <p>*   true: enables automatic payment.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Make sure that your payment account has sufficient balance. Otherwise, your order becomes invalid and is canceled.** If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ECS console to pay for the order.````</p>
     * <br>
     * <p>*   false: An order is generated but no payment is made.</p>
     * <br>
     * <p>Default value: true.</p>
     * <br>
     * <p>When `OperatorType` is set to `downgrade`, `AutoPay` is ignored.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that you want to use to ensure the idempotency of the request. You can use the client to generate the value, but make sure that the value is unique among different requests. This value allows only ASCII characters and is up to 64 characters in length. For more information, see [How do I ensure the idempotence of a request?](~~25693~~)</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>>该参数暂未开放使用。</p>
     */
    @NameInMap("Disk")
    public java.util.List<ModifyPrepayInstanceSpecRequestDisk> disk;

    /**
     * <p>The end time of the temporary change. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new instance type. For information about available instance types, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether to support cross-cluster instance type upgrades.</p>
     * <br>
     * <p>Default value: false.</p>
     * <br>
     * <p>When you set `MigrateAcrossZone` to `true` and you upgrade the instance based on the returned information, take note of the following items:</p>
     * <br>
     * <p>Instances of the classic network type:</p>
     * <br>
     * <p>*   For retired instance types, when a non-I/O optimized instance is upgraded to an I/O optimized instance, the private IP address, disk device names, and software license codes of the instance are changed. For more information, see [Retired instance types](~~55263~~). For Linux instances, basic disks (cloud) are identified by the prefix xvd. Ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified by the prefix vd.</p>
     * <p>*   For [instance families available for purchase](~~25378~~), when the instance type of an instance is changed, the private IP address of the instance changes.</p>
     * <br>
     * <p>Instances of the Virtual Private Cloud (VPC) type: For retired instance types, when a non-I/O optimized instance is upgraded to an I/O optimized instance, the disk device names and software license codes of the instance are changed. For Linux instances, basic disks (cloud) are identified by the prefix xvd. Ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified by the prefix vd.</p>
     */
    @NameInMap("MigrateAcrossZone")
    public Boolean migrateAcrossZone;

    /**
     * <p>>该参数暂未开放使用。</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    /**
     * <p>The type of the change to the instance. Valid values:</p>
     * <br>
     * <p>>  This parameter is optional. The system can automatically determine whether the instance change is an upgrade or a downgrade. If you want to specify this parameter, refer to the following valid values of the parameter.</p>
     * <br>
     * <p>*   upgrade: upgrades the instance type. Make sure that the balance in your account is sufficient.</p>
     * <p>*   downgrade: downgrades the instance type. When the new instance type specified by the `InstanceType` parameter has lower specifications than the current instance type, set `OperatorType` to downgrade.</p>
     * <br>
     * <p>>  You can refer to the preceding usage notes on how to upgrade or downgrade the instance type.</p>
     */
    @NameInMap("OperatorType")
    public String operatorType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The restart time of the instance. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("RebootTime")
    public String rebootTime;

    /**
     * <p>Specifies whether to restart the instance immediately after the instance type is changed. Valid values:</p>
     * <br>
     * <p>*   true: restart the instance immediately after the instance type is changed.</p>
     * <p>*   false: does not restart the instance immediately after the instance type is changed.</p>
     * <br>
     * <p>Default value: false.</p>
     * <br>
     * <p>>  If the instance is in the **Stopping** state, the instance status remains unchanged and no operations are performed after the instance type is change regardless of whether you set the `RebootWhenFinished` parameter to true.</p>
     */
    @NameInMap("RebootWhenFinished")
    public Boolean rebootWhenFinished;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyPrepayInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecRequest self = new ModifyPrepayInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayInstanceSpecRequest setSystemDisk(ModifyPrepayInstanceSpecRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public ModifyPrepayInstanceSpecRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public ModifyPrepayInstanceSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyPrepayInstanceSpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyPrepayInstanceSpecRequest setDisk(java.util.List<ModifyPrepayInstanceSpecRequestDisk> disk) {
        this.disk = disk;
        return this;
    }
    public java.util.List<ModifyPrepayInstanceSpecRequestDisk> getDisk() {
        return this.disk;
    }

    public ModifyPrepayInstanceSpecRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ModifyPrepayInstanceSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPrepayInstanceSpecRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyPrepayInstanceSpecRequest setMigrateAcrossZone(Boolean migrateAcrossZone) {
        this.migrateAcrossZone = migrateAcrossZone;
        return this;
    }
    public Boolean getMigrateAcrossZone() {
        return this.migrateAcrossZone;
    }

    public ModifyPrepayInstanceSpecRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifyPrepayInstanceSpecRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public ModifyPrepayInstanceSpecRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyPrepayInstanceSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyPrepayInstanceSpecRequest setRebootTime(String rebootTime) {
        this.rebootTime = rebootTime;
        return this;
    }
    public String getRebootTime() {
        return this.rebootTime;
    }

    public ModifyPrepayInstanceSpecRequest setRebootWhenFinished(Boolean rebootWhenFinished) {
        this.rebootWhenFinished = rebootWhenFinished;
        return this;
    }
    public Boolean getRebootWhenFinished() {
        return this.rebootWhenFinished;
    }

    public ModifyPrepayInstanceSpecRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPrepayInstanceSpecRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyPrepayInstanceSpecRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyPrepayInstanceSpecRequestSystemDisk extends TeaModel {
        /**
         * <p>The new category of the system disk. This parameter is applicable only when you upgrade an instance from a retired instance type to a currently available instance type or when you upgrade a non-I/O optimized instance to an I/O optimized instance. For more information, see [Retired instance types](~~55263~~) and [Instance families](~~25378~~). Valid values:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         */
        @NameInMap("Category")
        public String category;

        public static ModifyPrepayInstanceSpecRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrepayInstanceSpecRequestSystemDisk self = new ModifyPrepayInstanceSpecRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public ModifyPrepayInstanceSpecRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

    public static class ModifyPrepayInstanceSpecRequestDisk extends TeaModel {
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

        public static ModifyPrepayInstanceSpecRequestDisk build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrepayInstanceSpecRequestDisk self = new ModifyPrepayInstanceSpecRequestDisk();
            return TeaModel.build(map, self);
        }

        public ModifyPrepayInstanceSpecRequestDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyPrepayInstanceSpecRequestDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public ModifyPrepayInstanceSpecRequestDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

    }

}
