// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class InstanceDetail extends TeaModel {
    @NameInMap("autoBackup")
    public Boolean autoBackup;

    @NameInMap("components")
    public java.util.List<InstanceDetailComponents> components;

    @NameInMap("configuration")
    public String configuration;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     */
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("dbVersion")
    public String dbVersion;

    @NameInMap("encrypted")
    public Boolean encrypted;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    @NameInMap("ha")
    public Boolean ha;

    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>milvus-test</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    @NameInMap("kmsKeyId")
    public String kmsKeyId;

    @NameInMap("multiZoneMode")
    public String multiZoneMode;

    @NameInMap("orderId")
    public String orderId;

    @NameInMap("paymentType")
    public String paymentType;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("runningTime")
    public Long runningTime;

    @NameInMap("securityGroupIds")
    public java.util.List<String> securityGroupIds;

    @NameInMap("status")
    public String status;

    @NameInMap("tags")
    public java.util.List<InstanceDetailTags> tags;

    @NameInMap("vSwitchIds")
    public java.util.List<InstanceDetailVSwitchIds> vSwitchIds;

    @NameInMap("vpcId")
    public String vpcId;

    @NameInMap("zoneId")
    public String zoneId;

    public static InstanceDetail build(java.util.Map<String, ?> map) throws Exception {
        InstanceDetail self = new InstanceDetail();
        return TeaModel.build(map, self);
    }

    public InstanceDetail setAutoBackup(Boolean autoBackup) {
        this.autoBackup = autoBackup;
        return this;
    }
    public Boolean getAutoBackup() {
        return this.autoBackup;
    }

    public InstanceDetail setComponents(java.util.List<InstanceDetailComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<InstanceDetailComponents> getComponents() {
        return this.components;
    }

    public InstanceDetail setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public InstanceDetail setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public InstanceDetail setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
        return this;
    }
    public String getDbVersion() {
        return this.dbVersion;
    }

    public InstanceDetail setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public InstanceDetail setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public InstanceDetail setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
    }

    public InstanceDetail setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceDetail setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public InstanceDetail setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public InstanceDetail setMultiZoneMode(String multiZoneMode) {
        this.multiZoneMode = multiZoneMode;
        return this;
    }
    public String getMultiZoneMode() {
        return this.multiZoneMode;
    }

    public InstanceDetail setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public InstanceDetail setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public InstanceDetail setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InstanceDetail setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public InstanceDetail setRunningTime(Long runningTime) {
        this.runningTime = runningTime;
        return this;
    }
    public Long getRunningTime() {
        return this.runningTime;
    }

    public InstanceDetail setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public InstanceDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public InstanceDetail setTags(java.util.List<InstanceDetailTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<InstanceDetailTags> getTags() {
        return this.tags;
    }

    public InstanceDetail setVSwitchIds(java.util.List<InstanceDetailVSwitchIds> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<InstanceDetailVSwitchIds> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public InstanceDetail setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public InstanceDetail setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class InstanceDetailComponents extends TeaModel {
        @NameInMap("cuNum")
        public Integer cuNum;

        @NameInMap("cuType")
        public String cuType;

        @NameInMap("diskSizeType")
        public String diskSizeType;

        @NameInMap("replica")
        public Integer replica;

        @NameInMap("type")
        public String type;

        public static InstanceDetailComponents build(java.util.Map<String, ?> map) throws Exception {
            InstanceDetailComponents self = new InstanceDetailComponents();
            return TeaModel.build(map, self);
        }

        public InstanceDetailComponents setCuNum(Integer cuNum) {
            this.cuNum = cuNum;
            return this;
        }
        public Integer getCuNum() {
            return this.cuNum;
        }

        public InstanceDetailComponents setCuType(String cuType) {
            this.cuType = cuType;
            return this;
        }
        public String getCuType() {
            return this.cuType;
        }

        public InstanceDetailComponents setDiskSizeType(String diskSizeType) {
            this.diskSizeType = diskSizeType;
            return this;
        }
        public String getDiskSizeType() {
            return this.diskSizeType;
        }

        public InstanceDetailComponents setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public InstanceDetailComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class InstanceDetailTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static InstanceDetailTags build(java.util.Map<String, ?> map) throws Exception {
            InstanceDetailTags self = new InstanceDetailTags();
            return TeaModel.build(map, self);
        }

        public InstanceDetailTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public InstanceDetailTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InstanceDetailVSwitchIds extends TeaModel {
        @NameInMap("vswId")
        public String vswId;

        @NameInMap("zoneId")
        public String zoneId;

        public static InstanceDetailVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            InstanceDetailVSwitchIds self = new InstanceDetailVSwitchIds();
            return TeaModel.build(map, self);
        }

        public InstanceDetailVSwitchIds setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public InstanceDetailVSwitchIds setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
