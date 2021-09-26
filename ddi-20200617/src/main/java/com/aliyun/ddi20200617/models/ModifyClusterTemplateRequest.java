// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyClusterTemplateRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("LogPath")
    public String logPath;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("IsOpenPublicIp")
    public Boolean isOpenPublicIp;

    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("RenewAuto")
    public Boolean renewAuto;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("NetType")
    public String netType;

    @NameInMap("UserDefinedEmrEcsRole")
    public String userDefinedEmrEcsRole;

    @NameInMap("EmrVer")
    public String emrVer;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("EnableHighAvailability")
    public Boolean enableHighAvailability;

    @NameInMap("UseLocalMetaDb")
    public Boolean useLocalMetaDb;

    @NameInMap("IoOptimizedOption")
    public Boolean ioOptimizedOption;

    @NameInMap("EnableSsh")
    public Boolean enableSsh;

    @NameInMap("InstanceGeneration")
    public String instanceGeneration;

    @NameInMap("MasterPwd")
    public String masterPwd;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("MetaStoreType")
    public String metaStoreType;

    @NameInMap("MetaStoreConf")
    public String metaStoreConf;

    @NameInMap("Configurations")
    public String configurations;

    @NameInMap("EnableEas")
    public Boolean enableEas;

    @NameInMap("DepositType")
    public String depositType;

    @NameInMap("MachineType")
    public String machineType;

    @NameInMap("UseCustomHiveMetaDb")
    public Boolean useCustomHiveMetaDb;

    @NameInMap("InitCustomHiveMetaDb")
    public Boolean initCustomHiveMetaDb;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("OptionSoftWareList")
    public java.util.List<String> optionSoftWareList;

    @NameInMap("HostGroup")
    public java.util.List<ModifyClusterTemplateRequestHostGroup> hostGroup;

    @NameInMap("BootstrapAction")
    public java.util.List<ModifyClusterTemplateRequestBootstrapAction> bootstrapAction;

    @NameInMap("Config")
    public java.util.List<ModifyClusterTemplateRequestConfig> config;

    @NameInMap("Tag")
    public java.util.List<ModifyClusterTemplateRequestTag> tag;

    public static ModifyClusterTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterTemplateRequest self = new ModifyClusterTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyClusterTemplateRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyClusterTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ModifyClusterTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyClusterTemplateRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public ModifyClusterTemplateRequest setLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }
    public String getLogPath() {
        return this.logPath;
    }

    public ModifyClusterTemplateRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifyClusterTemplateRequest setIsOpenPublicIp(Boolean isOpenPublicIp) {
        this.isOpenPublicIp = isOpenPublicIp;
        return this;
    }
    public Boolean getIsOpenPublicIp() {
        return this.isOpenPublicIp;
    }

    public ModifyClusterTemplateRequest setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public ModifyClusterTemplateRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ModifyClusterTemplateRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public ModifyClusterTemplateRequest setRenewAuto(Boolean renewAuto) {
        this.renewAuto = renewAuto;
        return this;
    }
    public Boolean getRenewAuto() {
        return this.renewAuto;
    }

    public ModifyClusterTemplateRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ModifyClusterTemplateRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ModifyClusterTemplateRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public ModifyClusterTemplateRequest setUserDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
        this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
        return this;
    }
    public String getUserDefinedEmrEcsRole() {
        return this.userDefinedEmrEcsRole;
    }

    public ModifyClusterTemplateRequest setEmrVer(String emrVer) {
        this.emrVer = emrVer;
        return this;
    }
    public String getEmrVer() {
        return this.emrVer;
    }

    public ModifyClusterTemplateRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ModifyClusterTemplateRequest setEnableHighAvailability(Boolean enableHighAvailability) {
        this.enableHighAvailability = enableHighAvailability;
        return this;
    }
    public Boolean getEnableHighAvailability() {
        return this.enableHighAvailability;
    }

    public ModifyClusterTemplateRequest setUseLocalMetaDb(Boolean useLocalMetaDb) {
        this.useLocalMetaDb = useLocalMetaDb;
        return this;
    }
    public Boolean getUseLocalMetaDb() {
        return this.useLocalMetaDb;
    }

    public ModifyClusterTemplateRequest setIoOptimizedOption(Boolean ioOptimizedOption) {
        this.ioOptimizedOption = ioOptimizedOption;
        return this;
    }
    public Boolean getIoOptimizedOption() {
        return this.ioOptimizedOption;
    }

    public ModifyClusterTemplateRequest setEnableSsh(Boolean enableSsh) {
        this.enableSsh = enableSsh;
        return this;
    }
    public Boolean getEnableSsh() {
        return this.enableSsh;
    }

    public ModifyClusterTemplateRequest setInstanceGeneration(String instanceGeneration) {
        this.instanceGeneration = instanceGeneration;
        return this;
    }
    public String getInstanceGeneration() {
        return this.instanceGeneration;
    }

    public ModifyClusterTemplateRequest setMasterPwd(String masterPwd) {
        this.masterPwd = masterPwd;
        return this;
    }
    public String getMasterPwd() {
        return this.masterPwd;
    }

    public ModifyClusterTemplateRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public ModifyClusterTemplateRequest setMetaStoreType(String metaStoreType) {
        this.metaStoreType = metaStoreType;
        return this;
    }
    public String getMetaStoreType() {
        return this.metaStoreType;
    }

    public ModifyClusterTemplateRequest setMetaStoreConf(String metaStoreConf) {
        this.metaStoreConf = metaStoreConf;
        return this;
    }
    public String getMetaStoreConf() {
        return this.metaStoreConf;
    }

    public ModifyClusterTemplateRequest setConfigurations(String configurations) {
        this.configurations = configurations;
        return this;
    }
    public String getConfigurations() {
        return this.configurations;
    }

    public ModifyClusterTemplateRequest setEnableEas(Boolean enableEas) {
        this.enableEas = enableEas;
        return this;
    }
    public Boolean getEnableEas() {
        return this.enableEas;
    }

    public ModifyClusterTemplateRequest setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public ModifyClusterTemplateRequest setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }
    public String getMachineType() {
        return this.machineType;
    }

    public ModifyClusterTemplateRequest setUseCustomHiveMetaDb(Boolean useCustomHiveMetaDb) {
        this.useCustomHiveMetaDb = useCustomHiveMetaDb;
        return this;
    }
    public Boolean getUseCustomHiveMetaDb() {
        return this.useCustomHiveMetaDb;
    }

    public ModifyClusterTemplateRequest setInitCustomHiveMetaDb(Boolean initCustomHiveMetaDb) {
        this.initCustomHiveMetaDb = initCustomHiveMetaDb;
        return this;
    }
    public Boolean getInitCustomHiveMetaDb() {
        return this.initCustomHiveMetaDb;
    }

    public ModifyClusterTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyClusterTemplateRequest setOptionSoftWareList(java.util.List<String> optionSoftWareList) {
        this.optionSoftWareList = optionSoftWareList;
        return this;
    }
    public java.util.List<String> getOptionSoftWareList() {
        return this.optionSoftWareList;
    }

    public ModifyClusterTemplateRequest setHostGroup(java.util.List<ModifyClusterTemplateRequestHostGroup> hostGroup) {
        this.hostGroup = hostGroup;
        return this;
    }
    public java.util.List<ModifyClusterTemplateRequestHostGroup> getHostGroup() {
        return this.hostGroup;
    }

    public ModifyClusterTemplateRequest setBootstrapAction(java.util.List<ModifyClusterTemplateRequestBootstrapAction> bootstrapAction) {
        this.bootstrapAction = bootstrapAction;
        return this;
    }
    public java.util.List<ModifyClusterTemplateRequestBootstrapAction> getBootstrapAction() {
        return this.bootstrapAction;
    }

    public ModifyClusterTemplateRequest setConfig(java.util.List<ModifyClusterTemplateRequestConfig> config) {
        this.config = config;
        return this;
    }
    public java.util.List<ModifyClusterTemplateRequestConfig> getConfig() {
        return this.config;
    }

    public ModifyClusterTemplateRequest setTag(java.util.List<ModifyClusterTemplateRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ModifyClusterTemplateRequestTag> getTag() {
        return this.tag;
    }

    public static class ModifyClusterTemplateRequestHostGroup extends TeaModel {
        @NameInMap("SysDiskCapacity")
        public Integer sysDiskCapacity;

        @NameInMap("HostGroupType")
        public String hostGroupType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("MultiInstanceTypes")
        public String multiInstanceTypes;

        @NameInMap("SysDiskType")
        public String sysDiskType;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("DiskCount")
        public Integer diskCount;

        @NameInMap("CreateType")
        public String createType;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("DiskCapacity")
        public Integer diskCapacity;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("HostGroupName")
        public String hostGroupName;

        @NameInMap("RenewAuto")
        public Boolean renewAuto;

        @NameInMap("ClusterId")
        public String clusterId;

        public static ModifyClusterTemplateRequestHostGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterTemplateRequestHostGroup self = new ModifyClusterTemplateRequestHostGroup();
            return TeaModel.build(map, self);
        }

        public ModifyClusterTemplateRequestHostGroup setSysDiskCapacity(Integer sysDiskCapacity) {
            this.sysDiskCapacity = sysDiskCapacity;
            return this;
        }
        public Integer getSysDiskCapacity() {
            return this.sysDiskCapacity;
        }

        public ModifyClusterTemplateRequestHostGroup setHostGroupType(String hostGroupType) {
            this.hostGroupType = hostGroupType;
            return this;
        }
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        public ModifyClusterTemplateRequestHostGroup setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ModifyClusterTemplateRequestHostGroup setMultiInstanceTypes(String multiInstanceTypes) {
            this.multiInstanceTypes = multiInstanceTypes;
            return this;
        }
        public String getMultiInstanceTypes() {
            return this.multiInstanceTypes;
        }

        public ModifyClusterTemplateRequestHostGroup setSysDiskType(String sysDiskType) {
            this.sysDiskType = sysDiskType;
            return this;
        }
        public String getSysDiskType() {
            return this.sysDiskType;
        }

        public ModifyClusterTemplateRequestHostGroup setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ModifyClusterTemplateRequestHostGroup setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ModifyClusterTemplateRequestHostGroup setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public ModifyClusterTemplateRequestHostGroup setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyClusterTemplateRequestHostGroup setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

        public ModifyClusterTemplateRequestHostGroup setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public ModifyClusterTemplateRequestHostGroup setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public ModifyClusterTemplateRequestHostGroup setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public ModifyClusterTemplateRequestHostGroup setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ModifyClusterTemplateRequestHostGroup setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public ModifyClusterTemplateRequestHostGroup setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        public ModifyClusterTemplateRequestHostGroup setRenewAuto(Boolean renewAuto) {
            this.renewAuto = renewAuto;
            return this;
        }
        public Boolean getRenewAuto() {
            return this.renewAuto;
        }

        public ModifyClusterTemplateRequestHostGroup setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class ModifyClusterTemplateRequestBootstrapAction extends TeaModel {
        @NameInMap("Arg")
        public String arg;

        @NameInMap("Path")
        public String path;

        @NameInMap("Name")
        public String name;

        public static ModifyClusterTemplateRequestBootstrapAction build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterTemplateRequestBootstrapAction self = new ModifyClusterTemplateRequestBootstrapAction();
            return TeaModel.build(map, self);
        }

        public ModifyClusterTemplateRequestBootstrapAction setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public ModifyClusterTemplateRequestBootstrapAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ModifyClusterTemplateRequestBootstrapAction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ModifyClusterTemplateRequestConfig extends TeaModel {
        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("Replace")
        public String replace;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("ConfigKey")
        public String configKey;

        @NameInMap("Encrypt")
        public String encrypt;

        public static ModifyClusterTemplateRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterTemplateRequestConfig self = new ModifyClusterTemplateRequestConfig();
            return TeaModel.build(map, self);
        }

        public ModifyClusterTemplateRequestConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public ModifyClusterTemplateRequestConfig setReplace(String replace) {
            this.replace = replace;
            return this;
        }
        public String getReplace() {
            return this.replace;
        }

        public ModifyClusterTemplateRequestConfig setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ModifyClusterTemplateRequestConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ModifyClusterTemplateRequestConfig setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public ModifyClusterTemplateRequestConfig setEncrypt(String encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public String getEncrypt() {
            return this.encrypt;
        }

    }

    public static class ModifyClusterTemplateRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ModifyClusterTemplateRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterTemplateRequestTag self = new ModifyClusterTemplateRequestTag();
            return TeaModel.build(map, self);
        }

        public ModifyClusterTemplateRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyClusterTemplateRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
