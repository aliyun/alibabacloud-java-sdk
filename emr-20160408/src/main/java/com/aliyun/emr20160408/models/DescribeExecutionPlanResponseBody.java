// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeExecutionPlanResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("WorkflowApp")
    public String workflowApp;

    @NameInMap("DayOfWeek")
    public String dayOfWeek;

    @NameInMap("TimeInterval")
    public Integer timeInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DayOfMonth")
    public String dayOfMonth;

    @NameInMap("ExecutionPlanVersion")
    public Long executionPlanVersion;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("JobInfoList")
    public DescribeExecutionPlanResponseBodyJobInfoList jobInfoList;

    @NameInMap("ClusterInfo")
    public DescribeExecutionPlanResponseBodyClusterInfo clusterInfo;

    @NameInMap("TimeUnit")
    public String timeUnit;

    @NameInMap("Strategy")
    public String strategy;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("Id")
    public String id;

    @NameInMap("CreateClusterOnDemand")
    public Boolean createClusterOnDemand;

    public static DescribeExecutionPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExecutionPlanResponseBody self = new DescribeExecutionPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExecutionPlanResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeExecutionPlanResponseBody setWorkflowApp(String workflowApp) {
        this.workflowApp = workflowApp;
        return this;
    }
    public String getWorkflowApp() {
        return this.workflowApp;
    }

    public DescribeExecutionPlanResponseBody setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }
    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    public DescribeExecutionPlanResponseBody setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
    public Integer getTimeInterval() {
        return this.timeInterval;
    }

    public DescribeExecutionPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExecutionPlanResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeExecutionPlanResponseBody setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }
    public String getDayOfMonth() {
        return this.dayOfMonth;
    }

    public DescribeExecutionPlanResponseBody setExecutionPlanVersion(Long executionPlanVersion) {
        this.executionPlanVersion = executionPlanVersion;
        return this;
    }
    public Long getExecutionPlanVersion() {
        return this.executionPlanVersion;
    }

    public DescribeExecutionPlanResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeExecutionPlanResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeExecutionPlanResponseBody setJobInfoList(DescribeExecutionPlanResponseBodyJobInfoList jobInfoList) {
        this.jobInfoList = jobInfoList;
        return this;
    }
    public DescribeExecutionPlanResponseBodyJobInfoList getJobInfoList() {
        return this.jobInfoList;
    }

    public DescribeExecutionPlanResponseBody setClusterInfo(DescribeExecutionPlanResponseBodyClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }
    public DescribeExecutionPlanResponseBodyClusterInfo getClusterInfo() {
        return this.clusterInfo;
    }

    public DescribeExecutionPlanResponseBody setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public DescribeExecutionPlanResponseBody setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public DescribeExecutionPlanResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeExecutionPlanResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeExecutionPlanResponseBody setCreateClusterOnDemand(Boolean createClusterOnDemand) {
        this.createClusterOnDemand = createClusterOnDemand;
        return this;
    }
    public Boolean getCreateClusterOnDemand() {
        return this.createClusterOnDemand;
    }

    public static class DescribeExecutionPlanResponseBodyJobInfoListJobInfo extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("FailAct")
        public String failAct;

        @NameInMap("Name")
        public String name;

        @NameInMap("RunParameter")
        public String runParameter;

        @NameInMap("Id")
        public String id;

        public static DescribeExecutionPlanResponseBodyJobInfoListJobInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutionPlanResponseBodyJobInfoListJobInfo self = new DescribeExecutionPlanResponseBodyJobInfoListJobInfo();
            return TeaModel.build(map, self);
        }

        public DescribeExecutionPlanResponseBodyJobInfoListJobInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeExecutionPlanResponseBodyJobInfoListJobInfo setFailAct(String failAct) {
            this.failAct = failAct;
            return this;
        }
        public String getFailAct() {
            return this.failAct;
        }

        public DescribeExecutionPlanResponseBodyJobInfoListJobInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExecutionPlanResponseBodyJobInfoListJobInfo setRunParameter(String runParameter) {
            this.runParameter = runParameter;
            return this;
        }
        public String getRunParameter() {
            return this.runParameter;
        }

        public DescribeExecutionPlanResponseBodyJobInfoListJobInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeExecutionPlanResponseBodyJobInfoList extends TeaModel {
        @NameInMap("JobInfo")
        public java.util.List<DescribeExecutionPlanResponseBodyJobInfoListJobInfo> jobInfo;

        public static DescribeExecutionPlanResponseBodyJobInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutionPlanResponseBodyJobInfoList self = new DescribeExecutionPlanResponseBodyJobInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeExecutionPlanResponseBodyJobInfoList setJobInfo(java.util.List<DescribeExecutionPlanResponseBodyJobInfoListJobInfo> jobInfo) {
            this.jobInfo = jobInfo;
            return this;
        }
        public java.util.List<DescribeExecutionPlanResponseBodyJobInfoListJobInfo> getJobInfo() {
            return this.jobInfo;
        }

    }

    public static class DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("StartTpe")
        public Integer startTpe;

        @NameInMap("Version")
        public String version;

        @NameInMap("OnlyDisplay")
        public Boolean onlyDisplay;

        @NameInMap("Optional")
        public Boolean optional;

        @NameInMap("Name")
        public String name;

        public static DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware self = new DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware();
            return TeaModel.build(map, self);
        }

        public DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setStartTpe(Integer startTpe) {
            this.startTpe = startTpe;
            return this;
        }
        public Integer getStartTpe() {
            return this.startTpe;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setOnlyDisplay(Boolean onlyDisplay) {
            this.onlyDisplay = onlyDisplay;
            return this;
        }
        public Boolean getOnlyDisplay() {
            return this.onlyDisplay;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setOptional(Boolean optional) {
            this.optional = optional;
            return this;
        }
        public Boolean getOptional() {
            return this.optional;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwares extends TeaModel {
        @NameInMap("Software")
        public java.util.List<DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware> software;

        public static DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwares build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwares self = new DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwares();
            return TeaModel.build(map, self);
        }

        public DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwares setSoftware(java.util.List<DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware> software) {
            this.software = software;
            return this;
        }
        public java.util.List<DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware> getSoftware() {
            return this.software;
        }

    }

    public static class DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfo extends TeaModel {
        @NameInMap("EmrVer")
        public String emrVer;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("Softwares")
        public DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwares softwares;

        public static DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfo self = new DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfo();
            return TeaModel.build(map, self);
        }

        public DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfo setEmrVer(String emrVer) {
            this.emrVer = emrVer;
            return this;
        }
        public String getEmrVer() {
            return this.emrVer;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfo setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfo setSoftwares(DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwares softwares) {
            this.softwares = softwares;
            return this;
        }
        public DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfoSoftwares getSoftwares() {
            return this.softwares;
        }

    }

    public static class DescribeExecutionPlanResponseBodyClusterInfoEcsOrdersEcsOrderInfo extends TeaModel {
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

        public static DescribeExecutionPlanResponseBodyClusterInfoEcsOrdersEcsOrderInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutionPlanResponseBodyClusterInfoEcsOrdersEcsOrderInfo self = new DescribeExecutionPlanResponseBodyClusterInfoEcsOrdersEcsOrderInfo();
            return TeaModel.build(map, self);
        }

        public DescribeExecutionPlanResponseBodyClusterInfoEcsOrdersEcsOrderInfo setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoEcsOrdersEcsOrderInfo setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoEcsOrdersEcsOrderInfo setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoEcsOrdersEcsOrderInfo setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoEcsOrdersEcsOrderInfo setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoEcsOrdersEcsOrderInfo setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoEcsOrdersEcsOrderInfo setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

    }

    public static class DescribeExecutionPlanResponseBodyClusterInfoEcsOrders extends TeaModel {
        @NameInMap("EcsOrderInfo")
        public java.util.List<DescribeExecutionPlanResponseBodyClusterInfoEcsOrdersEcsOrderInfo> ecsOrderInfo;

        public static DescribeExecutionPlanResponseBodyClusterInfoEcsOrders build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutionPlanResponseBodyClusterInfoEcsOrders self = new DescribeExecutionPlanResponseBodyClusterInfoEcsOrders();
            return TeaModel.build(map, self);
        }

        public DescribeExecutionPlanResponseBodyClusterInfoEcsOrders setEcsOrderInfo(java.util.List<DescribeExecutionPlanResponseBodyClusterInfoEcsOrdersEcsOrderInfo> ecsOrderInfo) {
            this.ecsOrderInfo = ecsOrderInfo;
            return this;
        }
        public java.util.List<DescribeExecutionPlanResponseBodyClusterInfoEcsOrdersEcsOrderInfo> getEcsOrderInfo() {
            return this.ecsOrderInfo;
        }

    }

    public static class DescribeExecutionPlanResponseBodyClusterInfoConfigListConfig extends TeaModel {
        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("ConfigKey")
        public String configKey;

        @NameInMap("Encrypt")
        public String encrypt;

        public static DescribeExecutionPlanResponseBodyClusterInfoConfigListConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutionPlanResponseBodyClusterInfoConfigListConfig self = new DescribeExecutionPlanResponseBodyClusterInfoConfigListConfig();
            return TeaModel.build(map, self);
        }

        public DescribeExecutionPlanResponseBodyClusterInfoConfigListConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoConfigListConfig setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoConfigListConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoConfigListConfig setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoConfigListConfig setEncrypt(String encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public String getEncrypt() {
            return this.encrypt;
        }

    }

    public static class DescribeExecutionPlanResponseBodyClusterInfoConfigList extends TeaModel {
        @NameInMap("Config")
        public java.util.List<DescribeExecutionPlanResponseBodyClusterInfoConfigListConfig> config;

        public static DescribeExecutionPlanResponseBodyClusterInfoConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutionPlanResponseBodyClusterInfoConfigList self = new DescribeExecutionPlanResponseBodyClusterInfoConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeExecutionPlanResponseBodyClusterInfoConfigList setConfig(java.util.List<DescribeExecutionPlanResponseBodyClusterInfoConfigListConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<DescribeExecutionPlanResponseBodyClusterInfoConfigListConfig> getConfig() {
            return this.config;
        }

    }

    public static class DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionListBootstrapAction extends TeaModel {
        @NameInMap("Arg")
        public String arg;

        @NameInMap("Path")
        public String path;

        @NameInMap("Name")
        public String name;

        public static DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionListBootstrapAction build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionListBootstrapAction self = new DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionListBootstrapAction();
            return TeaModel.build(map, self);
        }

        public DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionListBootstrapAction setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionListBootstrapAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionListBootstrapAction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionList extends TeaModel {
        @NameInMap("BootstrapAction")
        public java.util.List<DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionListBootstrapAction> bootstrapAction;

        public static DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionList self = new DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionList();
            return TeaModel.build(map, self);
        }

        public DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionList setBootstrapAction(java.util.List<DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionListBootstrapAction> bootstrapAction) {
            this.bootstrapAction = bootstrapAction;
            return this;
        }
        public java.util.List<DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionListBootstrapAction> getBootstrapAction() {
            return this.bootstrapAction;
        }

    }

    public static class DescribeExecutionPlanResponseBodyClusterInfo extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("UseCustomHiveMetaDB")
        public Boolean useCustomHiveMetaDB;

        @NameInMap("LogEnable")
        public Boolean logEnable;

        @NameInMap("UserDefinedEmrEcsRole")
        public String userDefinedEmrEcsRole;

        @NameInMap("HighAvailabilityEnable")
        public Boolean highAvailabilityEnable;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("UseLocalMetaDb")
        public Boolean useLocalMetaDb;

        @NameInMap("SoftwareInfo")
        public DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfo softwareInfo;

        @NameInMap("IoOptimized")
        public Boolean ioOptimized;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("Configurations")
        public String configurations;

        @NameInMap("EcsOrders")
        public DescribeExecutionPlanResponseBodyClusterInfoEcsOrders ecsOrders;

        @NameInMap("EmrVer")
        public String emrVer;

        @NameInMap("LogPath")
        public String logPath;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("InitCustomHiveMetaDB")
        public Boolean initCustomHiveMetaDB;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ConfigList")
        public DescribeExecutionPlanResponseBodyClusterInfoConfigList configList;

        @NameInMap("BootstrapActionList")
        public DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionList bootstrapActionList;

        @NameInMap("InstanceGeneration")
        public String instanceGeneration;

        @NameInMap("Name")
        public String name;

        @NameInMap("EasEnable")
        public Boolean easEnable;

        public static DescribeExecutionPlanResponseBodyClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutionPlanResponseBodyClusterInfo self = new DescribeExecutionPlanResponseBodyClusterInfo();
            return TeaModel.build(map, self);
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setUseCustomHiveMetaDB(Boolean useCustomHiveMetaDB) {
            this.useCustomHiveMetaDB = useCustomHiveMetaDB;
            return this;
        }
        public Boolean getUseCustomHiveMetaDB() {
            return this.useCustomHiveMetaDB;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setLogEnable(Boolean logEnable) {
            this.logEnable = logEnable;
            return this;
        }
        public Boolean getLogEnable() {
            return this.logEnable;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setUserDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
            this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
            return this;
        }
        public String getUserDefinedEmrEcsRole() {
            return this.userDefinedEmrEcsRole;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setHighAvailabilityEnable(Boolean highAvailabilityEnable) {
            this.highAvailabilityEnable = highAvailabilityEnable;
            return this;
        }
        public Boolean getHighAvailabilityEnable() {
            return this.highAvailabilityEnable;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setUseLocalMetaDb(Boolean useLocalMetaDb) {
            this.useLocalMetaDb = useLocalMetaDb;
            return this;
        }
        public Boolean getUseLocalMetaDb() {
            return this.useLocalMetaDb;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setSoftwareInfo(DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfo softwareInfo) {
            this.softwareInfo = softwareInfo;
            return this;
        }
        public DescribeExecutionPlanResponseBodyClusterInfoSoftwareInfo getSoftwareInfo() {
            return this.softwareInfo;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setConfigurations(String configurations) {
            this.configurations = configurations;
            return this;
        }
        public String getConfigurations() {
            return this.configurations;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setEcsOrders(DescribeExecutionPlanResponseBodyClusterInfoEcsOrders ecsOrders) {
            this.ecsOrders = ecsOrders;
            return this;
        }
        public DescribeExecutionPlanResponseBodyClusterInfoEcsOrders getEcsOrders() {
            return this.ecsOrders;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setEmrVer(String emrVer) {
            this.emrVer = emrVer;
            return this;
        }
        public String getEmrVer() {
            return this.emrVer;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setInitCustomHiveMetaDB(Boolean initCustomHiveMetaDB) {
            this.initCustomHiveMetaDB = initCustomHiveMetaDB;
            return this;
        }
        public Boolean getInitCustomHiveMetaDB() {
            return this.initCustomHiveMetaDB;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setConfigList(DescribeExecutionPlanResponseBodyClusterInfoConfigList configList) {
            this.configList = configList;
            return this;
        }
        public DescribeExecutionPlanResponseBodyClusterInfoConfigList getConfigList() {
            return this.configList;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setBootstrapActionList(DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionList bootstrapActionList) {
            this.bootstrapActionList = bootstrapActionList;
            return this;
        }
        public DescribeExecutionPlanResponseBodyClusterInfoBootstrapActionList getBootstrapActionList() {
            return this.bootstrapActionList;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setInstanceGeneration(String instanceGeneration) {
            this.instanceGeneration = instanceGeneration;
            return this;
        }
        public String getInstanceGeneration() {
            return this.instanceGeneration;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExecutionPlanResponseBodyClusterInfo setEasEnable(Boolean easEnable) {
            this.easEnable = easEnable;
            return this;
        }
        public Boolean getEasEnable() {
            return this.easEnable;
        }

    }

}
