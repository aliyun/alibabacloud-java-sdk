// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateExecutionPlanRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

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

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CreateClusterOnDemand")
    public Boolean createClusterOnDemand;

    @NameInMap("ClusterName")
    public String clusterName;

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

    @NameInMap("UseCustomHiveMetaDB")
    public Boolean useCustomHiveMetaDB;

    @NameInMap("InitCustomHiveMetaDB")
    public Boolean initCustomHiveMetaDB;

    @NameInMap("Configurations")
    public String configurations;

    @NameInMap("EasEnable")
    public Boolean easEnable;

    @NameInMap("WorkflowDefinition")
    public String workflowDefinition;

    @NameInMap("JobIdList")
    public java.util.List<String> jobIdList;

    @NameInMap("OptionSoftWareList")
    public java.util.List<String> optionSoftWareList;

    @NameInMap("EcsOrder")
    public java.util.List<CreateExecutionPlanRequestEcsOrder> ecsOrder;

    @NameInMap("BootstrapAction")
    public java.util.List<CreateExecutionPlanRequestBootstrapAction> bootstrapAction;

    @NameInMap("Config")
    public java.util.List<CreateExecutionPlanRequestConfig> config;

    public static CreateExecutionPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExecutionPlanRequest self = new CreateExecutionPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateExecutionPlanRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateExecutionPlanRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateExecutionPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExecutionPlanRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public CreateExecutionPlanRequest setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
    public Integer getTimeInterval() {
        return this.timeInterval;
    }

    public CreateExecutionPlanRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateExecutionPlanRequest setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public CreateExecutionPlanRequest setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }
    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    public CreateExecutionPlanRequest setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }
    public String getDayOfMonth() {
        return this.dayOfMonth;
    }

    public CreateExecutionPlanRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateExecutionPlanRequest setCreateClusterOnDemand(Boolean createClusterOnDemand) {
        this.createClusterOnDemand = createClusterOnDemand;
        return this;
    }
    public Boolean getCreateClusterOnDemand() {
        return this.createClusterOnDemand;
    }

    public CreateExecutionPlanRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateExecutionPlanRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateExecutionPlanRequest setLogEnable(Boolean logEnable) {
        this.logEnable = logEnable;
        return this;
    }
    public Boolean getLogEnable() {
        return this.logEnable;
    }

    public CreateExecutionPlanRequest setLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }
    public String getLogPath() {
        return this.logPath;
    }

    public CreateExecutionPlanRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateExecutionPlanRequest setIsOpenPublicIp(Boolean isOpenPublicIp) {
        this.isOpenPublicIp = isOpenPublicIp;
        return this;
    }
    public Boolean getIsOpenPublicIp() {
        return this.isOpenPublicIp;
    }

    public CreateExecutionPlanRequest setEmrVer(String emrVer) {
        this.emrVer = emrVer;
        return this;
    }
    public String getEmrVer() {
        return this.emrVer;
    }

    public CreateExecutionPlanRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateExecutionPlanRequest setHighAvailabilityEnable(Boolean highAvailabilityEnable) {
        this.highAvailabilityEnable = highAvailabilityEnable;
        return this;
    }
    public Boolean getHighAvailabilityEnable() {
        return this.highAvailabilityEnable;
    }

    public CreateExecutionPlanRequest setUseLocalMetaDb(Boolean useLocalMetaDb) {
        this.useLocalMetaDb = useLocalMetaDb;
        return this;
    }
    public Boolean getUseLocalMetaDb() {
        return this.useLocalMetaDb;
    }

    public CreateExecutionPlanRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateExecutionPlanRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateExecutionPlanRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public CreateExecutionPlanRequest setUserDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
        this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
        return this;
    }
    public String getUserDefinedEmrEcsRole() {
        return this.userDefinedEmrEcsRole;
    }

    public CreateExecutionPlanRequest setIoOptimized(Boolean ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public Boolean getIoOptimized() {
        return this.ioOptimized;
    }

    public CreateExecutionPlanRequest setInstanceGeneration(String instanceGeneration) {
        this.instanceGeneration = instanceGeneration;
        return this;
    }
    public String getInstanceGeneration() {
        return this.instanceGeneration;
    }

    public CreateExecutionPlanRequest setUseCustomHiveMetaDB(Boolean useCustomHiveMetaDB) {
        this.useCustomHiveMetaDB = useCustomHiveMetaDB;
        return this;
    }
    public Boolean getUseCustomHiveMetaDB() {
        return this.useCustomHiveMetaDB;
    }

    public CreateExecutionPlanRequest setInitCustomHiveMetaDB(Boolean initCustomHiveMetaDB) {
        this.initCustomHiveMetaDB = initCustomHiveMetaDB;
        return this;
    }
    public Boolean getInitCustomHiveMetaDB() {
        return this.initCustomHiveMetaDB;
    }

    public CreateExecutionPlanRequest setConfigurations(String configurations) {
        this.configurations = configurations;
        return this;
    }
    public String getConfigurations() {
        return this.configurations;
    }

    public CreateExecutionPlanRequest setEasEnable(Boolean easEnable) {
        this.easEnable = easEnable;
        return this;
    }
    public Boolean getEasEnable() {
        return this.easEnable;
    }

    public CreateExecutionPlanRequest setWorkflowDefinition(String workflowDefinition) {
        this.workflowDefinition = workflowDefinition;
        return this;
    }
    public String getWorkflowDefinition() {
        return this.workflowDefinition;
    }

    public CreateExecutionPlanRequest setJobIdList(java.util.List<String> jobIdList) {
        this.jobIdList = jobIdList;
        return this;
    }
    public java.util.List<String> getJobIdList() {
        return this.jobIdList;
    }

    public CreateExecutionPlanRequest setOptionSoftWareList(java.util.List<String> optionSoftWareList) {
        this.optionSoftWareList = optionSoftWareList;
        return this;
    }
    public java.util.List<String> getOptionSoftWareList() {
        return this.optionSoftWareList;
    }

    public CreateExecutionPlanRequest setEcsOrder(java.util.List<CreateExecutionPlanRequestEcsOrder> ecsOrder) {
        this.ecsOrder = ecsOrder;
        return this;
    }
    public java.util.List<CreateExecutionPlanRequestEcsOrder> getEcsOrder() {
        return this.ecsOrder;
    }

    public CreateExecutionPlanRequest setBootstrapAction(java.util.List<CreateExecutionPlanRequestBootstrapAction> bootstrapAction) {
        this.bootstrapAction = bootstrapAction;
        return this;
    }
    public java.util.List<CreateExecutionPlanRequestBootstrapAction> getBootstrapAction() {
        return this.bootstrapAction;
    }

    public CreateExecutionPlanRequest setConfig(java.util.List<CreateExecutionPlanRequestConfig> config) {
        this.config = config;
        return this;
    }
    public java.util.List<CreateExecutionPlanRequestConfig> getConfig() {
        return this.config;
    }

    public static class CreateExecutionPlanRequestEcsOrder extends TeaModel {
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

        public static CreateExecutionPlanRequestEcsOrder build(java.util.Map<String, ?> map) throws Exception {
            CreateExecutionPlanRequestEcsOrder self = new CreateExecutionPlanRequestEcsOrder();
            return TeaModel.build(map, self);
        }

        public CreateExecutionPlanRequestEcsOrder setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public CreateExecutionPlanRequestEcsOrder setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public CreateExecutionPlanRequestEcsOrder setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public CreateExecutionPlanRequestEcsOrder setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public CreateExecutionPlanRequestEcsOrder setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public CreateExecutionPlanRequestEcsOrder setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateExecutionPlanRequestEcsOrder setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

    }

    public static class CreateExecutionPlanRequestBootstrapAction extends TeaModel {
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

        public static CreateExecutionPlanRequestBootstrapAction build(java.util.Map<String, ?> map) throws Exception {
            CreateExecutionPlanRequestBootstrapAction self = new CreateExecutionPlanRequestBootstrapAction();
            return TeaModel.build(map, self);
        }

        public CreateExecutionPlanRequestBootstrapAction setExecutionFailStrategy(String executionFailStrategy) {
            this.executionFailStrategy = executionFailStrategy;
            return this;
        }
        public String getExecutionFailStrategy() {
            return this.executionFailStrategy;
        }

        public CreateExecutionPlanRequestBootstrapAction setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public CreateExecutionPlanRequestBootstrapAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateExecutionPlanRequestBootstrapAction setExecutionTarget(String executionTarget) {
            this.executionTarget = executionTarget;
            return this;
        }
        public String getExecutionTarget() {
            return this.executionTarget;
        }

        public CreateExecutionPlanRequestBootstrapAction setExecutionMoment(String executionMoment) {
            this.executionMoment = executionMoment;
            return this;
        }
        public String getExecutionMoment() {
            return this.executionMoment;
        }

        public CreateExecutionPlanRequestBootstrapAction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateExecutionPlanRequestConfig extends TeaModel {
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

        public static CreateExecutionPlanRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateExecutionPlanRequestConfig self = new CreateExecutionPlanRequestConfig();
            return TeaModel.build(map, self);
        }

        public CreateExecutionPlanRequestConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public CreateExecutionPlanRequestConfig setReplace(String replace) {
            this.replace = replace;
            return this;
        }
        public String getReplace() {
            return this.replace;
        }

        public CreateExecutionPlanRequestConfig setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateExecutionPlanRequestConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public CreateExecutionPlanRequestConfig setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public CreateExecutionPlanRequestConfig setEncrypt(String encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public String getEncrypt() {
            return this.encrypt;
        }

    }

}
