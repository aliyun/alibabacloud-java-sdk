// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDifyInstanceRequest extends TeaModel {
    @NameInMap("AdbpgInstanceMode")
    public String adbpgInstanceMode;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("BackupVSwitchId")
    public String backupVSwitchId;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataRegion")
    public String dataRegion;

    @NameInMap("DatabaseOption")
    public String databaseOption;

    @NameInMap("DbEngineType")
    public String dbEngineType;

    @NameInMap("DbEngineVersion")
    public String dbEngineVersion;

    @NameInMap("DbInstanceAccount")
    public String dbInstanceAccount;

    @NameInMap("DbInstanceCategory")
    public String dbInstanceCategory;

    @NameInMap("DbInstanceClass")
    public String dbInstanceClass;

    @NameInMap("DbInstancePassword")
    public String dbInstancePassword;

    @NameInMap("DbResourceId")
    public Integer dbResourceId;

    @NameInMap("DbStorageSize")
    public String dbStorageSize;

    @NameInMap("DbStorageType")
    public String dbStorageType;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>Community</p>
     */
    @NameInMap("Edition")
    public String edition;

    @NameInMap("EnableExtraEndpoint")
    public Boolean enableExtraEndpoint;

    @NameInMap("GpuNodeSpec")
    public String gpuNodeSpec;

    @NameInMap("KvStoreAccount")
    public String kvStoreAccount;

    @NameInMap("KvStoreEngineVersion")
    public String kvStoreEngineVersion;

    @NameInMap("KvStoreInstanceClass")
    public String kvStoreInstanceClass;

    @NameInMap("KvStoreNodeType")
    public String kvStoreNodeType;

    @NameInMap("KvStoreOption")
    public String kvStoreOption;

    @NameInMap("KvStorePassword")
    public String kvStorePassword;

    @NameInMap("KvStoreResourceId")
    public Integer kvStoreResourceId;

    @NameInMap("KvStoreType")
    public String kvStoreType;

    @NameInMap("MajorVersion")
    public String majorVersion;

    @NameInMap("ModelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("ModelOption")
    public String modelOption;

    @NameInMap("NatGatewayOption")
    public String natGatewayOption;

    @NameInMap("OnlyIntranet")
    public Boolean onlyIntranet;

    @NameInMap("OssPath")
    public String ossPath;

    @NameInMap("OssResourceId")
    public Integer ossResourceId;

    @NameInMap("PayPeriod")
    public Integer payPeriod;

    @NameInMap("PayPeriodType")
    public String payPeriodType;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceQuota")
    public String resourceQuota;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SegDiskPerformanceLevel")
    public String segDiskPerformanceLevel;

    @NameInMap("SegNodeNum")
    public Integer segNodeNum;

    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VectordbAccount")
    public String vectordbAccount;

    @NameInMap("VectordbCategory")
    public String vectordbCategory;

    @NameInMap("VectordbEngineVersion")
    public String vectordbEngineVersion;

    @NameInMap("VectordbInstanceSpec")
    public String vectordbInstanceSpec;

    @NameInMap("VectordbOption")
    public String vectordbOption;

    @NameInMap("VectordbPassword")
    public String vectordbPassword;

    @NameInMap("VectordbResourceId")
    public Integer vectordbResourceId;

    @NameInMap("VectordbStorageSize")
    public String vectordbStorageSize;

    @NameInMap("VectordbStorageType")
    public String vectordbStorageType;

    @NameInMap("VectordbType")
    public String vectordbType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("WorkspaceDescription")
    public String workspaceDescription;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    @NameInMap("WorkspaceOption")
    public String workspaceOption;

    /**
     * <p>This parameter is required.</p>
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

}
