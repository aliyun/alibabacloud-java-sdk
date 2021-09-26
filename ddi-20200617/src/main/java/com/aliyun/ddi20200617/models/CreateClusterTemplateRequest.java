// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateClusterTemplateRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OptionSoftWareList")
    public java.util.List<String> optionSoftWareList;

    @NameInMap("HostGroup")
    public java.util.List<CreateClusterTemplateRequestHostGroup> hostGroup;

    @NameInMap("BootstrapAction")
    public java.util.List<CreateClusterTemplateRequestBootstrapAction> bootstrapAction;

    @NameInMap("Config")
    public java.util.List<CreateClusterTemplateRequestConfig> config;

    @NameInMap("Tag")
    public java.util.List<CreateClusterTemplateRequestTag> tag;

    public static CreateClusterTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterTemplateRequest self = new CreateClusterTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateClusterTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateClusterTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateClusterTemplateRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateClusterTemplateRequest setLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }
    public String getLogPath() {
        return this.logPath;
    }

    public CreateClusterTemplateRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateClusterTemplateRequest setIsOpenPublicIp(Boolean isOpenPublicIp) {
        this.isOpenPublicIp = isOpenPublicIp;
        return this;
    }
    public Boolean getIsOpenPublicIp() {
        return this.isOpenPublicIp;
    }

    public CreateClusterTemplateRequest setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public CreateClusterTemplateRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateClusterTemplateRequest setRenewAuto(Boolean renewAuto) {
        this.renewAuto = renewAuto;
        return this;
    }
    public Boolean getRenewAuto() {
        return this.renewAuto;
    }

    public CreateClusterTemplateRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateClusterTemplateRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateClusterTemplateRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public CreateClusterTemplateRequest setUserDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
        this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
        return this;
    }
    public String getUserDefinedEmrEcsRole() {
        return this.userDefinedEmrEcsRole;
    }

    public CreateClusterTemplateRequest setEmrVer(String emrVer) {
        this.emrVer = emrVer;
        return this;
    }
    public String getEmrVer() {
        return this.emrVer;
    }

    public CreateClusterTemplateRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateClusterTemplateRequest setEnableHighAvailability(Boolean enableHighAvailability) {
        this.enableHighAvailability = enableHighAvailability;
        return this;
    }
    public Boolean getEnableHighAvailability() {
        return this.enableHighAvailability;
    }

    public CreateClusterTemplateRequest setUseLocalMetaDb(Boolean useLocalMetaDb) {
        this.useLocalMetaDb = useLocalMetaDb;
        return this;
    }
    public Boolean getUseLocalMetaDb() {
        return this.useLocalMetaDb;
    }

    public CreateClusterTemplateRequest setIoOptimizedOption(Boolean ioOptimizedOption) {
        this.ioOptimizedOption = ioOptimizedOption;
        return this;
    }
    public Boolean getIoOptimizedOption() {
        return this.ioOptimizedOption;
    }

    public CreateClusterTemplateRequest setEnableSsh(Boolean enableSsh) {
        this.enableSsh = enableSsh;
        return this;
    }
    public Boolean getEnableSsh() {
        return this.enableSsh;
    }

    public CreateClusterTemplateRequest setInstanceGeneration(String instanceGeneration) {
        this.instanceGeneration = instanceGeneration;
        return this;
    }
    public String getInstanceGeneration() {
        return this.instanceGeneration;
    }

    public CreateClusterTemplateRequest setMasterPwd(String masterPwd) {
        this.masterPwd = masterPwd;
        return this;
    }
    public String getMasterPwd() {
        return this.masterPwd;
    }

    public CreateClusterTemplateRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateClusterTemplateRequest setMetaStoreType(String metaStoreType) {
        this.metaStoreType = metaStoreType;
        return this;
    }
    public String getMetaStoreType() {
        return this.metaStoreType;
    }

    public CreateClusterTemplateRequest setMetaStoreConf(String metaStoreConf) {
        this.metaStoreConf = metaStoreConf;
        return this;
    }
    public String getMetaStoreConf() {
        return this.metaStoreConf;
    }

    public CreateClusterTemplateRequest setConfigurations(String configurations) {
        this.configurations = configurations;
        return this;
    }
    public String getConfigurations() {
        return this.configurations;
    }

    public CreateClusterTemplateRequest setEnableEas(Boolean enableEas) {
        this.enableEas = enableEas;
        return this;
    }
    public Boolean getEnableEas() {
        return this.enableEas;
    }

    public CreateClusterTemplateRequest setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public CreateClusterTemplateRequest setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }
    public String getMachineType() {
        return this.machineType;
    }

    public CreateClusterTemplateRequest setUseCustomHiveMetaDb(Boolean useCustomHiveMetaDb) {
        this.useCustomHiveMetaDb = useCustomHiveMetaDb;
        return this;
    }
    public Boolean getUseCustomHiveMetaDb() {
        return this.useCustomHiveMetaDb;
    }

    public CreateClusterTemplateRequest setInitCustomHiveMetaDb(Boolean initCustomHiveMetaDb) {
        this.initCustomHiveMetaDb = initCustomHiveMetaDb;
        return this;
    }
    public Boolean getInitCustomHiveMetaDb() {
        return this.initCustomHiveMetaDb;
    }

    public CreateClusterTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClusterTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateClusterTemplateRequest setOptionSoftWareList(java.util.List<String> optionSoftWareList) {
        this.optionSoftWareList = optionSoftWareList;
        return this;
    }
    public java.util.List<String> getOptionSoftWareList() {
        return this.optionSoftWareList;
    }

    public CreateClusterTemplateRequest setHostGroup(java.util.List<CreateClusterTemplateRequestHostGroup> hostGroup) {
        this.hostGroup = hostGroup;
        return this;
    }
    public java.util.List<CreateClusterTemplateRequestHostGroup> getHostGroup() {
        return this.hostGroup;
    }

    public CreateClusterTemplateRequest setBootstrapAction(java.util.List<CreateClusterTemplateRequestBootstrapAction> bootstrapAction) {
        this.bootstrapAction = bootstrapAction;
        return this;
    }
    public java.util.List<CreateClusterTemplateRequestBootstrapAction> getBootstrapAction() {
        return this.bootstrapAction;
    }

    public CreateClusterTemplateRequest setConfig(java.util.List<CreateClusterTemplateRequestConfig> config) {
        this.config = config;
        return this;
    }
    public java.util.List<CreateClusterTemplateRequestConfig> getConfig() {
        return this.config;
    }

    public CreateClusterTemplateRequest setTag(java.util.List<CreateClusterTemplateRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateClusterTemplateRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateClusterTemplateRequestHostGroup extends TeaModel {
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

        @NameInMap("AutoRenew")
        public Boolean autoRenew;

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

        @NameInMap("ClusterId")
        public String clusterId;

        public static CreateClusterTemplateRequestHostGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterTemplateRequestHostGroup self = new CreateClusterTemplateRequestHostGroup();
            return TeaModel.build(map, self);
        }

        public CreateClusterTemplateRequestHostGroup setSysDiskCapacity(Integer sysDiskCapacity) {
            this.sysDiskCapacity = sysDiskCapacity;
            return this;
        }
        public Integer getSysDiskCapacity() {
            return this.sysDiskCapacity;
        }

        public CreateClusterTemplateRequestHostGroup setHostGroupType(String hostGroupType) {
            this.hostGroupType = hostGroupType;
            return this;
        }
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        public CreateClusterTemplateRequestHostGroup setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateClusterTemplateRequestHostGroup setMultiInstanceTypes(String multiInstanceTypes) {
            this.multiInstanceTypes = multiInstanceTypes;
            return this;
        }
        public String getMultiInstanceTypes() {
            return this.multiInstanceTypes;
        }

        public CreateClusterTemplateRequestHostGroup setSysDiskType(String sysDiskType) {
            this.sysDiskType = sysDiskType;
            return this;
        }
        public String getSysDiskType() {
            return this.sysDiskType;
        }

        public CreateClusterTemplateRequestHostGroup setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public CreateClusterTemplateRequestHostGroup setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public CreateClusterTemplateRequestHostGroup setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public CreateClusterTemplateRequestHostGroup setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public CreateClusterTemplateRequestHostGroup setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateClusterTemplateRequestHostGroup setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

        public CreateClusterTemplateRequestHostGroup setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public CreateClusterTemplateRequestHostGroup setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public CreateClusterTemplateRequestHostGroup setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public CreateClusterTemplateRequestHostGroup setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateClusterTemplateRequestHostGroup setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public CreateClusterTemplateRequestHostGroup setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        public CreateClusterTemplateRequestHostGroup setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class CreateClusterTemplateRequestBootstrapAction extends TeaModel {
        @NameInMap("Arg")
        public String arg;

        @NameInMap("Path")
        public String path;

        @NameInMap("Name")
        public String name;

        public static CreateClusterTemplateRequestBootstrapAction build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterTemplateRequestBootstrapAction self = new CreateClusterTemplateRequestBootstrapAction();
            return TeaModel.build(map, self);
        }

        public CreateClusterTemplateRequestBootstrapAction setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public CreateClusterTemplateRequestBootstrapAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateClusterTemplateRequestBootstrapAction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateClusterTemplateRequestConfig extends TeaModel {
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

        public static CreateClusterTemplateRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterTemplateRequestConfig self = new CreateClusterTemplateRequestConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterTemplateRequestConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public CreateClusterTemplateRequestConfig setReplace(String replace) {
            this.replace = replace;
            return this;
        }
        public String getReplace() {
            return this.replace;
        }

        public CreateClusterTemplateRequestConfig setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateClusterTemplateRequestConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public CreateClusterTemplateRequestConfig setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public CreateClusterTemplateRequestConfig setEncrypt(String encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public String getEncrypt() {
            return this.encrypt;
        }

    }

    public static class CreateClusterTemplateRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateClusterTemplateRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterTemplateRequestTag self = new CreateClusterTemplateRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateClusterTemplateRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateClusterTemplateRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
