// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeployTensorRtModelInput extends TeaModel {
    @NameInMap("accountID")
    public String accountID;

    @NameInMap("concurrencyConfig")
    public DeployTensorRtModelInputConcurrencyConfig concurrencyConfig;

    @NameInMap("cpu")
    public Float cpu;

    @NameInMap("description")
    public String description;

    @NameInMap("diskSize")
    public Integer diskSize;

    @NameInMap("envName")
    public String envName;

    @NameInMap("environmentVariables")
    public java.util.Map<String, ?> environmentVariables;

    @NameInMap("gpuConfig")
    public DeployTensorRtModelInputGpuConfig gpuConfig;

    @NameInMap("httpTrigger")
    public DeployTensorRtModelInputHttpTrigger httpTrigger;

    @NameInMap("imageName")
    public String imageName;

    @NameInMap("instanceConcurrency")
    public Integer instanceConcurrency;

    @NameInMap("logConfig")
    public DeployTensorRtModelInputLogConfig logConfig;

    @NameInMap("memorySize")
    public Integer memorySize;

    @NameInMap("modelConfig")
    public DeployTensorRtModelInputModelConfig modelConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("nasConfig")
    public DeployTensorRtModelInputNasConfig nasConfig;

    @NameInMap("originalName")
    public String originalName;

    @NameInMap("projectName")
    public String projectName;

    @NameInMap("provisionConfig")
    public DeployTensorRtModelInputProvisionConfig provisionConfig;

    @NameInMap("region")
    public String region;

    @NameInMap("reportStatusURL")
    public String reportStatusURL;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("role")
    public String role;

    @NameInMap("timeout")
    public Integer timeout;

    @NameInMap("traceId")
    public String traceId;

    @NameInMap("vpcConfig")
    public DeployTensorRtModelInputVpcConfig vpcConfig;

    public static DeployTensorRtModelInput build(java.util.Map<String, ?> map) throws Exception {
        DeployTensorRtModelInput self = new DeployTensorRtModelInput();
        return TeaModel.build(map, self);
    }

    public DeployTensorRtModelInput setAccountID(String accountID) {
        this.accountID = accountID;
        return this;
    }
    public String getAccountID() {
        return this.accountID;
    }

    public DeployTensorRtModelInput setConcurrencyConfig(DeployTensorRtModelInputConcurrencyConfig concurrencyConfig) {
        this.concurrencyConfig = concurrencyConfig;
        return this;
    }
    public DeployTensorRtModelInputConcurrencyConfig getConcurrencyConfig() {
        return this.concurrencyConfig;
    }

    public DeployTensorRtModelInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public DeployTensorRtModelInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeployTensorRtModelInput setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public DeployTensorRtModelInput setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public DeployTensorRtModelInput setEnvironmentVariables(java.util.Map<String, ?> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, ?> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public DeployTensorRtModelInput setGpuConfig(DeployTensorRtModelInputGpuConfig gpuConfig) {
        this.gpuConfig = gpuConfig;
        return this;
    }
    public DeployTensorRtModelInputGpuConfig getGpuConfig() {
        return this.gpuConfig;
    }

    public DeployTensorRtModelInput setHttpTrigger(DeployTensorRtModelInputHttpTrigger httpTrigger) {
        this.httpTrigger = httpTrigger;
        return this;
    }
    public DeployTensorRtModelInputHttpTrigger getHttpTrigger() {
        return this.httpTrigger;
    }

    public DeployTensorRtModelInput setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public DeployTensorRtModelInput setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
        return this;
    }
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    public DeployTensorRtModelInput setLogConfig(DeployTensorRtModelInputLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public DeployTensorRtModelInputLogConfig getLogConfig() {
        return this.logConfig;
    }

    public DeployTensorRtModelInput setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public DeployTensorRtModelInput setModelConfig(DeployTensorRtModelInputModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public DeployTensorRtModelInputModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public DeployTensorRtModelInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeployTensorRtModelInput setNasConfig(DeployTensorRtModelInputNasConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public DeployTensorRtModelInputNasConfig getNasConfig() {
        return this.nasConfig;
    }

    public DeployTensorRtModelInput setOriginalName(String originalName) {
        this.originalName = originalName;
        return this;
    }
    public String getOriginalName() {
        return this.originalName;
    }

    public DeployTensorRtModelInput setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DeployTensorRtModelInput setProvisionConfig(DeployTensorRtModelInputProvisionConfig provisionConfig) {
        this.provisionConfig = provisionConfig;
        return this;
    }
    public DeployTensorRtModelInputProvisionConfig getProvisionConfig() {
        return this.provisionConfig;
    }

    public DeployTensorRtModelInput setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeployTensorRtModelInput setReportStatusURL(String reportStatusURL) {
        this.reportStatusURL = reportStatusURL;
        return this;
    }
    public String getReportStatusURL() {
        return this.reportStatusURL;
    }

    public DeployTensorRtModelInput setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DeployTensorRtModelInput setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DeployTensorRtModelInput setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DeployTensorRtModelInput setVpcConfig(DeployTensorRtModelInputVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public DeployTensorRtModelInputVpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static class DeployTensorRtModelInputConcurrencyConfig extends TeaModel {
        @NameInMap("reservedConcurrency")
        public Integer reservedConcurrency;

        public static DeployTensorRtModelInputConcurrencyConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployTensorRtModelInputConcurrencyConfig self = new DeployTensorRtModelInputConcurrencyConfig();
            return TeaModel.build(map, self);
        }

        public DeployTensorRtModelInputConcurrencyConfig setReservedConcurrency(Integer reservedConcurrency) {
            this.reservedConcurrency = reservedConcurrency;
            return this;
        }
        public Integer getReservedConcurrency() {
            return this.reservedConcurrency;
        }

    }

    public static class DeployTensorRtModelInputGpuConfig extends TeaModel {
        @NameInMap("gpuMemorySize")
        public Integer gpuMemorySize;

        @NameInMap("gpuType")
        public String gpuType;

        public static DeployTensorRtModelInputGpuConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployTensorRtModelInputGpuConfig self = new DeployTensorRtModelInputGpuConfig();
            return TeaModel.build(map, self);
        }

        public DeployTensorRtModelInputGpuConfig setGpuMemorySize(Integer gpuMemorySize) {
            this.gpuMemorySize = gpuMemorySize;
            return this;
        }
        public Integer getGpuMemorySize() {
            return this.gpuMemorySize;
        }

        public DeployTensorRtModelInputGpuConfig setGpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }
        public String getGpuType() {
            return this.gpuType;
        }

    }

    public static class DeployTensorRtModelInputHttpTriggerTriggerConfig extends TeaModel {
        @NameInMap("authType")
        public String authType;

        @NameInMap("dsableURLInternet")
        public Boolean dsableURLInternet;

        @NameInMap("methods")
        public java.util.List<String> methods;

        public static DeployTensorRtModelInputHttpTriggerTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployTensorRtModelInputHttpTriggerTriggerConfig self = new DeployTensorRtModelInputHttpTriggerTriggerConfig();
            return TeaModel.build(map, self);
        }

        public DeployTensorRtModelInputHttpTriggerTriggerConfig setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public DeployTensorRtModelInputHttpTriggerTriggerConfig setDsableURLInternet(Boolean dsableURLInternet) {
            this.dsableURLInternet = dsableURLInternet;
            return this;
        }
        public Boolean getDsableURLInternet() {
            return this.dsableURLInternet;
        }

        public DeployTensorRtModelInputHttpTriggerTriggerConfig setMethods(java.util.List<String> methods) {
            this.methods = methods;
            return this;
        }
        public java.util.List<String> getMethods() {
            return this.methods;
        }

    }

    public static class DeployTensorRtModelInputHttpTrigger extends TeaModel {
        @NameInMap("qualifier")
        public String qualifier;

        @NameInMap("triggerConfig")
        public DeployTensorRtModelInputHttpTriggerTriggerConfig triggerConfig;

        public static DeployTensorRtModelInputHttpTrigger build(java.util.Map<String, ?> map) throws Exception {
            DeployTensorRtModelInputHttpTrigger self = new DeployTensorRtModelInputHttpTrigger();
            return TeaModel.build(map, self);
        }

        public DeployTensorRtModelInputHttpTrigger setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public DeployTensorRtModelInputHttpTrigger setTriggerConfig(DeployTensorRtModelInputHttpTriggerTriggerConfig triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public DeployTensorRtModelInputHttpTriggerTriggerConfig getTriggerConfig() {
            return this.triggerConfig;
        }

    }

    public static class DeployTensorRtModelInputLogConfig extends TeaModel {
        @NameInMap("enableInstanceMetrics")
        public Boolean enableInstanceMetrics;

        @NameInMap("enableRequestMetrics")
        public Boolean enableRequestMetrics;

        @NameInMap("logBeginRule")
        public String logBeginRule;

        @NameInMap("logstore")
        public String logstore;

        @NameInMap("project")
        public String project;

        public static DeployTensorRtModelInputLogConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployTensorRtModelInputLogConfig self = new DeployTensorRtModelInputLogConfig();
            return TeaModel.build(map, self);
        }

        public DeployTensorRtModelInputLogConfig setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        public DeployTensorRtModelInputLogConfig setEnableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        public DeployTensorRtModelInputLogConfig setLogBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }
        public String getLogBeginRule() {
            return this.logBeginRule;
        }

        public DeployTensorRtModelInputLogConfig setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public DeployTensorRtModelInputLogConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class DeployTensorRtModelInputModelConfig extends TeaModel {
        @NameInMap("framework")
        public String framework;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("multiModelConfig")
        public java.util.List<ModelConfig> multiModelConfig;

        @NameInMap("prefix")
        public String prefix;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("srcModelScopeModelID")
        public String srcModelScopeModelID;

        @NameInMap("srcModelScopeModelRevision")
        public String srcModelScopeModelRevision;

        @NameInMap("srcModelScopeToken")
        public String srcModelScopeToken;

        @NameInMap("srcOssBucket")
        public String srcOssBucket;

        @NameInMap("srcOssPath")
        public String srcOssPath;

        @NameInMap("srcOssRegion")
        public String srcOssRegion;

        public static DeployTensorRtModelInputModelConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployTensorRtModelInputModelConfig self = new DeployTensorRtModelInputModelConfig();
            return TeaModel.build(map, self);
        }

        public DeployTensorRtModelInputModelConfig setFramework(String framework) {
            this.framework = framework;
            return this;
        }
        public String getFramework() {
            return this.framework;
        }

        public DeployTensorRtModelInputModelConfig setMultiModelConfig(java.util.List<ModelConfig> multiModelConfig) {
            this.multiModelConfig = multiModelConfig;
            return this;
        }
        public java.util.List<ModelConfig> getMultiModelConfig() {
            return this.multiModelConfig;
        }

        public DeployTensorRtModelInputModelConfig setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DeployTensorRtModelInputModelConfig setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DeployTensorRtModelInputModelConfig setSrcModelScopeModelID(String srcModelScopeModelID) {
            this.srcModelScopeModelID = srcModelScopeModelID;
            return this;
        }
        public String getSrcModelScopeModelID() {
            return this.srcModelScopeModelID;
        }

        public DeployTensorRtModelInputModelConfig setSrcModelScopeModelRevision(String srcModelScopeModelRevision) {
            this.srcModelScopeModelRevision = srcModelScopeModelRevision;
            return this;
        }
        public String getSrcModelScopeModelRevision() {
            return this.srcModelScopeModelRevision;
        }

        public DeployTensorRtModelInputModelConfig setSrcModelScopeToken(String srcModelScopeToken) {
            this.srcModelScopeToken = srcModelScopeToken;
            return this;
        }
        public String getSrcModelScopeToken() {
            return this.srcModelScopeToken;
        }

        public DeployTensorRtModelInputModelConfig setSrcOssBucket(String srcOssBucket) {
            this.srcOssBucket = srcOssBucket;
            return this;
        }
        public String getSrcOssBucket() {
            return this.srcOssBucket;
        }

        public DeployTensorRtModelInputModelConfig setSrcOssPath(String srcOssPath) {
            this.srcOssPath = srcOssPath;
            return this;
        }
        public String getSrcOssPath() {
            return this.srcOssPath;
        }

        public DeployTensorRtModelInputModelConfig setSrcOssRegion(String srcOssRegion) {
            this.srcOssRegion = srcOssRegion;
            return this;
        }
        public String getSrcOssRegion() {
            return this.srcOssRegion;
        }

    }

    public static class DeployTensorRtModelInputNasConfigMountPoints extends TeaModel {
        @NameInMap("enableTLS")
        public Boolean enableTLS;

        @NameInMap("mountDir")
        public String mountDir;

        @NameInMap("serverAddr")
        public String serverAddr;

        public static DeployTensorRtModelInputNasConfigMountPoints build(java.util.Map<String, ?> map) throws Exception {
            DeployTensorRtModelInputNasConfigMountPoints self = new DeployTensorRtModelInputNasConfigMountPoints();
            return TeaModel.build(map, self);
        }

        public DeployTensorRtModelInputNasConfigMountPoints setEnableTLS(Boolean enableTLS) {
            this.enableTLS = enableTLS;
            return this;
        }
        public Boolean getEnableTLS() {
            return this.enableTLS;
        }

        public DeployTensorRtModelInputNasConfigMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public DeployTensorRtModelInputNasConfigMountPoints setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

    }

    public static class DeployTensorRtModelInputNasConfig extends TeaModel {
        @NameInMap("groupId")
        public Integer groupId;

        @NameInMap("mountPoints")
        public java.util.List<DeployTensorRtModelInputNasConfigMountPoints> mountPoints;

        @NameInMap("userId")
        public Integer userId;

        public static DeployTensorRtModelInputNasConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployTensorRtModelInputNasConfig self = new DeployTensorRtModelInputNasConfig();
            return TeaModel.build(map, self);
        }

        public DeployTensorRtModelInputNasConfig setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public DeployTensorRtModelInputNasConfig setMountPoints(java.util.List<DeployTensorRtModelInputNasConfigMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<DeployTensorRtModelInputNasConfigMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public DeployTensorRtModelInputNasConfig setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class DeployTensorRtModelInputProvisionConfigScheduledActions extends TeaModel {
        @NameInMap("endTime")
        public String endTime;

        @NameInMap("name")
        public String name;

        @NameInMap("scheduleExpression")
        public String scheduleExpression;

        @NameInMap("startTime")
        public String startTime;

        @NameInMap("target")
        public Integer target;

        @NameInMap("timeZone")
        public String timeZone;

        public static DeployTensorRtModelInputProvisionConfigScheduledActions build(java.util.Map<String, ?> map) throws Exception {
            DeployTensorRtModelInputProvisionConfigScheduledActions self = new DeployTensorRtModelInputProvisionConfigScheduledActions();
            return TeaModel.build(map, self);
        }

        public DeployTensorRtModelInputProvisionConfigScheduledActions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DeployTensorRtModelInputProvisionConfigScheduledActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeployTensorRtModelInputProvisionConfigScheduledActions setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }
        public String getScheduleExpression() {
            return this.scheduleExpression;
        }

        public DeployTensorRtModelInputProvisionConfigScheduledActions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DeployTensorRtModelInputProvisionConfigScheduledActions setTarget(Integer target) {
            this.target = target;
            return this;
        }
        public Integer getTarget() {
            return this.target;
        }

        public DeployTensorRtModelInputProvisionConfigScheduledActions setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class DeployTensorRtModelInputProvisionConfig extends TeaModel {
        @NameInMap("alwaysAllocateGPU")
        public Boolean alwaysAllocateGPU;

        @NameInMap("scheduledActions")
        public java.util.List<DeployTensorRtModelInputProvisionConfigScheduledActions> scheduledActions;

        @NameInMap("target")
        public Integer target;

        public static DeployTensorRtModelInputProvisionConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployTensorRtModelInputProvisionConfig self = new DeployTensorRtModelInputProvisionConfig();
            return TeaModel.build(map, self);
        }

        public DeployTensorRtModelInputProvisionConfig setAlwaysAllocateGPU(Boolean alwaysAllocateGPU) {
            this.alwaysAllocateGPU = alwaysAllocateGPU;
            return this;
        }
        public Boolean getAlwaysAllocateGPU() {
            return this.alwaysAllocateGPU;
        }

        public DeployTensorRtModelInputProvisionConfig setScheduledActions(java.util.List<DeployTensorRtModelInputProvisionConfigScheduledActions> scheduledActions) {
            this.scheduledActions = scheduledActions;
            return this;
        }
        public java.util.List<DeployTensorRtModelInputProvisionConfigScheduledActions> getScheduledActions() {
            return this.scheduledActions;
        }

        public DeployTensorRtModelInputProvisionConfig setTarget(Integer target) {
            this.target = target;
            return this;
        }
        public Integer getTarget() {
            return this.target;
        }

    }

    public static class DeployTensorRtModelInputVpcConfig extends TeaModel {
        @NameInMap("securityGroupId")
        public String securityGroupId;

        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("vpcId")
        public String vpcId;

        public static DeployTensorRtModelInputVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployTensorRtModelInputVpcConfig self = new DeployTensorRtModelInputVpcConfig();
            return TeaModel.build(map, self);
        }

        public DeployTensorRtModelInputVpcConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DeployTensorRtModelInputVpcConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DeployTensorRtModelInputVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
