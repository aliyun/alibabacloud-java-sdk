// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeClusterTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateInfo")
    public DescribeClusterTemplateResponseBodyTemplateInfo templateInfo;

    public static DescribeClusterTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterTemplateResponseBody self = new DescribeClusterTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterTemplateResponseBody setTemplateInfo(DescribeClusterTemplateResponseBodyTemplateInfo templateInfo) {
        this.templateInfo = templateInfo;
        return this;
    }
    public DescribeClusterTemplateResponseBodyTemplateInfo getTemplateInfo() {
        return this.templateInfo;
    }

    public static class DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionListBootstrapAction extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Name")
        public String name;

        @NameInMap("Arg")
        public String arg;

        public static DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionListBootstrapAction build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionListBootstrapAction self = new DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionListBootstrapAction();
            return TeaModel.build(map, self);
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionListBootstrapAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionListBootstrapAction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionListBootstrapAction setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

    }

    public static class DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionList extends TeaModel {
        @NameInMap("BootstrapAction")
        public java.util.List<DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionListBootstrapAction> bootstrapAction;

        public static DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionList self = new DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionList setBootstrapAction(java.util.List<DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionListBootstrapAction> bootstrapAction) {
            this.bootstrapAction = bootstrapAction;
            return this;
        }
        public java.util.List<DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionListBootstrapAction> getBootstrapAction() {
            return this.bootstrapAction;
        }

    }

    public static class DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup extends TeaModel {
        @NameInMap("SysDiskCapacity")
        public Integer sysDiskCapacity;

        @NameInMap("HostGroupType")
        public String hostGroupType;

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

        @NameInMap("Period")
        public String period;

        @NameInMap("DiskCapacity")
        public Integer diskCapacity;

        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("HostGroupName")
        public String hostGroupName;

        public static DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup self = new DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup();
            return TeaModel.build(map, self);
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup setSysDiskCapacity(Integer sysDiskCapacity) {
            this.sysDiskCapacity = sysDiskCapacity;
            return this;
        }
        public Integer getSysDiskCapacity() {
            return this.sysDiskCapacity;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup setHostGroupType(String hostGroupType) {
            this.hostGroupType = hostGroupType;
            return this;
        }
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup setMultiInstanceTypes(String multiInstanceTypes) {
            this.multiInstanceTypes = multiInstanceTypes;
            return this;
        }
        public String getMultiInstanceTypes() {
            return this.multiInstanceTypes;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup setSysDiskType(String sysDiskType) {
            this.sysDiskType = sysDiskType;
            return this;
        }
        public String getSysDiskType() {
            return this.sysDiskType;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

    }

    public static class DescribeClusterTemplateResponseBodyTemplateInfoHostGroupList extends TeaModel {
        @NameInMap("HostGroup")
        public java.util.List<DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup> hostGroup;

        public static DescribeClusterTemplateResponseBodyTemplateInfoHostGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterTemplateResponseBodyTemplateInfoHostGroupList self = new DescribeClusterTemplateResponseBodyTemplateInfoHostGroupList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupList setHostGroup(java.util.List<DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup> hostGroup) {
            this.hostGroup = hostGroup;
            return this;
        }
        public java.util.List<DescribeClusterTemplateResponseBodyTemplateInfoHostGroupListHostGroup> getHostGroup() {
            return this.hostGroup;
        }

    }

    public static class DescribeClusterTemplateResponseBodyTemplateInfoConfigListConfig extends TeaModel {
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

        public static DescribeClusterTemplateResponseBodyTemplateInfoConfigListConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterTemplateResponseBodyTemplateInfoConfigListConfig self = new DescribeClusterTemplateResponseBodyTemplateInfoConfigListConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoConfigListConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoConfigListConfig setReplace(String replace) {
            this.replace = replace;
            return this;
        }
        public String getReplace() {
            return this.replace;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoConfigListConfig setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoConfigListConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoConfigListConfig setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoConfigListConfig setEncrypt(String encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public String getEncrypt() {
            return this.encrypt;
        }

    }

    public static class DescribeClusterTemplateResponseBodyTemplateInfoConfigList extends TeaModel {
        @NameInMap("Config")
        public java.util.List<DescribeClusterTemplateResponseBodyTemplateInfoConfigListConfig> config;

        public static DescribeClusterTemplateResponseBodyTemplateInfoConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterTemplateResponseBodyTemplateInfoConfigList self = new DescribeClusterTemplateResponseBodyTemplateInfoConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoConfigList setConfig(java.util.List<DescribeClusterTemplateResponseBodyTemplateInfoConfigListConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<DescribeClusterTemplateResponseBodyTemplateInfoConfigListConfig> getConfig() {
            return this.config;
        }

    }

    public static class DescribeClusterTemplateResponseBodyTemplateInfoTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeClusterTemplateResponseBodyTemplateInfoTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterTemplateResponseBodyTemplateInfoTagsTag self = new DescribeClusterTemplateResponseBodyTemplateInfoTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeClusterTemplateResponseBodyTemplateInfoTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeClusterTemplateResponseBodyTemplateInfoTagsTag> tag;

        public static DescribeClusterTemplateResponseBodyTemplateInfoTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterTemplateResponseBodyTemplateInfoTags self = new DescribeClusterTemplateResponseBodyTemplateInfoTags();
            return TeaModel.build(map, self);
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoTags setTag(java.util.List<DescribeClusterTemplateResponseBodyTemplateInfoTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeClusterTemplateResponseBodyTemplateInfoTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeClusterTemplateResponseBodyTemplateInfoSoftwareInfoList extends TeaModel {
        @NameInMap("SoftwareInfo")
        public java.util.List<String> softwareInfo;

        public static DescribeClusterTemplateResponseBodyTemplateInfoSoftwareInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterTemplateResponseBodyTemplateInfoSoftwareInfoList self = new DescribeClusterTemplateResponseBodyTemplateInfoSoftwareInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterTemplateResponseBodyTemplateInfoSoftwareInfoList setSoftwareInfo(java.util.List<String> softwareInfo) {
            this.softwareInfo = softwareInfo;
            return this;
        }
        public java.util.List<String> getSoftwareInfo() {
            return this.softwareInfo;
        }

    }

    public static class DescribeClusterTemplateResponseBodyTemplateInfo extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("KeyPairName")
        public String keyPairName;

        @NameInMap("LogEnable")
        public Boolean logEnable;

        @NameInMap("SshEnable")
        public Boolean sshEnable;

        @NameInMap("HighAvailabilityEnable")
        public Boolean highAvailabilityEnable;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("MasterPwd")
        public String masterPwd;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("IsOpenPublicIp")
        public Boolean isOpenPublicIp;

        @NameInMap("AllowNotebook")
        public Boolean allowNotebook;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("DepositType")
        public String depositType;

        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        @NameInMap("CreateSource")
        public String createSource;

        @NameInMap("InstanceGeneration")
        public String instanceGeneration;

        @NameInMap("UseCustomHiveMetaDb")
        public Boolean useCustomHiveMetaDb;

        @NameInMap("EasEnable")
        public Boolean easEnable;

        @NameInMap("UserDefinedEmrEcsRole")
        public String userDefinedEmrEcsRole;

        @NameInMap("MetaStoreType")
        public String metaStoreType;

        @NameInMap("MachineType")
        public String machineType;

        @NameInMap("UseLocalMetaDb")
        public Boolean useLocalMetaDb;

        @NameInMap("MasterNodeTotal")
        public Integer masterNodeTotal;

        @NameInMap("InitCustomHiveMetaDb")
        public Boolean initCustomHiveMetaDb;

        @NameInMap("IoOptimized")
        public Boolean ioOptimized;

        @NameInMap("MetaStoreConf")
        public String metaStoreConf;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("Configurations")
        public String configurations;

        @NameInMap("EmrVer")
        public String emrVer;

        @NameInMap("LogPath")
        public String logPath;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public String id;

        @NameInMap("BootstrapActionList")
        public DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionList bootstrapActionList;

        @NameInMap("HostGroupList")
        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupList hostGroupList;

        @NameInMap("ConfigList")
        public DescribeClusterTemplateResponseBodyTemplateInfoConfigList configList;

        @NameInMap("Tags")
        public DescribeClusterTemplateResponseBodyTemplateInfoTags tags;

        @NameInMap("SoftwareInfoList")
        public DescribeClusterTemplateResponseBodyTemplateInfoSoftwareInfoList softwareInfoList;

        public static DescribeClusterTemplateResponseBodyTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterTemplateResponseBodyTemplateInfo self = new DescribeClusterTemplateResponseBodyTemplateInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setLogEnable(Boolean logEnable) {
            this.logEnable = logEnable;
            return this;
        }
        public Boolean getLogEnable() {
            return this.logEnable;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setSshEnable(Boolean sshEnable) {
            this.sshEnable = sshEnable;
            return this;
        }
        public Boolean getSshEnable() {
            return this.sshEnable;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setHighAvailabilityEnable(Boolean highAvailabilityEnable) {
            this.highAvailabilityEnable = highAvailabilityEnable;
            return this;
        }
        public Boolean getHighAvailabilityEnable() {
            return this.highAvailabilityEnable;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setMasterPwd(String masterPwd) {
            this.masterPwd = masterPwd;
            return this;
        }
        public String getMasterPwd() {
            return this.masterPwd;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setIsOpenPublicIp(Boolean isOpenPublicIp) {
            this.isOpenPublicIp = isOpenPublicIp;
            return this;
        }
        public Boolean getIsOpenPublicIp() {
            return this.isOpenPublicIp;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setAllowNotebook(Boolean allowNotebook) {
            this.allowNotebook = allowNotebook;
            return this;
        }
        public Boolean getAllowNotebook() {
            return this.allowNotebook;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setDepositType(String depositType) {
            this.depositType = depositType;
            return this;
        }
        public String getDepositType() {
            return this.depositType;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setCreateSource(String createSource) {
            this.createSource = createSource;
            return this;
        }
        public String getCreateSource() {
            return this.createSource;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setInstanceGeneration(String instanceGeneration) {
            this.instanceGeneration = instanceGeneration;
            return this;
        }
        public String getInstanceGeneration() {
            return this.instanceGeneration;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setUseCustomHiveMetaDb(Boolean useCustomHiveMetaDb) {
            this.useCustomHiveMetaDb = useCustomHiveMetaDb;
            return this;
        }
        public Boolean getUseCustomHiveMetaDb() {
            return this.useCustomHiveMetaDb;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setEasEnable(Boolean easEnable) {
            this.easEnable = easEnable;
            return this;
        }
        public Boolean getEasEnable() {
            return this.easEnable;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setUserDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
            this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
            return this;
        }
        public String getUserDefinedEmrEcsRole() {
            return this.userDefinedEmrEcsRole;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setMetaStoreType(String metaStoreType) {
            this.metaStoreType = metaStoreType;
            return this;
        }
        public String getMetaStoreType() {
            return this.metaStoreType;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setUseLocalMetaDb(Boolean useLocalMetaDb) {
            this.useLocalMetaDb = useLocalMetaDb;
            return this;
        }
        public Boolean getUseLocalMetaDb() {
            return this.useLocalMetaDb;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setMasterNodeTotal(Integer masterNodeTotal) {
            this.masterNodeTotal = masterNodeTotal;
            return this;
        }
        public Integer getMasterNodeTotal() {
            return this.masterNodeTotal;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setInitCustomHiveMetaDb(Boolean initCustomHiveMetaDb) {
            this.initCustomHiveMetaDb = initCustomHiveMetaDb;
            return this;
        }
        public Boolean getInitCustomHiveMetaDb() {
            return this.initCustomHiveMetaDb;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setMetaStoreConf(String metaStoreConf) {
            this.metaStoreConf = metaStoreConf;
            return this;
        }
        public String getMetaStoreConf() {
            return this.metaStoreConf;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setConfigurations(String configurations) {
            this.configurations = configurations;
            return this;
        }
        public String getConfigurations() {
            return this.configurations;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setEmrVer(String emrVer) {
            this.emrVer = emrVer;
            return this;
        }
        public String getEmrVer() {
            return this.emrVer;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setBootstrapActionList(DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionList bootstrapActionList) {
            this.bootstrapActionList = bootstrapActionList;
            return this;
        }
        public DescribeClusterTemplateResponseBodyTemplateInfoBootstrapActionList getBootstrapActionList() {
            return this.bootstrapActionList;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setHostGroupList(DescribeClusterTemplateResponseBodyTemplateInfoHostGroupList hostGroupList) {
            this.hostGroupList = hostGroupList;
            return this;
        }
        public DescribeClusterTemplateResponseBodyTemplateInfoHostGroupList getHostGroupList() {
            return this.hostGroupList;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setConfigList(DescribeClusterTemplateResponseBodyTemplateInfoConfigList configList) {
            this.configList = configList;
            return this;
        }
        public DescribeClusterTemplateResponseBodyTemplateInfoConfigList getConfigList() {
            return this.configList;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setTags(DescribeClusterTemplateResponseBodyTemplateInfoTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeClusterTemplateResponseBodyTemplateInfoTags getTags() {
            return this.tags;
        }

        public DescribeClusterTemplateResponseBodyTemplateInfo setSoftwareInfoList(DescribeClusterTemplateResponseBodyTemplateInfoSoftwareInfoList softwareInfoList) {
            this.softwareInfoList = softwareInfoList;
            return this;
        }
        public DescribeClusterTemplateResponseBodyTemplateInfoSoftwareInfoList getSoftwareInfoList() {
            return this.softwareInfoList;
        }

    }

}
