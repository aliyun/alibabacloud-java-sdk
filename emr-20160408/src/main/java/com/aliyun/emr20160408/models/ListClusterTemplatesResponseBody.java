// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterTemplatesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TemplateInfoList")
    public ListClusterTemplatesResponseBodyTemplateInfoList templateInfoList;

    public static ListClusterTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTemplatesResponseBody self = new ListClusterTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListClusterTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterTemplatesResponseBody setTemplateInfoList(ListClusterTemplatesResponseBodyTemplateInfoList templateInfoList) {
        this.templateInfoList = templateInfoList;
        return this;
    }
    public ListClusterTemplatesResponseBodyTemplateInfoList getTemplateInfoList() {
        return this.templateInfoList;
    }

    public static class ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup extends TeaModel {
        @NameInMap("SysDiskCapacity")
        public Integer sysDiskCapacity;

        @NameInMap("HostGroupType")
        public String hostGroupType;

        @NameInMap("SysDiskType")
        public String sysDiskType;

        @NameInMap("MultiInstanceTypes")
        public String multiInstanceTypes;

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

        public static ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup self = new ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup();
            return TeaModel.build(map, self);
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup setSysDiskCapacity(Integer sysDiskCapacity) {
            this.sysDiskCapacity = sysDiskCapacity;
            return this;
        }
        public Integer getSysDiskCapacity() {
            return this.sysDiskCapacity;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup setHostGroupType(String hostGroupType) {
            this.hostGroupType = hostGroupType;
            return this;
        }
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup setSysDiskType(String sysDiskType) {
            this.sysDiskType = sysDiskType;
            return this;
        }
        public String getSysDiskType() {
            return this.sysDiskType;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup setMultiInstanceTypes(String multiInstanceTypes) {
            this.multiInstanceTypes = multiInstanceTypes;
            return this;
        }
        public String getMultiInstanceTypes() {
            return this.multiInstanceTypes;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

    }

    public static class ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupList extends TeaModel {
        @NameInMap("HostGroup")
        public java.util.List<ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup> hostGroup;

        public static ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupList self = new ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupList();
            return TeaModel.build(map, self);
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupList setHostGroup(java.util.List<ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup> hostGroup) {
            this.hostGroup = hostGroup;
            return this;
        }
        public java.util.List<ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupListHostGroup> getHostGroup() {
            return this.hostGroup;
        }

    }

    public static class ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigListConfig extends TeaModel {
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

        public static ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigListConfig build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigListConfig self = new ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigListConfig();
            return TeaModel.build(map, self);
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigListConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigListConfig setReplace(String replace) {
            this.replace = replace;
            return this;
        }
        public String getReplace() {
            return this.replace;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigListConfig setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigListConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigListConfig setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigListConfig setEncrypt(String encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public String getEncrypt() {
            return this.encrypt;
        }

    }

    public static class ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigList extends TeaModel {
        @NameInMap("Config")
        public java.util.List<ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigListConfig> config;

        public static ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigList self = new ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigList();
            return TeaModel.build(map, self);
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigList setConfig(java.util.List<ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigListConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigListConfig> getConfig() {
            return this.config;
        }

    }

    public static class ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionListBootstrapAction extends TeaModel {
        @NameInMap("Arg")
        public String arg;

        @NameInMap("Path")
        public String path;

        @NameInMap("Name")
        public String name;

        public static ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionListBootstrapAction build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionListBootstrapAction self = new ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionListBootstrapAction();
            return TeaModel.build(map, self);
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionListBootstrapAction setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionListBootstrapAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionListBootstrapAction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionList extends TeaModel {
        @NameInMap("BootstrapAction")
        public java.util.List<ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionListBootstrapAction> bootstrapAction;

        public static ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionList self = new ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionList();
            return TeaModel.build(map, self);
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionList setBootstrapAction(java.util.List<ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionListBootstrapAction> bootstrapAction) {
            this.bootstrapAction = bootstrapAction;
            return this;
        }
        public java.util.List<ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionListBootstrapAction> getBootstrapAction() {
            return this.bootstrapAction;
        }

    }

    public static class ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoSoftwareInfoList extends TeaModel {
        @NameInMap("SoftwareInfo")
        public java.util.List<String> softwareInfo;

        public static ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoSoftwareInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoSoftwareInfoList self = new ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoSoftwareInfoList();
            return TeaModel.build(map, self);
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoSoftwareInfoList setSoftwareInfo(java.util.List<String> softwareInfo) {
            this.softwareInfo = softwareInfo;
            return this;
        }
        public java.util.List<String> getSoftwareInfo() {
            return this.softwareInfo;
        }

    }

    public static class ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo extends TeaModel {
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

        @NameInMap("UserId")
        public String userId;

        @NameInMap("HostGroupList")
        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupList hostGroupList;

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

        @NameInMap("ConfigList")
        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigList configList;

        @NameInMap("BootstrapActionList")
        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionList bootstrapActionList;

        @NameInMap("SoftwareInfoList")
        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoSoftwareInfoList softwareInfoList;

        @NameInMap("InstanceGeneration")
        public String instanceGeneration;

        @NameInMap("CreateSource")
        public String createSource;

        @NameInMap("EasEnable")
        public Boolean easEnable;

        @NameInMap("UseCustomHiveMetaDb")
        public Boolean useCustomHiveMetaDb;

        @NameInMap("UserDefinedEmrEcsRole")
        public String userDefinedEmrEcsRole;

        @NameInMap("MachineType")
        public String machineType;

        @NameInMap("MetaStoreType")
        public String metaStoreType;

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

        public static ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo self = new ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo();
            return TeaModel.build(map, self);
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setLogEnable(Boolean logEnable) {
            this.logEnable = logEnable;
            return this;
        }
        public Boolean getLogEnable() {
            return this.logEnable;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setSshEnable(Boolean sshEnable) {
            this.sshEnable = sshEnable;
            return this;
        }
        public Boolean getSshEnable() {
            return this.sshEnable;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setHighAvailabilityEnable(Boolean highAvailabilityEnable) {
            this.highAvailabilityEnable = highAvailabilityEnable;
            return this;
        }
        public Boolean getHighAvailabilityEnable() {
            return this.highAvailabilityEnable;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setHostGroupList(ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupList hostGroupList) {
            this.hostGroupList = hostGroupList;
            return this;
        }
        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoHostGroupList getHostGroupList() {
            return this.hostGroupList;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setIsOpenPublicIp(Boolean isOpenPublicIp) {
            this.isOpenPublicIp = isOpenPublicIp;
            return this;
        }
        public Boolean getIsOpenPublicIp() {
            return this.isOpenPublicIp;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setAllowNotebook(Boolean allowNotebook) {
            this.allowNotebook = allowNotebook;
            return this;
        }
        public Boolean getAllowNotebook() {
            return this.allowNotebook;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setDepositType(String depositType) {
            this.depositType = depositType;
            return this;
        }
        public String getDepositType() {
            return this.depositType;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setConfigList(ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigList configList) {
            this.configList = configList;
            return this;
        }
        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoConfigList getConfigList() {
            return this.configList;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setBootstrapActionList(ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionList bootstrapActionList) {
            this.bootstrapActionList = bootstrapActionList;
            return this;
        }
        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoBootstrapActionList getBootstrapActionList() {
            return this.bootstrapActionList;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setSoftwareInfoList(ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoSoftwareInfoList softwareInfoList) {
            this.softwareInfoList = softwareInfoList;
            return this;
        }
        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfoSoftwareInfoList getSoftwareInfoList() {
            return this.softwareInfoList;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setInstanceGeneration(String instanceGeneration) {
            this.instanceGeneration = instanceGeneration;
            return this;
        }
        public String getInstanceGeneration() {
            return this.instanceGeneration;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setCreateSource(String createSource) {
            this.createSource = createSource;
            return this;
        }
        public String getCreateSource() {
            return this.createSource;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setEasEnable(Boolean easEnable) {
            this.easEnable = easEnable;
            return this;
        }
        public Boolean getEasEnable() {
            return this.easEnable;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setUseCustomHiveMetaDb(Boolean useCustomHiveMetaDb) {
            this.useCustomHiveMetaDb = useCustomHiveMetaDb;
            return this;
        }
        public Boolean getUseCustomHiveMetaDb() {
            return this.useCustomHiveMetaDb;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setUserDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
            this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
            return this;
        }
        public String getUserDefinedEmrEcsRole() {
            return this.userDefinedEmrEcsRole;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setMetaStoreType(String metaStoreType) {
            this.metaStoreType = metaStoreType;
            return this;
        }
        public String getMetaStoreType() {
            return this.metaStoreType;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setUseLocalMetaDb(Boolean useLocalMetaDb) {
            this.useLocalMetaDb = useLocalMetaDb;
            return this;
        }
        public Boolean getUseLocalMetaDb() {
            return this.useLocalMetaDb;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setMasterNodeTotal(Integer masterNodeTotal) {
            this.masterNodeTotal = masterNodeTotal;
            return this;
        }
        public Integer getMasterNodeTotal() {
            return this.masterNodeTotal;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setInitCustomHiveMetaDb(Boolean initCustomHiveMetaDb) {
            this.initCustomHiveMetaDb = initCustomHiveMetaDb;
            return this;
        }
        public Boolean getInitCustomHiveMetaDb() {
            return this.initCustomHiveMetaDb;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setMetaStoreConf(String metaStoreConf) {
            this.metaStoreConf = metaStoreConf;
            return this;
        }
        public String getMetaStoreConf() {
            return this.metaStoreConf;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setConfigurations(String configurations) {
            this.configurations = configurations;
            return this;
        }
        public String getConfigurations() {
            return this.configurations;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListClusterTemplatesResponseBodyTemplateInfoList extends TeaModel {
        @NameInMap("TemplateInfo")
        public java.util.List<ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo> templateInfo;

        public static ListClusterTemplatesResponseBodyTemplateInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTemplatesResponseBodyTemplateInfoList self = new ListClusterTemplatesResponseBodyTemplateInfoList();
            return TeaModel.build(map, self);
        }

        public ListClusterTemplatesResponseBodyTemplateInfoList setTemplateInfo(java.util.List<ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo> templateInfo) {
            this.templateInfo = templateInfo;
            return this;
        }
        public java.util.List<ListClusterTemplatesResponseBodyTemplateInfoListTemplateInfo> getTemplateInfo() {
            return this.templateInfo;
        }

    }

}
