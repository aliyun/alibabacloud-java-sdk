// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable AI function.</p>
     */
    @NameInMap("aiFunction")
    public Boolean aiFunction;

    /**
     * <p>Specifies whether to enable automatic backup.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoBackup")
    public Boolean autoBackup;

    /**
     * <p>Specifies whether to enable automatic payment. Default value: true. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when the payment type is set to Subscription.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoRenew")
    public Boolean autoRenew;

    /**
     * <p>The backup and restoration information.</p>
     */
    @NameInMap("backupRestoreInfo")
    public CreateInstanceRequestBackupRestoreInfo backupRestoreInfo;

    /**
     * <p>The component information.</p>
     */
    @NameInMap("components")
    public java.util.List<CreateInstanceRequestComponents> components;

    /**
     * <p>The configuration items.</p>
     * 
     * <strong>example:</strong>
     * <p>rootCoord:
     *     maxDatabaseNum: 64 # Maximum number of database
     *     maxPartitionNum: 4096</p>
     */
    @NameInMap("configuration")
    public String configuration;

    /**
     * <p>The database administrator password.</p>
     * 
     * <strong>example:</strong>
     * <p>test12</p>
     */
    @NameInMap("dbAdminPassword")
    public String dbAdminPassword;

    /**
     * <p>The Milvus version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.4</p>
     */
    @NameInMap("dbVersion")
    public String dbVersion;

    /**
     * <p>Specifies whether to enable OSS encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("encrypted")
    public Boolean encrypted;

    /**
     * <p>Specifies whether to enable high availability.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ha")
    public Boolean ha;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>milvus-test</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>Specifies whether to enable multi-zone storage.</p>
     */
    @NameInMap("isMultiAzStorage")
    public Boolean isMultiAzStorage;

    /**
     * <p>The ID of the KMS key used for encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>key-xxx</p>
     */
    @NameInMap("kmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The number of load replicas.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("loadReplicas")
    public Integer loadReplicas;

    /**
     * <p>The zone configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Single</p>
     */
    @NameInMap("multiZoneMode")
    public String multiZoneMode;

    /**
     * <p>The payment duration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("paymentDuration")
    public Integer paymentDuration;

    /**
     * <p>The payment duration unit.</p>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("paymentDurationUnit")
    public String paymentDurationUnit;

    /**
     * <p>The payment type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>The coupon code.</p>
     * 
     * <strong>example:</strong>
     * <p>22120151****</p>
     */
    @NameInMap("promotionNo")
    public String promotionNo;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The instance tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<CreateInstanceRequestTags> tags;

    /**
     * <p>The vSwitches.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;vsw-123xxx&quot;]</p>
     */
    @NameInMap("vSwitchIds")
    public java.util.List<CreateInstanceRequestVSwitchIds> vSwitchIds;

    /**
     * <p>The VPC ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-123xxx</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The primary zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-g</p>
     */
    @NameInMap("zoneId")
    public String zoneId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateInstanceRequest setAiFunction(Boolean aiFunction) {
        this.aiFunction = aiFunction;
        return this;
    }
    public Boolean getAiFunction() {
        return this.aiFunction;
    }

    public CreateInstanceRequest setAutoBackup(Boolean autoBackup) {
        this.autoBackup = autoBackup;
        return this;
    }
    public Boolean getAutoBackup() {
        return this.autoBackup;
    }

    public CreateInstanceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstanceRequest setBackupRestoreInfo(CreateInstanceRequestBackupRestoreInfo backupRestoreInfo) {
        this.backupRestoreInfo = backupRestoreInfo;
        return this;
    }
    public CreateInstanceRequestBackupRestoreInfo getBackupRestoreInfo() {
        return this.backupRestoreInfo;
    }

    public CreateInstanceRequest setComponents(java.util.List<CreateInstanceRequestComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<CreateInstanceRequestComponents> getComponents() {
        return this.components;
    }

    public CreateInstanceRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public CreateInstanceRequest setDbAdminPassword(String dbAdminPassword) {
        this.dbAdminPassword = dbAdminPassword;
        return this;
    }
    public String getDbAdminPassword() {
        return this.dbAdminPassword;
    }

    public CreateInstanceRequest setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
        return this;
    }
    public String getDbVersion() {
        return this.dbVersion;
    }

    public CreateInstanceRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public CreateInstanceRequest setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setIsMultiAzStorage(Boolean isMultiAzStorage) {
        this.isMultiAzStorage = isMultiAzStorage;
        return this;
    }
    public Boolean getIsMultiAzStorage() {
        return this.isMultiAzStorage;
    }

    public CreateInstanceRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public CreateInstanceRequest setLoadReplicas(Integer loadReplicas) {
        this.loadReplicas = loadReplicas;
        return this;
    }
    public Integer getLoadReplicas() {
        return this.loadReplicas;
    }

    public CreateInstanceRequest setMultiZoneMode(String multiZoneMode) {
        this.multiZoneMode = multiZoneMode;
        return this;
    }
    public String getMultiZoneMode() {
        return this.multiZoneMode;
    }

    public CreateInstanceRequest setPaymentDuration(Integer paymentDuration) {
        this.paymentDuration = paymentDuration;
        return this;
    }
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    public CreateInstanceRequest setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public CreateInstanceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateInstanceRequest setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
        return this;
    }
    public String getPromotionNo() {
        return this.promotionNo;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstanceRequest setTags(java.util.List<CreateInstanceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateInstanceRequestTags> getTags() {
        return this.tags;
    }

    public CreateInstanceRequest setVSwitchIds(java.util.List<CreateInstanceRequestVSwitchIds> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<CreateInstanceRequestVSwitchIds> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public CreateInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateInstanceRequestBackupRestoreInfo extends TeaModel {
        /**
         * <p>The backup ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bt-xxxxx</p>
         */
        @NameInMap("backupId")
        public String backupId;

        /**
         * <p>The backup name.</p>
         * 
         * <strong>example:</strong>
         * <p>Backup1</p>
         */
        @NameInMap("backupName")
        public String backupName;

        /**
         * <p>The ID of the source backup cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c-xxxxxxx</p>
         */
        @NameInMap("sourceClusterId")
        public String sourceClusterId;

        public static CreateInstanceRequestBackupRestoreInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestBackupRestoreInfo self = new CreateInstanceRequestBackupRestoreInfo();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestBackupRestoreInfo setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public CreateInstanceRequestBackupRestoreInfo setBackupName(String backupName) {
            this.backupName = backupName;
            return this;
        }
        public String getBackupName() {
            return this.backupName;
        }

        public CreateInstanceRequestBackupRestoreInfo setSourceClusterId(String sourceClusterId) {
            this.sourceClusterId = sourceClusterId;
            return this;
        }
        public String getSourceClusterId() {
            return this.sourceClusterId;
        }

    }

    public static class CreateInstanceRequestComponentsDataDisk extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("performanceLevel")
        public String performanceLevel;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>alicloud-disk-essd-pl1</p>
         */
        @NameInMap("storageClass")
        public String storageClass;

        public static CreateInstanceRequestComponentsDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestComponentsDataDisk self = new CreateInstanceRequestComponentsDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestComponentsDataDisk setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateInstanceRequestComponentsDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateInstanceRequestComponentsDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateInstanceRequestComponentsDataDisk setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

    }

    public static class CreateInstanceRequestComponents extends TeaModel {
        /**
         * <p>The number of compute units (CUs).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cuNum")
        public Integer cuNum;

        /**
         * <p>The CU type.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("cuType")
        public String cuType;

        @NameInMap("dataDisk")
        public CreateInstanceRequestComponentsDataDisk dataDisk;

        /**
         * <p>The disk size type for Query Node. Set to Large for storage-optimized, and Normal for compute-optimized or other configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("diskSizeType")
        public String diskSizeType;

        /**
         * <p>The number of replicas.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("replica")
        public Integer replica;

        /**
         * <p>The component type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>standalone</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateInstanceRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestComponents self = new CreateInstanceRequestComponents();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestComponents setCuNum(Integer cuNum) {
            this.cuNum = cuNum;
            return this;
        }
        public Integer getCuNum() {
            return this.cuNum;
        }

        public CreateInstanceRequestComponents setCuType(String cuType) {
            this.cuType = cuType;
            return this;
        }
        public String getCuType() {
            return this.cuType;
        }

        public CreateInstanceRequestComponents setDataDisk(CreateInstanceRequestComponentsDataDisk dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public CreateInstanceRequestComponentsDataDisk getDataDisk() {
            return this.dataDisk;
        }

        public CreateInstanceRequestComponents setDiskSizeType(String diskSizeType) {
            this.diskSizeType = diskSizeType;
            return this;
        }
        public String getDiskSizeType() {
            return this.diskSizeType;
        }

        public CreateInstanceRequestComponents setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public CreateInstanceRequestComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateInstanceRequestTags extends TeaModel {
        /**
         * <p>The key of the resource tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the resource tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateInstanceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestTags self = new CreateInstanceRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateInstanceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateInstanceRequestVSwitchIds extends TeaModel {
        /**
         * <p>The vSwitch ID configuration in the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxx</p>
         */
        @NameInMap("vswId")
        public String vswId;

        /**
         * <p>The zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-a</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static CreateInstanceRequestVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestVSwitchIds self = new CreateInstanceRequestVSwitchIds();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestVSwitchIds setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public CreateInstanceRequestVSwitchIds setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
