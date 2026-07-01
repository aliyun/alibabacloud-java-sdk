// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public ModifyPrepayInstanceSpecRequestSystemDisk systemDisk;

    /**
     * <p>Specifies whether to automatically complete the payment when you upgrade the instance type. Valid values:</p>
     * <ul>
     * <li>true: The payment is automatically completed.</li>
     * <li>false: Only an order is created. No payment is made.</li>
     * </ul>
     * <p>Default value: true.</p>
     * <blockquote>
     * <ul>
     * <li>If automatic payment is enabled, make sure that your payment method has a sufficient balance. Otherwise, an abnormal order is generated, and you can only cancel the order.</li>
     * <li>If your payment method balance is insufficient, you can set <code>AutoPay</code> to <code>false</code> to generate an unpaid order. Then, you can logon to the ECS console to pay for the order.</li>
     * <li>When <code>OperatorType</code> is set to <code>downgrade</code>, the <code>AutoPay</code> parameter is ignored.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("Disk")
    public java.util.List<ModifyPrepayInstanceSpecRequestDisk> disk;

    /**
     * <p>The end time of the temporary instance type change. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
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
     * <p>The target instance type for the Upgrade/Downgrade. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a> or invoke <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5.xlarge</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether to support cross-cluster instance type changes. Valid values:</p>
     * <ul>
     * <li>true: supported.</li>
     * <li>false: not supported.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <p>When the <code>MigrateAcrossZone</code> parameter is set to <code>true</code>, take note of the following items after you perform the optimization on the Elastic Compute Service instance based on the response:</p>
     * <p>VPC-type instances: For <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>, when a non-I/O optimized instance is changed to an I/O optimized instance, the disk device names and software authorization codes of the server change. For Linux instances, basic disks (cloud) are identified as xvda or xvdb. Ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified as vda or vdb.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MigrateAcrossZone")
    public Boolean migrateAcrossZone;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    /**
     * <p>The type of the operation. Valid values:</p>
     * <blockquote>
     * <p>This parameter is optional. The system can automatically determine whether the operation is an upgrade or a downgrade. If you upload this parameter, follow the rules below.</p>
     * </blockquote>
     * <ul>
     * <li><p>upgrade: upgrades the instance type. Make sure that your account payment method has a sufficient balance.</p>
     * </li>
     * <li><p>downgrade: decrease the quota of the instance type. When the instance type specified by <code>InstanceType</code> is lower than the current instance type, set <code>OperatorType</code> to <code>downgrade</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For precautions about upgrading or downgrading instance types, see the operation description section above.</p>
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
     * <p>The restart time of the instance. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-01T12:05Z</p>
     */
    @NameInMap("RebootTime")
    public String rebootTime;

    /**
     * <p>Specifies whether to immediately restart the instance after the instance type change is complete. Valid values:</p>
     * <ul>
     * <li>true: The instance is immediately restarted.</li>
     * <li>false: The instance is not restarted.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>If the instance is in the <strong>Stopped</strong> state, the instance remains stopped even if you set <code>RebootWhenFinished</code> to <code>true</code>. No operation is performed.</p>
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
         * <p>This parameter is valid only when you perform an Increase Quota from a <a href="https://help.aliyun.com/document_detail/55263.html">retired instance type</a> to a <a href="https://help.aliyun.com/document_detail/25378.html">Normal instance family</a> and change a non-I/O optimization instance to an I/O optimization instance.</p>
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
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
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
