// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeployHuggingFaceModelInput extends TeaModel {
    @NameInMap("accountID")
    public String accountID;

    @NameInMap("concurrencyConfig")
    public DeployHuggingFaceModelInputConcurrencyConfig concurrencyConfig;

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
    public DeployHuggingFaceModelInputGpuConfig gpuConfig;

    @NameInMap("httpTrigger")
    public DeployHuggingFaceModelInputHttpTrigger httpTrigger;

    @NameInMap("imageName")
    public String imageName;

    @NameInMap("instanceConcurrency")
    public Integer instanceConcurrency;

    @NameInMap("logConfig")
    public DeployHuggingFaceModelInputLogConfig logConfig;

    @NameInMap("memorySize")
    public Integer memorySize;

    @NameInMap("modelConfig")
    public DeployHuggingFaceModelInputModelConfig modelConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("nasConfig")
    public DeployHuggingFaceModelInputNasConfig nasConfig;

    @NameInMap("originalName")
    public String originalName;

    @NameInMap("projectName")
    public String projectName;

    @NameInMap("provisionConfig")
    public DeployHuggingFaceModelInputProvisionConfig provisionConfig;

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
    public DeployHuggingFaceModelInputVpcConfig vpcConfig;

    public static DeployHuggingFaceModelInput build(java.util.Map<String, ?> map) throws Exception {
        DeployHuggingFaceModelInput self = new DeployHuggingFaceModelInput();
        return TeaModel.build(map, self);
    }

    public DeployHuggingFaceModelInput setAccountID(String accountID) {
        this.accountID = accountID;
        return this;
    }
    public String getAccountID() {
        return this.accountID;
    }

    public DeployHuggingFaceModelInput setConcurrencyConfig(DeployHuggingFaceModelInputConcurrencyConfig concurrencyConfig) {
        this.concurrencyConfig = concurrencyConfig;
        return this;
    }
    public DeployHuggingFaceModelInputConcurrencyConfig getConcurrencyConfig() {
        return this.concurrencyConfig;
    }

    public DeployHuggingFaceModelInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public DeployHuggingFaceModelInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeployHuggingFaceModelInput setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public DeployHuggingFaceModelInput setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public DeployHuggingFaceModelInput setEnvironmentVariables(java.util.Map<String, ?> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, ?> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public DeployHuggingFaceModelInput setGpuConfig(DeployHuggingFaceModelInputGpuConfig gpuConfig) {
        this.gpuConfig = gpuConfig;
        return this;
    }
    public DeployHuggingFaceModelInputGpuConfig getGpuConfig() {
        return this.gpuConfig;
    }

    public DeployHuggingFaceModelInput setHttpTrigger(DeployHuggingFaceModelInputHttpTrigger httpTrigger) {
        this.httpTrigger = httpTrigger;
        return this;
    }
    public DeployHuggingFaceModelInputHttpTrigger getHttpTrigger() {
        return this.httpTrigger;
    }

    public DeployHuggingFaceModelInput setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public DeployHuggingFaceModelInput setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
        return this;
    }
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    public DeployHuggingFaceModelInput setLogConfig(DeployHuggingFaceModelInputLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public DeployHuggingFaceModelInputLogConfig getLogConfig() {
        return this.logConfig;
    }

    public DeployHuggingFaceModelInput setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public DeployHuggingFaceModelInput setModelConfig(DeployHuggingFaceModelInputModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public DeployHuggingFaceModelInputModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public DeployHuggingFaceModelInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeployHuggingFaceModelInput setNasConfig(DeployHuggingFaceModelInputNasConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public DeployHuggingFaceModelInputNasConfig getNasConfig() {
        return this.nasConfig;
    }

    public DeployHuggingFaceModelInput setOriginalName(String originalName) {
        this.originalName = originalName;
        return this;
    }
    public String getOriginalName() {
        return this.originalName;
    }

    public DeployHuggingFaceModelInput setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DeployHuggingFaceModelInput setProvisionConfig(DeployHuggingFaceModelInputProvisionConfig provisionConfig) {
        this.provisionConfig = provisionConfig;
        return this;
    }
    public DeployHuggingFaceModelInputProvisionConfig getProvisionConfig() {
        return this.provisionConfig;
    }

    public DeployHuggingFaceModelInput setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeployHuggingFaceModelInput setReportStatusURL(String reportStatusURL) {
        this.reportStatusURL = reportStatusURL;
        return this;
    }
    public String getReportStatusURL() {
        return this.reportStatusURL;
    }

    public DeployHuggingFaceModelInput setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DeployHuggingFaceModelInput setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DeployHuggingFaceModelInput setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DeployHuggingFaceModelInput setVpcConfig(DeployHuggingFaceModelInputVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public DeployHuggingFaceModelInputVpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static class DeployHuggingFaceModelInputConcurrencyConfig extends TeaModel {
        @NameInMap("reservedConcurrency")
        public Integer reservedConcurrency;

        public static DeployHuggingFaceModelInputConcurrencyConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployHuggingFaceModelInputConcurrencyConfig self = new DeployHuggingFaceModelInputConcurrencyConfig();
            return TeaModel.build(map, self);
        }

        public DeployHuggingFaceModelInputConcurrencyConfig setReservedConcurrency(Integer reservedConcurrency) {
            this.reservedConcurrency = reservedConcurrency;
            return this;
        }
        public Integer getReservedConcurrency() {
            return this.reservedConcurrency;
        }

    }

    public static class DeployHuggingFaceModelInputGpuConfig extends TeaModel {
        @NameInMap("gpuMemorySize")
        public Integer gpuMemorySize;

        @NameInMap("gpuType")
        public String gpuType;

        public static DeployHuggingFaceModelInputGpuConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployHuggingFaceModelInputGpuConfig self = new DeployHuggingFaceModelInputGpuConfig();
            return TeaModel.build(map, self);
        }

        public DeployHuggingFaceModelInputGpuConfig setGpuMemorySize(Integer gpuMemorySize) {
            this.gpuMemorySize = gpuMemorySize;
            return this;
        }
        public Integer getGpuMemorySize() {
            return this.gpuMemorySize;
        }

        public DeployHuggingFaceModelInputGpuConfig setGpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }
        public String getGpuType() {
            return this.gpuType;
        }

    }

    public static class DeployHuggingFaceModelInputHttpTriggerTriggerConfig extends TeaModel {
        @NameInMap("authType")
        public String authType;

        @NameInMap("disableURLInternet")
        public Boolean disableURLInternet;

        @NameInMap("dsableURLInternet")
        public Boolean dsableURLInternet;

        @NameInMap("methods")
        public java.util.List<String> methods;

        public static DeployHuggingFaceModelInputHttpTriggerTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployHuggingFaceModelInputHttpTriggerTriggerConfig self = new DeployHuggingFaceModelInputHttpTriggerTriggerConfig();
            return TeaModel.build(map, self);
        }

        public DeployHuggingFaceModelInputHttpTriggerTriggerConfig setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public DeployHuggingFaceModelInputHttpTriggerTriggerConfig setDisableURLInternet(Boolean disableURLInternet) {
            this.disableURLInternet = disableURLInternet;
            return this;
        }
        public Boolean getDisableURLInternet() {
            return this.disableURLInternet;
        }

        public DeployHuggingFaceModelInputHttpTriggerTriggerConfig setDsableURLInternet(Boolean dsableURLInternet) {
            this.dsableURLInternet = dsableURLInternet;
            return this;
        }
        public Boolean getDsableURLInternet() {
            return this.dsableURLInternet;
        }

        public DeployHuggingFaceModelInputHttpTriggerTriggerConfig setMethods(java.util.List<String> methods) {
            this.methods = methods;
            return this;
        }
        public java.util.List<String> getMethods() {
            return this.methods;
        }

    }

    public static class DeployHuggingFaceModelInputHttpTrigger extends TeaModel {
        @NameInMap("qualifier")
        public String qualifier;

        @NameInMap("triggerConfig")
        public DeployHuggingFaceModelInputHttpTriggerTriggerConfig triggerConfig;

        public static DeployHuggingFaceModelInputHttpTrigger build(java.util.Map<String, ?> map) throws Exception {
            DeployHuggingFaceModelInputHttpTrigger self = new DeployHuggingFaceModelInputHttpTrigger();
            return TeaModel.build(map, self);
        }

        public DeployHuggingFaceModelInputHttpTrigger setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public DeployHuggingFaceModelInputHttpTrigger setTriggerConfig(DeployHuggingFaceModelInputHttpTriggerTriggerConfig triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public DeployHuggingFaceModelInputHttpTriggerTriggerConfig getTriggerConfig() {
            return this.triggerConfig;
        }

    }

    public static class DeployHuggingFaceModelInputLogConfig extends TeaModel {
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

        public static DeployHuggingFaceModelInputLogConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployHuggingFaceModelInputLogConfig self = new DeployHuggingFaceModelInputLogConfig();
            return TeaModel.build(map, self);
        }

        public DeployHuggingFaceModelInputLogConfig setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        public DeployHuggingFaceModelInputLogConfig setEnableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        public DeployHuggingFaceModelInputLogConfig setLogBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }
        public String getLogBeginRule() {
            return this.logBeginRule;
        }

        public DeployHuggingFaceModelInputLogConfig setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public DeployHuggingFaceModelInputLogConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class DeployHuggingFaceModelInputModelConfigFmkHuggingFaceConfig extends TeaModel {
        @NameInMap("framework")
        public String framework;

        @NameInMap("task")
        public String task;

        public static DeployHuggingFaceModelInputModelConfigFmkHuggingFaceConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployHuggingFaceModelInputModelConfigFmkHuggingFaceConfig self = new DeployHuggingFaceModelInputModelConfigFmkHuggingFaceConfig();
            return TeaModel.build(map, self);
        }

        public DeployHuggingFaceModelInputModelConfigFmkHuggingFaceConfig setFramework(String framework) {
            this.framework = framework;
            return this;
        }
        public String getFramework() {
            return this.framework;
        }

        public DeployHuggingFaceModelInputModelConfigFmkHuggingFaceConfig setTask(String task) {
            this.task = task;
            return this;
        }
        public String getTask() {
            return this.task;
        }

    }

    public static class DeployHuggingFaceModelInputModelConfig extends TeaModel {
        @NameInMap("fmkHuggingFaceConfig")
        public DeployHuggingFaceModelInputModelConfigFmkHuggingFaceConfig fmkHuggingFaceConfig;

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

        @NameInMap("syncStrategy")
        public String syncStrategy;

        public static DeployHuggingFaceModelInputModelConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployHuggingFaceModelInputModelConfig self = new DeployHuggingFaceModelInputModelConfig();
            return TeaModel.build(map, self);
        }

        public DeployHuggingFaceModelInputModelConfig setFmkHuggingFaceConfig(DeployHuggingFaceModelInputModelConfigFmkHuggingFaceConfig fmkHuggingFaceConfig) {
            this.fmkHuggingFaceConfig = fmkHuggingFaceConfig;
            return this;
        }
        public DeployHuggingFaceModelInputModelConfigFmkHuggingFaceConfig getFmkHuggingFaceConfig() {
            return this.fmkHuggingFaceConfig;
        }

        public DeployHuggingFaceModelInputModelConfig setFramework(String framework) {
            this.framework = framework;
            return this;
        }
        public String getFramework() {
            return this.framework;
        }

        public DeployHuggingFaceModelInputModelConfig setMultiModelConfig(java.util.List<ModelConfig> multiModelConfig) {
            this.multiModelConfig = multiModelConfig;
            return this;
        }
        public java.util.List<ModelConfig> getMultiModelConfig() {
            return this.multiModelConfig;
        }

        public DeployHuggingFaceModelInputModelConfig setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DeployHuggingFaceModelInputModelConfig setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DeployHuggingFaceModelInputModelConfig setSrcModelScopeModelID(String srcModelScopeModelID) {
            this.srcModelScopeModelID = srcModelScopeModelID;
            return this;
        }
        public String getSrcModelScopeModelID() {
            return this.srcModelScopeModelID;
        }

        public DeployHuggingFaceModelInputModelConfig setSrcModelScopeModelRevision(String srcModelScopeModelRevision) {
            this.srcModelScopeModelRevision = srcModelScopeModelRevision;
            return this;
        }
        public String getSrcModelScopeModelRevision() {
            return this.srcModelScopeModelRevision;
        }

        public DeployHuggingFaceModelInputModelConfig setSrcModelScopeToken(String srcModelScopeToken) {
            this.srcModelScopeToken = srcModelScopeToken;
            return this;
        }
        public String getSrcModelScopeToken() {
            return this.srcModelScopeToken;
        }

        public DeployHuggingFaceModelInputModelConfig setSrcOssBucket(String srcOssBucket) {
            this.srcOssBucket = srcOssBucket;
            return this;
        }
        public String getSrcOssBucket() {
            return this.srcOssBucket;
        }

        public DeployHuggingFaceModelInputModelConfig setSrcOssPath(String srcOssPath) {
            this.srcOssPath = srcOssPath;
            return this;
        }
        public String getSrcOssPath() {
            return this.srcOssPath;
        }

        public DeployHuggingFaceModelInputModelConfig setSrcOssRegion(String srcOssRegion) {
            this.srcOssRegion = srcOssRegion;
            return this;
        }
        public String getSrcOssRegion() {
            return this.srcOssRegion;
        }

        public DeployHuggingFaceModelInputModelConfig setSyncStrategy(String syncStrategy) {
            this.syncStrategy = syncStrategy;
            return this;
        }
        public String getSyncStrategy() {
            return this.syncStrategy;
        }

    }

    public static class DeployHuggingFaceModelInputNasConfig extends TeaModel {
        @NameInMap("groupId")
        public Integer groupId;

        @NameInMap("mountPoints")
        public java.util.List<String> mountPoints;

        @NameInMap("userId")
        public Integer userId;

        public static DeployHuggingFaceModelInputNasConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployHuggingFaceModelInputNasConfig self = new DeployHuggingFaceModelInputNasConfig();
            return TeaModel.build(map, self);
        }

        public DeployHuggingFaceModelInputNasConfig setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public DeployHuggingFaceModelInputNasConfig setMountPoints(java.util.List<String> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<String> getMountPoints() {
            return this.mountPoints;
        }

        public DeployHuggingFaceModelInputNasConfig setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class DeployHuggingFaceModelInputProvisionConfigScheduledActions extends TeaModel {
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

        public static DeployHuggingFaceModelInputProvisionConfigScheduledActions build(java.util.Map<String, ?> map) throws Exception {
            DeployHuggingFaceModelInputProvisionConfigScheduledActions self = new DeployHuggingFaceModelInputProvisionConfigScheduledActions();
            return TeaModel.build(map, self);
        }

        public DeployHuggingFaceModelInputProvisionConfigScheduledActions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DeployHuggingFaceModelInputProvisionConfigScheduledActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeployHuggingFaceModelInputProvisionConfigScheduledActions setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }
        public String getScheduleExpression() {
            return this.scheduleExpression;
        }

        public DeployHuggingFaceModelInputProvisionConfigScheduledActions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DeployHuggingFaceModelInputProvisionConfigScheduledActions setTarget(Integer target) {
            this.target = target;
            return this;
        }
        public Integer getTarget() {
            return this.target;
        }

        public DeployHuggingFaceModelInputProvisionConfigScheduledActions setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class DeployHuggingFaceModelInputProvisionConfig extends TeaModel {
        @NameInMap("alwaysAllocateGPU")
        public Boolean alwaysAllocateGPU;

        @NameInMap("scheduledActions")
        public java.util.List<DeployHuggingFaceModelInputProvisionConfigScheduledActions> scheduledActions;

        @NameInMap("target")
        public Integer target;

        public static DeployHuggingFaceModelInputProvisionConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployHuggingFaceModelInputProvisionConfig self = new DeployHuggingFaceModelInputProvisionConfig();
            return TeaModel.build(map, self);
        }

        public DeployHuggingFaceModelInputProvisionConfig setAlwaysAllocateGPU(Boolean alwaysAllocateGPU) {
            this.alwaysAllocateGPU = alwaysAllocateGPU;
            return this;
        }
        public Boolean getAlwaysAllocateGPU() {
            return this.alwaysAllocateGPU;
        }

        public DeployHuggingFaceModelInputProvisionConfig setScheduledActions(java.util.List<DeployHuggingFaceModelInputProvisionConfigScheduledActions> scheduledActions) {
            this.scheduledActions = scheduledActions;
            return this;
        }
        public java.util.List<DeployHuggingFaceModelInputProvisionConfigScheduledActions> getScheduledActions() {
            return this.scheduledActions;
        }

        public DeployHuggingFaceModelInputProvisionConfig setTarget(Integer target) {
            this.target = target;
            return this;
        }
        public Integer getTarget() {
            return this.target;
        }

    }

    public static class DeployHuggingFaceModelInputVpcConfig extends TeaModel {
        @NameInMap("securityGroupId")
        public String securityGroupId;

        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("vpcId")
        public String vpcId;

        public static DeployHuggingFaceModelInputVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployHuggingFaceModelInputVpcConfig self = new DeployHuggingFaceModelInputVpcConfig();
            return TeaModel.build(map, self);
        }

        public DeployHuggingFaceModelInputVpcConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DeployHuggingFaceModelInputVpcConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DeployHuggingFaceModelInputVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
