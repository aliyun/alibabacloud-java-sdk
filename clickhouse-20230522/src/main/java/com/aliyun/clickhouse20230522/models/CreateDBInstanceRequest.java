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
     * <p>Valid values:</p>
     * <ul>
     * <li>clickhouse</li>
     * </ul>
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
    public java.util.List<CreateDBInstanceRequestMultiZone> multiZone;

    /**
     * <p>The region ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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

}
