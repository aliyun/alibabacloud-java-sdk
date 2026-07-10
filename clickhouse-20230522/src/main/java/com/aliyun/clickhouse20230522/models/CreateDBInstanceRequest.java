// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>The backup set ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The edition of the instance. Valid value:</p>
     * <ul>
     * <li><code>enterprise</code>: Enterprise Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enterprise</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>A client-provided token to ensure request idempotence. It must be unique across requests, contain only ASCII characters, and not exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>AB</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Cluster test</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The time zone of the database, which must be an IANA time zone identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("DBTimeZone")
    public String DBTimeZone;

    /**
     * <p>The deployment mode of the instance.</p>
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
     * <p>The multi-zone configuration.</p>
     */
    @NameInMap("MultiZone")
    public java.util.List<CreateDBInstanceRequestMultiZone> multiZone;

    /**
     * <p>The number of nodes. Valid values: 2 to 16. This parameter is required when you configure an elastic scaling range by using the <code>NodeScaleMin</code> and <code>NodeScaleMax</code> parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    /**
     * <p>The maximum number of nodes for serverless elastic scaling. Valid values: 4 to 32. The value must be greater than the <code>NodeScaleMin</code> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("NodeScaleMax")
    public Integer nodeScaleMax;

    /**
     * <p>The minimum number of nodes for serverless elastic scaling. Valid values: 4 to 32.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("NodeScaleMin")
    public Integer nodeScaleMin;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>This parameter is deprecated. Use the <code>NodeCount</code>, <code>NodeScaleMin</code>, and <code>NodeScaleMax</code> parameters to configure elastic scaling.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("ScaleMax")
    public String scaleMax;

    /**
     * <p>This parameter is deprecated. Use the <code>NodeCount</code>, <code>NodeScaleMin</code>, and <code>NodeScaleMax</code> parameters to configure elastic scaling.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("ScaleMin")
    public String scaleMin;

    /**
     * <p>The ID of the source instance. This parameter is required when restoring from a backup.</p>
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

    /**
     * <p>The tags to add to the instance.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateDBInstanceRequestTags> tags;

    /**
     * <p>The VPC ID.</p>
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

    public static CreateDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceRequest self = new CreateDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CreateDBInstanceRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateDBInstanceRequest setDBTimeZone(String DBTimeZone) {
        this.DBTimeZone = DBTimeZone;
        return this;
    }
    public String getDBTimeZone() {
        return this.DBTimeZone;
    }

    public CreateDBInstanceRequest setDeploySchema(String deploySchema) {
        this.deploySchema = deploySchema;
        return this;
    }
    public String getDeploySchema() {
        return this.deploySchema;
    }

    public CreateDBInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDBInstanceRequest setMultiZone(java.util.List<CreateDBInstanceRequestMultiZone> multiZone) {
        this.multiZone = multiZone;
        return this;
    }
    public java.util.List<CreateDBInstanceRequestMultiZone> getMultiZone() {
        return this.multiZone;
    }

    public CreateDBInstanceRequest setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public CreateDBInstanceRequest setNodeScaleMax(Integer nodeScaleMax) {
        this.nodeScaleMax = nodeScaleMax;
        return this;
    }
    public Integer getNodeScaleMax() {
        return this.nodeScaleMax;
    }

    public CreateDBInstanceRequest setNodeScaleMin(Integer nodeScaleMin) {
        this.nodeScaleMin = nodeScaleMin;
        return this;
    }
    public Integer getNodeScaleMin() {
        return this.nodeScaleMin;
    }

    public CreateDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBInstanceRequest setScaleMax(String scaleMax) {
        this.scaleMax = scaleMax;
        return this;
    }
    public String getScaleMax() {
        return this.scaleMax;
    }

    public CreateDBInstanceRequest setScaleMin(String scaleMin) {
        this.scaleMin = scaleMin;
        return this;
    }
    public String getScaleMin() {
        return this.scaleMin;
    }

    public CreateDBInstanceRequest setSourceDBInstanceId(String sourceDBInstanceId) {
        this.sourceDBInstanceId = sourceDBInstanceId;
        return this;
    }
    public String getSourceDBInstanceId() {
        return this.sourceDBInstanceId;
    }

    public CreateDBInstanceRequest setStorageQuota(Long storageQuota) {
        this.storageQuota = storageQuota;
        return this;
    }
    public Long getStorageQuota() {
        return this.storageQuota;
    }

    public CreateDBInstanceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateDBInstanceRequest setTags(java.util.List<CreateDBInstanceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateDBInstanceRequestTags> getTags() {
        return this.tags;
    }

    public CreateDBInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateDBInstanceRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public CreateDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateDBInstanceRequestMultiZone extends TeaModel {
        /**
         * <p>The vSwitch IDs.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateDBInstanceRequestMultiZone build(java.util.Map<String, ?> map) throws Exception {
            CreateDBInstanceRequestMultiZone self = new CreateDBInstanceRequestMultiZone();
            return TeaModel.build(map, self);
        }

        public CreateDBInstanceRequestMultiZone setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateDBInstanceRequestMultiZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class CreateDBInstanceRequestTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>user_123</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>example string</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDBInstanceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateDBInstanceRequestTags self = new CreateDBInstanceRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateDBInstanceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDBInstanceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
