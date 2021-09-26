// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateClusterV2Request extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Name")
    public String name;

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

    @NameInMap("Auto")
    public Boolean auto;

    @NameInMap("AutoPayOrder")
    public Boolean autoPayOrder;

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

    @NameInMap("ClickHouseConf")
    public String clickHouseConf;

    @NameInMap("ExtraAttributes")
    public String extraAttributes;

    @NameInMap("DepositType")
    public String depositType;

    @NameInMap("MachineType")
    public String machineType;

    @NameInMap("UseCustomHiveMetaDB")
    public Boolean useCustomHiveMetaDB;

    @NameInMap("InitCustomHiveMetaDB")
    public Boolean initCustomHiveMetaDB;

    @NameInMap("Configurations")
    public String configurations;

    @NameInMap("EnableEas")
    public Boolean enableEas;

    @NameInMap("RelatedClusterId")
    public String relatedClusterId;

    @NameInMap("WhiteListType")
    public String whiteListType;

    @NameInMap("AuthorizeContent")
    public String authorizeContent;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UserInfo")
    public java.util.List<CreateClusterV2RequestUserInfo> userInfo;

    @NameInMap("HostComponentInfo")
    public java.util.List<CreateClusterV2RequestHostComponentInfo> hostComponentInfo;

    @NameInMap("ServiceInfo")
    public java.util.List<CreateClusterV2RequestServiceInfo> serviceInfo;

    @NameInMap("PromotionInfo")
    public java.util.List<CreateClusterV2RequestPromotionInfo> promotionInfo;

    @NameInMap("HostGroup")
    public java.util.List<CreateClusterV2RequestHostGroup> hostGroup;

    @NameInMap("BootstrapAction")
    public java.util.List<CreateClusterV2RequestBootstrapAction> bootstrapAction;

    @NameInMap("Config")
    public java.util.List<CreateClusterV2RequestConfig> config;

    @NameInMap("Tag")
    public java.util.List<CreateClusterV2RequestTag> tag;

    public static CreateClusterV2Request build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterV2Request self = new CreateClusterV2Request();
        return TeaModel.build(map, self);
    }

    public CreateClusterV2Request setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateClusterV2Request setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateClusterV2Request setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateClusterV2Request setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateClusterV2Request setLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }
    public String getLogPath() {
        return this.logPath;
    }

    public CreateClusterV2Request setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateClusterV2Request setIsOpenPublicIp(Boolean isOpenPublicIp) {
        this.isOpenPublicIp = isOpenPublicIp;
        return this;
    }
    public Boolean getIsOpenPublicIp() {
        return this.isOpenPublicIp;
    }

    public CreateClusterV2Request setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public CreateClusterV2Request setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateClusterV2Request setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateClusterV2Request setAuto(Boolean auto) {
        this.auto = auto;
        return this;
    }
    public Boolean getAuto() {
        return this.auto;
    }

    public CreateClusterV2Request setAutoPayOrder(Boolean autoPayOrder) {
        this.autoPayOrder = autoPayOrder;
        return this;
    }
    public Boolean getAutoPayOrder() {
        return this.autoPayOrder;
    }

    public CreateClusterV2Request setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateClusterV2Request setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateClusterV2Request setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public CreateClusterV2Request setUserDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
        this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
        return this;
    }
    public String getUserDefinedEmrEcsRole() {
        return this.userDefinedEmrEcsRole;
    }

    public CreateClusterV2Request setEmrVer(String emrVer) {
        this.emrVer = emrVer;
        return this;
    }
    public String getEmrVer() {
        return this.emrVer;
    }

    public CreateClusterV2Request setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateClusterV2Request setEnableHighAvailability(Boolean enableHighAvailability) {
        this.enableHighAvailability = enableHighAvailability;
        return this;
    }
    public Boolean getEnableHighAvailability() {
        return this.enableHighAvailability;
    }

    public CreateClusterV2Request setUseLocalMetaDb(Boolean useLocalMetaDb) {
        this.useLocalMetaDb = useLocalMetaDb;
        return this;
    }
    public Boolean getUseLocalMetaDb() {
        return this.useLocalMetaDb;
    }

    public CreateClusterV2Request setEnableSsh(Boolean enableSsh) {
        this.enableSsh = enableSsh;
        return this;
    }
    public Boolean getEnableSsh() {
        return this.enableSsh;
    }

    public CreateClusterV2Request setInstanceGeneration(String instanceGeneration) {
        this.instanceGeneration = instanceGeneration;
        return this;
    }
    public String getInstanceGeneration() {
        return this.instanceGeneration;
    }

    public CreateClusterV2Request setMasterPwd(String masterPwd) {
        this.masterPwd = masterPwd;
        return this;
    }
    public String getMasterPwd() {
        return this.masterPwd;
    }

    public CreateClusterV2Request setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateClusterV2Request setMetaStoreType(String metaStoreType) {
        this.metaStoreType = metaStoreType;
        return this;
    }
    public String getMetaStoreType() {
        return this.metaStoreType;
    }

    public CreateClusterV2Request setMetaStoreConf(String metaStoreConf) {
        this.metaStoreConf = metaStoreConf;
        return this;
    }
    public String getMetaStoreConf() {
        return this.metaStoreConf;
    }

    public CreateClusterV2Request setClickHouseConf(String clickHouseConf) {
        this.clickHouseConf = clickHouseConf;
        return this;
    }
    public String getClickHouseConf() {
        return this.clickHouseConf;
    }

    public CreateClusterV2Request setExtraAttributes(String extraAttributes) {
        this.extraAttributes = extraAttributes;
        return this;
    }
    public String getExtraAttributes() {
        return this.extraAttributes;
    }

    public CreateClusterV2Request setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public CreateClusterV2Request setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }
    public String getMachineType() {
        return this.machineType;
    }

    public CreateClusterV2Request setUseCustomHiveMetaDB(Boolean useCustomHiveMetaDB) {
        this.useCustomHiveMetaDB = useCustomHiveMetaDB;
        return this;
    }
    public Boolean getUseCustomHiveMetaDB() {
        return this.useCustomHiveMetaDB;
    }

    public CreateClusterV2Request setInitCustomHiveMetaDB(Boolean initCustomHiveMetaDB) {
        this.initCustomHiveMetaDB = initCustomHiveMetaDB;
        return this;
    }
    public Boolean getInitCustomHiveMetaDB() {
        return this.initCustomHiveMetaDB;
    }

    public CreateClusterV2Request setConfigurations(String configurations) {
        this.configurations = configurations;
        return this;
    }
    public String getConfigurations() {
        return this.configurations;
    }

    public CreateClusterV2Request setEnableEas(Boolean enableEas) {
        this.enableEas = enableEas;
        return this;
    }
    public Boolean getEnableEas() {
        return this.enableEas;
    }

    public CreateClusterV2Request setRelatedClusterId(String relatedClusterId) {
        this.relatedClusterId = relatedClusterId;
        return this;
    }
    public String getRelatedClusterId() {
        return this.relatedClusterId;
    }

    public CreateClusterV2Request setWhiteListType(String whiteListType) {
        this.whiteListType = whiteListType;
        return this;
    }
    public String getWhiteListType() {
        return this.whiteListType;
    }

    public CreateClusterV2Request setAuthorizeContent(String authorizeContent) {
        this.authorizeContent = authorizeContent;
        return this;
    }
    public String getAuthorizeContent() {
        return this.authorizeContent;
    }

    public CreateClusterV2Request setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClusterV2Request setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateClusterV2Request setUserInfo(java.util.List<CreateClusterV2RequestUserInfo> userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public java.util.List<CreateClusterV2RequestUserInfo> getUserInfo() {
        return this.userInfo;
    }

    public CreateClusterV2Request setHostComponentInfo(java.util.List<CreateClusterV2RequestHostComponentInfo> hostComponentInfo) {
        this.hostComponentInfo = hostComponentInfo;
        return this;
    }
    public java.util.List<CreateClusterV2RequestHostComponentInfo> getHostComponentInfo() {
        return this.hostComponentInfo;
    }

    public CreateClusterV2Request setServiceInfo(java.util.List<CreateClusterV2RequestServiceInfo> serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }
    public java.util.List<CreateClusterV2RequestServiceInfo> getServiceInfo() {
        return this.serviceInfo;
    }

    public CreateClusterV2Request setPromotionInfo(java.util.List<CreateClusterV2RequestPromotionInfo> promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }
    public java.util.List<CreateClusterV2RequestPromotionInfo> getPromotionInfo() {
        return this.promotionInfo;
    }

    public CreateClusterV2Request setHostGroup(java.util.List<CreateClusterV2RequestHostGroup> hostGroup) {
        this.hostGroup = hostGroup;
        return this;
    }
    public java.util.List<CreateClusterV2RequestHostGroup> getHostGroup() {
        return this.hostGroup;
    }

    public CreateClusterV2Request setBootstrapAction(java.util.List<CreateClusterV2RequestBootstrapAction> bootstrapAction) {
        this.bootstrapAction = bootstrapAction;
        return this;
    }
    public java.util.List<CreateClusterV2RequestBootstrapAction> getBootstrapAction() {
        return this.bootstrapAction;
    }

    public CreateClusterV2Request setConfig(java.util.List<CreateClusterV2RequestConfig> config) {
        this.config = config;
        return this;
    }
    public java.util.List<CreateClusterV2RequestConfig> getConfig() {
        return this.config;
    }

    public CreateClusterV2Request setTag(java.util.List<CreateClusterV2RequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateClusterV2RequestTag> getTag() {
        return this.tag;
    }

    public static class CreateClusterV2RequestUserInfo extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static CreateClusterV2RequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterV2RequestUserInfo self = new CreateClusterV2RequestUserInfo();
            return TeaModel.build(map, self);
        }

        public CreateClusterV2RequestUserInfo setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateClusterV2RequestUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CreateClusterV2RequestUserInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CreateClusterV2RequestHostComponentInfo extends TeaModel {
        @NameInMap("ComponentNameList")
        public java.util.List<String> componentNameList;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("ServiceName")
        public String serviceName;

        public static CreateClusterV2RequestHostComponentInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterV2RequestHostComponentInfo self = new CreateClusterV2RequestHostComponentInfo();
            return TeaModel.build(map, self);
        }

        public CreateClusterV2RequestHostComponentInfo setComponentNameList(java.util.List<String> componentNameList) {
            this.componentNameList = componentNameList;
            return this;
        }
        public java.util.List<String> getComponentNameList() {
            return this.componentNameList;
        }

        public CreateClusterV2RequestHostComponentInfo setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public CreateClusterV2RequestHostComponentInfo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class CreateClusterV2RequestServiceInfo extends TeaModel {
        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("ServiceVersion")
        public String serviceVersion;

        public static CreateClusterV2RequestServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterV2RequestServiceInfo self = new CreateClusterV2RequestServiceInfo();
            return TeaModel.build(map, self);
        }

        public CreateClusterV2RequestServiceInfo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public CreateClusterV2RequestServiceInfo setServiceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            return this;
        }
        public String getServiceVersion() {
            return this.serviceVersion;
        }

    }

    public static class CreateClusterV2RequestPromotionInfo extends TeaModel {
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("PromotionOptionCode")
        public String promotionOptionCode;

        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        public static CreateClusterV2RequestPromotionInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterV2RequestPromotionInfo self = new CreateClusterV2RequestPromotionInfo();
            return TeaModel.build(map, self);
        }

        public CreateClusterV2RequestPromotionInfo setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public CreateClusterV2RequestPromotionInfo setPromotionOptionCode(String promotionOptionCode) {
            this.promotionOptionCode = promotionOptionCode;
            return this;
        }
        public String getPromotionOptionCode() {
            return this.promotionOptionCode;
        }

        public CreateClusterV2RequestPromotionInfo setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

    }

    public static class CreateClusterV2RequestHostGroup extends TeaModel {
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("CreateType")
        public String createType;

        @NameInMap("DiskCapacity")
        public Integer diskCapacity;

        @NameInMap("DiskCount")
        public Integer diskCount;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("GpuDriver")
        public String gpuDriver;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        @NameInMap("HostGroupName")
        public String hostGroupName;

        @NameInMap("HostGroupType")
        public String hostGroupType;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("SysDiskCapacity")
        public Integer sysDiskCapacity;

        @NameInMap("SysDiskType")
        public String sysDiskType;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static CreateClusterV2RequestHostGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterV2RequestHostGroup self = new CreateClusterV2RequestHostGroup();
            return TeaModel.build(map, self);
        }

        public CreateClusterV2RequestHostGroup setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public CreateClusterV2RequestHostGroup setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public CreateClusterV2RequestHostGroup setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateClusterV2RequestHostGroup setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateClusterV2RequestHostGroup setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public CreateClusterV2RequestHostGroup setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public CreateClusterV2RequestHostGroup setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

        public CreateClusterV2RequestHostGroup setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public CreateClusterV2RequestHostGroup setGpuDriver(String gpuDriver) {
            this.gpuDriver = gpuDriver;
            return this;
        }
        public String getGpuDriver() {
            return this.gpuDriver;
        }

        public CreateClusterV2RequestHostGroup setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public CreateClusterV2RequestHostGroup setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        public CreateClusterV2RequestHostGroup setHostGroupType(String hostGroupType) {
            this.hostGroupType = hostGroupType;
            return this;
        }
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        public CreateClusterV2RequestHostGroup setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateClusterV2RequestHostGroup setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public CreateClusterV2RequestHostGroup setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public CreateClusterV2RequestHostGroup setSysDiskCapacity(Integer sysDiskCapacity) {
            this.sysDiskCapacity = sysDiskCapacity;
            return this;
        }
        public Integer getSysDiskCapacity() {
            return this.sysDiskCapacity;
        }

        public CreateClusterV2RequestHostGroup setSysDiskType(String sysDiskType) {
            this.sysDiskType = sysDiskType;
            return this;
        }
        public String getSysDiskType() {
            return this.sysDiskType;
        }

        public CreateClusterV2RequestHostGroup setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class CreateClusterV2RequestBootstrapAction extends TeaModel {
        @NameInMap("Arg")
        public String arg;

        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        public static CreateClusterV2RequestBootstrapAction build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterV2RequestBootstrapAction self = new CreateClusterV2RequestBootstrapAction();
            return TeaModel.build(map, self);
        }

        public CreateClusterV2RequestBootstrapAction setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public CreateClusterV2RequestBootstrapAction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateClusterV2RequestBootstrapAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class CreateClusterV2RequestConfig extends TeaModel {
        @NameInMap("ConfigKey")
        public String configKey;

        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("Encrypt")
        public String encrypt;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Replace")
        public String replace;

        @NameInMap("ServiceName")
        public String serviceName;

        public static CreateClusterV2RequestConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterV2RequestConfig self = new CreateClusterV2RequestConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterV2RequestConfig setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public CreateClusterV2RequestConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public CreateClusterV2RequestConfig setEncrypt(String encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public String getEncrypt() {
            return this.encrypt;
        }

        public CreateClusterV2RequestConfig setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateClusterV2RequestConfig setReplace(String replace) {
            this.replace = replace;
            return this;
        }
        public String getReplace() {
            return this.replace;
        }

        public CreateClusterV2RequestConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class CreateClusterV2RequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateClusterV2RequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterV2RequestTag self = new CreateClusterV2RequestTag();
            return TeaModel.build(map, self);
        }

        public CreateClusterV2RequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateClusterV2RequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
