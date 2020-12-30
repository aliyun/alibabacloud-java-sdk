// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyExecutionPlanRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("LogEnable")
    public Boolean logEnable;

    @NameInMap("LogPath")
    public String logPath;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("IsOpenPublicIp")
    public Boolean isOpenPublicIp;

    @NameInMap("CreateClusterOnDemand")
    public Boolean createClusterOnDemand;

    @NameInMap("EmrVer")
    public String emrVer;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("HighAvailabilityEnable")
    public Boolean highAvailabilityEnable;

    @NameInMap("UseLocalMetaDb")
    public Boolean useLocalMetaDb;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("NetType")
    public String netType;

    @NameInMap("UserDefinedEmrEcsRole")
    public String userDefinedEmrEcsRole;

    @NameInMap("IoOptimized")
    public Boolean ioOptimized;

    @NameInMap("InstanceGeneration")
    public String instanceGeneration;

    @NameInMap("EasEnable")
    public Boolean easEnable;

    @NameInMap("WorkflowDefinition")
    public String workflowDefinition;

    @NameInMap("UseCustomHiveMetaDB")
    public Boolean useCustomHiveMetaDB;

    @NameInMap("InitCustomHiveMetaDB")
    public Boolean initCustomHiveMetaDB;

    @NameInMap("Configurations")
    public String configurations;

    @NameInMap("Id")
    public String id;

    @NameInMap("ExecutionPlanVersion")
    public Long executionPlanVersion;

    @NameInMap("Name")
    public String name;

    @NameInMap("Strategy")
    public String strategy;

    @NameInMap("TimeInterval")
    public Integer timeInterval;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TimeUnit")
    public String timeUnit;

    @NameInMap("DayOfWeek")
    public String dayOfWeek;

    @NameInMap("DayOfMonth")
    public String dayOfMonth;

    @NameInMap("OptionSoftWareList")
    public java.util.List<String> optionSoftWareList;

    @NameInMap("EcsOrder")
    public java.util.List<ModifyExecutionPlanRequestEcsOrder> ecsOrder;

    @NameInMap("BootstrapAction")
    public java.util.List<ModifyExecutionPlanRequestBootstrapAction> bootstrapAction;

    @NameInMap("Config")
    public java.util.List<ModifyExecutionPlanRequestConfig> config;

    @NameInMap("JobIdList")
    public java.util.List<String> jobIdList;

    public static ModifyExecutionPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyExecutionPlanRequest self = new ModifyExecutionPlanRequest();
        return TeaModel.build(map, self);
    }

    public ModifyExecutionPlanRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyExecutionPlanRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ModifyExecutionPlanRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyExecutionPlanRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyExecutionPlanRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public ModifyExecutionPlanRequest setLogEnable(Boolean logEnable) {
        this.logEnable = logEnable;
        return this;
    }
    public Boolean getLogEnable() {
        return this.logEnable;
    }

    public ModifyExecutionPlanRequest setLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }
    public String getLogPath() {
        return this.logPath;
    }

    public ModifyExecutionPlanRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifyExecutionPlanRequest setIsOpenPublicIp(Boolean isOpenPublicIp) {
        this.isOpenPublicIp = isOpenPublicIp;
        return this;
    }
    public Boolean getIsOpenPublicIp() {
        return this.isOpenPublicIp;
    }

    public ModifyExecutionPlanRequest setCreateClusterOnDemand(Boolean createClusterOnDemand) {
        this.createClusterOnDemand = createClusterOnDemand;
        return this;
    }
    public Boolean getCreateClusterOnDemand() {
        return this.createClusterOnDemand;
    }

    public ModifyExecutionPlanRequest setEmrVer(String emrVer) {
        this.emrVer = emrVer;
        return this;
    }
    public String getEmrVer() {
        return this.emrVer;
    }

    public ModifyExecutionPlanRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ModifyExecutionPlanRequest setHighAvailabilityEnable(Boolean highAvailabilityEnable) {
        this.highAvailabilityEnable = highAvailabilityEnable;
        return this;
    }
    public Boolean getHighAvailabilityEnable() {
        return this.highAvailabilityEnable;
    }

    public ModifyExecutionPlanRequest setUseLocalMetaDb(Boolean useLocalMetaDb) {
        this.useLocalMetaDb = useLocalMetaDb;
        return this;
    }
    public Boolean getUseLocalMetaDb() {
        return this.useLocalMetaDb;
    }

    public ModifyExecutionPlanRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ModifyExecutionPlanRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ModifyExecutionPlanRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public ModifyExecutionPlanRequest setUserDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
        this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
        return this;
    }
    public String getUserDefinedEmrEcsRole() {
        return this.userDefinedEmrEcsRole;
    }

    public ModifyExecutionPlanRequest setIoOptimized(Boolean ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public Boolean getIoOptimized() {
        return this.ioOptimized;
    }

    public ModifyExecutionPlanRequest setInstanceGeneration(String instanceGeneration) {
        this.instanceGeneration = instanceGeneration;
        return this;
    }
    public String getInstanceGeneration() {
        return this.instanceGeneration;
    }

    public ModifyExecutionPlanRequest setEasEnable(Boolean easEnable) {
        this.easEnable = easEnable;
        return this;
    }
    public Boolean getEasEnable() {
        return this.easEnable;
    }

    public ModifyExecutionPlanRequest setWorkflowDefinition(String workflowDefinition) {
        this.workflowDefinition = workflowDefinition;
        return this;
    }
    public String getWorkflowDefinition() {
        return this.workflowDefinition;
    }

    public ModifyExecutionPlanRequest setUseCustomHiveMetaDB(Boolean useCustomHiveMetaDB) {
        this.useCustomHiveMetaDB = useCustomHiveMetaDB;
        return this;
    }
    public Boolean getUseCustomHiveMetaDB() {
        return this.useCustomHiveMetaDB;
    }

    public ModifyExecutionPlanRequest setInitCustomHiveMetaDB(Boolean initCustomHiveMetaDB) {
        this.initCustomHiveMetaDB = initCustomHiveMetaDB;
        return this;
    }
    public Boolean getInitCustomHiveMetaDB() {
        return this.initCustomHiveMetaDB;
    }

    public ModifyExecutionPlanRequest setConfigurations(String configurations) {
        this.configurations = configurations;
        return this;
    }
    public String getConfigurations() {
        return this.configurations;
    }

    public ModifyExecutionPlanRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyExecutionPlanRequest setExecutionPlanVersion(Long executionPlanVersion) {
        this.executionPlanVersion = executionPlanVersion;
        return this;
    }
    public Long getExecutionPlanVersion() {
        return this.executionPlanVersion;
    }

    public ModifyExecutionPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyExecutionPlanRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public ModifyExecutionPlanRequest setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
    public Integer getTimeInterval() {
        return this.timeInterval;
    }

    public ModifyExecutionPlanRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ModifyExecutionPlanRequest setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public ModifyExecutionPlanRequest setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }
    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    public ModifyExecutionPlanRequest setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }
    public String getDayOfMonth() {
        return this.dayOfMonth;
    }

    public ModifyExecutionPlanRequest setOptionSoftWareList(java.util.List<String> optionSoftWareList) {
        this.optionSoftWareList = optionSoftWareList;
        return this;
    }
    public java.util.List<String> getOptionSoftWareList() {
        return this.optionSoftWareList;
    }

    public ModifyExecutionPlanRequest setEcsOrder(java.util.List<ModifyExecutionPlanRequestEcsOrder> ecsOrder) {
        this.ecsOrder = ecsOrder;
        return this;
    }
    public java.util.List<ModifyExecutionPlanRequestEcsOrder> getEcsOrder() {
        return this.ecsOrder;
    }

    public ModifyExecutionPlanRequest setBootstrapAction(java.util.List<ModifyExecutionPlanRequestBootstrapAction> bootstrapAction) {
        this.bootstrapAction = bootstrapAction;
        return this;
    }
    public java.util.List<ModifyExecutionPlanRequestBootstrapAction> getBootstrapAction() {
        return this.bootstrapAction;
    }

    public ModifyExecutionPlanRequest setConfig(java.util.List<ModifyExecutionPlanRequestConfig> config) {
        this.config = config;
        return this;
    }
    public java.util.List<ModifyExecutionPlanRequestConfig> getConfig() {
        return this.config;
    }

    public ModifyExecutionPlanRequest setJobIdList(java.util.List<String> jobIdList) {
        this.jobIdList = jobIdList;
        return this;
    }
    public java.util.List<String> getJobIdList() {
        return this.jobIdList;
    }

    public static class ModifyExecutionPlanRequestEcsOrder extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("DiskCapacity")
        public Integer diskCapacity;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("DiskCount")
        public Integer diskCount;

        public static ModifyExecutionPlanRequestEcsOrder build(java.util.Map<String, ?> map) throws Exception {
            ModifyExecutionPlanRequestEcsOrder self = new ModifyExecutionPlanRequestEcsOrder();
            return TeaModel.build(map, self);
        }

        public ModifyExecutionPlanRequestEcsOrder setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ModifyExecutionPlanRequestEcsOrder setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public ModifyExecutionPlanRequestEcsOrder setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ModifyExecutionPlanRequestEcsOrder setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public ModifyExecutionPlanRequestEcsOrder setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ModifyExecutionPlanRequestEcsOrder setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyExecutionPlanRequestEcsOrder setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

    }

    public static class ModifyExecutionPlanRequestBootstrapAction extends TeaModel {
        @NameInMap("ExecutionFailStrategy")
        public String executionFailStrategy;

        @NameInMap("Arg")
        public String arg;

        @NameInMap("Path")
        public String path;

        @NameInMap("ExecutionTarget")
        public String executionTarget;

        @NameInMap("ExecutionMoment")
        public String executionMoment;

        @NameInMap("Name")
        public String name;

        public static ModifyExecutionPlanRequestBootstrapAction build(java.util.Map<String, ?> map) throws Exception {
            ModifyExecutionPlanRequestBootstrapAction self = new ModifyExecutionPlanRequestBootstrapAction();
            return TeaModel.build(map, self);
        }

        public ModifyExecutionPlanRequestBootstrapAction setExecutionFailStrategy(String executionFailStrategy) {
            this.executionFailStrategy = executionFailStrategy;
            return this;
        }
        public String getExecutionFailStrategy() {
            return this.executionFailStrategy;
        }

        public ModifyExecutionPlanRequestBootstrapAction setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public ModifyExecutionPlanRequestBootstrapAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ModifyExecutionPlanRequestBootstrapAction setExecutionTarget(String executionTarget) {
            this.executionTarget = executionTarget;
            return this;
        }
        public String getExecutionTarget() {
            return this.executionTarget;
        }

        public ModifyExecutionPlanRequestBootstrapAction setExecutionMoment(String executionMoment) {
            this.executionMoment = executionMoment;
            return this;
        }
        public String getExecutionMoment() {
            return this.executionMoment;
        }

        public ModifyExecutionPlanRequestBootstrapAction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ModifyExecutionPlanRequestConfig extends TeaModel {
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

        public static ModifyExecutionPlanRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyExecutionPlanRequestConfig self = new ModifyExecutionPlanRequestConfig();
            return TeaModel.build(map, self);
        }

        public ModifyExecutionPlanRequestConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public ModifyExecutionPlanRequestConfig setReplace(String replace) {
            this.replace = replace;
            return this;
        }
        public String getReplace() {
            return this.replace;
        }

        public ModifyExecutionPlanRequestConfig setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ModifyExecutionPlanRequestConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ModifyExecutionPlanRequestConfig setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public ModifyExecutionPlanRequestConfig setEncrypt(String encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public String getEncrypt() {
            return this.encrypt;
        }

    }

}
