// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeployVllmModelInput extends TeaModel {
    @NameInMap("accountID")
    public String accountID;

    @NameInMap("concurrencyConfig")
    public DeployVllmModelInputConcurrencyConfig concurrencyConfig;

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
    public DeployVllmModelInputGpuConfig gpuConfig;

    @NameInMap("httpTrigger")
    public DeployVllmModelInputHttpTrigger httpTrigger;

    @NameInMap("imageName")
    public String imageName;

    @NameInMap("instanceConcurrency")
    public Integer instanceConcurrency;

    @NameInMap("logConfig")
    public DeployVllmModelInputLogConfig logConfig;

    @NameInMap("memorySize")
    public Integer memorySize;

    @NameInMap("modelConfig")
    public DeployVllmModelInputModelConfig modelConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("nasConfig")
    public DeployVllmModelInputNasConfig nasConfig;

    @NameInMap("originalName")
    public String originalName;

    @NameInMap("projectName")
    public String projectName;

    @NameInMap("provisionConfig")
    public DeployVllmModelInputProvisionConfig provisionConfig;

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
    public DeployVllmModelInputVpcConfig vpcConfig;

    public static DeployVllmModelInput build(java.util.Map<String, ?> map) throws Exception {
        DeployVllmModelInput self = new DeployVllmModelInput();
        return TeaModel.build(map, self);
    }

    public DeployVllmModelInput setAccountID(String accountID) {
        this.accountID = accountID;
        return this;
    }
    public String getAccountID() {
        return this.accountID;
    }

    public DeployVllmModelInput setConcurrencyConfig(DeployVllmModelInputConcurrencyConfig concurrencyConfig) {
        this.concurrencyConfig = concurrencyConfig;
        return this;
    }
    public DeployVllmModelInputConcurrencyConfig getConcurrencyConfig() {
        return this.concurrencyConfig;
    }

    public DeployVllmModelInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public DeployVllmModelInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeployVllmModelInput setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public DeployVllmModelInput setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public DeployVllmModelInput setEnvironmentVariables(java.util.Map<String, ?> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, ?> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public DeployVllmModelInput setGpuConfig(DeployVllmModelInputGpuConfig gpuConfig) {
        this.gpuConfig = gpuConfig;
        return this;
    }
    public DeployVllmModelInputGpuConfig getGpuConfig() {
        return this.gpuConfig;
    }

    public DeployVllmModelInput setHttpTrigger(DeployVllmModelInputHttpTrigger httpTrigger) {
        this.httpTrigger = httpTrigger;
        return this;
    }
    public DeployVllmModelInputHttpTrigger getHttpTrigger() {
        return this.httpTrigger;
    }

    public DeployVllmModelInput setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public DeployVllmModelInput setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
        return this;
    }
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    public DeployVllmModelInput setLogConfig(DeployVllmModelInputLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public DeployVllmModelInputLogConfig getLogConfig() {
        return this.logConfig;
    }

    public DeployVllmModelInput setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public DeployVllmModelInput setModelConfig(DeployVllmModelInputModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public DeployVllmModelInputModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public DeployVllmModelInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeployVllmModelInput setNasConfig(DeployVllmModelInputNasConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public DeployVllmModelInputNasConfig getNasConfig() {
        return this.nasConfig;
    }

    public DeployVllmModelInput setOriginalName(String originalName) {
        this.originalName = originalName;
        return this;
    }
    public String getOriginalName() {
        return this.originalName;
    }

    public DeployVllmModelInput setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DeployVllmModelInput setProvisionConfig(DeployVllmModelInputProvisionConfig provisionConfig) {
        this.provisionConfig = provisionConfig;
        return this;
    }
    public DeployVllmModelInputProvisionConfig getProvisionConfig() {
        return this.provisionConfig;
    }

    public DeployVllmModelInput setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeployVllmModelInput setReportStatusURL(String reportStatusURL) {
        this.reportStatusURL = reportStatusURL;
        return this;
    }
    public String getReportStatusURL() {
        return this.reportStatusURL;
    }

    public DeployVllmModelInput setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DeployVllmModelInput setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DeployVllmModelInput setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DeployVllmModelInput setVpcConfig(DeployVllmModelInputVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public DeployVllmModelInputVpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static class DeployVllmModelInputConcurrencyConfig extends TeaModel {
        @NameInMap("reservedConcurrency")
        public Integer reservedConcurrency;

        public static DeployVllmModelInputConcurrencyConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployVllmModelInputConcurrencyConfig self = new DeployVllmModelInputConcurrencyConfig();
            return TeaModel.build(map, self);
        }

        public DeployVllmModelInputConcurrencyConfig setReservedConcurrency(Integer reservedConcurrency) {
            this.reservedConcurrency = reservedConcurrency;
            return this;
        }
        public Integer getReservedConcurrency() {
            return this.reservedConcurrency;
        }

    }

    public static class DeployVllmModelInputGpuConfig extends TeaModel {
        @NameInMap("gpuMemorySize")
        public Integer gpuMemorySize;

        @NameInMap("gpuType")
        public String gpuType;

        public static DeployVllmModelInputGpuConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployVllmModelInputGpuConfig self = new DeployVllmModelInputGpuConfig();
            return TeaModel.build(map, self);
        }

        public DeployVllmModelInputGpuConfig setGpuMemorySize(Integer gpuMemorySize) {
            this.gpuMemorySize = gpuMemorySize;
            return this;
        }
        public Integer getGpuMemorySize() {
            return this.gpuMemorySize;
        }

        public DeployVllmModelInputGpuConfig setGpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }
        public String getGpuType() {
            return this.gpuType;
        }

    }

    public static class DeployVllmModelInputHttpTriggerTriggerConfig extends TeaModel {
        @NameInMap("authType")
        public String authType;

        @NameInMap("disableURLInternet")
        public Boolean disableURLInternet;

        @NameInMap("dsableURLInternet")
        public Boolean dsableURLInternet;

        @NameInMap("methods")
        public java.util.List<String> methods;

        public static DeployVllmModelInputHttpTriggerTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployVllmModelInputHttpTriggerTriggerConfig self = new DeployVllmModelInputHttpTriggerTriggerConfig();
            return TeaModel.build(map, self);
        }

        public DeployVllmModelInputHttpTriggerTriggerConfig setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public DeployVllmModelInputHttpTriggerTriggerConfig setDisableURLInternet(Boolean disableURLInternet) {
            this.disableURLInternet = disableURLInternet;
            return this;
        }
        public Boolean getDisableURLInternet() {
            return this.disableURLInternet;
        }

        public DeployVllmModelInputHttpTriggerTriggerConfig setDsableURLInternet(Boolean dsableURLInternet) {
            this.dsableURLInternet = dsableURLInternet;
            return this;
        }
        public Boolean getDsableURLInternet() {
            return this.dsableURLInternet;
        }

        public DeployVllmModelInputHttpTriggerTriggerConfig setMethods(java.util.List<String> methods) {
            this.methods = methods;
            return this;
        }
        public java.util.List<String> getMethods() {
            return this.methods;
        }

    }

    public static class DeployVllmModelInputHttpTrigger extends TeaModel {
        @NameInMap("qualifier")
        public String qualifier;

        @NameInMap("triggerConfig")
        public DeployVllmModelInputHttpTriggerTriggerConfig triggerConfig;

        public static DeployVllmModelInputHttpTrigger build(java.util.Map<String, ?> map) throws Exception {
            DeployVllmModelInputHttpTrigger self = new DeployVllmModelInputHttpTrigger();
            return TeaModel.build(map, self);
        }

        public DeployVllmModelInputHttpTrigger setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public DeployVllmModelInputHttpTrigger setTriggerConfig(DeployVllmModelInputHttpTriggerTriggerConfig triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public DeployVllmModelInputHttpTriggerTriggerConfig getTriggerConfig() {
            return this.triggerConfig;
        }

    }

    public static class DeployVllmModelInputLogConfig extends TeaModel {
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

        public static DeployVllmModelInputLogConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployVllmModelInputLogConfig self = new DeployVllmModelInputLogConfig();
            return TeaModel.build(map, self);
        }

        public DeployVllmModelInputLogConfig setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        public DeployVllmModelInputLogConfig setEnableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        public DeployVllmModelInputLogConfig setLogBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }
        public String getLogBeginRule() {
            return this.logBeginRule;
        }

        public DeployVllmModelInputLogConfig setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public DeployVllmModelInputLogConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class DeployVllmModelInputModelConfigFmkVllmConfig extends TeaModel {
        @NameInMap("apiKey")
        public String apiKey;

        @NameInMap("blockSize")
        public Integer blockSize;

        @NameInMap("chatTemplate")
        public String chatTemplate;

        @NameInMap("dtype")
        public String dtype;

        @NameInMap("fullTextPostfix")
        public String fullTextPostfix;

        @NameInMap("gpuMemoryUtilization")
        public Float gpuMemoryUtilization;

        @NameInMap("loadFormat")
        public String loadFormat;

        @NameInMap("maxModelLen")
        public Integer maxModelLen;

        @NameInMap("maxParallelLoadingWorkers")
        public Integer maxParallelLoadingWorkers;

        @NameInMap("quantization")
        public String quantization;

        @NameInMap("servedModelName")
        public String servedModelName;

        @NameInMap("swapSpace")
        public Integer swapSpace;

        public static DeployVllmModelInputModelConfigFmkVllmConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployVllmModelInputModelConfigFmkVllmConfig self = new DeployVllmModelInputModelConfigFmkVllmConfig();
            return TeaModel.build(map, self);
        }

        public DeployVllmModelInputModelConfigFmkVllmConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public DeployVllmModelInputModelConfigFmkVllmConfig setBlockSize(Integer blockSize) {
            this.blockSize = blockSize;
            return this;
        }
        public Integer getBlockSize() {
            return this.blockSize;
        }

        public DeployVllmModelInputModelConfigFmkVllmConfig setChatTemplate(String chatTemplate) {
            this.chatTemplate = chatTemplate;
            return this;
        }
        public String getChatTemplate() {
            return this.chatTemplate;
        }

        public DeployVllmModelInputModelConfigFmkVllmConfig setDtype(String dtype) {
            this.dtype = dtype;
            return this;
        }
        public String getDtype() {
            return this.dtype;
        }

        public DeployVllmModelInputModelConfigFmkVllmConfig setFullTextPostfix(String fullTextPostfix) {
            this.fullTextPostfix = fullTextPostfix;
            return this;
        }
        public String getFullTextPostfix() {
            return this.fullTextPostfix;
        }

        public DeployVllmModelInputModelConfigFmkVllmConfig setGpuMemoryUtilization(Float gpuMemoryUtilization) {
            this.gpuMemoryUtilization = gpuMemoryUtilization;
            return this;
        }
        public Float getGpuMemoryUtilization() {
            return this.gpuMemoryUtilization;
        }

        public DeployVllmModelInputModelConfigFmkVllmConfig setLoadFormat(String loadFormat) {
            this.loadFormat = loadFormat;
            return this;
        }
        public String getLoadFormat() {
            return this.loadFormat;
        }

        public DeployVllmModelInputModelConfigFmkVllmConfig setMaxModelLen(Integer maxModelLen) {
            this.maxModelLen = maxModelLen;
            return this;
        }
        public Integer getMaxModelLen() {
            return this.maxModelLen;
        }

        public DeployVllmModelInputModelConfigFmkVllmConfig setMaxParallelLoadingWorkers(Integer maxParallelLoadingWorkers) {
            this.maxParallelLoadingWorkers = maxParallelLoadingWorkers;
            return this;
        }
        public Integer getMaxParallelLoadingWorkers() {
            return this.maxParallelLoadingWorkers;
        }

        public DeployVllmModelInputModelConfigFmkVllmConfig setQuantization(String quantization) {
            this.quantization = quantization;
            return this;
        }
        public String getQuantization() {
            return this.quantization;
        }

        public DeployVllmModelInputModelConfigFmkVllmConfig setServedModelName(String servedModelName) {
            this.servedModelName = servedModelName;
            return this;
        }
        public String getServedModelName() {
            return this.servedModelName;
        }

        public DeployVllmModelInputModelConfigFmkVllmConfig setSwapSpace(Integer swapSpace) {
            this.swapSpace = swapSpace;
            return this;
        }
        public Integer getSwapSpace() {
            return this.swapSpace;
        }

    }

    public static class DeployVllmModelInputModelConfig extends TeaModel {
        @NameInMap("fmkVllmConfig")
        public DeployVllmModelInputModelConfigFmkVllmConfig fmkVllmConfig;

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

        public static DeployVllmModelInputModelConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployVllmModelInputModelConfig self = new DeployVllmModelInputModelConfig();
            return TeaModel.build(map, self);
        }

        public DeployVllmModelInputModelConfig setFmkVllmConfig(DeployVllmModelInputModelConfigFmkVllmConfig fmkVllmConfig) {
            this.fmkVllmConfig = fmkVllmConfig;
            return this;
        }
        public DeployVllmModelInputModelConfigFmkVllmConfig getFmkVllmConfig() {
            return this.fmkVllmConfig;
        }

        public DeployVllmModelInputModelConfig setFramework(String framework) {
            this.framework = framework;
            return this;
        }
        public String getFramework() {
            return this.framework;
        }

        public DeployVllmModelInputModelConfig setMultiModelConfig(java.util.List<ModelConfig> multiModelConfig) {
            this.multiModelConfig = multiModelConfig;
            return this;
        }
        public java.util.List<ModelConfig> getMultiModelConfig() {
            return this.multiModelConfig;
        }

        public DeployVllmModelInputModelConfig setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DeployVllmModelInputModelConfig setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DeployVllmModelInputModelConfig setSrcModelScopeModelID(String srcModelScopeModelID) {
            this.srcModelScopeModelID = srcModelScopeModelID;
            return this;
        }
        public String getSrcModelScopeModelID() {
            return this.srcModelScopeModelID;
        }

        public DeployVllmModelInputModelConfig setSrcModelScopeModelRevision(String srcModelScopeModelRevision) {
            this.srcModelScopeModelRevision = srcModelScopeModelRevision;
            return this;
        }
        public String getSrcModelScopeModelRevision() {
            return this.srcModelScopeModelRevision;
        }

        public DeployVllmModelInputModelConfig setSrcModelScopeToken(String srcModelScopeToken) {
            this.srcModelScopeToken = srcModelScopeToken;
            return this;
        }
        public String getSrcModelScopeToken() {
            return this.srcModelScopeToken;
        }

        public DeployVllmModelInputModelConfig setSrcOssBucket(String srcOssBucket) {
            this.srcOssBucket = srcOssBucket;
            return this;
        }
        public String getSrcOssBucket() {
            return this.srcOssBucket;
        }

        public DeployVllmModelInputModelConfig setSrcOssPath(String srcOssPath) {
            this.srcOssPath = srcOssPath;
            return this;
        }
        public String getSrcOssPath() {
            return this.srcOssPath;
        }

        public DeployVllmModelInputModelConfig setSrcOssRegion(String srcOssRegion) {
            this.srcOssRegion = srcOssRegion;
            return this;
        }
        public String getSrcOssRegion() {
            return this.srcOssRegion;
        }

        public DeployVllmModelInputModelConfig setSyncStrategy(String syncStrategy) {
            this.syncStrategy = syncStrategy;
            return this;
        }
        public String getSyncStrategy() {
            return this.syncStrategy;
        }

    }

    public static class DeployVllmModelInputNasConfigMountPoints extends TeaModel {
        @NameInMap("enableTLS")
        public Boolean enableTLS;

        @NameInMap("mountDir")
        public String mountDir;

        @NameInMap("serverAddr")
        public String serverAddr;

        public static DeployVllmModelInputNasConfigMountPoints build(java.util.Map<String, ?> map) throws Exception {
            DeployVllmModelInputNasConfigMountPoints self = new DeployVllmModelInputNasConfigMountPoints();
            return TeaModel.build(map, self);
        }

        public DeployVllmModelInputNasConfigMountPoints setEnableTLS(Boolean enableTLS) {
            this.enableTLS = enableTLS;
            return this;
        }
        public Boolean getEnableTLS() {
            return this.enableTLS;
        }

        public DeployVllmModelInputNasConfigMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public DeployVllmModelInputNasConfigMountPoints setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

    }

    public static class DeployVllmModelInputNasConfig extends TeaModel {
        @NameInMap("groupId")
        public Integer groupId;

        @NameInMap("mountPoints")
        public java.util.List<DeployVllmModelInputNasConfigMountPoints> mountPoints;

        @NameInMap("userId")
        public Integer userId;

        public static DeployVllmModelInputNasConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployVllmModelInputNasConfig self = new DeployVllmModelInputNasConfig();
            return TeaModel.build(map, self);
        }

        public DeployVllmModelInputNasConfig setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public DeployVllmModelInputNasConfig setMountPoints(java.util.List<DeployVllmModelInputNasConfigMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<DeployVllmModelInputNasConfigMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public DeployVllmModelInputNasConfig setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class DeployVllmModelInputProvisionConfigScheduledActions extends TeaModel {
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

        public static DeployVllmModelInputProvisionConfigScheduledActions build(java.util.Map<String, ?> map) throws Exception {
            DeployVllmModelInputProvisionConfigScheduledActions self = new DeployVllmModelInputProvisionConfigScheduledActions();
            return TeaModel.build(map, self);
        }

        public DeployVllmModelInputProvisionConfigScheduledActions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DeployVllmModelInputProvisionConfigScheduledActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeployVllmModelInputProvisionConfigScheduledActions setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }
        public String getScheduleExpression() {
            return this.scheduleExpression;
        }

        public DeployVllmModelInputProvisionConfigScheduledActions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DeployVllmModelInputProvisionConfigScheduledActions setTarget(Integer target) {
            this.target = target;
            return this;
        }
        public Integer getTarget() {
            return this.target;
        }

        public DeployVllmModelInputProvisionConfigScheduledActions setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class DeployVllmModelInputProvisionConfig extends TeaModel {
        @NameInMap("alwaysAllocateGPU")
        public Boolean alwaysAllocateGPU;

        @NameInMap("scheduledActions")
        public java.util.List<DeployVllmModelInputProvisionConfigScheduledActions> scheduledActions;

        @NameInMap("target")
        public Integer target;

        public static DeployVllmModelInputProvisionConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployVllmModelInputProvisionConfig self = new DeployVllmModelInputProvisionConfig();
            return TeaModel.build(map, self);
        }

        public DeployVllmModelInputProvisionConfig setAlwaysAllocateGPU(Boolean alwaysAllocateGPU) {
            this.alwaysAllocateGPU = alwaysAllocateGPU;
            return this;
        }
        public Boolean getAlwaysAllocateGPU() {
            return this.alwaysAllocateGPU;
        }

        public DeployVllmModelInputProvisionConfig setScheduledActions(java.util.List<DeployVllmModelInputProvisionConfigScheduledActions> scheduledActions) {
            this.scheduledActions = scheduledActions;
            return this;
        }
        public java.util.List<DeployVllmModelInputProvisionConfigScheduledActions> getScheduledActions() {
            return this.scheduledActions;
        }

        public DeployVllmModelInputProvisionConfig setTarget(Integer target) {
            this.target = target;
            return this;
        }
        public Integer getTarget() {
            return this.target;
        }

    }

    public static class DeployVllmModelInputVpcConfig extends TeaModel {
        @NameInMap("securityGroupId")
        public String securityGroupId;

        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("vpcId")
        public String vpcId;

        public static DeployVllmModelInputVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployVllmModelInputVpcConfig self = new DeployVllmModelInputVpcConfig();
            return TeaModel.build(map, self);
        }

        public DeployVllmModelInputVpcConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DeployVllmModelInputVpcConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DeployVllmModelInputVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
