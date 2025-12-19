// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateDBInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The backup set ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    @NameInMap("Category")
    public String category;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token. Make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>AB</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster description.</p>
     * 
     * <strong>example:</strong>
     * <p>Used for test</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    @NameInMap("DBTimeZone")
    public String DBTimeZone;

    /**
     * <p>The deployment status of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>multi_az</p>
     */
    @NameInMap("DeploySchema")
    public String deploySchema;

    /**
     * <p>The engine type.</p>
     * 
     * <strong>example:</strong>
     * <p>clickhouse</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>23.8</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The configurations of multi-zone deployment.</p>
     */
    @NameInMap("MultiZone")
    public String multiZoneShrink;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("NodeScaleMax")
    public Integer nodeScaleMax;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("NodeScaleMin")
    public Integer nodeScaleMin;

    /**
     * <p>The region ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The maximum capacity for auto scaling.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("ScaleMax")
    public String scaleMax;

    /**
     * <p>The minimum capacity for auto scaling.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("ScaleMin")
    public String scaleMin;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-2ze1*********</p>
     */
    @NameInMap("SourceDBInstanceId")
    public String sourceDBInstanceId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("StorageQuota")
    public Long storageQuota;

    /**
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("Tags")
    public java.util.List<CreateDBInstanceShrinkRequestTags> tags;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6xmupdn7v6ui9f****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf632qye9oqt4x4sr****</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDBInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceShrinkRequest self = new CreateDBInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceShrinkRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CreateDBInstanceShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateDBInstanceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceShrinkRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateDBInstanceShrinkRequest setDBTimeZone(String DBTimeZone) {
        this.DBTimeZone = DBTimeZone;
        return this;
    }
    public String getDBTimeZone() {
        return this.DBTimeZone;
    }

    public CreateDBInstanceShrinkRequest setDeploySchema(String deploySchema) {
        this.deploySchema = deploySchema;
        return this;
    }
    public String getDeploySchema() {
        return this.deploySchema;
    }

    public CreateDBInstanceShrinkRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDBInstanceShrinkRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDBInstanceShrinkRequest setMultiZoneShrink(String multiZoneShrink) {
        this.multiZoneShrink = multiZoneShrink;
        return this;
    }
    public String getMultiZoneShrink() {
        return this.multiZoneShrink;
    }

    public CreateDBInstanceShrinkRequest setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public CreateDBInstanceShrinkRequest setNodeScaleMax(Integer nodeScaleMax) {
        this.nodeScaleMax = nodeScaleMax;
        return this;
    }
    public Integer getNodeScaleMax() {
        return this.nodeScaleMax;
    }

    public CreateDBInstanceShrinkRequest setNodeScaleMin(Integer nodeScaleMin) {
        this.nodeScaleMin = nodeScaleMin;
        return this;
    }
    public Integer getNodeScaleMin() {
        return this.nodeScaleMin;
    }

    public CreateDBInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBInstanceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBInstanceShrinkRequest setScaleMax(String scaleMax) {
        this.scaleMax = scaleMax;
        return this;
    }
    public String getScaleMax() {
        return this.scaleMax;
    }

    public CreateDBInstanceShrinkRequest setScaleMin(String scaleMin) {
        this.scaleMin = scaleMin;
        return this;
    }
    public String getScaleMin() {
        return this.scaleMin;
    }

    public CreateDBInstanceShrinkRequest setSourceDBInstanceId(String sourceDBInstanceId) {
        this.sourceDBInstanceId = sourceDBInstanceId;
        return this;
    }
    public String getSourceDBInstanceId() {
        return this.sourceDBInstanceId;
    }

    public CreateDBInstanceShrinkRequest setStorageQuota(Long storageQuota) {
        this.storageQuota = storageQuota;
        return this;
    }
    public Long getStorageQuota() {
        return this.storageQuota;
    }

    public CreateDBInstanceShrinkRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateDBInstanceShrinkRequest setTags(java.util.List<CreateDBInstanceShrinkRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateDBInstanceShrinkRequestTags> getTags() {
        return this.tags;
    }

    public CreateDBInstanceShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateDBInstanceShrinkRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public CreateDBInstanceShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateDBInstanceShrinkRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>user_123</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>示例字符串</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDBInstanceShrinkRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateDBInstanceShrinkRequestTags self = new CreateDBInstanceShrinkRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateDBInstanceShrinkRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDBInstanceShrinkRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
