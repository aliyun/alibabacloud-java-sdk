// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeployOllamaModelInput extends TeaModel {
    @NameInMap("accountID")
    public String accountID;

    @NameInMap("concurrencyConfig")
    public DeployOllamaModelInputConcurrencyConfig concurrencyConfig;

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
    public DeployOllamaModelInputGpuConfig gpuConfig;

    @NameInMap("httpTrigger")
    public DeployOllamaModelInputHttpTrigger httpTrigger;

    @NameInMap("imageName")
    public String imageName;

    @NameInMap("instanceConcurrency")
    public Integer instanceConcurrency;

    @NameInMap("logConfig")
    public DeployOllamaModelInputLogConfig logConfig;

    @NameInMap("memorySize")
    public Integer memorySize;

    @NameInMap("modelConfig")
    public DeployOllamaModelInputModelConfig modelConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("nasConfig")
    public DeployOllamaModelInputNasConfig nasConfig;

    @NameInMap("originalName")
    public String originalName;

    @NameInMap("projectName")
    public String projectName;

    @NameInMap("provisionConfig")
    public DeployOllamaModelInputProvisionConfig provisionConfig;

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
    public DeployOllamaModelInputVpcConfig vpcConfig;

    public static DeployOllamaModelInput build(java.util.Map<String, ?> map) throws Exception {
        DeployOllamaModelInput self = new DeployOllamaModelInput();
        return TeaModel.build(map, self);
    }

    public DeployOllamaModelInput setAccountID(String accountID) {
        this.accountID = accountID;
        return this;
    }
    public String getAccountID() {
        return this.accountID;
    }

    public DeployOllamaModelInput setConcurrencyConfig(DeployOllamaModelInputConcurrencyConfig concurrencyConfig) {
        this.concurrencyConfig = concurrencyConfig;
        return this;
    }
    public DeployOllamaModelInputConcurrencyConfig getConcurrencyConfig() {
        return this.concurrencyConfig;
    }

    public DeployOllamaModelInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public DeployOllamaModelInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeployOllamaModelInput setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public DeployOllamaModelInput setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public DeployOllamaModelInput setEnvironmentVariables(java.util.Map<String, ?> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, ?> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public DeployOllamaModelInput setGpuConfig(DeployOllamaModelInputGpuConfig gpuConfig) {
        this.gpuConfig = gpuConfig;
        return this;
    }
    public DeployOllamaModelInputGpuConfig getGpuConfig() {
        return this.gpuConfig;
    }

    public DeployOllamaModelInput setHttpTrigger(DeployOllamaModelInputHttpTrigger httpTrigger) {
        this.httpTrigger = httpTrigger;
        return this;
    }
    public DeployOllamaModelInputHttpTrigger getHttpTrigger() {
        return this.httpTrigger;
    }

    public DeployOllamaModelInput setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public DeployOllamaModelInput setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
        return this;
    }
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    public DeployOllamaModelInput setLogConfig(DeployOllamaModelInputLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public DeployOllamaModelInputLogConfig getLogConfig() {
        return this.logConfig;
    }

    public DeployOllamaModelInput setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public DeployOllamaModelInput setModelConfig(DeployOllamaModelInputModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public DeployOllamaModelInputModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public DeployOllamaModelInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeployOllamaModelInput setNasConfig(DeployOllamaModelInputNasConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public DeployOllamaModelInputNasConfig getNasConfig() {
        return this.nasConfig;
    }

    public DeployOllamaModelInput setOriginalName(String originalName) {
        this.originalName = originalName;
        return this;
    }
    public String getOriginalName() {
        return this.originalName;
    }

    public DeployOllamaModelInput setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DeployOllamaModelInput setProvisionConfig(DeployOllamaModelInputProvisionConfig provisionConfig) {
        this.provisionConfig = provisionConfig;
        return this;
    }
    public DeployOllamaModelInputProvisionConfig getProvisionConfig() {
        return this.provisionConfig;
    }

    public DeployOllamaModelInput setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeployOllamaModelInput setReportStatusURL(String reportStatusURL) {
        this.reportStatusURL = reportStatusURL;
        return this;
    }
    public String getReportStatusURL() {
        return this.reportStatusURL;
    }

    public DeployOllamaModelInput setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DeployOllamaModelInput setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DeployOllamaModelInput setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DeployOllamaModelInput setVpcConfig(DeployOllamaModelInputVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public DeployOllamaModelInputVpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static class DeployOllamaModelInputConcurrencyConfig extends TeaModel {
        @NameInMap("reservedConcurrency")
        public Integer reservedConcurrency;

        public static DeployOllamaModelInputConcurrencyConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployOllamaModelInputConcurrencyConfig self = new DeployOllamaModelInputConcurrencyConfig();
            return TeaModel.build(map, self);
        }

        public DeployOllamaModelInputConcurrencyConfig setReservedConcurrency(Integer reservedConcurrency) {
            this.reservedConcurrency = reservedConcurrency;
            return this;
        }
        public Integer getReservedConcurrency() {
            return this.reservedConcurrency;
        }

    }

    public static class DeployOllamaModelInputGpuConfig extends TeaModel {
        @NameInMap("gpuMemorySize")
        public Integer gpuMemorySize;

        @NameInMap("gpuType")
        public String gpuType;

        public static DeployOllamaModelInputGpuConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployOllamaModelInputGpuConfig self = new DeployOllamaModelInputGpuConfig();
            return TeaModel.build(map, self);
        }

        public DeployOllamaModelInputGpuConfig setGpuMemorySize(Integer gpuMemorySize) {
            this.gpuMemorySize = gpuMemorySize;
            return this;
        }
        public Integer getGpuMemorySize() {
            return this.gpuMemorySize;
        }

        public DeployOllamaModelInputGpuConfig setGpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }
        public String getGpuType() {
            return this.gpuType;
        }

    }

    public static class DeployOllamaModelInputHttpTriggerTriggerConfig extends TeaModel {
        @NameInMap("authType")
        public String authType;

        @NameInMap("dsableURLInternet")
        public Boolean dsableURLInternet;

        @NameInMap("methods")
        public java.util.List<String> methods;

        public static DeployOllamaModelInputHttpTriggerTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployOllamaModelInputHttpTriggerTriggerConfig self = new DeployOllamaModelInputHttpTriggerTriggerConfig();
            return TeaModel.build(map, self);
        }

        public DeployOllamaModelInputHttpTriggerTriggerConfig setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public DeployOllamaModelInputHttpTriggerTriggerConfig setDsableURLInternet(Boolean dsableURLInternet) {
            this.dsableURLInternet = dsableURLInternet;
            return this;
        }
        public Boolean getDsableURLInternet() {
            return this.dsableURLInternet;
        }

        public DeployOllamaModelInputHttpTriggerTriggerConfig setMethods(java.util.List<String> methods) {
            this.methods = methods;
            return this;
        }
        public java.util.List<String> getMethods() {
            return this.methods;
        }

    }

    public static class DeployOllamaModelInputHttpTrigger extends TeaModel {
        @NameInMap("qualifier")
        public String qualifier;

        @NameInMap("triggerConfig")
        public DeployOllamaModelInputHttpTriggerTriggerConfig triggerConfig;

        public static DeployOllamaModelInputHttpTrigger build(java.util.Map<String, ?> map) throws Exception {
            DeployOllamaModelInputHttpTrigger self = new DeployOllamaModelInputHttpTrigger();
            return TeaModel.build(map, self);
        }

        public DeployOllamaModelInputHttpTrigger setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public DeployOllamaModelInputHttpTrigger setTriggerConfig(DeployOllamaModelInputHttpTriggerTriggerConfig triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public DeployOllamaModelInputHttpTriggerTriggerConfig getTriggerConfig() {
            return this.triggerConfig;
        }

    }

    public static class DeployOllamaModelInputLogConfig extends TeaModel {
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

        public static DeployOllamaModelInputLogConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployOllamaModelInputLogConfig self = new DeployOllamaModelInputLogConfig();
            return TeaModel.build(map, self);
        }

        public DeployOllamaModelInputLogConfig setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        public DeployOllamaModelInputLogConfig setEnableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        public DeployOllamaModelInputLogConfig setLogBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }
        public String getLogBeginRule() {
            return this.logBeginRule;
        }

        public DeployOllamaModelInputLogConfig setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public DeployOllamaModelInputLogConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class DeployOllamaModelInputModelConfigFmkOllamaConfig extends TeaModel {
        @NameInMap("minP")
        public Float minP;

        @NameInMap("mirostat")
        public Integer mirostat;

        @NameInMap("mirostatEta")
        public Float mirostatEta;

        @NameInMap("mirostatTau")
        public Float mirostatTau;

        @NameInMap("modelName")
        public String modelName;

        @NameInMap("modelfileAdapter")
        public String modelfileAdapter;

        @NameInMap("modelfileAdditionalFromsString")
        public String modelfileAdditionalFromsString;

        @NameInMap("modelfileFullTextPostfix")
        public String modelfileFullTextPostfix;

        @NameInMap("modelfileParams")
        public String modelfileParams;

        @NameInMap("modelfileSystem")
        public String modelfileSystem;

        @NameInMap("modelfileTemplate")
        public String modelfileTemplate;

        @NameInMap("numCtx")
        public Integer numCtx;

        @NameInMap("numPredict")
        public Integer numPredict;

        @NameInMap("quantize")
        public String quantize;

        @NameInMap("repeatLastN")
        public Integer repeatLastN;

        @NameInMap("repeatPenalty")
        public Float repeatPenalty;

        @NameInMap("seed")
        public Integer seed;

        @NameInMap("singleModelFile")
        public String singleModelFile;

        @NameInMap("splitedModelStartFile")
        public String splitedModelStartFile;

        @NameInMap("stop")
        public String stop;

        @NameInMap("stream")
        public Boolean stream;

        @NameInMap("temperature")
        public Float temperature;

        @NameInMap("tfsZ")
        public Float tfsZ;

        @NameInMap("topK")
        public Integer topK;

        @NameInMap("topP")
        public Float topP;

        public static DeployOllamaModelInputModelConfigFmkOllamaConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployOllamaModelInputModelConfigFmkOllamaConfig self = new DeployOllamaModelInputModelConfigFmkOllamaConfig();
            return TeaModel.build(map, self);
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setMinP(Float minP) {
            this.minP = minP;
            return this;
        }
        public Float getMinP() {
            return this.minP;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setMirostat(Integer mirostat) {
            this.mirostat = mirostat;
            return this;
        }
        public Integer getMirostat() {
            return this.mirostat;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setMirostatEta(Float mirostatEta) {
            this.mirostatEta = mirostatEta;
            return this;
        }
        public Float getMirostatEta() {
            return this.mirostatEta;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setMirostatTau(Float mirostatTau) {
            this.mirostatTau = mirostatTau;
            return this;
        }
        public Float getMirostatTau() {
            return this.mirostatTau;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setModelfileAdapter(String modelfileAdapter) {
            this.modelfileAdapter = modelfileAdapter;
            return this;
        }
        public String getModelfileAdapter() {
            return this.modelfileAdapter;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setModelfileAdditionalFromsString(String modelfileAdditionalFromsString) {
            this.modelfileAdditionalFromsString = modelfileAdditionalFromsString;
            return this;
        }
        public String getModelfileAdditionalFromsString() {
            return this.modelfileAdditionalFromsString;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setModelfileFullTextPostfix(String modelfileFullTextPostfix) {
            this.modelfileFullTextPostfix = modelfileFullTextPostfix;
            return this;
        }
        public String getModelfileFullTextPostfix() {
            return this.modelfileFullTextPostfix;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setModelfileParams(String modelfileParams) {
            this.modelfileParams = modelfileParams;
            return this;
        }
        public String getModelfileParams() {
            return this.modelfileParams;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setModelfileSystem(String modelfileSystem) {
            this.modelfileSystem = modelfileSystem;
            return this;
        }
        public String getModelfileSystem() {
            return this.modelfileSystem;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setModelfileTemplate(String modelfileTemplate) {
            this.modelfileTemplate = modelfileTemplate;
            return this;
        }
        public String getModelfileTemplate() {
            return this.modelfileTemplate;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setNumCtx(Integer numCtx) {
            this.numCtx = numCtx;
            return this;
        }
        public Integer getNumCtx() {
            return this.numCtx;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setNumPredict(Integer numPredict) {
            this.numPredict = numPredict;
            return this;
        }
        public Integer getNumPredict() {
            return this.numPredict;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setQuantize(String quantize) {
            this.quantize = quantize;
            return this;
        }
        public String getQuantize() {
            return this.quantize;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setRepeatLastN(Integer repeatLastN) {
            this.repeatLastN = repeatLastN;
            return this;
        }
        public Integer getRepeatLastN() {
            return this.repeatLastN;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setRepeatPenalty(Float repeatPenalty) {
            this.repeatPenalty = repeatPenalty;
            return this;
        }
        public Float getRepeatPenalty() {
            return this.repeatPenalty;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setSeed(Integer seed) {
            this.seed = seed;
            return this;
        }
        public Integer getSeed() {
            return this.seed;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setSingleModelFile(String singleModelFile) {
            this.singleModelFile = singleModelFile;
            return this;
        }
        public String getSingleModelFile() {
            return this.singleModelFile;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setSplitedModelStartFile(String splitedModelStartFile) {
            this.splitedModelStartFile = splitedModelStartFile;
            return this;
        }
        public String getSplitedModelStartFile() {
            return this.splitedModelStartFile;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setStop(String stop) {
            this.stop = stop;
            return this;
        }
        public String getStop() {
            return this.stop;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setStream(Boolean stream) {
            this.stream = stream;
            return this;
        }
        public Boolean getStream() {
            return this.stream;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setTemperature(Float temperature) {
            this.temperature = temperature;
            return this;
        }
        public Float getTemperature() {
            return this.temperature;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setTfsZ(Float tfsZ) {
            this.tfsZ = tfsZ;
            return this;
        }
        public Float getTfsZ() {
            return this.tfsZ;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

        public DeployOllamaModelInputModelConfigFmkOllamaConfig setTopP(Float topP) {
            this.topP = topP;
            return this;
        }
        public Float getTopP() {
            return this.topP;
        }

    }

    public static class DeployOllamaModelInputModelConfig extends TeaModel {
        @NameInMap("fmkOllamaConfig")
        public DeployOllamaModelInputModelConfigFmkOllamaConfig fmkOllamaConfig;

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

        public static DeployOllamaModelInputModelConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployOllamaModelInputModelConfig self = new DeployOllamaModelInputModelConfig();
            return TeaModel.build(map, self);
        }

        public DeployOllamaModelInputModelConfig setFmkOllamaConfig(DeployOllamaModelInputModelConfigFmkOllamaConfig fmkOllamaConfig) {
            this.fmkOllamaConfig = fmkOllamaConfig;
            return this;
        }
        public DeployOllamaModelInputModelConfigFmkOllamaConfig getFmkOllamaConfig() {
            return this.fmkOllamaConfig;
        }

        public DeployOllamaModelInputModelConfig setFramework(String framework) {
            this.framework = framework;
            return this;
        }
        public String getFramework() {
            return this.framework;
        }

        public DeployOllamaModelInputModelConfig setMultiModelConfig(java.util.List<ModelConfig> multiModelConfig) {
            this.multiModelConfig = multiModelConfig;
            return this;
        }
        public java.util.List<ModelConfig> getMultiModelConfig() {
            return this.multiModelConfig;
        }

        public DeployOllamaModelInputModelConfig setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DeployOllamaModelInputModelConfig setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DeployOllamaModelInputModelConfig setSrcModelScopeModelID(String srcModelScopeModelID) {
            this.srcModelScopeModelID = srcModelScopeModelID;
            return this;
        }
        public String getSrcModelScopeModelID() {
            return this.srcModelScopeModelID;
        }

        public DeployOllamaModelInputModelConfig setSrcModelScopeModelRevision(String srcModelScopeModelRevision) {
            this.srcModelScopeModelRevision = srcModelScopeModelRevision;
            return this;
        }
        public String getSrcModelScopeModelRevision() {
            return this.srcModelScopeModelRevision;
        }

        public DeployOllamaModelInputModelConfig setSrcModelScopeToken(String srcModelScopeToken) {
            this.srcModelScopeToken = srcModelScopeToken;
            return this;
        }
        public String getSrcModelScopeToken() {
            return this.srcModelScopeToken;
        }

        public DeployOllamaModelInputModelConfig setSrcOssBucket(String srcOssBucket) {
            this.srcOssBucket = srcOssBucket;
            return this;
        }
        public String getSrcOssBucket() {
            return this.srcOssBucket;
        }

        public DeployOllamaModelInputModelConfig setSrcOssPath(String srcOssPath) {
            this.srcOssPath = srcOssPath;
            return this;
        }
        public String getSrcOssPath() {
            return this.srcOssPath;
        }

        public DeployOllamaModelInputModelConfig setSrcOssRegion(String srcOssRegion) {
            this.srcOssRegion = srcOssRegion;
            return this;
        }
        public String getSrcOssRegion() {
            return this.srcOssRegion;
        }

    }

    public static class DeployOllamaModelInputNasConfig extends TeaModel {
        @NameInMap("groupId")
        public Integer groupId;

        @NameInMap("mountPoints")
        public java.util.List<String> mountPoints;

        @NameInMap("userId")
        public Integer userId;

        public static DeployOllamaModelInputNasConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployOllamaModelInputNasConfig self = new DeployOllamaModelInputNasConfig();
            return TeaModel.build(map, self);
        }

        public DeployOllamaModelInputNasConfig setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public DeployOllamaModelInputNasConfig setMountPoints(java.util.List<String> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<String> getMountPoints() {
            return this.mountPoints;
        }

        public DeployOllamaModelInputNasConfig setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class DeployOllamaModelInputProvisionConfigScheduledActions extends TeaModel {
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

        public static DeployOllamaModelInputProvisionConfigScheduledActions build(java.util.Map<String, ?> map) throws Exception {
            DeployOllamaModelInputProvisionConfigScheduledActions self = new DeployOllamaModelInputProvisionConfigScheduledActions();
            return TeaModel.build(map, self);
        }

        public DeployOllamaModelInputProvisionConfigScheduledActions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DeployOllamaModelInputProvisionConfigScheduledActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeployOllamaModelInputProvisionConfigScheduledActions setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }
        public String getScheduleExpression() {
            return this.scheduleExpression;
        }

        public DeployOllamaModelInputProvisionConfigScheduledActions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DeployOllamaModelInputProvisionConfigScheduledActions setTarget(Integer target) {
            this.target = target;
            return this;
        }
        public Integer getTarget() {
            return this.target;
        }

        public DeployOllamaModelInputProvisionConfigScheduledActions setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class DeployOllamaModelInputProvisionConfig extends TeaModel {
        @NameInMap("alwaysAllocateGPU")
        public Boolean alwaysAllocateGPU;

        @NameInMap("scheduledActions")
        public java.util.List<DeployOllamaModelInputProvisionConfigScheduledActions> scheduledActions;

        @NameInMap("target")
        public Integer target;

        public static DeployOllamaModelInputProvisionConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployOllamaModelInputProvisionConfig self = new DeployOllamaModelInputProvisionConfig();
            return TeaModel.build(map, self);
        }

        public DeployOllamaModelInputProvisionConfig setAlwaysAllocateGPU(Boolean alwaysAllocateGPU) {
            this.alwaysAllocateGPU = alwaysAllocateGPU;
            return this;
        }
        public Boolean getAlwaysAllocateGPU() {
            return this.alwaysAllocateGPU;
        }

        public DeployOllamaModelInputProvisionConfig setScheduledActions(java.util.List<DeployOllamaModelInputProvisionConfigScheduledActions> scheduledActions) {
            this.scheduledActions = scheduledActions;
            return this;
        }
        public java.util.List<DeployOllamaModelInputProvisionConfigScheduledActions> getScheduledActions() {
            return this.scheduledActions;
        }

        public DeployOllamaModelInputProvisionConfig setTarget(Integer target) {
            this.target = target;
            return this;
        }
        public Integer getTarget() {
            return this.target;
        }

    }

    public static class DeployOllamaModelInputVpcConfig extends TeaModel {
        @NameInMap("securityGroupId")
        public String securityGroupId;

        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("vpcId")
        public String vpcId;

        public static DeployOllamaModelInputVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployOllamaModelInputVpcConfig self = new DeployOllamaModelInputVpcConfig();
            return TeaModel.build(map, self);
        }

        public DeployOllamaModelInputVpcConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DeployOllamaModelInputVpcConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DeployOllamaModelInputVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
