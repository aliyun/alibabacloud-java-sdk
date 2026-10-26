// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public ModifyPrepayInstanceSpecRequestSystemDisk systemDisk;

    /**
     * <p>Specifies whether to enable automatic payment when you upgrade the instance type. Valid values:</p>
     * <ul>
     * <li>true: enables automatic payment.</li>
     * <li>false: generates the order without deducting fees.</li>
     * </ul>
     * <p>Default value: true.</p>
     * <blockquote>
     * <ul>
     * <li>When automatic payment is enabled, you must ensure that your payment method balance is sufficient. Otherwise, an abnormal order is generated and can only be canceled.</li>
     * <li>If your payment method balance is insufficient, you can set <code>AutoPay</code> to <code>false</code> to generate an unpaid order. Then, you can log on to the ECS console to complete the payment.</li>
     * <li>If the <code>OperatorType</code> parameter is set to <code>downgrade</code>, the <code>AutoPay</code> parameter is ignored.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     */
    @NameInMap("Disk")
    public java.util.List<ModifyPrepayInstanceSpecRequestDisk> disk;

    /**
     * <p>The end time of the temporary change. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.
     * <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a></p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-01T12:05Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4ph****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The target instance type for the upgrade or downgrade. For valid values, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5.xlarge</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether to allow cross-cluster instance type upgrade. Valid values:</p>
     * <ul>
     * <li>true: yes.</li>
     * <li>false: no.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <p>If the <code>MigrateAcrossZone</code> parameter is set to <code>true</code> and you upgrade the ECS instance based on the returned information, take note of the following items:</p>
     * <p>VPC-connected instances: For <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>, when you upgrade a non-I/O optimized instance to an I/O optimized instance, the disk device names and software authorization codes of the ECS instance change. For Linux instances, basic disks (cloud) are identified as xvda or xvdb, and ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified as vda or vdb.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MigrateAcrossZone")
    public Boolean migrateAcrossZone;

    /**
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    /**
     * <p>The operation type. Valid values:</p>
     * <blockquote>
     * <p>You do not need to specify this parameter. The system automatically determines whether to upgrade or downgrade the instance type. If you specify this parameter, follow these rules:</p>
     * </blockquote>
     * <ul>
     * <li><p>upgrade: upgrades the instance type. Make sure that your payment method balance is sufficient.</p>
     * </li>
     * <li><p>downgrade: downgrades the instance type. If the instance type specified by <code>InstanceType</code> is lower than the current instance type, set <code>OperatorType</code> to <code>downgrade</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For precautions about upgrading or downgrading instance types, see the preceding operation description section.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>upgrade</p>
     */
    @NameInMap("OperatorType")
    public String operatorType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The time to restart the instance. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.
     * <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a></p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-01T12:05Z</p>
     */
    @NameInMap("RebootTime")
    public String rebootTime;

    /**
     * <p>Specifies whether to immediately restart the instance after the instance type change is complete. Valid values:</p>
     * <ul>
     * <li>true: yes.</li>
     * <li>false: no.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>If the instance is in the <strong>Stopped</strong> state, it remains in the Stopped state and no action is performed even if you set <code>RebootWhenFinished</code> to <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RebootWhenFinished")
    public Boolean rebootWhenFinished;

    /**
     * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The new system disk category. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.<blockquote>
         * <p>This parameter is valid only when you upgrade from a <a href="https://help.aliyun.com/document_detail/55263.html">retired instance type</a> to a <a href="https://help.aliyun.com/document_detail/25378.html">normally sold instance family</a> and upgrade a non-I/O optimized instance type to an I/O optimized instance type.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
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
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
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
