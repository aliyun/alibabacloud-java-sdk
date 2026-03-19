// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDifyInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("AdbpgInstanceMode")
    public String adbpgInstanceMode;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <strong>example:</strong>
     * <p>vsw-j6cq3nmsk8qcamo2rc6yc</p>
     */
    @NameInMap("BackupVSwitchId")
    public String backupVSwitchId;

    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("DataRegion")
    public String dataRegion;

    /**
     * <strong>example:</strong>
     * <p>CreateNewInstance</p>
     */
    @NameInMap("DatabaseOption")
    public String databaseOption;

    /**
     * <strong>example:</strong>
     * <p>PostgreSQL</p>
     */
    @NameInMap("DbEngineType")
    public String dbEngineType;

    /**
     * <strong>example:</strong>
     * <p>14.0</p>
     */
    @NameInMap("DbEngineVersion")
    public String dbEngineVersion;

    /**
     * <strong>example:</strong>
     * <p>dify_user</p>
     */
    @NameInMap("DbInstanceAccount")
    public String dbInstanceAccount;

    /**
     * <strong>example:</strong>
     * <p>1c4g</p>
     */
    @NameInMap("DbInstanceCategory")
    public String dbInstanceCategory;

    /**
     * <strong>example:</strong>
     * <p>pg.n2.2c.1m</p>
     */
    @NameInMap("DbInstanceClass")
    public String dbInstanceClass;

    /**
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("DbInstancePassword")
    public String dbInstancePassword;

    /**
     * <strong>example:</strong>
     * <p>2764278</p>
     */
    @NameInMap("DbResourceId")
    public Integer dbResourceId;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("DbStorageSize")
    public String dbStorageSize;

    /**
     * <strong>example:</strong>
     * <p>general_essd</p>
     */
    @NameInMap("DbStorageType")
    public String dbStorageType;

    /**
     * <strong>example:</strong>
     * <p>Dify Instance</p>
     */
    @NameInMap("DifyInstanceName")
    public String difyInstanceName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>Community</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableExtraEndpoint")
    public Boolean enableExtraEndpoint;

    /**
     * <strong>example:</strong>
     * <p>16C62G.1T4</p>
     */
    @NameInMap("GpuNodeSpec")
    public String gpuNodeSpec;

    /**
     * <strong>example:</strong>
     * <p>dify_user</p>
     */
    @NameInMap("KvStoreAccount")
    public String kvStoreAccount;

    /**
     * <strong>example:</strong>
     * <p>6.0</p>
     */
    @NameInMap("KvStoreEngineVersion")
    public String kvStoreEngineVersion;

    /**
     * <strong>example:</strong>
     * <p>redis.master.stand.default</p>
     */
    @NameInMap("KvStoreInstanceClass")
    public String kvStoreInstanceClass;

    /**
     * <strong>example:</strong>
     * <p>MASTER_SLAVE</p>
     */
    @NameInMap("KvStoreNodeType")
    public String kvStoreNodeType;

    /**
     * <strong>example:</strong>
     * <p>CreateNewInstance</p>
     */
    @NameInMap("KvStoreOption")
    public String kvStoreOption;

    /**
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("KvStorePassword")
    public String kvStorePassword;

    /**
     * <strong>example:</strong>
     * <p>2829493</p>
     */
    @NameInMap("KvStoreResourceId")
    public Integer kvStoreResourceId;

    /**
     * <strong>example:</strong>
     * <p>REDIS</p>
     */
    @NameInMap("KvStoreType")
    public String kvStoreType;

    /**
     * <strong>example:</strong>
     * <p>1.6.x</p>
     */
    @NameInMap("MajorVersion")
    public String majorVersion;

    /**
     * <strong>example:</strong>
     * <p>Qwen3-4B</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("ModelOption")
    public String modelOption;

    /**
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("NatGatewayOption")
    public String natGatewayOption;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyIntranet")
    public Boolean onlyIntranet;

    /**
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("OssPath")
    public String ossPath;

    /**
     * <strong>example:</strong>
     * <p>2764233</p>
     */
    @NameInMap("OssResourceId")
    public Integer ossResourceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PayPeriod")
    public Integer payPeriod;

    /**
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PayPeriodType")
    public String payPeriodType;

    /**
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4CU</p>
     */
    @NameInMap("ResourceQuota")
    public String resourceQuota;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-2ze6dig8uby0a3zt4a0h</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <strong>example:</strong>
     * <p>pl0</p>
     */
    @NameInMap("SegDiskPerformanceLevel")
    public String segDiskPerformanceLevel;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SegNodeNum")
    public Integer segNodeNum;

    /**
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <strong>example:</strong>
     * <p>[{key:,value:}]</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDifyInstanceRequestTag> tag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1i05wremlxcy8z5e2im</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <strong>example:</strong>
     * <p>dify_user</p>
     */
    @NameInMap("VectordbAccount")
    public String vectordbAccount;

    /**
     * <strong>example:</strong>
     * <p>adbpg</p>
     */
    @NameInMap("VectordbCategory")
    public String vectordbCategory;

    /**
     * <strong>example:</strong>
     * <p>6.0</p>
     */
    @NameInMap("VectordbEngineVersion")
    public String vectordbEngineVersion;

    /**
     * <strong>example:</strong>
     * <p>4C16G</p>
     */
    @NameInMap("VectordbInstanceSpec")
    public String vectordbInstanceSpec;

    /**
     * <strong>example:</strong>
     * <p>CreateNewInstance</p>
     */
    @NameInMap("VectordbOption")
    public String vectordbOption;

    /**
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("VectordbPassword")
    public String vectordbPassword;

    /**
     * <strong>example:</strong>
     * <p>2798885</p>
     */
    @NameInMap("VectordbResourceId")
    public Integer vectordbResourceId;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("VectordbStorageSize")
    public String vectordbStorageSize;

    /**
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("VectordbStorageType")
    public String vectordbStorageType;

    /**
     * <strong>example:</strong>
     * <p>createnew</p>
     */
    @NameInMap("VectordbType")
    public String vectordbType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-k1a8ha7m1atealnysybeu</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <strong>example:</strong>
     * <p>this is my workspace</p>
     */
    @NameInMap("WorkspaceDescription")
    public String workspaceDescription;

    /**
     * <strong>example:</strong>
     * <p>8640136033018977</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <strong>example:</strong>
     * <p>dify_default</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    /**
     * <strong>example:</strong>
     * <p>UseExistingInstance</p>
     */
    @NameInMap("WorkspaceOption")
    public String workspaceOption;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing-f</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDifyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDifyInstanceRequest self = new CreateDifyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDifyInstanceRequest setAdbpgInstanceMode(String adbpgInstanceMode) {
        this.adbpgInstanceMode = adbpgInstanceMode;
        return this;
    }
    public String getAdbpgInstanceMode() {
        return this.adbpgInstanceMode;
    }

    public CreateDifyInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateDifyInstanceRequest setBackupVSwitchId(String backupVSwitchId) {
        this.backupVSwitchId = backupVSwitchId;
        return this;
    }
    public String getBackupVSwitchId() {
        return this.backupVSwitchId;
    }

    public CreateDifyInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDifyInstanceRequest setDataRegion(String dataRegion) {
        this.dataRegion = dataRegion;
        return this;
    }
    public String getDataRegion() {
        return this.dataRegion;
    }

    public CreateDifyInstanceRequest setDatabaseOption(String databaseOption) {
        this.databaseOption = databaseOption;
        return this;
    }
    public String getDatabaseOption() {
        return this.databaseOption;
    }

    public CreateDifyInstanceRequest setDbEngineType(String dbEngineType) {
        this.dbEngineType = dbEngineType;
        return this;
    }
    public String getDbEngineType() {
        return this.dbEngineType;
    }

    public CreateDifyInstanceRequest setDbEngineVersion(String dbEngineVersion) {
        this.dbEngineVersion = dbEngineVersion;
        return this;
    }
    public String getDbEngineVersion() {
        return this.dbEngineVersion;
    }

    public CreateDifyInstanceRequest setDbInstanceAccount(String dbInstanceAccount) {
        this.dbInstanceAccount = dbInstanceAccount;
        return this;
    }
    public String getDbInstanceAccount() {
        return this.dbInstanceAccount;
    }

    public CreateDifyInstanceRequest setDbInstanceCategory(String dbInstanceCategory) {
        this.dbInstanceCategory = dbInstanceCategory;
        return this;
    }
    public String getDbInstanceCategory() {
        return this.dbInstanceCategory;
    }

    public CreateDifyInstanceRequest setDbInstanceClass(String dbInstanceClass) {
        this.dbInstanceClass = dbInstanceClass;
        return this;
    }
    public String getDbInstanceClass() {
        return this.dbInstanceClass;
    }

    public CreateDifyInstanceRequest setDbInstancePassword(String dbInstancePassword) {
        this.dbInstancePassword = dbInstancePassword;
        return this;
    }
    public String getDbInstancePassword() {
        return this.dbInstancePassword;
    }

    public CreateDifyInstanceRequest setDbResourceId(Integer dbResourceId) {
        this.dbResourceId = dbResourceId;
        return this;
    }
    public Integer getDbResourceId() {
        return this.dbResourceId;
    }

    public CreateDifyInstanceRequest setDbStorageSize(String dbStorageSize) {
        this.dbStorageSize = dbStorageSize;
        return this;
    }
    public String getDbStorageSize() {
        return this.dbStorageSize;
    }

    public CreateDifyInstanceRequest setDbStorageType(String dbStorageType) {
        this.dbStorageType = dbStorageType;
        return this;
    }
    public String getDbStorageType() {
        return this.dbStorageType;
    }

    public CreateDifyInstanceRequest setDifyInstanceName(String difyInstanceName) {
        this.difyInstanceName = difyInstanceName;
        return this;
    }
    public String getDifyInstanceName() {
        return this.difyInstanceName;
    }

    public CreateDifyInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateDifyInstanceRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public CreateDifyInstanceRequest setEnableExtraEndpoint(Boolean enableExtraEndpoint) {
        this.enableExtraEndpoint = enableExtraEndpoint;
        return this;
    }
    public Boolean getEnableExtraEndpoint() {
        return this.enableExtraEndpoint;
    }

    public CreateDifyInstanceRequest setGpuNodeSpec(String gpuNodeSpec) {
        this.gpuNodeSpec = gpuNodeSpec;
        return this;
    }
    public String getGpuNodeSpec() {
        return this.gpuNodeSpec;
    }

    public CreateDifyInstanceRequest setKvStoreAccount(String kvStoreAccount) {
        this.kvStoreAccount = kvStoreAccount;
        return this;
    }
    public String getKvStoreAccount() {
        return this.kvStoreAccount;
    }

    public CreateDifyInstanceRequest setKvStoreEngineVersion(String kvStoreEngineVersion) {
        this.kvStoreEngineVersion = kvStoreEngineVersion;
        return this;
    }
    public String getKvStoreEngineVersion() {
        return this.kvStoreEngineVersion;
    }

    public CreateDifyInstanceRequest setKvStoreInstanceClass(String kvStoreInstanceClass) {
        this.kvStoreInstanceClass = kvStoreInstanceClass;
        return this;
    }
    public String getKvStoreInstanceClass() {
        return this.kvStoreInstanceClass;
    }

    public CreateDifyInstanceRequest setKvStoreNodeType(String kvStoreNodeType) {
        this.kvStoreNodeType = kvStoreNodeType;
        return this;
    }
    public String getKvStoreNodeType() {
        return this.kvStoreNodeType;
    }

    public CreateDifyInstanceRequest setKvStoreOption(String kvStoreOption) {
        this.kvStoreOption = kvStoreOption;
        return this;
    }
    public String getKvStoreOption() {
        return this.kvStoreOption;
    }

    public CreateDifyInstanceRequest setKvStorePassword(String kvStorePassword) {
        this.kvStorePassword = kvStorePassword;
        return this;
    }
    public String getKvStorePassword() {
        return this.kvStorePassword;
    }

    public CreateDifyInstanceRequest setKvStoreResourceId(Integer kvStoreResourceId) {
        this.kvStoreResourceId = kvStoreResourceId;
        return this;
    }
    public Integer getKvStoreResourceId() {
        return this.kvStoreResourceId;
    }

    public CreateDifyInstanceRequest setKvStoreType(String kvStoreType) {
        this.kvStoreType = kvStoreType;
        return this;
    }
    public String getKvStoreType() {
        return this.kvStoreType;
    }

    public CreateDifyInstanceRequest setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public String getMajorVersion() {
        return this.majorVersion;
    }

    public CreateDifyInstanceRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateDifyInstanceRequest setModelOption(String modelOption) {
        this.modelOption = modelOption;
        return this;
    }
    public String getModelOption() {
        return this.modelOption;
    }

    public CreateDifyInstanceRequest setNatGatewayOption(String natGatewayOption) {
        this.natGatewayOption = natGatewayOption;
        return this;
    }
    public String getNatGatewayOption() {
        return this.natGatewayOption;
    }

    public CreateDifyInstanceRequest setOnlyIntranet(Boolean onlyIntranet) {
        this.onlyIntranet = onlyIntranet;
        return this;
    }
    public Boolean getOnlyIntranet() {
        return this.onlyIntranet;
    }

    public CreateDifyInstanceRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public CreateDifyInstanceRequest setOssResourceId(Integer ossResourceId) {
        this.ossResourceId = ossResourceId;
        return this;
    }
    public Integer getOssResourceId() {
        return this.ossResourceId;
    }

    public CreateDifyInstanceRequest setPayPeriod(Integer payPeriod) {
        this.payPeriod = payPeriod;
        return this;
    }
    public Integer getPayPeriod() {
        return this.payPeriod;
    }

    public CreateDifyInstanceRequest setPayPeriodType(String payPeriodType) {
        this.payPeriodType = payPeriodType;
        return this;
    }
    public String getPayPeriodType() {
        return this.payPeriodType;
    }

    public CreateDifyInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDifyInstanceRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public CreateDifyInstanceRequest setResourceQuota(String resourceQuota) {
        this.resourceQuota = resourceQuota;
        return this;
    }
    public String getResourceQuota() {
        return this.resourceQuota;
    }

    public CreateDifyInstanceRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateDifyInstanceRequest setSegDiskPerformanceLevel(String segDiskPerformanceLevel) {
        this.segDiskPerformanceLevel = segDiskPerformanceLevel;
        return this;
    }
    public String getSegDiskPerformanceLevel() {
        return this.segDiskPerformanceLevel;
    }

    public CreateDifyInstanceRequest setSegNodeNum(Integer segNodeNum) {
        this.segNodeNum = segNodeNum;
        return this;
    }
    public Integer getSegNodeNum() {
        return this.segNodeNum;
    }

    public CreateDifyInstanceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateDifyInstanceRequest setTag(java.util.List<CreateDifyInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDifyInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateDifyInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDifyInstanceRequest setVectordbAccount(String vectordbAccount) {
        this.vectordbAccount = vectordbAccount;
        return this;
    }
    public String getVectordbAccount() {
        return this.vectordbAccount;
    }

    public CreateDifyInstanceRequest setVectordbCategory(String vectordbCategory) {
        this.vectordbCategory = vectordbCategory;
        return this;
    }
    public String getVectordbCategory() {
        return this.vectordbCategory;
    }

    public CreateDifyInstanceRequest setVectordbEngineVersion(String vectordbEngineVersion) {
        this.vectordbEngineVersion = vectordbEngineVersion;
        return this;
    }
    public String getVectordbEngineVersion() {
        return this.vectordbEngineVersion;
    }

    public CreateDifyInstanceRequest setVectordbInstanceSpec(String vectordbInstanceSpec) {
        this.vectordbInstanceSpec = vectordbInstanceSpec;
        return this;
    }
    public String getVectordbInstanceSpec() {
        return this.vectordbInstanceSpec;
    }

    public CreateDifyInstanceRequest setVectordbOption(String vectordbOption) {
        this.vectordbOption = vectordbOption;
        return this;
    }
    public String getVectordbOption() {
        return this.vectordbOption;
    }

    public CreateDifyInstanceRequest setVectordbPassword(String vectordbPassword) {
        this.vectordbPassword = vectordbPassword;
        return this;
    }
    public String getVectordbPassword() {
        return this.vectordbPassword;
    }

    public CreateDifyInstanceRequest setVectordbResourceId(Integer vectordbResourceId) {
        this.vectordbResourceId = vectordbResourceId;
        return this;
    }
    public Integer getVectordbResourceId() {
        return this.vectordbResourceId;
    }

    public CreateDifyInstanceRequest setVectordbStorageSize(String vectordbStorageSize) {
        this.vectordbStorageSize = vectordbStorageSize;
        return this;
    }
    public String getVectordbStorageSize() {
        return this.vectordbStorageSize;
    }

    public CreateDifyInstanceRequest setVectordbStorageType(String vectordbStorageType) {
        this.vectordbStorageType = vectordbStorageType;
        return this;
    }
    public String getVectordbStorageType() {
        return this.vectordbStorageType;
    }

    public CreateDifyInstanceRequest setVectordbType(String vectordbType) {
        this.vectordbType = vectordbType;
        return this;
    }
    public String getVectordbType() {
        return this.vectordbType;
    }

    public CreateDifyInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateDifyInstanceRequest setWorkspaceDescription(String workspaceDescription) {
        this.workspaceDescription = workspaceDescription;
        return this;
    }
    public String getWorkspaceDescription() {
        return this.workspaceDescription;
    }

    public CreateDifyInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateDifyInstanceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public CreateDifyInstanceRequest setWorkspaceOption(String workspaceOption) {
        this.workspaceOption = workspaceOption;
        return this;
    }
    public String getWorkspaceOption() {
        return this.workspaceOption;
    }

    public CreateDifyInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateDifyInstanceRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDifyInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDifyInstanceRequestTag self = new CreateDifyInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDifyInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDifyInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
