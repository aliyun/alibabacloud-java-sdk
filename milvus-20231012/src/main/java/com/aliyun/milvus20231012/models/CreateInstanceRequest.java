// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("autoBackup")
    public Boolean autoBackup;

    @NameInMap("autoRenew")
    public Boolean autoRenew;

    @NameInMap("components")
    public java.util.List<CreateInstanceRequestComponents> components;

    @NameInMap("configuration")
    public String configuration;

    /**
     * <strong>example:</strong>
     * <p>test12</p>
     */
    @NameInMap("dbAdminPassword")
    public String dbAdminPassword;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.4</p>
     */
    @NameInMap("dbVersion")
    public String dbVersion;

    @NameInMap("encrypted")
    public Boolean encrypted;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ha")
    public Boolean ha;

    /**
     * <strong>example:</strong>
     * <p>milvus-test</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    @NameInMap("isMultiAzStorage")
    public Boolean isMultiAzStorage;

    @NameInMap("kmsKeyId")
    public String kmsKeyId;

    @NameInMap("loadReplicas")
    public Integer loadReplicas;

    @NameInMap("multiZoneMode")
    public String multiZoneMode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("paymentDuration")
    public Integer paymentDuration;

    /**
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("paymentDurationUnit")
    public String paymentDurationUnit;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    @NameInMap("promotionNo")
    public String promotionNo;

    /**
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("tags")
    public java.util.List<CreateInstanceRequestTags> tags;

    /**
     * <strong>example:</strong>
     * <p>[&quot;vsw-123xxx&quot;]</p>
     */
    @NameInMap("vSwitchIds")
    public java.util.List<CreateInstanceRequestVSwitchIds> vSwitchIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-123xxx</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-g</p>
     */
    @NameInMap("zoneId")
    public String zoneId;

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

    public CreateInstanceRequest setAutoBackup(Boolean autoBackup) {
        this.autoBackup = autoBackup;
        return this;
    }
    public Boolean getAutoBackup() {
        return this.autoBackup;
    }

    public CreateInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
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

    public static class CreateInstanceRequestComponents extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cuNum")
        public Integer cuNum;

        /**
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("cuType")
        public String cuType;

        @NameInMap("diskSizeType")
        public String diskSizeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("replica")
        public Integer replica;

        /**
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
        @NameInMap("key")
        public String key;

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
        @NameInMap("vswId")
        public String vswId;

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
