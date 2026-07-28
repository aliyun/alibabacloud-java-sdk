// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class InstanceDetail extends TeaModel {
    /**
     * <p>The automatic backup configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoBackup")
    public Boolean autoBackup;

    /**
     * <p>The component information.</p>
     */
    @NameInMap("components")
    public java.util.List<InstanceDetailComponents> components;

    /**
     * <p>The configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rootCoord:
     *     maxDatabaseNum: 64 # Maximum number of database
     *     maxPartitionNum: 4096</p>
     */
    @NameInMap("configuration")
    public String configuration;

    /**
     * <p>The creation time.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-27T02:04:25Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The instance version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.5</p>
     */
    @NameInMap("dbVersion")
    public String dbVersion;

    /**
     * <p>Indicates whether data encryption is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("encrypted")
    public Boolean encrypted;

    /**
     * <p>The expiration time.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-27T02:04:25Z</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <p>Indicates whether high availability is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ha")
    public Boolean ha;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-xxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>milvus-test</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>kms key Id。</p>
     * 
     * <strong>example:</strong>
     * <p>key-xxx</p>
     */
    @NameInMap("kmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The multi-zone deployment mode.</p>
     * 
     * <strong>example:</strong>
     * <p>Single</p>
     */
    @NameInMap("multiZoneMode")
    public String multiZoneMode;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4751</p>
     */
    @NameInMap("orderId")
    public String orderId;

    /**
     * <p>The billing method. Valid values: PayAsYouGo: pay-as-you-go billing method. Subscription: subscription.</p>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek3dcgyq7pnqwa</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The running time.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("runningTime")
    public Long runningTime;

    /**
     * <p>The security group IDs.</p>
     */
    @NameInMap("securityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li>creating: Being created.</li>
     * <li>running: Running.</li>
     * <li>updating: Being upgraded. This includes specification changes, configuration changes, and public network access changes.</li>
     * <li>disable: Unavailable. The cluster has expired and requires renewal to reactivate.</li>
     * <li>deleting: Being deleted.</li>
     * <li>deleted: Deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<InstanceDetailTags> tags;

    /**
     * <p>The vSwitch IDs.</p>
     */
    @NameInMap("vSwitchIds")
    public java.util.List<InstanceDetailVSwitchIds> vSwitchIds;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxx</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
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

    public static class InstanceDetailComponentsDataDisk extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("performanceLevel")
        public String performanceLevel;

        @NameInMap("size")
        public Integer size;

        @NameInMap("storageClass")
        public String storageClass;

        public static InstanceDetailComponentsDataDisk build(java.util.Map<String, ?> map) throws Exception {
            InstanceDetailComponentsDataDisk self = new InstanceDetailComponentsDataDisk();
            return TeaModel.build(map, self);
        }

        public InstanceDetailComponentsDataDisk setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public InstanceDetailComponentsDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public InstanceDetailComponentsDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public InstanceDetailComponentsDataDisk setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

    }

    public static class InstanceDetailComponentsPodsList extends TeaModel {
        @NameInMap("podId")
        public String podId;

        @NameInMap("podName")
        public String podName;

        public static InstanceDetailComponentsPodsList build(java.util.Map<String, ?> map) throws Exception {
            InstanceDetailComponentsPodsList self = new InstanceDetailComponentsPodsList();
            return TeaModel.build(map, self);
        }

        public InstanceDetailComponentsPodsList setPodId(String podId) {
            this.podId = podId;
            return this;
        }
        public String getPodId() {
            return this.podId;
        }

        public InstanceDetailComponentsPodsList setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

    }

    public static class InstanceDetailComponents extends TeaModel {
        /**
         * <p>The number of CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
        public InstanceDetailComponentsDataDisk dataDisk;

        /**
         * <p>The disk size type for the Query Node. Set this parameter to Large for storage-optimized configurations, and to Normal for other configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("diskSizeType")
        public String diskSizeType;

        @NameInMap("payType")
        public String payType;

        @NameInMap("podsList")
        public java.util.List<InstanceDetailComponentsPodsList> podsList;

        /**
         * <p>The number of replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("replica")
        public Integer replica;

        /**
         * <p>The component type.</p>
         * 
         * <strong>example:</strong>
         * <p>data</p>
         */
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

        public InstanceDetailComponents setDataDisk(InstanceDetailComponentsDataDisk dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public InstanceDetailComponentsDataDisk getDataDisk() {
            return this.dataDisk;
        }

        public InstanceDetailComponents setDiskSizeType(String diskSizeType) {
            this.diskSizeType = diskSizeType;
            return this;
        }
        public String getDiskSizeType() {
            return this.diskSizeType;
        }

        public InstanceDetailComponents setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public InstanceDetailComponents setPodsList(java.util.List<InstanceDetailComponentsPodsList> podsList) {
            this.podsList = podsList;
            return this;
        }
        public java.util.List<InstanceDetailComponentsPodsList> getPodsList() {
            return this.podsList;
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
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
        /**
         * <p>The vSwitch IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxx</p>
         */
        @NameInMap("vswId")
        public String vswId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
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
