// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeploySGLangModelInput extends TeaModel {
    @NameInMap("accountID")
    public String accountID;

    @NameInMap("concurrencyConfig")
    public DeploySGLangModelInputConcurrencyConfig concurrencyConfig;

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
    public DeploySGLangModelInputGpuConfig gpuConfig;

    @NameInMap("httpTrigger")
    public DeploySGLangModelInputHttpTrigger httpTrigger;

    @NameInMap("imageName")
    public String imageName;

    @NameInMap("instanceConcurrency")
    public Integer instanceConcurrency;

    @NameInMap("logConfig")
    public DeploySGLangModelInputLogConfig logConfig;

    @NameInMap("memorySize")
    public Integer memorySize;

    @NameInMap("modelConfig")
    public DeploySGLangModelInputModelConfig modelConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("nasConfig")
    public DeploySGLangModelInputNasConfig nasConfig;

    @NameInMap("originalName")
    public String originalName;

    @NameInMap("projectName")
    public String projectName;

    @NameInMap("provisionConfig")
    public DeploySGLangModelInputProvisionConfig provisionConfig;

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
    public DeploySGLangModelInputVpcConfig vpcConfig;

    public static DeploySGLangModelInput build(java.util.Map<String, ?> map) throws Exception {
        DeploySGLangModelInput self = new DeploySGLangModelInput();
        return TeaModel.build(map, self);
    }

    public DeploySGLangModelInput setAccountID(String accountID) {
        this.accountID = accountID;
        return this;
    }
    public String getAccountID() {
        return this.accountID;
    }

    public DeploySGLangModelInput setConcurrencyConfig(DeploySGLangModelInputConcurrencyConfig concurrencyConfig) {
        this.concurrencyConfig = concurrencyConfig;
        return this;
    }
    public DeploySGLangModelInputConcurrencyConfig getConcurrencyConfig() {
        return this.concurrencyConfig;
    }

    public DeploySGLangModelInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public DeploySGLangModelInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeploySGLangModelInput setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public DeploySGLangModelInput setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public DeploySGLangModelInput setEnvironmentVariables(java.util.Map<String, ?> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, ?> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public DeploySGLangModelInput setGpuConfig(DeploySGLangModelInputGpuConfig gpuConfig) {
        this.gpuConfig = gpuConfig;
        return this;
    }
    public DeploySGLangModelInputGpuConfig getGpuConfig() {
        return this.gpuConfig;
    }

    public DeploySGLangModelInput setHttpTrigger(DeploySGLangModelInputHttpTrigger httpTrigger) {
        this.httpTrigger = httpTrigger;
        return this;
    }
    public DeploySGLangModelInputHttpTrigger getHttpTrigger() {
        return this.httpTrigger;
    }

    public DeploySGLangModelInput setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public DeploySGLangModelInput setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
        return this;
    }
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    public DeploySGLangModelInput setLogConfig(DeploySGLangModelInputLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public DeploySGLangModelInputLogConfig getLogConfig() {
        return this.logConfig;
    }

    public DeploySGLangModelInput setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public DeploySGLangModelInput setModelConfig(DeploySGLangModelInputModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public DeploySGLangModelInputModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public DeploySGLangModelInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeploySGLangModelInput setNasConfig(DeploySGLangModelInputNasConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public DeploySGLangModelInputNasConfig getNasConfig() {
        return this.nasConfig;
    }

    public DeploySGLangModelInput setOriginalName(String originalName) {
        this.originalName = originalName;
        return this;
    }
    public String getOriginalName() {
        return this.originalName;
    }

    public DeploySGLangModelInput setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DeploySGLangModelInput setProvisionConfig(DeploySGLangModelInputProvisionConfig provisionConfig) {
        this.provisionConfig = provisionConfig;
        return this;
    }
    public DeploySGLangModelInputProvisionConfig getProvisionConfig() {
        return this.provisionConfig;
    }

    public DeploySGLangModelInput setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeploySGLangModelInput setReportStatusURL(String reportStatusURL) {
        this.reportStatusURL = reportStatusURL;
        return this;
    }
    public String getReportStatusURL() {
        return this.reportStatusURL;
    }

    public DeploySGLangModelInput setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DeploySGLangModelInput setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DeploySGLangModelInput setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DeploySGLangModelInput setVpcConfig(DeploySGLangModelInputVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public DeploySGLangModelInputVpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static class DeploySGLangModelInputConcurrencyConfig extends TeaModel {
        @NameInMap("reservedConcurrency")
        public Integer reservedConcurrency;

        public static DeploySGLangModelInputConcurrencyConfig build(java.util.Map<String, ?> map) throws Exception {
            DeploySGLangModelInputConcurrencyConfig self = new DeploySGLangModelInputConcurrencyConfig();
            return TeaModel.build(map, self);
        }

        public DeploySGLangModelInputConcurrencyConfig setReservedConcurrency(Integer reservedConcurrency) {
            this.reservedConcurrency = reservedConcurrency;
            return this;
        }
        public Integer getReservedConcurrency() {
            return this.reservedConcurrency;
        }

    }

    public static class DeploySGLangModelInputGpuConfig extends TeaModel {
        @NameInMap("gpuMemorySize")
        public Integer gpuMemorySize;

        @NameInMap("gpuType")
        public String gpuType;

        public static DeploySGLangModelInputGpuConfig build(java.util.Map<String, ?> map) throws Exception {
            DeploySGLangModelInputGpuConfig self = new DeploySGLangModelInputGpuConfig();
            return TeaModel.build(map, self);
        }

        public DeploySGLangModelInputGpuConfig setGpuMemorySize(Integer gpuMemorySize) {
            this.gpuMemorySize = gpuMemorySize;
            return this;
        }
        public Integer getGpuMemorySize() {
            return this.gpuMemorySize;
        }

        public DeploySGLangModelInputGpuConfig setGpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }
        public String getGpuType() {
            return this.gpuType;
        }

    }

    public static class DeploySGLangModelInputHttpTriggerTriggerConfig extends TeaModel {
        @NameInMap("authType")
        public String authType;

        @NameInMap("disableURLInternet")
        public Boolean disableURLInternet;

        @NameInMap("dsableURLInternet")
        public Boolean dsableURLInternet;

        @NameInMap("methods")
        public java.util.List<String> methods;

        public static DeploySGLangModelInputHttpTriggerTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            DeploySGLangModelInputHttpTriggerTriggerConfig self = new DeploySGLangModelInputHttpTriggerTriggerConfig();
            return TeaModel.build(map, self);
        }

        public DeploySGLangModelInputHttpTriggerTriggerConfig setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public DeploySGLangModelInputHttpTriggerTriggerConfig setDisableURLInternet(Boolean disableURLInternet) {
            this.disableURLInternet = disableURLInternet;
            return this;
        }
        public Boolean getDisableURLInternet() {
            return this.disableURLInternet;
        }

        public DeploySGLangModelInputHttpTriggerTriggerConfig setDsableURLInternet(Boolean dsableURLInternet) {
            this.dsableURLInternet = dsableURLInternet;
            return this;
        }
        public Boolean getDsableURLInternet() {
            return this.dsableURLInternet;
        }

        public DeploySGLangModelInputHttpTriggerTriggerConfig setMethods(java.util.List<String> methods) {
            this.methods = methods;
            return this;
        }
        public java.util.List<String> getMethods() {
            return this.methods;
        }

    }

    public static class DeploySGLangModelInputHttpTrigger extends TeaModel {
        @NameInMap("qualifier")
        public String qualifier;

        @NameInMap("triggerConfig")
        public DeploySGLangModelInputHttpTriggerTriggerConfig triggerConfig;

        public static DeploySGLangModelInputHttpTrigger build(java.util.Map<String, ?> map) throws Exception {
            DeploySGLangModelInputHttpTrigger self = new DeploySGLangModelInputHttpTrigger();
            return TeaModel.build(map, self);
        }

        public DeploySGLangModelInputHttpTrigger setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public DeploySGLangModelInputHttpTrigger setTriggerConfig(DeploySGLangModelInputHttpTriggerTriggerConfig triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public DeploySGLangModelInputHttpTriggerTriggerConfig getTriggerConfig() {
            return this.triggerConfig;
        }

    }

    public static class DeploySGLangModelInputLogConfig extends TeaModel {
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

        public static DeploySGLangModelInputLogConfig build(java.util.Map<String, ?> map) throws Exception {
            DeploySGLangModelInputLogConfig self = new DeploySGLangModelInputLogConfig();
            return TeaModel.build(map, self);
        }

        public DeploySGLangModelInputLogConfig setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        public DeploySGLangModelInputLogConfig setEnableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        public DeploySGLangModelInputLogConfig setLogBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }
        public String getLogBeginRule() {
            return this.logBeginRule;
        }

        public DeploySGLangModelInputLogConfig setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public DeploySGLangModelInputLogConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class DeploySGLangModelInputModelConfigFmkSGLangConfig extends TeaModel {
        @NameInMap("apiKey")
        public String apiKey;

        @NameInMap("chatTemplate")
        public String chatTemplate;

        @NameInMap("dtype")
        public String dtype;

        @NameInMap("fullTextPostfix")
        public String fullTextPostfix;

        @NameInMap("loadFormat")
        public String loadFormat;

        @NameInMap("maxRunningRequests")
        public Integer maxRunningRequests;

        @NameInMap("maxTotalTokens")
        public Integer maxTotalTokens;

        @NameInMap("memFractionStatic")
        public Float memFractionStatic;

        @NameInMap("quantization")
        public String quantization;

        @NameInMap("servedModelName")
        public String servedModelName;

        public static DeploySGLangModelInputModelConfigFmkSGLangConfig build(java.util.Map<String, ?> map) throws Exception {
            DeploySGLangModelInputModelConfigFmkSGLangConfig self = new DeploySGLangModelInputModelConfigFmkSGLangConfig();
            return TeaModel.build(map, self);
        }

        public DeploySGLangModelInputModelConfigFmkSGLangConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public DeploySGLangModelInputModelConfigFmkSGLangConfig setChatTemplate(String chatTemplate) {
            this.chatTemplate = chatTemplate;
            return this;
        }
        public String getChatTemplate() {
            return this.chatTemplate;
        }

        public DeploySGLangModelInputModelConfigFmkSGLangConfig setDtype(String dtype) {
            this.dtype = dtype;
            return this;
        }
        public String getDtype() {
            return this.dtype;
        }

        public DeploySGLangModelInputModelConfigFmkSGLangConfig setFullTextPostfix(String fullTextPostfix) {
            this.fullTextPostfix = fullTextPostfix;
            return this;
        }
        public String getFullTextPostfix() {
            return this.fullTextPostfix;
        }

        public DeploySGLangModelInputModelConfigFmkSGLangConfig setLoadFormat(String loadFormat) {
            this.loadFormat = loadFormat;
            return this;
        }
        public String getLoadFormat() {
            return this.loadFormat;
        }

        public DeploySGLangModelInputModelConfigFmkSGLangConfig setMaxRunningRequests(Integer maxRunningRequests) {
            this.maxRunningRequests = maxRunningRequests;
            return this;
        }
        public Integer getMaxRunningRequests() {
            return this.maxRunningRequests;
        }

        public DeploySGLangModelInputModelConfigFmkSGLangConfig setMaxTotalTokens(Integer maxTotalTokens) {
            this.maxTotalTokens = maxTotalTokens;
            return this;
        }
        public Integer getMaxTotalTokens() {
            return this.maxTotalTokens;
        }

        public DeploySGLangModelInputModelConfigFmkSGLangConfig setMemFractionStatic(Float memFractionStatic) {
            this.memFractionStatic = memFractionStatic;
            return this;
        }
        public Float getMemFractionStatic() {
            return this.memFractionStatic;
        }

        public DeploySGLangModelInputModelConfigFmkSGLangConfig setQuantization(String quantization) {
            this.quantization = quantization;
            return this;
        }
        public String getQuantization() {
            return this.quantization;
        }

        public DeploySGLangModelInputModelConfigFmkSGLangConfig setServedModelName(String servedModelName) {
            this.servedModelName = servedModelName;
            return this;
        }
        public String getServedModelName() {
            return this.servedModelName;
        }

    }

    public static class DeploySGLangModelInputModelConfig extends TeaModel {
        @NameInMap("fmkSGLangConfig")
        public DeploySGLangModelInputModelConfigFmkSGLangConfig fmkSGLangConfig;

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

        public static DeploySGLangModelInputModelConfig build(java.util.Map<String, ?> map) throws Exception {
            DeploySGLangModelInputModelConfig self = new DeploySGLangModelInputModelConfig();
            return TeaModel.build(map, self);
        }

        public DeploySGLangModelInputModelConfig setFmkSGLangConfig(DeploySGLangModelInputModelConfigFmkSGLangConfig fmkSGLangConfig) {
            this.fmkSGLangConfig = fmkSGLangConfig;
            return this;
        }
        public DeploySGLangModelInputModelConfigFmkSGLangConfig getFmkSGLangConfig() {
            return this.fmkSGLangConfig;
        }

        public DeploySGLangModelInputModelConfig setFramework(String framework) {
            this.framework = framework;
            return this;
        }
        public String getFramework() {
            return this.framework;
        }

        public DeploySGLangModelInputModelConfig setMultiModelConfig(java.util.List<ModelConfig> multiModelConfig) {
            this.multiModelConfig = multiModelConfig;
            return this;
        }
        public java.util.List<ModelConfig> getMultiModelConfig() {
            return this.multiModelConfig;
        }

        public DeploySGLangModelInputModelConfig setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DeploySGLangModelInputModelConfig setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DeploySGLangModelInputModelConfig setSrcModelScopeModelID(String srcModelScopeModelID) {
            this.srcModelScopeModelID = srcModelScopeModelID;
            return this;
        }
        public String getSrcModelScopeModelID() {
            return this.srcModelScopeModelID;
        }

        public DeploySGLangModelInputModelConfig setSrcModelScopeModelRevision(String srcModelScopeModelRevision) {
            this.srcModelScopeModelRevision = srcModelScopeModelRevision;
            return this;
        }
        public String getSrcModelScopeModelRevision() {
            return this.srcModelScopeModelRevision;
        }

        public DeploySGLangModelInputModelConfig setSrcModelScopeToken(String srcModelScopeToken) {
            this.srcModelScopeToken = srcModelScopeToken;
            return this;
        }
        public String getSrcModelScopeToken() {
            return this.srcModelScopeToken;
        }

        public DeploySGLangModelInputModelConfig setSrcOssBucket(String srcOssBucket) {
            this.srcOssBucket = srcOssBucket;
            return this;
        }
        public String getSrcOssBucket() {
            return this.srcOssBucket;
        }

        public DeploySGLangModelInputModelConfig setSrcOssPath(String srcOssPath) {
            this.srcOssPath = srcOssPath;
            return this;
        }
        public String getSrcOssPath() {
            return this.srcOssPath;
        }

        public DeploySGLangModelInputModelConfig setSrcOssRegion(String srcOssRegion) {
            this.srcOssRegion = srcOssRegion;
            return this;
        }
        public String getSrcOssRegion() {
            return this.srcOssRegion;
        }

        public DeploySGLangModelInputModelConfig setSyncStrategy(String syncStrategy) {
            this.syncStrategy = syncStrategy;
            return this;
        }
        public String getSyncStrategy() {
            return this.syncStrategy;
        }

    }

    public static class DeploySGLangModelInputNasConfigMountPoints extends TeaModel {
        @NameInMap("enableTLS")
        public Boolean enableTLS;

        @NameInMap("mountDir")
        public String mountDir;

        @NameInMap("serverAddr")
        public String serverAddr;

        public static DeploySGLangModelInputNasConfigMountPoints build(java.util.Map<String, ?> map) throws Exception {
            DeploySGLangModelInputNasConfigMountPoints self = new DeploySGLangModelInputNasConfigMountPoints();
            return TeaModel.build(map, self);
        }

        public DeploySGLangModelInputNasConfigMountPoints setEnableTLS(Boolean enableTLS) {
            this.enableTLS = enableTLS;
            return this;
        }
        public Boolean getEnableTLS() {
            return this.enableTLS;
        }

        public DeploySGLangModelInputNasConfigMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public DeploySGLangModelInputNasConfigMountPoints setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

    }

    public static class DeploySGLangModelInputNasConfig extends TeaModel {
        @NameInMap("groupId")
        public Integer groupId;

        @NameInMap("mountPoints")
        public java.util.List<DeploySGLangModelInputNasConfigMountPoints> mountPoints;

        @NameInMap("userId")
        public Integer userId;

        public static DeploySGLangModelInputNasConfig build(java.util.Map<String, ?> map) throws Exception {
            DeploySGLangModelInputNasConfig self = new DeploySGLangModelInputNasConfig();
            return TeaModel.build(map, self);
        }

        public DeploySGLangModelInputNasConfig setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public DeploySGLangModelInputNasConfig setMountPoints(java.util.List<DeploySGLangModelInputNasConfigMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<DeploySGLangModelInputNasConfigMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public DeploySGLangModelInputNasConfig setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class DeploySGLangModelInputProvisionConfigScheduledActions extends TeaModel {
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

        public static DeploySGLangModelInputProvisionConfigScheduledActions build(java.util.Map<String, ?> map) throws Exception {
            DeploySGLangModelInputProvisionConfigScheduledActions self = new DeploySGLangModelInputProvisionConfigScheduledActions();
            return TeaModel.build(map, self);
        }

        public DeploySGLangModelInputProvisionConfigScheduledActions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DeploySGLangModelInputProvisionConfigScheduledActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeploySGLangModelInputProvisionConfigScheduledActions setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }
        public String getScheduleExpression() {
            return this.scheduleExpression;
        }

        public DeploySGLangModelInputProvisionConfigScheduledActions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DeploySGLangModelInputProvisionConfigScheduledActions setTarget(Integer target) {
            this.target = target;
            return this;
        }
        public Integer getTarget() {
            return this.target;
        }

        public DeploySGLangModelInputProvisionConfigScheduledActions setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class DeploySGLangModelInputProvisionConfig extends TeaModel {
        @NameInMap("alwaysAllocateGPU")
        public Boolean alwaysAllocateGPU;

        @NameInMap("scheduledActions")
        public java.util.List<DeploySGLangModelInputProvisionConfigScheduledActions> scheduledActions;

        @NameInMap("target")
        public Integer target;

        public static DeploySGLangModelInputProvisionConfig build(java.util.Map<String, ?> map) throws Exception {
            DeploySGLangModelInputProvisionConfig self = new DeploySGLangModelInputProvisionConfig();
            return TeaModel.build(map, self);
        }

        public DeploySGLangModelInputProvisionConfig setAlwaysAllocateGPU(Boolean alwaysAllocateGPU) {
            this.alwaysAllocateGPU = alwaysAllocateGPU;
            return this;
        }
        public Boolean getAlwaysAllocateGPU() {
            return this.alwaysAllocateGPU;
        }

        public DeploySGLangModelInputProvisionConfig setScheduledActions(java.util.List<DeploySGLangModelInputProvisionConfigScheduledActions> scheduledActions) {
            this.scheduledActions = scheduledActions;
            return this;
        }
        public java.util.List<DeploySGLangModelInputProvisionConfigScheduledActions> getScheduledActions() {
            return this.scheduledActions;
        }

        public DeploySGLangModelInputProvisionConfig setTarget(Integer target) {
            this.target = target;
            return this;
        }
        public Integer getTarget() {
            return this.target;
        }

    }

    public static class DeploySGLangModelInputVpcConfig extends TeaModel {
        @NameInMap("securityGroupId")
        public String securityGroupId;

        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("vpcId")
        public String vpcId;

        public static DeploySGLangModelInputVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            DeploySGLangModelInputVpcConfig self = new DeploySGLangModelInputVpcConfig();
            return TeaModel.build(map, self);
        }

        public DeploySGLangModelInputVpcConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DeploySGLangModelInputVpcConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DeploySGLangModelInputVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
